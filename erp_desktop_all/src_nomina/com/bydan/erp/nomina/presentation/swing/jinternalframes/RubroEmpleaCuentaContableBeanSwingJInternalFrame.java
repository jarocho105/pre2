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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;




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

import com.bydan.erp.nomina.util.RubroEmpleaCuentaContableConstantesFunciones;
import com.bydan.erp.nomina.util.RubroEmpleaCuentaContableParameterReturnGeneral;
//import com.bydan.erp.nomina.util.RubroEmpleaCuentaContableParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.RubroEmpleaCuentaContableBean;
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

import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.nomina.resources.reportes.AuxiliarReportes;


import com.bydan.erp.nomina.util.*;
import com.bydan.erp.nomina.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
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
public class RubroEmpleaCuentaContableBeanSwingJInternalFrame extends RubroEmpleaCuentaContableJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(RubroEmpleaCuentaContableBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<RubroEmpleaCuentaContable> rubroempleacuentacontableValidator = new ClassValidator<RubroEmpleaCuentaContable>(RubroEmpleaCuentaContable.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public RubroEmpleaCuentaContable rubroempleacuentacontable;	
	public RubroEmpleaCuentaContable rubroempleacuentacontableAux;
	public RubroEmpleaCuentaContable rubroempleacuentacontableAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public RubroEmpleaCuentaContable rubroempleacuentacontableTotales;
	public Long idRubroEmpleaCuentaContableActual;
	public Long iIdNuevoRubroEmpleaCuentaContable=0L;
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

	public String sFinalQueryComboRubroEmplea="";

	public List<RubroEmplea> rubroempleasForeignKey;

	public List<RubroEmplea> getrubroempleasForeignKey() {
		return rubroempleasForeignKey;
	}

	public void setrubroempleasForeignKey(List<RubroEmplea> rubroempleasForeignKey) {
		this.rubroempleasForeignKey = rubroempleasForeignKey;
	}

	//OBJETO FK ACTUAL
	public RubroEmplea rubroempleaForeignKey;

	public RubroEmplea getrubroempleaForeignKey() {
		return rubroempleaForeignKey;
	}

	public void setrubroempleaForeignKey(RubroEmplea rubroempleaForeignKey) {
		this.rubroempleaForeignKey = rubroempleaForeignKey;
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
	
	public Boolean isPermisoTodoRubroEmpleaCuentaContable;
	public Boolean isPermisoNuevoRubroEmpleaCuentaContable;
	public Boolean isPermisoActualizarRubroEmpleaCuentaContable;
	public Boolean isPermisoActualizarOriginalRubroEmpleaCuentaContable;
	public Boolean isPermisoEliminarRubroEmpleaCuentaContable;
	public Boolean isPermisoGuardarCambiosRubroEmpleaCuentaContable;
	public Boolean isPermisoConsultaRubroEmpleaCuentaContable;
	public Boolean isPermisoBusquedaRubroEmpleaCuentaContable;
	public Boolean isPermisoReporteRubroEmpleaCuentaContable;
	public Boolean isPermisoPaginacionMedioRubroEmpleaCuentaContable;
	public Boolean isPermisoPaginacionAltoRubroEmpleaCuentaContable;
	public Boolean isPermisoPaginacionTodoRubroEmpleaCuentaContable;
	public Boolean isPermisoCopiarRubroEmpleaCuentaContable;
	public Boolean isPermisoVerFormRubroEmpleaCuentaContable;
	public Boolean isPermisoDuplicarRubroEmpleaCuentaContable;
	public Boolean isPermisoOrdenRubroEmpleaCuentaContable;
	
	
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
	
	public RubroEmpleaCuentaContableParameterReturnGeneral rubroempleacuentacontableReturnGeneral;
	public RubroEmpleaCuentaContableParameterReturnGeneral rubroempleacuentacontableParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoRubroEmpleaCuentaContable=false;
	public Boolean esParaAccionDesdeFormularioRubroEmpleaCuentaContable=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected RubroEmpleaCuentaContableSessionBeanAdditional rubroempleacuentacontableSessionBeanAdditional=null;
	
	public RubroEmpleaCuentaContableSessionBeanAdditional getRubroEmpleaCuentaContableSessionBeanAdditional() {
		return this.rubroempleacuentacontableSessionBeanAdditional;
	}
	
	public void setRubroEmpleaCuentaContableSessionBeanAdditional(RubroEmpleaCuentaContableSessionBeanAdditional rubroempleacuentacontableSessionBeanAdditional) {
		try {
			this.rubroempleacuentacontableSessionBeanAdditional=rubroempleacuentacontableSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional rubroempleacuentacontableBeanSwingJInternalFrameAdditional=null;
	//public class RubroEmpleaCuentaContableBeanSwingJInternalFrame
	
	public RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional getRubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional() {
		return this.rubroempleacuentacontableBeanSwingJInternalFrameAdditional;
	}
	
	public void setRubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional(RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional rubroempleacuentacontableBeanSwingJInternalFrameAdditional) {
		try {
			this.rubroempleacuentacontableBeanSwingJInternalFrameAdditional=rubroempleacuentacontableBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public RubroEmpleaCuentaContableLogic rubroempleacuentacontableLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public RubroEmpleaCuentaContable rubroempleacuentacontableBean;
	public RubroEmpleaCuentaContableConstantesFunciones rubroempleacuentacontableConstantesFunciones;
	//public RubroEmpleaCuentaContableParameterReturnGeneral rubroempleacuentacontableReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public RubroEmpleaLogic rubroempleaLogic;
	public CuentaContableLogic cuentacontableLogic;
	public EstructuraLogic estructuraLogic;
	
	//PARAMETROS
	
	
	//public List<RubroEmpleaCuentaContable> rubroempleacuentacontables;	
	//public List<RubroEmpleaCuentaContable> rubroempleacuentacontablesEliminados;
	//public List<RubroEmpleaCuentaContable> rubroempleacuentacontablesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoRubroEmpleaCuentaContable=false;
	public Boolean isVisibilidadCeldaDuplicarRubroEmpleaCuentaContable=true;
	public Boolean isVisibilidadCeldaCopiarRubroEmpleaCuentaContable=true;
	public Boolean isVisibilidadCeldaVerFormRubroEmpleaCuentaContable=true;
	public Boolean isVisibilidadCeldaOrdenRubroEmpleaCuentaContable=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesRubroEmpleaCuentaContable=false;
	public Boolean isVisibilidadCeldaModificarRubroEmpleaCuentaContable=false;
	public Boolean isVisibilidadCeldaActualizarRubroEmpleaCuentaContable=false;
	public Boolean isVisibilidadCeldaEliminarRubroEmpleaCuentaContable=false;
	public Boolean isVisibilidadCeldaCancelarRubroEmpleaCuentaContable=false;
	public Boolean isVisibilidadCeldaGuardarRubroEmpleaCuentaContable=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosRubroEmpleaCuentaContable=false;	
	
	
	public Boolean isVisibilidadFK_IdCuentaContable=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdEstructura=false;
	public Boolean isVisibilidadFK_IdRubroEmplea=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoRubroEmpleaCuentaContable() {
		return this.iIdNuevoRubroEmpleaCuentaContable;
	}

	public void setiIdNuevoRubroEmpleaCuentaContable(Long iIdNuevoRubroEmpleaCuentaContable) {
		this.iIdNuevoRubroEmpleaCuentaContable = iIdNuevoRubroEmpleaCuentaContable;
	}
	
	public Long getidRubroEmpleaCuentaContableActual() {
		return this.idRubroEmpleaCuentaContableActual;
	}

	public void setidRubroEmpleaCuentaContableActual(Long idRubroEmpleaCuentaContableActual) {
		this.idRubroEmpleaCuentaContableActual = idRubroEmpleaCuentaContableActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public RubroEmpleaCuentaContable getrubroempleacuentacontable() {
		return this.rubroempleacuentacontable;
	}

	public void setrubroempleacuentacontable(RubroEmpleaCuentaContable rubroempleacuentacontable) {
		this.rubroempleacuentacontable = rubroempleacuentacontable;
	}
	
	public RubroEmpleaCuentaContable getrubroempleacuentacontableAux() {
		return this.rubroempleacuentacontableAux;
	}

	public void setrubroempleacuentacontableAux(RubroEmpleaCuentaContable rubroempleacuentacontableAux) {
		this.rubroempleacuentacontableAux = rubroempleacuentacontableAux;
	}				
	
	public RubroEmpleaCuentaContable getrubroempleacuentacontableAnterior() {
		return this.rubroempleacuentacontableAnterior;
	}

	public void setrubroempleacuentacontableAnterior(RubroEmpleaCuentaContable rubroempleacuentacontableAnterior) {
		this.rubroempleacuentacontableAnterior = rubroempleacuentacontableAnterior;
	}	
	
	public RubroEmpleaCuentaContable getrubroempleacuentacontableTotales() {
		return this.rubroempleacuentacontableTotales;
	}

	public void setrubroempleacuentacontableTotales(RubroEmpleaCuentaContable rubroempleacuentacontableTotales) {
		this.rubroempleacuentacontableTotales = rubroempleacuentacontableTotales;
	}	
	
	public RubroEmpleaCuentaContable getrubroempleacuentacontableBean() {
		return this.rubroempleacuentacontableBean;
	}

	public void setrubroempleacuentacontableBean(RubroEmpleaCuentaContable rubroempleacuentacontableBean) {
		this.rubroempleacuentacontableBean = rubroempleacuentacontableBean;
	}	
	
	public RubroEmpleaCuentaContableParameterReturnGeneral getrubroempleacuentacontableReturnGeneral() {
		return this.rubroempleacuentacontableReturnGeneral;
	}

	public void setrubroempleacuentacontableReturnGeneral(RubroEmpleaCuentaContableParameterReturnGeneral rubroempleacuentacontableReturnGeneral) {
		this.rubroempleacuentacontableReturnGeneral = rubroempleacuentacontableReturnGeneral;
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

	public Long id_estructuraFK_IdEstructura=-1L;

	public Long getid_estructuraFK_IdEstructura() {
		return this.id_estructuraFK_IdEstructura;
	}

	public void setid_estructuraFK_IdEstructura(Long id_estructuraFK_IdEstructura) {
		this.id_estructuraFK_IdEstructura = id_estructuraFK_IdEstructura;
	}

	public Long id_rubro_empleaFK_IdRubroEmplea=-1L;

	public Long getid_rubro_empleaFK_IdRubroEmplea() {
		return this.id_rubro_empleaFK_IdRubroEmplea;
	}

	public void setid_rubro_empleaFK_IdRubroEmplea(Long id_rubro_empleaFK_IdRubroEmplea) {
		this.id_rubro_empleaFK_IdRubroEmplea = id_rubro_empleaFK_IdRubroEmplea;
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
	
	
	public RubroEmpleaCuentaContableLogic getRubroEmpleaCuentaContableLogic()	{		
		return rubroempleacuentacontableLogic;
	}

	public void setRubroEmpleaCuentaContableLogic(RubroEmpleaCuentaContableLogic rubroempleacuentacontableLogic) {
		this.rubroempleacuentacontableLogic = rubroempleacuentacontableLogic;
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
	
	public Boolean getIsEsNuevoRubroEmpleaCuentaContable() {
		return isEsNuevoRubroEmpleaCuentaContable;
	}

	public void setIsEsNuevoRubroEmpleaCuentaContable(Boolean isEsNuevoRubroEmpleaCuentaContable) {
		this.isEsNuevoRubroEmpleaCuentaContable = isEsNuevoRubroEmpleaCuentaContable;
	}

	public Boolean getEsParaAccionDesdeFormularioRubroEmpleaCuentaContable() {
		return esParaAccionDesdeFormularioRubroEmpleaCuentaContable;
	}
	
	public void setEsParaAccionDesdeFormularioRubroEmpleaCuentaContable(Boolean esParaAccionDesdeFormularioRubroEmpleaCuentaContable) {
		this.esParaAccionDesdeFormularioRubroEmpleaCuentaContable = esParaAccionDesdeFormularioRubroEmpleaCuentaContable;
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

			if(this.rubroempleacuentacontableSessionBean==null) {
				this.rubroempleacuentacontableSessionBean=new RubroEmpleaCuentaContableSessionBean();
			}

			if(!this.rubroempleacuentacontableSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(rubroempleacuentacontableSessionBean.getlidEmpresaActual());
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

			if(this.rubroempleacuentacontableSessionBean==null) {
				this.rubroempleacuentacontableSessionBean=new RubroEmpleaCuentaContableSessionBean();
			}

			if(!this.rubroempleacuentacontableSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(rubroempleacuentacontableSessionBean.getlidSucursalActual());
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

	public void cargarCombosRubroEmpleasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.rubroempleasForeignKey=new ArrayList<RubroEmplea>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			RubroEmpleaLogic rubroempleaLogic=new RubroEmpleaLogic();

			//rubroempleaLogic.getRubroEmpleaDataAccess().setIsForForeingKeyData(true);

			if(this.rubroempleacuentacontableSessionBean==null) {
				this.rubroempleacuentacontableSessionBean=new RubroEmpleaCuentaContableSessionBean();
			}

			if(!this.rubroempleacuentacontableSessionBean.getisBusquedaDesdeForeignKeySesionRubroEmplea()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//rubroempleaLogic.getRubroEmpleaDataAccess().setIsForForeingKeyData(true);

					rubroempleaLogic.getTodosRubroEmpleasWithConnection(sFinalQuery,new Pagination());

					this.rubroempleasForeignKey=rubroempleaLogic.getRubroEmpleas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaRubroEmplea(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					rubroempleaLogic.getEntityWithConnection(rubroempleacuentacontableSessionBean.getlidRubroEmpleaActual());
					this.rubroempleasForeignKey.add(rubroempleaLogic.getRubroEmplea());
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

			if(this.rubroempleacuentacontableSessionBean==null) {
				this.rubroempleacuentacontableSessionBean=new RubroEmpleaCuentaContableSessionBean();
			}

			if(!this.rubroempleacuentacontableSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
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
					cuentacontableLogic.getEntityWithConnection(rubroempleacuentacontableSessionBean.getlidCuentaContableActual());
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

			//estructuraLogic.getEstructuraDataAccess().setIsForForeingKeyData(true);

			if(this.rubroempleacuentacontableSessionBean==null) {
				this.rubroempleacuentacontableSessionBean=new RubroEmpleaCuentaContableSessionBean();
			}

			if(!this.rubroempleacuentacontableSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//estructuraLogic.getEstructuraDataAccess().setIsForForeingKeyData(true);

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
					estructuraLogic.getEntityWithConnection(rubroempleacuentacontableSessionBean.getlidEstructuraActual());
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

					if(this.rubroempleacuentacontable!=null) {
						this.rubroempleacuentacontable.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) {
						this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_empresaRubroEmpleaCuentaContable.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaRubroEmpleaCuentaContable.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) {
						if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_empresaRubroEmpleaCuentaContable.getItemCount()>0) {
							this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_empresaRubroEmpleaCuentaContable.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaRubroEmpleaCuentaContableGenerico)throws Exception
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
				jComboBoxid_empresaRubroEmpleaCuentaContableGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaRubroEmpleaCuentaContableGenerico!=null && jComboBoxid_empresaRubroEmpleaCuentaContableGenerico.getItemCount()>0) {
					jComboBoxid_empresaRubroEmpleaCuentaContableGenerico.setSelectedIndex(0);
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

					if(this.rubroempleacuentacontable!=null) {
						this.rubroempleacuentacontable.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) {
						this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_sucursalRubroEmpleaCuentaContable.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalRubroEmpleaCuentaContable.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) {
						if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_sucursalRubroEmpleaCuentaContable.getItemCount()>0) {
							this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_sucursalRubroEmpleaCuentaContable.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalRubroEmpleaCuentaContableGenerico)throws Exception
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
				jComboBoxid_sucursalRubroEmpleaCuentaContableGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalRubroEmpleaCuentaContableGenerico!=null && jComboBoxid_sucursalRubroEmpleaCuentaContableGenerico.getItemCount()>0) {
					jComboBoxid_sucursalRubroEmpleaCuentaContableGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualRubroEmpleaForeignKey(Long idRubroEmpleaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			RubroEmplea  rubroempleaTemp=null;

			for(RubroEmplea rubroempleaAux:rubroempleasForeignKey) {
				if(rubroempleaAux.getId()!=null && rubroempleaAux.getId().equals(idRubroEmpleaSeleccionado)) {
					rubroempleaTemp=rubroempleaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(rubroempleaTemp!=null) {

					if(this.rubroempleacuentacontable!=null) {
						this.rubroempleacuentacontable.setRubroEmplea(rubroempleaTemp);
					}

					if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) {
						this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_rubro_empleaRubroEmpleaCuentaContable.setSelectedItem(rubroempleaTemp);
					}
				} else {
					//jComboBoxid_rubro_empleaRubroEmpleaCuentaContable.setSelectedItem(rubroempleaTemp);
					if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) {
						if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_rubro_empleaRubroEmpleaCuentaContable.getItemCount()>0) {
							this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_rubro_empleaRubroEmpleaCuentaContable.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdRubroEmplea") || sFormularioTipoBusqueda.equals("Todos")){
					if(rubroempleaTemp!=null && jComboBoxid_rubro_empleaFK_IdRubroEmpleaRubroEmpleaCuentaContable!=null) {
						jComboBoxid_rubro_empleaFK_IdRubroEmpleaRubroEmpleaCuentaContable.setSelectedItem(rubroempleaTemp);
					} else {
						if(jComboBoxid_rubro_empleaFK_IdRubroEmpleaRubroEmpleaCuentaContable!=null) {
							//jComboBoxid_rubro_empleaFK_IdRubroEmpleaRubroEmpleaCuentaContable.setSelectedItem(rubroempleaTemp);
							if(jComboBoxid_rubro_empleaFK_IdRubroEmpleaRubroEmpleaCuentaContable.getItemCount()>0) {
								jComboBoxid_rubro_empleaFK_IdRubroEmpleaRubroEmpleaCuentaContable.setSelectedIndex(0);
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

	public String getActualRubroEmpleaForeignKeyDescripcion(Long idRubroEmpleaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			RubroEmplea  rubroempleaTemp=null;

			for(RubroEmplea rubroempleaAux:rubroempleasForeignKey) {
				if(rubroempleaAux.getId()!=null && rubroempleaAux.getId().equals(idRubroEmpleaSeleccionado)) {
					rubroempleaTemp=rubroempleaAux;
					break;
				}
			}


			sDescripcion=RubroEmpleaConstantesFunciones.getRubroEmpleaDescripcion(rubroempleaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualRubroEmpleaForeignKeyGenerico(Long idRubroEmpleaSeleccionado,JComboBox jComboBoxid_rubro_empleaRubroEmpleaCuentaContableGenerico)throws Exception
	{
		try
		{
			RubroEmplea  rubroempleaTemp=null;

			for(RubroEmplea rubroempleaAux:rubroempleasForeignKey) {
				if(rubroempleaAux.getId()!=null && rubroempleaAux.getId().equals(idRubroEmpleaSeleccionado)) {
					rubroempleaTemp=rubroempleaAux;
					break;
				}
			}

			if(rubroempleaTemp!=null) {
				jComboBoxid_rubro_empleaRubroEmpleaCuentaContableGenerico.setSelectedItem(rubroempleaTemp);
			} else {
				if(jComboBoxid_rubro_empleaRubroEmpleaCuentaContableGenerico!=null && jComboBoxid_rubro_empleaRubroEmpleaCuentaContableGenerico.getItemCount()>0) {
					jComboBoxid_rubro_empleaRubroEmpleaCuentaContableGenerico.setSelectedIndex(0);
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

					if(this.rubroempleacuentacontable!=null) {
						this.rubroempleacuentacontable.setCuentaContable(cuentacontableTemp);
					}

					if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) {
						this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_cuenta_contableRubroEmpleaCuentaContable.setSelectedItem(cuentacontableTemp);
					}
				} else {
					//jComboBoxid_cuenta_contableRubroEmpleaCuentaContable.setSelectedItem(cuentacontableTemp);
					if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) {
						if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_cuenta_contableRubroEmpleaCuentaContable.getItemCount()>0) {
							this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_cuenta_contableRubroEmpleaCuentaContable.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCuentaContable") || sFormularioTipoBusqueda.equals("Todos")){
					if(cuentacontableTemp!=null && jComboBoxid_cuenta_contableFK_IdCuentaContableRubroEmpleaCuentaContable!=null) {
						jComboBoxid_cuenta_contableFK_IdCuentaContableRubroEmpleaCuentaContable.setSelectedItem(cuentacontableTemp);
					} else {
						if(jComboBoxid_cuenta_contableFK_IdCuentaContableRubroEmpleaCuentaContable!=null) {
							//jComboBoxid_cuenta_contableFK_IdCuentaContableRubroEmpleaCuentaContable.setSelectedItem(cuentacontableTemp);
							if(jComboBoxid_cuenta_contableFK_IdCuentaContableRubroEmpleaCuentaContable.getItemCount()>0) {
								jComboBoxid_cuenta_contableFK_IdCuentaContableRubroEmpleaCuentaContable.setSelectedIndex(0);
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
	public void setActualCuentaContableForeignKeyGenerico(Long idCuentaContableSeleccionado,JComboBox jComboBoxid_cuenta_contableRubroEmpleaCuentaContableGenerico)throws Exception
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
				jComboBoxid_cuenta_contableRubroEmpleaCuentaContableGenerico.setSelectedItem(cuentacontableTemp);
			} else {
				if(jComboBoxid_cuenta_contableRubroEmpleaCuentaContableGenerico!=null && jComboBoxid_cuenta_contableRubroEmpleaCuentaContableGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contableRubroEmpleaCuentaContableGenerico.setSelectedIndex(0);
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

					if(this.rubroempleacuentacontable!=null) {
						this.rubroempleacuentacontable.setEstructura(estructuraTemp);
					}

					if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) {
						this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_estructuraRubroEmpleaCuentaContable.setSelectedItem(estructuraTemp);
					}
				} else {
					//jComboBoxid_estructuraRubroEmpleaCuentaContable.setSelectedItem(estructuraTemp);
					if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) {
						if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_estructuraRubroEmpleaCuentaContable.getItemCount()>0) {
							this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_estructuraRubroEmpleaCuentaContable.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEstructura") || sFormularioTipoBusqueda.equals("Todos")){
					if(estructuraTemp!=null && jComboBoxid_estructuraFK_IdEstructuraRubroEmpleaCuentaContable!=null) {
						jComboBoxid_estructuraFK_IdEstructuraRubroEmpleaCuentaContable.setSelectedItem(estructuraTemp);
					} else {
						if(jComboBoxid_estructuraFK_IdEstructuraRubroEmpleaCuentaContable!=null) {
							//jComboBoxid_estructuraFK_IdEstructuraRubroEmpleaCuentaContable.setSelectedItem(estructuraTemp);
							if(jComboBoxid_estructuraFK_IdEstructuraRubroEmpleaCuentaContable.getItemCount()>0) {
								jComboBoxid_estructuraFK_IdEstructuraRubroEmpleaCuentaContable.setSelectedIndex(0);
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
	public void setActualEstructuraForeignKeyGenerico(Long idEstructuraSeleccionado,JComboBox jComboBoxid_estructuraRubroEmpleaCuentaContableGenerico)throws Exception
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
				jComboBoxid_estructuraRubroEmpleaCuentaContableGenerico.setSelectedItem(estructuraTemp);
			} else {
				if(jComboBoxid_estructuraRubroEmpleaCuentaContableGenerico!=null && jComboBoxid_estructuraRubroEmpleaCuentaContableGenerico.getItemCount()>0) {
					jComboBoxid_estructuraRubroEmpleaCuentaContableGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(RubroEmpleaCuentaContable rubroempleacuentacontable,JComboBox jComboBoxid_empresaRubroEmpleaCuentaContableGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaRubroEmpleaCuentaContableGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_empresaRubroEmpleaCuentaContable.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaRubroEmpleaCuentaContableGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				rubroempleacuentacontable.setid_empresa(empresaAux.getId());
				rubroempleacuentacontable.setempresa_descripcion(RubroEmpleaCuentaContableConstantesFunciones.getEmpresaDescripcion(empresaAux));
				rubroempleacuentacontable.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(RubroEmpleaCuentaContable rubroempleacuentacontable,JComboBox jComboBoxid_sucursalRubroEmpleaCuentaContableGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalRubroEmpleaCuentaContableGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_sucursalRubroEmpleaCuentaContable.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalRubroEmpleaCuentaContableGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				rubroempleacuentacontable.setid_sucursal(sucursalAux.getId());
				rubroempleacuentacontable.setsucursal_descripcion(RubroEmpleaCuentaContableConstantesFunciones.getSucursalDescripcion(sucursalAux));
				rubroempleacuentacontable.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarRubroEmpleaForeignKey(RubroEmpleaCuentaContable rubroempleacuentacontable,JComboBox jComboBoxid_rubro_empleaRubroEmpleaCuentaContableGenerico)throws Exception
	{
		try
		{
			RubroEmplea  rubroempleaAux=new RubroEmplea();

			if(jComboBoxid_rubro_empleaRubroEmpleaCuentaContableGenerico==null) {
				rubroempleaAux=(RubroEmplea)this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_rubro_empleaRubroEmpleaCuentaContable.getSelectedItem();
			} else {
				rubroempleaAux=(RubroEmplea)jComboBoxid_rubro_empleaRubroEmpleaCuentaContableGenerico.getSelectedItem();
			}

			if(rubroempleaAux!=null && rubroempleaAux.getId()!=null) {
				rubroempleacuentacontable.setid_rubro_emplea(rubroempleaAux.getId());
				rubroempleacuentacontable.setrubroemplea_descripcion(RubroEmpleaCuentaContableConstantesFunciones.getRubroEmpleaDescripcion(rubroempleaAux));
				rubroempleacuentacontable.setRubroEmplea(rubroempleaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableForeignKey(RubroEmpleaCuentaContable rubroempleacuentacontable,JComboBox jComboBoxid_cuenta_contableRubroEmpleaCuentaContableGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contableRubroEmpleaCuentaContableGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_cuenta_contableRubroEmpleaCuentaContable.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contableRubroEmpleaCuentaContableGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null && cuentacontableAux.getId()!=null) {
				rubroempleacuentacontable.setid_cuenta_contable(cuentacontableAux.getId());
				rubroempleacuentacontable.setcuentacontable_descripcion(RubroEmpleaCuentaContableConstantesFunciones.getCuentaContableDescripcion(cuentacontableAux));
				rubroempleacuentacontable.setCuentaContable(cuentacontableAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstructuraForeignKey(RubroEmpleaCuentaContable rubroempleacuentacontable,JComboBox jComboBoxid_estructuraRubroEmpleaCuentaContableGenerico)throws Exception
	{
		try
		{
			Estructura  estructuraAux=new Estructura();

			if(jComboBoxid_estructuraRubroEmpleaCuentaContableGenerico==null) {
				estructuraAux=(Estructura)this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_estructuraRubroEmpleaCuentaContable.getSelectedItem();
			} else {
				estructuraAux=(Estructura)jComboBoxid_estructuraRubroEmpleaCuentaContableGenerico.getSelectedItem();
			}

			if(estructuraAux!=null && estructuraAux.getId()!=null) {
				rubroempleacuentacontable.setid_estructura(estructuraAux.getId());
				rubroempleacuentacontable.setestructura_descripcion(RubroEmpleaCuentaContableConstantesFunciones.getEstructuraDescripcion(estructuraAux));
				rubroempleacuentacontable.setEstructura(estructuraAux);			}
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

					if(!RubroEmpleaCuentaContableJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) { 
							this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_empresaRubroEmpleaCuentaContable.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_empresaRubroEmpleaCuentaContable.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) { 
					}

					if(!RubroEmpleaCuentaContableJInternalFrame.ISBINDING_MANUAL) {
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

					if(!RubroEmpleaCuentaContableJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) { 
							this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_sucursalRubroEmpleaCuentaContable.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_sucursalRubroEmpleaCuentaContable.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) { 
					}

					if(!RubroEmpleaCuentaContableJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameRubroEmpleasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingRubroEmplea=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!RubroEmpleaCuentaContableJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) { 
							this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_rubro_empleaRubroEmpleaCuentaContable.removeAllItems();

							for(RubroEmplea rubroemplea:this.rubroempleasForeignKey) {
								this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_rubro_empleaRubroEmpleaCuentaContable.addItem(rubroemplea);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) { 
					}

					if(!RubroEmpleaCuentaContableJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdRubroEmplea") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!RubroEmpleaCuentaContableJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_rubro_empleaFK_IdRubroEmpleaRubroEmpleaCuentaContable.removeAllItems();

							for(RubroEmplea rubroemplea:this.rubroempleasForeignKey) {
								this.jComboBoxid_rubro_empleaFK_IdRubroEmpleaRubroEmpleaCuentaContable.addItem(rubroemplea);
							}
						}

						if(!RubroEmpleaCuentaContableJInternalFrame.ISBINDING_MANUAL) {
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

					if(!RubroEmpleaCuentaContableJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) { 
							this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_cuenta_contableRubroEmpleaCuentaContable.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_cuenta_contableRubroEmpleaCuentaContable.addItem(cuentacontable);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) { 
					}

					if(!RubroEmpleaCuentaContableJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCuentaContable") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!RubroEmpleaCuentaContableJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableRubroEmpleaCuentaContable.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jComboBoxid_cuenta_contableFK_IdCuentaContableRubroEmpleaCuentaContable.addItem(cuentacontable);
							}
						}

						if(!RubroEmpleaCuentaContableJInternalFrame.ISBINDING_MANUAL) {
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

					if(!RubroEmpleaCuentaContableJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) { 
							this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_estructuraRubroEmpleaCuentaContable.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_estructuraRubroEmpleaCuentaContable.addItem(estructura);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) { 
					}

					if(!RubroEmpleaCuentaContableJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEstructura") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!RubroEmpleaCuentaContableJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_estructuraFK_IdEstructuraRubroEmpleaCuentaContable.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jComboBoxid_estructuraFK_IdEstructuraRubroEmpleaCuentaContable.addItem(estructura);
							}
						}

						if(!RubroEmpleaCuentaContableJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) {
							this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_empresaRubroEmpleaCuentaContable.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) {
							this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_empresaRubroEmpleaCuentaContable.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) {
							this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_sucursalRubroEmpleaCuentaContable.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) {
							this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_sucursalRubroEmpleaCuentaContable.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameRubroEmpleaForeignKey(RubroEmplea rubroemplea,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) {
							this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_rubro_empleaRubroEmpleaCuentaContable.setSelectedItem(rubroemplea);
						}
					} else {
						if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) {
							this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_rubro_empleaRubroEmpleaCuentaContable.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_rubro_empleaFK_IdRubroEmpleaRubroEmpleaCuentaContable.setSelectedItem(rubroemplea);
						} else {
							this.jComboBoxid_rubro_empleaFK_IdRubroEmpleaRubroEmpleaCuentaContable.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) {
							this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_cuenta_contableRubroEmpleaCuentaContable.setSelectedItem(cuentacontable);
						}
					} else {
						if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) {
							this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_cuenta_contableRubroEmpleaCuentaContable.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableRubroEmpleaCuentaContable.setSelectedItem(cuentacontable);
						} else {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableRubroEmpleaCuentaContable.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) {
							this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_estructuraRubroEmpleaCuentaContable.setSelectedItem(estructura);
						}
					} else {
						if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) {
							this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_estructuraRubroEmpleaCuentaContable.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_estructuraFK_IdEstructuraRubroEmpleaCuentaContable.setSelectedItem(estructura);
						} else {
							this.jComboBoxid_estructuraFK_IdEstructuraRubroEmpleaCuentaContable.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesRubroEmpleaCuentaContable() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			RubroEmpleaCuentaContableConstantesFunciones.refrescarForeignKeysDescripcionesRubroEmpleaCuentaContable(this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			RubroEmpleaCuentaContableConstantesFunciones.refrescarForeignKeysDescripcionesRubroEmpleaCuentaContable(this.rubroempleacuentacontables);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(RubroEmplea.class));
		classes.add(new Classe(CuentaContable.class));
		classes.add(new Classe(Estructura.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//rubroempleacuentacontableLogic.setRubroEmpleaCuentaContables(this.rubroempleacuentacontables);
			rubroempleacuentacontableLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		*/				
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
		
	public RubroEmpleaCuentaContableParameterReturnGeneral getRubroEmpleaCuentaContableParameterGeneral() {
		return this.rubroempleacuentacontableParameterGeneral;
	}
	
	public void setRubroEmpleaCuentaContableParameterGeneral(RubroEmpleaCuentaContableParameterReturnGeneral rubroempleacuentacontableParameterGeneral) {
		this.rubroempleacuentacontableParameterGeneral = rubroempleacuentacontableParameterGeneral;
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
	
	public Boolean getIsPermisoTodoRubroEmpleaCuentaContable() {
		return isPermisoTodoRubroEmpleaCuentaContable;
	}

	public void setIsPermisoTodoRubroEmpleaCuentaContable(Boolean isPermisoTodoRubroEmpleaCuentaContable) {
		this.isPermisoTodoRubroEmpleaCuentaContable = isPermisoTodoRubroEmpleaCuentaContable;
	}

	public Boolean getIsPermisoNuevoRubroEmpleaCuentaContable() {
		return isPermisoNuevoRubroEmpleaCuentaContable;
	}

	public void setIsPermisoNuevoRubroEmpleaCuentaContable(Boolean isPermisoNuevoRubroEmpleaCuentaContable) {
		this.isPermisoNuevoRubroEmpleaCuentaContable = isPermisoNuevoRubroEmpleaCuentaContable;
	}

	public Boolean getIsPermisoActualizarRubroEmpleaCuentaContable() {
		return isPermisoActualizarRubroEmpleaCuentaContable;
	}

	public void setIsPermisoActualizarRubroEmpleaCuentaContable(Boolean isPermisoActualizarRubroEmpleaCuentaContable) {
		this.isPermisoActualizarRubroEmpleaCuentaContable = isPermisoActualizarRubroEmpleaCuentaContable;
	}

	public Boolean getIsPermisoEliminarRubroEmpleaCuentaContable() {
		return isPermisoEliminarRubroEmpleaCuentaContable;
	}

	public void setIsPermisoEliminarRubroEmpleaCuentaContable(Boolean isPermisoEliminarRubroEmpleaCuentaContable) {
		this.isPermisoEliminarRubroEmpleaCuentaContable = isPermisoEliminarRubroEmpleaCuentaContable;
	}

	public Boolean getIsPermisoGuardarCambiosRubroEmpleaCuentaContable() {
		return isPermisoGuardarCambiosRubroEmpleaCuentaContable;
	}

	public void setIsPermisoGuardarCambiosRubroEmpleaCuentaContable(Boolean isPermisoGuardarCambiosRubroEmpleaCuentaContable) {
		this.isPermisoGuardarCambiosRubroEmpleaCuentaContable = isPermisoGuardarCambiosRubroEmpleaCuentaContable;
	}
	
	public Boolean getIsPermisoConsultaRubroEmpleaCuentaContable() {
		return isPermisoConsultaRubroEmpleaCuentaContable;
	}

	public void setIsPermisoConsultaRubroEmpleaCuentaContable(Boolean isPermisoConsultaRubroEmpleaCuentaContable) {
		this.isPermisoConsultaRubroEmpleaCuentaContable = isPermisoConsultaRubroEmpleaCuentaContable;
	}

	public Boolean getIsPermisoBusquedaRubroEmpleaCuentaContable() {
		return isPermisoBusquedaRubroEmpleaCuentaContable;
	}

	public void setIsPermisoBusquedaRubroEmpleaCuentaContable(Boolean isPermisoBusquedaRubroEmpleaCuentaContable) {
		this.isPermisoBusquedaRubroEmpleaCuentaContable = isPermisoBusquedaRubroEmpleaCuentaContable;
	}

	public Boolean getIsPermisoReporteRubroEmpleaCuentaContable() {
		return isPermisoReporteRubroEmpleaCuentaContable;
	}

	public void setIsPermisoReporteRubroEmpleaCuentaContable(Boolean isPermisoReporteRubroEmpleaCuentaContable) {
		this.isPermisoReporteRubroEmpleaCuentaContable = isPermisoReporteRubroEmpleaCuentaContable;
	}
	
	public Boolean getIsPermisoPaginacionMedioRubroEmpleaCuentaContable() {
		return isPermisoPaginacionMedioRubroEmpleaCuentaContable;
	}

	public void setIsPermisoPaginacionMedioRubroEmpleaCuentaContable(Boolean isPermisoPaginacionMedioRubroEmpleaCuentaContable) {
		this.isPermisoPaginacionMedioRubroEmpleaCuentaContable = isPermisoPaginacionMedioRubroEmpleaCuentaContable;
	}
	
	public Boolean getIsPermisoPaginacionTodoRubroEmpleaCuentaContable() {
		return isPermisoPaginacionTodoRubroEmpleaCuentaContable;
	}

	public void setIsPermisoPaginacionTodoRubroEmpleaCuentaContable(Boolean isPermisoPaginacionTodoRubroEmpleaCuentaContable) {
		this.isPermisoPaginacionTodoRubroEmpleaCuentaContable = isPermisoPaginacionTodoRubroEmpleaCuentaContable;
	}
	
	public Boolean getIsPermisoPaginacionAltoRubroEmpleaCuentaContable() {
		return isPermisoPaginacionAltoRubroEmpleaCuentaContable;
	}

	public void setIsPermisoPaginacionAltoRubroEmpleaCuentaContable(Boolean isPermisoPaginacionAltoRubroEmpleaCuentaContable) {
		this.isPermisoPaginacionAltoRubroEmpleaCuentaContable = isPermisoPaginacionAltoRubroEmpleaCuentaContable;
	}
	
	public Boolean getIsPermisoCopiarRubroEmpleaCuentaContable() {
		return isPermisoCopiarRubroEmpleaCuentaContable;
	}

	public void setIsPermisoCopiarRubroEmpleaCuentaContable(Boolean isPermisoCopiarRubroEmpleaCuentaContable) {
		this.isPermisoCopiarRubroEmpleaCuentaContable = isPermisoCopiarRubroEmpleaCuentaContable;
	}
	
	public Boolean getIsPermisoVerFormRubroEmpleaCuentaContable() {
		return isPermisoVerFormRubroEmpleaCuentaContable;
	}

	public void setIsPermisoVerFormRubroEmpleaCuentaContable(Boolean isPermisoVerFormRubroEmpleaCuentaContable) {
		this.isPermisoVerFormRubroEmpleaCuentaContable = isPermisoVerFormRubroEmpleaCuentaContable;
	}
	
	public Boolean getIsPermisoDuplicarRubroEmpleaCuentaContable() {
		return isPermisoDuplicarRubroEmpleaCuentaContable;
	}

	public void setIsPermisoDuplicarRubroEmpleaCuentaContable(Boolean isPermisoDuplicarRubroEmpleaCuentaContable) {
		this.isPermisoDuplicarRubroEmpleaCuentaContable = isPermisoDuplicarRubroEmpleaCuentaContable;
	}
	
	public Boolean getIsPermisoOrdenRubroEmpleaCuentaContable() {
		return isPermisoOrdenRubroEmpleaCuentaContable;
	}

	public void setIsPermisoOrdenRubroEmpleaCuentaContable(Boolean isPermisoOrdenRubroEmpleaCuentaContable) {
		this.isPermisoOrdenRubroEmpleaCuentaContable = isPermisoOrdenRubroEmpleaCuentaContable;
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
	
	public Boolean getIsVisibilidadCeldaNuevoRubroEmpleaCuentaContable() {
		return isVisibilidadCeldaNuevoRubroEmpleaCuentaContable;
	}

	public void setIsVisibilidadCeldaNuevoRubroEmpleaCuentaContable(Boolean isVisibilidadCeldaNuevoRubroEmpleaCuentaContable) {
		this.isVisibilidadCeldaNuevoRubroEmpleaCuentaContable = isVisibilidadCeldaNuevoRubroEmpleaCuentaContable;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarRubroEmpleaCuentaContable() {
		return isVisibilidadCeldaDuplicarRubroEmpleaCuentaContable;
	}

	public void setIsVisibilidadCeldaDuplicarRubroEmpleaCuentaContable(Boolean isVisibilidadCeldaDuplicarRubroEmpleaCuentaContable) {
		this.isVisibilidadCeldaDuplicarRubroEmpleaCuentaContable = isVisibilidadCeldaDuplicarRubroEmpleaCuentaContable;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarRubroEmpleaCuentaContable() {
		return isVisibilidadCeldaCopiarRubroEmpleaCuentaContable;
	}

	public void setIsVisibilidadCeldaCopiarRubroEmpleaCuentaContable(Boolean isVisibilidadCeldaCopiarRubroEmpleaCuentaContable) {
		this.isVisibilidadCeldaCopiarRubroEmpleaCuentaContable = isVisibilidadCeldaCopiarRubroEmpleaCuentaContable;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormRubroEmpleaCuentaContable() {
		return isVisibilidadCeldaVerFormRubroEmpleaCuentaContable;
	}

	public void setIsVisibilidadCeldaVerFormRubroEmpleaCuentaContable(Boolean isVisibilidadCeldaVerFormRubroEmpleaCuentaContable) {
		this.isVisibilidadCeldaVerFormRubroEmpleaCuentaContable = isVisibilidadCeldaVerFormRubroEmpleaCuentaContable;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenRubroEmpleaCuentaContable() {
		return isVisibilidadCeldaOrdenRubroEmpleaCuentaContable;
	}

	public void setIsVisibilidadCeldaOrdenRubroEmpleaCuentaContable(Boolean isVisibilidadCeldaOrdenRubroEmpleaCuentaContable) {
		this.isVisibilidadCeldaOrdenRubroEmpleaCuentaContable = isVisibilidadCeldaOrdenRubroEmpleaCuentaContable;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesRubroEmpleaCuentaContable() {
		return isVisibilidadCeldaNuevoRelacionesRubroEmpleaCuentaContable;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesRubroEmpleaCuentaContable(Boolean isVisibilidadCeldaNuevoRelacionesRubroEmpleaCuentaContable) {
		this.isVisibilidadCeldaNuevoRelacionesRubroEmpleaCuentaContable = isVisibilidadCeldaNuevoRelacionesRubroEmpleaCuentaContable;
	}
	
	public Boolean getIsVisibilidadCeldaModificarRubroEmpleaCuentaContable() {
		return isVisibilidadCeldaModificarRubroEmpleaCuentaContable;
	}

	public void setIsVisibilidadCeldaModificarRubroEmpleaCuentaContable(Boolean isVisibilidadCeldaModificarRubroEmpleaCuentaContable) {
		this.isVisibilidadCeldaModificarRubroEmpleaCuentaContable = isVisibilidadCeldaModificarRubroEmpleaCuentaContable;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarRubroEmpleaCuentaContable() {
		return isVisibilidadCeldaActualizarRubroEmpleaCuentaContable;
	}

	public void setIsVisibilidadCeldaActualizarRubroEmpleaCuentaContable(Boolean isVisibilidadCeldaActualizarRubroEmpleaCuentaContable) {
		this.isVisibilidadCeldaActualizarRubroEmpleaCuentaContable = isVisibilidadCeldaActualizarRubroEmpleaCuentaContable;
	}

	public Boolean getIsVisibilidadCeldaEliminarRubroEmpleaCuentaContable() {
		return isVisibilidadCeldaEliminarRubroEmpleaCuentaContable;
	}

	public void setIsVisibilidadCeldaEliminarRubroEmpleaCuentaContable(Boolean isVisibilidadCeldaEliminarRubroEmpleaCuentaContable) {
		this.isVisibilidadCeldaEliminarRubroEmpleaCuentaContable = isVisibilidadCeldaEliminarRubroEmpleaCuentaContable;
	}

	public Boolean getIsVisibilidadCeldaCancelarRubroEmpleaCuentaContable() {
		return isVisibilidadCeldaCancelarRubroEmpleaCuentaContable;
	}

	public void setIsVisibilidadCeldaCancelarRubroEmpleaCuentaContable(Boolean isVisibilidadCeldaCancelarRubroEmpleaCuentaContable) {
		this.isVisibilidadCeldaCancelarRubroEmpleaCuentaContable = isVisibilidadCeldaCancelarRubroEmpleaCuentaContable;
	}

	public Boolean getIsVisibilidadCeldaGuardarRubroEmpleaCuentaContable() {
		return isVisibilidadCeldaGuardarRubroEmpleaCuentaContable;
	}

	public void setIsVisibilidadCeldaGuardarRubroEmpleaCuentaContable(Boolean isVisibilidadCeldaGuardarRubroEmpleaCuentaContable) {
		this.isVisibilidadCeldaGuardarRubroEmpleaCuentaContable = isVisibilidadCeldaGuardarRubroEmpleaCuentaContable;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosRubroEmpleaCuentaContable() {
		return isVisibilidadCeldaGuardarCambiosRubroEmpleaCuentaContable;
	}

	public void setIsVisibilidadCeldaGuardarCambiosRubroEmpleaCuentaContable(Boolean isVisibilidadCeldaGuardarCambiosRubroEmpleaCuentaContable) {
		this.isVisibilidadCeldaGuardarCambiosRubroEmpleaCuentaContable = isVisibilidadCeldaGuardarCambiosRubroEmpleaCuentaContable;
	}
		
	public RubroEmpleaCuentaContableSessionBean getrubroempleacuentacontableSessionBean() {
		return this.rubroempleacuentacontableSessionBean;
	}
	
	public void setrubroempleacuentacontableSessionBean(RubroEmpleaCuentaContableSessionBean rubroempleacuentacontableSessionBean) {
		this.rubroempleacuentacontableSessionBean=rubroempleacuentacontableSessionBean;
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

	public Boolean getisVisibilidadFK_IdEstructura() {
		return this.isVisibilidadFK_IdEstructura;
	}

	public void setisVisibilidadFK_IdEstructura(Boolean isVisibilidadFK_IdEstructura) {
		this.isVisibilidadFK_IdEstructura=isVisibilidadFK_IdEstructura;
	}

	public Boolean getisVisibilidadFK_IdRubroEmplea() {
		return this.isVisibilidadFK_IdRubroEmplea;
	}

	public void setisVisibilidadFK_IdRubroEmplea(Boolean isVisibilidadFK_IdRubroEmplea) {
		this.isVisibilidadFK_IdRubroEmplea=isVisibilidadFK_IdRubroEmplea;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysRubroEmpleaCuentaContable(RubroEmpleaCuentaContable rubroempleacuentacontable)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(rubroempleacuentacontable,null);
				this.setActualParaGuardarSucursalForeignKey(rubroempleacuentacontable,null);
				this.setActualParaGuardarRubroEmpleaForeignKey(rubroempleacuentacontable,null);
				this.setActualParaGuardarCuentaContableForeignKey(rubroempleacuentacontable,null);
				this.setActualParaGuardarEstructuraForeignKey(rubroempleacuentacontable,null);
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
	
	public void bugActualizarReferenciaActual(RubroEmpleaCuentaContable rubroempleacuentacontable,RubroEmpleaCuentaContable rubroempleacuentacontableAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalRubroEmpleaCuentaContable(rubroempleacuentacontable);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		rubroempleacuentacontableAux.setId(rubroempleacuentacontable.getId());
		rubroempleacuentacontableAux.setVersionRow(rubroempleacuentacontable.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessRubroEmpleaCuentaContable();
		
			int intSelectedRow = this.jTableDatosRubroEmpleaCuentaContable.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleacuentacontable =(RubroEmpleaCuentaContable) this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.rubroempleacuentacontable =(RubroEmpleaCuentaContable) this.rubroempleacuentacontables.toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(RubroEmpleaCuentaContableJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualRubroEmpleaCuentaContable(this.rubroempleacuentacontable,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysRubroEmpleaCuentaContable(this.rubroempleacuentacontable);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = rubroempleacuentacontableValidator.getInvalidValues(this.rubroempleacuentacontable);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			rubroempleacuentacontableLogic.setDatosCliente(datosCliente);
			rubroempleacuentacontableLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				rubroempleacuentacontableAux=new  RubroEmpleaCuentaContable();
				
				rubroempleacuentacontableAux.setIsNew(true);
				rubroempleacuentacontableAux.setIsChanged(true);
				
				rubroempleacuentacontableAux.setRubroEmpleaCuentaContableOriginal(this.rubroempleacuentacontable);
				
				rubroempleacuentacontableAux.setId(this.rubroempleacuentacontable.getId());	
				rubroempleacuentacontableAux.setVersionRow(this.rubroempleacuentacontable.getVersionRow());	
				rubroempleacuentacontableAux.setid_empresa(this.rubroempleacuentacontable.getid_empresa());	
				rubroempleacuentacontableAux.setid_sucursal(this.rubroempleacuentacontable.getid_sucursal());	
				rubroempleacuentacontableAux.setid_rubro_emplea(this.rubroempleacuentacontable.getid_rubro_emplea());	
				rubroempleacuentacontableAux.setid_cuenta_contable(this.rubroempleacuentacontable.getid_cuenta_contable());	
				rubroempleacuentacontableAux.setid_estructura(this.rubroempleacuentacontable.getid_estructura());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.rubroempleacuentacontableSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(rubroempleacuentacontableAux,rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(rubroempleacuentacontableAux,rubroempleacuentacontables);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.rubroempleacuentacontableSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						rubroempleacuentacontableLogic.saveRubroEmpleaCuentaContables();//WithConnection
						//rubroempleacuentacontableLogic.getSetVersionRowRubroEmpleaCuentaContables();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.rubroempleacuentacontable,rubroempleacuentacontableAux);
					
					this.refrescarForeignKeysDescripcionesRubroEmpleaCuentaContable();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.rubroempleacuentacontableSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								rubroempleacuentacontableLogic.saveRubroEmpleaCuentaContableRelaciones(rubroempleacuentacontableAux);//WithConnection
								//rubroempleacuentacontableLogic.getSetVersionRowRubroEmpleaCuentaContables();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.rubroempleacuentacontable,rubroempleacuentacontableAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.rubroempleacuentacontableSessionBean.getEstaModoGuardarRelaciones() 
									|| this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(rubroempleacuentacontableAux,rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(rubroempleacuentacontableAux,rubroempleacuentacontables);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.rubroempleacuentacontable,rubroempleacuentacontableAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				rubroempleacuentacontableAux=new  RubroEmpleaCuentaContable();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado() 
					|| (this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado() && this.rubroempleacuentacontable.getId()>=0)) {
						
					rubroempleacuentacontableAux.setIsNew(false);
				}
				
				rubroempleacuentacontableAux.setIsDeleted(false);
			
				rubroempleacuentacontableAux.setId(this.rubroempleacuentacontable.getId());	
				rubroempleacuentacontableAux.setVersionRow(this.rubroempleacuentacontable.getVersionRow());	
				rubroempleacuentacontableAux.setid_empresa(this.rubroempleacuentacontable.getid_empresa());	
				rubroempleacuentacontableAux.setid_sucursal(this.rubroempleacuentacontable.getid_sucursal());	
				rubroempleacuentacontableAux.setid_rubro_emplea(this.rubroempleacuentacontable.getid_rubro_emplea());	
				rubroempleacuentacontableAux.setid_cuenta_contable(this.rubroempleacuentacontable.getid_cuenta_contable());	
				rubroempleacuentacontableAux.setid_estructura(this.rubroempleacuentacontable.getid_estructura());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(rubroempleacuentacontableAux,rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(rubroempleacuentacontableAux,rubroempleacuentacontables);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.rubroempleacuentacontableSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						rubroempleacuentacontableLogic.saveRubroEmpleaCuentaContables();//WithConnection
						//rubroempleacuentacontableLogic.getSetVersionRowRubroEmpleaCuentaContables();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.rubroempleacuentacontable,rubroempleacuentacontableAux);
					
					this.refrescarForeignKeysDescripcionesRubroEmpleaCuentaContable();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.rubroempleacuentacontableSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								rubroempleacuentacontableLogic.saveRubroEmpleaCuentaContableRelaciones(rubroempleacuentacontableAux);//WithConnection
								//rubroempleacuentacontableLogic.getSetVersionRowRubroEmpleaCuentaContables();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.rubroempleacuentacontable,rubroempleacuentacontableAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.rubroempleacuentacontableSessionBean.getEstaModoGuardarRelaciones() 
									|| this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(rubroempleacuentacontableAux,rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(rubroempleacuentacontableAux,rubroempleacuentacontables);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.rubroempleacuentacontable,rubroempleacuentacontableAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				rubroempleacuentacontableAux=new  RubroEmpleaCuentaContable();
				
				rubroempleacuentacontableAux.setIsNew(false);
				rubroempleacuentacontableAux.setIsChanged(false);
				
				rubroempleacuentacontableAux.setIsDeleted(true);
				
				rubroempleacuentacontableAux.setId(this.rubroempleacuentacontable.getId());	
				rubroempleacuentacontableAux.setVersionRow(this.rubroempleacuentacontable.getVersionRow());	
				rubroempleacuentacontableAux.setid_empresa(this.rubroempleacuentacontable.getid_empresa());	
				rubroempleacuentacontableAux.setid_sucursal(this.rubroempleacuentacontable.getid_sucursal());	
				rubroempleacuentacontableAux.setid_rubro_emplea(this.rubroempleacuentacontable.getid_rubro_emplea());	
				rubroempleacuentacontableAux.setid_cuenta_contable(this.rubroempleacuentacontable.getid_cuenta_contable());	
				rubroempleacuentacontableAux.setid_estructura(this.rubroempleacuentacontable.getid_estructura());	
				
				if(this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.rubroempleacuentacontableAux.getId()>=0) {	
						this.rubroempleacuentacontablesEliminados.add(rubroempleacuentacontableAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(rubroempleacuentacontableAux,rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(rubroempleacuentacontableAux,rubroempleacuentacontables);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.rubroempleacuentacontableSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						rubroempleacuentacontableLogic.saveRubroEmpleaCuentaContables();//WithConnection
						//rubroempleacuentacontableLogic.getSetVersionRowRubroEmpleaCuentaContables();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.rubroempleacuentacontableSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								rubroempleacuentacontableLogic.saveRubroEmpleaCuentaContableRelaciones(rubroempleacuentacontableAux);//WithConnection
								//rubroempleacuentacontableLogic.getSetVersionRowRubroEmpleaCuentaContables();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						}
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.rubroempleacuentacontableSessionBean.getEstaModoGuardarRelaciones() 
								|| this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(rubroempleacuentacontableAux,rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(rubroempleacuentacontableAux,rubroempleacuentacontables);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().addAll(this.rubroempleacuentacontablesEliminados);
					
					rubroempleacuentacontableLogic.saveRubroEmpleaCuentaContables();//WithConnection
					//rubroempleacuentacontableLogic.getSetVersionRowRubroEmpleaCuentaContables();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesRubroEmpleaCuentaContable();
				
				this.rubroempleacuentacontablesEliminados= new ArrayList<RubroEmpleaCuentaContable>();		
			}
			
			if(this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Rubro Emplea Cuenta Contable GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Rubro Emplea Cuenta Contable",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.rubroempleacuentacontable=rubroempleacuentacontableAux;
					}
				}
			}
			
			this.isErrorGuardar=false;
			
			this.inicializarInvalidValues();
		/*
		} else {
			this.mostrarInvalidValues();	
		}
		*/
			
		} catch(Exception e) {
			this.isErrorGuardar=true;
			
			this.crearFilaTotales();
			
			throw e;
		} finally {
      		//this.finishProcessRubroEmpleaCuentaContable();
      	}
		
	}	
	
	public void actualizarRelaciones(RubroEmpleaCuentaContable rubroempleacuentacontableLocal) throws Exception {
		
		if(this.rubroempleacuentacontableSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(RubroEmpleaCuentaContable rubroempleacuentacontableLocal) throws Exception {	
		if(this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				rubroempleacuentacontableLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				rubroempleacuentacontableLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(RubroEmpleaDetalleFormJInternalFrame.class)) {
				RubroEmpleaBeanSwingJInternalFrame rubroempleaBeanSwingJInternalFrameLocal=(RubroEmpleaBeanSwingJInternalFrame) ((RubroEmpleaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				rubroempleaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoRubroEmplea(rubroempleaBeanSwingJInternalFrameLocal.getrubroemplea(),true);
				rubroempleaBeanSwingJInternalFrameLocal.actualizarLista(rubroempleaBeanSwingJInternalFrameLocal.rubroemplea,this.rubroempleasForeignKey);

				rubroempleaBeanSwingJInternalFrameLocal.actualizarRelaciones(rubroempleaBeanSwingJInternalFrameLocal.rubroemplea);

				rubroempleacuentacontableLocal.setRubroEmplea(rubroempleaBeanSwingJInternalFrameLocal.rubroemplea);

				this.addItemDefectoCombosForeignKeyRubroEmplea();
				this.cargarCombosFrameRubroEmpleasForeignKey("Formulario");
				this.setActualRubroEmpleaForeignKey(rubroempleaBeanSwingJInternalFrameLocal.rubroemplea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontableBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontableBeanSwingJInternalFrameLocal.actualizarLista(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontablesForeignKey);

				cuentacontableBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				rubroempleacuentacontableLocal.setCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContable();
				this.cargarCombosFrameCuentaContablesForeignKey("Formulario");
				this.setActualCuentaContableForeignKey(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstructuraDetalleFormJInternalFrame.class)) {
				EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrameLocal=(EstructuraBeanSwingJInternalFrame) ((EstructuraDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estructuraBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstructura(estructuraBeanSwingJInternalFrameLocal.getestructura(),true);
				estructuraBeanSwingJInternalFrameLocal.actualizarLista(estructuraBeanSwingJInternalFrameLocal.estructura,this.estructurasForeignKey);

				estructuraBeanSwingJInternalFrameLocal.actualizarRelaciones(estructuraBeanSwingJInternalFrameLocal.estructura);

				rubroempleacuentacontableLocal.setEstructura(estructuraBeanSwingJInternalFrameLocal.estructura);

				this.addItemDefectoCombosForeignKeyEstructura();
				this.cargarCombosFrameEstructurasForeignKey("Formulario");
				this.setActualEstructuraForeignKey(estructuraBeanSwingJInternalFrameLocal.estructura.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarRubroEmpleaCuentaContableActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosRubroEmpleaCuentaContable.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.rubroempleacuentacontable =(RubroEmpleaCuentaContable) this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.rubroempleacuentacontable =(RubroEmpleaCuentaContable) this.rubroempleacuentacontables.toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = rubroempleacuentacontableValidator.getInvalidValues(this.rubroempleacuentacontable);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(RubroEmpleaCuentaContable rubroempleacuentacontable,List<RubroEmpleaCuentaContable> rubroempleacuentacontables) throws Exception {
		try	{		
			RubroEmpleaCuentaContableConstantesFunciones.actualizarLista(rubroempleacuentacontable,rubroempleacuentacontables,this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(RubroEmpleaCuentaContable rubroempleacuentacontable,List<RubroEmpleaCuentaContable> rubroempleacuentacontables) throws Exception {
		try	{			
			RubroEmpleaCuentaContableConstantesFunciones.actualizarSelectedLista(rubroempleacuentacontable,rubroempleacuentacontables);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<RubroEmpleaCuentaContable> rubroempleacuentacontablesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				rubroempleacuentacontablesLocal=this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				rubroempleacuentacontablesLocal=this.rubroempleacuentacontables;
			}
			//ARCHITECTURE
		
			for(RubroEmpleaCuentaContable rubroempleacuentacontableLocal:rubroempleacuentacontablesLocal) {
				if(this.permiteMantenimiento(rubroempleacuentacontableLocal) && rubroempleacuentacontableLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+RubroEmpleaCuentaContableConstantesFunciones.getRubroEmpleaCuentaContableLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(RubroEmpleaCuentaContableConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jLabelid_empresaRubroEmpleaCuentaContable,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RubroEmpleaCuentaContableConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jLabelid_sucursalRubroEmpleaCuentaContable,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RubroEmpleaCuentaContableConstantesFunciones.IDRUBROEMPLEA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jLabelid_rubro_empleaRubroEmpleaCuentaContable,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RubroEmpleaCuentaContableConstantesFunciones.IDCUENTACONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jLabelid_cuenta_contableRubroEmpleaCuentaContable,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RubroEmpleaCuentaContableConstantesFunciones.IDESTRUCTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jLabelid_estructuraRubroEmpleaCuentaContable,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jLabelid_empresaRubroEmpleaCuentaContable,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jLabelid_sucursalRubroEmpleaCuentaContable,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jLabelid_rubro_empleaRubroEmpleaCuentaContable,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jLabelid_cuenta_contableRubroEmpleaCuentaContable,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jLabelid_estructuraRubroEmpleaCuentaContable,"");
		
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
		this.iIdNuevoRubroEmpleaCuentaContable--;	
		
		
		this.rubroempleacuentacontableAux=new RubroEmpleaCuentaContable();
		
		this.rubroempleacuentacontableAux.setId(this.iIdNuevoRubroEmpleaCuentaContable);
		this.rubroempleacuentacontableAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().add(this.rubroempleacuentacontableAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.rubroempleacuentacontables.add(this.rubroempleacuentacontableAux);
		}
		//ARCHITECTURE
		
		this.rubroempleacuentacontable=this.rubroempleacuentacontableAux;
		
		if(RubroEmpleaCuentaContableJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioRubroEmpleaCuentaContable(this.rubroempleacuentacontable);
			this.setVariablesObjetoActualToFormularioForeignKeyRubroEmpleaCuentaContable(this.rubroempleacuentacontable);
		}
				
		//this.setDefaultControlesRubroEmpleaCuentaContable();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyRubroEmpleaCuentaContable();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyRubroEmpleaCuentaContable();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyRubroEmpleaCuentaContable();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualRubroEmpleaCuentaContable(this.rubroempleacuentacontableBean,this.rubroempleacuentacontable,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysRubroEmpleaCuentaContable(this.rubroempleacuentacontable);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.rubroempleacuentacontableSessionBean.getConGuardarRelaciones()) {
			classes=RubroEmpleaCuentaContableConstantesFunciones.getClassesRelationshipsOfRubroEmpleaCuentaContable(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.rubroempleacuentacontableReturnGeneral=rubroempleacuentacontableLogic.procesarEventosRubroEmpleaCuentaContablesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables(),this.rubroempleacuentacontable,this.rubroempleacuentacontableParameterGeneral,this.isEsNuevoRubroEmpleaCuentaContable,classes);//this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContable()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanRubroEmpleaCuentaContable(this.rubroempleacuentacontableReturnGeneral,this.rubroempleacuentacontableBean,false);
		
		if(this.rubroempleacuentacontableReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyRubroEmpleaCuentaContable(this.rubroempleacuentacontableReturnGeneral.getRubroEmpleaCuentaContable());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioRubroEmpleaCuentaContable(this.rubroempleacuentacontableReturnGeneral.getRubroEmpleaCuentaContable());
		}
		
		if(this.rubroempleacuentacontableReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioRubroEmpleaCuentaContable(this.rubroempleacuentacontableReturnGeneral.getRubroEmpleaCuentaContable(),classes);//this.rubroempleacuentacontableBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualRubroEmpleaCuentaContable(this.rubroempleacuentacontable,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyRubroEmpleaCuentaContable();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyRubroEmpleaCuentaContable();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional.RecargarFormRubroEmpleaCuentaContable(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingRubroEmpleaCuentaContable(false);
						
			if(rubroempleacuentacontableSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(RubroEmpleaCuentaContableJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRubroEmpleaCuentaContable();
			}
			
			this.actualizarVisualTableDatosRubroEmpleaCuentaContable();
			
			this.jTableDatosRubroEmpleaCuentaContable.setRowSelectionInterval(this.getIndiceNuevoRubroEmpleaCuentaContable(), this.getIndiceNuevoRubroEmpleaCuentaContable());
			
			this.seleccionarFilaTablaRubroEmpleaCuentaContableActual();
						
			this.actualizarEstadoCeldasBotonesRubroEmpleaCuentaContable("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesRubroEmpleaCuentaContable(Boolean isHabilitar) throws Exception {
			
		//
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_empresaRubroEmpleaCuentaContable.setEnabled(isHabilitar && this.rubroempleacuentacontableConstantesFunciones.activarid_empresaRubroEmpleaCuentaContable);//
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_sucursalRubroEmpleaCuentaContable.setEnabled(isHabilitar && this.rubroempleacuentacontableConstantesFunciones.activarid_sucursalRubroEmpleaCuentaContable);
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_rubro_empleaRubroEmpleaCuentaContable.setEnabled(isHabilitar && this.rubroempleacuentacontableConstantesFunciones.activarid_rubro_empleaRubroEmpleaCuentaContable);
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_cuenta_contableRubroEmpleaCuentaContable.setEnabled(isHabilitar && this.rubroempleacuentacontableConstantesFunciones.activarid_cuenta_contableRubroEmpleaCuentaContable);
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_estructuraRubroEmpleaCuentaContable.setEnabled(isHabilitar && this.rubroempleacuentacontableConstantesFunciones.activarid_estructuraRubroEmpleaCuentaContable);
	};
	
	public void setDefaultControlesRubroEmpleaCuentaContable() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoRubroEmpleaCuentaContable(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.rubroempleacuentacontableSessionBean.setConGuardarRelaciones(true);			
			this.rubroempleacuentacontableSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jTabbedPaneRelacionesRubroEmpleaCuentaContable.setVisible(true);
			
					
		} else {
			//this.rubroempleacuentacontableSessionBean.setConGuardarRelaciones(false);			
			this.rubroempleacuentacontableSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jTabbedPaneRelacionesRubroEmpleaCuentaContable.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoRubroEmpleaCuentaContable() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RubroEmpleaCuentaContable rubroempleacuentacontableAux:this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables()) {
				if(rubroempleacuentacontableAux.getId().equals(this.iIdNuevoRubroEmpleaCuentaContable)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RubroEmpleaCuentaContable rubroempleacuentacontableAux:this.rubroempleacuentacontables) {
				if(rubroempleacuentacontableAux.getId().equals(this.iIdNuevoRubroEmpleaCuentaContable)) {
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
	
	public int getIndiceActualRubroEmpleaCuentaContable(RubroEmpleaCuentaContable rubroempleacuentacontable,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RubroEmpleaCuentaContable rubroempleacuentacontableAux:this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables()) {
				if(rubroempleacuentacontableAux.getId().equals(rubroempleacuentacontable.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RubroEmpleaCuentaContable rubroempleacuentacontableAux:this.rubroempleacuentacontables) {
				if(rubroempleacuentacontableAux.getId().equals(rubroempleacuentacontable.getId())) {
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
	
	public void setCamposBaseDesdeOriginalRubroEmpleaCuentaContable(RubroEmpleaCuentaContable rubroempleacuentacontableOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RubroEmpleaCuentaContable rubroempleacuentacontableAux:this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables()) {
				if(rubroempleacuentacontableAux.getRubroEmpleaCuentaContableOriginal().getId().equals(rubroempleacuentacontableOriginal.getId())) {
					existe=true;
					rubroempleacuentacontableOriginal.setId(rubroempleacuentacontableAux.getId());
					rubroempleacuentacontableOriginal.setVersionRow(rubroempleacuentacontableAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RubroEmpleaCuentaContable rubroempleacuentacontableAux:this.rubroempleacuentacontables) {
				if(rubroempleacuentacontableAux.getRubroEmpleaCuentaContableOriginal().getId().equals(rubroempleacuentacontableOriginal.getId())) {
					existe=true;
					rubroempleacuentacontableOriginal.setId(rubroempleacuentacontableAux.getId());
					rubroempleacuentacontableOriginal.setVersionRow(rubroempleacuentacontableAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosRubroEmpleaCuentaContable(Boolean esParaCancelar) throws Exception {
		rubroempleacuentacontablesAux=new ArrayList<RubroEmpleaCuentaContable>();
		rubroempleacuentacontableAux=new RubroEmpleaCuentaContable();
		
		if(!this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(RubroEmpleaCuentaContable rubroempleacuentacontableAux:this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables()) {
					if(rubroempleacuentacontableAux.getId()<0) {
						rubroempleacuentacontablesAux.add(rubroempleacuentacontableAux);
					}		
				}
				this.iIdNuevoRubroEmpleaCuentaContable=0L;
				this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().removeAll(rubroempleacuentacontablesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RubroEmpleaCuentaContable rubroempleacuentacontableAux:this.rubroempleacuentacontables) {
					if(rubroempleacuentacontableAux.getId()<0) {
						rubroempleacuentacontablesAux.add(rubroempleacuentacontableAux);
					}		
				}
				this.iIdNuevoRubroEmpleaCuentaContable=0L;
				this.rubroempleacuentacontables.removeAll(rubroempleacuentacontablesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoRubroEmpleaCuentaContable 
					&& this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().size()>0
					) {
					rubroempleacuentacontableAux=this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().get(this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().size() - 1);
				
					if(rubroempleacuentacontableAux.getId()<0) {
						this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().remove(rubroempleacuentacontableAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoRubroEmpleaCuentaContable && this.rubroempleacuentacontables.size()>0) {
					rubroempleacuentacontableAux=this.rubroempleacuentacontables.get(this.rubroempleacuentacontables.size() - 1);
				
					if(rubroempleacuentacontableAux.getId()<0) {
						this.rubroempleacuentacontables.remove(rubroempleacuentacontableAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoRubroEmpleaCuentaContable(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(rubroempleacuentacontable.getId()<0) {
				this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().remove(this.rubroempleacuentacontable);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(rubroempleacuentacontable.getId()<0) {
				this.rubroempleacuentacontables.remove(this.rubroempleacuentacontable);
			}
		}			
	}
	
	public void setEstadosInicialesRubroEmpleaCuentaContable(List<RubroEmpleaCuentaContable> rubroempleacuentacontablesAux) throws Exception {
		RubroEmpleaCuentaContableConstantesFunciones.setEstadosInicialesRubroEmpleaCuentaContable(rubroempleacuentacontablesAux);
	}
	
	public void setEstadosInicialesRubroEmpleaCuentaContable(RubroEmpleaCuentaContable rubroempleacuentacontableAux) throws Exception {
		RubroEmpleaCuentaContableConstantesFunciones.setEstadosInicialesRubroEmpleaCuentaContable(rubroempleacuentacontableAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarRubroEmpleaCuentaContableActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesRubroEmpleaCuentaContable("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarRubroEmpleaCuentaContableActual()) {
				if(!this.isEsNuevoRubroEmpleaCuentaContable) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesRubroEmpleaCuentaContable("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoRubroEmpleaCuentaContable=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarRubroEmpleaCuentaContableActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Rubro Emplea Cuenta Contable ?", "MANTENIMIENTO DE Rubro Emplea Cuenta Contable", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesRubroEmpleaCuentaContable("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(RubroEmpleaCuentaContable rubroempleacuentacontable) throws Exception {
		RubroEmpleaCuentaContableConstantesFunciones.seleccionarAsignar(this.rubroempleacuentacontable,rubroempleacuentacontable);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarRubroEmpleaCuentaContable=this.isPermisoActualizarOriginalRubroEmpleaCuentaContable;
			
			
			this.seleccionarAsignar(rubroempleacuentacontable);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			RubroEmpleaCuentaContableConstantesFunciones.quitarEspaciosRubroEmpleaCuentaContable(this.rubroempleacuentacontable,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesRubroEmpleaCuentaContable("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.rubroempleacuentacontableSessionBean.setsFuncionBusquedaRapida(this.rubroempleacuentacontableSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoRubroEmpleaCuentaContable) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosRubroEmpleaCuentaContable(esParaCancelar);				
				this.cancelarNuevoRubroEmpleaCuentaContable(esParaCancelar);								
			}
			
			this.rubroempleacuentacontable=new RubroEmpleaCuentaContable();
			
			this.inicializarRubroEmpleaCuentaContable();
			
			this.actualizarEstadoCeldasBotonesRubroEmpleaCuentaContable("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarRubroEmpleaCuentaContable() throws Exception {
		try {
			RubroEmpleaCuentaContableConstantesFunciones.inicializarRubroEmpleaCuentaContable(this.rubroempleacuentacontable);
			
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
			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteRubroEmpleaCuentaContables(String sAccionBusqueda,List<RubroEmpleaCuentaContable> rubroempleacuentacontablesParaReportes) throws Exception {
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
					sPathReporteFinal="RubroEmpleaCuentaContable"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="RubroEmpleaCuentaContableMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("RubroEmpleaCuentaContableMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="RubroEmpleaCuentaContable"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Rubro Emplea Cuenta Contables");		
		parameters.put("busquedapor", RubroEmpleaCuentaContableConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceRubroEmpleaCuentaContable=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			RubroEmpleaCuentaContableConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			RubroEmpleaCuentaContableConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceRubroEmpleaCuentaContable=new JRBeanArrayDataSource(RubroEmpleaCuentaContableJInternalFrame.TraerRubroEmpleaCuentaContableBeans(rubroempleacuentacontablesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceRubroEmpleaCuentaContable);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+RubroEmpleaCuentaContableConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(RubroEmpleaCuentaContableBean.TraerRubroEmpleaCuentaContableBeans(rubroempleacuentacontablesParaReportes).toArray()));
							
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
				this.generarExcelReporteRubroEmpleaCuentaContables(sAccionBusqueda,sTipoArchivoReporte,rubroempleacuentacontablesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalRubroEmpleaCuentaContables(sAccionBusqueda,sTipoArchivoReporte,rubroempleacuentacontablesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoRubroEmpleaCuentaContableActionPerformed(null);
					//this.generarExcelReporteRubroEmpleaCuentaContables(sAccionBusqueda,sTipoArchivoReporte,rubroempleacuentacontablesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalRubroEmpleaCuentaContables(sAccionBusqueda,sTipoArchivoReporte,rubroempleacuentacontablesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesRubroEmpleaCuentaContables(sAccionBusqueda,sTipoArchivoReporte,rubroempleacuentacontablesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesRubroEmpleaCuentaContables(sAccionBusqueda,sTipoArchivoReporte,rubroempleacuentacontablesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRubroEmpleaCuentaContables(String sAccionBusqueda,String sTipoArchivoReporte,List<RubroEmpleaCuentaContable> rubroempleacuentacontablesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"rubroempleacuentacontable";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("RubroEmpleaCuentaContables");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderRubroEmpleaCuentaContable("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(RubroEmpleaCuentaContable rubroempleacuentacontable : rubroempleacuentacontablesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			RubroEmpleaCuentaContableConstantesFunciones.generarExcelReporteDataRubroEmpleaCuentaContable("NORMAL",row,workbook,rubroempleacuentacontable,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Rubro Emplea Cuenta Contable",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderRubroEmpleaCuentaContable(String sTipo,Row row,Workbook workbook) {
		
		RubroEmpleaCuentaContableConstantesFunciones.generarExcelReporteHeaderRubroEmpleaCuentaContable(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalRubroEmpleaCuentaContables(String sAccionBusqueda,String sTipoArchivoReporte,List<RubroEmpleaCuentaContable> rubroempleacuentacontablesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"rubroempleacuentacontable_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("RubroEmpleaCuentaContables");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(RubroEmpleaCuentaContable rubroempleacuentacontable : rubroempleacuentacontablesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(RubroEmpleaCuentaContableConstantesFunciones.getRubroEmpleaCuentaContableDescripcion(rubroempleacuentacontable));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(rubroempleacuentacontable.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(rubroempleacuentacontable.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDRUBROEMPLEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDRUBROEMPLEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(rubroempleacuentacontable.getrubroemplea_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDCUENTACONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDCUENTACONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(rubroempleacuentacontable.getcuentacontable_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDESTRUCTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDESTRUCTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(rubroempleacuentacontable.getestructura_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Rubro Emplea Cuenta Contable",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesRubroEmpleaCuentaContables(String sAccionBusqueda,String sTipoArchivoReporte,List<RubroEmpleaCuentaContable> rubroempleacuentacontablesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<RubroEmpleaCuentaContable> rubroempleacuentacontablesRespaldo=null;
		
		classes=RubroEmpleaCuentaContableConstantesFunciones.getClassesRelationshipsOfRubroEmpleaCuentaContable(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.rubroempleacuentacontableLogic.setDatosCliente(this.datosCliente);
		this.rubroempleacuentacontableLogic.setDatosDeep(this.datosDeep);
		this.rubroempleacuentacontableLogic.setIsConDeep(true);
		
		rubroempleacuentacontablesRespaldo=this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables();
		
		this.rubroempleacuentacontableLogic.setRubroEmpleaCuentaContables(rubroempleacuentacontablesParaReportes);	
		this.rubroempleacuentacontableLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		rubroempleacuentacontablesParaReportes=this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables();
		this.rubroempleacuentacontableLogic.setRubroEmpleaCuentaContables(rubroempleacuentacontablesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"rubroempleacuentacontable_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("RubroEmpleaCuentaContables");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderRubroEmpleaCuentaContable("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(RubroEmpleaCuentaContable rubroempleacuentacontable : rubroempleacuentacontablesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderRubroEmpleaCuentaContable("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			RubroEmpleaCuentaContableConstantesFunciones.generarExcelReporteDataRubroEmpleaCuentaContable("NORMAL",row,workbook,rubroempleacuentacontable,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(RubroEmpleaCuentaContableConstantesFunciones.getRubroEmpleaCuentaContableDescripcion(rubroempleacuentacontable));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Rubro Emplea Cuenta Contable",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessRubroEmpleaCuentaContable() throws Exception {		
		this.startProcessRubroEmpleaCuentaContable(true);
	}
	
	public void startProcessRubroEmpleaCuentaContable(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasRubroEmpleaCuentaContable ,this.jPanelParametrosReportesRubroEmpleaCuentaContable, this.jScrollPanelDatosRubroEmpleaCuentaContable,this.jPanelPaginacionRubroEmpleaCuentaContable, this.jScrollPanelDatosEdicionRubroEmpleaCuentaContable, this.jPanelAccionesRubroEmpleaCuentaContable,this.jPanelAccionesFormularioRubroEmpleaCuentaContable,this.jmenuBarRubroEmpleaCuentaContable,this.jmenuBarDetalleRubroEmpleaCuentaContable,this.jTtoolBarRubroEmpleaCuentaContable,this.jTtoolBarDetalleRubroEmpleaCuentaContable);		
		
		final JTabbedPane jTabbedPaneBusquedasRubroEmpleaCuentaContable=this.jTabbedPaneBusquedasRubroEmpleaCuentaContable; 
		
		final JPanel jPanelParametrosReportesRubroEmpleaCuentaContable=this.jPanelParametrosReportesRubroEmpleaCuentaContable;
		//final JScrollPane jScrollPanelDatosRubroEmpleaCuentaContable=this.jScrollPanelDatosRubroEmpleaCuentaContable;
		final JTable jTableDatosRubroEmpleaCuentaContable=this.jTableDatosRubroEmpleaCuentaContable;		
		final JPanel jPanelPaginacionRubroEmpleaCuentaContable=this.jPanelPaginacionRubroEmpleaCuentaContable;
		//final JScrollPane jScrollPanelDatosEdicionRubroEmpleaCuentaContable=this.jScrollPanelDatosEdicionRubroEmpleaCuentaContable;
		final JPanel jPanelAccionesRubroEmpleaCuentaContable=this.jPanelAccionesRubroEmpleaCuentaContable;
		
		JPanel jPanelCamposAuxiliarRubroEmpleaCuentaContable=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarRubroEmpleaCuentaContable=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) {
			jPanelCamposAuxiliarRubroEmpleaCuentaContable=this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jPanelCamposRubroEmpleaCuentaContable;
			jPanelAccionesFormularioAuxiliarRubroEmpleaCuentaContable=this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jPanelAccionesFormularioRubroEmpleaCuentaContable;
		}
		
		final JPanel jPanelCamposRubroEmpleaCuentaContable=jPanelCamposAuxiliarRubroEmpleaCuentaContable;
		final JPanel jPanelAccionesFormularioRubroEmpleaCuentaContable=jPanelAccionesFormularioAuxiliarRubroEmpleaCuentaContable;
		
		
		final JMenuBar jmenuBarRubroEmpleaCuentaContable=this.jmenuBarRubroEmpleaCuentaContable;
		final JToolBar jTtoolBarRubroEmpleaCuentaContable=this.jTtoolBarRubroEmpleaCuentaContable;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarRubroEmpleaCuentaContable=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarRubroEmpleaCuentaContable=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) {
			jmenuBarDetalleAuxiliarRubroEmpleaCuentaContable=this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jmenuBarDetalleRubroEmpleaCuentaContable;
			jTtoolBarDetalleAuxiliarRubroEmpleaCuentaContable=this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jTtoolBarDetalleRubroEmpleaCuentaContable;
		}
		
		final JMenuBar jmenuBarDetalleRubroEmpleaCuentaContable=jmenuBarDetalleAuxiliarRubroEmpleaCuentaContable;
		final JToolBar jTtoolBarDetalleRubroEmpleaCuentaContable=jTtoolBarDetalleAuxiliarRubroEmpleaCuentaContable;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasRubroEmpleaCuentaContable;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesRubroEmpleaCuentaContable;
			processRunnable.jTableDatos=jTableDatosRubroEmpleaCuentaContable;
			processRunnable.jPanelCampos=jPanelCamposRubroEmpleaCuentaContable;
			processRunnable.jPanelPaginacion=jPanelPaginacionRubroEmpleaCuentaContable;
			processRunnable.jPanelAcciones=jPanelAccionesRubroEmpleaCuentaContable;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioRubroEmpleaCuentaContable;
			
			
			processRunnable.jmenuBar=jmenuBarRubroEmpleaCuentaContable;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleRubroEmpleaCuentaContable;
			processRunnable.jTtoolBar=jTtoolBarRubroEmpleaCuentaContable;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleRubroEmpleaCuentaContable;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasRubroEmpleaCuentaContable ,jPanelParametrosReportesRubroEmpleaCuentaContable,jTableDatosRubroEmpleaCuentaContable, /*jScrollPanelDatosRubroEmpleaCuentaContable,*/jPanelCamposRubroEmpleaCuentaContable,jPanelPaginacionRubroEmpleaCuentaContable, /*jScrollPanelDatosEdicionRubroEmpleaCuentaContable,*/ jPanelAccionesRubroEmpleaCuentaContable,jPanelAccionesFormularioRubroEmpleaCuentaContable,jmenuBarRubroEmpleaCuentaContable,jmenuBarDetalleRubroEmpleaCuentaContable,jTtoolBarRubroEmpleaCuentaContable,jTtoolBarDetalleRubroEmpleaCuentaContable);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasRubroEmpleaCuentaContable ,jPanelParametrosReportesRubroEmpleaCuentaContable, jScrollPanelDatosRubroEmpleaCuentaContable,jPanelPaginacionRubroEmpleaCuentaContable, jScrollPanelDatosEdicionRubroEmpleaCuentaContable, jPanelAccionesRubroEmpleaCuentaContable,jPanelAccionesFormularioRubroEmpleaCuentaContable,jmenuBarRubroEmpleaCuentaContable,jmenuBarDetalleRubroEmpleaCuentaContable,jTtoolBarRubroEmpleaCuentaContable,jTtoolBarDetalleRubroEmpleaCuentaContable);
						
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
	
	public void finishProcessRubroEmpleaCuentaContable() {// throws Exception 
		this.finishProcessRubroEmpleaCuentaContable(true);
	}
	
	public void finishProcessRubroEmpleaCuentaContable(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasRubroEmpleaCuentaContable ,this.jPanelParametrosReportesRubroEmpleaCuentaContable, this.jScrollPanelDatosRubroEmpleaCuentaContable,this.jPanelPaginacionRubroEmpleaCuentaContable, this.jScrollPanelDatosEdicionRubroEmpleaCuentaContable, this.jPanelAccionesRubroEmpleaCuentaContable,this.jPanelAccionesFormularioRubroEmpleaCuentaContable,this.jmenuBarRubroEmpleaCuentaContable,this.jmenuBarDetalleRubroEmpleaCuentaContable,this.jTtoolBarRubroEmpleaCuentaContable,this.jTtoolBarDetalleRubroEmpleaCuentaContable);		
		
		final JTabbedPane jTabbedPaneBusquedasRubroEmpleaCuentaContable=this.jTabbedPaneBusquedasRubroEmpleaCuentaContable; 
		
		final JPanel jPanelParametrosReportesRubroEmpleaCuentaContable=this.jPanelParametrosReportesRubroEmpleaCuentaContable;
		//final JScrollPane jScrollPanelDatosRubroEmpleaCuentaContable=this.jScrollPanelDatosRubroEmpleaCuentaContable;
		final JTable jTableDatosRubroEmpleaCuentaContable=this.jTableDatosRubroEmpleaCuentaContable;		
		final JPanel jPanelPaginacionRubroEmpleaCuentaContable=this.jPanelPaginacionRubroEmpleaCuentaContable;
		//final JScrollPane jScrollPanelDatosEdicionRubroEmpleaCuentaContable=this.jScrollPanelDatosEdicionRubroEmpleaCuentaContable;
		final JPanel jPanelAccionesRubroEmpleaCuentaContable=this.jPanelAccionesRubroEmpleaCuentaContable;
		
		JPanel jPanelCamposAuxiliarRubroEmpleaCuentaContable=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarRubroEmpleaCuentaContable=new JPanel();
		
		if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) {
			jPanelCamposAuxiliarRubroEmpleaCuentaContable=this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jPanelCamposRubroEmpleaCuentaContable;
			jPanelAccionesFormularioAuxiliarRubroEmpleaCuentaContable=this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jPanelAccionesFormularioRubroEmpleaCuentaContable;
		}
		
		final JPanel jPanelCamposRubroEmpleaCuentaContable=jPanelCamposAuxiliarRubroEmpleaCuentaContable;
		final JPanel jPanelAccionesFormularioRubroEmpleaCuentaContable=jPanelAccionesFormularioAuxiliarRubroEmpleaCuentaContable;
		
		
		final JMenuBar jmenuBarRubroEmpleaCuentaContable=this.jmenuBarRubroEmpleaCuentaContable;		
		final JToolBar jTtoolBarRubroEmpleaCuentaContable=this.jTtoolBarRubroEmpleaCuentaContable;
				
		JMenuBar jmenuBarDetalleAuxiliarRubroEmpleaCuentaContable=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarRubroEmpleaCuentaContable=new JToolBar();
		
		if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) {
			jmenuBarDetalleAuxiliarRubroEmpleaCuentaContable=this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jmenuBarDetalleRubroEmpleaCuentaContable;
			jTtoolBarDetalleAuxiliarRubroEmpleaCuentaContable=this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jTtoolBarDetalleRubroEmpleaCuentaContable;		
		}
		
		final JMenuBar jmenuBarDetalleRubroEmpleaCuentaContable=jmenuBarDetalleAuxiliarRubroEmpleaCuentaContable;
		final JToolBar jTtoolBarDetalleRubroEmpleaCuentaContable=jTtoolBarDetalleAuxiliarRubroEmpleaCuentaContable;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasRubroEmpleaCuentaContable;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesRubroEmpleaCuentaContable;
			processRunnable.jTableDatos=jTableDatosRubroEmpleaCuentaContable;
			processRunnable.jPanelCampos=jPanelCamposRubroEmpleaCuentaContable;
			processRunnable.jPanelPaginacion=jPanelPaginacionRubroEmpleaCuentaContable;
			processRunnable.jPanelAcciones=jPanelAccionesRubroEmpleaCuentaContable;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioRubroEmpleaCuentaContable;
			
			
			processRunnable.jmenuBar=jmenuBarRubroEmpleaCuentaContable;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleRubroEmpleaCuentaContable;
			processRunnable.jTtoolBar=jTtoolBarRubroEmpleaCuentaContable;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleRubroEmpleaCuentaContable;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasRubroEmpleaCuentaContable ,jPanelParametrosReportesRubroEmpleaCuentaContable, jTableDatosRubroEmpleaCuentaContable,/*jScrollPanelDatosRubroEmpleaCuentaContable,*/jPanelCamposRubroEmpleaCuentaContable,jPanelPaginacionRubroEmpleaCuentaContable, /*jScrollPanelDatosEdicionRubroEmpleaCuentaContable,*/ jPanelAccionesRubroEmpleaCuentaContable,jPanelAccionesFormularioRubroEmpleaCuentaContable,jmenuBarRubroEmpleaCuentaContable,jmenuBarDetalleRubroEmpleaCuentaContable,jTtoolBarRubroEmpleaCuentaContable,jTtoolBarDetalleRubroEmpleaCuentaContable));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesRubroEmpleaCuentaContable(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarRubroEmpleaCuentaContable(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuRubroEmpleaCuentaContable(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarRubroEmpleaCuentaContable(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarRubroEmpleaCuentaContable,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleRubroEmpleaCuentaContable,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuRubroEmpleaCuentaContable(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarRubroEmpleaCuentaContable,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleRubroEmpleaCuentaContable,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.rubroempleacuentacontableConstantesFunciones.getsFinalQueryRubroEmpleaCuentaContable();
		String  finalQueryPaginacionTodos=this.rubroempleacuentacontableConstantesFunciones.getsFinalQueryRubroEmpleaCuentaContable();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=RubroEmpleaCuentaContableConstantesFunciones.getArrayColumnasGlobalesNoRubroEmpleaCuentaContable(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=RubroEmpleaCuentaContableConstantesFunciones.getArrayColumnasGlobalesRubroEmpleaCuentaContable(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,RubroEmpleaCuentaContableConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.rubroempleacuentacontablesEliminados= new ArrayList<RubroEmpleaCuentaContable>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessRubroEmpleaCuentaContable();
		
				///*RubroEmpleaCuentaContableSessionBean*/this.rubroempleacuentacontableSessionBean=new RubroEmpleaCuentaContableSessionBean();
			
			if(this.rubroempleacuentacontableSessionBean==null) {
				this.rubroempleacuentacontableSessionBean=new RubroEmpleaCuentaContableSessionBean();
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
					this.iNumeroPaginacion=RubroEmpleaCuentaContableConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=RubroEmpleaCuentaContableConstantesFunciones.getClassesForeignKeysOfRubroEmpleaCuentaContable(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/rubroempleacuentacontable."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			rubroempleacuentacontablesAux= new ArrayList<RubroEmpleaCuentaContable>();
			
				
			rubroempleacuentacontableLogic.setDatosCliente(this.datosCliente);
			rubroempleacuentacontableLogic.setDatosDeep(this.datosDeep);
			rubroempleacuentacontableLogic.setIsConDeep(true);
			
			
			rubroempleacuentacontableLogic.getRubroEmpleaCuentaContableDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					rubroempleacuentacontableLogic.getTodosRubroEmpleaCuentaContables(finalQueryGlobal,pagination);
					
					//rubroempleacuentacontableLogic.getTodosRubroEmpleaCuentaContablesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables()==null|| rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							rubroempleacuentacontablesAux= new ArrayList<RubroEmpleaCuentaContable>();
							rubroempleacuentacontablesAux.addAll(rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rubroempleacuentacontablesAux= new ArrayList<RubroEmpleaCuentaContable>();
							rubroempleacuentacontablesAux.addAll(rubroempleacuentacontables);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							rubroempleacuentacontableLogic.getTodosRubroEmpleaCuentaContables(finalQueryGlobal+"",this.pagination);												
							
							//rubroempleacuentacontableLogic.getTodosRubroEmpleaCuentaContablesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteRubroEmpleaCuentaContables("Todos",rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							rubroempleacuentacontableLogic.setRubroEmpleaCuentaContables(new ArrayList<RubroEmpleaCuentaContable>());					
							rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().addAll(rubroempleacuentacontablesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rubroempleacuentacontables=new ArrayList<RubroEmpleaCuentaContable>();
							rubroempleacuentacontables.addAll(rubroempleacuentacontablesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idRubroEmpleaCuentaContable=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idRubroEmpleaCuentaContable=this.idActual;
				
				} else if(this.idRubroEmpleaCuentaContableActual!=null && this.idRubroEmpleaCuentaContableActual!=0L) {
					idRubroEmpleaCuentaContable=idRubroEmpleaCuentaContableActual;
				}
				
					
				this.sDetalleReporte=RubroEmpleaCuentaContableConstantesFunciones.getDetalleIndicePorId(idRubroEmpleaCuentaContable);
				
				this.rubroempleacuentacontables=new ArrayList<RubroEmpleaCuentaContable>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					rubroempleacuentacontableLogic.getEntity(idRubroEmpleaCuentaContable);
					
					//rubroempleacuentacontableLogic.getEntityWithConnection(idRubroEmpleaCuentaContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					rubroempleacuentacontableLogic.setRubroEmpleaCuentaContables(new ArrayList<RubroEmpleaCuentaContable>());
					rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().add(rubroempleacuentacontableLogic.getRubroEmpleaCuentaContable());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.rubroempleacuentacontables=new ArrayList<RubroEmpleaCuentaContable>();
					this.rubroempleacuentacontables.add(rubroempleacuentacontable);
				}
				
				if(rubroempleacuentacontableLogic.getRubroEmpleaCuentaContable()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCuentaContable")) {
				this.sDetalleReporte=RubroEmpleaCuentaContableConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					rubroempleacuentacontableLogic.getRubroEmpleaCuentaContablesFK_IdCuentaContable(finalQueryGlobal,pagination,id_cuenta_contableFK_IdCuentaContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RubroEmpleaCuentaContableConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RubroEmpleaCuentaContableConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables()==null||rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=rubroempleacuentacontables==null|| rubroempleacuentacontables.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						rubroempleacuentacontablesAux=new ArrayList<RubroEmpleaCuentaContable>();
						rubroempleacuentacontablesAux.addAll(rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rubroempleacuentacontablesAux=new ArrayList<RubroEmpleaCuentaContable>();
							rubroempleacuentacontablesAux.addAll(rubroempleacuentacontables);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							rubroempleacuentacontableLogic.getRubroEmpleaCuentaContablesFK_IdCuentaContable(finalQueryGlobal,pagination,id_cuenta_contableFK_IdCuentaContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RubroEmpleaCuentaContableConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RubroEmpleaCuentaContableConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRubroEmpleaCuentaContables("FK_IdCuentaContable",rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRubroEmpleaCuentaContables("FK_IdCuentaContable",rubroempleacuentacontables);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						rubroempleacuentacontableLogic.setRubroEmpleaCuentaContables(new ArrayList<RubroEmpleaCuentaContable>());
						rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().addAll(rubroempleacuentacontablesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rubroempleacuentacontables=new ArrayList<RubroEmpleaCuentaContable>();
							rubroempleacuentacontables.addAll(rubroempleacuentacontablesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=RubroEmpleaCuentaContableConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					rubroempleacuentacontableLogic.getRubroEmpleaCuentaContablesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RubroEmpleaCuentaContableConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RubroEmpleaCuentaContableConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables()==null||rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=rubroempleacuentacontables==null|| rubroempleacuentacontables.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						rubroempleacuentacontablesAux=new ArrayList<RubroEmpleaCuentaContable>();
						rubroempleacuentacontablesAux.addAll(rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rubroempleacuentacontablesAux=new ArrayList<RubroEmpleaCuentaContable>();
							rubroempleacuentacontablesAux.addAll(rubroempleacuentacontables);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							rubroempleacuentacontableLogic.getRubroEmpleaCuentaContablesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RubroEmpleaCuentaContableConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RubroEmpleaCuentaContableConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRubroEmpleaCuentaContables("FK_IdEmpresa",rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRubroEmpleaCuentaContables("FK_IdEmpresa",rubroempleacuentacontables);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						rubroempleacuentacontableLogic.setRubroEmpleaCuentaContables(new ArrayList<RubroEmpleaCuentaContable>());
						rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().addAll(rubroempleacuentacontablesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rubroempleacuentacontables=new ArrayList<RubroEmpleaCuentaContable>();
							rubroempleacuentacontables.addAll(rubroempleacuentacontablesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEstructura")) {
				this.sDetalleReporte=RubroEmpleaCuentaContableConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					rubroempleacuentacontableLogic.getRubroEmpleaCuentaContablesFK_IdEstructura(finalQueryGlobal,pagination,id_estructuraFK_IdEstructura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RubroEmpleaCuentaContableConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RubroEmpleaCuentaContableConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables()==null||rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=rubroempleacuentacontables==null|| rubroempleacuentacontables.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						rubroempleacuentacontablesAux=new ArrayList<RubroEmpleaCuentaContable>();
						rubroempleacuentacontablesAux.addAll(rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rubroempleacuentacontablesAux=new ArrayList<RubroEmpleaCuentaContable>();
							rubroempleacuentacontablesAux.addAll(rubroempleacuentacontables);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							rubroempleacuentacontableLogic.getRubroEmpleaCuentaContablesFK_IdEstructura(finalQueryGlobal,pagination,id_estructuraFK_IdEstructura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RubroEmpleaCuentaContableConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RubroEmpleaCuentaContableConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRubroEmpleaCuentaContables("FK_IdEstructura",rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRubroEmpleaCuentaContables("FK_IdEstructura",rubroempleacuentacontables);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						rubroempleacuentacontableLogic.setRubroEmpleaCuentaContables(new ArrayList<RubroEmpleaCuentaContable>());
						rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().addAll(rubroempleacuentacontablesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rubroempleacuentacontables=new ArrayList<RubroEmpleaCuentaContable>();
							rubroempleacuentacontables.addAll(rubroempleacuentacontablesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdRubroEmplea")) {
				this.sDetalleReporte=RubroEmpleaCuentaContableConstantesFunciones.getDetalleIndiceFK_IdRubroEmplea(id_rubro_empleaFK_IdRubroEmplea);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					rubroempleacuentacontableLogic.getRubroEmpleaCuentaContablesFK_IdRubroEmplea(finalQueryGlobal,pagination,id_rubro_empleaFK_IdRubroEmplea);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RubroEmpleaCuentaContableConstantesFunciones.getDetalleIndiceFK_IdRubroEmplea(id_rubro_empleaFK_IdRubroEmplea);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RubroEmpleaCuentaContableConstantesFunciones.getDetalleIndiceFK_IdRubroEmplea(id_rubro_empleaFK_IdRubroEmplea);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables()==null||rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=rubroempleacuentacontables==null|| rubroempleacuentacontables.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						rubroempleacuentacontablesAux=new ArrayList<RubroEmpleaCuentaContable>();
						rubroempleacuentacontablesAux.addAll(rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rubroempleacuentacontablesAux=new ArrayList<RubroEmpleaCuentaContable>();
							rubroempleacuentacontablesAux.addAll(rubroempleacuentacontables);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							rubroempleacuentacontableLogic.getRubroEmpleaCuentaContablesFK_IdRubroEmplea(finalQueryGlobal,pagination,id_rubro_empleaFK_IdRubroEmplea);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RubroEmpleaCuentaContableConstantesFunciones.getDetalleIndiceFK_IdRubroEmplea(id_rubro_empleaFK_IdRubroEmplea);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RubroEmpleaCuentaContableConstantesFunciones.getDetalleIndiceFK_IdRubroEmplea(id_rubro_empleaFK_IdRubroEmplea);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRubroEmpleaCuentaContables("FK_IdRubroEmplea",rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRubroEmpleaCuentaContables("FK_IdRubroEmplea",rubroempleacuentacontables);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						rubroempleacuentacontableLogic.setRubroEmpleaCuentaContables(new ArrayList<RubroEmpleaCuentaContable>());
						rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().addAll(rubroempleacuentacontablesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rubroempleacuentacontables=new ArrayList<RubroEmpleaCuentaContable>();
							rubroempleacuentacontables.addAll(rubroempleacuentacontablesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=RubroEmpleaCuentaContableConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					rubroempleacuentacontableLogic.getRubroEmpleaCuentaContablesFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RubroEmpleaCuentaContableConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RubroEmpleaCuentaContableConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables()==null||rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=rubroempleacuentacontables==null|| rubroempleacuentacontables.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						rubroempleacuentacontablesAux=new ArrayList<RubroEmpleaCuentaContable>();
						rubroempleacuentacontablesAux.addAll(rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rubroempleacuentacontablesAux=new ArrayList<RubroEmpleaCuentaContable>();
							rubroempleacuentacontablesAux.addAll(rubroempleacuentacontables);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							rubroempleacuentacontableLogic.getRubroEmpleaCuentaContablesFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RubroEmpleaCuentaContableConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RubroEmpleaCuentaContableConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRubroEmpleaCuentaContables("FK_IdSucursal",rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRubroEmpleaCuentaContables("FK_IdSucursal",rubroempleacuentacontables);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						rubroempleacuentacontableLogic.setRubroEmpleaCuentaContables(new ArrayList<RubroEmpleaCuentaContable>());
						rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().addAll(rubroempleacuentacontablesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rubroempleacuentacontables=new ArrayList<RubroEmpleaCuentaContable>();
							rubroempleacuentacontables.addAll(rubroempleacuentacontablesAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesRubroEmpleaCuentaContable();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessRubroEmpleaCuentaContable();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=rubroempleacuentacontables.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=rubroempleacuentacontables.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(RubroEmpleaCuentaContable rubroempleacuentacontable) {
		Boolean permite=true;
		
		if(this.rubroempleacuentacontable.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=RubroEmpleaCuentaContableConstantesFunciones.getOrderByListaRubroEmpleaCuentaContable();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=RubroEmpleaCuentaContableConstantesFunciones.getOrderByListaRubroEmpleaCuentaContable();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RubroEmpleaCuentaContable rubroempleacuentacontable:rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables()) {
				if(rubroempleacuentacontable.getsType().equals(Constantes2.S_TOTALES)) {
					rubroempleacuentacontableTotales=rubroempleacuentacontable;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RubroEmpleaCuentaContable rubroempleacuentacontable:this.rubroempleacuentacontables) {
				if(rubroempleacuentacontable.getsType().equals(Constantes2.S_TOTALES)) {
					rubroempleacuentacontableTotales=rubroempleacuentacontable;
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
			this.rubroempleacuentacontableAux=new RubroEmpleaCuentaContable();
			this.rubroempleacuentacontableAux.setsType(Constantes2.S_TOTALES);
			this.rubroempleacuentacontableAux.setIsNew(false);
			this.rubroempleacuentacontableAux.setIsChanged(false);
			this.rubroempleacuentacontableAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				RubroEmpleaCuentaContableConstantesFunciones.TotalizarValoresFilaRubroEmpleaCuentaContable(this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables(),this.rubroempleacuentacontableAux);
				
				this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().add(this.rubroempleacuentacontableAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				RubroEmpleaCuentaContableConstantesFunciones.TotalizarValoresFilaRubroEmpleaCuentaContable(this.rubroempleacuentacontables,this.rubroempleacuentacontableAux);
				
				this.rubroempleacuentacontables.add(this.rubroempleacuentacontableAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		rubroempleacuentacontableTotales=new RubroEmpleaCuentaContable();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().remove(rubroempleacuentacontableTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.rubroempleacuentacontables.remove(rubroempleacuentacontableTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		rubroempleacuentacontableTotales=new RubroEmpleaCuentaContable();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RubroEmpleaCuentaContable rubroempleacuentacontable:rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables()) {
				if(rubroempleacuentacontable.getsType().equals(Constantes2.S_TOTALES)) {
					rubroempleacuentacontableTotales=rubroempleacuentacontable;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				RubroEmpleaCuentaContableConstantesFunciones.TotalizarValoresFilaRubroEmpleaCuentaContable(this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables(),rubroempleacuentacontableTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RubroEmpleaCuentaContable rubroempleacuentacontable:this.rubroempleacuentacontables) {
				if(rubroempleacuentacontable.getsType().equals(Constantes2.S_TOTALES)) {
					rubroempleacuentacontableTotales=rubroempleacuentacontable;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				RubroEmpleaCuentaContableConstantesFunciones.TotalizarValoresFilaRubroEmpleaCuentaContable(this.rubroempleacuentacontables,rubroempleacuentacontableTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getRubroEmpleaCuentaContablesFK_IdCuentaContable()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaContable";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRubroEmpleaCuentaContablesFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRubroEmpleaCuentaContablesFK_IdEstructura()throws Exception {
		try {
			sAccionBusqueda="FK_IdEstructura";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRubroEmpleaCuentaContablesFK_IdRubroEmplea()throws Exception {
		try {
			sAccionBusqueda="FK_IdRubroEmplea";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRubroEmpleaCuentaContablesFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getRubroEmpleaCuentaContablesFK_IdCuentaContable(String sFinalQuery,Long id_cuenta_contable)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					rubroempleacuentacontableLogic.getRubroEmpleaCuentaContablesFK_IdCuentaContable(sFinalQuery,this.pagination,id_cuenta_contable);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRubroEmpleaCuentaContablesFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					rubroempleacuentacontableLogic.getRubroEmpleaCuentaContablesFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRubroEmpleaCuentaContablesFK_IdEstructura(String sFinalQuery,Long id_estructura)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					rubroempleacuentacontableLogic.getRubroEmpleaCuentaContablesFK_IdEstructura(sFinalQuery,this.pagination,id_estructura);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRubroEmpleaCuentaContablesFK_IdRubroEmplea(String sFinalQuery,Long id_rubro_emplea)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					rubroempleacuentacontableLogic.getRubroEmpleaCuentaContablesFK_IdRubroEmplea(sFinalQuery,this.pagination,id_rubro_emplea);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRubroEmpleaCuentaContablesFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					rubroempleacuentacontableLogic.getRubroEmpleaCuentaContablesFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
								
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosRubroEmpleaCuentaContable() {
		this.isPermisoTodoRubroEmpleaCuentaContable=false;
		this.isPermisoNuevoRubroEmpleaCuentaContable=false;
		this.isPermisoActualizarRubroEmpleaCuentaContable=false;
		this.isPermisoActualizarOriginalRubroEmpleaCuentaContable=false;
		this.isPermisoEliminarRubroEmpleaCuentaContable=false;
		this.isPermisoGuardarCambiosRubroEmpleaCuentaContable=false;
		this.isPermisoConsultaRubroEmpleaCuentaContable=false;
		this.isPermisoBusquedaRubroEmpleaCuentaContable=false;
		this.isPermisoReporteRubroEmpleaCuentaContable=false;		
		this.isPermisoOrdenRubroEmpleaCuentaContable=false;		
		this.isPermisoPaginacionMedioRubroEmpleaCuentaContable=false;		
		this.isPermisoPaginacionAltoRubroEmpleaCuentaContable=false;
		this.isPermisoPaginacionTodoRubroEmpleaCuentaContable=false;
		this.isPermisoCopiarRubroEmpleaCuentaContable=false;		
		this.isPermisoVerFormRubroEmpleaCuentaContable=false;		
		this.isPermisoDuplicarRubroEmpleaCuentaContable=false;		
		this.isPermisoOrdenRubroEmpleaCuentaContable=false;		
	}
	
	public void setPermisosUsuarioRubroEmpleaCuentaContable(Boolean isPermiso) {
		this.isPermisoTodoRubroEmpleaCuentaContable=isPermiso;
		this.isPermisoNuevoRubroEmpleaCuentaContable=isPermiso;
		this.isPermisoActualizarRubroEmpleaCuentaContable=isPermiso;
		this.isPermisoActualizarOriginalRubroEmpleaCuentaContable=isPermiso;
		this.isPermisoEliminarRubroEmpleaCuentaContable=isPermiso;
		this.isPermisoGuardarCambiosRubroEmpleaCuentaContable=isPermiso;
		this.isPermisoConsultaRubroEmpleaCuentaContable=isPermiso;
		this.isPermisoBusquedaRubroEmpleaCuentaContable=isPermiso;
		this.isPermisoReporteRubroEmpleaCuentaContable=isPermiso;
		this.isPermisoOrdenRubroEmpleaCuentaContable=isPermiso;		
		this.isPermisoPaginacionMedioRubroEmpleaCuentaContable=isPermiso;		
		this.isPermisoPaginacionAltoRubroEmpleaCuentaContable=isPermiso;		
		this.isPermisoPaginacionTodoRubroEmpleaCuentaContable=isPermiso;		
		this.isPermisoCopiarRubroEmpleaCuentaContable=isPermiso;		
		this.isPermisoVerFormRubroEmpleaCuentaContable=isPermiso;		
		this.isPermisoDuplicarRubroEmpleaCuentaContable=isPermiso;
		this.isPermisoOrdenRubroEmpleaCuentaContable=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioRubroEmpleaCuentaContable(Boolean isPermiso) {
		//this.isPermisoTodoRubroEmpleaCuentaContable=isPermiso;
		this.isPermisoNuevoRubroEmpleaCuentaContable=isPermiso;
		this.isPermisoActualizarRubroEmpleaCuentaContable=isPermiso;
		this.isPermisoActualizarOriginalRubroEmpleaCuentaContable=isPermiso;
		this.isPermisoEliminarRubroEmpleaCuentaContable=isPermiso;
		this.isPermisoGuardarCambiosRubroEmpleaCuentaContable=isPermiso;
		//this.isPermisoConsultaRubroEmpleaCuentaContable=isPermiso;
		//this.isPermisoBusquedaRubroEmpleaCuentaContable=isPermiso;
		//this.isPermisoReporteRubroEmpleaCuentaContable=isPermiso;
		//this.isPermisoOrdenRubroEmpleaCuentaContable=isPermiso;		
		//this.isPermisoPaginacionMedioRubroEmpleaCuentaContable=isPermiso;		
		//this.isPermisoPaginacionAltoRubroEmpleaCuentaContable=isPermiso;		
		//this.isPermisoPaginacionTodoRubroEmpleaCuentaContable=isPermiso;		
		//this.isPermisoCopiarRubroEmpleaCuentaContable=isPermiso;		
		//this.isPermisoDuplicarRubroEmpleaCuentaContable=isPermiso;
		//this.isPermisoOrdenRubroEmpleaCuentaContable=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioRubroEmpleaCuentaContableClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(RubroEmpleaCuentaContableJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebRubroEmpleaCuentaContable(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioRubroEmpleaCuentaContableClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioRubroEmpleaCuentaContableClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionRubroEmpleaCuentaContableClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioRubroEmpleaCuentaContableClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioRubroEmpleaCuentaContable() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(RubroEmpleaCuentaContableJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, RubroEmpleaCuentaContableConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoRubroEmpleaCuentaContable=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarRubroEmpleaCuentaContable=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalRubroEmpleaCuentaContable=this.isPermisoActualizarRubroEmpleaCuentaContable;
			this.isPermisoEliminarRubroEmpleaCuentaContable=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosRubroEmpleaCuentaContable=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaRubroEmpleaCuentaContable=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaRubroEmpleaCuentaContable=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoRubroEmpleaCuentaContable=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteRubroEmpleaCuentaContable=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenRubroEmpleaCuentaContable=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioRubroEmpleaCuentaContable=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoRubroEmpleaCuentaContable=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoRubroEmpleaCuentaContable=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarRubroEmpleaCuentaContable=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormRubroEmpleaCuentaContable=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarRubroEmpleaCuentaContable=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenRubroEmpleaCuentaContable=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosRubroEmpleaCuentaContable.setToolTipText(this.jTableDatosRubroEmpleaCuentaContable.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioRubroEmpleaCuentaContable(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioRubroEmpleaCuentaContable(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(RubroEmpleaCuentaContableJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(RubroEmpleaCuentaContableJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioRubroEmpleaCuentaContable() throws Exception {
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
	public void inicializarCombosForeignKeyRubroEmpleaCuentaContableListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.rubroempleasForeignKey=new ArrayList();
				this.cuentacontablesForeignKey=new ArrayList();
				this.estructurasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyRubroEmpleaCuentaContableListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(RubroEmpleaCuentaContableJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyRubroEmpleaCuentaContableListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyRubroEmpleaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCuentaContableListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEstructuraListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyRubroEmpleaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.rubroempleasForeignKey==null||this.rubroempleasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=RubroEmpleaConstantesFunciones.getArrayColumnasGlobalesRubroEmplea(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,RubroEmpleaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=RubroEmpleaConstantesFunciones.SFINALQUERY;

				this.cargarCombosRubroEmpleasForeignKeyLista(finalQueryGlobal);
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
	
	public void cargarCombosLoteForeignKeyRubroEmpleaCuentaContableListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			RubroEmpleaCuentaContableParameterReturnGeneral rubroempleacuentacontableReturnGeneral=new RubroEmpleaCuentaContableParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.rubroempleacuentacontableConstantesFunciones.cargarid_empresaRubroEmpleaCuentaContable)
					 || (this.esRecargarFks && this.rubroempleacuentacontableConstantesFunciones.cargarid_empresaRubroEmpleaCuentaContable)) {

					if(!this.rubroempleacuentacontableSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+rubroempleacuentacontableSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.rubroempleacuentacontableConstantesFunciones.cargarid_sucursalRubroEmpleaCuentaContable)
					 || (this.esRecargarFks && this.rubroempleacuentacontableConstantesFunciones.cargarid_sucursalRubroEmpleaCuentaContable)) {

					if(!this.rubroempleacuentacontableSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+rubroempleacuentacontableSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalRubroEmplea="";

				if(((this.rubroempleasForeignKey==null||this.rubroempleasForeignKey.size()<=0) && this.rubroempleacuentacontableConstantesFunciones.cargarid_rubro_empleaRubroEmpleaCuentaContable)
					 || (this.esRecargarFks && this.rubroempleacuentacontableConstantesFunciones.cargarid_rubro_empleaRubroEmpleaCuentaContable)) {

					if(!this.rubroempleacuentacontableSessionBean.getisBusquedaDesdeForeignKeySesionRubroEmplea()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=RubroEmpleaConstantesFunciones.getArrayColumnasGlobalesRubroEmplea(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalRubroEmplea=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,RubroEmpleaConstantesFunciones.TABLENAME);

						finalQueryGlobalRubroEmplea=Funciones.GetFinalQueryAppend(finalQueryGlobalRubroEmplea, "");
						finalQueryGlobalRubroEmplea+=RubroEmpleaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosRubroEmpleasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalRubroEmplea=" WHERE " + ConstantesSql.ID + "="+rubroempleacuentacontableSessionBean.getlidRubroEmpleaActual();
					}
				} else {
					finalQueryGlobalRubroEmplea="NONE";
				}


				String finalQueryGlobalCuentaContable="";

				if(((this.cuentacontablesForeignKey==null||this.cuentacontablesForeignKey.size()<=0) && this.rubroempleacuentacontableConstantesFunciones.cargarid_cuenta_contableRubroEmpleaCuentaContable)
					 || (this.esRecargarFks && this.rubroempleacuentacontableConstantesFunciones.cargarid_cuenta_contableRubroEmpleaCuentaContable)) {

					if(!this.rubroempleacuentacontableSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();

						this.arrDatoGeneralNo.add("id_modulo");

						arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCuentaContable=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

						finalQueryGlobalCuentaContable=Funciones.GetFinalQueryAppend(finalQueryGlobalCuentaContable, "");
						finalQueryGlobalCuentaContable+=CuentaContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCuentaContablesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCuentaContable=" WHERE " + ConstantesSql.ID + "="+rubroempleacuentacontableSessionBean.getlidCuentaContableActual();
					}
				} else {
					finalQueryGlobalCuentaContable="NONE";
				}


				String finalQueryGlobalEstructura="";

				if(((this.estructurasForeignKey==null||this.estructurasForeignKey.size()<=0) && this.rubroempleacuentacontableConstantesFunciones.cargarid_estructuraRubroEmpleaCuentaContable)
					 || (this.esRecargarFks && this.rubroempleacuentacontableConstantesFunciones.cargarid_estructuraRubroEmpleaCuentaContable)) {

					if(!this.rubroempleacuentacontableSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EstructuraConstantesFunciones.getArrayColumnasGlobalesEstructura(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEstructura=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstructuraConstantesFunciones.TABLENAME);

						finalQueryGlobalEstructura=Funciones.GetFinalQueryAppend(finalQueryGlobalEstructura, "");
						finalQueryGlobalEstructura+=EstructuraConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEstructurasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEstructura=" WHERE " + ConstantesSql.ID + "="+rubroempleacuentacontableSessionBean.getlidEstructuraActual();
					}
				} else {
					finalQueryGlobalEstructura="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				rubroempleacuentacontableReturnGeneral=rubroempleacuentacontableLogic.cargarCombosLoteForeignKeyRubroEmpleaCuentaContable(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalRubroEmplea,finalQueryGlobalCuentaContable,finalQueryGlobalEstructura);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=rubroempleacuentacontableReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=rubroempleacuentacontableReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalRubroEmplea.equals("NONE")) {
				this.rubroempleasForeignKey=rubroempleacuentacontableReturnGeneral.getrubroempleasForeignKey();
			}

			if(!finalQueryGlobalCuentaContable.equals("NONE")) {
				this.cuentacontablesForeignKey=rubroempleacuentacontableReturnGeneral.getcuentacontablesForeignKey();
			}

			if(!finalQueryGlobalEstructura.equals("NONE")) {
				this.estructurasForeignKey=rubroempleacuentacontableReturnGeneral.getestructurasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyRubroEmpleaCuentaContable()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyRubroEmplea();
			this.addItemDefectoCombosForeignKeyCuentaContable();
			this.addItemDefectoCombosForeignKeyEstructura();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.rubroempleacuentacontableSessionBean==null) {
				this.rubroempleacuentacontableSessionBean=new RubroEmpleaCuentaContableSessionBean();
			}

			if(!this.rubroempleacuentacontableSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.rubroempleacuentacontableSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyRubroEmplea()throws Exception {
		try {

			if(!this.rubroempleacuentacontableSessionBean.getisBusquedaDesdeForeignKeySesionRubroEmplea()) {
				RubroEmplea rubroemplea=new RubroEmplea();
				RubroEmpleaConstantesFunciones.setRubroEmpleaDescripcion(rubroemplea,Constantes.SMENSAJE_ESCOJA_OPCION);
				rubroemplea.setId(null);

				if(!RubroEmpleaConstantesFunciones.ExisteEnLista(this.rubroempleasForeignKey,rubroemplea,true)) {

					this.rubroempleasForeignKey.add(0,rubroemplea);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCuentaContable()throws Exception {
		try {

			if(!this.rubroempleacuentacontableSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
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

	public void addItemDefectoCombosForeignKeyEstructura()throws Exception {
		try {

			if(!this.rubroempleacuentacontableSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
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
	
	public void initActionsCombosTodosForeignKeyRubroEmpleaCuentaContable()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyRubroEmpleaCuentaContable(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyRubroEmpleaCuentaContable()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyRubroEmpleaCuentaContable();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyRubroEmpleaCuentaContable(RubroEmpleaCuentaContable rubroempleacuentacontable)throws Exception {	
		try {
			
			this.setActualRubroEmpleaForeignKey(rubroempleacuentacontable.getid_rubro_emplea(),false,"Formulario");
			this.setActualCuentaContableForeignKey(rubroempleacuentacontable.getid_cuenta_contable(),false,"Formulario");
			this.setActualEstructuraForeignKey(rubroempleacuentacontable.getid_estructura(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyRubroEmpleaCuentaContable(RubroEmpleaCuentaContable rubroempleacuentacontable,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyRubroEmpleaCuentaContable()throws Exception {	
		try {
			
			this.setActualRubroEmpleaForeignKey(this.rubroempleacuentacontableConstantesFunciones.getid_rubro_emplea(),false,"Formulario");
			this.setActualCuentaContableForeignKey(this.rubroempleacuentacontableConstantesFunciones.getid_cuenta_contable(),false,"Formulario");
			this.setActualEstructuraForeignKey(this.rubroempleacuentacontableConstantesFunciones.getid_estructura(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyRubroEmpleaCuentaContable()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyRubroEmpleaCuentaContable()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyRubroEmpleaCuentaContable()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroRubroEmpleaCuentaContable()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyRubroEmpleaCuentaContable()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameRubroEmpleasForeignKey("Todos");
			this.cargarCombosFrameCuentaContablesForeignKey("Todos");
			this.cargarCombosFrameEstructurasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyRubroEmpleaCuentaContable(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameRubroEmpleasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCuentaContablesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstructurasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyRubroEmpleaCuentaContable()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_empresaRubroEmpleaCuentaContable!=null && this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_empresaRubroEmpleaCuentaContable.getItemCount()>0) {
				this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_empresaRubroEmpleaCuentaContable.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_sucursalRubroEmpleaCuentaContable!=null && this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_sucursalRubroEmpleaCuentaContable.getItemCount()>0) {
				this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_sucursalRubroEmpleaCuentaContable.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_rubro_empleaRubroEmpleaCuentaContable!=null && this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_rubro_empleaRubroEmpleaCuentaContable.getItemCount()>0) {
				this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_rubro_empleaRubroEmpleaCuentaContable.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_cuenta_contableRubroEmpleaCuentaContable!=null && this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_cuenta_contableRubroEmpleaCuentaContable.getItemCount()>0) {
				this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_cuenta_contableRubroEmpleaCuentaContable.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_estructuraRubroEmpleaCuentaContable!=null && this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_estructuraRubroEmpleaCuentaContable.getItemCount()>0) {
				this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_estructuraRubroEmpleaCuentaContable.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	










	
	

	public RubroEmpleaCuentaContableBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public RubroEmpleaCuentaContableBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public RubroEmpleaCuentaContableBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.rubroempleacuentacontableSessionBean=new RubroEmpleaCuentaContableSessionBean(); 
		this.rubroempleacuentacontableConstantesFunciones=new RubroEmpleaCuentaContableConstantesFunciones(); 
		this.rubroempleacuentacontableBean=new RubroEmpleaCuentaContable();//(this.rubroempleacuentacontableConstantesFunciones); 		
		this.rubroempleacuentacontableReturnGeneral=new RubroEmpleaCuentaContableParameterReturnGeneral(); 
		
		this.rubroempleacuentacontableSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.rubroempleacuentacontableSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public RubroEmpleaCuentaContableBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public RubroEmpleaCuentaContableBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public RubroEmpleaCuentaContableBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessRubroEmpleaCuentaContable(true);
			
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
			
			this.rubroempleacuentacontableConstantesFunciones=new RubroEmpleaCuentaContableConstantesFunciones(); 
			this.rubroempleacuentacontableBean=new RubroEmpleaCuentaContable();//this.rubroempleacuentacontableConstantesFunciones); 			
			this.rubroempleacuentacontableReturnGeneral=new RubroEmpleaCuentaContableParameterReturnGeneral(); 
		
			RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Rubro Emplea Cuenta Contable Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.rubroempleacuentacontable=new RubroEmpleaCuentaContable();
			this.rubroempleacuentacontables = new ArrayList<RubroEmpleaCuentaContable>();
			this.rubroempleacuentacontablesAux = new ArrayList<RubroEmpleaCuentaContable>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic=new RubroEmpleaCuentaContableLogic();
				this.rubroempleacuentacontableLogic.getNewConnexionToDeep("");
			}
			
			//this.rubroempleacuentacontableSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.rubroempleacuentacontableSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormRubroEmpleaCuentaContable);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable);	
					}
					
					if(this.jInternalFrameImportacionRubroEmpleaCuentaContable!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionRubroEmpleaCuentaContable);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByRubroEmpleaCuentaContable!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByRubroEmpleaCuentaContable);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable);
				this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.setVisible(false);
				this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable);
					this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable.setVisible(false);
					this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionRubroEmpleaCuentaContable!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionRubroEmpleaCuentaContable);
					this.jInternalFrameImportacionRubroEmpleaCuentaContable.setVisible(false);
					this.jInternalFrameImportacionRubroEmpleaCuentaContable.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByRubroEmpleaCuentaContable!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByRubroEmpleaCuentaContable);
					this.jInternalFrameOrderByRubroEmpleaCuentaContable.setVisible(false);
					this.jInternalFrameOrderByRubroEmpleaCuentaContable.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idRubroEmpleaCuentaContableActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=RubroEmpleaCuentaContableConstantesFunciones.INUMEROPAGINACION;
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
			
			this.rubroempleacuentacontableReturnGeneral=new RubroEmpleaCuentaContableParameterReturnGeneral();
			
			this.rubroempleacuentacontableParameterGeneral=new RubroEmpleaCuentaContableParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.rubroempleacuentacontableLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado()) {
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
			
			if(RubroEmpleaCuentaContableJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,RubroEmpleaCuentaContableConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado(),this.rubroempleacuentacontableSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,RubroEmpleaCuentaContableConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado(),this.rubroempleacuentacontableSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoRubroEmpleaCuentaContable=false;
			this.isVisibilidadCeldaDuplicarRubroEmpleaCuentaContable=true;
			this.isVisibilidadCeldaCopiarRubroEmpleaCuentaContable=true;
			this.isVisibilidadCeldaVerFormRubroEmpleaCuentaContable=true;
			this.isVisibilidadCeldaOrdenRubroEmpleaCuentaContable=true;
			this.isVisibilidadCeldaNuevoRelacionesRubroEmpleaCuentaContable=false;
			this.isVisibilidadCeldaModificarRubroEmpleaCuentaContable=false;
			this.isVisibilidadCeldaActualizarRubroEmpleaCuentaContable=false;
			this.isVisibilidadCeldaEliminarRubroEmpleaCuentaContable=false;
			this.isVisibilidadCeldaCancelarRubroEmpleaCuentaContable=false;
			this.isVisibilidadCeldaGuardarRubroEmpleaCuentaContable=false;
			this.isVisibilidadCeldaGuardarCambiosRubroEmpleaCuentaContable=false;
			
			
			this.isVisibilidadFK_IdCuentaContable=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdEstructura=true;
			this.isVisibilidadFK_IdRubroEmplea=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesRubroEmpleaCuentaContable("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosRubroEmpleaCuentaContable();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioRubroEmpleaCuentaContable(false);
			
			this.setPermisosUsuarioRubroEmpleaCuentaContable();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado() 
				|| (this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado() && this.rubroempleacuentacontableSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioRubroEmpleaCuentaContableClasesRelacionadas();
			}
			
			if(this.rubroempleacuentacontableSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioRubroEmpleaCuentaContableClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!RubroEmpleaCuentaContableJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosRubroEmpleaCuentaContable();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualRubroEmpleaCuentaContable();
			}
			
			if(!this.isPermisoBusquedaRubroEmpleaCuentaContable) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioRubroEmpleaCuentaContable,this.isPermisoPaginacionMedioRubroEmpleaCuentaContable,this.isPermisoPaginacionTodoRubroEmpleaCuentaContable);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(RubroEmpleaCuentaContableConstantesFunciones.getTiposSeleccionarRubroEmpleaCuentaContable());
				
				this.tiposColumnasSelect=RubroEmpleaCuentaContableConstantesFunciones.getTiposSeleccionarRubroEmpleaCuentaContable(true);
				
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
			//if(!this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioRubroEmpleaCuentaContable();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioRubroEmpleaCuentaContable(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioRubroEmpleaCuentaContable(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesRubroEmpleaCuentaContable() ;
			
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
			this.rubroempleaLogic=new RubroEmpleaLogic();
			this.cuentacontableLogic=new CuentaContableLogic();
			this.estructuraLogic=new EstructuraLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				rubroempleacuentacontableImplementable= (RubroEmpleaCuentaContableImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+RubroEmpleaCuentaContableConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				rubroempleacuentacontableImplementableHome= (RubroEmpleaCuentaContableImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+RubroEmpleaCuentaContableConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.rubroempleacuentacontables= new ArrayList<RubroEmpleaCuentaContable>();
			this.rubroempleacuentacontablesEliminados= new ArrayList<RubroEmpleaCuentaContable>();
						
			this.isEsNuevoRubroEmpleaCuentaContable=false;
			this.esParaAccionDesdeFormularioRubroEmpleaCuentaContable=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.rubroempleasForeignKey=new ArrayList<RubroEmplea>() ;
			this.cuentacontablesForeignKey=new ArrayList<CuentaContable>() ;
			this.estructurasForeignKey=new ArrayList<Estructura>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyRubroEmpleaCuentaContable(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroRubroEmpleaCuentaContable();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=RubroEmpleaCuentaContableConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesRubroEmpleaCuentaContable("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingRubroEmpleaCuentaContable(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioRubroEmpleaCuentaContable();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioRubroEmpleaCuentaContable();
			}
			
			RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.getTabCount(); i++) {
					this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessRubroEmpleaCuentaContable(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga RubroEmpleaCuentaContable: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectRubroEmpleaCuentaContable() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesRubroEmpleaCuentaContable")) {
				iIndex=this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jTabbedPaneRelacionesRubroEmpleaCuentaContable.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jTabbedPaneRelacionesRubroEmpleaCuentaContable.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosRubroEmpleaCuentaContable.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessRubroEmpleaCuentaContable();	
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
	
	public void cargarCombosForeignKeyRubroEmpleaCuentaContable(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyRubroEmpleaCuentaContable(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyRubroEmpleaCuentaContable(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyRubroEmpleaCuentaContableListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyRubroEmpleaCuentaContable();
		
		this.cargarCombosFrameForeignKeyRubroEmpleaCuentaContable();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyRubroEmpleaCuentaContable();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyRubroEmpleaCuentaContable();
		}
	}
	
	

	public void cargarCombosForeignKeyRubroEmplea(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyRubroEmpleaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyRubroEmplea();
				this.cargarCombosFrameRubroEmpleasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaRubroEmplea(this.rubroempleasForeignKey);

		} catch(Exception e) {
			throw e;
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
	
	public void jButtonNuevoRubroEmpleaCuentaContableActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.rubroempleacuentacontableSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.rubroempleacuentacontable,new Object(),this.rubroempleacuentacontableParameterGeneral,this.rubroempleacuentacontableReturnGeneral);
			
			
			if(jTableDatosRubroEmpleaCuentaContable.getRowCount()>=1) {
				jTableDatosRubroEmpleaCuentaContable.removeRowSelectionInterval(0, jTableDatosRubroEmpleaCuentaContable.getRowCount()-1);						
			}
			
			this.isEsNuevoRubroEmpleaCuentaContable=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoRubroEmpleaCuentaContable(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesRubroEmpleaCuentaContable(true);			
			//this.rubroempleacuentacontable=new RubroEmpleaCuentaContable();
			//this.rubroempleacuentacontable.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRubroEmpleaCuentaContable(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRubroEmpleaCuentaContable() ;
			
			if(RubroEmpleaCuentaContableJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRubroEmpleaCuentaContable(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.rubroempleacuentacontable);	
			this.actualizarInformacion("INFO_PADRE",false,this.rubroempleacuentacontable);				
			
			RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.rubroempleacuentacontable,new Object(),this.rubroempleacuentacontableParameterGeneral,this.rubroempleacuentacontableReturnGeneral);
			
			if(this.rubroempleacuentacontableSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar RubroEmpleaCuentaContable: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.rubroempleacuentacontable,new Object(),this.rubroempleacuentacontableParameterGeneral,this.rubroempleacuentacontableReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarRubroEmpleaCuentaContableActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<RubroEmpleaCuentaContable> rubroempleacuentacontablesSeleccionados=new ArrayList<RubroEmpleaCuentaContable>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosRubroEmpleaCuentaContable.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosRubroEmpleaCuentaContable.getSelectedRows().length;			
			}
			
			rubroempleacuentacontablesSeleccionados=this.getRubroEmpleaCuentaContablesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoRubroEmpleaCuentaContable--;			
				//RubroEmpleaCuentaContable rubroempleacuentacontableAux= new RubroEmpleaCuentaContable();			
				//rubroempleacuentacontableAux.setId(this.iIdNuevoRubroEmpleaCuentaContable);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//RubroEmpleaCuentaContable rubroempleacuentacontableOrigen=new RubroEmpleaCuentaContable();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(RubroEmpleaCuentaContable rubroempleacuentacontableOrigen : rubroempleacuentacontablesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosRubroEmpleaCuentaContable.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							rubroempleacuentacontableOrigen =(RubroEmpleaCuentaContable) this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rubroempleacuentacontableOrigen =(RubroEmpleaCuentaContable) this.rubroempleacuentacontables.toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaRubroEmpleaCuentaContable();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.rubroempleacuentacontable.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosRubroEmpleaCuentaContable(rubroempleacuentacontableOrigen,this.rubroempleacuentacontable,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysRubroEmpleaCuentaContable(this.rubroempleacuentacontable);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().add(this.rubroempleacuentacontableAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.rubroempleacuentacontables.add(this.rubroempleacuentacontableAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaRubroEmpleaCuentaContable(false);
				
				this.jTableDatosRubroEmpleaCuentaContable.setRowSelectionInterval(this.getIndiceNuevoRubroEmpleaCuentaContable(), this.getIndiceNuevoRubroEmpleaCuentaContable());
				
				int iLastRow =  this.jTableDatosRubroEmpleaCuentaContable.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosRubroEmpleaCuentaContable.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosRubroEmpleaCuentaContable.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaRubroEmpleaCuentaContable(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarRubroEmpleaCuentaContableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<RubroEmpleaCuentaContable> rubroempleacuentacontablesSeleccionados=new ArrayList<RubroEmpleaCuentaContable>();									
		
			RubroEmpleaCuentaContable rubroempleacuentacontableOrigen=new RubroEmpleaCuentaContable();
			RubroEmpleaCuentaContable rubroempleacuentacontableDestino=new RubroEmpleaCuentaContable();
				
			rubroempleacuentacontablesSeleccionados=this.getRubroEmpleaCuentaContablesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosRubroEmpleaCuentaContable.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || rubroempleacuentacontablesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosRubroEmpleaCuentaContable.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						rubroempleacuentacontableOrigen =(RubroEmpleaCuentaContable) this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						rubroempleacuentacontableOrigen =(RubroEmpleaCuentaContable) this.rubroempleacuentacontables.toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						rubroempleacuentacontableDestino =(RubroEmpleaCuentaContable) this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						rubroempleacuentacontableDestino =(RubroEmpleaCuentaContable) this.rubroempleacuentacontables.toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				rubroempleacuentacontableOrigen =rubroempleacuentacontablesSeleccionados.get(0);
				rubroempleacuentacontableDestino =rubroempleacuentacontablesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosRubroEmpleaCuentaContable(rubroempleacuentacontableOrigen,rubroempleacuentacontableDestino,true,false);
				
				rubroempleacuentacontableDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(rubroempleacuentacontableDestino,rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(rubroempleacuentacontableDestino,rubroempleacuentacontables);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaRubroEmpleaCuentaContable(false);
				
				//this.jTableDatosRubroEmpleaCuentaContable.setRowSelectionInterval(this.getIndiceNuevoRubroEmpleaCuentaContable(), this.getIndiceNuevoRubroEmpleaCuentaContable());
				
				int iLastRow =  this.jTableDatosRubroEmpleaCuentaContable.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosRubroEmpleaCuentaContable.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosRubroEmpleaCuentaContable.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaRubroEmpleaCuentaContable(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormRubroEmpleaCuentaContableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarRubroEmpleaCuentaContableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesRubroEmpleaCuentaContable.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesRubroEmpleaCuentaContable.setVisible(!isVisible);
			this.jPanelPaginacionRubroEmpleaCuentaContable.setVisible(!isVisible);
			this.jPanelAccionesRubroEmpleaCuentaContable.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarRubroEmpleaCuentaContableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameRubroEmpleaCuentaContable();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoRubroEmpleaCuentaContableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoRubroEmpleaCuentaContable();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionRubroEmpleaCuentaContableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionRubroEmpleaCuentaContable();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByRubroEmpleaCuentaContableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByRubroEmpleaCuentaContable();
			
			this.abrirFrameOrderByRubroEmpleaCuentaContable();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByRubroEmpleaCuentaContableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByRubroEmpleaCuentaContable();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleRubroEmpleaCuentaContable(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormRubroEmpleaCuentaContable);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.isMaximum()) {
					this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.setSize(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.iWidthFormulario,this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.isMaximum()) {
						this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jContentPaneDetalleRubroEmpleaCuentaContable.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jTabbedPaneRelacionesRubroEmpleaCuentaContable.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jContentPaneDetalleRubroEmpleaCuentaContable.getWidth(),RubroEmpleaCuentaContableConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jTabbedPaneRelacionesRubroEmpleaCuentaContable.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jContentPaneDetalleRubroEmpleaCuentaContable.getWidth(),RubroEmpleaCuentaContableConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jTabbedPaneRelacionesRubroEmpleaCuentaContable.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jContentPaneDetalleRubroEmpleaCuentaContable.getWidth(),RubroEmpleaCuentaContableConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.setVisible(true);
	        this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByRubroEmpleaCuentaContable() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByRubroEmpleaCuentaContable==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByRubroEmpleaCuentaContable=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRubroEmpleaCuentaContable,false,this);
				} else {
					this.jInternalFrameOrderByRubroEmpleaCuentaContable=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRubroEmpleaCuentaContable,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByRubroEmpleaCuentaContable);
				this.jInternalFrameOrderByRubroEmpleaCuentaContable.setVisible(false);
				this.jInternalFrameOrderByRubroEmpleaCuentaContable.setSelected(false);
				
				this.jInternalFrameOrderByRubroEmpleaCuentaContable.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByRubroEmpleaCuentaContable"));
				
				this.inicializarActualizarBindingTablaOrderByRubroEmpleaCuentaContable();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionRubroEmpleaCuentaContable() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionRubroEmpleaCuentaContable==null) {
				
				this.jInternalFrameImportacionRubroEmpleaCuentaContable=new ImportacionJInternalFrame(RubroEmpleaCuentaContableConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionRubroEmpleaCuentaContable);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionRubroEmpleaCuentaContable);
				this.jInternalFrameImportacionRubroEmpleaCuentaContable.setVisible(false);
				this.jInternalFrameImportacionRubroEmpleaCuentaContable.setSelected(false);


				this.jInternalFrameImportacionRubroEmpleaCuentaContable.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionRubroEmpleaCuentaContable"));
				this.jInternalFrameImportacionRubroEmpleaCuentaContable.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionRubroEmpleaCuentaContable"));
				this.jInternalFrameImportacionRubroEmpleaCuentaContable.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionRubroEmpleaCuentaContable"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoRubroEmpleaCuentaContable() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable==null) {
				this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable=new ReporteDinamicoJInternalFrame(RubroEmpleaCuentaContableConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable);
				this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable.setVisible(false);
				this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRubroEmpleaCuentaContable"));
				this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRubroEmpleaCuentaContable"));
				this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRubroEmpleaCuentaContable"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRubroEmpleaCuentaContable();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleRubroEmpleaCuentaContable() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormRubroEmpleaCuentaContable);
			
	       	this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.setVisible(false);
	        this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.setSelected(false);
			
			//this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.dispose();
			//this.jInternalFrameDetalleFormRubroEmpleaCuentaContable=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoRubroEmpleaCuentaContable() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable.setVisible(true);
	        this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionRubroEmpleaCuentaContable() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionRubroEmpleaCuentaContable.setVisible(true);
	        this.jInternalFrameImportacionRubroEmpleaCuentaContable.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByRubroEmpleaCuentaContable() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByRubroEmpleaCuentaContable.setVisible(true);
	        this.jInternalFrameOrderByRubroEmpleaCuentaContable.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByRubroEmpleaCuentaContable() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByRubroEmpleaCuentaContable.setVisible(false);
	        this.jInternalFrameOrderByRubroEmpleaCuentaContable.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoRubroEmpleaCuentaContable() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable.setVisible(false);
	        this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionRubroEmpleaCuentaContable() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionRubroEmpleaCuentaContable.setVisible(false);
	        this.jInternalFrameImportacionRubroEmpleaCuentaContable.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	

				public void abrirFrameTreeCuentaContable(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeCuentaContable);
						CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.sTipoBusqueda="CuentaContable";
						}

						cuentacontableBeanSwingJInternalFrame.getTodosCuentaContableArbol();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setCuentaContables(cuentacontableBeanSwingJInternalFrame.cuentacontablesArbol);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.CargarTreeCuentaContable();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setVisible(true);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.jInternalFrameParent=this;
						TitledBorder titledBorderRubroEmpleaCuentaContable=(TitledBorder)this.jScrollPanelDatosRubroEmpleaCuentaContable.getBorder();
						TitledBorder titledBorderCuentaContable=(TitledBorder)cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

						titledBorderCuentaContable.setTitle(titledBorderRubroEmpleaCuentaContable.getTitle() + " -> Cuenta Contable");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cuentacontableBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(cuentacontableBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeCuentaContable(CuentaContableBeanSwingJInternalFrame jInternalFrameTreeCuentaContable) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeCuentaContable);
						jInternalFrameTreeCuentaContable.setVisible(false);
						jInternalFrameTreeCuentaContable.setSelected(false);
						//jInternalFrameTreeCuentaContable.dispose();
						//jInternalFrameTreeCuentaContable=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}

				public void abrirFrameTreeEstructura(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeEstructura);
						EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame=new EstructuraBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						estructuraBeanSwingJInternalFrame.setJInternalFrameParent(this);
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.sTipoBusqueda="Estructura";
						}

						estructuraBeanSwingJInternalFrame.getTodosEstructuraArbol();
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.setEstructuras(estructuraBeanSwingJInternalFrame.estructurasArbol);
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.CargarTreeEstructura();
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.setVisible(true);
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.jInternalFrameParent=this;
						TitledBorder titledBorderRubroEmpleaCuentaContable=(TitledBorder)this.jScrollPanelDatosRubroEmpleaCuentaContable.getBorder();
						TitledBorder titledBorderEstructura=(TitledBorder)estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getBorder();

						titledBorderEstructura.setTitle(titledBorderRubroEmpleaCuentaContable.getTitle() + " -> Estructura");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,estructuraBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(estructuraBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeEstructura(EstructuraBeanSwingJInternalFrame jInternalFrameTreeEstructura) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeEstructura);
						jInternalFrameTreeEstructura.setVisible(false);
						jInternalFrameTreeEstructura.setSelected(false);
						//jInternalFrameTreeEstructura.dispose();
						//jInternalFrameTreeEstructura=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}
	
	public void jButtonModificarRubroEmpleaCuentaContableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarRubroEmpleaCuentaContable(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarRubroEmpleaCuentaContable(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosRubroEmpleaCuentaContable.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesRubroEmpleaCuentaContable(true);
			//this.isEsNuevoRubroEmpleaCuentaContable=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontable =(RubroEmpleaCuentaContable) this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.rubroempleacuentacontable =(RubroEmpleaCuentaContable) this.rubroempleacuentacontables.toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesRubroEmpleaCuentaContable("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRubroEmpleaCuentaContable(false) ;
			
			if(rubroempleacuentacontableSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(RubroEmpleaCuentaContableJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRubroEmpleaCuentaContable(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRubroEmpleaCuentaContable(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaRubroEmpleaCuentaContableActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosRubroEmpleaCuentaContable.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleacuentacontable =(RubroEmpleaCuentaContable) this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rubroempleacuentacontable =(RubroEmpleaCuentaContable) this.rubroempleacuentacontables.toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarRubroEmpleaCuentaContable(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosRubroEmpleaCuentaContable.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesRubroEmpleaCuentaContable(true);
			//this.isEsNuevoRubroEmpleaCuentaContable=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontable =(RubroEmpleaCuentaContable) this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.rubroempleacuentacontable =(RubroEmpleaCuentaContable) this.rubroempleacuentacontables.toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.rubroempleacuentacontable.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesRubroEmpleaCuentaContable("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesRubroEmpleaCuentaContable(false) ;
			
			if(RubroEmpleaCuentaContableJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRubroEmpleaCuentaContable(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRubroEmpleaCuentaContable(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaRubroEmplea(List<RubroEmplea> rubroempleasForeignKey)throws Exception{
		TableColumn tableColumnRubroEmplea=this.jTableDatosRubroEmpleaCuentaContable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRubroEmpleaCuentaContable,RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDRUBROEMPLEA));
		TableCellEditor tableCellEditorRubroEmplea =tableColumnRubroEmplea.getCellEditor();

		RubroEmpleaTableCell rubroempleaTableCellFk=(RubroEmpleaTableCell)tableCellEditorRubroEmplea;

		if(rubroempleaTableCellFk!=null) {
			rubroempleaTableCellFk.setrubroempleasForeignKey(rubroempleasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosRubroEmpleaCuentaContable.getSelectedRow();

		//if(intSelectedRow<=0) {
			//rubroempleaTableCellFk.setRowActual(intSelectedRow);
			//rubroempleaTableCellFk.setrubroempleasForeignKeyActual(rubroempleasForeignKey);
		//}


		if(rubroempleaTableCellFk!=null) {
			rubroempleaTableCellFk.RecargarRubroEmpleasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCuentaContable(List<CuentaContable> cuentacontablesForeignKey)throws Exception{
		TableColumn tableColumnCuentaContable=this.jTableDatosRubroEmpleaCuentaContable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRubroEmpleaCuentaContable,RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDCUENTACONTABLE));
		TableCellEditor tableCellEditorCuentaContable =tableColumnCuentaContable.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContable;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontablesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosRubroEmpleaCuentaContable.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cuentacontableTableCellFk.setRowActual(intSelectedRow);
			//cuentacontableTableCellFk.setcuentacontablesForeignKeyActual(cuentacontablesForeignKey);
		//}


		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.RecargarCuentaContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEstructura(List<Estructura> estructurasForeignKey)throws Exception{
		TableColumn tableColumnEstructura=this.jTableDatosRubroEmpleaCuentaContable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRubroEmpleaCuentaContable,RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDESTRUCTURA));
		TableCellEditor tableCellEditorEstructura =tableColumnEstructura.getCellEditor();

		EstructuraTableCell estructuraTableCellFk=(EstructuraTableCell)tableCellEditorEstructura;

		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.setestructurasForeignKey(estructurasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosRubroEmpleaCuentaContable.getSelectedRow();

		//if(intSelectedRow<=0) {
			//estructuraTableCellFk.setRowActual(intSelectedRow);
			//estructuraTableCellFk.setestructurasForeignKeyActual(estructurasForeignKey);
		//}


		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.RecargarEstructurasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarRubroEmpleaCuentaContableActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesRubroEmpleaCuentaContable(false);
			
			//if(!this.isEsNuevoRubroEmpleaCuentaContable) {								
				int intSelectedRow = this.jTableDatosRubroEmpleaCuentaContable.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleacuentacontable =(RubroEmpleaCuentaContable) this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.rubroempleacuentacontable =(RubroEmpleaCuentaContable) this.rubroempleacuentacontables.toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(RubroEmpleaCuentaContableJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualRubroEmpleaCuentaContable(this.rubroempleacuentacontable,true);
				this.setVariablesFormularioToObjetoActualForeignKeysRubroEmpleaCuentaContable(this.rubroempleacuentacontable);
				
			}
			
			if(this.permiteMantenimiento(this.rubroempleacuentacontable)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoRubroEmpleaCuentaContable=true;
					this.inicializarActualizarBindingTablaRubroEmpleaCuentaContable(false);
					this.isEsNuevoRubroEmpleaCuentaContable=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoRubroEmpleaCuentaContable=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoRubroEmpleaCuentaContable=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesRubroEmpleaCuentaContable(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRubroEmpleaCuentaContable(false);
				
				this.habilitarDeshabilitarControlesRubroEmpleaCuentaContable(false);
			
												
				
				if(RubroEmpleaCuentaContableJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleRubroEmpleaCuentaContable();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoRubroEmpleaCuentaContableActionPerformed(evt,rubroempleacuentacontableSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualRubroEmpleaCuentaContable(this.rubroempleacuentacontable,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosRubroEmpleaCuentaContable.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,rubroempleacuentacontableSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.rubroempleacuentacontable.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(RubroEmpleaCuentaContable.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RubroEmpleaCuentaContable.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarRubroEmpleaCuentaContableActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosRubroEmpleaCuentaContable.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontable =(RubroEmpleaCuentaContable) this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
				this.rubroempleacuentacontable.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.rubroempleacuentacontable =(RubroEmpleaCuentaContable) this.rubroempleacuentacontables.toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
				this.rubroempleacuentacontable.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.rubroempleacuentacontable)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((RubroEmpleaCuentaContableModel) this.jTableDatosRubroEmpleaCuentaContable.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoRubroEmpleaCuentaContable=true;
				this.inicializarActualizarBindingTablaRubroEmpleaCuentaContable(false);
				this.isEsNuevoRubroEmpleaCuentaContable=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesRubroEmpleaCuentaContable(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRubroEmpleaCuentaContable(false);
				
				this.habilitarDeshabilitarControlesRubroEmpleaCuentaContable(false);
				
				
				
				if(RubroEmpleaCuentaContableJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleRubroEmpleaCuentaContable();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarRubroEmpleaCuentaContableActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosRubroEmpleaCuentaContable.getRowCount()>=1) {
				jTableDatosRubroEmpleaCuentaContable.removeRowSelectionInterval(0, jTableDatosRubroEmpleaCuentaContable.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesRubroEmpleaCuentaContable(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaRubroEmpleaCuentaContable(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRubroEmpleaCuentaContable(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRubroEmpleaCuentaContable(false) ;
			
			this.isEsNuevoRubroEmpleaCuentaContable=false;
			
			if(RubroEmpleaCuentaContableJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleRubroEmpleaCuentaContable();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosRubroEmpleaCuentaContableActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingRubroEmpleaCuentaContable(false);
				
				//SI ES MANUAL
				if(RubroEmpleaCuentaContableJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualRubroEmpleaCuentaContable();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosRubroEmpleaCuentaContableActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoRubroEmpleaCuentaContable--;			
			//RubroEmpleaCuentaContable rubroempleacuentacontableAux= new RubroEmpleaCuentaContable();			
			//rubroempleacuentacontableAux.setId(this.iIdNuevoRubroEmpleaCuentaContable);
			
			if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaRubroEmpleaCuentaContable();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysRubroEmpleaCuentaContable(this.rubroempleacuentacontable);
			
			this.rubroempleacuentacontable.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().add(this.rubroempleacuentacontableAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.rubroempleacuentacontables.add(this.rubroempleacuentacontableAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaRubroEmpleaCuentaContable(false);
			
			this.jTableDatosRubroEmpleaCuentaContable.setRowSelectionInterval(this.getIndiceNuevoRubroEmpleaCuentaContable(), this.getIndiceNuevoRubroEmpleaCuentaContable());
			
			int iLastRow =  this.jTableDatosRubroEmpleaCuentaContable.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosRubroEmpleaCuentaContable.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosRubroEmpleaCuentaContable.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaRubroEmpleaCuentaContable(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionRubroEmpleaCuentaContableActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingRubroEmpleaCuentaContable(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRubroEmpleaCuentaContable(false);
			
			//SI ES MANUAL
			if(RubroEmpleaCuentaContableJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRubroEmpleaCuentaContable();
			}
			
			//this.abrirFrameTreeRubroEmpleaCuentaContable();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionRubroEmpleaCuentaContableActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Rubro Emplea Cuenta ContableS ?", "MANTENIMIENTO DE Rubro Emplea Cuenta Contable", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionRubroEmpleaCuentaContable.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralRubroEmpleaCuentaContable();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.rubroempleacuentacontableReturnGeneral=rubroempleacuentacontableLogic.procesarImportacionRubroEmpleaCuentaContablesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.rubroempleacuentacontableParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarRubroEmpleaCuentaContableReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionRubroEmpleaCuentaContableActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionRubroEmpleaCuentaContable.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionRubroEmpleaCuentaContable.setFileImportacion(this.jInternalFrameImportacionRubroEmpleaCuentaContable.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionRubroEmpleaCuentaContable.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionRubroEmpleaCuentaContable.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionRubroEmpleaCuentaContable.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionRubroEmpleaCuentaContable.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoRubroEmpleaCuentaContableActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<RubroEmpleaCuentaContable> rubroempleacuentacontablesSeleccionados=new ArrayList<RubroEmpleaCuentaContable>();		

		rubroempleacuentacontablesSeleccionados=this.getRubroEmpleaCuentaContablesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("RubroEmpleaCuentaContableBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"RubroEmpleaCuentaContableBaseDesign.jrxml";
			
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
			
			this.generarReporteRubroEmpleaCuentaContables("Todos",rubroempleacuentacontablesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Rubro Emplea Cuenta Contable",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDRUBROEMPLEA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_RubroEmplea_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_RubroEmplea_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_RubroEmplea_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_RubroEmplea_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CuentaContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CuentaContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CuentaContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CuentaContable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDESTRUCTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Estructura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Estructura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Estructura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Estructura_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDRUBROEMPLEA:
					sNombreCampoCategoria="id_rubro_emplea";
					break;

				case RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDCUENTACONTABLE:
					sNombreCampoCategoria="id_cuenta_contable";
					break;

				case RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDESTRUCTURA:
					sNombreCampoCategoria="id_estructura";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDRUBROEMPLEA:
					sNombreCampoCategoriaValor="id_rubro_emplea";
					break;

				case RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDCUENTACONTABLE:
					sNombreCampoCategoriaValor="id_cuenta_contable";
					break;

				case RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDESTRUCTURA:
					sNombreCampoCategoriaValor="id_estructura";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDRUBROEMPLEA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Rubro Emplea",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_rubro_emplea");
					break;

				case RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDCUENTACONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cuenta Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cuenta_contable");
					break;

				case RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDESTRUCTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estructura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_estructura");
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
	
	public void jButtonGenerarExcelReporteDinamicoRubroEmpleaCuentaContableActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<RubroEmpleaCuentaContable> rubroempleacuentacontablesSeleccionados=new ArrayList<RubroEmpleaCuentaContable>();		
		
		rubroempleacuentacontablesSeleccionados=this.getRubroEmpleaCuentaContablesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"rubroempleacuentacontable";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("RubroEmpleaCuentaContables");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(RubroEmpleaCuentaContable rubroempleacuentacontable:rubroempleacuentacontablesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(rubroempleacuentacontable.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(RubroEmpleaCuentaContable rubroempleacuentacontable:rubroempleacuentacontablesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(rubroempleacuentacontable.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDRUBROEMPLEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDRUBROEMPLEA);
					iRow++;

					for(RubroEmpleaCuentaContable rubroempleacuentacontable:rubroempleacuentacontablesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(rubroempleacuentacontable.getrubroemplea_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDCUENTACONTABLE);
					iRow++;

					for(RubroEmpleaCuentaContable rubroempleacuentacontable:rubroempleacuentacontablesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(rubroempleacuentacontable.getcuentacontable_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDESTRUCTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDESTRUCTURA);
					iRow++;

					for(RubroEmpleaCuentaContable rubroempleacuentacontable:rubroempleacuentacontablesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(rubroempleacuentacontable.getestructura_descripcion());
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
			//	this.getFilaCabeceraExportarExcelRubroEmpleaCuentaContable(row);				
			//	iRow++;
			//}				
			
			//for(RubroEmpleaCuentaContable rubroempleacuentacontableAux:rubroempleacuentacontablesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelRubroEmpleaCuentaContable(rubroempleacuentacontableAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Rubro Emplea Cuenta Contable",JOptionPane.INFORMATION_MESSAGE);
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
				this.rubroempleacuentacontableLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRubroEmpleaCuentaContable(false);
			
			//SI ES MANUAL
			if(RubroEmpleaCuentaContableJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRubroEmpleaCuentaContable();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresRubroEmpleaCuentaContableActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRubroEmpleaCuentaContable(false);
			
			//SI ES MANUAL
			if(RubroEmpleaCuentaContableJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualRubroEmpleaCuentaContable();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesRubroEmpleaCuentaContableActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRubroEmpleaCuentaContable(false);
			
			//SI ES MANUAL
			if(RubroEmpleaCuentaContableJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualRubroEmpleaCuentaContable();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaRubroEmpleaCuentaContable() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosRubroEmpleaCuentaContable.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosRubroEmpleaCuentaContable.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosRubroEmpleaCuentaContable.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosRubroEmpleaCuentaContable.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosRubroEmpleaCuentaContable.setMinimumSize(dimensionMinimum);
		this.jTableDatosRubroEmpleaCuentaContable.setMaximumSize(dimensionMaximum);
		this.jTableDatosRubroEmpleaCuentaContable.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingRubroEmpleaCuentaContable(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingRubroEmpleaCuentaContable(esInicializar,true);
	}
	
	public void inicializarActualizarBindingRubroEmpleaCuentaContable(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaRubroEmpleaCuentaContable(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesRubroEmpleaCuentaContable(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasRubroEmpleaCuentaContable(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesRubroEmpleaCuentaContable(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesRubroEmpleaCuentaContable(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !RubroEmpleaCuentaContableJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!RubroEmpleaCuentaContableJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualRubroEmpleaCuentaContable() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaRubroEmpleaCuentaContable();
		
		this.inicializarActualizarBindingBotonesManualRubroEmpleaCuentaContable(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualRubroEmpleaCuentaContable();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesRubroEmpleaCuentaContable() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualRubroEmpleaCuentaContable(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualRubroEmpleaCuentaContable(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosRubroEmpleaCuentaContable.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosRubroEmpleaCuentaContable.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteRubroEmpleaCuentaContable.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jCheckBoxPostAccionNuevoRubroEmpleaCuentaContable.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jCheckBoxPostAccionSinCerrarRubroEmpleaCuentaContable.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jCheckBoxPostAccionSinMensajeRubroEmpleaCuentaContable.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosRubroEmpleaCuentaContable.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosRubroEmpleaCuentaContable.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteRubroEmpleaCuentaContable.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) {
				this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jCheckBoxPostAccionNuevoRubroEmpleaCuentaContable.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jCheckBoxPostAccionSinCerrarRubroEmpleaCuentaContable.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jCheckBoxPostAccionSinMensajeRubroEmpleaCuentaContable.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionRubroEmpleaCuentaContable.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionRubroEmpleaCuentaContable.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxTiposAccionesFormularioRubroEmpleaCuentaContable.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesRubroEmpleaCuentaContable.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesRubroEmpleaCuentaContable.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesRubroEmpleaCuentaContable.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarRubroEmpleaCuentaContable.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesRubroEmpleaCuentaContable.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesRubroEmpleaCuentaContable.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralRubroEmpleaCuentaContable.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesRubroEmpleaCuentaContable(Boolean esInicializar) throws Exception {
		try	{	
			if(RubroEmpleaCuentaContableJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualRubroEmpleaCuentaContable(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesRubroEmpleaCuentaContable() throws Exception {
		try	{
			if(RubroEmpleaCuentaContableJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualRubroEmpleaCuentaContable();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleRubroEmpleaCuentaContable() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxTiposAccionesFormularioRubroEmpleaCuentaContable.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxTiposAccionesFormularioRubroEmpleaCuentaContable.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualRubroEmpleaCuentaContable() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesRubroEmpleaCuentaContable.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesRubroEmpleaCuentaContable.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesRubroEmpleaCuentaContable.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesRubroEmpleaCuentaContable.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesRubroEmpleaCuentaContable.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesRubroEmpleaCuentaContable.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionRubroEmpleaCuentaContable.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionRubroEmpleaCuentaContable.addItem(reporte);
			}
			
			
			if(!this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionRubroEmpleaCuentaContable.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionRubroEmpleaCuentaContable.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesRubroEmpleaCuentaContable.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesRubroEmpleaCuentaContable.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesRubroEmpleaCuentaContable.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesRubroEmpleaCuentaContable.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxTiposAccionesFormularioRubroEmpleaCuentaContable.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxTiposAccionesFormularioRubroEmpleaCuentaContable.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarRubroEmpleaCuentaContable.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarRubroEmpleaCuentaContable.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarRubroEmpleaCuentaContable.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRubroEmpleaCuentaContable();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRubroEmpleaCuentaContable() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable!=null) {
				this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable!=null) {
				this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable!=null) {
				
				if(this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualRubroEmpleaCuentaContable()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_cuenta_contableFK_IdCuentaContableRubroEmpleaCuentaContable.getSelectedItem()!=null){this.id_cuenta_contableFK_IdCuentaContable=((CuentaContable)this.jComboBoxid_cuenta_contableFK_IdCuentaContableRubroEmpleaCuentaContable.getSelectedItem()).getId();}
		if(this.jComboBoxid_estructuraFK_IdEstructuraRubroEmpleaCuentaContable.getSelectedItem()!=null){this.id_estructuraFK_IdEstructura=((Estructura)this.jComboBoxid_estructuraFK_IdEstructuraRubroEmpleaCuentaContable.getSelectedItem()).getId();}
		if(this.jComboBoxid_rubro_empleaFK_IdRubroEmpleaRubroEmpleaCuentaContable.getSelectedItem()!=null){this.id_rubro_empleaFK_IdRubroEmplea=((RubroEmplea)this.jComboBoxid_rubro_empleaFK_IdRubroEmpleaRubroEmpleaCuentaContable.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasRubroEmpleaCuentaContable(Boolean esInicializar) throws Exception {				
		if(RubroEmpleaCuentaContableJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualRubroEmpleaCuentaContable();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaRubroEmpleaCuentaContable() throws Exception {
		this.inicializarActualizarBindingTablaRubroEmpleaCuentaContable(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByRubroEmpleaCuentaContable() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByRubroEmpleaCuentaContable.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByRubroEmpleaCuentaContable.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRubroEmpleaCuentaContable.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new RubroEmpleaCuentaContablePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByRubroEmpleaCuentaContable.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRubroEmpleaCuentaContable.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new RubroEmpleaCuentaContablePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosRubroEmpleaCuentaContableOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRubroEmpleaCuentaContableOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new RubroEmpleaCuentaContablePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByRubroEmpleaCuentaContable.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRubroEmpleaCuentaContable.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new RubroEmpleaCuentaContablePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByRubroEmpleaCuentaContable.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaRubroEmpleaCuentaContable(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=rubroempleacuentacontables.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(RubroEmpleaCuentaContableJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosRubroEmpleaCuentaContable.setModel(new RubroEmpleaCuentaContableModel(this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosRubroEmpleaCuentaContable.setModel(new RubroEmpleaCuentaContableModel(this.rubroempleacuentacontables,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByRubroEmpleaCuentaContable!=null && this.jInternalFrameOrderByRubroEmpleaCuentaContable.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByRubroEmpleaCuentaContable();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosRubroEmpleaCuentaContable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRubroEmpleaCuentaContable,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new RubroEmpleaCuentaContablePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+RubroEmpleaCuentaContableConstantesFunciones.SCLASSWEBTITULO,rubroempleacuentacontableConstantesFunciones.resaltarSeleccionarRubroEmpleaCuentaContable,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+RubroEmpleaCuentaContableConstantesFunciones.SCLASSWEBTITULO,rubroempleacuentacontableConstantesFunciones.resaltarSeleccionarRubroEmpleaCuentaContable,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosRubroEmpleaCuentaContable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRubroEmpleaCuentaContable,RubroEmpleaCuentaContableConstantesFunciones.LABEL_ID));

		if(this.rubroempleacuentacontableConstantesFunciones.mostraridRubroEmpleaCuentaContable && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RubroEmpleaCuentaContableConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.rubroempleacuentacontableConstantesFunciones.resaltaridRubroEmpleaCuentaContable,this.rubroempleacuentacontableConstantesFunciones.activaridRubroEmpleaCuentaContable,this,true,"idRubroEmpleaCuentaContable","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.rubroempleacuentacontableConstantesFunciones.resaltaridRubroEmpleaCuentaContable,this.rubroempleacuentacontableConstantesFunciones.activaridRubroEmpleaCuentaContable,this,true,"idRubroEmpleaCuentaContable","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRubroEmpleaCuentaContable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRubroEmpleaCuentaContable,RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDEMPRESA));

		if(this.rubroempleacuentacontableConstantesFunciones.mostrarid_empresaRubroEmpleaCuentaContable && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.rubroempleacuentacontableConstantesFunciones.resaltarid_empresaRubroEmpleaCuentaContable,this,this.rubroempleacuentacontableConstantesFunciones.activarid_empresaRubroEmpleaCuentaContable));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.rubroempleacuentacontableConstantesFunciones.resaltarid_empresaRubroEmpleaCuentaContable,this,this.rubroempleacuentacontableConstantesFunciones.activarid_empresaRubroEmpleaCuentaContable,false,"id_empresaRubroEmpleaCuentaContable","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RubroEmpleaCuentaContablePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRubroEmpleaCuentaContable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRubroEmpleaCuentaContable,RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.rubroempleacuentacontableConstantesFunciones.mostrarid_sucursalRubroEmpleaCuentaContable && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.rubroempleacuentacontableConstantesFunciones.resaltarid_sucursalRubroEmpleaCuentaContable,this,this.rubroempleacuentacontableConstantesFunciones.activarid_sucursalRubroEmpleaCuentaContable));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.rubroempleacuentacontableConstantesFunciones.resaltarid_sucursalRubroEmpleaCuentaContable,this,this.rubroempleacuentacontableConstantesFunciones.activarid_sucursalRubroEmpleaCuentaContable,false,"id_sucursalRubroEmpleaCuentaContable","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RubroEmpleaCuentaContablePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRubroEmpleaCuentaContable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRubroEmpleaCuentaContable,RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDRUBROEMPLEA));

		if(this.rubroempleacuentacontableConstantesFunciones.mostrarid_rubro_empleaRubroEmpleaCuentaContable && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDRUBROEMPLEA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new RubroEmpleaTableCell(this.rubroempleasForeignKey,this.rubroempleacuentacontableConstantesFunciones.resaltarid_rubro_empleaRubroEmpleaCuentaContable,this,this.rubroempleacuentacontableConstantesFunciones.activarid_rubro_empleaRubroEmpleaCuentaContable));
			tableColumn.setCellEditor(new RubroEmpleaTableCell(this.rubroempleasForeignKey,this.rubroempleacuentacontableConstantesFunciones.resaltarid_rubro_empleaRubroEmpleaCuentaContable,this,this.rubroempleacuentacontableConstantesFunciones.activarid_rubro_empleaRubroEmpleaCuentaContable,true,"id_rubro_empleaRubroEmpleaCuentaContable","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RubroEmpleaCuentaContablePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRubroEmpleaCuentaContable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRubroEmpleaCuentaContable,RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDCUENTACONTABLE));

		if(this.rubroempleacuentacontableConstantesFunciones.mostrarid_cuenta_contableRubroEmpleaCuentaContable && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDCUENTACONTABLE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CuentaContableTableCell(this.cuentacontablesForeignKey,this.rubroempleacuentacontableConstantesFunciones.resaltarid_cuenta_contableRubroEmpleaCuentaContable,this,this.rubroempleacuentacontableConstantesFunciones.activarid_cuenta_contableRubroEmpleaCuentaContable));
			tableColumn.setCellEditor(new CuentaContableTableCell(this.cuentacontablesForeignKey,this.rubroempleacuentacontableConstantesFunciones.resaltarid_cuenta_contableRubroEmpleaCuentaContable,this,this.rubroempleacuentacontableConstantesFunciones.activarid_cuenta_contableRubroEmpleaCuentaContable,true,"id_cuenta_contableRubroEmpleaCuentaContable","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70);
			//tableColumn.addPropertyChangeListener(new RubroEmpleaCuentaContablePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRubroEmpleaCuentaContable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRubroEmpleaCuentaContable,RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDESTRUCTURA));

		if(this.rubroempleacuentacontableConstantesFunciones.mostrarid_estructuraRubroEmpleaCuentaContable && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDESTRUCTURA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EstructuraTableCell(this.estructurasForeignKey,this.rubroempleacuentacontableConstantesFunciones.resaltarid_estructuraRubroEmpleaCuentaContable,this,this.rubroempleacuentacontableConstantesFunciones.activarid_estructuraRubroEmpleaCuentaContable));
			tableColumn.setCellEditor(new EstructuraTableCell(this.estructurasForeignKey,this.rubroempleacuentacontableConstantesFunciones.resaltarid_estructuraRubroEmpleaCuentaContable,this,this.rubroempleacuentacontableConstantesFunciones.activarid_estructuraRubroEmpleaCuentaContable,true,"id_estructuraRubroEmpleaCuentaContable","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RubroEmpleaCuentaContablePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosRubroEmpleaCuentaContable.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosRubroEmpleaCuentaContable.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarRubroEmpleaCuentaContable && this.isPermisoGuardarCambiosRubroEmpleaCuentaContable) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosRubroEmpleaCuentaContable.addColumn(tableColumn);
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
			
			this.jTableDatosRubroEmpleaCuentaContable.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarRubroEmpleaCuentaContable && this.isPermisoGuardarCambiosRubroEmpleaCuentaContable) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarRubroEmpleaCuentaContable && this.isPermisoGuardarCambiosRubroEmpleaCuentaContable) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosRubroEmpleaCuentaContable.moveColumn(this.jTableDatosRubroEmpleaCuentaContable.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosRubroEmpleaCuentaContable.moveColumn(this.jTableDatosRubroEmpleaCuentaContable.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosRubroEmpleaCuentaContable.moveColumn(this.jTableDatosRubroEmpleaCuentaContable.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosRubroEmpleaCuentaContable.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosRubroEmpleaCuentaContable.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosRubroEmpleaCuentaContable,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!RubroEmpleaCuentaContableJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosRubroEmpleaCuentaContable.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosRubroEmpleaCuentaContable.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!RubroEmpleaCuentaContableJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!RubroEmpleaCuentaContableJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosRubroEmpleaCuentaContable.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosRubroEmpleaCuentaContable.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosRubroEmpleaCuentaContable.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=rubroempleacuentacontables.size()-1;
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
		//this.jTableDatosRubroEmpleaCuentaContable.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosRubroEmpleaCuentaContable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosRubroEmpleaCuentaContable();
			
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
				
				//this.isEsNuevoRubroEmpleaCuentaContable=false;
					
				RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.rubroempleacuentacontable,new Object(),this.rubroempleacuentacontableParameterGeneral,this.rubroempleacuentacontableReturnGeneral);
			
				if(this.rubroempleacuentacontableSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosRubroEmpleaCuentaContable.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosRubroEmpleaCuentaContable.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleacuentacontable =(RubroEmpleaCuentaContable) this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rubroempleacuentacontable =(RubroEmpleaCuentaContable) this.rubroempleacuentacontables.toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.rubroempleacuentacontable.getsType().equals("DUPLICADO")
				   || this.rubroempleacuentacontable.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoRubroEmpleaCuentaContable=true;
				
				} else {
					this.isEsNuevoRubroEmpleaCuentaContable=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado()) {
					if(this.rubroempleacuentacontable.getId()>=0 && !this.rubroempleacuentacontable.getIsNew()) {						
						this.isEsNuevoRubroEmpleaCuentaContable=false;
						
					} else {
						this.isEsNuevoRubroEmpleaCuentaContable=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoRubroEmpleaCuentaContable(esRelaciones);						
				
				this.seleccionarRubroEmpleaCuentaContable(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.rubroempleacuentacontable.getId()<0) {
					this.isEsNuevoRubroEmpleaCuentaContable=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarRubroEmpleaCuentaContable(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarRubroEmpleaCuentaContable(evt,rowIndex);
				}	
				
				if(this.rubroempleacuentacontableSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion RubroEmpleaCuentaContable: " + this.dDif); 
					}
				}								
				
				RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.rubroempleacuentacontable,new Object(),this.rubroempleacuentacontableParameterGeneral,this.rubroempleacuentacontableReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarRubroEmpleaCuentaContable(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.rubroempleacuentacontable)) {
					if(this.rubroempleacuentacontable.getId()>0) {
						this.rubroempleacuentacontable.setIsDeleted(true);
						
						this.rubroempleacuentacontablesEliminados.add(this.rubroempleacuentacontable);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().remove(this.rubroempleacuentacontable);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.rubroempleacuentacontables.remove(this.rubroempleacuentacontable);				
					}
					
					
					((RubroEmpleaCuentaContableModel) this.jTableDatosRubroEmpleaCuentaContable.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaRubroEmpleaCuentaContable(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarRubroEmpleaCuentaContable(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoRubroEmpleaCuentaContable) {
			
			if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosRubroEmpleaCuentaContable.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosRubroEmpleaCuentaContable.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleacuentacontable =(RubroEmpleaCuentaContable) this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rubroempleacuentacontable =(RubroEmpleaCuentaContable) this.rubroempleacuentacontables.toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(RubroEmpleaCuentaContableJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioRubroEmpleaCuentaContable(this.rubroempleacuentacontable);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.rubroempleacuentacontableConstantesFunciones.cargarid_empresaRubroEmpleaCuentaContable || this.rubroempleacuentacontableConstantesFunciones.event_dependid_empresaRubroEmpleaCuentaContable) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.rubroempleacuentacontable.getid_empresa());
									//this.inicializarActualizarBindingRubroEmpleaCuentaContable(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(rubroempleacuentacontable.getEmpresa()!=null) {
							this.empresasForeignKey.add(rubroempleacuentacontable.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.rubroempleacuentacontable.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.rubroempleacuentacontableConstantesFunciones.cargarid_sucursalRubroEmpleaCuentaContable || this.rubroempleacuentacontableConstantesFunciones.event_dependid_sucursalRubroEmpleaCuentaContable) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.rubroempleacuentacontable.getid_sucursal());
									//this.inicializarActualizarBindingRubroEmpleaCuentaContable(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(rubroempleacuentacontable.getSucursal()!=null) {
							this.sucursalsForeignKey.add(rubroempleacuentacontable.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.rubroempleacuentacontable.getid_sucursal(),false,"Formulario");

					//RubroEmplea
					if(!this.rubroempleacuentacontableConstantesFunciones.cargarid_rubro_empleaRubroEmpleaCuentaContable || this.rubroempleacuentacontableConstantesFunciones.event_dependid_rubro_empleaRubroEmpleaCuentaContable) {
						//this.cargarCombosRubroEmpleasForeignKeyLista(" where id="+this.rubroempleacuentacontable.getid_rubro_emplea());
									//this.inicializarActualizarBindingRubroEmpleaCuentaContable(false,false);
						this.rubroempleasForeignKey=new ArrayList<RubroEmplea>();

						if(rubroempleacuentacontable.getRubroEmplea()!=null) {
							this.rubroempleasForeignKey.add(rubroempleacuentacontable.getRubroEmplea());
						}

						this.addItemDefectoCombosForeignKeyRubroEmplea();
						this.cargarCombosFrameRubroEmpleasForeignKey("Todos");
					}
					this.setActualRubroEmpleaForeignKey(this.rubroempleacuentacontable.getid_rubro_emplea(),false,"Formulario");

					//CuentaContable
					if(!this.rubroempleacuentacontableConstantesFunciones.cargarid_cuenta_contableRubroEmpleaCuentaContable || this.rubroempleacuentacontableConstantesFunciones.event_dependid_cuenta_contableRubroEmpleaCuentaContable) {
						//this.cargarCombosCuentaContablesForeignKeyLista(" where id="+this.rubroempleacuentacontable.getid_cuenta_contable());
									//this.inicializarActualizarBindingRubroEmpleaCuentaContable(false,false);
						this.cuentacontablesForeignKey=new ArrayList<CuentaContable>();

						if(rubroempleacuentacontable.getCuentaContable()!=null) {
							this.cuentacontablesForeignKey.add(rubroempleacuentacontable.getCuentaContable());
						}

						this.addItemDefectoCombosForeignKeyCuentaContable();
						this.cargarCombosFrameCuentaContablesForeignKey("Todos");
					}
					this.setActualCuentaContableForeignKey(this.rubroempleacuentacontable.getid_cuenta_contable(),false,"Formulario");

					//Estructura
					if(!this.rubroempleacuentacontableConstantesFunciones.cargarid_estructuraRubroEmpleaCuentaContable || this.rubroempleacuentacontableConstantesFunciones.event_dependid_estructuraRubroEmpleaCuentaContable) {
						//this.cargarCombosEstructurasForeignKeyLista(" where id="+this.rubroempleacuentacontable.getid_estructura());
									//this.inicializarActualizarBindingRubroEmpleaCuentaContable(false,false);
						this.estructurasForeignKey=new ArrayList<Estructura>();

						if(rubroempleacuentacontable.getEstructura()!=null) {
							this.estructurasForeignKey.add(rubroempleacuentacontable.getEstructura());
						}

						this.addItemDefectoCombosForeignKeyEstructura();
						this.cargarCombosFrameEstructurasForeignKey("Todos");
					}
					this.setActualEstructuraForeignKey(this.rubroempleacuentacontable.getid_estructura(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesRubroEmpleaCuentaContable("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesRubroEmpleaCuentaContable(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRubroEmpleaCuentaContable() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoRubroEmpleaCuentaContable(RubroEmpleaCuentaContable rubroempleacuentacontable) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoRubroEmpleaCuentaContable(rubroempleacuentacontable,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoRubroEmpleaCuentaContable(RubroEmpleaCuentaContable rubroempleacuentacontable,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioRubroEmpleaCuentaContable(rubroempleacuentacontable);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyRubroEmpleaCuentaContable(rubroempleacuentacontable,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyRubroEmpleaCuentaContable(rubroempleacuentacontable);
	}
	
	public void setVariablesObjetoActualToFormularioRubroEmpleaCuentaContable(RubroEmpleaCuentaContable rubroempleacuentacontable) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jLabelidRubroEmpleaCuentaContable.setText(rubroempleacuentacontable.getId().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,RubroEmpleaCuentaContable rubroempleacuentacontableLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,rubroempleacuentacontableLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,RubroEmpleaCuentaContable rubroempleacuentacontableLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				rubroempleacuentacontableLocal=this.rubroempleacuentacontable;
			} else {
				rubroempleacuentacontableLocal=this.rubroempleacuentacontableAnterior;
			}
		}
		
		if(this.permiteMantenimiento(rubroempleacuentacontableLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoRubroEmpleaCuentaContable(rubroempleacuentacontableLocal,true);
					
					if(rubroempleacuentacontableSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(rubroempleacuentacontableLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(rubroempleacuentacontableLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoRubroEmpleaCuentaContable(RubroEmpleaCuentaContable rubroempleacuentacontable,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualRubroEmpleaCuentaContable(rubroempleacuentacontable,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysRubroEmpleaCuentaContable(rubroempleacuentacontable);
	}
	
	public void setVariablesFormularioToObjetoActualRubroEmpleaCuentaContable(RubroEmpleaCuentaContable rubroempleacuentacontable,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualRubroEmpleaCuentaContable(rubroempleacuentacontable,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualRubroEmpleaCuentaContable(RubroEmpleaCuentaContable rubroempleacuentacontable,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jLabelidRubroEmpleaCuentaContable.getText()==null || this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jLabelidRubroEmpleaCuentaContable.getText()=="" || this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jLabelidRubroEmpleaCuentaContable.getText()=="Id") {
				this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jLabelidRubroEmpleaCuentaContable.setText("0");
			}

			if(conColumnasBase) {rubroempleacuentacontable.setId(Long.parseLong(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jLabelidRubroEmpleaCuentaContable.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RubroEmpleaCuentaContableConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jLabelIdRubroEmpleaCuentaContable,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualRubroEmpleaCuentaContable(RubroEmpleaCuentaContable rubroempleacuentacontableBean,RubroEmpleaCuentaContable rubroempleacuentacontable,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && rubroempleacuentacontableBean.getid_rubro_emplea()!=null && !rubroempleacuentacontableBean.getid_rubro_emplea().equals(-1L))) {rubroempleacuentacontable.setid_rubro_emplea(rubroempleacuentacontableBean.getid_rubro_emplea());}
			if(conDefault || (!conDefault && rubroempleacuentacontableBean.getid_cuenta_contable()!=null && !rubroempleacuentacontableBean.getid_cuenta_contable().equals(-1L))) {rubroempleacuentacontable.setid_cuenta_contable(rubroempleacuentacontableBean.getid_cuenta_contable());}
			if(conDefault || (!conDefault && rubroempleacuentacontableBean.getid_estructura()!=null && !rubroempleacuentacontableBean.getid_estructura().equals(-1L))) {rubroempleacuentacontable.setid_estructura(rubroempleacuentacontableBean.getid_estructura());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosRubroEmpleaCuentaContable(RubroEmpleaCuentaContable rubroempleacuentacontableOrigen,RubroEmpleaCuentaContable rubroempleacuentacontable,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && rubroempleacuentacontableOrigen.getId()!=null && !rubroempleacuentacontableOrigen.getId().equals(0L))) {rubroempleacuentacontable.setId(rubroempleacuentacontableOrigen.getId());}}
			if(conDefault || (!conDefault && rubroempleacuentacontableOrigen.getid_rubro_emplea()!=null && !rubroempleacuentacontableOrigen.getid_rubro_emplea().equals(-1L))) {rubroempleacuentacontable.setid_rubro_emplea(rubroempleacuentacontableOrigen.getid_rubro_emplea());}
			if(conDefault || (!conDefault && rubroempleacuentacontableOrigen.getid_cuenta_contable()!=null && !rubroempleacuentacontableOrigen.getid_cuenta_contable().equals(-1L))) {rubroempleacuentacontable.setid_cuenta_contable(rubroempleacuentacontableOrigen.getid_cuenta_contable());}
			if(conDefault || (!conDefault && rubroempleacuentacontableOrigen.getid_estructura()!=null && !rubroempleacuentacontableOrigen.getid_estructura().equals(-1L))) {rubroempleacuentacontable.setid_estructura(rubroempleacuentacontableOrigen.getid_estructura());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioRubroEmpleaCuentaContable(RubroEmpleaCuentaContable rubroempleacuentacontable) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jLabelidRubroEmpleaCuentaContable.setText(rubroempleacuentacontable.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioRubroEmpleaCuentaContable(RubroEmpleaCuentaContableBean rubroempleacuentacontableBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jLabelidRubroEmpleaCuentaContable.setText(rubroempleacuentacontableBean.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanRubroEmpleaCuentaContable(RubroEmpleaCuentaContableParameterReturnGeneral rubroempleacuentacontableReturnGeneral,RubroEmpleaCuentaContableBean rubroempleacuentacontableBean,Boolean conDefault) throws Exception { 
		try {
			RubroEmpleaCuentaContable rubroempleacuentacontableLocal=new RubroEmpleaCuentaContable();
			
			rubroempleacuentacontableLocal=rubroempleacuentacontableReturnGeneral.getRubroEmpleaCuentaContable();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && rubroempleacuentacontableLocal.getId()!=null && !rubroempleacuentacontableLocal.getId().equals(0L))) {rubroempleacuentacontableBean.setId(rubroempleacuentacontableLocal.getId());}}
			if(conDefault || (!conDefault && rubroempleacuentacontableLocal.getid_rubro_emplea()!=null && !rubroempleacuentacontableLocal.getid_rubro_emplea().equals(-1L))) {rubroempleacuentacontableBean.setid_rubro_emplea(rubroempleacuentacontableLocal.getid_rubro_emplea());}
			if(conDefault || (!conDefault && rubroempleacuentacontableLocal.getid_cuenta_contable()!=null && !rubroempleacuentacontableLocal.getid_cuenta_contable().equals(-1L))) {rubroempleacuentacontableBean.setid_cuenta_contable(rubroempleacuentacontableLocal.getid_cuenta_contable());}
			if(conDefault || (!conDefault && rubroempleacuentacontableLocal.getid_estructura()!=null && !rubroempleacuentacontableLocal.getid_estructura().equals(-1L))) {rubroempleacuentacontableBean.setid_estructura(rubroempleacuentacontableLocal.getid_estructura());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxRubroEmpleaCuentaContableGenerico(Long idRubroEmpleaCuentaContableSeleccionado,JComboBox jComboBoxRubroEmpleaCuentaContable,List<RubroEmpleaCuentaContable> rubroempleacuentacontablesLocal)throws Exception {
		try {
			RubroEmpleaCuentaContable  rubroempleacuentacontableTemp=null;

			for(RubroEmpleaCuentaContable rubroempleacuentacontableAux:rubroempleacuentacontablesLocal) {
				if(rubroempleacuentacontableAux.getId()!=null && rubroempleacuentacontableAux.getId().equals(idRubroEmpleaCuentaContableSeleccionado)) {
					rubroempleacuentacontableTemp=rubroempleacuentacontableAux;
					break;
				}
			}

			jComboBoxRubroEmpleaCuentaContable.setSelectedItem(rubroempleacuentacontableTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxRubroEmpleaCuentaContableGenerico(JComboBox jComboBoxRubroEmpleaCuentaContable,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxRubroEmpleaCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxRubroEmpleaCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxRubroEmpleaCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxRubroEmpleaCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxRubroEmpleaCuentaContable.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxRubroEmpleaCuentaContable.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxRubroEmpleaCuentaContable.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxRubroEmpleaCuentaContable.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxRubroEmpleaCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxRubroEmpleaCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			rubroempleacuentacontable=(RubroEmpleaCuentaContable) rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			rubroempleacuentacontable =(RubroEmpleaCuentaContable) rubroempleacuentacontables.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!rubroempleacuentacontable.getIsNew() && !rubroempleacuentacontable.getIsChanged() && !rubroempleacuentacontable.getIsDeleted()) {
				sDescripcion=rubroempleacuentacontable.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=rubroempleacuentacontable.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!rubroempleacuentacontable.getIsNew() && !rubroempleacuentacontable.getIsChanged() && !rubroempleacuentacontable.getIsDeleted()) {
				sDescripcion=rubroempleacuentacontable.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=rubroempleacuentacontable.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("RubroEmplea")) {
			//sDescripcion=this.getActualRubroEmpleaForeignKeyDescripcion((Long)value);
			if(!rubroempleacuentacontable.getIsNew() && !rubroempleacuentacontable.getIsChanged() && !rubroempleacuentacontable.getIsDeleted()) {
				sDescripcion=rubroempleacuentacontable.getrubroemplea_descripcion();
			} else {
				//sDescripcion=this.getActualRubroEmpleaForeignKeyDescripcion((Long)value);
				sDescripcion=rubroempleacuentacontable.getrubroemplea_descripcion();
			}
		}

		if(sTipo.equals("CuentaContable")) {
			//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
			if(!rubroempleacuentacontable.getIsNew() && !rubroempleacuentacontable.getIsChanged() && !rubroempleacuentacontable.getIsDeleted()) {
				sDescripcion=rubroempleacuentacontable.getcuentacontable_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
				sDescripcion=rubroempleacuentacontable.getcuentacontable_descripcion();
			}
		}

		if(sTipo.equals("Estructura")) {
			//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
			if(!rubroempleacuentacontable.getIsNew() && !rubroempleacuentacontable.getIsChanged() && !rubroempleacuentacontable.getIsDeleted()) {
				sDescripcion=rubroempleacuentacontable.getestructura_descripcion();
			} else {
				//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
				sDescripcion=rubroempleacuentacontable.getestructura_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		RubroEmpleaCuentaContable rubroempleacuentacontableRow=new RubroEmpleaCuentaContable();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			rubroempleacuentacontableRow=(RubroEmpleaCuentaContable) rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			rubroempleacuentacontableRow=(RubroEmpleaCuentaContable) rubroempleacuentacontables.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualRubroEmpleaCuentaContable(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoRubroEmpleaCuentaContable.setVisible((this.isVisibilidadCeldaNuevoRubroEmpleaCuentaContable && this.isPermisoNuevoRubroEmpleaCuentaContable));			
			this.jButtonDuplicarRubroEmpleaCuentaContable.setVisible((this.isVisibilidadCeldaDuplicarRubroEmpleaCuentaContable && this.isPermisoDuplicarRubroEmpleaCuentaContable));			
			this.jButtonCopiarRubroEmpleaCuentaContable.setVisible((this.isVisibilidadCeldaCopiarRubroEmpleaCuentaContable && this.isPermisoCopiarRubroEmpleaCuentaContable));
			this.jButtonVerFormRubroEmpleaCuentaContable.setVisible((this.isVisibilidadCeldaVerFormRubroEmpleaCuentaContable && this.isPermisoVerFormRubroEmpleaCuentaContable));
			
			this.jButtonAbrirOrderByRubroEmpleaCuentaContable.setVisible((this.isVisibilidadCeldaOrdenRubroEmpleaCuentaContable && this.isPermisoOrdenRubroEmpleaCuentaContable));			
			
			this.jButtonNuevoRelacionesRubroEmpleaCuentaContable.setVisible((this.isVisibilidadCeldaNuevoRelacionesRubroEmpleaCuentaContable && this.isPermisoNuevoRubroEmpleaCuentaContable));			
			this.jButtonNuevoGuardarCambiosRubroEmpleaCuentaContable.setVisible((this.isVisibilidadCeldaNuevoRubroEmpleaCuentaContable && this.isPermisoNuevoRubroEmpleaCuentaContable && this.isPermisoGuardarCambiosRubroEmpleaCuentaContable));
			
			if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) {
			this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonModificarRubroEmpleaCuentaContable.setVisible((this.isVisibilidadCeldaModificarRubroEmpleaCuentaContable && this.isPermisoActualizarRubroEmpleaCuentaContable));	
			this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonActualizarRubroEmpleaCuentaContable.setVisible((this.isVisibilidadCeldaActualizarRubroEmpleaCuentaContable && this.isPermisoActualizarRubroEmpleaCuentaContable));	
			this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonEliminarRubroEmpleaCuentaContable.setVisible((this.isVisibilidadCeldaEliminarRubroEmpleaCuentaContable && this.isPermisoEliminarRubroEmpleaCuentaContable));
			this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonCancelarRubroEmpleaCuentaContable.setVisible(this.isVisibilidadCeldaCancelarRubroEmpleaCuentaContable);							
			this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonGuardarCambiosRubroEmpleaCuentaContable.setVisible((this.isVisibilidadCeldaGuardarRubroEmpleaCuentaContable && this.isPermisoGuardarCambiosRubroEmpleaCuentaContable));			
			
			}
						
			this.jButtonGuardarCambiosTablaRubroEmpleaCuentaContable.setVisible((this.isVisibilidadCeldaGuardarCambiosRubroEmpleaCuentaContable && this.isPermisoGuardarCambiosRubroEmpleaCuentaContable));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarRubroEmpleaCuentaContable.setVisible((this.isVisibilidadCeldaNuevoRubroEmpleaCuentaContable && this.isPermisoNuevoRubroEmpleaCuentaContable));						
			this.jButtonDuplicarToolBarRubroEmpleaCuentaContable.setVisible((this.isVisibilidadCeldaDuplicarRubroEmpleaCuentaContable && this.isPermisoDuplicarRubroEmpleaCuentaContable));						
			this.jButtonCopiarToolBarRubroEmpleaCuentaContable.setVisible((this.isVisibilidadCeldaCopiarRubroEmpleaCuentaContable && this.isPermisoCopiarRubroEmpleaCuentaContable));			
			this.jButtonVerFormToolBarRubroEmpleaCuentaContable.setVisible((this.isVisibilidadCeldaVerFormRubroEmpleaCuentaContable && this.isPermisoVerFormRubroEmpleaCuentaContable));			
			this.jButtonAbrirOrderByToolBarRubroEmpleaCuentaContable.setVisible((this.isVisibilidadCeldaOrdenRubroEmpleaCuentaContable && this.isPermisoOrdenRubroEmpleaCuentaContable));
			this.jButtonNuevoRelacionesToolBarRubroEmpleaCuentaContable.setVisible((this.isVisibilidadCeldaNuevoRelacionesRubroEmpleaCuentaContable && this.isPermisoNuevoRubroEmpleaCuentaContable));			
			this.jButtonNuevoGuardarCambiosToolBarRubroEmpleaCuentaContable.setVisible((this.isVisibilidadCeldaNuevoRubroEmpleaCuentaContable && this.isPermisoNuevoRubroEmpleaCuentaContable && this.isPermisoGuardarCambiosRubroEmpleaCuentaContable));			
			
			if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) {
			this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonModificarToolBarRubroEmpleaCuentaContable.setVisible((this.isVisibilidadCeldaModificarRubroEmpleaCuentaContable && this.isPermisoActualizarRubroEmpleaCuentaContable));	
			this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonActualizarToolBarRubroEmpleaCuentaContable.setVisible((this.isVisibilidadCeldaActualizarRubroEmpleaCuentaContable  && this.isPermisoActualizarRubroEmpleaCuentaContable));	
			this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonEliminarToolBarRubroEmpleaCuentaContable.setVisible((this.isVisibilidadCeldaEliminarRubroEmpleaCuentaContable && this.isPermisoEliminarRubroEmpleaCuentaContable));
			this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonCancelarToolBarRubroEmpleaCuentaContable.setVisible(this.isVisibilidadCeldaCancelarRubroEmpleaCuentaContable);				
			this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonGuardarCambiosToolBarRubroEmpleaCuentaContable.setVisible((this.isVisibilidadCeldaGuardarRubroEmpleaCuentaContable && this.isPermisoGuardarCambiosRubroEmpleaCuentaContable));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarRubroEmpleaCuentaContable.setVisible((this.isVisibilidadCeldaGuardarCambiosRubroEmpleaCuentaContable && this.isPermisoGuardarCambiosRubroEmpleaCuentaContable));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoRubroEmpleaCuentaContable.setVisible((this.isVisibilidadCeldaNuevoRubroEmpleaCuentaContable && this.isPermisoNuevoRubroEmpleaCuentaContable));			
			this.jMenuItemDuplicarRubroEmpleaCuentaContable.setVisible((this.isVisibilidadCeldaDuplicarRubroEmpleaCuentaContable && this.isPermisoDuplicarRubroEmpleaCuentaContable));			
			this.jMenuItemCopiarRubroEmpleaCuentaContable.setVisible((this.isVisibilidadCeldaCopiarRubroEmpleaCuentaContable && this.isPermisoCopiarRubroEmpleaCuentaContable));			
			this.jMenuItemVerFormRubroEmpleaCuentaContable.setVisible((this.isVisibilidadCeldaVerFormRubroEmpleaCuentaContable && this.isPermisoVerFormRubroEmpleaCuentaContable));			
			this.jMenuItemAbrirOrderByRubroEmpleaCuentaContable.setVisible((this.isVisibilidadCeldaOrdenRubroEmpleaCuentaContable && this.isPermisoOrdenRubroEmpleaCuentaContable));			
			//this.jMenuItemMostrarOcultarRubroEmpleaCuentaContable.setVisible((this.isVisibilidadCeldaOrdenRubroEmpleaCuentaContable && this.isPermisoOrdenRubroEmpleaCuentaContable));
			this.jMenuItemDetalleAbrirOrderByRubroEmpleaCuentaContable.setVisible((this.isVisibilidadCeldaOrdenRubroEmpleaCuentaContable && this.isPermisoOrdenRubroEmpleaCuentaContable));			
			//this.jMenuItemDetalleMostrarOcultarRubroEmpleaCuentaContable.setVisible((this.isVisibilidadCeldaOrdenRubroEmpleaCuentaContable && this.isPermisoOrdenRubroEmpleaCuentaContable));			
			this.jMenuItemNuevoRelacionesRubroEmpleaCuentaContable.setVisible((this.isVisibilidadCeldaNuevoRelacionesRubroEmpleaCuentaContable && this.isPermisoNuevoRubroEmpleaCuentaContable));			
			this.jMenuItemNuevoGuardarCambiosRubroEmpleaCuentaContable.setVisible((this.isVisibilidadCeldaNuevoRubroEmpleaCuentaContable && this.isPermisoNuevoRubroEmpleaCuentaContable && this.isPermisoGuardarCambiosRubroEmpleaCuentaContable));									
			
			if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) {
			this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jMenuItemModificarRubroEmpleaCuentaContable.setVisible((this.isVisibilidadCeldaModificarRubroEmpleaCuentaContable && this.isPermisoActualizarRubroEmpleaCuentaContable));	
			this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jMenuItemActualizarRubroEmpleaCuentaContable.setVisible((this.isVisibilidadCeldaActualizarRubroEmpleaCuentaContable && this.isPermisoActualizarRubroEmpleaCuentaContable));	
			this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jMenuItemEliminarRubroEmpleaCuentaContable.setVisible((this.isVisibilidadCeldaEliminarRubroEmpleaCuentaContable && this.isPermisoEliminarRubroEmpleaCuentaContable));
			this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jMenuItemCancelarRubroEmpleaCuentaContable.setVisible(this.isVisibilidadCeldaCancelarRubroEmpleaCuentaContable);				
			}
			
			this.jMenuItemGuardarCambiosRubroEmpleaCuentaContable.setVisible((this.isVisibilidadCeldaGuardarRubroEmpleaCuentaContable && this.isPermisoGuardarCambiosRubroEmpleaCuentaContable));						
			this.jMenuItemGuardarCambiosTablaRubroEmpleaCuentaContable.setVisible((this.isVisibilidadCeldaGuardarCambiosRubroEmpleaCuentaContable && this.isPermisoGuardarCambiosRubroEmpleaCuentaContable));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoRubroEmpleaCuentaContable=this.jButtonNuevoRubroEmpleaCuentaContable.isVisible();
			this.isVisibilidadCeldaDuplicarRubroEmpleaCuentaContable=this.jButtonDuplicarRubroEmpleaCuentaContable.isVisible();
			this.isVisibilidadCeldaCopiarRubroEmpleaCuentaContable=this.jButtonCopiarRubroEmpleaCuentaContable.isVisible();
			this.isVisibilidadCeldaVerFormRubroEmpleaCuentaContable=this.jButtonVerFormRubroEmpleaCuentaContable.isVisible();
			
			this.isVisibilidadCeldaOrdenRubroEmpleaCuentaContable=this.jButtonAbrirOrderByRubroEmpleaCuentaContable.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesRubroEmpleaCuentaContable=this.jButtonNuevoRelacionesRubroEmpleaCuentaContable.isVisible();
			this.isVisibilidadCeldaModificarRubroEmpleaCuentaContable=this.jButtonModificarRubroEmpleaCuentaContable.isVisible();
			
			if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) {
			this.isVisibilidadCeldaActualizarRubroEmpleaCuentaContable=this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonActualizarRubroEmpleaCuentaContable.isVisible();
			this.isVisibilidadCeldaEliminarRubroEmpleaCuentaContable=this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonEliminarRubroEmpleaCuentaContable.isVisible();
			this.isVisibilidadCeldaCancelarRubroEmpleaCuentaContable=this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonCancelarRubroEmpleaCuentaContable.isVisible();
			this.isVisibilidadCeldaGuardarRubroEmpleaCuentaContable=this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonGuardarCambiosRubroEmpleaCuentaContable.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosRubroEmpleaCuentaContable=this.jButtonGuardarCambiosTablaRubroEmpleaCuentaContable.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoRubroEmpleaCuentaContable=this.jButtonNuevoToolBarRubroEmpleaCuentaContable.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesRubroEmpleaCuentaContable=this.jButtonNuevoRelacionesToolBarRubroEmpleaCuentaContable.isVisible();
			
			if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) {
			this.isVisibilidadCeldaModificarRubroEmpleaCuentaContable=this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonModificarToolBarRubroEmpleaCuentaContable.isVisible();
			this.isVisibilidadCeldaActualizarRubroEmpleaCuentaContable=this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonActualizarToolBarRubroEmpleaCuentaContable.isVisible();
			this.isVisibilidadCeldaEliminarRubroEmpleaCuentaContable=this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonEliminarToolBarRubroEmpleaCuentaContable.isVisible();
			this.isVisibilidadCeldaCancelarRubroEmpleaCuentaContable=this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonCancelarToolBarRubroEmpleaCuentaContable.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarRubroEmpleaCuentaContable=this.jButtonGuardarCambiosToolBarRubroEmpleaCuentaContable.isVisible();
			this.isVisibilidadCeldaGuardarCambiosRubroEmpleaCuentaContable=this.jButtonGuardarCambiosTablaToolBarRubroEmpleaCuentaContable.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoRubroEmpleaCuentaContable=this.jMenuItemNuevoRubroEmpleaCuentaContable.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesRubroEmpleaCuentaContable=this.jMenuItemNuevoRelacionesRubroEmpleaCuentaContable.isVisible();
			
			if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) {
			this.isVisibilidadCeldaModificarRubroEmpleaCuentaContable=this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jMenuItemModificarRubroEmpleaCuentaContable.isVisible();
			this.isVisibilidadCeldaActualizarRubroEmpleaCuentaContable=this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jMenuItemActualizarRubroEmpleaCuentaContable.isVisible();
			this.isVisibilidadCeldaEliminarRubroEmpleaCuentaContable=this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jMenuItemEliminarRubroEmpleaCuentaContable.isVisible();
			this.isVisibilidadCeldaCancelarRubroEmpleaCuentaContable=this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jMenuItemCancelarRubroEmpleaCuentaContable.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarRubroEmpleaCuentaContable=this.jMenuItemGuardarCambiosRubroEmpleaCuentaContable.isVisible();
			this.isVisibilidadCeldaGuardarCambiosRubroEmpleaCuentaContable=this.jMenuItemGuardarCambiosTablaRubroEmpleaCuentaContable.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesRubroEmpleaCuentaContable(Boolean esInicializar) {
		if(RubroEmpleaCuentaContableJInternalFrame.ISBINDING_MANUAL) {			
			if(this.rubroempleacuentacontableSessionBean.getConGuardarRelaciones()) {
				//if(this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesRubroEmpleaCuentaContable();
			}
			
			this.inicializarActualizarBindingBotonesManualRubroEmpleaCuentaContable(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualRubroEmpleaCuentaContable() {
		this.jButtonNuevoRubroEmpleaCuentaContable.setVisible(this.isPermisoNuevoRubroEmpleaCuentaContable);			
		this.jButtonDuplicarRubroEmpleaCuentaContable.setVisible(this.isPermisoDuplicarRubroEmpleaCuentaContable);			
		this.jButtonCopiarRubroEmpleaCuentaContable.setVisible(this.isPermisoCopiarRubroEmpleaCuentaContable);			
		this.jButtonVerFormRubroEmpleaCuentaContable.setVisible(this.isPermisoVerFormRubroEmpleaCuentaContable);			
		
		this.jButtonAbrirOrderByRubroEmpleaCuentaContable.setVisible(this.isPermisoOrdenRubroEmpleaCuentaContable);					
		
		this.jButtonNuevoRelacionesRubroEmpleaCuentaContable.setVisible(this.isPermisoNuevoRubroEmpleaCuentaContable);			
		
		if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonModificarRubroEmpleaCuentaContable.setVisible(this.isPermisoActualizarRubroEmpleaCuentaContable);	
			this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonActualizarRubroEmpleaCuentaContable.setVisible(this.isPermisoActualizarRubroEmpleaCuentaContable);	
			this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonEliminarRubroEmpleaCuentaContable.setVisible(this.isPermisoEliminarRubroEmpleaCuentaContable);
			this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonCancelarRubroEmpleaCuentaContable.setVisible(this.isVisibilidadCeldaCancelarRubroEmpleaCuentaContable);						
			this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonGuardarCambiosRubroEmpleaCuentaContable.setVisible(this.isPermisoGuardarCambiosRubroEmpleaCuentaContable);							
		}
		
		this.jButtonGuardarCambiosTablaRubroEmpleaCuentaContable.setVisible(this.isPermisoActualizarRubroEmpleaCuentaContable);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleRubroEmpleaCuentaContable() {
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonModificarRubroEmpleaCuentaContable.setVisible(this.isPermisoActualizarRubroEmpleaCuentaContable);	
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonActualizarRubroEmpleaCuentaContable.setVisible(this.isPermisoActualizarRubroEmpleaCuentaContable);	
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonEliminarRubroEmpleaCuentaContable.setVisible(this.isPermisoEliminarRubroEmpleaCuentaContable);
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonCancelarRubroEmpleaCuentaContable.setVisible(this.isVisibilidadCeldaCancelarRubroEmpleaCuentaContable);							
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonGuardarCambiosRubroEmpleaCuentaContable.setVisible((this.isVisibilidadCeldaGuardarRubroEmpleaCuentaContable && this.isPermisoGuardarCambiosRubroEmpleaCuentaContable));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosRubroEmpleaCuentaContable() {
		if(RubroEmpleaCuentaContableJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualRubroEmpleaCuentaContable();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesRubroEmpleaCuentaContable() {
	}
	
	public void jTableDatosRubroEmpleaCuentaContableListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarRubroEmpleaCuentaContable(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidRubroEmpleaCuentaContableBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleacuentacontableLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRubroEmpleaCuentaContable.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRubroEmpleaCuentaContable(this.getrubroempleacuentacontable(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubroEmpleaCuentaContable(this.rubroempleacuentacontable);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rubroempleacuentacontable =(RubroEmpleaCuentaContable) this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.rubroempleacuentacontable =(RubroEmpleaCuentaContable) this.rubroempleacuentacontables.toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.rubroempleacuentacontable==null) {
						this.rubroempleacuentacontable = new RubroEmpleaCuentaContable();
					}

					this.setVariablesFormularioToObjetoActualRubroEmpleaCuentaContable(this.rubroempleacuentacontable,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubroEmpleaCuentaContable(this.rubroempleacuentacontable);
				}

				if(this.rubroempleacuentacontable.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.rubroempleacuentacontable.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRubroEmpleaCuentaContable(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleacuentacontableLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleacuentacontableLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleacuentacontableLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaRubroEmpleaCuentaContableUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebRubroEmpleaCuentaContable(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRubroEmpleaCuentaContable.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRubroEmpleaCuentaContable.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRubroEmpleaCuentaContable.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleacuentacontable =(RubroEmpleaCuentaContable) this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.rubroempleacuentacontable =(RubroEmpleaCuentaContable) this.rubroempleacuentacontables.toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRubroEmpleaCuentaContable(this.getrubroempleacuentacontable(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRubroEmpleaCuentaContable(this.rubroempleacuentacontable);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.rubroempleacuentacontableLogic.getConnexion());

				if(this.rubroempleacuentacontable.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.rubroempleacuentacontable.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRubroEmpleaCuentaContable=(TitledBorder)this.jScrollPanelDatosRubroEmpleaCuentaContable.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderRubroEmpleaCuentaContable.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaRubroEmpleaCuentaContableBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleacuentacontableLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRubroEmpleaCuentaContable.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRubroEmpleaCuentaContable(this.getrubroempleacuentacontable(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubroEmpleaCuentaContable(this.rubroempleacuentacontable);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rubroempleacuentacontable =(RubroEmpleaCuentaContable) this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.rubroempleacuentacontable =(RubroEmpleaCuentaContable) this.rubroempleacuentacontables.toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.rubroempleacuentacontable==null) {
						this.rubroempleacuentacontable = new RubroEmpleaCuentaContable();
					}

					this.setVariablesFormularioToObjetoActualRubroEmpleaCuentaContable(this.rubroempleacuentacontable,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubroEmpleaCuentaContable(this.rubroempleacuentacontable);
				}

				if(this.rubroempleacuentacontable.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.rubroempleacuentacontable.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRubroEmpleaCuentaContable(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleacuentacontableLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleacuentacontableLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleacuentacontableLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalRubroEmpleaCuentaContableUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebRubroEmpleaCuentaContable(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRubroEmpleaCuentaContable.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRubroEmpleaCuentaContable.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRubroEmpleaCuentaContable.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleacuentacontable =(RubroEmpleaCuentaContable) this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.rubroempleacuentacontable =(RubroEmpleaCuentaContable) this.rubroempleacuentacontables.toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRubroEmpleaCuentaContable(this.getrubroempleacuentacontable(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRubroEmpleaCuentaContable(this.rubroempleacuentacontable);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.rubroempleacuentacontableLogic.getConnexion());

				if(this.rubroempleacuentacontable.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.rubroempleacuentacontable.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRubroEmpleaCuentaContable=(TitledBorder)this.jScrollPanelDatosRubroEmpleaCuentaContable.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderRubroEmpleaCuentaContable.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalRubroEmpleaCuentaContableBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleacuentacontableLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRubroEmpleaCuentaContable.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRubroEmpleaCuentaContable(this.getrubroempleacuentacontable(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubroEmpleaCuentaContable(this.rubroempleacuentacontable);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rubroempleacuentacontable =(RubroEmpleaCuentaContable) this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.rubroempleacuentacontable =(RubroEmpleaCuentaContable) this.rubroempleacuentacontables.toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.rubroempleacuentacontable==null) {
						this.rubroempleacuentacontable = new RubroEmpleaCuentaContable();
					}

					this.setVariablesFormularioToObjetoActualRubroEmpleaCuentaContable(this.rubroempleacuentacontable,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubroEmpleaCuentaContable(this.rubroempleacuentacontable);
				}

				if(this.rubroempleacuentacontable.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.rubroempleacuentacontable.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRubroEmpleaCuentaContable(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleacuentacontableLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleacuentacontableLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleacuentacontableLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_rubro_empleaRubroEmpleaCuentaContableUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisorubroemplea=true;

			idTienePermisorubroemplea=this.tienePermisosUsuarioEnPaginaWebRubroEmpleaCuentaContable(RubroEmpleaConstantesFunciones.CLASSNAME);

			if(idTienePermisorubroemplea) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRubroEmpleaCuentaContable.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRubroEmpleaCuentaContable.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRubroEmpleaCuentaContable.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleacuentacontable =(RubroEmpleaCuentaContable) this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.rubroempleacuentacontable =(RubroEmpleaCuentaContable) this.rubroempleacuentacontables.toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRubroEmpleaCuentaContable(this.getrubroempleacuentacontable(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRubroEmpleaCuentaContable(this.rubroempleacuentacontable);

				this.rubroempleaBeanSwingJInternalFrame=new RubroEmpleaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.rubroempleaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.rubroempleaBeanSwingJInternalFrame.getRubroEmpleaLogic().setConnexion(this.rubroempleacuentacontableLogic.getConnexion());

				if(this.rubroempleacuentacontable.getid_rubro_emplea()!=null) {
					this.rubroempleaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.rubroempleaBeanSwingJInternalFrame.setIdActual(this.rubroempleacuentacontable.getid_rubro_emplea());
					this.rubroempleaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.rubroempleaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.rubroempleaBeanSwingJInternalFrame.inicializarActualizarBindingTablaRubroEmplea();
				}

				JInternalFrameBase jinternalFrame =this.rubroempleaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRubroEmpleaCuentaContable=(TitledBorder)this.jScrollPanelDatosRubroEmpleaCuentaContable.getBorder();
				TitledBorder titledBorderrubroemplea=(TitledBorder)this.rubroempleaBeanSwingJInternalFrame.jScrollPanelDatosRubroEmplea.getBorder();

				titledBorderrubroemplea.setTitle(titledBorderRubroEmpleaCuentaContable.getTitle() + " -> Rubro Emplea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_rubro_empleaRubroEmpleaCuentaContableBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleacuentacontableLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRubroEmpleaCuentaContable.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRubroEmpleaCuentaContable(this.getrubroempleacuentacontable(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubroEmpleaCuentaContable(this.rubroempleacuentacontable);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rubroempleacuentacontable =(RubroEmpleaCuentaContable) this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.rubroempleacuentacontable =(RubroEmpleaCuentaContable) this.rubroempleacuentacontables.toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.rubroempleacuentacontable==null) {
						this.rubroempleacuentacontable = new RubroEmpleaCuentaContable();
					}

					this.setVariablesFormularioToObjetoActualRubroEmpleaCuentaContable(this.rubroempleacuentacontable,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubroEmpleaCuentaContable(this.rubroempleacuentacontable);
				}

				if(this.rubroempleacuentacontable.getid_rubro_emplea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_rubro_emplea = "+this.rubroempleacuentacontable.getid_rubro_emplea().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRubroEmpleaCuentaContable(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleacuentacontableLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleacuentacontableLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleacuentacontableLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contableRubroEmpleaCuentaContableUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontable=true;

			idTienePermisocuentacontable=this.tienePermisosUsuarioEnPaginaWebRubroEmpleaCuentaContable(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontable) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRubroEmpleaCuentaContable.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRubroEmpleaCuentaContable.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRubroEmpleaCuentaContable.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleacuentacontable =(RubroEmpleaCuentaContable) this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.rubroempleacuentacontable =(RubroEmpleaCuentaContable) this.rubroempleacuentacontables.toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRubroEmpleaCuentaContable(this.getrubroempleacuentacontable(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRubroEmpleaCuentaContable(this.rubroempleacuentacontable);

				this.cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontableBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.rubroempleacuentacontableLogic.getConnexion());

				if(this.rubroempleacuentacontable.getid_cuenta_contable()!=null) {
					this.cuentacontableBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontableBeanSwingJInternalFrame.setIdActual(this.rubroempleacuentacontable.getid_cuenta_contable());
					this.cuentacontableBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontableBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRubroEmpleaCuentaContable=(TitledBorder)this.jScrollPanelDatosRubroEmpleaCuentaContable.getBorder();
				TitledBorder titledBordercuentacontable=(TitledBorder)this.cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontable.setTitle(titledBorderRubroEmpleaCuentaContable.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contableRubroEmpleaCuentaContableBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleacuentacontableLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRubroEmpleaCuentaContable.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRubroEmpleaCuentaContable(this.getrubroempleacuentacontable(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubroEmpleaCuentaContable(this.rubroempleacuentacontable);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rubroempleacuentacontable =(RubroEmpleaCuentaContable) this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.rubroempleacuentacontable =(RubroEmpleaCuentaContable) this.rubroempleacuentacontables.toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.rubroempleacuentacontable==null) {
						this.rubroempleacuentacontable = new RubroEmpleaCuentaContable();
					}

					this.setVariablesFormularioToObjetoActualRubroEmpleaCuentaContable(this.rubroempleacuentacontable,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubroEmpleaCuentaContable(this.rubroempleacuentacontable);
				}

				if(this.rubroempleacuentacontable.getid_cuenta_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable = "+this.rubroempleacuentacontable.getid_cuenta_contable().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRubroEmpleaCuentaContable(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleacuentacontableLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleacuentacontableLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleacuentacontableLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estructuraRubroEmpleaCuentaContableUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestructura=true;

			idTienePermisoestructura=this.tienePermisosUsuarioEnPaginaWebRubroEmpleaCuentaContable(EstructuraConstantesFunciones.CLASSNAME);

			if(idTienePermisoestructura) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRubroEmpleaCuentaContable.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRubroEmpleaCuentaContable.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRubroEmpleaCuentaContable.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleacuentacontable =(RubroEmpleaCuentaContable) this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.rubroempleacuentacontable =(RubroEmpleaCuentaContable) this.rubroempleacuentacontables.toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRubroEmpleaCuentaContable(this.getrubroempleacuentacontable(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRubroEmpleaCuentaContable(this.rubroempleacuentacontable);

				this.estructuraBeanSwingJInternalFrame=new EstructuraBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estructuraBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estructuraBeanSwingJInternalFrame.getEstructuraLogic().setConnexion(this.rubroempleacuentacontableLogic.getConnexion());

				if(this.rubroempleacuentacontable.getid_estructura()!=null) {
					this.estructuraBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estructuraBeanSwingJInternalFrame.setIdActual(this.rubroempleacuentacontable.getid_estructura());
					this.estructuraBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstructura();
				}

				JInternalFrameBase jinternalFrame =this.estructuraBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRubroEmpleaCuentaContable=(TitledBorder)this.jScrollPanelDatosRubroEmpleaCuentaContable.getBorder();
				TitledBorder titledBorderestructura=(TitledBorder)this.estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getBorder();

				titledBorderestructura.setTitle(titledBorderRubroEmpleaCuentaContable.getTitle() + " -> Estructura");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estructuraRubroEmpleaCuentaContableBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleacuentacontableLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRubroEmpleaCuentaContable.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRubroEmpleaCuentaContable(this.getrubroempleacuentacontable(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubroEmpleaCuentaContable(this.rubroempleacuentacontable);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rubroempleacuentacontable =(RubroEmpleaCuentaContable) this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.rubroempleacuentacontable =(RubroEmpleaCuentaContable) this.rubroempleacuentacontables.toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.rubroempleacuentacontable==null) {
						this.rubroempleacuentacontable = new RubroEmpleaCuentaContable();
					}

					this.setVariablesFormularioToObjetoActualRubroEmpleaCuentaContable(this.rubroempleacuentacontable,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubroEmpleaCuentaContable(this.rubroempleacuentacontable);
				}

				if(this.rubroempleacuentacontable.getid_estructura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estructura = "+this.rubroempleacuentacontable.getid_estructura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRubroEmpleaCuentaContable(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleacuentacontableLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleacuentacontableLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleacuentacontableLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdCuentaContableRubroEmpleaCuentaContableActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRubroEmpleaCuentaContable(false,false);

			this.getRubroEmpleaCuentaContablesFK_IdCuentaContable();

			this.inicializarActualizarBindingRubroEmpleaCuentaContable(false);

			//if(RubroEmpleaCuentaContableBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRubroEmpleaCuentaContable(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaRubroEmpleaCuentaContableActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRubroEmpleaCuentaContable(false,false);

			this.getRubroEmpleaCuentaContablesFK_IdEmpresa();

			this.inicializarActualizarBindingRubroEmpleaCuentaContable(false);

			//if(RubroEmpleaCuentaContableBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRubroEmpleaCuentaContable(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEstructuraRubroEmpleaCuentaContableActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRubroEmpleaCuentaContable(false,false);

			this.getRubroEmpleaCuentaContablesFK_IdEstructura();

			this.inicializarActualizarBindingRubroEmpleaCuentaContable(false);

			//if(RubroEmpleaCuentaContableBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRubroEmpleaCuentaContable(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdRubroEmpleaRubroEmpleaCuentaContableActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRubroEmpleaCuentaContable(false,false);

			this.getRubroEmpleaCuentaContablesFK_IdRubroEmplea();

			this.inicializarActualizarBindingRubroEmpleaCuentaContable(false);

			//if(RubroEmpleaCuentaContableBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRubroEmpleaCuentaContable(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalRubroEmpleaCuentaContableActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRubroEmpleaCuentaContable(false,false);

			this.getRubroEmpleaCuentaContablesFK_IdSucursal();

			this.inicializarActualizarBindingRubroEmpleaCuentaContable(false);

			//if(RubroEmpleaCuentaContableBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRubroEmpleaCuentaContable(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubroempleacuentacontableLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameRubroEmpleaCuentaContable() {
		if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) {
			this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.setVisible(false);	    			
			this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.dispose();
			this.jInternalFrameDetalleFormRubroEmpleaCuentaContable=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable!=null) {
			this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable.dispose();
			this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable=null;
		}
		
		if(this.jInternalFrameImportacionRubroEmpleaCuentaContable!=null) {
			this.jInternalFrameImportacionRubroEmpleaCuentaContable.setVisible(false);	    			
			this.jInternalFrameImportacionRubroEmpleaCuentaContable.dispose();
			this.jInternalFrameImportacionRubroEmpleaCuentaContable=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessRubroEmpleaCuentaContable();
			
			RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rubroempleacuentacontable,new Object(),this.rubroempleacuentacontableParameterGeneral,this.rubroempleacuentacontableReturnGeneral);
			
			
			if(sTipo.equals("NuevoRubroEmpleaCuentaContable")) {
				jButtonNuevoRubroEmpleaCuentaContableActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarRubroEmpleaCuentaContable")) {
				jButtonDuplicarRubroEmpleaCuentaContableActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarRubroEmpleaCuentaContable")) {
				jButtonCopiarRubroEmpleaCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("VerFormRubroEmpleaCuentaContable")) {
				jButtonVerFormRubroEmpleaCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarRubroEmpleaCuentaContable")) {
				jButtonNuevoRubroEmpleaCuentaContableActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarRubroEmpleaCuentaContable")) {
				jButtonDuplicarRubroEmpleaCuentaContableActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoRubroEmpleaCuentaContable")) {
				jButtonNuevoRubroEmpleaCuentaContableActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarRubroEmpleaCuentaContable")) {
				jButtonDuplicarRubroEmpleaCuentaContableActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesRubroEmpleaCuentaContable")) {
				jButtonNuevoRubroEmpleaCuentaContableActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarRubroEmpleaCuentaContable")) {
				jButtonNuevoRubroEmpleaCuentaContableActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesRubroEmpleaCuentaContable")) {
				jButtonNuevoRubroEmpleaCuentaContableActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarRubroEmpleaCuentaContable")) {
				jButtonModificarRubroEmpleaCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarRubroEmpleaCuentaContable")) {
				jButtonModificarRubroEmpleaCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarRubroEmpleaCuentaContable")) {
				jButtonModificarRubroEmpleaCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("ActualizarRubroEmpleaCuentaContable")) {
				jButtonActualizarRubroEmpleaCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarRubroEmpleaCuentaContable")) {
				jButtonActualizarRubroEmpleaCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarRubroEmpleaCuentaContable")) {
				jButtonActualizarRubroEmpleaCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("EliminarRubroEmpleaCuentaContable")) {
				jButtonEliminarRubroEmpleaCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarRubroEmpleaCuentaContable")) {
				jButtonEliminarRubroEmpleaCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarRubroEmpleaCuentaContable")) {
				jButtonEliminarRubroEmpleaCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("CancelarRubroEmpleaCuentaContable")) {
				jButtonCancelarRubroEmpleaCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarRubroEmpleaCuentaContable")) {
				jButtonCancelarRubroEmpleaCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarRubroEmpleaCuentaContable")) {
				jButtonCancelarRubroEmpleaCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("CerrarRubroEmpleaCuentaContable")) {
				jButtonCerrarRubroEmpleaCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarRubroEmpleaCuentaContable")) {
				jButtonCerrarRubroEmpleaCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarRubroEmpleaCuentaContable")) {
				jButtonCerrarRubroEmpleaCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarRubroEmpleaCuentaContable")) {
				jButtonMostrarOcultarRubroEmpleaCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarRubroEmpleaCuentaContable")) {
				jButtonCancelarRubroEmpleaCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosRubroEmpleaCuentaContable")) {
				jButtonGuardarCambiosRubroEmpleaCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarRubroEmpleaCuentaContable")) {
				jButtonGuardarCambiosRubroEmpleaCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarRubroEmpleaCuentaContable")) {
				jButtonCopiarRubroEmpleaCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarRubroEmpleaCuentaContable")) {
				jButtonVerFormRubroEmpleaCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosRubroEmpleaCuentaContable")) {
				jButtonGuardarCambiosRubroEmpleaCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarRubroEmpleaCuentaContable")) {
				jButtonCopiarRubroEmpleaCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormRubroEmpleaCuentaContable")) {
				jButtonVerFormRubroEmpleaCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaRubroEmpleaCuentaContable")) {
				jButtonGuardarCambiosRubroEmpleaCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarRubroEmpleaCuentaContable")) {
				jButtonGuardarCambiosRubroEmpleaCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaRubroEmpleaCuentaContable")) {
				jButtonGuardarCambiosRubroEmpleaCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionRubroEmpleaCuentaContable")) {
				jButtonRecargarInformacionRubroEmpleaCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarRubroEmpleaCuentaContable")) {
				jButtonRecargarInformacionRubroEmpleaCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionRubroEmpleaCuentaContable")) {
				jButtonRecargarInformacionRubroEmpleaCuentaContableActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresRubroEmpleaCuentaContable")) {
				jButtonAnterioresRubroEmpleaCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarRubroEmpleaCuentaContable")) {
				jButtonAnterioresRubroEmpleaCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreRubroEmpleaCuentaContable")) {
				jButtonAnterioresRubroEmpleaCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("SiguientesRubroEmpleaCuentaContable")) {
				jButtonSiguientesRubroEmpleaCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarRubroEmpleaCuentaContable")) {
				jButtonSiguientesRubroEmpleaCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesRubroEmpleaCuentaContable")) {
				jButtonSiguientesRubroEmpleaCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByRubroEmpleaCuentaContable") || sTipo.equals("MenuItemDetalleAbrirOrderByRubroEmpleaCuentaContable")) {
				jButtonAbrirOrderByRubroEmpleaCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarRubroEmpleaCuentaContable") || sTipo.equals("MenuItemDetalleMostrarOcultarRubroEmpleaCuentaContable")) {
				jButtonMostrarOcultarRubroEmpleaCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosRubroEmpleaCuentaContable")) {
				jButtonNuevoGuardarCambiosRubroEmpleaCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarRubroEmpleaCuentaContable")) {
				jButtonNuevoGuardarCambiosRubroEmpleaCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosRubroEmpleaCuentaContable")) {
				jButtonNuevoGuardarCambiosRubroEmpleaCuentaContableActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoRubroEmpleaCuentaContable")) {
				jButtonCerrarReporteDinamicoRubroEmpleaCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoRubroEmpleaCuentaContable")) {
				jButtonGenerarReporteDinamicoRubroEmpleaCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoRubroEmpleaCuentaContable")) {
				
				jButtonGenerarExcelReporteDinamicoRubroEmpleaCuentaContableActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionRubroEmpleaCuentaContable")) {
				jButtonCerrarImportacionRubroEmpleaCuentaContableActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionRubroEmpleaCuentaContable")) {
				
				jButtonGenerarImportacionRubroEmpleaCuentaContableActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionRubroEmpleaCuentaContable")) {
				
				jButtonAbrirImportacionRubroEmpleaCuentaContableActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesRubroEmpleaCuentaContable")) {
				jComboBoxTiposAccionesRubroEmpleaCuentaContableActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesRubroEmpleaCuentaContable")) {
				jComboBoxTiposRelacionesRubroEmpleaCuentaContableActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioRubroEmpleaCuentaContable")) {
				jComboBoxTiposAccionesRubroEmpleaCuentaContableActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarRubroEmpleaCuentaContable")) {
				
				jComboBoxTiposSeleccionarRubroEmpleaCuentaContableActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralRubroEmpleaCuentaContable")) {
				jTextFieldValorCampoGeneralRubroEmpleaCuentaContableActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByRubroEmpleaCuentaContable")) {
				jButtonAbrirOrderByRubroEmpleaCuentaContableActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarRubroEmpleaCuentaContable")) {
				jButtonAbrirOrderByRubroEmpleaCuentaContableActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByRubroEmpleaCuentaContable")) {
				jButtonCerrarOrderByRubroEmpleaCuentaContableActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idRubroEmpleaCuentaContableBusqueda")) {
				this.jButtonidRubroEmpleaCuentaContableBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaRubroEmpleaCuentaContableUpdate")) {
				this.jButtonid_empresaRubroEmpleaCuentaContableUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaRubroEmpleaCuentaContableBusqueda")) {
				this.jButtonid_empresaRubroEmpleaCuentaContableBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalRubroEmpleaCuentaContableUpdate")) {
				this.jButtonid_sucursalRubroEmpleaCuentaContableUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalRubroEmpleaCuentaContableBusqueda")) {
				this.jButtonid_sucursalRubroEmpleaCuentaContableBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_rubro_empleaRubroEmpleaCuentaContableUpdate")) {
				this.jButtonid_rubro_empleaRubroEmpleaCuentaContableUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_rubro_empleaRubroEmpleaCuentaContableBusqueda")) {
				this.jButtonid_rubro_empleaRubroEmpleaCuentaContableBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contableRubroEmpleaCuentaContableUpdate")) {
				this.jButtonid_cuenta_contableRubroEmpleaCuentaContableUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contableRubroEmpleaCuentaContableBusqueda")) {
				this.jButtonid_cuenta_contableRubroEmpleaCuentaContableBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraRubroEmpleaCuentaContableUpdate")) {
				this.jButtonid_estructuraRubroEmpleaCuentaContableUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraRubroEmpleaCuentaContableBusqueda")) {
				this.jButtonid_estructuraRubroEmpleaCuentaContableBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdCuentaContableRubroEmpleaCuentaContable")) {
				this.jButtonFK_IdCuentaContableRubroEmpleaCuentaContableActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEstructuraRubroEmpleaCuentaContable")) {
				this.jButtonFK_IdEstructuraRubroEmpleaCuentaContableActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdRubroEmpleaRubroEmpleaCuentaContable")) {
				this.jButtonFK_IdRubroEmpleaRubroEmpleaCuentaContableActionPerformed(evt);
			}
			
			;
			
			
			RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rubroempleacuentacontable,new Object(),this.rubroempleacuentacontableParameterGeneral,this.rubroempleacuentacontableReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessRubroEmpleaCuentaContable();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRubroEmpleaCuentaContableActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rubroempleacuentacontable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rubroempleacuentacontable);
				
				RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroempleacuentacontable,new Object(),this.rubroempleacuentacontableParameterGeneral,this.rubroempleacuentacontableReturnGeneral);
				
				


				
				RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroempleacuentacontable,new Object(),this.rubroempleacuentacontableParameterGeneral,this.rubroempleacuentacontableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RubroEmpleaCuentaContable.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RubroEmpleaCuentaContable.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			RubroEmpleaCuentaContable rubroempleacuentacontableLocal=null;
			
			if(!this.getEsControlTabla()) {
				rubroempleacuentacontableLocal=this.rubroempleacuentacontable;
			} else {
				rubroempleacuentacontableLocal=this.rubroempleacuentacontableAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rubroempleacuentacontable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rubroempleacuentacontable);
				
				RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroempleacuentacontable,new Object(),this.rubroempleacuentacontableParameterGeneral,this.rubroempleacuentacontableReturnGeneral);
							
				
				


				
				RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroempleacuentacontable,new Object(),this.rubroempleacuentacontableParameterGeneral,this.rubroempleacuentacontableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RubroEmpleaCuentaContable.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RubroEmpleaCuentaContable.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRubroEmpleaCuentaContableActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRubroEmpleaCuentaContable.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleacuentacontableAnterior =(RubroEmpleaCuentaContable) this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rubroempleacuentacontableAnterior =(RubroEmpleaCuentaContable) this.rubroempleacuentacontables.toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
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
			
			RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroempleacuentacontable,new Object(),this.rubroempleacuentacontableParameterGeneral,this.rubroempleacuentacontableReturnGeneral);
			
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
			
			


			
			RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroempleacuentacontable,new Object(),this.rubroempleacuentacontableParameterGeneral,this.rubroempleacuentacontableReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRubroEmpleaCuentaContableActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rubroempleacuentacontable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rubroempleacuentacontable);
				
				RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroempleacuentacontable,new Object(),this.rubroempleacuentacontableParameterGeneral,this.rubroempleacuentacontableReturnGeneral);
								
						
				


				
				RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroempleacuentacontable,new Object(),this.rubroempleacuentacontableParameterGeneral,this.rubroempleacuentacontableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RubroEmpleaCuentaContable.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RubroEmpleaCuentaContable.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rubroempleacuentacontable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rubroempleacuentacontable);
				
				RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroempleacuentacontable,new Object(),this.rubroempleacuentacontableParameterGeneral,this.rubroempleacuentacontableReturnGeneral);
								
				
				


				
				RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroempleacuentacontable,new Object(),this.rubroempleacuentacontableParameterGeneral,this.rubroempleacuentacontableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RubroEmpleaCuentaContable.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RubroEmpleaCuentaContable.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRubroEmpleaCuentaContableActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRubroEmpleaCuentaContable.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleacuentacontableAnterior =(RubroEmpleaCuentaContable) this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rubroempleacuentacontableAnterior =(RubroEmpleaCuentaContable) this.rubroempleacuentacontables.toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rubroempleacuentacontable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rubroempleacuentacontable);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRubroEmpleaCuentaContableActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRubroEmpleaCuentaContable.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleacuentacontableAnterior =(RubroEmpleaCuentaContable) this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rubroempleacuentacontableAnterior =(RubroEmpleaCuentaContable) this.rubroempleacuentacontables.toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRubroEmpleaCuentaContableActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.rubroempleacuentacontable);
			
			this.actualizarInformacion("INFO_PADRE",false,this.rubroempleacuentacontable);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rubroempleacuentacontable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rubroempleacuentacontable);
				
				RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroempleacuentacontable,new Object(),this.rubroempleacuentacontableParameterGeneral,this.rubroempleacuentacontableReturnGeneral);
							
				
				


				
				RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroempleacuentacontable,new Object(),this.rubroempleacuentacontableParameterGeneral,this.rubroempleacuentacontableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RubroEmpleaCuentaContable.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RubroEmpleaCuentaContable.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRubroEmpleaCuentaContableActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosRubroEmpleaCuentaContable.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rubroempleacuentacontableAnterior =(RubroEmpleaCuentaContable) this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.rubroempleacuentacontableAnterior =(RubroEmpleaCuentaContable) this.rubroempleacuentacontables.toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
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
			
			RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroempleacuentacontable,new Object(),this.rubroempleacuentacontableParameterGeneral,this.rubroempleacuentacontableReturnGeneral);
			
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
			
			


			
			RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroempleacuentacontable,new Object(),this.rubroempleacuentacontableParameterGeneral,this.rubroempleacuentacontableReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRubroEmpleaCuentaContableActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.rubroempleacuentacontable);
			
			this.actualizarInformacion("INFO_PADRE",false,this.rubroempleacuentacontable);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rubroempleacuentacontable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rubroempleacuentacontable);
				
				RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroempleacuentacontable,new Object(),this.rubroempleacuentacontableParameterGeneral,this.rubroempleacuentacontableReturnGeneral);
								
				
				


				
				RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroempleacuentacontable,new Object(),this.rubroempleacuentacontableParameterGeneral,this.rubroempleacuentacontableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RubroEmpleaCuentaContable.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RubroEmpleaCuentaContable.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRubroEmpleaCuentaContableActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRubroEmpleaCuentaContable.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleacuentacontableAnterior =(RubroEmpleaCuentaContable) this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rubroempleacuentacontableAnterior =(RubroEmpleaCuentaContable) this.rubroempleacuentacontables.toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRubroEmpleaCuentaContableActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.rubroempleacuentacontable);
			
			this.actualizarInformacion("INFO_PADRE",false,this.rubroempleacuentacontable);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRubroEmpleaCuentaContableActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rubroempleacuentacontable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rubroempleacuentacontable);
				
				RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rubroempleacuentacontable,new Object(),this.rubroempleacuentacontableParameterGeneral,this.rubroempleacuentacontableReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosRubroEmpleaCuentaContable")) {
					jCheckBoxSeleccionarTodosRubroEmpleaCuentaContableItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosRubroEmpleaCuentaContable")) {
					jCheckBoxSeleccionadosRubroEmpleaCuentaContableItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarRubroEmpleaCuentaContable")) {
					
				}
				
				


				
				
				RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rubroempleacuentacontable,new Object(),this.rubroempleacuentacontableParameterGeneral,this.rubroempleacuentacontableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RubroEmpleaCuentaContable.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RubroEmpleaCuentaContable.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.rubroempleacuentacontable);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.rubroempleacuentacontable);
				
				RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rubroempleacuentacontable,new Object(),this.rubroempleacuentacontableParameterGeneral,this.rubroempleacuentacontableReturnGeneral);
												
				
				


				
				
				RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rubroempleacuentacontable,new Object(),this.rubroempleacuentacontableParameterGeneral,this.rubroempleacuentacontableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RubroEmpleaCuentaContable.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RubroEmpleaCuentaContable.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRubroEmpleaCuentaContableActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosRubroEmpleaCuentaContable.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rubroempleacuentacontableAnterior =(RubroEmpleaCuentaContable) this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.rubroempleacuentacontableAnterior =(RubroEmpleaCuentaContable) this.rubroempleacuentacontables.toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRubroEmpleaCuentaContableActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rubroempleacuentacontable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rubroempleacuentacontable);
				
				RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rubroempleacuentacontable,new Object(),this.rubroempleacuentacontableParameterGeneral,this.rubroempleacuentacontableReturnGeneral);
				
				
				RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rubroempleacuentacontable,new Object(),this.rubroempleacuentacontableParameterGeneral,this.rubroempleacuentacontableReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
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
			
			RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.rubroempleacuentacontable,new Object(),this.rubroempleacuentacontableParameterGeneral,this.rubroempleacuentacontableReturnGeneral);
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
			
			


			
			RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroempleacuentacontable,new Object(),this.rubroempleacuentacontableParameterGeneral,this.rubroempleacuentacontableReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRubroEmpleaCuentaContableActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rubroempleacuentacontable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rubroempleacuentacontable);
				
				RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.rubroempleacuentacontable,new Object(),this.rubroempleacuentacontableParameterGeneral,this.rubroempleacuentacontableReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroempleacuentacontable,new Object(),this.rubroempleacuentacontableParameterGeneral,this.rubroempleacuentacontableReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RubroEmpleaCuentaContable.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RubroEmpleaCuentaContable.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rubroempleacuentacontable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rubroempleacuentacontable);
				
				RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.rubroempleacuentacontable,new Object(),this.rubroempleacuentacontableParameterGeneral,this.rubroempleacuentacontableReturnGeneral);
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
				
				


				
				RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroempleacuentacontable,new Object(),this.rubroempleacuentacontableParameterGeneral,this.rubroempleacuentacontableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RubroEmpleaCuentaContable.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RubroEmpleaCuentaContable.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRubroEmpleaCuentaContableActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRubroEmpleaCuentaContable.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubroempleacuentacontableAnterior =(RubroEmpleaCuentaContable) this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rubroempleacuentacontableAnterior =(RubroEmpleaCuentaContable) this.rubroempleacuentacontables.toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroempleacuentacontable,new Object(),this.rubroempleacuentacontableParameterGeneral,this.rubroempleacuentacontableReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarRubroEmpleaCuentaContable")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosRubroEmpleaCuentaContableListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosRubroEmpleaCuentaContable.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.rubroempleacuentacontable =(RubroEmpleaCuentaContable) this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.rubroempleacuentacontable =(RubroEmpleaCuentaContable) this.rubroempleacuentacontables.toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.rubroempleacuentacontable);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarRubroEmpleaCuentaContable")) {
				
				}
				
				RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubroempleacuentacontable,new Object(),this.rubroempleacuentacontableParameterGeneral,this.rubroempleacuentacontableReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.rubroempleacuentacontable,new Object(),this.rubroempleacuentacontableParameterGeneral,this.rubroempleacuentacontableReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarRubroEmpleaCuentaContable")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosRubroEmpleaCuentaContable.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarRubroEmpleaCuentaContable")) {
			
			}
			
			RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.rubroempleacuentacontable,new Object(),this.rubroempleacuentacontableParameterGeneral,this.rubroempleacuentacontableReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessRubroEmpleaCuentaContable();
			
			RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rubroempleacuentacontable,new Object(),this.rubroempleacuentacontableParameterGeneral,this.rubroempleacuentacontableReturnGeneral);
			
			if(sTipo.equals("NuevoRubroEmpleaCuentaContable")) {
				jButtonNuevoRubroEmpleaCuentaContableActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarRubroEmpleaCuentaContable")) {
				jButtonDuplicarRubroEmpleaCuentaContableActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarRubroEmpleaCuentaContable")) {
				jButtonCopiarRubroEmpleaCuentaContableActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormRubroEmpleaCuentaContable")) {
				jButtonVerFormRubroEmpleaCuentaContableActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesRubroEmpleaCuentaContable")) {
				jButtonNuevoRubroEmpleaCuentaContableActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarRubroEmpleaCuentaContable")) {
				jButtonModificarRubroEmpleaCuentaContableActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarRubroEmpleaCuentaContable")) {
				jButtonActualizarRubroEmpleaCuentaContableActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarRubroEmpleaCuentaContable")) {
				jButtonEliminarRubroEmpleaCuentaContableActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaRubroEmpleaCuentaContable")) {
				jButtonGuardarCambiosRubroEmpleaCuentaContableActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarRubroEmpleaCuentaContable")) {
				jButtonCancelarRubroEmpleaCuentaContableActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarRubroEmpleaCuentaContable")) {
				jButtonCerrarRubroEmpleaCuentaContableActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosRubroEmpleaCuentaContable")) {
				jButtonGuardarCambiosRubroEmpleaCuentaContableActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosRubroEmpleaCuentaContable")) {
				jButtonNuevoGuardarCambiosRubroEmpleaCuentaContableActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByRubroEmpleaCuentaContable")) {
				jButtonAbrirOrderByRubroEmpleaCuentaContableActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionRubroEmpleaCuentaContable")) {
				jButtonRecargarInformacionRubroEmpleaCuentaContableActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresRubroEmpleaCuentaContable")) {
				jButtonAnterioresRubroEmpleaCuentaContableActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesRubroEmpleaCuentaContable")) {
				jButtonSiguientesRubroEmpleaCuentaContableActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idRubroEmpleaCuentaContableBusqueda")) {
				this.jButtonidRubroEmpleaCuentaContableBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaRubroEmpleaCuentaContableUpdate")) {
				this.jButtonid_empresaRubroEmpleaCuentaContableUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaRubroEmpleaCuentaContableBusqueda")) {
				this.jButtonid_empresaRubroEmpleaCuentaContableBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalRubroEmpleaCuentaContableUpdate")) {
				this.jButtonid_sucursalRubroEmpleaCuentaContableUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalRubroEmpleaCuentaContableBusqueda")) {
				this.jButtonid_sucursalRubroEmpleaCuentaContableBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_rubro_empleaRubroEmpleaCuentaContableUpdate")) {
				this.jButtonid_rubro_empleaRubroEmpleaCuentaContableUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_rubro_empleaRubroEmpleaCuentaContableBusqueda")) {
				this.jButtonid_rubro_empleaRubroEmpleaCuentaContableBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contableRubroEmpleaCuentaContableUpdate")) {
				this.jButtonid_cuenta_contableRubroEmpleaCuentaContableUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contableRubroEmpleaCuentaContableBusqueda")) {
				this.jButtonid_cuenta_contableRubroEmpleaCuentaContableBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraRubroEmpleaCuentaContableUpdate")) {
				this.jButtonid_estructuraRubroEmpleaCuentaContableUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraRubroEmpleaCuentaContableBusqueda")) {
				this.jButtonid_estructuraRubroEmpleaCuentaContableBusquedaActionPerformed(evt);
			}
			
			RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rubroempleacuentacontable,new Object(),this.rubroempleacuentacontableParameterGeneral,this.rubroempleacuentacontableReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessRubroEmpleaCuentaContable();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.rubroempleacuentacontable,new Object(),this.rubroempleacuentacontableParameterGeneral,this.rubroempleacuentacontableReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameRubroEmpleaCuentaContable")) {
				closingInternalFrameRubroEmpleaCuentaContable();
				
			} else if(sTipo.equals("jButtonCancelarRubroEmpleaCuentaContable")) {
				JInternalFrameBase jInternalFrameDetalleFormRubroEmpleaCuentaContable = (JInternalFrameBase)evt.getSource();
	            	
	            RubroEmpleaCuentaContableBeanSwingJInternalFrame jInternalFrameParent=(RubroEmpleaCuentaContableBeanSwingJInternalFrame)jInternalFrameDetalleFormRubroEmpleaCuentaContable.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarRubroEmpleaCuentaContableActionPerformed(null);
			}
			
			RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.rubroempleacuentacontable,new Object(),this.rubroempleacuentacontableParameterGeneral,this.rubroempleacuentacontableReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormRubroEmpleaCuentaContable(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormRubroEmpleaCuentaContable(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormRubroEmpleaCuentaContable(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.rubroempleacuentacontable)) {
			if(!esControlTabla) {
				if(RubroEmpleaCuentaContableJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualRubroEmpleaCuentaContable(this.rubroempleacuentacontable,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysRubroEmpleaCuentaContable(this.rubroempleacuentacontable);			
				}
				
				if(this.rubroempleacuentacontableSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualRubroEmpleaCuentaContable(this.rubroempleacuentacontable,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.rubroempleacuentacontableReturnGeneral=rubroempleacuentacontableLogic.procesarEventosRubroEmpleaCuentaContablesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables(),this.rubroempleacuentacontable,this.rubroempleacuentacontableParameterGeneral,this.isEsNuevoRubroEmpleaCuentaContable,classes);//this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContable()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanRubroEmpleaCuentaContable(this.rubroempleacuentacontableReturnGeneral,this.rubroempleacuentacontableBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.rubroempleacuentacontableSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanRubroEmpleaCuentaContable(classes,this.rubroempleacuentacontableReturnGeneral,this.rubroempleacuentacontableBean,false);
					}
						
					if(this.rubroempleacuentacontableReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyRubroEmpleaCuentaContable(this.rubroempleacuentacontableReturnGeneral.getRubroEmpleaCuentaContable());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioRubroEmpleaCuentaContable(this.rubroempleacuentacontableReturnGeneral.getRubroEmpleaCuentaContable());	
					}
						
					if(this.rubroempleacuentacontableReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioRubroEmpleaCuentaContable(this.rubroempleacuentacontableReturnGeneral.getRubroEmpleaCuentaContable(),classes);//this.rubroempleacuentacontableBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioRubroEmpleaCuentaContable(this.rubroempleacuentacontable,classes);//this.rubroempleacuentacontableBean);									
				}
			
				if(RubroEmpleaCuentaContableJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualRubroEmpleaCuentaContable(this.rubroempleacuentacontable,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysRubroEmpleaCuentaContable(this.rubroempleacuentacontable);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.rubroempleacuentacontableAnterior!=null) {
						this.rubroempleacuentacontable=this.rubroempleacuentacontableAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.rubroempleacuentacontableReturnGeneral=rubroempleacuentacontableLogic.procesarEventosRubroEmpleaCuentaContablesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables(),this.rubroempleacuentacontable,this.rubroempleacuentacontableParameterGeneral,this.isEsNuevoRubroEmpleaCuentaContable,classes);//this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContable()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.rubroempleacuentacontableSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.rubroempleacuentacontableReturnGeneral.getRubroEmpleaCuentaContable(),rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.rubroempleacuentacontableReturnGeneral.getRubroEmpleaCuentaContable(),this.rubroempleacuentacontables);
				}
				//ARCHITECTURE
				
				//this.jTableDatosRubroEmpleaCuentaContable.repaint();
				
				//((AbstractTableModel) this.jTableDatosRubroEmpleaCuentaContable.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosRubroEmpleaCuentaContable();
			}
		}
	}
	
	public void actualizarVisualTableDatosRubroEmpleaCuentaContable() throws Exception {
		
		RubroEmpleaCuentaContableModel rubroempleacuentacontableModel=(RubroEmpleaCuentaContableModel)this.jTableDatosRubroEmpleaCuentaContable.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			rubroempleacuentacontableModel.rubroempleacuentacontables=this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			rubroempleacuentacontableModel.rubroempleacuentacontables=this.rubroempleacuentacontables;
		}
		
		
		((RubroEmpleaCuentaContableModel) this.jTableDatosRubroEmpleaCuentaContable.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaRubroEmpleaCuentaContable() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getrubroempleacuentacontableAnterior(),this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getrubroempleacuentacontableAnterior(),this.rubroempleacuentacontables);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosRubroEmpleaCuentaContable();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioRubroEmpleaCuentaContable(RubroEmpleaCuentaContable rubroempleacuentacontable,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
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
										
				RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.rubroempleacuentacontable,new Object(),generalEntityParameterGeneral,this.rubroempleacuentacontableReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.rubroempleacuentacontableSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=RubroEmpleaCuentaContableConstantesFunciones.getClassesRelationshipsOfRubroEmpleaCuentaContable(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=RubroEmpleaCuentaContableConstantesFunciones.getClassesRelationshipsFromStringsOfRubroEmpleaCuentaContable(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormRubroEmpleaCuentaContable(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.rubroempleacuentacontable,new Object(),generalEntityParameterGeneral,this.rubroempleacuentacontableReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioRubroEmpleaCuentaContable(RubroEmpleaCuentaContableBean rubroempleacuentacontableBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanRubroEmpleaCuentaContable(ArrayList<Classe> classes,RubroEmpleaCuentaContableReturnGeneral rubroempleacuentacontableReturnGeneral,RubroEmpleaCuentaContableBean rubroempleacuentacontableBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualRubroEmpleaCuentaContable(RubroEmpleaCuentaContable rubroempleacuentacontable,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.rubroempleacuentacontable)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable = new RubroEmpleaCuentaContableDetalleFormJInternalFrame(jDesktopPane,this.rubroempleacuentacontableSessionBean.getConGuardarRelaciones(),this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable);
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.setVisible(false);
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.setSelected(false);						
		
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.rubroempleacuentacontableLogic=this.rubroempleacuentacontableLogic;
		
		this.cargarCombosFrameForeignKeyRubroEmpleaCuentaContable("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleRubroEmpleaCuentaContable();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleRubroEmpleaCuentaContable();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyRubroEmpleaCuentaContable("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyRubroEmpleaCuentaContable();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarRubroEmpleaCuentaContable"));
		
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonModificarRubroEmpleaCuentaContable.addActionListener(new ButtonActionListener(this,"ModificarRubroEmpleaCuentaContable"));

		
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonModificarToolBarRubroEmpleaCuentaContable.addActionListener(new ButtonActionListener(this,"ModificarToolBarRubroEmpleaCuentaContable"));
					
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jMenuItemModificarRubroEmpleaCuentaContable.addActionListener(new ButtonActionListener(this,"MenuItemModificarRubroEmpleaCuentaContable"));		
		
		
		
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonActualizarRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"ActualizarRubroEmpleaCuentaContable"));
		
		
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonActualizarToolBarRubroEmpleaCuentaContable.addActionListener(new ButtonActionListener(this,"ActualizarToolBarRubroEmpleaCuentaContable"));
						
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jMenuItemActualizarRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"MenuItemActualizarRubroEmpleaCuentaContable"));		
		
		
		
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonEliminarRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"EliminarRubroEmpleaCuentaContable"));
		
		
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonEliminarToolBarRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"EliminarToolBarRubroEmpleaCuentaContable"));
								
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jMenuItemEliminarRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"MenuItemEliminarRubroEmpleaCuentaContable"));		
		
		
		
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonCancelarRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"CancelarRubroEmpleaCuentaContable"));
		
		
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonCancelarToolBarRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"CancelarToolBarRubroEmpleaCuentaContable"));
					
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jMenuItemCancelarRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"MenuItemCancelarRubroEmpleaCuentaContable"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jMenuItemDetalleCerrarRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarRubroEmpleaCuentaContable"));		
		
		
		
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonGuardarCambiosToolBarRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRubroEmpleaCuentaContable"));
		
		
		
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonGuardarCambiosToolBarRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRubroEmpleaCuentaContable"));
		
		
		
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxTiposAccionesFormularioRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioRubroEmpleaCuentaContable"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonidRubroEmpleaCuentaContableBusqueda.addActionListener(new ButtonActionListener(this,"idRubroEmpleaCuentaContableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonid_empresaRubroEmpleaCuentaContableUpdate.addActionListener(new ButtonActionListener(this,"id_empresaRubroEmpleaCuentaContableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonid_empresaRubroEmpleaCuentaContableBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaRubroEmpleaCuentaContableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonid_sucursalRubroEmpleaCuentaContableUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalRubroEmpleaCuentaContableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonid_sucursalRubroEmpleaCuentaContableBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalRubroEmpleaCuentaContableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonid_rubro_empleaRubroEmpleaCuentaContableUpdate.addActionListener(new ButtonActionListener(this,"id_rubro_empleaRubroEmpleaCuentaContableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonid_rubro_empleaRubroEmpleaCuentaContableBusqueda.addActionListener(new ButtonActionListener(this,"id_rubro_empleaRubroEmpleaCuentaContableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonid_cuenta_contableRubroEmpleaCuentaContableUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableRubroEmpleaCuentaContableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonid_cuenta_contableRubroEmpleaCuentaContableBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableRubroEmpleaCuentaContableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonid_estructuraRubroEmpleaCuentaContableUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraRubroEmpleaCuentaContableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonid_estructuraRubroEmpleaCuentaContableBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraRubroEmpleaCuentaContableBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jTabbedPaneRelacionesRubroEmpleaCuentaContable.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesRubroEmpleaCuentaContable"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameRubroEmpleaCuentaContable"));
		
		if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarRubroEmpleaCuentaContable"));
		}
		
		this.jTableDatosRubroEmpleaCuentaContable.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarRubroEmpleaCuentaContable"));
		
		this.jTableDatosRubroEmpleaCuentaContable.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarRubroEmpleaCuentaContable"));
		
		this.jButtonNuevoRubroEmpleaCuentaContable.addActionListener(new ButtonActionListener(this,"NuevoRubroEmpleaCuentaContable"));
		
		this.jButtonDuplicarRubroEmpleaCuentaContable.addActionListener(new ButtonActionListener(this,"DuplicarRubroEmpleaCuentaContable"));
		
		this.jButtonCopiarRubroEmpleaCuentaContable.addActionListener(new ButtonActionListener(this,"CopiarRubroEmpleaCuentaContable"));
		
		this.jButtonVerFormRubroEmpleaCuentaContable.addActionListener(new ButtonActionListener(this,"VerFormRubroEmpleaCuentaContable"));
		
		
		this.jButtonNuevoToolBarRubroEmpleaCuentaContable.addActionListener(new ButtonActionListener(this,"NuevoToolBarRubroEmpleaCuentaContable"));
			
		this.jButtonDuplicarToolBarRubroEmpleaCuentaContable.addActionListener(new ButtonActionListener(this,"DuplicarToolBarRubroEmpleaCuentaContable"));
			
		this.jMenuItemNuevoRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"MenuItemNuevoRubroEmpleaCuentaContable"));
			
		this.jMenuItemDuplicarRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarRubroEmpleaCuentaContable"));		
		
		
		this.jButtonNuevoRelacionesRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"NuevoRelacionesRubroEmpleaCuentaContable"));
		
		
		this.jButtonNuevoRelacionesToolBarRubroEmpleaCuentaContable.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarRubroEmpleaCuentaContable"));
			
		this.jMenuItemNuevoRelacionesRubroEmpleaCuentaContable.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesRubroEmpleaCuentaContable"));		
		
		
		if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonModificarRubroEmpleaCuentaContable.addActionListener(new ButtonActionListener(this,"ModificarRubroEmpleaCuentaContable"));
		}
		
		
		if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonModificarToolBarRubroEmpleaCuentaContable.addActionListener(new ButtonActionListener(this,"ModificarToolBarRubroEmpleaCuentaContable"));
			
			this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jMenuItemModificarRubroEmpleaCuentaContable.addActionListener(new ButtonActionListener(this,"MenuItemModificarRubroEmpleaCuentaContable"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonActualizarRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"ActualizarRubroEmpleaCuentaContable"));
		}
		
		
		if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonActualizarToolBarRubroEmpleaCuentaContable.addActionListener(new ButtonActionListener(this,"ActualizarToolBarRubroEmpleaCuentaContable"));
				
			this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jMenuItemActualizarRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"MenuItemActualizarRubroEmpleaCuentaContable"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonEliminarRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"EliminarRubroEmpleaCuentaContable"));
		}
		
		
		if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonEliminarToolBarRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"EliminarToolBarRubroEmpleaCuentaContable"));
						
			this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jMenuItemEliminarRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"MenuItemEliminarRubroEmpleaCuentaContable"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonCancelarRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"CancelarRubroEmpleaCuentaContable"));
		}
		
		
		if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonCancelarToolBarRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"CancelarToolBarRubroEmpleaCuentaContable"));
			
			this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jMenuItemCancelarRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"MenuItemCancelarRubroEmpleaCuentaContable"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarRubroEmpleaCuentaContable"));		
		
		
		this.jButtonCerrarRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"CerrarRubroEmpleaCuentaContable"));
		
		
		this.jButtonCerrarToolBarRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"CerrarToolBarRubroEmpleaCuentaContable"));
			
		this.jMenuItemCerrarRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"MenuItemCerrarRubroEmpleaCuentaContable"));
			
		if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jMenuItemDetalleCerrarRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarRubroEmpleaCuentaContable"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonGuardarCambiosRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"GuardarCambiosRubroEmpleaCuentaContable"));
		}
		
		
		if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonGuardarCambiosToolBarRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRubroEmpleaCuentaContable"));
		}
		
		this.jButtonCopiarToolBarRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"CopiarToolBarRubroEmpleaCuentaContable"));
			
		this.jButtonVerFormToolBarRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"VerFormToolBarRubroEmpleaCuentaContable"));
		
		this.jMenuItemGuardarCambiosRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosRubroEmpleaCuentaContable"));
			
		this.jMenuItemCopiarRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"MenuItemCopiarRubroEmpleaCuentaContable"));		
		
		this.jMenuItemVerFormRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"MenuItemVerFormRubroEmpleaCuentaContable"));		
		
		
		this.jButtonGuardarCambiosTablaRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaRubroEmpleaCuentaContable"));
		
		
		this.jButtonGuardarCambiosTablaToolBarRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarRubroEmpleaCuentaContable"));
			
		this.jMenuItemGuardarCambiosTablaRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaRubroEmpleaCuentaContable"));		
		
		
		
		this.jButtonRecargarInformacionRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"RecargarInformacionRubroEmpleaCuentaContable"));
					
		this.jButtonRecargarInformacionToolBarRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarRubroEmpleaCuentaContable"));
		
		this.jMenuItemRecargarInformacionRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionRubroEmpleaCuentaContable"));		
		
		
		
		this.jButtonAnterioresRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"AnterioresRubroEmpleaCuentaContable"));
		
		
		this.jButtonAnterioresToolBarRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"AnterioresToolBarRubroEmpleaCuentaContable"));
		
		this.jMenuItemAnterioresRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresRubroEmpleaCuentaContable"));		
		
		
		this.jButtonSiguientesRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"SiguientesRubroEmpleaCuentaContable"));
		
		
		this.jButtonSiguientesToolBarRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"SiguientesToolBarRubroEmpleaCuentaContable"));
			
		this.jMenuItemSiguientesRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesRubroEmpleaCuentaContable"));
			
		this.jMenuItemAbrirOrderByRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByRubroEmpleaCuentaContable"));
			
		this.jMenuItemMostrarOcultarRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarRubroEmpleaCuentaContable"));
			
		this.jMenuItemDetalleAbrirOrderByRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByRubroEmpleaCuentaContable"));
			
		this.jMenuItemDetalleMostarOcultarRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarRubroEmpleaCuentaContable"));		
		
		
		this.jButtonNuevoGuardarCambiosRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosRubroEmpleaCuentaContable"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarRubroEmpleaCuentaContable"));
			
		this.jMenuItemNuevoGuardarCambiosRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosRubroEmpleaCuentaContable"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosRubroEmpleaCuentaContable.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosRubroEmpleaCuentaContable"));

		this.jCheckBoxSeleccionadosRubroEmpleaCuentaContable.addItemListener(new CheckBoxItemListener(this,"SeleccionadosRubroEmpleaCuentaContable"));
		
		if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxTiposAccionesFormularioRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioRubroEmpleaCuentaContable"));
		}
		
		
		this.jComboBoxTiposRelacionesRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"TiposRelacionesRubroEmpleaCuentaContable"));
			
		this.jComboBoxTiposAccionesRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"TiposAccionesRubroEmpleaCuentaContable"));
					
		this.jComboBoxTiposSeleccionarRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"TiposSeleccionarRubroEmpleaCuentaContable"));
			
		this.jTextFieldValorCampoGeneralRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralRubroEmpleaCuentaContable"));		
		
		
		if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonidRubroEmpleaCuentaContableBusqueda.addActionListener(new ButtonActionListener(this,"idRubroEmpleaCuentaContableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonid_empresaRubroEmpleaCuentaContableUpdate.addActionListener(new ButtonActionListener(this,"id_empresaRubroEmpleaCuentaContableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonid_empresaRubroEmpleaCuentaContableBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaRubroEmpleaCuentaContableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonid_sucursalRubroEmpleaCuentaContableUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalRubroEmpleaCuentaContableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonid_sucursalRubroEmpleaCuentaContableBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalRubroEmpleaCuentaContableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonid_rubro_empleaRubroEmpleaCuentaContableUpdate.addActionListener(new ButtonActionListener(this,"id_rubro_empleaRubroEmpleaCuentaContableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonid_rubro_empleaRubroEmpleaCuentaContableBusqueda.addActionListener(new ButtonActionListener(this,"id_rubro_empleaRubroEmpleaCuentaContableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonid_cuenta_contableRubroEmpleaCuentaContableUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableRubroEmpleaCuentaContableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonid_cuenta_contableRubroEmpleaCuentaContableBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableRubroEmpleaCuentaContableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonid_estructuraRubroEmpleaCuentaContableUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraRubroEmpleaCuentaContableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonid_estructuraRubroEmpleaCuentaContableBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraRubroEmpleaCuentaContableBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdCuentaContableRubroEmpleaCuentaContable.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableRubroEmpleaCuentaContable"));

			this.jButtonFK_IdEstructuraRubroEmpleaCuentaContable.addActionListener(new ButtonActionListener(this,"FK_IdEstructuraRubroEmpleaCuentaContable"));

			this.jButtonFK_IdRubroEmpleaRubroEmpleaCuentaContable.addActionListener(new ButtonActionListener(this,"FK_IdRubroEmpleaRubroEmpleaCuentaContable"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable!=null) {
				this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRubroEmpleaCuentaContable"));
				this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRubroEmpleaCuentaContable"));
				this.jInternalFrameReporteDinamicoRubroEmpleaCuentaContable.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRubroEmpleaCuentaContable"));
			}
			
			//this.jButtonCerrarReporteDinamicoRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRubroEmpleaCuentaContable"));				
			//this.jButtonGenerarReporteDinamicoRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRubroEmpleaCuentaContable"));
			//this.jButtonGenerarExcelReporteDinamicoRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRubroEmpleaCuentaContable"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionRubroEmpleaCuentaContable!=null) {
				this.jInternalFrameImportacionRubroEmpleaCuentaContable.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionRubroEmpleaCuentaContable"));
				this.jInternalFrameImportacionRubroEmpleaCuentaContable.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionRubroEmpleaCuentaContable"));
				this.jInternalFrameImportacionRubroEmpleaCuentaContable.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionRubroEmpleaCuentaContable"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"AbrirOrderByRubroEmpleaCuentaContable"));
			
			this.jButtonAbrirOrderByToolBarRubroEmpleaCuentaContable.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarRubroEmpleaCuentaContable"));			
			
			if(this.jInternalFrameOrderByRubroEmpleaCuentaContable!=null) {
				this.jInternalFrameOrderByRubroEmpleaCuentaContable.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByRubroEmpleaCuentaContable"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jTabbedPaneRelacionesRubroEmpleaCuentaContable.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesRubroEmpleaCuentaContable"));
		
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
            		closingInternalFrameRubroEmpleaCuentaContable();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormRubroEmpleaCuentaContable = (JInternalFrameBase)event.getSource();
	            	
	            RubroEmpleaCuentaContableBeanSwingJInternalFrame jInternalFrameParent=(RubroEmpleaCuentaContableBeanSwingJInternalFrame)jInternalFrameDetalleFormRubroEmpleaCuentaContable.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarRubroEmpleaCuentaContableActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosRubroEmpleaCuentaContable.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosRubroEmpleaCuentaContableListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosRubroEmpleaCuentaContable.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosRubroEmpleaCuentaContable.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoRubroEmpleaCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRubroEmpleaCuentaContableActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarRubroEmpleaCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRubroEmpleaCuentaContableActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRubroEmpleaCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRubroEmpleaCuentaContableActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRubroEmpleaCuentaContable";
		inputMap = this.jButtonNuevoRubroEmpleaCuentaContable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRubroEmpleaCuentaContable.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoRubroEmpleaCuentaContableActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesRubroEmpleaCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRubroEmpleaCuentaContableActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarRubroEmpleaCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRubroEmpleaCuentaContableActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesRubroEmpleaCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRubroEmpleaCuentaContableActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesRubroEmpleaCuentaContable";
		inputMap = this.jButtonNuevoRelacionesRubroEmpleaCuentaContable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesRubroEmpleaCuentaContable.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoRubroEmpleaCuentaContableActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarRubroEmpleaCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRubroEmpleaCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarRubroEmpleaCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRubroEmpleaCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarRubroEmpleaCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRubroEmpleaCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarRubroEmpleaCuentaContable";
		inputMap = this.jButtonModificarRubroEmpleaCuentaContable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarRubroEmpleaCuentaContable.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarRubroEmpleaCuentaContableActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarRubroEmpleaCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRubroEmpleaCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarRubroEmpleaCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRubroEmpleaCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarRubroEmpleaCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRubroEmpleaCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarRubroEmpleaCuentaContable";
		inputMap = this.jButtonActualizarRubroEmpleaCuentaContable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarRubroEmpleaCuentaContable.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarRubroEmpleaCuentaContableActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarRubroEmpleaCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRubroEmpleaCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarRubroEmpleaCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRubroEmpleaCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarRubroEmpleaCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRubroEmpleaCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarRubroEmpleaCuentaContable";
		inputMap = this.jButtonEliminarRubroEmpleaCuentaContable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarRubroEmpleaCuentaContable.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarRubroEmpleaCuentaContableActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarRubroEmpleaCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRubroEmpleaCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarRubroEmpleaCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRubroEmpleaCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarRubroEmpleaCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRubroEmpleaCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarRubroEmpleaCuentaContable";
		inputMap = this.jButtonCancelarRubroEmpleaCuentaContable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarRubroEmpleaCuentaContable.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarRubroEmpleaCuentaContableActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarRubroEmpleaCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRubroEmpleaCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarRubroEmpleaCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRubroEmpleaCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarRubroEmpleaCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRubroEmpleaCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarRubroEmpleaCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarRubroEmpleaCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarRubroEmpleaCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarRubroEmpleaCuentaContable";
		inputMap = this.jButtonCerrarRubroEmpleaCuentaContable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarRubroEmpleaCuentaContable.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarRubroEmpleaCuentaContableActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonGuardarCambiosRubroEmpleaCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRubroEmpleaCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarRubroEmpleaCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRubroEmpleaCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosRubroEmpleaCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRubroEmpleaCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaRubroEmpleaCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRubroEmpleaCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarRubroEmpleaCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRubroEmpleaCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaRubroEmpleaCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRubroEmpleaCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosRubroEmpleaCuentaContable";
		inputMap = this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonGuardarCambiosRubroEmpleaCuentaContable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonGuardarCambiosRubroEmpleaCuentaContable.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosRubroEmpleaCuentaContableActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionRubroEmpleaCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRubroEmpleaCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarRubroEmpleaCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRubroEmpleaCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionRubroEmpleaCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRubroEmpleaCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresRubroEmpleaCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRubroEmpleaCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarRubroEmpleaCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRubroEmpleaCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresRubroEmpleaCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRubroEmpleaCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesRubroEmpleaCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRubroEmpleaCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarRubroEmpleaCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRubroEmpleaCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesRubroEmpleaCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRubroEmpleaCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosRubroEmpleaCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRubroEmpleaCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarRubroEmpleaCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRubroEmpleaCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosRubroEmpleaCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRubroEmpleaCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosRubroEmpleaCuentaContable.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosRubroEmpleaCuentaContableItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesRubroEmpleaCuentaContable.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesRubroEmpleaCuentaContableActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarRubroEmpleaCuentaContable.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarRubroEmpleaCuentaContableActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralRubroEmpleaCuentaContable.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralRubroEmpleaCuentaContableActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonidRubroEmpleaCuentaContableBusqueda.addActionListener(new ButtonActionListener(this,"idRubroEmpleaCuentaContableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonid_empresaRubroEmpleaCuentaContableUpdate.addActionListener(new ButtonActionListener(this,"id_empresaRubroEmpleaCuentaContableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonid_empresaRubroEmpleaCuentaContableBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaRubroEmpleaCuentaContableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonid_sucursalRubroEmpleaCuentaContableUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalRubroEmpleaCuentaContableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonid_sucursalRubroEmpleaCuentaContableBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalRubroEmpleaCuentaContableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonid_rubro_empleaRubroEmpleaCuentaContableUpdate.addActionListener(new ButtonActionListener(this,"id_rubro_empleaRubroEmpleaCuentaContableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonid_rubro_empleaRubroEmpleaCuentaContableBusqueda.addActionListener(new ButtonActionListener(this,"id_rubro_empleaRubroEmpleaCuentaContableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonid_cuenta_contableRubroEmpleaCuentaContableUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableRubroEmpleaCuentaContableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonid_cuenta_contableRubroEmpleaCuentaContableBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableRubroEmpleaCuentaContableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonid_estructuraRubroEmpleaCuentaContableUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraRubroEmpleaCuentaContableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jButtonid_estructuraRubroEmpleaCuentaContableBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraRubroEmpleaCuentaContableBusqueda"));
		
		
		this.jButtonFK_IdCuentaContableRubroEmpleaCuentaContable.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableRubroEmpleaCuentaContable"));

		this.jButtonFK_IdEstructuraRubroEmpleaCuentaContable.addActionListener(new ButtonActionListener(this,"FK_IdEstructuraRubroEmpleaCuentaContable"));

		this.jButtonFK_IdRubroEmpleaRubroEmpleaCuentaContable.addActionListener(new ButtonActionListener(this,"FK_IdRubroEmpleaRubroEmpleaCuentaContable"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoRubroEmpleaCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoRubroEmpleaCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoRubroEmpleaCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoRubroEmpleaCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoRubroEmpleaCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoRubroEmpleaCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionRubroEmpleaCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionRubroEmpleaCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionRubroEmpleaCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionRubroEmpleaCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionRubroEmpleaCuentaContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionRubroEmpleaCuentaContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarRubroEmpleaCuentaContableActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarRubroEmpleaCuentaContable.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosRubroEmpleaCuentaContable(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(RubroEmpleaCuentaContable rubroempleacuentacontableAux:this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables()) {
					rubroempleacuentacontableAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RubroEmpleaCuentaContable rubroempleacuentacontableAux:rubroempleacuentacontables) {
					rubroempleacuentacontableAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosRubroEmpleaCuentaContableItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingRubroEmpleaCuentaContable(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(RubroEmpleaCuentaContable rubroempleacuentacontableAux:this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables()) {
						rubroempleacuentacontableAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(RubroEmpleaCuentaContable rubroempleacuentacontableAux:rubroempleacuentacontables) {
						rubroempleacuentacontableAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(RubroEmpleaCuentaContable rubroempleacuentacontableAux:this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(RubroEmpleaCuentaContable rubroempleacuentacontableAux:rubroempleacuentacontables) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaRubroEmpleaCuentaContable(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosRubroEmpleaCuentaContable.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosRubroEmpleaCuentaContable.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosRubroEmpleaCuentaContable,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosRubroEmpleaCuentaContableItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingRubroEmpleaCuentaContable(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosRubroEmpleaCuentaContable.getSelectedRows();
			
			RubroEmpleaCuentaContable rubroempleacuentacontableLocal=new RubroEmpleaCuentaContable();
			
			//this.seleccionarTodosRubroEmpleaCuentaContable(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					rubroempleacuentacontableLocal =(RubroEmpleaCuentaContable) this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables().toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					rubroempleacuentacontableLocal =(RubroEmpleaCuentaContable) this.rubroempleacuentacontables.toArray()[this.jTableDatosRubroEmpleaCuentaContable.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				rubroempleacuentacontableLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(RubroEmpleaCuentaContable rubroempleacuentacontableAux:this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables()) {
						rubroempleacuentacontableAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(RubroEmpleaCuentaContable rubroempleacuentacontableAux:rubroempleacuentacontables) {
						rubroempleacuentacontableAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaRubroEmpleaCuentaContable(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosRubroEmpleaCuentaContable.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosRubroEmpleaCuentaContable.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosRubroEmpleaCuentaContable,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualRubroEmpleaCuentaContableItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarRubroEmpleaCuentaContableParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralRubroEmpleaCuentaContableActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingRubroEmpleaCuentaContable(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralRubroEmpleaCuentaContable.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(RubroEmpleaCuentaContable rubroempleacuentacontableAux:this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables()) {
				
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RubroEmpleaCuentaContable rubroempleacuentacontableAux:rubroempleacuentacontables) {
					
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaRubroEmpleaCuentaContable(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesRubroEmpleaCuentaContableActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingRubroEmpleaCuentaContable(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioRubroEmpleaCuentaContable=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesRubroEmpleaCuentaContable.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxTiposAccionesFormularioRubroEmpleaCuentaContable.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteRubroEmpleaCuentaContable) {				
					conSplash=true;//false;										
					
					//this.startProcessRubroEmpleaCuentaContable(conSplash);
				
					this.generarReporteRubroEmpleaCuentaContablesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRubroEmpleaCuentaContable.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxTiposAccionesFormularioRubroEmpleaCuentaContable.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoRubroEmpleaCuentaContablesSeleccionados();
				//this.jComboBoxTiposAccionesRubroEmpleaCuentaContable.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoRubroEmpleaCuentaContablesSeleccionados(false);
				//this.jComboBoxTiposAccionesRubroEmpleaCuentaContable.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoRubroEmpleaCuentaContablesSeleccionados(true);
				//this.jComboBoxTiposAccionesRubroEmpleaCuentaContable.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessRubroEmpleaCuentaContable();
				
				this.exportarRubroEmpleaCuentaContablesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRubroEmpleaCuentaContable.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxTiposAccionesFormularioRubroEmpleaCuentaContable.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionRubroEmpleaCuentaContables();
				//this.importarRubroEmpleaCuentaContables();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRubroEmpleaCuentaContable.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxTiposAccionesFormularioRubroEmpleaCuentaContable.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessRubroEmpleaCuentaContable();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelRubroEmpleaCuentaContablesSeleccionados();
				//this.jComboBoxTiposAccionesRubroEmpleaCuentaContable.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Rubro Emplea Cuenta Contable", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessRubroEmpleaCuentaContable();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoRubroEmpleaCuentaContable)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyRubroEmpleaCuentaContable(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Rubro Emplea Cuenta Contable",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRubroEmpleaCuentaContable.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxTiposAccionesFormularioRubroEmpleaCuentaContable.setSelectedIndex(0);					
				}	
			} 			
			else if(RubroEmpleaCuentaContableBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteRubroEmpleaCuentaContable) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessRubroEmpleaCuentaContable(conSplash);
					
						//this.actualizarParametrosGeneralRubroEmpleaCuentaContable();
						
						this.generarReporteProcesoAccionRubroEmpleaCuentaContablesSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesRubroEmpleaCuentaContable.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxTiposAccionesFormularioRubroEmpleaCuentaContable.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Rubro Emplea Cuenta ContableS SELECCIONADOS?", "MANTENIMIENTO DE Rubro Emplea Cuenta Contable", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessRubroEmpleaCuentaContable();
				
						this.actualizarParametrosGeneralRubroEmpleaCuentaContable();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.rubroempleacuentacontableReturnGeneral=rubroempleacuentacontableLogic.procesarAccionRubroEmpleaCuentaContablesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables(),this.rubroempleacuentacontableParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarRubroEmpleaCuentaContableReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesRubroEmpleaCuentaContable.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxTiposAccionesFormularioRubroEmpleaCuentaContable.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralRubroEmpleaCuentaContable();
					
					RubroEmpleaCuentaContableBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarRubroEmpleaCuentaContableReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesRubroEmpleaCuentaContable.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxTiposAccionesFormularioRubroEmpleaCuentaContable.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessRubroEmpleaCuentaContable(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesRubroEmpleaCuentaContableActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessRubroEmpleaCuentaContable();
			
			if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<RubroEmpleaCuentaContable> rubroempleacuentacontablesSeleccionados=new ArrayList<RubroEmpleaCuentaContable>();		
			RubroEmpleaCuentaContable rubroempleacuentacontable=new RubroEmpleaCuentaContable();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingRubroEmpleaCuentaContable(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesRubroEmpleaCuentaContable.getSelectedItem();
			
			
			
			
			rubroempleacuentacontablesSeleccionados=this.getRubroEmpleaCuentaContablesSeleccionados(true);
			//this.sTipoAccion;
			
			if(rubroempleacuentacontablesSeleccionados.size()==1) {
				for(RubroEmpleaCuentaContable rubroempleacuentacontableAux:rubroempleacuentacontablesSeleccionados) {
					rubroempleacuentacontable=rubroempleacuentacontableAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessRubroEmpleaCuentaContable();
			
      		//this.finishProcessRubroEmpleaCuentaContable(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarRubroEmpleaCuentaContableReturnGeneral() throws Exception {
		if(this.rubroempleacuentacontableReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.rubroempleacuentacontableReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.rubroempleacuentacontableReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.rubroempleacuentacontableReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.rubroempleacuentacontableReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.rubroempleacuentacontableReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingRubroEmpleaCuentaContable(false);
		}
		
		if(this.rubroempleacuentacontableReturnGeneral.getConRetornoLista() || this.rubroempleacuentacontableReturnGeneral.getConRetornoObjeto()) {
			if(this.rubroempleacuentacontableReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.rubroempleacuentacontableLogic.setRubroEmpleaCuentaContables(this.rubroempleacuentacontableReturnGeneral.getRubroEmpleaCuentaContables());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.rubroempleacuentacontableReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.rubroempleacuentacontableLogic.setRubroEmpleaCuentaContable(this.rubroempleacuentacontableReturnGeneral.getRubroEmpleaCuentaContable());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingRubroEmpleaCuentaContable(false);
		}
	}
	
	public void actualizarParametrosGeneralRubroEmpleaCuentaContable() throws Exception {
		
		
	}
	
	public ArrayList<RubroEmpleaCuentaContable> getRubroEmpleaCuentaContablesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<RubroEmpleaCuentaContable> rubroempleacuentacontablesSeleccionados=new ArrayList<RubroEmpleaCuentaContable>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioRubroEmpleaCuentaContable) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(RubroEmpleaCuentaContable rubroempleacuentacontableAux:rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables()) {
					if(rubroempleacuentacontableAux.getIsSelected()) {
						rubroempleacuentacontablesSeleccionados.add(rubroempleacuentacontableAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RubroEmpleaCuentaContable rubroempleacuentacontableAux:this.rubroempleacuentacontables) {
					if(rubroempleacuentacontableAux.getIsSelected()) {
						rubroempleacuentacontablesSeleccionados.add(rubroempleacuentacontableAux);				
					}
				}
			}
			
			if(rubroempleacuentacontablesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						rubroempleacuentacontablesSeleccionados.addAll(this.rubroempleacuentacontableLogic.getRubroEmpleaCuentaContables());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						rubroempleacuentacontablesSeleccionados.addAll(this.rubroempleacuentacontables);				
					}
				}
			}
		} else {
			rubroempleacuentacontablesSeleccionados.add(this.rubroempleacuentacontable);
		}
		
		return rubroempleacuentacontablesSeleccionados;
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
	
	public void generarReporteRubroEmpleaCuentaContablesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalRubroEmpleaCuentaContablesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoRubroEmpleaCuentaContablesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoRubroEmpleaCuentaContablesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoRubroEmpleaCuentaContablesSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Rubro Emplea Cuenta Contable",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesRubroEmpleaCuentaContablesSeleccionados() throws Exception {
		ArrayList<RubroEmpleaCuentaContable> rubroempleacuentacontablesSeleccionados=new ArrayList<RubroEmpleaCuentaContable>();		
		
		rubroempleacuentacontablesSeleccionados=this.getRubroEmpleaCuentaContablesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteRubroEmpleaCuentaContables("Todos",rubroempleacuentacontablesSeleccionados);
		
	}	
	
	public void generarReporteNormalRubroEmpleaCuentaContablesSeleccionados() throws Exception {
		ArrayList<RubroEmpleaCuentaContable> rubroempleacuentacontablesSeleccionados=new ArrayList<RubroEmpleaCuentaContable>();		
		
		rubroempleacuentacontablesSeleccionados=this.getRubroEmpleaCuentaContablesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteRubroEmpleaCuentaContables("Todos",rubroempleacuentacontablesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionRubroEmpleaCuentaContablesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<RubroEmpleaCuentaContable> rubroempleacuentacontablesSeleccionados=new ArrayList<RubroEmpleaCuentaContable>();
		
		rubroempleacuentacontablesSeleccionados=this.getRubroEmpleaCuentaContablesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteRubroEmpleaCuentaContables("Todos",rubroempleacuentacontablesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoRubroEmpleaCuentaContablesSeleccionados() throws Exception {
		ArrayList<RubroEmpleaCuentaContable> rubroempleacuentacontablesSeleccionados=new ArrayList<RubroEmpleaCuentaContable>();		
		
		
		this.abrirInicializarFrameReporteDinamicoRubroEmpleaCuentaContable();
		
		
		rubroempleacuentacontablesSeleccionados=this.getRubroEmpleaCuentaContablesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoRubroEmpleaCuentaContable();
		
		
		//this.generarReporteRubroEmpleaCuentaContables("Todos",rubroempleacuentacontablesSeleccionados ,rubroempleacuentacontableImplementable,rubroempleacuentacontableImplementableHome);
	}
	
	public void mostrarImportacionRubroEmpleaCuentaContables() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionRubroEmpleaCuentaContable();
		
		this.abrirFrameImportacionRubroEmpleaCuentaContable();		
		
			
		//this.generarReporteRubroEmpleaCuentaContables("Todos",rubroempleacuentacontablesSeleccionados ,rubroempleacuentacontableImplementable,rubroempleacuentacontableImplementableHome);
	}
	
	public void importarRubroEmpleaCuentaContables() throws Exception {		
	
	}
	
	public void exportarRubroEmpleaCuentaContablesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelRubroEmpleaCuentaContablesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoRubroEmpleaCuentaContablesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlRubroEmpleaCuentaContablesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Rubro Emplea Cuenta Contable",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoRubroEmpleaCuentaContablesSeleccionados() throws Exception {
		ArrayList<RubroEmpleaCuentaContable> rubroempleacuentacontablesSeleccionados=new ArrayList<RubroEmpleaCuentaContable>();		
		
		rubroempleacuentacontablesSeleccionados=this.getRubroEmpleaCuentaContablesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"rubroempleacuentacontable."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarRubroEmpleaCuentaContable(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(RubroEmpleaCuentaContable rubroempleacuentacontableAux:rubroempleacuentacontablesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarRubroEmpleaCuentaContable(rubroempleacuentacontableAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//rubroempleacuentacontableAux.setsDetalleGeneralEntityReporte(rubroempleacuentacontableAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Rubro Emplea Cuenta Contable",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarRubroEmpleaCuentaContable(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=RubroEmpleaCuentaContableConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RubroEmpleaCuentaContableConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDRUBROEMPLEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDCUENTACONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDESTRUCTURA;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarRubroEmpleaCuentaContable(RubroEmpleaCuentaContable rubroempleacuentacontable,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=rubroempleacuentacontable.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=rubroempleacuentacontable.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=rubroempleacuentacontable.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=rubroempleacuentacontable.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=rubroempleacuentacontable.getrubroemplea_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=rubroempleacuentacontable.getcuentacontable_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=rubroempleacuentacontable.getestructura_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelRubroEmpleaCuentaContablesSeleccionados() throws Exception {
		ArrayList<RubroEmpleaCuentaContable> rubroempleacuentacontablesSeleccionados=new ArrayList<RubroEmpleaCuentaContable>();		
		
		rubroempleacuentacontablesSeleccionados=this.getRubroEmpleaCuentaContablesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"rubroempleacuentacontable.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("RubroEmpleaCuentaContables");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelRubroEmpleaCuentaContable(row);				
				iRow++;
			}				
			
			for(RubroEmpleaCuentaContable rubroempleacuentacontableAux:rubroempleacuentacontablesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelRubroEmpleaCuentaContable(rubroempleacuentacontableAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Rubro Emplea Cuenta Contable",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlRubroEmpleaCuentaContablesSeleccionados() throws Exception {
		ArrayList<RubroEmpleaCuentaContable> rubroempleacuentacontablesSeleccionados=new ArrayList<RubroEmpleaCuentaContable>();		
		
		rubroempleacuentacontablesSeleccionados=this.getRubroEmpleaCuentaContablesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"rubroempleacuentacontable.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("rubroempleacuentacontables");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("rubroempleacuentacontable");
			//elementRoot.appendChild(element);
		
			for(RubroEmpleaCuentaContable rubroempleacuentacontableAux:rubroempleacuentacontablesSeleccionados) {
				element = document.createElement("rubroempleacuentacontable");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlRubroEmpleaCuentaContable(rubroempleacuentacontableAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Rubro Emplea Cuenta Contable",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelRubroEmpleaCuentaContable(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(RubroEmpleaCuentaContableConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(RubroEmpleaCuentaContableConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDRUBROEMPLEA);
		cell = row.createCell(iColumn++);cell.setCellValue(RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDCUENTACONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDESTRUCTURA);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelRubroEmpleaCuentaContable(RubroEmpleaCuentaContable rubroempleacuentacontable,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(rubroempleacuentacontable.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(rubroempleacuentacontable.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(rubroempleacuentacontable.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(rubroempleacuentacontable.getrubroemplea_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(rubroempleacuentacontable.getcuentacontable_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(rubroempleacuentacontable.getestructura_descripcion());				
	}
	
	public void setFilaDatosExportarXmlRubroEmpleaCuentaContable(RubroEmpleaCuentaContable rubroempleacuentacontable,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(RubroEmpleaCuentaContableConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(rubroempleacuentacontable.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(RubroEmpleaCuentaContableConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(rubroempleacuentacontable.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(RubroEmpleaCuentaContableConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(rubroempleacuentacontable.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(RubroEmpleaCuentaContableConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(rubroempleacuentacontable.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementrubroemplea_descripcion = document.createElement(RubroEmpleaCuentaContableConstantesFunciones.IDRUBROEMPLEA);
		elementrubroemplea_descripcion.appendChild(document.createTextNode(rubroempleacuentacontable.getrubroemplea_descripcion()));
		element.appendChild(elementrubroemplea_descripcion);

		Element elementcuentacontable_descripcion = document.createElement(RubroEmpleaCuentaContableConstantesFunciones.IDCUENTACONTABLE);
		elementcuentacontable_descripcion.appendChild(document.createTextNode(rubroempleacuentacontable.getcuentacontable_descripcion()));
		element.appendChild(elementcuentacontable_descripcion);

		Element elementestructura_descripcion = document.createElement(RubroEmpleaCuentaContableConstantesFunciones.IDESTRUCTURA);
		elementestructura_descripcion.appendChild(document.createTextNode(rubroempleacuentacontable.getestructura_descripcion()));
		element.appendChild(elementestructura_descripcion);
	}
	
	public void generarReporteGroupGenericoRubroEmpleaCuentaContablesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<RubroEmpleaCuentaContable> rubroempleacuentacontablesSeleccionados=new ArrayList<RubroEmpleaCuentaContable>();
		
		rubroempleacuentacontablesSeleccionados=this.getRubroEmpleaCuentaContablesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoRubroEmpleaCuentaContable(rubroempleacuentacontablesSeleccionados);
		
		this.generarReporteRubroEmpleaCuentaContables("Todos",rubroempleacuentacontablesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoRubroEmpleaCuentaContable(ArrayList<RubroEmpleaCuentaContable> rubroempleacuentacontablesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(RubroEmpleaCuentaContable rubroempleacuentacontableAux:rubroempleacuentacontablesSeleccionados) {
				rubroempleacuentacontableAux.setsDetalleGeneralEntityReporte(rubroempleacuentacontableAux.toString());
			
				if(sTipoSeleccionar.equals(RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					rubroempleacuentacontableAux.setsDescripcionGeneralEntityReporte1(rubroempleacuentacontableAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					rubroempleacuentacontableAux.setsDescripcionGeneralEntityReporte1(rubroempleacuentacontableAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDRUBROEMPLEA)) {
					existe=true;
					rubroempleacuentacontableAux.setsDescripcionGeneralEntityReporte1(rubroempleacuentacontableAux.getrubroemplea_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDCUENTACONTABLE)) {
					existe=true;
					rubroempleacuentacontableAux.setsDescripcionGeneralEntityReporte1(rubroempleacuentacontableAux.getcuentacontable_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RubroEmpleaCuentaContableConstantesFunciones.LABEL_IDESTRUCTURA)) {
					existe=true;
					rubroempleacuentacontableAux.setsDescripcionGeneralEntityReporte1(rubroempleacuentacontableAux.getestructura_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubroEmpleaCuentaContableConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesRubroEmpleaCuentaContable(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoRubroEmpleaCuentaContable=true;
				this.isVisibilidadCeldaNuevoRelacionesRubroEmpleaCuentaContable=true;
				this.isVisibilidadCeldaGuardarCambiosRubroEmpleaCuentaContable=true;
			}
			
			this.isVisibilidadCeldaModificarRubroEmpleaCuentaContable=false;
			this.isVisibilidadCeldaActualizarRubroEmpleaCuentaContable=false;
			this.isVisibilidadCeldaEliminarRubroEmpleaCuentaContable=false;
			this.isVisibilidadCeldaCancelarRubroEmpleaCuentaContable=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRubroEmpleaCuentaContable=true;
				} else {
					this.isVisibilidadCeldaGuardarRubroEmpleaCuentaContable=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoRubroEmpleaCuentaContable=false;
			this.isVisibilidadCeldaNuevoRelacionesRubroEmpleaCuentaContable=false;
			this.isVisibilidadCeldaGuardarCambiosRubroEmpleaCuentaContable=false;
			this.isVisibilidadCeldaModificarRubroEmpleaCuentaContable=false;
			this.isVisibilidadCeldaActualizarRubroEmpleaCuentaContable=true;
			this.isVisibilidadCeldaEliminarRubroEmpleaCuentaContable=false;
			this.isVisibilidadCeldaCancelarRubroEmpleaCuentaContable=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRubroEmpleaCuentaContable=true;
				} else {
					this.isVisibilidadCeldaGuardarRubroEmpleaCuentaContable=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoRubroEmpleaCuentaContable=false;
			this.isVisibilidadCeldaNuevoRelacionesRubroEmpleaCuentaContable=false;
			this.isVisibilidadCeldaGuardarCambiosRubroEmpleaCuentaContable=false;
			this.isVisibilidadCeldaModificarRubroEmpleaCuentaContable=false;
			this.isVisibilidadCeldaActualizarRubroEmpleaCuentaContable=true;
			this.isVisibilidadCeldaEliminarRubroEmpleaCuentaContable=true;
			this.isVisibilidadCeldaCancelarRubroEmpleaCuentaContable=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRubroEmpleaCuentaContable=true;
				} else {
					this.isVisibilidadCeldaGuardarRubroEmpleaCuentaContable=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoRubroEmpleaCuentaContable=false;
			this.isVisibilidadCeldaNuevoRelacionesRubroEmpleaCuentaContable=false;
			this.isVisibilidadCeldaGuardarCambiosRubroEmpleaCuentaContable=false;
			this.isVisibilidadCeldaModificarRubroEmpleaCuentaContable=false;
			this.isVisibilidadCeldaActualizarRubroEmpleaCuentaContable=true;
			this.isVisibilidadCeldaEliminarRubroEmpleaCuentaContable=false;
			this.isVisibilidadCeldaCancelarRubroEmpleaCuentaContable=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRubroEmpleaCuentaContable=false;
				} else {
					this.isVisibilidadCeldaGuardarRubroEmpleaCuentaContable=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoRubroEmpleaCuentaContable=true;
			this.isVisibilidadCeldaNuevoRelacionesRubroEmpleaCuentaContable=true;
			this.isVisibilidadCeldaGuardarCambiosRubroEmpleaCuentaContable=true;
			this.isVisibilidadCeldaModificarRubroEmpleaCuentaContable=false;
			this.isVisibilidadCeldaActualizarRubroEmpleaCuentaContable=false;
			this.isVisibilidadCeldaEliminarRubroEmpleaCuentaContable=false;
			this.isVisibilidadCeldaCancelarRubroEmpleaCuentaContable=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRubroEmpleaCuentaContable=true;
				} else {
					this.isVisibilidadCeldaGuardarRubroEmpleaCuentaContable=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoRubroEmpleaCuentaContable=false;
			this.isVisibilidadCeldaNuevoRelacionesRubroEmpleaCuentaContable=false;
			this.isVisibilidadCeldaGuardarCambiosRubroEmpleaCuentaContable=false;
			this.isVisibilidadCeldaActualizarRubroEmpleaCuentaContable=false;
			this.isVisibilidadCeldaEliminarRubroEmpleaCuentaContable=false;
			this.isVisibilidadCeldaCancelarRubroEmpleaCuentaContable=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRubroEmpleaCuentaContable=false;
				} else {
					this.isVisibilidadCeldaGuardarRubroEmpleaCuentaContable=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoRubroEmpleaCuentaContable=false;
			this.isVisibilidadCeldaNuevoRelacionesRubroEmpleaCuentaContable=false;
			this.isVisibilidadCeldaGuardarCambiosRubroEmpleaCuentaContable=false;
			this.isVisibilidadCeldaModificarRubroEmpleaCuentaContable=true;
			this.isVisibilidadCeldaActualizarRubroEmpleaCuentaContable=false;
			this.isVisibilidadCeldaEliminarRubroEmpleaCuentaContable=false;
			this.isVisibilidadCeldaCancelarRubroEmpleaCuentaContable=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRubroEmpleaCuentaContable=false;
				} else {
					this.isVisibilidadCeldaGuardarRubroEmpleaCuentaContable=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(RubroEmpleaCuentaContableJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoRubroEmpleaCuentaContable=true;
			this.isVisibilidadCeldaNuevoRelacionesRubroEmpleaCuentaContable=true;
			this.isVisibilidadCeldaGuardarCambiosRubroEmpleaCuentaContable=true;
		} else {
			this.actualizarEstadoPanelsRubroEmpleaCuentaContable(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarRubroEmpleaCuentaContable=false;
			//this.isVisibilidadCeldaVerFormRubroEmpleaCuentaContable=false;
			this.isVisibilidadCeldaDuplicarRubroEmpleaCuentaContable=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!rubroempleacuentacontableSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesRubroEmpleaCuentaContable=false;
		} else {
			this.isVisibilidadCeldaNuevoRubroEmpleaCuentaContable=false;
			this.isVisibilidadCeldaGuardarCambiosRubroEmpleaCuentaContable=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(rubroempleacuentacontableSessionBean.getEsGuardarRelacionado()) {
			if(!rubroempleacuentacontableSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesRubroEmpleaCuentaContable=false;												
			}
			
			this.jButtonCerrarRubroEmpleaCuentaContable.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesRubroEmpleaCuentaContable=false;
		}
		
		if(!this.permiteMantenimiento(this.rubroempleacuentacontable)) {
			this.isVisibilidadCeldaActualizarRubroEmpleaCuentaContable=false;
			this.isVisibilidadCeldaEliminarRubroEmpleaCuentaContable=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesRubroEmpleaCuentaContable() {
	}
	
	public void actualizarEstadoPanelsRubroEmpleaCuentaContable(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionRubroEmpleaCuentaContable!=null) {
				this.jScrollPanelDatosEdicionRubroEmpleaCuentaContable.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRubroEmpleaCuentaContable!=null) {
				this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRubroEmpleaCuentaContable!=null) {
				this.jScrollPanelDatosRubroEmpleaCuentaContable.setVisible(true);
			}
			
			if(this.jPanelPaginacionRubroEmpleaCuentaContable!=null) {
				this.jPanelPaginacionRubroEmpleaCuentaContable.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRubroEmpleaCuentaContable!=null) {
				this.jPanelParametrosReportesRubroEmpleaCuentaContable.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionRubroEmpleaCuentaContable!=null) {
				this.jScrollPanelDatosEdicionRubroEmpleaCuentaContable.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRubroEmpleaCuentaContable!=null) {
				this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosRubroEmpleaCuentaContable!=null) {
				this.jScrollPanelDatosRubroEmpleaCuentaContable.setVisible(false);
			}
			
			if(this.jPanelPaginacionRubroEmpleaCuentaContable!=null) {
				this.jPanelPaginacionRubroEmpleaCuentaContable.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRubroEmpleaCuentaContable!=null) {
				this.jPanelParametrosReportesRubroEmpleaCuentaContable.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionRubroEmpleaCuentaContable!=null) {
				this.jScrollPanelDatosEdicionRubroEmpleaCuentaContable.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRubroEmpleaCuentaContable!=null) {
				this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosRubroEmpleaCuentaContable!=null) {
				this.jScrollPanelDatosRubroEmpleaCuentaContable.setVisible(false);
			}
			
			if(this.jPanelPaginacionRubroEmpleaCuentaContable!=null) {
				this.jPanelPaginacionRubroEmpleaCuentaContable.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRubroEmpleaCuentaContable!=null) {
				this.jPanelParametrosReportesRubroEmpleaCuentaContable.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionRubroEmpleaCuentaContable!=null) {
				this.jScrollPanelDatosEdicionRubroEmpleaCuentaContable.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRubroEmpleaCuentaContable!=null) {
				this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosRubroEmpleaCuentaContable!=null) {
				this.jScrollPanelDatosRubroEmpleaCuentaContable.setVisible(false);
			}
			
			if(this.jPanelPaginacionRubroEmpleaCuentaContable!=null) {
				this.jPanelPaginacionRubroEmpleaCuentaContable.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRubroEmpleaCuentaContable!=null) {
				this.jPanelParametrosReportesRubroEmpleaCuentaContable.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionRubroEmpleaCuentaContable!=null) {
				this.jScrollPanelDatosEdicionRubroEmpleaCuentaContable.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRubroEmpleaCuentaContable!=null) {
				this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRubroEmpleaCuentaContable!=null) {
				this.jScrollPanelDatosRubroEmpleaCuentaContable.setVisible(true);
			}
			
			if(this.jPanelPaginacionRubroEmpleaCuentaContable!=null) {
				this.jPanelPaginacionRubroEmpleaCuentaContable.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRubroEmpleaCuentaContable!=null) {
				this.jPanelParametrosReportesRubroEmpleaCuentaContable.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionRubroEmpleaCuentaContable!=null) {
				this.jScrollPanelDatosEdicionRubroEmpleaCuentaContable.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRubroEmpleaCuentaContable!=null) {
				this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRubroEmpleaCuentaContable!=null) {
				this.jScrollPanelDatosRubroEmpleaCuentaContable.setVisible(true);
			}
			
			if(this.jPanelPaginacionRubroEmpleaCuentaContable!=null) {
				this.jPanelPaginacionRubroEmpleaCuentaContable.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRubroEmpleaCuentaContable!=null) {
				this.jPanelParametrosReportesRubroEmpleaCuentaContable.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionRubroEmpleaCuentaContable!=null) {
				this.jScrollPanelDatosEdicionRubroEmpleaCuentaContable.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRubroEmpleaCuentaContable!=null) {
				this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRubroEmpleaCuentaContable!=null) {
				this.jScrollPanelDatosRubroEmpleaCuentaContable.setVisible(true);
			}
			
			if(this.jPanelPaginacionRubroEmpleaCuentaContable!=null) {
				this.jPanelPaginacionRubroEmpleaCuentaContable.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRubroEmpleaCuentaContable!=null) {
				this.jPanelParametrosReportesRubroEmpleaCuentaContable.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasRubroEmpleaCuentaContable!=null) {
					this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesRubroEmpleaCuentaContable!=null) {
				this.jPanelParametrosReportesRubroEmpleaCuentaContable.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRubroEmpleaCuentaContable!=null) {
				this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesRubroEmpleaCuentaContable!=null) {
				this.jPanelParametrosReportesRubroEmpleaCuentaContable.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCuentaContable=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.remove(jPanelFK_IdCuentaContableRubroEmpleaCuentaContable);}

			this.isVisibilidadFK_IdEstructura=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.remove(jPanelFK_IdEstructuraRubroEmpleaCuentaContable);}

			this.isVisibilidadFK_IdRubroEmplea=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdRubroEmplea) {this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.remove(jPanelFK_IdRubroEmpleaRubroEmpleaCuentaContable);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdCuentaContable=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.remove(jPanelFK_IdCuentaContableRubroEmpleaCuentaContable);}

			this.isVisibilidadFK_IdEstructura=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.remove(jPanelFK_IdEstructuraRubroEmpleaCuentaContable);}

			this.isVisibilidadFK_IdRubroEmplea=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdRubroEmplea) {this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.remove(jPanelFK_IdRubroEmpleaRubroEmpleaCuentaContable);}
		}
		
	}

	public void setVisibilidadBusquedasParaRubroEmplea(Boolean isParaRubroEmplea){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaRubroEmpleaNegation=!isParaRubroEmplea;

			this.isVisibilidadFK_IdCuentaContable=isParaRubroEmpleaNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.remove(jPanelFK_IdCuentaContableRubroEmpleaCuentaContable);}

			this.isVisibilidadFK_IdEstructura=isParaRubroEmpleaNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.remove(jPanelFK_IdEstructuraRubroEmpleaCuentaContable);}

			this.isVisibilidadFK_IdRubroEmplea=isParaRubroEmplea;
			if(!this.isVisibilidadFK_IdRubroEmplea) {this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.remove(jPanelFK_IdRubroEmpleaRubroEmpleaCuentaContable);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaContable(Boolean isParaCuentaContable){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableNegation=!isParaCuentaContable;

			this.isVisibilidadFK_IdCuentaContable=isParaCuentaContable;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.remove(jPanelFK_IdCuentaContableRubroEmpleaCuentaContable);}

			this.isVisibilidadFK_IdEstructura=isParaCuentaContableNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.remove(jPanelFK_IdEstructuraRubroEmpleaCuentaContable);}

			this.isVisibilidadFK_IdRubroEmplea=isParaCuentaContableNegation;
			if(!this.isVisibilidadFK_IdRubroEmplea) {this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.remove(jPanelFK_IdRubroEmpleaRubroEmpleaCuentaContable);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstructura(Boolean isParaEstructura){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstructuraNegation=!isParaEstructura;

			this.isVisibilidadFK_IdCuentaContable=isParaEstructuraNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.remove(jPanelFK_IdCuentaContableRubroEmpleaCuentaContable);}

			this.isVisibilidadFK_IdEstructura=isParaEstructura;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.remove(jPanelFK_IdEstructuraRubroEmpleaCuentaContable);}

			this.isVisibilidadFK_IdRubroEmplea=isParaEstructuraNegation;
			if(!this.isVisibilidadFK_IdRubroEmplea) {this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.remove(jPanelFK_IdRubroEmpleaRubroEmpleaCuentaContable);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//RubroEmpleaCuentaContableSessionBean rubroempleacuentacontableSessionBean=new RubroEmpleaCuentaContableSessionBean();
		
		if(this.rubroempleacuentacontableSessionBean==null) {
			this.rubroempleacuentacontableSessionBean=new RubroEmpleaCuentaContableSessionBean();
		}
		
		this.rubroempleacuentacontableSessionBean.setsUltimaBusquedaRubroEmpleaCuentaContable(this.getsAccionBusqueda());
		this.rubroempleacuentacontableSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.rubroempleacuentacontableSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCuentaContable")) {
			rubroempleacuentacontableSessionBean.setid_cuenta_contable(this.getid_cuenta_contableFK_IdCuentaContable());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			rubroempleacuentacontableSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEstructura")) {
			rubroempleacuentacontableSessionBean.setid_estructura(this.getid_estructuraFK_IdEstructura());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdRubroEmplea")) {
			rubroempleacuentacontableSessionBean.setid_rubro_emplea(this.getid_rubro_empleaFK_IdRubroEmplea());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			rubroempleacuentacontableSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//RubroEmpleaCuentaContableSessionBean rubroempleacuentacontableSessionBean=new RubroEmpleaCuentaContableSessionBean();
		
		if(this.rubroempleacuentacontableSessionBean==null) {
			this.rubroempleacuentacontableSessionBean=new RubroEmpleaCuentaContableSessionBean();
		}
		
		if(this.rubroempleacuentacontableSessionBean.getsUltimaBusquedaRubroEmpleaCuentaContable()!=null&&!this.rubroempleacuentacontableSessionBean.getsUltimaBusquedaRubroEmpleaCuentaContable().equals("")) {
			this.setsAccionBusqueda(rubroempleacuentacontableSessionBean.getsUltimaBusquedaRubroEmpleaCuentaContable());
			this.setiNumeroPaginacion(rubroempleacuentacontableSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(rubroempleacuentacontableSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCuentaContable")) {
				this.setid_cuenta_contableFK_IdCuentaContable(rubroempleacuentacontableSessionBean.getid_cuenta_contable());
				rubroempleacuentacontableSessionBean.setid_cuenta_contable(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(rubroempleacuentacontableSessionBean.getid_empresa());
				rubroempleacuentacontableSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEstructura")) {
				this.setid_estructuraFK_IdEstructura(rubroempleacuentacontableSessionBean.getid_estructura());
				rubroempleacuentacontableSessionBean.setid_estructura(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdRubroEmplea")) {
				this.setid_rubro_empleaFK_IdRubroEmplea(rubroempleacuentacontableSessionBean.getid_rubro_emplea());
				rubroempleacuentacontableSessionBean.setid_rubro_emplea(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(rubroempleacuentacontableSessionBean.getid_sucursal());
				rubroempleacuentacontableSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.rubroempleacuentacontableSessionBean.setsUltimaBusquedaRubroEmpleaCuentaContable("");
		this.rubroempleacuentacontableSessionBean.setiNumeroPaginacion(RubroEmpleaCuentaContableConstantesFunciones.INUMEROPAGINACION);
		this.rubroempleacuentacontableSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaRubroEmpleaCuentaContable(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioRubroEmpleaCuentaContable() {
		this.updateBorderResaltarBusquedasFormularioRubroEmpleaCuentaContable();
		this.updateVisibilidadBusquedasFormularioRubroEmpleaCuentaContable();
		this.updateHabilitarBusquedasFormularioRubroEmpleaCuentaContable();
	}
	
	public void updateBorderResaltarBusquedasFormularioRubroEmpleaCuentaContable() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.getComponents().length>0) {
	

		if(this.rubroempleacuentacontableConstantesFunciones.resaltarFK_IdCuentaContableRubroEmpleaCuentaContable!=null) {
			index= this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.indexOfComponent(this.jPanelFK_IdCuentaContableRubroEmpleaCuentaContable);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.getComponent(index);
				jPanel.setBorder(this.rubroempleacuentacontableConstantesFunciones.resaltarFK_IdCuentaContableRubroEmpleaCuentaContable);
			}
		}

		if(this.rubroempleacuentacontableConstantesFunciones.resaltarFK_IdEstructuraRubroEmpleaCuentaContable!=null) {
			index= this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.indexOfComponent(this.jPanelFK_IdEstructuraRubroEmpleaCuentaContable);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.getComponent(index);
				jPanel.setBorder(this.rubroempleacuentacontableConstantesFunciones.resaltarFK_IdEstructuraRubroEmpleaCuentaContable);
			}
		}

		if(this.rubroempleacuentacontableConstantesFunciones.resaltarFK_IdRubroEmpleaRubroEmpleaCuentaContable!=null) {
			index= this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.indexOfComponent(this.jPanelFK_IdRubroEmpleaRubroEmpleaCuentaContable);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.getComponent(index);
				jPanel.setBorder(this.rubroempleacuentacontableConstantesFunciones.resaltarFK_IdRubroEmpleaRubroEmpleaCuentaContable);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioRubroEmpleaCuentaContable() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.indexOfComponent(this.jPanelFK_IdCuentaContableRubroEmpleaCuentaContable);
			jPanel=(JPanel)this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.rubroempleacuentacontableConstantesFunciones.mostrarFK_IdCuentaContableRubroEmpleaCuentaContable);
			if(!this.rubroempleacuentacontableConstantesFunciones.mostrarFK_IdCuentaContableRubroEmpleaCuentaContable && index>-1) {
				this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.remove(index);
			}

			index= this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.indexOfComponent(this.jPanelFK_IdEstructuraRubroEmpleaCuentaContable);
			jPanel=(JPanel)this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.rubroempleacuentacontableConstantesFunciones.mostrarFK_IdEstructuraRubroEmpleaCuentaContable);
			if(!this.rubroempleacuentacontableConstantesFunciones.mostrarFK_IdEstructuraRubroEmpleaCuentaContable && index>-1) {
				this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.remove(index);
			}

			index= this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.indexOfComponent(this.jPanelFK_IdRubroEmpleaRubroEmpleaCuentaContable);
			jPanel=(JPanel)this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.rubroempleacuentacontableConstantesFunciones.mostrarFK_IdRubroEmpleaRubroEmpleaCuentaContable);
			if(!this.rubroempleacuentacontableConstantesFunciones.mostrarFK_IdRubroEmpleaRubroEmpleaCuentaContable && index>-1) {
				this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioRubroEmpleaCuentaContable() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.indexOfComponent(this.jPanelFK_IdCuentaContableRubroEmpleaCuentaContable);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.rubroempleacuentacontableConstantesFunciones.activarFK_IdCuentaContableRubroEmpleaCuentaContable);
				this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.setEnabledAt(index,this.rubroempleacuentacontableConstantesFunciones.activarFK_IdCuentaContableRubroEmpleaCuentaContable);
			}

			index= this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.indexOfComponent(this.jPanelFK_IdEstructuraRubroEmpleaCuentaContable);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.rubroempleacuentacontableConstantesFunciones.activarFK_IdEstructuraRubroEmpleaCuentaContable);
				this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.setEnabledAt(index,this.rubroempleacuentacontableConstantesFunciones.activarFK_IdEstructuraRubroEmpleaCuentaContable);
			}

			index= this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.indexOfComponent(this.jPanelFK_IdRubroEmpleaRubroEmpleaCuentaContable);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.rubroempleacuentacontableConstantesFunciones.activarFK_IdRubroEmpleaRubroEmpleaCuentaContable);
				this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.setEnabledAt(index,this.rubroempleacuentacontableConstantesFunciones.activarFK_IdRubroEmpleaRubroEmpleaCuentaContable);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaRubroEmpleaCuentaContable(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCuentaContable")) {
			index= this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.indexOfComponent(this.jPanelFK_IdCuentaContableRubroEmpleaCuentaContable);

			this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.getComponent(index);

			this.rubroempleacuentacontableConstantesFunciones.setResaltarFK_IdCuentaContableRubroEmpleaCuentaContable(resaltar);

			jPanel.setBorder(this.rubroempleacuentacontableConstantesFunciones.resaltarFK_IdCuentaContableRubroEmpleaCuentaContable);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEstructura")) {
			index= this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.indexOfComponent(this.jPanelFK_IdEstructuraRubroEmpleaCuentaContable);

			this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.getComponent(index);

			this.rubroempleacuentacontableConstantesFunciones.setResaltarFK_IdEstructuraRubroEmpleaCuentaContable(resaltar);

			jPanel.setBorder(this.rubroempleacuentacontableConstantesFunciones.resaltarFK_IdEstructuraRubroEmpleaCuentaContable);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdRubroEmplea")) {
			index= this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.indexOfComponent(this.jPanelFK_IdRubroEmpleaRubroEmpleaCuentaContable);

			this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRubroEmpleaCuentaContable.getComponent(index);

			this.rubroempleacuentacontableConstantesFunciones.setResaltarFK_IdRubroEmpleaRubroEmpleaCuentaContable(resaltar);

			jPanel.setBorder(this.rubroempleacuentacontableConstantesFunciones.resaltarFK_IdRubroEmpleaRubroEmpleaCuentaContable);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarRubroEmpleaCuentaContable.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioRubroEmpleaCuentaContable() throws Exception {

		if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioRubroEmpleaCuentaContable();
		this.updateVisibilidadResaltarControlesFormularioRubroEmpleaCuentaContable();
		this.updateHabilitarResaltarControlesFormularioRubroEmpleaCuentaContable();
		
	}
	
	public void updateBorderResaltarControlesFormularioRubroEmpleaCuentaContable() throws Exception {
		if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.rubroempleacuentacontableConstantesFunciones.resaltaridRubroEmpleaCuentaContable!=null && this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) {this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jLabelidRubroEmpleaCuentaContable.setBorder(this.rubroempleacuentacontableConstantesFunciones.resaltaridRubroEmpleaCuentaContable);}
		if(this.rubroempleacuentacontableConstantesFunciones.resaltarid_empresaRubroEmpleaCuentaContable!=null && this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) {this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_empresaRubroEmpleaCuentaContable.setBorder(this.rubroempleacuentacontableConstantesFunciones.resaltarid_empresaRubroEmpleaCuentaContable);}
		if(this.rubroempleacuentacontableConstantesFunciones.resaltarid_sucursalRubroEmpleaCuentaContable!=null && this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) {this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_sucursalRubroEmpleaCuentaContable.setBorder(this.rubroempleacuentacontableConstantesFunciones.resaltarid_sucursalRubroEmpleaCuentaContable);}
		if(this.rubroempleacuentacontableConstantesFunciones.resaltarid_rubro_empleaRubroEmpleaCuentaContable!=null && this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) {this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_rubro_empleaRubroEmpleaCuentaContable.setBorder(this.rubroempleacuentacontableConstantesFunciones.resaltarid_rubro_empleaRubroEmpleaCuentaContable);}
		if(this.rubroempleacuentacontableConstantesFunciones.resaltarid_cuenta_contableRubroEmpleaCuentaContable!=null && this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) {this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_cuenta_contableRubroEmpleaCuentaContable.setBorder(this.rubroempleacuentacontableConstantesFunciones.resaltarid_cuenta_contableRubroEmpleaCuentaContable);}
		if(this.rubroempleacuentacontableConstantesFunciones.resaltarid_estructuraRubroEmpleaCuentaContable!=null && this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) {this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_estructuraRubroEmpleaCuentaContable.setBorder(this.rubroempleacuentacontableConstantesFunciones.resaltarid_estructuraRubroEmpleaCuentaContable);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioRubroEmpleaCuentaContable() throws Exception {		
		if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) {
	
		//this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jLabelidRubroEmpleaCuentaContable.setVisible(this.rubroempleacuentacontableConstantesFunciones.mostraridRubroEmpleaCuentaContable);
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jPanelidRubroEmpleaCuentaContable.setVisible(this.rubroempleacuentacontableConstantesFunciones.mostraridRubroEmpleaCuentaContable);
		//this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_empresaRubroEmpleaCuentaContable.setVisible(this.rubroempleacuentacontableConstantesFunciones.mostrarid_empresaRubroEmpleaCuentaContable);
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jPanelid_empresaRubroEmpleaCuentaContable.setVisible(this.rubroempleacuentacontableConstantesFunciones.mostrarid_empresaRubroEmpleaCuentaContable);
		//this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_sucursalRubroEmpleaCuentaContable.setVisible(this.rubroempleacuentacontableConstantesFunciones.mostrarid_sucursalRubroEmpleaCuentaContable);
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jPanelid_sucursalRubroEmpleaCuentaContable.setVisible(this.rubroempleacuentacontableConstantesFunciones.mostrarid_sucursalRubroEmpleaCuentaContable);
		//this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_rubro_empleaRubroEmpleaCuentaContable.setVisible(this.rubroempleacuentacontableConstantesFunciones.mostrarid_rubro_empleaRubroEmpleaCuentaContable);
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jPanelid_rubro_empleaRubroEmpleaCuentaContable.setVisible(this.rubroempleacuentacontableConstantesFunciones.mostrarid_rubro_empleaRubroEmpleaCuentaContable);
		//this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_cuenta_contableRubroEmpleaCuentaContable.setVisible(this.rubroempleacuentacontableConstantesFunciones.mostrarid_cuenta_contableRubroEmpleaCuentaContable);
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jPanelid_cuenta_contableRubroEmpleaCuentaContable.setVisible(this.rubroempleacuentacontableConstantesFunciones.mostrarid_cuenta_contableRubroEmpleaCuentaContable);
		//this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_estructuraRubroEmpleaCuentaContable.setVisible(this.rubroempleacuentacontableConstantesFunciones.mostrarid_estructuraRubroEmpleaCuentaContable);
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jPanelid_estructuraRubroEmpleaCuentaContable.setVisible(this.rubroempleacuentacontableConstantesFunciones.mostrarid_estructuraRubroEmpleaCuentaContable);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioRubroEmpleaCuentaContable() throws Exception {
		if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormRubroEmpleaCuentaContable!=null) {
	
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jLabelidRubroEmpleaCuentaContable.setEnabled(this.rubroempleacuentacontableConstantesFunciones.activaridRubroEmpleaCuentaContable);
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_empresaRubroEmpleaCuentaContable.setEnabled(this.rubroempleacuentacontableConstantesFunciones.activarid_empresaRubroEmpleaCuentaContable);
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_sucursalRubroEmpleaCuentaContable.setEnabled(this.rubroempleacuentacontableConstantesFunciones.activarid_sucursalRubroEmpleaCuentaContable);
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_rubro_empleaRubroEmpleaCuentaContable.setEnabled(this.rubroempleacuentacontableConstantesFunciones.activarid_rubro_empleaRubroEmpleaCuentaContable);
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_cuenta_contableRubroEmpleaCuentaContable.setEnabled(this.rubroempleacuentacontableConstantesFunciones.activarid_cuenta_contableRubroEmpleaCuentaContable);
		this.jInternalFrameDetalleFormRubroEmpleaCuentaContable.jComboBoxid_estructuraRubroEmpleaCuentaContable.setEnabled(this.rubroempleacuentacontableConstantesFunciones.activarid_estructuraRubroEmpleaCuentaContable);
		}
	}
	
		
}