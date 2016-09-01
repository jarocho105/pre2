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

import com.bydan.erp.nomina.util.CargoInvenConstantesFunciones;
import com.bydan.erp.nomina.util.CargoInvenParameterReturnGeneral;
//import com.bydan.erp.nomina.util.CargoInvenParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.CargoInvenBean;
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
public class CargoInvenBeanSwingJInternalFrame extends CargoInvenJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CargoInvenBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<CargoInven> cargoinvenValidator = new ClassValidator<CargoInven>(CargoInven.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public CargoInven cargoinven;	
	public CargoInven cargoinvenAux;
	public CargoInven cargoinvenAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public CargoInven cargoinvenTotales;
	public Long idCargoInvenActual;
	public Long iIdNuevoCargoInven=0L;
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

	public String sFinalQueryComboCuentaContableCredito="";

	public List<CuentaContable> cuentacontablecreditosForeignKey;

	public List<CuentaContable> getcuentacontablecreditosForeignKey() {
		return cuentacontablecreditosForeignKey;
	}

	public void setcuentacontablecreditosForeignKey(List<CuentaContable> cuentacontablecreditosForeignKey) {
		this.cuentacontablecreditosForeignKey = cuentacontablecreditosForeignKey;
	}

	//OBJETO FK ACTUAL
	public CuentaContable cuentacontablecreditoForeignKey;

	public CuentaContable getcuentacontablecreditoForeignKey() {
		return cuentacontablecreditoForeignKey;
	}

	public void setcuentacontablecreditoForeignKey(CuentaContable cuentacontablecreditoForeignKey) {
		this.cuentacontablecreditoForeignKey = cuentacontablecreditoForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idCuentaContableActual=0L;

	public Long getidCuentaContableActual() {
		return idCuentaContableActual;
	}

	public void setidCuentaContableActual(Long idCuentaContableActual) {
		this.idCuentaContableActual= idCuentaContableActual;
	}
	public Long idCuentaContableCreditoActual=0L;

	public Long getidCuentaContableCreditoActual() {
		return idCuentaContableCreditoActual;
	}

	public void setidCuentaContableCreditoActual(Long idCuentaContableCreditoActual) {
		this.idCuentaContableCreditoActual= idCuentaContableCreditoActual;
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
	
	public Boolean isPermisoTodoCargoInven;
	public Boolean isPermisoNuevoCargoInven;
	public Boolean isPermisoActualizarCargoInven;
	public Boolean isPermisoActualizarOriginalCargoInven;
	public Boolean isPermisoEliminarCargoInven;
	public Boolean isPermisoGuardarCambiosCargoInven;
	public Boolean isPermisoConsultaCargoInven;
	public Boolean isPermisoBusquedaCargoInven;
	public Boolean isPermisoReporteCargoInven;
	public Boolean isPermisoPaginacionMedioCargoInven;
	public Boolean isPermisoPaginacionAltoCargoInven;
	public Boolean isPermisoPaginacionTodoCargoInven;
	public Boolean isPermisoCopiarCargoInven;
	public Boolean isPermisoVerFormCargoInven;
	public Boolean isPermisoDuplicarCargoInven;
	public Boolean isPermisoOrdenCargoInven;
	
	
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
	
	public CargoInvenParameterReturnGeneral cargoinvenReturnGeneral;
	public CargoInvenParameterReturnGeneral cargoinvenParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCargoInven=false;
	public Boolean esParaAccionDesdeFormularioCargoInven=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CargoInvenSessionBeanAdditional cargoinvenSessionBeanAdditional=null;
	
	public CargoInvenSessionBeanAdditional getCargoInvenSessionBeanAdditional() {
		return this.cargoinvenSessionBeanAdditional;
	}
	
	public void setCargoInvenSessionBeanAdditional(CargoInvenSessionBeanAdditional cargoinvenSessionBeanAdditional) {
		try {
			this.cargoinvenSessionBeanAdditional=cargoinvenSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CargoInvenBeanSwingJInternalFrameAdditional cargoinvenBeanSwingJInternalFrameAdditional=null;
	//public class CargoInvenBeanSwingJInternalFrame
	
	public CargoInvenBeanSwingJInternalFrameAdditional getCargoInvenBeanSwingJInternalFrameAdditional() {
		return this.cargoinvenBeanSwingJInternalFrameAdditional;
	}
	
	public void setCargoInvenBeanSwingJInternalFrameAdditional(CargoInvenBeanSwingJInternalFrameAdditional cargoinvenBeanSwingJInternalFrameAdditional) {
		try {
			this.cargoinvenBeanSwingJInternalFrameAdditional=cargoinvenBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CargoInvenLogic cargoinvenLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public CargoInven cargoinvenBean;
	public CargoInvenConstantesFunciones cargoinvenConstantesFunciones;
	//public CargoInvenParameterReturnGeneral cargoinvenReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public CuentaContableLogic cuentacontableLogic;
	public CuentaContableLogic cuentacontablecreditoLogic;
	
	//PARAMETROS
	
	
	//public List<CargoInven> cargoinvens;	
	//public List<CargoInven> cargoinvensEliminados;
	//public List<CargoInven> cargoinvensAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCargoInven=false;
	public Boolean isVisibilidadCeldaDuplicarCargoInven=true;
	public Boolean isVisibilidadCeldaCopiarCargoInven=true;
	public Boolean isVisibilidadCeldaVerFormCargoInven=true;
	public Boolean isVisibilidadCeldaOrdenCargoInven=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCargoInven=false;
	public Boolean isVisibilidadCeldaModificarCargoInven=false;
	public Boolean isVisibilidadCeldaActualizarCargoInven=false;
	public Boolean isVisibilidadCeldaEliminarCargoInven=false;
	public Boolean isVisibilidadCeldaCancelarCargoInven=false;
	public Boolean isVisibilidadCeldaGuardarCargoInven=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCargoInven=false;	
	
	
	public Boolean isVisibilidadFK_IdCargoInven=false;
	public Boolean isVisibilidadFK_IdCuentaContable=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoCargoInven() {
		return this.iIdNuevoCargoInven;
	}

	public void setiIdNuevoCargoInven(Long iIdNuevoCargoInven) {
		this.iIdNuevoCargoInven = iIdNuevoCargoInven;
	}
	
	public Long getidCargoInvenActual() {
		return this.idCargoInvenActual;
	}

	public void setidCargoInvenActual(Long idCargoInvenActual) {
		this.idCargoInvenActual = idCargoInvenActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public CargoInven getcargoinven() {
		return this.cargoinven;
	}

	public void setcargoinven(CargoInven cargoinven) {
		this.cargoinven = cargoinven;
	}
	
	public CargoInven getcargoinvenAux() {
		return this.cargoinvenAux;
	}

	public void setcargoinvenAux(CargoInven cargoinvenAux) {
		this.cargoinvenAux = cargoinvenAux;
	}				
	
	public CargoInven getcargoinvenAnterior() {
		return this.cargoinvenAnterior;
	}

	public void setcargoinvenAnterior(CargoInven cargoinvenAnterior) {
		this.cargoinvenAnterior = cargoinvenAnterior;
	}	
	
	public CargoInven getcargoinvenTotales() {
		return this.cargoinvenTotales;
	}

	public void setcargoinvenTotales(CargoInven cargoinvenTotales) {
		this.cargoinvenTotales = cargoinvenTotales;
	}	
	
	public CargoInven getcargoinvenBean() {
		return this.cargoinvenBean;
	}

	public void setcargoinvenBean(CargoInven cargoinvenBean) {
		this.cargoinvenBean = cargoinvenBean;
	}	
	
	public CargoInvenParameterReturnGeneral getcargoinvenReturnGeneral() {
		return this.cargoinvenReturnGeneral;
	}

	public void setcargoinvenReturnGeneral(CargoInvenParameterReturnGeneral cargoinvenReturnGeneral) {
		this.cargoinvenReturnGeneral = cargoinvenReturnGeneral;
	}	
	
	
	public Long id_cuenta_contable_creditoFK_IdCargoInven=-1L;

	public Long getid_cuenta_contable_creditoFK_IdCargoInven() {
		return this.id_cuenta_contable_creditoFK_IdCargoInven;
	}

	public void setid_cuenta_contable_creditoFK_IdCargoInven(Long id_cuenta_contable_creditoFK_IdCargoInven) {
		this.id_cuenta_contable_creditoFK_IdCargoInven = id_cuenta_contable_creditoFK_IdCargoInven;
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
	
	
	public CargoInvenLogic getCargoInvenLogic()	{		
		return cargoinvenLogic;
	}

	public void setCargoInvenLogic(CargoInvenLogic cargoinvenLogic) {
		this.cargoinvenLogic = cargoinvenLogic;
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
	
	public Boolean getIsEsNuevoCargoInven() {
		return isEsNuevoCargoInven;
	}

	public void setIsEsNuevoCargoInven(Boolean isEsNuevoCargoInven) {
		this.isEsNuevoCargoInven = isEsNuevoCargoInven;
	}

	public Boolean getEsParaAccionDesdeFormularioCargoInven() {
		return esParaAccionDesdeFormularioCargoInven;
	}
	
	public void setEsParaAccionDesdeFormularioCargoInven(Boolean esParaAccionDesdeFormularioCargoInven) {
		this.esParaAccionDesdeFormularioCargoInven = esParaAccionDesdeFormularioCargoInven;
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

			if(this.cargoinvenSessionBean==null) {
				this.cargoinvenSessionBean=new CargoInvenSessionBean();
			}

			if(!this.cargoinvenSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(cargoinvenSessionBean.getlidEmpresaActual());
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

			if(this.cargoinvenSessionBean==null) {
				this.cargoinvenSessionBean=new CargoInvenSessionBean();
			}

			if(!this.cargoinvenSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
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
					cuentacontableLogic.getEntityWithConnection(cargoinvenSessionBean.getlidCuentaContableActual());
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

	public void cargarCombosCuentaContableCreditosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.cuentacontablecreditosForeignKey=new ArrayList<CuentaContable>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CuentaContableLogic cuentacontableLogic=new CuentaContableLogic();

			//cuentacontableLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

			if(this.cargoinvenSessionBean==null) {
				this.cargoinvenSessionBean=new CargoInvenSessionBean();
			}

			if(!this.cargoinvenSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableCredito()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cuentacontablecreditoLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

					cuentacontableLogic.getTodosCuentaContablesWithConnection(sFinalQuery,new Pagination());

					this.cuentacontablecreditosForeignKey=cuentacontableLogic.getCuentaContables();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCuentaContableCredito(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontableLogic.getEntityWithConnection(cargoinvenSessionBean.getlidCuentaContableCreditoActual());
					this.cuentacontablecreditosForeignKey.add(cuentacontableLogic.getCuentaContable());
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

					if(this.cargoinven!=null) {
						this.cargoinven.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormCargoInven!=null) {
						this.jInternalFrameDetalleFormCargoInven.jComboBoxid_empresaCargoInven.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaCargoInven.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormCargoInven!=null) {
						if(this.jInternalFrameDetalleFormCargoInven.jComboBoxid_empresaCargoInven.getItemCount()>0) {
							this.jInternalFrameDetalleFormCargoInven.jComboBoxid_empresaCargoInven.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaCargoInvenGenerico)throws Exception
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
				jComboBoxid_empresaCargoInvenGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaCargoInvenGenerico!=null && jComboBoxid_empresaCargoInvenGenerico.getItemCount()>0) {
					jComboBoxid_empresaCargoInvenGenerico.setSelectedIndex(0);
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

					if(this.cargoinven!=null) {
						this.cargoinven.setCuentaContable(cuentacontableTemp);
					}

					if(this.jInternalFrameDetalleFormCargoInven!=null) {
						this.jInternalFrameDetalleFormCargoInven.jComboBoxid_cuenta_contableCargoInven.setSelectedItem(cuentacontableTemp);
					}
				} else {
					//jComboBoxid_cuenta_contableCargoInven.setSelectedItem(cuentacontableTemp);
					if(this.jInternalFrameDetalleFormCargoInven!=null) {
						if(this.jInternalFrameDetalleFormCargoInven.jComboBoxid_cuenta_contableCargoInven.getItemCount()>0) {
							this.jInternalFrameDetalleFormCargoInven.jComboBoxid_cuenta_contableCargoInven.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCuentaContable") || sFormularioTipoBusqueda.equals("Todos")){
					if(cuentacontableTemp!=null && jComboBoxid_cuenta_contableFK_IdCuentaContableCargoInven!=null) {
						jComboBoxid_cuenta_contableFK_IdCuentaContableCargoInven.setSelectedItem(cuentacontableTemp);
					} else {
						if(jComboBoxid_cuenta_contableFK_IdCuentaContableCargoInven!=null) {
							//jComboBoxid_cuenta_contableFK_IdCuentaContableCargoInven.setSelectedItem(cuentacontableTemp);
							if(jComboBoxid_cuenta_contableFK_IdCuentaContableCargoInven.getItemCount()>0) {
								jComboBoxid_cuenta_contableFK_IdCuentaContableCargoInven.setSelectedIndex(0);
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
	public void setActualCuentaContableForeignKeyGenerico(Long idCuentaContableSeleccionado,JComboBox jComboBoxid_cuenta_contableCargoInvenGenerico)throws Exception
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
				jComboBoxid_cuenta_contableCargoInvenGenerico.setSelectedItem(cuentacontableTemp);
			} else {
				if(jComboBoxid_cuenta_contableCargoInvenGenerico!=null && jComboBoxid_cuenta_contableCargoInvenGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contableCargoInvenGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCuentaContableCreditoForeignKey(Long idCuentaContableCreditoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			CuentaContable  cuentacontablecreditoTemp=null;

			for(CuentaContable cuentacontablecreditoAux:cuentacontablecreditosForeignKey) {
				if(cuentacontablecreditoAux.getId()!=null && cuentacontablecreditoAux.getId().equals(idCuentaContableCreditoSeleccionado)) {
					cuentacontablecreditoTemp=cuentacontablecreditoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(cuentacontablecreditoTemp!=null) {

					if(this.cargoinven!=null) {
						this.cargoinven.setCuentaContableCredito(cuentacontablecreditoTemp);
					}

					if(this.jInternalFrameDetalleFormCargoInven!=null) {
						this.jInternalFrameDetalleFormCargoInven.jComboBoxid_cuenta_contable_creditoCargoInven.setSelectedItem(cuentacontablecreditoTemp);
					}
				} else {
					//jComboBoxid_cuenta_contable_creditoCargoInven.setSelectedItem(cuentacontablecreditoTemp);
					if(this.jInternalFrameDetalleFormCargoInven!=null) {
						if(this.jInternalFrameDetalleFormCargoInven.jComboBoxid_cuenta_contable_creditoCargoInven.getItemCount()>0) {
							this.jInternalFrameDetalleFormCargoInven.jComboBoxid_cuenta_contable_creditoCargoInven.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCargoInven") || sFormularioTipoBusqueda.equals("Todos")){
					if(cuentacontablecreditoTemp!=null && jComboBoxid_cuenta_contable_creditoFK_IdCargoInvenCargoInven!=null) {
						jComboBoxid_cuenta_contable_creditoFK_IdCargoInvenCargoInven.setSelectedItem(cuentacontablecreditoTemp);
					} else {
						if(jComboBoxid_cuenta_contable_creditoFK_IdCargoInvenCargoInven!=null) {
							//jComboBoxid_cuenta_contable_creditoFK_IdCargoInvenCargoInven.setSelectedItem(cuentacontablecreditoTemp);
							if(jComboBoxid_cuenta_contable_creditoFK_IdCargoInvenCargoInven.getItemCount()>0) {
								jComboBoxid_cuenta_contable_creditoFK_IdCargoInvenCargoInven.setSelectedIndex(0);
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

	public String getActualCuentaContableCreditoForeignKeyDescripcion(Long idCuentaContableCreditoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			CuentaContable  cuentacontablecreditoTemp=null;

			for(CuentaContable cuentacontablecreditoAux:cuentacontablecreditosForeignKey) {
				if(cuentacontablecreditoAux.getId()!=null && cuentacontablecreditoAux.getId().equals(idCuentaContableCreditoSeleccionado)) {
					cuentacontablecreditoTemp=cuentacontablecreditoAux;
					break;
				}
			}


			sDescripcion=CuentaContableConstantesFunciones.getCuentaContableDescripcion(cuentacontablecreditoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCuentaContableCreditoForeignKeyGenerico(Long idCuentaContableCreditoSeleccionado,JComboBox jComboBoxid_cuenta_contable_creditoCargoInvenGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontablecreditoTemp=null;

			for(CuentaContable cuentacontablecreditoAux:cuentacontablecreditosForeignKey) {
				if(cuentacontablecreditoAux.getId()!=null && cuentacontablecreditoAux.getId().equals(idCuentaContableCreditoSeleccionado)) {
					cuentacontablecreditoTemp=cuentacontablecreditoAux;
					break;
				}
			}

			if(cuentacontablecreditoTemp!=null) {
				jComboBoxid_cuenta_contable_creditoCargoInvenGenerico.setSelectedItem(cuentacontablecreditoTemp);
			} else {
				if(jComboBoxid_cuenta_contable_creditoCargoInvenGenerico!=null && jComboBoxid_cuenta_contable_creditoCargoInvenGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contable_creditoCargoInvenGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(CargoInven cargoinven,JComboBox jComboBoxid_empresaCargoInvenGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaCargoInvenGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormCargoInven.jComboBoxid_empresaCargoInven.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaCargoInvenGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				cargoinven.setid_empresa(empresaAux.getId());
				cargoinven.setempresa_descripcion(CargoInvenConstantesFunciones.getEmpresaDescripcion(empresaAux));
				cargoinven.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableForeignKey(CargoInven cargoinven,JComboBox jComboBoxid_cuenta_contableCargoInvenGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contableCargoInvenGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormCargoInven.jComboBoxid_cuenta_contableCargoInven.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contableCargoInvenGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null && cuentacontableAux.getId()!=null) {
				cargoinven.setid_cuenta_contable(cuentacontableAux.getId());
				cargoinven.setcuentacontable_descripcion(CargoInvenConstantesFunciones.getCuentaContableDescripcion(cuentacontableAux));
				cargoinven.setCuentaContable(cuentacontableAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableCreditoForeignKey(CargoInven cargoinven,JComboBox jComboBoxid_cuenta_contable_creditoCargoInvenGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contable_creditoCargoInvenGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormCargoInven.jComboBoxid_cuenta_contable_creditoCargoInven.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contable_creditoCargoInvenGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null && cuentacontableAux.getId()!=null) {
				cargoinven.setid_cuenta_contable_credito(cuentacontableAux.getId());
				cargoinven.setcuentacontablecredito_descripcion(CargoInvenConstantesFunciones.getCuentaContableCreditoDescripcion(cuentacontableAux));
				cargoinven.setCuentaContableCredito(cuentacontableAux);			}
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

					if(!CargoInvenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCargoInven!=null) { 
							this.jInternalFrameDetalleFormCargoInven.jComboBoxid_empresaCargoInven.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormCargoInven.jComboBoxid_empresaCargoInven.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCargoInven!=null) { 
					}

					if(!CargoInvenJInternalFrame.ISBINDING_MANUAL) {
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

					if(!CargoInvenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCargoInven!=null) { 
							this.jInternalFrameDetalleFormCargoInven.jComboBoxid_cuenta_contableCargoInven.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jInternalFrameDetalleFormCargoInven.jComboBoxid_cuenta_contableCargoInven.addItem(cuentacontable);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCargoInven!=null) { 
					}

					if(!CargoInvenJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCuentaContable") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CargoInvenJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableCargoInven.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jComboBoxid_cuenta_contableFK_IdCuentaContableCargoInven.addItem(cuentacontable);
							}
						}

						if(!CargoInvenJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCuentaContableCreditosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCuentaContable=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CargoInvenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCargoInven!=null) { 
							this.jInternalFrameDetalleFormCargoInven.jComboBoxid_cuenta_contable_creditoCargoInven.removeAllItems();

							for(CuentaContable cuentacontablecredito:this.cuentacontablecreditosForeignKey) {
								this.jInternalFrameDetalleFormCargoInven.jComboBoxid_cuenta_contable_creditoCargoInven.addItem(cuentacontablecredito);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCargoInven!=null) { 
					}

					if(!CargoInvenJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCargoInven") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CargoInvenJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cuenta_contable_creditoFK_IdCargoInvenCargoInven.removeAllItems();

							for(CuentaContable cuentacontablecredito:this.cuentacontablecreditosForeignKey) {
								this.jComboBoxid_cuenta_contable_creditoFK_IdCargoInvenCargoInven.addItem(cuentacontablecredito);
							}
						}

						if(!CargoInvenJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormCargoInven!=null) {
							this.jInternalFrameDetalleFormCargoInven.jComboBoxid_empresaCargoInven.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormCargoInven!=null) {
							this.jInternalFrameDetalleFormCargoInven.jComboBoxid_empresaCargoInven.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormCargoInven!=null) {
							this.jInternalFrameDetalleFormCargoInven.jComboBoxid_cuenta_contableCargoInven.setSelectedItem(cuentacontable);
						}
					} else {
						if(this.jInternalFrameDetalleFormCargoInven!=null) {
							this.jInternalFrameDetalleFormCargoInven.jComboBoxid_cuenta_contableCargoInven.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableCargoInven.setSelectedItem(cuentacontable);
						} else {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableCargoInven.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameCuentaContableCreditoForeignKey(CuentaContable cuentacontablecredito,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCargoInven!=null) {
							this.jInternalFrameDetalleFormCargoInven.jComboBoxid_cuenta_contable_creditoCargoInven.setSelectedItem(cuentacontablecredito);
						}
					} else {
						if(this.jInternalFrameDetalleFormCargoInven!=null) {
							this.jInternalFrameDetalleFormCargoInven.jComboBoxid_cuenta_contable_creditoCargoInven.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cuenta_contable_creditoFK_IdCargoInvenCargoInven.setSelectedItem(cuentacontablecredito);
						} else {
							this.jComboBoxid_cuenta_contable_creditoFK_IdCargoInvenCargoInven.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesCargoInven() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			CargoInvenConstantesFunciones.refrescarForeignKeysDescripcionesCargoInven(this.cargoinvenLogic.getCargoInvens());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			CargoInvenConstantesFunciones.refrescarForeignKeysDescripcionesCargoInven(this.cargoinvens);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(CuentaContable.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//cargoinvenLogic.setCargoInvens(this.cargoinvens);
			cargoinvenLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public CargoInvenParameterReturnGeneral getCargoInvenParameterGeneral() {
		return this.cargoinvenParameterGeneral;
	}
	
	public void setCargoInvenParameterGeneral(CargoInvenParameterReturnGeneral cargoinvenParameterGeneral) {
		this.cargoinvenParameterGeneral = cargoinvenParameterGeneral;
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
	
	public Boolean getIsPermisoTodoCargoInven() {
		return isPermisoTodoCargoInven;
	}

	public void setIsPermisoTodoCargoInven(Boolean isPermisoTodoCargoInven) {
		this.isPermisoTodoCargoInven = isPermisoTodoCargoInven;
	}

	public Boolean getIsPermisoNuevoCargoInven() {
		return isPermisoNuevoCargoInven;
	}

	public void setIsPermisoNuevoCargoInven(Boolean isPermisoNuevoCargoInven) {
		this.isPermisoNuevoCargoInven = isPermisoNuevoCargoInven;
	}

	public Boolean getIsPermisoActualizarCargoInven() {
		return isPermisoActualizarCargoInven;
	}

	public void setIsPermisoActualizarCargoInven(Boolean isPermisoActualizarCargoInven) {
		this.isPermisoActualizarCargoInven = isPermisoActualizarCargoInven;
	}

	public Boolean getIsPermisoEliminarCargoInven() {
		return isPermisoEliminarCargoInven;
	}

	public void setIsPermisoEliminarCargoInven(Boolean isPermisoEliminarCargoInven) {
		this.isPermisoEliminarCargoInven = isPermisoEliminarCargoInven;
	}

	public Boolean getIsPermisoGuardarCambiosCargoInven() {
		return isPermisoGuardarCambiosCargoInven;
	}

	public void setIsPermisoGuardarCambiosCargoInven(Boolean isPermisoGuardarCambiosCargoInven) {
		this.isPermisoGuardarCambiosCargoInven = isPermisoGuardarCambiosCargoInven;
	}
	
	public Boolean getIsPermisoConsultaCargoInven() {
		return isPermisoConsultaCargoInven;
	}

	public void setIsPermisoConsultaCargoInven(Boolean isPermisoConsultaCargoInven) {
		this.isPermisoConsultaCargoInven = isPermisoConsultaCargoInven;
	}

	public Boolean getIsPermisoBusquedaCargoInven() {
		return isPermisoBusquedaCargoInven;
	}

	public void setIsPermisoBusquedaCargoInven(Boolean isPermisoBusquedaCargoInven) {
		this.isPermisoBusquedaCargoInven = isPermisoBusquedaCargoInven;
	}

	public Boolean getIsPermisoReporteCargoInven() {
		return isPermisoReporteCargoInven;
	}

	public void setIsPermisoReporteCargoInven(Boolean isPermisoReporteCargoInven) {
		this.isPermisoReporteCargoInven = isPermisoReporteCargoInven;
	}
	
	public Boolean getIsPermisoPaginacionMedioCargoInven() {
		return isPermisoPaginacionMedioCargoInven;
	}

	public void setIsPermisoPaginacionMedioCargoInven(Boolean isPermisoPaginacionMedioCargoInven) {
		this.isPermisoPaginacionMedioCargoInven = isPermisoPaginacionMedioCargoInven;
	}
	
	public Boolean getIsPermisoPaginacionTodoCargoInven() {
		return isPermisoPaginacionTodoCargoInven;
	}

	public void setIsPermisoPaginacionTodoCargoInven(Boolean isPermisoPaginacionTodoCargoInven) {
		this.isPermisoPaginacionTodoCargoInven = isPermisoPaginacionTodoCargoInven;
	}
	
	public Boolean getIsPermisoPaginacionAltoCargoInven() {
		return isPermisoPaginacionAltoCargoInven;
	}

	public void setIsPermisoPaginacionAltoCargoInven(Boolean isPermisoPaginacionAltoCargoInven) {
		this.isPermisoPaginacionAltoCargoInven = isPermisoPaginacionAltoCargoInven;
	}
	
	public Boolean getIsPermisoCopiarCargoInven() {
		return isPermisoCopiarCargoInven;
	}

	public void setIsPermisoCopiarCargoInven(Boolean isPermisoCopiarCargoInven) {
		this.isPermisoCopiarCargoInven = isPermisoCopiarCargoInven;
	}
	
	public Boolean getIsPermisoVerFormCargoInven() {
		return isPermisoVerFormCargoInven;
	}

	public void setIsPermisoVerFormCargoInven(Boolean isPermisoVerFormCargoInven) {
		this.isPermisoVerFormCargoInven = isPermisoVerFormCargoInven;
	}
	
	public Boolean getIsPermisoDuplicarCargoInven() {
		return isPermisoDuplicarCargoInven;
	}

	public void setIsPermisoDuplicarCargoInven(Boolean isPermisoDuplicarCargoInven) {
		this.isPermisoDuplicarCargoInven = isPermisoDuplicarCargoInven;
	}
	
	public Boolean getIsPermisoOrdenCargoInven() {
		return isPermisoOrdenCargoInven;
	}

	public void setIsPermisoOrdenCargoInven(Boolean isPermisoOrdenCargoInven) {
		this.isPermisoOrdenCargoInven = isPermisoOrdenCargoInven;
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
	
	public Boolean getIsVisibilidadCeldaNuevoCargoInven() {
		return isVisibilidadCeldaNuevoCargoInven;
	}

	public void setIsVisibilidadCeldaNuevoCargoInven(Boolean isVisibilidadCeldaNuevoCargoInven) {
		this.isVisibilidadCeldaNuevoCargoInven = isVisibilidadCeldaNuevoCargoInven;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCargoInven() {
		return isVisibilidadCeldaDuplicarCargoInven;
	}

	public void setIsVisibilidadCeldaDuplicarCargoInven(Boolean isVisibilidadCeldaDuplicarCargoInven) {
		this.isVisibilidadCeldaDuplicarCargoInven = isVisibilidadCeldaDuplicarCargoInven;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCargoInven() {
		return isVisibilidadCeldaCopiarCargoInven;
	}

	public void setIsVisibilidadCeldaCopiarCargoInven(Boolean isVisibilidadCeldaCopiarCargoInven) {
		this.isVisibilidadCeldaCopiarCargoInven = isVisibilidadCeldaCopiarCargoInven;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCargoInven() {
		return isVisibilidadCeldaVerFormCargoInven;
	}

	public void setIsVisibilidadCeldaVerFormCargoInven(Boolean isVisibilidadCeldaVerFormCargoInven) {
		this.isVisibilidadCeldaVerFormCargoInven = isVisibilidadCeldaVerFormCargoInven;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCargoInven() {
		return isVisibilidadCeldaOrdenCargoInven;
	}

	public void setIsVisibilidadCeldaOrdenCargoInven(Boolean isVisibilidadCeldaOrdenCargoInven) {
		this.isVisibilidadCeldaOrdenCargoInven = isVisibilidadCeldaOrdenCargoInven;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCargoInven() {
		return isVisibilidadCeldaNuevoRelacionesCargoInven;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCargoInven(Boolean isVisibilidadCeldaNuevoRelacionesCargoInven) {
		this.isVisibilidadCeldaNuevoRelacionesCargoInven = isVisibilidadCeldaNuevoRelacionesCargoInven;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCargoInven() {
		return isVisibilidadCeldaModificarCargoInven;
	}

	public void setIsVisibilidadCeldaModificarCargoInven(Boolean isVisibilidadCeldaModificarCargoInven) {
		this.isVisibilidadCeldaModificarCargoInven = isVisibilidadCeldaModificarCargoInven;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCargoInven() {
		return isVisibilidadCeldaActualizarCargoInven;
	}

	public void setIsVisibilidadCeldaActualizarCargoInven(Boolean isVisibilidadCeldaActualizarCargoInven) {
		this.isVisibilidadCeldaActualizarCargoInven = isVisibilidadCeldaActualizarCargoInven;
	}

	public Boolean getIsVisibilidadCeldaEliminarCargoInven() {
		return isVisibilidadCeldaEliminarCargoInven;
	}

	public void setIsVisibilidadCeldaEliminarCargoInven(Boolean isVisibilidadCeldaEliminarCargoInven) {
		this.isVisibilidadCeldaEliminarCargoInven = isVisibilidadCeldaEliminarCargoInven;
	}

	public Boolean getIsVisibilidadCeldaCancelarCargoInven() {
		return isVisibilidadCeldaCancelarCargoInven;
	}

	public void setIsVisibilidadCeldaCancelarCargoInven(Boolean isVisibilidadCeldaCancelarCargoInven) {
		this.isVisibilidadCeldaCancelarCargoInven = isVisibilidadCeldaCancelarCargoInven;
	}

	public Boolean getIsVisibilidadCeldaGuardarCargoInven() {
		return isVisibilidadCeldaGuardarCargoInven;
	}

	public void setIsVisibilidadCeldaGuardarCargoInven(Boolean isVisibilidadCeldaGuardarCargoInven) {
		this.isVisibilidadCeldaGuardarCargoInven = isVisibilidadCeldaGuardarCargoInven;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCargoInven() {
		return isVisibilidadCeldaGuardarCambiosCargoInven;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCargoInven(Boolean isVisibilidadCeldaGuardarCambiosCargoInven) {
		this.isVisibilidadCeldaGuardarCambiosCargoInven = isVisibilidadCeldaGuardarCambiosCargoInven;
	}
		
	public CargoInvenSessionBean getcargoinvenSessionBean() {
		return this.cargoinvenSessionBean;
	}
	
	public void setcargoinvenSessionBean(CargoInvenSessionBean cargoinvenSessionBean) {
		this.cargoinvenSessionBean=cargoinvenSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCargoInven() {
		return this.isVisibilidadFK_IdCargoInven;
	}

	public void setisVisibilidadFK_IdCargoInven(Boolean isVisibilidadFK_IdCargoInven) {
		this.isVisibilidadFK_IdCargoInven=isVisibilidadFK_IdCargoInven;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCargoInven(CargoInven cargoinven)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(cargoinven,null);
				this.setActualParaGuardarCuentaContableForeignKey(cargoinven,null);
				this.setActualParaGuardarCuentaContableCreditoForeignKey(cargoinven,null);
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
	
	public void bugActualizarReferenciaActual(CargoInven cargoinven,CargoInven cargoinvenAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCargoInven(cargoinven);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		cargoinvenAux.setId(cargoinven.getId());
		cargoinvenAux.setVersionRow(cargoinven.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessCargoInven();
		
			int intSelectedRow = this.jTableDatosCargoInven.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoinven =(CargoInven) this.cargoinvenLogic.getCargoInvens().toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.cargoinven =(CargoInven) this.cargoinvens.toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(CargoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualCargoInven(this.cargoinven,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysCargoInven(this.cargoinven);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = cargoinvenValidator.getInvalidValues(this.cargoinven);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			cargoinvenLogic.setDatosCliente(datosCliente);
			cargoinvenLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				cargoinvenAux=new  CargoInven();
				
				cargoinvenAux.setIsNew(true);
				cargoinvenAux.setIsChanged(true);
				
				cargoinvenAux.setCargoInvenOriginal(this.cargoinven);
				
				cargoinvenAux.setId(this.cargoinven.getId());	
				cargoinvenAux.setVersionRow(this.cargoinven.getVersionRow());	
				cargoinvenAux.setid_empresa(this.cargoinven.getid_empresa());	
				cargoinvenAux.setid_cuenta_contable(this.cargoinven.getid_cuenta_contable());	
				cargoinvenAux.setid_cuenta_contable_credito(this.cargoinven.getid_cuenta_contable_credito());	
				cargoinvenAux.setcon_sri(this.cargoinven.getcon_sri());	
				cargoinvenAux.setdescripcion(this.cargoinven.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cargoinvenSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cargoinvenSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(cargoinvenAux,cargoinvenLogic.getCargoInvens());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cargoinvenAux,cargoinvens);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.cargoinvenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cargoinvenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cargoinvenLogic.saveCargoInvens();//WithConnection
						//cargoinvenLogic.getSetVersionRowCargoInvens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.cargoinven,cargoinvenAux);
					
					this.refrescarForeignKeysDescripcionesCargoInven();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cargoinvenSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.cargoinvenSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cargoinvenLogic.saveCargoInvenRelaciones(cargoinvenAux);//WithConnection
								//cargoinvenLogic.getSetVersionRowCargoInvens();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.cargoinven,cargoinvenAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.cargoinvenSessionBean.getEstaModoGuardarRelaciones() 
									|| this.cargoinvenSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(cargoinvenAux,cargoinvenLogic.getCargoInvens());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(cargoinvenAux,cargoinvens);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.cargoinven,cargoinvenAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				cargoinvenAux=new  CargoInven();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.cargoinvenSessionBean.getEsGuardarRelacionado() 
					|| (this.cargoinvenSessionBean.getEsGuardarRelacionado() && this.cargoinven.getId()>=0)) {
						
					cargoinvenAux.setIsNew(false);
				}
				
				cargoinvenAux.setIsDeleted(false);
			
				cargoinvenAux.setId(this.cargoinven.getId());	
				cargoinvenAux.setVersionRow(this.cargoinven.getVersionRow());	
				cargoinvenAux.setid_empresa(this.cargoinven.getid_empresa());	
				cargoinvenAux.setid_cuenta_contable(this.cargoinven.getid_cuenta_contable());	
				cargoinvenAux.setid_cuenta_contable_credito(this.cargoinven.getid_cuenta_contable_credito());	
				cargoinvenAux.setcon_sri(this.cargoinven.getcon_sri());	
				cargoinvenAux.setdescripcion(this.cargoinven.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cargoinvenAux,cargoinvenLogic.getCargoInvens());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cargoinvenAux,cargoinvens);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.cargoinvenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cargoinvenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cargoinvenLogic.saveCargoInvens();//WithConnection
						//cargoinvenLogic.getSetVersionRowCargoInvens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.cargoinven,cargoinvenAux);
					
					this.refrescarForeignKeysDescripcionesCargoInven();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cargoinvenSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.cargoinvenSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cargoinvenLogic.saveCargoInvenRelaciones(cargoinvenAux);//WithConnection
								//cargoinvenLogic.getSetVersionRowCargoInvens();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.cargoinven,cargoinvenAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.cargoinvenSessionBean.getEstaModoGuardarRelaciones() 
									|| this.cargoinvenSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(cargoinvenAux,cargoinvenLogic.getCargoInvens());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(cargoinvenAux,cargoinvens);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.cargoinven,cargoinvenAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				cargoinvenAux=new  CargoInven();
				
				cargoinvenAux.setIsNew(false);
				cargoinvenAux.setIsChanged(false);
				
				cargoinvenAux.setIsDeleted(true);
				
				cargoinvenAux.setId(this.cargoinven.getId());	
				cargoinvenAux.setVersionRow(this.cargoinven.getVersionRow());	
				cargoinvenAux.setid_empresa(this.cargoinven.getid_empresa());	
				cargoinvenAux.setid_cuenta_contable(this.cargoinven.getid_cuenta_contable());	
				cargoinvenAux.setid_cuenta_contable_credito(this.cargoinven.getid_cuenta_contable_credito());	
				cargoinvenAux.setcon_sri(this.cargoinven.getcon_sri());	
				cargoinvenAux.setdescripcion(this.cargoinven.getdescripcion());	
				
				if(this.cargoinvenSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.cargoinvenAux.getId()>=0) {	
						this.cargoinvensEliminados.add(cargoinvenAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(cargoinvenAux,cargoinvenLogic.getCargoInvens());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cargoinvenAux,cargoinvens);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.cargoinvenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cargoinvenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cargoinvenLogic.saveCargoInvens();//WithConnection
						//cargoinvenLogic.getSetVersionRowCargoInvens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cargoinvenSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.cargoinvenSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cargoinvenLogic.saveCargoInvenRelaciones(cargoinvenAux);//WithConnection
								//cargoinvenLogic.getSetVersionRowCargoInvens();//WithConnection
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
							if(this.cargoinvenSessionBean.getEstaModoGuardarRelaciones() 
								|| this.cargoinvenSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(cargoinvenAux,cargoinvenLogic.getCargoInvens());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(cargoinvenAux,cargoinvens);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoinvenLogic.getCargoInvens().addAll(this.cargoinvensEliminados);
					
					cargoinvenLogic.saveCargoInvens();//WithConnection
					//cargoinvenLogic.getSetVersionRowCargoInvens();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesCargoInven();
				
				this.cargoinvensEliminados= new ArrayList<CargoInven>();		
			}
			
			if(this.cargoinvenSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cargoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Cargo Inventario GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Cargo Inventario",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.cargoinven=cargoinvenAux;
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
      		//this.finishProcessCargoInven();
      	}
		
	}	
	
	public void actualizarRelaciones(CargoInven cargoinvenLocal) throws Exception {
		
		if(this.cargoinvenSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(CargoInven cargoinvenLocal) throws Exception {	
		if(this.cargoinvenSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				cargoinvenLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontableBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontableBeanSwingJInternalFrameLocal.actualizarLista(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontablesForeignKey);

				cuentacontableBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				cargoinvenLocal.setCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContable();
				this.cargarCombosFrameCuentaContablesForeignKey("Formulario");
				this.setActualCuentaContableForeignKey(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontablecreditoBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontablecreditoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontablecreditoBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontablecreditoBeanSwingJInternalFrameLocal.actualizarLista(cuentacontablecreditoBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontablecreditosForeignKey);

				cuentacontablecreditoBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontablecreditoBeanSwingJInternalFrameLocal.cuentacontable);

				cargoinvenLocal.setCuentaContableCredito(cuentacontablecreditoBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContableCredito();
				this.cargarCombosFrameCuentaContableCreditosForeignKey("Formulario");
				this.setActualCuentaContableCreditoForeignKey(cuentacontablecreditoBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarCargoInvenActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCargoInven.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cargoinven =(CargoInven) this.cargoinvenLogic.getCargoInvens().toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.cargoinven =(CargoInven) this.cargoinvens.toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = cargoinvenValidator.getInvalidValues(this.cargoinven);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(CargoInven cargoinven,List<CargoInven> cargoinvens) throws Exception {
		try	{		
			CargoInvenConstantesFunciones.actualizarLista(cargoinven,cargoinvens,this.cargoinvenSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(CargoInven cargoinven,List<CargoInven> cargoinvens) throws Exception {
		try	{			
			CargoInvenConstantesFunciones.actualizarSelectedLista(cargoinven,cargoinvens);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<CargoInven> cargoinvensLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				cargoinvensLocal=this.cargoinvenLogic.getCargoInvens();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				cargoinvensLocal=this.cargoinvens;
			}
			//ARCHITECTURE
		
			for(CargoInven cargoinvenLocal:cargoinvensLocal) {
				if(this.permiteMantenimiento(cargoinvenLocal) && cargoinvenLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+CargoInvenConstantesFunciones.getCargoInvenLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CargoInvenConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargoInven.jLabelid_empresaCargoInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CargoInvenConstantesFunciones.IDCUENTACONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargoInven.jLabelid_cuenta_contableCargoInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CargoInvenConstantesFunciones.IDCUENTACONTABLECREDITO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargoInven.jLabelid_cuenta_contable_creditoCargoInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CargoInvenConstantesFunciones.CONSRI)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargoInven.jLabelcon_sriCargoInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CargoInvenConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargoInven.jLabeldescripcionCargoInven,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormCargoInven!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCargoInven.jLabelid_empresaCargoInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCargoInven.jLabelid_cuenta_contableCargoInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCargoInven.jLabelid_cuenta_contable_creditoCargoInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCargoInven.jLabelcon_sriCargoInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCargoInven.jLabeldescripcionCargoInven,"");
		
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
		this.iIdNuevoCargoInven--;	
		
		
		this.cargoinvenAux=new CargoInven();
		
		this.cargoinvenAux.setId(this.iIdNuevoCargoInven);
		this.cargoinvenAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cargoinvenLogic.getCargoInvens().add(this.cargoinvenAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.cargoinvens.add(this.cargoinvenAux);
		}
		//ARCHITECTURE
		
		this.cargoinven=this.cargoinvenAux;
		
		if(CargoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCargoInven(this.cargoinven);
			this.setVariablesObjetoActualToFormularioForeignKeyCargoInven(this.cargoinven);
		}
				
		//this.setDefaultControlesCargoInven();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCargoInven();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCargoInven();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCargoInven();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCargoInven(this.cargoinvenBean,this.cargoinven,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCargoInven(this.cargoinven);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(CargoInvenConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.cargoinvenSessionBean.getConGuardarRelaciones()) {
			classes=CargoInvenConstantesFunciones.getClassesRelationshipsOfCargoInven(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.cargoinvenReturnGeneral=cargoinvenLogic.procesarEventosCargoInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cargoinvenLogic.getCargoInvens(),this.cargoinven,this.cargoinvenParameterGeneral,this.isEsNuevoCargoInven,classes);//this.cargoinvenLogic.getCargoInven()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCargoInven(this.cargoinvenReturnGeneral,this.cargoinvenBean,false);
		
		if(this.cargoinvenReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCargoInven(this.cargoinvenReturnGeneral.getCargoInven());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCargoInven(this.cargoinvenReturnGeneral.getCargoInven());
		}
		
		if(this.cargoinvenReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCargoInven(this.cargoinvenReturnGeneral.getCargoInven(),classes);//this.cargoinvenBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCargoInven(this.cargoinven,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCargoInven();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCargoInven();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CargoInvenBeanSwingJInternalFrameAdditional.RecargarFormCargoInven(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCargoInven(false);
						
			if(cargoinvenSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(CargoInvenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCargoInven();
			}
			
			this.actualizarVisualTableDatosCargoInven();
			
			this.jTableDatosCargoInven.setRowSelectionInterval(this.getIndiceNuevoCargoInven(), this.getIndiceNuevoCargoInven());
			
			this.seleccionarFilaTablaCargoInvenActual();
						
			this.actualizarEstadoCeldasBotonesCargoInven("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCargoInven(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormCargoInven.jCheckBoxcon_sriCargoInven.setEnabled(isHabilitar && this.cargoinvenConstantesFunciones.activarcon_sriCargoInven);
		this.jInternalFrameDetalleFormCargoInven.jTextFielddescripcionCargoInven.setEnabled(isHabilitar && this.cargoinvenConstantesFunciones.activardescripcionCargoInven);	
		//
		this.jInternalFrameDetalleFormCargoInven.jComboBoxid_empresaCargoInven.setEnabled(isHabilitar && this.cargoinvenConstantesFunciones.activarid_empresaCargoInven);
		this.jInternalFrameDetalleFormCargoInven.jComboBoxid_cuenta_contableCargoInven.setEnabled(isHabilitar && this.cargoinvenConstantesFunciones.activarid_cuenta_contableCargoInven);
		this.jInternalFrameDetalleFormCargoInven.jComboBoxid_cuenta_contable_creditoCargoInven.setEnabled(isHabilitar && this.cargoinvenConstantesFunciones.activarid_cuenta_contable_creditoCargoInven);
	};
	
	public void setDefaultControlesCargoInven() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCargoInven(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.cargoinvenSessionBean.setConGuardarRelaciones(true);			
			this.cargoinvenSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCargoInven.jTabbedPaneRelacionesCargoInven.setVisible(true);
			
					
		} else {
			//this.cargoinvenSessionBean.setConGuardarRelaciones(false);			
			this.cargoinvenSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCargoInven.jTabbedPaneRelacionesCargoInven.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoCargoInven() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CargoInven cargoinvenAux:this.cargoinvenLogic.getCargoInvens()) {
				if(cargoinvenAux.getId().equals(this.iIdNuevoCargoInven)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CargoInven cargoinvenAux:this.cargoinvens) {
				if(cargoinvenAux.getId().equals(this.iIdNuevoCargoInven)) {
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
	
	public int getIndiceActualCargoInven(CargoInven cargoinven,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CargoInven cargoinvenAux:this.cargoinvenLogic.getCargoInvens()) {
				if(cargoinvenAux.getId().equals(cargoinven.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CargoInven cargoinvenAux:this.cargoinvens) {
				if(cargoinvenAux.getId().equals(cargoinven.getId())) {
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
	
	public void setCamposBaseDesdeOriginalCargoInven(CargoInven cargoinvenOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CargoInven cargoinvenAux:this.cargoinvenLogic.getCargoInvens()) {
				if(cargoinvenAux.getCargoInvenOriginal().getId().equals(cargoinvenOriginal.getId())) {
					existe=true;
					cargoinvenOriginal.setId(cargoinvenAux.getId());
					cargoinvenOriginal.setVersionRow(cargoinvenAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CargoInven cargoinvenAux:this.cargoinvens) {
				if(cargoinvenAux.getCargoInvenOriginal().getId().equals(cargoinvenOriginal.getId())) {
					existe=true;
					cargoinvenOriginal.setId(cargoinvenAux.getId());
					cargoinvenOriginal.setVersionRow(cargoinvenAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCargoInven(Boolean esParaCancelar) throws Exception {
		cargoinvensAux=new ArrayList<CargoInven>();
		cargoinvenAux=new CargoInven();
		
		if(!this.cargoinvenSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CargoInven cargoinvenAux:this.cargoinvenLogic.getCargoInvens()) {
					if(cargoinvenAux.getId()<0) {
						cargoinvensAux.add(cargoinvenAux);
					}		
				}
				this.iIdNuevoCargoInven=0L;
				this.cargoinvenLogic.getCargoInvens().removeAll(cargoinvensAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CargoInven cargoinvenAux:this.cargoinvens) {
					if(cargoinvenAux.getId()<0) {
						cargoinvensAux.add(cargoinvenAux);
					}		
				}
				this.iIdNuevoCargoInven=0L;
				this.cargoinvens.removeAll(cargoinvensAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCargoInven 
					&& this.cargoinvenLogic.getCargoInvens().size()>0
					) {
					cargoinvenAux=this.cargoinvenLogic.getCargoInvens().get(this.cargoinvenLogic.getCargoInvens().size() - 1);
				
					if(cargoinvenAux.getId()<0) {
						this.cargoinvenLogic.getCargoInvens().remove(cargoinvenAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCargoInven && this.cargoinvens.size()>0) {
					cargoinvenAux=this.cargoinvens.get(this.cargoinvens.size() - 1);
				
					if(cargoinvenAux.getId()<0) {
						this.cargoinvens.remove(cargoinvenAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCargoInven(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(cargoinven.getId()<0) {
				this.cargoinvenLogic.getCargoInvens().remove(this.cargoinven);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(cargoinven.getId()<0) {
				this.cargoinvens.remove(this.cargoinven);
			}
		}			
	}
	
	public void setEstadosInicialesCargoInven(List<CargoInven> cargoinvensAux) throws Exception {
		CargoInvenConstantesFunciones.setEstadosInicialesCargoInven(cargoinvensAux);
	}
	
	public void setEstadosInicialesCargoInven(CargoInven cargoinvenAux) throws Exception {
		CargoInvenConstantesFunciones.setEstadosInicialesCargoInven(cargoinvenAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCargoInvenActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCargoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCargoInvenActual()) {
				if(!this.isEsNuevoCargoInven) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCargoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCargoInven=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCargoInvenActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Cargo Inventario ?", "MANTENIMIENTO DE Cargo Inventario", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCargoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(CargoInven cargoinven) throws Exception {
		CargoInvenConstantesFunciones.seleccionarAsignar(this.cargoinven,cargoinven);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCargoInven=this.isPermisoActualizarOriginalCargoInven;
			
			
			this.seleccionarAsignar(cargoinven);
			
			

			idCuentaContableActual=cargoinven.getid_cuenta_contable();
			this.seleccionarCuentaContableActual();

			idCuentaContableCreditoActual=cargoinven.getid_cuenta_contable_credito();
			this.seleccionarCuentaContableCreditoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CargoInvenConstantesFunciones.quitarEspaciosCargoInven(this.cargoinven,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesCargoInven("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.cargoinvenSessionBean.setsFuncionBusquedaRapida(this.cargoinvenSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarCuentaContableActual() throws Exception {
		try	{
			CuentaContable cuentacontableAux=new CuentaContable();

			if(this.idCuentaContableActual != null && this.idCuentaContableActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontableLogic.getEntityWithConnection(this.idCuentaContableActual);
					cuentacontableAux= cuentacontableLogic.getCuentaContable();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				cuentacontablesForeignKey=new ArrayList<CuentaContable>();
				cuentacontablesForeignKey.add(cuentacontableAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
	public void seleccionarCuentaContableCreditoActual() throws Exception {
		try	{
			CuentaContable cuentacontablecreditoAux=new CuentaContable();

			if(this.idCuentaContableCreditoActual != null && this.idCuentaContableCreditoActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontablecreditoLogic.getEntityWithConnection(this.idCuentaContableCreditoActual);
					cuentacontablecreditoAux= cuentacontablecreditoLogic.getCuentaContable();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				cuentacontablecreditosForeignKey=new ArrayList<CuentaContable>();
				cuentacontablecreditosForeignKey.add(cuentacontablecreditoAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoCargoInven) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCargoInven(esParaCancelar);				
				this.cancelarNuevoCargoInven(esParaCancelar);								
			}
			
			this.cargoinven=new CargoInven();
			
			this.inicializarCargoInven();
			
			this.actualizarEstadoCeldasBotonesCargoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCargoInven() throws Exception {
		try {
			CargoInvenConstantesFunciones.inicializarCargoInven(this.cargoinven);
			
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
			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.cargoinvenLogic.getCargoInvens().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCargoInvens(String sAccionBusqueda,List<CargoInven> cargoinvensParaReportes) throws Exception {
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
					sPathReporteFinal="CargoInven"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CargoInvenMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CargoInvenMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="CargoInven"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Cargo Inventarioes");		
		parameters.put("busquedapor", CargoInvenConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCargoInven=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CargoInvenConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CargoInvenConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCargoInven=new JRBeanArrayDataSource(CargoInvenJInternalFrame.TraerCargoInvenBeans(cargoinvensParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCargoInven);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CargoInvenConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CargoInvenConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CargoInvenBean.TraerCargoInvenBeans(cargoinvensParaReportes).toArray()));
							
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
				this.generarExcelReporteCargoInvens(sAccionBusqueda,sTipoArchivoReporte,cargoinvensParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCargoInvens(sAccionBusqueda,sTipoArchivoReporte,cargoinvensParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCargoInvenActionPerformed(null);
					//this.generarExcelReporteCargoInvens(sAccionBusqueda,sTipoArchivoReporte,cargoinvensParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCargoInvens(sAccionBusqueda,sTipoArchivoReporte,cargoinvensParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCargoInvens(sAccionBusqueda,sTipoArchivoReporte,cargoinvensParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCargoInvens(sAccionBusqueda,sTipoArchivoReporte,cargoinvensParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCargoInvens(String sAccionBusqueda,String sTipoArchivoReporte,List<CargoInven> cargoinvensParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cargoinven";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CargoInvens");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCargoInven("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(CargoInven cargoinven : cargoinvensParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CargoInvenConstantesFunciones.generarExcelReporteDataCargoInven("NORMAL",row,workbook,cargoinven,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cargoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cargo Inventario",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCargoInven(String sTipo,Row row,Workbook workbook) {
		
		CargoInvenConstantesFunciones.generarExcelReporteHeaderCargoInven(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCargoInvens(String sAccionBusqueda,String sTipoArchivoReporte,List<CargoInven> cargoinvensParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cargoinven_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CargoInvens");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(CargoInven cargoinven : cargoinvensParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CargoInvenConstantesFunciones.getCargoInvenDescripcion(cargoinven));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CargoInvenConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CargoInvenConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cargoinven.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CargoInvenConstantesFunciones.LABEL_IDCUENTACONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CargoInvenConstantesFunciones.LABEL_IDCUENTACONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cargoinven.getcuentacontable_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CargoInvenConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CargoInvenConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cargoinven.getcuentacontablecredito_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CargoInvenConstantesFunciones.LABEL_CONSRI))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CargoInvenConstantesFunciones.LABEL_CONSRI);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(cargoinven.getcon_sri()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CargoInvenConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CargoInvenConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cargoinven.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cargoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cargo Inventario",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCargoInvens(String sAccionBusqueda,String sTipoArchivoReporte,List<CargoInven> cargoinvensParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<CargoInven> cargoinvensRespaldo=null;
		
		classes=CargoInvenConstantesFunciones.getClassesRelationshipsOfCargoInven(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.cargoinvenLogic.setDatosCliente(this.datosCliente);
		this.cargoinvenLogic.setDatosDeep(this.datosDeep);
		this.cargoinvenLogic.setIsConDeep(true);
		
		cargoinvensRespaldo=this.cargoinvenLogic.getCargoInvens();
		
		this.cargoinvenLogic.setCargoInvens(cargoinvensParaReportes);	
		this.cargoinvenLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		cargoinvensParaReportes=this.cargoinvenLogic.getCargoInvens();
		this.cargoinvenLogic.setCargoInvens(cargoinvensRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cargoinven_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CargoInvens");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCargoInven("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(CargoInven cargoinven : cargoinvensParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCargoInven("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CargoInvenConstantesFunciones.generarExcelReporteDataCargoInven("NORMAL",row,workbook,cargoinven,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(CargoInvenConstantesFunciones.getCargoInvenDescripcion(cargoinven));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cargoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cargo Inventario",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCargoInven.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCargoInven.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoCargoInven.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCargoInven.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCargoInven() throws Exception {		
		this.startProcessCargoInven(true);
	}
	
	public void startProcessCargoInven(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasCargoInven ,this.jPanelParametrosReportesCargoInven, this.jScrollPanelDatosCargoInven,this.jPanelPaginacionCargoInven, this.jScrollPanelDatosEdicionCargoInven, this.jPanelAccionesCargoInven,this.jPanelAccionesFormularioCargoInven,this.jmenuBarCargoInven,this.jmenuBarDetalleCargoInven,this.jTtoolBarCargoInven,this.jTtoolBarDetalleCargoInven);		
		
		final JTabbedPane jTabbedPaneBusquedasCargoInven=this.jTabbedPaneBusquedasCargoInven; 
		
		final JPanel jPanelParametrosReportesCargoInven=this.jPanelParametrosReportesCargoInven;
		//final JScrollPane jScrollPanelDatosCargoInven=this.jScrollPanelDatosCargoInven;
		final JTable jTableDatosCargoInven=this.jTableDatosCargoInven;		
		final JPanel jPanelPaginacionCargoInven=this.jPanelPaginacionCargoInven;
		//final JScrollPane jScrollPanelDatosEdicionCargoInven=this.jScrollPanelDatosEdicionCargoInven;
		final JPanel jPanelAccionesCargoInven=this.jPanelAccionesCargoInven;
		
		JPanel jPanelCamposAuxiliarCargoInven=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCargoInven=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCargoInven!=null) {
			jPanelCamposAuxiliarCargoInven=this.jInternalFrameDetalleFormCargoInven.jPanelCamposCargoInven;
			jPanelAccionesFormularioAuxiliarCargoInven=this.jInternalFrameDetalleFormCargoInven.jPanelAccionesFormularioCargoInven;
		}
		
		final JPanel jPanelCamposCargoInven=jPanelCamposAuxiliarCargoInven;
		final JPanel jPanelAccionesFormularioCargoInven=jPanelAccionesFormularioAuxiliarCargoInven;
		
		
		final JMenuBar jmenuBarCargoInven=this.jmenuBarCargoInven;
		final JToolBar jTtoolBarCargoInven=this.jTtoolBarCargoInven;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCargoInven=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCargoInven=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCargoInven!=null) {
			jmenuBarDetalleAuxiliarCargoInven=this.jInternalFrameDetalleFormCargoInven.jmenuBarDetalleCargoInven;
			jTtoolBarDetalleAuxiliarCargoInven=this.jInternalFrameDetalleFormCargoInven.jTtoolBarDetalleCargoInven;
		}
		
		final JMenuBar jmenuBarDetalleCargoInven=jmenuBarDetalleAuxiliarCargoInven;
		final JToolBar jTtoolBarDetalleCargoInven=jTtoolBarDetalleAuxiliarCargoInven;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCargoInven;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCargoInven;
			processRunnable.jTableDatos=jTableDatosCargoInven;
			processRunnable.jPanelCampos=jPanelCamposCargoInven;
			processRunnable.jPanelPaginacion=jPanelPaginacionCargoInven;
			processRunnable.jPanelAcciones=jPanelAccionesCargoInven;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCargoInven;
			
			
			processRunnable.jmenuBar=jmenuBarCargoInven;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCargoInven;
			processRunnable.jTtoolBar=jTtoolBarCargoInven;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCargoInven;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCargoInven ,jPanelParametrosReportesCargoInven,jTableDatosCargoInven, /*jScrollPanelDatosCargoInven,*/jPanelCamposCargoInven,jPanelPaginacionCargoInven, /*jScrollPanelDatosEdicionCargoInven,*/ jPanelAccionesCargoInven,jPanelAccionesFormularioCargoInven,jmenuBarCargoInven,jmenuBarDetalleCargoInven,jTtoolBarCargoInven,jTtoolBarDetalleCargoInven);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCargoInven ,jPanelParametrosReportesCargoInven, jScrollPanelDatosCargoInven,jPanelPaginacionCargoInven, jScrollPanelDatosEdicionCargoInven, jPanelAccionesCargoInven,jPanelAccionesFormularioCargoInven,jmenuBarCargoInven,jmenuBarDetalleCargoInven,jTtoolBarCargoInven,jTtoolBarDetalleCargoInven);
						
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
	
	public void finishProcessCargoInven() {// throws Exception 
		this.finishProcessCargoInven(true);
	}
	
	public void finishProcessCargoInven(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasCargoInven ,this.jPanelParametrosReportesCargoInven, this.jScrollPanelDatosCargoInven,this.jPanelPaginacionCargoInven, this.jScrollPanelDatosEdicionCargoInven, this.jPanelAccionesCargoInven,this.jPanelAccionesFormularioCargoInven,this.jmenuBarCargoInven,this.jmenuBarDetalleCargoInven,this.jTtoolBarCargoInven,this.jTtoolBarDetalleCargoInven);		
		
		final JTabbedPane jTabbedPaneBusquedasCargoInven=this.jTabbedPaneBusquedasCargoInven; 
		
		final JPanel jPanelParametrosReportesCargoInven=this.jPanelParametrosReportesCargoInven;
		//final JScrollPane jScrollPanelDatosCargoInven=this.jScrollPanelDatosCargoInven;
		final JTable jTableDatosCargoInven=this.jTableDatosCargoInven;		
		final JPanel jPanelPaginacionCargoInven=this.jPanelPaginacionCargoInven;
		//final JScrollPane jScrollPanelDatosEdicionCargoInven=this.jScrollPanelDatosEdicionCargoInven;
		final JPanel jPanelAccionesCargoInven=this.jPanelAccionesCargoInven;
		
		JPanel jPanelCamposAuxiliarCargoInven=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCargoInven=new JPanel();
		
		if(this.jInternalFrameDetalleFormCargoInven!=null) {
			jPanelCamposAuxiliarCargoInven=this.jInternalFrameDetalleFormCargoInven.jPanelCamposCargoInven;
			jPanelAccionesFormularioAuxiliarCargoInven=this.jInternalFrameDetalleFormCargoInven.jPanelAccionesFormularioCargoInven;
		}
		
		final JPanel jPanelCamposCargoInven=jPanelCamposAuxiliarCargoInven;
		final JPanel jPanelAccionesFormularioCargoInven=jPanelAccionesFormularioAuxiliarCargoInven;
		
		
		final JMenuBar jmenuBarCargoInven=this.jmenuBarCargoInven;		
		final JToolBar jTtoolBarCargoInven=this.jTtoolBarCargoInven;
				
		JMenuBar jmenuBarDetalleAuxiliarCargoInven=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCargoInven=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCargoInven!=null) {
			jmenuBarDetalleAuxiliarCargoInven=this.jInternalFrameDetalleFormCargoInven.jmenuBarDetalleCargoInven;
			jTtoolBarDetalleAuxiliarCargoInven=this.jInternalFrameDetalleFormCargoInven.jTtoolBarDetalleCargoInven;		
		}
		
		final JMenuBar jmenuBarDetalleCargoInven=jmenuBarDetalleAuxiliarCargoInven;
		final JToolBar jTtoolBarDetalleCargoInven=jTtoolBarDetalleAuxiliarCargoInven;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCargoInven;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCargoInven;
			processRunnable.jTableDatos=jTableDatosCargoInven;
			processRunnable.jPanelCampos=jPanelCamposCargoInven;
			processRunnable.jPanelPaginacion=jPanelPaginacionCargoInven;
			processRunnable.jPanelAcciones=jPanelAccionesCargoInven;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCargoInven;
			
			
			processRunnable.jmenuBar=jmenuBarCargoInven;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCargoInven;
			processRunnable.jTtoolBar=jTtoolBarCargoInven;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCargoInven;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCargoInven ,jPanelParametrosReportesCargoInven, jTableDatosCargoInven,/*jScrollPanelDatosCargoInven,*/jPanelCamposCargoInven,jPanelPaginacionCargoInven, /*jScrollPanelDatosEdicionCargoInven,*/ jPanelAccionesCargoInven,jPanelAccionesFormularioCargoInven,jmenuBarCargoInven,jmenuBarDetalleCargoInven,jTtoolBarCargoInven,jTtoolBarDetalleCargoInven));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCargoInven(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCargoInven(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCargoInven(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCargoInven(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCargoInven,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCargoInven,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCargoInven(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCargoInven,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCargoInven,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.cargoinvenConstantesFunciones.getsFinalQueryCargoInven();
		String  finalQueryPaginacionTodos=this.cargoinvenConstantesFunciones.getsFinalQueryCargoInven();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=CargoInvenConstantesFunciones.getArrayColumnasGlobalesNoCargoInven(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CargoInvenConstantesFunciones.getArrayColumnasGlobalesCargoInven(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CargoInvenConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.cargoinvensEliminados= new ArrayList<CargoInven>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCargoInven();
		
				///*CargoInvenSessionBean*/this.cargoinvenSessionBean=new CargoInvenSessionBean();
			
			if(this.cargoinvenSessionBean==null) {
				this.cargoinvenSessionBean=new CargoInvenSessionBean();
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
					this.iNumeroPaginacion=CargoInvenConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CargoInvenConstantesFunciones.getClassesForeignKeysOfCargoInven(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/cargoinven."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			cargoinvensAux= new ArrayList<CargoInven>();
			
				
			cargoinvenLogic.setDatosCliente(this.datosCliente);
			cargoinvenLogic.setDatosDeep(this.datosDeep);
			cargoinvenLogic.setIsConDeep(true);
			
			
			cargoinvenLogic.getCargoInvenDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					cargoinvenLogic.getTodosCargoInvens(finalQueryGlobal,pagination);
					
					//cargoinvenLogic.getTodosCargoInvensWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(cargoinvenLogic.getCargoInvens()==null|| cargoinvenLogic.getCargoInvens().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cargoinvensAux= new ArrayList<CargoInven>();
							cargoinvensAux.addAll(cargoinvenLogic.getCargoInvens());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cargoinvensAux= new ArrayList<CargoInven>();
							cargoinvensAux.addAll(cargoinvens);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cargoinvenLogic.getTodosCargoInvens(finalQueryGlobal+"",this.pagination);												
							
							//cargoinvenLogic.getTodosCargoInvensWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteCargoInvens("Todos",cargoinvenLogic.getCargoInvens() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cargoinvenLogic.setCargoInvens(new ArrayList<CargoInven>());					
							cargoinvenLogic.getCargoInvens().addAll(cargoinvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cargoinvens=new ArrayList<CargoInven>();
							cargoinvens.addAll(cargoinvensAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idCargoInven=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idCargoInven=this.idActual;
				
				} else if(this.idCargoInvenActual!=null && this.idCargoInvenActual!=0L) {
					idCargoInven=idCargoInvenActual;
				}
				
					
				this.sDetalleReporte=CargoInvenConstantesFunciones.getDetalleIndicePorId(idCargoInven);
				
				this.cargoinvens=new ArrayList<CargoInven>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					cargoinvenLogic.getEntity(idCargoInven);
					
					//cargoinvenLogic.getEntityWithConnection(idCargoInven);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cargoinvenLogic.setCargoInvens(new ArrayList<CargoInven>());
					cargoinvenLogic.getCargoInvens().add(cargoinvenLogic.getCargoInven());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cargoinvens=new ArrayList<CargoInven>();
					this.cargoinvens.add(cargoinven);
				}
				
				if(cargoinvenLogic.getCargoInven()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCargoInven")) {
				this.sDetalleReporte=CargoInvenConstantesFunciones.getDetalleIndiceFK_IdCargoInven(id_cuenta_contable_creditoFK_IdCargoInven);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cargoinvenLogic.getCargoInvensFK_IdCargoInven(finalQueryGlobal,pagination,id_cuenta_contable_creditoFK_IdCargoInven);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CargoInvenConstantesFunciones.getDetalleIndiceFK_IdCargoInven(id_cuenta_contable_creditoFK_IdCargoInven);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CargoInvenConstantesFunciones.getDetalleIndiceFK_IdCargoInven(id_cuenta_contable_creditoFK_IdCargoInven);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cargoinvenLogic.getCargoInvens()==null||cargoinvenLogic.getCargoInvens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cargoinvens==null|| cargoinvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cargoinvensAux=new ArrayList<CargoInven>();
						cargoinvensAux.addAll(cargoinvenLogic.getCargoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cargoinvensAux=new ArrayList<CargoInven>();
							cargoinvensAux.addAll(cargoinvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cargoinvenLogic.getCargoInvensFK_IdCargoInven(finalQueryGlobal,pagination,id_cuenta_contable_creditoFK_IdCargoInven);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CargoInvenConstantesFunciones.getDetalleIndiceFK_IdCargoInven(id_cuenta_contable_creditoFK_IdCargoInven);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CargoInvenConstantesFunciones.getDetalleIndiceFK_IdCargoInven(id_cuenta_contable_creditoFK_IdCargoInven);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCargoInvens("FK_IdCargoInven",cargoinvenLogic.getCargoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCargoInvens("FK_IdCargoInven",cargoinvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cargoinvenLogic.setCargoInvens(new ArrayList<CargoInven>());
						cargoinvenLogic.getCargoInvens().addAll(cargoinvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cargoinvens=new ArrayList<CargoInven>();
							cargoinvens.addAll(cargoinvensAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdCuentaContable")) {
				this.sDetalleReporte=CargoInvenConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cargoinvenLogic.getCargoInvensFK_IdCuentaContable(finalQueryGlobal,pagination,id_cuenta_contableFK_IdCuentaContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CargoInvenConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CargoInvenConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cargoinvenLogic.getCargoInvens()==null||cargoinvenLogic.getCargoInvens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cargoinvens==null|| cargoinvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cargoinvensAux=new ArrayList<CargoInven>();
						cargoinvensAux.addAll(cargoinvenLogic.getCargoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cargoinvensAux=new ArrayList<CargoInven>();
							cargoinvensAux.addAll(cargoinvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cargoinvenLogic.getCargoInvensFK_IdCuentaContable(finalQueryGlobal,pagination,id_cuenta_contableFK_IdCuentaContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CargoInvenConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CargoInvenConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCargoInvens("FK_IdCuentaContable",cargoinvenLogic.getCargoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCargoInvens("FK_IdCuentaContable",cargoinvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cargoinvenLogic.setCargoInvens(new ArrayList<CargoInven>());
						cargoinvenLogic.getCargoInvens().addAll(cargoinvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cargoinvens=new ArrayList<CargoInven>();
							cargoinvens.addAll(cargoinvensAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=CargoInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cargoinvenLogic.getCargoInvensFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CargoInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CargoInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cargoinvenLogic.getCargoInvens()==null||cargoinvenLogic.getCargoInvens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cargoinvens==null|| cargoinvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cargoinvensAux=new ArrayList<CargoInven>();
						cargoinvensAux.addAll(cargoinvenLogic.getCargoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cargoinvensAux=new ArrayList<CargoInven>();
							cargoinvensAux.addAll(cargoinvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cargoinvenLogic.getCargoInvensFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CargoInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CargoInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCargoInvens("FK_IdEmpresa",cargoinvenLogic.getCargoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCargoInvens("FK_IdEmpresa",cargoinvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cargoinvenLogic.setCargoInvens(new ArrayList<CargoInven>());
						cargoinvenLogic.getCargoInvens().addAll(cargoinvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cargoinvens=new ArrayList<CargoInven>();
							cargoinvens.addAll(cargoinvensAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCargoInven();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCargoInven();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cargoinvenLogic.getCargoInvens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cargoinvens.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cargoinvenLogic.getCargoInvens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cargoinvens.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(CargoInven cargoinven) {
		Boolean permite=true;
		
		if(this.cargoinven.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CargoInvenConstantesFunciones.getOrderByListaCargoInven();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CargoInvenConstantesFunciones.getOrderByListaCargoInven();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CargoInven cargoinven:cargoinvenLogic.getCargoInvens()) {
				if(cargoinven.getsType().equals(Constantes2.S_TOTALES)) {
					cargoinvenTotales=cargoinven;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CargoInven cargoinven:this.cargoinvens) {
				if(cargoinven.getsType().equals(Constantes2.S_TOTALES)) {
					cargoinvenTotales=cargoinven;
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
			this.cargoinvenAux=new CargoInven();
			this.cargoinvenAux.setsType(Constantes2.S_TOTALES);
			this.cargoinvenAux.setIsNew(false);
			this.cargoinvenAux.setIsChanged(false);
			this.cargoinvenAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				CargoInvenConstantesFunciones.TotalizarValoresFilaCargoInven(this.cargoinvenLogic.getCargoInvens(),this.cargoinvenAux);
				
				this.cargoinvenLogic.getCargoInvens().add(this.cargoinvenAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CargoInvenConstantesFunciones.TotalizarValoresFilaCargoInven(this.cargoinvens,this.cargoinvenAux);
				
				this.cargoinvens.add(this.cargoinvenAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		cargoinvenTotales=new CargoInven();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cargoinvenLogic.getCargoInvens().remove(cargoinvenTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cargoinvens.remove(cargoinvenTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		cargoinvenTotales=new CargoInven();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CargoInven cargoinven:cargoinvenLogic.getCargoInvens()) {
				if(cargoinven.getsType().equals(Constantes2.S_TOTALES)) {
					cargoinvenTotales=cargoinven;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CargoInvenConstantesFunciones.TotalizarValoresFilaCargoInven(this.cargoinvenLogic.getCargoInvens(),cargoinvenTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CargoInven cargoinven:this.cargoinvens) {
				if(cargoinven.getsType().equals(Constantes2.S_TOTALES)) {
					cargoinvenTotales=cargoinven;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CargoInvenConstantesFunciones.TotalizarValoresFilaCargoInven(this.cargoinvens,cargoinvenTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getCargoInvensFK_IdCargoInven()throws Exception {
		try {
			sAccionBusqueda="FK_IdCargoInven";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCargoInvensFK_IdCuentaContable()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaContable";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCargoInvensFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getCargoInvensFK_IdCargoInven(String sFinalQuery,Long id_cuenta_contable_credito)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cargoinvenLogic.getCargoInvensFK_IdCargoInven(sFinalQuery,this.pagination,id_cuenta_contable_credito);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCargoInvensFK_IdCuentaContable(String sFinalQuery,Long id_cuenta_contable)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cargoinvenLogic.getCargoInvensFK_IdCuentaContable(sFinalQuery,this.pagination,id_cuenta_contable);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCargoInvensFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cargoinvenLogic.getCargoInvensFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosCargoInven() {
		this.isPermisoTodoCargoInven=false;
		this.isPermisoNuevoCargoInven=false;
		this.isPermisoActualizarCargoInven=false;
		this.isPermisoActualizarOriginalCargoInven=false;
		this.isPermisoEliminarCargoInven=false;
		this.isPermisoGuardarCambiosCargoInven=false;
		this.isPermisoConsultaCargoInven=false;
		this.isPermisoBusquedaCargoInven=false;
		this.isPermisoReporteCargoInven=false;		
		this.isPermisoOrdenCargoInven=false;		
		this.isPermisoPaginacionMedioCargoInven=false;		
		this.isPermisoPaginacionAltoCargoInven=false;
		this.isPermisoPaginacionTodoCargoInven=false;
		this.isPermisoCopiarCargoInven=false;		
		this.isPermisoVerFormCargoInven=false;		
		this.isPermisoDuplicarCargoInven=false;		
		this.isPermisoOrdenCargoInven=false;		
	}
	
	public void setPermisosUsuarioCargoInven(Boolean isPermiso) {
		this.isPermisoTodoCargoInven=isPermiso;
		this.isPermisoNuevoCargoInven=isPermiso;
		this.isPermisoActualizarCargoInven=isPermiso;
		this.isPermisoActualizarOriginalCargoInven=isPermiso;
		this.isPermisoEliminarCargoInven=isPermiso;
		this.isPermisoGuardarCambiosCargoInven=isPermiso;
		this.isPermisoConsultaCargoInven=isPermiso;
		this.isPermisoBusquedaCargoInven=isPermiso;
		this.isPermisoReporteCargoInven=isPermiso;
		this.isPermisoOrdenCargoInven=isPermiso;		
		this.isPermisoPaginacionMedioCargoInven=isPermiso;		
		this.isPermisoPaginacionAltoCargoInven=isPermiso;		
		this.isPermisoPaginacionTodoCargoInven=isPermiso;		
		this.isPermisoCopiarCargoInven=isPermiso;		
		this.isPermisoVerFormCargoInven=isPermiso;		
		this.isPermisoDuplicarCargoInven=isPermiso;
		this.isPermisoOrdenCargoInven=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCargoInven(Boolean isPermiso) {
		//this.isPermisoTodoCargoInven=isPermiso;
		this.isPermisoNuevoCargoInven=isPermiso;
		this.isPermisoActualizarCargoInven=isPermiso;
		this.isPermisoActualizarOriginalCargoInven=isPermiso;
		this.isPermisoEliminarCargoInven=isPermiso;
		this.isPermisoGuardarCambiosCargoInven=isPermiso;
		//this.isPermisoConsultaCargoInven=isPermiso;
		//this.isPermisoBusquedaCargoInven=isPermiso;
		//this.isPermisoReporteCargoInven=isPermiso;
		//this.isPermisoOrdenCargoInven=isPermiso;		
		//this.isPermisoPaginacionMedioCargoInven=isPermiso;		
		//this.isPermisoPaginacionAltoCargoInven=isPermiso;		
		//this.isPermisoPaginacionTodoCargoInven=isPermiso;		
		//this.isPermisoCopiarCargoInven=isPermiso;		
		//this.isPermisoDuplicarCargoInven=isPermiso;
		//this.isPermisoOrdenCargoInven=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCargoInvenClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(CargoInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebCargoInven(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCargoInvenClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioCargoInvenClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCargoInvenClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCargoInvenClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioCargoInven() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CargoInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.cargoinvenSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CargoInvenConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCargoInven=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCargoInven=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCargoInven=this.isPermisoActualizarCargoInven;
			this.isPermisoEliminarCargoInven=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCargoInven=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCargoInven=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCargoInven=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCargoInven=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCargoInven=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCargoInven=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCargoInven=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCargoInven=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCargoInven=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCargoInven=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCargoInven=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCargoInven=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCargoInven=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.cargoinvenSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCargoInven.setToolTipText(this.jTableDatosCargoInven.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCargoInven(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCargoInven(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CargoInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(CargoInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioCargoInven() throws Exception {
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
	public void inicializarCombosForeignKeyCargoInvenListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.cuentacontablesForeignKey=new ArrayList();
				this.cuentacontablecreditosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCargoInvenListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CargoInvenJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyCargoInvenListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCuentaContableListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCuentaContableCreditoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyCuentaContableCreditoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.cuentacontablecreditosForeignKey==null||this.cuentacontablecreditosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CuentaContableConstantesFunciones.SFINALQUERY;

				this.cargarCombosCuentaContableCreditosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyCargoInvenListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			CargoInvenParameterReturnGeneral cargoinvenReturnGeneral=new CargoInvenParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.cargoinvenConstantesFunciones.cargarid_empresaCargoInven)
					 || (this.esRecargarFks && this.cargoinvenConstantesFunciones.cargarid_empresaCargoInven)) {

					if(!this.cargoinvenSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+cargoinvenSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalCuentaContable="";

				if(((this.cuentacontablesForeignKey==null||this.cuentacontablesForeignKey.size()<=0) && this.cargoinvenConstantesFunciones.cargarid_cuenta_contableCargoInven)
					 || (this.esRecargarFks && this.cargoinvenConstantesFunciones.cargarid_cuenta_contableCargoInven)) {

					if(!this.cargoinvenSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();

						this.arrDatoGeneralNo.add("id_modulo");

						arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCuentaContable=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

						finalQueryGlobalCuentaContable=Funciones.GetFinalQueryAppend(finalQueryGlobalCuentaContable, "");
						finalQueryGlobalCuentaContable+=CuentaContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCuentaContablesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCuentaContable=" WHERE " + ConstantesSql.ID + "="+cargoinvenSessionBean.getlidCuentaContableActual();
					}
				} else {
					finalQueryGlobalCuentaContable="NONE";
				}


				String finalQueryGlobalCuentaContableCredito="";

				if(((this.cuentacontablecreditosForeignKey==null||this.cuentacontablecreditosForeignKey.size()<=0) && this.cargoinvenConstantesFunciones.cargarid_cuenta_contable_creditoCargoInven)
					 || (this.esRecargarFks && this.cargoinvenConstantesFunciones.cargarid_cuenta_contable_creditoCargoInven)) {

					if(!this.cargoinvenSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableCredito()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();

						this.arrDatoGeneralNo.add("id_modulo");

						arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCuentaContableCredito=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

						finalQueryGlobalCuentaContableCredito=Funciones.GetFinalQueryAppend(finalQueryGlobalCuentaContableCredito, "");
						finalQueryGlobalCuentaContableCredito+=CuentaContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCuentaContableCreditosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCuentaContableCredito=" WHERE " + ConstantesSql.ID + "="+cargoinvenSessionBean.getlidCuentaContableCreditoActual();
					}
				} else {
					finalQueryGlobalCuentaContableCredito="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				cargoinvenReturnGeneral=cargoinvenLogic.cargarCombosLoteForeignKeyCargoInven(finalQueryGlobalEmpresa,finalQueryGlobalCuentaContable,finalQueryGlobalCuentaContableCredito);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=cargoinvenReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalCuentaContable.equals("NONE")) {
				this.cuentacontablesForeignKey=cargoinvenReturnGeneral.getcuentacontablesForeignKey();
			}

			if(!finalQueryGlobalCuentaContableCredito.equals("NONE")) {
				this.cuentacontablecreditosForeignKey=cargoinvenReturnGeneral.getcuentacontablecreditosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyCargoInven()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyCuentaContable();
			this.addItemDefectoCombosForeignKeyCuentaContableCredito();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.cargoinvenSessionBean==null) {
				this.cargoinvenSessionBean=new CargoInvenSessionBean();
			}

			if(!this.cargoinvenSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.cargoinvenSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
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

	public void addItemDefectoCombosForeignKeyCuentaContableCredito()throws Exception {
		try {

			if(!this.cargoinvenSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableCredito()) {
				CuentaContable cuentacontablecredito=new CuentaContable();
				CuentaContableConstantesFunciones.setCuentaContableDescripcion(cuentacontablecredito,Constantes.SMENSAJE_ESCOJA_OPCION);
				cuentacontablecredito.setId(null);

				if(!CuentaContableConstantesFunciones.ExisteEnLista(this.cuentacontablecreditosForeignKey,cuentacontablecredito,true)) {

					this.cuentacontablecreditosForeignKey.add(0,cuentacontablecredito);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyCargoInven()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCargoInven(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyCargoInven()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCargoInven();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCargoInven(CargoInven cargoinven)throws Exception {	
		try {
			
			this.setActualCuentaContableForeignKey(cargoinven.getid_cuenta_contable(),false,"Formulario");
			this.setActualCuentaContableCreditoForeignKey(cargoinven.getid_cuenta_contable_credito(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCargoInven(CargoInven cargoinven,String sTipoEvento)throws Exception {	
		try {
			
			

				if(cargoinven.getCuentaContable()!=null && !sTipoEvento.equals("id_cuenta_contableCargoInven")) { //sTipoEvento Evita Bucle Infinito

					this.cuentacontablesForeignKey=new ArrayList<CuentaContable>();
					this.cuentacontablesForeignKey.add(cargoinven.getCuentaContable());

					this.addItemDefectoCombosForeignKeyCuentaContable();
					this.cargarCombosFrameCuentaContablesForeignKey("Todos");
				}

				if(cargoinven.getCuentaContableCredito()!=null && !sTipoEvento.equals("id_cuenta_contable_creditoCargoInven")) { //sTipoEvento Evita Bucle Infinito

					this.cuentacontablecreditosForeignKey=new ArrayList<CuentaContable>();
					this.cuentacontablecreditosForeignKey.add(cargoinven.getCuentaContableCredito());

					this.addItemDefectoCombosForeignKeyCuentaContableCredito();
					this.cargarCombosFrameCuentaContableCreditosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCargoInven()throws Exception {	
		try {
			
			this.setActualCuentaContableForeignKey(this.cargoinvenConstantesFunciones.getid_cuenta_contable(),false,"Formulario");
			this.setActualCuentaContableCreditoForeignKey(this.cargoinvenConstantesFunciones.getid_cuenta_contable_credito(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCargoInven()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCargoInven()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCargoInven()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCargoInven()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCargoInven()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameCuentaContablesForeignKey("Todos");
			this.cargarCombosFrameCuentaContableCreditosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCargoInven(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCuentaContablesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCuentaContableCreditosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCargoInven()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormCargoInven.jComboBoxid_empresaCargoInven!=null && this.jInternalFrameDetalleFormCargoInven.jComboBoxid_empresaCargoInven.getItemCount()>0) {
				this.jInternalFrameDetalleFormCargoInven.jComboBoxid_empresaCargoInven.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCargoInven.jComboBoxid_cuenta_contableCargoInven!=null && this.jInternalFrameDetalleFormCargoInven.jComboBoxid_cuenta_contableCargoInven.getItemCount()>0) {
				this.jInternalFrameDetalleFormCargoInven.jComboBoxid_cuenta_contableCargoInven.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCargoInven.jComboBoxid_cuenta_contable_creditoCargoInven!=null && this.jInternalFrameDetalleFormCargoInven.jComboBoxid_cuenta_contable_creditoCargoInven.getItemCount()>0) {
				this.jInternalFrameDetalleFormCargoInven.jComboBoxid_cuenta_contable_creditoCargoInven.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public CargoInvenBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CargoInvenBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CargoInvenBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.cargoinvenSessionBean=new CargoInvenSessionBean(); 
		this.cargoinvenConstantesFunciones=new CargoInvenConstantesFunciones(); 
		this.cargoinvenBean=new CargoInven();//(this.cargoinvenConstantesFunciones); 		
		this.cargoinvenReturnGeneral=new CargoInvenParameterReturnGeneral(); 
		
		this.cargoinvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cargoinvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CargoInvenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CargoInvenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CargoInvenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCargoInven(true);
			
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
			
			this.cargoinvenConstantesFunciones=new CargoInvenConstantesFunciones(); 
			this.cargoinvenBean=new CargoInven();//this.cargoinvenConstantesFunciones); 			
			this.cargoinvenReturnGeneral=new CargoInvenParameterReturnGeneral(); 
		
			CargoInvenBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cargo Inventario Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.cargoinven=new CargoInven();
			this.cargoinvens = new ArrayList<CargoInven>();
			this.cargoinvensAux = new ArrayList<CargoInven>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinvenLogic=new CargoInvenLogic();
				this.cargoinvenLogic.getNewConnexionToDeep("");
			}
			
			//this.cargoinvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.cargoinvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCargoInven);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCargoInven!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCargoInven);	
					}
					
					if(this.jInternalFrameImportacionCargoInven!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCargoInven);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCargoInven!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCargoInven);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCargoInven!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCargoInven);
				this.jInternalFrameDetalleFormCargoInven.setVisible(false);
				this.jInternalFrameDetalleFormCargoInven.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCargoInven!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCargoInven);
					this.jInternalFrameReporteDinamicoCargoInven.setVisible(false);
					this.jInternalFrameReporteDinamicoCargoInven.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCargoInven!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCargoInven);
					this.jInternalFrameImportacionCargoInven.setVisible(false);
					this.jInternalFrameImportacionCargoInven.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCargoInven!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCargoInven);
					this.jInternalFrameOrderByCargoInven.setVisible(false);
					this.jInternalFrameOrderByCargoInven.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCargoInvenActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CargoInvenConstantesFunciones.INUMEROPAGINACION;
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
			
			this.cargoinvenReturnGeneral=new CargoInvenParameterReturnGeneral();
			
			this.cargoinvenParameterGeneral=new CargoInvenParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.cargoinvenLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.cargoinvenSessionBean.getEsGuardarRelacionado()) {
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
			
			if(CargoInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.cargoinvenSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CargoInvenConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cargoinvenSessionBean.getEsGuardarRelacionado(),this.cargoinvenSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CargoInvenConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cargoinvenSessionBean.getEsGuardarRelacionado(),this.cargoinvenSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoCargoInven=false;
			this.isVisibilidadCeldaDuplicarCargoInven=true;
			this.isVisibilidadCeldaCopiarCargoInven=true;
			this.isVisibilidadCeldaVerFormCargoInven=true;
			this.isVisibilidadCeldaOrdenCargoInven=true;
			this.isVisibilidadCeldaNuevoRelacionesCargoInven=false;
			this.isVisibilidadCeldaModificarCargoInven=false;
			this.isVisibilidadCeldaActualizarCargoInven=false;
			this.isVisibilidadCeldaEliminarCargoInven=false;
			this.isVisibilidadCeldaCancelarCargoInven=false;
			this.isVisibilidadCeldaGuardarCargoInven=false;
			this.isVisibilidadCeldaGuardarCambiosCargoInven=false;
			
			
			this.isVisibilidadFK_IdCargoInven=true;
			this.isVisibilidadFK_IdCuentaContable=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCargoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCargoInven();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCargoInven(false);
			
			this.setPermisosUsuarioCargoInven();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cargoinvenSessionBean.getEsGuardarRelacionado() 
				|| (this.cargoinvenSessionBean.getEsGuardarRelacionado() && this.cargoinvenSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCargoInvenClasesRelacionadas();
			}
			
			if(this.cargoinvenSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCargoInvenClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CargoInvenJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCargoInven();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCargoInven();
			}
			
			if(!this.isPermisoBusquedaCargoInven) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasCargoInven.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cargoinvenSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioCargoInven,this.isPermisoPaginacionMedioCargoInven,this.isPermisoPaginacionTodoCargoInven);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CargoInvenConstantesFunciones.getTiposSeleccionarCargoInven());
				
				this.tiposColumnasSelect=CargoInvenConstantesFunciones.getTiposSeleccionarCargoInven(true);
				
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
			//if(!this.cargoinvenSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCargoInven();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioCargoInven(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioCargoInven(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCargoInven() ;
			
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
			this.cuentacontablecreditoLogic=new CuentaContableLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				cargoinvenImplementable= (CargoInvenImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CargoInvenConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				cargoinvenImplementableHome= (CargoInvenImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CargoInvenConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.cargoinvens= new ArrayList<CargoInven>();
			this.cargoinvensEliminados= new ArrayList<CargoInven>();
						
			this.isEsNuevoCargoInven=false;
			this.esParaAccionDesdeFormularioCargoInven=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idCuentaContableActual=0L;
			this.idCuentaContableCreditoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.cuentacontablesForeignKey=new ArrayList<CuentaContable>() ;
			this.cuentacontablecreditosForeignKey=new ArrayList<CuentaContable>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCargoInven(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCargoInven();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cargoinvenSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CargoInvenBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CargoInvenConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCargoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCargoInven(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCargoInven!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCargoInven();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCargoInven();
			}
			
			CargoInvenBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasCargoInven.getTabCount(); i++) {
					this.jTabbedPaneBusquedasCargoInven.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasCargoInven.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinvenLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCargoInven(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga CargoInven: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinvenLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCargoInven() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesCargoInven")) {
				iIndex=this.jInternalFrameDetalleFormCargoInven.jTabbedPaneRelacionesCargoInven.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCargoInven.jTabbedPaneRelacionesCargoInven.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCargoInven.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCargoInven();	
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
	
	public void cargarCombosForeignKeyCargoInven(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCargoInven(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCargoInven(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCargoInvenListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCargoInven();
		
		this.cargarCombosFrameForeignKeyCargoInven();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCargoInven();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCargoInven();
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

	public void cargarCombosForeignKeyCuentaContableCredito(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCuentaContableCreditoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCuentaContableCredito();
				this.cargarCombosFrameCuentaContableCreditosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCuentaContableCredito(this.cuentacontablecreditosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoCargoInvenActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.cargoinvenSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCargoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CargoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cargoinven,new Object(),this.cargoinvenParameterGeneral,this.cargoinvenReturnGeneral);
			
			
			if(jTableDatosCargoInven.getRowCount()>=1) {
				jTableDatosCargoInven.removeRowSelectionInterval(0, jTableDatosCargoInven.getRowCount()-1);						
			}
			
			this.isEsNuevoCargoInven=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCargoInven(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCargoInven(true);			
			//this.cargoinven=new CargoInven();
			//this.cargoinven.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCargoInven(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCargoInven() ;
			
			if(CargoInvenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCargoInven(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.cargoinven);	
			this.actualizarInformacion("INFO_PADRE",false,this.cargoinven);				
			
			CargoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cargoinven,new Object(),this.cargoinvenParameterGeneral,this.cargoinvenReturnGeneral);
			
			if(this.cargoinvenSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar CargoInven: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CargoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.cargoinven,new Object(),this.cargoinvenParameterGeneral,this.cargoinvenReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCargoInvenActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<CargoInven> cargoinvensSeleccionados=new ArrayList<CargoInven>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCargoInven.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCargoInven.getSelectedRows().length;			
			}
			
			cargoinvensSeleccionados=this.getCargoInvensSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCargoInven--;			
				//CargoInven cargoinvenAux= new CargoInven();			
				//cargoinvenAux.setId(this.iIdNuevoCargoInven);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//CargoInven cargoinvenOrigen=new CargoInven();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(CargoInven cargoinvenOrigen : cargoinvensSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCargoInven.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							cargoinvenOrigen =(CargoInven) this.cargoinvenLogic.getCargoInvens().toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cargoinvenOrigen =(CargoInven) this.cargoinvens.toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCargoInven();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.cargoinven.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCargoInven(cargoinvenOrigen,this.cargoinven,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCargoInven(this.cargoinven);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cargoinvenLogic.getCargoInvens().add(this.cargoinvenAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cargoinvens.add(this.cargoinvenAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCargoInven(false);
				
				this.jTableDatosCargoInven.setRowSelectionInterval(this.getIndiceNuevoCargoInven(), this.getIndiceNuevoCargoInven());
				
				int iLastRow =  this.jTableDatosCargoInven.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCargoInven.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCargoInven.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCargoInven(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCargoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<CargoInven> cargoinvensSeleccionados=new ArrayList<CargoInven>();									
		
			CargoInven cargoinvenOrigen=new CargoInven();
			CargoInven cargoinvenDestino=new CargoInven();
				
			cargoinvensSeleccionados=this.getCargoInvensSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCargoInven.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || cargoinvensSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCargoInven.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cargoinvenOrigen =(CargoInven) this.cargoinvenLogic.getCargoInvens().toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cargoinvenOrigen =(CargoInven) this.cargoinvens.toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cargoinvenDestino =(CargoInven) this.cargoinvenLogic.getCargoInvens().toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cargoinvenDestino =(CargoInven) this.cargoinvens.toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				cargoinvenOrigen =cargoinvensSeleccionados.get(0);
				cargoinvenDestino =cargoinvensSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCargoInven(cargoinvenOrigen,cargoinvenDestino,true,false);
				
				cargoinvenDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cargoinvenDestino,cargoinvenLogic.getCargoInvens());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cargoinvenDestino,cargoinvens);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCargoInven(false);
				
				//this.jTableDatosCargoInven.setRowSelectionInterval(this.getIndiceNuevoCargoInven(), this.getIndiceNuevoCargoInven());
				
				int iLastRow =  this.jTableDatosCargoInven.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCargoInven.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCargoInven.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCargoInven(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCargoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCargoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCargoInven.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCargoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCargoInven.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasCargoInven.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesCargoInven.setVisible(!isVisible);
			this.jPanelPaginacionCargoInven.setVisible(!isVisible);
			this.jPanelAccionesCargoInven.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCargoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCargoInven();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCargoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCargoInven();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCargoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCargoInven();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCargoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCargoInven();
			
			this.abrirFrameOrderByCargoInven();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCargoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCargoInven();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCargoInven(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCargoInven);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCargoInven.isMaximum()) {
					this.jInternalFrameDetalleFormCargoInven.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCargoInven.setSize(this.jInternalFrameDetalleFormCargoInven.iWidthFormulario,this.jInternalFrameDetalleFormCargoInven.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCargoInven.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCargoInven.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCargoInven.isMaximum()) {
						this.jInternalFrameDetalleFormCargoInven.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCargoInven.jContentPaneDetalleCargoInven.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCargoInven.jTabbedPaneRelacionesCargoInven.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCargoInven.jContentPaneDetalleCargoInven.getWidth(),CargoInvenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCargoInven.jTabbedPaneRelacionesCargoInven.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCargoInven.jContentPaneDetalleCargoInven.getWidth(),CargoInvenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCargoInven.jTabbedPaneRelacionesCargoInven.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCargoInven.jContentPaneDetalleCargoInven.getWidth(),CargoInvenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCargoInven.setVisible(true);
	        this.jInternalFrameDetalleFormCargoInven.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCargoInven() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCargoInven==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCargoInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCargoInven,false,this);
				} else {
					this.jInternalFrameOrderByCargoInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCargoInven,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCargoInven);
				this.jInternalFrameOrderByCargoInven.setVisible(false);
				this.jInternalFrameOrderByCargoInven.setSelected(false);
				
				this.jInternalFrameOrderByCargoInven.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCargoInven"));
				
				this.inicializarActualizarBindingTablaOrderByCargoInven();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCargoInven() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCargoInven==null) {
				
				this.jInternalFrameImportacionCargoInven=new ImportacionJInternalFrame(CargoInvenConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCargoInven);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCargoInven);
				this.jInternalFrameImportacionCargoInven.setVisible(false);
				this.jInternalFrameImportacionCargoInven.setSelected(false);


				this.jInternalFrameImportacionCargoInven.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCargoInven"));
				this.jInternalFrameImportacionCargoInven.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCargoInven"));
				this.jInternalFrameImportacionCargoInven.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCargoInven"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCargoInven() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCargoInven==null) {
				this.jInternalFrameReporteDinamicoCargoInven=new ReporteDinamicoJInternalFrame(CargoInvenConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCargoInven);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCargoInven);
				this.jInternalFrameReporteDinamicoCargoInven.setVisible(false);
				this.jInternalFrameReporteDinamicoCargoInven.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCargoInven.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCargoInven"));
				this.jInternalFrameReporteDinamicoCargoInven.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCargoInven"));
				this.jInternalFrameReporteDinamicoCargoInven.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCargoInven"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCargoInven();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleCargoInven() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCargoInven);
			
	       	this.jInternalFrameDetalleFormCargoInven.setVisible(false);
	        this.jInternalFrameDetalleFormCargoInven.setSelected(false);
			
			//this.jInternalFrameDetalleFormCargoInven.dispose();
			//this.jInternalFrameDetalleFormCargoInven=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCargoInven() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCargoInven.setVisible(true);
	        this.jInternalFrameReporteDinamicoCargoInven.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCargoInven() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCargoInven.setVisible(true);
	        this.jInternalFrameImportacionCargoInven.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCargoInven() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCargoInven.setVisible(true);
	        this.jInternalFrameOrderByCargoInven.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCargoInven() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCargoInven.setVisible(false);
	        this.jInternalFrameOrderByCargoInven.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCargoInven() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCargoInven.setVisible(false);
	        this.jInternalFrameReporteDinamicoCargoInven.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCargoInven() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCargoInven.setVisible(false);
	        this.jInternalFrameImportacionCargoInven.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
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
						TitledBorder titledBorderCargoInven=(TitledBorder)this.jScrollPanelDatosCargoInven.getBorder();
						TitledBorder titledBorderCuentaContable=(TitledBorder)cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

						titledBorderCuentaContable.setTitle(titledBorderCargoInven.getTitle() + " -> Cuenta Contable");


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

				public void abrirFrameTreeCuentaContableCredito(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeCuentaContable);
						CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.sTipoBusqueda="CuentaContableCredito";
						}

						cuentacontableBeanSwingJInternalFrame.getTodosCuentaContableArbol();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setCuentaContables(cuentacontableBeanSwingJInternalFrame.cuentacontablesArbol);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.CargarTreeCuentaContable();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setVisible(true);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.jInternalFrameParent=this;
						TitledBorder titledBorderCargoInven=(TitledBorder)this.jScrollPanelDatosCargoInven.getBorder();
						TitledBorder titledBorderCuentaContableCredito=(TitledBorder)cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

						titledBorderCuentaContableCredito.setTitle(titledBorderCargoInven.getTitle() + " -> Cuenta Contable");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cuentacontableBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(cuentacontableBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeCuentaContableCredito(CuentaContableBeanSwingJInternalFrame jInternalFrameTreeCuentaContable) throws Exception {
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
	
	public void jButtonModificarCargoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCargoInven(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCargoInven(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCargoInven.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCargoInven(true);
			//this.isEsNuevoCargoInven=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinven =(CargoInven) this.cargoinvenLogic.getCargoInvens().toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cargoinven =(CargoInven) this.cargoinvens.toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCargoInven("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCargoInven(false) ;
			
			if(cargoinvenSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(CargoInvenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCargoInven(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCargoInven(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCargoInvenActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCargoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoinven =(CargoInven) this.cargoinvenLogic.getCargoInvens().toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cargoinven =(CargoInven) this.cargoinvens.toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCargoInven(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCargoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCargoInven.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCargoInven(true);
			//this.isEsNuevoCargoInven=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinven =(CargoInven) this.cargoinvenLogic.getCargoInvens().toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cargoinven =(CargoInven) this.cargoinvens.toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.cargoinven.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCargoInven("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCargoInven(false) ;
			
			if(CargoInvenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCargoInven(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCargoInven(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("CuentaContable")) {
				if(!this.cargoinvenConstantesFunciones.cargarid_cuenta_contableCargoInven) {
					this.cargarCombosCuentaContablesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingCargoInven(false,false);
					this.cargarCombosFrameCuentaContablesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cuenta_contable (id);

				this.recargarComboTablaCuentaContable(this.cuentacontablesForeignKey);

			}
			
			if(sType.equals("CuentaContableCredito")) {
				if(!this.cargoinvenConstantesFunciones.cargarid_cuenta_contable_creditoCargoInven) {
					this.cargarCombosCuentaContableCreditosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingCargoInven(false,false);
					this.cargarCombosFrameCuentaContableCreditosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cuenta_contable_credito (id);

				this.recargarComboTablaCuentaContableCredito(this.cuentacontablecreditosForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaCuentaContable(List<CuentaContable> cuentacontablesForeignKey)throws Exception{
		TableColumn tableColumnCuentaContable=this.jTableDatosCargoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargoInven,CargoInvenConstantesFunciones.LABEL_IDCUENTACONTABLE));
		TableCellEditor tableCellEditorCuentaContable =tableColumnCuentaContable.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContable;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontablesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCargoInven.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cuentacontableTableCellFk.setRowActual(intSelectedRow);
			//cuentacontableTableCellFk.setcuentacontablesForeignKeyActual(cuentacontablesForeignKey);
		//}


		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.RecargarCuentaContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCuentaContableCredito(List<CuentaContable> cuentacontablecreditosForeignKey)throws Exception{
		TableColumn tableColumnCuentaContableCredito=this.jTableDatosCargoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargoInven,CargoInvenConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO));
		TableCellEditor tableCellEditorCuentaContableCredito =tableColumnCuentaContableCredito.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContableCredito;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontablecreditosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCargoInven.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cuentacontableTableCellFk.setRowActual(intSelectedRow);
			//cuentacontableTableCellFk.setcuentacontablesForeignKeyActual(cuentacontablecreditosForeignKey);
		//}


		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.RecargarCuentaContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_cuenta_contable (Long id) throws Exception {
		this.setActualCuentaContableForeignKey(id,true,"Todos");

	};
	

	public void setCombosCodigoDesdeBusquedaid_cuenta_contable_credito (Long id) throws Exception {
		this.setActualCuentaContableCreditoForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarCargoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinvenLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCargoInven(false);
			
			//if(!this.isEsNuevoCargoInven) {								
				int intSelectedRow = this.jTableDatosCargoInven.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoinven =(CargoInven) this.cargoinvenLogic.getCargoInvens().toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cargoinven =(CargoInven) this.cargoinvens.toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CargoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCargoInven(this.cargoinven,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCargoInven(this.cargoinven);
				
			}
			
			if(this.permiteMantenimiento(this.cargoinven)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.cargoinvenSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCargoInven=true;
					this.inicializarActualizarBindingTablaCargoInven(false);
					this.isEsNuevoCargoInven=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCargoInven=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCargoInven=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCargoInven(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCargoInven(false);
				
				this.habilitarDeshabilitarControlesCargoInven(false);
			
												
				
				if(CargoInvenJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCargoInven();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCargoInvenActionPerformed(evt,cargoinvenSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCargoInven(this.cargoinven,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCargoInven.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,cargoinvenSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinvenLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.cargoinven.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(CargoInven.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CargoInven.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCargoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinvenLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCargoInven.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinven =(CargoInven) this.cargoinvenLogic.getCargoInvens().toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
				this.cargoinven.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cargoinven =(CargoInven) this.cargoinvens.toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
				this.cargoinven.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.cargoinven)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.cargoinvenSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CargoInvenModel) this.jTableDatosCargoInven.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCargoInven=true;
				this.inicializarActualizarBindingTablaCargoInven(false);
				this.isEsNuevoCargoInven=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCargoInven(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCargoInven(false);
				
				this.habilitarDeshabilitarControlesCargoInven(false);
				
				
				
				if(CargoInvenJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCargoInven();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinvenLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCargoInvenActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCargoInven.getRowCount()>=1) {
				jTableDatosCargoInven.removeRowSelectionInterval(0, jTableDatosCargoInven.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCargoInven(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCargoInven(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCargoInven(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCargoInven(false) ;
			
			this.isEsNuevoCargoInven=false;
			
			if(CargoInvenJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCargoInven();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCargoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinvenLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCargoInven(false);
				
				//SI ES MANUAL
				if(CargoInvenJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCargoInven();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinvenLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCargoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCargoInven--;			
			//CargoInven cargoinvenAux= new CargoInven();			
			//cargoinvenAux.setId(this.iIdNuevoCargoInven);
			
			if(this.jInternalFrameDetalleFormCargoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCargoInven();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCargoInven(this.cargoinven);
			
			this.cargoinven.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.cargoinvenLogic.getCargoInvens().add(this.cargoinvenAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.cargoinvens.add(this.cargoinvenAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCargoInven(false);
			
			this.jTableDatosCargoInven.setRowSelectionInterval(this.getIndiceNuevoCargoInven(), this.getIndiceNuevoCargoInven());
			
			int iLastRow =  this.jTableDatosCargoInven.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCargoInven.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCargoInven.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCargoInven(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCargoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinvenLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCargoInven(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCargoInven(false);
			
			//SI ES MANUAL
			if(CargoInvenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCargoInven();
			}
			
			//this.abrirFrameTreeCargoInven();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinvenLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCargoInvenActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Cargo InventarioES ?", "MANTENIMIENTO DE Cargo Inventario", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionCargoInven.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralCargoInven();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.cargoinvenReturnGeneral=cargoinvenLogic.procesarImportacionCargoInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.cargoinvenParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarCargoInvenReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCargoInvenActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCargoInven.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCargoInven.setFileImportacion(this.jInternalFrameImportacionCargoInven.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCargoInven.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCargoInven.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCargoInven.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCargoInven.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCargoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<CargoInven> cargoinvensSeleccionados=new ArrayList<CargoInven>();		

		cargoinvensSeleccionados=this.getCargoInvensSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCargoInven.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCargoInven.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CargoInvenBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CargoInvenBaseDesign.jrxml";
			
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
			
			this.generarReporteCargoInvens("Todos",cargoinvensSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cargoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cargo Inventario",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoCargoInven.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCargoInven.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CargoInvenConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CargoInvenConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CuentaContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CuentaContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CuentaContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CuentaContable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CargoInvenConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CuentaContableCredito_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CuentaContableCredito_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CuentaContableCredito_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CuentaContableCredito_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CargoInvenConstantesFunciones.LABEL_CONSRI:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nSri_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nSri_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nSri_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nSri_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CargoInvenConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoCargoInven.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCargoInven.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCargoInven.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CargoInvenConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case CargoInvenConstantesFunciones.LABEL_IDCUENTACONTABLE:
					sNombreCampoCategoria="id_cuenta_contable";
					break;

				case CargoInvenConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO:
					sNombreCampoCategoria="id_cuenta_contable_credito";
					break;

				case CargoInvenConstantesFunciones.LABEL_CONSRI:
					sNombreCampoCategoria="con_sri";
					break;

				case CargoInvenConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCargoInven.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CargoInvenConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case CargoInvenConstantesFunciones.LABEL_IDCUENTACONTABLE:
					sNombreCampoCategoriaValor="id_cuenta_contable";
					break;

				case CargoInvenConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO:
					sNombreCampoCategoriaValor="id_cuenta_contable_credito";
					break;

				case CargoInvenConstantesFunciones.LABEL_CONSRI:
					sNombreCampoCategoriaValor="con_sri";
					break;

				case CargoInvenConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCargoInven.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCargoInven.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CargoInvenConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case CargoInvenConstantesFunciones.LABEL_IDCUENTACONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cuenta C. Debito",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cuenta_contable");
					break;

				case CargoInvenConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cuenta C. Credito",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cuenta_contable_credito");
					break;

				case CargoInvenConstantesFunciones.LABEL_CONSRI:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Con Sri",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_sri");
					break;

				case CargoInvenConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
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
	
	public void jButtonGenerarExcelReporteDinamicoCargoInvenActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<CargoInven> cargoinvensSeleccionados=new ArrayList<CargoInven>();		
		
		cargoinvensSeleccionados=this.getCargoInvensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cargoinven";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("CargoInvens");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCargoInven.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCargoInven.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CargoInvenConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CargoInvenConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(CargoInven cargoinven:cargoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cargoinven.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CargoInvenConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CargoInvenConstantesFunciones.LABEL_IDCUENTACONTABLE);
					iRow++;

					for(CargoInven cargoinven:cargoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cargoinven.getcuentacontable_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CargoInvenConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CargoInvenConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO);
					iRow++;

					for(CargoInven cargoinven:cargoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cargoinven.getcuentacontablecredito_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CargoInvenConstantesFunciones.LABEL_CONSRI:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CargoInvenConstantesFunciones.LABEL_CONSRI);
					iRow++;

					for(CargoInven cargoinven:cargoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cargoinven.getcon_sri());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CargoInvenConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CargoInvenConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(CargoInven cargoinven:cargoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cargoinven.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelCargoInven(row);				
			//	iRow++;
			//}				
			
			//for(CargoInven cargoinvenAux:cargoinvensSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCargoInven(cargoinvenAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cargoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cargo Inventario",JOptionPane.INFORMATION_MESSAGE);
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
				this.cargoinvenLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCargoInven(false);
			
			//SI ES MANUAL
			if(CargoInvenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCargoInven();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCargoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinvenLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCargoInven(false);
			
			//SI ES MANUAL
			if(CargoInvenJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCargoInven();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCargoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinvenLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCargoInven(false);
			
			//SI ES MANUAL
			if(CargoInvenJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCargoInven();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCargoInven() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCargoInven.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCargoInven.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCargoInven.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCargoInven.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCargoInven.setMinimumSize(dimensionMinimum);
		this.jTableDatosCargoInven.setMaximumSize(dimensionMaximum);
		this.jTableDatosCargoInven.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCargoInven(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCargoInven(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCargoInven(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCargoInven(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCargoInven(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cargoinvenSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCargoInven(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCargoInven(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCargoInven(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CargoInvenJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CargoInvenJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCargoInven() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCargoInven();
		
		this.inicializarActualizarBindingBotonesManualCargoInven(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cargoinvenSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCargoInven();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCargoInven() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCargoInven(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCargoInven(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCargoInven.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCargoInven.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCargoInven.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCargoInven!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCargoInven.jCheckBoxPostAccionNuevoCargoInven.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCargoInven.jCheckBoxPostAccionSinCerrarCargoInven.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCargoInven.jCheckBoxPostAccionSinMensajeCargoInven.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCargoInven.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCargoInven.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCargoInven.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCargoInven!=null) {
				this.jInternalFrameDetalleFormCargoInven.jCheckBoxPostAccionNuevoCargoInven.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCargoInven.jCheckBoxPostAccionSinCerrarCargoInven.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCargoInven.jCheckBoxPostAccionSinMensajeCargoInven.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCargoInven.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCargoInven.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCargoInven!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCargoInven.jComboBoxTiposAccionesFormularioCargoInven.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCargoInven.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCargoInven!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCargoInven.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCargoInven.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCargoInven.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCargoInven.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCargoInven.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCargoInven!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCargoInven.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCargoInven.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCargoInven.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCargoInven(Boolean esInicializar) throws Exception {
		try	{	
			if(CargoInvenJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCargoInven(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCargoInven() throws Exception {
		try	{
			if(CargoInvenJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCargoInven();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCargoInven() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCargoInven.jComboBoxTiposAccionesFormularioCargoInven.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCargoInven.jComboBoxTiposAccionesFormularioCargoInven.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCargoInven() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCargoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCargoInven.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCargoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCargoInven.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCargoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCargoInven.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCargoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCargoInven.addItem(reporte);
			}
			
			
			if(!this.cargoinvenSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCargoInven.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCargoInven.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCargoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCargoInven.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCargoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCargoInven.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCargoInven!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCargoInven.jComboBoxTiposAccionesFormularioCargoInven.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCargoInven.jComboBoxTiposAccionesFormularioCargoInven.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCargoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCargoInven.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCargoInven.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCargoInven();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCargoInven() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCargoInven!=null) {
				this.jInternalFrameReporteDinamicoCargoInven.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCargoInven.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCargoInven!=null) {
				this.jInternalFrameReporteDinamicoCargoInven.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCargoInven.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCargoInven!=null) {
				
				if(this.jInternalFrameReporteDinamicoCargoInven.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCargoInven.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCargoInven.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCargoInven.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCargoInven.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCargoInven.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCargoInven()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_cuenta_contable_creditoFK_IdCargoInvenCargoInven.getSelectedItem()!=null){this.id_cuenta_contable_creditoFK_IdCargoInven=((CuentaContable)this.jComboBoxid_cuenta_contable_creditoFK_IdCargoInvenCargoInven.getSelectedItem()).getId();}
		if(this.jComboBoxid_cuenta_contableFK_IdCuentaContableCargoInven.getSelectedItem()!=null){this.id_cuenta_contableFK_IdCuentaContable=((CuentaContable)this.jComboBoxid_cuenta_contableFK_IdCuentaContableCargoInven.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCargoInven(Boolean esInicializar) throws Exception {				
		if(CargoInvenJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCargoInven();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCargoInven() throws Exception {
		this.inicializarActualizarBindingTablaCargoInven(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCargoInven() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCargoInven.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCargoInven.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCargoInven.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CargoInvenPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCargoInven.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCargoInven.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CargoInvenPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCargoInvenOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargoInvenOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CargoInvenPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCargoInven.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCargoInven.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CargoInvenPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCargoInven.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCargoInven(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=cargoinvenLogic.getCargoInvens().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=cargoinvens.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CargoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCargoInven.setModel(new CargoInvenModel(this.cargoinvenLogic.getCargoInvens(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCargoInven.setModel(new CargoInvenModel(this.cargoinvens,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCargoInven!=null && this.jInternalFrameOrderByCargoInven.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCargoInven();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCargoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargoInven,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CargoInvenPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CargoInvenConstantesFunciones.SCLASSWEBTITULO,cargoinvenConstantesFunciones.resaltarSeleccionarCargoInven,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CargoInvenConstantesFunciones.SCLASSWEBTITULO,cargoinvenConstantesFunciones.resaltarSeleccionarCargoInven,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCargoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargoInven,CargoInvenConstantesFunciones.LABEL_ID));

		if(this.cargoinvenConstantesFunciones.mostraridCargoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CargoInvenConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cargoinvenConstantesFunciones.resaltaridCargoInven,this.cargoinvenConstantesFunciones.activaridCargoInven,this,true,"idCargoInven","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cargoinvenConstantesFunciones.resaltaridCargoInven,this.cargoinvenConstantesFunciones.activaridCargoInven,this,true,"idCargoInven","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCargoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargoInven,CargoInvenConstantesFunciones.LABEL_IDEMPRESA));

		if(this.cargoinvenConstantesFunciones.mostrarid_empresaCargoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CargoInvenConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.cargoinvenConstantesFunciones.resaltarid_empresaCargoInven,this,this.cargoinvenConstantesFunciones.activarid_empresaCargoInven));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.cargoinvenConstantesFunciones.resaltarid_empresaCargoInven,this,this.cargoinvenConstantesFunciones.activarid_empresaCargoInven,false,"id_empresaCargoInven","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CargoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCargoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargoInven,CargoInvenConstantesFunciones.LABEL_IDCUENTACONTABLE));

		if(this.cargoinvenConstantesFunciones.mostrarid_cuenta_contableCargoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CargoInvenConstantesFunciones.LABEL_IDCUENTACONTABLE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CuentaContableTableCell(this.cuentacontablesForeignKey,this.cargoinvenConstantesFunciones.resaltarid_cuenta_contableCargoInven,this,this.cargoinvenConstantesFunciones.activarid_cuenta_contableCargoInven));
			tableColumn.setCellEditor(new CuentaContableTableCell(this.cuentacontablesForeignKey,this.cargoinvenConstantesFunciones.resaltarid_cuenta_contableCargoInven,this,this.cargoinvenConstantesFunciones.activarid_cuenta_contableCargoInven,true,"id_cuenta_contableCargoInven","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70);
			//tableColumn.addPropertyChangeListener(new CargoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCargoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargoInven,CargoInvenConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO));

		if(this.cargoinvenConstantesFunciones.mostrarid_cuenta_contable_creditoCargoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CargoInvenConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CuentaContableTableCell(this.cuentacontablecreditosForeignKey,this.cargoinvenConstantesFunciones.resaltarid_cuenta_contable_creditoCargoInven,this,this.cargoinvenConstantesFunciones.activarid_cuenta_contable_creditoCargoInven));
			tableColumn.setCellEditor(new CuentaContableTableCell(this.cuentacontablecreditosForeignKey,this.cargoinvenConstantesFunciones.resaltarid_cuenta_contable_creditoCargoInven,this,this.cargoinvenConstantesFunciones.activarid_cuenta_contable_creditoCargoInven,true,"id_cuenta_contable_creditoCargoInven","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70);
			//tableColumn.addPropertyChangeListener(new CargoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCargoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargoInven,CargoInvenConstantesFunciones.LABEL_CONSRI));

		if(this.cargoinvenConstantesFunciones.mostrarcon_sriCargoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CargoInvenConstantesFunciones.LABEL_CONSRI,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.cargoinvenConstantesFunciones.resaltarcon_sriCargoInven,this.cargoinvenConstantesFunciones.activarcon_sriCargoInven));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.cargoinvenConstantesFunciones.resaltarcon_sriCargoInven,this.cargoinvenConstantesFunciones.activarcon_sriCargoInven,this,true,"con_sriCargoInven","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CargoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCargoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargoInven,CargoInvenConstantesFunciones.LABEL_DESCRIPCION));

		if(this.cargoinvenConstantesFunciones.mostrardescripcionCargoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CargoInvenConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cargoinvenConstantesFunciones.resaltardescripcionCargoInven,this.cargoinvenConstantesFunciones.activardescripcionCargoInven,this,true,"descripcionCargoInven","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cargoinvenConstantesFunciones.resaltardescripcionCargoInven,this.cargoinvenConstantesFunciones.activardescripcionCargoInven,this,true,"descripcionCargoInven","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CargoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.cargoinvenSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cargoinvenSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cargoinvenSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCargoInven.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cargoinvenSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cargoinvenSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCargoInven.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCargoInven && this.isPermisoGuardarCambiosCargoInven) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.cargoinvenSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.cargoinvenSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCargoInven.addColumn(tableColumn);
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
			
			this.jTableDatosCargoInven.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCargoInven && this.isPermisoGuardarCambiosCargoInven) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCargoInven && this.isPermisoGuardarCambiosCargoInven) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCargoInven.moveColumn(this.jTableDatosCargoInven.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCargoInven.moveColumn(this.jTableDatosCargoInven.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCargoInven.moveColumn(this.jTableDatosCargoInven.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCargoInven.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCargoInven.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCargoInven,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CargoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCargoInven.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCargoInven.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CargoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CargoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCargoInven.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCargoInven.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCargoInven.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=cargoinvenLogic.getCargoInvens().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=cargoinvens.size()-1;
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
		//this.jTableDatosCargoInven.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCargoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCargoInven();
			
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
				
				//this.isEsNuevoCargoInven=false;
					
				CargoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cargoinven,new Object(),this.cargoinvenParameterGeneral,this.cargoinvenReturnGeneral);
			
				if(this.cargoinvenSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCargoInven==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCargoInven.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCargoInven.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoinven =(CargoInven) this.cargoinvenLogic.getCargoInvens().toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cargoinven =(CargoInven) this.cargoinvens.toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.cargoinven.getsType().equals("DUPLICADO")
				   || this.cargoinven.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCargoInven=true;
				
				} else {
					this.isEsNuevoCargoInven=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.cargoinvenSessionBean.getEsGuardarRelacionado()) {
					if(this.cargoinven.getId()>=0 && !this.cargoinven.getIsNew()) {						
						this.isEsNuevoCargoInven=false;
						
					} else {
						this.isEsNuevoCargoInven=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCargoInven(esRelaciones);						
				
				this.seleccionarCargoInven(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.cargoinven.getId()<0) {
					this.isEsNuevoCargoInven=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCargoInven(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCargoInven(evt,rowIndex);
				}	
				
				if(this.cargoinvenSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion CargoInven: " + this.dDif); 
					}
				}								
				
				CargoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cargoinven,new Object(),this.cargoinvenParameterGeneral,this.cargoinvenReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCargoInven(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.cargoinven)) {
					if(this.cargoinven.getId()>0) {
						this.cargoinven.setIsDeleted(true);
						
						this.cargoinvensEliminados.add(this.cargoinven);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cargoinvenLogic.getCargoInvens().remove(this.cargoinven);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cargoinvens.remove(this.cargoinven);				
					}
					
					
					((CargoInvenModel) this.jTableDatosCargoInven.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCargoInven(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCargoInven(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCargoInven) {
			
			if(this.jInternalFrameDetalleFormCargoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCargoInven.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCargoInven.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoinven =(CargoInven) this.cargoinvenLogic.getCargoInvens().toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cargoinven =(CargoInven) this.cargoinvens.toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CargoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCargoInven(this.cargoinven);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.cargoinvenConstantesFunciones.cargarid_empresaCargoInven || this.cargoinvenConstantesFunciones.event_dependid_empresaCargoInven) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.cargoinven.getid_empresa());
									//this.inicializarActualizarBindingCargoInven(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(cargoinven.getEmpresa()!=null) {
							this.empresasForeignKey.add(cargoinven.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.cargoinven.getid_empresa(),false,"Formulario");

					//CuentaContable
					if(!this.cargoinvenConstantesFunciones.cargarid_cuenta_contableCargoInven || this.cargoinvenConstantesFunciones.event_dependid_cuenta_contableCargoInven) {
						//this.cargarCombosCuentaContablesForeignKeyLista(" where id="+this.cargoinven.getid_cuenta_contable());
									//this.inicializarActualizarBindingCargoInven(false,false);
						this.cuentacontablesForeignKey=new ArrayList<CuentaContable>();

						if(cargoinven.getCuentaContable()!=null) {
							this.cuentacontablesForeignKey.add(cargoinven.getCuentaContable());
						}

						this.addItemDefectoCombosForeignKeyCuentaContable();
						this.cargarCombosFrameCuentaContablesForeignKey("Todos");
					}
					this.setActualCuentaContableForeignKey(this.cargoinven.getid_cuenta_contable(),false,"Formulario");

					//CuentaContableCredito
					if(!this.cargoinvenConstantesFunciones.cargarid_cuenta_contable_creditoCargoInven || this.cargoinvenConstantesFunciones.event_dependid_cuenta_contable_creditoCargoInven) {
						//this.cargarCombosCuentaContableCreditosForeignKeyLista(" where id="+this.cargoinven.getid_cuenta_contable_credito());
									//this.inicializarActualizarBindingCargoInven(false,false);
						this.cuentacontablecreditosForeignKey=new ArrayList<CuentaContable>();

						if(cargoinven.getCuentaContableCredito()!=null) {
							this.cuentacontablecreditosForeignKey.add(cargoinven.getCuentaContableCredito());
						}

						this.addItemDefectoCombosForeignKeyCuentaContableCredito();
						this.cargarCombosFrameCuentaContableCreditosForeignKey("Todos");
					}
					this.setActualCuentaContableCreditoForeignKey(this.cargoinven.getid_cuenta_contable_credito(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCargoInven("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCargoInven(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCargoInven() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCargoInven(CargoInven cargoinven) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCargoInven(cargoinven,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCargoInven(CargoInven cargoinven,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCargoInven(cargoinven);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCargoInven(cargoinven,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCargoInven(cargoinven);
	}
	
	public void setVariablesObjetoActualToFormularioCargoInven(CargoInven cargoinven) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCargoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCargoInven.jLabelidCargoInven.setText(cargoinven.getId().toString());
			this.jInternalFrameDetalleFormCargoInven.jCheckBoxcon_sriCargoInven.setSelected(cargoinven.getcon_sri());
			this.jInternalFrameDetalleFormCargoInven.jTextFielddescripcionCargoInven.setText(cargoinven.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,CargoInven cargoinvenLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,cargoinvenLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,CargoInven cargoinvenLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				cargoinvenLocal=this.cargoinven;
			} else {
				cargoinvenLocal=this.cargoinvenAnterior;
			}
		}
		
		if(this.permiteMantenimiento(cargoinvenLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCargoInven(cargoinvenLocal,true);
					
					if(cargoinvenSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(cargoinvenLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.cargoinvenSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(cargoinvenLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCargoInven(CargoInven cargoinven,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCargoInven(cargoinven,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCargoInven(cargoinven);
	}
	
	public void setVariablesFormularioToObjetoActualCargoInven(CargoInven cargoinven,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCargoInven(cargoinven,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCargoInven(CargoInven cargoinven,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCargoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormCargoInven.jLabelidCargoInven.getText()==null || this.jInternalFrameDetalleFormCargoInven.jLabelidCargoInven.getText()=="" || this.jInternalFrameDetalleFormCargoInven.jLabelidCargoInven.getText()=="Id") {
				this.jInternalFrameDetalleFormCargoInven.jLabelidCargoInven.setText("0");
			}

			if(conColumnasBase) {cargoinven.setId(Long.parseLong(this.jInternalFrameDetalleFormCargoInven.jLabelidCargoInven.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CargoInvenConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargoInven.jLabelIdCargoInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cargoinven.setcon_sri(this.jInternalFrameDetalleFormCargoInven.jCheckBoxcon_sriCargoInven.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CargoInvenConstantesFunciones.LABEL_CONSRI+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargoInven.jLabelcon_sriCargoInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cargoinven.setdescripcion(this.jInternalFrameDetalleFormCargoInven.jTextFielddescripcionCargoInven.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CargoInvenConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargoInven.jLabeldescripcionCargoInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCargoInven(CargoInven cargoinvenBean,CargoInven cargoinven,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && cargoinvenBean.getid_cuenta_contable()!=null && !cargoinvenBean.getid_cuenta_contable().equals(-1L))) {cargoinven.setid_cuenta_contable(cargoinvenBean.getid_cuenta_contable());}
			if(conDefault || (!conDefault && cargoinvenBean.getid_cuenta_contable_credito()!=null && !cargoinvenBean.getid_cuenta_contable_credito().equals(-1L))) {cargoinven.setid_cuenta_contable_credito(cargoinvenBean.getid_cuenta_contable_credito());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCargoInven(CargoInven cargoinvenOrigen,CargoInven cargoinven,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cargoinvenOrigen.getId()!=null && !cargoinvenOrigen.getId().equals(0L))) {cargoinven.setId(cargoinvenOrigen.getId());}}
			if(conDefault || (!conDefault && cargoinvenOrigen.getid_cuenta_contable()!=null && !cargoinvenOrigen.getid_cuenta_contable().equals(-1L))) {cargoinven.setid_cuenta_contable(cargoinvenOrigen.getid_cuenta_contable());}
			if(conDefault || (!conDefault && cargoinvenOrigen.getid_cuenta_contable_credito()!=null && !cargoinvenOrigen.getid_cuenta_contable_credito().equals(-1L))) {cargoinven.setid_cuenta_contable_credito(cargoinvenOrigen.getid_cuenta_contable_credito());}
			if(conDefault || (!conDefault && cargoinvenOrigen.getcon_sri()!=null && !cargoinvenOrigen.getcon_sri().equals(false))) {cargoinven.setcon_sri(cargoinvenOrigen.getcon_sri());}
			if(conDefault || (!conDefault && cargoinvenOrigen.getdescripcion()!=null && !cargoinvenOrigen.getdescripcion().equals(""))) {cargoinven.setdescripcion(cargoinvenOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCargoInven(CargoInven cargoinven) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCargoInven.jLabelidCargoInven.setText(cargoinven.getId().toString());
			this.jInternalFrameDetalleFormCargoInven.jCheckBoxcon_sriCargoInven.setSelected(cargoinven.getcon_sri());
			this.jInternalFrameDetalleFormCargoInven.jTextFielddescripcionCargoInven.setText(cargoinven.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCargoInven(CargoInvenBean cargoinvenBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCargoInven.jLabelidCargoInven.setText(cargoinvenBean.getId().toString());
			this.jInternalFrameDetalleFormCargoInven.jCheckBoxcon_sriCargoInven.setSelected(cargoinvenBean.getcon_sri());
			this.jInternalFrameDetalleFormCargoInven.jTextFielddescripcionCargoInven.setText(cargoinvenBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCargoInven(CargoInvenParameterReturnGeneral cargoinvenReturnGeneral,CargoInvenBean cargoinvenBean,Boolean conDefault) throws Exception { 
		try {
			CargoInven cargoinvenLocal=new CargoInven();
			
			cargoinvenLocal=cargoinvenReturnGeneral.getCargoInven();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cargoinvenLocal.getId()!=null && !cargoinvenLocal.getId().equals(0L))) {cargoinvenBean.setId(cargoinvenLocal.getId());}}
			if(conDefault || (!conDefault && cargoinvenLocal.getid_cuenta_contable()!=null && !cargoinvenLocal.getid_cuenta_contable().equals(-1L))) {cargoinvenBean.setid_cuenta_contable(cargoinvenLocal.getid_cuenta_contable());}
			if(conDefault || (!conDefault && cargoinvenLocal.getid_cuenta_contable_credito()!=null && !cargoinvenLocal.getid_cuenta_contable_credito().equals(-1L))) {cargoinvenBean.setid_cuenta_contable_credito(cargoinvenLocal.getid_cuenta_contable_credito());}
			if(conDefault || (!conDefault && cargoinvenLocal.getcon_sri()!=null && !cargoinvenLocal.getcon_sri().equals(false))) {cargoinvenBean.setcon_sri(cargoinvenLocal.getcon_sri());}
			if(conDefault || (!conDefault && cargoinvenLocal.getdescripcion()!=null && !cargoinvenLocal.getdescripcion().equals(""))) {cargoinvenBean.setdescripcion(cargoinvenLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCargoInvenGenerico(Long idCargoInvenSeleccionado,JComboBox jComboBoxCargoInven,List<CargoInven> cargoinvensLocal)throws Exception {
		try {
			CargoInven  cargoinvenTemp=null;

			for(CargoInven cargoinvenAux:cargoinvensLocal) {
				if(cargoinvenAux.getId()!=null && cargoinvenAux.getId().equals(idCargoInvenSeleccionado)) {
					cargoinvenTemp=cargoinvenAux;
					break;
				}
			}

			jComboBoxCargoInven.setSelectedItem(cargoinvenTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCargoInvenGenerico(JComboBox jComboBoxCargoInven,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxCargoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCargoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCargoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCargoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCargoInven.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCargoInven.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCargoInven.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCargoInven.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCargoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCargoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cargoinven=(CargoInven) cargoinvenLogic.getCargoInvens().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cargoinven =(CargoInven) cargoinvens.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!cargoinven.getIsNew() && !cargoinven.getIsChanged() && !cargoinven.getIsDeleted()) {
				sDescripcion=cargoinven.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=cargoinven.getempresa_descripcion();
			}
		}

		if(sTipo.equals("CuentaContable")) {
			//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
			if(!cargoinven.getIsNew() && !cargoinven.getIsChanged() && !cargoinven.getIsDeleted()) {
				sDescripcion=cargoinven.getcuentacontable_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
				sDescripcion=cargoinven.getcuentacontable_descripcion();
			}
		}

		if(sTipo.equals("CuentaContableCredito")) {
			//sDescripcion=this.getActualCuentaContableCreditoForeignKeyDescripcion((Long)value);
			if(!cargoinven.getIsNew() && !cargoinven.getIsChanged() && !cargoinven.getIsDeleted()) {
				sDescripcion=cargoinven.getcuentacontablecredito_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableCreditoForeignKeyDescripcion((Long)value);
				sDescripcion=cargoinven.getcuentacontablecredito_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		CargoInven cargoinvenRow=new CargoInven();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cargoinvenRow=(CargoInven) cargoinvenLogic.getCargoInvens().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cargoinvenRow=(CargoInven) cargoinvens.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCargoInven(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCargoInven.setVisible((this.isVisibilidadCeldaNuevoCargoInven && this.isPermisoNuevoCargoInven));			
			this.jButtonDuplicarCargoInven.setVisible((this.isVisibilidadCeldaDuplicarCargoInven && this.isPermisoDuplicarCargoInven));			
			this.jButtonCopiarCargoInven.setVisible((this.isVisibilidadCeldaCopiarCargoInven && this.isPermisoCopiarCargoInven));
			this.jButtonVerFormCargoInven.setVisible((this.isVisibilidadCeldaVerFormCargoInven && this.isPermisoVerFormCargoInven));
			
			this.jButtonAbrirOrderByCargoInven.setVisible((this.isVisibilidadCeldaOrdenCargoInven && this.isPermisoOrdenCargoInven));			
			
			this.jButtonNuevoRelacionesCargoInven.setVisible((this.isVisibilidadCeldaNuevoRelacionesCargoInven && this.isPermisoNuevoCargoInven));			
			this.jButtonNuevoGuardarCambiosCargoInven.setVisible((this.isVisibilidadCeldaNuevoCargoInven && this.isPermisoNuevoCargoInven && this.isPermisoGuardarCambiosCargoInven));
			
			if(this.jInternalFrameDetalleFormCargoInven!=null) {
			this.jInternalFrameDetalleFormCargoInven.jButtonModificarCargoInven.setVisible((this.isVisibilidadCeldaModificarCargoInven && this.isPermisoActualizarCargoInven));	
			this.jInternalFrameDetalleFormCargoInven.jButtonActualizarCargoInven.setVisible((this.isVisibilidadCeldaActualizarCargoInven && this.isPermisoActualizarCargoInven));	
			this.jInternalFrameDetalleFormCargoInven.jButtonEliminarCargoInven.setVisible((this.isVisibilidadCeldaEliminarCargoInven && this.isPermisoEliminarCargoInven));
			this.jInternalFrameDetalleFormCargoInven.jButtonCancelarCargoInven.setVisible(this.isVisibilidadCeldaCancelarCargoInven);							
			this.jInternalFrameDetalleFormCargoInven.jButtonGuardarCambiosCargoInven.setVisible((this.isVisibilidadCeldaGuardarCargoInven && this.isPermisoGuardarCambiosCargoInven));			
			
			}
						
			this.jButtonGuardarCambiosTablaCargoInven.setVisible((this.isVisibilidadCeldaGuardarCambiosCargoInven && this.isPermisoGuardarCambiosCargoInven));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCargoInven.setVisible((this.isVisibilidadCeldaNuevoCargoInven && this.isPermisoNuevoCargoInven));						
			this.jButtonDuplicarToolBarCargoInven.setVisible((this.isVisibilidadCeldaDuplicarCargoInven && this.isPermisoDuplicarCargoInven));						
			this.jButtonCopiarToolBarCargoInven.setVisible((this.isVisibilidadCeldaCopiarCargoInven && this.isPermisoCopiarCargoInven));			
			this.jButtonVerFormToolBarCargoInven.setVisible((this.isVisibilidadCeldaVerFormCargoInven && this.isPermisoVerFormCargoInven));			
			this.jButtonAbrirOrderByToolBarCargoInven.setVisible((this.isVisibilidadCeldaOrdenCargoInven && this.isPermisoOrdenCargoInven));
			this.jButtonNuevoRelacionesToolBarCargoInven.setVisible((this.isVisibilidadCeldaNuevoRelacionesCargoInven && this.isPermisoNuevoCargoInven));			
			this.jButtonNuevoGuardarCambiosToolBarCargoInven.setVisible((this.isVisibilidadCeldaNuevoCargoInven && this.isPermisoNuevoCargoInven && this.isPermisoGuardarCambiosCargoInven));			
			
			if(this.jInternalFrameDetalleFormCargoInven!=null) {
			this.jInternalFrameDetalleFormCargoInven.jButtonModificarToolBarCargoInven.setVisible((this.isVisibilidadCeldaModificarCargoInven && this.isPermisoActualizarCargoInven));	
			this.jInternalFrameDetalleFormCargoInven.jButtonActualizarToolBarCargoInven.setVisible((this.isVisibilidadCeldaActualizarCargoInven  && this.isPermisoActualizarCargoInven));	
			this.jInternalFrameDetalleFormCargoInven.jButtonEliminarToolBarCargoInven.setVisible((this.isVisibilidadCeldaEliminarCargoInven && this.isPermisoEliminarCargoInven));
			this.jInternalFrameDetalleFormCargoInven.jButtonCancelarToolBarCargoInven.setVisible(this.isVisibilidadCeldaCancelarCargoInven);				
			this.jInternalFrameDetalleFormCargoInven.jButtonGuardarCambiosToolBarCargoInven.setVisible((this.isVisibilidadCeldaGuardarCargoInven && this.isPermisoGuardarCambiosCargoInven));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCargoInven.setVisible((this.isVisibilidadCeldaGuardarCambiosCargoInven && this.isPermisoGuardarCambiosCargoInven));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCargoInven.setVisible((this.isVisibilidadCeldaNuevoCargoInven && this.isPermisoNuevoCargoInven));			
			this.jMenuItemDuplicarCargoInven.setVisible((this.isVisibilidadCeldaDuplicarCargoInven && this.isPermisoDuplicarCargoInven));			
			this.jMenuItemCopiarCargoInven.setVisible((this.isVisibilidadCeldaCopiarCargoInven && this.isPermisoCopiarCargoInven));			
			this.jMenuItemVerFormCargoInven.setVisible((this.isVisibilidadCeldaVerFormCargoInven && this.isPermisoVerFormCargoInven));			
			this.jMenuItemAbrirOrderByCargoInven.setVisible((this.isVisibilidadCeldaOrdenCargoInven && this.isPermisoOrdenCargoInven));			
			//this.jMenuItemMostrarOcultarCargoInven.setVisible((this.isVisibilidadCeldaOrdenCargoInven && this.isPermisoOrdenCargoInven));
			this.jMenuItemDetalleAbrirOrderByCargoInven.setVisible((this.isVisibilidadCeldaOrdenCargoInven && this.isPermisoOrdenCargoInven));			
			//this.jMenuItemDetalleMostrarOcultarCargoInven.setVisible((this.isVisibilidadCeldaOrdenCargoInven && this.isPermisoOrdenCargoInven));			
			this.jMenuItemNuevoRelacionesCargoInven.setVisible((this.isVisibilidadCeldaNuevoRelacionesCargoInven && this.isPermisoNuevoCargoInven));			
			this.jMenuItemNuevoGuardarCambiosCargoInven.setVisible((this.isVisibilidadCeldaNuevoCargoInven && this.isPermisoNuevoCargoInven && this.isPermisoGuardarCambiosCargoInven));									
			
			if(this.jInternalFrameDetalleFormCargoInven!=null) {
			this.jInternalFrameDetalleFormCargoInven.jMenuItemModificarCargoInven.setVisible((this.isVisibilidadCeldaModificarCargoInven && this.isPermisoActualizarCargoInven));	
			this.jInternalFrameDetalleFormCargoInven.jMenuItemActualizarCargoInven.setVisible((this.isVisibilidadCeldaActualizarCargoInven && this.isPermisoActualizarCargoInven));	
			this.jInternalFrameDetalleFormCargoInven.jMenuItemEliminarCargoInven.setVisible((this.isVisibilidadCeldaEliminarCargoInven && this.isPermisoEliminarCargoInven));
			this.jInternalFrameDetalleFormCargoInven.jMenuItemCancelarCargoInven.setVisible(this.isVisibilidadCeldaCancelarCargoInven);				
			}
			
			this.jMenuItemGuardarCambiosCargoInven.setVisible((this.isVisibilidadCeldaGuardarCargoInven && this.isPermisoGuardarCambiosCargoInven));						
			this.jMenuItemGuardarCambiosTablaCargoInven.setVisible((this.isVisibilidadCeldaGuardarCambiosCargoInven && this.isPermisoGuardarCambiosCargoInven));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCargoInven=this.jButtonNuevoCargoInven.isVisible();
			this.isVisibilidadCeldaDuplicarCargoInven=this.jButtonDuplicarCargoInven.isVisible();
			this.isVisibilidadCeldaCopiarCargoInven=this.jButtonCopiarCargoInven.isVisible();
			this.isVisibilidadCeldaVerFormCargoInven=this.jButtonVerFormCargoInven.isVisible();
			
			this.isVisibilidadCeldaOrdenCargoInven=this.jButtonAbrirOrderByCargoInven.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCargoInven=this.jButtonNuevoRelacionesCargoInven.isVisible();
			this.isVisibilidadCeldaModificarCargoInven=this.jButtonModificarCargoInven.isVisible();
			
			if(this.jInternalFrameDetalleFormCargoInven!=null) {
			this.isVisibilidadCeldaActualizarCargoInven=this.jInternalFrameDetalleFormCargoInven.jButtonActualizarCargoInven.isVisible();
			this.isVisibilidadCeldaEliminarCargoInven=this.jInternalFrameDetalleFormCargoInven.jButtonEliminarCargoInven.isVisible();
			this.isVisibilidadCeldaCancelarCargoInven=this.jInternalFrameDetalleFormCargoInven.jButtonCancelarCargoInven.isVisible();
			this.isVisibilidadCeldaGuardarCargoInven=this.jInternalFrameDetalleFormCargoInven.jButtonGuardarCambiosCargoInven.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCargoInven=this.jButtonGuardarCambiosTablaCargoInven.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCargoInven=this.jButtonNuevoToolBarCargoInven.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCargoInven=this.jButtonNuevoRelacionesToolBarCargoInven.isVisible();
			
			if(this.jInternalFrameDetalleFormCargoInven!=null) {
			this.isVisibilidadCeldaModificarCargoInven=this.jInternalFrameDetalleFormCargoInven.jButtonModificarToolBarCargoInven.isVisible();
			this.isVisibilidadCeldaActualizarCargoInven=this.jInternalFrameDetalleFormCargoInven.jButtonActualizarToolBarCargoInven.isVisible();
			this.isVisibilidadCeldaEliminarCargoInven=this.jInternalFrameDetalleFormCargoInven.jButtonEliminarToolBarCargoInven.isVisible();
			this.isVisibilidadCeldaCancelarCargoInven=this.jInternalFrameDetalleFormCargoInven.jButtonCancelarToolBarCargoInven.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCargoInven=this.jButtonGuardarCambiosToolBarCargoInven.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCargoInven=this.jButtonGuardarCambiosTablaToolBarCargoInven.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCargoInven=this.jMenuItemNuevoCargoInven.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCargoInven=this.jMenuItemNuevoRelacionesCargoInven.isVisible();
			
			if(this.jInternalFrameDetalleFormCargoInven!=null) {
			this.isVisibilidadCeldaModificarCargoInven=this.jInternalFrameDetalleFormCargoInven.jMenuItemModificarCargoInven.isVisible();
			this.isVisibilidadCeldaActualizarCargoInven=this.jInternalFrameDetalleFormCargoInven.jMenuItemActualizarCargoInven.isVisible();
			this.isVisibilidadCeldaEliminarCargoInven=this.jInternalFrameDetalleFormCargoInven.jMenuItemEliminarCargoInven.isVisible();
			this.isVisibilidadCeldaCancelarCargoInven=this.jInternalFrameDetalleFormCargoInven.jMenuItemCancelarCargoInven.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCargoInven=this.jMenuItemGuardarCambiosCargoInven.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCargoInven=this.jMenuItemGuardarCambiosTablaCargoInven.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCargoInven(Boolean esInicializar) {
		if(CargoInvenJInternalFrame.ISBINDING_MANUAL) {			
			if(this.cargoinvenSessionBean.getConGuardarRelaciones()) {
				//if(this.cargoinvenSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCargoInven();
			}
			
			this.inicializarActualizarBindingBotonesManualCargoInven(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCargoInven() {
		this.jButtonNuevoCargoInven.setVisible(this.isPermisoNuevoCargoInven);			
		this.jButtonDuplicarCargoInven.setVisible(this.isPermisoDuplicarCargoInven);			
		this.jButtonCopiarCargoInven.setVisible(this.isPermisoCopiarCargoInven);			
		this.jButtonVerFormCargoInven.setVisible(this.isPermisoVerFormCargoInven);			
		
		this.jButtonAbrirOrderByCargoInven.setVisible(this.isPermisoOrdenCargoInven);					
		
		this.jButtonNuevoRelacionesCargoInven.setVisible(this.isPermisoNuevoCargoInven);			
		
		if(this.jInternalFrameDetalleFormCargoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargoInven.jButtonModificarCargoInven.setVisible(this.isPermisoActualizarCargoInven);	
			this.jInternalFrameDetalleFormCargoInven.jButtonActualizarCargoInven.setVisible(this.isPermisoActualizarCargoInven);	
			this.jInternalFrameDetalleFormCargoInven.jButtonEliminarCargoInven.setVisible(this.isPermisoEliminarCargoInven);
			this.jInternalFrameDetalleFormCargoInven.jButtonCancelarCargoInven.setVisible(this.isVisibilidadCeldaCancelarCargoInven);						
			this.jInternalFrameDetalleFormCargoInven.jButtonGuardarCambiosCargoInven.setVisible(this.isPermisoGuardarCambiosCargoInven);							
		}
		
		this.jButtonGuardarCambiosTablaCargoInven.setVisible(this.isPermisoActualizarCargoInven);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCargoInven() {
		this.jInternalFrameDetalleFormCargoInven.jButtonModificarCargoInven.setVisible(this.isPermisoActualizarCargoInven);	
		this.jInternalFrameDetalleFormCargoInven.jButtonActualizarCargoInven.setVisible(this.isPermisoActualizarCargoInven);	
		this.jInternalFrameDetalleFormCargoInven.jButtonEliminarCargoInven.setVisible(this.isPermisoEliminarCargoInven);
		this.jInternalFrameDetalleFormCargoInven.jButtonCancelarCargoInven.setVisible(this.isVisibilidadCeldaCancelarCargoInven);							
		this.jInternalFrameDetalleFormCargoInven.jButtonGuardarCambiosCargoInven.setVisible((this.isVisibilidadCeldaGuardarCargoInven && this.isPermisoGuardarCambiosCargoInven));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCargoInven() {
		if(CargoInvenJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCargoInven();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCargoInven() {
	}
	
	public void jTableDatosCargoInvenListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCargoInven(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCargoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCargoInven(this.getcargoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargoInven(this.cargoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargoinven =(CargoInven) this.cargoinvenLogic.getCargoInvens().toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cargoinven =(CargoInven) this.cargoinvens.toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cargoinven==null) {
						this.cargoinven = new CargoInven();
					}

					this.setVariablesFormularioToObjetoActualCargoInven(this.cargoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargoInven(this.cargoinven);
				}

				if(this.cargoinven.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.cargoinven.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCargoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaCargoInvenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebCargoInven(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargoInven.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCargoInven.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCargoInven.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoinven =(CargoInven) this.cargoinvenLogic.getCargoInvens().toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cargoinven =(CargoInven) this.cargoinvens.toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCargoInven(this.getcargoinven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCargoInven(this.cargoinven);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.cargoinvenLogic.getConnexion());

				if(this.cargoinven.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.cargoinven.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCargoInven=(TitledBorder)this.jScrollPanelDatosCargoInven.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderCargoInven.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaCargoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCargoInven(this.getcargoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargoInven(this.cargoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargoinven =(CargoInven) this.cargoinvenLogic.getCargoInvens().toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cargoinven =(CargoInven) this.cargoinvens.toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cargoinven==null) {
						this.cargoinven = new CargoInven();
					}

					this.setVariablesFormularioToObjetoActualCargoInven(this.cargoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargoInven(this.cargoinven);
				}

				if(this.cargoinven.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.cargoinven.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCargoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contableCargoInvenActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.cuentacontableBeanSwingJInternalFrame.sTipoBusqueda="CuentaContable";

			if(!this.sFinalQueryGeneral_cuentacontable.equals("")) {
				this.cuentacontableBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_cuentacontable);
				this.cuentacontableBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.cuentacontableBeanSwingJInternalFrame.procesarBusqueda(this.cuentacontableBeanSwingJInternalFrame.sAccionBusqueda);
				this.cuentacontableBeanSwingJInternalFrame.inicializarActualizarBindingCuentaContable(false);
			}

			if(!this.sFinalQueryComboCuentaContable.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.cuentacontableBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderCargoInven=null;
			TitledBorder titledBordercuentacontable=null;

			if(!this.jScrollPanelDatosCargoInven.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderCargoInven=(TitledBorder)this.jScrollPanelDatosCargoInven.getBorder();
				titledBordercuentacontable=(TitledBorder)this.cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontable.setTitle(titledBorderCargoInven.getTitle() + " -> Cuenta Contable");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_cuenta_contableCargoInvenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontable=true;

			idTienePermisocuentacontable=this.tienePermisosUsuarioEnPaginaWebCargoInven(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontable) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargoInven.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCargoInven.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCargoInven.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoinven =(CargoInven) this.cargoinvenLogic.getCargoInvens().toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cargoinven =(CargoInven) this.cargoinvens.toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCargoInven(this.getcargoinven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCargoInven(this.cargoinven);

				this.cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontableBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.cargoinvenLogic.getConnexion());

				if(this.cargoinven.getid_cuenta_contable()!=null) {
					this.cuentacontableBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontableBeanSwingJInternalFrame.setIdActual(this.cargoinven.getid_cuenta_contable());
					this.cuentacontableBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontableBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCargoInven=(TitledBorder)this.jScrollPanelDatosCargoInven.getBorder();
				TitledBorder titledBordercuentacontable=(TitledBorder)this.cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontable.setTitle(titledBorderCargoInven.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contableCargoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCargoInven(this.getcargoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargoInven(this.cargoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargoinven =(CargoInven) this.cargoinvenLogic.getCargoInvens().toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cargoinven =(CargoInven) this.cargoinvens.toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cargoinven==null) {
						this.cargoinven = new CargoInven();
					}

					this.setVariablesFormularioToObjetoActualCargoInven(this.cargoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargoInven(this.cargoinven);
				}

				if(this.cargoinven.getid_cuenta_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable = "+this.cargoinven.getid_cuenta_contable().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCargoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contable_creditoCargoInvenActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.cuentacontablecreditoBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.cuentacontablecreditoBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.cuentacontablecreditoBeanSwingJInternalFrame.sTipoBusqueda="CuentaContableCredito";

			if(!this.sFinalQueryGeneral_cuentacontablecredito.equals("")) {
				this.cuentacontablecreditoBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_cuentacontablecredito);
				this.cuentacontablecreditoBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.cuentacontablecreditoBeanSwingJInternalFrame.procesarBusqueda(this.cuentacontablecreditoBeanSwingJInternalFrame.sAccionBusqueda);
				this.cuentacontablecreditoBeanSwingJInternalFrame.inicializarActualizarBindingCuentaContable(false);
			}

			if(!this.sFinalQueryComboCuentaContableCredito.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.cuentacontablecreditoBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderCargoInven=null;
			TitledBorder titledBordercuentacontablecredito=null;

			if(!this.jScrollPanelDatosCargoInven.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderCargoInven=(TitledBorder)this.jScrollPanelDatosCargoInven.getBorder();
				titledBordercuentacontablecredito=(TitledBorder)this.cuentacontablecreditoBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontablecredito.setTitle(titledBorderCargoInven.getTitle() + " -> Cuenta Contable");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_cuenta_contable_creditoCargoInvenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontablecredito=true;

			idTienePermisocuentacontablecredito=this.tienePermisosUsuarioEnPaginaWebCargoInven(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontablecredito) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargoInven.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCargoInven.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCargoInven.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoinven =(CargoInven) this.cargoinvenLogic.getCargoInvens().toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cargoinven =(CargoInven) this.cargoinvens.toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCargoInven(this.getcargoinven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCargoInven(this.cargoinven);

				this.cuentacontablecreditoBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontablecreditoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontablecreditoBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.cargoinvenLogic.getConnexion());

				if(this.cargoinven.getid_cuenta_contable_credito()!=null) {
					this.cuentacontablecreditoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontablecreditoBeanSwingJInternalFrame.setIdActual(this.cargoinven.getid_cuenta_contable_credito());
					this.cuentacontablecreditoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontablecreditoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontablecreditoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontablecreditoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCargoInven=(TitledBorder)this.jScrollPanelDatosCargoInven.getBorder();
				TitledBorder titledBordercuentacontablecredito=(TitledBorder)this.cuentacontablecreditoBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontablecredito.setTitle(titledBorderCargoInven.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contable_creditoCargoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCargoInven(this.getcargoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargoInven(this.cargoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargoinven =(CargoInven) this.cargoinvenLogic.getCargoInvens().toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cargoinven =(CargoInven) this.cargoinvens.toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cargoinven==null) {
						this.cargoinven = new CargoInven();
					}

					this.setVariablesFormularioToObjetoActualCargoInven(this.cargoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargoInven(this.cargoinven);
				}

				if(this.cargoinven.getid_cuenta_contable_credito()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable_credito = "+this.cargoinven.getid_cuenta_contable_credito().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCargoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_sriCargoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCargoInven(this.getcargoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargoInven(this.cargoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargoinven =(CargoInven) this.cargoinvenLogic.getCargoInvens().toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cargoinven =(CargoInven) this.cargoinvens.toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cargoinven==null) {
						this.cargoinven = new CargoInven();
					}

					this.setVariablesFormularioToObjetoActualCargoInven(this.cargoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargoInven(this.cargoinven);
				}

				if(this.cargoinven.getcon_sri()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_sri = "+this.cargoinven.getcon_sri().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCargoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionCargoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCargoInven(this.getcargoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargoInven(this.cargoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargoinven =(CargoInven) this.cargoinvenLogic.getCargoInvens().toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cargoinven =(CargoInven) this.cargoinvens.toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cargoinven==null) {
						this.cargoinven = new CargoInven();
					}

					this.setVariablesFormularioToObjetoActualCargoInven(this.cargoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargoInven(this.cargoinven);
				}

				if(this.cargoinven.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.cargoinven.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCargoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdCargoInvenCargoInvenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCargoInven(false,false);

			this.getCargoInvensFK_IdCargoInven();

			this.inicializarActualizarBindingCargoInven(false);

			//if(CargoInvenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCargoInven(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCuentaContableCargoInvenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCargoInven(false,false);

			this.getCargoInvensFK_IdCuentaContable();

			this.inicializarActualizarBindingCargoInven(false);

			//if(CargoInvenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCargoInven(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaCargoInvenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCargoInven(false,false);

			this.getCargoInvensFK_IdEmpresa();

			this.inicializarActualizarBindingCargoInven(false);

			//if(CargoInvenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCargoInven(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameCargoInven() {
		if(this.jInternalFrameDetalleFormCargoInven!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormCargoInven!=null) {
			this.jInternalFrameDetalleFormCargoInven.setVisible(false);	    			
			this.jInternalFrameDetalleFormCargoInven.dispose();
			this.jInternalFrameDetalleFormCargoInven=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCargoInven!=null) {
			this.jInternalFrameReporteDinamicoCargoInven.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCargoInven.dispose();
			this.jInternalFrameReporteDinamicoCargoInven=null;
		}
		
		if(this.jInternalFrameImportacionCargoInven!=null) {
			this.jInternalFrameImportacionCargoInven.setVisible(false);	    			
			this.jInternalFrameImportacionCargoInven.dispose();
			this.jInternalFrameImportacionCargoInven=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCargoInven();
			
			CargoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cargoinven,new Object(),this.cargoinvenParameterGeneral,this.cargoinvenReturnGeneral);
			
			
			if(sTipo.equals("NuevoCargoInven")) {
				jButtonNuevoCargoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCargoInven")) {
				jButtonDuplicarCargoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCargoInven")) {
				jButtonCopiarCargoInvenActionPerformed(evt);
			} else if(sTipo.equals("VerFormCargoInven")) {
				jButtonVerFormCargoInvenActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCargoInven")) {
				jButtonNuevoCargoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCargoInven")) {
				jButtonDuplicarCargoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCargoInven")) {
				jButtonNuevoCargoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCargoInven")) {
				jButtonDuplicarCargoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCargoInven")) {
				jButtonNuevoCargoInvenActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCargoInven")) {
				jButtonNuevoCargoInvenActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCargoInven")) {
				jButtonNuevoCargoInvenActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCargoInven")) {
				jButtonModificarCargoInvenActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCargoInven")) {
				jButtonModificarCargoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCargoInven")) {
				jButtonModificarCargoInvenActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCargoInven")) {
				jButtonActualizarCargoInvenActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCargoInven")) {
				jButtonActualizarCargoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCargoInven")) {
				jButtonActualizarCargoInvenActionPerformed(evt);
			} else if(sTipo.equals("EliminarCargoInven")) {
				jButtonEliminarCargoInvenActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCargoInven")) {
				jButtonEliminarCargoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCargoInven")) {
				jButtonEliminarCargoInvenActionPerformed(evt);
			} else if(sTipo.equals("CancelarCargoInven")) {
				jButtonCancelarCargoInvenActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCargoInven")) {
				jButtonCancelarCargoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCargoInven")) {
				jButtonCancelarCargoInvenActionPerformed(evt);
			} else if(sTipo.equals("CerrarCargoInven")) {
				jButtonCerrarCargoInvenActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCargoInven")) {
				jButtonCerrarCargoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCargoInven")) {
				jButtonCerrarCargoInvenActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCargoInven")) {
				jButtonMostrarOcultarCargoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCargoInven")) {
				jButtonCancelarCargoInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCargoInven")) {
				jButtonGuardarCambiosCargoInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCargoInven")) {
				jButtonGuardarCambiosCargoInvenActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCargoInven")) {
				jButtonCopiarCargoInvenActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCargoInven")) {
				jButtonVerFormCargoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCargoInven")) {
				jButtonGuardarCambiosCargoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCargoInven")) {
				jButtonCopiarCargoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCargoInven")) {
				jButtonVerFormCargoInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCargoInven")) {
				jButtonGuardarCambiosCargoInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCargoInven")) {
				jButtonGuardarCambiosCargoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCargoInven")) {
				jButtonGuardarCambiosCargoInvenActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCargoInven")) {
				jButtonRecargarInformacionCargoInvenActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCargoInven")) {
				jButtonRecargarInformacionCargoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCargoInven")) {
				jButtonRecargarInformacionCargoInvenActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresCargoInven")) {
				jButtonAnterioresCargoInvenActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCargoInven")) {
				jButtonAnterioresCargoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCargoInven")) {
				jButtonAnterioresCargoInvenActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCargoInven")) {
				jButtonSiguientesCargoInvenActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCargoInven")) {
				jButtonSiguientesCargoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCargoInven")) {
				jButtonSiguientesCargoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCargoInven") || sTipo.equals("MenuItemDetalleAbrirOrderByCargoInven")) {
				jButtonAbrirOrderByCargoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCargoInven") || sTipo.equals("MenuItemDetalleMostrarOcultarCargoInven")) {
				jButtonMostrarOcultarCargoInvenActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCargoInven")) {
				jButtonNuevoGuardarCambiosCargoInvenActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCargoInven")) {
				jButtonNuevoGuardarCambiosCargoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCargoInven")) {
				jButtonNuevoGuardarCambiosCargoInvenActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCargoInven")) {
				jButtonCerrarReporteDinamicoCargoInvenActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCargoInven")) {
				jButtonGenerarReporteDinamicoCargoInvenActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCargoInven")) {
				
				jButtonGenerarExcelReporteDinamicoCargoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCargoInven")) {
				jButtonCerrarImportacionCargoInvenActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCargoInven")) {
				
				jButtonGenerarImportacionCargoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCargoInven")) {
				
				jButtonAbrirImportacionCargoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCargoInven")) {
				jComboBoxTiposAccionesCargoInvenActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCargoInven")) {
				jComboBoxTiposRelacionesCargoInvenActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCargoInven")) {
				jComboBoxTiposAccionesCargoInvenActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCargoInven")) {
				
				jComboBoxTiposSeleccionarCargoInvenActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCargoInven")) {
				jTextFieldValorCampoGeneralCargoInvenActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCargoInven")) {
				jButtonAbrirOrderByCargoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCargoInven")) {
				jButtonAbrirOrderByCargoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCargoInven")) {
				jButtonCerrarOrderByCargoInvenActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCargoInvenBusqueda")) {
				this.jButtonidCargoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCargoInvenUpdate")) {
				this.jButtonid_empresaCargoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCargoInvenBusqueda")) {
				this.jButtonid_empresaCargoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contableCargoInven")) {
				this.jButtonid_cuenta_contableCargoInvenActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contableCargoInvenArbol")) {
				this.abrirFrameTreeCuentaContable("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contableCargoInvenUpdate")) {
				this.jButtonid_cuenta_contableCargoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contableCargoInvenBusqueda")) {
				this.jButtonid_cuenta_contableCargoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoCargoInven")) {
				this.jButtonid_cuenta_contable_creditoCargoInvenActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoCargoInvenArbol")) {
				this.abrirFrameTreeCuentaContableCredito("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoCargoInvenUpdate")) {
				this.jButtonid_cuenta_contable_creditoCargoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoCargoInvenBusqueda")) {
				this.jButtonid_cuenta_contable_creditoCargoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_sriCargoInvenBusqueda")) {
				this.jButtoncon_sriCargoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionCargoInvenBusqueda")) {
				this.jButtondescripcionCargoInvenBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_cuenta_contable_creditoCargoInven")) {
				this.jButtonid_cuenta_contable_creditoCargoInvenActionPerformed(evt);
			}
			else if(sTipo.equals("id_cuenta_contableCargoInven")) {
				this.jButtonid_cuenta_contableCargoInvenActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdCargoInvenCargoInven")) {
				this.jButtonFK_IdCargoInvenCargoInvenActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdCuentaContableCargoInven")) {
				this.jButtonFK_IdCuentaContableCargoInvenActionPerformed(evt);
			}
			
			;
			
			
			CargoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cargoinven,new Object(),this.cargoinvenParameterGeneral,this.cargoinvenReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCargoInven();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCargoInvenActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cargoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cargoinven);
				
				CargoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargoinven,new Object(),this.cargoinvenParameterGeneral,this.cargoinvenReturnGeneral);
				
				


				
				CargoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargoinven,new Object(),this.cargoinvenParameterGeneral,this.cargoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CargoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CargoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			CargoInven cargoinvenLocal=null;
			
			if(!this.getEsControlTabla()) {
				cargoinvenLocal=this.cargoinven;
			} else {
				cargoinvenLocal=this.cargoinvenAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cargoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cargoinven);
				
				CargoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargoinven,new Object(),this.cargoinvenParameterGeneral,this.cargoinvenReturnGeneral);
							
				
				


				
				CargoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargoinven,new Object(),this.cargoinvenParameterGeneral,this.cargoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CargoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CargoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCargoInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCargoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoinvenAnterior =(CargoInven) this.cargoinvenLogic.getCargoInvens().toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cargoinvenAnterior =(CargoInven) this.cargoinvens.toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
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
			
			CargoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargoinven,new Object(),this.cargoinvenParameterGeneral,this.cargoinvenReturnGeneral);
			
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
			
			


			
			CargoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargoinven,new Object(),this.cargoinvenParameterGeneral,this.cargoinvenReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCargoInvenActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cargoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cargoinven);
				
				CargoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargoinven,new Object(),this.cargoinvenParameterGeneral,this.cargoinvenReturnGeneral);
								
						
				


				
				CargoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargoinven,new Object(),this.cargoinvenParameterGeneral,this.cargoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CargoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CargoInven.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cargoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cargoinven);
				
				CargoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargoinven,new Object(),this.cargoinvenParameterGeneral,this.cargoinvenReturnGeneral);
								
				
				


				
				CargoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargoinven,new Object(),this.cargoinvenParameterGeneral,this.cargoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CargoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CargoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCargoInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCargoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoinvenAnterior =(CargoInven) this.cargoinvenLogic.getCargoInvens().toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cargoinvenAnterior =(CargoInven) this.cargoinvens.toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cargoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cargoinven);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCargoInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCargoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoinvenAnterior =(CargoInven) this.cargoinvenLogic.getCargoInvens().toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cargoinvenAnterior =(CargoInven) this.cargoinvens.toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCargoInvenActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cargoinven);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cargoinven);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cargoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cargoinven);
				
				CargoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargoinven,new Object(),this.cargoinvenParameterGeneral,this.cargoinvenReturnGeneral);
							
				
				


				
				CargoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargoinven,new Object(),this.cargoinvenParameterGeneral,this.cargoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CargoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CargoInven.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCargoInvenActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCargoInven.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargoinvenAnterior =(CargoInven) this.cargoinvenLogic.getCargoInvens().toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cargoinvenAnterior =(CargoInven) this.cargoinvens.toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
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
			
			CargoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargoinven,new Object(),this.cargoinvenParameterGeneral,this.cargoinvenReturnGeneral);
			
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
			
			


			
			CargoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargoinven,new Object(),this.cargoinvenParameterGeneral,this.cargoinvenReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCargoInvenActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cargoinven);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cargoinven);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cargoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cargoinven);
				
				CargoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargoinven,new Object(),this.cargoinvenParameterGeneral,this.cargoinvenReturnGeneral);
								
				
				


				
				CargoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargoinven,new Object(),this.cargoinvenParameterGeneral,this.cargoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CargoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CargoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCargoInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCargoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoinvenAnterior =(CargoInven) this.cargoinvenLogic.getCargoInvens().toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cargoinvenAnterior =(CargoInven) this.cargoinvens.toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCargoInvenActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cargoinven);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cargoinven);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCargoInvenActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cargoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cargoinven);
				
				CargoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cargoinven,new Object(),this.cargoinvenParameterGeneral,this.cargoinvenReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCargoInven")) {
					jCheckBoxSeleccionarTodosCargoInvenItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCargoInven")) {
					jCheckBoxSeleccionadosCargoInvenItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCargoInven")) {
					
				}
				
				


				
				
				CargoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cargoinven,new Object(),this.cargoinvenParameterGeneral,this.cargoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CargoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CargoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.cargoinven);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.cargoinven);
				
				CargoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cargoinven,new Object(),this.cargoinvenParameterGeneral,this.cargoinvenReturnGeneral);
												
				
				


				
				
				CargoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cargoinven,new Object(),this.cargoinvenParameterGeneral,this.cargoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CargoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CargoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCargoInvenActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCargoInven.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargoinvenAnterior =(CargoInven) this.cargoinvenLogic.getCargoInvens().toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cargoinvenAnterior =(CargoInven) this.cargoinvens.toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCargoInvenActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cargoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cargoinven);
				
				CargoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cargoinven,new Object(),this.cargoinvenParameterGeneral,this.cargoinvenReturnGeneral);
				
				
				CargoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cargoinven,new Object(),this.cargoinvenParameterGeneral,this.cargoinvenReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
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
			
			CargoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cargoinven,new Object(),this.cargoinvenParameterGeneral,this.cargoinvenReturnGeneral);
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
			
			


			
			CargoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargoinven,new Object(),this.cargoinvenParameterGeneral,this.cargoinvenReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCargoInvenActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cargoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cargoinven);
				
				CargoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cargoinven,new Object(),this.cargoinvenParameterGeneral,this.cargoinvenReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				CargoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargoinven,new Object(),this.cargoinvenParameterGeneral,this.cargoinvenReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CargoInven.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CargoInven.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cargoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cargoinven);
				
				CargoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cargoinven,new Object(),this.cargoinvenParameterGeneral,this.cargoinvenReturnGeneral);
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
				
				


				
				CargoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargoinven,new Object(),this.cargoinvenParameterGeneral,this.cargoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CargoInven.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CargoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCargoInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCargoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoinvenAnterior =(CargoInven) this.cargoinvenLogic.getCargoInvens().toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cargoinvenAnterior =(CargoInven) this.cargoinvens.toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CargoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargoinven,new Object(),this.cargoinvenParameterGeneral,this.cargoinvenReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCargoInven")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCargoInvenListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCargoInven.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.cargoinven =(CargoInven) this.cargoinvenLogic.getCargoInvens().toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.cargoinven =(CargoInven) this.cargoinvens.toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.cargoinven);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCargoInven")) {
				
				}
				
				CargoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargoinven,new Object(),this.cargoinvenParameterGeneral,this.cargoinvenReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CargoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cargoinven,new Object(),this.cargoinvenParameterGeneral,this.cargoinvenReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCargoInven")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCargoInven.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCargoInven")) {
			
			}
			
			CargoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cargoinven,new Object(),this.cargoinvenParameterGeneral,this.cargoinvenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCargoInven();
			
			CargoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cargoinven,new Object(),this.cargoinvenParameterGeneral,this.cargoinvenReturnGeneral);
			
			if(sTipo.equals("NuevoCargoInven")) {
				jButtonNuevoCargoInvenActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCargoInven")) {
				jButtonDuplicarCargoInvenActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCargoInven")) {
				jButtonCopiarCargoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCargoInven")) {
				jButtonVerFormCargoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCargoInven")) {
				jButtonNuevoCargoInvenActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCargoInven")) {
				jButtonModificarCargoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCargoInven")) {
				jButtonActualizarCargoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCargoInven")) {
				jButtonEliminarCargoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCargoInven")) {
				jButtonGuardarCambiosCargoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCargoInven")) {
				jButtonCancelarCargoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCargoInven")) {
				jButtonCerrarCargoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCargoInven")) {
				jButtonGuardarCambiosCargoInvenActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCargoInven")) {
				jButtonNuevoGuardarCambiosCargoInvenActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCargoInven")) {
				jButtonAbrirOrderByCargoInvenActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCargoInven")) {
				jButtonRecargarInformacionCargoInvenActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCargoInven")) {
				jButtonAnterioresCargoInvenActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCargoInven")) {
				jButtonSiguientesCargoInvenActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCargoInvenBusqueda")) {
				this.jButtonidCargoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCargoInvenUpdate")) {
				this.jButtonid_empresaCargoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCargoInvenBusqueda")) {
				this.jButtonid_empresaCargoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contableCargoInven")) {
				this.jButtonid_cuenta_contableCargoInvenActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contableCargoInvenArbol")) {
				this.abrirFrameTreeCuentaContable("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contableCargoInvenUpdate")) {
				this.jButtonid_cuenta_contableCargoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contableCargoInvenBusqueda")) {
				this.jButtonid_cuenta_contableCargoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoCargoInven")) {
				this.jButtonid_cuenta_contable_creditoCargoInvenActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoCargoInvenArbol")) {
				this.abrirFrameTreeCuentaContableCredito("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoCargoInvenUpdate")) {
				this.jButtonid_cuenta_contable_creditoCargoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoCargoInvenBusqueda")) {
				this.jButtonid_cuenta_contable_creditoCargoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_sriCargoInvenBusqueda")) {
				this.jButtoncon_sriCargoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionCargoInvenBusqueda")) {
				this.jButtondescripcionCargoInvenBusquedaActionPerformed(evt);
			}
			
			CargoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cargoinven,new Object(),this.cargoinvenParameterGeneral,this.cargoinvenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCargoInven();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CargoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cargoinven,new Object(),this.cargoinvenParameterGeneral,this.cargoinvenReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCargoInven")) {
				closingInternalFrameCargoInven();
				
			} else if(sTipo.equals("jButtonCancelarCargoInven")) {
				JInternalFrameBase jInternalFrameDetalleFormCargoInven = (JInternalFrameBase)evt.getSource();
	            	
	            CargoInvenBeanSwingJInternalFrame jInternalFrameParent=(CargoInvenBeanSwingJInternalFrame)jInternalFrameDetalleFormCargoInven.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCargoInvenActionPerformed(null);
			}
			
			CargoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cargoinven,new Object(),this.cargoinvenParameterGeneral,this.cargoinvenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCargoInven(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCargoInven(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCargoInven(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.cargoinven)) {
			if(!esControlTabla) {
				if(CargoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCargoInven(this.cargoinven,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCargoInven(this.cargoinven);			
				}
				
				if(this.cargoinvenSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCargoInven(this.cargoinven,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.cargoinvenReturnGeneral=cargoinvenLogic.procesarEventosCargoInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cargoinvenLogic.getCargoInvens(),this.cargoinven,this.cargoinvenParameterGeneral,this.isEsNuevoCargoInven,classes);//this.cargoinvenLogic.getCargoInven()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCargoInven(this.cargoinvenReturnGeneral,this.cargoinvenBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.cargoinvenSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCargoInven(classes,this.cargoinvenReturnGeneral,this.cargoinvenBean,false);
					}
						
					if(this.cargoinvenReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCargoInven(this.cargoinvenReturnGeneral.getCargoInven());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCargoInven(this.cargoinvenReturnGeneral.getCargoInven());	
					}
						
					if(this.cargoinvenReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCargoInven(this.cargoinvenReturnGeneral.getCargoInven(),classes);//this.cargoinvenBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCargoInven(this.cargoinven,classes);//this.cargoinvenBean);									
				}
			
				if(CargoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCargoInven(this.cargoinven,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCargoInven(this.cargoinven);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.cargoinvenAnterior!=null) {
						this.cargoinven=this.cargoinvenAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.cargoinvenReturnGeneral=cargoinvenLogic.procesarEventosCargoInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cargoinvenLogic.getCargoInvens(),this.cargoinven,this.cargoinvenParameterGeneral,this.isEsNuevoCargoInven,classes);//this.cargoinvenLogic.getCargoInven()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cargoinvenSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cargoinvenSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.cargoinvenReturnGeneral.getCargoInven(),cargoinvenLogic.getCargoInvens());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.cargoinvenReturnGeneral.getCargoInven(),this.cargoinvens);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCargoInven.repaint();
				
				//((AbstractTableModel) this.jTableDatosCargoInven.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCargoInven();
			}
		}
	}
	
	public void actualizarVisualTableDatosCargoInven() throws Exception {
		
		CargoInvenModel cargoinvenModel=(CargoInvenModel)this.jTableDatosCargoInven.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cargoinvenModel.cargoinvens=this.cargoinvenLogic.getCargoInvens();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			cargoinvenModel.cargoinvens=this.cargoinvens;
		}
		
		
		((CargoInvenModel) this.jTableDatosCargoInven.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCargoInven() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcargoinvenAnterior(),this.cargoinvenLogic.getCargoInvens());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcargoinvenAnterior(),this.cargoinvens);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCargoInven();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCargoInven(CargoInven cargoinven,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
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
										
				CargoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cargoinven,new Object(),generalEntityParameterGeneral,this.cargoinvenReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.cargoinvenSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CargoInvenConstantesFunciones.getClassesRelationshipsOfCargoInven(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CargoInvenConstantesFunciones.getClassesRelationshipsFromStringsOfCargoInven(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCargoInven(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CargoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cargoinven,new Object(),generalEntityParameterGeneral,this.cargoinvenReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCargoInven(CargoInvenBean cargoinvenBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCargoInven(ArrayList<Classe> classes,CargoInvenReturnGeneral cargoinvenReturnGeneral,CargoInvenBean cargoinvenBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCargoInven(CargoInven cargoinven,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.cargoinven)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCargoInven = new CargoInvenDetalleFormJInternalFrame(jDesktopPane,this.cargoinvenSessionBean.getConGuardarRelaciones(),this.cargoinvenSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCargoInven);
		this.jInternalFrameDetalleFormCargoInven.setVisible(false);
		this.jInternalFrameDetalleFormCargoInven.setSelected(false);						
		
		this.jInternalFrameDetalleFormCargoInven.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCargoInven.cargoinvenLogic=this.cargoinvenLogic;
		
		this.cargarCombosFrameForeignKeyCargoInven("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCargoInven();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCargoInven();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCargoInven("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCargoInven();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCargoInven.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCargoInven"));
		
		this.jInternalFrameDetalleFormCargoInven.jButtonModificarCargoInven.addActionListener(new ButtonActionListener(this,"ModificarCargoInven"));

		
		this.jInternalFrameDetalleFormCargoInven.jButtonModificarToolBarCargoInven.addActionListener(new ButtonActionListener(this,"ModificarToolBarCargoInven"));
					
		this.jInternalFrameDetalleFormCargoInven.jMenuItemModificarCargoInven.addActionListener(new ButtonActionListener(this,"MenuItemModificarCargoInven"));		
		
		
		
		this.jInternalFrameDetalleFormCargoInven.jButtonActualizarCargoInven.addActionListener (new ButtonActionListener(this,"ActualizarCargoInven"));
		
		
		this.jInternalFrameDetalleFormCargoInven.jButtonActualizarToolBarCargoInven.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCargoInven"));
						
		this.jInternalFrameDetalleFormCargoInven.jMenuItemActualizarCargoInven.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCargoInven"));		
		
		
		
		this.jInternalFrameDetalleFormCargoInven.jButtonEliminarCargoInven.addActionListener (new ButtonActionListener(this,"EliminarCargoInven"));
		
		
		this.jInternalFrameDetalleFormCargoInven.jButtonEliminarToolBarCargoInven.addActionListener (new ButtonActionListener(this,"EliminarToolBarCargoInven"));
								
		this.jInternalFrameDetalleFormCargoInven.jMenuItemEliminarCargoInven.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCargoInven"));		
		
		
		
		this.jInternalFrameDetalleFormCargoInven.jButtonCancelarCargoInven.addActionListener (new ButtonActionListener(this,"CancelarCargoInven"));
		
		
		this.jInternalFrameDetalleFormCargoInven.jButtonCancelarToolBarCargoInven.addActionListener (new ButtonActionListener(this,"CancelarToolBarCargoInven"));
					
		this.jInternalFrameDetalleFormCargoInven.jMenuItemCancelarCargoInven.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCargoInven"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCargoInven.jMenuItemDetalleCerrarCargoInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCargoInven"));		
		
		
		
		this.jInternalFrameDetalleFormCargoInven.jButtonGuardarCambiosToolBarCargoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCargoInven"));
		
		
		
		this.jInternalFrameDetalleFormCargoInven.jButtonGuardarCambiosToolBarCargoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCargoInven"));
		
		
		
		this.jInternalFrameDetalleFormCargoInven.jComboBoxTiposAccionesFormularioCargoInven.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCargoInven"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargoInven.jButtonidCargoInvenBusqueda.addActionListener(new ButtonActionListener(this,"idCargoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargoInven.jButtonid_empresaCargoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCargoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargoInven.jButtonid_empresaCargoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCargoInvenBusqueda"));
		//jButtonid_cuenta_contableCargoInven.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contableCargoInvenActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCargoInven.jButtonid_cuenta_contableCargoInven.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCargoInven"));
		//jButtonid_cuenta_contableCargoInvenArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContable("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormCargoInven.jButtonid_cuenta_contableCargoInvenArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCargoInvenArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargoInven.jButtonid_cuenta_contableCargoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCargoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargoInven.jButtonid_cuenta_contableCargoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCargoInvenBusqueda"));
		//jButtonid_cuenta_contable_creditoCargoInven.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contable_creditoCargoInvenActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCargoInven.jButtonid_cuenta_contable_creditoCargoInven.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoCargoInven"));
		//jButtonid_cuenta_contable_creditoCargoInvenArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContableCredito("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormCargoInven.jButtonid_cuenta_contable_creditoCargoInvenArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoCargoInvenArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargoInven.jButtonid_cuenta_contable_creditoCargoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoCargoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargoInven.jButtonid_cuenta_contable_creditoCargoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoCargoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargoInven.jButtoncon_sriCargoInvenBusqueda.addActionListener(new ButtonActionListener(this,"con_sriCargoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargoInven.jButtondescripcionCargoInvenBusqueda.addActionListener(new ButtonActionListener(this,"descripcionCargoInvenBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCargoInven.jTabbedPaneRelacionesCargoInven.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCargoInven"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCargoInven"));
		
		if(this.jInternalFrameDetalleFormCargoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargoInven.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCargoInven"));
		}
		
		this.jTableDatosCargoInven.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCargoInven"));
		
		this.jTableDatosCargoInven.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCargoInven"));
		
		this.jButtonNuevoCargoInven.addActionListener(new ButtonActionListener(this,"NuevoCargoInven"));
		
		this.jButtonDuplicarCargoInven.addActionListener(new ButtonActionListener(this,"DuplicarCargoInven"));
		
		this.jButtonCopiarCargoInven.addActionListener(new ButtonActionListener(this,"CopiarCargoInven"));
		
		this.jButtonVerFormCargoInven.addActionListener(new ButtonActionListener(this,"VerFormCargoInven"));
		
		
		this.jButtonNuevoToolBarCargoInven.addActionListener(new ButtonActionListener(this,"NuevoToolBarCargoInven"));
			
		this.jButtonDuplicarToolBarCargoInven.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCargoInven"));
			
		this.jMenuItemNuevoCargoInven.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCargoInven"));
			
		this.jMenuItemDuplicarCargoInven.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCargoInven"));		
		
		
		this.jButtonNuevoRelacionesCargoInven.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCargoInven"));
		
		
		this.jButtonNuevoRelacionesToolBarCargoInven.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCargoInven"));
			
		this.jMenuItemNuevoRelacionesCargoInven.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCargoInven"));		
		
		
		if(this.jInternalFrameDetalleFormCargoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargoInven.jButtonModificarCargoInven.addActionListener(new ButtonActionListener(this,"ModificarCargoInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormCargoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargoInven.jButtonModificarToolBarCargoInven.addActionListener(new ButtonActionListener(this,"ModificarToolBarCargoInven"));
			
			this.jInternalFrameDetalleFormCargoInven.jMenuItemModificarCargoInven.addActionListener(new ButtonActionListener(this,"MenuItemModificarCargoInven"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCargoInven!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCargoInven.jButtonActualizarCargoInven.addActionListener (new ButtonActionListener(this,"ActualizarCargoInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormCargoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargoInven.jButtonActualizarToolBarCargoInven.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCargoInven"));
				
			this.jInternalFrameDetalleFormCargoInven.jMenuItemActualizarCargoInven.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCargoInven"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCargoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargoInven.jButtonEliminarCargoInven.addActionListener (new ButtonActionListener(this,"EliminarCargoInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormCargoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargoInven.jButtonEliminarToolBarCargoInven.addActionListener (new ButtonActionListener(this,"EliminarToolBarCargoInven"));
						
			this.jInternalFrameDetalleFormCargoInven.jMenuItemEliminarCargoInven.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCargoInven"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCargoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargoInven.jButtonCancelarCargoInven.addActionListener (new ButtonActionListener(this,"CancelarCargoInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormCargoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargoInven.jButtonCancelarToolBarCargoInven.addActionListener (new ButtonActionListener(this,"CancelarToolBarCargoInven"));
			
			this.jInternalFrameDetalleFormCargoInven.jMenuItemCancelarCargoInven.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCargoInven"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCargoInven.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCargoInven"));		
		
		
		this.jButtonCerrarCargoInven.addActionListener (new ButtonActionListener(this,"CerrarCargoInven"));
		
		
		this.jButtonCerrarToolBarCargoInven.addActionListener (new ButtonActionListener(this,"CerrarToolBarCargoInven"));
			
		this.jMenuItemCerrarCargoInven.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCargoInven"));
			
		if(this.jInternalFrameDetalleFormCargoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargoInven.jMenuItemDetalleCerrarCargoInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCargoInven"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCargoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargoInven.jButtonGuardarCambiosCargoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosCargoInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormCargoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargoInven.jButtonGuardarCambiosToolBarCargoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCargoInven"));
		}
		
		this.jButtonCopiarToolBarCargoInven.addActionListener (new ButtonActionListener(this,"CopiarToolBarCargoInven"));
			
		this.jButtonVerFormToolBarCargoInven.addActionListener (new ButtonActionListener(this,"VerFormToolBarCargoInven"));
		
		this.jMenuItemGuardarCambiosCargoInven.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCargoInven"));
			
		this.jMenuItemCopiarCargoInven.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCargoInven"));		
		
		this.jMenuItemVerFormCargoInven.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCargoInven"));		
		
		
		this.jButtonGuardarCambiosTablaCargoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCargoInven"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCargoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCargoInven"));
			
		this.jMenuItemGuardarCambiosTablaCargoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCargoInven"));		
		
		
		
		this.jButtonRecargarInformacionCargoInven.addActionListener (new ButtonActionListener(this,"RecargarInformacionCargoInven"));
					
		this.jButtonRecargarInformacionToolBarCargoInven.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCargoInven"));
		
		this.jMenuItemRecargarInformacionCargoInven.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCargoInven"));		
		
		
		
		this.jButtonAnterioresCargoInven.addActionListener (new ButtonActionListener(this,"AnterioresCargoInven"));
		
		
		this.jButtonAnterioresToolBarCargoInven.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCargoInven"));
		
		this.jMenuItemAnterioresCargoInven.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCargoInven"));		
		
		
		this.jButtonSiguientesCargoInven.addActionListener (new ButtonActionListener(this,"SiguientesCargoInven"));
		
		
		this.jButtonSiguientesToolBarCargoInven.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCargoInven"));
			
		this.jMenuItemSiguientesCargoInven.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCargoInven"));
			
		this.jMenuItemAbrirOrderByCargoInven.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCargoInven"));
			
		this.jMenuItemMostrarOcultarCargoInven.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCargoInven"));
			
		this.jMenuItemDetalleAbrirOrderByCargoInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCargoInven"));
			
		this.jMenuItemDetalleMostarOcultarCargoInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCargoInven"));		
		
		
		this.jButtonNuevoGuardarCambiosCargoInven.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCargoInven"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCargoInven.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCargoInven"));
			
		this.jMenuItemNuevoGuardarCambiosCargoInven.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCargoInven"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCargoInven.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCargoInven"));

		this.jCheckBoxSeleccionadosCargoInven.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCargoInven"));
		
		if(this.jInternalFrameDetalleFormCargoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargoInven.jComboBoxTiposAccionesFormularioCargoInven.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCargoInven"));
		}
		
		
		this.jComboBoxTiposRelacionesCargoInven.addActionListener (new ButtonActionListener(this,"TiposRelacionesCargoInven"));
			
		this.jComboBoxTiposAccionesCargoInven.addActionListener (new ButtonActionListener(this,"TiposAccionesCargoInven"));
					
		this.jComboBoxTiposSeleccionarCargoInven.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCargoInven"));
			
		this.jTextFieldValorCampoGeneralCargoInven.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCargoInven"));		
		
		
		if(this.jInternalFrameDetalleFormCargoInven!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargoInven.jButtonidCargoInvenBusqueda.addActionListener(new ButtonActionListener(this,"idCargoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargoInven.jButtonid_empresaCargoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCargoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargoInven.jButtonid_empresaCargoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCargoInvenBusqueda"));
		//jButtonid_cuenta_contableCargoInven.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contableCargoInvenActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCargoInven.jButtonid_cuenta_contableCargoInven.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCargoInven"));
		//jButtonid_cuenta_contableCargoInvenArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContable("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormCargoInven.jButtonid_cuenta_contableCargoInvenArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCargoInvenArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargoInven.jButtonid_cuenta_contableCargoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCargoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargoInven.jButtonid_cuenta_contableCargoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCargoInvenBusqueda"));
		//jButtonid_cuenta_contable_creditoCargoInven.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contable_creditoCargoInvenActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCargoInven.jButtonid_cuenta_contable_creditoCargoInven.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoCargoInven"));
		//jButtonid_cuenta_contable_creditoCargoInvenArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContableCredito("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormCargoInven.jButtonid_cuenta_contable_creditoCargoInvenArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoCargoInvenArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargoInven.jButtonid_cuenta_contable_creditoCargoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoCargoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargoInven.jButtonid_cuenta_contable_creditoCargoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoCargoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargoInven.jButtoncon_sriCargoInvenBusqueda.addActionListener(new ButtonActionListener(this,"con_sriCargoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargoInven.jButtondescripcionCargoInvenBusqueda.addActionListener(new ButtonActionListener(this,"descripcionCargoInvenBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdCargoInvenCargoInven.addActionListener(new ButtonActionListener(this,"FK_IdCargoInvenCargoInven"));

			this.jButtonBuscarFK_IdCargoInvenid_cuenta_contable_creditoCargoInven.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoCargoInven"));

			this.jButtonFK_IdCuentaContableCargoInven.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableCargoInven"));

			this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableCargoInven.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCargoInven"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCargoInven!=null) {
				this.jInternalFrameReporteDinamicoCargoInven.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCargoInven"));
				this.jInternalFrameReporteDinamicoCargoInven.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCargoInven"));
				this.jInternalFrameReporteDinamicoCargoInven.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCargoInven"));
			}
			
			//this.jButtonCerrarReporteDinamicoCargoInven.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCargoInven"));				
			//this.jButtonGenerarReporteDinamicoCargoInven.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCargoInven"));
			//this.jButtonGenerarExcelReporteDinamicoCargoInven.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCargoInven"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCargoInven!=null) {
				this.jInternalFrameImportacionCargoInven.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCargoInven"));
				this.jInternalFrameImportacionCargoInven.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCargoInven"));
				this.jInternalFrameImportacionCargoInven.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCargoInven"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCargoInven.addActionListener (new ButtonActionListener(this,"AbrirOrderByCargoInven"));
			
			this.jButtonAbrirOrderByToolBarCargoInven.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCargoInven"));			
			
			if(this.jInternalFrameOrderByCargoInven!=null) {
				this.jInternalFrameOrderByCargoInven.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCargoInven"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCargoInven!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCargoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargoInven.jTabbedPaneRelacionesCargoInven.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCargoInven"));
		
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
            		closingInternalFrameCargoInven();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCargoInven.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCargoInven = (JInternalFrameBase)event.getSource();
	            	
	            CargoInvenBeanSwingJInternalFrame jInternalFrameParent=(CargoInvenBeanSwingJInternalFrame)jInternalFrameDetalleFormCargoInven.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCargoInvenActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCargoInven.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCargoInvenListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCargoInven.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCargoInven.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCargoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCargoInvenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCargoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCargoInvenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCargoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCargoInvenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCargoInven";
		inputMap = this.jButtonNuevoCargoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCargoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCargoInvenActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCargoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCargoInvenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCargoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCargoInvenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCargoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCargoInvenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCargoInven";
		inputMap = this.jButtonNuevoRelacionesCargoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCargoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCargoInvenActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCargoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCargoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCargoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCargoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCargoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCargoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCargoInven";
		inputMap = this.jButtonModificarCargoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCargoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCargoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCargoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCargoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCargoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCargoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCargoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCargoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCargoInven";
		inputMap = this.jButtonActualizarCargoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCargoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCargoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCargoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCargoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCargoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCargoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCargoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCargoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCargoInven";
		inputMap = this.jButtonEliminarCargoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCargoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCargoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCargoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCargoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCargoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCargoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCargoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCargoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCargoInven";
		inputMap = this.jButtonCancelarCargoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCargoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCargoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCargoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCargoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCargoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCargoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCargoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCargoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCargoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCargoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCargoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCargoInven";
		inputMap = this.jButtonCerrarCargoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCargoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCargoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCargoInven.jButtonGuardarCambiosCargoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCargoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCargoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCargoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCargoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCargoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCargoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCargoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCargoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCargoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCargoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCargoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCargoInven";
		inputMap = this.jInternalFrameDetalleFormCargoInven.jButtonGuardarCambiosCargoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCargoInven.jButtonGuardarCambiosCargoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCargoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCargoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCargoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCargoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCargoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCargoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCargoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresCargoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCargoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCargoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCargoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCargoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCargoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCargoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCargoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCargoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCargoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCargoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCargoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCargoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCargoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCargoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCargoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCargoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCargoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCargoInven.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCargoInvenItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCargoInven.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCargoInvenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCargoInven.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCargoInvenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCargoInven.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCargoInvenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargoInven.jButtonidCargoInvenBusqueda.addActionListener(new ButtonActionListener(this,"idCargoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargoInven.jButtonid_empresaCargoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCargoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargoInven.jButtonid_empresaCargoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCargoInvenBusqueda"));
		//jButtonid_cuenta_contableCargoInven.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contableCargoInvenActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCargoInven.jButtonid_cuenta_contableCargoInven.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCargoInven"));
		//jButtonid_cuenta_contableCargoInvenArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContable("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormCargoInven.jButtonid_cuenta_contableCargoInvenArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCargoInvenArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargoInven.jButtonid_cuenta_contableCargoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCargoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargoInven.jButtonid_cuenta_contableCargoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCargoInvenBusqueda"));
		//jButtonid_cuenta_contable_creditoCargoInven.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contable_creditoCargoInvenActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCargoInven.jButtonid_cuenta_contable_creditoCargoInven.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoCargoInven"));
		//jButtonid_cuenta_contable_creditoCargoInvenArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContableCredito("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormCargoInven.jButtonid_cuenta_contable_creditoCargoInvenArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoCargoInvenArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargoInven.jButtonid_cuenta_contable_creditoCargoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoCargoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargoInven.jButtonid_cuenta_contable_creditoCargoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoCargoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargoInven.jButtoncon_sriCargoInvenBusqueda.addActionListener(new ButtonActionListener(this,"con_sriCargoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargoInven.jButtondescripcionCargoInvenBusqueda.addActionListener(new ButtonActionListener(this,"descripcionCargoInvenBusqueda"));
		
		
		this.jButtonFK_IdCargoInvenCargoInven.addActionListener(new ButtonActionListener(this,"FK_IdCargoInvenCargoInven"));

		this.jButtonBuscarFK_IdCargoInvenid_cuenta_contable_creditoCargoInven.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoCargoInven"));

		this.jButtonFK_IdCuentaContableCargoInven.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableCargoInven"));

		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contableCargoInven.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCargoInven"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCargoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCargoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCargoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCargoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCargoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCargoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCargoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCargoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCargoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCargoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCargoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCargoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCargoInvenActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCargoInven.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCargoInven(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(CargoInven cargoinvenAux:this.cargoinvenLogic.getCargoInvens()) {
					cargoinvenAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CargoInven cargoinvenAux:cargoinvens) {
					cargoinvenAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCargoInvenItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCargoInven(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CargoInven cargoinvenAux:this.cargoinvenLogic.getCargoInvens()) {
						cargoinvenAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CargoInven cargoinvenAux:cargoinvens) {
						cargoinvenAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(CargoInven cargoinvenAux:this.cargoinvenLogic.getCargoInvens()) {
					
						if(sTipoSeleccionar.equals(CargoInvenConstantesFunciones.LABEL_CONSRI)) {
							existe=true;
							cargoinvenAux.setcon_sri(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CargoInven cargoinvenAux:cargoinvens) {
						
						if(sTipoSeleccionar.equals(CargoInvenConstantesFunciones.LABEL_CONSRI)) {
							existe=true;
							cargoinvenAux.setcon_sri(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCargoInven(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCargoInven.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCargoInven.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCargoInven,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCargoInvenItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCargoInven(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCargoInven.getSelectedRows();
			
			CargoInven cargoinvenLocal=new CargoInven();
			
			//this.seleccionarTodosCargoInven(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cargoinvenLocal =(CargoInven) this.cargoinvenLogic.getCargoInvens().toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					cargoinvenLocal =(CargoInven) this.cargoinvens.toArray()[this.jTableDatosCargoInven.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				cargoinvenLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CargoInven cargoinvenAux:this.cargoinvenLogic.getCargoInvens()) {
						cargoinvenAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CargoInven cargoinvenAux:cargoinvens) {
						cargoinvenAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCargoInven(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCargoInven.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCargoInven.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCargoInven,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCargoInvenItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCargoInvenParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCargoInvenActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCargoInven(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCargoInven.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CargoInven cargoinvenAux:this.cargoinvenLogic.getCargoInvens()) {
				
						if(sTipoSeleccionar.equals(CargoInvenConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							cargoinvenAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CargoInven cargoinvenAux:cargoinvens) {
					
						if(sTipoSeleccionar.equals(CargoInvenConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							cargoinvenAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCargoInven(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCargoInvenActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCargoInven(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCargoInven=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCargoInven.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCargoInven.jComboBoxTiposAccionesFormularioCargoInven.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCargoInven) {				
					conSplash=true;//false;										
					
					//this.startProcessCargoInven(conSplash);
				
					this.generarReporteCargoInvensSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCargoInven.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCargoInven.jComboBoxTiposAccionesFormularioCargoInven.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCargoInvensSeleccionados();
				//this.jComboBoxTiposAccionesCargoInven.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCargoInvensSeleccionados(false);
				//this.jComboBoxTiposAccionesCargoInven.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCargoInvensSeleccionados(true);
				//this.jComboBoxTiposAccionesCargoInven.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCargoInven();
				
				this.exportarCargoInvensSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCargoInven.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCargoInven.jComboBoxTiposAccionesFormularioCargoInven.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCargoInvens();
				//this.importarCargoInvens();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCargoInven.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCargoInven.jComboBoxTiposAccionesFormularioCargoInven.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCargoInven();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCargoInvensSeleccionados();
				//this.jComboBoxTiposAccionesCargoInven.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Cargo Inventario", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCargoInven();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCargoInven)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCargoInven(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Cargo Inventario",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCargoInven.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCargoInven.jComboBoxTiposAccionesFormularioCargoInven.setSelectedIndex(0);					
				}	
			} 			
			else if(CargoInvenBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCargoInven) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCargoInven(conSplash);
					
						//this.actualizarParametrosGeneralCargoInven();
						
						this.generarReporteProcesoAccionCargoInvensSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCargoInven.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCargoInven.jComboBoxTiposAccionesFormularioCargoInven.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CargoInvenBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Cargo InventarioES SELECCIONADOS?", "MANTENIMIENTO DE Cargo Inventario", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCargoInven();
				
						this.actualizarParametrosGeneralCargoInven();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.cargoinvenReturnGeneral=cargoinvenLogic.procesarAccionCargoInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.cargoinvenLogic.getCargoInvens(),this.cargoinvenParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCargoInvenReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCargoInven.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCargoInven.jComboBoxTiposAccionesFormularioCargoInven.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCargoInven();
					
					CargoInvenBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCargoInvenReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCargoInven.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCargoInven.jComboBoxTiposAccionesFormularioCargoInven.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCargoInven(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCargoInvenActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCargoInven();
			
			if(this.jInternalFrameDetalleFormCargoInven==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<CargoInven> cargoinvensSeleccionados=new ArrayList<CargoInven>();		
			CargoInven cargoinven=new CargoInven();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCargoInven(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCargoInven.getSelectedItem();
			
			
			
			
			cargoinvensSeleccionados=this.getCargoInvensSeleccionados(true);
			//this.sTipoAccion;
			
			if(cargoinvensSeleccionados.size()==1) {
				for(CargoInven cargoinvenAux:cargoinvensSeleccionados) {
					cargoinven=cargoinvenAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCargoInven();
			
      		//this.finishProcessCargoInven(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCargoInvenReturnGeneral() throws Exception {
		if(this.cargoinvenReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.cargoinvenReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.cargoinvenReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.cargoinvenReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.cargoinvenReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.cargoinvenReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCargoInven(false);
		}
		
		if(this.cargoinvenReturnGeneral.getConRetornoLista() || this.cargoinvenReturnGeneral.getConRetornoObjeto()) {
			if(this.cargoinvenReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cargoinvenLogic.setCargoInvens(this.cargoinvenReturnGeneral.getCargoInvens());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.cargoinvenReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cargoinvenLogic.setCargoInven(this.cargoinvenReturnGeneral.getCargoInven());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingCargoInven(false);
		}
	}
	
	public void actualizarParametrosGeneralCargoInven() throws Exception {
		
		
	}
	
	public ArrayList<CargoInven> getCargoInvensSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<CargoInven> cargoinvensSeleccionados=new ArrayList<CargoInven>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCargoInven) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(CargoInven cargoinvenAux:cargoinvenLogic.getCargoInvens()) {
					if(cargoinvenAux.getIsSelected()) {
						cargoinvensSeleccionados.add(cargoinvenAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CargoInven cargoinvenAux:this.cargoinvens) {
					if(cargoinvenAux.getIsSelected()) {
						cargoinvensSeleccionados.add(cargoinvenAux);				
					}
				}
			}
			
			if(cargoinvensSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						cargoinvensSeleccionados.addAll(this.cargoinvenLogic.getCargoInvens());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						cargoinvensSeleccionados.addAll(this.cargoinvens);				
					}
				}
			}
		} else {
			cargoinvensSeleccionados.add(this.cargoinven);
		}
		
		return cargoinvensSeleccionados;
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
	
	public void generarReporteCargoInvensSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalCargoInvensSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCargoInvensSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCargoInvensSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCargoInvensSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Cargo Inventario",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCargoInvensSeleccionados() throws Exception {
		ArrayList<CargoInven> cargoinvensSeleccionados=new ArrayList<CargoInven>();		
		
		cargoinvensSeleccionados=this.getCargoInvensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCargoInvens("Todos",cargoinvensSeleccionados);
		
	}	
	
	public void generarReporteNormalCargoInvensSeleccionados() throws Exception {
		ArrayList<CargoInven> cargoinvensSeleccionados=new ArrayList<CargoInven>();		
		
		cargoinvensSeleccionados=this.getCargoInvensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCargoInvens("Todos",cargoinvensSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCargoInvensSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<CargoInven> cargoinvensSeleccionados=new ArrayList<CargoInven>();
		
		cargoinvensSeleccionados=this.getCargoInvensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCargoInvens("Todos",cargoinvensSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoCargoInvensSeleccionados() throws Exception {
		ArrayList<CargoInven> cargoinvensSeleccionados=new ArrayList<CargoInven>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCargoInven();
		
		
		cargoinvensSeleccionados=this.getCargoInvensSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCargoInven();
		
		
		//this.generarReporteCargoInvens("Todos",cargoinvensSeleccionados ,cargoinvenImplementable,cargoinvenImplementableHome);
	}
	
	public void mostrarImportacionCargoInvens() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCargoInven();
		
		this.abrirFrameImportacionCargoInven();		
		
			
		//this.generarReporteCargoInvens("Todos",cargoinvensSeleccionados ,cargoinvenImplementable,cargoinvenImplementableHome);
	}
	
	public void importarCargoInvens() throws Exception {		
	
	}
	
	public void exportarCargoInvensSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCargoInvensSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCargoInvensSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCargoInvensSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Cargo Inventario",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCargoInvensSeleccionados() throws Exception {
		ArrayList<CargoInven> cargoinvensSeleccionados=new ArrayList<CargoInven>();		
		
		cargoinvensSeleccionados=this.getCargoInvensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cargoinven."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCargoInven(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(CargoInven cargoinvenAux:cargoinvensSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCargoInven(cargoinvenAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//cargoinvenAux.setsDetalleGeneralEntityReporte(cargoinvenAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cargoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cargo Inventario",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCargoInven(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CargoInvenConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CargoInvenConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CargoInvenConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CargoInvenConstantesFunciones.LABEL_IDCUENTACONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CargoInvenConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CargoInvenConstantesFunciones.LABEL_CONSRI;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CargoInvenConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCargoInven(CargoInven cargoinven,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=cargoinven.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=cargoinven.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=cargoinven.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cargoinven.getcuentacontable_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cargoinven.getcuentacontablecredito_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cargoinven.getcon_sri().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cargoinven.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCargoInvensSeleccionados() throws Exception {
		ArrayList<CargoInven> cargoinvensSeleccionados=new ArrayList<CargoInven>();		
		
		cargoinvensSeleccionados=this.getCargoInvensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cargoinven.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("CargoInvens");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCargoInven(row);				
				iRow++;
			}				
			
			for(CargoInven cargoinvenAux:cargoinvensSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCargoInven(cargoinvenAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cargoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cargo Inventario",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCargoInvensSeleccionados() throws Exception {
		ArrayList<CargoInven> cargoinvensSeleccionados=new ArrayList<CargoInven>();		
		
		cargoinvensSeleccionados=this.getCargoInvensSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cargoinven.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("cargoinvens");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("cargoinven");
			//elementRoot.appendChild(element);
		
			for(CargoInven cargoinvenAux:cargoinvensSeleccionados) {
				element = document.createElement("cargoinven");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCargoInven(cargoinvenAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cargoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cargo Inventario",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCargoInven(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CargoInvenConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CargoInvenConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CargoInvenConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(CargoInvenConstantesFunciones.LABEL_IDCUENTACONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(CargoInvenConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO);
		cell = row.createCell(iColumn++);cell.setCellValue(CargoInvenConstantesFunciones.LABEL_CONSRI);
		cell = row.createCell(iColumn++);cell.setCellValue(CargoInvenConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCargoInven(CargoInven cargoinven,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(cargoinven.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(cargoinven.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cargoinven.getcuentacontable_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cargoinven.getcuentacontablecredito_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cargoinven.getcon_sri());
		cell = row.createCell(iColumn++);cell.setCellValue(cargoinven.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlCargoInven(CargoInven cargoinven,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CargoInvenConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(cargoinven.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CargoInvenConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(cargoinven.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(CargoInvenConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(cargoinven.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcuentacontable_descripcion = document.createElement(CargoInvenConstantesFunciones.IDCUENTACONTABLE);
		elementcuentacontable_descripcion.appendChild(document.createTextNode(cargoinven.getcuentacontable_descripcion()));
		element.appendChild(elementcuentacontable_descripcion);

		Element elementcuentacontablecredito_descripcion = document.createElement(CargoInvenConstantesFunciones.IDCUENTACONTABLECREDITO);
		elementcuentacontablecredito_descripcion.appendChild(document.createTextNode(cargoinven.getcuentacontablecredito_descripcion()));
		element.appendChild(elementcuentacontablecredito_descripcion);

		Element elementcon_sri = document.createElement(CargoInvenConstantesFunciones.CONSRI);
		elementcon_sri.appendChild(document.createTextNode(cargoinven.getcon_sri().toString().trim()));
		element.appendChild(elementcon_sri);

		Element elementdescripcion = document.createElement(CargoInvenConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(cargoinven.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoCargoInvensSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<CargoInven> cargoinvensSeleccionados=new ArrayList<CargoInven>();
		
		cargoinvensSeleccionados=this.getCargoInvensSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoCargoInven(cargoinvensSeleccionados);
		
		this.generarReporteCargoInvens("Todos",cargoinvensSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCargoInven(ArrayList<CargoInven> cargoinvensSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(CargoInven cargoinvenAux:cargoinvensSeleccionados) {
				cargoinvenAux.setsDetalleGeneralEntityReporte(cargoinvenAux.toString());
			
				if(sTipoSeleccionar.equals(CargoInvenConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					cargoinvenAux.setsDescripcionGeneralEntityReporte1(cargoinvenAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CargoInvenConstantesFunciones.LABEL_IDCUENTACONTABLE)) {
					existe=true;
					cargoinvenAux.setsDescripcionGeneralEntityReporte1(cargoinvenAux.getcuentacontable_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CargoInvenConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO)) {
					existe=true;
					cargoinvenAux.setsDescripcionGeneralEntityReporte1(cargoinvenAux.getcuentacontablecredito_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CargoInvenConstantesFunciones.LABEL_CONSRI)) {
					existe=true;
					cargoinvenAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(cargoinvenAux.getcon_sri()));
				}
				 else if(sTipoSeleccionar.equals(CargoInvenConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					cargoinvenAux.setsDescripcionGeneralEntityReporte1(cargoinvenAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCargoInven(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCargoInven=true;
				this.isVisibilidadCeldaNuevoRelacionesCargoInven=true;
				this.isVisibilidadCeldaGuardarCambiosCargoInven=true;
			}
			
			this.isVisibilidadCeldaModificarCargoInven=false;
			this.isVisibilidadCeldaActualizarCargoInven=false;
			this.isVisibilidadCeldaEliminarCargoInven=false;
			this.isVisibilidadCeldaCancelarCargoInven=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCargoInven=true;
				} else {
					this.isVisibilidadCeldaGuardarCargoInven=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCargoInven=false;
			this.isVisibilidadCeldaNuevoRelacionesCargoInven=false;
			this.isVisibilidadCeldaGuardarCambiosCargoInven=false;
			this.isVisibilidadCeldaModificarCargoInven=false;
			this.isVisibilidadCeldaActualizarCargoInven=true;
			this.isVisibilidadCeldaEliminarCargoInven=false;
			this.isVisibilidadCeldaCancelarCargoInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCargoInven=true;
				} else {
					this.isVisibilidadCeldaGuardarCargoInven=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCargoInven=false;
			this.isVisibilidadCeldaNuevoRelacionesCargoInven=false;
			this.isVisibilidadCeldaGuardarCambiosCargoInven=false;
			this.isVisibilidadCeldaModificarCargoInven=false;
			this.isVisibilidadCeldaActualizarCargoInven=true;
			this.isVisibilidadCeldaEliminarCargoInven=true;
			this.isVisibilidadCeldaCancelarCargoInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCargoInven=true;
				} else {
					this.isVisibilidadCeldaGuardarCargoInven=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCargoInven=false;
			this.isVisibilidadCeldaNuevoRelacionesCargoInven=false;
			this.isVisibilidadCeldaGuardarCambiosCargoInven=false;
			this.isVisibilidadCeldaModificarCargoInven=false;
			this.isVisibilidadCeldaActualizarCargoInven=true;
			this.isVisibilidadCeldaEliminarCargoInven=false;
			this.isVisibilidadCeldaCancelarCargoInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCargoInven=false;
				} else {
					this.isVisibilidadCeldaGuardarCargoInven=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCargoInven=true;
			this.isVisibilidadCeldaNuevoRelacionesCargoInven=true;
			this.isVisibilidadCeldaGuardarCambiosCargoInven=true;
			this.isVisibilidadCeldaModificarCargoInven=false;
			this.isVisibilidadCeldaActualizarCargoInven=false;
			this.isVisibilidadCeldaEliminarCargoInven=false;
			this.isVisibilidadCeldaCancelarCargoInven=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCargoInven=true;
				} else {
					this.isVisibilidadCeldaGuardarCargoInven=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCargoInven=false;
			this.isVisibilidadCeldaNuevoRelacionesCargoInven=false;
			this.isVisibilidadCeldaGuardarCambiosCargoInven=false;
			this.isVisibilidadCeldaActualizarCargoInven=false;
			this.isVisibilidadCeldaEliminarCargoInven=false;
			this.isVisibilidadCeldaCancelarCargoInven=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCargoInven=false;
				} else {
					this.isVisibilidadCeldaGuardarCargoInven=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCargoInven=false;
			this.isVisibilidadCeldaNuevoRelacionesCargoInven=false;
			this.isVisibilidadCeldaGuardarCambiosCargoInven=false;
			this.isVisibilidadCeldaModificarCargoInven=true;
			this.isVisibilidadCeldaActualizarCargoInven=false;
			this.isVisibilidadCeldaEliminarCargoInven=false;
			this.isVisibilidadCeldaCancelarCargoInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCargoInven=false;
				} else {
					this.isVisibilidadCeldaGuardarCargoInven=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CargoInvenJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCargoInven=true;
			this.isVisibilidadCeldaNuevoRelacionesCargoInven=true;
			this.isVisibilidadCeldaGuardarCambiosCargoInven=true;
		} else {
			this.actualizarEstadoPanelsCargoInven(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCargoInven=false;
			//this.isVisibilidadCeldaVerFormCargoInven=false;
			this.isVisibilidadCeldaDuplicarCargoInven=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!cargoinvenSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCargoInven=false;
		} else {
			this.isVisibilidadCeldaNuevoCargoInven=false;
			this.isVisibilidadCeldaGuardarCambiosCargoInven=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(cargoinvenSessionBean.getEsGuardarRelacionado()) {
			if(!cargoinvenSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCargoInven=false;												
			}
			
			this.jButtonCerrarCargoInven.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCargoInven=false;
		}
		
		if(!this.permiteMantenimiento(this.cargoinven)) {
			this.isVisibilidadCeldaActualizarCargoInven=false;
			this.isVisibilidadCeldaEliminarCargoInven=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCargoInven() {
	}
	
	public void actualizarEstadoPanelsCargoInven(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCargoInven!=null) {
				this.jScrollPanelDatosEdicionCargoInven.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCargoInven!=null) {
				this.jTabbedPaneBusquedasCargoInven.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCargoInven!=null) {
				this.jScrollPanelDatosCargoInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionCargoInven!=null) {
				this.jPanelPaginacionCargoInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCargoInven!=null) {
				this.jPanelParametrosReportesCargoInven.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCargoInven!=null) {
				this.jScrollPanelDatosEdicionCargoInven.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCargoInven!=null) {
				this.jTabbedPaneBusquedasCargoInven.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosCargoInven!=null) {
				this.jScrollPanelDatosCargoInven.setVisible(false);
			}
			
			if(this.jPanelPaginacionCargoInven!=null) {
				this.jPanelPaginacionCargoInven.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCargoInven!=null) {
				this.jPanelParametrosReportesCargoInven.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCargoInven!=null) {
				this.jScrollPanelDatosEdicionCargoInven.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCargoInven!=null) {
				this.jTabbedPaneBusquedasCargoInven.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCargoInven!=null) {
				this.jScrollPanelDatosCargoInven.setVisible(false);
			}
			
			if(this.jPanelPaginacionCargoInven!=null) {
				this.jPanelPaginacionCargoInven.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCargoInven!=null) {
				this.jPanelParametrosReportesCargoInven.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCargoInven!=null) {
				this.jScrollPanelDatosEdicionCargoInven.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCargoInven!=null) {
				this.jTabbedPaneBusquedasCargoInven.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCargoInven!=null) {
				this.jScrollPanelDatosCargoInven.setVisible(false);
			}
			
			if(this.jPanelPaginacionCargoInven!=null) {
				this.jPanelPaginacionCargoInven.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCargoInven!=null) {
				this.jPanelParametrosReportesCargoInven.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCargoInven!=null) {
				this.jScrollPanelDatosEdicionCargoInven.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCargoInven!=null) {
				this.jTabbedPaneBusquedasCargoInven.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCargoInven!=null) {
				this.jScrollPanelDatosCargoInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionCargoInven!=null) {
				this.jPanelPaginacionCargoInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCargoInven!=null) {
				this.jPanelParametrosReportesCargoInven.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCargoInven!=null) {
				this.jScrollPanelDatosEdicionCargoInven.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCargoInven!=null) {
				this.jTabbedPaneBusquedasCargoInven.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCargoInven!=null) {
				this.jScrollPanelDatosCargoInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionCargoInven!=null) {
				this.jPanelPaginacionCargoInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCargoInven!=null) {
				this.jPanelParametrosReportesCargoInven.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCargoInven!=null) {
				this.jScrollPanelDatosEdicionCargoInven.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCargoInven!=null) {
				this.jTabbedPaneBusquedasCargoInven.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCargoInven!=null) {
				this.jScrollPanelDatosCargoInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionCargoInven!=null) {
				this.jPanelPaginacionCargoInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCargoInven!=null) {
				this.jPanelParametrosReportesCargoInven.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.cargoinvenSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasCargoInven!=null) {
					this.jTabbedPaneBusquedasCargoInven.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesCargoInven!=null) {
				this.jPanelParametrosReportesCargoInven.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.cargoinvenSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCargoInven!=null) {
				this.jTabbedPaneBusquedasCargoInven.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesCargoInven!=null) {
				this.jPanelParametrosReportesCargoInven.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCargoInven=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCargoInven) {this.jTabbedPaneBusquedasCargoInven.remove(jPanelFK_IdCargoInvenCargoInven);}

			this.isVisibilidadFK_IdCuentaContable=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasCargoInven.remove(jPanelFK_IdCuentaContableCargoInven);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaContable(Boolean isParaCuentaContable){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableNegation=!isParaCuentaContable;

			this.isVisibilidadFK_IdCargoInven=isParaCuentaContableNegation;
			if(!this.isVisibilidadFK_IdCargoInven) {this.jTabbedPaneBusquedasCargoInven.remove(jPanelFK_IdCargoInvenCargoInven);}

			this.isVisibilidadFK_IdCuentaContable=isParaCuentaContable;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasCargoInven.remove(jPanelFK_IdCuentaContableCargoInven);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaContableCredito(Boolean isParaCuentaContableCredito){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableCreditoNegation=!isParaCuentaContableCredito;

			this.isVisibilidadFK_IdCargoInven=isParaCuentaContableCredito;
			if(!this.isVisibilidadFK_IdCargoInven) {this.jTabbedPaneBusquedasCargoInven.remove(jPanelFK_IdCargoInvenCargoInven);}

			this.isVisibilidadFK_IdCuentaContable=isParaCuentaContableCreditoNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasCargoInven.remove(jPanelFK_IdCuentaContableCargoInven);}
		}
		
	}
	
	
	
	

	public String registrarSesionCargoInvenParaBusquedaCuentaContables() throws Exception {
		Boolean isPaginaPopupCuentaContable=false;

		try {

			if(cargoinvenSessionBean==null) {
				cargoinvenSessionBean=new CargoInvenSessionBean();
			}

			if(cuentacontableSessionBean==null) {
				cuentacontableSessionBean=new CuentaContableSessionBean();
			}

			cuentacontableSessionBean.setsPathNavegacionActual(cargoinvenSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CuentaContableConstantesFunciones.SCLASSWEBTITULO);
			cuentacontableSessionBean.setisPermiteRecargarInformacion(false);
			cuentacontableSessionBean.setisPaginaPopup(true);
			isPaginaPopupCuentaContable=cuentacontableSessionBean.getisPaginaPopup();
			cuentacontableSessionBean.setisPaginaPopup(false);
			cuentacontableSessionBean.setEstaModoBusqueda(true);
			cuentacontableSessionBean.setsFuncionBusquedaRapida("window.opener.cargoinvenFuncionGeneral.setCombosCodigoDesdeBusquedaid_cuenta_contable(TO_REPLACE);");
			cuentacontableSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCuentaContable(true);
			cuentacontableSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContable(CargoInvenConstantesFunciones.SNOMBREOPCION);
			//cuentacontableSessionBean.setisBusquedaDesdeForeignKeySesionCargoInven(true);
			//cuentacontableSessionBean.setlidCargoInvenActual(this.idCargoInvenActual);

			cargoinvenSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyCargoInven(true);
			cargoinvenSessionBean.setlIdCargoInvenActualForeignKey(this.idCargoInvenActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}

	public String registrarSesionCargoInvenParaBusquedaCuentaContableCreditos() throws Exception {
		Boolean isPaginaPopupCuentaContable=false;

		try {

			if(cargoinvenSessionBean==null) {
				cargoinvenSessionBean=new CargoInvenSessionBean();
			}

			if(cuentacontablecreditoSessionBean==null) {
				cuentacontablecreditoSessionBean=new CuentaContableSessionBean();
			}

			cuentacontablecreditoSessionBean.setsPathNavegacionActual(cargoinvenSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CuentaContableConstantesFunciones.SCLASSWEBTITULO);
			cuentacontablecreditoSessionBean.setisPermiteRecargarInformacion(false);
			cuentacontablecreditoSessionBean.setisPaginaPopup(true);
			isPaginaPopupCuentaContable=cuentacontablecreditoSessionBean.getisPaginaPopup();
			cuentacontablecreditoSessionBean.setisPaginaPopup(false);
			cuentacontablecreditoSessionBean.setEstaModoBusqueda(true);
			cuentacontablecreditoSessionBean.setsFuncionBusquedaRapida("window.opener.cargoinvenFuncionGeneral.setCombosCodigoDesdeBusquedaid_cuenta_contable_credito(TO_REPLACE);");
			cuentacontablecreditoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCuentaContable(true);
			cuentacontablecreditoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContable(CargoInvenConstantesFunciones.SNOMBREOPCION);
			//cuentacontableSessionBean.setisBusquedaDesdeForeignKeySesionCargoInven(true);
			//cuentacontableSessionBean.setlidCargoInvenActual(this.idCargoInvenActual);

			cargoinvenSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyCargoInven(true);
			cargoinvenSessionBean.setlIdCargoInvenActualForeignKey(this.idCargoInvenActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//CargoInvenSessionBean cargoinvenSessionBean=new CargoInvenSessionBean();
		
		if(this.cargoinvenSessionBean==null) {
			this.cargoinvenSessionBean=new CargoInvenSessionBean();
		}
		
		this.cargoinvenSessionBean.setsUltimaBusquedaCargoInven(this.getsAccionBusqueda());
		this.cargoinvenSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.cargoinvenSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCargoInven")) {
			cargoinvenSessionBean.setid_cuenta_contable_credito(this.getid_cuenta_contable_creditoFK_IdCargoInven());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdCuentaContable")) {
			cargoinvenSessionBean.setid_cuenta_contable(this.getid_cuenta_contableFK_IdCuentaContable());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			cargoinvenSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//CargoInvenSessionBean cargoinvenSessionBean=new CargoInvenSessionBean();
		
		if(this.cargoinvenSessionBean==null) {
			this.cargoinvenSessionBean=new CargoInvenSessionBean();
		}
		
		if(this.cargoinvenSessionBean.getsUltimaBusquedaCargoInven()!=null&&!this.cargoinvenSessionBean.getsUltimaBusquedaCargoInven().equals("")) {
			this.setsAccionBusqueda(cargoinvenSessionBean.getsUltimaBusquedaCargoInven());
			this.setiNumeroPaginacion(cargoinvenSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(cargoinvenSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCargoInven")) {
				this.setid_cuenta_contable_creditoFK_IdCargoInven(cargoinvenSessionBean.getid_cuenta_contable_credito());
				cargoinvenSessionBean.setid_cuenta_contable_credito(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdCuentaContable")) {
				this.setid_cuenta_contableFK_IdCuentaContable(cargoinvenSessionBean.getid_cuenta_contable());
				cargoinvenSessionBean.setid_cuenta_contable(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(cargoinvenSessionBean.getid_empresa());
				cargoinvenSessionBean.setid_empresa(-1L);
			}
		}
		
		this.cargoinvenSessionBean.setsUltimaBusquedaCargoInven("");
		this.cargoinvenSessionBean.setiNumeroPaginacion(CargoInvenConstantesFunciones.INUMEROPAGINACION);
		this.cargoinvenSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaCargoInven(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCargoInven() {
		this.updateBorderResaltarBusquedasFormularioCargoInven();
		this.updateVisibilidadBusquedasFormularioCargoInven();
		this.updateHabilitarBusquedasFormularioCargoInven();
	}
	
	public void updateBorderResaltarBusquedasFormularioCargoInven() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasCargoInven.getComponents().length>0) {
	

		if(this.cargoinvenConstantesFunciones.resaltarFK_IdCargoInvenCargoInven!=null) {
			index= this.jTabbedPaneBusquedasCargoInven.indexOfComponent(this.jPanelFK_IdCargoInvenCargoInven);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCargoInven.getComponent(index);
				jPanel.setBorder(this.cargoinvenConstantesFunciones.resaltarFK_IdCargoInvenCargoInven);
			}
		}

		if(this.cargoinvenConstantesFunciones.resaltarFK_IdCuentaContableCargoInven!=null) {
			index= this.jTabbedPaneBusquedasCargoInven.indexOfComponent(this.jPanelFK_IdCuentaContableCargoInven);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCargoInven.getComponent(index);
				jPanel.setBorder(this.cargoinvenConstantesFunciones.resaltarFK_IdCuentaContableCargoInven);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioCargoInven() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasCargoInven.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCargoInven.indexOfComponent(this.jPanelFK_IdCargoInvenCargoInven);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCargoInven.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cargoinvenConstantesFunciones.mostrarFK_IdCargoInvenCargoInven);
			if(!this.cargoinvenConstantesFunciones.mostrarFK_IdCargoInvenCargoInven && index>-1) {
				this.jTabbedPaneBusquedasCargoInven.remove(index);
			}

			index= this.jTabbedPaneBusquedasCargoInven.indexOfComponent(this.jPanelFK_IdCuentaContableCargoInven);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCargoInven.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cargoinvenConstantesFunciones.mostrarFK_IdCuentaContableCargoInven);
			if(!this.cargoinvenConstantesFunciones.mostrarFK_IdCuentaContableCargoInven && index>-1) {
				this.jTabbedPaneBusquedasCargoInven.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioCargoInven() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasCargoInven.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCargoInven.indexOfComponent(this.jPanelFK_IdCargoInvenCargoInven);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCargoInven.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cargoinvenConstantesFunciones.activarFK_IdCargoInvenCargoInven);
				this.jTabbedPaneBusquedasCargoInven.setEnabledAt(index,this.cargoinvenConstantesFunciones.activarFK_IdCargoInvenCargoInven);
			}

			index= this.jTabbedPaneBusquedasCargoInven.indexOfComponent(this.jPanelFK_IdCuentaContableCargoInven);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCargoInven.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cargoinvenConstantesFunciones.activarFK_IdCuentaContableCargoInven);
				this.jTabbedPaneBusquedasCargoInven.setEnabledAt(index,this.cargoinvenConstantesFunciones.activarFK_IdCuentaContableCargoInven);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaCargoInven(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCargoInven")) {
			index= this.jTabbedPaneBusquedasCargoInven.indexOfComponent(this.jPanelFK_IdCargoInvenCargoInven);

			this.jTabbedPaneBusquedasCargoInven.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCargoInven.getComponent(index);

			this.cargoinvenConstantesFunciones.setResaltarFK_IdCargoInvenCargoInven(resaltar);

			jPanel.setBorder(this.cargoinvenConstantesFunciones.resaltarFK_IdCargoInvenCargoInven);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdCuentaContable")) {
			index= this.jTabbedPaneBusquedasCargoInven.indexOfComponent(this.jPanelFK_IdCuentaContableCargoInven);

			this.jTabbedPaneBusquedasCargoInven.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCargoInven.getComponent(index);

			this.cargoinvenConstantesFunciones.setResaltarFK_IdCuentaContableCargoInven(resaltar);

			jPanel.setBorder(this.cargoinvenConstantesFunciones.resaltarFK_IdCuentaContableCargoInven);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarCargoInven.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioCargoInven() throws Exception {

		if(this.jInternalFrameDetalleFormCargoInven==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCargoInven();
		this.updateVisibilidadResaltarControlesFormularioCargoInven();
		this.updateHabilitarResaltarControlesFormularioCargoInven();
		
	}
	
	public void updateBorderResaltarControlesFormularioCargoInven() throws Exception {
		if(this.jInternalFrameDetalleFormCargoInven==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.cargoinvenConstantesFunciones.resaltaridCargoInven!=null && this.jInternalFrameDetalleFormCargoInven!=null) {this.jInternalFrameDetalleFormCargoInven.jLabelidCargoInven.setBorder(this.cargoinvenConstantesFunciones.resaltaridCargoInven);}
		if(this.cargoinvenConstantesFunciones.resaltarid_empresaCargoInven!=null && this.jInternalFrameDetalleFormCargoInven!=null) {this.jInternalFrameDetalleFormCargoInven.jComboBoxid_empresaCargoInven.setBorder(this.cargoinvenConstantesFunciones.resaltarid_empresaCargoInven);}
		if(this.cargoinvenConstantesFunciones.resaltarid_cuenta_contableCargoInven!=null && this.jInternalFrameDetalleFormCargoInven!=null) {this.jInternalFrameDetalleFormCargoInven.jComboBoxid_cuenta_contableCargoInven.setBorder(this.cargoinvenConstantesFunciones.resaltarid_cuenta_contableCargoInven);}
		if(this.cargoinvenConstantesFunciones.resaltarid_cuenta_contable_creditoCargoInven!=null && this.jInternalFrameDetalleFormCargoInven!=null) {this.jInternalFrameDetalleFormCargoInven.jComboBoxid_cuenta_contable_creditoCargoInven.setBorder(this.cargoinvenConstantesFunciones.resaltarid_cuenta_contable_creditoCargoInven);}
		if(this.cargoinvenConstantesFunciones.resaltarcon_sriCargoInven!=null && this.jInternalFrameDetalleFormCargoInven!=null) {this.jInternalFrameDetalleFormCargoInven.jCheckBoxcon_sriCargoInven.setBorderPainted(true);this.jInternalFrameDetalleFormCargoInven.jCheckBoxcon_sriCargoInven.setBorder(this.cargoinvenConstantesFunciones.resaltarcon_sriCargoInven);}
		if(this.cargoinvenConstantesFunciones.resaltardescripcionCargoInven!=null && this.jInternalFrameDetalleFormCargoInven!=null) {this.jInternalFrameDetalleFormCargoInven.jTextFielddescripcionCargoInven.setBorder(this.cargoinvenConstantesFunciones.resaltardescripcionCargoInven);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCargoInven() throws Exception {		
		if(this.jInternalFrameDetalleFormCargoInven==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCargoInven!=null) {
	
		//this.jInternalFrameDetalleFormCargoInven.jLabelidCargoInven.setVisible(this.cargoinvenConstantesFunciones.mostraridCargoInven);
		this.jInternalFrameDetalleFormCargoInven.jPanelidCargoInven.setVisible(this.cargoinvenConstantesFunciones.mostraridCargoInven);
		//this.jInternalFrameDetalleFormCargoInven.jComboBoxid_empresaCargoInven.setVisible(this.cargoinvenConstantesFunciones.mostrarid_empresaCargoInven);
		this.jInternalFrameDetalleFormCargoInven.jPanelid_empresaCargoInven.setVisible(this.cargoinvenConstantesFunciones.mostrarid_empresaCargoInven);
		//this.jInternalFrameDetalleFormCargoInven.jComboBoxid_cuenta_contableCargoInven.setVisible(this.cargoinvenConstantesFunciones.mostrarid_cuenta_contableCargoInven);
		this.jInternalFrameDetalleFormCargoInven.jPanelid_cuenta_contableCargoInven.setVisible(this.cargoinvenConstantesFunciones.mostrarid_cuenta_contableCargoInven);
			this.jInternalFrameDetalleFormCargoInven.jButtonid_cuenta_contableCargoInven.setVisible(this.cargoinvenConstantesFunciones.mostrarid_cuenta_contableCargoInven);
		//this.jInternalFrameDetalleFormCargoInven.jComboBoxid_cuenta_contable_creditoCargoInven.setVisible(this.cargoinvenConstantesFunciones.mostrarid_cuenta_contable_creditoCargoInven);
		this.jInternalFrameDetalleFormCargoInven.jPanelid_cuenta_contable_creditoCargoInven.setVisible(this.cargoinvenConstantesFunciones.mostrarid_cuenta_contable_creditoCargoInven);
			this.jInternalFrameDetalleFormCargoInven.jButtonid_cuenta_contable_creditoCargoInven.setVisible(this.cargoinvenConstantesFunciones.mostrarid_cuenta_contable_creditoCargoInven);
		//this.jInternalFrameDetalleFormCargoInven.jCheckBoxcon_sriCargoInven.setVisible(this.cargoinvenConstantesFunciones.mostrarcon_sriCargoInven);
		this.jInternalFrameDetalleFormCargoInven.jPanelcon_sriCargoInven.setVisible(this.cargoinvenConstantesFunciones.mostrarcon_sriCargoInven);
		//this.jInternalFrameDetalleFormCargoInven.jTextFielddescripcionCargoInven.setVisible(this.cargoinvenConstantesFunciones.mostrardescripcionCargoInven);
		this.jInternalFrameDetalleFormCargoInven.jPaneldescripcionCargoInven.setVisible(this.cargoinvenConstantesFunciones.mostrardescripcionCargoInven);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCargoInven() throws Exception {
		if(this.jInternalFrameDetalleFormCargoInven==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCargoInven!=null) {
	
		this.jInternalFrameDetalleFormCargoInven.jLabelidCargoInven.setEnabled(this.cargoinvenConstantesFunciones.activaridCargoInven);
		this.jInternalFrameDetalleFormCargoInven.jComboBoxid_empresaCargoInven.setEnabled(this.cargoinvenConstantesFunciones.activarid_empresaCargoInven);
		this.jInternalFrameDetalleFormCargoInven.jComboBoxid_cuenta_contableCargoInven.setEnabled(this.cargoinvenConstantesFunciones.activarid_cuenta_contableCargoInven);
			this.jInternalFrameDetalleFormCargoInven.jButtonid_cuenta_contableCargoInven.setEnabled(this.cargoinvenConstantesFunciones.activarid_cuenta_contableCargoInven);
		this.jInternalFrameDetalleFormCargoInven.jComboBoxid_cuenta_contable_creditoCargoInven.setEnabled(this.cargoinvenConstantesFunciones.activarid_cuenta_contable_creditoCargoInven);
			this.jInternalFrameDetalleFormCargoInven.jButtonid_cuenta_contable_creditoCargoInven.setEnabled(this.cargoinvenConstantesFunciones.activarid_cuenta_contable_creditoCargoInven);
		this.jInternalFrameDetalleFormCargoInven.jCheckBoxcon_sriCargoInven.setEnabled(this.cargoinvenConstantesFunciones.activarcon_sriCargoInven);
		this.jInternalFrameDetalleFormCargoInven.jTextFielddescripcionCargoInven.setEnabled(this.cargoinvenConstantesFunciones.activardescripcionCargoInven);
		}
	}
	
		
}