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

//import com.bydan.erp.cartera.util.CobrarConciliacionesCarterasContabilidadConstantesFunciones;
import com.bydan.erp.cartera.util.report.CobrarConciliacionesCarterasContabilidadParameterReturnGeneral;
//import com.bydan.erp.cartera.util.report.CobrarConciliacionesCarterasContabilidadParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.report.CobrarConciliacionesCarterasContabilidadBean;
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
public class CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrame extends CobrarConciliacionesCarterasContabilidadJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<CobrarConciliacionesCarterasContabilidad> cobrarconciliacionescarterascontabilidadValidator = new ClassValidator<CobrarConciliacionesCarterasContabilidad>(CobrarConciliacionesCarterasContabilidad.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidad;	
	public CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidadAux;
	public CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidadAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidadTotales;
	public Long idCobrarConciliacionesCarterasContabilidadActual;
	public Long iIdNuevoCobrarConciliacionesCarterasContabilidad=0L;
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
	
	public Boolean isPermisoTodoCobrarConciliacionesCarterasContabilidad;
	public Boolean isPermisoNuevoCobrarConciliacionesCarterasContabilidad;
	public Boolean isPermisoActualizarCobrarConciliacionesCarterasContabilidad;
	public Boolean isPermisoActualizarOriginalCobrarConciliacionesCarterasContabilidad;
	public Boolean isPermisoEliminarCobrarConciliacionesCarterasContabilidad;
	public Boolean isPermisoGuardarCambiosCobrarConciliacionesCarterasContabilidad;
	public Boolean isPermisoConsultaCobrarConciliacionesCarterasContabilidad;
	public Boolean isPermisoBusquedaCobrarConciliacionesCarterasContabilidad;
	public Boolean isPermisoReporteCobrarConciliacionesCarterasContabilidad;
	public Boolean isPermisoPaginacionMedioCobrarConciliacionesCarterasContabilidad;
	public Boolean isPermisoPaginacionAltoCobrarConciliacionesCarterasContabilidad;
	public Boolean isPermisoPaginacionTodoCobrarConciliacionesCarterasContabilidad;
	public Boolean isPermisoCopiarCobrarConciliacionesCarterasContabilidad;
	public Boolean isPermisoVerFormCobrarConciliacionesCarterasContabilidad;
	public Boolean isPermisoDuplicarCobrarConciliacionesCarterasContabilidad;
	public Boolean isPermisoOrdenCobrarConciliacionesCarterasContabilidad;
	
	
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
	
	public CobrarConciliacionesCarterasContabilidadParameterReturnGeneral cobrarconciliacionescarterascontabilidadReturnGeneral;
	public CobrarConciliacionesCarterasContabilidadParameterReturnGeneral cobrarconciliacionescarterascontabilidadParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCobrarConciliacionesCarterasContabilidad=false;
	public Boolean esParaAccionDesdeFormularioCobrarConciliacionesCarterasContabilidad=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CobrarConciliacionesCarterasContabilidadSessionBeanAdditional cobrarconciliacionescarterascontabilidadSessionBeanAdditional=null;
	
	public CobrarConciliacionesCarterasContabilidadSessionBeanAdditional getCobrarConciliacionesCarterasContabilidadSessionBeanAdditional() {
		return this.cobrarconciliacionescarterascontabilidadSessionBeanAdditional;
	}
	
	public void setCobrarConciliacionesCarterasContabilidadSessionBeanAdditional(CobrarConciliacionesCarterasContabilidadSessionBeanAdditional cobrarconciliacionescarterascontabilidadSessionBeanAdditional) {
		try {
			this.cobrarconciliacionescarterascontabilidadSessionBeanAdditional=cobrarconciliacionescarterascontabilidadSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional cobrarconciliacionescarterascontabilidadBeanSwingJInternalFrameAdditional=null;
	//public class CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrame
	
	public CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional getCobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional() {
		return this.cobrarconciliacionescarterascontabilidadBeanSwingJInternalFrameAdditional;
	}
	
	public void setCobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional(CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional cobrarconciliacionescarterascontabilidadBeanSwingJInternalFrameAdditional) {
		try {
			this.cobrarconciliacionescarterascontabilidadBeanSwingJInternalFrameAdditional=cobrarconciliacionescarterascontabilidadBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CobrarConciliacionesCarterasContabilidadLogic cobrarconciliacionescarterascontabilidadLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidadBean;
	public CobrarConciliacionesCarterasContabilidadConstantesFunciones cobrarconciliacionescarterascontabilidadConstantesFunciones;
	//public CobrarConciliacionesCarterasContabilidadParameterReturnGeneral cobrarconciliacionescarterascontabilidadReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public CuentaContableLogic cuentacontableLogic;
	
	//PARAMETROS
	
	
	//public List<CobrarConciliacionesCarterasContabilidad> cobrarconciliacionescarterascontabilidads;	
	//public List<CobrarConciliacionesCarterasContabilidad> cobrarconciliacionescarterascontabilidadsEliminados;
	//public List<CobrarConciliacionesCarterasContabilidad> cobrarconciliacionescarterascontabilidadsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCobrarConciliacionesCarterasContabilidad=false;
	public Boolean isVisibilidadCeldaDuplicarCobrarConciliacionesCarterasContabilidad=true;
	public Boolean isVisibilidadCeldaCopiarCobrarConciliacionesCarterasContabilidad=true;
	public Boolean isVisibilidadCeldaVerFormCobrarConciliacionesCarterasContabilidad=true;
	public Boolean isVisibilidadCeldaOrdenCobrarConciliacionesCarterasContabilidad=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCobrarConciliacionesCarterasContabilidad=false;
	public Boolean isVisibilidadCeldaModificarCobrarConciliacionesCarterasContabilidad=false;
	public Boolean isVisibilidadCeldaActualizarCobrarConciliacionesCarterasContabilidad=false;
	public Boolean isVisibilidadCeldaEliminarCobrarConciliacionesCarterasContabilidad=false;
	public Boolean isVisibilidadCeldaCancelarCobrarConciliacionesCarterasContabilidad=false;
	public Boolean isVisibilidadCeldaGuardarCobrarConciliacionesCarterasContabilidad=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCobrarConciliacionesCarterasContabilidad=false;	
	
	
	public Boolean isVisibilidadBusquedaCobrarConciliacionesCarterasContabilidad=false;
	public Boolean isVisibilidadFK_IdCuentaContable=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoCobrarConciliacionesCarterasContabilidad() {
		return this.iIdNuevoCobrarConciliacionesCarterasContabilidad;
	}

	public void setiIdNuevoCobrarConciliacionesCarterasContabilidad(Long iIdNuevoCobrarConciliacionesCarterasContabilidad) {
		this.iIdNuevoCobrarConciliacionesCarterasContabilidad = iIdNuevoCobrarConciliacionesCarterasContabilidad;
	}
	
	public Long getidCobrarConciliacionesCarterasContabilidadActual() {
		return this.idCobrarConciliacionesCarterasContabilidadActual;
	}

	public void setidCobrarConciliacionesCarterasContabilidadActual(Long idCobrarConciliacionesCarterasContabilidadActual) {
		this.idCobrarConciliacionesCarterasContabilidadActual = idCobrarConciliacionesCarterasContabilidadActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public CobrarConciliacionesCarterasContabilidad getcobrarconciliacionescarterascontabilidad() {
		return this.cobrarconciliacionescarterascontabilidad;
	}

	public void setcobrarconciliacionescarterascontabilidad(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidad) {
		this.cobrarconciliacionescarterascontabilidad = cobrarconciliacionescarterascontabilidad;
	}
	
	public CobrarConciliacionesCarterasContabilidad getcobrarconciliacionescarterascontabilidadAux() {
		return this.cobrarconciliacionescarterascontabilidadAux;
	}

	public void setcobrarconciliacionescarterascontabilidadAux(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidadAux) {
		this.cobrarconciliacionescarterascontabilidadAux = cobrarconciliacionescarterascontabilidadAux;
	}				
	
	public CobrarConciliacionesCarterasContabilidad getcobrarconciliacionescarterascontabilidadAnterior() {
		return this.cobrarconciliacionescarterascontabilidadAnterior;
	}

	public void setcobrarconciliacionescarterascontabilidadAnterior(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidadAnterior) {
		this.cobrarconciliacionescarterascontabilidadAnterior = cobrarconciliacionescarterascontabilidadAnterior;
	}	
	
	public CobrarConciliacionesCarterasContabilidad getcobrarconciliacionescarterascontabilidadTotales() {
		return this.cobrarconciliacionescarterascontabilidadTotales;
	}

	public void setcobrarconciliacionescarterascontabilidadTotales(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidadTotales) {
		this.cobrarconciliacionescarterascontabilidadTotales = cobrarconciliacionescarterascontabilidadTotales;
	}	
	
	public CobrarConciliacionesCarterasContabilidad getcobrarconciliacionescarterascontabilidadBean() {
		return this.cobrarconciliacionescarterascontabilidadBean;
	}

	public void setcobrarconciliacionescarterascontabilidadBean(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidadBean) {
		this.cobrarconciliacionescarterascontabilidadBean = cobrarconciliacionescarterascontabilidadBean;
	}	
	
	public CobrarConciliacionesCarterasContabilidadParameterReturnGeneral getcobrarconciliacionescarterascontabilidadReturnGeneral() {
		return this.cobrarconciliacionescarterascontabilidadReturnGeneral;
	}

	public void setcobrarconciliacionescarterascontabilidadReturnGeneral(CobrarConciliacionesCarterasContabilidadParameterReturnGeneral cobrarconciliacionescarterascontabilidadReturnGeneral) {
		this.cobrarconciliacionescarterascontabilidadReturnGeneral = cobrarconciliacionescarterascontabilidadReturnGeneral;
	}	
	
	
	public Long id_cuenta_contableBusquedaCobrarConciliacionesCarterasContabilidad=-1L;

	public Long getid_cuenta_contableBusquedaCobrarConciliacionesCarterasContabilidad() {
		return this.id_cuenta_contableBusquedaCobrarConciliacionesCarterasContabilidad;
	}

	public void setid_cuenta_contableBusquedaCobrarConciliacionesCarterasContabilidad(Long id_cuenta_contableBusquedaCobrarConciliacionesCarterasContabilidad) {
		this.id_cuenta_contableBusquedaCobrarConciliacionesCarterasContabilidad = id_cuenta_contableBusquedaCobrarConciliacionesCarterasContabilidad;
	}

;
	public Date fecha_desdeBusquedaCobrarConciliacionesCarterasContabilidad=new Date();

	public Date getfecha_desdeBusquedaCobrarConciliacionesCarterasContabilidad() {
		return this.fecha_desdeBusquedaCobrarConciliacionesCarterasContabilidad;
	}

	public void setfecha_desdeBusquedaCobrarConciliacionesCarterasContabilidad(Date fecha_desdeBusquedaCobrarConciliacionesCarterasContabilidad) {
		this.fecha_desdeBusquedaCobrarConciliacionesCarterasContabilidad = fecha_desdeBusquedaCobrarConciliacionesCarterasContabilidad;
	}

;
	public Date fecha_hastaBusquedaCobrarConciliacionesCarterasContabilidad=new Date();

	public Date getfecha_hastaBusquedaCobrarConciliacionesCarterasContabilidad() {
		return this.fecha_hastaBusquedaCobrarConciliacionesCarterasContabilidad;
	}

	public void setfecha_hastaBusquedaCobrarConciliacionesCarterasContabilidad(Date fecha_hastaBusquedaCobrarConciliacionesCarterasContabilidad) {
		this.fecha_hastaBusquedaCobrarConciliacionesCarterasContabilidad = fecha_hastaBusquedaCobrarConciliacionesCarterasContabilidad;
	}

	public Long id_cuenta_contableFK_IdCuentaContable=-1L;

	public Long getid_cuenta_contableFK_IdCuentaContable() {
		return this.id_cuenta_contableFK_IdCuentaContable;
	}

	public void setid_cuenta_contableFK_IdCuentaContable(Long id_cuenta_contableFK_IdCuentaContable) {
		this.id_cuenta_contableFK_IdCuentaContable = id_cuenta_contableFK_IdCuentaContable;
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
	
	
	public CobrarConciliacionesCarterasContabilidadLogic getCobrarConciliacionesCarterasContabilidadLogic()	{		
		return cobrarconciliacionescarterascontabilidadLogic;
	}

	public void setCobrarConciliacionesCarterasContabilidadLogic(CobrarConciliacionesCarterasContabilidadLogic cobrarconciliacionescarterascontabilidadLogic) {
		this.cobrarconciliacionescarterascontabilidadLogic = cobrarconciliacionescarterascontabilidadLogic;
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
	
	public Boolean getIsEsNuevoCobrarConciliacionesCarterasContabilidad() {
		return isEsNuevoCobrarConciliacionesCarterasContabilidad;
	}

	public void setIsEsNuevoCobrarConciliacionesCarterasContabilidad(Boolean isEsNuevoCobrarConciliacionesCarterasContabilidad) {
		this.isEsNuevoCobrarConciliacionesCarterasContabilidad = isEsNuevoCobrarConciliacionesCarterasContabilidad;
	}

	public Boolean getEsParaAccionDesdeFormularioCobrarConciliacionesCarterasContabilidad() {
		return esParaAccionDesdeFormularioCobrarConciliacionesCarterasContabilidad;
	}
	
	public void setEsParaAccionDesdeFormularioCobrarConciliacionesCarterasContabilidad(Boolean esParaAccionDesdeFormularioCobrarConciliacionesCarterasContabilidad) {
		this.esParaAccionDesdeFormularioCobrarConciliacionesCarterasContabilidad = esParaAccionDesdeFormularioCobrarConciliacionesCarterasContabilidad;
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

			if(this.cobrarconciliacionescarterascontabilidadSessionBean==null) {
				this.cobrarconciliacionescarterascontabilidadSessionBean=new CobrarConciliacionesCarterasContabilidadSessionBean();
			}

			if(!this.cobrarconciliacionescarterascontabilidadSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(cobrarconciliacionescarterascontabilidadSessionBean.getlidEmpresaActual());
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

			if(this.cobrarconciliacionescarterascontabilidadSessionBean==null) {
				this.cobrarconciliacionescarterascontabilidadSessionBean=new CobrarConciliacionesCarterasContabilidadSessionBean();
			}

			if(!this.cobrarconciliacionescarterascontabilidadSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
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
					cuentacontableLogic.getEntityWithConnection(cobrarconciliacionescarterascontabilidadSessionBean.getlidCuentaContableActual());
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

					if(this.cobrarconciliacionescarterascontabilidad!=null) {
						this.cobrarconciliacionescarterascontabilidad.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) {
						this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jComboBoxid_empresaCobrarConciliacionesCarterasContabilidad.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaCobrarConciliacionesCarterasContabilidad.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) {
						if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jComboBoxid_empresaCobrarConciliacionesCarterasContabilidad.getItemCount()>0) {
							this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jComboBoxid_empresaCobrarConciliacionesCarterasContabilidad.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaCobrarConciliacionesCarterasContabilidadGenerico)throws Exception
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
				jComboBoxid_empresaCobrarConciliacionesCarterasContabilidadGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaCobrarConciliacionesCarterasContabilidadGenerico!=null && jComboBoxid_empresaCobrarConciliacionesCarterasContabilidadGenerico.getItemCount()>0) {
					jComboBoxid_empresaCobrarConciliacionesCarterasContabilidadGenerico.setSelectedIndex(0);
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

					if(this.cobrarconciliacionescarterascontabilidad!=null) {
						this.cobrarconciliacionescarterascontabilidad.setCuentaContable(cuentacontableTemp);
					}

					if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) {
						this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jComboBoxid_cuenta_contableCobrarConciliacionesCarterasContabilidad.setSelectedItem(cuentacontableTemp);
					}
				} else {
					//jComboBoxid_cuenta_contableCobrarConciliacionesCarterasContabilidad.setSelectedItem(cuentacontableTemp);
					if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) {
						if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jComboBoxid_cuenta_contableCobrarConciliacionesCarterasContabilidad.getItemCount()>0) {
							this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jComboBoxid_cuenta_contableCobrarConciliacionesCarterasContabilidad.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaCobrarConciliacionesCarterasContabilidad") || sFormularioTipoBusqueda.equals("Todos")){
					if(cuentacontableTemp!=null && jComboBoxid_cuenta_contableBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad!=null) {
						jComboBoxid_cuenta_contableBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.setSelectedItem(cuentacontableTemp);
					} else {
						if(jComboBoxid_cuenta_contableBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad!=null) {
							//jComboBoxid_cuenta_contableBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.setSelectedItem(cuentacontableTemp);
							if(jComboBoxid_cuenta_contableBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.getItemCount()>0) {
								jComboBoxid_cuenta_contableBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.setSelectedIndex(0);
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
	public void setActualCuentaContableForeignKeyGenerico(Long idCuentaContableSeleccionado,JComboBox jComboBoxid_cuenta_contableCobrarConciliacionesCarterasContabilidadGenerico)throws Exception
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
				jComboBoxid_cuenta_contableCobrarConciliacionesCarterasContabilidadGenerico.setSelectedItem(cuentacontableTemp);
			} else {
				if(jComboBoxid_cuenta_contableCobrarConciliacionesCarterasContabilidadGenerico!=null && jComboBoxid_cuenta_contableCobrarConciliacionesCarterasContabilidadGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contableCobrarConciliacionesCarterasContabilidadGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidad,JComboBox jComboBoxid_empresaCobrarConciliacionesCarterasContabilidadGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaCobrarConciliacionesCarterasContabilidadGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jComboBoxid_empresaCobrarConciliacionesCarterasContabilidad.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaCobrarConciliacionesCarterasContabilidadGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				cobrarconciliacionescarterascontabilidad.setid_empresa(empresaAux.getId());
				cobrarconciliacionescarterascontabilidad.setempresa_descripcion(CobrarConciliacionesCarterasContabilidadConstantesFunciones.getEmpresaDescripcion(empresaAux));
				cobrarconciliacionescarterascontabilidad.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableForeignKey(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidad,JComboBox jComboBoxid_cuenta_contableCobrarConciliacionesCarterasContabilidadGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contableCobrarConciliacionesCarterasContabilidadGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jComboBoxid_cuenta_contableCobrarConciliacionesCarterasContabilidad.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contableCobrarConciliacionesCarterasContabilidadGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null && cuentacontableAux.getId()!=null) {
				cobrarconciliacionescarterascontabilidad.setid_cuenta_contable(cuentacontableAux.getId());
				cobrarconciliacionescarterascontabilidad.setcuentacontable_descripcion(CobrarConciliacionesCarterasContabilidadConstantesFunciones.getCuentaContableDescripcion(cuentacontableAux));
				cobrarconciliacionescarterascontabilidad.setCuentaContable(cuentacontableAux);			}
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

					if(!CobrarConciliacionesCarterasContabilidadJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) { 
							this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jComboBoxid_empresaCobrarConciliacionesCarterasContabilidad.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jComboBoxid_empresaCobrarConciliacionesCarterasContabilidad.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) { 
					}

					if(!CobrarConciliacionesCarterasContabilidadJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


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

					if(!CobrarConciliacionesCarterasContabilidadJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) { 
							this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jComboBoxid_cuenta_contableCobrarConciliacionesCarterasContabilidad.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jComboBoxid_cuenta_contableCobrarConciliacionesCarterasContabilidad.addItem(cuentacontable);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) { 
					}

					if(!CobrarConciliacionesCarterasContabilidadJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaCobrarConciliacionesCarterasContabilidad") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CobrarConciliacionesCarterasContabilidadJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cuenta_contableBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jComboBoxid_cuenta_contableBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.addItem(cuentacontable);
							}
						}

						if(!CobrarConciliacionesCarterasContabilidadJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) {
							this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jComboBoxid_empresaCobrarConciliacionesCarterasContabilidad.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) {
							this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jComboBoxid_empresaCobrarConciliacionesCarterasContabilidad.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameCuentaContableForeignKey(CuentaContable cuentacontable,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) {
							this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jComboBoxid_cuenta_contableCobrarConciliacionesCarterasContabilidad.setSelectedItem(cuentacontable);
						}
					} else {
						if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) {
							this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jComboBoxid_cuenta_contableCobrarConciliacionesCarterasContabilidad.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cuenta_contableBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.setSelectedItem(cuentacontable);
						} else {
							this.jComboBoxid_cuenta_contableBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesCobrarConciliacionesCarterasContabilidad() throws Exception {
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
		
	public CobrarConciliacionesCarterasContabilidadParameterReturnGeneral getCobrarConciliacionesCarterasContabilidadParameterGeneral() {
		return this.cobrarconciliacionescarterascontabilidadParameterGeneral;
	}
	
	public void setCobrarConciliacionesCarterasContabilidadParameterGeneral(CobrarConciliacionesCarterasContabilidadParameterReturnGeneral cobrarconciliacionescarterascontabilidadParameterGeneral) {
		this.cobrarconciliacionescarterascontabilidadParameterGeneral = cobrarconciliacionescarterascontabilidadParameterGeneral;
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
	
	public Boolean getIsPermisoTodoCobrarConciliacionesCarterasContabilidad() {
		return isPermisoTodoCobrarConciliacionesCarterasContabilidad;
	}

	public void setIsPermisoTodoCobrarConciliacionesCarterasContabilidad(Boolean isPermisoTodoCobrarConciliacionesCarterasContabilidad) {
		this.isPermisoTodoCobrarConciliacionesCarterasContabilidad = isPermisoTodoCobrarConciliacionesCarterasContabilidad;
	}

	public Boolean getIsPermisoNuevoCobrarConciliacionesCarterasContabilidad() {
		return isPermisoNuevoCobrarConciliacionesCarterasContabilidad;
	}

	public void setIsPermisoNuevoCobrarConciliacionesCarterasContabilidad(Boolean isPermisoNuevoCobrarConciliacionesCarterasContabilidad) {
		this.isPermisoNuevoCobrarConciliacionesCarterasContabilidad = isPermisoNuevoCobrarConciliacionesCarterasContabilidad;
	}

	public Boolean getIsPermisoActualizarCobrarConciliacionesCarterasContabilidad() {
		return isPermisoActualizarCobrarConciliacionesCarterasContabilidad;
	}

	public void setIsPermisoActualizarCobrarConciliacionesCarterasContabilidad(Boolean isPermisoActualizarCobrarConciliacionesCarterasContabilidad) {
		this.isPermisoActualizarCobrarConciliacionesCarterasContabilidad = isPermisoActualizarCobrarConciliacionesCarterasContabilidad;
	}

	public Boolean getIsPermisoEliminarCobrarConciliacionesCarterasContabilidad() {
		return isPermisoEliminarCobrarConciliacionesCarterasContabilidad;
	}

	public void setIsPermisoEliminarCobrarConciliacionesCarterasContabilidad(Boolean isPermisoEliminarCobrarConciliacionesCarterasContabilidad) {
		this.isPermisoEliminarCobrarConciliacionesCarterasContabilidad = isPermisoEliminarCobrarConciliacionesCarterasContabilidad;
	}

	public Boolean getIsPermisoGuardarCambiosCobrarConciliacionesCarterasContabilidad() {
		return isPermisoGuardarCambiosCobrarConciliacionesCarterasContabilidad;
	}

	public void setIsPermisoGuardarCambiosCobrarConciliacionesCarterasContabilidad(Boolean isPermisoGuardarCambiosCobrarConciliacionesCarterasContabilidad) {
		this.isPermisoGuardarCambiosCobrarConciliacionesCarterasContabilidad = isPermisoGuardarCambiosCobrarConciliacionesCarterasContabilidad;
	}
	
	public Boolean getIsPermisoConsultaCobrarConciliacionesCarterasContabilidad() {
		return isPermisoConsultaCobrarConciliacionesCarterasContabilidad;
	}

	public void setIsPermisoConsultaCobrarConciliacionesCarterasContabilidad(Boolean isPermisoConsultaCobrarConciliacionesCarterasContabilidad) {
		this.isPermisoConsultaCobrarConciliacionesCarterasContabilidad = isPermisoConsultaCobrarConciliacionesCarterasContabilidad;
	}

	public Boolean getIsPermisoBusquedaCobrarConciliacionesCarterasContabilidad() {
		return isPermisoBusquedaCobrarConciliacionesCarterasContabilidad;
	}

	public void setIsPermisoBusquedaCobrarConciliacionesCarterasContabilidad(Boolean isPermisoBusquedaCobrarConciliacionesCarterasContabilidad) {
		this.isPermisoBusquedaCobrarConciliacionesCarterasContabilidad = isPermisoBusquedaCobrarConciliacionesCarterasContabilidad;
	}

	public Boolean getIsPermisoReporteCobrarConciliacionesCarterasContabilidad() {
		return isPermisoReporteCobrarConciliacionesCarterasContabilidad;
	}

	public void setIsPermisoReporteCobrarConciliacionesCarterasContabilidad(Boolean isPermisoReporteCobrarConciliacionesCarterasContabilidad) {
		this.isPermisoReporteCobrarConciliacionesCarterasContabilidad = isPermisoReporteCobrarConciliacionesCarterasContabilidad;
	}
	
	public Boolean getIsPermisoPaginacionMedioCobrarConciliacionesCarterasContabilidad() {
		return isPermisoPaginacionMedioCobrarConciliacionesCarterasContabilidad;
	}

	public void setIsPermisoPaginacionMedioCobrarConciliacionesCarterasContabilidad(Boolean isPermisoPaginacionMedioCobrarConciliacionesCarterasContabilidad) {
		this.isPermisoPaginacionMedioCobrarConciliacionesCarterasContabilidad = isPermisoPaginacionMedioCobrarConciliacionesCarterasContabilidad;
	}
	
	public Boolean getIsPermisoPaginacionTodoCobrarConciliacionesCarterasContabilidad() {
		return isPermisoPaginacionTodoCobrarConciliacionesCarterasContabilidad;
	}

	public void setIsPermisoPaginacionTodoCobrarConciliacionesCarterasContabilidad(Boolean isPermisoPaginacionTodoCobrarConciliacionesCarterasContabilidad) {
		this.isPermisoPaginacionTodoCobrarConciliacionesCarterasContabilidad = isPermisoPaginacionTodoCobrarConciliacionesCarterasContabilidad;
	}
	
	public Boolean getIsPermisoPaginacionAltoCobrarConciliacionesCarterasContabilidad() {
		return isPermisoPaginacionAltoCobrarConciliacionesCarterasContabilidad;
	}

	public void setIsPermisoPaginacionAltoCobrarConciliacionesCarterasContabilidad(Boolean isPermisoPaginacionAltoCobrarConciliacionesCarterasContabilidad) {
		this.isPermisoPaginacionAltoCobrarConciliacionesCarterasContabilidad = isPermisoPaginacionAltoCobrarConciliacionesCarterasContabilidad;
	}
	
	public Boolean getIsPermisoCopiarCobrarConciliacionesCarterasContabilidad() {
		return isPermisoCopiarCobrarConciliacionesCarterasContabilidad;
	}

	public void setIsPermisoCopiarCobrarConciliacionesCarterasContabilidad(Boolean isPermisoCopiarCobrarConciliacionesCarterasContabilidad) {
		this.isPermisoCopiarCobrarConciliacionesCarterasContabilidad = isPermisoCopiarCobrarConciliacionesCarterasContabilidad;
	}
	
	public Boolean getIsPermisoVerFormCobrarConciliacionesCarterasContabilidad() {
		return isPermisoVerFormCobrarConciliacionesCarterasContabilidad;
	}

	public void setIsPermisoVerFormCobrarConciliacionesCarterasContabilidad(Boolean isPermisoVerFormCobrarConciliacionesCarterasContabilidad) {
		this.isPermisoVerFormCobrarConciliacionesCarterasContabilidad = isPermisoVerFormCobrarConciliacionesCarterasContabilidad;
	}
	
	public Boolean getIsPermisoDuplicarCobrarConciliacionesCarterasContabilidad() {
		return isPermisoDuplicarCobrarConciliacionesCarterasContabilidad;
	}

	public void setIsPermisoDuplicarCobrarConciliacionesCarterasContabilidad(Boolean isPermisoDuplicarCobrarConciliacionesCarterasContabilidad) {
		this.isPermisoDuplicarCobrarConciliacionesCarterasContabilidad = isPermisoDuplicarCobrarConciliacionesCarterasContabilidad;
	}
	
	public Boolean getIsPermisoOrdenCobrarConciliacionesCarterasContabilidad() {
		return isPermisoOrdenCobrarConciliacionesCarterasContabilidad;
	}

	public void setIsPermisoOrdenCobrarConciliacionesCarterasContabilidad(Boolean isPermisoOrdenCobrarConciliacionesCarterasContabilidad) {
		this.isPermisoOrdenCobrarConciliacionesCarterasContabilidad = isPermisoOrdenCobrarConciliacionesCarterasContabilidad;
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
	
	public Boolean getIsVisibilidadCeldaNuevoCobrarConciliacionesCarterasContabilidad() {
		return isVisibilidadCeldaNuevoCobrarConciliacionesCarterasContabilidad;
	}

	public void setIsVisibilidadCeldaNuevoCobrarConciliacionesCarterasContabilidad(Boolean isVisibilidadCeldaNuevoCobrarConciliacionesCarterasContabilidad) {
		this.isVisibilidadCeldaNuevoCobrarConciliacionesCarterasContabilidad = isVisibilidadCeldaNuevoCobrarConciliacionesCarterasContabilidad;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCobrarConciliacionesCarterasContabilidad() {
		return isVisibilidadCeldaDuplicarCobrarConciliacionesCarterasContabilidad;
	}

	public void setIsVisibilidadCeldaDuplicarCobrarConciliacionesCarterasContabilidad(Boolean isVisibilidadCeldaDuplicarCobrarConciliacionesCarterasContabilidad) {
		this.isVisibilidadCeldaDuplicarCobrarConciliacionesCarterasContabilidad = isVisibilidadCeldaDuplicarCobrarConciliacionesCarterasContabilidad;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCobrarConciliacionesCarterasContabilidad() {
		return isVisibilidadCeldaCopiarCobrarConciliacionesCarterasContabilidad;
	}

	public void setIsVisibilidadCeldaCopiarCobrarConciliacionesCarterasContabilidad(Boolean isVisibilidadCeldaCopiarCobrarConciliacionesCarterasContabilidad) {
		this.isVisibilidadCeldaCopiarCobrarConciliacionesCarterasContabilidad = isVisibilidadCeldaCopiarCobrarConciliacionesCarterasContabilidad;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCobrarConciliacionesCarterasContabilidad() {
		return isVisibilidadCeldaVerFormCobrarConciliacionesCarterasContabilidad;
	}

	public void setIsVisibilidadCeldaVerFormCobrarConciliacionesCarterasContabilidad(Boolean isVisibilidadCeldaVerFormCobrarConciliacionesCarterasContabilidad) {
		this.isVisibilidadCeldaVerFormCobrarConciliacionesCarterasContabilidad = isVisibilidadCeldaVerFormCobrarConciliacionesCarterasContabilidad;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCobrarConciliacionesCarterasContabilidad() {
		return isVisibilidadCeldaOrdenCobrarConciliacionesCarterasContabilidad;
	}

	public void setIsVisibilidadCeldaOrdenCobrarConciliacionesCarterasContabilidad(Boolean isVisibilidadCeldaOrdenCobrarConciliacionesCarterasContabilidad) {
		this.isVisibilidadCeldaOrdenCobrarConciliacionesCarterasContabilidad = isVisibilidadCeldaOrdenCobrarConciliacionesCarterasContabilidad;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCobrarConciliacionesCarterasContabilidad() {
		return isVisibilidadCeldaNuevoRelacionesCobrarConciliacionesCarterasContabilidad;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCobrarConciliacionesCarterasContabilidad(Boolean isVisibilidadCeldaNuevoRelacionesCobrarConciliacionesCarterasContabilidad) {
		this.isVisibilidadCeldaNuevoRelacionesCobrarConciliacionesCarterasContabilidad = isVisibilidadCeldaNuevoRelacionesCobrarConciliacionesCarterasContabilidad;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCobrarConciliacionesCarterasContabilidad() {
		return isVisibilidadCeldaModificarCobrarConciliacionesCarterasContabilidad;
	}

	public void setIsVisibilidadCeldaModificarCobrarConciliacionesCarterasContabilidad(Boolean isVisibilidadCeldaModificarCobrarConciliacionesCarterasContabilidad) {
		this.isVisibilidadCeldaModificarCobrarConciliacionesCarterasContabilidad = isVisibilidadCeldaModificarCobrarConciliacionesCarterasContabilidad;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCobrarConciliacionesCarterasContabilidad() {
		return isVisibilidadCeldaActualizarCobrarConciliacionesCarterasContabilidad;
	}

	public void setIsVisibilidadCeldaActualizarCobrarConciliacionesCarterasContabilidad(Boolean isVisibilidadCeldaActualizarCobrarConciliacionesCarterasContabilidad) {
		this.isVisibilidadCeldaActualizarCobrarConciliacionesCarterasContabilidad = isVisibilidadCeldaActualizarCobrarConciliacionesCarterasContabilidad;
	}

	public Boolean getIsVisibilidadCeldaEliminarCobrarConciliacionesCarterasContabilidad() {
		return isVisibilidadCeldaEliminarCobrarConciliacionesCarterasContabilidad;
	}

	public void setIsVisibilidadCeldaEliminarCobrarConciliacionesCarterasContabilidad(Boolean isVisibilidadCeldaEliminarCobrarConciliacionesCarterasContabilidad) {
		this.isVisibilidadCeldaEliminarCobrarConciliacionesCarterasContabilidad = isVisibilidadCeldaEliminarCobrarConciliacionesCarterasContabilidad;
	}

	public Boolean getIsVisibilidadCeldaCancelarCobrarConciliacionesCarterasContabilidad() {
		return isVisibilidadCeldaCancelarCobrarConciliacionesCarterasContabilidad;
	}

	public void setIsVisibilidadCeldaCancelarCobrarConciliacionesCarterasContabilidad(Boolean isVisibilidadCeldaCancelarCobrarConciliacionesCarterasContabilidad) {
		this.isVisibilidadCeldaCancelarCobrarConciliacionesCarterasContabilidad = isVisibilidadCeldaCancelarCobrarConciliacionesCarterasContabilidad;
	}

	public Boolean getIsVisibilidadCeldaGuardarCobrarConciliacionesCarterasContabilidad() {
		return isVisibilidadCeldaGuardarCobrarConciliacionesCarterasContabilidad;
	}

	public void setIsVisibilidadCeldaGuardarCobrarConciliacionesCarterasContabilidad(Boolean isVisibilidadCeldaGuardarCobrarConciliacionesCarterasContabilidad) {
		this.isVisibilidadCeldaGuardarCobrarConciliacionesCarterasContabilidad = isVisibilidadCeldaGuardarCobrarConciliacionesCarterasContabilidad;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCobrarConciliacionesCarterasContabilidad() {
		return isVisibilidadCeldaGuardarCambiosCobrarConciliacionesCarterasContabilidad;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCobrarConciliacionesCarterasContabilidad(Boolean isVisibilidadCeldaGuardarCambiosCobrarConciliacionesCarterasContabilidad) {
		this.isVisibilidadCeldaGuardarCambiosCobrarConciliacionesCarterasContabilidad = isVisibilidadCeldaGuardarCambiosCobrarConciliacionesCarterasContabilidad;
	}
		
	public CobrarConciliacionesCarterasContabilidadSessionBean getcobrarconciliacionescarterascontabilidadSessionBean() {
		return this.cobrarconciliacionescarterascontabilidadSessionBean;
	}
	
	public void setcobrarconciliacionescarterascontabilidadSessionBean(CobrarConciliacionesCarterasContabilidadSessionBean cobrarconciliacionescarterascontabilidadSessionBean) {
		this.cobrarconciliacionescarterascontabilidadSessionBean=cobrarconciliacionescarterascontabilidadSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaCobrarConciliacionesCarterasContabilidad() {
		return this.isVisibilidadBusquedaCobrarConciliacionesCarterasContabilidad;
	}

	public void setisVisibilidadBusquedaCobrarConciliacionesCarterasContabilidad(Boolean isVisibilidadBusquedaCobrarConciliacionesCarterasContabilidad) {
		this.isVisibilidadBusquedaCobrarConciliacionesCarterasContabilidad=isVisibilidadBusquedaCobrarConciliacionesCarterasContabilidad;
	}

	public Boolean getisVisibilidadFK_IdCuentaContable() {
		return this.isVisibilidadFK_IdCuentaContable;
	}

	public void setisVisibilidadFK_IdCuentaContable(Boolean isVisibilidadFK_IdCuentaContable) {
		this.isVisibilidadFK_IdCuentaContable=isVisibilidadFK_IdCuentaContable;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCobrarConciliacionesCarterasContabilidad(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidad)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(cobrarconciliacionescarterascontabilidad,null);
				this.setActualParaGuardarCuentaContableForeignKey(cobrarconciliacionescarterascontabilidad,null);
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
	
	public void bugActualizarReferenciaActual(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidad,CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidadAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCobrarConciliacionesCarterasContabilidad(cobrarconciliacionescarterascontabilidad);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		cobrarconciliacionescarterascontabilidadAux.setId(cobrarconciliacionescarterascontabilidad.getId());
		cobrarconciliacionescarterascontabilidadAux.setVersionRow(cobrarconciliacionescarterascontabilidad.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidadLocal) throws Exception {
		
		if(this.cobrarconciliacionescarterascontabilidadSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidadLocal) throws Exception {	
		if(this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				cobrarconciliacionescarterascontabilidadLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontableBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontableBeanSwingJInternalFrameLocal.actualizarLista(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontablesForeignKey);

				cuentacontableBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				cobrarconciliacionescarterascontabilidadLocal.setCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContable();
				this.cargarCombosFrameCuentaContablesForeignKey("Formulario");
				this.setActualCuentaContableForeignKey(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarCobrarConciliacionesCarterasContabilidadActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCobrarConciliacionesCarterasContabilidad.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cobrarconciliacionescarterascontabilidad =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads().toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.cobrarconciliacionescarterascontabilidad =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidads.toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = cobrarconciliacionescarterascontabilidadValidator.getInvalidValues(this.cobrarconciliacionescarterascontabilidad);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidad,List<CobrarConciliacionesCarterasContabilidad> cobrarconciliacionescarterascontabilidads) throws Exception {
	}		
	
	public void actualizarSelectedLista(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidad,List<CobrarConciliacionesCarterasContabilidad> cobrarconciliacionescarterascontabilidads) throws Exception {
		try	{			
			CobrarConciliacionesCarterasContabilidadConstantesFunciones.actualizarSelectedLista(cobrarconciliacionescarterascontabilidad,cobrarconciliacionescarterascontabilidads);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<CobrarConciliacionesCarterasContabilidad> cobrarconciliacionescarterascontabilidadsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				cobrarconciliacionescarterascontabilidadsLocal=this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				cobrarconciliacionescarterascontabilidadsLocal=this.cobrarconciliacionescarterascontabilidads;
			}
			//ARCHITECTURE
		
			for(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidadLocal:cobrarconciliacionescarterascontabilidadsLocal) {
				if(this.permiteMantenimiento(cobrarconciliacionescarterascontabilidadLocal) && cobrarconciliacionescarterascontabilidadLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+CobrarConciliacionesCarterasContabilidadConstantesFunciones.getCobrarConciliacionesCarterasContabilidadLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CobrarConciliacionesCarterasContabilidadConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jLabelcodigoCobrarConciliacionesCarterasContabilidad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarConciliacionesCarterasContabilidadConstantesFunciones.CODIGOTIPOMOVIMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jLabelcodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarConciliacionesCarterasContabilidadConstantesFunciones.NUMEROMAYOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jLabelnumero_mayorCobrarConciliacionesCarterasContabilidad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarConciliacionesCarterasContabilidadConstantesFunciones.DEBITOASIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jLabeldebito_asientoCobrarConciliacionesCarterasContabilidad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarConciliacionesCarterasContabilidadConstantesFunciones.CREDITOASIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jLabelcredito_asientoCobrarConciliacionesCarterasContabilidad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarConciliacionesCarterasContabilidadConstantesFunciones.DEBITOCUENTAS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jLabeldebito_cuentasCobrarConciliacionesCarterasContabilidad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarConciliacionesCarterasContabilidadConstantesFunciones.CREDITOCUENTAS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jLabelcredito_cuentasCobrarConciliacionesCarterasContabilidad,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jLabelcodigoCobrarConciliacionesCarterasContabilidad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jLabelcodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jLabelnumero_mayorCobrarConciliacionesCarterasContabilidad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jLabeldebito_asientoCobrarConciliacionesCarterasContabilidad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jLabelcredito_asientoCobrarConciliacionesCarterasContabilidad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jLabeldebito_cuentasCobrarConciliacionesCarterasContabilidad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jLabelcredito_cuentasCobrarConciliacionesCarterasContabilidad,"");
		
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
		this.iIdNuevoCobrarConciliacionesCarterasContabilidad--;	
		
		
		this.cobrarconciliacionescarterascontabilidadAux=new CobrarConciliacionesCarterasContabilidad();
		
		this.cobrarconciliacionescarterascontabilidadAux.setId(this.iIdNuevoCobrarConciliacionesCarterasContabilidad);
		this.cobrarconciliacionescarterascontabilidadAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads().add(this.cobrarconciliacionescarterascontabilidadAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.cobrarconciliacionescarterascontabilidads.add(this.cobrarconciliacionescarterascontabilidadAux);
		}
		//ARCHITECTURE
		
		this.cobrarconciliacionescarterascontabilidad=this.cobrarconciliacionescarterascontabilidadAux;
		
		if(CobrarConciliacionesCarterasContabilidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidad);
			this.setVariablesObjetoActualToFormularioForeignKeyCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidad);
		}
				
		//this.setDefaultControlesCobrarConciliacionesCarterasContabilidad();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCobrarConciliacionesCarterasContabilidad();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCobrarConciliacionesCarterasContabilidad();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCobrarConciliacionesCarterasContabilidad();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidadBean,this.cobrarconciliacionescarterascontabilidad,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidad);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidadReturnGeneral,this.cobrarconciliacionescarterascontabilidadBean,false);
		
		if(this.cobrarconciliacionescarterascontabilidadReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidadReturnGeneral.getCobrarConciliacionesCarterasContabilidad());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidadReturnGeneral.getCobrarConciliacionesCarterasContabilidad());
		}
		
		if(this.cobrarconciliacionescarterascontabilidadReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidadReturnGeneral.getCobrarConciliacionesCarterasContabilidad(),classes);//this.cobrarconciliacionescarterascontabilidadBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidad,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCobrarConciliacionesCarterasContabilidad();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCobrarConciliacionesCarterasContabilidad();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional.RecargarFormCobrarConciliacionesCarterasContabilidad(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCobrarConciliacionesCarterasContabilidad(false);
						
			if(cobrarconciliacionescarterascontabilidadSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(CobrarConciliacionesCarterasContabilidadJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCobrarConciliacionesCarterasContabilidad();
			}
			
			this.actualizarVisualTableDatosCobrarConciliacionesCarterasContabilidad();
			
			this.jTableDatosCobrarConciliacionesCarterasContabilidad.setRowSelectionInterval(this.getIndiceNuevoCobrarConciliacionesCarterasContabilidad(), this.getIndiceNuevoCobrarConciliacionesCarterasContabilidad());
			
			this.seleccionarFilaTablaCobrarConciliacionesCarterasContabilidadActual();
						
			this.actualizarEstadoCeldasBotonesCobrarConciliacionesCarterasContabilidad("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCobrarConciliacionesCarterasContabilidad(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jDateChooserfecha_desdeCobrarConciliacionesCarterasContabilidad.setEnabled(isHabilitar && this.cobrarconciliacionescarterascontabilidadConstantesFunciones.activarfecha_desdeCobrarConciliacionesCarterasContabilidad);
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jDateChooserfecha_hastaCobrarConciliacionesCarterasContabilidad.setEnabled(isHabilitar && this.cobrarconciliacionescarterascontabilidadConstantesFunciones.activarfecha_hastaCobrarConciliacionesCarterasContabilidad);
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTextFieldcodigoCobrarConciliacionesCarterasContabilidad.setEnabled(isHabilitar && this.cobrarconciliacionescarterascontabilidadConstantesFunciones.activarcodigoCobrarConciliacionesCarterasContabilidad);
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTextFieldcodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidad.setEnabled(isHabilitar && this.cobrarconciliacionescarterascontabilidadConstantesFunciones.activarcodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidad);
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTextAreanumero_mayorCobrarConciliacionesCarterasContabilidad.setEnabled(isHabilitar && this.cobrarconciliacionescarterascontabilidadConstantesFunciones.activarnumero_mayorCobrarConciliacionesCarterasContabilidad);
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTextFielddebito_asientoCobrarConciliacionesCarterasContabilidad.setEnabled(isHabilitar && this.cobrarconciliacionescarterascontabilidadConstantesFunciones.activardebito_asientoCobrarConciliacionesCarterasContabilidad);
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTextFieldcredito_asientoCobrarConciliacionesCarterasContabilidad.setEnabled(isHabilitar && this.cobrarconciliacionescarterascontabilidadConstantesFunciones.activarcredito_asientoCobrarConciliacionesCarterasContabilidad);
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTextFielddebito_cuentasCobrarConciliacionesCarterasContabilidad.setEnabled(isHabilitar && this.cobrarconciliacionescarterascontabilidadConstantesFunciones.activardebito_cuentasCobrarConciliacionesCarterasContabilidad);
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTextFieldcredito_cuentasCobrarConciliacionesCarterasContabilidad.setEnabled(isHabilitar && this.cobrarconciliacionescarterascontabilidadConstantesFunciones.activarcredito_cuentasCobrarConciliacionesCarterasContabilidad);	
		//
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jComboBoxid_empresaCobrarConciliacionesCarterasContabilidad.setEnabled(isHabilitar && this.cobrarconciliacionescarterascontabilidadConstantesFunciones.activarid_empresaCobrarConciliacionesCarterasContabilidad);
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jComboBoxid_cuenta_contableCobrarConciliacionesCarterasContabilidad.setEnabled(isHabilitar && this.cobrarconciliacionescarterascontabilidadConstantesFunciones.activarid_cuenta_contableCobrarConciliacionesCarterasContabilidad);
	};
	
	public void setDefaultControlesCobrarConciliacionesCarterasContabilidad() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCobrarConciliacionesCarterasContabilidad(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.cobrarconciliacionescarterascontabilidadSessionBean.setConGuardarRelaciones(true);			
			this.cobrarconciliacionescarterascontabilidadSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTabbedPaneRelacionesCobrarConciliacionesCarterasContabilidad.setVisible(true);
			
					
		} else {
			//this.cobrarconciliacionescarterascontabilidadSessionBean.setConGuardarRelaciones(false);			
			this.cobrarconciliacionescarterascontabilidadSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTabbedPaneRelacionesCobrarConciliacionesCarterasContabilidad.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoCobrarConciliacionesCarterasContabilidad() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidadAux:this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads()) {
				if(cobrarconciliacionescarterascontabilidadAux.getId().equals(this.iIdNuevoCobrarConciliacionesCarterasContabilidad)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidadAux:this.cobrarconciliacionescarterascontabilidads) {
				if(cobrarconciliacionescarterascontabilidadAux.getId().equals(this.iIdNuevoCobrarConciliacionesCarterasContabilidad)) {
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
	
	public int getIndiceActualCobrarConciliacionesCarterasContabilidad(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidad,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidadAux:this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads()) {
				if(cobrarconciliacionescarterascontabilidadAux.getId().equals(cobrarconciliacionescarterascontabilidad.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidadAux:this.cobrarconciliacionescarterascontabilidads) {
				if(cobrarconciliacionescarterascontabilidadAux.getId().equals(cobrarconciliacionescarterascontabilidad.getId())) {
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
	
	public void setCamposBaseDesdeOriginalCobrarConciliacionesCarterasContabilidad(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidadOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidadAux:this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads()) {
				if(cobrarconciliacionescarterascontabilidadAux.getCobrarConciliacionesCarterasContabilidadOriginal().getId().equals(cobrarconciliacionescarterascontabilidadOriginal.getId())) {
					existe=true;
					cobrarconciliacionescarterascontabilidadOriginal.setId(cobrarconciliacionescarterascontabilidadAux.getId());
					cobrarconciliacionescarterascontabilidadOriginal.setVersionRow(cobrarconciliacionescarterascontabilidadAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidadAux:this.cobrarconciliacionescarterascontabilidads) {
				if(cobrarconciliacionescarterascontabilidadAux.getCobrarConciliacionesCarterasContabilidadOriginal().getId().equals(cobrarconciliacionescarterascontabilidadOriginal.getId())) {
					existe=true;
					cobrarconciliacionescarterascontabilidadOriginal.setId(cobrarconciliacionescarterascontabilidadAux.getId());
					cobrarconciliacionescarterascontabilidadOriginal.setVersionRow(cobrarconciliacionescarterascontabilidadAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCobrarConciliacionesCarterasContabilidad(Boolean esParaCancelar) throws Exception {
		cobrarconciliacionescarterascontabilidadsAux=new ArrayList<CobrarConciliacionesCarterasContabilidad>();
		cobrarconciliacionescarterascontabilidadAux=new CobrarConciliacionesCarterasContabilidad();
		
		if(!this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidadAux:this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads()) {
					if(cobrarconciliacionescarterascontabilidadAux.getId()<0) {
						cobrarconciliacionescarterascontabilidadsAux.add(cobrarconciliacionescarterascontabilidadAux);
					}		
				}
				this.iIdNuevoCobrarConciliacionesCarterasContabilidad=0L;
				this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads().removeAll(cobrarconciliacionescarterascontabilidadsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidadAux:this.cobrarconciliacionescarterascontabilidads) {
					if(cobrarconciliacionescarterascontabilidadAux.getId()<0) {
						cobrarconciliacionescarterascontabilidadsAux.add(cobrarconciliacionescarterascontabilidadAux);
					}		
				}
				this.iIdNuevoCobrarConciliacionesCarterasContabilidad=0L;
				this.cobrarconciliacionescarterascontabilidads.removeAll(cobrarconciliacionescarterascontabilidadsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCobrarConciliacionesCarterasContabilidad 
					&& this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads().size()>0
					) {
					cobrarconciliacionescarterascontabilidadAux=this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads().get(this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads().size() - 1);
				
					if(cobrarconciliacionescarterascontabilidadAux.getId()<0) {
						this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads().remove(cobrarconciliacionescarterascontabilidadAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCobrarConciliacionesCarterasContabilidad && this.cobrarconciliacionescarterascontabilidads.size()>0) {
					cobrarconciliacionescarterascontabilidadAux=this.cobrarconciliacionescarterascontabilidads.get(this.cobrarconciliacionescarterascontabilidads.size() - 1);
				
					if(cobrarconciliacionescarterascontabilidadAux.getId()<0) {
						this.cobrarconciliacionescarterascontabilidads.remove(cobrarconciliacionescarterascontabilidadAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCobrarConciliacionesCarterasContabilidad(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(cobrarconciliacionescarterascontabilidad.getId()<0) {
				this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads().remove(this.cobrarconciliacionescarterascontabilidad);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(cobrarconciliacionescarterascontabilidad.getId()<0) {
				this.cobrarconciliacionescarterascontabilidads.remove(this.cobrarconciliacionescarterascontabilidad);
			}
		}			
	}
	
	public void setEstadosInicialesCobrarConciliacionesCarterasContabilidad(List<CobrarConciliacionesCarterasContabilidad> cobrarconciliacionescarterascontabilidadsAux) throws Exception {
		CobrarConciliacionesCarterasContabilidadConstantesFunciones.setEstadosInicialesCobrarConciliacionesCarterasContabilidad(cobrarconciliacionescarterascontabilidadsAux);
	}
	
	public void setEstadosInicialesCobrarConciliacionesCarterasContabilidad(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidadAux) throws Exception {
		CobrarConciliacionesCarterasContabilidadConstantesFunciones.setEstadosInicialesCobrarConciliacionesCarterasContabilidad(cobrarconciliacionescarterascontabilidadAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCobrarConciliacionesCarterasContabilidadActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCobrarConciliacionesCarterasContabilidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCobrarConciliacionesCarterasContabilidadActual()) {
				if(!this.isEsNuevoCobrarConciliacionesCarterasContabilidad) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCobrarConciliacionesCarterasContabilidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCobrarConciliacionesCarterasContabilidad=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCobrarConciliacionesCarterasContabilidadActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Cobrar Conciliaciones Carteras Contabilidad ?", "MANTENIMIENTO DE Cobrar Conciliaciones Carteras Contabilidad", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCobrarConciliacionesCarterasContabilidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidad) throws Exception {
		CobrarConciliacionesCarterasContabilidadConstantesFunciones.seleccionarAsignar(this.cobrarconciliacionescarterascontabilidad,cobrarconciliacionescarterascontabilidad);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCobrarConciliacionesCarterasContabilidad=this.isPermisoActualizarOriginalCobrarConciliacionesCarterasContabilidad;
			
			
			this.seleccionarAsignar(cobrarconciliacionescarterascontabilidad);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesCobrarConciliacionesCarterasContabilidad("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.cobrarconciliacionescarterascontabilidadSessionBean.setsFuncionBusquedaRapida(this.cobrarconciliacionescarterascontabilidadSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoCobrarConciliacionesCarterasContabilidad) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCobrarConciliacionesCarterasContabilidad(esParaCancelar);				
				this.cancelarNuevoCobrarConciliacionesCarterasContabilidad(esParaCancelar);								
			}
			
			this.cobrarconciliacionescarterascontabilidad=new CobrarConciliacionesCarterasContabilidad();
			
			this.inicializarCobrarConciliacionesCarterasContabilidad();
			
			this.actualizarEstadoCeldasBotonesCobrarConciliacionesCarterasContabilidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCobrarConciliacionesCarterasContabilidad() throws Exception {
		try {
			CobrarConciliacionesCarterasContabilidadConstantesFunciones.inicializarCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidad);
			
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
			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCobrarConciliacionesCarterasContabilidads(String sAccionBusqueda,List<CobrarConciliacionesCarterasContabilidad> cobrarconciliacionescarterascontabilidadsParaReportes) throws Exception {
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
					sPathReporteFinal="CobrarConciliacionesCarterasContabilidad"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CobrarConciliacionesCarterasContabilidadMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CobrarConciliacionesCarterasContabilidadMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="CobrarConciliacionesCarterasContabilidad"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Cobrar Conciliaciones Carteras Contabilidades");		
		parameters.put("busquedapor", CobrarConciliacionesCarterasContabilidadConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCobrarConciliacionesCarterasContabilidad=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CobrarConciliacionesCarterasContabilidadConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CobrarConciliacionesCarterasContabilidadConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCobrarConciliacionesCarterasContabilidad=new JRBeanArrayDataSource(CobrarConciliacionesCarterasContabilidadJInternalFrame.TraerCobrarConciliacionesCarterasContabilidadBeans(cobrarconciliacionescarterascontabilidadsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCobrarConciliacionesCarterasContabilidad);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CobrarConciliacionesCarterasContabilidadConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CobrarConciliacionesCarterasContabilidadBean.TraerCobrarConciliacionesCarterasContabilidadBeans(cobrarconciliacionescarterascontabilidadsParaReportes).toArray()));
							
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
				this.generarExcelReporteCobrarConciliacionesCarterasContabilidads(sAccionBusqueda,sTipoArchivoReporte,cobrarconciliacionescarterascontabilidadsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCobrarConciliacionesCarterasContabilidads(sAccionBusqueda,sTipoArchivoReporte,cobrarconciliacionescarterascontabilidadsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCobrarConciliacionesCarterasContabilidadActionPerformed(null);
					//this.generarExcelReporteCobrarConciliacionesCarterasContabilidads(sAccionBusqueda,sTipoArchivoReporte,cobrarconciliacionescarterascontabilidadsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCobrarConciliacionesCarterasContabilidads(sAccionBusqueda,sTipoArchivoReporte,cobrarconciliacionescarterascontabilidadsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCobrarConciliacionesCarterasContabilidads(sAccionBusqueda,sTipoArchivoReporte,cobrarconciliacionescarterascontabilidadsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCobrarConciliacionesCarterasContabilidads(sAccionBusqueda,sTipoArchivoReporte,cobrarconciliacionescarterascontabilidadsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCobrarConciliacionesCarterasContabilidads(String sAccionBusqueda,String sTipoArchivoReporte,List<CobrarConciliacionesCarterasContabilidad> cobrarconciliacionescarterascontabilidadsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarconciliacionescarterascontabilidad";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CobrarConciliacionesCarterasContabilidads");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCobrarConciliacionesCarterasContabilidad("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidad : cobrarconciliacionescarterascontabilidadsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CobrarConciliacionesCarterasContabilidadConstantesFunciones.generarExcelReporteDataCobrarConciliacionesCarterasContabilidad("NORMAL",row,workbook,cobrarconciliacionescarterascontabilidad,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Conciliaciones Carteras Contabilidad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCobrarConciliacionesCarterasContabilidad(String sTipo,Row row,Workbook workbook) {
		
		CobrarConciliacionesCarterasContabilidadConstantesFunciones.generarExcelReporteHeaderCobrarConciliacionesCarterasContabilidad(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCobrarConciliacionesCarterasContabilidads(String sAccionBusqueda,String sTipoArchivoReporte,List<CobrarConciliacionesCarterasContabilidad> cobrarconciliacionescarterascontabilidadsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarconciliacionescarterascontabilidad_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CobrarConciliacionesCarterasContabilidads");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidad : cobrarconciliacionescarterascontabilidadsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CobrarConciliacionesCarterasContabilidadConstantesFunciones.getCobrarConciliacionesCarterasContabilidadDescripcion(cobrarconciliacionescarterascontabilidad));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarconciliacionescarterascontabilidad.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_IDCUENTACONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_IDCUENTACONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarconciliacionescarterascontabilidad.getcuentacontable_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_FECHADESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_FECHADESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarconciliacionescarterascontabilidad.getfecha_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_FECHAHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_FECHAHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarconciliacionescarterascontabilidad.getfecha_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarconciliacionescarterascontabilidad.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarconciliacionescarterascontabilidad.getcodigo_tipo_movimiento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_NUMEROMAYOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_NUMEROMAYOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarconciliacionescarterascontabilidad.getnumero_mayor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_DEBITOASIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_DEBITOASIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarconciliacionescarterascontabilidad.getdebito_asiento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CREDITOASIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CREDITOASIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarconciliacionescarterascontabilidad.getcredito_asiento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_DEBITOCUENTAS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_DEBITOCUENTAS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarconciliacionescarterascontabilidad.getdebito_cuentas());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CREDITOCUENTAS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CREDITOCUENTAS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarconciliacionescarterascontabilidad.getcredito_cuentas());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Conciliaciones Carteras Contabilidad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCobrarConciliacionesCarterasContabilidads(String sAccionBusqueda,String sTipoArchivoReporte,List<CobrarConciliacionesCarterasContabilidad> cobrarconciliacionescarterascontabilidadsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<CobrarConciliacionesCarterasContabilidad> cobrarconciliacionescarterascontabilidadsRespaldo=null;
		
		classes=CobrarConciliacionesCarterasContabilidadConstantesFunciones.getClassesRelationshipsOfCobrarConciliacionesCarterasContabilidad(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.cobrarconciliacionescarterascontabilidadLogic.setDatosCliente(this.datosCliente);
		this.cobrarconciliacionescarterascontabilidadLogic.setDatosDeep(this.datosDeep);
		this.cobrarconciliacionescarterascontabilidadLogic.setIsConDeep(true);
		
		cobrarconciliacionescarterascontabilidadsRespaldo=this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads();
		
		this.cobrarconciliacionescarterascontabilidadLogic.setCobrarConciliacionesCarterasContabilidads(cobrarconciliacionescarterascontabilidadsParaReportes);	
		this.cobrarconciliacionescarterascontabilidadLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		cobrarconciliacionescarterascontabilidadsParaReportes=this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads();
		this.cobrarconciliacionescarterascontabilidadLogic.setCobrarConciliacionesCarterasContabilidads(cobrarconciliacionescarterascontabilidadsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarconciliacionescarterascontabilidad_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CobrarConciliacionesCarterasContabilidads");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCobrarConciliacionesCarterasContabilidad("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidad : cobrarconciliacionescarterascontabilidadsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCobrarConciliacionesCarterasContabilidad("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CobrarConciliacionesCarterasContabilidadConstantesFunciones.generarExcelReporteDataCobrarConciliacionesCarterasContabilidad("NORMAL",row,workbook,cobrarconciliacionescarterascontabilidad,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(CobrarConciliacionesCarterasContabilidadConstantesFunciones.getCobrarConciliacionesCarterasContabilidadDescripcion(cobrarconciliacionescarterascontabilidad));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Conciliaciones Carteras Contabilidad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCobrarConciliacionesCarterasContabilidad() throws Exception {		
		this.startProcessCobrarConciliacionesCarterasContabilidad(true);
	}
	
	public void startProcessCobrarConciliacionesCarterasContabilidad(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad ,this.jPanelParametrosReportesCobrarConciliacionesCarterasContabilidad, this.jScrollPanelDatosCobrarConciliacionesCarterasContabilidad,this.jPanelPaginacionCobrarConciliacionesCarterasContabilidad, this.jScrollPanelDatosEdicionCobrarConciliacionesCarterasContabilidad, this.jPanelAccionesCobrarConciliacionesCarterasContabilidad,this.jPanelAccionesFormularioCobrarConciliacionesCarterasContabilidad,this.jmenuBarCobrarConciliacionesCarterasContabilidad,this.jmenuBarDetalleCobrarConciliacionesCarterasContabilidad,this.jTtoolBarCobrarConciliacionesCarterasContabilidad,this.jTtoolBarDetalleCobrarConciliacionesCarterasContabilidad);		
		
		final JTabbedPane jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad=this.jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad; 
		
		final JPanel jPanelParametrosReportesCobrarConciliacionesCarterasContabilidad=this.jPanelParametrosReportesCobrarConciliacionesCarterasContabilidad;
		//final JScrollPane jScrollPanelDatosCobrarConciliacionesCarterasContabilidad=this.jScrollPanelDatosCobrarConciliacionesCarterasContabilidad;
		final JTable jTableDatosCobrarConciliacionesCarterasContabilidad=this.jTableDatosCobrarConciliacionesCarterasContabilidad;		
		final JPanel jPanelPaginacionCobrarConciliacionesCarterasContabilidad=this.jPanelPaginacionCobrarConciliacionesCarterasContabilidad;
		//final JScrollPane jScrollPanelDatosEdicionCobrarConciliacionesCarterasContabilidad=this.jScrollPanelDatosEdicionCobrarConciliacionesCarterasContabilidad;
		final JPanel jPanelAccionesCobrarConciliacionesCarterasContabilidad=this.jPanelAccionesCobrarConciliacionesCarterasContabilidad;
		
		JPanel jPanelCamposAuxiliarCobrarConciliacionesCarterasContabilidad=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCobrarConciliacionesCarterasContabilidad=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) {
			jPanelCamposAuxiliarCobrarConciliacionesCarterasContabilidad=this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jPanelCamposCobrarConciliacionesCarterasContabilidad;
			jPanelAccionesFormularioAuxiliarCobrarConciliacionesCarterasContabilidad=this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jPanelAccionesFormularioCobrarConciliacionesCarterasContabilidad;
		}
		
		final JPanel jPanelCamposCobrarConciliacionesCarterasContabilidad=jPanelCamposAuxiliarCobrarConciliacionesCarterasContabilidad;
		final JPanel jPanelAccionesFormularioCobrarConciliacionesCarterasContabilidad=jPanelAccionesFormularioAuxiliarCobrarConciliacionesCarterasContabilidad;
		
		
		final JMenuBar jmenuBarCobrarConciliacionesCarterasContabilidad=this.jmenuBarCobrarConciliacionesCarterasContabilidad;
		final JToolBar jTtoolBarCobrarConciliacionesCarterasContabilidad=this.jTtoolBarCobrarConciliacionesCarterasContabilidad;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCobrarConciliacionesCarterasContabilidad=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCobrarConciliacionesCarterasContabilidad=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) {
			jmenuBarDetalleAuxiliarCobrarConciliacionesCarterasContabilidad=this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jmenuBarDetalleCobrarConciliacionesCarterasContabilidad;
			jTtoolBarDetalleAuxiliarCobrarConciliacionesCarterasContabilidad=this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTtoolBarDetalleCobrarConciliacionesCarterasContabilidad;
		}
		
		final JMenuBar jmenuBarDetalleCobrarConciliacionesCarterasContabilidad=jmenuBarDetalleAuxiliarCobrarConciliacionesCarterasContabilidad;
		final JToolBar jTtoolBarDetalleCobrarConciliacionesCarterasContabilidad=jTtoolBarDetalleAuxiliarCobrarConciliacionesCarterasContabilidad;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCobrarConciliacionesCarterasContabilidad;
			processRunnable.jTableDatos=jTableDatosCobrarConciliacionesCarterasContabilidad;
			processRunnable.jPanelCampos=jPanelCamposCobrarConciliacionesCarterasContabilidad;
			processRunnable.jPanelPaginacion=jPanelPaginacionCobrarConciliacionesCarterasContabilidad;
			processRunnable.jPanelAcciones=jPanelAccionesCobrarConciliacionesCarterasContabilidad;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCobrarConciliacionesCarterasContabilidad;
			
			
			processRunnable.jmenuBar=jmenuBarCobrarConciliacionesCarterasContabilidad;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCobrarConciliacionesCarterasContabilidad;
			processRunnable.jTtoolBar=jTtoolBarCobrarConciliacionesCarterasContabilidad;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCobrarConciliacionesCarterasContabilidad;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad ,jPanelParametrosReportesCobrarConciliacionesCarterasContabilidad,jTableDatosCobrarConciliacionesCarterasContabilidad, /*jScrollPanelDatosCobrarConciliacionesCarterasContabilidad,*/jPanelCamposCobrarConciliacionesCarterasContabilidad,jPanelPaginacionCobrarConciliacionesCarterasContabilidad, /*jScrollPanelDatosEdicionCobrarConciliacionesCarterasContabilidad,*/ jPanelAccionesCobrarConciliacionesCarterasContabilidad,jPanelAccionesFormularioCobrarConciliacionesCarterasContabilidad,jmenuBarCobrarConciliacionesCarterasContabilidad,jmenuBarDetalleCobrarConciliacionesCarterasContabilidad,jTtoolBarCobrarConciliacionesCarterasContabilidad,jTtoolBarDetalleCobrarConciliacionesCarterasContabilidad);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad ,jPanelParametrosReportesCobrarConciliacionesCarterasContabilidad, jScrollPanelDatosCobrarConciliacionesCarterasContabilidad,jPanelPaginacionCobrarConciliacionesCarterasContabilidad, jScrollPanelDatosEdicionCobrarConciliacionesCarterasContabilidad, jPanelAccionesCobrarConciliacionesCarterasContabilidad,jPanelAccionesFormularioCobrarConciliacionesCarterasContabilidad,jmenuBarCobrarConciliacionesCarterasContabilidad,jmenuBarDetalleCobrarConciliacionesCarterasContabilidad,jTtoolBarCobrarConciliacionesCarterasContabilidad,jTtoolBarDetalleCobrarConciliacionesCarterasContabilidad);
						
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
	
	public void finishProcessCobrarConciliacionesCarterasContabilidad() {// throws Exception 
		this.finishProcessCobrarConciliacionesCarterasContabilidad(true);
	}
	
	public void finishProcessCobrarConciliacionesCarterasContabilidad(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad ,this.jPanelParametrosReportesCobrarConciliacionesCarterasContabilidad, this.jScrollPanelDatosCobrarConciliacionesCarterasContabilidad,this.jPanelPaginacionCobrarConciliacionesCarterasContabilidad, this.jScrollPanelDatosEdicionCobrarConciliacionesCarterasContabilidad, this.jPanelAccionesCobrarConciliacionesCarterasContabilidad,this.jPanelAccionesFormularioCobrarConciliacionesCarterasContabilidad,this.jmenuBarCobrarConciliacionesCarterasContabilidad,this.jmenuBarDetalleCobrarConciliacionesCarterasContabilidad,this.jTtoolBarCobrarConciliacionesCarterasContabilidad,this.jTtoolBarDetalleCobrarConciliacionesCarterasContabilidad);		
		
		final JTabbedPane jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad=this.jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad; 
		
		final JPanel jPanelParametrosReportesCobrarConciliacionesCarterasContabilidad=this.jPanelParametrosReportesCobrarConciliacionesCarterasContabilidad;
		//final JScrollPane jScrollPanelDatosCobrarConciliacionesCarterasContabilidad=this.jScrollPanelDatosCobrarConciliacionesCarterasContabilidad;
		final JTable jTableDatosCobrarConciliacionesCarterasContabilidad=this.jTableDatosCobrarConciliacionesCarterasContabilidad;		
		final JPanel jPanelPaginacionCobrarConciliacionesCarterasContabilidad=this.jPanelPaginacionCobrarConciliacionesCarterasContabilidad;
		//final JScrollPane jScrollPanelDatosEdicionCobrarConciliacionesCarterasContabilidad=this.jScrollPanelDatosEdicionCobrarConciliacionesCarterasContabilidad;
		final JPanel jPanelAccionesCobrarConciliacionesCarterasContabilidad=this.jPanelAccionesCobrarConciliacionesCarterasContabilidad;
		
		JPanel jPanelCamposAuxiliarCobrarConciliacionesCarterasContabilidad=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCobrarConciliacionesCarterasContabilidad=new JPanel();
		
		if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) {
			jPanelCamposAuxiliarCobrarConciliacionesCarterasContabilidad=this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jPanelCamposCobrarConciliacionesCarterasContabilidad;
			jPanelAccionesFormularioAuxiliarCobrarConciliacionesCarterasContabilidad=this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jPanelAccionesFormularioCobrarConciliacionesCarterasContabilidad;
		}
		
		final JPanel jPanelCamposCobrarConciliacionesCarterasContabilidad=jPanelCamposAuxiliarCobrarConciliacionesCarterasContabilidad;
		final JPanel jPanelAccionesFormularioCobrarConciliacionesCarterasContabilidad=jPanelAccionesFormularioAuxiliarCobrarConciliacionesCarterasContabilidad;
		
		
		final JMenuBar jmenuBarCobrarConciliacionesCarterasContabilidad=this.jmenuBarCobrarConciliacionesCarterasContabilidad;		
		final JToolBar jTtoolBarCobrarConciliacionesCarterasContabilidad=this.jTtoolBarCobrarConciliacionesCarterasContabilidad;
				
		JMenuBar jmenuBarDetalleAuxiliarCobrarConciliacionesCarterasContabilidad=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCobrarConciliacionesCarterasContabilidad=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) {
			jmenuBarDetalleAuxiliarCobrarConciliacionesCarterasContabilidad=this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jmenuBarDetalleCobrarConciliacionesCarterasContabilidad;
			jTtoolBarDetalleAuxiliarCobrarConciliacionesCarterasContabilidad=this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTtoolBarDetalleCobrarConciliacionesCarterasContabilidad;		
		}
		
		final JMenuBar jmenuBarDetalleCobrarConciliacionesCarterasContabilidad=jmenuBarDetalleAuxiliarCobrarConciliacionesCarterasContabilidad;
		final JToolBar jTtoolBarDetalleCobrarConciliacionesCarterasContabilidad=jTtoolBarDetalleAuxiliarCobrarConciliacionesCarterasContabilidad;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCobrarConciliacionesCarterasContabilidad;
			processRunnable.jTableDatos=jTableDatosCobrarConciliacionesCarterasContabilidad;
			processRunnable.jPanelCampos=jPanelCamposCobrarConciliacionesCarterasContabilidad;
			processRunnable.jPanelPaginacion=jPanelPaginacionCobrarConciliacionesCarterasContabilidad;
			processRunnable.jPanelAcciones=jPanelAccionesCobrarConciliacionesCarterasContabilidad;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCobrarConciliacionesCarterasContabilidad;
			
			
			processRunnable.jmenuBar=jmenuBarCobrarConciliacionesCarterasContabilidad;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCobrarConciliacionesCarterasContabilidad;
			processRunnable.jTtoolBar=jTtoolBarCobrarConciliacionesCarterasContabilidad;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCobrarConciliacionesCarterasContabilidad;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad ,jPanelParametrosReportesCobrarConciliacionesCarterasContabilidad, jTableDatosCobrarConciliacionesCarterasContabilidad,/*jScrollPanelDatosCobrarConciliacionesCarterasContabilidad,*/jPanelCamposCobrarConciliacionesCarterasContabilidad,jPanelPaginacionCobrarConciliacionesCarterasContabilidad, /*jScrollPanelDatosEdicionCobrarConciliacionesCarterasContabilidad,*/ jPanelAccionesCobrarConciliacionesCarterasContabilidad,jPanelAccionesFormularioCobrarConciliacionesCarterasContabilidad,jmenuBarCobrarConciliacionesCarterasContabilidad,jmenuBarDetalleCobrarConciliacionesCarterasContabilidad,jTtoolBarCobrarConciliacionesCarterasContabilidad,jTtoolBarDetalleCobrarConciliacionesCarterasContabilidad));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCobrarConciliacionesCarterasContabilidad(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCobrarConciliacionesCarterasContabilidad(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCobrarConciliacionesCarterasContabilidad(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCobrarConciliacionesCarterasContabilidad(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCobrarConciliacionesCarterasContabilidad,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCobrarConciliacionesCarterasContabilidad,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCobrarConciliacionesCarterasContabilidad(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCobrarConciliacionesCarterasContabilidad,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCobrarConciliacionesCarterasContabilidad,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.cobrarconciliacionescarterascontabilidadConstantesFunciones.getsFinalQueryCobrarConciliacionesCarterasContabilidad();
		String  finalQueryPaginacionTodos=this.cobrarconciliacionescarterascontabilidadConstantesFunciones.getsFinalQueryCobrarConciliacionesCarterasContabilidad();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=CobrarConciliacionesCarterasContabilidadConstantesFunciones.getArrayColumnasGlobalesNoCobrarConciliacionesCarterasContabilidad(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CobrarConciliacionesCarterasContabilidadConstantesFunciones.getArrayColumnasGlobalesCobrarConciliacionesCarterasContabilidad(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CobrarConciliacionesCarterasContabilidadConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.cobrarconciliacionescarterascontabilidadsEliminados= new ArrayList<CobrarConciliacionesCarterasContabilidad>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCobrarConciliacionesCarterasContabilidad();
		
				///*CobrarConciliacionesCarterasContabilidadSessionBean*/this.cobrarconciliacionescarterascontabilidadSessionBean=new CobrarConciliacionesCarterasContabilidadSessionBean();
			
			if(this.cobrarconciliacionescarterascontabilidadSessionBean==null) {
				this.cobrarconciliacionescarterascontabilidadSessionBean=new CobrarConciliacionesCarterasContabilidadSessionBean();
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
					this.iNumeroPaginacion=CobrarConciliacionesCarterasContabilidadConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CobrarConciliacionesCarterasContabilidadConstantesFunciones.getClassesForeignKeysOfCobrarConciliacionesCarterasContabilidad(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/cobrarconciliacionescarterascontabilidad."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			cobrarconciliacionescarterascontabilidadsAux= new ArrayList<CobrarConciliacionesCarterasContabilidad>();
			
				
			cobrarconciliacionescarterascontabilidadLogic.setDatosCliente(this.datosCliente);
			cobrarconciliacionescarterascontabilidadLogic.setDatosDeep(this.datosDeep);
			cobrarconciliacionescarterascontabilidadLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaCobrarConciliacionesCarterasContabilidad")) {
				this.sDetalleReporte=CobrarConciliacionesCarterasContabilidadConstantesFunciones.getDetalleIndiceBusquedaCobrarConciliacionesCarterasContabilidad(id_cuenta_contableBusquedaCobrarConciliacionesCarterasContabilidad,fecha_desdeBusquedaCobrarConciliacionesCarterasContabilidad,fecha_hastaBusquedaCobrarConciliacionesCarterasContabilidad);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidadsBusquedaCobrarConciliacionesCarterasContabilidad(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_cuenta_contableBusquedaCobrarConciliacionesCarterasContabilidad,fecha_desdeBusquedaCobrarConciliacionesCarterasContabilidad,fecha_hastaBusquedaCobrarConciliacionesCarterasContabilidad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CobrarConciliacionesCarterasContabilidadConstantesFunciones.getDetalleIndiceBusquedaCobrarConciliacionesCarterasContabilidad(id_cuenta_contableBusquedaCobrarConciliacionesCarterasContabilidad,fecha_desdeBusquedaCobrarConciliacionesCarterasContabilidad,fecha_hastaBusquedaCobrarConciliacionesCarterasContabilidad);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CobrarConciliacionesCarterasContabilidadConstantesFunciones.getDetalleIndiceBusquedaCobrarConciliacionesCarterasContabilidad(id_cuenta_contableBusquedaCobrarConciliacionesCarterasContabilidad,fecha_desdeBusquedaCobrarConciliacionesCarterasContabilidad,fecha_hastaBusquedaCobrarConciliacionesCarterasContabilidad);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads()==null||cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cobrarconciliacionescarterascontabilidads==null|| cobrarconciliacionescarterascontabilidads.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrarconciliacionescarterascontabilidadsAux=new ArrayList<CobrarConciliacionesCarterasContabilidad>();
						cobrarconciliacionescarterascontabilidadsAux.addAll(cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cobrarconciliacionescarterascontabilidadsAux=new ArrayList<CobrarConciliacionesCarterasContabilidad>();
							cobrarconciliacionescarterascontabilidadsAux.addAll(cobrarconciliacionescarterascontabilidads);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidadsBusquedaCobrarConciliacionesCarterasContabilidad(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_cuenta_contableBusquedaCobrarConciliacionesCarterasContabilidad,fecha_desdeBusquedaCobrarConciliacionesCarterasContabilidad,fecha_hastaBusquedaCobrarConciliacionesCarterasContabilidad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CobrarConciliacionesCarterasContabilidadConstantesFunciones.getDetalleIndiceBusquedaCobrarConciliacionesCarterasContabilidad(id_cuenta_contableBusquedaCobrarConciliacionesCarterasContabilidad,fecha_desdeBusquedaCobrarConciliacionesCarterasContabilidad,fecha_hastaBusquedaCobrarConciliacionesCarterasContabilidad);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CobrarConciliacionesCarterasContabilidadConstantesFunciones.getDetalleIndiceBusquedaCobrarConciliacionesCarterasContabilidad(id_cuenta_contableBusquedaCobrarConciliacionesCarterasContabilidad,fecha_desdeBusquedaCobrarConciliacionesCarterasContabilidad,fecha_hastaBusquedaCobrarConciliacionesCarterasContabilidad);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCobrarConciliacionesCarterasContabilidads("BusquedaCobrarConciliacionesCarterasContabilidad",cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCobrarConciliacionesCarterasContabilidads("BusquedaCobrarConciliacionesCarterasContabilidad",cobrarconciliacionescarterascontabilidads);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrarconciliacionescarterascontabilidadLogic.setCobrarConciliacionesCarterasContabilidads(new ArrayList<CobrarConciliacionesCarterasContabilidad>());
						cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads().addAll(cobrarconciliacionescarterascontabilidadsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cobrarconciliacionescarterascontabilidads=new ArrayList<CobrarConciliacionesCarterasContabilidad>();
							cobrarconciliacionescarterascontabilidads.addAll(cobrarconciliacionescarterascontabilidadsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCobrarConciliacionesCarterasContabilidad();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCobrarConciliacionesCarterasContabilidad();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cobrarconciliacionescarterascontabilidads.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cobrarconciliacionescarterascontabilidads.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidad) {
		Boolean permite=true;
		
		if(this.cobrarconciliacionescarterascontabilidad.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CobrarConciliacionesCarterasContabilidadConstantesFunciones.getOrderByListaCobrarConciliacionesCarterasContabilidad();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CobrarConciliacionesCarterasContabilidadConstantesFunciones.getOrderByListaCobrarConciliacionesCarterasContabilidad();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidad:cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads()) {
				if(cobrarconciliacionescarterascontabilidad.getsType().equals(Constantes2.S_TOTALES)) {
					cobrarconciliacionescarterascontabilidadTotales=cobrarconciliacionescarterascontabilidad;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidad:this.cobrarconciliacionescarterascontabilidads) {
				if(cobrarconciliacionescarterascontabilidad.getsType().equals(Constantes2.S_TOTALES)) {
					cobrarconciliacionescarterascontabilidadTotales=cobrarconciliacionescarterascontabilidad;
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
			this.cobrarconciliacionescarterascontabilidadAux=new CobrarConciliacionesCarterasContabilidad();
			this.cobrarconciliacionescarterascontabilidadAux.setsType(Constantes2.S_TOTALES);
			this.cobrarconciliacionescarterascontabilidadAux.setIsNew(false);
			this.cobrarconciliacionescarterascontabilidadAux.setIsChanged(false);
			this.cobrarconciliacionescarterascontabilidadAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//CobrarConciliacionesCarterasContabilidadConstantesFunciones.TotalizarValoresFilaCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads(),this.cobrarconciliacionescarterascontabilidadAux);
				
				//this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads().add(this.cobrarconciliacionescarterascontabilidadAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CobrarConciliacionesCarterasContabilidadConstantesFunciones.TotalizarValoresFilaCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidads,this.cobrarconciliacionescarterascontabilidadAux);
				
				this.cobrarconciliacionescarterascontabilidads.add(this.cobrarconciliacionescarterascontabilidadAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		cobrarconciliacionescarterascontabilidadTotales=new CobrarConciliacionesCarterasContabilidad();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads().remove(cobrarconciliacionescarterascontabilidadTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cobrarconciliacionescarterascontabilidads.remove(cobrarconciliacionescarterascontabilidadTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		cobrarconciliacionescarterascontabilidadTotales=new CobrarConciliacionesCarterasContabilidad();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidad:cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads()) {
				if(cobrarconciliacionescarterascontabilidad.getsType().equals(Constantes2.S_TOTALES)) {
					cobrarconciliacionescarterascontabilidadTotales=cobrarconciliacionescarterascontabilidad;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CobrarConciliacionesCarterasContabilidadConstantesFunciones.TotalizarValoresFilaCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads(),cobrarconciliacionescarterascontabilidadTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidad:this.cobrarconciliacionescarterascontabilidads) {
				if(cobrarconciliacionescarterascontabilidad.getsType().equals(Constantes2.S_TOTALES)) {
					cobrarconciliacionescarterascontabilidadTotales=cobrarconciliacionescarterascontabilidad;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CobrarConciliacionesCarterasContabilidadConstantesFunciones.TotalizarValoresFilaCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidads,cobrarconciliacionescarterascontabilidadTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getCobrarConciliacionesCarterasContabilidadsBusquedaCobrarConciliacionesCarterasContabilidad()throws Exception {
		try {
			sAccionBusqueda="BusquedaCobrarConciliacionesCarterasContabilidad";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCobrarConciliacionesCarterasContabilidadsFK_IdCuentaContable()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaContable";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCobrarConciliacionesCarterasContabilidadsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getCobrarConciliacionesCarterasContabilidadsBusquedaCobrarConciliacionesCarterasContabilidad(String sFinalQuery,Long id_cuenta_contable,Date fecha_desde,Date fecha_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidadsBusquedaCobrarConciliacionesCarterasContabilidad(sFinalQuery,this.pagination,id_cuenta_contable,fecha_desde,fecha_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCobrarConciliacionesCarterasContabilidadsFK_IdCuentaContable(String sFinalQuery,Long id_cuenta_contable)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidadsFK_IdCuentaContable(sFinalQuery,this.pagination,id_cuenta_contable);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCobrarConciliacionesCarterasContabilidadsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidadsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosCobrarConciliacionesCarterasContabilidad() {
		this.isPermisoTodoCobrarConciliacionesCarterasContabilidad=false;
		this.isPermisoNuevoCobrarConciliacionesCarterasContabilidad=false;
		this.isPermisoActualizarCobrarConciliacionesCarterasContabilidad=false;
		this.isPermisoActualizarOriginalCobrarConciliacionesCarterasContabilidad=false;
		this.isPermisoEliminarCobrarConciliacionesCarterasContabilidad=false;
		this.isPermisoGuardarCambiosCobrarConciliacionesCarterasContabilidad=false;
		this.isPermisoConsultaCobrarConciliacionesCarterasContabilidad=true;
		this.isPermisoBusquedaCobrarConciliacionesCarterasContabilidad=true;
		this.isPermisoReporteCobrarConciliacionesCarterasContabilidad=true;
		this.isPermisoOrdenCobrarConciliacionesCarterasContabilidad=false;		
		this.isPermisoPaginacionMedioCobrarConciliacionesCarterasContabilidad=false;		
		this.isPermisoPaginacionAltoCobrarConciliacionesCarterasContabilidad=false;		
		this.isPermisoPaginacionTodoCobrarConciliacionesCarterasContabilidad=false;		
		this.isPermisoCopiarCobrarConciliacionesCarterasContabilidad=false;		
		this.isPermisoVerFormCobrarConciliacionesCarterasContabilidad=false;		
		this.isPermisoDuplicarCobrarConciliacionesCarterasContabilidad=false;
		this.isPermisoOrdenCobrarConciliacionesCarterasContabilidad=false;
	}
	
	public void setPermisosUsuarioCobrarConciliacionesCarterasContabilidad(Boolean isPermiso) {
		this.isPermisoTodoCobrarConciliacionesCarterasContabilidad=isPermiso;
		this.isPermisoNuevoCobrarConciliacionesCarterasContabilidad=isPermiso;
		this.isPermisoActualizarCobrarConciliacionesCarterasContabilidad=isPermiso;
		this.isPermisoActualizarOriginalCobrarConciliacionesCarterasContabilidad=isPermiso;
		this.isPermisoEliminarCobrarConciliacionesCarterasContabilidad=isPermiso;
		this.isPermisoGuardarCambiosCobrarConciliacionesCarterasContabilidad=isPermiso;
		this.isPermisoConsultaCobrarConciliacionesCarterasContabilidad=isPermiso;
		this.isPermisoBusquedaCobrarConciliacionesCarterasContabilidad=isPermiso;
		this.isPermisoReporteCobrarConciliacionesCarterasContabilidad=isPermiso;
		this.isPermisoOrdenCobrarConciliacionesCarterasContabilidad=isPermiso;		
		this.isPermisoPaginacionMedioCobrarConciliacionesCarterasContabilidad=isPermiso;		
		this.isPermisoPaginacionAltoCobrarConciliacionesCarterasContabilidad=isPermiso;		
		this.isPermisoPaginacionTodoCobrarConciliacionesCarterasContabilidad=isPermiso;		
		this.isPermisoCopiarCobrarConciliacionesCarterasContabilidad=isPermiso;		
		this.isPermisoVerFormCobrarConciliacionesCarterasContabilidad=isPermiso;		
		this.isPermisoDuplicarCobrarConciliacionesCarterasContabilidad=isPermiso;
		this.isPermisoOrdenCobrarConciliacionesCarterasContabilidad=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCobrarConciliacionesCarterasContabilidad(Boolean isPermiso) {
		//this.isPermisoTodoCobrarConciliacionesCarterasContabilidad=isPermiso;
		this.isPermisoNuevoCobrarConciliacionesCarterasContabilidad=isPermiso;
		this.isPermisoActualizarCobrarConciliacionesCarterasContabilidad=isPermiso;
		this.isPermisoActualizarOriginalCobrarConciliacionesCarterasContabilidad=isPermiso;
		this.isPermisoEliminarCobrarConciliacionesCarterasContabilidad=isPermiso;
		this.isPermisoGuardarCambiosCobrarConciliacionesCarterasContabilidad=isPermiso;
		//this.isPermisoConsultaCobrarConciliacionesCarterasContabilidad=isPermiso;
		//this.isPermisoBusquedaCobrarConciliacionesCarterasContabilidad=isPermiso;
		//this.isPermisoReporteCobrarConciliacionesCarterasContabilidad=isPermiso;
		//this.isPermisoOrdenCobrarConciliacionesCarterasContabilidad=isPermiso;		
		//this.isPermisoPaginacionMedioCobrarConciliacionesCarterasContabilidad=isPermiso;		
		//this.isPermisoPaginacionAltoCobrarConciliacionesCarterasContabilidad=isPermiso;		
		//this.isPermisoPaginacionTodoCobrarConciliacionesCarterasContabilidad=isPermiso;		
		//this.isPermisoCopiarCobrarConciliacionesCarterasContabilidad=isPermiso;		
		//this.isPermisoDuplicarCobrarConciliacionesCarterasContabilidad=isPermiso;
		//this.isPermisoOrdenCobrarConciliacionesCarterasContabilidad=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCobrarConciliacionesCarterasContabilidadClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(CobrarConciliacionesCarterasContabilidadJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebCobrarConciliacionesCarterasContabilidad(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCobrarConciliacionesCarterasContabilidadClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioCobrarConciliacionesCarterasContabilidadClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCobrarConciliacionesCarterasContabilidadClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCobrarConciliacionesCarterasContabilidadClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioCobrarConciliacionesCarterasContabilidad() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CobrarConciliacionesCarterasContabilidadJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CobrarConciliacionesCarterasContabilidadConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCobrarConciliacionesCarterasContabilidad=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCobrarConciliacionesCarterasContabilidad=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCobrarConciliacionesCarterasContabilidad=this.isPermisoActualizarCobrarConciliacionesCarterasContabilidad;
			this.isPermisoEliminarCobrarConciliacionesCarterasContabilidad=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCobrarConciliacionesCarterasContabilidad=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCobrarConciliacionesCarterasContabilidad=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCobrarConciliacionesCarterasContabilidad=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCobrarConciliacionesCarterasContabilidad=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCobrarConciliacionesCarterasContabilidad=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCobrarConciliacionesCarterasContabilidad=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCobrarConciliacionesCarterasContabilidad=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCobrarConciliacionesCarterasContabilidad=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCobrarConciliacionesCarterasContabilidad=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCobrarConciliacionesCarterasContabilidad=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCobrarConciliacionesCarterasContabilidad=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCobrarConciliacionesCarterasContabilidad=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCobrarConciliacionesCarterasContabilidad=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCobrarConciliacionesCarterasContabilidad.setToolTipText(this.jTableDatosCobrarConciliacionesCarterasContabilidad.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCobrarConciliacionesCarterasContabilidad(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCobrarConciliacionesCarterasContabilidad(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CobrarConciliacionesCarterasContabilidadJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(CobrarConciliacionesCarterasContabilidadJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioCobrarConciliacionesCarterasContabilidad() throws Exception {
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
	public void inicializarCombosForeignKeyCobrarConciliacionesCarterasContabilidadListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.cuentacontablesForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCobrarConciliacionesCarterasContabilidadListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CobrarConciliacionesCarterasContabilidadJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	
	public void addItemDefectoCombosTodosForeignKeyCobrarConciliacionesCarterasContabilidad()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyCuentaContable();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.cobrarconciliacionescarterascontabilidadSessionBean==null) {
				this.cobrarconciliacionescarterascontabilidadSessionBean=new CobrarConciliacionesCarterasContabilidadSessionBean();
			}

			if(!this.cobrarconciliacionescarterascontabilidadSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyCuentaContable()throws Exception {
		try {

			if(!this.cobrarconciliacionescarterascontabilidadSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
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
	
	public void initActionsCombosTodosForeignKeyCobrarConciliacionesCarterasContabilidad()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCobrarConciliacionesCarterasContabilidad(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyCobrarConciliacionesCarterasContabilidad()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCobrarConciliacionesCarterasContabilidad();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCobrarConciliacionesCarterasContabilidad(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidad)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCobrarConciliacionesCarterasContabilidad(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidad,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCobrarConciliacionesCarterasContabilidad()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCobrarConciliacionesCarterasContabilidad()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCobrarConciliacionesCarterasContabilidad()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCobrarConciliacionesCarterasContabilidad()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCobrarConciliacionesCarterasContabilidad()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCobrarConciliacionesCarterasContabilidad()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameCuentaContablesForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCobrarConciliacionesCarterasContabilidad(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCuentaContablesForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCobrarConciliacionesCarterasContabilidad()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jComboBoxid_empresaCobrarConciliacionesCarterasContabilidad!=null && this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jComboBoxid_empresaCobrarConciliacionesCarterasContabilidad.getItemCount()>0) {
				this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jComboBoxid_empresaCobrarConciliacionesCarterasContabilidad.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jComboBoxid_cuenta_contableCobrarConciliacionesCarterasContabilidad!=null && this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jComboBoxid_cuenta_contableCobrarConciliacionesCarterasContabilidad.getItemCount()>0) {
				this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jComboBoxid_cuenta_contableCobrarConciliacionesCarterasContabilidad.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.cobrarconciliacionescarterascontabilidadSessionBean=new CobrarConciliacionesCarterasContabilidadSessionBean(); 
		this.cobrarconciliacionescarterascontabilidadConstantesFunciones=new CobrarConciliacionesCarterasContabilidadConstantesFunciones(); 
		this.cobrarconciliacionescarterascontabilidadBean=new CobrarConciliacionesCarterasContabilidad();//(this.cobrarconciliacionescarterascontabilidadConstantesFunciones); 		
		this.cobrarconciliacionescarterascontabilidadReturnGeneral=new CobrarConciliacionesCarterasContabilidadParameterReturnGeneral(); 
		
		this.cobrarconciliacionescarterascontabilidadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cobrarconciliacionescarterascontabilidadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCobrarConciliacionesCarterasContabilidad(true);
			
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
			
			this.cobrarconciliacionescarterascontabilidadConstantesFunciones=new CobrarConciliacionesCarterasContabilidadConstantesFunciones(); 
			this.cobrarconciliacionescarterascontabilidadBean=new CobrarConciliacionesCarterasContabilidad();//this.cobrarconciliacionescarterascontabilidadConstantesFunciones); 			
			this.cobrarconciliacionescarterascontabilidadReturnGeneral=new CobrarConciliacionesCarterasContabilidadParameterReturnGeneral(); 
		
			CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cobrar Conciliaciones Carteras Contabilidad Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.cobrarconciliacionescarterascontabilidad=new CobrarConciliacionesCarterasContabilidad();
			this.cobrarconciliacionescarterascontabilidads = new ArrayList<CobrarConciliacionesCarterasContabilidad>();
			this.cobrarconciliacionescarterascontabilidadsAux = new ArrayList<CobrarConciliacionesCarterasContabilidad>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarconciliacionescarterascontabilidadLogic=new CobrarConciliacionesCarterasContabilidadLogic();
				this.cobrarconciliacionescarterascontabilidadLogic.getNewConnexionToDeep("");
			}
			
			//this.cobrarconciliacionescarterascontabilidadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.cobrarconciliacionescarterascontabilidadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad);	
					}
					
					if(this.jInternalFrameImportacionCobrarConciliacionesCarterasContabilidad!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCobrarConciliacionesCarterasContabilidad);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCobrarConciliacionesCarterasContabilidad!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCobrarConciliacionesCarterasContabilidad);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad);
				this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.setVisible(false);
				this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad);
					this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.setVisible(false);
					this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCobrarConciliacionesCarterasContabilidad!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCobrarConciliacionesCarterasContabilidad);
					this.jInternalFrameImportacionCobrarConciliacionesCarterasContabilidad.setVisible(false);
					this.jInternalFrameImportacionCobrarConciliacionesCarterasContabilidad.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCobrarConciliacionesCarterasContabilidad!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCobrarConciliacionesCarterasContabilidad);
					this.jInternalFrameOrderByCobrarConciliacionesCarterasContabilidad.setVisible(false);
					this.jInternalFrameOrderByCobrarConciliacionesCarterasContabilidad.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCobrarConciliacionesCarterasContabilidadActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CobrarConciliacionesCarterasContabilidadConstantesFunciones.INUMEROPAGINACION;
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
			
			this.cobrarconciliacionescarterascontabilidadReturnGeneral=new CobrarConciliacionesCarterasContabilidadParameterReturnGeneral();
			
			this.cobrarconciliacionescarterascontabilidadParameterGeneral=new CobrarConciliacionesCarterasContabilidadParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.cobrarconciliacionescarterascontabilidadLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado()) {
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
			
			if(CobrarConciliacionesCarterasContabilidadJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CobrarConciliacionesCarterasContabilidadConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado(),this.cobrarconciliacionescarterascontabilidadSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CobrarConciliacionesCarterasContabilidadConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado(),this.cobrarconciliacionescarterascontabilidadSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoCobrarConciliacionesCarterasContabilidad=false;
			this.isVisibilidadCeldaDuplicarCobrarConciliacionesCarterasContabilidad=true;
			this.isVisibilidadCeldaCopiarCobrarConciliacionesCarterasContabilidad=true;
			this.isVisibilidadCeldaVerFormCobrarConciliacionesCarterasContabilidad=true;
			this.isVisibilidadCeldaOrdenCobrarConciliacionesCarterasContabilidad=true;
			this.isVisibilidadCeldaNuevoRelacionesCobrarConciliacionesCarterasContabilidad=false;
			this.isVisibilidadCeldaModificarCobrarConciliacionesCarterasContabilidad=false;
			this.isVisibilidadCeldaActualizarCobrarConciliacionesCarterasContabilidad=false;
			this.isVisibilidadCeldaEliminarCobrarConciliacionesCarterasContabilidad=false;
			this.isVisibilidadCeldaCancelarCobrarConciliacionesCarterasContabilidad=false;
			this.isVisibilidadCeldaGuardarCobrarConciliacionesCarterasContabilidad=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarConciliacionesCarterasContabilidad=false;
			
			
			this.isVisibilidadBusquedaCobrarConciliacionesCarterasContabilidad=true;
			this.isVisibilidadFK_IdCuentaContable=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCobrarConciliacionesCarterasContabilidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCobrarConciliacionesCarterasContabilidad();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCobrarConciliacionesCarterasContabilidad(false);
			
			this.setPermisosUsuarioCobrarConciliacionesCarterasContabilidad();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado() 
				|| (this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado() && this.cobrarconciliacionescarterascontabilidadSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCobrarConciliacionesCarterasContabilidadClasesRelacionadas();
			}
			
			if(this.cobrarconciliacionescarterascontabilidadSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCobrarConciliacionesCarterasContabilidadClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CobrarConciliacionesCarterasContabilidadJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCobrarConciliacionesCarterasContabilidad();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCobrarConciliacionesCarterasContabilidad();
			}
			
			if(!this.isPermisoBusquedaCobrarConciliacionesCarterasContabilidad) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CobrarConciliacionesCarterasContabilidadConstantesFunciones.getTiposSeleccionarCobrarConciliacionesCarterasContabilidad());
				
				this.tiposColumnasSelect=CobrarConciliacionesCarterasContabilidadConstantesFunciones.getTiposSeleccionarCobrarConciliacionesCarterasContabilidad(true);
				
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
			//if(!this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCobrarConciliacionesCarterasContabilidad();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioCobrarConciliacionesCarterasContabilidad(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioCobrarConciliacionesCarterasContabilidad(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCobrarConciliacionesCarterasContabilidad() ;
			
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
				cobrarconciliacionescarterascontabilidadImplementable= (CobrarConciliacionesCarterasContabilidadImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CobrarConciliacionesCarterasContabilidadConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				cobrarconciliacionescarterascontabilidadImplementableHome= (CobrarConciliacionesCarterasContabilidadImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CobrarConciliacionesCarterasContabilidadConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.cobrarconciliacionescarterascontabilidads= new ArrayList<CobrarConciliacionesCarterasContabilidad>();
			this.cobrarconciliacionescarterascontabilidadsEliminados= new ArrayList<CobrarConciliacionesCarterasContabilidad>();
						
			this.isEsNuevoCobrarConciliacionesCarterasContabilidad=false;
			this.esParaAccionDesdeFormularioCobrarConciliacionesCarterasContabilidad=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.cuentacontablesForeignKey=new ArrayList<CuentaContable>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCobrarConciliacionesCarterasContabilidad(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCobrarConciliacionesCarterasContabilidad();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CobrarConciliacionesCarterasContabilidadConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCobrarConciliacionesCarterasContabilidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCobrarConciliacionesCarterasContabilidad(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCobrarConciliacionesCarterasContabilidad();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCobrarConciliacionesCarterasContabilidad();
			}
			
			CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad.getTabCount(); i++) {
					this.jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarconciliacionescarterascontabilidadLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCobrarConciliacionesCarterasContabilidad(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga CobrarConciliacionesCarterasContabilidad: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarconciliacionescarterascontabilidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarconciliacionescarterascontabilidadLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCobrarConciliacionesCarterasContabilidad() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesCobrarConciliacionesCarterasContabilidad")) {
				iIndex=this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTabbedPaneRelacionesCobrarConciliacionesCarterasContabilidad.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTabbedPaneRelacionesCobrarConciliacionesCarterasContabilidad.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCobrarConciliacionesCarterasContabilidad.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCobrarConciliacionesCarterasContabilidad();	
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
	
	public void cargarCombosForeignKeyCobrarConciliacionesCarterasContabilidad(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCobrarConciliacionesCarterasContabilidad(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCobrarConciliacionesCarterasContabilidad(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCobrarConciliacionesCarterasContabilidadListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCobrarConciliacionesCarterasContabilidad();
		
		this.cargarCombosFrameForeignKeyCobrarConciliacionesCarterasContabilidad();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCobrarConciliacionesCarterasContabilidad();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCobrarConciliacionesCarterasContabilidad();
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
	
	public void jButtonNuevoCobrarConciliacionesCarterasContabilidadActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.cobrarconciliacionescarterascontabilidadSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cobrarconciliacionescarterascontabilidad,new Object(),this.cobrarconciliacionescarterascontabilidadParameterGeneral,this.cobrarconciliacionescarterascontabilidadReturnGeneral);
			
			
			if(jTableDatosCobrarConciliacionesCarterasContabilidad.getRowCount()>=1) {
				jTableDatosCobrarConciliacionesCarterasContabilidad.removeRowSelectionInterval(0, jTableDatosCobrarConciliacionesCarterasContabilidad.getRowCount()-1);						
			}
			
			this.isEsNuevoCobrarConciliacionesCarterasContabilidad=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCobrarConciliacionesCarterasContabilidad(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCobrarConciliacionesCarterasContabilidad(true);			
			//this.cobrarconciliacionescarterascontabilidad=new CobrarConciliacionesCarterasContabilidad();
			//this.cobrarconciliacionescarterascontabilidad.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCobrarConciliacionesCarterasContabilidad(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarConciliacionesCarterasContabilidad() ;
			
			if(CobrarConciliacionesCarterasContabilidadJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCobrarConciliacionesCarterasContabilidad(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.cobrarconciliacionescarterascontabilidad);	
			this.actualizarInformacion("INFO_PADRE",false,this.cobrarconciliacionescarterascontabilidad);				
			
			CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cobrarconciliacionescarterascontabilidad,new Object(),this.cobrarconciliacionescarterascontabilidadParameterGeneral,this.cobrarconciliacionescarterascontabilidadReturnGeneral);
			
			if(this.cobrarconciliacionescarterascontabilidadSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar CobrarConciliacionesCarterasContabilidad: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.cobrarconciliacionescarterascontabilidad,new Object(),this.cobrarconciliacionescarterascontabilidadParameterGeneral,this.cobrarconciliacionescarterascontabilidadReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCobrarConciliacionesCarterasContabilidadActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<CobrarConciliacionesCarterasContabilidad> cobrarconciliacionescarterascontabilidadsSeleccionados=new ArrayList<CobrarConciliacionesCarterasContabilidad>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCobrarConciliacionesCarterasContabilidad.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCobrarConciliacionesCarterasContabilidad.getSelectedRows().length;			
			}
			
			cobrarconciliacionescarterascontabilidadsSeleccionados=this.getCobrarConciliacionesCarterasContabilidadsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCobrarConciliacionesCarterasContabilidad--;			
				//CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidadAux= new CobrarConciliacionesCarterasContabilidad();			
				//cobrarconciliacionescarterascontabilidadAux.setId(this.iIdNuevoCobrarConciliacionesCarterasContabilidad);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidadOrigen=new CobrarConciliacionesCarterasContabilidad();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidadOrigen : cobrarconciliacionescarterascontabilidadsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCobrarConciliacionesCarterasContabilidad.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							cobrarconciliacionescarterascontabilidadOrigen =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads().toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cobrarconciliacionescarterascontabilidadOrigen =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidads.toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCobrarConciliacionesCarterasContabilidad();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.cobrarconciliacionescarterascontabilidad.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCobrarConciliacionesCarterasContabilidad(cobrarconciliacionescarterascontabilidadOrigen,this.cobrarconciliacionescarterascontabilidad,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidad);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads().add(this.cobrarconciliacionescarterascontabilidadAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cobrarconciliacionescarterascontabilidads.add(this.cobrarconciliacionescarterascontabilidadAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCobrarConciliacionesCarterasContabilidad(false);
				
				this.jTableDatosCobrarConciliacionesCarterasContabilidad.setRowSelectionInterval(this.getIndiceNuevoCobrarConciliacionesCarterasContabilidad(), this.getIndiceNuevoCobrarConciliacionesCarterasContabilidad());
				
				int iLastRow =  this.jTableDatosCobrarConciliacionesCarterasContabilidad.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCobrarConciliacionesCarterasContabilidad.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCobrarConciliacionesCarterasContabilidad.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCobrarConciliacionesCarterasContabilidad(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCobrarConciliacionesCarterasContabilidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<CobrarConciliacionesCarterasContabilidad> cobrarconciliacionescarterascontabilidadsSeleccionados=new ArrayList<CobrarConciliacionesCarterasContabilidad>();									
		
			CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidadOrigen=new CobrarConciliacionesCarterasContabilidad();
			CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidadDestino=new CobrarConciliacionesCarterasContabilidad();
				
			cobrarconciliacionescarterascontabilidadsSeleccionados=this.getCobrarConciliacionesCarterasContabilidadsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCobrarConciliacionesCarterasContabilidad.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || cobrarconciliacionescarterascontabilidadsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCobrarConciliacionesCarterasContabilidad.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrarconciliacionescarterascontabilidadOrigen =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads().toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cobrarconciliacionescarterascontabilidadOrigen =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidads.toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrarconciliacionescarterascontabilidadDestino =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads().toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cobrarconciliacionescarterascontabilidadDestino =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidads.toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				cobrarconciliacionescarterascontabilidadOrigen =cobrarconciliacionescarterascontabilidadsSeleccionados.get(0);
				cobrarconciliacionescarterascontabilidadDestino =cobrarconciliacionescarterascontabilidadsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCobrarConciliacionesCarterasContabilidad(cobrarconciliacionescarterascontabilidadOrigen,cobrarconciliacionescarterascontabilidadDestino,true,false);
				
				cobrarconciliacionescarterascontabilidadDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cobrarconciliacionescarterascontabilidadDestino,cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cobrarconciliacionescarterascontabilidadDestino,cobrarconciliacionescarterascontabilidads);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCobrarConciliacionesCarterasContabilidad(false);
				
				//this.jTableDatosCobrarConciliacionesCarterasContabilidad.setRowSelectionInterval(this.getIndiceNuevoCobrarConciliacionesCarterasContabilidad(), this.getIndiceNuevoCobrarConciliacionesCarterasContabilidad());
				
				int iLastRow =  this.jTableDatosCobrarConciliacionesCarterasContabilidad.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCobrarConciliacionesCarterasContabilidad.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCobrarConciliacionesCarterasContabilidad.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCobrarConciliacionesCarterasContabilidad(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCobrarConciliacionesCarterasContabilidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCobrarConciliacionesCarterasContabilidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCobrarConciliacionesCarterasContabilidad.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesCobrarConciliacionesCarterasContabilidad.setVisible(!isVisible);
			this.jPanelPaginacionCobrarConciliacionesCarterasContabilidad.setVisible(!isVisible);
			this.jPanelAccionesCobrarConciliacionesCarterasContabilidad.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCobrarConciliacionesCarterasContabilidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCobrarConciliacionesCarterasContabilidad();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCobrarConciliacionesCarterasContabilidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCobrarConciliacionesCarterasContabilidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCobrarConciliacionesCarterasContabilidad();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCobrarConciliacionesCarterasContabilidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCobrarConciliacionesCarterasContabilidad();
			
			this.abrirFrameOrderByCobrarConciliacionesCarterasContabilidad();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCobrarConciliacionesCarterasContabilidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCobrarConciliacionesCarterasContabilidad();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCobrarConciliacionesCarterasContabilidad(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.isMaximum()) {
					this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.setSize(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.iWidthFormulario,this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.isMaximum()) {
						this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jContentPaneDetalleCobrarConciliacionesCarterasContabilidad.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTabbedPaneRelacionesCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jContentPaneDetalleCobrarConciliacionesCarterasContabilidad.getWidth(),CobrarConciliacionesCarterasContabilidadConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTabbedPaneRelacionesCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jContentPaneDetalleCobrarConciliacionesCarterasContabilidad.getWidth(),CobrarConciliacionesCarterasContabilidadConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTabbedPaneRelacionesCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jContentPaneDetalleCobrarConciliacionesCarterasContabilidad.getWidth(),CobrarConciliacionesCarterasContabilidadConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.setVisible(true);
	        this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCobrarConciliacionesCarterasContabilidad() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCobrarConciliacionesCarterasContabilidad==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCobrarConciliacionesCarterasContabilidad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarConciliacionesCarterasContabilidad,false,this);
				} else {
					this.jInternalFrameOrderByCobrarConciliacionesCarterasContabilidad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarConciliacionesCarterasContabilidad,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCobrarConciliacionesCarterasContabilidad);
				this.jInternalFrameOrderByCobrarConciliacionesCarterasContabilidad.setVisible(false);
				this.jInternalFrameOrderByCobrarConciliacionesCarterasContabilidad.setSelected(false);
				
				this.jInternalFrameOrderByCobrarConciliacionesCarterasContabilidad.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCobrarConciliacionesCarterasContabilidad"));
				
				this.inicializarActualizarBindingTablaOrderByCobrarConciliacionesCarterasContabilidad();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCobrarConciliacionesCarterasContabilidad() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCobrarConciliacionesCarterasContabilidad==null) {
				
				this.jInternalFrameImportacionCobrarConciliacionesCarterasContabilidad=new ImportacionJInternalFrame(CobrarConciliacionesCarterasContabilidadConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCobrarConciliacionesCarterasContabilidad);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCobrarConciliacionesCarterasContabilidad);
				this.jInternalFrameImportacionCobrarConciliacionesCarterasContabilidad.setVisible(false);
				this.jInternalFrameImportacionCobrarConciliacionesCarterasContabilidad.setSelected(false);


				this.jInternalFrameImportacionCobrarConciliacionesCarterasContabilidad.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCobrarConciliacionesCarterasContabilidad"));
				this.jInternalFrameImportacionCobrarConciliacionesCarterasContabilidad.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCobrarConciliacionesCarterasContabilidad"));
				this.jInternalFrameImportacionCobrarConciliacionesCarterasContabilidad.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCobrarConciliacionesCarterasContabilidad"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad==null) {
				this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad=new ReporteDinamicoJInternalFrame(CobrarConciliacionesCarterasContabilidadConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad);
				this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.setVisible(false);
				this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCobrarConciliacionesCarterasContabilidad"));
				this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCobrarConciliacionesCarterasContabilidad"));
				this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCobrarConciliacionesCarterasContabilidad"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCobrarConciliacionesCarterasContabilidad();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleCobrarConciliacionesCarterasContabilidad() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad);
			
	       	this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.setVisible(false);
	        this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.setSelected(false);
			
			//this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.dispose();
			//this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.setVisible(true);
	        this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCobrarConciliacionesCarterasContabilidad() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCobrarConciliacionesCarterasContabilidad.setVisible(true);
	        this.jInternalFrameImportacionCobrarConciliacionesCarterasContabilidad.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCobrarConciliacionesCarterasContabilidad() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCobrarConciliacionesCarterasContabilidad.setVisible(true);
	        this.jInternalFrameOrderByCobrarConciliacionesCarterasContabilidad.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCobrarConciliacionesCarterasContabilidad() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCobrarConciliacionesCarterasContabilidad.setVisible(false);
	        this.jInternalFrameOrderByCobrarConciliacionesCarterasContabilidad.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.setVisible(false);
	        this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCobrarConciliacionesCarterasContabilidad() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCobrarConciliacionesCarterasContabilidad.setVisible(false);
	        this.jInternalFrameImportacionCobrarConciliacionesCarterasContabilidad.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarCobrarConciliacionesCarterasContabilidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCobrarConciliacionesCarterasContabilidad(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCobrarConciliacionesCarterasContabilidad(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCobrarConciliacionesCarterasContabilidad.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCobrarConciliacionesCarterasContabilidad(true);
			//this.isEsNuevoCobrarConciliacionesCarterasContabilidad=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarconciliacionescarterascontabilidad =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads().toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cobrarconciliacionescarterascontabilidad =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidads.toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCobrarConciliacionesCarterasContabilidad("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCobrarConciliacionesCarterasContabilidad(false) ;
			
			if(cobrarconciliacionescarterascontabilidadSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(CobrarConciliacionesCarterasContabilidadJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCobrarConciliacionesCarterasContabilidad(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarConciliacionesCarterasContabilidad(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCobrarConciliacionesCarterasContabilidadActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCobrarConciliacionesCarterasContabilidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidad =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads().toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarconciliacionescarterascontabilidad =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidads.toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCobrarConciliacionesCarterasContabilidad(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCobrarConciliacionesCarterasContabilidad.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCobrarConciliacionesCarterasContabilidad(true);
			//this.isEsNuevoCobrarConciliacionesCarterasContabilidad=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarconciliacionescarterascontabilidad =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads().toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cobrarconciliacionescarterascontabilidad =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidads.toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.cobrarconciliacionescarterascontabilidad.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCobrarConciliacionesCarterasContabilidad("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCobrarConciliacionesCarterasContabilidad(false) ;
			
			if(CobrarConciliacionesCarterasContabilidadJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCobrarConciliacionesCarterasContabilidad(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarConciliacionesCarterasContabilidad(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaCuentaContable(List<CuentaContable> cuentacontablesForeignKey)throws Exception{
		TableColumn tableColumnCuentaContable=this.jTableDatosCobrarConciliacionesCarterasContabilidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarConciliacionesCarterasContabilidad,CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_IDCUENTACONTABLE));
		TableCellEditor tableCellEditorCuentaContable =tableColumnCuentaContable.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContable;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontablesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCobrarConciliacionesCarterasContabilidad.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cuentacontableTableCellFk.setRowActual(intSelectedRow);
			//cuentacontableTableCellFk.setcuentacontablesForeignKeyActual(cuentacontablesForeignKey);
		//}


		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.RecargarCuentaContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarCobrarConciliacionesCarterasContabilidadActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarconciliacionescarterascontabilidadLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCobrarConciliacionesCarterasContabilidad(false);
			
			//if(!this.isEsNuevoCobrarConciliacionesCarterasContabilidad) {								
				int intSelectedRow = this.jTableDatosCobrarConciliacionesCarterasContabilidad.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidad =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads().toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cobrarconciliacionescarterascontabilidad =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidads.toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CobrarConciliacionesCarterasContabilidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidad,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidad);
				
			}
			
			if(this.permiteMantenimiento(this.cobrarconciliacionescarterascontabilidad)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCobrarConciliacionesCarterasContabilidad=true;
					this.inicializarActualizarBindingTablaCobrarConciliacionesCarterasContabilidad(false);
					this.isEsNuevoCobrarConciliacionesCarterasContabilidad=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCobrarConciliacionesCarterasContabilidad=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCobrarConciliacionesCarterasContabilidad=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCobrarConciliacionesCarterasContabilidad(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCobrarConciliacionesCarterasContabilidad(false);
				
				this.habilitarDeshabilitarControlesCobrarConciliacionesCarterasContabilidad(false);
			
												
				
				if(CobrarConciliacionesCarterasContabilidadJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCobrarConciliacionesCarterasContabilidad();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCobrarConciliacionesCarterasContabilidadActionPerformed(evt,cobrarconciliacionescarterascontabilidadSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidad,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCobrarConciliacionesCarterasContabilidad.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,cobrarconciliacionescarterascontabilidadSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarconciliacionescarterascontabilidadLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.cobrarconciliacionescarterascontabilidad.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(CobrarConciliacionesCarterasContabilidad.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarConciliacionesCarterasContabilidad.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarconciliacionescarterascontabilidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarconciliacionescarterascontabilidadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCobrarConciliacionesCarterasContabilidadActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarconciliacionescarterascontabilidadLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCobrarConciliacionesCarterasContabilidad.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarconciliacionescarterascontabilidad =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads().toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
				this.cobrarconciliacionescarterascontabilidad.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cobrarconciliacionescarterascontabilidad =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidads.toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
				this.cobrarconciliacionescarterascontabilidad.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.cobrarconciliacionescarterascontabilidad)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CobrarConciliacionesCarterasContabilidadModel) this.jTableDatosCobrarConciliacionesCarterasContabilidad.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCobrarConciliacionesCarterasContabilidad=true;
				this.inicializarActualizarBindingTablaCobrarConciliacionesCarterasContabilidad(false);
				this.isEsNuevoCobrarConciliacionesCarterasContabilidad=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCobrarConciliacionesCarterasContabilidad(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCobrarConciliacionesCarterasContabilidad(false);
				
				this.habilitarDeshabilitarControlesCobrarConciliacionesCarterasContabilidad(false);
				
				
				
				if(CobrarConciliacionesCarterasContabilidadJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCobrarConciliacionesCarterasContabilidad();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarconciliacionescarterascontabilidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarconciliacionescarterascontabilidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarconciliacionescarterascontabilidadLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCobrarConciliacionesCarterasContabilidadActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCobrarConciliacionesCarterasContabilidad.getRowCount()>=1) {
				jTableDatosCobrarConciliacionesCarterasContabilidad.removeRowSelectionInterval(0, jTableDatosCobrarConciliacionesCarterasContabilidad.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCobrarConciliacionesCarterasContabilidad(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCobrarConciliacionesCarterasContabilidad(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCobrarConciliacionesCarterasContabilidad(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarConciliacionesCarterasContabilidad(false) ;
			
			this.isEsNuevoCobrarConciliacionesCarterasContabilidad=false;
			
			if(CobrarConciliacionesCarterasContabilidadJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCobrarConciliacionesCarterasContabilidad();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCobrarConciliacionesCarterasContabilidadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarconciliacionescarterascontabilidadLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCobrarConciliacionesCarterasContabilidad(false);
				
				//SI ES MANUAL
				if(CobrarConciliacionesCarterasContabilidadJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCobrarConciliacionesCarterasContabilidad();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarconciliacionescarterascontabilidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarconciliacionescarterascontabilidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarconciliacionescarterascontabilidadLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCobrarConciliacionesCarterasContabilidadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCobrarConciliacionesCarterasContabilidad--;			
			//CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidadAux= new CobrarConciliacionesCarterasContabilidad();			
			//cobrarconciliacionescarterascontabilidadAux.setId(this.iIdNuevoCobrarConciliacionesCarterasContabilidad);
			
			if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCobrarConciliacionesCarterasContabilidad();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidad);
			
			this.cobrarconciliacionescarterascontabilidad.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads().add(this.cobrarconciliacionescarterascontabilidadAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.cobrarconciliacionescarterascontabilidads.add(this.cobrarconciliacionescarterascontabilidadAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCobrarConciliacionesCarterasContabilidad(false);
			
			this.jTableDatosCobrarConciliacionesCarterasContabilidad.setRowSelectionInterval(this.getIndiceNuevoCobrarConciliacionesCarterasContabilidad(), this.getIndiceNuevoCobrarConciliacionesCarterasContabilidad());
			
			int iLastRow =  this.jTableDatosCobrarConciliacionesCarterasContabilidad.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCobrarConciliacionesCarterasContabilidad.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCobrarConciliacionesCarterasContabilidad.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCobrarConciliacionesCarterasContabilidad(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCobrarConciliacionesCarterasContabilidadActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarconciliacionescarterascontabilidadLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCobrarConciliacionesCarterasContabilidad(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarConciliacionesCarterasContabilidad(false);
			
			//SI ES MANUAL
			if(CobrarConciliacionesCarterasContabilidadJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCobrarConciliacionesCarterasContabilidad();
			}
			
			//this.abrirFrameTreeCobrarConciliacionesCarterasContabilidad();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarconciliacionescarterascontabilidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarconciliacionescarterascontabilidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarconciliacionescarterascontabilidadLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCobrarConciliacionesCarterasContabilidadActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCobrarConciliacionesCarterasContabilidadActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCobrarConciliacionesCarterasContabilidad.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCobrarConciliacionesCarterasContabilidad.setFileImportacion(this.jInternalFrameImportacionCobrarConciliacionesCarterasContabilidad.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCobrarConciliacionesCarterasContabilidad.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCobrarConciliacionesCarterasContabilidad.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCobrarConciliacionesCarterasContabilidad.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCobrarConciliacionesCarterasContabilidad.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCobrarConciliacionesCarterasContabilidadActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<CobrarConciliacionesCarterasContabilidad> cobrarconciliacionescarterascontabilidadsSeleccionados=new ArrayList<CobrarConciliacionesCarterasContabilidad>();		

		cobrarconciliacionescarterascontabilidadsSeleccionados=this.getCobrarConciliacionesCarterasContabilidadsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CobrarConciliacionesCarterasContabilidadBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CobrarConciliacionesCarterasContabilidadBaseDesign.jrxml";
			
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
			
			this.generarReporteCobrarConciliacionesCarterasContabilidads("Todos",cobrarconciliacionescarterascontabilidadsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Conciliaciones Carteras Contabilidad",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoTipoMovimiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoTipoMovimiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoTipoMovimiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoTipoMovimiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_NUMEROMAYOR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroMayor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroMayor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroMayor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroMayor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_DEBITOASIENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_bitoAsiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_bitoAsiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_bitoAsiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_bitoAsiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CREDITOASIENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_editoAsiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_editoAsiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_editoAsiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_editoAsiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_DEBITOCUENTAS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_bitoCuentas_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_bitoCuentas_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_bitoCuentas_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_bitoCuentas_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CREDITOCUENTAS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_editoCuentas_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_editoCuentas_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_editoCuentas_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_editoCuentas_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO:
					sNombreCampoCategoria="codigo_tipo_movimiento";
					break;

				case CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_NUMEROMAYOR:
					sNombreCampoCategoria="numero_mayor";
					break;

				case CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_DEBITOASIENTO:
					sNombreCampoCategoria="debito_asiento";
					break;

				case CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CREDITOASIENTO:
					sNombreCampoCategoria="credito_asiento";
					break;

				case CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_DEBITOCUENTAS:
					sNombreCampoCategoria="debito_cuentas";
					break;

				case CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CREDITOCUENTAS:
					sNombreCampoCategoria="credito_cuentas";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO:
					sNombreCampoCategoriaValor="codigo_tipo_movimiento";
					break;

				case CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_NUMEROMAYOR:
					sNombreCampoCategoriaValor="numero_mayor";
					break;

				case CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_DEBITOASIENTO:
					sNombreCampoCategoriaValor="debito_asiento";
					break;

				case CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CREDITOASIENTO:
					sNombreCampoCategoriaValor="credito_asiento";
					break;

				case CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_DEBITOCUENTAS:
					sNombreCampoCategoriaValor="debito_cuentas";
					break;

				case CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CREDITOCUENTAS:
					sNombreCampoCategoriaValor="credito_cuentas";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Tipo Movimiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_tipo_movimiento");
					break;

				case CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_NUMEROMAYOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Mayor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_mayor");
					break;

				case CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_DEBITOASIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Debito Asiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"debito_asiento");
					break;

				case CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CREDITOASIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Credito Asiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"credito_asiento");
					break;

				case CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_DEBITOCUENTAS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Debito Cuentas",sNombreCampoCategoria,sNombreCampoCategoriaValor,"debito_cuentas");
					break;

				case CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CREDITOCUENTAS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Credito Cuentas",sNombreCampoCategoria,sNombreCampoCategoriaValor,"credito_cuentas");
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
	
	public void jButtonGenerarExcelReporteDinamicoCobrarConciliacionesCarterasContabilidadActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<CobrarConciliacionesCarterasContabilidad> cobrarconciliacionescarterascontabilidadsSeleccionados=new ArrayList<CobrarConciliacionesCarterasContabilidad>();		
		
		cobrarconciliacionescarterascontabilidadsSeleccionados=this.getCobrarConciliacionesCarterasContabilidadsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarconciliacionescarterascontabilidad";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("CobrarConciliacionesCarterasContabilidads");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidad:cobrarconciliacionescarterascontabilidadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarconciliacionescarterascontabilidad.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_IDCUENTACONTABLE);
					iRow++;

					for(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidad:cobrarconciliacionescarterascontabilidadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarconciliacionescarterascontabilidad.getcuentacontable_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_FECHADESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_FECHADESDE);
					iRow++;

					for(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidad:cobrarconciliacionescarterascontabilidadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarconciliacionescarterascontabilidad.getfecha_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_FECHAHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_FECHAHASTA);
					iRow++;

					for(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidad:cobrarconciliacionescarterascontabilidadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarconciliacionescarterascontabilidad.getfecha_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidad:cobrarconciliacionescarterascontabilidadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarconciliacionescarterascontabilidad.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO);
					iRow++;

					for(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidad:cobrarconciliacionescarterascontabilidadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarconciliacionescarterascontabilidad.getcodigo_tipo_movimiento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_NUMEROMAYOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_NUMEROMAYOR);
					iRow++;

					for(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidad:cobrarconciliacionescarterascontabilidadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarconciliacionescarterascontabilidad.getnumero_mayor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_DEBITOASIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_DEBITOASIENTO);
					iRow++;

					for(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidad:cobrarconciliacionescarterascontabilidadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarconciliacionescarterascontabilidad.getdebito_asiento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CREDITOASIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CREDITOASIENTO);
					iRow++;

					for(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidad:cobrarconciliacionescarterascontabilidadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarconciliacionescarterascontabilidad.getcredito_asiento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_DEBITOCUENTAS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_DEBITOCUENTAS);
					iRow++;

					for(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidad:cobrarconciliacionescarterascontabilidadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarconciliacionescarterascontabilidad.getdebito_cuentas());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CREDITOCUENTAS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CREDITOCUENTAS);
					iRow++;

					for(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidad:cobrarconciliacionescarterascontabilidadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarconciliacionescarterascontabilidad.getcredito_cuentas());
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
			//	this.getFilaCabeceraExportarExcelCobrarConciliacionesCarterasContabilidad(row);				
			//	iRow++;
			//}				
			
			//for(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidadAux:cobrarconciliacionescarterascontabilidadsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCobrarConciliacionesCarterasContabilidad(cobrarconciliacionescarterascontabilidadAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Conciliaciones Carteras Contabilidad",JOptionPane.INFORMATION_MESSAGE);
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
				this.cobrarconciliacionescarterascontabilidadLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarConciliacionesCarterasContabilidad(false);
			
			//SI ES MANUAL
			if(CobrarConciliacionesCarterasContabilidadJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCobrarConciliacionesCarterasContabilidad();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarconciliacionescarterascontabilidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarconciliacionescarterascontabilidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarconciliacionescarterascontabilidadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCobrarConciliacionesCarterasContabilidadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarconciliacionescarterascontabilidadLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarConciliacionesCarterasContabilidad(false);
			
			//SI ES MANUAL
			if(CobrarConciliacionesCarterasContabilidadJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCobrarConciliacionesCarterasContabilidad();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarconciliacionescarterascontabilidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarconciliacionescarterascontabilidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarconciliacionescarterascontabilidadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCobrarConciliacionesCarterasContabilidadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarconciliacionescarterascontabilidadLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarConciliacionesCarterasContabilidad(false);
			
			//SI ES MANUAL
			if(CobrarConciliacionesCarterasContabilidadJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCobrarConciliacionesCarterasContabilidad();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarconciliacionescarterascontabilidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarconciliacionescarterascontabilidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarconciliacionescarterascontabilidadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCobrarConciliacionesCarterasContabilidad() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCobrarConciliacionesCarterasContabilidad.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCobrarConciliacionesCarterasContabilidad.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCobrarConciliacionesCarterasContabilidad.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCobrarConciliacionesCarterasContabilidad.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCobrarConciliacionesCarterasContabilidad.setMinimumSize(dimensionMinimum);
		this.jTableDatosCobrarConciliacionesCarterasContabilidad.setMaximumSize(dimensionMaximum);
		this.jTableDatosCobrarConciliacionesCarterasContabilidad.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCobrarConciliacionesCarterasContabilidad(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCobrarConciliacionesCarterasContabilidad(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCobrarConciliacionesCarterasContabilidad(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCobrarConciliacionesCarterasContabilidad(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCobrarConciliacionesCarterasContabilidad(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCobrarConciliacionesCarterasContabilidad(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCobrarConciliacionesCarterasContabilidad(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCobrarConciliacionesCarterasContabilidad(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CobrarConciliacionesCarterasContabilidadJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CobrarConciliacionesCarterasContabilidadJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCobrarConciliacionesCarterasContabilidad() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCobrarConciliacionesCarterasContabilidad();
		
		this.inicializarActualizarBindingBotonesManualCobrarConciliacionesCarterasContabilidad(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCobrarConciliacionesCarterasContabilidad();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCobrarConciliacionesCarterasContabilidad() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCobrarConciliacionesCarterasContabilidad(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCobrarConciliacionesCarterasContabilidad(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCobrarConciliacionesCarterasContabilidad.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCobrarConciliacionesCarterasContabilidad.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCobrarConciliacionesCarterasContabilidad.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jCheckBoxPostAccionNuevoCobrarConciliacionesCarterasContabilidad.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jCheckBoxPostAccionSinCerrarCobrarConciliacionesCarterasContabilidad.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jCheckBoxPostAccionSinMensajeCobrarConciliacionesCarterasContabilidad.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCobrarConciliacionesCarterasContabilidad.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCobrarConciliacionesCarterasContabilidad.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCobrarConciliacionesCarterasContabilidad.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) {
				this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jCheckBoxPostAccionNuevoCobrarConciliacionesCarterasContabilidad.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jCheckBoxPostAccionSinCerrarCobrarConciliacionesCarterasContabilidad.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jCheckBoxPostAccionSinMensajeCobrarConciliacionesCarterasContabilidad.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCobrarConciliacionesCarterasContabilidad.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCobrarConciliacionesCarterasContabilidad.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jComboBoxTiposAccionesFormularioCobrarConciliacionesCarterasContabilidad.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCobrarConciliacionesCarterasContabilidad.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCobrarConciliacionesCarterasContabilidad.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCobrarConciliacionesCarterasContabilidad.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCobrarConciliacionesCarterasContabilidad.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCobrarConciliacionesCarterasContabilidad.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCobrarConciliacionesCarterasContabilidad.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCobrarConciliacionesCarterasContabilidad.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCobrarConciliacionesCarterasContabilidad(Boolean esInicializar) throws Exception {
		try	{	
			if(CobrarConciliacionesCarterasContabilidadJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCobrarConciliacionesCarterasContabilidad(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCobrarConciliacionesCarterasContabilidad() throws Exception {
		try	{
			if(CobrarConciliacionesCarterasContabilidadJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCobrarConciliacionesCarterasContabilidad();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCobrarConciliacionesCarterasContabilidad() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jComboBoxTiposAccionesFormularioCobrarConciliacionesCarterasContabilidad.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jComboBoxTiposAccionesFormularioCobrarConciliacionesCarterasContabilidad.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCobrarConciliacionesCarterasContabilidad() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCobrarConciliacionesCarterasContabilidad.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCobrarConciliacionesCarterasContabilidad.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCobrarConciliacionesCarterasContabilidad.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCobrarConciliacionesCarterasContabilidad.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCobrarConciliacionesCarterasContabilidad.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCobrarConciliacionesCarterasContabilidad.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCobrarConciliacionesCarterasContabilidad.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCobrarConciliacionesCarterasContabilidad.addItem(reporte);
			}
			
			
			if(!this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCobrarConciliacionesCarterasContabilidad.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCobrarConciliacionesCarterasContabilidad.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCobrarConciliacionesCarterasContabilidad.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCobrarConciliacionesCarterasContabilidad.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCobrarConciliacionesCarterasContabilidad.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCobrarConciliacionesCarterasContabilidad.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jComboBoxTiposAccionesFormularioCobrarConciliacionesCarterasContabilidad.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jComboBoxTiposAccionesFormularioCobrarConciliacionesCarterasContabilidad.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCobrarConciliacionesCarterasContabilidad.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCobrarConciliacionesCarterasContabilidad.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCobrarConciliacionesCarterasContabilidad.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCobrarConciliacionesCarterasContabilidad();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCobrarConciliacionesCarterasContabilidad() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad!=null) {
				this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad!=null) {
				this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad!=null) {
				
				if(this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=CobrarConciliacionesCarterasContabilidadConstantesFunciones.getTiposSeleccionarCobrarConciliacionesCarterasContabilidad(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=CobrarConciliacionesCarterasContabilidadConstantesFunciones.getTiposSeleccionarCobrarConciliacionesCarterasContabilidad(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=CobrarConciliacionesCarterasContabilidadConstantesFunciones.getTiposSeleccionarCobrarConciliacionesCarterasContabilidad(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCobrarConciliacionesCarterasContabilidad()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_cuenta_contableBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.getSelectedItem()!=null){this.id_cuenta_contableBusquedaCobrarConciliacionesCarterasContabilidad=((CuentaContable)this.jComboBoxid_cuenta_contableBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.getSelectedItem()).getId();}
		this.fecha_desdeBusquedaCobrarConciliacionesCarterasContabilidad=new Date(this.jDateChooserfecha_desdeBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.getDate().getTime());
		this.fecha_hastaBusquedaCobrarConciliacionesCarterasContabilidad=new Date(this.jDateChooserfecha_hastaBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCobrarConciliacionesCarterasContabilidad(Boolean esInicializar) throws Exception {				
		if(CobrarConciliacionesCarterasContabilidadJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCobrarConciliacionesCarterasContabilidad();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCobrarConciliacionesCarterasContabilidad() throws Exception {
		this.inicializarActualizarBindingTablaCobrarConciliacionesCarterasContabilidad(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCobrarConciliacionesCarterasContabilidad() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCobrarConciliacionesCarterasContabilidad.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCobrarConciliacionesCarterasContabilidad.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCobrarConciliacionesCarterasContabilidad.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CobrarConciliacionesCarterasContabilidadPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCobrarConciliacionesCarterasContabilidad.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCobrarConciliacionesCarterasContabilidad.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CobrarConciliacionesCarterasContabilidadPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCobrarConciliacionesCarterasContabilidadOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarConciliacionesCarterasContabilidadOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CobrarConciliacionesCarterasContabilidadPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCobrarConciliacionesCarterasContabilidad.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCobrarConciliacionesCarterasContabilidad.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CobrarConciliacionesCarterasContabilidadPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCobrarConciliacionesCarterasContabilidad.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCobrarConciliacionesCarterasContabilidad(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=cobrarconciliacionescarterascontabilidads.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CobrarConciliacionesCarterasContabilidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCobrarConciliacionesCarterasContabilidad.setModel(new CobrarConciliacionesCarterasContabilidadModel(this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCobrarConciliacionesCarterasContabilidad.setModel(new CobrarConciliacionesCarterasContabilidadModel(this.cobrarconciliacionescarterascontabilidads,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCobrarConciliacionesCarterasContabilidad!=null && this.jInternalFrameOrderByCobrarConciliacionesCarterasContabilidad.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCobrarConciliacionesCarterasContabilidad();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCobrarConciliacionesCarterasContabilidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarConciliacionesCarterasContabilidad,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CobrarConciliacionesCarterasContabilidadPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CobrarConciliacionesCarterasContabilidadConstantesFunciones.SCLASSWEBTITULO,cobrarconciliacionescarterascontabilidadConstantesFunciones.resaltarSeleccionarCobrarConciliacionesCarterasContabilidad,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CobrarConciliacionesCarterasContabilidadConstantesFunciones.SCLASSWEBTITULO,cobrarconciliacionescarterascontabilidadConstantesFunciones.resaltarSeleccionarCobrarConciliacionesCarterasContabilidad,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCobrarConciliacionesCarterasContabilidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarConciliacionesCarterasContabilidad,CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_ID));

		if(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.mostraridCobrarConciliacionesCarterasContabilidad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.resaltaridCobrarConciliacionesCarterasContabilidad,this.cobrarconciliacionescarterascontabilidadConstantesFunciones.activaridCobrarConciliacionesCarterasContabilidad,iSizeTabla,this,true,"idCobrarConciliacionesCarterasContabilidad","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.resaltaridCobrarConciliacionesCarterasContabilidad,this.cobrarconciliacionescarterascontabilidadConstantesFunciones.activaridCobrarConciliacionesCarterasContabilidad,this,true,"idCobrarConciliacionesCarterasContabilidad","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarConciliacionesCarterasContabilidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarConciliacionesCarterasContabilidad,CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CODIGO));

		if(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.mostrarcodigoCobrarConciliacionesCarterasContabilidad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.resaltarcodigoCobrarConciliacionesCarterasContabilidad,this.cobrarconciliacionescarterascontabilidadConstantesFunciones.activarcodigoCobrarConciliacionesCarterasContabilidad,iSizeTabla,this,true,"codigoCobrarConciliacionesCarterasContabilidad","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.resaltarcodigoCobrarConciliacionesCarterasContabilidad,this.cobrarconciliacionescarterascontabilidadConstantesFunciones.activarcodigoCobrarConciliacionesCarterasContabilidad,this,true,"codigoCobrarConciliacionesCarterasContabilidad","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarConciliacionesCarterasContabilidadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarConciliacionesCarterasContabilidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarConciliacionesCarterasContabilidad,CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO));

		if(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.mostrarcodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.resaltarcodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidad,this.cobrarconciliacionescarterascontabilidadConstantesFunciones.activarcodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidad,iSizeTabla,this,true,"codigo_tipo_movimientoCobrarConciliacionesCarterasContabilidad","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.resaltarcodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidad,this.cobrarconciliacionescarterascontabilidadConstantesFunciones.activarcodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidad,this,true,"codigo_tipo_movimientoCobrarConciliacionesCarterasContabilidad","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarConciliacionesCarterasContabilidadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarConciliacionesCarterasContabilidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarConciliacionesCarterasContabilidad,CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_NUMEROMAYOR));

		if(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.mostrarnumero_mayorCobrarConciliacionesCarterasContabilidad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_NUMEROMAYOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.resaltarnumero_mayorCobrarConciliacionesCarterasContabilidad,this.cobrarconciliacionescarterascontabilidadConstantesFunciones.activarnumero_mayorCobrarConciliacionesCarterasContabilidad,iSizeTabla,this,true,"numero_mayorCobrarConciliacionesCarterasContabilidad","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.resaltarnumero_mayorCobrarConciliacionesCarterasContabilidad,this.cobrarconciliacionescarterascontabilidadConstantesFunciones.activarnumero_mayorCobrarConciliacionesCarterasContabilidad,this,true,"numero_mayorCobrarConciliacionesCarterasContabilidad","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarConciliacionesCarterasContabilidadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarConciliacionesCarterasContabilidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarConciliacionesCarterasContabilidad,CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_DEBITOASIENTO));

		if(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.mostrardebito_asientoCobrarConciliacionesCarterasContabilidad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_DEBITOASIENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.resaltardebito_asientoCobrarConciliacionesCarterasContabilidad,this.cobrarconciliacionescarterascontabilidadConstantesFunciones.activardebito_asientoCobrarConciliacionesCarterasContabilidad,iSizeTabla,this,true,"debito_asientoCobrarConciliacionesCarterasContabilidad","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.resaltardebito_asientoCobrarConciliacionesCarterasContabilidad,this.cobrarconciliacionescarterascontabilidadConstantesFunciones.activardebito_asientoCobrarConciliacionesCarterasContabilidad,this,true,"debito_asientoCobrarConciliacionesCarterasContabilidad","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CobrarConciliacionesCarterasContabilidadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarConciliacionesCarterasContabilidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarConciliacionesCarterasContabilidad,CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CREDITOASIENTO));

		if(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.mostrarcredito_asientoCobrarConciliacionesCarterasContabilidad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CREDITOASIENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.resaltarcredito_asientoCobrarConciliacionesCarterasContabilidad,this.cobrarconciliacionescarterascontabilidadConstantesFunciones.activarcredito_asientoCobrarConciliacionesCarterasContabilidad,iSizeTabla,this,true,"credito_asientoCobrarConciliacionesCarterasContabilidad","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.resaltarcredito_asientoCobrarConciliacionesCarterasContabilidad,this.cobrarconciliacionescarterascontabilidadConstantesFunciones.activarcredito_asientoCobrarConciliacionesCarterasContabilidad,this,true,"credito_asientoCobrarConciliacionesCarterasContabilidad","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CobrarConciliacionesCarterasContabilidadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarConciliacionesCarterasContabilidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarConciliacionesCarterasContabilidad,CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_DEBITOCUENTAS));

		if(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.mostrardebito_cuentasCobrarConciliacionesCarterasContabilidad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_DEBITOCUENTAS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.resaltardebito_cuentasCobrarConciliacionesCarterasContabilidad,this.cobrarconciliacionescarterascontabilidadConstantesFunciones.activardebito_cuentasCobrarConciliacionesCarterasContabilidad,iSizeTabla,this,true,"debito_cuentasCobrarConciliacionesCarterasContabilidad","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.resaltardebito_cuentasCobrarConciliacionesCarterasContabilidad,this.cobrarconciliacionescarterascontabilidadConstantesFunciones.activardebito_cuentasCobrarConciliacionesCarterasContabilidad,this,true,"debito_cuentasCobrarConciliacionesCarterasContabilidad","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CobrarConciliacionesCarterasContabilidadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarConciliacionesCarterasContabilidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarConciliacionesCarterasContabilidad,CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CREDITOCUENTAS));

		if(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.mostrarcredito_cuentasCobrarConciliacionesCarterasContabilidad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CREDITOCUENTAS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.resaltarcredito_cuentasCobrarConciliacionesCarterasContabilidad,this.cobrarconciliacionescarterascontabilidadConstantesFunciones.activarcredito_cuentasCobrarConciliacionesCarterasContabilidad,iSizeTabla,this,true,"credito_cuentasCobrarConciliacionesCarterasContabilidad","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.resaltarcredito_cuentasCobrarConciliacionesCarterasContabilidad,this.cobrarconciliacionescarterascontabilidadConstantesFunciones.activarcredito_cuentasCobrarConciliacionesCarterasContabilidad,this,true,"credito_cuentasCobrarConciliacionesCarterasContabilidad","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CobrarConciliacionesCarterasContabilidadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCobrarConciliacionesCarterasContabilidad.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCobrarConciliacionesCarterasContabilidad.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCobrarConciliacionesCarterasContabilidad && this.isPermisoGuardarCambiosCobrarConciliacionesCarterasContabilidad) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCobrarConciliacionesCarterasContabilidad.addColumn(tableColumn);
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
			
			this.jTableDatosCobrarConciliacionesCarterasContabilidad.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCobrarConciliacionesCarterasContabilidad && this.isPermisoGuardarCambiosCobrarConciliacionesCarterasContabilidad) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCobrarConciliacionesCarterasContabilidad && this.isPermisoGuardarCambiosCobrarConciliacionesCarterasContabilidad) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCobrarConciliacionesCarterasContabilidad.moveColumn(this.jTableDatosCobrarConciliacionesCarterasContabilidad.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCobrarConciliacionesCarterasContabilidad.moveColumn(this.jTableDatosCobrarConciliacionesCarterasContabilidad.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCobrarConciliacionesCarterasContabilidad.moveColumn(this.jTableDatosCobrarConciliacionesCarterasContabilidad.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCobrarConciliacionesCarterasContabilidad.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCobrarConciliacionesCarterasContabilidad.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCobrarConciliacionesCarterasContabilidad,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CobrarConciliacionesCarterasContabilidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCobrarConciliacionesCarterasContabilidad.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCobrarConciliacionesCarterasContabilidad.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CobrarConciliacionesCarterasContabilidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CobrarConciliacionesCarterasContabilidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCobrarConciliacionesCarterasContabilidad.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCobrarConciliacionesCarterasContabilidad.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCobrarConciliacionesCarterasContabilidad.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=cobrarconciliacionescarterascontabilidads.size()-1;
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
		//this.jTableDatosCobrarConciliacionesCarterasContabilidad.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCobrarConciliacionesCarterasContabilidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCobrarConciliacionesCarterasContabilidad();
			
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
				
				//this.isEsNuevoCobrarConciliacionesCarterasContabilidad=false;
					
				CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cobrarconciliacionescarterascontabilidad,new Object(),this.cobrarconciliacionescarterascontabilidadParameterGeneral,this.cobrarconciliacionescarterascontabilidadReturnGeneral);
			
				if(this.cobrarconciliacionescarterascontabilidadSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCobrarConciliacionesCarterasContabilidad.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCobrarConciliacionesCarterasContabilidad.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidad =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads().toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarconciliacionescarterascontabilidad =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidads.toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.cobrarconciliacionescarterascontabilidad.getsType().equals("DUPLICADO")
				   || this.cobrarconciliacionescarterascontabilidad.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCobrarConciliacionesCarterasContabilidad=true;
				
				} else {
					this.isEsNuevoCobrarConciliacionesCarterasContabilidad=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado()) {
					if(this.cobrarconciliacionescarterascontabilidad.getId()>=0 && !this.cobrarconciliacionescarterascontabilidad.getIsNew()) {						
						this.isEsNuevoCobrarConciliacionesCarterasContabilidad=false;
						
					} else {
						this.isEsNuevoCobrarConciliacionesCarterasContabilidad=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCobrarConciliacionesCarterasContabilidad(esRelaciones);						
				
				this.seleccionarCobrarConciliacionesCarterasContabilidad(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.cobrarconciliacionescarterascontabilidad.getId()<0) {
					this.isEsNuevoCobrarConciliacionesCarterasContabilidad=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCobrarConciliacionesCarterasContabilidad(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCobrarConciliacionesCarterasContabilidad(evt,rowIndex);
				}	
				
				if(this.cobrarconciliacionescarterascontabilidadSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion CobrarConciliacionesCarterasContabilidad: " + this.dDif); 
					}
				}								
				
				CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cobrarconciliacionescarterascontabilidad,new Object(),this.cobrarconciliacionescarterascontabilidadParameterGeneral,this.cobrarconciliacionescarterascontabilidadReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCobrarConciliacionesCarterasContabilidad(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.cobrarconciliacionescarterascontabilidad)) {
					if(this.cobrarconciliacionescarterascontabilidad.getId()>0) {
						this.cobrarconciliacionescarterascontabilidad.setIsDeleted(true);
						
						this.cobrarconciliacionescarterascontabilidadsEliminados.add(this.cobrarconciliacionescarterascontabilidad);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads().remove(this.cobrarconciliacionescarterascontabilidad);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cobrarconciliacionescarterascontabilidads.remove(this.cobrarconciliacionescarterascontabilidad);				
					}
					
					
					((CobrarConciliacionesCarterasContabilidadModel) this.jTableDatosCobrarConciliacionesCarterasContabilidad.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCobrarConciliacionesCarterasContabilidad(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCobrarConciliacionesCarterasContabilidad(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCobrarConciliacionesCarterasContabilidad) {
			
			if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCobrarConciliacionesCarterasContabilidad.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCobrarConciliacionesCarterasContabilidad.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidad =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads().toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarconciliacionescarterascontabilidad =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidads.toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CobrarConciliacionesCarterasContabilidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidad);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCobrarConciliacionesCarterasContabilidad("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCobrarConciliacionesCarterasContabilidad(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCobrarConciliacionesCarterasContabilidad() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCobrarConciliacionesCarterasContabilidad(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidad) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCobrarConciliacionesCarterasContabilidad(cobrarconciliacionescarterascontabilidad,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCobrarConciliacionesCarterasContabilidad(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidad,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCobrarConciliacionesCarterasContabilidad(cobrarconciliacionescarterascontabilidad);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCobrarConciliacionesCarterasContabilidad(cobrarconciliacionescarterascontabilidad,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCobrarConciliacionesCarterasContabilidad(cobrarconciliacionescarterascontabilidad);
	}
	
	public void setVariablesObjetoActualToFormularioCobrarConciliacionesCarterasContabilidad(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidad) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jLabelidCobrarConciliacionesCarterasContabilidad.setText(cobrarconciliacionescarterascontabilidad.getId().toString());
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTextFieldcodigoCobrarConciliacionesCarterasContabilidad.setText(cobrarconciliacionescarterascontabilidad.getcodigo());
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTextFieldcodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidad.setText(cobrarconciliacionescarterascontabilidad.getcodigo_tipo_movimiento());
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTextAreanumero_mayorCobrarConciliacionesCarterasContabilidad.setText(cobrarconciliacionescarterascontabilidad.getnumero_mayor());
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTextFielddebito_asientoCobrarConciliacionesCarterasContabilidad.setText(cobrarconciliacionescarterascontabilidad.getdebito_asiento().toString());
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTextFieldcredito_asientoCobrarConciliacionesCarterasContabilidad.setText(cobrarconciliacionescarterascontabilidad.getcredito_asiento().toString());
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTextFielddebito_cuentasCobrarConciliacionesCarterasContabilidad.setText(cobrarconciliacionescarterascontabilidad.getdebito_cuentas().toString());
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTextFieldcredito_cuentasCobrarConciliacionesCarterasContabilidad.setText(cobrarconciliacionescarterascontabilidad.getcredito_cuentas().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidadLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,cobrarconciliacionescarterascontabilidadLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidadLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				cobrarconciliacionescarterascontabilidadLocal=this.cobrarconciliacionescarterascontabilidad;
			} else {
				cobrarconciliacionescarterascontabilidadLocal=this.cobrarconciliacionescarterascontabilidadAnterior;
			}
		}
		
		if(this.permiteMantenimiento(cobrarconciliacionescarterascontabilidadLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCobrarConciliacionesCarterasContabilidad(cobrarconciliacionescarterascontabilidadLocal,true);
					
					if(cobrarconciliacionescarterascontabilidadSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(cobrarconciliacionescarterascontabilidadLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(cobrarconciliacionescarterascontabilidadLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCobrarConciliacionesCarterasContabilidad(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidad,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCobrarConciliacionesCarterasContabilidad(cobrarconciliacionescarterascontabilidad,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCobrarConciliacionesCarterasContabilidad(cobrarconciliacionescarterascontabilidad);
	}
	
	public void setVariablesFormularioToObjetoActualCobrarConciliacionesCarterasContabilidad(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidad,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCobrarConciliacionesCarterasContabilidad(cobrarconciliacionescarterascontabilidad,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCobrarConciliacionesCarterasContabilidad(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidad,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jLabelidCobrarConciliacionesCarterasContabilidad.getText()==null || this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jLabelidCobrarConciliacionesCarterasContabilidad.getText()=="" || this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jLabelidCobrarConciliacionesCarterasContabilidad.getText()=="Id") {
				this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jLabelidCobrarConciliacionesCarterasContabilidad.setText("0");
			}

			if(conColumnasBase) {cobrarconciliacionescarterascontabilidad.setId(Long.parseLong(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jLabelidCobrarConciliacionesCarterasContabilidad.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jLabelIdCobrarConciliacionesCarterasContabilidad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarconciliacionescarterascontabilidad.setcodigo(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTextFieldcodigoCobrarConciliacionesCarterasContabilidad.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jLabelcodigoCobrarConciliacionesCarterasContabilidad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarconciliacionescarterascontabilidad.setcodigo_tipo_movimiento(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTextFieldcodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidad.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jLabelcodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarconciliacionescarterascontabilidad.setnumero_mayor(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTextAreanumero_mayorCobrarConciliacionesCarterasContabilidad.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_NUMEROMAYOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jLabelnumero_mayorCobrarConciliacionesCarterasContabilidad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarconciliacionescarterascontabilidad.setdebito_asiento(Double.parseDouble(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTextFielddebito_asientoCobrarConciliacionesCarterasContabilidad.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_DEBITOASIENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jLabeldebito_asientoCobrarConciliacionesCarterasContabilidad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarconciliacionescarterascontabilidad.setcredito_asiento(Double.parseDouble(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTextFieldcredito_asientoCobrarConciliacionesCarterasContabilidad.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CREDITOASIENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jLabelcredito_asientoCobrarConciliacionesCarterasContabilidad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarconciliacionescarterascontabilidad.setdebito_cuentas(Double.parseDouble(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTextFielddebito_cuentasCobrarConciliacionesCarterasContabilidad.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_DEBITOCUENTAS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jLabeldebito_cuentasCobrarConciliacionesCarterasContabilidad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarconciliacionescarterascontabilidad.setcredito_cuentas(Double.parseDouble(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTextFieldcredito_cuentasCobrarConciliacionesCarterasContabilidad.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CREDITOCUENTAS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jLabelcredito_cuentasCobrarConciliacionesCarterasContabilidad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCobrarConciliacionesCarterasContabilidad(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidadBean,CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidad,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCobrarConciliacionesCarterasContabilidad(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidadOrigen,CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidad,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cobrarconciliacionescarterascontabilidadOrigen.getId()!=null && !cobrarconciliacionescarterascontabilidadOrigen.getId().equals(0L))) {cobrarconciliacionescarterascontabilidad.setId(cobrarconciliacionescarterascontabilidadOrigen.getId());}}
			if(conDefault || (!conDefault && cobrarconciliacionescarterascontabilidadOrigen.getfecha_desde()!=null && !cobrarconciliacionescarterascontabilidadOrigen.getfecha_desde().equals(new Date()))) {cobrarconciliacionescarterascontabilidad.setfecha_desde(cobrarconciliacionescarterascontabilidadOrigen.getfecha_desde());}
			if(conDefault || (!conDefault && cobrarconciliacionescarterascontabilidadOrigen.getfecha_hasta()!=null && !cobrarconciliacionescarterascontabilidadOrigen.getfecha_hasta().equals(new Date()))) {cobrarconciliacionescarterascontabilidad.setfecha_hasta(cobrarconciliacionescarterascontabilidadOrigen.getfecha_hasta());}
			if(conDefault || (!conDefault && cobrarconciliacionescarterascontabilidadOrigen.getcodigo()!=null && !cobrarconciliacionescarterascontabilidadOrigen.getcodigo().equals(""))) {cobrarconciliacionescarterascontabilidad.setcodigo(cobrarconciliacionescarterascontabilidadOrigen.getcodigo());}
			if(conDefault || (!conDefault && cobrarconciliacionescarterascontabilidadOrigen.getcodigo_tipo_movimiento()!=null && !cobrarconciliacionescarterascontabilidadOrigen.getcodigo_tipo_movimiento().equals(""))) {cobrarconciliacionescarterascontabilidad.setcodigo_tipo_movimiento(cobrarconciliacionescarterascontabilidadOrigen.getcodigo_tipo_movimiento());}
			if(conDefault || (!conDefault && cobrarconciliacionescarterascontabilidadOrigen.getnumero_mayor()!=null && !cobrarconciliacionescarterascontabilidadOrigen.getnumero_mayor().equals(""))) {cobrarconciliacionescarterascontabilidad.setnumero_mayor(cobrarconciliacionescarterascontabilidadOrigen.getnumero_mayor());}
			if(conDefault || (!conDefault && cobrarconciliacionescarterascontabilidadOrigen.getdebito_asiento()!=null && !cobrarconciliacionescarterascontabilidadOrigen.getdebito_asiento().equals(0.0))) {cobrarconciliacionescarterascontabilidad.setdebito_asiento(cobrarconciliacionescarterascontabilidadOrigen.getdebito_asiento());}
			if(conDefault || (!conDefault && cobrarconciliacionescarterascontabilidadOrigen.getcredito_asiento()!=null && !cobrarconciliacionescarterascontabilidadOrigen.getcredito_asiento().equals(0.0))) {cobrarconciliacionescarterascontabilidad.setcredito_asiento(cobrarconciliacionescarterascontabilidadOrigen.getcredito_asiento());}
			if(conDefault || (!conDefault && cobrarconciliacionescarterascontabilidadOrigen.getdebito_cuentas()!=null && !cobrarconciliacionescarterascontabilidadOrigen.getdebito_cuentas().equals(0.0))) {cobrarconciliacionescarterascontabilidad.setdebito_cuentas(cobrarconciliacionescarterascontabilidadOrigen.getdebito_cuentas());}
			if(conDefault || (!conDefault && cobrarconciliacionescarterascontabilidadOrigen.getcredito_cuentas()!=null && !cobrarconciliacionescarterascontabilidadOrigen.getcredito_cuentas().equals(0.0))) {cobrarconciliacionescarterascontabilidad.setcredito_cuentas(cobrarconciliacionescarterascontabilidadOrigen.getcredito_cuentas());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCobrarConciliacionesCarterasContabilidad(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidad) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jLabelidCobrarConciliacionesCarterasContabilidad.setText(cobrarconciliacionescarterascontabilidad.getId().toString());
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTextFieldcodigoCobrarConciliacionesCarterasContabilidad.setText(cobrarconciliacionescarterascontabilidad.getcodigo());
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTextFieldcodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidad.setText(cobrarconciliacionescarterascontabilidad.getcodigo_tipo_movimiento());
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTextAreanumero_mayorCobrarConciliacionesCarterasContabilidad.setText(cobrarconciliacionescarterascontabilidad.getnumero_mayor());
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTextFielddebito_asientoCobrarConciliacionesCarterasContabilidad.setText(cobrarconciliacionescarterascontabilidad.getdebito_asiento().toString());
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTextFieldcredito_asientoCobrarConciliacionesCarterasContabilidad.setText(cobrarconciliacionescarterascontabilidad.getcredito_asiento().toString());
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTextFielddebito_cuentasCobrarConciliacionesCarterasContabilidad.setText(cobrarconciliacionescarterascontabilidad.getdebito_cuentas().toString());
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTextFieldcredito_cuentasCobrarConciliacionesCarterasContabilidad.setText(cobrarconciliacionescarterascontabilidad.getcredito_cuentas().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCobrarConciliacionesCarterasContabilidad(CobrarConciliacionesCarterasContabilidadBean cobrarconciliacionescarterascontabilidadBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jLabelidCobrarConciliacionesCarterasContabilidad.setText(cobrarconciliacionescarterascontabilidadBean.getId().toString());
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTextFieldcodigoCobrarConciliacionesCarterasContabilidad.setText(cobrarconciliacionescarterascontabilidadBean.getcodigo());
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTextFieldcodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidad.setText(cobrarconciliacionescarterascontabilidadBean.getcodigo_tipo_movimiento());
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTextAreanumero_mayorCobrarConciliacionesCarterasContabilidad.setText(cobrarconciliacionescarterascontabilidadBean.getnumero_mayor());
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTextFielddebito_asientoCobrarConciliacionesCarterasContabilidad.setText(cobrarconciliacionescarterascontabilidadBean.getdebito_asiento().toString());
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTextFieldcredito_asientoCobrarConciliacionesCarterasContabilidad.setText(cobrarconciliacionescarterascontabilidadBean.getcredito_asiento().toString());
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTextFielddebito_cuentasCobrarConciliacionesCarterasContabilidad.setText(cobrarconciliacionescarterascontabilidadBean.getdebito_cuentas().toString());
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTextFieldcredito_cuentasCobrarConciliacionesCarterasContabilidad.setText(cobrarconciliacionescarterascontabilidadBean.getcredito_cuentas().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCobrarConciliacionesCarterasContabilidad(CobrarConciliacionesCarterasContabilidadParameterReturnGeneral cobrarconciliacionescarterascontabilidadReturnGeneral,CobrarConciliacionesCarterasContabilidadBean cobrarconciliacionescarterascontabilidadBean,Boolean conDefault) throws Exception { 
		try {
			CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidadLocal=new CobrarConciliacionesCarterasContabilidad();
			
			cobrarconciliacionescarterascontabilidadLocal=cobrarconciliacionescarterascontabilidadReturnGeneral.getCobrarConciliacionesCarterasContabilidad();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cobrarconciliacionescarterascontabilidadLocal.getId()!=null && !cobrarconciliacionescarterascontabilidadLocal.getId().equals(0L))) {cobrarconciliacionescarterascontabilidadBean.setId(cobrarconciliacionescarterascontabilidadLocal.getId());}}
			if(conDefault || (!conDefault && cobrarconciliacionescarterascontabilidadLocal.getcodigo()!=null && !cobrarconciliacionescarterascontabilidadLocal.getcodigo().equals(""))) {cobrarconciliacionescarterascontabilidadBean.setcodigo(cobrarconciliacionescarterascontabilidadLocal.getcodigo());}
			if(conDefault || (!conDefault && cobrarconciliacionescarterascontabilidadLocal.getcodigo_tipo_movimiento()!=null && !cobrarconciliacionescarterascontabilidadLocal.getcodigo_tipo_movimiento().equals(""))) {cobrarconciliacionescarterascontabilidadBean.setcodigo_tipo_movimiento(cobrarconciliacionescarterascontabilidadLocal.getcodigo_tipo_movimiento());}
			if(conDefault || (!conDefault && cobrarconciliacionescarterascontabilidadLocal.getnumero_mayor()!=null && !cobrarconciliacionescarterascontabilidadLocal.getnumero_mayor().equals(""))) {cobrarconciliacionescarterascontabilidadBean.setnumero_mayor(cobrarconciliacionescarterascontabilidadLocal.getnumero_mayor());}
			if(conDefault || (!conDefault && cobrarconciliacionescarterascontabilidadLocal.getdebito_asiento()!=null && !cobrarconciliacionescarterascontabilidadLocal.getdebito_asiento().equals(0.0))) {cobrarconciliacionescarterascontabilidadBean.setdebito_asiento(cobrarconciliacionescarterascontabilidadLocal.getdebito_asiento());}
			if(conDefault || (!conDefault && cobrarconciliacionescarterascontabilidadLocal.getcredito_asiento()!=null && !cobrarconciliacionescarterascontabilidadLocal.getcredito_asiento().equals(0.0))) {cobrarconciliacionescarterascontabilidadBean.setcredito_asiento(cobrarconciliacionescarterascontabilidadLocal.getcredito_asiento());}
			if(conDefault || (!conDefault && cobrarconciliacionescarterascontabilidadLocal.getdebito_cuentas()!=null && !cobrarconciliacionescarterascontabilidadLocal.getdebito_cuentas().equals(0.0))) {cobrarconciliacionescarterascontabilidadBean.setdebito_cuentas(cobrarconciliacionescarterascontabilidadLocal.getdebito_cuentas());}
			if(conDefault || (!conDefault && cobrarconciliacionescarterascontabilidadLocal.getcredito_cuentas()!=null && !cobrarconciliacionescarterascontabilidadLocal.getcredito_cuentas().equals(0.0))) {cobrarconciliacionescarterascontabilidadBean.setcredito_cuentas(cobrarconciliacionescarterascontabilidadLocal.getcredito_cuentas());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCobrarConciliacionesCarterasContabilidadGenerico(Long idCobrarConciliacionesCarterasContabilidadSeleccionado,JComboBox jComboBoxCobrarConciliacionesCarterasContabilidad,List<CobrarConciliacionesCarterasContabilidad> cobrarconciliacionescarterascontabilidadsLocal)throws Exception {
		try {
			CobrarConciliacionesCarterasContabilidad  cobrarconciliacionescarterascontabilidadTemp=null;

			for(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidadAux:cobrarconciliacionescarterascontabilidadsLocal) {
				if(cobrarconciliacionescarterascontabilidadAux.getId()!=null && cobrarconciliacionescarterascontabilidadAux.getId().equals(idCobrarConciliacionesCarterasContabilidadSeleccionado)) {
					cobrarconciliacionescarterascontabilidadTemp=cobrarconciliacionescarterascontabilidadAux;
					break;
				}
			}

			jComboBoxCobrarConciliacionesCarterasContabilidad.setSelectedItem(cobrarconciliacionescarterascontabilidadTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCobrarConciliacionesCarterasContabilidadGenerico(JComboBox jComboBoxCobrarConciliacionesCarterasContabilidad,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxCobrarConciliacionesCarterasContabilidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCobrarConciliacionesCarterasContabilidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCobrarConciliacionesCarterasContabilidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCobrarConciliacionesCarterasContabilidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCobrarConciliacionesCarterasContabilidad.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCobrarConciliacionesCarterasContabilidad.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCobrarConciliacionesCarterasContabilidad.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCobrarConciliacionesCarterasContabilidad.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCobrarConciliacionesCarterasContabilidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCobrarConciliacionesCarterasContabilidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cobrarconciliacionescarterascontabilidad=(CobrarConciliacionesCarterasContabilidad) cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cobrarconciliacionescarterascontabilidad =(CobrarConciliacionesCarterasContabilidad) cobrarconciliacionescarterascontabilidads.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!cobrarconciliacionescarterascontabilidad.getIsNew() && !cobrarconciliacionescarterascontabilidad.getIsChanged() && !cobrarconciliacionescarterascontabilidad.getIsDeleted()) {
				sDescripcion=cobrarconciliacionescarterascontabilidad.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=cobrarconciliacionescarterascontabilidad.getempresa_descripcion();
			}
		}

		if(sTipo.equals("CuentaContable")) {
			//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
			if(!cobrarconciliacionescarterascontabilidad.getIsNew() && !cobrarconciliacionescarterascontabilidad.getIsChanged() && !cobrarconciliacionescarterascontabilidad.getIsDeleted()) {
				sDescripcion=cobrarconciliacionescarterascontabilidad.getcuentacontable_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
				sDescripcion=cobrarconciliacionescarterascontabilidad.getcuentacontable_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidadRow=new CobrarConciliacionesCarterasContabilidad();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cobrarconciliacionescarterascontabilidadRow=(CobrarConciliacionesCarterasContabilidad) cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cobrarconciliacionescarterascontabilidadRow=(CobrarConciliacionesCarterasContabilidad) cobrarconciliacionescarterascontabilidads.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCobrarConciliacionesCarterasContabilidad(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCobrarConciliacionesCarterasContabilidad.setVisible((this.isVisibilidadCeldaNuevoCobrarConciliacionesCarterasContabilidad && this.isPermisoNuevoCobrarConciliacionesCarterasContabilidad));			
			this.jButtonDuplicarCobrarConciliacionesCarterasContabilidad.setVisible((this.isVisibilidadCeldaDuplicarCobrarConciliacionesCarterasContabilidad && this.isPermisoDuplicarCobrarConciliacionesCarterasContabilidad));			
			this.jButtonCopiarCobrarConciliacionesCarterasContabilidad.setVisible((this.isVisibilidadCeldaCopiarCobrarConciliacionesCarterasContabilidad && this.isPermisoCopiarCobrarConciliacionesCarterasContabilidad));
			this.jButtonVerFormCobrarConciliacionesCarterasContabilidad.setVisible((this.isVisibilidadCeldaVerFormCobrarConciliacionesCarterasContabilidad && this.isPermisoVerFormCobrarConciliacionesCarterasContabilidad));
			
			this.jButtonAbrirOrderByCobrarConciliacionesCarterasContabilidad.setVisible((this.isVisibilidadCeldaOrdenCobrarConciliacionesCarterasContabilidad && this.isPermisoOrdenCobrarConciliacionesCarterasContabilidad));			
			
			this.jButtonNuevoRelacionesCobrarConciliacionesCarterasContabilidad.setVisible((this.isVisibilidadCeldaNuevoRelacionesCobrarConciliacionesCarterasContabilidad && this.isPermisoNuevoCobrarConciliacionesCarterasContabilidad));			
			this.jButtonNuevoGuardarCambiosCobrarConciliacionesCarterasContabilidad.setVisible((this.isVisibilidadCeldaNuevoCobrarConciliacionesCarterasContabilidad && this.isPermisoNuevoCobrarConciliacionesCarterasContabilidad && this.isPermisoGuardarCambiosCobrarConciliacionesCarterasContabilidad));
			
			if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) {
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonModificarCobrarConciliacionesCarterasContabilidad.setVisible((this.isVisibilidadCeldaModificarCobrarConciliacionesCarterasContabilidad && this.isPermisoActualizarCobrarConciliacionesCarterasContabilidad));	
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonActualizarCobrarConciliacionesCarterasContabilidad.setVisible((this.isVisibilidadCeldaActualizarCobrarConciliacionesCarterasContabilidad && this.isPermisoActualizarCobrarConciliacionesCarterasContabilidad));	
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonEliminarCobrarConciliacionesCarterasContabilidad.setVisible((this.isVisibilidadCeldaEliminarCobrarConciliacionesCarterasContabilidad && this.isPermisoEliminarCobrarConciliacionesCarterasContabilidad));
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonCancelarCobrarConciliacionesCarterasContabilidad.setVisible(this.isVisibilidadCeldaCancelarCobrarConciliacionesCarterasContabilidad);							
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonGuardarCambiosCobrarConciliacionesCarterasContabilidad.setVisible((this.isVisibilidadCeldaGuardarCobrarConciliacionesCarterasContabilidad && this.isPermisoGuardarCambiosCobrarConciliacionesCarterasContabilidad));			
			
			}
						
			this.jButtonGuardarCambiosTablaCobrarConciliacionesCarterasContabilidad.setVisible((this.isVisibilidadCeldaGuardarCambiosCobrarConciliacionesCarterasContabilidad && this.isPermisoGuardarCambiosCobrarConciliacionesCarterasContabilidad));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCobrarConciliacionesCarterasContabilidad.setVisible((this.isVisibilidadCeldaNuevoCobrarConciliacionesCarterasContabilidad && this.isPermisoNuevoCobrarConciliacionesCarterasContabilidad));						
			this.jButtonDuplicarToolBarCobrarConciliacionesCarterasContabilidad.setVisible((this.isVisibilidadCeldaDuplicarCobrarConciliacionesCarterasContabilidad && this.isPermisoDuplicarCobrarConciliacionesCarterasContabilidad));						
			this.jButtonCopiarToolBarCobrarConciliacionesCarterasContabilidad.setVisible((this.isVisibilidadCeldaCopiarCobrarConciliacionesCarterasContabilidad && this.isPermisoCopiarCobrarConciliacionesCarterasContabilidad));			
			this.jButtonVerFormToolBarCobrarConciliacionesCarterasContabilidad.setVisible((this.isVisibilidadCeldaVerFormCobrarConciliacionesCarterasContabilidad && this.isPermisoVerFormCobrarConciliacionesCarterasContabilidad));			
			this.jButtonAbrirOrderByToolBarCobrarConciliacionesCarterasContabilidad.setVisible((this.isVisibilidadCeldaOrdenCobrarConciliacionesCarterasContabilidad && this.isPermisoOrdenCobrarConciliacionesCarterasContabilidad));
			this.jButtonNuevoRelacionesToolBarCobrarConciliacionesCarterasContabilidad.setVisible((this.isVisibilidadCeldaNuevoRelacionesCobrarConciliacionesCarterasContabilidad && this.isPermisoNuevoCobrarConciliacionesCarterasContabilidad));			
			this.jButtonNuevoGuardarCambiosToolBarCobrarConciliacionesCarterasContabilidad.setVisible((this.isVisibilidadCeldaNuevoCobrarConciliacionesCarterasContabilidad && this.isPermisoNuevoCobrarConciliacionesCarterasContabilidad && this.isPermisoGuardarCambiosCobrarConciliacionesCarterasContabilidad));			
			
			if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) {
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonModificarToolBarCobrarConciliacionesCarterasContabilidad.setVisible((this.isVisibilidadCeldaModificarCobrarConciliacionesCarterasContabilidad && this.isPermisoActualizarCobrarConciliacionesCarterasContabilidad));	
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonActualizarToolBarCobrarConciliacionesCarterasContabilidad.setVisible((this.isVisibilidadCeldaActualizarCobrarConciliacionesCarterasContabilidad  && this.isPermisoActualizarCobrarConciliacionesCarterasContabilidad));	
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonEliminarToolBarCobrarConciliacionesCarterasContabilidad.setVisible((this.isVisibilidadCeldaEliminarCobrarConciliacionesCarterasContabilidad && this.isPermisoEliminarCobrarConciliacionesCarterasContabilidad));
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonCancelarToolBarCobrarConciliacionesCarterasContabilidad.setVisible(this.isVisibilidadCeldaCancelarCobrarConciliacionesCarterasContabilidad);				
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonGuardarCambiosToolBarCobrarConciliacionesCarterasContabilidad.setVisible((this.isVisibilidadCeldaGuardarCobrarConciliacionesCarterasContabilidad && this.isPermisoGuardarCambiosCobrarConciliacionesCarterasContabilidad));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCobrarConciliacionesCarterasContabilidad.setVisible((this.isVisibilidadCeldaGuardarCambiosCobrarConciliacionesCarterasContabilidad && this.isPermisoGuardarCambiosCobrarConciliacionesCarterasContabilidad));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCobrarConciliacionesCarterasContabilidad.setVisible((this.isVisibilidadCeldaNuevoCobrarConciliacionesCarterasContabilidad && this.isPermisoNuevoCobrarConciliacionesCarterasContabilidad));			
			this.jMenuItemDuplicarCobrarConciliacionesCarterasContabilidad.setVisible((this.isVisibilidadCeldaDuplicarCobrarConciliacionesCarterasContabilidad && this.isPermisoDuplicarCobrarConciliacionesCarterasContabilidad));			
			this.jMenuItemCopiarCobrarConciliacionesCarterasContabilidad.setVisible((this.isVisibilidadCeldaCopiarCobrarConciliacionesCarterasContabilidad && this.isPermisoCopiarCobrarConciliacionesCarterasContabilidad));			
			this.jMenuItemVerFormCobrarConciliacionesCarterasContabilidad.setVisible((this.isVisibilidadCeldaVerFormCobrarConciliacionesCarterasContabilidad && this.isPermisoVerFormCobrarConciliacionesCarterasContabilidad));			
			this.jMenuItemAbrirOrderByCobrarConciliacionesCarterasContabilidad.setVisible((this.isVisibilidadCeldaOrdenCobrarConciliacionesCarterasContabilidad && this.isPermisoOrdenCobrarConciliacionesCarterasContabilidad));			
			//this.jMenuItemMostrarOcultarCobrarConciliacionesCarterasContabilidad.setVisible((this.isVisibilidadCeldaOrdenCobrarConciliacionesCarterasContabilidad && this.isPermisoOrdenCobrarConciliacionesCarterasContabilidad));
			this.jMenuItemDetalleAbrirOrderByCobrarConciliacionesCarterasContabilidad.setVisible((this.isVisibilidadCeldaOrdenCobrarConciliacionesCarterasContabilidad && this.isPermisoOrdenCobrarConciliacionesCarterasContabilidad));			
			//this.jMenuItemDetalleMostrarOcultarCobrarConciliacionesCarterasContabilidad.setVisible((this.isVisibilidadCeldaOrdenCobrarConciliacionesCarterasContabilidad && this.isPermisoOrdenCobrarConciliacionesCarterasContabilidad));			
			this.jMenuItemNuevoRelacionesCobrarConciliacionesCarterasContabilidad.setVisible((this.isVisibilidadCeldaNuevoRelacionesCobrarConciliacionesCarterasContabilidad && this.isPermisoNuevoCobrarConciliacionesCarterasContabilidad));			
			this.jMenuItemNuevoGuardarCambiosCobrarConciliacionesCarterasContabilidad.setVisible((this.isVisibilidadCeldaNuevoCobrarConciliacionesCarterasContabilidad && this.isPermisoNuevoCobrarConciliacionesCarterasContabilidad && this.isPermisoGuardarCambiosCobrarConciliacionesCarterasContabilidad));									
			
			if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) {
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jMenuItemModificarCobrarConciliacionesCarterasContabilidad.setVisible((this.isVisibilidadCeldaModificarCobrarConciliacionesCarterasContabilidad && this.isPermisoActualizarCobrarConciliacionesCarterasContabilidad));	
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jMenuItemActualizarCobrarConciliacionesCarterasContabilidad.setVisible((this.isVisibilidadCeldaActualizarCobrarConciliacionesCarterasContabilidad && this.isPermisoActualizarCobrarConciliacionesCarterasContabilidad));	
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jMenuItemEliminarCobrarConciliacionesCarterasContabilidad.setVisible((this.isVisibilidadCeldaEliminarCobrarConciliacionesCarterasContabilidad && this.isPermisoEliminarCobrarConciliacionesCarterasContabilidad));
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jMenuItemCancelarCobrarConciliacionesCarterasContabilidad.setVisible(this.isVisibilidadCeldaCancelarCobrarConciliacionesCarterasContabilidad);				
			}
			
			this.jMenuItemGuardarCambiosCobrarConciliacionesCarterasContabilidad.setVisible((this.isVisibilidadCeldaGuardarCobrarConciliacionesCarterasContabilidad && this.isPermisoGuardarCambiosCobrarConciliacionesCarterasContabilidad));						
			this.jMenuItemGuardarCambiosTablaCobrarConciliacionesCarterasContabilidad.setVisible((this.isVisibilidadCeldaGuardarCambiosCobrarConciliacionesCarterasContabilidad && this.isPermisoGuardarCambiosCobrarConciliacionesCarterasContabilidad));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCobrarConciliacionesCarterasContabilidad=this.jButtonNuevoCobrarConciliacionesCarterasContabilidad.isVisible();
			this.isVisibilidadCeldaDuplicarCobrarConciliacionesCarterasContabilidad=this.jButtonDuplicarCobrarConciliacionesCarterasContabilidad.isVisible();
			this.isVisibilidadCeldaCopiarCobrarConciliacionesCarterasContabilidad=this.jButtonCopiarCobrarConciliacionesCarterasContabilidad.isVisible();
			this.isVisibilidadCeldaVerFormCobrarConciliacionesCarterasContabilidad=this.jButtonVerFormCobrarConciliacionesCarterasContabilidad.isVisible();
			
			this.isVisibilidadCeldaOrdenCobrarConciliacionesCarterasContabilidad=this.jButtonAbrirOrderByCobrarConciliacionesCarterasContabilidad.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCobrarConciliacionesCarterasContabilidad=this.jButtonNuevoRelacionesCobrarConciliacionesCarterasContabilidad.isVisible();
			this.isVisibilidadCeldaModificarCobrarConciliacionesCarterasContabilidad=this.jButtonModificarCobrarConciliacionesCarterasContabilidad.isVisible();
			
			if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) {
			this.isVisibilidadCeldaActualizarCobrarConciliacionesCarterasContabilidad=this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonActualizarCobrarConciliacionesCarterasContabilidad.isVisible();
			this.isVisibilidadCeldaEliminarCobrarConciliacionesCarterasContabilidad=this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonEliminarCobrarConciliacionesCarterasContabilidad.isVisible();
			this.isVisibilidadCeldaCancelarCobrarConciliacionesCarterasContabilidad=this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonCancelarCobrarConciliacionesCarterasContabilidad.isVisible();
			this.isVisibilidadCeldaGuardarCobrarConciliacionesCarterasContabilidad=this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonGuardarCambiosCobrarConciliacionesCarterasContabilidad.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCobrarConciliacionesCarterasContabilidad=this.jButtonGuardarCambiosTablaCobrarConciliacionesCarterasContabilidad.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCobrarConciliacionesCarterasContabilidad=this.jButtonNuevoToolBarCobrarConciliacionesCarterasContabilidad.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCobrarConciliacionesCarterasContabilidad=this.jButtonNuevoRelacionesToolBarCobrarConciliacionesCarterasContabilidad.isVisible();
			
			if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) {
			this.isVisibilidadCeldaModificarCobrarConciliacionesCarterasContabilidad=this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonModificarToolBarCobrarConciliacionesCarterasContabilidad.isVisible();
			this.isVisibilidadCeldaActualizarCobrarConciliacionesCarterasContabilidad=this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonActualizarToolBarCobrarConciliacionesCarterasContabilidad.isVisible();
			this.isVisibilidadCeldaEliminarCobrarConciliacionesCarterasContabilidad=this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonEliminarToolBarCobrarConciliacionesCarterasContabilidad.isVisible();
			this.isVisibilidadCeldaCancelarCobrarConciliacionesCarterasContabilidad=this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonCancelarToolBarCobrarConciliacionesCarterasContabilidad.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCobrarConciliacionesCarterasContabilidad=this.jButtonGuardarCambiosToolBarCobrarConciliacionesCarterasContabilidad.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCobrarConciliacionesCarterasContabilidad=this.jButtonGuardarCambiosTablaToolBarCobrarConciliacionesCarterasContabilidad.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCobrarConciliacionesCarterasContabilidad=this.jMenuItemNuevoCobrarConciliacionesCarterasContabilidad.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCobrarConciliacionesCarterasContabilidad=this.jMenuItemNuevoRelacionesCobrarConciliacionesCarterasContabilidad.isVisible();
			
			if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) {
			this.isVisibilidadCeldaModificarCobrarConciliacionesCarterasContabilidad=this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jMenuItemModificarCobrarConciliacionesCarterasContabilidad.isVisible();
			this.isVisibilidadCeldaActualizarCobrarConciliacionesCarterasContabilidad=this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jMenuItemActualizarCobrarConciliacionesCarterasContabilidad.isVisible();
			this.isVisibilidadCeldaEliminarCobrarConciliacionesCarterasContabilidad=this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jMenuItemEliminarCobrarConciliacionesCarterasContabilidad.isVisible();
			this.isVisibilidadCeldaCancelarCobrarConciliacionesCarterasContabilidad=this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jMenuItemCancelarCobrarConciliacionesCarterasContabilidad.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCobrarConciliacionesCarterasContabilidad=this.jMenuItemGuardarCambiosCobrarConciliacionesCarterasContabilidad.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCobrarConciliacionesCarterasContabilidad=this.jMenuItemGuardarCambiosTablaCobrarConciliacionesCarterasContabilidad.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCobrarConciliacionesCarterasContabilidad(Boolean esInicializar) {
		if(CobrarConciliacionesCarterasContabilidadJInternalFrame.ISBINDING_MANUAL) {			
			if(this.cobrarconciliacionescarterascontabilidadSessionBean.getConGuardarRelaciones()) {
				//if(this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCobrarConciliacionesCarterasContabilidad();
			}
			
			this.inicializarActualizarBindingBotonesManualCobrarConciliacionesCarterasContabilidad(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCobrarConciliacionesCarterasContabilidad() {
		this.jButtonNuevoCobrarConciliacionesCarterasContabilidad.setVisible(this.isPermisoNuevoCobrarConciliacionesCarterasContabilidad);			
		this.jButtonDuplicarCobrarConciliacionesCarterasContabilidad.setVisible(this.isPermisoDuplicarCobrarConciliacionesCarterasContabilidad);			
		this.jButtonCopiarCobrarConciliacionesCarterasContabilidad.setVisible(this.isPermisoCopiarCobrarConciliacionesCarterasContabilidad);			
		this.jButtonVerFormCobrarConciliacionesCarterasContabilidad.setVisible(this.isPermisoVerFormCobrarConciliacionesCarterasContabilidad);			
		
		this.jButtonAbrirOrderByCobrarConciliacionesCarterasContabilidad.setVisible(this.isPermisoOrdenCobrarConciliacionesCarterasContabilidad);					
		
		this.jButtonNuevoRelacionesCobrarConciliacionesCarterasContabilidad.setVisible(this.isPermisoNuevoCobrarConciliacionesCarterasContabilidad);			
		
		if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonModificarCobrarConciliacionesCarterasContabilidad.setVisible(this.isPermisoActualizarCobrarConciliacionesCarterasContabilidad);	
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonActualizarCobrarConciliacionesCarterasContabilidad.setVisible(this.isPermisoActualizarCobrarConciliacionesCarterasContabilidad);	
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonEliminarCobrarConciliacionesCarterasContabilidad.setVisible(this.isPermisoEliminarCobrarConciliacionesCarterasContabilidad);
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonCancelarCobrarConciliacionesCarterasContabilidad.setVisible(this.isVisibilidadCeldaCancelarCobrarConciliacionesCarterasContabilidad);						
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonGuardarCambiosCobrarConciliacionesCarterasContabilidad.setVisible(this.isPermisoGuardarCambiosCobrarConciliacionesCarterasContabilidad);							
		}
		
		this.jButtonGuardarCambiosTablaCobrarConciliacionesCarterasContabilidad.setVisible(this.isPermisoActualizarCobrarConciliacionesCarterasContabilidad);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCobrarConciliacionesCarterasContabilidad() {
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonModificarCobrarConciliacionesCarterasContabilidad.setVisible(this.isPermisoActualizarCobrarConciliacionesCarterasContabilidad);	
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonActualizarCobrarConciliacionesCarterasContabilidad.setVisible(this.isPermisoActualizarCobrarConciliacionesCarterasContabilidad);	
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonEliminarCobrarConciliacionesCarterasContabilidad.setVisible(this.isPermisoEliminarCobrarConciliacionesCarterasContabilidad);
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonCancelarCobrarConciliacionesCarterasContabilidad.setVisible(this.isVisibilidadCeldaCancelarCobrarConciliacionesCarterasContabilidad);							
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonGuardarCambiosCobrarConciliacionesCarterasContabilidad.setVisible((this.isVisibilidadCeldaGuardarCobrarConciliacionesCarterasContabilidad && this.isPermisoGuardarCambiosCobrarConciliacionesCarterasContabilidad));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCobrarConciliacionesCarterasContabilidad() {
		if(CobrarConciliacionesCarterasContabilidadJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCobrarConciliacionesCarterasContabilidad();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCobrarConciliacionesCarterasContabilidad() {
	}
	
	public void jTableDatosCobrarConciliacionesCarterasContabilidadListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCobrarConciliacionesCarterasContabilidad(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCobrarConciliacionesCarterasContabilidadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarConciliacionesCarterasContabilidad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarConciliacionesCarterasContabilidad(this.getcobrarconciliacionescarterascontabilidad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarconciliacionescarterascontabilidad =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads().toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarconciliacionescarterascontabilidad =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidads.toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarconciliacionescarterascontabilidad==null) {
						this.cobrarconciliacionescarterascontabilidad = new CobrarConciliacionesCarterasContabilidad();
					}

					this.setVariablesFormularioToObjetoActualCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidad);
				}

				if(this.cobrarconciliacionescarterascontabilidad.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.cobrarconciliacionescarterascontabilidad.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarConciliacionesCarterasContabilidad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaCobrarConciliacionesCarterasContabilidadUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarconciliacionescarterascontabilidadLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebCobrarConciliacionesCarterasContabilidad(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarConciliacionesCarterasContabilidad.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCobrarConciliacionesCarterasContabilidad.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCobrarConciliacionesCarterasContabilidad.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidad =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads().toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cobrarconciliacionescarterascontabilidad =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidads.toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCobrarConciliacionesCarterasContabilidad(this.getcobrarconciliacionescarterascontabilidad(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidad);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.cobrarconciliacionescarterascontabilidadLogic.getConnexion());

				if(this.cobrarconciliacionescarterascontabilidad.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.cobrarconciliacionescarterascontabilidad.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCobrarConciliacionesCarterasContabilidad=(TitledBorder)this.jScrollPanelDatosCobrarConciliacionesCarterasContabilidad.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderCobrarConciliacionesCarterasContabilidad.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarconciliacionescarterascontabilidadLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarconciliacionescarterascontabilidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarconciliacionescarterascontabilidadLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaCobrarConciliacionesCarterasContabilidadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarConciliacionesCarterasContabilidad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarConciliacionesCarterasContabilidad(this.getcobrarconciliacionescarterascontabilidad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarconciliacionescarterascontabilidad =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads().toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarconciliacionescarterascontabilidad =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidads.toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarconciliacionescarterascontabilidad==null) {
						this.cobrarconciliacionescarterascontabilidad = new CobrarConciliacionesCarterasContabilidad();
					}

					this.setVariablesFormularioToObjetoActualCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidad);
				}

				if(this.cobrarconciliacionescarterascontabilidad.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.cobrarconciliacionescarterascontabilidad.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarConciliacionesCarterasContabilidad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contableCobrarConciliacionesCarterasContabilidadUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarconciliacionescarterascontabilidadLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontable=true;

			idTienePermisocuentacontable=this.tienePermisosUsuarioEnPaginaWebCobrarConciliacionesCarterasContabilidad(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontable) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarConciliacionesCarterasContabilidad.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCobrarConciliacionesCarterasContabilidad.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCobrarConciliacionesCarterasContabilidad.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidad =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads().toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cobrarconciliacionescarterascontabilidad =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidads.toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCobrarConciliacionesCarterasContabilidad(this.getcobrarconciliacionescarterascontabilidad(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidad);

				this.cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontableBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.cobrarconciliacionescarterascontabilidadLogic.getConnexion());

				if(this.cobrarconciliacionescarterascontabilidad.getid_cuenta_contable()!=null) {
					this.cuentacontableBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontableBeanSwingJInternalFrame.setIdActual(this.cobrarconciliacionescarterascontabilidad.getid_cuenta_contable());
					this.cuentacontableBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontableBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCobrarConciliacionesCarterasContabilidad=(TitledBorder)this.jScrollPanelDatosCobrarConciliacionesCarterasContabilidad.getBorder();
				TitledBorder titledBordercuentacontable=(TitledBorder)this.cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontable.setTitle(titledBorderCobrarConciliacionesCarterasContabilidad.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarconciliacionescarterascontabilidadLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarconciliacionescarterascontabilidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarconciliacionescarterascontabilidadLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contableCobrarConciliacionesCarterasContabilidadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarConciliacionesCarterasContabilidad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarConciliacionesCarterasContabilidad(this.getcobrarconciliacionescarterascontabilidad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarconciliacionescarterascontabilidad =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads().toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarconciliacionescarterascontabilidad =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidads.toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarconciliacionescarterascontabilidad==null) {
						this.cobrarconciliacionescarterascontabilidad = new CobrarConciliacionesCarterasContabilidad();
					}

					this.setVariablesFormularioToObjetoActualCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidad);
				}

				if(this.cobrarconciliacionescarterascontabilidad.getid_cuenta_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable = "+this.cobrarconciliacionescarterascontabilidad.getid_cuenta_contable().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarConciliacionesCarterasContabilidad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_desdeCobrarConciliacionesCarterasContabilidadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarConciliacionesCarterasContabilidad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarConciliacionesCarterasContabilidad(this.getcobrarconciliacionescarterascontabilidad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarconciliacionescarterascontabilidad =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads().toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarconciliacionescarterascontabilidad =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidads.toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarconciliacionescarterascontabilidad==null) {
						this.cobrarconciliacionescarterascontabilidad = new CobrarConciliacionesCarterasContabilidad();
					}

					this.setVariablesFormularioToObjetoActualCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidad);
				}

				if(this.cobrarconciliacionescarterascontabilidad.getfecha_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_desde = '"+Funciones2.getStringPostgresDate(this.cobrarconciliacionescarterascontabilidad.getfecha_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarConciliacionesCarterasContabilidad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_hastaCobrarConciliacionesCarterasContabilidadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarConciliacionesCarterasContabilidad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarConciliacionesCarterasContabilidad(this.getcobrarconciliacionescarterascontabilidad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarconciliacionescarterascontabilidad =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads().toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarconciliacionescarterascontabilidad =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidads.toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarconciliacionescarterascontabilidad==null) {
						this.cobrarconciliacionescarterascontabilidad = new CobrarConciliacionesCarterasContabilidad();
					}

					this.setVariablesFormularioToObjetoActualCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidad);
				}

				if(this.cobrarconciliacionescarterascontabilidad.getfecha_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_hasta = '"+Funciones2.getStringPostgresDate(this.cobrarconciliacionescarterascontabilidad.getfecha_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarConciliacionesCarterasContabilidad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoCobrarConciliacionesCarterasContabilidadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarConciliacionesCarterasContabilidad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarConciliacionesCarterasContabilidad(this.getcobrarconciliacionescarterascontabilidad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarconciliacionescarterascontabilidad =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads().toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarconciliacionescarterascontabilidad =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidads.toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarconciliacionescarterascontabilidad==null) {
						this.cobrarconciliacionescarterascontabilidad = new CobrarConciliacionesCarterasContabilidad();
					}

					this.setVariablesFormularioToObjetoActualCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidad);
				}

				if(this.cobrarconciliacionescarterascontabilidad.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.cobrarconciliacionescarterascontabilidad.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarConciliacionesCarterasContabilidad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarConciliacionesCarterasContabilidad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarConciliacionesCarterasContabilidad(this.getcobrarconciliacionescarterascontabilidad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarconciliacionescarterascontabilidad =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads().toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarconciliacionescarterascontabilidad =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidads.toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarconciliacionescarterascontabilidad==null) {
						this.cobrarconciliacionescarterascontabilidad = new CobrarConciliacionesCarterasContabilidad();
					}

					this.setVariablesFormularioToObjetoActualCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidad);
				}

				if(this.cobrarconciliacionescarterascontabilidad.getcodigo_tipo_movimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_tipo_movimiento like '%"+this.cobrarconciliacionescarterascontabilidad.getcodigo_tipo_movimiento()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarConciliacionesCarterasContabilidad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_mayorCobrarConciliacionesCarterasContabilidadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarConciliacionesCarterasContabilidad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarConciliacionesCarterasContabilidad(this.getcobrarconciliacionescarterascontabilidad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarconciliacionescarterascontabilidad =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads().toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarconciliacionescarterascontabilidad =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidads.toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarconciliacionescarterascontabilidad==null) {
						this.cobrarconciliacionescarterascontabilidad = new CobrarConciliacionesCarterasContabilidad();
					}

					this.setVariablesFormularioToObjetoActualCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidad);
				}

				if(this.cobrarconciliacionescarterascontabilidad.getnumero_mayor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_mayor like '%"+this.cobrarconciliacionescarterascontabilidad.getnumero_mayor()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarConciliacionesCarterasContabilidad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondebito_asientoCobrarConciliacionesCarterasContabilidadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarConciliacionesCarterasContabilidad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarConciliacionesCarterasContabilidad(this.getcobrarconciliacionescarterascontabilidad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarconciliacionescarterascontabilidad =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads().toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarconciliacionescarterascontabilidad =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidads.toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarconciliacionescarterascontabilidad==null) {
						this.cobrarconciliacionescarterascontabilidad = new CobrarConciliacionesCarterasContabilidad();
					}

					this.setVariablesFormularioToObjetoActualCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidad);
				}

				if(this.cobrarconciliacionescarterascontabilidad.getdebito_asiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where debito_asiento = "+this.cobrarconciliacionescarterascontabilidad.getdebito_asiento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarConciliacionesCarterasContabilidad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncredito_asientoCobrarConciliacionesCarterasContabilidadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarConciliacionesCarterasContabilidad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarConciliacionesCarterasContabilidad(this.getcobrarconciliacionescarterascontabilidad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarconciliacionescarterascontabilidad =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads().toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarconciliacionescarterascontabilidad =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidads.toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarconciliacionescarterascontabilidad==null) {
						this.cobrarconciliacionescarterascontabilidad = new CobrarConciliacionesCarterasContabilidad();
					}

					this.setVariablesFormularioToObjetoActualCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidad);
				}

				if(this.cobrarconciliacionescarterascontabilidad.getcredito_asiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where credito_asiento = "+this.cobrarconciliacionescarterascontabilidad.getcredito_asiento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarConciliacionesCarterasContabilidad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondebito_cuentasCobrarConciliacionesCarterasContabilidadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarConciliacionesCarterasContabilidad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarConciliacionesCarterasContabilidad(this.getcobrarconciliacionescarterascontabilidad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarconciliacionescarterascontabilidad =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads().toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarconciliacionescarterascontabilidad =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidads.toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarconciliacionescarterascontabilidad==null) {
						this.cobrarconciliacionescarterascontabilidad = new CobrarConciliacionesCarterasContabilidad();
					}

					this.setVariablesFormularioToObjetoActualCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidad);
				}

				if(this.cobrarconciliacionescarterascontabilidad.getdebito_cuentas()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where debito_cuentas = "+this.cobrarconciliacionescarterascontabilidad.getdebito_cuentas().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarConciliacionesCarterasContabilidad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncredito_cuentasCobrarConciliacionesCarterasContabilidadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarConciliacionesCarterasContabilidad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarConciliacionesCarterasContabilidad(this.getcobrarconciliacionescarterascontabilidad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarconciliacionescarterascontabilidad =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads().toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarconciliacionescarterascontabilidad =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidads.toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarconciliacionescarterascontabilidad==null) {
						this.cobrarconciliacionescarterascontabilidad = new CobrarConciliacionesCarterasContabilidad();
					}

					this.setVariablesFormularioToObjetoActualCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidad);
				}

				if(this.cobrarconciliacionescarterascontabilidad.getcredito_cuentas()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where credito_cuentas = "+this.cobrarconciliacionescarterascontabilidad.getcredito_cuentas().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarConciliacionesCarterasContabilidad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidadActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarconciliacionescarterascontabilidadLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCobrarConciliacionesCarterasContabilidad(false,false);

			this.getCobrarConciliacionesCarterasContabilidadsBusquedaCobrarConciliacionesCarterasContabilidad();

			this.inicializarActualizarBindingCobrarConciliacionesCarterasContabilidad(false);

			//if(CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCobrarConciliacionesCarterasContabilidad(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarconciliacionescarterascontabilidadLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarconciliacionescarterascontabilidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarconciliacionescarterascontabilidadLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCuentaContableCobrarConciliacionesCarterasContabilidadActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarconciliacionescarterascontabilidadLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCobrarConciliacionesCarterasContabilidad(false,false);

			this.getCobrarConciliacionesCarterasContabilidadsFK_IdCuentaContable();

			this.inicializarActualizarBindingCobrarConciliacionesCarterasContabilidad(false);

			//if(CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCobrarConciliacionesCarterasContabilidad(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarconciliacionescarterascontabilidadLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarconciliacionescarterascontabilidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarconciliacionescarterascontabilidadLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaCobrarConciliacionesCarterasContabilidadActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarconciliacionescarterascontabilidadLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCobrarConciliacionesCarterasContabilidad(false,false);

			this.getCobrarConciliacionesCarterasContabilidadsFK_IdEmpresa();

			this.inicializarActualizarBindingCobrarConciliacionesCarterasContabilidad(false);

			//if(CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCobrarConciliacionesCarterasContabilidad(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarconciliacionescarterascontabilidadLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarconciliacionescarterascontabilidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarconciliacionescarterascontabilidadLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameCobrarConciliacionesCarterasContabilidad() {
		if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) {
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.setVisible(false);	    			
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.dispose();
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad!=null) {
			this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.dispose();
			this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad=null;
		}
		
		if(this.jInternalFrameImportacionCobrarConciliacionesCarterasContabilidad!=null) {
			this.jInternalFrameImportacionCobrarConciliacionesCarterasContabilidad.setVisible(false);	    			
			this.jInternalFrameImportacionCobrarConciliacionesCarterasContabilidad.dispose();
			this.jInternalFrameImportacionCobrarConciliacionesCarterasContabilidad=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCobrarConciliacionesCarterasContabilidad();
			
			CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarconciliacionescarterascontabilidad,new Object(),this.cobrarconciliacionescarterascontabilidadParameterGeneral,this.cobrarconciliacionescarterascontabilidadReturnGeneral);
			
			
			if(sTipo.equals("NuevoCobrarConciliacionesCarterasContabilidad")) {
				jButtonNuevoCobrarConciliacionesCarterasContabilidadActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCobrarConciliacionesCarterasContabilidad")) {
				jButtonDuplicarCobrarConciliacionesCarterasContabilidadActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCobrarConciliacionesCarterasContabilidad")) {
				jButtonCopiarCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
			} else if(sTipo.equals("VerFormCobrarConciliacionesCarterasContabilidad")) {
				jButtonVerFormCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCobrarConciliacionesCarterasContabilidad")) {
				jButtonNuevoCobrarConciliacionesCarterasContabilidadActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCobrarConciliacionesCarterasContabilidad")) {
				jButtonDuplicarCobrarConciliacionesCarterasContabilidadActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCobrarConciliacionesCarterasContabilidad")) {
				jButtonNuevoCobrarConciliacionesCarterasContabilidadActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCobrarConciliacionesCarterasContabilidad")) {
				jButtonDuplicarCobrarConciliacionesCarterasContabilidadActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCobrarConciliacionesCarterasContabilidad")) {
				jButtonNuevoCobrarConciliacionesCarterasContabilidadActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCobrarConciliacionesCarterasContabilidad")) {
				jButtonNuevoCobrarConciliacionesCarterasContabilidadActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCobrarConciliacionesCarterasContabilidad")) {
				jButtonNuevoCobrarConciliacionesCarterasContabilidadActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCobrarConciliacionesCarterasContabilidad")) {
				jButtonModificarCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCobrarConciliacionesCarterasContabilidad")) {
				jButtonModificarCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCobrarConciliacionesCarterasContabilidad")) {
				jButtonModificarCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCobrarConciliacionesCarterasContabilidad")) {
				jButtonActualizarCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCobrarConciliacionesCarterasContabilidad")) {
				jButtonActualizarCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCobrarConciliacionesCarterasContabilidad")) {
				jButtonActualizarCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
			} else if(sTipo.equals("EliminarCobrarConciliacionesCarterasContabilidad")) {
				jButtonEliminarCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCobrarConciliacionesCarterasContabilidad")) {
				jButtonEliminarCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCobrarConciliacionesCarterasContabilidad")) {
				jButtonEliminarCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
			} else if(sTipo.equals("CancelarCobrarConciliacionesCarterasContabilidad")) {
				jButtonCancelarCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCobrarConciliacionesCarterasContabilidad")) {
				jButtonCancelarCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCobrarConciliacionesCarterasContabilidad")) {
				jButtonCancelarCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
			} else if(sTipo.equals("CerrarCobrarConciliacionesCarterasContabilidad")) {
				jButtonCerrarCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCobrarConciliacionesCarterasContabilidad")) {
				jButtonCerrarCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCobrarConciliacionesCarterasContabilidad")) {
				jButtonCerrarCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCobrarConciliacionesCarterasContabilidad")) {
				jButtonMostrarOcultarCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCobrarConciliacionesCarterasContabilidad")) {
				jButtonCancelarCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCobrarConciliacionesCarterasContabilidad")) {
				jButtonGuardarCambiosCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCobrarConciliacionesCarterasContabilidad")) {
				jButtonGuardarCambiosCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCobrarConciliacionesCarterasContabilidad")) {
				jButtonCopiarCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCobrarConciliacionesCarterasContabilidad")) {
				jButtonVerFormCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCobrarConciliacionesCarterasContabilidad")) {
				jButtonGuardarCambiosCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCobrarConciliacionesCarterasContabilidad")) {
				jButtonCopiarCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCobrarConciliacionesCarterasContabilidad")) {
				jButtonVerFormCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCobrarConciliacionesCarterasContabilidad")) {
				jButtonGuardarCambiosCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCobrarConciliacionesCarterasContabilidad")) {
				jButtonGuardarCambiosCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCobrarConciliacionesCarterasContabilidad")) {
				jButtonGuardarCambiosCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCobrarConciliacionesCarterasContabilidad")) {
				jButtonRecargarInformacionCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCobrarConciliacionesCarterasContabilidad")) {
				jButtonRecargarInformacionCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCobrarConciliacionesCarterasContabilidad")) {
				jButtonRecargarInformacionCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresCobrarConciliacionesCarterasContabilidad")) {
				jButtonAnterioresCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCobrarConciliacionesCarterasContabilidad")) {
				jButtonAnterioresCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCobrarConciliacionesCarterasContabilidad")) {
				jButtonAnterioresCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCobrarConciliacionesCarterasContabilidad")) {
				jButtonSiguientesCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCobrarConciliacionesCarterasContabilidad")) {
				jButtonSiguientesCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCobrarConciliacionesCarterasContabilidad")) {
				jButtonSiguientesCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCobrarConciliacionesCarterasContabilidad") || sTipo.equals("MenuItemDetalleAbrirOrderByCobrarConciliacionesCarterasContabilidad")) {
				jButtonAbrirOrderByCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCobrarConciliacionesCarterasContabilidad") || sTipo.equals("MenuItemDetalleMostrarOcultarCobrarConciliacionesCarterasContabilidad")) {
				jButtonMostrarOcultarCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCobrarConciliacionesCarterasContabilidad")) {
				jButtonNuevoGuardarCambiosCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCobrarConciliacionesCarterasContabilidad")) {
				jButtonNuevoGuardarCambiosCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCobrarConciliacionesCarterasContabilidad")) {
				jButtonNuevoGuardarCambiosCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCobrarConciliacionesCarterasContabilidad")) {
				jButtonCerrarReporteDinamicoCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCobrarConciliacionesCarterasContabilidad")) {
				jButtonGenerarReporteDinamicoCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCobrarConciliacionesCarterasContabilidad")) {
				
				jButtonGenerarExcelReporteDinamicoCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCobrarConciliacionesCarterasContabilidad")) {
				jButtonCerrarImportacionCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCobrarConciliacionesCarterasContabilidad")) {
				
				jButtonGenerarImportacionCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCobrarConciliacionesCarterasContabilidad")) {
				
				jButtonAbrirImportacionCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCobrarConciliacionesCarterasContabilidad")) {
				jComboBoxTiposAccionesCobrarConciliacionesCarterasContabilidadActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCobrarConciliacionesCarterasContabilidad")) {
				jComboBoxTiposRelacionesCobrarConciliacionesCarterasContabilidadActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCobrarConciliacionesCarterasContabilidad")) {
				jComboBoxTiposAccionesCobrarConciliacionesCarterasContabilidadActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCobrarConciliacionesCarterasContabilidad")) {
				
				jComboBoxTiposSeleccionarCobrarConciliacionesCarterasContabilidadActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCobrarConciliacionesCarterasContabilidad")) {
				jTextFieldValorCampoGeneralCobrarConciliacionesCarterasContabilidadActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCobrarConciliacionesCarterasContabilidad")) {
				jButtonAbrirOrderByCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCobrarConciliacionesCarterasContabilidad")) {
				jButtonAbrirOrderByCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCobrarConciliacionesCarterasContabilidad")) {
				jButtonCerrarOrderByCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCobrarConciliacionesCarterasContabilidadBusqueda")) {
				this.jButtonidCobrarConciliacionesCarterasContabilidadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCobrarConciliacionesCarterasContabilidadUpdate")) {
				this.jButtonid_empresaCobrarConciliacionesCarterasContabilidadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCobrarConciliacionesCarterasContabilidadBusqueda")) {
				this.jButtonid_empresaCobrarConciliacionesCarterasContabilidadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contableCobrarConciliacionesCarterasContabilidadUpdate")) {
				this.jButtonid_cuenta_contableCobrarConciliacionesCarterasContabilidadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contableCobrarConciliacionesCarterasContabilidadBusqueda")) {
				this.jButtonid_cuenta_contableCobrarConciliacionesCarterasContabilidadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_desdeCobrarConciliacionesCarterasContabilidadBusqueda")) {
				this.jButtonfecha_desdeCobrarConciliacionesCarterasContabilidadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_hastaCobrarConciliacionesCarterasContabilidadBusqueda")) {
				this.jButtonfecha_hastaCobrarConciliacionesCarterasContabilidadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoCobrarConciliacionesCarterasContabilidadBusqueda")) {
				this.jButtoncodigoCobrarConciliacionesCarterasContabilidadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_tipo_movimientoCobrarConciliacionesCarterasContabilidadBusqueda")) {
				this.jButtoncodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_mayorCobrarConciliacionesCarterasContabilidadBusqueda")) {
				this.jButtonnumero_mayorCobrarConciliacionesCarterasContabilidadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("debito_asientoCobrarConciliacionesCarterasContabilidadBusqueda")) {
				this.jButtondebito_asientoCobrarConciliacionesCarterasContabilidadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("credito_asientoCobrarConciliacionesCarterasContabilidadBusqueda")) {
				this.jButtoncredito_asientoCobrarConciliacionesCarterasContabilidadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("debito_cuentasCobrarConciliacionesCarterasContabilidadBusqueda")) {
				this.jButtondebito_cuentasCobrarConciliacionesCarterasContabilidadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("credito_cuentasCobrarConciliacionesCarterasContabilidadBusqueda")) {
				this.jButtoncredito_cuentasCobrarConciliacionesCarterasContabilidadBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad")) {
				this.jButtonBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
			}
			
			;
			
			
			CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarconciliacionescarterascontabilidad,new Object(),this.cobrarconciliacionescarterascontabilidadParameterGeneral,this.cobrarconciliacionescarterascontabilidadReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCobrarConciliacionesCarterasContabilidad();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarConciliacionesCarterasContabilidadActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarconciliacionescarterascontabilidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarconciliacionescarterascontabilidad);
				
				CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarconciliacionescarterascontabilidad,new Object(),this.cobrarconciliacionescarterascontabilidadParameterGeneral,this.cobrarconciliacionescarterascontabilidadReturnGeneral);
				
				


				
				CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarconciliacionescarterascontabilidad,new Object(),this.cobrarconciliacionescarterascontabilidadParameterGeneral,this.cobrarconciliacionescarterascontabilidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarConciliacionesCarterasContabilidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarConciliacionesCarterasContabilidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidadLocal=null;
			
			if(!this.getEsControlTabla()) {
				cobrarconciliacionescarterascontabilidadLocal=this.cobrarconciliacionescarterascontabilidad;
			} else {
				cobrarconciliacionescarterascontabilidadLocal=this.cobrarconciliacionescarterascontabilidadAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarconciliacionescarterascontabilidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarconciliacionescarterascontabilidad);
				
				CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarconciliacionescarterascontabilidad,new Object(),this.cobrarconciliacionescarterascontabilidadParameterGeneral,this.cobrarconciliacionescarterascontabilidadReturnGeneral);
							
				
				


				
				CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarconciliacionescarterascontabilidad,new Object(),this.cobrarconciliacionescarterascontabilidadParameterGeneral,this.cobrarconciliacionescarterascontabilidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarConciliacionesCarterasContabilidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarConciliacionesCarterasContabilidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarConciliacionesCarterasContabilidadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarConciliacionesCarterasContabilidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidadAnterior =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads().toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarconciliacionescarterascontabilidadAnterior =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidads.toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
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
			
			CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarconciliacionescarterascontabilidad,new Object(),this.cobrarconciliacionescarterascontabilidadParameterGeneral,this.cobrarconciliacionescarterascontabilidadReturnGeneral);
			
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
			
			


			
			CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarconciliacionescarterascontabilidad,new Object(),this.cobrarconciliacionescarterascontabilidadParameterGeneral,this.cobrarconciliacionescarterascontabilidadReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarConciliacionesCarterasContabilidadActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarconciliacionescarterascontabilidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarconciliacionescarterascontabilidad);
				
				CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarconciliacionescarterascontabilidad,new Object(),this.cobrarconciliacionescarterascontabilidadParameterGeneral,this.cobrarconciliacionescarterascontabilidadReturnGeneral);
								
						
				


				
				CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarconciliacionescarterascontabilidad,new Object(),this.cobrarconciliacionescarterascontabilidadParameterGeneral,this.cobrarconciliacionescarterascontabilidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarConciliacionesCarterasContabilidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarConciliacionesCarterasContabilidad.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarconciliacionescarterascontabilidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarconciliacionescarterascontabilidad);
				
				CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarconciliacionescarterascontabilidad,new Object(),this.cobrarconciliacionescarterascontabilidadParameterGeneral,this.cobrarconciliacionescarterascontabilidadReturnGeneral);
								
				
				


				
				CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarconciliacionescarterascontabilidad,new Object(),this.cobrarconciliacionescarterascontabilidadParameterGeneral,this.cobrarconciliacionescarterascontabilidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarConciliacionesCarterasContabilidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarConciliacionesCarterasContabilidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarConciliacionesCarterasContabilidadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarConciliacionesCarterasContabilidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidadAnterior =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads().toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarconciliacionescarterascontabilidadAnterior =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidads.toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarconciliacionescarterascontabilidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarconciliacionescarterascontabilidad);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarConciliacionesCarterasContabilidadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarConciliacionesCarterasContabilidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidadAnterior =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads().toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarconciliacionescarterascontabilidadAnterior =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidads.toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarConciliacionesCarterasContabilidadActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarconciliacionescarterascontabilidad);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cobrarconciliacionescarterascontabilidad);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarconciliacionescarterascontabilidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarconciliacionescarterascontabilidad);
				
				CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarconciliacionescarterascontabilidad,new Object(),this.cobrarconciliacionescarterascontabilidadParameterGeneral,this.cobrarconciliacionescarterascontabilidadReturnGeneral);
							
				
				


				
				CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarconciliacionescarterascontabilidad,new Object(),this.cobrarconciliacionescarterascontabilidadParameterGeneral,this.cobrarconciliacionescarterascontabilidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarConciliacionesCarterasContabilidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarConciliacionesCarterasContabilidad.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarConciliacionesCarterasContabilidadActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCobrarConciliacionesCarterasContabilidad.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarconciliacionescarterascontabilidadAnterior =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads().toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cobrarconciliacionescarterascontabilidadAnterior =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidads.toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
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
			
			CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarconciliacionescarterascontabilidad,new Object(),this.cobrarconciliacionescarterascontabilidadParameterGeneral,this.cobrarconciliacionescarterascontabilidadReturnGeneral);
			
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
			
			


			
			CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarconciliacionescarterascontabilidad,new Object(),this.cobrarconciliacionescarterascontabilidadParameterGeneral,this.cobrarconciliacionescarterascontabilidadReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarConciliacionesCarterasContabilidadActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarconciliacionescarterascontabilidad);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cobrarconciliacionescarterascontabilidad);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarconciliacionescarterascontabilidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarconciliacionescarterascontabilidad);
				
				CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarconciliacionescarterascontabilidad,new Object(),this.cobrarconciliacionescarterascontabilidadParameterGeneral,this.cobrarconciliacionescarterascontabilidadReturnGeneral);
								
				
				


				
				CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarconciliacionescarterascontabilidad,new Object(),this.cobrarconciliacionescarterascontabilidadParameterGeneral,this.cobrarconciliacionescarterascontabilidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarConciliacionesCarterasContabilidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarConciliacionesCarterasContabilidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarConciliacionesCarterasContabilidadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarConciliacionesCarterasContabilidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidadAnterior =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads().toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarconciliacionescarterascontabilidadAnterior =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidads.toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarConciliacionesCarterasContabilidadActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarconciliacionescarterascontabilidad);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cobrarconciliacionescarterascontabilidad);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarConciliacionesCarterasContabilidadActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarconciliacionescarterascontabilidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarconciliacionescarterascontabilidad);
				
				CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarconciliacionescarterascontabilidad,new Object(),this.cobrarconciliacionescarterascontabilidadParameterGeneral,this.cobrarconciliacionescarterascontabilidadReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCobrarConciliacionesCarterasContabilidad")) {
					jCheckBoxSeleccionarTodosCobrarConciliacionesCarterasContabilidadItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCobrarConciliacionesCarterasContabilidad")) {
					jCheckBoxSeleccionadosCobrarConciliacionesCarterasContabilidadItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCobrarConciliacionesCarterasContabilidad")) {
					
				}
				
				


				
				
				CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarconciliacionescarterascontabilidad,new Object(),this.cobrarconciliacionescarterascontabilidadParameterGeneral,this.cobrarconciliacionescarterascontabilidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarConciliacionesCarterasContabilidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarConciliacionesCarterasContabilidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarconciliacionescarterascontabilidad);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.cobrarconciliacionescarterascontabilidad);
				
				CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarconciliacionescarterascontabilidad,new Object(),this.cobrarconciliacionescarterascontabilidadParameterGeneral,this.cobrarconciliacionescarterascontabilidadReturnGeneral);
												
				
				


				
				
				CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarconciliacionescarterascontabilidad,new Object(),this.cobrarconciliacionescarterascontabilidadParameterGeneral,this.cobrarconciliacionescarterascontabilidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarConciliacionesCarterasContabilidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarConciliacionesCarterasContabilidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarConciliacionesCarterasContabilidadActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCobrarConciliacionesCarterasContabilidad.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarconciliacionescarterascontabilidadAnterior =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads().toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cobrarconciliacionescarterascontabilidadAnterior =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidads.toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarConciliacionesCarterasContabilidadActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarconciliacionescarterascontabilidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarconciliacionescarterascontabilidad);
				
				CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarconciliacionescarterascontabilidad,new Object(),this.cobrarconciliacionescarterascontabilidadParameterGeneral,this.cobrarconciliacionescarterascontabilidadReturnGeneral);
				
				
				CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarconciliacionescarterascontabilidad,new Object(),this.cobrarconciliacionescarterascontabilidadParameterGeneral,this.cobrarconciliacionescarterascontabilidadReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
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
			
			CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cobrarconciliacionescarterascontabilidad,new Object(),this.cobrarconciliacionescarterascontabilidadParameterGeneral,this.cobrarconciliacionescarterascontabilidadReturnGeneral);
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
			
			


			
			CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarconciliacionescarterascontabilidad,new Object(),this.cobrarconciliacionescarterascontabilidadParameterGeneral,this.cobrarconciliacionescarterascontabilidadReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarConciliacionesCarterasContabilidadActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarconciliacionescarterascontabilidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarconciliacionescarterascontabilidad);
				
				CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cobrarconciliacionescarterascontabilidad,new Object(),this.cobrarconciliacionescarterascontabilidadParameterGeneral,this.cobrarconciliacionescarterascontabilidadReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarconciliacionescarterascontabilidad,new Object(),this.cobrarconciliacionescarterascontabilidadParameterGeneral,this.cobrarconciliacionescarterascontabilidadReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarConciliacionesCarterasContabilidad.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarConciliacionesCarterasContabilidad.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarconciliacionescarterascontabilidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarconciliacionescarterascontabilidad);
				
				CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cobrarconciliacionescarterascontabilidad,new Object(),this.cobrarconciliacionescarterascontabilidadParameterGeneral,this.cobrarconciliacionescarterascontabilidadReturnGeneral);
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
				
				


				
				CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarconciliacionescarterascontabilidad,new Object(),this.cobrarconciliacionescarterascontabilidadParameterGeneral,this.cobrarconciliacionescarterascontabilidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarConciliacionesCarterasContabilidad.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarConciliacionesCarterasContabilidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarConciliacionesCarterasContabilidadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarConciliacionesCarterasContabilidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarconciliacionescarterascontabilidadAnterior =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads().toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarconciliacionescarterascontabilidadAnterior =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidads.toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarconciliacionescarterascontabilidad,new Object(),this.cobrarconciliacionescarterascontabilidadParameterGeneral,this.cobrarconciliacionescarterascontabilidadReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCobrarConciliacionesCarterasContabilidad")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCobrarConciliacionesCarterasContabilidadListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCobrarConciliacionesCarterasContabilidad.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.cobrarconciliacionescarterascontabilidad =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads().toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.cobrarconciliacionescarterascontabilidad =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidads.toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.cobrarconciliacionescarterascontabilidad);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCobrarConciliacionesCarterasContabilidad")) {
				
				}
				
				CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarconciliacionescarterascontabilidad,new Object(),this.cobrarconciliacionescarterascontabilidadParameterGeneral,this.cobrarconciliacionescarterascontabilidadReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cobrarconciliacionescarterascontabilidad,new Object(),this.cobrarconciliacionescarterascontabilidadParameterGeneral,this.cobrarconciliacionescarterascontabilidadReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCobrarConciliacionesCarterasContabilidad")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCobrarConciliacionesCarterasContabilidad.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCobrarConciliacionesCarterasContabilidad")) {
			
			}
			
			CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cobrarconciliacionescarterascontabilidad,new Object(),this.cobrarconciliacionescarterascontabilidadParameterGeneral,this.cobrarconciliacionescarterascontabilidadReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCobrarConciliacionesCarterasContabilidad();
			
			CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarconciliacionescarterascontabilidad,new Object(),this.cobrarconciliacionescarterascontabilidadParameterGeneral,this.cobrarconciliacionescarterascontabilidadReturnGeneral);
			
			if(sTipo.equals("NuevoCobrarConciliacionesCarterasContabilidad")) {
				jButtonNuevoCobrarConciliacionesCarterasContabilidadActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCobrarConciliacionesCarterasContabilidad")) {
				jButtonDuplicarCobrarConciliacionesCarterasContabilidadActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCobrarConciliacionesCarterasContabilidad")) {
				jButtonCopiarCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCobrarConciliacionesCarterasContabilidad")) {
				jButtonVerFormCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCobrarConciliacionesCarterasContabilidad")) {
				jButtonNuevoCobrarConciliacionesCarterasContabilidadActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCobrarConciliacionesCarterasContabilidad")) {
				jButtonModificarCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCobrarConciliacionesCarterasContabilidad")) {
				jButtonActualizarCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCobrarConciliacionesCarterasContabilidad")) {
				jButtonEliminarCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCobrarConciliacionesCarterasContabilidad")) {
				jButtonGuardarCambiosCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCobrarConciliacionesCarterasContabilidad")) {
				jButtonCancelarCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCobrarConciliacionesCarterasContabilidad")) {
				jButtonCerrarCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCobrarConciliacionesCarterasContabilidad")) {
				jButtonGuardarCambiosCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCobrarConciliacionesCarterasContabilidad")) {
				jButtonNuevoGuardarCambiosCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCobrarConciliacionesCarterasContabilidad")) {
				jButtonAbrirOrderByCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCobrarConciliacionesCarterasContabilidad")) {
				jButtonRecargarInformacionCobrarConciliacionesCarterasContabilidadActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCobrarConciliacionesCarterasContabilidad")) {
				jButtonAnterioresCobrarConciliacionesCarterasContabilidadActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCobrarConciliacionesCarterasContabilidad")) {
				jButtonSiguientesCobrarConciliacionesCarterasContabilidadActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCobrarConciliacionesCarterasContabilidadBusqueda")) {
				this.jButtonidCobrarConciliacionesCarterasContabilidadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCobrarConciliacionesCarterasContabilidadUpdate")) {
				this.jButtonid_empresaCobrarConciliacionesCarterasContabilidadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCobrarConciliacionesCarterasContabilidadBusqueda")) {
				this.jButtonid_empresaCobrarConciliacionesCarterasContabilidadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contableCobrarConciliacionesCarterasContabilidadUpdate")) {
				this.jButtonid_cuenta_contableCobrarConciliacionesCarterasContabilidadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contableCobrarConciliacionesCarterasContabilidadBusqueda")) {
				this.jButtonid_cuenta_contableCobrarConciliacionesCarterasContabilidadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_desdeCobrarConciliacionesCarterasContabilidadBusqueda")) {
				this.jButtonfecha_desdeCobrarConciliacionesCarterasContabilidadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_hastaCobrarConciliacionesCarterasContabilidadBusqueda")) {
				this.jButtonfecha_hastaCobrarConciliacionesCarterasContabilidadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoCobrarConciliacionesCarterasContabilidadBusqueda")) {
				this.jButtoncodigoCobrarConciliacionesCarterasContabilidadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_tipo_movimientoCobrarConciliacionesCarterasContabilidadBusqueda")) {
				this.jButtoncodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_mayorCobrarConciliacionesCarterasContabilidadBusqueda")) {
				this.jButtonnumero_mayorCobrarConciliacionesCarterasContabilidadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("debito_asientoCobrarConciliacionesCarterasContabilidadBusqueda")) {
				this.jButtondebito_asientoCobrarConciliacionesCarterasContabilidadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("credito_asientoCobrarConciliacionesCarterasContabilidadBusqueda")) {
				this.jButtoncredito_asientoCobrarConciliacionesCarterasContabilidadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("debito_cuentasCobrarConciliacionesCarterasContabilidadBusqueda")) {
				this.jButtondebito_cuentasCobrarConciliacionesCarterasContabilidadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("credito_cuentasCobrarConciliacionesCarterasContabilidadBusqueda")) {
				this.jButtoncredito_cuentasCobrarConciliacionesCarterasContabilidadBusquedaActionPerformed(evt);
			}
			
			CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarconciliacionescarterascontabilidad,new Object(),this.cobrarconciliacionescarterascontabilidadParameterGeneral,this.cobrarconciliacionescarterascontabilidadReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCobrarConciliacionesCarterasContabilidad();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cobrarconciliacionescarterascontabilidad,new Object(),this.cobrarconciliacionescarterascontabilidadParameterGeneral,this.cobrarconciliacionescarterascontabilidadReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCobrarConciliacionesCarterasContabilidad")) {
				closingInternalFrameCobrarConciliacionesCarterasContabilidad();
				
			} else if(sTipo.equals("jButtonCancelarCobrarConciliacionesCarterasContabilidad")) {
				JInternalFrameBase jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad = (JInternalFrameBase)evt.getSource();
	            	
	            CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrame jInternalFrameParent=(CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrame)jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCobrarConciliacionesCarterasContabilidadActionPerformed(null);
			}
			
			CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cobrarconciliacionescarterascontabilidad,new Object(),this.cobrarconciliacionescarterascontabilidadParameterGeneral,this.cobrarconciliacionescarterascontabilidadReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCobrarConciliacionesCarterasContabilidad(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCobrarConciliacionesCarterasContabilidad(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCobrarConciliacionesCarterasContabilidad(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.cobrarconciliacionescarterascontabilidad)) {
			if(!esControlTabla) {
				if(CobrarConciliacionesCarterasContabilidadJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidad,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidad);			
				}
				
				if(this.cobrarconciliacionescarterascontabilidadSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidad,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidadReturnGeneral,this.cobrarconciliacionescarterascontabilidadBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.cobrarconciliacionescarterascontabilidadSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCobrarConciliacionesCarterasContabilidad(classes,this.cobrarconciliacionescarterascontabilidadReturnGeneral,this.cobrarconciliacionescarterascontabilidadBean,false);
					}
						
					if(this.cobrarconciliacionescarterascontabilidadReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidadReturnGeneral.getCobrarConciliacionesCarterasContabilidad());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidadReturnGeneral.getCobrarConciliacionesCarterasContabilidad());	
					}
						
					if(this.cobrarconciliacionescarterascontabilidadReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidadReturnGeneral.getCobrarConciliacionesCarterasContabilidad(),classes);//this.cobrarconciliacionescarterascontabilidadBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidad,classes);//this.cobrarconciliacionescarterascontabilidadBean);									
				}
			
				if(CobrarConciliacionesCarterasContabilidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidad,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarConciliacionesCarterasContabilidad(this.cobrarconciliacionescarterascontabilidad);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.cobrarconciliacionescarterascontabilidadAnterior!=null) {
						this.cobrarconciliacionescarterascontabilidad=this.cobrarconciliacionescarterascontabilidadAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cobrarconciliacionescarterascontabilidadSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.cobrarconciliacionescarterascontabilidadReturnGeneral.getCobrarConciliacionesCarterasContabilidad(),cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.cobrarconciliacionescarterascontabilidadReturnGeneral.getCobrarConciliacionesCarterasContabilidad(),this.cobrarconciliacionescarterascontabilidads);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCobrarConciliacionesCarterasContabilidad.repaint();
				
				//((AbstractTableModel) this.jTableDatosCobrarConciliacionesCarterasContabilidad.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCobrarConciliacionesCarterasContabilidad();
			}
		}
	}
	
	public void actualizarVisualTableDatosCobrarConciliacionesCarterasContabilidad() throws Exception {
		
		CobrarConciliacionesCarterasContabilidadModel cobrarconciliacionescarterascontabilidadModel=(CobrarConciliacionesCarterasContabilidadModel)this.jTableDatosCobrarConciliacionesCarterasContabilidad.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cobrarconciliacionescarterascontabilidadModel.cobrarconciliacionescarterascontabilidads=this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			cobrarconciliacionescarterascontabilidadModel.cobrarconciliacionescarterascontabilidads=this.cobrarconciliacionescarterascontabilidads;
		}
		
		
		((CobrarConciliacionesCarterasContabilidadModel) this.jTableDatosCobrarConciliacionesCarterasContabilidad.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCobrarConciliacionesCarterasContabilidad() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcobrarconciliacionescarterascontabilidadAnterior(),this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcobrarconciliacionescarterascontabilidadAnterior(),this.cobrarconciliacionescarterascontabilidads);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCobrarConciliacionesCarterasContabilidad();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCobrarConciliacionesCarterasContabilidad(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidad,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
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
										
				CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cobrarconciliacionescarterascontabilidad,new Object(),generalEntityParameterGeneral,this.cobrarconciliacionescarterascontabilidadReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.cobrarconciliacionescarterascontabilidadSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CobrarConciliacionesCarterasContabilidadConstantesFunciones.getClassesRelationshipsOfCobrarConciliacionesCarterasContabilidad(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CobrarConciliacionesCarterasContabilidadConstantesFunciones.getClassesRelationshipsFromStringsOfCobrarConciliacionesCarterasContabilidad(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCobrarConciliacionesCarterasContabilidad(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cobrarconciliacionescarterascontabilidad,new Object(),generalEntityParameterGeneral,this.cobrarconciliacionescarterascontabilidadReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCobrarConciliacionesCarterasContabilidad(CobrarConciliacionesCarterasContabilidadBean cobrarconciliacionescarterascontabilidadBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCobrarConciliacionesCarterasContabilidad(ArrayList<Classe> classes,CobrarConciliacionesCarterasContabilidadReturnGeneral cobrarconciliacionescarterascontabilidadReturnGeneral,CobrarConciliacionesCarterasContabilidadBean cobrarconciliacionescarterascontabilidadBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCobrarConciliacionesCarterasContabilidad(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidad,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.cobrarconciliacionescarterascontabilidad)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad = new CobrarConciliacionesCarterasContabilidadDetalleFormJInternalFrame(jDesktopPane,this.cobrarconciliacionescarterascontabilidadSessionBean.getConGuardarRelaciones(),this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad);
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.setVisible(false);
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.setSelected(false);						
		
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.cobrarconciliacionescarterascontabilidadLogic=this.cobrarconciliacionescarterascontabilidadLogic;
		
		this.cargarCombosFrameForeignKeyCobrarConciliacionesCarterasContabilidad("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCobrarConciliacionesCarterasContabilidad();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCobrarConciliacionesCarterasContabilidad();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCobrarConciliacionesCarterasContabilidad("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCobrarConciliacionesCarterasContabilidad();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCobrarConciliacionesCarterasContabilidad"));
		
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonModificarCobrarConciliacionesCarterasContabilidad.addActionListener(new ButtonActionListener(this,"ModificarCobrarConciliacionesCarterasContabilidad"));

		
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonModificarToolBarCobrarConciliacionesCarterasContabilidad.addActionListener(new ButtonActionListener(this,"ModificarToolBarCobrarConciliacionesCarterasContabilidad"));
					
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jMenuItemModificarCobrarConciliacionesCarterasContabilidad.addActionListener(new ButtonActionListener(this,"MenuItemModificarCobrarConciliacionesCarterasContabilidad"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonActualizarCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"ActualizarCobrarConciliacionesCarterasContabilidad"));
		
		
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonActualizarToolBarCobrarConciliacionesCarterasContabilidad.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCobrarConciliacionesCarterasContabilidad"));
						
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jMenuItemActualizarCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCobrarConciliacionesCarterasContabilidad"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonEliminarCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"EliminarCobrarConciliacionesCarterasContabilidad"));
		
		
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonEliminarToolBarCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"EliminarToolBarCobrarConciliacionesCarterasContabilidad"));
								
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jMenuItemEliminarCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCobrarConciliacionesCarterasContabilidad"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonCancelarCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"CancelarCobrarConciliacionesCarterasContabilidad"));
		
		
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonCancelarToolBarCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"CancelarToolBarCobrarConciliacionesCarterasContabilidad"));
					
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jMenuItemCancelarCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCobrarConciliacionesCarterasContabilidad"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jMenuItemDetalleCerrarCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCobrarConciliacionesCarterasContabilidad"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonGuardarCambiosToolBarCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCobrarConciliacionesCarterasContabilidad"));
		
		
		
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonGuardarCambiosToolBarCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCobrarConciliacionesCarterasContabilidad"));
		
		
		
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jComboBoxTiposAccionesFormularioCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCobrarConciliacionesCarterasContabilidad"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonidCobrarConciliacionesCarterasContabilidadBusqueda.addActionListener(new ButtonActionListener(this,"idCobrarConciliacionesCarterasContabilidadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonid_empresaCobrarConciliacionesCarterasContabilidadUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCobrarConciliacionesCarterasContabilidadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonid_empresaCobrarConciliacionesCarterasContabilidadBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCobrarConciliacionesCarterasContabilidadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonid_cuenta_contableCobrarConciliacionesCarterasContabilidadUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCobrarConciliacionesCarterasContabilidadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonid_cuenta_contableCobrarConciliacionesCarterasContabilidadBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCobrarConciliacionesCarterasContabilidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonfecha_desdeCobrarConciliacionesCarterasContabilidadBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdeCobrarConciliacionesCarterasContabilidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonfecha_hastaCobrarConciliacionesCarterasContabilidadBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaCobrarConciliacionesCarterasContabilidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtoncodigoCobrarConciliacionesCarterasContabilidadBusqueda.addActionListener(new ButtonActionListener(this,"codigoCobrarConciliacionesCarterasContabilidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtoncodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidadBusqueda.addActionListener(new ButtonActionListener(this,"codigo_tipo_movimientoCobrarConciliacionesCarterasContabilidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonnumero_mayorCobrarConciliacionesCarterasContabilidadBusqueda.addActionListener(new ButtonActionListener(this,"numero_mayorCobrarConciliacionesCarterasContabilidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtondebito_asientoCobrarConciliacionesCarterasContabilidadBusqueda.addActionListener(new ButtonActionListener(this,"debito_asientoCobrarConciliacionesCarterasContabilidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtoncredito_asientoCobrarConciliacionesCarterasContabilidadBusqueda.addActionListener(new ButtonActionListener(this,"credito_asientoCobrarConciliacionesCarterasContabilidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtondebito_cuentasCobrarConciliacionesCarterasContabilidadBusqueda.addActionListener(new ButtonActionListener(this,"debito_cuentasCobrarConciliacionesCarterasContabilidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtoncredito_cuentasCobrarConciliacionesCarterasContabilidadBusqueda.addActionListener(new ButtonActionListener(this,"credito_cuentasCobrarConciliacionesCarterasContabilidadBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTabbedPaneRelacionesCobrarConciliacionesCarterasContabilidad.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCobrarConciliacionesCarterasContabilidad"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCobrarConciliacionesCarterasContabilidad"));
		
		if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCobrarConciliacionesCarterasContabilidad"));
		}
		
		this.jTableDatosCobrarConciliacionesCarterasContabilidad.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCobrarConciliacionesCarterasContabilidad"));
		
		this.jTableDatosCobrarConciliacionesCarterasContabilidad.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCobrarConciliacionesCarterasContabilidad"));
		
		this.jButtonNuevoCobrarConciliacionesCarterasContabilidad.addActionListener(new ButtonActionListener(this,"NuevoCobrarConciliacionesCarterasContabilidad"));
		
		this.jButtonDuplicarCobrarConciliacionesCarterasContabilidad.addActionListener(new ButtonActionListener(this,"DuplicarCobrarConciliacionesCarterasContabilidad"));
		
		this.jButtonCopiarCobrarConciliacionesCarterasContabilidad.addActionListener(new ButtonActionListener(this,"CopiarCobrarConciliacionesCarterasContabilidad"));
		
		this.jButtonVerFormCobrarConciliacionesCarterasContabilidad.addActionListener(new ButtonActionListener(this,"VerFormCobrarConciliacionesCarterasContabilidad"));
		
		
		this.jButtonNuevoToolBarCobrarConciliacionesCarterasContabilidad.addActionListener(new ButtonActionListener(this,"NuevoToolBarCobrarConciliacionesCarterasContabilidad"));
			
		this.jButtonDuplicarToolBarCobrarConciliacionesCarterasContabilidad.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCobrarConciliacionesCarterasContabilidad"));
			
		this.jMenuItemNuevoCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCobrarConciliacionesCarterasContabilidad"));
			
		this.jMenuItemDuplicarCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCobrarConciliacionesCarterasContabilidad"));		
		
		
		this.jButtonNuevoRelacionesCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCobrarConciliacionesCarterasContabilidad"));
		
		
		this.jButtonNuevoRelacionesToolBarCobrarConciliacionesCarterasContabilidad.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCobrarConciliacionesCarterasContabilidad"));
			
		this.jMenuItemNuevoRelacionesCobrarConciliacionesCarterasContabilidad.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCobrarConciliacionesCarterasContabilidad"));		
		
		
		if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonModificarCobrarConciliacionesCarterasContabilidad.addActionListener(new ButtonActionListener(this,"ModificarCobrarConciliacionesCarterasContabilidad"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonModificarToolBarCobrarConciliacionesCarterasContabilidad.addActionListener(new ButtonActionListener(this,"ModificarToolBarCobrarConciliacionesCarterasContabilidad"));
			
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jMenuItemModificarCobrarConciliacionesCarterasContabilidad.addActionListener(new ButtonActionListener(this,"MenuItemModificarCobrarConciliacionesCarterasContabilidad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonActualizarCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"ActualizarCobrarConciliacionesCarterasContabilidad"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonActualizarToolBarCobrarConciliacionesCarterasContabilidad.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCobrarConciliacionesCarterasContabilidad"));
				
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jMenuItemActualizarCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCobrarConciliacionesCarterasContabilidad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonEliminarCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"EliminarCobrarConciliacionesCarterasContabilidad"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonEliminarToolBarCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"EliminarToolBarCobrarConciliacionesCarterasContabilidad"));
						
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jMenuItemEliminarCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCobrarConciliacionesCarterasContabilidad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonCancelarCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"CancelarCobrarConciliacionesCarterasContabilidad"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonCancelarToolBarCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"CancelarToolBarCobrarConciliacionesCarterasContabilidad"));
			
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jMenuItemCancelarCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCobrarConciliacionesCarterasContabilidad"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCobrarConciliacionesCarterasContabilidad"));		
		
		
		this.jButtonCerrarCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"CerrarCobrarConciliacionesCarterasContabilidad"));
		
		
		this.jButtonCerrarToolBarCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"CerrarToolBarCobrarConciliacionesCarterasContabilidad"));
			
		this.jMenuItemCerrarCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCobrarConciliacionesCarterasContabilidad"));
			
		if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jMenuItemDetalleCerrarCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCobrarConciliacionesCarterasContabilidad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonGuardarCambiosCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosCobrarConciliacionesCarterasContabilidad"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonGuardarCambiosToolBarCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCobrarConciliacionesCarterasContabilidad"));
		}
		
		this.jButtonCopiarToolBarCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"CopiarToolBarCobrarConciliacionesCarterasContabilidad"));
			
		this.jButtonVerFormToolBarCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"VerFormToolBarCobrarConciliacionesCarterasContabilidad"));
		
		this.jMenuItemGuardarCambiosCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCobrarConciliacionesCarterasContabilidad"));
			
		this.jMenuItemCopiarCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCobrarConciliacionesCarterasContabilidad"));		
		
		this.jMenuItemVerFormCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCobrarConciliacionesCarterasContabilidad"));		
		
		
		this.jButtonGuardarCambiosTablaCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCobrarConciliacionesCarterasContabilidad"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCobrarConciliacionesCarterasContabilidad"));
			
		this.jMenuItemGuardarCambiosTablaCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCobrarConciliacionesCarterasContabilidad"));		
		
		
		
		this.jButtonRecargarInformacionCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"RecargarInformacionCobrarConciliacionesCarterasContabilidad"));
					
		this.jButtonRecargarInformacionToolBarCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCobrarConciliacionesCarterasContabilidad"));
		
		this.jMenuItemRecargarInformacionCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCobrarConciliacionesCarterasContabilidad"));		
		
		
		
		this.jButtonAnterioresCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"AnterioresCobrarConciliacionesCarterasContabilidad"));
		
		
		this.jButtonAnterioresToolBarCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCobrarConciliacionesCarterasContabilidad"));
		
		this.jMenuItemAnterioresCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCobrarConciliacionesCarterasContabilidad"));		
		
		
		this.jButtonSiguientesCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"SiguientesCobrarConciliacionesCarterasContabilidad"));
		
		
		this.jButtonSiguientesToolBarCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCobrarConciliacionesCarterasContabilidad"));
			
		this.jMenuItemSiguientesCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCobrarConciliacionesCarterasContabilidad"));
			
		this.jMenuItemAbrirOrderByCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCobrarConciliacionesCarterasContabilidad"));
			
		this.jMenuItemMostrarOcultarCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCobrarConciliacionesCarterasContabilidad"));
			
		this.jMenuItemDetalleAbrirOrderByCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCobrarConciliacionesCarterasContabilidad"));
			
		this.jMenuItemDetalleMostarOcultarCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCobrarConciliacionesCarterasContabilidad"));		
		
		
		this.jButtonNuevoGuardarCambiosCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCobrarConciliacionesCarterasContabilidad"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCobrarConciliacionesCarterasContabilidad"));
			
		this.jMenuItemNuevoGuardarCambiosCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCobrarConciliacionesCarterasContabilidad"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCobrarConciliacionesCarterasContabilidad.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCobrarConciliacionesCarterasContabilidad"));

		this.jCheckBoxSeleccionadosCobrarConciliacionesCarterasContabilidad.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCobrarConciliacionesCarterasContabilidad"));
		
		if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jComboBoxTiposAccionesFormularioCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCobrarConciliacionesCarterasContabilidad"));
		}
		
		
		this.jComboBoxTiposRelacionesCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"TiposRelacionesCobrarConciliacionesCarterasContabilidad"));
			
		this.jComboBoxTiposAccionesCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"TiposAccionesCobrarConciliacionesCarterasContabilidad"));
					
		this.jComboBoxTiposSeleccionarCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCobrarConciliacionesCarterasContabilidad"));
			
		this.jTextFieldValorCampoGeneralCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCobrarConciliacionesCarterasContabilidad"));		
		
		
		if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonidCobrarConciliacionesCarterasContabilidadBusqueda.addActionListener(new ButtonActionListener(this,"idCobrarConciliacionesCarterasContabilidadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonid_empresaCobrarConciliacionesCarterasContabilidadUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCobrarConciliacionesCarterasContabilidadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonid_empresaCobrarConciliacionesCarterasContabilidadBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCobrarConciliacionesCarterasContabilidadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonid_cuenta_contableCobrarConciliacionesCarterasContabilidadUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCobrarConciliacionesCarterasContabilidadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonid_cuenta_contableCobrarConciliacionesCarterasContabilidadBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCobrarConciliacionesCarterasContabilidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonfecha_desdeCobrarConciliacionesCarterasContabilidadBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdeCobrarConciliacionesCarterasContabilidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonfecha_hastaCobrarConciliacionesCarterasContabilidadBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaCobrarConciliacionesCarterasContabilidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtoncodigoCobrarConciliacionesCarterasContabilidadBusqueda.addActionListener(new ButtonActionListener(this,"codigoCobrarConciliacionesCarterasContabilidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtoncodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidadBusqueda.addActionListener(new ButtonActionListener(this,"codigo_tipo_movimientoCobrarConciliacionesCarterasContabilidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonnumero_mayorCobrarConciliacionesCarterasContabilidadBusqueda.addActionListener(new ButtonActionListener(this,"numero_mayorCobrarConciliacionesCarterasContabilidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtondebito_asientoCobrarConciliacionesCarterasContabilidadBusqueda.addActionListener(new ButtonActionListener(this,"debito_asientoCobrarConciliacionesCarterasContabilidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtoncredito_asientoCobrarConciliacionesCarterasContabilidadBusqueda.addActionListener(new ButtonActionListener(this,"credito_asientoCobrarConciliacionesCarterasContabilidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtondebito_cuentasCobrarConciliacionesCarterasContabilidadBusqueda.addActionListener(new ButtonActionListener(this,"debito_cuentasCobrarConciliacionesCarterasContabilidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtoncredito_cuentasCobrarConciliacionesCarterasContabilidadBusqueda.addActionListener(new ButtonActionListener(this,"credito_cuentasCobrarConciliacionesCarterasContabilidadBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.addActionListener(new ButtonActionListener(this,"BusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad!=null) {
				this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCobrarConciliacionesCarterasContabilidad"));
				this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCobrarConciliacionesCarterasContabilidad"));
				this.jInternalFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCobrarConciliacionesCarterasContabilidad"));
			}
			
			//this.jButtonCerrarReporteDinamicoCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCobrarConciliacionesCarterasContabilidad"));				
			//this.jButtonGenerarReporteDinamicoCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCobrarConciliacionesCarterasContabilidad"));
			//this.jButtonGenerarExcelReporteDinamicoCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCobrarConciliacionesCarterasContabilidad"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCobrarConciliacionesCarterasContabilidad!=null) {
				this.jInternalFrameImportacionCobrarConciliacionesCarterasContabilidad.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCobrarConciliacionesCarterasContabilidad"));
				this.jInternalFrameImportacionCobrarConciliacionesCarterasContabilidad.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCobrarConciliacionesCarterasContabilidad"));
				this.jInternalFrameImportacionCobrarConciliacionesCarterasContabilidad.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCobrarConciliacionesCarterasContabilidad"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"AbrirOrderByCobrarConciliacionesCarterasContabilidad"));
			
			this.jButtonAbrirOrderByToolBarCobrarConciliacionesCarterasContabilidad.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCobrarConciliacionesCarterasContabilidad"));			
			
			if(this.jInternalFrameOrderByCobrarConciliacionesCarterasContabilidad!=null) {
				this.jInternalFrameOrderByCobrarConciliacionesCarterasContabilidad.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCobrarConciliacionesCarterasContabilidad"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTabbedPaneRelacionesCobrarConciliacionesCarterasContabilidad.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCobrarConciliacionesCarterasContabilidad"));
		
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
            		closingInternalFrameCobrarConciliacionesCarterasContabilidad();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad = (JInternalFrameBase)event.getSource();
	            	
	            CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrame jInternalFrameParent=(CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrame)jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCobrarConciliacionesCarterasContabilidadActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCobrarConciliacionesCarterasContabilidad.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCobrarConciliacionesCarterasContabilidadListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCobrarConciliacionesCarterasContabilidad.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCobrarConciliacionesCarterasContabilidad.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCobrarConciliacionesCarterasContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarConciliacionesCarterasContabilidadActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCobrarConciliacionesCarterasContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarConciliacionesCarterasContabilidadActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCobrarConciliacionesCarterasContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarConciliacionesCarterasContabilidadActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCobrarConciliacionesCarterasContabilidad";
		inputMap = this.jButtonNuevoCobrarConciliacionesCarterasContabilidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCobrarConciliacionesCarterasContabilidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCobrarConciliacionesCarterasContabilidadActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCobrarConciliacionesCarterasContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarConciliacionesCarterasContabilidadActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCobrarConciliacionesCarterasContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarConciliacionesCarterasContabilidadActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCobrarConciliacionesCarterasContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarConciliacionesCarterasContabilidadActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCobrarConciliacionesCarterasContabilidad";
		inputMap = this.jButtonNuevoRelacionesCobrarConciliacionesCarterasContabilidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCobrarConciliacionesCarterasContabilidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCobrarConciliacionesCarterasContabilidadActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCobrarConciliacionesCarterasContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCobrarConciliacionesCarterasContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCobrarConciliacionesCarterasContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCobrarConciliacionesCarterasContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCobrarConciliacionesCarterasContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCobrarConciliacionesCarterasContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCobrarConciliacionesCarterasContabilidad";
		inputMap = this.jButtonModificarCobrarConciliacionesCarterasContabilidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCobrarConciliacionesCarterasContabilidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCobrarConciliacionesCarterasContabilidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCobrarConciliacionesCarterasContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCobrarConciliacionesCarterasContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCobrarConciliacionesCarterasContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCobrarConciliacionesCarterasContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCobrarConciliacionesCarterasContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCobrarConciliacionesCarterasContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCobrarConciliacionesCarterasContabilidad";
		inputMap = this.jButtonActualizarCobrarConciliacionesCarterasContabilidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCobrarConciliacionesCarterasContabilidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCobrarConciliacionesCarterasContabilidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCobrarConciliacionesCarterasContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCobrarConciliacionesCarterasContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCobrarConciliacionesCarterasContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCobrarConciliacionesCarterasContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCobrarConciliacionesCarterasContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCobrarConciliacionesCarterasContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCobrarConciliacionesCarterasContabilidad";
		inputMap = this.jButtonEliminarCobrarConciliacionesCarterasContabilidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCobrarConciliacionesCarterasContabilidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCobrarConciliacionesCarterasContabilidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCobrarConciliacionesCarterasContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCobrarConciliacionesCarterasContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCobrarConciliacionesCarterasContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCobrarConciliacionesCarterasContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCobrarConciliacionesCarterasContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCobrarConciliacionesCarterasContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCobrarConciliacionesCarterasContabilidad";
		inputMap = this.jButtonCancelarCobrarConciliacionesCarterasContabilidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCobrarConciliacionesCarterasContabilidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCobrarConciliacionesCarterasContabilidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCobrarConciliacionesCarterasContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCobrarConciliacionesCarterasContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCobrarConciliacionesCarterasContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCobrarConciliacionesCarterasContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCobrarConciliacionesCarterasContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCobrarConciliacionesCarterasContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCobrarConciliacionesCarterasContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCobrarConciliacionesCarterasContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCobrarConciliacionesCarterasContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCobrarConciliacionesCarterasContabilidad";
		inputMap = this.jButtonCerrarCobrarConciliacionesCarterasContabilidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCobrarConciliacionesCarterasContabilidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCobrarConciliacionesCarterasContabilidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonGuardarCambiosCobrarConciliacionesCarterasContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarConciliacionesCarterasContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCobrarConciliacionesCarterasContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarConciliacionesCarterasContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCobrarConciliacionesCarterasContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarConciliacionesCarterasContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCobrarConciliacionesCarterasContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarConciliacionesCarterasContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCobrarConciliacionesCarterasContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarConciliacionesCarterasContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCobrarConciliacionesCarterasContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarConciliacionesCarterasContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCobrarConciliacionesCarterasContabilidad";
		inputMap = this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonGuardarCambiosCobrarConciliacionesCarterasContabilidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonGuardarCambiosCobrarConciliacionesCarterasContabilidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCobrarConciliacionesCarterasContabilidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCobrarConciliacionesCarterasContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCobrarConciliacionesCarterasContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCobrarConciliacionesCarterasContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCobrarConciliacionesCarterasContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCobrarConciliacionesCarterasContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCobrarConciliacionesCarterasContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresCobrarConciliacionesCarterasContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCobrarConciliacionesCarterasContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCobrarConciliacionesCarterasContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCobrarConciliacionesCarterasContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCobrarConciliacionesCarterasContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCobrarConciliacionesCarterasContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCobrarConciliacionesCarterasContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCobrarConciliacionesCarterasContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCobrarConciliacionesCarterasContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCobrarConciliacionesCarterasContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCobrarConciliacionesCarterasContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCobrarConciliacionesCarterasContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCobrarConciliacionesCarterasContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCobrarConciliacionesCarterasContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCobrarConciliacionesCarterasContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCobrarConciliacionesCarterasContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCobrarConciliacionesCarterasContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCobrarConciliacionesCarterasContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCobrarConciliacionesCarterasContabilidad.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCobrarConciliacionesCarterasContabilidadItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCobrarConciliacionesCarterasContabilidad.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCobrarConciliacionesCarterasContabilidadActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCobrarConciliacionesCarterasContabilidad.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCobrarConciliacionesCarterasContabilidadActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCobrarConciliacionesCarterasContabilidad.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCobrarConciliacionesCarterasContabilidadActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonidCobrarConciliacionesCarterasContabilidadBusqueda.addActionListener(new ButtonActionListener(this,"idCobrarConciliacionesCarterasContabilidadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonid_empresaCobrarConciliacionesCarterasContabilidadUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCobrarConciliacionesCarterasContabilidadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonid_empresaCobrarConciliacionesCarterasContabilidadBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCobrarConciliacionesCarterasContabilidadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonid_cuenta_contableCobrarConciliacionesCarterasContabilidadUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCobrarConciliacionesCarterasContabilidadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonid_cuenta_contableCobrarConciliacionesCarterasContabilidadBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCobrarConciliacionesCarterasContabilidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonfecha_desdeCobrarConciliacionesCarterasContabilidadBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdeCobrarConciliacionesCarterasContabilidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonfecha_hastaCobrarConciliacionesCarterasContabilidadBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaCobrarConciliacionesCarterasContabilidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtoncodigoCobrarConciliacionesCarterasContabilidadBusqueda.addActionListener(new ButtonActionListener(this,"codigoCobrarConciliacionesCarterasContabilidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtoncodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidadBusqueda.addActionListener(new ButtonActionListener(this,"codigo_tipo_movimientoCobrarConciliacionesCarterasContabilidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtonnumero_mayorCobrarConciliacionesCarterasContabilidadBusqueda.addActionListener(new ButtonActionListener(this,"numero_mayorCobrarConciliacionesCarterasContabilidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtondebito_asientoCobrarConciliacionesCarterasContabilidadBusqueda.addActionListener(new ButtonActionListener(this,"debito_asientoCobrarConciliacionesCarterasContabilidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtoncredito_asientoCobrarConciliacionesCarterasContabilidadBusqueda.addActionListener(new ButtonActionListener(this,"credito_asientoCobrarConciliacionesCarterasContabilidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtondebito_cuentasCobrarConciliacionesCarterasContabilidadBusqueda.addActionListener(new ButtonActionListener(this,"debito_cuentasCobrarConciliacionesCarterasContabilidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jButtoncredito_cuentasCobrarConciliacionesCarterasContabilidadBusqueda.addActionListener(new ButtonActionListener(this,"credito_cuentasCobrarConciliacionesCarterasContabilidadBusqueda"));
		
		
		this.jButtonBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad.addActionListener(new ButtonActionListener(this,"BusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCobrarConciliacionesCarterasContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCobrarConciliacionesCarterasContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCobrarConciliacionesCarterasContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCobrarConciliacionesCarterasContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCobrarConciliacionesCarterasContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCobrarConciliacionesCarterasContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCobrarConciliacionesCarterasContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCobrarConciliacionesCarterasContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCobrarConciliacionesCarterasContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCobrarConciliacionesCarterasContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCobrarConciliacionesCarterasContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCobrarConciliacionesCarterasContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCobrarConciliacionesCarterasContabilidadActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCobrarConciliacionesCarterasContabilidad.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCobrarConciliacionesCarterasContabilidad(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidadAux:this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads()) {
					cobrarconciliacionescarterascontabilidadAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidadAux:cobrarconciliacionescarterascontabilidads) {
					cobrarconciliacionescarterascontabilidadAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCobrarConciliacionesCarterasContabilidadItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCobrarConciliacionesCarterasContabilidad(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidadAux:this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads()) {
						cobrarconciliacionescarterascontabilidadAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidadAux:cobrarconciliacionescarterascontabilidads) {
						cobrarconciliacionescarterascontabilidadAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidadAux:this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidadAux:cobrarconciliacionescarterascontabilidads) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCobrarConciliacionesCarterasContabilidad(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCobrarConciliacionesCarterasContabilidad.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCobrarConciliacionesCarterasContabilidad.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCobrarConciliacionesCarterasContabilidad,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCobrarConciliacionesCarterasContabilidadItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCobrarConciliacionesCarterasContabilidad(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCobrarConciliacionesCarterasContabilidad.getSelectedRows();
			
			CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidadLocal=new CobrarConciliacionesCarterasContabilidad();
			
			//this.seleccionarTodosCobrarConciliacionesCarterasContabilidad(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cobrarconciliacionescarterascontabilidadLocal =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads().toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					cobrarconciliacionescarterascontabilidadLocal =(CobrarConciliacionesCarterasContabilidad) this.cobrarconciliacionescarterascontabilidads.toArray()[this.jTableDatosCobrarConciliacionesCarterasContabilidad.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				cobrarconciliacionescarterascontabilidadLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidadAux:this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads()) {
						cobrarconciliacionescarterascontabilidadAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidadAux:cobrarconciliacionescarterascontabilidads) {
						cobrarconciliacionescarterascontabilidadAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCobrarConciliacionesCarterasContabilidad(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCobrarConciliacionesCarterasContabilidad.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCobrarConciliacionesCarterasContabilidad.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCobrarConciliacionesCarterasContabilidad,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCobrarConciliacionesCarterasContabilidadItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCobrarConciliacionesCarterasContabilidadParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCobrarConciliacionesCarterasContabilidadActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCobrarConciliacionesCarterasContabilidad(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCobrarConciliacionesCarterasContabilidad.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidadAux:this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads()) {
				
						if(sTipoSeleccionar.equals(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_FECHADESDE)) {
							existe=true;
							cobrarconciliacionescarterascontabilidadAux.setfecha_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_FECHAHASTA)) {
							existe=true;
							cobrarconciliacionescarterascontabilidadAux.setfecha_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							cobrarconciliacionescarterascontabilidadAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO)) {
							existe=true;
							cobrarconciliacionescarterascontabilidadAux.setcodigo_tipo_movimiento(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_NUMEROMAYOR)) {
							existe=true;
							cobrarconciliacionescarterascontabilidadAux.setnumero_mayor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_DEBITOASIENTO)) {
							existe=true;
							cobrarconciliacionescarterascontabilidadAux.setdebito_asiento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CREDITOASIENTO)) {
							existe=true;
							cobrarconciliacionescarterascontabilidadAux.setcredito_asiento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_DEBITOCUENTAS)) {
							existe=true;
							cobrarconciliacionescarterascontabilidadAux.setdebito_cuentas(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CREDITOCUENTAS)) {
							existe=true;
							cobrarconciliacionescarterascontabilidadAux.setcredito_cuentas(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidadAux:cobrarconciliacionescarterascontabilidads) {
					
						if(sTipoSeleccionar.equals(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_FECHADESDE)) {
							existe=true;
							cobrarconciliacionescarterascontabilidadAux.setfecha_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_FECHAHASTA)) {
							existe=true;
							cobrarconciliacionescarterascontabilidadAux.setfecha_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							cobrarconciliacionescarterascontabilidadAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO)) {
							existe=true;
							cobrarconciliacionescarterascontabilidadAux.setcodigo_tipo_movimiento(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_NUMEROMAYOR)) {
							existe=true;
							cobrarconciliacionescarterascontabilidadAux.setnumero_mayor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_DEBITOASIENTO)) {
							existe=true;
							cobrarconciliacionescarterascontabilidadAux.setdebito_asiento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CREDITOASIENTO)) {
							existe=true;
							cobrarconciliacionescarterascontabilidadAux.setcredito_asiento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_DEBITOCUENTAS)) {
							existe=true;
							cobrarconciliacionescarterascontabilidadAux.setdebito_cuentas(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CREDITOCUENTAS)) {
							existe=true;
							cobrarconciliacionescarterascontabilidadAux.setcredito_cuentas(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCobrarConciliacionesCarterasContabilidad(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCobrarConciliacionesCarterasContabilidadActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCobrarConciliacionesCarterasContabilidad(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCobrarConciliacionesCarterasContabilidad=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCobrarConciliacionesCarterasContabilidad.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jComboBoxTiposAccionesFormularioCobrarConciliacionesCarterasContabilidad.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCobrarConciliacionesCarterasContabilidad) {				
					conSplash=true;//false;										
					
					//this.startProcessCobrarConciliacionesCarterasContabilidad(conSplash);
				
					this.generarReporteCobrarConciliacionesCarterasContabilidadsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarConciliacionesCarterasContabilidad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jComboBoxTiposAccionesFormularioCobrarConciliacionesCarterasContabilidad.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCobrarConciliacionesCarterasContabilidadsSeleccionados();
				//this.jComboBoxTiposAccionesCobrarConciliacionesCarterasContabilidad.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCobrarConciliacionesCarterasContabilidadsSeleccionados(false);
				//this.jComboBoxTiposAccionesCobrarConciliacionesCarterasContabilidad.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCobrarConciliacionesCarterasContabilidadsSeleccionados(true);
				//this.jComboBoxTiposAccionesCobrarConciliacionesCarterasContabilidad.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCobrarConciliacionesCarterasContabilidad();
				
				this.exportarCobrarConciliacionesCarterasContabilidadsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarConciliacionesCarterasContabilidad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jComboBoxTiposAccionesFormularioCobrarConciliacionesCarterasContabilidad.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCobrarConciliacionesCarterasContabilidads();
				//this.importarCobrarConciliacionesCarterasContabilidads();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarConciliacionesCarterasContabilidad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jComboBoxTiposAccionesFormularioCobrarConciliacionesCarterasContabilidad.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCobrarConciliacionesCarterasContabilidad();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCobrarConciliacionesCarterasContabilidadsSeleccionados();
				//this.jComboBoxTiposAccionesCobrarConciliacionesCarterasContabilidad.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Cobrar Conciliaciones Carteras Contabilidad", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCobrarConciliacionesCarterasContabilidad();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCobrarConciliacionesCarterasContabilidad)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCobrarConciliacionesCarterasContabilidad(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Cobrar Conciliaciones Carteras Contabilidad",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarConciliacionesCarterasContabilidad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jComboBoxTiposAccionesFormularioCobrarConciliacionesCarterasContabilidad.setSelectedIndex(0);					
				}	
			} 			
			else if(CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCobrarConciliacionesCarterasContabilidad) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCobrarConciliacionesCarterasContabilidad(conSplash);
					
						//this.actualizarParametrosGeneralCobrarConciliacionesCarterasContabilidad();
						
						this.generarReporteProcesoAccionCobrarConciliacionesCarterasContabilidadsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCobrarConciliacionesCarterasContabilidad.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jComboBoxTiposAccionesFormularioCobrarConciliacionesCarterasContabilidad.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Cobrar Conciliaciones Carteras ContabilidadES SELECCIONADOS?", "MANTENIMIENTO DE Cobrar Conciliaciones Carteras Contabilidad", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCobrarConciliacionesCarterasContabilidad();
				
						this.actualizarParametrosGeneralCobrarConciliacionesCarterasContabilidad();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.cobrarconciliacionescarterascontabilidadReturnGeneral=cobrarconciliacionescarterascontabilidadLogic.procesarAccionCobrarConciliacionesCarterasContabilidadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads(),this.cobrarconciliacionescarterascontabilidadParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCobrarConciliacionesCarterasContabilidadReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCobrarConciliacionesCarterasContabilidad.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jComboBoxTiposAccionesFormularioCobrarConciliacionesCarterasContabilidad.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCobrarConciliacionesCarterasContabilidad();
					
					CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCobrarConciliacionesCarterasContabilidadReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCobrarConciliacionesCarterasContabilidad.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jComboBoxTiposAccionesFormularioCobrarConciliacionesCarterasContabilidad.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCobrarConciliacionesCarterasContabilidad(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCobrarConciliacionesCarterasContabilidadActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCobrarConciliacionesCarterasContabilidad();
			
			if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<CobrarConciliacionesCarterasContabilidad> cobrarconciliacionescarterascontabilidadsSeleccionados=new ArrayList<CobrarConciliacionesCarterasContabilidad>();		
			CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidad=new CobrarConciliacionesCarterasContabilidad();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCobrarConciliacionesCarterasContabilidad(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCobrarConciliacionesCarterasContabilidad.getSelectedItem();
			
			
			
			
			cobrarconciliacionescarterascontabilidadsSeleccionados=this.getCobrarConciliacionesCarterasContabilidadsSeleccionados(true);
			//this.sTipoAccion;
			
			if(cobrarconciliacionescarterascontabilidadsSeleccionados.size()==1) {
				for(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidadAux:cobrarconciliacionescarterascontabilidadsSeleccionados) {
					cobrarconciliacionescarterascontabilidad=cobrarconciliacionescarterascontabilidadAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCobrarConciliacionesCarterasContabilidad();
			
      		//this.finishProcessCobrarConciliacionesCarterasContabilidad(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCobrarConciliacionesCarterasContabilidadReturnGeneral() throws Exception {
		if(this.cobrarconciliacionescarterascontabilidadReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.cobrarconciliacionescarterascontabilidadReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.cobrarconciliacionescarterascontabilidadReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.cobrarconciliacionescarterascontabilidadReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.cobrarconciliacionescarterascontabilidadReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.cobrarconciliacionescarterascontabilidadReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCobrarConciliacionesCarterasContabilidad(false);
		}
		
		if(this.cobrarconciliacionescarterascontabilidadReturnGeneral.getConRetornoLista() || this.cobrarconciliacionescarterascontabilidadReturnGeneral.getConRetornoObjeto()) {
			if(this.cobrarconciliacionescarterascontabilidadReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cobrarconciliacionescarterascontabilidadLogic.setCobrarConciliacionesCarterasContabilidads(this.cobrarconciliacionescarterascontabilidadReturnGeneral.getCobrarConciliacionesCarterasContabilidads());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingCobrarConciliacionesCarterasContabilidad(false);
		}
	}
	
	public void actualizarParametrosGeneralCobrarConciliacionesCarterasContabilidad() throws Exception {
		
		
	}
	
	public ArrayList<CobrarConciliacionesCarterasContabilidad> getCobrarConciliacionesCarterasContabilidadsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<CobrarConciliacionesCarterasContabilidad> cobrarconciliacionescarterascontabilidadsSeleccionados=new ArrayList<CobrarConciliacionesCarterasContabilidad>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCobrarConciliacionesCarterasContabilidad) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidadAux:cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads()) {
					if(cobrarconciliacionescarterascontabilidadAux.getIsSelected()) {
						cobrarconciliacionescarterascontabilidadsSeleccionados.add(cobrarconciliacionescarterascontabilidadAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidadAux:this.cobrarconciliacionescarterascontabilidads) {
					if(cobrarconciliacionescarterascontabilidadAux.getIsSelected()) {
						cobrarconciliacionescarterascontabilidadsSeleccionados.add(cobrarconciliacionescarterascontabilidadAux);				
					}
				}
			}
			
			if(cobrarconciliacionescarterascontabilidadsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						cobrarconciliacionescarterascontabilidadsSeleccionados.addAll(this.cobrarconciliacionescarterascontabilidadLogic.getCobrarConciliacionesCarterasContabilidads());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						cobrarconciliacionescarterascontabilidadsSeleccionados.addAll(this.cobrarconciliacionescarterascontabilidads);				
					}
				}
			}
		} else {
			cobrarconciliacionescarterascontabilidadsSeleccionados.add(this.cobrarconciliacionescarterascontabilidad);
		}
		
		return cobrarconciliacionescarterascontabilidadsSeleccionados;
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
	
	public void generarReporteCobrarConciliacionesCarterasContabilidadsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalCobrarConciliacionesCarterasContabilidadsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCobrarConciliacionesCarterasContabilidadsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCobrarConciliacionesCarterasContabilidadsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCobrarConciliacionesCarterasContabilidadsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Cobrar Conciliaciones Carteras Contabilidad",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCobrarConciliacionesCarterasContabilidadsSeleccionados() throws Exception {
		ArrayList<CobrarConciliacionesCarterasContabilidad> cobrarconciliacionescarterascontabilidadsSeleccionados=new ArrayList<CobrarConciliacionesCarterasContabilidad>();		
		
		cobrarconciliacionescarterascontabilidadsSeleccionados=this.getCobrarConciliacionesCarterasContabilidadsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCobrarConciliacionesCarterasContabilidads("Todos",cobrarconciliacionescarterascontabilidadsSeleccionados);
		
	}	
	
	public void generarReporteNormalCobrarConciliacionesCarterasContabilidadsSeleccionados() throws Exception {
		ArrayList<CobrarConciliacionesCarterasContabilidad> cobrarconciliacionescarterascontabilidadsSeleccionados=new ArrayList<CobrarConciliacionesCarterasContabilidad>();		
		
		cobrarconciliacionescarterascontabilidadsSeleccionados=this.getCobrarConciliacionesCarterasContabilidadsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCobrarConciliacionesCarterasContabilidads("Todos",cobrarconciliacionescarterascontabilidadsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCobrarConciliacionesCarterasContabilidadsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<CobrarConciliacionesCarterasContabilidad> cobrarconciliacionescarterascontabilidadsSeleccionados=new ArrayList<CobrarConciliacionesCarterasContabilidad>();
		
		cobrarconciliacionescarterascontabilidadsSeleccionados=this.getCobrarConciliacionesCarterasContabilidadsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCobrarConciliacionesCarterasContabilidads("Todos",cobrarconciliacionescarterascontabilidadsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoCobrarConciliacionesCarterasContabilidadsSeleccionados() throws Exception {
		ArrayList<CobrarConciliacionesCarterasContabilidad> cobrarconciliacionescarterascontabilidadsSeleccionados=new ArrayList<CobrarConciliacionesCarterasContabilidad>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad();
		
		
		cobrarconciliacionescarterascontabilidadsSeleccionados=this.getCobrarConciliacionesCarterasContabilidadsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCobrarConciliacionesCarterasContabilidad();
		
		
		//this.generarReporteCobrarConciliacionesCarterasContabilidads("Todos",cobrarconciliacionescarterascontabilidadsSeleccionados ,cobrarconciliacionescarterascontabilidadImplementable,cobrarconciliacionescarterascontabilidadImplementableHome);
	}
	
	public void mostrarImportacionCobrarConciliacionesCarterasContabilidads() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCobrarConciliacionesCarterasContabilidad();
		
		this.abrirFrameImportacionCobrarConciliacionesCarterasContabilidad();		
		
			
		//this.generarReporteCobrarConciliacionesCarterasContabilidads("Todos",cobrarconciliacionescarterascontabilidadsSeleccionados ,cobrarconciliacionescarterascontabilidadImplementable,cobrarconciliacionescarterascontabilidadImplementableHome);
	}
	
	public void importarCobrarConciliacionesCarterasContabilidads() throws Exception {		
	
	}
	
	public void exportarCobrarConciliacionesCarterasContabilidadsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCobrarConciliacionesCarterasContabilidadsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCobrarConciliacionesCarterasContabilidadsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCobrarConciliacionesCarterasContabilidadsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Cobrar Conciliaciones Carteras Contabilidad",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCobrarConciliacionesCarterasContabilidadsSeleccionados() throws Exception {
		ArrayList<CobrarConciliacionesCarterasContabilidad> cobrarconciliacionescarterascontabilidadsSeleccionados=new ArrayList<CobrarConciliacionesCarterasContabilidad>();		
		
		cobrarconciliacionescarterascontabilidadsSeleccionados=this.getCobrarConciliacionesCarterasContabilidadsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarconciliacionescarterascontabilidad."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCobrarConciliacionesCarterasContabilidad(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidadAux:cobrarconciliacionescarterascontabilidadsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCobrarConciliacionesCarterasContabilidad(cobrarconciliacionescarterascontabilidadAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//cobrarconciliacionescarterascontabilidadAux.setsDetalleGeneralEntityReporte(cobrarconciliacionescarterascontabilidadAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Conciliaciones Carteras Contabilidad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCobrarConciliacionesCarterasContabilidad(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_IDCUENTACONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_FECHADESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_FECHAHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_NUMEROMAYOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_DEBITOASIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CREDITOASIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_DEBITOCUENTAS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CREDITOCUENTAS;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCobrarConciliacionesCarterasContabilidad(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidad,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=cobrarconciliacionescarterascontabilidad.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarconciliacionescarterascontabilidad.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarconciliacionescarterascontabilidad.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarconciliacionescarterascontabilidad.getcuentacontable_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarconciliacionescarterascontabilidad.getfecha_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarconciliacionescarterascontabilidad.getfecha_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarconciliacionescarterascontabilidad.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarconciliacionescarterascontabilidad.getcodigo_tipo_movimiento();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarconciliacionescarterascontabilidad.getnumero_mayor();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarconciliacionescarterascontabilidad.getdebito_asiento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarconciliacionescarterascontabilidad.getcredito_asiento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarconciliacionescarterascontabilidad.getdebito_cuentas().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarconciliacionescarterascontabilidad.getcredito_cuentas().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCobrarConciliacionesCarterasContabilidadsSeleccionados() throws Exception {
		ArrayList<CobrarConciliacionesCarterasContabilidad> cobrarconciliacionescarterascontabilidadsSeleccionados=new ArrayList<CobrarConciliacionesCarterasContabilidad>();		
		
		cobrarconciliacionescarterascontabilidadsSeleccionados=this.getCobrarConciliacionesCarterasContabilidadsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarconciliacionescarterascontabilidad.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("CobrarConciliacionesCarterasContabilidads");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCobrarConciliacionesCarterasContabilidad(row);				
				iRow++;
			}				
			
			for(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidadAux:cobrarconciliacionescarterascontabilidadsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCobrarConciliacionesCarterasContabilidad(cobrarconciliacionescarterascontabilidadAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Conciliaciones Carteras Contabilidad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCobrarConciliacionesCarterasContabilidadsSeleccionados() throws Exception {
		ArrayList<CobrarConciliacionesCarterasContabilidad> cobrarconciliacionescarterascontabilidadsSeleccionados=new ArrayList<CobrarConciliacionesCarterasContabilidad>();		
		
		cobrarconciliacionescarterascontabilidadsSeleccionados=this.getCobrarConciliacionesCarterasContabilidadsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarconciliacionescarterascontabilidad.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("cobrarconciliacionescarterascontabilidads");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("cobrarconciliacionescarterascontabilidad");
			//elementRoot.appendChild(element);
		
			for(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidadAux:cobrarconciliacionescarterascontabilidadsSeleccionados) {
				element = document.createElement("cobrarconciliacionescarterascontabilidad");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCobrarConciliacionesCarterasContabilidad(cobrarconciliacionescarterascontabilidadAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Conciliaciones Carteras Contabilidad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCobrarConciliacionesCarterasContabilidad(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_IDCUENTACONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_FECHADESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_FECHAHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_NUMEROMAYOR);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_DEBITOASIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CREDITOASIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_DEBITOCUENTAS);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CREDITOCUENTAS);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCobrarConciliacionesCarterasContabilidad(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidad,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarconciliacionescarterascontabilidad.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarconciliacionescarterascontabilidad.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarconciliacionescarterascontabilidad.getcuentacontable_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarconciliacionescarterascontabilidad.getfecha_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarconciliacionescarterascontabilidad.getfecha_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarconciliacionescarterascontabilidad.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarconciliacionescarterascontabilidad.getcodigo_tipo_movimiento());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarconciliacionescarterascontabilidad.getnumero_mayor());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarconciliacionescarterascontabilidad.getdebito_asiento());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarconciliacionescarterascontabilidad.getcredito_asiento());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarconciliacionescarterascontabilidad.getdebito_cuentas());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarconciliacionescarterascontabilidad.getcredito_cuentas());				
	}
	
	public void setFilaDatosExportarXmlCobrarConciliacionesCarterasContabilidad(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidad,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CobrarConciliacionesCarterasContabilidadConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(cobrarconciliacionescarterascontabilidad.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CobrarConciliacionesCarterasContabilidadConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(cobrarconciliacionescarterascontabilidad.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(CobrarConciliacionesCarterasContabilidadConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(cobrarconciliacionescarterascontabilidad.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcuentacontable_descripcion = document.createElement(CobrarConciliacionesCarterasContabilidadConstantesFunciones.IDCUENTACONTABLE);
		elementcuentacontable_descripcion.appendChild(document.createTextNode(cobrarconciliacionescarterascontabilidad.getcuentacontable_descripcion()));
		element.appendChild(elementcuentacontable_descripcion);

		Element elementfecha_desde = document.createElement(CobrarConciliacionesCarterasContabilidadConstantesFunciones.FECHADESDE);
		elementfecha_desde.appendChild(document.createTextNode(cobrarconciliacionescarterascontabilidad.getfecha_desde().toString().trim()));
		element.appendChild(elementfecha_desde);

		Element elementfecha_hasta = document.createElement(CobrarConciliacionesCarterasContabilidadConstantesFunciones.FECHAHASTA);
		elementfecha_hasta.appendChild(document.createTextNode(cobrarconciliacionescarterascontabilidad.getfecha_hasta().toString().trim()));
		element.appendChild(elementfecha_hasta);

		Element elementcodigo = document.createElement(CobrarConciliacionesCarterasContabilidadConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(cobrarconciliacionescarterascontabilidad.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementcodigo_tipo_movimiento = document.createElement(CobrarConciliacionesCarterasContabilidadConstantesFunciones.CODIGOTIPOMOVIMIENTO);
		elementcodigo_tipo_movimiento.appendChild(document.createTextNode(cobrarconciliacionescarterascontabilidad.getcodigo_tipo_movimiento().trim()));
		element.appendChild(elementcodigo_tipo_movimiento);

		Element elementnumero_mayor = document.createElement(CobrarConciliacionesCarterasContabilidadConstantesFunciones.NUMEROMAYOR);
		elementnumero_mayor.appendChild(document.createTextNode(cobrarconciliacionescarterascontabilidad.getnumero_mayor().trim()));
		element.appendChild(elementnumero_mayor);

		Element elementdebito_asiento = document.createElement(CobrarConciliacionesCarterasContabilidadConstantesFunciones.DEBITOASIENTO);
		elementdebito_asiento.appendChild(document.createTextNode(cobrarconciliacionescarterascontabilidad.getdebito_asiento().toString().trim()));
		element.appendChild(elementdebito_asiento);

		Element elementcredito_asiento = document.createElement(CobrarConciliacionesCarterasContabilidadConstantesFunciones.CREDITOASIENTO);
		elementcredito_asiento.appendChild(document.createTextNode(cobrarconciliacionescarterascontabilidad.getcredito_asiento().toString().trim()));
		element.appendChild(elementcredito_asiento);

		Element elementdebito_cuentas = document.createElement(CobrarConciliacionesCarterasContabilidadConstantesFunciones.DEBITOCUENTAS);
		elementdebito_cuentas.appendChild(document.createTextNode(cobrarconciliacionescarterascontabilidad.getdebito_cuentas().toString().trim()));
		element.appendChild(elementdebito_cuentas);

		Element elementcredito_cuentas = document.createElement(CobrarConciliacionesCarterasContabilidadConstantesFunciones.CREDITOCUENTAS);
		elementcredito_cuentas.appendChild(document.createTextNode(cobrarconciliacionescarterascontabilidad.getcredito_cuentas().toString().trim()));
		element.appendChild(elementcredito_cuentas);
	}
	
	public void generarReporteGroupGenericoCobrarConciliacionesCarterasContabilidadsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<CobrarConciliacionesCarterasContabilidad> cobrarconciliacionescarterascontabilidadsSeleccionados=new ArrayList<CobrarConciliacionesCarterasContabilidad>();
		
		cobrarconciliacionescarterascontabilidadsSeleccionados=this.getCobrarConciliacionesCarterasContabilidadsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoCobrarConciliacionesCarterasContabilidad(cobrarconciliacionescarterascontabilidadsSeleccionados);
		
		this.generarReporteCobrarConciliacionesCarterasContabilidads("Todos",cobrarconciliacionescarterascontabilidadsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCobrarConciliacionesCarterasContabilidad(ArrayList<CobrarConciliacionesCarterasContabilidad> cobrarconciliacionescarterascontabilidadsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(CobrarConciliacionesCarterasContabilidad cobrarconciliacionescarterascontabilidadAux:cobrarconciliacionescarterascontabilidadsSeleccionados) {
				cobrarconciliacionescarterascontabilidadAux.setsDetalleGeneralEntityReporte(cobrarconciliacionescarterascontabilidadAux.toString());
			
				if(sTipoSeleccionar.equals(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					cobrarconciliacionescarterascontabilidadAux.setsDescripcionGeneralEntityReporte1(cobrarconciliacionescarterascontabilidadAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_IDCUENTACONTABLE)) {
					existe=true;
					cobrarconciliacionescarterascontabilidadAux.setsDescripcionGeneralEntityReporte1(cobrarconciliacionescarterascontabilidadAux.getcuentacontable_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_FECHADESDE)) {
					existe=true;
					cobrarconciliacionescarterascontabilidadAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(cobrarconciliacionescarterascontabilidadAux.getfecha_desde()));
				}
				 else if(sTipoSeleccionar.equals(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_FECHAHASTA)) {
					existe=true;
					cobrarconciliacionescarterascontabilidadAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(cobrarconciliacionescarterascontabilidadAux.getfecha_hasta()));
				}
				 else if(sTipoSeleccionar.equals(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					cobrarconciliacionescarterascontabilidadAux.setsDescripcionGeneralEntityReporte1(cobrarconciliacionescarterascontabilidadAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO)) {
					existe=true;
					cobrarconciliacionescarterascontabilidadAux.setsDescripcionGeneralEntityReporte1(cobrarconciliacionescarterascontabilidadAux.getcodigo_tipo_movimiento());
				}
				 else if(sTipoSeleccionar.equals(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_NUMEROMAYOR)) {
					existe=true;
					cobrarconciliacionescarterascontabilidadAux.setsDescripcionGeneralEntityReporte1(cobrarconciliacionescarterascontabilidadAux.getnumero_mayor());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarConciliacionesCarterasContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCobrarConciliacionesCarterasContabilidad(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCobrarConciliacionesCarterasContabilidad=true;
				this.isVisibilidadCeldaNuevoRelacionesCobrarConciliacionesCarterasContabilidad=true;
				this.isVisibilidadCeldaGuardarCambiosCobrarConciliacionesCarterasContabilidad=true;
			}
			
			this.isVisibilidadCeldaModificarCobrarConciliacionesCarterasContabilidad=false;
			this.isVisibilidadCeldaActualizarCobrarConciliacionesCarterasContabilidad=false;
			this.isVisibilidadCeldaEliminarCobrarConciliacionesCarterasContabilidad=false;
			this.isVisibilidadCeldaCancelarCobrarConciliacionesCarterasContabilidad=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarConciliacionesCarterasContabilidad=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarConciliacionesCarterasContabilidad=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCobrarConciliacionesCarterasContabilidad=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarConciliacionesCarterasContabilidad=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarConciliacionesCarterasContabilidad=false;
			this.isVisibilidadCeldaModificarCobrarConciliacionesCarterasContabilidad=false;
			this.isVisibilidadCeldaActualizarCobrarConciliacionesCarterasContabilidad=true;
			this.isVisibilidadCeldaEliminarCobrarConciliacionesCarterasContabilidad=false;
			this.isVisibilidadCeldaCancelarCobrarConciliacionesCarterasContabilidad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarConciliacionesCarterasContabilidad=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarConciliacionesCarterasContabilidad=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCobrarConciliacionesCarterasContabilidad=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarConciliacionesCarterasContabilidad=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarConciliacionesCarterasContabilidad=false;
			this.isVisibilidadCeldaModificarCobrarConciliacionesCarterasContabilidad=false;
			this.isVisibilidadCeldaActualizarCobrarConciliacionesCarterasContabilidad=true;
			this.isVisibilidadCeldaEliminarCobrarConciliacionesCarterasContabilidad=true;
			this.isVisibilidadCeldaCancelarCobrarConciliacionesCarterasContabilidad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarConciliacionesCarterasContabilidad=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarConciliacionesCarterasContabilidad=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCobrarConciliacionesCarterasContabilidad=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarConciliacionesCarterasContabilidad=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarConciliacionesCarterasContabilidad=false;
			this.isVisibilidadCeldaModificarCobrarConciliacionesCarterasContabilidad=false;
			this.isVisibilidadCeldaActualizarCobrarConciliacionesCarterasContabilidad=true;
			this.isVisibilidadCeldaEliminarCobrarConciliacionesCarterasContabilidad=false;
			this.isVisibilidadCeldaCancelarCobrarConciliacionesCarterasContabilidad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarConciliacionesCarterasContabilidad=false;
				} else {
					this.isVisibilidadCeldaGuardarCobrarConciliacionesCarterasContabilidad=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCobrarConciliacionesCarterasContabilidad=true;
			this.isVisibilidadCeldaNuevoRelacionesCobrarConciliacionesCarterasContabilidad=true;
			this.isVisibilidadCeldaGuardarCambiosCobrarConciliacionesCarterasContabilidad=true;
			this.isVisibilidadCeldaModificarCobrarConciliacionesCarterasContabilidad=false;
			this.isVisibilidadCeldaActualizarCobrarConciliacionesCarterasContabilidad=false;
			this.isVisibilidadCeldaEliminarCobrarConciliacionesCarterasContabilidad=false;
			this.isVisibilidadCeldaCancelarCobrarConciliacionesCarterasContabilidad=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarConciliacionesCarterasContabilidad=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarConciliacionesCarterasContabilidad=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCobrarConciliacionesCarterasContabilidad=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarConciliacionesCarterasContabilidad=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarConciliacionesCarterasContabilidad=false;
			this.isVisibilidadCeldaActualizarCobrarConciliacionesCarterasContabilidad=false;
			this.isVisibilidadCeldaEliminarCobrarConciliacionesCarterasContabilidad=false;
			this.isVisibilidadCeldaCancelarCobrarConciliacionesCarterasContabilidad=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarConciliacionesCarterasContabilidad=false;
				} else {
					this.isVisibilidadCeldaGuardarCobrarConciliacionesCarterasContabilidad=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCobrarConciliacionesCarterasContabilidad=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarConciliacionesCarterasContabilidad=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarConciliacionesCarterasContabilidad=false;
			this.isVisibilidadCeldaModificarCobrarConciliacionesCarterasContabilidad=true;
			this.isVisibilidadCeldaActualizarCobrarConciliacionesCarterasContabilidad=false;
			this.isVisibilidadCeldaEliminarCobrarConciliacionesCarterasContabilidad=false;
			this.isVisibilidadCeldaCancelarCobrarConciliacionesCarterasContabilidad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarConciliacionesCarterasContabilidad=false;
				} else {
					this.isVisibilidadCeldaGuardarCobrarConciliacionesCarterasContabilidad=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CobrarConciliacionesCarterasContabilidadJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCobrarConciliacionesCarterasContabilidad=true;
			this.isVisibilidadCeldaNuevoRelacionesCobrarConciliacionesCarterasContabilidad=true;
			this.isVisibilidadCeldaGuardarCambiosCobrarConciliacionesCarterasContabilidad=true;
		} else {
			this.actualizarEstadoPanelsCobrarConciliacionesCarterasContabilidad(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCobrarConciliacionesCarterasContabilidad=false;
			//this.isVisibilidadCeldaVerFormCobrarConciliacionesCarterasContabilidad=false;
			this.isVisibilidadCeldaDuplicarCobrarConciliacionesCarterasContabilidad=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!cobrarconciliacionescarterascontabilidadSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCobrarConciliacionesCarterasContabilidad=false;
		} else {
			this.isVisibilidadCeldaNuevoCobrarConciliacionesCarterasContabilidad=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarConciliacionesCarterasContabilidad=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado()) {
			if(!cobrarconciliacionescarterascontabilidadSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCobrarConciliacionesCarterasContabilidad=false;												
			}
			
			this.jButtonCerrarCobrarConciliacionesCarterasContabilidad.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCobrarConciliacionesCarterasContabilidad=false;
		}
		
		if(!this.permiteMantenimiento(this.cobrarconciliacionescarterascontabilidad)) {
			this.isVisibilidadCeldaActualizarCobrarConciliacionesCarterasContabilidad=false;
			this.isVisibilidadCeldaEliminarCobrarConciliacionesCarterasContabilidad=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoCobrarConciliacionesCarterasContabilidad=false;
		this.isVisibilidadCeldaNuevoRelacionesCobrarConciliacionesCarterasContabilidad=false;
		this.isVisibilidadCeldaGuardarCambiosCobrarConciliacionesCarterasContabilidad=false;
		//this.isVisibilidadCeldaModificarCobrarConciliacionesCarterasContabilidad=true;
		this.isVisibilidadCeldaActualizarCobrarConciliacionesCarterasContabilidad=false;
		this.isVisibilidadCeldaEliminarCobrarConciliacionesCarterasContabilidad=false;
		//this.isVisibilidadCeldaCancelarCobrarConciliacionesCarterasContabilidad=true;			
		this.isVisibilidadCeldaGuardarCobrarConciliacionesCarterasContabilidad=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCobrarConciliacionesCarterasContabilidad() {
	}
	
	public void actualizarEstadoPanelsCobrarConciliacionesCarterasContabilidad(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCobrarConciliacionesCarterasContabilidad!=null) {
				this.jScrollPanelDatosEdicionCobrarConciliacionesCarterasContabilidad.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad!=null) {
				this.jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarConciliacionesCarterasContabilidad!=null) {
				this.jScrollPanelDatosCobrarConciliacionesCarterasContabilidad.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarConciliacionesCarterasContabilidad!=null) {
				this.jPanelPaginacionCobrarConciliacionesCarterasContabilidad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarConciliacionesCarterasContabilidad!=null) {
				this.jPanelParametrosReportesCobrarConciliacionesCarterasContabilidad.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCobrarConciliacionesCarterasContabilidad!=null) {
				this.jScrollPanelDatosEdicionCobrarConciliacionesCarterasContabilidad.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad!=null) {
				this.jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosCobrarConciliacionesCarterasContabilidad!=null) {
				this.jScrollPanelDatosCobrarConciliacionesCarterasContabilidad.setVisible(false);
			}
			
			if(this.jPanelPaginacionCobrarConciliacionesCarterasContabilidad!=null) {
				this.jPanelPaginacionCobrarConciliacionesCarterasContabilidad.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCobrarConciliacionesCarterasContabilidad!=null) {
				this.jPanelParametrosReportesCobrarConciliacionesCarterasContabilidad.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCobrarConciliacionesCarterasContabilidad!=null) {
				this.jScrollPanelDatosEdicionCobrarConciliacionesCarterasContabilidad.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad!=null) {
				this.jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCobrarConciliacionesCarterasContabilidad!=null) {
				this.jScrollPanelDatosCobrarConciliacionesCarterasContabilidad.setVisible(false);
			}
			
			if(this.jPanelPaginacionCobrarConciliacionesCarterasContabilidad!=null) {
				this.jPanelPaginacionCobrarConciliacionesCarterasContabilidad.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCobrarConciliacionesCarterasContabilidad!=null) {
				this.jPanelParametrosReportesCobrarConciliacionesCarterasContabilidad.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCobrarConciliacionesCarterasContabilidad!=null) {
				this.jScrollPanelDatosEdicionCobrarConciliacionesCarterasContabilidad.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad!=null) {
				this.jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCobrarConciliacionesCarterasContabilidad!=null) {
				this.jScrollPanelDatosCobrarConciliacionesCarterasContabilidad.setVisible(false);
			}
			
			if(this.jPanelPaginacionCobrarConciliacionesCarterasContabilidad!=null) {
				this.jPanelPaginacionCobrarConciliacionesCarterasContabilidad.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCobrarConciliacionesCarterasContabilidad!=null) {
				this.jPanelParametrosReportesCobrarConciliacionesCarterasContabilidad.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCobrarConciliacionesCarterasContabilidad!=null) {
				this.jScrollPanelDatosEdicionCobrarConciliacionesCarterasContabilidad.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad!=null) {
				this.jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarConciliacionesCarterasContabilidad!=null) {
				this.jScrollPanelDatosCobrarConciliacionesCarterasContabilidad.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarConciliacionesCarterasContabilidad!=null) {
				this.jPanelPaginacionCobrarConciliacionesCarterasContabilidad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarConciliacionesCarterasContabilidad!=null) {
				this.jPanelParametrosReportesCobrarConciliacionesCarterasContabilidad.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCobrarConciliacionesCarterasContabilidad!=null) {
				this.jScrollPanelDatosEdicionCobrarConciliacionesCarterasContabilidad.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad!=null) {
				this.jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarConciliacionesCarterasContabilidad!=null) {
				this.jScrollPanelDatosCobrarConciliacionesCarterasContabilidad.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarConciliacionesCarterasContabilidad!=null) {
				this.jPanelPaginacionCobrarConciliacionesCarterasContabilidad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarConciliacionesCarterasContabilidad!=null) {
				this.jPanelParametrosReportesCobrarConciliacionesCarterasContabilidad.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCobrarConciliacionesCarterasContabilidad!=null) {
				this.jScrollPanelDatosEdicionCobrarConciliacionesCarterasContabilidad.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad!=null) {
				this.jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarConciliacionesCarterasContabilidad!=null) {
				this.jScrollPanelDatosCobrarConciliacionesCarterasContabilidad.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarConciliacionesCarterasContabilidad!=null) {
				this.jPanelPaginacionCobrarConciliacionesCarterasContabilidad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarConciliacionesCarterasContabilidad!=null) {
				this.jPanelParametrosReportesCobrarConciliacionesCarterasContabilidad.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad!=null) {
					this.jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesCobrarConciliacionesCarterasContabilidad!=null) {
				this.jPanelParametrosReportesCobrarConciliacionesCarterasContabilidad.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad!=null) {
				this.jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesCobrarConciliacionesCarterasContabilidad!=null) {
				this.jPanelParametrosReportesCobrarConciliacionesCarterasContabilidad.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaCobrarConciliacionesCarterasContabilidad=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaCobrarConciliacionesCarterasContabilidad) {this.jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad.remove(jPanelBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaContable(Boolean isParaCuentaContable){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableNegation=!isParaCuentaContable;

			this.isVisibilidadBusquedaCobrarConciliacionesCarterasContabilidad=isParaCuentaContable;
			if(!this.isVisibilidadBusquedaCobrarConciliacionesCarterasContabilidad) {this.jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad.remove(jPanelBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad);}
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
			
			this.inicializarActualizarBindingTablaCobrarConciliacionesCarterasContabilidad(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCobrarConciliacionesCarterasContabilidad() {
		this.updateBorderResaltarBusquedasFormularioCobrarConciliacionesCarterasContabilidad();
		this.updateVisibilidadBusquedasFormularioCobrarConciliacionesCarterasContabilidad();
		this.updateHabilitarBusquedasFormularioCobrarConciliacionesCarterasContabilidad();
	}
	
	public void updateBorderResaltarBusquedasFormularioCobrarConciliacionesCarterasContabilidad() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad.getComponents().length>0) {
	

		if(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.resaltarBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad!=null) {
			index= this.jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad.indexOfComponent(this.jPanelBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad.getComponent(index);
				jPanel.setBorder(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.resaltarBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioCobrarConciliacionesCarterasContabilidad() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad.indexOfComponent(this.jPanelBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.mostrarBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad);
			if(!this.cobrarconciliacionescarterascontabilidadConstantesFunciones.mostrarBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad && index>-1) {
				this.jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioCobrarConciliacionesCarterasContabilidad() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad.indexOfComponent(this.jPanelBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.activarBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad);
				this.jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad.setEnabledAt(index,this.cobrarconciliacionescarterascontabilidadConstantesFunciones.activarBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaCobrarConciliacionesCarterasContabilidad(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaCobrarConciliacionesCarterasContabilidad")) {
			index= this.jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad.indexOfComponent(this.jPanelBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad);

			this.jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarConciliacionesCarterasContabilidad.getComponent(index);

			this.cobrarconciliacionescarterascontabilidadConstantesFunciones.setResaltarBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad(resaltar);

			jPanel.setBorder(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.resaltarBusquedaCobrarConciliacionesCarterasContabilidadCobrarConciliacionesCarterasContabilidad);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarCobrarConciliacionesCarterasContabilidad.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioCobrarConciliacionesCarterasContabilidad() throws Exception {

		if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCobrarConciliacionesCarterasContabilidad();
		this.updateVisibilidadResaltarControlesFormularioCobrarConciliacionesCarterasContabilidad();
		this.updateHabilitarResaltarControlesFormularioCobrarConciliacionesCarterasContabilidad();
		
	}
	
	public void updateBorderResaltarControlesFormularioCobrarConciliacionesCarterasContabilidad() throws Exception {
		if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.resaltaridCobrarConciliacionesCarterasContabilidad!=null && this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) {this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jLabelidCobrarConciliacionesCarterasContabilidad.setBorder(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.resaltaridCobrarConciliacionesCarterasContabilidad);}
		if(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.resaltarid_empresaCobrarConciliacionesCarterasContabilidad!=null && this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) {this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jComboBoxid_empresaCobrarConciliacionesCarterasContabilidad.setBorder(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.resaltarid_empresaCobrarConciliacionesCarterasContabilidad);}
		if(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.resaltarid_cuenta_contableCobrarConciliacionesCarterasContabilidad!=null && this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) {this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jComboBoxid_cuenta_contableCobrarConciliacionesCarterasContabilidad.setBorder(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.resaltarid_cuenta_contableCobrarConciliacionesCarterasContabilidad);}
		if(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.resaltarfecha_desdeCobrarConciliacionesCarterasContabilidad!=null && this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) {this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jDateChooserfecha_desdeCobrarConciliacionesCarterasContabilidad.setBorder(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.resaltarfecha_desdeCobrarConciliacionesCarterasContabilidad);}
		if(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.resaltarfecha_hastaCobrarConciliacionesCarterasContabilidad!=null && this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) {this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jDateChooserfecha_hastaCobrarConciliacionesCarterasContabilidad.setBorder(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.resaltarfecha_hastaCobrarConciliacionesCarterasContabilidad);}
		if(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.resaltarcodigoCobrarConciliacionesCarterasContabilidad!=null && this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) {this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTextFieldcodigoCobrarConciliacionesCarterasContabilidad.setBorder(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.resaltarcodigoCobrarConciliacionesCarterasContabilidad);}
		if(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.resaltarcodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidad!=null && this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) {this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTextFieldcodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidad.setBorder(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.resaltarcodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidad);}
		if(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.resaltarnumero_mayorCobrarConciliacionesCarterasContabilidad!=null && this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) {this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTextAreanumero_mayorCobrarConciliacionesCarterasContabilidad.setBorder(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.resaltarnumero_mayorCobrarConciliacionesCarterasContabilidad);}
		if(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.resaltardebito_asientoCobrarConciliacionesCarterasContabilidad!=null && this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) {this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTextFielddebito_asientoCobrarConciliacionesCarterasContabilidad.setBorder(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.resaltardebito_asientoCobrarConciliacionesCarterasContabilidad);}
		if(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.resaltarcredito_asientoCobrarConciliacionesCarterasContabilidad!=null && this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) {this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTextFieldcredito_asientoCobrarConciliacionesCarterasContabilidad.setBorder(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.resaltarcredito_asientoCobrarConciliacionesCarterasContabilidad);}
		if(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.resaltardebito_cuentasCobrarConciliacionesCarterasContabilidad!=null && this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) {this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTextFielddebito_cuentasCobrarConciliacionesCarterasContabilidad.setBorder(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.resaltardebito_cuentasCobrarConciliacionesCarterasContabilidad);}
		if(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.resaltarcredito_cuentasCobrarConciliacionesCarterasContabilidad!=null && this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) {this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTextFieldcredito_cuentasCobrarConciliacionesCarterasContabilidad.setBorder(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.resaltarcredito_cuentasCobrarConciliacionesCarterasContabilidad);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCobrarConciliacionesCarterasContabilidad() throws Exception {		
		if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) {
	
		//this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jLabelidCobrarConciliacionesCarterasContabilidad.setVisible(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.mostraridCobrarConciliacionesCarterasContabilidad);
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jPanelidCobrarConciliacionesCarterasContabilidad.setVisible(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.mostraridCobrarConciliacionesCarterasContabilidad);
		//this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jComboBoxid_empresaCobrarConciliacionesCarterasContabilidad.setVisible(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.mostrarid_empresaCobrarConciliacionesCarterasContabilidad);
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jPanelid_empresaCobrarConciliacionesCarterasContabilidad.setVisible(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.mostrarid_empresaCobrarConciliacionesCarterasContabilidad);
		//this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jComboBoxid_cuenta_contableCobrarConciliacionesCarterasContabilidad.setVisible(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.mostrarid_cuenta_contableCobrarConciliacionesCarterasContabilidad);
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jPanelid_cuenta_contableCobrarConciliacionesCarterasContabilidad.setVisible(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.mostrarid_cuenta_contableCobrarConciliacionesCarterasContabilidad);
		//this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jDateChooserfecha_desdeCobrarConciliacionesCarterasContabilidad.setVisible(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.mostrarfecha_desdeCobrarConciliacionesCarterasContabilidad);
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jPanelfecha_desdeCobrarConciliacionesCarterasContabilidad.setVisible(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.mostrarfecha_desdeCobrarConciliacionesCarterasContabilidad);
		//this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jDateChooserfecha_hastaCobrarConciliacionesCarterasContabilidad.setVisible(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.mostrarfecha_hastaCobrarConciliacionesCarterasContabilidad);
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jPanelfecha_hastaCobrarConciliacionesCarterasContabilidad.setVisible(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.mostrarfecha_hastaCobrarConciliacionesCarterasContabilidad);
		//this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTextFieldcodigoCobrarConciliacionesCarterasContabilidad.setVisible(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.mostrarcodigoCobrarConciliacionesCarterasContabilidad);
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jPanelcodigoCobrarConciliacionesCarterasContabilidad.setVisible(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.mostrarcodigoCobrarConciliacionesCarterasContabilidad);
		//this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTextFieldcodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidad.setVisible(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.mostrarcodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidad);
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jPanelcodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidad.setVisible(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.mostrarcodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidad);
		//this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTextAreanumero_mayorCobrarConciliacionesCarterasContabilidad.setVisible(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.mostrarnumero_mayorCobrarConciliacionesCarterasContabilidad);
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jPanelnumero_mayorCobrarConciliacionesCarterasContabilidad.setVisible(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.mostrarnumero_mayorCobrarConciliacionesCarterasContabilidad);
		//this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTextFielddebito_asientoCobrarConciliacionesCarterasContabilidad.setVisible(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.mostrardebito_asientoCobrarConciliacionesCarterasContabilidad);
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jPaneldebito_asientoCobrarConciliacionesCarterasContabilidad.setVisible(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.mostrardebito_asientoCobrarConciliacionesCarterasContabilidad);
		//this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTextFieldcredito_asientoCobrarConciliacionesCarterasContabilidad.setVisible(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.mostrarcredito_asientoCobrarConciliacionesCarterasContabilidad);
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jPanelcredito_asientoCobrarConciliacionesCarterasContabilidad.setVisible(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.mostrarcredito_asientoCobrarConciliacionesCarterasContabilidad);
		//this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTextFielddebito_cuentasCobrarConciliacionesCarterasContabilidad.setVisible(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.mostrardebito_cuentasCobrarConciliacionesCarterasContabilidad);
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jPaneldebito_cuentasCobrarConciliacionesCarterasContabilidad.setVisible(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.mostrardebito_cuentasCobrarConciliacionesCarterasContabilidad);
		//this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTextFieldcredito_cuentasCobrarConciliacionesCarterasContabilidad.setVisible(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.mostrarcredito_cuentasCobrarConciliacionesCarterasContabilidad);
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jPanelcredito_cuentasCobrarConciliacionesCarterasContabilidad.setVisible(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.mostrarcredito_cuentasCobrarConciliacionesCarterasContabilidad);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCobrarConciliacionesCarterasContabilidad() throws Exception {
		if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad!=null) {
	
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jLabelidCobrarConciliacionesCarterasContabilidad.setEnabled(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.activaridCobrarConciliacionesCarterasContabilidad);
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jComboBoxid_empresaCobrarConciliacionesCarterasContabilidad.setEnabled(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.activarid_empresaCobrarConciliacionesCarterasContabilidad);
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jComboBoxid_cuenta_contableCobrarConciliacionesCarterasContabilidad.setEnabled(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.activarid_cuenta_contableCobrarConciliacionesCarterasContabilidad);
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jDateChooserfecha_desdeCobrarConciliacionesCarterasContabilidad.setEnabled(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.activarfecha_desdeCobrarConciliacionesCarterasContabilidad);
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jDateChooserfecha_hastaCobrarConciliacionesCarterasContabilidad.setEnabled(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.activarfecha_hastaCobrarConciliacionesCarterasContabilidad);
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTextFieldcodigoCobrarConciliacionesCarterasContabilidad.setEnabled(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.activarcodigoCobrarConciliacionesCarterasContabilidad);
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTextFieldcodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidad.setEnabled(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.activarcodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidad);
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTextAreanumero_mayorCobrarConciliacionesCarterasContabilidad.setEnabled(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.activarnumero_mayorCobrarConciliacionesCarterasContabilidad);
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTextFielddebito_asientoCobrarConciliacionesCarterasContabilidad.setEnabled(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.activardebito_asientoCobrarConciliacionesCarterasContabilidad);
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTextFieldcredito_asientoCobrarConciliacionesCarterasContabilidad.setEnabled(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.activarcredito_asientoCobrarConciliacionesCarterasContabilidad);
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTextFielddebito_cuentasCobrarConciliacionesCarterasContabilidad.setEnabled(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.activardebito_cuentasCobrarConciliacionesCarterasContabilidad);
		this.jInternalFrameDetalleFormCobrarConciliacionesCarterasContabilidad.jTextFieldcredito_cuentasCobrarConciliacionesCarterasContabilidad.setEnabled(this.cobrarconciliacionescarterascontabilidadConstantesFunciones.activarcredito_cuentasCobrarConciliacionesCarterasContabilidad);
		}
	}
	
		
}