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
package com.bydan.erp.sris.presentation.swing.jinternalframes;




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

import com.bydan.erp.sris.util.CuentaCreditoFiscalConstantesFunciones;
import com.bydan.erp.sris.util.CuentaCreditoFiscalParameterReturnGeneral;
//import com.bydan.erp.sris.util.CuentaCreditoFiscalParameterGeneral;
//import com.bydan.erp.sris.presentation.report.source.CuentaCreditoFiscalBean;
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

import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.sris.resources.reportes.AuxiliarReportes;


import com.bydan.erp.sris.util.*;
import com.bydan.erp.sris.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.sris.business.entity.*;
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


import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;

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
public class CuentaCreditoFiscalBeanSwingJInternalFrame extends CuentaCreditoFiscalJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CuentaCreditoFiscalBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<CuentaCreditoFiscal> cuentacreditofiscalValidator = new ClassValidator<CuentaCreditoFiscal>(CuentaCreditoFiscal.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public CuentaCreditoFiscal cuentacreditofiscal;	
	public CuentaCreditoFiscal cuentacreditofiscalAux;
	public CuentaCreditoFiscal cuentacreditofiscalAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public CuentaCreditoFiscal cuentacreditofiscalTotales;
	public Long idCuentaCreditoFiscalActual;
	public Long iIdNuevoCuentaCreditoFiscal=0L;
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
	
	public Boolean isPermisoTodoCuentaCreditoFiscal;
	public Boolean isPermisoNuevoCuentaCreditoFiscal;
	public Boolean isPermisoActualizarCuentaCreditoFiscal;
	public Boolean isPermisoActualizarOriginalCuentaCreditoFiscal;
	public Boolean isPermisoEliminarCuentaCreditoFiscal;
	public Boolean isPermisoGuardarCambiosCuentaCreditoFiscal;
	public Boolean isPermisoConsultaCuentaCreditoFiscal;
	public Boolean isPermisoBusquedaCuentaCreditoFiscal;
	public Boolean isPermisoReporteCuentaCreditoFiscal;
	public Boolean isPermisoPaginacionMedioCuentaCreditoFiscal;
	public Boolean isPermisoPaginacionAltoCuentaCreditoFiscal;
	public Boolean isPermisoPaginacionTodoCuentaCreditoFiscal;
	public Boolean isPermisoCopiarCuentaCreditoFiscal;
	public Boolean isPermisoVerFormCuentaCreditoFiscal;
	public Boolean isPermisoDuplicarCuentaCreditoFiscal;
	public Boolean isPermisoOrdenCuentaCreditoFiscal;
	
	
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
	
	public CuentaCreditoFiscalParameterReturnGeneral cuentacreditofiscalReturnGeneral;
	public CuentaCreditoFiscalParameterReturnGeneral cuentacreditofiscalParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCuentaCreditoFiscal=false;
	public Boolean esParaAccionDesdeFormularioCuentaCreditoFiscal=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CuentaCreditoFiscalSessionBeanAdditional cuentacreditofiscalSessionBeanAdditional=null;
	
	public CuentaCreditoFiscalSessionBeanAdditional getCuentaCreditoFiscalSessionBeanAdditional() {
		return this.cuentacreditofiscalSessionBeanAdditional;
	}
	
	public void setCuentaCreditoFiscalSessionBeanAdditional(CuentaCreditoFiscalSessionBeanAdditional cuentacreditofiscalSessionBeanAdditional) {
		try {
			this.cuentacreditofiscalSessionBeanAdditional=cuentacreditofiscalSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CuentaCreditoFiscalBeanSwingJInternalFrameAdditional cuentacreditofiscalBeanSwingJInternalFrameAdditional=null;
	//public class CuentaCreditoFiscalBeanSwingJInternalFrame
	
	public CuentaCreditoFiscalBeanSwingJInternalFrameAdditional getCuentaCreditoFiscalBeanSwingJInternalFrameAdditional() {
		return this.cuentacreditofiscalBeanSwingJInternalFrameAdditional;
	}
	
	public void setCuentaCreditoFiscalBeanSwingJInternalFrameAdditional(CuentaCreditoFiscalBeanSwingJInternalFrameAdditional cuentacreditofiscalBeanSwingJInternalFrameAdditional) {
		try {
			this.cuentacreditofiscalBeanSwingJInternalFrameAdditional=cuentacreditofiscalBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CuentaCreditoFiscalLogic cuentacreditofiscalLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public CuentaCreditoFiscal cuentacreditofiscalBean;
	public CuentaCreditoFiscalConstantesFunciones cuentacreditofiscalConstantesFunciones;
	//public CuentaCreditoFiscalParameterReturnGeneral cuentacreditofiscalReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public CuentaContableLogic cuentacontableLogic;
	
	//PARAMETROS
	
	
	//public List<CuentaCreditoFiscal> cuentacreditofiscals;	
	//public List<CuentaCreditoFiscal> cuentacreditofiscalsEliminados;
	//public List<CuentaCreditoFiscal> cuentacreditofiscalsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCuentaCreditoFiscal=false;
	public Boolean isVisibilidadCeldaDuplicarCuentaCreditoFiscal=true;
	public Boolean isVisibilidadCeldaCopiarCuentaCreditoFiscal=true;
	public Boolean isVisibilidadCeldaVerFormCuentaCreditoFiscal=true;
	public Boolean isVisibilidadCeldaOrdenCuentaCreditoFiscal=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCuentaCreditoFiscal=false;
	public Boolean isVisibilidadCeldaModificarCuentaCreditoFiscal=false;
	public Boolean isVisibilidadCeldaActualizarCuentaCreditoFiscal=false;
	public Boolean isVisibilidadCeldaEliminarCuentaCreditoFiscal=false;
	public Boolean isVisibilidadCeldaCancelarCuentaCreditoFiscal=false;
	public Boolean isVisibilidadCeldaGuardarCuentaCreditoFiscal=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCuentaCreditoFiscal=false;	
	
	
	public Boolean isVisibilidadFK_IdCuentaContable=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoCuentaCreditoFiscal() {
		return this.iIdNuevoCuentaCreditoFiscal;
	}

	public void setiIdNuevoCuentaCreditoFiscal(Long iIdNuevoCuentaCreditoFiscal) {
		this.iIdNuevoCuentaCreditoFiscal = iIdNuevoCuentaCreditoFiscal;
	}
	
	public Long getidCuentaCreditoFiscalActual() {
		return this.idCuentaCreditoFiscalActual;
	}

	public void setidCuentaCreditoFiscalActual(Long idCuentaCreditoFiscalActual) {
		this.idCuentaCreditoFiscalActual = idCuentaCreditoFiscalActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public CuentaCreditoFiscal getcuentacreditofiscal() {
		return this.cuentacreditofiscal;
	}

	public void setcuentacreditofiscal(CuentaCreditoFiscal cuentacreditofiscal) {
		this.cuentacreditofiscal = cuentacreditofiscal;
	}
	
	public CuentaCreditoFiscal getcuentacreditofiscalAux() {
		return this.cuentacreditofiscalAux;
	}

	public void setcuentacreditofiscalAux(CuentaCreditoFiscal cuentacreditofiscalAux) {
		this.cuentacreditofiscalAux = cuentacreditofiscalAux;
	}				
	
	public CuentaCreditoFiscal getcuentacreditofiscalAnterior() {
		return this.cuentacreditofiscalAnterior;
	}

	public void setcuentacreditofiscalAnterior(CuentaCreditoFiscal cuentacreditofiscalAnterior) {
		this.cuentacreditofiscalAnterior = cuentacreditofiscalAnterior;
	}	
	
	public CuentaCreditoFiscal getcuentacreditofiscalTotales() {
		return this.cuentacreditofiscalTotales;
	}

	public void setcuentacreditofiscalTotales(CuentaCreditoFiscal cuentacreditofiscalTotales) {
		this.cuentacreditofiscalTotales = cuentacreditofiscalTotales;
	}	
	
	public CuentaCreditoFiscal getcuentacreditofiscalBean() {
		return this.cuentacreditofiscalBean;
	}

	public void setcuentacreditofiscalBean(CuentaCreditoFiscal cuentacreditofiscalBean) {
		this.cuentacreditofiscalBean = cuentacreditofiscalBean;
	}	
	
	public CuentaCreditoFiscalParameterReturnGeneral getcuentacreditofiscalReturnGeneral() {
		return this.cuentacreditofiscalReturnGeneral;
	}

	public void setcuentacreditofiscalReturnGeneral(CuentaCreditoFiscalParameterReturnGeneral cuentacreditofiscalReturnGeneral) {
		this.cuentacreditofiscalReturnGeneral = cuentacreditofiscalReturnGeneral;
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
	
	
	public CuentaCreditoFiscalLogic getCuentaCreditoFiscalLogic()	{		
		return cuentacreditofiscalLogic;
	}

	public void setCuentaCreditoFiscalLogic(CuentaCreditoFiscalLogic cuentacreditofiscalLogic) {
		this.cuentacreditofiscalLogic = cuentacreditofiscalLogic;
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
	
	public Boolean getIsEsNuevoCuentaCreditoFiscal() {
		return isEsNuevoCuentaCreditoFiscal;
	}

	public void setIsEsNuevoCuentaCreditoFiscal(Boolean isEsNuevoCuentaCreditoFiscal) {
		this.isEsNuevoCuentaCreditoFiscal = isEsNuevoCuentaCreditoFiscal;
	}

	public Boolean getEsParaAccionDesdeFormularioCuentaCreditoFiscal() {
		return esParaAccionDesdeFormularioCuentaCreditoFiscal;
	}
	
	public void setEsParaAccionDesdeFormularioCuentaCreditoFiscal(Boolean esParaAccionDesdeFormularioCuentaCreditoFiscal) {
		this.esParaAccionDesdeFormularioCuentaCreditoFiscal = esParaAccionDesdeFormularioCuentaCreditoFiscal;
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

			if(this.cuentacreditofiscalSessionBean==null) {
				this.cuentacreditofiscalSessionBean=new CuentaCreditoFiscalSessionBean();
			}

			if(!this.cuentacreditofiscalSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(cuentacreditofiscalSessionBean.getlidEmpresaActual());
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

			if(this.cuentacreditofiscalSessionBean==null) {
				this.cuentacreditofiscalSessionBean=new CuentaCreditoFiscalSessionBean();
			}

			if(!this.cuentacreditofiscalSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
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
					cuentacontableLogic.getEntityWithConnection(cuentacreditofiscalSessionBean.getlidCuentaContableActual());
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

					if(this.cuentacreditofiscal!=null) {
						this.cuentacreditofiscal.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormCuentaCreditoFiscal!=null) {
						this.jInternalFrameDetalleFormCuentaCreditoFiscal.jComboBoxid_empresaCuentaCreditoFiscal.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaCuentaCreditoFiscal.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormCuentaCreditoFiscal!=null) {
						if(this.jInternalFrameDetalleFormCuentaCreditoFiscal.jComboBoxid_empresaCuentaCreditoFiscal.getItemCount()>0) {
							this.jInternalFrameDetalleFormCuentaCreditoFiscal.jComboBoxid_empresaCuentaCreditoFiscal.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaCuentaCreditoFiscalGenerico)throws Exception
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
				jComboBoxid_empresaCuentaCreditoFiscalGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaCuentaCreditoFiscalGenerico!=null && jComboBoxid_empresaCuentaCreditoFiscalGenerico.getItemCount()>0) {
					jComboBoxid_empresaCuentaCreditoFiscalGenerico.setSelectedIndex(0);
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

					if(this.cuentacreditofiscal!=null) {
						this.cuentacreditofiscal.setCuentaContable(cuentacontableTemp);
					}

					if(this.jInternalFrameDetalleFormCuentaCreditoFiscal!=null) {
						this.jInternalFrameDetalleFormCuentaCreditoFiscal.jComboBoxid_cuenta_contableCuentaCreditoFiscal.setSelectedItem(cuentacontableTemp);
					}
				} else {
					//jComboBoxid_cuenta_contableCuentaCreditoFiscal.setSelectedItem(cuentacontableTemp);
					if(this.jInternalFrameDetalleFormCuentaCreditoFiscal!=null) {
						if(this.jInternalFrameDetalleFormCuentaCreditoFiscal.jComboBoxid_cuenta_contableCuentaCreditoFiscal.getItemCount()>0) {
							this.jInternalFrameDetalleFormCuentaCreditoFiscal.jComboBoxid_cuenta_contableCuentaCreditoFiscal.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCuentaContable") || sFormularioTipoBusqueda.equals("Todos")){
					if(cuentacontableTemp!=null && jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaCreditoFiscal!=null) {
						jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaCreditoFiscal.setSelectedItem(cuentacontableTemp);
					} else {
						if(jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaCreditoFiscal!=null) {
							//jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaCreditoFiscal.setSelectedItem(cuentacontableTemp);
							if(jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaCreditoFiscal.getItemCount()>0) {
								jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaCreditoFiscal.setSelectedIndex(0);
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
	public void setActualCuentaContableForeignKeyGenerico(Long idCuentaContableSeleccionado,JComboBox jComboBoxid_cuenta_contableCuentaCreditoFiscalGenerico)throws Exception
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
				jComboBoxid_cuenta_contableCuentaCreditoFiscalGenerico.setSelectedItem(cuentacontableTemp);
			} else {
				if(jComboBoxid_cuenta_contableCuentaCreditoFiscalGenerico!=null && jComboBoxid_cuenta_contableCuentaCreditoFiscalGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contableCuentaCreditoFiscalGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(CuentaCreditoFiscal cuentacreditofiscal,JComboBox jComboBoxid_empresaCuentaCreditoFiscalGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaCuentaCreditoFiscalGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormCuentaCreditoFiscal.jComboBoxid_empresaCuentaCreditoFiscal.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaCuentaCreditoFiscalGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				cuentacreditofiscal.setid_empresa(empresaAux.getId());
				cuentacreditofiscal.setempresa_descripcion(CuentaCreditoFiscalConstantesFunciones.getEmpresaDescripcion(empresaAux));
				cuentacreditofiscal.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableForeignKey(CuentaCreditoFiscal cuentacreditofiscal,JComboBox jComboBoxid_cuenta_contableCuentaCreditoFiscalGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contableCuentaCreditoFiscalGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormCuentaCreditoFiscal.jComboBoxid_cuenta_contableCuentaCreditoFiscal.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contableCuentaCreditoFiscalGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null && cuentacontableAux.getId()!=null) {
				cuentacreditofiscal.setid_cuenta_contable(cuentacontableAux.getId());
				cuentacreditofiscal.setcuentacontable_descripcion(CuentaCreditoFiscalConstantesFunciones.getCuentaContableDescripcion(cuentacontableAux));
				cuentacreditofiscal.setCuentaContable(cuentacontableAux);			}
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

					if(!CuentaCreditoFiscalJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCuentaCreditoFiscal!=null) { 
							this.jInternalFrameDetalleFormCuentaCreditoFiscal.jComboBoxid_empresaCuentaCreditoFiscal.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormCuentaCreditoFiscal.jComboBoxid_empresaCuentaCreditoFiscal.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCuentaCreditoFiscal!=null) { 
					}

					if(!CuentaCreditoFiscalJInternalFrame.ISBINDING_MANUAL) {
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

					if(!CuentaCreditoFiscalJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCuentaCreditoFiscal!=null) { 
							this.jInternalFrameDetalleFormCuentaCreditoFiscal.jComboBoxid_cuenta_contableCuentaCreditoFiscal.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jInternalFrameDetalleFormCuentaCreditoFiscal.jComboBoxid_cuenta_contableCuentaCreditoFiscal.addItem(cuentacontable);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCuentaCreditoFiscal!=null) { 
					}

					if(!CuentaCreditoFiscalJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCuentaContable") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CuentaCreditoFiscalJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaCreditoFiscal.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaCreditoFiscal.addItem(cuentacontable);
							}
						}

						if(!CuentaCreditoFiscalJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormCuentaCreditoFiscal!=null) {
							this.jInternalFrameDetalleFormCuentaCreditoFiscal.jComboBoxid_empresaCuentaCreditoFiscal.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormCuentaCreditoFiscal!=null) {
							this.jInternalFrameDetalleFormCuentaCreditoFiscal.jComboBoxid_empresaCuentaCreditoFiscal.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormCuentaCreditoFiscal!=null) {
							this.jInternalFrameDetalleFormCuentaCreditoFiscal.jComboBoxid_cuenta_contableCuentaCreditoFiscal.setSelectedItem(cuentacontable);
						}
					} else {
						if(this.jInternalFrameDetalleFormCuentaCreditoFiscal!=null) {
							this.jInternalFrameDetalleFormCuentaCreditoFiscal.jComboBoxid_cuenta_contableCuentaCreditoFiscal.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaCreditoFiscal.setSelectedItem(cuentacontable);
						} else {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaCreditoFiscal.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesCuentaCreditoFiscal() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			CuentaCreditoFiscalConstantesFunciones.refrescarForeignKeysDescripcionesCuentaCreditoFiscal(this.cuentacreditofiscalLogic.getCuentaCreditoFiscals());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			CuentaCreditoFiscalConstantesFunciones.refrescarForeignKeysDescripcionesCuentaCreditoFiscal(this.cuentacreditofiscals);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(CuentaContable.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//cuentacreditofiscalLogic.setCuentaCreditoFiscals(this.cuentacreditofiscals);
			cuentacreditofiscalLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public CuentaCreditoFiscalParameterReturnGeneral getCuentaCreditoFiscalParameterGeneral() {
		return this.cuentacreditofiscalParameterGeneral;
	}
	
	public void setCuentaCreditoFiscalParameterGeneral(CuentaCreditoFiscalParameterReturnGeneral cuentacreditofiscalParameterGeneral) {
		this.cuentacreditofiscalParameterGeneral = cuentacreditofiscalParameterGeneral;
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
	
	public Boolean getIsPermisoTodoCuentaCreditoFiscal() {
		return isPermisoTodoCuentaCreditoFiscal;
	}

	public void setIsPermisoTodoCuentaCreditoFiscal(Boolean isPermisoTodoCuentaCreditoFiscal) {
		this.isPermisoTodoCuentaCreditoFiscal = isPermisoTodoCuentaCreditoFiscal;
	}

	public Boolean getIsPermisoNuevoCuentaCreditoFiscal() {
		return isPermisoNuevoCuentaCreditoFiscal;
	}

	public void setIsPermisoNuevoCuentaCreditoFiscal(Boolean isPermisoNuevoCuentaCreditoFiscal) {
		this.isPermisoNuevoCuentaCreditoFiscal = isPermisoNuevoCuentaCreditoFiscal;
	}

	public Boolean getIsPermisoActualizarCuentaCreditoFiscal() {
		return isPermisoActualizarCuentaCreditoFiscal;
	}

	public void setIsPermisoActualizarCuentaCreditoFiscal(Boolean isPermisoActualizarCuentaCreditoFiscal) {
		this.isPermisoActualizarCuentaCreditoFiscal = isPermisoActualizarCuentaCreditoFiscal;
	}

	public Boolean getIsPermisoEliminarCuentaCreditoFiscal() {
		return isPermisoEliminarCuentaCreditoFiscal;
	}

	public void setIsPermisoEliminarCuentaCreditoFiscal(Boolean isPermisoEliminarCuentaCreditoFiscal) {
		this.isPermisoEliminarCuentaCreditoFiscal = isPermisoEliminarCuentaCreditoFiscal;
	}

	public Boolean getIsPermisoGuardarCambiosCuentaCreditoFiscal() {
		return isPermisoGuardarCambiosCuentaCreditoFiscal;
	}

	public void setIsPermisoGuardarCambiosCuentaCreditoFiscal(Boolean isPermisoGuardarCambiosCuentaCreditoFiscal) {
		this.isPermisoGuardarCambiosCuentaCreditoFiscal = isPermisoGuardarCambiosCuentaCreditoFiscal;
	}
	
	public Boolean getIsPermisoConsultaCuentaCreditoFiscal() {
		return isPermisoConsultaCuentaCreditoFiscal;
	}

	public void setIsPermisoConsultaCuentaCreditoFiscal(Boolean isPermisoConsultaCuentaCreditoFiscal) {
		this.isPermisoConsultaCuentaCreditoFiscal = isPermisoConsultaCuentaCreditoFiscal;
	}

	public Boolean getIsPermisoBusquedaCuentaCreditoFiscal() {
		return isPermisoBusquedaCuentaCreditoFiscal;
	}

	public void setIsPermisoBusquedaCuentaCreditoFiscal(Boolean isPermisoBusquedaCuentaCreditoFiscal) {
		this.isPermisoBusquedaCuentaCreditoFiscal = isPermisoBusquedaCuentaCreditoFiscal;
	}

	public Boolean getIsPermisoReporteCuentaCreditoFiscal() {
		return isPermisoReporteCuentaCreditoFiscal;
	}

	public void setIsPermisoReporteCuentaCreditoFiscal(Boolean isPermisoReporteCuentaCreditoFiscal) {
		this.isPermisoReporteCuentaCreditoFiscal = isPermisoReporteCuentaCreditoFiscal;
	}
	
	public Boolean getIsPermisoPaginacionMedioCuentaCreditoFiscal() {
		return isPermisoPaginacionMedioCuentaCreditoFiscal;
	}

	public void setIsPermisoPaginacionMedioCuentaCreditoFiscal(Boolean isPermisoPaginacionMedioCuentaCreditoFiscal) {
		this.isPermisoPaginacionMedioCuentaCreditoFiscal = isPermisoPaginacionMedioCuentaCreditoFiscal;
	}
	
	public Boolean getIsPermisoPaginacionTodoCuentaCreditoFiscal() {
		return isPermisoPaginacionTodoCuentaCreditoFiscal;
	}

	public void setIsPermisoPaginacionTodoCuentaCreditoFiscal(Boolean isPermisoPaginacionTodoCuentaCreditoFiscal) {
		this.isPermisoPaginacionTodoCuentaCreditoFiscal = isPermisoPaginacionTodoCuentaCreditoFiscal;
	}
	
	public Boolean getIsPermisoPaginacionAltoCuentaCreditoFiscal() {
		return isPermisoPaginacionAltoCuentaCreditoFiscal;
	}

	public void setIsPermisoPaginacionAltoCuentaCreditoFiscal(Boolean isPermisoPaginacionAltoCuentaCreditoFiscal) {
		this.isPermisoPaginacionAltoCuentaCreditoFiscal = isPermisoPaginacionAltoCuentaCreditoFiscal;
	}
	
	public Boolean getIsPermisoCopiarCuentaCreditoFiscal() {
		return isPermisoCopiarCuentaCreditoFiscal;
	}

	public void setIsPermisoCopiarCuentaCreditoFiscal(Boolean isPermisoCopiarCuentaCreditoFiscal) {
		this.isPermisoCopiarCuentaCreditoFiscal = isPermisoCopiarCuentaCreditoFiscal;
	}
	
	public Boolean getIsPermisoVerFormCuentaCreditoFiscal() {
		return isPermisoVerFormCuentaCreditoFiscal;
	}

	public void setIsPermisoVerFormCuentaCreditoFiscal(Boolean isPermisoVerFormCuentaCreditoFiscal) {
		this.isPermisoVerFormCuentaCreditoFiscal = isPermisoVerFormCuentaCreditoFiscal;
	}
	
	public Boolean getIsPermisoDuplicarCuentaCreditoFiscal() {
		return isPermisoDuplicarCuentaCreditoFiscal;
	}

	public void setIsPermisoDuplicarCuentaCreditoFiscal(Boolean isPermisoDuplicarCuentaCreditoFiscal) {
		this.isPermisoDuplicarCuentaCreditoFiscal = isPermisoDuplicarCuentaCreditoFiscal;
	}
	
	public Boolean getIsPermisoOrdenCuentaCreditoFiscal() {
		return isPermisoOrdenCuentaCreditoFiscal;
	}

	public void setIsPermisoOrdenCuentaCreditoFiscal(Boolean isPermisoOrdenCuentaCreditoFiscal) {
		this.isPermisoOrdenCuentaCreditoFiscal = isPermisoOrdenCuentaCreditoFiscal;
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
	
	public Boolean getIsVisibilidadCeldaNuevoCuentaCreditoFiscal() {
		return isVisibilidadCeldaNuevoCuentaCreditoFiscal;
	}

	public void setIsVisibilidadCeldaNuevoCuentaCreditoFiscal(Boolean isVisibilidadCeldaNuevoCuentaCreditoFiscal) {
		this.isVisibilidadCeldaNuevoCuentaCreditoFiscal = isVisibilidadCeldaNuevoCuentaCreditoFiscal;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCuentaCreditoFiscal() {
		return isVisibilidadCeldaDuplicarCuentaCreditoFiscal;
	}

	public void setIsVisibilidadCeldaDuplicarCuentaCreditoFiscal(Boolean isVisibilidadCeldaDuplicarCuentaCreditoFiscal) {
		this.isVisibilidadCeldaDuplicarCuentaCreditoFiscal = isVisibilidadCeldaDuplicarCuentaCreditoFiscal;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCuentaCreditoFiscal() {
		return isVisibilidadCeldaCopiarCuentaCreditoFiscal;
	}

	public void setIsVisibilidadCeldaCopiarCuentaCreditoFiscal(Boolean isVisibilidadCeldaCopiarCuentaCreditoFiscal) {
		this.isVisibilidadCeldaCopiarCuentaCreditoFiscal = isVisibilidadCeldaCopiarCuentaCreditoFiscal;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCuentaCreditoFiscal() {
		return isVisibilidadCeldaVerFormCuentaCreditoFiscal;
	}

	public void setIsVisibilidadCeldaVerFormCuentaCreditoFiscal(Boolean isVisibilidadCeldaVerFormCuentaCreditoFiscal) {
		this.isVisibilidadCeldaVerFormCuentaCreditoFiscal = isVisibilidadCeldaVerFormCuentaCreditoFiscal;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCuentaCreditoFiscal() {
		return isVisibilidadCeldaOrdenCuentaCreditoFiscal;
	}

	public void setIsVisibilidadCeldaOrdenCuentaCreditoFiscal(Boolean isVisibilidadCeldaOrdenCuentaCreditoFiscal) {
		this.isVisibilidadCeldaOrdenCuentaCreditoFiscal = isVisibilidadCeldaOrdenCuentaCreditoFiscal;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCuentaCreditoFiscal() {
		return isVisibilidadCeldaNuevoRelacionesCuentaCreditoFiscal;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCuentaCreditoFiscal(Boolean isVisibilidadCeldaNuevoRelacionesCuentaCreditoFiscal) {
		this.isVisibilidadCeldaNuevoRelacionesCuentaCreditoFiscal = isVisibilidadCeldaNuevoRelacionesCuentaCreditoFiscal;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCuentaCreditoFiscal() {
		return isVisibilidadCeldaModificarCuentaCreditoFiscal;
	}

	public void setIsVisibilidadCeldaModificarCuentaCreditoFiscal(Boolean isVisibilidadCeldaModificarCuentaCreditoFiscal) {
		this.isVisibilidadCeldaModificarCuentaCreditoFiscal = isVisibilidadCeldaModificarCuentaCreditoFiscal;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCuentaCreditoFiscal() {
		return isVisibilidadCeldaActualizarCuentaCreditoFiscal;
	}

	public void setIsVisibilidadCeldaActualizarCuentaCreditoFiscal(Boolean isVisibilidadCeldaActualizarCuentaCreditoFiscal) {
		this.isVisibilidadCeldaActualizarCuentaCreditoFiscal = isVisibilidadCeldaActualizarCuentaCreditoFiscal;
	}

	public Boolean getIsVisibilidadCeldaEliminarCuentaCreditoFiscal() {
		return isVisibilidadCeldaEliminarCuentaCreditoFiscal;
	}

	public void setIsVisibilidadCeldaEliminarCuentaCreditoFiscal(Boolean isVisibilidadCeldaEliminarCuentaCreditoFiscal) {
		this.isVisibilidadCeldaEliminarCuentaCreditoFiscal = isVisibilidadCeldaEliminarCuentaCreditoFiscal;
	}

	public Boolean getIsVisibilidadCeldaCancelarCuentaCreditoFiscal() {
		return isVisibilidadCeldaCancelarCuentaCreditoFiscal;
	}

	public void setIsVisibilidadCeldaCancelarCuentaCreditoFiscal(Boolean isVisibilidadCeldaCancelarCuentaCreditoFiscal) {
		this.isVisibilidadCeldaCancelarCuentaCreditoFiscal = isVisibilidadCeldaCancelarCuentaCreditoFiscal;
	}

	public Boolean getIsVisibilidadCeldaGuardarCuentaCreditoFiscal() {
		return isVisibilidadCeldaGuardarCuentaCreditoFiscal;
	}

	public void setIsVisibilidadCeldaGuardarCuentaCreditoFiscal(Boolean isVisibilidadCeldaGuardarCuentaCreditoFiscal) {
		this.isVisibilidadCeldaGuardarCuentaCreditoFiscal = isVisibilidadCeldaGuardarCuentaCreditoFiscal;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCuentaCreditoFiscal() {
		return isVisibilidadCeldaGuardarCambiosCuentaCreditoFiscal;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCuentaCreditoFiscal(Boolean isVisibilidadCeldaGuardarCambiosCuentaCreditoFiscal) {
		this.isVisibilidadCeldaGuardarCambiosCuentaCreditoFiscal = isVisibilidadCeldaGuardarCambiosCuentaCreditoFiscal;
	}
		
	public CuentaCreditoFiscalSessionBean getcuentacreditofiscalSessionBean() {
		return this.cuentacreditofiscalSessionBean;
	}
	
	public void setcuentacreditofiscalSessionBean(CuentaCreditoFiscalSessionBean cuentacreditofiscalSessionBean) {
		this.cuentacreditofiscalSessionBean=cuentacreditofiscalSessionBean;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCuentaCreditoFiscal(CuentaCreditoFiscal cuentacreditofiscal)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(cuentacreditofiscal,null);
				this.setActualParaGuardarCuentaContableForeignKey(cuentacreditofiscal,null);
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
	
	public void bugActualizarReferenciaActual(CuentaCreditoFiscal cuentacreditofiscal,CuentaCreditoFiscal cuentacreditofiscalAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCuentaCreditoFiscal(cuentacreditofiscal);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		cuentacreditofiscalAux.setId(cuentacreditofiscal.getId());
		cuentacreditofiscalAux.setVersionRow(cuentacreditofiscal.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessCuentaCreditoFiscal();
		
			int intSelectedRow = this.jTableDatosCuentaCreditoFiscal.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacreditofiscal =(CuentaCreditoFiscal) this.cuentacreditofiscalLogic.getCuentaCreditoFiscals().toArray()[this.jTableDatosCuentaCreditoFiscal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.cuentacreditofiscal =(CuentaCreditoFiscal) this.cuentacreditofiscals.toArray()[this.jTableDatosCuentaCreditoFiscal.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(CuentaCreditoFiscalJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualCuentaCreditoFiscal(this.cuentacreditofiscal,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysCuentaCreditoFiscal(this.cuentacreditofiscal);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = cuentacreditofiscalValidator.getInvalidValues(this.cuentacreditofiscal);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			cuentacreditofiscalLogic.setDatosCliente(datosCliente);
			cuentacreditofiscalLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				cuentacreditofiscalAux=new  CuentaCreditoFiscal();
				
				cuentacreditofiscalAux.setIsNew(true);
				cuentacreditofiscalAux.setIsChanged(true);
				
				cuentacreditofiscalAux.setCuentaCreditoFiscalOriginal(this.cuentacreditofiscal);
				
				cuentacreditofiscalAux.setId(this.cuentacreditofiscal.getId());	
				cuentacreditofiscalAux.setVersionRow(this.cuentacreditofiscal.getVersionRow());	
				cuentacreditofiscalAux.setid_empresa(this.cuentacreditofiscal.getid_empresa());	
				cuentacreditofiscalAux.setid_cuenta_contable(this.cuentacreditofiscal.getid_cuenta_contable());	
				cuentacreditofiscalAux.setesta_activo(this.cuentacreditofiscal.getesta_activo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cuentacreditofiscalSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(cuentacreditofiscalAux,cuentacreditofiscalLogic.getCuentaCreditoFiscals());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cuentacreditofiscalAux,cuentacreditofiscals);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.cuentacreditofiscalSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentacreditofiscalLogic.saveCuentaCreditoFiscals();//WithConnection
						//cuentacreditofiscalLogic.getSetVersionRowCuentaCreditoFiscals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.cuentacreditofiscal,cuentacreditofiscalAux);
					
					this.refrescarForeignKeysDescripcionesCuentaCreditoFiscal();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cuentacreditofiscalSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cuentacreditofiscalLogic.saveCuentaCreditoFiscalRelaciones(cuentacreditofiscalAux);//WithConnection
								//cuentacreditofiscalLogic.getSetVersionRowCuentaCreditoFiscals();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.cuentacreditofiscal,cuentacreditofiscalAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.cuentacreditofiscalSessionBean.getEstaModoGuardarRelaciones() 
									|| this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(cuentacreditofiscalAux,cuentacreditofiscalLogic.getCuentaCreditoFiscals());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(cuentacreditofiscalAux,cuentacreditofiscals);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.cuentacreditofiscal,cuentacreditofiscalAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				cuentacreditofiscalAux=new  CuentaCreditoFiscal();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado() 
					|| (this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado() && this.cuentacreditofiscal.getId()>=0)) {
						
					cuentacreditofiscalAux.setIsNew(false);
				}
				
				cuentacreditofiscalAux.setIsDeleted(false);
			
				cuentacreditofiscalAux.setId(this.cuentacreditofiscal.getId());	
				cuentacreditofiscalAux.setVersionRow(this.cuentacreditofiscal.getVersionRow());	
				cuentacreditofiscalAux.setid_empresa(this.cuentacreditofiscal.getid_empresa());	
				cuentacreditofiscalAux.setid_cuenta_contable(this.cuentacreditofiscal.getid_cuenta_contable());	
				cuentacreditofiscalAux.setesta_activo(this.cuentacreditofiscal.getesta_activo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cuentacreditofiscalAux,cuentacreditofiscalLogic.getCuentaCreditoFiscals());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cuentacreditofiscalAux,cuentacreditofiscals);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.cuentacreditofiscalSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentacreditofiscalLogic.saveCuentaCreditoFiscals();//WithConnection
						//cuentacreditofiscalLogic.getSetVersionRowCuentaCreditoFiscals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.cuentacreditofiscal,cuentacreditofiscalAux);
					
					this.refrescarForeignKeysDescripcionesCuentaCreditoFiscal();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cuentacreditofiscalSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cuentacreditofiscalLogic.saveCuentaCreditoFiscalRelaciones(cuentacreditofiscalAux);//WithConnection
								//cuentacreditofiscalLogic.getSetVersionRowCuentaCreditoFiscals();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.cuentacreditofiscal,cuentacreditofiscalAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.cuentacreditofiscalSessionBean.getEstaModoGuardarRelaciones() 
									|| this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(cuentacreditofiscalAux,cuentacreditofiscalLogic.getCuentaCreditoFiscals());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(cuentacreditofiscalAux,cuentacreditofiscals);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.cuentacreditofiscal,cuentacreditofiscalAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				cuentacreditofiscalAux=new  CuentaCreditoFiscal();
				
				cuentacreditofiscalAux.setIsNew(false);
				cuentacreditofiscalAux.setIsChanged(false);
				
				cuentacreditofiscalAux.setIsDeleted(true);
				
				cuentacreditofiscalAux.setId(this.cuentacreditofiscal.getId());	
				cuentacreditofiscalAux.setVersionRow(this.cuentacreditofiscal.getVersionRow());	
				cuentacreditofiscalAux.setid_empresa(this.cuentacreditofiscal.getid_empresa());	
				cuentacreditofiscalAux.setid_cuenta_contable(this.cuentacreditofiscal.getid_cuenta_contable());	
				cuentacreditofiscalAux.setesta_activo(this.cuentacreditofiscal.getesta_activo());	
				
				if(this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.cuentacreditofiscalAux.getId()>=0) {	
						this.cuentacreditofiscalsEliminados.add(cuentacreditofiscalAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(cuentacreditofiscalAux,cuentacreditofiscalLogic.getCuentaCreditoFiscals());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cuentacreditofiscalAux,cuentacreditofiscals);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.cuentacreditofiscalSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentacreditofiscalLogic.saveCuentaCreditoFiscals();//WithConnection
						//cuentacreditofiscalLogic.getSetVersionRowCuentaCreditoFiscals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cuentacreditofiscalSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cuentacreditofiscalLogic.saveCuentaCreditoFiscalRelaciones(cuentacreditofiscalAux);//WithConnection
								//cuentacreditofiscalLogic.getSetVersionRowCuentaCreditoFiscals();//WithConnection
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
							if(this.cuentacreditofiscalSessionBean.getEstaModoGuardarRelaciones() 
								|| this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(cuentacreditofiscalAux,cuentacreditofiscalLogic.getCuentaCreditoFiscals());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(cuentacreditofiscalAux,cuentacreditofiscals);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacreditofiscalLogic.getCuentaCreditoFiscals().addAll(this.cuentacreditofiscalsEliminados);
					
					cuentacreditofiscalLogic.saveCuentaCreditoFiscals();//WithConnection
					//cuentacreditofiscalLogic.getSetVersionRowCuentaCreditoFiscals();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesCuentaCreditoFiscal();
				
				this.cuentacreditofiscalsEliminados= new ArrayList<CuentaCreditoFiscal>();		
			}
			
			if(this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Cuenta Credito Fiscal GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Cuenta Credito Fiscal",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.cuentacreditofiscal=cuentacreditofiscalAux;
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
      		//this.finishProcessCuentaCreditoFiscal();
      	}
		
	}	
	
	public void actualizarRelaciones(CuentaCreditoFiscal cuentacreditofiscalLocal) throws Exception {
		
		if(this.cuentacreditofiscalSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(CuentaCreditoFiscal cuentacreditofiscalLocal) throws Exception {	
		if(this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				cuentacreditofiscalLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontableBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontableBeanSwingJInternalFrameLocal.actualizarLista(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontablesForeignKey);

				cuentacontableBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				cuentacreditofiscalLocal.setCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContable();
				this.cargarCombosFrameCuentaContablesForeignKey("Formulario");
				this.setActualCuentaContableForeignKey(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarCuentaCreditoFiscalActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCuentaCreditoFiscal.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cuentacreditofiscal =(CuentaCreditoFiscal) this.cuentacreditofiscalLogic.getCuentaCreditoFiscals().toArray()[this.jTableDatosCuentaCreditoFiscal.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.cuentacreditofiscal =(CuentaCreditoFiscal) this.cuentacreditofiscals.toArray()[this.jTableDatosCuentaCreditoFiscal.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = cuentacreditofiscalValidator.getInvalidValues(this.cuentacreditofiscal);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(CuentaCreditoFiscal cuentacreditofiscal,List<CuentaCreditoFiscal> cuentacreditofiscals) throws Exception {
		try	{		
			CuentaCreditoFiscalConstantesFunciones.actualizarLista(cuentacreditofiscal,cuentacreditofiscals,this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(CuentaCreditoFiscal cuentacreditofiscal,List<CuentaCreditoFiscal> cuentacreditofiscals) throws Exception {
		try	{			
			CuentaCreditoFiscalConstantesFunciones.actualizarSelectedLista(cuentacreditofiscal,cuentacreditofiscals);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<CuentaCreditoFiscal> cuentacreditofiscalsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				cuentacreditofiscalsLocal=this.cuentacreditofiscalLogic.getCuentaCreditoFiscals();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				cuentacreditofiscalsLocal=this.cuentacreditofiscals;
			}
			//ARCHITECTURE
		
			for(CuentaCreditoFiscal cuentacreditofiscalLocal:cuentacreditofiscalsLocal) {
				if(this.permiteMantenimiento(cuentacreditofiscalLocal) && cuentacreditofiscalLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+CuentaCreditoFiscalConstantesFunciones.getCuentaCreditoFiscalLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CuentaCreditoFiscalConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaCreditoFiscal.jLabelid_empresaCuentaCreditoFiscal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CuentaCreditoFiscalConstantesFunciones.IDCUENTACONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaCreditoFiscal.jLabelid_cuenta_contableCuentaCreditoFiscal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CuentaCreditoFiscalConstantesFunciones.ESTAACTIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaCreditoFiscal.jLabelesta_activoCuentaCreditoFiscal,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormCuentaCreditoFiscal!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuentaCreditoFiscal.jLabelid_empresaCuentaCreditoFiscal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuentaCreditoFiscal.jLabelid_cuenta_contableCuentaCreditoFiscal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCuentaCreditoFiscal.jLabelesta_activoCuentaCreditoFiscal,"");
		
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
		this.iIdNuevoCuentaCreditoFiscal--;	
		
		
		this.cuentacreditofiscalAux=new CuentaCreditoFiscal();
		
		this.cuentacreditofiscalAux.setId(this.iIdNuevoCuentaCreditoFiscal);
		this.cuentacreditofiscalAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cuentacreditofiscalLogic.getCuentaCreditoFiscals().add(this.cuentacreditofiscalAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.cuentacreditofiscals.add(this.cuentacreditofiscalAux);
		}
		//ARCHITECTURE
		
		this.cuentacreditofiscal=this.cuentacreditofiscalAux;
		
		if(CuentaCreditoFiscalJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCuentaCreditoFiscal(this.cuentacreditofiscal);
			this.setVariablesObjetoActualToFormularioForeignKeyCuentaCreditoFiscal(this.cuentacreditofiscal);
		}
				
		//this.setDefaultControlesCuentaCreditoFiscal();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCuentaCreditoFiscal();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCuentaCreditoFiscal();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCuentaCreditoFiscal();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCuentaCreditoFiscal(this.cuentacreditofiscalBean,this.cuentacreditofiscal,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCuentaCreditoFiscal(this.cuentacreditofiscal);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.cuentacreditofiscalSessionBean.getConGuardarRelaciones()) {
			classes=CuentaCreditoFiscalConstantesFunciones.getClassesRelationshipsOfCuentaCreditoFiscal(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.cuentacreditofiscalReturnGeneral=cuentacreditofiscalLogic.procesarEventosCuentaCreditoFiscalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cuentacreditofiscalLogic.getCuentaCreditoFiscals(),this.cuentacreditofiscal,this.cuentacreditofiscalParameterGeneral,this.isEsNuevoCuentaCreditoFiscal,classes);//this.cuentacreditofiscalLogic.getCuentaCreditoFiscal()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCuentaCreditoFiscal(this.cuentacreditofiscalReturnGeneral,this.cuentacreditofiscalBean,false);
		
		if(this.cuentacreditofiscalReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCuentaCreditoFiscal(this.cuentacreditofiscalReturnGeneral.getCuentaCreditoFiscal());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCuentaCreditoFiscal(this.cuentacreditofiscalReturnGeneral.getCuentaCreditoFiscal());
		}
		
		if(this.cuentacreditofiscalReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCuentaCreditoFiscal(this.cuentacreditofiscalReturnGeneral.getCuentaCreditoFiscal(),classes);//this.cuentacreditofiscalBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCuentaCreditoFiscal(this.cuentacreditofiscal,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCuentaCreditoFiscal();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCuentaCreditoFiscal();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CuentaCreditoFiscalBeanSwingJInternalFrameAdditional.RecargarFormCuentaCreditoFiscal(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCuentaCreditoFiscal(false);
						
			if(cuentacreditofiscalSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(CuentaCreditoFiscalJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCuentaCreditoFiscal();
			}
			
			this.actualizarVisualTableDatosCuentaCreditoFiscal();
			
			this.jTableDatosCuentaCreditoFiscal.setRowSelectionInterval(this.getIndiceNuevoCuentaCreditoFiscal(), this.getIndiceNuevoCuentaCreditoFiscal());
			
			this.seleccionarFilaTablaCuentaCreditoFiscalActual();
						
			this.actualizarEstadoCeldasBotonesCuentaCreditoFiscal("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCuentaCreditoFiscal(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.jCheckBoxesta_activoCuentaCreditoFiscal.setEnabled(isHabilitar && this.cuentacreditofiscalConstantesFunciones.activaresta_activoCuentaCreditoFiscal);	
		//
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.jComboBoxid_empresaCuentaCreditoFiscal.setEnabled(isHabilitar && this.cuentacreditofiscalConstantesFunciones.activarid_empresaCuentaCreditoFiscal);
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.jComboBoxid_cuenta_contableCuentaCreditoFiscal.setEnabled(isHabilitar && this.cuentacreditofiscalConstantesFunciones.activarid_cuenta_contableCuentaCreditoFiscal);
	};
	
	public void setDefaultControlesCuentaCreditoFiscal() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCuentaCreditoFiscal(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.cuentacreditofiscalSessionBean.setConGuardarRelaciones(true);			
			this.cuentacreditofiscalSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCuentaCreditoFiscal.jTabbedPaneRelacionesCuentaCreditoFiscal.setVisible(true);
			
					
		} else {
			//this.cuentacreditofiscalSessionBean.setConGuardarRelaciones(false);			
			this.cuentacreditofiscalSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCuentaCreditoFiscal.jTabbedPaneRelacionesCuentaCreditoFiscal.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoCuentaCreditoFiscal() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CuentaCreditoFiscal cuentacreditofiscalAux:this.cuentacreditofiscalLogic.getCuentaCreditoFiscals()) {
				if(cuentacreditofiscalAux.getId().equals(this.iIdNuevoCuentaCreditoFiscal)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CuentaCreditoFiscal cuentacreditofiscalAux:this.cuentacreditofiscals) {
				if(cuentacreditofiscalAux.getId().equals(this.iIdNuevoCuentaCreditoFiscal)) {
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
	
	public int getIndiceActualCuentaCreditoFiscal(CuentaCreditoFiscal cuentacreditofiscal,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CuentaCreditoFiscal cuentacreditofiscalAux:this.cuentacreditofiscalLogic.getCuentaCreditoFiscals()) {
				if(cuentacreditofiscalAux.getId().equals(cuentacreditofiscal.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CuentaCreditoFiscal cuentacreditofiscalAux:this.cuentacreditofiscals) {
				if(cuentacreditofiscalAux.getId().equals(cuentacreditofiscal.getId())) {
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
	
	public void setCamposBaseDesdeOriginalCuentaCreditoFiscal(CuentaCreditoFiscal cuentacreditofiscalOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CuentaCreditoFiscal cuentacreditofiscalAux:this.cuentacreditofiscalLogic.getCuentaCreditoFiscals()) {
				if(cuentacreditofiscalAux.getCuentaCreditoFiscalOriginal().getId().equals(cuentacreditofiscalOriginal.getId())) {
					existe=true;
					cuentacreditofiscalOriginal.setId(cuentacreditofiscalAux.getId());
					cuentacreditofiscalOriginal.setVersionRow(cuentacreditofiscalAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CuentaCreditoFiscal cuentacreditofiscalAux:this.cuentacreditofiscals) {
				if(cuentacreditofiscalAux.getCuentaCreditoFiscalOriginal().getId().equals(cuentacreditofiscalOriginal.getId())) {
					existe=true;
					cuentacreditofiscalOriginal.setId(cuentacreditofiscalAux.getId());
					cuentacreditofiscalOriginal.setVersionRow(cuentacreditofiscalAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCuentaCreditoFiscal(Boolean esParaCancelar) throws Exception {
		cuentacreditofiscalsAux=new ArrayList<CuentaCreditoFiscal>();
		cuentacreditofiscalAux=new CuentaCreditoFiscal();
		
		if(!this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CuentaCreditoFiscal cuentacreditofiscalAux:this.cuentacreditofiscalLogic.getCuentaCreditoFiscals()) {
					if(cuentacreditofiscalAux.getId()<0) {
						cuentacreditofiscalsAux.add(cuentacreditofiscalAux);
					}		
				}
				this.iIdNuevoCuentaCreditoFiscal=0L;
				this.cuentacreditofiscalLogic.getCuentaCreditoFiscals().removeAll(cuentacreditofiscalsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CuentaCreditoFiscal cuentacreditofiscalAux:this.cuentacreditofiscals) {
					if(cuentacreditofiscalAux.getId()<0) {
						cuentacreditofiscalsAux.add(cuentacreditofiscalAux);
					}		
				}
				this.iIdNuevoCuentaCreditoFiscal=0L;
				this.cuentacreditofiscals.removeAll(cuentacreditofiscalsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCuentaCreditoFiscal 
					&& this.cuentacreditofiscalLogic.getCuentaCreditoFiscals().size()>0
					) {
					cuentacreditofiscalAux=this.cuentacreditofiscalLogic.getCuentaCreditoFiscals().get(this.cuentacreditofiscalLogic.getCuentaCreditoFiscals().size() - 1);
				
					if(cuentacreditofiscalAux.getId()<0) {
						this.cuentacreditofiscalLogic.getCuentaCreditoFiscals().remove(cuentacreditofiscalAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCuentaCreditoFiscal && this.cuentacreditofiscals.size()>0) {
					cuentacreditofiscalAux=this.cuentacreditofiscals.get(this.cuentacreditofiscals.size() - 1);
				
					if(cuentacreditofiscalAux.getId()<0) {
						this.cuentacreditofiscals.remove(cuentacreditofiscalAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCuentaCreditoFiscal(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(cuentacreditofiscal.getId()<0) {
				this.cuentacreditofiscalLogic.getCuentaCreditoFiscals().remove(this.cuentacreditofiscal);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(cuentacreditofiscal.getId()<0) {
				this.cuentacreditofiscals.remove(this.cuentacreditofiscal);
			}
		}			
	}
	
	public void setEstadosInicialesCuentaCreditoFiscal(List<CuentaCreditoFiscal> cuentacreditofiscalsAux) throws Exception {
		CuentaCreditoFiscalConstantesFunciones.setEstadosInicialesCuentaCreditoFiscal(cuentacreditofiscalsAux);
	}
	
	public void setEstadosInicialesCuentaCreditoFiscal(CuentaCreditoFiscal cuentacreditofiscalAux) throws Exception {
		CuentaCreditoFiscalConstantesFunciones.setEstadosInicialesCuentaCreditoFiscal(cuentacreditofiscalAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCuentaCreditoFiscalActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCuentaCreditoFiscal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCuentaCreditoFiscalActual()) {
				if(!this.isEsNuevoCuentaCreditoFiscal) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCuentaCreditoFiscal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCuentaCreditoFiscal=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCuentaCreditoFiscalActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Cuenta Credito Fiscal ?", "MANTENIMIENTO DE Cuenta Credito Fiscal", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCuentaCreditoFiscal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(CuentaCreditoFiscal cuentacreditofiscal) throws Exception {
		CuentaCreditoFiscalConstantesFunciones.seleccionarAsignar(this.cuentacreditofiscal,cuentacreditofiscal);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCuentaCreditoFiscal=this.isPermisoActualizarOriginalCuentaCreditoFiscal;
			
			
			this.seleccionarAsignar(cuentacreditofiscal);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CuentaCreditoFiscalConstantesFunciones.quitarEspaciosCuentaCreditoFiscal(this.cuentacreditofiscal,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesCuentaCreditoFiscal("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.cuentacreditofiscalSessionBean.setsFuncionBusquedaRapida(this.cuentacreditofiscalSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoCuentaCreditoFiscal) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCuentaCreditoFiscal(esParaCancelar);				
				this.cancelarNuevoCuentaCreditoFiscal(esParaCancelar);								
			}
			
			this.cuentacreditofiscal=new CuentaCreditoFiscal();
			
			this.inicializarCuentaCreditoFiscal();
			
			this.actualizarEstadoCeldasBotonesCuentaCreditoFiscal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCuentaCreditoFiscal() throws Exception {
		try {
			CuentaCreditoFiscalConstantesFunciones.inicializarCuentaCreditoFiscal(this.cuentacreditofiscal);
			
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
			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.cuentacreditofiscalLogic.getCuentaCreditoFiscals().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCuentaCreditoFiscals(String sAccionBusqueda,List<CuentaCreditoFiscal> cuentacreditofiscalsParaReportes) throws Exception {
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
					sPathReporteFinal="CuentaCreditoFiscal"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CuentaCreditoFiscalMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CuentaCreditoFiscalMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="CuentaCreditoFiscal"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Cuenta Credito Fiscales");		
		parameters.put("busquedapor", CuentaCreditoFiscalConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCuentaCreditoFiscal=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CuentaCreditoFiscalConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CuentaCreditoFiscalConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCuentaCreditoFiscal=new JRBeanArrayDataSource(CuentaCreditoFiscalJInternalFrame.TraerCuentaCreditoFiscalBeans(cuentacreditofiscalsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCuentaCreditoFiscal);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CuentaCreditoFiscalConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CuentaCreditoFiscalConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CuentaCreditoFiscalBean.TraerCuentaCreditoFiscalBeans(cuentacreditofiscalsParaReportes).toArray()));
							
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
				this.generarExcelReporteCuentaCreditoFiscals(sAccionBusqueda,sTipoArchivoReporte,cuentacreditofiscalsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCuentaCreditoFiscals(sAccionBusqueda,sTipoArchivoReporte,cuentacreditofiscalsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCuentaCreditoFiscalActionPerformed(null);
					//this.generarExcelReporteCuentaCreditoFiscals(sAccionBusqueda,sTipoArchivoReporte,cuentacreditofiscalsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCuentaCreditoFiscals(sAccionBusqueda,sTipoArchivoReporte,cuentacreditofiscalsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCuentaCreditoFiscals(sAccionBusqueda,sTipoArchivoReporte,cuentacreditofiscalsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCuentaCreditoFiscals(sAccionBusqueda,sTipoArchivoReporte,cuentacreditofiscalsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCuentaCreditoFiscals(String sAccionBusqueda,String sTipoArchivoReporte,List<CuentaCreditoFiscal> cuentacreditofiscalsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cuentacreditofiscal";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CuentaCreditoFiscals");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCuentaCreditoFiscal("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(CuentaCreditoFiscal cuentacreditofiscal : cuentacreditofiscalsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CuentaCreditoFiscalConstantesFunciones.generarExcelReporteDataCuentaCreditoFiscal("NORMAL",row,workbook,cuentacreditofiscal,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Credito Fiscal",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCuentaCreditoFiscal(String sTipo,Row row,Workbook workbook) {
		
		CuentaCreditoFiscalConstantesFunciones.generarExcelReporteHeaderCuentaCreditoFiscal(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCuentaCreditoFiscals(String sAccionBusqueda,String sTipoArchivoReporte,List<CuentaCreditoFiscal> cuentacreditofiscalsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cuentacreditofiscal_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CuentaCreditoFiscals");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(CuentaCreditoFiscal cuentacreditofiscal : cuentacreditofiscalsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CuentaCreditoFiscalConstantesFunciones.getCuentaCreditoFiscalDescripcion(cuentacreditofiscal));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuentaCreditoFiscalConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuentaCreditoFiscalConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cuentacreditofiscal.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuentaCreditoFiscalConstantesFunciones.LABEL_IDCUENTACONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuentaCreditoFiscalConstantesFunciones.LABEL_IDCUENTACONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cuentacreditofiscal.getcuentacontable_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CuentaCreditoFiscalConstantesFunciones.LABEL_ESTAACTIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CuentaCreditoFiscalConstantesFunciones.LABEL_ESTAACTIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(cuentacreditofiscal.getesta_activo()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Credito Fiscal",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCuentaCreditoFiscals(String sAccionBusqueda,String sTipoArchivoReporte,List<CuentaCreditoFiscal> cuentacreditofiscalsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<CuentaCreditoFiscal> cuentacreditofiscalsRespaldo=null;
		
		classes=CuentaCreditoFiscalConstantesFunciones.getClassesRelationshipsOfCuentaCreditoFiscal(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.cuentacreditofiscalLogic.setDatosCliente(this.datosCliente);
		this.cuentacreditofiscalLogic.setDatosDeep(this.datosDeep);
		this.cuentacreditofiscalLogic.setIsConDeep(true);
		
		cuentacreditofiscalsRespaldo=this.cuentacreditofiscalLogic.getCuentaCreditoFiscals();
		
		this.cuentacreditofiscalLogic.setCuentaCreditoFiscals(cuentacreditofiscalsParaReportes);	
		this.cuentacreditofiscalLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		cuentacreditofiscalsParaReportes=this.cuentacreditofiscalLogic.getCuentaCreditoFiscals();
		this.cuentacreditofiscalLogic.setCuentaCreditoFiscals(cuentacreditofiscalsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cuentacreditofiscal_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CuentaCreditoFiscals");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCuentaCreditoFiscal("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(CuentaCreditoFiscal cuentacreditofiscal : cuentacreditofiscalsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCuentaCreditoFiscal("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CuentaCreditoFiscalConstantesFunciones.generarExcelReporteDataCuentaCreditoFiscal("NORMAL",row,workbook,cuentacreditofiscal,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(CuentaCreditoFiscalConstantesFunciones.getCuentaCreditoFiscalDescripcion(cuentacreditofiscal));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Credito Fiscal",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCuentaCreditoFiscal.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCuentaCreditoFiscal.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoCuentaCreditoFiscal.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCuentaCreditoFiscal.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCuentaCreditoFiscal() throws Exception {		
		this.startProcessCuentaCreditoFiscal(true);
	}
	
	public void startProcessCuentaCreditoFiscal(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasCuentaCreditoFiscal ,this.jPanelParametrosReportesCuentaCreditoFiscal, this.jScrollPanelDatosCuentaCreditoFiscal,this.jPanelPaginacionCuentaCreditoFiscal, this.jScrollPanelDatosEdicionCuentaCreditoFiscal, this.jPanelAccionesCuentaCreditoFiscal,this.jPanelAccionesFormularioCuentaCreditoFiscal,this.jmenuBarCuentaCreditoFiscal,this.jmenuBarDetalleCuentaCreditoFiscal,this.jTtoolBarCuentaCreditoFiscal,this.jTtoolBarDetalleCuentaCreditoFiscal);		
		
		final JTabbedPane jTabbedPaneBusquedasCuentaCreditoFiscal=this.jTabbedPaneBusquedasCuentaCreditoFiscal; 
		
		final JPanel jPanelParametrosReportesCuentaCreditoFiscal=this.jPanelParametrosReportesCuentaCreditoFiscal;
		//final JScrollPane jScrollPanelDatosCuentaCreditoFiscal=this.jScrollPanelDatosCuentaCreditoFiscal;
		final JTable jTableDatosCuentaCreditoFiscal=this.jTableDatosCuentaCreditoFiscal;		
		final JPanel jPanelPaginacionCuentaCreditoFiscal=this.jPanelPaginacionCuentaCreditoFiscal;
		//final JScrollPane jScrollPanelDatosEdicionCuentaCreditoFiscal=this.jScrollPanelDatosEdicionCuentaCreditoFiscal;
		final JPanel jPanelAccionesCuentaCreditoFiscal=this.jPanelAccionesCuentaCreditoFiscal;
		
		JPanel jPanelCamposAuxiliarCuentaCreditoFiscal=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCuentaCreditoFiscal=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCuentaCreditoFiscal!=null) {
			jPanelCamposAuxiliarCuentaCreditoFiscal=this.jInternalFrameDetalleFormCuentaCreditoFiscal.jPanelCamposCuentaCreditoFiscal;
			jPanelAccionesFormularioAuxiliarCuentaCreditoFiscal=this.jInternalFrameDetalleFormCuentaCreditoFiscal.jPanelAccionesFormularioCuentaCreditoFiscal;
		}
		
		final JPanel jPanelCamposCuentaCreditoFiscal=jPanelCamposAuxiliarCuentaCreditoFiscal;
		final JPanel jPanelAccionesFormularioCuentaCreditoFiscal=jPanelAccionesFormularioAuxiliarCuentaCreditoFiscal;
		
		
		final JMenuBar jmenuBarCuentaCreditoFiscal=this.jmenuBarCuentaCreditoFiscal;
		final JToolBar jTtoolBarCuentaCreditoFiscal=this.jTtoolBarCuentaCreditoFiscal;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCuentaCreditoFiscal=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCuentaCreditoFiscal=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCuentaCreditoFiscal!=null) {
			jmenuBarDetalleAuxiliarCuentaCreditoFiscal=this.jInternalFrameDetalleFormCuentaCreditoFiscal.jmenuBarDetalleCuentaCreditoFiscal;
			jTtoolBarDetalleAuxiliarCuentaCreditoFiscal=this.jInternalFrameDetalleFormCuentaCreditoFiscal.jTtoolBarDetalleCuentaCreditoFiscal;
		}
		
		final JMenuBar jmenuBarDetalleCuentaCreditoFiscal=jmenuBarDetalleAuxiliarCuentaCreditoFiscal;
		final JToolBar jTtoolBarDetalleCuentaCreditoFiscal=jTtoolBarDetalleAuxiliarCuentaCreditoFiscal;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCuentaCreditoFiscal;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCuentaCreditoFiscal;
			processRunnable.jTableDatos=jTableDatosCuentaCreditoFiscal;
			processRunnable.jPanelCampos=jPanelCamposCuentaCreditoFiscal;
			processRunnable.jPanelPaginacion=jPanelPaginacionCuentaCreditoFiscal;
			processRunnable.jPanelAcciones=jPanelAccionesCuentaCreditoFiscal;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCuentaCreditoFiscal;
			
			
			processRunnable.jmenuBar=jmenuBarCuentaCreditoFiscal;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCuentaCreditoFiscal;
			processRunnable.jTtoolBar=jTtoolBarCuentaCreditoFiscal;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCuentaCreditoFiscal;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCuentaCreditoFiscal ,jPanelParametrosReportesCuentaCreditoFiscal,jTableDatosCuentaCreditoFiscal, /*jScrollPanelDatosCuentaCreditoFiscal,*/jPanelCamposCuentaCreditoFiscal,jPanelPaginacionCuentaCreditoFiscal, /*jScrollPanelDatosEdicionCuentaCreditoFiscal,*/ jPanelAccionesCuentaCreditoFiscal,jPanelAccionesFormularioCuentaCreditoFiscal,jmenuBarCuentaCreditoFiscal,jmenuBarDetalleCuentaCreditoFiscal,jTtoolBarCuentaCreditoFiscal,jTtoolBarDetalleCuentaCreditoFiscal);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCuentaCreditoFiscal ,jPanelParametrosReportesCuentaCreditoFiscal, jScrollPanelDatosCuentaCreditoFiscal,jPanelPaginacionCuentaCreditoFiscal, jScrollPanelDatosEdicionCuentaCreditoFiscal, jPanelAccionesCuentaCreditoFiscal,jPanelAccionesFormularioCuentaCreditoFiscal,jmenuBarCuentaCreditoFiscal,jmenuBarDetalleCuentaCreditoFiscal,jTtoolBarCuentaCreditoFiscal,jTtoolBarDetalleCuentaCreditoFiscal);
						
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
	
	public void finishProcessCuentaCreditoFiscal() {// throws Exception 
		this.finishProcessCuentaCreditoFiscal(true);
	}
	
	public void finishProcessCuentaCreditoFiscal(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasCuentaCreditoFiscal ,this.jPanelParametrosReportesCuentaCreditoFiscal, this.jScrollPanelDatosCuentaCreditoFiscal,this.jPanelPaginacionCuentaCreditoFiscal, this.jScrollPanelDatosEdicionCuentaCreditoFiscal, this.jPanelAccionesCuentaCreditoFiscal,this.jPanelAccionesFormularioCuentaCreditoFiscal,this.jmenuBarCuentaCreditoFiscal,this.jmenuBarDetalleCuentaCreditoFiscal,this.jTtoolBarCuentaCreditoFiscal,this.jTtoolBarDetalleCuentaCreditoFiscal);		
		
		final JTabbedPane jTabbedPaneBusquedasCuentaCreditoFiscal=this.jTabbedPaneBusquedasCuentaCreditoFiscal; 
		
		final JPanel jPanelParametrosReportesCuentaCreditoFiscal=this.jPanelParametrosReportesCuentaCreditoFiscal;
		//final JScrollPane jScrollPanelDatosCuentaCreditoFiscal=this.jScrollPanelDatosCuentaCreditoFiscal;
		final JTable jTableDatosCuentaCreditoFiscal=this.jTableDatosCuentaCreditoFiscal;		
		final JPanel jPanelPaginacionCuentaCreditoFiscal=this.jPanelPaginacionCuentaCreditoFiscal;
		//final JScrollPane jScrollPanelDatosEdicionCuentaCreditoFiscal=this.jScrollPanelDatosEdicionCuentaCreditoFiscal;
		final JPanel jPanelAccionesCuentaCreditoFiscal=this.jPanelAccionesCuentaCreditoFiscal;
		
		JPanel jPanelCamposAuxiliarCuentaCreditoFiscal=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCuentaCreditoFiscal=new JPanel();
		
		if(this.jInternalFrameDetalleFormCuentaCreditoFiscal!=null) {
			jPanelCamposAuxiliarCuentaCreditoFiscal=this.jInternalFrameDetalleFormCuentaCreditoFiscal.jPanelCamposCuentaCreditoFiscal;
			jPanelAccionesFormularioAuxiliarCuentaCreditoFiscal=this.jInternalFrameDetalleFormCuentaCreditoFiscal.jPanelAccionesFormularioCuentaCreditoFiscal;
		}
		
		final JPanel jPanelCamposCuentaCreditoFiscal=jPanelCamposAuxiliarCuentaCreditoFiscal;
		final JPanel jPanelAccionesFormularioCuentaCreditoFiscal=jPanelAccionesFormularioAuxiliarCuentaCreditoFiscal;
		
		
		final JMenuBar jmenuBarCuentaCreditoFiscal=this.jmenuBarCuentaCreditoFiscal;		
		final JToolBar jTtoolBarCuentaCreditoFiscal=this.jTtoolBarCuentaCreditoFiscal;
				
		JMenuBar jmenuBarDetalleAuxiliarCuentaCreditoFiscal=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCuentaCreditoFiscal=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCuentaCreditoFiscal!=null) {
			jmenuBarDetalleAuxiliarCuentaCreditoFiscal=this.jInternalFrameDetalleFormCuentaCreditoFiscal.jmenuBarDetalleCuentaCreditoFiscal;
			jTtoolBarDetalleAuxiliarCuentaCreditoFiscal=this.jInternalFrameDetalleFormCuentaCreditoFiscal.jTtoolBarDetalleCuentaCreditoFiscal;		
		}
		
		final JMenuBar jmenuBarDetalleCuentaCreditoFiscal=jmenuBarDetalleAuxiliarCuentaCreditoFiscal;
		final JToolBar jTtoolBarDetalleCuentaCreditoFiscal=jTtoolBarDetalleAuxiliarCuentaCreditoFiscal;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCuentaCreditoFiscal;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCuentaCreditoFiscal;
			processRunnable.jTableDatos=jTableDatosCuentaCreditoFiscal;
			processRunnable.jPanelCampos=jPanelCamposCuentaCreditoFiscal;
			processRunnable.jPanelPaginacion=jPanelPaginacionCuentaCreditoFiscal;
			processRunnable.jPanelAcciones=jPanelAccionesCuentaCreditoFiscal;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCuentaCreditoFiscal;
			
			
			processRunnable.jmenuBar=jmenuBarCuentaCreditoFiscal;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCuentaCreditoFiscal;
			processRunnable.jTtoolBar=jTtoolBarCuentaCreditoFiscal;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCuentaCreditoFiscal;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCuentaCreditoFiscal ,jPanelParametrosReportesCuentaCreditoFiscal, jTableDatosCuentaCreditoFiscal,/*jScrollPanelDatosCuentaCreditoFiscal,*/jPanelCamposCuentaCreditoFiscal,jPanelPaginacionCuentaCreditoFiscal, /*jScrollPanelDatosEdicionCuentaCreditoFiscal,*/ jPanelAccionesCuentaCreditoFiscal,jPanelAccionesFormularioCuentaCreditoFiscal,jmenuBarCuentaCreditoFiscal,jmenuBarDetalleCuentaCreditoFiscal,jTtoolBarCuentaCreditoFiscal,jTtoolBarDetalleCuentaCreditoFiscal));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCuentaCreditoFiscal(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCuentaCreditoFiscal(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCuentaCreditoFiscal(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCuentaCreditoFiscal(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCuentaCreditoFiscal,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCuentaCreditoFiscal,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCuentaCreditoFiscal(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCuentaCreditoFiscal,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCuentaCreditoFiscal,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.cuentacreditofiscalConstantesFunciones.getsFinalQueryCuentaCreditoFiscal();
		String  finalQueryPaginacionTodos=this.cuentacreditofiscalConstantesFunciones.getsFinalQueryCuentaCreditoFiscal();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=CuentaCreditoFiscalConstantesFunciones.getArrayColumnasGlobalesNoCuentaCreditoFiscal(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CuentaCreditoFiscalConstantesFunciones.getArrayColumnasGlobalesCuentaCreditoFiscal(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CuentaCreditoFiscalConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.cuentacreditofiscalsEliminados= new ArrayList<CuentaCreditoFiscal>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCuentaCreditoFiscal();
		
				///*CuentaCreditoFiscalSessionBean*/this.cuentacreditofiscalSessionBean=new CuentaCreditoFiscalSessionBean();
			
			if(this.cuentacreditofiscalSessionBean==null) {
				this.cuentacreditofiscalSessionBean=new CuentaCreditoFiscalSessionBean();
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
					this.iNumeroPaginacion=CuentaCreditoFiscalConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CuentaCreditoFiscalConstantesFunciones.getClassesForeignKeysOfCuentaCreditoFiscal(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/cuentacreditofiscal."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			cuentacreditofiscalsAux= new ArrayList<CuentaCreditoFiscal>();
			
				
			cuentacreditofiscalLogic.setDatosCliente(this.datosCliente);
			cuentacreditofiscalLogic.setDatosDeep(this.datosDeep);
			cuentacreditofiscalLogic.setIsConDeep(true);
			
			
			cuentacreditofiscalLogic.getCuentaCreditoFiscalDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					cuentacreditofiscalLogic.getTodosCuentaCreditoFiscals(finalQueryGlobal,pagination);
					
					//cuentacreditofiscalLogic.getTodosCuentaCreditoFiscalsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(cuentacreditofiscalLogic.getCuentaCreditoFiscals()==null|| cuentacreditofiscalLogic.getCuentaCreditoFiscals().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cuentacreditofiscalsAux= new ArrayList<CuentaCreditoFiscal>();
							cuentacreditofiscalsAux.addAll(cuentacreditofiscalLogic.getCuentaCreditoFiscals());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentacreditofiscalsAux= new ArrayList<CuentaCreditoFiscal>();
							cuentacreditofiscalsAux.addAll(cuentacreditofiscals);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cuentacreditofiscalLogic.getTodosCuentaCreditoFiscals(finalQueryGlobal+"",this.pagination);												
							
							//cuentacreditofiscalLogic.getTodosCuentaCreditoFiscalsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteCuentaCreditoFiscals("Todos",cuentacreditofiscalLogic.getCuentaCreditoFiscals() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cuentacreditofiscalLogic.setCuentaCreditoFiscals(new ArrayList<CuentaCreditoFiscal>());					
							cuentacreditofiscalLogic.getCuentaCreditoFiscals().addAll(cuentacreditofiscalsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentacreditofiscals=new ArrayList<CuentaCreditoFiscal>();
							cuentacreditofiscals.addAll(cuentacreditofiscalsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idCuentaCreditoFiscal=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idCuentaCreditoFiscal=this.idActual;
				
				} else if(this.idCuentaCreditoFiscalActual!=null && this.idCuentaCreditoFiscalActual!=0L) {
					idCuentaCreditoFiscal=idCuentaCreditoFiscalActual;
				}
				
					
				this.sDetalleReporte=CuentaCreditoFiscalConstantesFunciones.getDetalleIndicePorId(idCuentaCreditoFiscal);
				
				this.cuentacreditofiscals=new ArrayList<CuentaCreditoFiscal>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					cuentacreditofiscalLogic.getEntity(idCuentaCreditoFiscal);
					
					//cuentacreditofiscalLogic.getEntityWithConnection(idCuentaCreditoFiscal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacreditofiscalLogic.setCuentaCreditoFiscals(new ArrayList<CuentaCreditoFiscal>());
					cuentacreditofiscalLogic.getCuentaCreditoFiscals().add(cuentacreditofiscalLogic.getCuentaCreditoFiscal());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cuentacreditofiscals=new ArrayList<CuentaCreditoFiscal>();
					this.cuentacreditofiscals.add(cuentacreditofiscal);
				}
				
				if(cuentacreditofiscalLogic.getCuentaCreditoFiscal()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCuentaContable")) {
				this.sDetalleReporte=CuentaCreditoFiscalConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cuentacreditofiscalLogic.getCuentaCreditoFiscalsFK_IdCuentaContable(finalQueryGlobal,pagination,id_cuenta_contableFK_IdCuentaContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuentaCreditoFiscalConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuentaCreditoFiscalConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cuentacreditofiscalLogic.getCuentaCreditoFiscals()==null||cuentacreditofiscalLogic.getCuentaCreditoFiscals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cuentacreditofiscals==null|| cuentacreditofiscals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentacreditofiscalsAux=new ArrayList<CuentaCreditoFiscal>();
						cuentacreditofiscalsAux.addAll(cuentacreditofiscalLogic.getCuentaCreditoFiscals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentacreditofiscalsAux=new ArrayList<CuentaCreditoFiscal>();
							cuentacreditofiscalsAux.addAll(cuentacreditofiscals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cuentacreditofiscalLogic.getCuentaCreditoFiscalsFK_IdCuentaContable(finalQueryGlobal,pagination,id_cuenta_contableFK_IdCuentaContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuentaCreditoFiscalConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuentaCreditoFiscalConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCuentaCreditoFiscals("FK_IdCuentaContable",cuentacreditofiscalLogic.getCuentaCreditoFiscals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCuentaCreditoFiscals("FK_IdCuentaContable",cuentacreditofiscals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentacreditofiscalLogic.setCuentaCreditoFiscals(new ArrayList<CuentaCreditoFiscal>());
						cuentacreditofiscalLogic.getCuentaCreditoFiscals().addAll(cuentacreditofiscalsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentacreditofiscals=new ArrayList<CuentaCreditoFiscal>();
							cuentacreditofiscals.addAll(cuentacreditofiscalsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=CuentaCreditoFiscalConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cuentacreditofiscalLogic.getCuentaCreditoFiscalsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuentaCreditoFiscalConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuentaCreditoFiscalConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cuentacreditofiscalLogic.getCuentaCreditoFiscals()==null||cuentacreditofiscalLogic.getCuentaCreditoFiscals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cuentacreditofiscals==null|| cuentacreditofiscals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentacreditofiscalsAux=new ArrayList<CuentaCreditoFiscal>();
						cuentacreditofiscalsAux.addAll(cuentacreditofiscalLogic.getCuentaCreditoFiscals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentacreditofiscalsAux=new ArrayList<CuentaCreditoFiscal>();
							cuentacreditofiscalsAux.addAll(cuentacreditofiscals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cuentacreditofiscalLogic.getCuentaCreditoFiscalsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CuentaCreditoFiscalConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CuentaCreditoFiscalConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCuentaCreditoFiscals("FK_IdEmpresa",cuentacreditofiscalLogic.getCuentaCreditoFiscals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCuentaCreditoFiscals("FK_IdEmpresa",cuentacreditofiscals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentacreditofiscalLogic.setCuentaCreditoFiscals(new ArrayList<CuentaCreditoFiscal>());
						cuentacreditofiscalLogic.getCuentaCreditoFiscals().addAll(cuentacreditofiscalsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentacreditofiscals=new ArrayList<CuentaCreditoFiscal>();
							cuentacreditofiscals.addAll(cuentacreditofiscalsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCuentaCreditoFiscal();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCuentaCreditoFiscal();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cuentacreditofiscalLogic.getCuentaCreditoFiscals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cuentacreditofiscals.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cuentacreditofiscalLogic.getCuentaCreditoFiscals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cuentacreditofiscals.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(CuentaCreditoFiscal cuentacreditofiscal) {
		Boolean permite=true;
		
		if(this.cuentacreditofiscal.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CuentaCreditoFiscalConstantesFunciones.getOrderByListaCuentaCreditoFiscal();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CuentaCreditoFiscalConstantesFunciones.getOrderByListaCuentaCreditoFiscal();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CuentaCreditoFiscal cuentacreditofiscal:cuentacreditofiscalLogic.getCuentaCreditoFiscals()) {
				if(cuentacreditofiscal.getsType().equals(Constantes2.S_TOTALES)) {
					cuentacreditofiscalTotales=cuentacreditofiscal;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CuentaCreditoFiscal cuentacreditofiscal:this.cuentacreditofiscals) {
				if(cuentacreditofiscal.getsType().equals(Constantes2.S_TOTALES)) {
					cuentacreditofiscalTotales=cuentacreditofiscal;
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
			this.cuentacreditofiscalAux=new CuentaCreditoFiscal();
			this.cuentacreditofiscalAux.setsType(Constantes2.S_TOTALES);
			this.cuentacreditofiscalAux.setIsNew(false);
			this.cuentacreditofiscalAux.setIsChanged(false);
			this.cuentacreditofiscalAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				CuentaCreditoFiscalConstantesFunciones.TotalizarValoresFilaCuentaCreditoFiscal(this.cuentacreditofiscalLogic.getCuentaCreditoFiscals(),this.cuentacreditofiscalAux);
				
				this.cuentacreditofiscalLogic.getCuentaCreditoFiscals().add(this.cuentacreditofiscalAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CuentaCreditoFiscalConstantesFunciones.TotalizarValoresFilaCuentaCreditoFiscal(this.cuentacreditofiscals,this.cuentacreditofiscalAux);
				
				this.cuentacreditofiscals.add(this.cuentacreditofiscalAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		cuentacreditofiscalTotales=new CuentaCreditoFiscal();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cuentacreditofiscalLogic.getCuentaCreditoFiscals().remove(cuentacreditofiscalTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cuentacreditofiscals.remove(cuentacreditofiscalTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		cuentacreditofiscalTotales=new CuentaCreditoFiscal();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CuentaCreditoFiscal cuentacreditofiscal:cuentacreditofiscalLogic.getCuentaCreditoFiscals()) {
				if(cuentacreditofiscal.getsType().equals(Constantes2.S_TOTALES)) {
					cuentacreditofiscalTotales=cuentacreditofiscal;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CuentaCreditoFiscalConstantesFunciones.TotalizarValoresFilaCuentaCreditoFiscal(this.cuentacreditofiscalLogic.getCuentaCreditoFiscals(),cuentacreditofiscalTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CuentaCreditoFiscal cuentacreditofiscal:this.cuentacreditofiscals) {
				if(cuentacreditofiscal.getsType().equals(Constantes2.S_TOTALES)) {
					cuentacreditofiscalTotales=cuentacreditofiscal;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CuentaCreditoFiscalConstantesFunciones.TotalizarValoresFilaCuentaCreditoFiscal(this.cuentacreditofiscals,cuentacreditofiscalTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getCuentaCreditoFiscalsFK_IdCuentaContable()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaContable";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCuentaCreditoFiscalsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getCuentaCreditoFiscalsFK_IdCuentaContable(String sFinalQuery,Long id_cuenta_contable)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacreditofiscalLogic.getCuentaCreditoFiscalsFK_IdCuentaContable(sFinalQuery,this.pagination,id_cuenta_contable);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCuentaCreditoFiscalsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacreditofiscalLogic.getCuentaCreditoFiscalsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosCuentaCreditoFiscal() {
		this.isPermisoTodoCuentaCreditoFiscal=false;
		this.isPermisoNuevoCuentaCreditoFiscal=false;
		this.isPermisoActualizarCuentaCreditoFiscal=false;
		this.isPermisoActualizarOriginalCuentaCreditoFiscal=false;
		this.isPermisoEliminarCuentaCreditoFiscal=false;
		this.isPermisoGuardarCambiosCuentaCreditoFiscal=false;
		this.isPermisoConsultaCuentaCreditoFiscal=false;
		this.isPermisoBusquedaCuentaCreditoFiscal=false;
		this.isPermisoReporteCuentaCreditoFiscal=false;		
		this.isPermisoOrdenCuentaCreditoFiscal=false;		
		this.isPermisoPaginacionMedioCuentaCreditoFiscal=false;		
		this.isPermisoPaginacionAltoCuentaCreditoFiscal=false;
		this.isPermisoPaginacionTodoCuentaCreditoFiscal=false;
		this.isPermisoCopiarCuentaCreditoFiscal=false;		
		this.isPermisoVerFormCuentaCreditoFiscal=false;		
		this.isPermisoDuplicarCuentaCreditoFiscal=false;		
		this.isPermisoOrdenCuentaCreditoFiscal=false;		
	}
	
	public void setPermisosUsuarioCuentaCreditoFiscal(Boolean isPermiso) {
		this.isPermisoTodoCuentaCreditoFiscal=isPermiso;
		this.isPermisoNuevoCuentaCreditoFiscal=isPermiso;
		this.isPermisoActualizarCuentaCreditoFiscal=isPermiso;
		this.isPermisoActualizarOriginalCuentaCreditoFiscal=isPermiso;
		this.isPermisoEliminarCuentaCreditoFiscal=isPermiso;
		this.isPermisoGuardarCambiosCuentaCreditoFiscal=isPermiso;
		this.isPermisoConsultaCuentaCreditoFiscal=isPermiso;
		this.isPermisoBusquedaCuentaCreditoFiscal=isPermiso;
		this.isPermisoReporteCuentaCreditoFiscal=isPermiso;
		this.isPermisoOrdenCuentaCreditoFiscal=isPermiso;		
		this.isPermisoPaginacionMedioCuentaCreditoFiscal=isPermiso;		
		this.isPermisoPaginacionAltoCuentaCreditoFiscal=isPermiso;		
		this.isPermisoPaginacionTodoCuentaCreditoFiscal=isPermiso;		
		this.isPermisoCopiarCuentaCreditoFiscal=isPermiso;		
		this.isPermisoVerFormCuentaCreditoFiscal=isPermiso;		
		this.isPermisoDuplicarCuentaCreditoFiscal=isPermiso;
		this.isPermisoOrdenCuentaCreditoFiscal=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCuentaCreditoFiscal(Boolean isPermiso) {
		//this.isPermisoTodoCuentaCreditoFiscal=isPermiso;
		this.isPermisoNuevoCuentaCreditoFiscal=isPermiso;
		this.isPermisoActualizarCuentaCreditoFiscal=isPermiso;
		this.isPermisoActualizarOriginalCuentaCreditoFiscal=isPermiso;
		this.isPermisoEliminarCuentaCreditoFiscal=isPermiso;
		this.isPermisoGuardarCambiosCuentaCreditoFiscal=isPermiso;
		//this.isPermisoConsultaCuentaCreditoFiscal=isPermiso;
		//this.isPermisoBusquedaCuentaCreditoFiscal=isPermiso;
		//this.isPermisoReporteCuentaCreditoFiscal=isPermiso;
		//this.isPermisoOrdenCuentaCreditoFiscal=isPermiso;		
		//this.isPermisoPaginacionMedioCuentaCreditoFiscal=isPermiso;		
		//this.isPermisoPaginacionAltoCuentaCreditoFiscal=isPermiso;		
		//this.isPermisoPaginacionTodoCuentaCreditoFiscal=isPermiso;		
		//this.isPermisoCopiarCuentaCreditoFiscal=isPermiso;		
		//this.isPermisoDuplicarCuentaCreditoFiscal=isPermiso;
		//this.isPermisoOrdenCuentaCreditoFiscal=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCuentaCreditoFiscalClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(CuentaCreditoFiscalJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebCuentaCreditoFiscal(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCuentaCreditoFiscalClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioCuentaCreditoFiscalClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCuentaCreditoFiscalClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCuentaCreditoFiscalClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioCuentaCreditoFiscal() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CuentaCreditoFiscalJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CuentaCreditoFiscalConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCuentaCreditoFiscal=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCuentaCreditoFiscal=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCuentaCreditoFiscal=this.isPermisoActualizarCuentaCreditoFiscal;
			this.isPermisoEliminarCuentaCreditoFiscal=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCuentaCreditoFiscal=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCuentaCreditoFiscal=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCuentaCreditoFiscal=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCuentaCreditoFiscal=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCuentaCreditoFiscal=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCuentaCreditoFiscal=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCuentaCreditoFiscal=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCuentaCreditoFiscal=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCuentaCreditoFiscal=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCuentaCreditoFiscal=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCuentaCreditoFiscal=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCuentaCreditoFiscal=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCuentaCreditoFiscal=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCuentaCreditoFiscal.setToolTipText(this.jTableDatosCuentaCreditoFiscal.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCuentaCreditoFiscal(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCuentaCreditoFiscal(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CuentaCreditoFiscalJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(CuentaCreditoFiscalJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioCuentaCreditoFiscal() throws Exception {
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
	public void inicializarCombosForeignKeyCuentaCreditoFiscalListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.cuentacontablesForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCuentaCreditoFiscalListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CuentaCreditoFiscalJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyCuentaCreditoFiscalListas(false);
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
	
	public void cargarCombosLoteForeignKeyCuentaCreditoFiscalListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			CuentaCreditoFiscalParameterReturnGeneral cuentacreditofiscalReturnGeneral=new CuentaCreditoFiscalParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.cuentacreditofiscalConstantesFunciones.cargarid_empresaCuentaCreditoFiscal)
					 || (this.esRecargarFks && this.cuentacreditofiscalConstantesFunciones.cargarid_empresaCuentaCreditoFiscal)) {

					if(!this.cuentacreditofiscalSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+cuentacreditofiscalSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalCuentaContable="";

				if(((this.cuentacontablesForeignKey==null||this.cuentacontablesForeignKey.size()<=0) && this.cuentacreditofiscalConstantesFunciones.cargarid_cuenta_contableCuentaCreditoFiscal)
					 || (this.esRecargarFks && this.cuentacreditofiscalConstantesFunciones.cargarid_cuenta_contableCuentaCreditoFiscal)) {

					if(!this.cuentacreditofiscalSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();

						this.arrDatoGeneralNo.add("id_modulo");

						arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCuentaContable=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

						finalQueryGlobalCuentaContable=Funciones.GetFinalQueryAppend(finalQueryGlobalCuentaContable, "");
						finalQueryGlobalCuentaContable+=CuentaContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCuentaContablesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCuentaContable=" WHERE " + ConstantesSql.ID + "="+cuentacreditofiscalSessionBean.getlidCuentaContableActual();
					}
				} else {
					finalQueryGlobalCuentaContable="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				cuentacreditofiscalReturnGeneral=cuentacreditofiscalLogic.cargarCombosLoteForeignKeyCuentaCreditoFiscal(finalQueryGlobalEmpresa,finalQueryGlobalCuentaContable);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=cuentacreditofiscalReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalCuentaContable.equals("NONE")) {
				this.cuentacontablesForeignKey=cuentacreditofiscalReturnGeneral.getcuentacontablesForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyCuentaCreditoFiscal()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyCuentaContable();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.cuentacreditofiscalSessionBean==null) {
				this.cuentacreditofiscalSessionBean=new CuentaCreditoFiscalSessionBean();
			}

			if(!this.cuentacreditofiscalSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.cuentacreditofiscalSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
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
	
	public void initActionsCombosTodosForeignKeyCuentaCreditoFiscal()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCuentaCreditoFiscal(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyCuentaCreditoFiscal()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCuentaCreditoFiscal();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCuentaCreditoFiscal(CuentaCreditoFiscal cuentacreditofiscal)throws Exception {	
		try {
			
			this.setActualCuentaContableForeignKey(cuentacreditofiscal.getid_cuenta_contable(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCuentaCreditoFiscal(CuentaCreditoFiscal cuentacreditofiscal,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCuentaCreditoFiscal()throws Exception {	
		try {
			
			this.setActualCuentaContableForeignKey(this.cuentacreditofiscalConstantesFunciones.getid_cuenta_contable(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCuentaCreditoFiscal()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCuentaCreditoFiscal()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCuentaCreditoFiscal()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCuentaCreditoFiscal()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCuentaCreditoFiscal()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameCuentaContablesForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCuentaCreditoFiscal(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCuentaContablesForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCuentaCreditoFiscal()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormCuentaCreditoFiscal.jComboBoxid_empresaCuentaCreditoFiscal!=null && this.jInternalFrameDetalleFormCuentaCreditoFiscal.jComboBoxid_empresaCuentaCreditoFiscal.getItemCount()>0) {
				this.jInternalFrameDetalleFormCuentaCreditoFiscal.jComboBoxid_empresaCuentaCreditoFiscal.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCuentaCreditoFiscal.jComboBoxid_cuenta_contableCuentaCreditoFiscal!=null && this.jInternalFrameDetalleFormCuentaCreditoFiscal.jComboBoxid_cuenta_contableCuentaCreditoFiscal.getItemCount()>0) {
				this.jInternalFrameDetalleFormCuentaCreditoFiscal.jComboBoxid_cuenta_contableCuentaCreditoFiscal.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public CuentaCreditoFiscalBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CuentaCreditoFiscalBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CuentaCreditoFiscalBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.cuentacreditofiscalSessionBean=new CuentaCreditoFiscalSessionBean(); 
		this.cuentacreditofiscalConstantesFunciones=new CuentaCreditoFiscalConstantesFunciones(); 
		this.cuentacreditofiscalBean=new CuentaCreditoFiscal();//(this.cuentacreditofiscalConstantesFunciones); 		
		this.cuentacreditofiscalReturnGeneral=new CuentaCreditoFiscalParameterReturnGeneral(); 
		
		this.cuentacreditofiscalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cuentacreditofiscalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CuentaCreditoFiscalBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CuentaCreditoFiscalBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CuentaCreditoFiscalBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCuentaCreditoFiscal(true);
			
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
			
			this.cuentacreditofiscalConstantesFunciones=new CuentaCreditoFiscalConstantesFunciones(); 
			this.cuentacreditofiscalBean=new CuentaCreditoFiscal();//this.cuentacreditofiscalConstantesFunciones); 			
			this.cuentacreditofiscalReturnGeneral=new CuentaCreditoFiscalParameterReturnGeneral(); 
		
			CuentaCreditoFiscalBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cuenta Credito Fiscal Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.cuentacreditofiscal=new CuentaCreditoFiscal();
			this.cuentacreditofiscals = new ArrayList<CuentaCreditoFiscal>();
			this.cuentacreditofiscalsAux = new ArrayList<CuentaCreditoFiscal>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacreditofiscalLogic=new CuentaCreditoFiscalLogic();
				this.cuentacreditofiscalLogic.getNewConnexionToDeep("");
			}
			
			//this.cuentacreditofiscalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.cuentacreditofiscalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCuentaCreditoFiscal);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCuentaCreditoFiscal!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCuentaCreditoFiscal);	
					}
					
					if(this.jInternalFrameImportacionCuentaCreditoFiscal!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCuentaCreditoFiscal);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCuentaCreditoFiscal!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCuentaCreditoFiscal);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCuentaCreditoFiscal!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCuentaCreditoFiscal);
				this.jInternalFrameDetalleFormCuentaCreditoFiscal.setVisible(false);
				this.jInternalFrameDetalleFormCuentaCreditoFiscal.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCuentaCreditoFiscal!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCuentaCreditoFiscal);
					this.jInternalFrameReporteDinamicoCuentaCreditoFiscal.setVisible(false);
					this.jInternalFrameReporteDinamicoCuentaCreditoFiscal.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCuentaCreditoFiscal!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCuentaCreditoFiscal);
					this.jInternalFrameImportacionCuentaCreditoFiscal.setVisible(false);
					this.jInternalFrameImportacionCuentaCreditoFiscal.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCuentaCreditoFiscal!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCuentaCreditoFiscal);
					this.jInternalFrameOrderByCuentaCreditoFiscal.setVisible(false);
					this.jInternalFrameOrderByCuentaCreditoFiscal.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCuentaCreditoFiscalActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CuentaCreditoFiscalConstantesFunciones.INUMEROPAGINACION;
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
			
			this.cuentacreditofiscalReturnGeneral=new CuentaCreditoFiscalParameterReturnGeneral();
			
			this.cuentacreditofiscalParameterGeneral=new CuentaCreditoFiscalParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.cuentacreditofiscalLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado()) {
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
			
			if(CuentaCreditoFiscalJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CuentaCreditoFiscalConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado(),this.cuentacreditofiscalSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CuentaCreditoFiscalConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado(),this.cuentacreditofiscalSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoCuentaCreditoFiscal=false;
			this.isVisibilidadCeldaDuplicarCuentaCreditoFiscal=true;
			this.isVisibilidadCeldaCopiarCuentaCreditoFiscal=true;
			this.isVisibilidadCeldaVerFormCuentaCreditoFiscal=true;
			this.isVisibilidadCeldaOrdenCuentaCreditoFiscal=true;
			this.isVisibilidadCeldaNuevoRelacionesCuentaCreditoFiscal=false;
			this.isVisibilidadCeldaModificarCuentaCreditoFiscal=false;
			this.isVisibilidadCeldaActualizarCuentaCreditoFiscal=false;
			this.isVisibilidadCeldaEliminarCuentaCreditoFiscal=false;
			this.isVisibilidadCeldaCancelarCuentaCreditoFiscal=false;
			this.isVisibilidadCeldaGuardarCuentaCreditoFiscal=false;
			this.isVisibilidadCeldaGuardarCambiosCuentaCreditoFiscal=false;
			
			
			this.isVisibilidadFK_IdCuentaContable=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCuentaCreditoFiscal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCuentaCreditoFiscal();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCuentaCreditoFiscal(false);
			
			this.setPermisosUsuarioCuentaCreditoFiscal();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado() 
				|| (this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado() && this.cuentacreditofiscalSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCuentaCreditoFiscalClasesRelacionadas();
			}
			
			if(this.cuentacreditofiscalSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCuentaCreditoFiscalClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CuentaCreditoFiscalJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCuentaCreditoFiscal();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCuentaCreditoFiscal();
			}
			
			if(!this.isPermisoBusquedaCuentaCreditoFiscal) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasCuentaCreditoFiscal.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioCuentaCreditoFiscal,this.isPermisoPaginacionMedioCuentaCreditoFiscal,this.isPermisoPaginacionTodoCuentaCreditoFiscal);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CuentaCreditoFiscalConstantesFunciones.getTiposSeleccionarCuentaCreditoFiscal());
				
				this.tiposColumnasSelect=CuentaCreditoFiscalConstantesFunciones.getTiposSeleccionarCuentaCreditoFiscal(true);
				
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
			//if(!this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCuentaCreditoFiscal();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioCuentaCreditoFiscal(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioCuentaCreditoFiscal(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCuentaCreditoFiscal() ;
			
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
				cuentacreditofiscalImplementable= (CuentaCreditoFiscalImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CuentaCreditoFiscalConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				cuentacreditofiscalImplementableHome= (CuentaCreditoFiscalImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CuentaCreditoFiscalConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.cuentacreditofiscals= new ArrayList<CuentaCreditoFiscal>();
			this.cuentacreditofiscalsEliminados= new ArrayList<CuentaCreditoFiscal>();
						
			this.isEsNuevoCuentaCreditoFiscal=false;
			this.esParaAccionDesdeFormularioCuentaCreditoFiscal=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.cuentacontablesForeignKey=new ArrayList<CuentaContable>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCuentaCreditoFiscal(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCuentaCreditoFiscal();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CuentaCreditoFiscalBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CuentaCreditoFiscalConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCuentaCreditoFiscal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCuentaCreditoFiscal(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCuentaCreditoFiscal!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCuentaCreditoFiscal();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCuentaCreditoFiscal();
			}
			
			CuentaCreditoFiscalBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasCuentaCreditoFiscal.getTabCount(); i++) {
					this.jTabbedPaneBusquedasCuentaCreditoFiscal.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasCuentaCreditoFiscal.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacreditofiscalLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCuentaCreditoFiscal(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga CuentaCreditoFiscal: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacreditofiscalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacreditofiscalLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCuentaCreditoFiscal() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesCuentaCreditoFiscal")) {
				iIndex=this.jInternalFrameDetalleFormCuentaCreditoFiscal.jTabbedPaneRelacionesCuentaCreditoFiscal.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCuentaCreditoFiscal.jTabbedPaneRelacionesCuentaCreditoFiscal.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCuentaCreditoFiscal.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCuentaCreditoFiscal();	
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
	
	public void cargarCombosForeignKeyCuentaCreditoFiscal(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCuentaCreditoFiscal(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCuentaCreditoFiscal(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCuentaCreditoFiscalListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCuentaCreditoFiscal();
		
		this.cargarCombosFrameForeignKeyCuentaCreditoFiscal();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCuentaCreditoFiscal();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCuentaCreditoFiscal();
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
	
	public void jButtonNuevoCuentaCreditoFiscalActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.cuentacreditofiscalSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCuentaCreditoFiscal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CuentaCreditoFiscalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cuentacreditofiscal,new Object(),this.cuentacreditofiscalParameterGeneral,this.cuentacreditofiscalReturnGeneral);
			
			
			if(jTableDatosCuentaCreditoFiscal.getRowCount()>=1) {
				jTableDatosCuentaCreditoFiscal.removeRowSelectionInterval(0, jTableDatosCuentaCreditoFiscal.getRowCount()-1);						
			}
			
			this.isEsNuevoCuentaCreditoFiscal=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCuentaCreditoFiscal(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCuentaCreditoFiscal(true);			
			//this.cuentacreditofiscal=new CuentaCreditoFiscal();
			//this.cuentacreditofiscal.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCuentaCreditoFiscal(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCuentaCreditoFiscal() ;
			
			if(CuentaCreditoFiscalJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCuentaCreditoFiscal(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.cuentacreditofiscal);	
			this.actualizarInformacion("INFO_PADRE",false,this.cuentacreditofiscal);				
			
			CuentaCreditoFiscalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cuentacreditofiscal,new Object(),this.cuentacreditofiscalParameterGeneral,this.cuentacreditofiscalReturnGeneral);
			
			if(this.cuentacreditofiscalSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar CuentaCreditoFiscal: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CuentaCreditoFiscalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.cuentacreditofiscal,new Object(),this.cuentacreditofiscalParameterGeneral,this.cuentacreditofiscalReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCuentaCreditoFiscalActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<CuentaCreditoFiscal> cuentacreditofiscalsSeleccionados=new ArrayList<CuentaCreditoFiscal>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCuentaCreditoFiscal.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCuentaCreditoFiscal.getSelectedRows().length;			
			}
			
			cuentacreditofiscalsSeleccionados=this.getCuentaCreditoFiscalsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCuentaCreditoFiscal--;			
				//CuentaCreditoFiscal cuentacreditofiscalAux= new CuentaCreditoFiscal();			
				//cuentacreditofiscalAux.setId(this.iIdNuevoCuentaCreditoFiscal);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//CuentaCreditoFiscal cuentacreditofiscalOrigen=new CuentaCreditoFiscal();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(CuentaCreditoFiscal cuentacreditofiscalOrigen : cuentacreditofiscalsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCuentaCreditoFiscal.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							cuentacreditofiscalOrigen =(CuentaCreditoFiscal) this.cuentacreditofiscalLogic.getCuentaCreditoFiscals().toArray()[this.jTableDatosCuentaCreditoFiscal.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cuentacreditofiscalOrigen =(CuentaCreditoFiscal) this.cuentacreditofiscals.toArray()[this.jTableDatosCuentaCreditoFiscal.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCuentaCreditoFiscal();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.cuentacreditofiscal.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCuentaCreditoFiscal(cuentacreditofiscalOrigen,this.cuentacreditofiscal,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaCreditoFiscal(this.cuentacreditofiscal);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cuentacreditofiscalLogic.getCuentaCreditoFiscals().add(this.cuentacreditofiscalAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cuentacreditofiscals.add(this.cuentacreditofiscalAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCuentaCreditoFiscal(false);
				
				this.jTableDatosCuentaCreditoFiscal.setRowSelectionInterval(this.getIndiceNuevoCuentaCreditoFiscal(), this.getIndiceNuevoCuentaCreditoFiscal());
				
				int iLastRow =  this.jTableDatosCuentaCreditoFiscal.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCuentaCreditoFiscal.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCuentaCreditoFiscal.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCuentaCreditoFiscal(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCuentaCreditoFiscalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<CuentaCreditoFiscal> cuentacreditofiscalsSeleccionados=new ArrayList<CuentaCreditoFiscal>();									
		
			CuentaCreditoFiscal cuentacreditofiscalOrigen=new CuentaCreditoFiscal();
			CuentaCreditoFiscal cuentacreditofiscalDestino=new CuentaCreditoFiscal();
				
			cuentacreditofiscalsSeleccionados=this.getCuentaCreditoFiscalsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCuentaCreditoFiscal.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || cuentacreditofiscalsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCuentaCreditoFiscal.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentacreditofiscalOrigen =(CuentaCreditoFiscal) this.cuentacreditofiscalLogic.getCuentaCreditoFiscals().toArray()[this.jTableDatosCuentaCreditoFiscal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cuentacreditofiscalOrigen =(CuentaCreditoFiscal) this.cuentacreditofiscals.toArray()[this.jTableDatosCuentaCreditoFiscal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cuentacreditofiscalDestino =(CuentaCreditoFiscal) this.cuentacreditofiscalLogic.getCuentaCreditoFiscals().toArray()[this.jTableDatosCuentaCreditoFiscal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cuentacreditofiscalDestino =(CuentaCreditoFiscal) this.cuentacreditofiscals.toArray()[this.jTableDatosCuentaCreditoFiscal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				cuentacreditofiscalOrigen =cuentacreditofiscalsSeleccionados.get(0);
				cuentacreditofiscalDestino =cuentacreditofiscalsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCuentaCreditoFiscal(cuentacreditofiscalOrigen,cuentacreditofiscalDestino,true,false);
				
				cuentacreditofiscalDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cuentacreditofiscalDestino,cuentacreditofiscalLogic.getCuentaCreditoFiscals());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cuentacreditofiscalDestino,cuentacreditofiscals);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCuentaCreditoFiscal(false);
				
				//this.jTableDatosCuentaCreditoFiscal.setRowSelectionInterval(this.getIndiceNuevoCuentaCreditoFiscal(), this.getIndiceNuevoCuentaCreditoFiscal());
				
				int iLastRow =  this.jTableDatosCuentaCreditoFiscal.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCuentaCreditoFiscal.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCuentaCreditoFiscal.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCuentaCreditoFiscal(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCuentaCreditoFiscalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCuentaCreditoFiscal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCuentaCreditoFiscal.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCuentaCreditoFiscalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCuentaCreditoFiscal.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasCuentaCreditoFiscal.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesCuentaCreditoFiscal.setVisible(!isVisible);
			this.jPanelPaginacionCuentaCreditoFiscal.setVisible(!isVisible);
			this.jPanelAccionesCuentaCreditoFiscal.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCuentaCreditoFiscalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCuentaCreditoFiscal();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCuentaCreditoFiscalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCuentaCreditoFiscal();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCuentaCreditoFiscalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCuentaCreditoFiscal();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCuentaCreditoFiscalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCuentaCreditoFiscal();
			
			this.abrirFrameOrderByCuentaCreditoFiscal();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCuentaCreditoFiscalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCuentaCreditoFiscal();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCuentaCreditoFiscal(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCuentaCreditoFiscal);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCuentaCreditoFiscal.isMaximum()) {
					this.jInternalFrameDetalleFormCuentaCreditoFiscal.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCuentaCreditoFiscal.setSize(this.jInternalFrameDetalleFormCuentaCreditoFiscal.iWidthFormulario,this.jInternalFrameDetalleFormCuentaCreditoFiscal.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCuentaCreditoFiscal.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCuentaCreditoFiscal.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCuentaCreditoFiscal.isMaximum()) {
						this.jInternalFrameDetalleFormCuentaCreditoFiscal.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCuentaCreditoFiscal.jContentPaneDetalleCuentaCreditoFiscal.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCuentaCreditoFiscal.jTabbedPaneRelacionesCuentaCreditoFiscal.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCuentaCreditoFiscal.jContentPaneDetalleCuentaCreditoFiscal.getWidth(),CuentaCreditoFiscalConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCuentaCreditoFiscal.jTabbedPaneRelacionesCuentaCreditoFiscal.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCuentaCreditoFiscal.jContentPaneDetalleCuentaCreditoFiscal.getWidth(),CuentaCreditoFiscalConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCuentaCreditoFiscal.jTabbedPaneRelacionesCuentaCreditoFiscal.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCuentaCreditoFiscal.jContentPaneDetalleCuentaCreditoFiscal.getWidth(),CuentaCreditoFiscalConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCuentaCreditoFiscal.setVisible(true);
	        this.jInternalFrameDetalleFormCuentaCreditoFiscal.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCuentaCreditoFiscal() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCuentaCreditoFiscal==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCuentaCreditoFiscal=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCuentaCreditoFiscal,false,this);
				} else {
					this.jInternalFrameOrderByCuentaCreditoFiscal=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCuentaCreditoFiscal,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCuentaCreditoFiscal);
				this.jInternalFrameOrderByCuentaCreditoFiscal.setVisible(false);
				this.jInternalFrameOrderByCuentaCreditoFiscal.setSelected(false);
				
				this.jInternalFrameOrderByCuentaCreditoFiscal.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCuentaCreditoFiscal"));
				
				this.inicializarActualizarBindingTablaOrderByCuentaCreditoFiscal();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCuentaCreditoFiscal() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCuentaCreditoFiscal==null) {
				
				this.jInternalFrameImportacionCuentaCreditoFiscal=new ImportacionJInternalFrame(CuentaCreditoFiscalConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCuentaCreditoFiscal);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCuentaCreditoFiscal);
				this.jInternalFrameImportacionCuentaCreditoFiscal.setVisible(false);
				this.jInternalFrameImportacionCuentaCreditoFiscal.setSelected(false);


				this.jInternalFrameImportacionCuentaCreditoFiscal.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCuentaCreditoFiscal"));
				this.jInternalFrameImportacionCuentaCreditoFiscal.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCuentaCreditoFiscal"));
				this.jInternalFrameImportacionCuentaCreditoFiscal.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCuentaCreditoFiscal"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCuentaCreditoFiscal() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCuentaCreditoFiscal==null) {
				this.jInternalFrameReporteDinamicoCuentaCreditoFiscal=new ReporteDinamicoJInternalFrame(CuentaCreditoFiscalConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCuentaCreditoFiscal);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCuentaCreditoFiscal);
				this.jInternalFrameReporteDinamicoCuentaCreditoFiscal.setVisible(false);
				this.jInternalFrameReporteDinamicoCuentaCreditoFiscal.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCuentaCreditoFiscal.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCuentaCreditoFiscal"));
				this.jInternalFrameReporteDinamicoCuentaCreditoFiscal.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCuentaCreditoFiscal"));
				this.jInternalFrameReporteDinamicoCuentaCreditoFiscal.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCuentaCreditoFiscal"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCuentaCreditoFiscal();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleCuentaCreditoFiscal() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCuentaCreditoFiscal);
			
	       	this.jInternalFrameDetalleFormCuentaCreditoFiscal.setVisible(false);
	        this.jInternalFrameDetalleFormCuentaCreditoFiscal.setSelected(false);
			
			//this.jInternalFrameDetalleFormCuentaCreditoFiscal.dispose();
			//this.jInternalFrameDetalleFormCuentaCreditoFiscal=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCuentaCreditoFiscal() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCuentaCreditoFiscal.setVisible(true);
	        this.jInternalFrameReporteDinamicoCuentaCreditoFiscal.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCuentaCreditoFiscal() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCuentaCreditoFiscal.setVisible(true);
	        this.jInternalFrameImportacionCuentaCreditoFiscal.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCuentaCreditoFiscal() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCuentaCreditoFiscal.setVisible(true);
	        this.jInternalFrameOrderByCuentaCreditoFiscal.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCuentaCreditoFiscal() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCuentaCreditoFiscal.setVisible(false);
	        this.jInternalFrameOrderByCuentaCreditoFiscal.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCuentaCreditoFiscal() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCuentaCreditoFiscal.setVisible(false);
	        this.jInternalFrameReporteDinamicoCuentaCreditoFiscal.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCuentaCreditoFiscal() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCuentaCreditoFiscal.setVisible(false);
	        this.jInternalFrameImportacionCuentaCreditoFiscal.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
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
						TitledBorder titledBorderCuentaCreditoFiscal=(TitledBorder)this.jScrollPanelDatosCuentaCreditoFiscal.getBorder();
						TitledBorder titledBorderCuentaContable=(TitledBorder)cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

						titledBorderCuentaContable.setTitle(titledBorderCuentaCreditoFiscal.getTitle() + " -> Cuenta Contable");


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
	
	public void jButtonModificarCuentaCreditoFiscalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCuentaCreditoFiscal(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCuentaCreditoFiscal(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCuentaCreditoFiscal.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCuentaCreditoFiscal(true);
			//this.isEsNuevoCuentaCreditoFiscal=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacreditofiscal =(CuentaCreditoFiscal) this.cuentacreditofiscalLogic.getCuentaCreditoFiscals().toArray()[this.jTableDatosCuentaCreditoFiscal.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cuentacreditofiscal =(CuentaCreditoFiscal) this.cuentacreditofiscals.toArray()[this.jTableDatosCuentaCreditoFiscal.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCuentaCreditoFiscal("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCuentaCreditoFiscal(false) ;
			
			if(cuentacreditofiscalSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(CuentaCreditoFiscalJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCuentaCreditoFiscal(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCuentaCreditoFiscal(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCuentaCreditoFiscalActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCuentaCreditoFiscal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacreditofiscal =(CuentaCreditoFiscal) this.cuentacreditofiscalLogic.getCuentaCreditoFiscals().toArray()[this.jTableDatosCuentaCreditoFiscal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuentacreditofiscal =(CuentaCreditoFiscal) this.cuentacreditofiscals.toArray()[this.jTableDatosCuentaCreditoFiscal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCuentaCreditoFiscal(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCuentaCreditoFiscal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCuentaCreditoFiscal.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCuentaCreditoFiscal(true);
			//this.isEsNuevoCuentaCreditoFiscal=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacreditofiscal =(CuentaCreditoFiscal) this.cuentacreditofiscalLogic.getCuentaCreditoFiscals().toArray()[this.jTableDatosCuentaCreditoFiscal.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cuentacreditofiscal =(CuentaCreditoFiscal) this.cuentacreditofiscals.toArray()[this.jTableDatosCuentaCreditoFiscal.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.cuentacreditofiscal.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCuentaCreditoFiscal("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCuentaCreditoFiscal(false) ;
			
			if(CuentaCreditoFiscalJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCuentaCreditoFiscal(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCuentaCreditoFiscal(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaCuentaContable(List<CuentaContable> cuentacontablesForeignKey)throws Exception{
		TableColumn tableColumnCuentaContable=this.jTableDatosCuentaCreditoFiscal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaCreditoFiscal,CuentaCreditoFiscalConstantesFunciones.LABEL_IDCUENTACONTABLE));
		TableCellEditor tableCellEditorCuentaContable =tableColumnCuentaContable.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContable;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontablesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCuentaCreditoFiscal.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cuentacontableTableCellFk.setRowActual(intSelectedRow);
			//cuentacontableTableCellFk.setcuentacontablesForeignKeyActual(cuentacontablesForeignKey);
		//}


		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.RecargarCuentaContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarCuentaCreditoFiscalActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacreditofiscalLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCuentaCreditoFiscal(false);
			
			//if(!this.isEsNuevoCuentaCreditoFiscal) {								
				int intSelectedRow = this.jTableDatosCuentaCreditoFiscal.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacreditofiscal =(CuentaCreditoFiscal) this.cuentacreditofiscalLogic.getCuentaCreditoFiscals().toArray()[this.jTableDatosCuentaCreditoFiscal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cuentacreditofiscal =(CuentaCreditoFiscal) this.cuentacreditofiscals.toArray()[this.jTableDatosCuentaCreditoFiscal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CuentaCreditoFiscalJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCuentaCreditoFiscal(this.cuentacreditofiscal,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCuentaCreditoFiscal(this.cuentacreditofiscal);
				
			}
			
			if(this.permiteMantenimiento(this.cuentacreditofiscal)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCuentaCreditoFiscal=true;
					this.inicializarActualizarBindingTablaCuentaCreditoFiscal(false);
					this.isEsNuevoCuentaCreditoFiscal=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCuentaCreditoFiscal=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCuentaCreditoFiscal=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCuentaCreditoFiscal(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCuentaCreditoFiscal(false);
				
				this.habilitarDeshabilitarControlesCuentaCreditoFiscal(false);
			
												
				
				if(CuentaCreditoFiscalJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCuentaCreditoFiscal();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCuentaCreditoFiscalActionPerformed(evt,cuentacreditofiscalSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCuentaCreditoFiscal(this.cuentacreditofiscal,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCuentaCreditoFiscal.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,cuentacreditofiscalSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacreditofiscalLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.cuentacreditofiscal.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(CuentaCreditoFiscal.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaCreditoFiscal.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacreditofiscalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacreditofiscalLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCuentaCreditoFiscalActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacreditofiscalLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCuentaCreditoFiscal.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacreditofiscal =(CuentaCreditoFiscal) this.cuentacreditofiscalLogic.getCuentaCreditoFiscals().toArray()[this.jTableDatosCuentaCreditoFiscal.convertRowIndexToModel(intSelectedRow)];
				this.cuentacreditofiscal.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cuentacreditofiscal =(CuentaCreditoFiscal) this.cuentacreditofiscals.toArray()[this.jTableDatosCuentaCreditoFiscal.convertRowIndexToModel(intSelectedRow)];
				this.cuentacreditofiscal.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.cuentacreditofiscal)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CuentaCreditoFiscalModel) this.jTableDatosCuentaCreditoFiscal.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCuentaCreditoFiscal=true;
				this.inicializarActualizarBindingTablaCuentaCreditoFiscal(false);
				this.isEsNuevoCuentaCreditoFiscal=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCuentaCreditoFiscal(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCuentaCreditoFiscal(false);
				
				this.habilitarDeshabilitarControlesCuentaCreditoFiscal(false);
				
				
				
				if(CuentaCreditoFiscalJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCuentaCreditoFiscal();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacreditofiscalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacreditofiscalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacreditofiscalLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCuentaCreditoFiscalActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCuentaCreditoFiscal.getRowCount()>=1) {
				jTableDatosCuentaCreditoFiscal.removeRowSelectionInterval(0, jTableDatosCuentaCreditoFiscal.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCuentaCreditoFiscal(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCuentaCreditoFiscal(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCuentaCreditoFiscal(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCuentaCreditoFiscal(false) ;
			
			this.isEsNuevoCuentaCreditoFiscal=false;
			
			if(CuentaCreditoFiscalJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCuentaCreditoFiscal();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCuentaCreditoFiscalActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacreditofiscalLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCuentaCreditoFiscal(false);
				
				//SI ES MANUAL
				if(CuentaCreditoFiscalJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCuentaCreditoFiscal();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacreditofiscalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacreditofiscalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacreditofiscalLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCuentaCreditoFiscalActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCuentaCreditoFiscal--;			
			//CuentaCreditoFiscal cuentacreditofiscalAux= new CuentaCreditoFiscal();			
			//cuentacreditofiscalAux.setId(this.iIdNuevoCuentaCreditoFiscal);
			
			if(this.jInternalFrameDetalleFormCuentaCreditoFiscal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCuentaCreditoFiscal();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCuentaCreditoFiscal(this.cuentacreditofiscal);
			
			this.cuentacreditofiscal.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.cuentacreditofiscalLogic.getCuentaCreditoFiscals().add(this.cuentacreditofiscalAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.cuentacreditofiscals.add(this.cuentacreditofiscalAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCuentaCreditoFiscal(false);
			
			this.jTableDatosCuentaCreditoFiscal.setRowSelectionInterval(this.getIndiceNuevoCuentaCreditoFiscal(), this.getIndiceNuevoCuentaCreditoFiscal());
			
			int iLastRow =  this.jTableDatosCuentaCreditoFiscal.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCuentaCreditoFiscal.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCuentaCreditoFiscal.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCuentaCreditoFiscal(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCuentaCreditoFiscalActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacreditofiscalLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCuentaCreditoFiscal(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCuentaCreditoFiscal(false);
			
			//SI ES MANUAL
			if(CuentaCreditoFiscalJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCuentaCreditoFiscal();
			}
			
			//this.abrirFrameTreeCuentaCreditoFiscal();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacreditofiscalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacreditofiscalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacreditofiscalLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCuentaCreditoFiscalActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Cuenta Credito FiscalES ?", "MANTENIMIENTO DE Cuenta Credito Fiscal", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionCuentaCreditoFiscal.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralCuentaCreditoFiscal();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.cuentacreditofiscalReturnGeneral=cuentacreditofiscalLogic.procesarImportacionCuentaCreditoFiscalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.cuentacreditofiscalParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarCuentaCreditoFiscalReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCuentaCreditoFiscalActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCuentaCreditoFiscal.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCuentaCreditoFiscal.setFileImportacion(this.jInternalFrameImportacionCuentaCreditoFiscal.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCuentaCreditoFiscal.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCuentaCreditoFiscal.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCuentaCreditoFiscal.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCuentaCreditoFiscal.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCuentaCreditoFiscalActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<CuentaCreditoFiscal> cuentacreditofiscalsSeleccionados=new ArrayList<CuentaCreditoFiscal>();		

		cuentacreditofiscalsSeleccionados=this.getCuentaCreditoFiscalsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCuentaCreditoFiscal.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCuentaCreditoFiscal.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CuentaCreditoFiscalBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CuentaCreditoFiscalBaseDesign.jrxml";
			
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
			
			this.generarReporteCuentaCreditoFiscals("Todos",cuentacreditofiscalsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Credito Fiscal",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoCuentaCreditoFiscal.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCuentaCreditoFiscal.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CuentaCreditoFiscalConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CuentaCreditoFiscalConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CuentaContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CuentaContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CuentaContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CuentaContable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CuentaCreditoFiscalConstantesFunciones.LABEL_ESTAACTIVO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_taActivo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_taActivo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_taActivo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_taActivo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoCuentaCreditoFiscal.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCuentaCreditoFiscal.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCuentaCreditoFiscal.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CuentaCreditoFiscalConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case CuentaCreditoFiscalConstantesFunciones.LABEL_IDCUENTACONTABLE:
					sNombreCampoCategoria="id_cuenta_contable";
					break;

				case CuentaCreditoFiscalConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoria="esta_activo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCuentaCreditoFiscal.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CuentaCreditoFiscalConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case CuentaCreditoFiscalConstantesFunciones.LABEL_IDCUENTACONTABLE:
					sNombreCampoCategoriaValor="id_cuenta_contable";
					break;

				case CuentaCreditoFiscalConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoriaValor="esta_activo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCuentaCreditoFiscal.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCuentaCreditoFiscal.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CuentaCreditoFiscalConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case CuentaCreditoFiscalConstantesFunciones.LABEL_IDCUENTACONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cuenta Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cuenta_contable");
					break;

				case CuentaCreditoFiscalConstantesFunciones.LABEL_ESTAACTIVO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Esta Activo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"esta_activo");
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
	
	public void jButtonGenerarExcelReporteDinamicoCuentaCreditoFiscalActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<CuentaCreditoFiscal> cuentacreditofiscalsSeleccionados=new ArrayList<CuentaCreditoFiscal>();		
		
		cuentacreditofiscalsSeleccionados=this.getCuentaCreditoFiscalsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cuentacreditofiscal";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("CuentaCreditoFiscals");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCuentaCreditoFiscal.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCuentaCreditoFiscal.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CuentaCreditoFiscalConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuentaCreditoFiscalConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(CuentaCreditoFiscal cuentacreditofiscal:cuentacreditofiscalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuentacreditofiscal.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CuentaCreditoFiscalConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuentaCreditoFiscalConstantesFunciones.LABEL_IDCUENTACONTABLE);
					iRow++;

					for(CuentaCreditoFiscal cuentacreditofiscal:cuentacreditofiscalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuentacreditofiscal.getcuentacontable_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CuentaCreditoFiscalConstantesFunciones.LABEL_ESTAACTIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CuentaCreditoFiscalConstantesFunciones.LABEL_ESTAACTIVO);
					iRow++;

					for(CuentaCreditoFiscal cuentacreditofiscal:cuentacreditofiscalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cuentacreditofiscal.getesta_activo());
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
			//	this.getFilaCabeceraExportarExcelCuentaCreditoFiscal(row);				
			//	iRow++;
			//}				
			
			//for(CuentaCreditoFiscal cuentacreditofiscalAux:cuentacreditofiscalsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCuentaCreditoFiscal(cuentacreditofiscalAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Credito Fiscal",JOptionPane.INFORMATION_MESSAGE);
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
				this.cuentacreditofiscalLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCuentaCreditoFiscal(false);
			
			//SI ES MANUAL
			if(CuentaCreditoFiscalJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCuentaCreditoFiscal();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacreditofiscalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacreditofiscalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacreditofiscalLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCuentaCreditoFiscalActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacreditofiscalLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCuentaCreditoFiscal(false);
			
			//SI ES MANUAL
			if(CuentaCreditoFiscalJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCuentaCreditoFiscal();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacreditofiscalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacreditofiscalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacreditofiscalLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCuentaCreditoFiscalActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacreditofiscalLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCuentaCreditoFiscal(false);
			
			//SI ES MANUAL
			if(CuentaCreditoFiscalJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCuentaCreditoFiscal();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacreditofiscalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacreditofiscalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacreditofiscalLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCuentaCreditoFiscal() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCuentaCreditoFiscal.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCuentaCreditoFiscal.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCuentaCreditoFiscal.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCuentaCreditoFiscal.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCuentaCreditoFiscal.setMinimumSize(dimensionMinimum);
		this.jTableDatosCuentaCreditoFiscal.setMaximumSize(dimensionMaximum);
		this.jTableDatosCuentaCreditoFiscal.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCuentaCreditoFiscal(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCuentaCreditoFiscal(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCuentaCreditoFiscal(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCuentaCreditoFiscal(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCuentaCreditoFiscal(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCuentaCreditoFiscal(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCuentaCreditoFiscal(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCuentaCreditoFiscal(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CuentaCreditoFiscalJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CuentaCreditoFiscalJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCuentaCreditoFiscal() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCuentaCreditoFiscal();
		
		this.inicializarActualizarBindingBotonesManualCuentaCreditoFiscal(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCuentaCreditoFiscal();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCuentaCreditoFiscal() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCuentaCreditoFiscal(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCuentaCreditoFiscal(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCuentaCreditoFiscal.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCuentaCreditoFiscal.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCuentaCreditoFiscal.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCuentaCreditoFiscal!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCuentaCreditoFiscal.jCheckBoxPostAccionNuevoCuentaCreditoFiscal.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCuentaCreditoFiscal.jCheckBoxPostAccionSinCerrarCuentaCreditoFiscal.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCuentaCreditoFiscal.jCheckBoxPostAccionSinMensajeCuentaCreditoFiscal.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCuentaCreditoFiscal.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCuentaCreditoFiscal.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCuentaCreditoFiscal.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCuentaCreditoFiscal!=null) {
				this.jInternalFrameDetalleFormCuentaCreditoFiscal.jCheckBoxPostAccionNuevoCuentaCreditoFiscal.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCuentaCreditoFiscal.jCheckBoxPostAccionSinCerrarCuentaCreditoFiscal.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCuentaCreditoFiscal.jCheckBoxPostAccionSinMensajeCuentaCreditoFiscal.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCuentaCreditoFiscal.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCuentaCreditoFiscal.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCuentaCreditoFiscal!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCuentaCreditoFiscal.jComboBoxTiposAccionesFormularioCuentaCreditoFiscal.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCuentaCreditoFiscal.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCuentaCreditoFiscal!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCuentaCreditoFiscal.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCuentaCreditoFiscal.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCuentaCreditoFiscal.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCuentaCreditoFiscal.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCuentaCreditoFiscal.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCuentaCreditoFiscal!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCuentaCreditoFiscal.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCuentaCreditoFiscal.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCuentaCreditoFiscal.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCuentaCreditoFiscal(Boolean esInicializar) throws Exception {
		try	{	
			if(CuentaCreditoFiscalJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCuentaCreditoFiscal(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCuentaCreditoFiscal() throws Exception {
		try	{
			if(CuentaCreditoFiscalJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCuentaCreditoFiscal();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCuentaCreditoFiscal() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.jComboBoxTiposAccionesFormularioCuentaCreditoFiscal.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCuentaCreditoFiscal.jComboBoxTiposAccionesFormularioCuentaCreditoFiscal.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCuentaCreditoFiscal() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCuentaCreditoFiscal.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCuentaCreditoFiscal.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCuentaCreditoFiscal.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCuentaCreditoFiscal.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCuentaCreditoFiscal.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCuentaCreditoFiscal.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCuentaCreditoFiscal.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCuentaCreditoFiscal.addItem(reporte);
			}
			
			
			if(!this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCuentaCreditoFiscal.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCuentaCreditoFiscal.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCuentaCreditoFiscal.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCuentaCreditoFiscal.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCuentaCreditoFiscal.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCuentaCreditoFiscal.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCuentaCreditoFiscal!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCuentaCreditoFiscal.jComboBoxTiposAccionesFormularioCuentaCreditoFiscal.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCuentaCreditoFiscal.jComboBoxTiposAccionesFormularioCuentaCreditoFiscal.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCuentaCreditoFiscal.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCuentaCreditoFiscal.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCuentaCreditoFiscal.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCuentaCreditoFiscal();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCuentaCreditoFiscal() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCuentaCreditoFiscal!=null) {
				this.jInternalFrameReporteDinamicoCuentaCreditoFiscal.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCuentaCreditoFiscal.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCuentaCreditoFiscal!=null) {
				this.jInternalFrameReporteDinamicoCuentaCreditoFiscal.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCuentaCreditoFiscal.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCuentaCreditoFiscal!=null) {
				
				if(this.jInternalFrameReporteDinamicoCuentaCreditoFiscal.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCuentaCreditoFiscal.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCuentaCreditoFiscal.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCuentaCreditoFiscal.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCuentaCreditoFiscal.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCuentaCreditoFiscal.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCuentaCreditoFiscal()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaCreditoFiscal.getSelectedItem()!=null){this.id_cuenta_contableFK_IdCuentaContable=((CuentaContable)this.jComboBoxid_cuenta_contableFK_IdCuentaContableCuentaCreditoFiscal.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCuentaCreditoFiscal(Boolean esInicializar) throws Exception {				
		if(CuentaCreditoFiscalJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCuentaCreditoFiscal();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCuentaCreditoFiscal() throws Exception {
		this.inicializarActualizarBindingTablaCuentaCreditoFiscal(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCuentaCreditoFiscal() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCuentaCreditoFiscal.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCuentaCreditoFiscal.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCuentaCreditoFiscal.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CuentaCreditoFiscalPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCuentaCreditoFiscal.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCuentaCreditoFiscal.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CuentaCreditoFiscalPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCuentaCreditoFiscalOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaCreditoFiscalOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CuentaCreditoFiscalPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCuentaCreditoFiscal.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCuentaCreditoFiscal.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CuentaCreditoFiscalPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCuentaCreditoFiscal.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCuentaCreditoFiscal(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=cuentacreditofiscalLogic.getCuentaCreditoFiscals().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=cuentacreditofiscals.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CuentaCreditoFiscalJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCuentaCreditoFiscal.setModel(new CuentaCreditoFiscalModel(this.cuentacreditofiscalLogic.getCuentaCreditoFiscals(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCuentaCreditoFiscal.setModel(new CuentaCreditoFiscalModel(this.cuentacreditofiscals,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCuentaCreditoFiscal!=null && this.jInternalFrameOrderByCuentaCreditoFiscal.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCuentaCreditoFiscal();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCuentaCreditoFiscal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaCreditoFiscal,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CuentaCreditoFiscalPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CuentaCreditoFiscalConstantesFunciones.SCLASSWEBTITULO,cuentacreditofiscalConstantesFunciones.resaltarSeleccionarCuentaCreditoFiscal,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CuentaCreditoFiscalConstantesFunciones.SCLASSWEBTITULO,cuentacreditofiscalConstantesFunciones.resaltarSeleccionarCuentaCreditoFiscal,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCuentaCreditoFiscal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaCreditoFiscal,CuentaCreditoFiscalConstantesFunciones.LABEL_ID));

		if(this.cuentacreditofiscalConstantesFunciones.mostraridCuentaCreditoFiscal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuentaCreditoFiscalConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cuentacreditofiscalConstantesFunciones.resaltaridCuentaCreditoFiscal,this.cuentacreditofiscalConstantesFunciones.activaridCuentaCreditoFiscal,this,true,"idCuentaCreditoFiscal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cuentacreditofiscalConstantesFunciones.resaltaridCuentaCreditoFiscal,this.cuentacreditofiscalConstantesFunciones.activaridCuentaCreditoFiscal,this,true,"idCuentaCreditoFiscal","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuentaCreditoFiscal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaCreditoFiscal,CuentaCreditoFiscalConstantesFunciones.LABEL_IDEMPRESA));

		if(this.cuentacreditofiscalConstantesFunciones.mostrarid_empresaCuentaCreditoFiscal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuentaCreditoFiscalConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.cuentacreditofiscalConstantesFunciones.resaltarid_empresaCuentaCreditoFiscal,this,this.cuentacreditofiscalConstantesFunciones.activarid_empresaCuentaCreditoFiscal));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.cuentacreditofiscalConstantesFunciones.resaltarid_empresaCuentaCreditoFiscal,this,this.cuentacreditofiscalConstantesFunciones.activarid_empresaCuentaCreditoFiscal,false,"id_empresaCuentaCreditoFiscal","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CuentaCreditoFiscalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuentaCreditoFiscal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaCreditoFiscal,CuentaCreditoFiscalConstantesFunciones.LABEL_IDCUENTACONTABLE));

		if(this.cuentacreditofiscalConstantesFunciones.mostrarid_cuenta_contableCuentaCreditoFiscal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuentaCreditoFiscalConstantesFunciones.LABEL_IDCUENTACONTABLE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CuentaContableTableCell(this.cuentacontablesForeignKey,this.cuentacreditofiscalConstantesFunciones.resaltarid_cuenta_contableCuentaCreditoFiscal,this,this.cuentacreditofiscalConstantesFunciones.activarid_cuenta_contableCuentaCreditoFiscal));
			tableColumn.setCellEditor(new CuentaContableTableCell(this.cuentacontablesForeignKey,this.cuentacreditofiscalConstantesFunciones.resaltarid_cuenta_contableCuentaCreditoFiscal,this,this.cuentacreditofiscalConstantesFunciones.activarid_cuenta_contableCuentaCreditoFiscal,true,"id_cuenta_contableCuentaCreditoFiscal","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70);
			//tableColumn.addPropertyChangeListener(new CuentaCreditoFiscalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCuentaCreditoFiscal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCuentaCreditoFiscal,CuentaCreditoFiscalConstantesFunciones.LABEL_ESTAACTIVO));

		if(this.cuentacreditofiscalConstantesFunciones.mostraresta_activoCuentaCreditoFiscal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CuentaCreditoFiscalConstantesFunciones.LABEL_ESTAACTIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.cuentacreditofiscalConstantesFunciones.resaltaresta_activoCuentaCreditoFiscal,this.cuentacreditofiscalConstantesFunciones.activaresta_activoCuentaCreditoFiscal));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.cuentacreditofiscalConstantesFunciones.resaltaresta_activoCuentaCreditoFiscal,this.cuentacreditofiscalConstantesFunciones.activaresta_activoCuentaCreditoFiscal,this,true,"esta_activoCuentaCreditoFiscal","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CuentaCreditoFiscalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCuentaCreditoFiscal.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCuentaCreditoFiscal.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCuentaCreditoFiscal && this.isPermisoGuardarCambiosCuentaCreditoFiscal) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCuentaCreditoFiscal.addColumn(tableColumn);
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
			
			this.jTableDatosCuentaCreditoFiscal.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCuentaCreditoFiscal && this.isPermisoGuardarCambiosCuentaCreditoFiscal) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCuentaCreditoFiscal && this.isPermisoGuardarCambiosCuentaCreditoFiscal) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCuentaCreditoFiscal.moveColumn(this.jTableDatosCuentaCreditoFiscal.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCuentaCreditoFiscal.moveColumn(this.jTableDatosCuentaCreditoFiscal.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCuentaCreditoFiscal.moveColumn(this.jTableDatosCuentaCreditoFiscal.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCuentaCreditoFiscal.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCuentaCreditoFiscal.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCuentaCreditoFiscal,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CuentaCreditoFiscalJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCuentaCreditoFiscal.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCuentaCreditoFiscal.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CuentaCreditoFiscalJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CuentaCreditoFiscalJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCuentaCreditoFiscal.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCuentaCreditoFiscal.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCuentaCreditoFiscal.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=cuentacreditofiscalLogic.getCuentaCreditoFiscals().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=cuentacreditofiscals.size()-1;
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
		//this.jTableDatosCuentaCreditoFiscal.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCuentaCreditoFiscal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCuentaCreditoFiscal();
			
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
				
				//this.isEsNuevoCuentaCreditoFiscal=false;
					
				CuentaCreditoFiscalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cuentacreditofiscal,new Object(),this.cuentacreditofiscalParameterGeneral,this.cuentacreditofiscalReturnGeneral);
			
				if(this.cuentacreditofiscalSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCuentaCreditoFiscal==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCuentaCreditoFiscal.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCuentaCreditoFiscal.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacreditofiscal =(CuentaCreditoFiscal) this.cuentacreditofiscalLogic.getCuentaCreditoFiscals().toArray()[this.jTableDatosCuentaCreditoFiscal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuentacreditofiscal =(CuentaCreditoFiscal) this.cuentacreditofiscals.toArray()[this.jTableDatosCuentaCreditoFiscal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.cuentacreditofiscal.getsType().equals("DUPLICADO")
				   || this.cuentacreditofiscal.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCuentaCreditoFiscal=true;
				
				} else {
					this.isEsNuevoCuentaCreditoFiscal=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado()) {
					if(this.cuentacreditofiscal.getId()>=0 && !this.cuentacreditofiscal.getIsNew()) {						
						this.isEsNuevoCuentaCreditoFiscal=false;
						
					} else {
						this.isEsNuevoCuentaCreditoFiscal=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCuentaCreditoFiscal(esRelaciones);						
				
				this.seleccionarCuentaCreditoFiscal(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.cuentacreditofiscal.getId()<0) {
					this.isEsNuevoCuentaCreditoFiscal=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCuentaCreditoFiscal(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCuentaCreditoFiscal(evt,rowIndex);
				}	
				
				if(this.cuentacreditofiscalSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion CuentaCreditoFiscal: " + this.dDif); 
					}
				}								
				
				CuentaCreditoFiscalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cuentacreditofiscal,new Object(),this.cuentacreditofiscalParameterGeneral,this.cuentacreditofiscalReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCuentaCreditoFiscal(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.cuentacreditofiscal)) {
					if(this.cuentacreditofiscal.getId()>0) {
						this.cuentacreditofiscal.setIsDeleted(true);
						
						this.cuentacreditofiscalsEliminados.add(this.cuentacreditofiscal);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cuentacreditofiscalLogic.getCuentaCreditoFiscals().remove(this.cuentacreditofiscal);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cuentacreditofiscals.remove(this.cuentacreditofiscal);				
					}
					
					
					((CuentaCreditoFiscalModel) this.jTableDatosCuentaCreditoFiscal.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCuentaCreditoFiscal(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCuentaCreditoFiscal(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCuentaCreditoFiscal) {
			
			if(this.jInternalFrameDetalleFormCuentaCreditoFiscal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCuentaCreditoFiscal.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCuentaCreditoFiscal.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacreditofiscal =(CuentaCreditoFiscal) this.cuentacreditofiscalLogic.getCuentaCreditoFiscals().toArray()[this.jTableDatosCuentaCreditoFiscal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuentacreditofiscal =(CuentaCreditoFiscal) this.cuentacreditofiscals.toArray()[this.jTableDatosCuentaCreditoFiscal.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CuentaCreditoFiscalJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCuentaCreditoFiscal(this.cuentacreditofiscal);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.cuentacreditofiscalConstantesFunciones.cargarid_empresaCuentaCreditoFiscal || this.cuentacreditofiscalConstantesFunciones.event_dependid_empresaCuentaCreditoFiscal) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.cuentacreditofiscal.getid_empresa());
									//this.inicializarActualizarBindingCuentaCreditoFiscal(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(cuentacreditofiscal.getEmpresa()!=null) {
							this.empresasForeignKey.add(cuentacreditofiscal.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.cuentacreditofiscal.getid_empresa(),false,"Formulario");

					//CuentaContable
					if(!this.cuentacreditofiscalConstantesFunciones.cargarid_cuenta_contableCuentaCreditoFiscal || this.cuentacreditofiscalConstantesFunciones.event_dependid_cuenta_contableCuentaCreditoFiscal) {
						//this.cargarCombosCuentaContablesForeignKeyLista(" where id="+this.cuentacreditofiscal.getid_cuenta_contable());
									//this.inicializarActualizarBindingCuentaCreditoFiscal(false,false);
						this.cuentacontablesForeignKey=new ArrayList<CuentaContable>();

						if(cuentacreditofiscal.getCuentaContable()!=null) {
							this.cuentacontablesForeignKey.add(cuentacreditofiscal.getCuentaContable());
						}

						this.addItemDefectoCombosForeignKeyCuentaContable();
						this.cargarCombosFrameCuentaContablesForeignKey("Todos");
					}
					this.setActualCuentaContableForeignKey(this.cuentacreditofiscal.getid_cuenta_contable(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCuentaCreditoFiscal("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCuentaCreditoFiscal(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCuentaCreditoFiscal() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCuentaCreditoFiscal(CuentaCreditoFiscal cuentacreditofiscal) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCuentaCreditoFiscal(cuentacreditofiscal,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCuentaCreditoFiscal(CuentaCreditoFiscal cuentacreditofiscal,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCuentaCreditoFiscal(cuentacreditofiscal);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCuentaCreditoFiscal(cuentacreditofiscal,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCuentaCreditoFiscal(cuentacreditofiscal);
	}
	
	public void setVariablesObjetoActualToFormularioCuentaCreditoFiscal(CuentaCreditoFiscal cuentacreditofiscal) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCuentaCreditoFiscal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCuentaCreditoFiscal.jLabelidCuentaCreditoFiscal.setText(cuentacreditofiscal.getId().toString());
			this.jInternalFrameDetalleFormCuentaCreditoFiscal.jCheckBoxesta_activoCuentaCreditoFiscal.setSelected(cuentacreditofiscal.getesta_activo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,CuentaCreditoFiscal cuentacreditofiscalLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,cuentacreditofiscalLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,CuentaCreditoFiscal cuentacreditofiscalLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				cuentacreditofiscalLocal=this.cuentacreditofiscal;
			} else {
				cuentacreditofiscalLocal=this.cuentacreditofiscalAnterior;
			}
		}
		
		if(this.permiteMantenimiento(cuentacreditofiscalLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCuentaCreditoFiscal(cuentacreditofiscalLocal,true);
					
					if(cuentacreditofiscalSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(cuentacreditofiscalLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(cuentacreditofiscalLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCuentaCreditoFiscal(CuentaCreditoFiscal cuentacreditofiscal,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCuentaCreditoFiscal(cuentacreditofiscal,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCuentaCreditoFiscal(cuentacreditofiscal);
	}
	
	public void setVariablesFormularioToObjetoActualCuentaCreditoFiscal(CuentaCreditoFiscal cuentacreditofiscal,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCuentaCreditoFiscal(cuentacreditofiscal,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCuentaCreditoFiscal(CuentaCreditoFiscal cuentacreditofiscal,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCuentaCreditoFiscal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormCuentaCreditoFiscal.jLabelidCuentaCreditoFiscal.getText()==null || this.jInternalFrameDetalleFormCuentaCreditoFiscal.jLabelidCuentaCreditoFiscal.getText()=="" || this.jInternalFrameDetalleFormCuentaCreditoFiscal.jLabelidCuentaCreditoFiscal.getText()=="Id") {
				this.jInternalFrameDetalleFormCuentaCreditoFiscal.jLabelidCuentaCreditoFiscal.setText("0");
			}

			if(conColumnasBase) {cuentacreditofiscal.setId(Long.parseLong(this.jInternalFrameDetalleFormCuentaCreditoFiscal.jLabelidCuentaCreditoFiscal.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CuentaCreditoFiscalConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaCreditoFiscal.jLabelIdCuentaCreditoFiscal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cuentacreditofiscal.setesta_activo(this.jInternalFrameDetalleFormCuentaCreditoFiscal.jCheckBoxesta_activoCuentaCreditoFiscal.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CuentaCreditoFiscalConstantesFunciones.LABEL_ESTAACTIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCuentaCreditoFiscal.jLabelesta_activoCuentaCreditoFiscal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCuentaCreditoFiscal(CuentaCreditoFiscal cuentacreditofiscalBean,CuentaCreditoFiscal cuentacreditofiscal,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && cuentacreditofiscalBean.getid_cuenta_contable()!=null && !cuentacreditofiscalBean.getid_cuenta_contable().equals(-1L))) {cuentacreditofiscal.setid_cuenta_contable(cuentacreditofiscalBean.getid_cuenta_contable());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCuentaCreditoFiscal(CuentaCreditoFiscal cuentacreditofiscalOrigen,CuentaCreditoFiscal cuentacreditofiscal,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cuentacreditofiscalOrigen.getId()!=null && !cuentacreditofiscalOrigen.getId().equals(0L))) {cuentacreditofiscal.setId(cuentacreditofiscalOrigen.getId());}}
			if(conDefault || (!conDefault && cuentacreditofiscalOrigen.getid_cuenta_contable()!=null && !cuentacreditofiscalOrigen.getid_cuenta_contable().equals(-1L))) {cuentacreditofiscal.setid_cuenta_contable(cuentacreditofiscalOrigen.getid_cuenta_contable());}
			if(conDefault || (!conDefault && cuentacreditofiscalOrigen.getesta_activo()!=null && !cuentacreditofiscalOrigen.getesta_activo().equals(false))) {cuentacreditofiscal.setesta_activo(cuentacreditofiscalOrigen.getesta_activo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCuentaCreditoFiscal(CuentaCreditoFiscal cuentacreditofiscal) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCuentaCreditoFiscal.jLabelidCuentaCreditoFiscal.setText(cuentacreditofiscal.getId().toString());
			this.jInternalFrameDetalleFormCuentaCreditoFiscal.jCheckBoxesta_activoCuentaCreditoFiscal.setSelected(cuentacreditofiscal.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCuentaCreditoFiscal(CuentaCreditoFiscalBean cuentacreditofiscalBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCuentaCreditoFiscal.jLabelidCuentaCreditoFiscal.setText(cuentacreditofiscalBean.getId().toString());
			this.jInternalFrameDetalleFormCuentaCreditoFiscal.jCheckBoxesta_activoCuentaCreditoFiscal.setSelected(cuentacreditofiscalBean.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCuentaCreditoFiscal(CuentaCreditoFiscalParameterReturnGeneral cuentacreditofiscalReturnGeneral,CuentaCreditoFiscalBean cuentacreditofiscalBean,Boolean conDefault) throws Exception { 
		try {
			CuentaCreditoFiscal cuentacreditofiscalLocal=new CuentaCreditoFiscal();
			
			cuentacreditofiscalLocal=cuentacreditofiscalReturnGeneral.getCuentaCreditoFiscal();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cuentacreditofiscalLocal.getId()!=null && !cuentacreditofiscalLocal.getId().equals(0L))) {cuentacreditofiscalBean.setId(cuentacreditofiscalLocal.getId());}}
			if(conDefault || (!conDefault && cuentacreditofiscalLocal.getid_cuenta_contable()!=null && !cuentacreditofiscalLocal.getid_cuenta_contable().equals(-1L))) {cuentacreditofiscalBean.setid_cuenta_contable(cuentacreditofiscalLocal.getid_cuenta_contable());}
			if(conDefault || (!conDefault && cuentacreditofiscalLocal.getesta_activo()!=null && !cuentacreditofiscalLocal.getesta_activo().equals(false))) {cuentacreditofiscalBean.setesta_activo(cuentacreditofiscalLocal.getesta_activo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCuentaCreditoFiscalGenerico(Long idCuentaCreditoFiscalSeleccionado,JComboBox jComboBoxCuentaCreditoFiscal,List<CuentaCreditoFiscal> cuentacreditofiscalsLocal)throws Exception {
		try {
			CuentaCreditoFiscal  cuentacreditofiscalTemp=null;

			for(CuentaCreditoFiscal cuentacreditofiscalAux:cuentacreditofiscalsLocal) {
				if(cuentacreditofiscalAux.getId()!=null && cuentacreditofiscalAux.getId().equals(idCuentaCreditoFiscalSeleccionado)) {
					cuentacreditofiscalTemp=cuentacreditofiscalAux;
					break;
				}
			}

			jComboBoxCuentaCreditoFiscal.setSelectedItem(cuentacreditofiscalTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCuentaCreditoFiscalGenerico(JComboBox jComboBoxCuentaCreditoFiscal,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxCuentaCreditoFiscal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCuentaCreditoFiscal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCuentaCreditoFiscal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCuentaCreditoFiscal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCuentaCreditoFiscal.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCuentaCreditoFiscal.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCuentaCreditoFiscal.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCuentaCreditoFiscal.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCuentaCreditoFiscal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCuentaCreditoFiscal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cuentacreditofiscal=(CuentaCreditoFiscal) cuentacreditofiscalLogic.getCuentaCreditoFiscals().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cuentacreditofiscal =(CuentaCreditoFiscal) cuentacreditofiscals.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!cuentacreditofiscal.getIsNew() && !cuentacreditofiscal.getIsChanged() && !cuentacreditofiscal.getIsDeleted()) {
				sDescripcion=cuentacreditofiscal.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=cuentacreditofiscal.getempresa_descripcion();
			}
		}

		if(sTipo.equals("CuentaContable")) {
			//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
			if(!cuentacreditofiscal.getIsNew() && !cuentacreditofiscal.getIsChanged() && !cuentacreditofiscal.getIsDeleted()) {
				sDescripcion=cuentacreditofiscal.getcuentacontable_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
				sDescripcion=cuentacreditofiscal.getcuentacontable_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		CuentaCreditoFiscal cuentacreditofiscalRow=new CuentaCreditoFiscal();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cuentacreditofiscalRow=(CuentaCreditoFiscal) cuentacreditofiscalLogic.getCuentaCreditoFiscals().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cuentacreditofiscalRow=(CuentaCreditoFiscal) cuentacreditofiscals.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCuentaCreditoFiscal(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCuentaCreditoFiscal.setVisible((this.isVisibilidadCeldaNuevoCuentaCreditoFiscal && this.isPermisoNuevoCuentaCreditoFiscal));			
			this.jButtonDuplicarCuentaCreditoFiscal.setVisible((this.isVisibilidadCeldaDuplicarCuentaCreditoFiscal && this.isPermisoDuplicarCuentaCreditoFiscal));			
			this.jButtonCopiarCuentaCreditoFiscal.setVisible((this.isVisibilidadCeldaCopiarCuentaCreditoFiscal && this.isPermisoCopiarCuentaCreditoFiscal));
			this.jButtonVerFormCuentaCreditoFiscal.setVisible((this.isVisibilidadCeldaVerFormCuentaCreditoFiscal && this.isPermisoVerFormCuentaCreditoFiscal));
			
			this.jButtonAbrirOrderByCuentaCreditoFiscal.setVisible((this.isVisibilidadCeldaOrdenCuentaCreditoFiscal && this.isPermisoOrdenCuentaCreditoFiscal));			
			
			this.jButtonNuevoRelacionesCuentaCreditoFiscal.setVisible((this.isVisibilidadCeldaNuevoRelacionesCuentaCreditoFiscal && this.isPermisoNuevoCuentaCreditoFiscal));			
			this.jButtonNuevoGuardarCambiosCuentaCreditoFiscal.setVisible((this.isVisibilidadCeldaNuevoCuentaCreditoFiscal && this.isPermisoNuevoCuentaCreditoFiscal && this.isPermisoGuardarCambiosCuentaCreditoFiscal));
			
			if(this.jInternalFrameDetalleFormCuentaCreditoFiscal!=null) {
			this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonModificarCuentaCreditoFiscal.setVisible((this.isVisibilidadCeldaModificarCuentaCreditoFiscal && this.isPermisoActualizarCuentaCreditoFiscal));	
			this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonActualizarCuentaCreditoFiscal.setVisible((this.isVisibilidadCeldaActualizarCuentaCreditoFiscal && this.isPermisoActualizarCuentaCreditoFiscal));	
			this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonEliminarCuentaCreditoFiscal.setVisible((this.isVisibilidadCeldaEliminarCuentaCreditoFiscal && this.isPermisoEliminarCuentaCreditoFiscal));
			this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonCancelarCuentaCreditoFiscal.setVisible(this.isVisibilidadCeldaCancelarCuentaCreditoFiscal);							
			this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonGuardarCambiosCuentaCreditoFiscal.setVisible((this.isVisibilidadCeldaGuardarCuentaCreditoFiscal && this.isPermisoGuardarCambiosCuentaCreditoFiscal));			
			
			}
						
			this.jButtonGuardarCambiosTablaCuentaCreditoFiscal.setVisible((this.isVisibilidadCeldaGuardarCambiosCuentaCreditoFiscal && this.isPermisoGuardarCambiosCuentaCreditoFiscal));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCuentaCreditoFiscal.setVisible((this.isVisibilidadCeldaNuevoCuentaCreditoFiscal && this.isPermisoNuevoCuentaCreditoFiscal));						
			this.jButtonDuplicarToolBarCuentaCreditoFiscal.setVisible((this.isVisibilidadCeldaDuplicarCuentaCreditoFiscal && this.isPermisoDuplicarCuentaCreditoFiscal));						
			this.jButtonCopiarToolBarCuentaCreditoFiscal.setVisible((this.isVisibilidadCeldaCopiarCuentaCreditoFiscal && this.isPermisoCopiarCuentaCreditoFiscal));			
			this.jButtonVerFormToolBarCuentaCreditoFiscal.setVisible((this.isVisibilidadCeldaVerFormCuentaCreditoFiscal && this.isPermisoVerFormCuentaCreditoFiscal));			
			this.jButtonAbrirOrderByToolBarCuentaCreditoFiscal.setVisible((this.isVisibilidadCeldaOrdenCuentaCreditoFiscal && this.isPermisoOrdenCuentaCreditoFiscal));
			this.jButtonNuevoRelacionesToolBarCuentaCreditoFiscal.setVisible((this.isVisibilidadCeldaNuevoRelacionesCuentaCreditoFiscal && this.isPermisoNuevoCuentaCreditoFiscal));			
			this.jButtonNuevoGuardarCambiosToolBarCuentaCreditoFiscal.setVisible((this.isVisibilidadCeldaNuevoCuentaCreditoFiscal && this.isPermisoNuevoCuentaCreditoFiscal && this.isPermisoGuardarCambiosCuentaCreditoFiscal));			
			
			if(this.jInternalFrameDetalleFormCuentaCreditoFiscal!=null) {
			this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonModificarToolBarCuentaCreditoFiscal.setVisible((this.isVisibilidadCeldaModificarCuentaCreditoFiscal && this.isPermisoActualizarCuentaCreditoFiscal));	
			this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonActualizarToolBarCuentaCreditoFiscal.setVisible((this.isVisibilidadCeldaActualizarCuentaCreditoFiscal  && this.isPermisoActualizarCuentaCreditoFiscal));	
			this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonEliminarToolBarCuentaCreditoFiscal.setVisible((this.isVisibilidadCeldaEliminarCuentaCreditoFiscal && this.isPermisoEliminarCuentaCreditoFiscal));
			this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonCancelarToolBarCuentaCreditoFiscal.setVisible(this.isVisibilidadCeldaCancelarCuentaCreditoFiscal);				
			this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonGuardarCambiosToolBarCuentaCreditoFiscal.setVisible((this.isVisibilidadCeldaGuardarCuentaCreditoFiscal && this.isPermisoGuardarCambiosCuentaCreditoFiscal));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCuentaCreditoFiscal.setVisible((this.isVisibilidadCeldaGuardarCambiosCuentaCreditoFiscal && this.isPermisoGuardarCambiosCuentaCreditoFiscal));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCuentaCreditoFiscal.setVisible((this.isVisibilidadCeldaNuevoCuentaCreditoFiscal && this.isPermisoNuevoCuentaCreditoFiscal));			
			this.jMenuItemDuplicarCuentaCreditoFiscal.setVisible((this.isVisibilidadCeldaDuplicarCuentaCreditoFiscal && this.isPermisoDuplicarCuentaCreditoFiscal));			
			this.jMenuItemCopiarCuentaCreditoFiscal.setVisible((this.isVisibilidadCeldaCopiarCuentaCreditoFiscal && this.isPermisoCopiarCuentaCreditoFiscal));			
			this.jMenuItemVerFormCuentaCreditoFiscal.setVisible((this.isVisibilidadCeldaVerFormCuentaCreditoFiscal && this.isPermisoVerFormCuentaCreditoFiscal));			
			this.jMenuItemAbrirOrderByCuentaCreditoFiscal.setVisible((this.isVisibilidadCeldaOrdenCuentaCreditoFiscal && this.isPermisoOrdenCuentaCreditoFiscal));			
			//this.jMenuItemMostrarOcultarCuentaCreditoFiscal.setVisible((this.isVisibilidadCeldaOrdenCuentaCreditoFiscal && this.isPermisoOrdenCuentaCreditoFiscal));
			this.jMenuItemDetalleAbrirOrderByCuentaCreditoFiscal.setVisible((this.isVisibilidadCeldaOrdenCuentaCreditoFiscal && this.isPermisoOrdenCuentaCreditoFiscal));			
			//this.jMenuItemDetalleMostrarOcultarCuentaCreditoFiscal.setVisible((this.isVisibilidadCeldaOrdenCuentaCreditoFiscal && this.isPermisoOrdenCuentaCreditoFiscal));			
			this.jMenuItemNuevoRelacionesCuentaCreditoFiscal.setVisible((this.isVisibilidadCeldaNuevoRelacionesCuentaCreditoFiscal && this.isPermisoNuevoCuentaCreditoFiscal));			
			this.jMenuItemNuevoGuardarCambiosCuentaCreditoFiscal.setVisible((this.isVisibilidadCeldaNuevoCuentaCreditoFiscal && this.isPermisoNuevoCuentaCreditoFiscal && this.isPermisoGuardarCambiosCuentaCreditoFiscal));									
			
			if(this.jInternalFrameDetalleFormCuentaCreditoFiscal!=null) {
			this.jInternalFrameDetalleFormCuentaCreditoFiscal.jMenuItemModificarCuentaCreditoFiscal.setVisible((this.isVisibilidadCeldaModificarCuentaCreditoFiscal && this.isPermisoActualizarCuentaCreditoFiscal));	
			this.jInternalFrameDetalleFormCuentaCreditoFiscal.jMenuItemActualizarCuentaCreditoFiscal.setVisible((this.isVisibilidadCeldaActualizarCuentaCreditoFiscal && this.isPermisoActualizarCuentaCreditoFiscal));	
			this.jInternalFrameDetalleFormCuentaCreditoFiscal.jMenuItemEliminarCuentaCreditoFiscal.setVisible((this.isVisibilidadCeldaEliminarCuentaCreditoFiscal && this.isPermisoEliminarCuentaCreditoFiscal));
			this.jInternalFrameDetalleFormCuentaCreditoFiscal.jMenuItemCancelarCuentaCreditoFiscal.setVisible(this.isVisibilidadCeldaCancelarCuentaCreditoFiscal);				
			}
			
			this.jMenuItemGuardarCambiosCuentaCreditoFiscal.setVisible((this.isVisibilidadCeldaGuardarCuentaCreditoFiscal && this.isPermisoGuardarCambiosCuentaCreditoFiscal));						
			this.jMenuItemGuardarCambiosTablaCuentaCreditoFiscal.setVisible((this.isVisibilidadCeldaGuardarCambiosCuentaCreditoFiscal && this.isPermisoGuardarCambiosCuentaCreditoFiscal));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCuentaCreditoFiscal=this.jButtonNuevoCuentaCreditoFiscal.isVisible();
			this.isVisibilidadCeldaDuplicarCuentaCreditoFiscal=this.jButtonDuplicarCuentaCreditoFiscal.isVisible();
			this.isVisibilidadCeldaCopiarCuentaCreditoFiscal=this.jButtonCopiarCuentaCreditoFiscal.isVisible();
			this.isVisibilidadCeldaVerFormCuentaCreditoFiscal=this.jButtonVerFormCuentaCreditoFiscal.isVisible();
			
			this.isVisibilidadCeldaOrdenCuentaCreditoFiscal=this.jButtonAbrirOrderByCuentaCreditoFiscal.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCuentaCreditoFiscal=this.jButtonNuevoRelacionesCuentaCreditoFiscal.isVisible();
			this.isVisibilidadCeldaModificarCuentaCreditoFiscal=this.jButtonModificarCuentaCreditoFiscal.isVisible();
			
			if(this.jInternalFrameDetalleFormCuentaCreditoFiscal!=null) {
			this.isVisibilidadCeldaActualizarCuentaCreditoFiscal=this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonActualizarCuentaCreditoFiscal.isVisible();
			this.isVisibilidadCeldaEliminarCuentaCreditoFiscal=this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonEliminarCuentaCreditoFiscal.isVisible();
			this.isVisibilidadCeldaCancelarCuentaCreditoFiscal=this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonCancelarCuentaCreditoFiscal.isVisible();
			this.isVisibilidadCeldaGuardarCuentaCreditoFiscal=this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonGuardarCambiosCuentaCreditoFiscal.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCuentaCreditoFiscal=this.jButtonGuardarCambiosTablaCuentaCreditoFiscal.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCuentaCreditoFiscal=this.jButtonNuevoToolBarCuentaCreditoFiscal.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCuentaCreditoFiscal=this.jButtonNuevoRelacionesToolBarCuentaCreditoFiscal.isVisible();
			
			if(this.jInternalFrameDetalleFormCuentaCreditoFiscal!=null) {
			this.isVisibilidadCeldaModificarCuentaCreditoFiscal=this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonModificarToolBarCuentaCreditoFiscal.isVisible();
			this.isVisibilidadCeldaActualizarCuentaCreditoFiscal=this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonActualizarToolBarCuentaCreditoFiscal.isVisible();
			this.isVisibilidadCeldaEliminarCuentaCreditoFiscal=this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonEliminarToolBarCuentaCreditoFiscal.isVisible();
			this.isVisibilidadCeldaCancelarCuentaCreditoFiscal=this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonCancelarToolBarCuentaCreditoFiscal.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCuentaCreditoFiscal=this.jButtonGuardarCambiosToolBarCuentaCreditoFiscal.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCuentaCreditoFiscal=this.jButtonGuardarCambiosTablaToolBarCuentaCreditoFiscal.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCuentaCreditoFiscal=this.jMenuItemNuevoCuentaCreditoFiscal.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCuentaCreditoFiscal=this.jMenuItemNuevoRelacionesCuentaCreditoFiscal.isVisible();
			
			if(this.jInternalFrameDetalleFormCuentaCreditoFiscal!=null) {
			this.isVisibilidadCeldaModificarCuentaCreditoFiscal=this.jInternalFrameDetalleFormCuentaCreditoFiscal.jMenuItemModificarCuentaCreditoFiscal.isVisible();
			this.isVisibilidadCeldaActualizarCuentaCreditoFiscal=this.jInternalFrameDetalleFormCuentaCreditoFiscal.jMenuItemActualizarCuentaCreditoFiscal.isVisible();
			this.isVisibilidadCeldaEliminarCuentaCreditoFiscal=this.jInternalFrameDetalleFormCuentaCreditoFiscal.jMenuItemEliminarCuentaCreditoFiscal.isVisible();
			this.isVisibilidadCeldaCancelarCuentaCreditoFiscal=this.jInternalFrameDetalleFormCuentaCreditoFiscal.jMenuItemCancelarCuentaCreditoFiscal.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCuentaCreditoFiscal=this.jMenuItemGuardarCambiosCuentaCreditoFiscal.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCuentaCreditoFiscal=this.jMenuItemGuardarCambiosTablaCuentaCreditoFiscal.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCuentaCreditoFiscal(Boolean esInicializar) {
		if(CuentaCreditoFiscalJInternalFrame.ISBINDING_MANUAL) {			
			if(this.cuentacreditofiscalSessionBean.getConGuardarRelaciones()) {
				//if(this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCuentaCreditoFiscal();
			}
			
			this.inicializarActualizarBindingBotonesManualCuentaCreditoFiscal(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCuentaCreditoFiscal() {
		this.jButtonNuevoCuentaCreditoFiscal.setVisible(this.isPermisoNuevoCuentaCreditoFiscal);			
		this.jButtonDuplicarCuentaCreditoFiscal.setVisible(this.isPermisoDuplicarCuentaCreditoFiscal);			
		this.jButtonCopiarCuentaCreditoFiscal.setVisible(this.isPermisoCopiarCuentaCreditoFiscal);			
		this.jButtonVerFormCuentaCreditoFiscal.setVisible(this.isPermisoVerFormCuentaCreditoFiscal);			
		
		this.jButtonAbrirOrderByCuentaCreditoFiscal.setVisible(this.isPermisoOrdenCuentaCreditoFiscal);					
		
		this.jButtonNuevoRelacionesCuentaCreditoFiscal.setVisible(this.isPermisoNuevoCuentaCreditoFiscal);			
		
		if(this.jInternalFrameDetalleFormCuentaCreditoFiscal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonModificarCuentaCreditoFiscal.setVisible(this.isPermisoActualizarCuentaCreditoFiscal);	
			this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonActualizarCuentaCreditoFiscal.setVisible(this.isPermisoActualizarCuentaCreditoFiscal);	
			this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonEliminarCuentaCreditoFiscal.setVisible(this.isPermisoEliminarCuentaCreditoFiscal);
			this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonCancelarCuentaCreditoFiscal.setVisible(this.isVisibilidadCeldaCancelarCuentaCreditoFiscal);						
			this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonGuardarCambiosCuentaCreditoFiscal.setVisible(this.isPermisoGuardarCambiosCuentaCreditoFiscal);							
		}
		
		this.jButtonGuardarCambiosTablaCuentaCreditoFiscal.setVisible(this.isPermisoActualizarCuentaCreditoFiscal);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCuentaCreditoFiscal() {
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonModificarCuentaCreditoFiscal.setVisible(this.isPermisoActualizarCuentaCreditoFiscal);	
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonActualizarCuentaCreditoFiscal.setVisible(this.isPermisoActualizarCuentaCreditoFiscal);	
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonEliminarCuentaCreditoFiscal.setVisible(this.isPermisoEliminarCuentaCreditoFiscal);
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonCancelarCuentaCreditoFiscal.setVisible(this.isVisibilidadCeldaCancelarCuentaCreditoFiscal);							
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonGuardarCambiosCuentaCreditoFiscal.setVisible((this.isVisibilidadCeldaGuardarCuentaCreditoFiscal && this.isPermisoGuardarCambiosCuentaCreditoFiscal));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCuentaCreditoFiscal() {
		if(CuentaCreditoFiscalJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCuentaCreditoFiscal();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCuentaCreditoFiscal() {
	}
	
	public void jTableDatosCuentaCreditoFiscalListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCuentaCreditoFiscal(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCuentaCreditoFiscalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacreditofiscalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaCreditoFiscal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuentaCreditoFiscal(this.getcuentacreditofiscal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaCreditoFiscal(this.cuentacreditofiscal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentacreditofiscal =(CuentaCreditoFiscal) this.cuentacreditofiscalLogic.getCuentaCreditoFiscals().toArray()[this.jTableDatosCuentaCreditoFiscal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuentacreditofiscal =(CuentaCreditoFiscal) this.cuentacreditofiscals.toArray()[this.jTableDatosCuentaCreditoFiscal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuentacreditofiscal==null) {
						this.cuentacreditofiscal = new CuentaCreditoFiscal();
					}

					this.setVariablesFormularioToObjetoActualCuentaCreditoFiscal(this.cuentacreditofiscal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaCreditoFiscal(this.cuentacreditofiscal);
				}

				if(this.cuentacreditofiscal.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.cuentacreditofiscal.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuentaCreditoFiscal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacreditofiscalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacreditofiscalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacreditofiscalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaCuentaCreditoFiscalUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacreditofiscalLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebCuentaCreditoFiscal(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaCreditoFiscal.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCuentaCreditoFiscal.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCuentaCreditoFiscal.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacreditofiscal =(CuentaCreditoFiscal) this.cuentacreditofiscalLogic.getCuentaCreditoFiscals().toArray()[this.jTableDatosCuentaCreditoFiscal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cuentacreditofiscal =(CuentaCreditoFiscal) this.cuentacreditofiscals.toArray()[this.jTableDatosCuentaCreditoFiscal.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCuentaCreditoFiscal(this.getcuentacreditofiscal(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCuentaCreditoFiscal(this.cuentacreditofiscal);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.cuentacreditofiscalLogic.getConnexion());

				if(this.cuentacreditofiscal.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.cuentacreditofiscal.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCuentaCreditoFiscal=(TitledBorder)this.jScrollPanelDatosCuentaCreditoFiscal.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderCuentaCreditoFiscal.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacreditofiscalLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacreditofiscalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacreditofiscalLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaCuentaCreditoFiscalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacreditofiscalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaCreditoFiscal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuentaCreditoFiscal(this.getcuentacreditofiscal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaCreditoFiscal(this.cuentacreditofiscal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentacreditofiscal =(CuentaCreditoFiscal) this.cuentacreditofiscalLogic.getCuentaCreditoFiscals().toArray()[this.jTableDatosCuentaCreditoFiscal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuentacreditofiscal =(CuentaCreditoFiscal) this.cuentacreditofiscals.toArray()[this.jTableDatosCuentaCreditoFiscal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuentacreditofiscal==null) {
						this.cuentacreditofiscal = new CuentaCreditoFiscal();
					}

					this.setVariablesFormularioToObjetoActualCuentaCreditoFiscal(this.cuentacreditofiscal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaCreditoFiscal(this.cuentacreditofiscal);
				}

				if(this.cuentacreditofiscal.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.cuentacreditofiscal.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuentaCreditoFiscal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacreditofiscalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacreditofiscalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacreditofiscalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contableCuentaCreditoFiscalUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacreditofiscalLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontable=true;

			idTienePermisocuentacontable=this.tienePermisosUsuarioEnPaginaWebCuentaCreditoFiscal(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontable) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaCreditoFiscal.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCuentaCreditoFiscal.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCuentaCreditoFiscal.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacreditofiscal =(CuentaCreditoFiscal) this.cuentacreditofiscalLogic.getCuentaCreditoFiscals().toArray()[this.jTableDatosCuentaCreditoFiscal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cuentacreditofiscal =(CuentaCreditoFiscal) this.cuentacreditofiscals.toArray()[this.jTableDatosCuentaCreditoFiscal.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCuentaCreditoFiscal(this.getcuentacreditofiscal(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCuentaCreditoFiscal(this.cuentacreditofiscal);

				this.cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontableBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.cuentacreditofiscalLogic.getConnexion());

				if(this.cuentacreditofiscal.getid_cuenta_contable()!=null) {
					this.cuentacontableBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontableBeanSwingJInternalFrame.setIdActual(this.cuentacreditofiscal.getid_cuenta_contable());
					this.cuentacontableBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontableBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCuentaCreditoFiscal=(TitledBorder)this.jScrollPanelDatosCuentaCreditoFiscal.getBorder();
				TitledBorder titledBordercuentacontable=(TitledBorder)this.cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontable.setTitle(titledBorderCuentaCreditoFiscal.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacreditofiscalLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacreditofiscalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacreditofiscalLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contableCuentaCreditoFiscalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacreditofiscalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaCreditoFiscal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuentaCreditoFiscal(this.getcuentacreditofiscal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaCreditoFiscal(this.cuentacreditofiscal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentacreditofiscal =(CuentaCreditoFiscal) this.cuentacreditofiscalLogic.getCuentaCreditoFiscals().toArray()[this.jTableDatosCuentaCreditoFiscal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuentacreditofiscal =(CuentaCreditoFiscal) this.cuentacreditofiscals.toArray()[this.jTableDatosCuentaCreditoFiscal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuentacreditofiscal==null) {
						this.cuentacreditofiscal = new CuentaCreditoFiscal();
					}

					this.setVariablesFormularioToObjetoActualCuentaCreditoFiscal(this.cuentacreditofiscal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaCreditoFiscal(this.cuentacreditofiscal);
				}

				if(this.cuentacreditofiscal.getid_cuenta_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable = "+this.cuentacreditofiscal.getid_cuenta_contable().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuentaCreditoFiscal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacreditofiscalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacreditofiscalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacreditofiscalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonesta_activoCuentaCreditoFiscalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacreditofiscalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCuentaCreditoFiscal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCuentaCreditoFiscal(this.getcuentacreditofiscal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaCreditoFiscal(this.cuentacreditofiscal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentacreditofiscal =(CuentaCreditoFiscal) this.cuentacreditofiscalLogic.getCuentaCreditoFiscals().toArray()[this.jTableDatosCuentaCreditoFiscal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cuentacreditofiscal =(CuentaCreditoFiscal) this.cuentacreditofiscals.toArray()[this.jTableDatosCuentaCreditoFiscal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cuentacreditofiscal==null) {
						this.cuentacreditofiscal = new CuentaCreditoFiscal();
					}

					this.setVariablesFormularioToObjetoActualCuentaCreditoFiscal(this.cuentacreditofiscal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaCreditoFiscal(this.cuentacreditofiscal);
				}

				if(this.cuentacreditofiscal.getesta_activo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where esta_activo = "+this.cuentacreditofiscal.getesta_activo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCuentaCreditoFiscal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacreditofiscalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacreditofiscalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacreditofiscalLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdCuentaContableCuentaCreditoFiscalActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacreditofiscalLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCuentaCreditoFiscal(false,false);

			this.getCuentaCreditoFiscalsFK_IdCuentaContable();

			this.inicializarActualizarBindingCuentaCreditoFiscal(false);

			//if(CuentaCreditoFiscalBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCuentaCreditoFiscal(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacreditofiscalLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacreditofiscalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacreditofiscalLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaCuentaCreditoFiscalActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacreditofiscalLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCuentaCreditoFiscal(false,false);

			this.getCuentaCreditoFiscalsFK_IdEmpresa();

			this.inicializarActualizarBindingCuentaCreditoFiscal(false);

			//if(CuentaCreditoFiscalBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCuentaCreditoFiscal(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacreditofiscalLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacreditofiscalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cuentacreditofiscalLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameCuentaCreditoFiscal() {
		if(this.jInternalFrameDetalleFormCuentaCreditoFiscal!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormCuentaCreditoFiscal!=null) {
			this.jInternalFrameDetalleFormCuentaCreditoFiscal.setVisible(false);	    			
			this.jInternalFrameDetalleFormCuentaCreditoFiscal.dispose();
			this.jInternalFrameDetalleFormCuentaCreditoFiscal=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCuentaCreditoFiscal!=null) {
			this.jInternalFrameReporteDinamicoCuentaCreditoFiscal.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCuentaCreditoFiscal.dispose();
			this.jInternalFrameReporteDinamicoCuentaCreditoFiscal=null;
		}
		
		if(this.jInternalFrameImportacionCuentaCreditoFiscal!=null) {
			this.jInternalFrameImportacionCuentaCreditoFiscal.setVisible(false);	    			
			this.jInternalFrameImportacionCuentaCreditoFiscal.dispose();
			this.jInternalFrameImportacionCuentaCreditoFiscal=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCuentaCreditoFiscal();
			
			CuentaCreditoFiscalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentacreditofiscal,new Object(),this.cuentacreditofiscalParameterGeneral,this.cuentacreditofiscalReturnGeneral);
			
			
			if(sTipo.equals("NuevoCuentaCreditoFiscal")) {
				jButtonNuevoCuentaCreditoFiscalActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCuentaCreditoFiscal")) {
				jButtonDuplicarCuentaCreditoFiscalActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCuentaCreditoFiscal")) {
				jButtonCopiarCuentaCreditoFiscalActionPerformed(evt);
			} else if(sTipo.equals("VerFormCuentaCreditoFiscal")) {
				jButtonVerFormCuentaCreditoFiscalActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCuentaCreditoFiscal")) {
				jButtonNuevoCuentaCreditoFiscalActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCuentaCreditoFiscal")) {
				jButtonDuplicarCuentaCreditoFiscalActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCuentaCreditoFiscal")) {
				jButtonNuevoCuentaCreditoFiscalActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCuentaCreditoFiscal")) {
				jButtonDuplicarCuentaCreditoFiscalActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCuentaCreditoFiscal")) {
				jButtonNuevoCuentaCreditoFiscalActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCuentaCreditoFiscal")) {
				jButtonNuevoCuentaCreditoFiscalActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCuentaCreditoFiscal")) {
				jButtonNuevoCuentaCreditoFiscalActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCuentaCreditoFiscal")) {
				jButtonModificarCuentaCreditoFiscalActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCuentaCreditoFiscal")) {
				jButtonModificarCuentaCreditoFiscalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCuentaCreditoFiscal")) {
				jButtonModificarCuentaCreditoFiscalActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCuentaCreditoFiscal")) {
				jButtonActualizarCuentaCreditoFiscalActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCuentaCreditoFiscal")) {
				jButtonActualizarCuentaCreditoFiscalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCuentaCreditoFiscal")) {
				jButtonActualizarCuentaCreditoFiscalActionPerformed(evt);
			} else if(sTipo.equals("EliminarCuentaCreditoFiscal")) {
				jButtonEliminarCuentaCreditoFiscalActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCuentaCreditoFiscal")) {
				jButtonEliminarCuentaCreditoFiscalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCuentaCreditoFiscal")) {
				jButtonEliminarCuentaCreditoFiscalActionPerformed(evt);
			} else if(sTipo.equals("CancelarCuentaCreditoFiscal")) {
				jButtonCancelarCuentaCreditoFiscalActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCuentaCreditoFiscal")) {
				jButtonCancelarCuentaCreditoFiscalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCuentaCreditoFiscal")) {
				jButtonCancelarCuentaCreditoFiscalActionPerformed(evt);
			} else if(sTipo.equals("CerrarCuentaCreditoFiscal")) {
				jButtonCerrarCuentaCreditoFiscalActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCuentaCreditoFiscal")) {
				jButtonCerrarCuentaCreditoFiscalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCuentaCreditoFiscal")) {
				jButtonCerrarCuentaCreditoFiscalActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCuentaCreditoFiscal")) {
				jButtonMostrarOcultarCuentaCreditoFiscalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCuentaCreditoFiscal")) {
				jButtonCancelarCuentaCreditoFiscalActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCuentaCreditoFiscal")) {
				jButtonGuardarCambiosCuentaCreditoFiscalActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCuentaCreditoFiscal")) {
				jButtonGuardarCambiosCuentaCreditoFiscalActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCuentaCreditoFiscal")) {
				jButtonCopiarCuentaCreditoFiscalActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCuentaCreditoFiscal")) {
				jButtonVerFormCuentaCreditoFiscalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCuentaCreditoFiscal")) {
				jButtonGuardarCambiosCuentaCreditoFiscalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCuentaCreditoFiscal")) {
				jButtonCopiarCuentaCreditoFiscalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCuentaCreditoFiscal")) {
				jButtonVerFormCuentaCreditoFiscalActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCuentaCreditoFiscal")) {
				jButtonGuardarCambiosCuentaCreditoFiscalActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCuentaCreditoFiscal")) {
				jButtonGuardarCambiosCuentaCreditoFiscalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCuentaCreditoFiscal")) {
				jButtonGuardarCambiosCuentaCreditoFiscalActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCuentaCreditoFiscal")) {
				jButtonRecargarInformacionCuentaCreditoFiscalActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCuentaCreditoFiscal")) {
				jButtonRecargarInformacionCuentaCreditoFiscalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCuentaCreditoFiscal")) {
				jButtonRecargarInformacionCuentaCreditoFiscalActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresCuentaCreditoFiscal")) {
				jButtonAnterioresCuentaCreditoFiscalActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCuentaCreditoFiscal")) {
				jButtonAnterioresCuentaCreditoFiscalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCuentaCreditoFiscal")) {
				jButtonAnterioresCuentaCreditoFiscalActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCuentaCreditoFiscal")) {
				jButtonSiguientesCuentaCreditoFiscalActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCuentaCreditoFiscal")) {
				jButtonSiguientesCuentaCreditoFiscalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCuentaCreditoFiscal")) {
				jButtonSiguientesCuentaCreditoFiscalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCuentaCreditoFiscal") || sTipo.equals("MenuItemDetalleAbrirOrderByCuentaCreditoFiscal")) {
				jButtonAbrirOrderByCuentaCreditoFiscalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCuentaCreditoFiscal") || sTipo.equals("MenuItemDetalleMostrarOcultarCuentaCreditoFiscal")) {
				jButtonMostrarOcultarCuentaCreditoFiscalActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCuentaCreditoFiscal")) {
				jButtonNuevoGuardarCambiosCuentaCreditoFiscalActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCuentaCreditoFiscal")) {
				jButtonNuevoGuardarCambiosCuentaCreditoFiscalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCuentaCreditoFiscal")) {
				jButtonNuevoGuardarCambiosCuentaCreditoFiscalActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCuentaCreditoFiscal")) {
				jButtonCerrarReporteDinamicoCuentaCreditoFiscalActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCuentaCreditoFiscal")) {
				jButtonGenerarReporteDinamicoCuentaCreditoFiscalActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCuentaCreditoFiscal")) {
				
				jButtonGenerarExcelReporteDinamicoCuentaCreditoFiscalActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCuentaCreditoFiscal")) {
				jButtonCerrarImportacionCuentaCreditoFiscalActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCuentaCreditoFiscal")) {
				
				jButtonGenerarImportacionCuentaCreditoFiscalActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCuentaCreditoFiscal")) {
				
				jButtonAbrirImportacionCuentaCreditoFiscalActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCuentaCreditoFiscal")) {
				jComboBoxTiposAccionesCuentaCreditoFiscalActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCuentaCreditoFiscal")) {
				jComboBoxTiposRelacionesCuentaCreditoFiscalActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCuentaCreditoFiscal")) {
				jComboBoxTiposAccionesCuentaCreditoFiscalActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCuentaCreditoFiscal")) {
				
				jComboBoxTiposSeleccionarCuentaCreditoFiscalActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCuentaCreditoFiscal")) {
				jTextFieldValorCampoGeneralCuentaCreditoFiscalActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCuentaCreditoFiscal")) {
				jButtonAbrirOrderByCuentaCreditoFiscalActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCuentaCreditoFiscal")) {
				jButtonAbrirOrderByCuentaCreditoFiscalActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCuentaCreditoFiscal")) {
				jButtonCerrarOrderByCuentaCreditoFiscalActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCuentaCreditoFiscalBusqueda")) {
				this.jButtonidCuentaCreditoFiscalBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCuentaCreditoFiscalUpdate")) {
				this.jButtonid_empresaCuentaCreditoFiscalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCuentaCreditoFiscalBusqueda")) {
				this.jButtonid_empresaCuentaCreditoFiscalBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contableCuentaCreditoFiscalUpdate")) {
				this.jButtonid_cuenta_contableCuentaCreditoFiscalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contableCuentaCreditoFiscalBusqueda")) {
				this.jButtonid_cuenta_contableCuentaCreditoFiscalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoCuentaCreditoFiscalBusqueda")) {
				this.jButtonesta_activoCuentaCreditoFiscalBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdCuentaContableCuentaCreditoFiscal")) {
				this.jButtonFK_IdCuentaContableCuentaCreditoFiscalActionPerformed(evt);
			}
			
			;
			
			
			CuentaCreditoFiscalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentacreditofiscal,new Object(),this.cuentacreditofiscalParameterGeneral,this.cuentacreditofiscalReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCuentaCreditoFiscal();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCuentaCreditoFiscalActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacreditofiscal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentacreditofiscal);
				
				CuentaCreditoFiscalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacreditofiscal,new Object(),this.cuentacreditofiscalParameterGeneral,this.cuentacreditofiscalReturnGeneral);
				
				


				
				CuentaCreditoFiscalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacreditofiscal,new Object(),this.cuentacreditofiscalParameterGeneral,this.cuentacreditofiscalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaCreditoFiscal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaCreditoFiscal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			CuentaCreditoFiscal cuentacreditofiscalLocal=null;
			
			if(!this.getEsControlTabla()) {
				cuentacreditofiscalLocal=this.cuentacreditofiscal;
			} else {
				cuentacreditofiscalLocal=this.cuentacreditofiscalAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacreditofiscal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentacreditofiscal);
				
				CuentaCreditoFiscalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacreditofiscal,new Object(),this.cuentacreditofiscalParameterGeneral,this.cuentacreditofiscalReturnGeneral);
							
				
				


				
				CuentaCreditoFiscalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacreditofiscal,new Object(),this.cuentacreditofiscalParameterGeneral,this.cuentacreditofiscalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaCreditoFiscal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaCreditoFiscal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuentaCreditoFiscalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCuentaCreditoFiscal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacreditofiscalAnterior =(CuentaCreditoFiscal) this.cuentacreditofiscalLogic.getCuentaCreditoFiscals().toArray()[this.jTableDatosCuentaCreditoFiscal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuentacreditofiscalAnterior =(CuentaCreditoFiscal) this.cuentacreditofiscals.toArray()[this.jTableDatosCuentaCreditoFiscal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
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
			
			CuentaCreditoFiscalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacreditofiscal,new Object(),this.cuentacreditofiscalParameterGeneral,this.cuentacreditofiscalReturnGeneral);
			
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
			
			


			
			CuentaCreditoFiscalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacreditofiscal,new Object(),this.cuentacreditofiscalParameterGeneral,this.cuentacreditofiscalReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCuentaCreditoFiscalActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacreditofiscal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentacreditofiscal);
				
				CuentaCreditoFiscalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacreditofiscal,new Object(),this.cuentacreditofiscalParameterGeneral,this.cuentacreditofiscalReturnGeneral);
								
						
				


				
				CuentaCreditoFiscalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacreditofiscal,new Object(),this.cuentacreditofiscalParameterGeneral,this.cuentacreditofiscalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaCreditoFiscal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaCreditoFiscal.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacreditofiscal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentacreditofiscal);
				
				CuentaCreditoFiscalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacreditofiscal,new Object(),this.cuentacreditofiscalParameterGeneral,this.cuentacreditofiscalReturnGeneral);
								
				
				


				
				CuentaCreditoFiscalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacreditofiscal,new Object(),this.cuentacreditofiscalParameterGeneral,this.cuentacreditofiscalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaCreditoFiscal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaCreditoFiscal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuentaCreditoFiscalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCuentaCreditoFiscal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacreditofiscalAnterior =(CuentaCreditoFiscal) this.cuentacreditofiscalLogic.getCuentaCreditoFiscals().toArray()[this.jTableDatosCuentaCreditoFiscal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuentacreditofiscalAnterior =(CuentaCreditoFiscal) this.cuentacreditofiscals.toArray()[this.jTableDatosCuentaCreditoFiscal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacreditofiscal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentacreditofiscal);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuentaCreditoFiscalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCuentaCreditoFiscal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacreditofiscalAnterior =(CuentaCreditoFiscal) this.cuentacreditofiscalLogic.getCuentaCreditoFiscals().toArray()[this.jTableDatosCuentaCreditoFiscal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuentacreditofiscalAnterior =(CuentaCreditoFiscal) this.cuentacreditofiscals.toArray()[this.jTableDatosCuentaCreditoFiscal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuentaCreditoFiscalActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacreditofiscal);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cuentacreditofiscal);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacreditofiscal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentacreditofiscal);
				
				CuentaCreditoFiscalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacreditofiscal,new Object(),this.cuentacreditofiscalParameterGeneral,this.cuentacreditofiscalReturnGeneral);
							
				
				


				
				CuentaCreditoFiscalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacreditofiscal,new Object(),this.cuentacreditofiscalParameterGeneral,this.cuentacreditofiscalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaCreditoFiscal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaCreditoFiscal.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCuentaCreditoFiscalActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCuentaCreditoFiscal.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentacreditofiscalAnterior =(CuentaCreditoFiscal) this.cuentacreditofiscalLogic.getCuentaCreditoFiscals().toArray()[this.jTableDatosCuentaCreditoFiscal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cuentacreditofiscalAnterior =(CuentaCreditoFiscal) this.cuentacreditofiscals.toArray()[this.jTableDatosCuentaCreditoFiscal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
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
			
			CuentaCreditoFiscalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacreditofiscal,new Object(),this.cuentacreditofiscalParameterGeneral,this.cuentacreditofiscalReturnGeneral);
			
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
			
			


			
			CuentaCreditoFiscalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacreditofiscal,new Object(),this.cuentacreditofiscalParameterGeneral,this.cuentacreditofiscalReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuentaCreditoFiscalActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacreditofiscal);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cuentacreditofiscal);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacreditofiscal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentacreditofiscal);
				
				CuentaCreditoFiscalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacreditofiscal,new Object(),this.cuentacreditofiscalParameterGeneral,this.cuentacreditofiscalReturnGeneral);
								
				
				


				
				CuentaCreditoFiscalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacreditofiscal,new Object(),this.cuentacreditofiscalParameterGeneral,this.cuentacreditofiscalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaCreditoFiscal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaCreditoFiscal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuentaCreditoFiscalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCuentaCreditoFiscal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacreditofiscalAnterior =(CuentaCreditoFiscal) this.cuentacreditofiscalLogic.getCuentaCreditoFiscals().toArray()[this.jTableDatosCuentaCreditoFiscal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuentacreditofiscalAnterior =(CuentaCreditoFiscal) this.cuentacreditofiscals.toArray()[this.jTableDatosCuentaCreditoFiscal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuentaCreditoFiscalActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacreditofiscal);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cuentacreditofiscal);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCuentaCreditoFiscalActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacreditofiscal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentacreditofiscal);
				
				CuentaCreditoFiscalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentacreditofiscal,new Object(),this.cuentacreditofiscalParameterGeneral,this.cuentacreditofiscalReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCuentaCreditoFiscal")) {
					jCheckBoxSeleccionarTodosCuentaCreditoFiscalItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCuentaCreditoFiscal")) {
					jCheckBoxSeleccionadosCuentaCreditoFiscalItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCuentaCreditoFiscal")) {
					
				}
				
				


				
				
				CuentaCreditoFiscalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentacreditofiscal,new Object(),this.cuentacreditofiscalParameterGeneral,this.cuentacreditofiscalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaCreditoFiscal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaCreditoFiscal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacreditofiscal);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.cuentacreditofiscal);
				
				CuentaCreditoFiscalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentacreditofiscal,new Object(),this.cuentacreditofiscalParameterGeneral,this.cuentacreditofiscalReturnGeneral);
												
				
				


				
				
				CuentaCreditoFiscalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentacreditofiscal,new Object(),this.cuentacreditofiscalParameterGeneral,this.cuentacreditofiscalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaCreditoFiscal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaCreditoFiscal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCuentaCreditoFiscalActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCuentaCreditoFiscal.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cuentacreditofiscalAnterior =(CuentaCreditoFiscal) this.cuentacreditofiscalLogic.getCuentaCreditoFiscals().toArray()[this.jTableDatosCuentaCreditoFiscal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cuentacreditofiscalAnterior =(CuentaCreditoFiscal) this.cuentacreditofiscals.toArray()[this.jTableDatosCuentaCreditoFiscal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCuentaCreditoFiscalActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacreditofiscal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentacreditofiscal);
				
				CuentaCreditoFiscalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentacreditofiscal,new Object(),this.cuentacreditofiscalParameterGeneral,this.cuentacreditofiscalReturnGeneral);
				
				
				CuentaCreditoFiscalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentacreditofiscal,new Object(),this.cuentacreditofiscalParameterGeneral,this.cuentacreditofiscalReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
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
			
			CuentaCreditoFiscalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cuentacreditofiscal,new Object(),this.cuentacreditofiscalParameterGeneral,this.cuentacreditofiscalReturnGeneral);
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
			
			


			
			CuentaCreditoFiscalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacreditofiscal,new Object(),this.cuentacreditofiscalParameterGeneral,this.cuentacreditofiscalReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCuentaCreditoFiscalActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacreditofiscal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentacreditofiscal);
				
				CuentaCreditoFiscalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cuentacreditofiscal,new Object(),this.cuentacreditofiscalParameterGeneral,this.cuentacreditofiscalReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				CuentaCreditoFiscalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacreditofiscal,new Object(),this.cuentacreditofiscalParameterGeneral,this.cuentacreditofiscalReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaCreditoFiscal.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaCreditoFiscal.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cuentacreditofiscal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cuentacreditofiscal);
				
				CuentaCreditoFiscalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cuentacreditofiscal,new Object(),this.cuentacreditofiscalParameterGeneral,this.cuentacreditofiscalReturnGeneral);
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
				
				


				
				CuentaCreditoFiscalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacreditofiscal,new Object(),this.cuentacreditofiscalParameterGeneral,this.cuentacreditofiscalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CuentaCreditoFiscal.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CuentaCreditoFiscal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCuentaCreditoFiscalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCuentaCreditoFiscal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cuentacreditofiscalAnterior =(CuentaCreditoFiscal) this.cuentacreditofiscalLogic.getCuentaCreditoFiscals().toArray()[this.jTableDatosCuentaCreditoFiscal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cuentacreditofiscalAnterior =(CuentaCreditoFiscal) this.cuentacreditofiscals.toArray()[this.jTableDatosCuentaCreditoFiscal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CuentaCreditoFiscalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacreditofiscal,new Object(),this.cuentacreditofiscalParameterGeneral,this.cuentacreditofiscalReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCuentaCreditoFiscal")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCuentaCreditoFiscalListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCuentaCreditoFiscal.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.cuentacreditofiscal =(CuentaCreditoFiscal) this.cuentacreditofiscalLogic.getCuentaCreditoFiscals().toArray()[this.jTableDatosCuentaCreditoFiscal.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.cuentacreditofiscal =(CuentaCreditoFiscal) this.cuentacreditofiscals.toArray()[this.jTableDatosCuentaCreditoFiscal.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.cuentacreditofiscal);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCuentaCreditoFiscal")) {
				
				}
				
				CuentaCreditoFiscalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cuentacreditofiscal,new Object(),this.cuentacreditofiscalParameterGeneral,this.cuentacreditofiscalReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CuentaCreditoFiscalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cuentacreditofiscal,new Object(),this.cuentacreditofiscalParameterGeneral,this.cuentacreditofiscalReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCuentaCreditoFiscal")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCuentaCreditoFiscal.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCuentaCreditoFiscal")) {
			
			}
			
			CuentaCreditoFiscalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cuentacreditofiscal,new Object(),this.cuentacreditofiscalParameterGeneral,this.cuentacreditofiscalReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCuentaCreditoFiscal();
			
			CuentaCreditoFiscalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentacreditofiscal,new Object(),this.cuentacreditofiscalParameterGeneral,this.cuentacreditofiscalReturnGeneral);
			
			if(sTipo.equals("NuevoCuentaCreditoFiscal")) {
				jButtonNuevoCuentaCreditoFiscalActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCuentaCreditoFiscal")) {
				jButtonDuplicarCuentaCreditoFiscalActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCuentaCreditoFiscal")) {
				jButtonCopiarCuentaCreditoFiscalActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCuentaCreditoFiscal")) {
				jButtonVerFormCuentaCreditoFiscalActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCuentaCreditoFiscal")) {
				jButtonNuevoCuentaCreditoFiscalActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCuentaCreditoFiscal")) {
				jButtonModificarCuentaCreditoFiscalActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCuentaCreditoFiscal")) {
				jButtonActualizarCuentaCreditoFiscalActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCuentaCreditoFiscal")) {
				jButtonEliminarCuentaCreditoFiscalActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCuentaCreditoFiscal")) {
				jButtonGuardarCambiosCuentaCreditoFiscalActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCuentaCreditoFiscal")) {
				jButtonCancelarCuentaCreditoFiscalActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCuentaCreditoFiscal")) {
				jButtonCerrarCuentaCreditoFiscalActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCuentaCreditoFiscal")) {
				jButtonGuardarCambiosCuentaCreditoFiscalActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCuentaCreditoFiscal")) {
				jButtonNuevoGuardarCambiosCuentaCreditoFiscalActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCuentaCreditoFiscal")) {
				jButtonAbrirOrderByCuentaCreditoFiscalActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCuentaCreditoFiscal")) {
				jButtonRecargarInformacionCuentaCreditoFiscalActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCuentaCreditoFiscal")) {
				jButtonAnterioresCuentaCreditoFiscalActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCuentaCreditoFiscal")) {
				jButtonSiguientesCuentaCreditoFiscalActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCuentaCreditoFiscalBusqueda")) {
				this.jButtonidCuentaCreditoFiscalBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCuentaCreditoFiscalUpdate")) {
				this.jButtonid_empresaCuentaCreditoFiscalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCuentaCreditoFiscalBusqueda")) {
				this.jButtonid_empresaCuentaCreditoFiscalBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contableCuentaCreditoFiscalUpdate")) {
				this.jButtonid_cuenta_contableCuentaCreditoFiscalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contableCuentaCreditoFiscalBusqueda")) {
				this.jButtonid_cuenta_contableCuentaCreditoFiscalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoCuentaCreditoFiscalBusqueda")) {
				this.jButtonesta_activoCuentaCreditoFiscalBusquedaActionPerformed(evt);
			}
			
			CuentaCreditoFiscalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cuentacreditofiscal,new Object(),this.cuentacreditofiscalParameterGeneral,this.cuentacreditofiscalReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCuentaCreditoFiscal();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CuentaCreditoFiscalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cuentacreditofiscal,new Object(),this.cuentacreditofiscalParameterGeneral,this.cuentacreditofiscalReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCuentaCreditoFiscal")) {
				closingInternalFrameCuentaCreditoFiscal();
				
			} else if(sTipo.equals("jButtonCancelarCuentaCreditoFiscal")) {
				JInternalFrameBase jInternalFrameDetalleFormCuentaCreditoFiscal = (JInternalFrameBase)evt.getSource();
	            	
	            CuentaCreditoFiscalBeanSwingJInternalFrame jInternalFrameParent=(CuentaCreditoFiscalBeanSwingJInternalFrame)jInternalFrameDetalleFormCuentaCreditoFiscal.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCuentaCreditoFiscalActionPerformed(null);
			}
			
			CuentaCreditoFiscalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cuentacreditofiscal,new Object(),this.cuentacreditofiscalParameterGeneral,this.cuentacreditofiscalReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCuentaCreditoFiscal(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCuentaCreditoFiscal(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCuentaCreditoFiscal(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.cuentacreditofiscal)) {
			if(!esControlTabla) {
				if(CuentaCreditoFiscalJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCuentaCreditoFiscal(this.cuentacreditofiscal,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaCreditoFiscal(this.cuentacreditofiscal);			
				}
				
				if(this.cuentacreditofiscalSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCuentaCreditoFiscal(this.cuentacreditofiscal,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.cuentacreditofiscalReturnGeneral=cuentacreditofiscalLogic.procesarEventosCuentaCreditoFiscalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cuentacreditofiscalLogic.getCuentaCreditoFiscals(),this.cuentacreditofiscal,this.cuentacreditofiscalParameterGeneral,this.isEsNuevoCuentaCreditoFiscal,classes);//this.cuentacreditofiscalLogic.getCuentaCreditoFiscal()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCuentaCreditoFiscal(this.cuentacreditofiscalReturnGeneral,this.cuentacreditofiscalBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.cuentacreditofiscalSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCuentaCreditoFiscal(classes,this.cuentacreditofiscalReturnGeneral,this.cuentacreditofiscalBean,false);
					}
						
					if(this.cuentacreditofiscalReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCuentaCreditoFiscal(this.cuentacreditofiscalReturnGeneral.getCuentaCreditoFiscal());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCuentaCreditoFiscal(this.cuentacreditofiscalReturnGeneral.getCuentaCreditoFiscal());	
					}
						
					if(this.cuentacreditofiscalReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCuentaCreditoFiscal(this.cuentacreditofiscalReturnGeneral.getCuentaCreditoFiscal(),classes);//this.cuentacreditofiscalBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCuentaCreditoFiscal(this.cuentacreditofiscal,classes);//this.cuentacreditofiscalBean);									
				}
			
				if(CuentaCreditoFiscalJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCuentaCreditoFiscal(this.cuentacreditofiscal,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCuentaCreditoFiscal(this.cuentacreditofiscal);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.cuentacreditofiscalAnterior!=null) {
						this.cuentacreditofiscal=this.cuentacreditofiscalAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.cuentacreditofiscalReturnGeneral=cuentacreditofiscalLogic.procesarEventosCuentaCreditoFiscalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cuentacreditofiscalLogic.getCuentaCreditoFiscals(),this.cuentacreditofiscal,this.cuentacreditofiscalParameterGeneral,this.isEsNuevoCuentaCreditoFiscal,classes);//this.cuentacreditofiscalLogic.getCuentaCreditoFiscal()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cuentacreditofiscalSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.cuentacreditofiscalReturnGeneral.getCuentaCreditoFiscal(),cuentacreditofiscalLogic.getCuentaCreditoFiscals());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.cuentacreditofiscalReturnGeneral.getCuentaCreditoFiscal(),this.cuentacreditofiscals);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCuentaCreditoFiscal.repaint();
				
				//((AbstractTableModel) this.jTableDatosCuentaCreditoFiscal.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCuentaCreditoFiscal();
			}
		}
	}
	
	public void actualizarVisualTableDatosCuentaCreditoFiscal() throws Exception {
		
		CuentaCreditoFiscalModel cuentacreditofiscalModel=(CuentaCreditoFiscalModel)this.jTableDatosCuentaCreditoFiscal.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cuentacreditofiscalModel.cuentacreditofiscals=this.cuentacreditofiscalLogic.getCuentaCreditoFiscals();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			cuentacreditofiscalModel.cuentacreditofiscals=this.cuentacreditofiscals;
		}
		
		
		((CuentaCreditoFiscalModel) this.jTableDatosCuentaCreditoFiscal.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCuentaCreditoFiscal() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcuentacreditofiscalAnterior(),this.cuentacreditofiscalLogic.getCuentaCreditoFiscals());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcuentacreditofiscalAnterior(),this.cuentacreditofiscals);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCuentaCreditoFiscal();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCuentaCreditoFiscal(CuentaCreditoFiscal cuentacreditofiscal,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
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
										
				CuentaCreditoFiscalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cuentacreditofiscal,new Object(),generalEntityParameterGeneral,this.cuentacreditofiscalReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.cuentacreditofiscalSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CuentaCreditoFiscalConstantesFunciones.getClassesRelationshipsOfCuentaCreditoFiscal(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CuentaCreditoFiscalConstantesFunciones.getClassesRelationshipsFromStringsOfCuentaCreditoFiscal(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCuentaCreditoFiscal(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CuentaCreditoFiscalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cuentacreditofiscal,new Object(),generalEntityParameterGeneral,this.cuentacreditofiscalReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCuentaCreditoFiscal(CuentaCreditoFiscalBean cuentacreditofiscalBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCuentaCreditoFiscal(ArrayList<Classe> classes,CuentaCreditoFiscalReturnGeneral cuentacreditofiscalReturnGeneral,CuentaCreditoFiscalBean cuentacreditofiscalBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCuentaCreditoFiscal(CuentaCreditoFiscal cuentacreditofiscal,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.cuentacreditofiscal)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCuentaCreditoFiscal = new CuentaCreditoFiscalDetalleFormJInternalFrame(jDesktopPane,this.cuentacreditofiscalSessionBean.getConGuardarRelaciones(),this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCuentaCreditoFiscal);
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.setVisible(false);
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.setSelected(false);						
		
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.cuentacreditofiscalLogic=this.cuentacreditofiscalLogic;
		
		this.cargarCombosFrameForeignKeyCuentaCreditoFiscal("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCuentaCreditoFiscal();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCuentaCreditoFiscal();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCuentaCreditoFiscal("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCuentaCreditoFiscal();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCuentaCreditoFiscal"));
		
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonModificarCuentaCreditoFiscal.addActionListener(new ButtonActionListener(this,"ModificarCuentaCreditoFiscal"));

		
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonModificarToolBarCuentaCreditoFiscal.addActionListener(new ButtonActionListener(this,"ModificarToolBarCuentaCreditoFiscal"));
					
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.jMenuItemModificarCuentaCreditoFiscal.addActionListener(new ButtonActionListener(this,"MenuItemModificarCuentaCreditoFiscal"));		
		
		
		
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonActualizarCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"ActualizarCuentaCreditoFiscal"));
		
		
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonActualizarToolBarCuentaCreditoFiscal.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCuentaCreditoFiscal"));
						
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.jMenuItemActualizarCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCuentaCreditoFiscal"));		
		
		
		
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonEliminarCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"EliminarCuentaCreditoFiscal"));
		
		
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonEliminarToolBarCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"EliminarToolBarCuentaCreditoFiscal"));
								
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.jMenuItemEliminarCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCuentaCreditoFiscal"));		
		
		
		
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonCancelarCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"CancelarCuentaCreditoFiscal"));
		
		
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonCancelarToolBarCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"CancelarToolBarCuentaCreditoFiscal"));
					
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.jMenuItemCancelarCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCuentaCreditoFiscal"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.jMenuItemDetalleCerrarCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCuentaCreditoFiscal"));		
		
		
		
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonGuardarCambiosToolBarCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCuentaCreditoFiscal"));
		
		
		
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonGuardarCambiosToolBarCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCuentaCreditoFiscal"));
		
		
		
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.jComboBoxTiposAccionesFormularioCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCuentaCreditoFiscal"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonidCuentaCreditoFiscalBusqueda.addActionListener(new ButtonActionListener(this,"idCuentaCreditoFiscalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonid_empresaCuentaCreditoFiscalUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCuentaCreditoFiscalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonid_empresaCuentaCreditoFiscalBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCuentaCreditoFiscalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonid_cuenta_contableCuentaCreditoFiscalUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCuentaCreditoFiscalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonid_cuenta_contableCuentaCreditoFiscalBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCuentaCreditoFiscalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonesta_activoCuentaCreditoFiscalBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoCuentaCreditoFiscalBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.jTabbedPaneRelacionesCuentaCreditoFiscal.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCuentaCreditoFiscal"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCuentaCreditoFiscal"));
		
		if(this.jInternalFrameDetalleFormCuentaCreditoFiscal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaCreditoFiscal.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCuentaCreditoFiscal"));
		}
		
		this.jTableDatosCuentaCreditoFiscal.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCuentaCreditoFiscal"));
		
		this.jTableDatosCuentaCreditoFiscal.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCuentaCreditoFiscal"));
		
		this.jButtonNuevoCuentaCreditoFiscal.addActionListener(new ButtonActionListener(this,"NuevoCuentaCreditoFiscal"));
		
		this.jButtonDuplicarCuentaCreditoFiscal.addActionListener(new ButtonActionListener(this,"DuplicarCuentaCreditoFiscal"));
		
		this.jButtonCopiarCuentaCreditoFiscal.addActionListener(new ButtonActionListener(this,"CopiarCuentaCreditoFiscal"));
		
		this.jButtonVerFormCuentaCreditoFiscal.addActionListener(new ButtonActionListener(this,"VerFormCuentaCreditoFiscal"));
		
		
		this.jButtonNuevoToolBarCuentaCreditoFiscal.addActionListener(new ButtonActionListener(this,"NuevoToolBarCuentaCreditoFiscal"));
			
		this.jButtonDuplicarToolBarCuentaCreditoFiscal.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCuentaCreditoFiscal"));
			
		this.jMenuItemNuevoCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCuentaCreditoFiscal"));
			
		this.jMenuItemDuplicarCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCuentaCreditoFiscal"));		
		
		
		this.jButtonNuevoRelacionesCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCuentaCreditoFiscal"));
		
		
		this.jButtonNuevoRelacionesToolBarCuentaCreditoFiscal.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCuentaCreditoFiscal"));
			
		this.jMenuItemNuevoRelacionesCuentaCreditoFiscal.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCuentaCreditoFiscal"));		
		
		
		if(this.jInternalFrameDetalleFormCuentaCreditoFiscal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonModificarCuentaCreditoFiscal.addActionListener(new ButtonActionListener(this,"ModificarCuentaCreditoFiscal"));
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaCreditoFiscal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonModificarToolBarCuentaCreditoFiscal.addActionListener(new ButtonActionListener(this,"ModificarToolBarCuentaCreditoFiscal"));
			
			this.jInternalFrameDetalleFormCuentaCreditoFiscal.jMenuItemModificarCuentaCreditoFiscal.addActionListener(new ButtonActionListener(this,"MenuItemModificarCuentaCreditoFiscal"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaCreditoFiscal!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonActualizarCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"ActualizarCuentaCreditoFiscal"));
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaCreditoFiscal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonActualizarToolBarCuentaCreditoFiscal.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCuentaCreditoFiscal"));
				
			this.jInternalFrameDetalleFormCuentaCreditoFiscal.jMenuItemActualizarCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCuentaCreditoFiscal"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaCreditoFiscal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonEliminarCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"EliminarCuentaCreditoFiscal"));
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaCreditoFiscal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonEliminarToolBarCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"EliminarToolBarCuentaCreditoFiscal"));
						
			this.jInternalFrameDetalleFormCuentaCreditoFiscal.jMenuItemEliminarCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCuentaCreditoFiscal"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaCreditoFiscal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonCancelarCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"CancelarCuentaCreditoFiscal"));
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaCreditoFiscal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonCancelarToolBarCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"CancelarToolBarCuentaCreditoFiscal"));
			
			this.jInternalFrameDetalleFormCuentaCreditoFiscal.jMenuItemCancelarCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCuentaCreditoFiscal"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCuentaCreditoFiscal"));		
		
		
		this.jButtonCerrarCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"CerrarCuentaCreditoFiscal"));
		
		
		this.jButtonCerrarToolBarCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"CerrarToolBarCuentaCreditoFiscal"));
			
		this.jMenuItemCerrarCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCuentaCreditoFiscal"));
			
		if(this.jInternalFrameDetalleFormCuentaCreditoFiscal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaCreditoFiscal.jMenuItemDetalleCerrarCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCuentaCreditoFiscal"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaCreditoFiscal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonGuardarCambiosCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"GuardarCambiosCuentaCreditoFiscal"));
		}
		
		
		if(this.jInternalFrameDetalleFormCuentaCreditoFiscal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonGuardarCambiosToolBarCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCuentaCreditoFiscal"));
		}
		
		this.jButtonCopiarToolBarCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"CopiarToolBarCuentaCreditoFiscal"));
			
		this.jButtonVerFormToolBarCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"VerFormToolBarCuentaCreditoFiscal"));
		
		this.jMenuItemGuardarCambiosCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCuentaCreditoFiscal"));
			
		this.jMenuItemCopiarCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCuentaCreditoFiscal"));		
		
		this.jMenuItemVerFormCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCuentaCreditoFiscal"));		
		
		
		this.jButtonGuardarCambiosTablaCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCuentaCreditoFiscal"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCuentaCreditoFiscal"));
			
		this.jMenuItemGuardarCambiosTablaCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCuentaCreditoFiscal"));		
		
		
		
		this.jButtonRecargarInformacionCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"RecargarInformacionCuentaCreditoFiscal"));
					
		this.jButtonRecargarInformacionToolBarCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCuentaCreditoFiscal"));
		
		this.jMenuItemRecargarInformacionCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCuentaCreditoFiscal"));		
		
		
		
		this.jButtonAnterioresCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"AnterioresCuentaCreditoFiscal"));
		
		
		this.jButtonAnterioresToolBarCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCuentaCreditoFiscal"));
		
		this.jMenuItemAnterioresCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCuentaCreditoFiscal"));		
		
		
		this.jButtonSiguientesCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"SiguientesCuentaCreditoFiscal"));
		
		
		this.jButtonSiguientesToolBarCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCuentaCreditoFiscal"));
			
		this.jMenuItemSiguientesCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCuentaCreditoFiscal"));
			
		this.jMenuItemAbrirOrderByCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCuentaCreditoFiscal"));
			
		this.jMenuItemMostrarOcultarCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCuentaCreditoFiscal"));
			
		this.jMenuItemDetalleAbrirOrderByCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCuentaCreditoFiscal"));
			
		this.jMenuItemDetalleMostarOcultarCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCuentaCreditoFiscal"));		
		
		
		this.jButtonNuevoGuardarCambiosCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCuentaCreditoFiscal"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCuentaCreditoFiscal"));
			
		this.jMenuItemNuevoGuardarCambiosCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCuentaCreditoFiscal"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCuentaCreditoFiscal.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCuentaCreditoFiscal"));

		this.jCheckBoxSeleccionadosCuentaCreditoFiscal.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCuentaCreditoFiscal"));
		
		if(this.jInternalFrameDetalleFormCuentaCreditoFiscal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaCreditoFiscal.jComboBoxTiposAccionesFormularioCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCuentaCreditoFiscal"));
		}
		
		
		this.jComboBoxTiposRelacionesCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"TiposRelacionesCuentaCreditoFiscal"));
			
		this.jComboBoxTiposAccionesCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"TiposAccionesCuentaCreditoFiscal"));
					
		this.jComboBoxTiposSeleccionarCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCuentaCreditoFiscal"));
			
		this.jTextFieldValorCampoGeneralCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCuentaCreditoFiscal"));		
		
		
		if(this.jInternalFrameDetalleFormCuentaCreditoFiscal!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonidCuentaCreditoFiscalBusqueda.addActionListener(new ButtonActionListener(this,"idCuentaCreditoFiscalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonid_empresaCuentaCreditoFiscalUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCuentaCreditoFiscalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonid_empresaCuentaCreditoFiscalBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCuentaCreditoFiscalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonid_cuenta_contableCuentaCreditoFiscalUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCuentaCreditoFiscalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonid_cuenta_contableCuentaCreditoFiscalBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCuentaCreditoFiscalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonesta_activoCuentaCreditoFiscalBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoCuentaCreditoFiscalBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdCuentaContableCuentaCreditoFiscal.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableCuentaCreditoFiscal"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCuentaCreditoFiscal!=null) {
				this.jInternalFrameReporteDinamicoCuentaCreditoFiscal.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCuentaCreditoFiscal"));
				this.jInternalFrameReporteDinamicoCuentaCreditoFiscal.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCuentaCreditoFiscal"));
				this.jInternalFrameReporteDinamicoCuentaCreditoFiscal.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCuentaCreditoFiscal"));
			}
			
			//this.jButtonCerrarReporteDinamicoCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCuentaCreditoFiscal"));				
			//this.jButtonGenerarReporteDinamicoCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCuentaCreditoFiscal"));
			//this.jButtonGenerarExcelReporteDinamicoCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCuentaCreditoFiscal"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCuentaCreditoFiscal!=null) {
				this.jInternalFrameImportacionCuentaCreditoFiscal.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCuentaCreditoFiscal"));
				this.jInternalFrameImportacionCuentaCreditoFiscal.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCuentaCreditoFiscal"));
				this.jInternalFrameImportacionCuentaCreditoFiscal.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCuentaCreditoFiscal"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"AbrirOrderByCuentaCreditoFiscal"));
			
			this.jButtonAbrirOrderByToolBarCuentaCreditoFiscal.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCuentaCreditoFiscal"));			
			
			if(this.jInternalFrameOrderByCuentaCreditoFiscal!=null) {
				this.jInternalFrameOrderByCuentaCreditoFiscal.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCuentaCreditoFiscal"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCuentaCreditoFiscal!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCuentaCreditoFiscal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCuentaCreditoFiscal.jTabbedPaneRelacionesCuentaCreditoFiscal.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCuentaCreditoFiscal"));
		
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
            		closingInternalFrameCuentaCreditoFiscal();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCuentaCreditoFiscal = (JInternalFrameBase)event.getSource();
	            	
	            CuentaCreditoFiscalBeanSwingJInternalFrame jInternalFrameParent=(CuentaCreditoFiscalBeanSwingJInternalFrame)jInternalFrameDetalleFormCuentaCreditoFiscal.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCuentaCreditoFiscalActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCuentaCreditoFiscal.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCuentaCreditoFiscalListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCuentaCreditoFiscal.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCuentaCreditoFiscal.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCuentaCreditoFiscal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCuentaCreditoFiscalActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCuentaCreditoFiscal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCuentaCreditoFiscalActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCuentaCreditoFiscal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCuentaCreditoFiscalActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCuentaCreditoFiscal";
		inputMap = this.jButtonNuevoCuentaCreditoFiscal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCuentaCreditoFiscal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCuentaCreditoFiscalActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCuentaCreditoFiscal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCuentaCreditoFiscalActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCuentaCreditoFiscal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCuentaCreditoFiscalActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCuentaCreditoFiscal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCuentaCreditoFiscalActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCuentaCreditoFiscal";
		inputMap = this.jButtonNuevoRelacionesCuentaCreditoFiscal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCuentaCreditoFiscal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCuentaCreditoFiscalActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCuentaCreditoFiscal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCuentaCreditoFiscalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCuentaCreditoFiscal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCuentaCreditoFiscalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCuentaCreditoFiscal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCuentaCreditoFiscalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCuentaCreditoFiscal";
		inputMap = this.jButtonModificarCuentaCreditoFiscal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCuentaCreditoFiscal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCuentaCreditoFiscalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCuentaCreditoFiscal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCuentaCreditoFiscalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCuentaCreditoFiscal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCuentaCreditoFiscalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCuentaCreditoFiscal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCuentaCreditoFiscalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCuentaCreditoFiscal";
		inputMap = this.jButtonActualizarCuentaCreditoFiscal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCuentaCreditoFiscal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCuentaCreditoFiscalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCuentaCreditoFiscal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCuentaCreditoFiscalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCuentaCreditoFiscal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCuentaCreditoFiscalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCuentaCreditoFiscal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCuentaCreditoFiscalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCuentaCreditoFiscal";
		inputMap = this.jButtonEliminarCuentaCreditoFiscal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCuentaCreditoFiscal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCuentaCreditoFiscalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCuentaCreditoFiscal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCuentaCreditoFiscalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCuentaCreditoFiscal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCuentaCreditoFiscalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCuentaCreditoFiscal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCuentaCreditoFiscalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCuentaCreditoFiscal";
		inputMap = this.jButtonCancelarCuentaCreditoFiscal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCuentaCreditoFiscal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCuentaCreditoFiscalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCuentaCreditoFiscal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCuentaCreditoFiscalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCuentaCreditoFiscal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCuentaCreditoFiscalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCuentaCreditoFiscal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCuentaCreditoFiscalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCuentaCreditoFiscal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCuentaCreditoFiscalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCuentaCreditoFiscalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCuentaCreditoFiscal";
		inputMap = this.jButtonCerrarCuentaCreditoFiscal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCuentaCreditoFiscal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCuentaCreditoFiscalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonGuardarCambiosCuentaCreditoFiscal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCuentaCreditoFiscalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCuentaCreditoFiscal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCuentaCreditoFiscalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCuentaCreditoFiscal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCuentaCreditoFiscalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCuentaCreditoFiscal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCuentaCreditoFiscalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCuentaCreditoFiscal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCuentaCreditoFiscalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCuentaCreditoFiscal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCuentaCreditoFiscalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCuentaCreditoFiscal";
		inputMap = this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonGuardarCambiosCuentaCreditoFiscal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonGuardarCambiosCuentaCreditoFiscal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCuentaCreditoFiscalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCuentaCreditoFiscal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCuentaCreditoFiscalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCuentaCreditoFiscal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCuentaCreditoFiscalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCuentaCreditoFiscal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCuentaCreditoFiscalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresCuentaCreditoFiscal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCuentaCreditoFiscalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCuentaCreditoFiscal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCuentaCreditoFiscalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCuentaCreditoFiscal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCuentaCreditoFiscalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCuentaCreditoFiscal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCuentaCreditoFiscalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCuentaCreditoFiscal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCuentaCreditoFiscalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCuentaCreditoFiscal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCuentaCreditoFiscalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCuentaCreditoFiscal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCuentaCreditoFiscalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCuentaCreditoFiscal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCuentaCreditoFiscalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCuentaCreditoFiscal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCuentaCreditoFiscalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCuentaCreditoFiscal.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCuentaCreditoFiscalItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCuentaCreditoFiscal.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCuentaCreditoFiscalActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCuentaCreditoFiscal.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCuentaCreditoFiscalActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCuentaCreditoFiscal.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCuentaCreditoFiscalActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonidCuentaCreditoFiscalBusqueda.addActionListener(new ButtonActionListener(this,"idCuentaCreditoFiscalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonid_empresaCuentaCreditoFiscalUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCuentaCreditoFiscalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonid_empresaCuentaCreditoFiscalBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCuentaCreditoFiscalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonid_cuenta_contableCuentaCreditoFiscalUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCuentaCreditoFiscalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonid_cuenta_contableCuentaCreditoFiscalBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCuentaCreditoFiscalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.jButtonesta_activoCuentaCreditoFiscalBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoCuentaCreditoFiscalBusqueda"));
		
		
		this.jButtonFK_IdCuentaContableCuentaCreditoFiscal.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableCuentaCreditoFiscal"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCuentaCreditoFiscal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCuentaCreditoFiscalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCuentaCreditoFiscal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCuentaCreditoFiscalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCuentaCreditoFiscal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCuentaCreditoFiscalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCuentaCreditoFiscal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCuentaCreditoFiscalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCuentaCreditoFiscal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCuentaCreditoFiscalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCuentaCreditoFiscal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCuentaCreditoFiscalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCuentaCreditoFiscalActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCuentaCreditoFiscal.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCuentaCreditoFiscal(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(CuentaCreditoFiscal cuentacreditofiscalAux:this.cuentacreditofiscalLogic.getCuentaCreditoFiscals()) {
					cuentacreditofiscalAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CuentaCreditoFiscal cuentacreditofiscalAux:cuentacreditofiscals) {
					cuentacreditofiscalAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCuentaCreditoFiscalItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCuentaCreditoFiscal(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CuentaCreditoFiscal cuentacreditofiscalAux:this.cuentacreditofiscalLogic.getCuentaCreditoFiscals()) {
						cuentacreditofiscalAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CuentaCreditoFiscal cuentacreditofiscalAux:cuentacreditofiscals) {
						cuentacreditofiscalAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(CuentaCreditoFiscal cuentacreditofiscalAux:this.cuentacreditofiscalLogic.getCuentaCreditoFiscals()) {
					
						if(sTipoSeleccionar.equals(CuentaCreditoFiscalConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							cuentacreditofiscalAux.setesta_activo(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CuentaCreditoFiscal cuentacreditofiscalAux:cuentacreditofiscals) {
						
						if(sTipoSeleccionar.equals(CuentaCreditoFiscalConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							cuentacreditofiscalAux.setesta_activo(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCuentaCreditoFiscal(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCuentaCreditoFiscal.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCuentaCreditoFiscal.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCuentaCreditoFiscal,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCuentaCreditoFiscalItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCuentaCreditoFiscal(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCuentaCreditoFiscal.getSelectedRows();
			
			CuentaCreditoFiscal cuentacreditofiscalLocal=new CuentaCreditoFiscal();
			
			//this.seleccionarTodosCuentaCreditoFiscal(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacreditofiscalLocal =(CuentaCreditoFiscal) this.cuentacreditofiscalLogic.getCuentaCreditoFiscals().toArray()[this.jTableDatosCuentaCreditoFiscal.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					cuentacreditofiscalLocal =(CuentaCreditoFiscal) this.cuentacreditofiscals.toArray()[this.jTableDatosCuentaCreditoFiscal.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				cuentacreditofiscalLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CuentaCreditoFiscal cuentacreditofiscalAux:this.cuentacreditofiscalLogic.getCuentaCreditoFiscals()) {
						cuentacreditofiscalAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CuentaCreditoFiscal cuentacreditofiscalAux:cuentacreditofiscals) {
						cuentacreditofiscalAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCuentaCreditoFiscal(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCuentaCreditoFiscal.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCuentaCreditoFiscal.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCuentaCreditoFiscal,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCuentaCreditoFiscalItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCuentaCreditoFiscalParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCuentaCreditoFiscalActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCuentaCreditoFiscal(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCuentaCreditoFiscal.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CuentaCreditoFiscal cuentacreditofiscalAux:this.cuentacreditofiscalLogic.getCuentaCreditoFiscals()) {
				
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CuentaCreditoFiscal cuentacreditofiscalAux:cuentacreditofiscals) {
					
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCuentaCreditoFiscal(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCuentaCreditoFiscalActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCuentaCreditoFiscal(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCuentaCreditoFiscal=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCuentaCreditoFiscal.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCuentaCreditoFiscal.jComboBoxTiposAccionesFormularioCuentaCreditoFiscal.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCuentaCreditoFiscal) {				
					conSplash=true;//false;										
					
					//this.startProcessCuentaCreditoFiscal(conSplash);
				
					this.generarReporteCuentaCreditoFiscalsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCuentaCreditoFiscal.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCuentaCreditoFiscal.jComboBoxTiposAccionesFormularioCuentaCreditoFiscal.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCuentaCreditoFiscalsSeleccionados();
				//this.jComboBoxTiposAccionesCuentaCreditoFiscal.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCuentaCreditoFiscalsSeleccionados(false);
				//this.jComboBoxTiposAccionesCuentaCreditoFiscal.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCuentaCreditoFiscalsSeleccionados(true);
				//this.jComboBoxTiposAccionesCuentaCreditoFiscal.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCuentaCreditoFiscal();
				
				this.exportarCuentaCreditoFiscalsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCuentaCreditoFiscal.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCuentaCreditoFiscal.jComboBoxTiposAccionesFormularioCuentaCreditoFiscal.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCuentaCreditoFiscals();
				//this.importarCuentaCreditoFiscals();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCuentaCreditoFiscal.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCuentaCreditoFiscal.jComboBoxTiposAccionesFormularioCuentaCreditoFiscal.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCuentaCreditoFiscal();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCuentaCreditoFiscalsSeleccionados();
				//this.jComboBoxTiposAccionesCuentaCreditoFiscal.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Cuenta Credito Fiscal", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCuentaCreditoFiscal();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCuentaCreditoFiscal)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCuentaCreditoFiscal(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Cuenta Credito Fiscal",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCuentaCreditoFiscal.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCuentaCreditoFiscal.jComboBoxTiposAccionesFormularioCuentaCreditoFiscal.setSelectedIndex(0);					
				}	
			} 			
			else if(CuentaCreditoFiscalBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCuentaCreditoFiscal) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCuentaCreditoFiscal(conSplash);
					
						//this.actualizarParametrosGeneralCuentaCreditoFiscal();
						
						this.generarReporteProcesoAccionCuentaCreditoFiscalsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCuentaCreditoFiscal.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCuentaCreditoFiscal.jComboBoxTiposAccionesFormularioCuentaCreditoFiscal.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CuentaCreditoFiscalBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Cuenta Credito FiscalES SELECCIONADOS?", "MANTENIMIENTO DE Cuenta Credito Fiscal", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCuentaCreditoFiscal();
				
						this.actualizarParametrosGeneralCuentaCreditoFiscal();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.cuentacreditofiscalReturnGeneral=cuentacreditofiscalLogic.procesarAccionCuentaCreditoFiscalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.cuentacreditofiscalLogic.getCuentaCreditoFiscals(),this.cuentacreditofiscalParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCuentaCreditoFiscalReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCuentaCreditoFiscal.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCuentaCreditoFiscal.jComboBoxTiposAccionesFormularioCuentaCreditoFiscal.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCuentaCreditoFiscal();
					
					CuentaCreditoFiscalBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCuentaCreditoFiscalReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCuentaCreditoFiscal.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCuentaCreditoFiscal.jComboBoxTiposAccionesFormularioCuentaCreditoFiscal.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCuentaCreditoFiscal(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCuentaCreditoFiscalActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCuentaCreditoFiscal();
			
			if(this.jInternalFrameDetalleFormCuentaCreditoFiscal==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<CuentaCreditoFiscal> cuentacreditofiscalsSeleccionados=new ArrayList<CuentaCreditoFiscal>();		
			CuentaCreditoFiscal cuentacreditofiscal=new CuentaCreditoFiscal();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCuentaCreditoFiscal(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCuentaCreditoFiscal.getSelectedItem();
			
			
			
			
			cuentacreditofiscalsSeleccionados=this.getCuentaCreditoFiscalsSeleccionados(true);
			//this.sTipoAccion;
			
			if(cuentacreditofiscalsSeleccionados.size()==1) {
				for(CuentaCreditoFiscal cuentacreditofiscalAux:cuentacreditofiscalsSeleccionados) {
					cuentacreditofiscal=cuentacreditofiscalAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCuentaCreditoFiscal();
			
      		//this.finishProcessCuentaCreditoFiscal(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCuentaCreditoFiscalReturnGeneral() throws Exception {
		if(this.cuentacreditofiscalReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.cuentacreditofiscalReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.cuentacreditofiscalReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.cuentacreditofiscalReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.cuentacreditofiscalReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.cuentacreditofiscalReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCuentaCreditoFiscal(false);
		}
		
		if(this.cuentacreditofiscalReturnGeneral.getConRetornoLista() || this.cuentacreditofiscalReturnGeneral.getConRetornoObjeto()) {
			if(this.cuentacreditofiscalReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cuentacreditofiscalLogic.setCuentaCreditoFiscals(this.cuentacreditofiscalReturnGeneral.getCuentaCreditoFiscals());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.cuentacreditofiscalReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cuentacreditofiscalLogic.setCuentaCreditoFiscal(this.cuentacreditofiscalReturnGeneral.getCuentaCreditoFiscal());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingCuentaCreditoFiscal(false);
		}
	}
	
	public void actualizarParametrosGeneralCuentaCreditoFiscal() throws Exception {
		
		
	}
	
	public ArrayList<CuentaCreditoFiscal> getCuentaCreditoFiscalsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<CuentaCreditoFiscal> cuentacreditofiscalsSeleccionados=new ArrayList<CuentaCreditoFiscal>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCuentaCreditoFiscal) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(CuentaCreditoFiscal cuentacreditofiscalAux:cuentacreditofiscalLogic.getCuentaCreditoFiscals()) {
					if(cuentacreditofiscalAux.getIsSelected()) {
						cuentacreditofiscalsSeleccionados.add(cuentacreditofiscalAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CuentaCreditoFiscal cuentacreditofiscalAux:this.cuentacreditofiscals) {
					if(cuentacreditofiscalAux.getIsSelected()) {
						cuentacreditofiscalsSeleccionados.add(cuentacreditofiscalAux);				
					}
				}
			}
			
			if(cuentacreditofiscalsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						cuentacreditofiscalsSeleccionados.addAll(this.cuentacreditofiscalLogic.getCuentaCreditoFiscals());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						cuentacreditofiscalsSeleccionados.addAll(this.cuentacreditofiscals);				
					}
				}
			}
		} else {
			cuentacreditofiscalsSeleccionados.add(this.cuentacreditofiscal);
		}
		
		return cuentacreditofiscalsSeleccionados;
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
	
	public void generarReporteCuentaCreditoFiscalsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalCuentaCreditoFiscalsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCuentaCreditoFiscalsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCuentaCreditoFiscalsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCuentaCreditoFiscalsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Cuenta Credito Fiscal",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCuentaCreditoFiscalsSeleccionados() throws Exception {
		ArrayList<CuentaCreditoFiscal> cuentacreditofiscalsSeleccionados=new ArrayList<CuentaCreditoFiscal>();		
		
		cuentacreditofiscalsSeleccionados=this.getCuentaCreditoFiscalsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCuentaCreditoFiscals("Todos",cuentacreditofiscalsSeleccionados);
		
	}	
	
	public void generarReporteNormalCuentaCreditoFiscalsSeleccionados() throws Exception {
		ArrayList<CuentaCreditoFiscal> cuentacreditofiscalsSeleccionados=new ArrayList<CuentaCreditoFiscal>();		
		
		cuentacreditofiscalsSeleccionados=this.getCuentaCreditoFiscalsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCuentaCreditoFiscals("Todos",cuentacreditofiscalsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCuentaCreditoFiscalsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<CuentaCreditoFiscal> cuentacreditofiscalsSeleccionados=new ArrayList<CuentaCreditoFiscal>();
		
		cuentacreditofiscalsSeleccionados=this.getCuentaCreditoFiscalsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCuentaCreditoFiscals("Todos",cuentacreditofiscalsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoCuentaCreditoFiscalsSeleccionados() throws Exception {
		ArrayList<CuentaCreditoFiscal> cuentacreditofiscalsSeleccionados=new ArrayList<CuentaCreditoFiscal>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCuentaCreditoFiscal();
		
		
		cuentacreditofiscalsSeleccionados=this.getCuentaCreditoFiscalsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCuentaCreditoFiscal();
		
		
		//this.generarReporteCuentaCreditoFiscals("Todos",cuentacreditofiscalsSeleccionados ,cuentacreditofiscalImplementable,cuentacreditofiscalImplementableHome);
	}
	
	public void mostrarImportacionCuentaCreditoFiscals() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCuentaCreditoFiscal();
		
		this.abrirFrameImportacionCuentaCreditoFiscal();		
		
			
		//this.generarReporteCuentaCreditoFiscals("Todos",cuentacreditofiscalsSeleccionados ,cuentacreditofiscalImplementable,cuentacreditofiscalImplementableHome);
	}
	
	public void importarCuentaCreditoFiscals() throws Exception {		
	
	}
	
	public void exportarCuentaCreditoFiscalsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCuentaCreditoFiscalsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCuentaCreditoFiscalsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCuentaCreditoFiscalsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Cuenta Credito Fiscal",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCuentaCreditoFiscalsSeleccionados() throws Exception {
		ArrayList<CuentaCreditoFiscal> cuentacreditofiscalsSeleccionados=new ArrayList<CuentaCreditoFiscal>();		
		
		cuentacreditofiscalsSeleccionados=this.getCuentaCreditoFiscalsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cuentacreditofiscal."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCuentaCreditoFiscal(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(CuentaCreditoFiscal cuentacreditofiscalAux:cuentacreditofiscalsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCuentaCreditoFiscal(cuentacreditofiscalAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//cuentacreditofiscalAux.setsDetalleGeneralEntityReporte(cuentacreditofiscalAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Credito Fiscal",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCuentaCreditoFiscal(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CuentaCreditoFiscalConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuentaCreditoFiscalConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuentaCreditoFiscalConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuentaCreditoFiscalConstantesFunciones.LABEL_IDCUENTACONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CuentaCreditoFiscalConstantesFunciones.LABEL_ESTAACTIVO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCuentaCreditoFiscal(CuentaCreditoFiscal cuentacreditofiscal,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=cuentacreditofiscal.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=cuentacreditofiscal.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuentacreditofiscal.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuentacreditofiscal.getcuentacontable_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cuentacreditofiscal.getesta_activo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCuentaCreditoFiscalsSeleccionados() throws Exception {
		ArrayList<CuentaCreditoFiscal> cuentacreditofiscalsSeleccionados=new ArrayList<CuentaCreditoFiscal>();		
		
		cuentacreditofiscalsSeleccionados=this.getCuentaCreditoFiscalsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cuentacreditofiscal.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("CuentaCreditoFiscals");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCuentaCreditoFiscal(row);				
				iRow++;
			}				
			
			for(CuentaCreditoFiscal cuentacreditofiscalAux:cuentacreditofiscalsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCuentaCreditoFiscal(cuentacreditofiscalAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Credito Fiscal",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCuentaCreditoFiscalsSeleccionados() throws Exception {
		ArrayList<CuentaCreditoFiscal> cuentacreditofiscalsSeleccionados=new ArrayList<CuentaCreditoFiscal>();		
		
		cuentacreditofiscalsSeleccionados=this.getCuentaCreditoFiscalsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cuentacreditofiscal.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("cuentacreditofiscals");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("cuentacreditofiscal");
			//elementRoot.appendChild(element);
		
			for(CuentaCreditoFiscal cuentacreditofiscalAux:cuentacreditofiscalsSeleccionados) {
				element = document.createElement("cuentacreditofiscal");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCuentaCreditoFiscal(cuentacreditofiscalAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cuenta Credito Fiscal",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCuentaCreditoFiscal(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CuentaCreditoFiscalConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CuentaCreditoFiscalConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CuentaCreditoFiscalConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(CuentaCreditoFiscalConstantesFunciones.LABEL_IDCUENTACONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(CuentaCreditoFiscalConstantesFunciones.LABEL_ESTAACTIVO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCuentaCreditoFiscal(CuentaCreditoFiscal cuentacreditofiscal,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(cuentacreditofiscal.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(cuentacreditofiscal.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cuentacreditofiscal.getcuentacontable_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cuentacreditofiscal.getesta_activo());				
	}
	
	public void setFilaDatosExportarXmlCuentaCreditoFiscal(CuentaCreditoFiscal cuentacreditofiscal,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CuentaCreditoFiscalConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(cuentacreditofiscal.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CuentaCreditoFiscalConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(cuentacreditofiscal.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(CuentaCreditoFiscalConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(cuentacreditofiscal.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcuentacontable_descripcion = document.createElement(CuentaCreditoFiscalConstantesFunciones.IDCUENTACONTABLE);
		elementcuentacontable_descripcion.appendChild(document.createTextNode(cuentacreditofiscal.getcuentacontable_descripcion()));
		element.appendChild(elementcuentacontable_descripcion);

		Element elementesta_activo = document.createElement(CuentaCreditoFiscalConstantesFunciones.ESTAACTIVO);
		elementesta_activo.appendChild(document.createTextNode(cuentacreditofiscal.getesta_activo().toString().trim()));
		element.appendChild(elementesta_activo);
	}
	
	public void generarReporteGroupGenericoCuentaCreditoFiscalsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<CuentaCreditoFiscal> cuentacreditofiscalsSeleccionados=new ArrayList<CuentaCreditoFiscal>();
		
		cuentacreditofiscalsSeleccionados=this.getCuentaCreditoFiscalsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoCuentaCreditoFiscal(cuentacreditofiscalsSeleccionados);
		
		this.generarReporteCuentaCreditoFiscals("Todos",cuentacreditofiscalsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCuentaCreditoFiscal(ArrayList<CuentaCreditoFiscal> cuentacreditofiscalsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(CuentaCreditoFiscal cuentacreditofiscalAux:cuentacreditofiscalsSeleccionados) {
				cuentacreditofiscalAux.setsDetalleGeneralEntityReporte(cuentacreditofiscalAux.toString());
			
				if(sTipoSeleccionar.equals(CuentaCreditoFiscalConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					cuentacreditofiscalAux.setsDescripcionGeneralEntityReporte1(cuentacreditofiscalAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CuentaCreditoFiscalConstantesFunciones.LABEL_IDCUENTACONTABLE)) {
					existe=true;
					cuentacreditofiscalAux.setsDescripcionGeneralEntityReporte1(cuentacreditofiscalAux.getcuentacontable_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CuentaCreditoFiscalConstantesFunciones.LABEL_ESTAACTIVO)) {
					existe=true;
					cuentacreditofiscalAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(cuentacreditofiscalAux.getesta_activo()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CuentaCreditoFiscalConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCuentaCreditoFiscal(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCuentaCreditoFiscal=true;
				this.isVisibilidadCeldaNuevoRelacionesCuentaCreditoFiscal=true;
				this.isVisibilidadCeldaGuardarCambiosCuentaCreditoFiscal=true;
			}
			
			this.isVisibilidadCeldaModificarCuentaCreditoFiscal=false;
			this.isVisibilidadCeldaActualizarCuentaCreditoFiscal=false;
			this.isVisibilidadCeldaEliminarCuentaCreditoFiscal=false;
			this.isVisibilidadCeldaCancelarCuentaCreditoFiscal=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCuentaCreditoFiscal=true;
				} else {
					this.isVisibilidadCeldaGuardarCuentaCreditoFiscal=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCuentaCreditoFiscal=false;
			this.isVisibilidadCeldaNuevoRelacionesCuentaCreditoFiscal=false;
			this.isVisibilidadCeldaGuardarCambiosCuentaCreditoFiscal=false;
			this.isVisibilidadCeldaModificarCuentaCreditoFiscal=false;
			this.isVisibilidadCeldaActualizarCuentaCreditoFiscal=true;
			this.isVisibilidadCeldaEliminarCuentaCreditoFiscal=false;
			this.isVisibilidadCeldaCancelarCuentaCreditoFiscal=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCuentaCreditoFiscal=true;
				} else {
					this.isVisibilidadCeldaGuardarCuentaCreditoFiscal=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCuentaCreditoFiscal=false;
			this.isVisibilidadCeldaNuevoRelacionesCuentaCreditoFiscal=false;
			this.isVisibilidadCeldaGuardarCambiosCuentaCreditoFiscal=false;
			this.isVisibilidadCeldaModificarCuentaCreditoFiscal=false;
			this.isVisibilidadCeldaActualizarCuentaCreditoFiscal=true;
			this.isVisibilidadCeldaEliminarCuentaCreditoFiscal=true;
			this.isVisibilidadCeldaCancelarCuentaCreditoFiscal=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCuentaCreditoFiscal=true;
				} else {
					this.isVisibilidadCeldaGuardarCuentaCreditoFiscal=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCuentaCreditoFiscal=false;
			this.isVisibilidadCeldaNuevoRelacionesCuentaCreditoFiscal=false;
			this.isVisibilidadCeldaGuardarCambiosCuentaCreditoFiscal=false;
			this.isVisibilidadCeldaModificarCuentaCreditoFiscal=false;
			this.isVisibilidadCeldaActualizarCuentaCreditoFiscal=true;
			this.isVisibilidadCeldaEliminarCuentaCreditoFiscal=false;
			this.isVisibilidadCeldaCancelarCuentaCreditoFiscal=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCuentaCreditoFiscal=false;
				} else {
					this.isVisibilidadCeldaGuardarCuentaCreditoFiscal=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCuentaCreditoFiscal=true;
			this.isVisibilidadCeldaNuevoRelacionesCuentaCreditoFiscal=true;
			this.isVisibilidadCeldaGuardarCambiosCuentaCreditoFiscal=true;
			this.isVisibilidadCeldaModificarCuentaCreditoFiscal=false;
			this.isVisibilidadCeldaActualizarCuentaCreditoFiscal=false;
			this.isVisibilidadCeldaEliminarCuentaCreditoFiscal=false;
			this.isVisibilidadCeldaCancelarCuentaCreditoFiscal=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCuentaCreditoFiscal=true;
				} else {
					this.isVisibilidadCeldaGuardarCuentaCreditoFiscal=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCuentaCreditoFiscal=false;
			this.isVisibilidadCeldaNuevoRelacionesCuentaCreditoFiscal=false;
			this.isVisibilidadCeldaGuardarCambiosCuentaCreditoFiscal=false;
			this.isVisibilidadCeldaActualizarCuentaCreditoFiscal=false;
			this.isVisibilidadCeldaEliminarCuentaCreditoFiscal=false;
			this.isVisibilidadCeldaCancelarCuentaCreditoFiscal=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCuentaCreditoFiscal=false;
				} else {
					this.isVisibilidadCeldaGuardarCuentaCreditoFiscal=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCuentaCreditoFiscal=false;
			this.isVisibilidadCeldaNuevoRelacionesCuentaCreditoFiscal=false;
			this.isVisibilidadCeldaGuardarCambiosCuentaCreditoFiscal=false;
			this.isVisibilidadCeldaModificarCuentaCreditoFiscal=true;
			this.isVisibilidadCeldaActualizarCuentaCreditoFiscal=false;
			this.isVisibilidadCeldaEliminarCuentaCreditoFiscal=false;
			this.isVisibilidadCeldaCancelarCuentaCreditoFiscal=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCuentaCreditoFiscal=false;
				} else {
					this.isVisibilidadCeldaGuardarCuentaCreditoFiscal=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CuentaCreditoFiscalJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCuentaCreditoFiscal=true;
			this.isVisibilidadCeldaNuevoRelacionesCuentaCreditoFiscal=true;
			this.isVisibilidadCeldaGuardarCambiosCuentaCreditoFiscal=true;
		} else {
			this.actualizarEstadoPanelsCuentaCreditoFiscal(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCuentaCreditoFiscal=false;
			//this.isVisibilidadCeldaVerFormCuentaCreditoFiscal=false;
			this.isVisibilidadCeldaDuplicarCuentaCreditoFiscal=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!cuentacreditofiscalSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCuentaCreditoFiscal=false;
		} else {
			this.isVisibilidadCeldaNuevoCuentaCreditoFiscal=false;
			this.isVisibilidadCeldaGuardarCambiosCuentaCreditoFiscal=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(cuentacreditofiscalSessionBean.getEsGuardarRelacionado()) {
			if(!cuentacreditofiscalSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCuentaCreditoFiscal=false;												
			}
			
			this.jButtonCerrarCuentaCreditoFiscal.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCuentaCreditoFiscal=false;
		}
		
		if(!this.permiteMantenimiento(this.cuentacreditofiscal)) {
			this.isVisibilidadCeldaActualizarCuentaCreditoFiscal=false;
			this.isVisibilidadCeldaEliminarCuentaCreditoFiscal=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCuentaCreditoFiscal() {
	}
	
	public void actualizarEstadoPanelsCuentaCreditoFiscal(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCuentaCreditoFiscal!=null) {
				this.jScrollPanelDatosEdicionCuentaCreditoFiscal.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuentaCreditoFiscal!=null) {
				this.jTabbedPaneBusquedasCuentaCreditoFiscal.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCuentaCreditoFiscal!=null) {
				this.jScrollPanelDatosCuentaCreditoFiscal.setVisible(true);
			}
			
			if(this.jPanelPaginacionCuentaCreditoFiscal!=null) {
				this.jPanelPaginacionCuentaCreditoFiscal.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCuentaCreditoFiscal!=null) {
				this.jPanelParametrosReportesCuentaCreditoFiscal.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCuentaCreditoFiscal!=null) {
				this.jScrollPanelDatosEdicionCuentaCreditoFiscal.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuentaCreditoFiscal!=null) {
				this.jTabbedPaneBusquedasCuentaCreditoFiscal.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosCuentaCreditoFiscal!=null) {
				this.jScrollPanelDatosCuentaCreditoFiscal.setVisible(false);
			}
			
			if(this.jPanelPaginacionCuentaCreditoFiscal!=null) {
				this.jPanelPaginacionCuentaCreditoFiscal.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCuentaCreditoFiscal!=null) {
				this.jPanelParametrosReportesCuentaCreditoFiscal.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCuentaCreditoFiscal!=null) {
				this.jScrollPanelDatosEdicionCuentaCreditoFiscal.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuentaCreditoFiscal!=null) {
				this.jTabbedPaneBusquedasCuentaCreditoFiscal.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCuentaCreditoFiscal!=null) {
				this.jScrollPanelDatosCuentaCreditoFiscal.setVisible(false);
			}
			
			if(this.jPanelPaginacionCuentaCreditoFiscal!=null) {
				this.jPanelPaginacionCuentaCreditoFiscal.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCuentaCreditoFiscal!=null) {
				this.jPanelParametrosReportesCuentaCreditoFiscal.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCuentaCreditoFiscal!=null) {
				this.jScrollPanelDatosEdicionCuentaCreditoFiscal.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuentaCreditoFiscal!=null) {
				this.jTabbedPaneBusquedasCuentaCreditoFiscal.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCuentaCreditoFiscal!=null) {
				this.jScrollPanelDatosCuentaCreditoFiscal.setVisible(false);
			}
			
			if(this.jPanelPaginacionCuentaCreditoFiscal!=null) {
				this.jPanelPaginacionCuentaCreditoFiscal.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCuentaCreditoFiscal!=null) {
				this.jPanelParametrosReportesCuentaCreditoFiscal.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCuentaCreditoFiscal!=null) {
				this.jScrollPanelDatosEdicionCuentaCreditoFiscal.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuentaCreditoFiscal!=null) {
				this.jTabbedPaneBusquedasCuentaCreditoFiscal.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCuentaCreditoFiscal!=null) {
				this.jScrollPanelDatosCuentaCreditoFiscal.setVisible(true);
			}
			
			if(this.jPanelPaginacionCuentaCreditoFiscal!=null) {
				this.jPanelPaginacionCuentaCreditoFiscal.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCuentaCreditoFiscal!=null) {
				this.jPanelParametrosReportesCuentaCreditoFiscal.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCuentaCreditoFiscal!=null) {
				this.jScrollPanelDatosEdicionCuentaCreditoFiscal.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuentaCreditoFiscal!=null) {
				this.jTabbedPaneBusquedasCuentaCreditoFiscal.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCuentaCreditoFiscal!=null) {
				this.jScrollPanelDatosCuentaCreditoFiscal.setVisible(true);
			}
			
			if(this.jPanelPaginacionCuentaCreditoFiscal!=null) {
				this.jPanelPaginacionCuentaCreditoFiscal.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCuentaCreditoFiscal!=null) {
				this.jPanelParametrosReportesCuentaCreditoFiscal.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCuentaCreditoFiscal!=null) {
				this.jScrollPanelDatosEdicionCuentaCreditoFiscal.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuentaCreditoFiscal!=null) {
				this.jTabbedPaneBusquedasCuentaCreditoFiscal.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCuentaCreditoFiscal!=null) {
				this.jScrollPanelDatosCuentaCreditoFiscal.setVisible(true);
			}
			
			if(this.jPanelPaginacionCuentaCreditoFiscal!=null) {
				this.jPanelPaginacionCuentaCreditoFiscal.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCuentaCreditoFiscal!=null) {
				this.jPanelParametrosReportesCuentaCreditoFiscal.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasCuentaCreditoFiscal!=null) {
					this.jTabbedPaneBusquedasCuentaCreditoFiscal.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesCuentaCreditoFiscal!=null) {
				this.jPanelParametrosReportesCuentaCreditoFiscal.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCuentaCreditoFiscal!=null) {
				this.jTabbedPaneBusquedasCuentaCreditoFiscal.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesCuentaCreditoFiscal!=null) {
				this.jPanelParametrosReportesCuentaCreditoFiscal.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCuentaContable=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasCuentaCreditoFiscal.remove(jPanelFK_IdCuentaContableCuentaCreditoFiscal);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaContable(Boolean isParaCuentaContable){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableNegation=!isParaCuentaContable;

			this.isVisibilidadFK_IdCuentaContable=isParaCuentaContable;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasCuentaCreditoFiscal.remove(jPanelFK_IdCuentaContableCuentaCreditoFiscal);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//CuentaCreditoFiscalSessionBean cuentacreditofiscalSessionBean=new CuentaCreditoFiscalSessionBean();
		
		if(this.cuentacreditofiscalSessionBean==null) {
			this.cuentacreditofiscalSessionBean=new CuentaCreditoFiscalSessionBean();
		}
		
		this.cuentacreditofiscalSessionBean.setsUltimaBusquedaCuentaCreditoFiscal(this.getsAccionBusqueda());
		this.cuentacreditofiscalSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.cuentacreditofiscalSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCuentaContable")) {
			cuentacreditofiscalSessionBean.setid_cuenta_contable(this.getid_cuenta_contableFK_IdCuentaContable());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			cuentacreditofiscalSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//CuentaCreditoFiscalSessionBean cuentacreditofiscalSessionBean=new CuentaCreditoFiscalSessionBean();
		
		if(this.cuentacreditofiscalSessionBean==null) {
			this.cuentacreditofiscalSessionBean=new CuentaCreditoFiscalSessionBean();
		}
		
		if(this.cuentacreditofiscalSessionBean.getsUltimaBusquedaCuentaCreditoFiscal()!=null&&!this.cuentacreditofiscalSessionBean.getsUltimaBusquedaCuentaCreditoFiscal().equals("")) {
			this.setsAccionBusqueda(cuentacreditofiscalSessionBean.getsUltimaBusquedaCuentaCreditoFiscal());
			this.setiNumeroPaginacion(cuentacreditofiscalSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(cuentacreditofiscalSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCuentaContable")) {
				this.setid_cuenta_contableFK_IdCuentaContable(cuentacreditofiscalSessionBean.getid_cuenta_contable());
				cuentacreditofiscalSessionBean.setid_cuenta_contable(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(cuentacreditofiscalSessionBean.getid_empresa());
				cuentacreditofiscalSessionBean.setid_empresa(-1L);
			}
		}
		
		this.cuentacreditofiscalSessionBean.setsUltimaBusquedaCuentaCreditoFiscal("");
		this.cuentacreditofiscalSessionBean.setiNumeroPaginacion(CuentaCreditoFiscalConstantesFunciones.INUMEROPAGINACION);
		this.cuentacreditofiscalSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaCuentaCreditoFiscal(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCuentaCreditoFiscal() {
		this.updateBorderResaltarBusquedasFormularioCuentaCreditoFiscal();
		this.updateVisibilidadBusquedasFormularioCuentaCreditoFiscal();
		this.updateHabilitarBusquedasFormularioCuentaCreditoFiscal();
	}
	
	public void updateBorderResaltarBusquedasFormularioCuentaCreditoFiscal() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasCuentaCreditoFiscal.getComponents().length>0) {
	

		if(this.cuentacreditofiscalConstantesFunciones.resaltarFK_IdCuentaContableCuentaCreditoFiscal!=null) {
			index= this.jTabbedPaneBusquedasCuentaCreditoFiscal.indexOfComponent(this.jPanelFK_IdCuentaContableCuentaCreditoFiscal);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaCreditoFiscal.getComponent(index);
				jPanel.setBorder(this.cuentacreditofiscalConstantesFunciones.resaltarFK_IdCuentaContableCuentaCreditoFiscal);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioCuentaCreditoFiscal() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasCuentaCreditoFiscal.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCuentaCreditoFiscal.indexOfComponent(this.jPanelFK_IdCuentaContableCuentaCreditoFiscal);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaCreditoFiscal.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cuentacreditofiscalConstantesFunciones.mostrarFK_IdCuentaContableCuentaCreditoFiscal);
			if(!this.cuentacreditofiscalConstantesFunciones.mostrarFK_IdCuentaContableCuentaCreditoFiscal && index>-1) {
				this.jTabbedPaneBusquedasCuentaCreditoFiscal.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioCuentaCreditoFiscal() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasCuentaCreditoFiscal.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCuentaCreditoFiscal.indexOfComponent(this.jPanelFK_IdCuentaContableCuentaCreditoFiscal);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaCreditoFiscal.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cuentacreditofiscalConstantesFunciones.activarFK_IdCuentaContableCuentaCreditoFiscal);
				this.jTabbedPaneBusquedasCuentaCreditoFiscal.setEnabledAt(index,this.cuentacreditofiscalConstantesFunciones.activarFK_IdCuentaContableCuentaCreditoFiscal);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaCuentaCreditoFiscal(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCuentaContable")) {
			index= this.jTabbedPaneBusquedasCuentaCreditoFiscal.indexOfComponent(this.jPanelFK_IdCuentaContableCuentaCreditoFiscal);

			this.jTabbedPaneBusquedasCuentaCreditoFiscal.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCuentaCreditoFiscal.getComponent(index);

			this.cuentacreditofiscalConstantesFunciones.setResaltarFK_IdCuentaContableCuentaCreditoFiscal(resaltar);

			jPanel.setBorder(this.cuentacreditofiscalConstantesFunciones.resaltarFK_IdCuentaContableCuentaCreditoFiscal);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarCuentaCreditoFiscal.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioCuentaCreditoFiscal() throws Exception {

		if(this.jInternalFrameDetalleFormCuentaCreditoFiscal==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCuentaCreditoFiscal();
		this.updateVisibilidadResaltarControlesFormularioCuentaCreditoFiscal();
		this.updateHabilitarResaltarControlesFormularioCuentaCreditoFiscal();
		
	}
	
	public void updateBorderResaltarControlesFormularioCuentaCreditoFiscal() throws Exception {
		if(this.jInternalFrameDetalleFormCuentaCreditoFiscal==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.cuentacreditofiscalConstantesFunciones.resaltaridCuentaCreditoFiscal!=null && this.jInternalFrameDetalleFormCuentaCreditoFiscal!=null) {this.jInternalFrameDetalleFormCuentaCreditoFiscal.jLabelidCuentaCreditoFiscal.setBorder(this.cuentacreditofiscalConstantesFunciones.resaltaridCuentaCreditoFiscal);}
		if(this.cuentacreditofiscalConstantesFunciones.resaltarid_empresaCuentaCreditoFiscal!=null && this.jInternalFrameDetalleFormCuentaCreditoFiscal!=null) {this.jInternalFrameDetalleFormCuentaCreditoFiscal.jComboBoxid_empresaCuentaCreditoFiscal.setBorder(this.cuentacreditofiscalConstantesFunciones.resaltarid_empresaCuentaCreditoFiscal);}
		if(this.cuentacreditofiscalConstantesFunciones.resaltarid_cuenta_contableCuentaCreditoFiscal!=null && this.jInternalFrameDetalleFormCuentaCreditoFiscal!=null) {this.jInternalFrameDetalleFormCuentaCreditoFiscal.jComboBoxid_cuenta_contableCuentaCreditoFiscal.setBorder(this.cuentacreditofiscalConstantesFunciones.resaltarid_cuenta_contableCuentaCreditoFiscal);}
		if(this.cuentacreditofiscalConstantesFunciones.resaltaresta_activoCuentaCreditoFiscal!=null && this.jInternalFrameDetalleFormCuentaCreditoFiscal!=null) {this.jInternalFrameDetalleFormCuentaCreditoFiscal.jCheckBoxesta_activoCuentaCreditoFiscal.setBorderPainted(true);this.jInternalFrameDetalleFormCuentaCreditoFiscal.jCheckBoxesta_activoCuentaCreditoFiscal.setBorder(this.cuentacreditofiscalConstantesFunciones.resaltaresta_activoCuentaCreditoFiscal);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCuentaCreditoFiscal() throws Exception {		
		if(this.jInternalFrameDetalleFormCuentaCreditoFiscal==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCuentaCreditoFiscal!=null) {
	
		//this.jInternalFrameDetalleFormCuentaCreditoFiscal.jLabelidCuentaCreditoFiscal.setVisible(this.cuentacreditofiscalConstantesFunciones.mostraridCuentaCreditoFiscal);
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.jPanelidCuentaCreditoFiscal.setVisible(this.cuentacreditofiscalConstantesFunciones.mostraridCuentaCreditoFiscal);
		//this.jInternalFrameDetalleFormCuentaCreditoFiscal.jComboBoxid_empresaCuentaCreditoFiscal.setVisible(this.cuentacreditofiscalConstantesFunciones.mostrarid_empresaCuentaCreditoFiscal);
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.jPanelid_empresaCuentaCreditoFiscal.setVisible(this.cuentacreditofiscalConstantesFunciones.mostrarid_empresaCuentaCreditoFiscal);
		//this.jInternalFrameDetalleFormCuentaCreditoFiscal.jComboBoxid_cuenta_contableCuentaCreditoFiscal.setVisible(this.cuentacreditofiscalConstantesFunciones.mostrarid_cuenta_contableCuentaCreditoFiscal);
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.jPanelid_cuenta_contableCuentaCreditoFiscal.setVisible(this.cuentacreditofiscalConstantesFunciones.mostrarid_cuenta_contableCuentaCreditoFiscal);
		//this.jInternalFrameDetalleFormCuentaCreditoFiscal.jCheckBoxesta_activoCuentaCreditoFiscal.setVisible(this.cuentacreditofiscalConstantesFunciones.mostraresta_activoCuentaCreditoFiscal);
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.jPanelesta_activoCuentaCreditoFiscal.setVisible(this.cuentacreditofiscalConstantesFunciones.mostraresta_activoCuentaCreditoFiscal);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCuentaCreditoFiscal() throws Exception {
		if(this.jInternalFrameDetalleFormCuentaCreditoFiscal==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCuentaCreditoFiscal!=null) {
	
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.jLabelidCuentaCreditoFiscal.setEnabled(this.cuentacreditofiscalConstantesFunciones.activaridCuentaCreditoFiscal);
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.jComboBoxid_empresaCuentaCreditoFiscal.setEnabled(this.cuentacreditofiscalConstantesFunciones.activarid_empresaCuentaCreditoFiscal);
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.jComboBoxid_cuenta_contableCuentaCreditoFiscal.setEnabled(this.cuentacreditofiscalConstantesFunciones.activarid_cuenta_contableCuentaCreditoFiscal);
		this.jInternalFrameDetalleFormCuentaCreditoFiscal.jCheckBoxesta_activoCuentaCreditoFiscal.setEnabled(this.cuentacreditofiscalConstantesFunciones.activaresta_activoCuentaCreditoFiscal);
		}
	}
	
		
}