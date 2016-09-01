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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes;




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

import com.bydan.erp.tesoreria.util.TipoRetencionFuenteIvaConstantesFunciones;
import com.bydan.erp.tesoreria.util.TipoRetencionFuenteIvaParameterReturnGeneral;
//import com.bydan.erp.tesoreria.util.TipoRetencionFuenteIvaParameterGeneral;
//import com.bydan.erp.tesoreria.presentation.report.source.TipoRetencionFuenteIvaBean;
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

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.tesoreria.resources.reportes.AuxiliarReportes;


import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.tesoreria.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.tesoreria.business.entity.*;
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


import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

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
public class TipoRetencionFuenteIvaBeanSwingJInternalFrame extends TipoRetencionFuenteIvaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoRetencionFuenteIvaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoRetencionFuenteIva> tiporetencionfuenteivaValidator = new ClassValidator<TipoRetencionFuenteIva>(TipoRetencionFuenteIva.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoRetencionFuenteIva tiporetencionfuenteiva;	
	public TipoRetencionFuenteIva tiporetencionfuenteivaAux;
	public TipoRetencionFuenteIva tiporetencionfuenteivaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoRetencionFuenteIva tiporetencionfuenteivaTotales;
	public Long idTipoRetencionFuenteIvaActual;
	public Long iIdNuevoTipoRetencionFuenteIva=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboPais="";

	public List<Pais> paissForeignKey;

	public List<Pais> getpaissForeignKey() {
		return paissForeignKey;
	}

	public void setpaissForeignKey(List<Pais> paissForeignKey) {
		this.paissForeignKey = paissForeignKey;
	}

	//OBJETO FK ACTUAL
	public Pais paisForeignKey;

	public Pais getpaisForeignKey() {
		return paisForeignKey;
	}

	public void setpaisForeignKey(Pais paisForeignKey) {
		this.paisForeignKey = paisForeignKey;
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
	
	public Boolean isPermisoTodoTipoRetencionFuenteIva;
	public Boolean isPermisoNuevoTipoRetencionFuenteIva;
	public Boolean isPermisoActualizarTipoRetencionFuenteIva;
	public Boolean isPermisoActualizarOriginalTipoRetencionFuenteIva;
	public Boolean isPermisoEliminarTipoRetencionFuenteIva;
	public Boolean isPermisoGuardarCambiosTipoRetencionFuenteIva;
	public Boolean isPermisoConsultaTipoRetencionFuenteIva;
	public Boolean isPermisoBusquedaTipoRetencionFuenteIva;
	public Boolean isPermisoReporteTipoRetencionFuenteIva;
	public Boolean isPermisoPaginacionMedioTipoRetencionFuenteIva;
	public Boolean isPermisoPaginacionAltoTipoRetencionFuenteIva;
	public Boolean isPermisoPaginacionTodoTipoRetencionFuenteIva;
	public Boolean isPermisoCopiarTipoRetencionFuenteIva;
	public Boolean isPermisoVerFormTipoRetencionFuenteIva;
	public Boolean isPermisoDuplicarTipoRetencionFuenteIva;
	public Boolean isPermisoOrdenTipoRetencionFuenteIva;
	
	
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
	
	public TipoRetencionFuenteIvaParameterReturnGeneral tiporetencionfuenteivaReturnGeneral;
	public TipoRetencionFuenteIvaParameterReturnGeneral tiporetencionfuenteivaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoRetencionFuenteIva=false;
	public Boolean esParaAccionDesdeFormularioTipoRetencionFuenteIva=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoRetencionFuenteIvaSessionBeanAdditional tiporetencionfuenteivaSessionBeanAdditional=null;
	
	public TipoRetencionFuenteIvaSessionBeanAdditional getTipoRetencionFuenteIvaSessionBeanAdditional() {
		return this.tiporetencionfuenteivaSessionBeanAdditional;
	}
	
	public void setTipoRetencionFuenteIvaSessionBeanAdditional(TipoRetencionFuenteIvaSessionBeanAdditional tiporetencionfuenteivaSessionBeanAdditional) {
		try {
			this.tiporetencionfuenteivaSessionBeanAdditional=tiporetencionfuenteivaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional tiporetencionfuenteivaBeanSwingJInternalFrameAdditional=null;
	//public class TipoRetencionFuenteIvaBeanSwingJInternalFrame
	
	public TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional getTipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional() {
		return this.tiporetencionfuenteivaBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional(TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional tiporetencionfuenteivaBeanSwingJInternalFrameAdditional) {
		try {
			this.tiporetencionfuenteivaBeanSwingJInternalFrameAdditional=tiporetencionfuenteivaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoRetencionFuenteIvaLogic tiporetencionfuenteivaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoRetencionFuenteIva tiporetencionfuenteivaBean;
	public TipoRetencionFuenteIvaConstantesFunciones tiporetencionfuenteivaConstantesFunciones;
	//public TipoRetencionFuenteIvaParameterReturnGeneral tiporetencionfuenteivaReturnGeneral;
	
	//FK
	
	public PaisLogic paisLogic;
	public CuentaContableLogic cuentacontableLogic;
	public CuentaContableLogic cuentacontablecreditoLogic;
	
	//PARAMETROS
	
	
	//public List<TipoRetencionFuenteIva> tiporetencionfuenteivas;	
	//public List<TipoRetencionFuenteIva> tiporetencionfuenteivasEliminados;
	//public List<TipoRetencionFuenteIva> tiporetencionfuenteivasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoRetencionFuenteIva=false;
	public Boolean isVisibilidadCeldaDuplicarTipoRetencionFuenteIva=true;
	public Boolean isVisibilidadCeldaCopiarTipoRetencionFuenteIva=true;
	public Boolean isVisibilidadCeldaVerFormTipoRetencionFuenteIva=true;
	public Boolean isVisibilidadCeldaOrdenTipoRetencionFuenteIva=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoRetencionFuenteIva=false;
	public Boolean isVisibilidadCeldaModificarTipoRetencionFuenteIva=false;
	public Boolean isVisibilidadCeldaActualizarTipoRetencionFuenteIva=false;
	public Boolean isVisibilidadCeldaEliminarTipoRetencionFuenteIva=false;
	public Boolean isVisibilidadCeldaCancelarTipoRetencionFuenteIva=false;
	public Boolean isVisibilidadCeldaGuardarTipoRetencionFuenteIva=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoRetencionFuenteIva=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdCuentaContable=false;
	public Boolean isVisibilidadFK_IdCuentaContableCredito=false;
	public Boolean isVisibilidadFK_IdPais=false;
	
	public Long getiIdNuevoTipoRetencionFuenteIva() {
		return this.iIdNuevoTipoRetencionFuenteIva;
	}

	public void setiIdNuevoTipoRetencionFuenteIva(Long iIdNuevoTipoRetencionFuenteIva) {
		this.iIdNuevoTipoRetencionFuenteIva = iIdNuevoTipoRetencionFuenteIva;
	}
	
	public Long getidTipoRetencionFuenteIvaActual() {
		return this.idTipoRetencionFuenteIvaActual;
	}

	public void setidTipoRetencionFuenteIvaActual(Long idTipoRetencionFuenteIvaActual) {
		this.idTipoRetencionFuenteIvaActual = idTipoRetencionFuenteIvaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoRetencionFuenteIva gettiporetencionfuenteiva() {
		return this.tiporetencionfuenteiva;
	}

	public void settiporetencionfuenteiva(TipoRetencionFuenteIva tiporetencionfuenteiva) {
		this.tiporetencionfuenteiva = tiporetencionfuenteiva;
	}
	
	public TipoRetencionFuenteIva gettiporetencionfuenteivaAux() {
		return this.tiporetencionfuenteivaAux;
	}

	public void settiporetencionfuenteivaAux(TipoRetencionFuenteIva tiporetencionfuenteivaAux) {
		this.tiporetencionfuenteivaAux = tiporetencionfuenteivaAux;
	}				
	
	public TipoRetencionFuenteIva gettiporetencionfuenteivaAnterior() {
		return this.tiporetencionfuenteivaAnterior;
	}

	public void settiporetencionfuenteivaAnterior(TipoRetencionFuenteIva tiporetencionfuenteivaAnterior) {
		this.tiporetencionfuenteivaAnterior = tiporetencionfuenteivaAnterior;
	}	
	
	public TipoRetencionFuenteIva gettiporetencionfuenteivaTotales() {
		return this.tiporetencionfuenteivaTotales;
	}

	public void settiporetencionfuenteivaTotales(TipoRetencionFuenteIva tiporetencionfuenteivaTotales) {
		this.tiporetencionfuenteivaTotales = tiporetencionfuenteivaTotales;
	}	
	
	public TipoRetencionFuenteIva gettiporetencionfuenteivaBean() {
		return this.tiporetencionfuenteivaBean;
	}

	public void settiporetencionfuenteivaBean(TipoRetencionFuenteIva tiporetencionfuenteivaBean) {
		this.tiporetencionfuenteivaBean = tiporetencionfuenteivaBean;
	}	
	
	public TipoRetencionFuenteIvaParameterReturnGeneral gettiporetencionfuenteivaReturnGeneral() {
		return this.tiporetencionfuenteivaReturnGeneral;
	}

	public void settiporetencionfuenteivaReturnGeneral(TipoRetencionFuenteIvaParameterReturnGeneral tiporetencionfuenteivaReturnGeneral) {
		this.tiporetencionfuenteivaReturnGeneral = tiporetencionfuenteivaReturnGeneral;
	}	
	
	
	public String codigoBusquedaPorCodigo="";

	public String getcodigoBusquedaPorCodigo() {
		return this.codigoBusquedaPorCodigo;
	}

	public void setcodigoBusquedaPorCodigo(String codigoBusquedaPorCodigo) {
		this.codigoBusquedaPorCodigo = codigoBusquedaPorCodigo;
	}

	public String nombreBusquedaPorNombre="";

	public String getnombreBusquedaPorNombre() {
		return this.nombreBusquedaPorNombre;
	}

	public void setnombreBusquedaPorNombre(String nombreBusquedaPorNombre) {
		this.nombreBusquedaPorNombre = nombreBusquedaPorNombre;
	}

	public Long id_cuenta_contableFK_IdCuentaContable=null;

	public Long getid_cuenta_contableFK_IdCuentaContable() {
		return this.id_cuenta_contableFK_IdCuentaContable;
	}

	public void setid_cuenta_contableFK_IdCuentaContable(Long id_cuenta_contableFK_IdCuentaContable) {
		this.id_cuenta_contableFK_IdCuentaContable = id_cuenta_contableFK_IdCuentaContable;
	}

	public Long id_cuenta_contable_creditoFK_IdCuentaContableCredito=null;

	public Long getid_cuenta_contable_creditoFK_IdCuentaContableCredito() {
		return this.id_cuenta_contable_creditoFK_IdCuentaContableCredito;
	}

	public void setid_cuenta_contable_creditoFK_IdCuentaContableCredito(Long id_cuenta_contable_creditoFK_IdCuentaContableCredito) {
		this.id_cuenta_contable_creditoFK_IdCuentaContableCredito = id_cuenta_contable_creditoFK_IdCuentaContableCredito;
	}

	public Long id_paisFK_IdPais=-1L;

	public Long getid_paisFK_IdPais() {
		return this.id_paisFK_IdPais;
	}

	public void setid_paisFK_IdPais(Long id_paisFK_IdPais) {
		this.id_paisFK_IdPais = id_paisFK_IdPais;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoRetencionFuenteIvaLogic getTipoRetencionFuenteIvaLogic()	{		
		return tiporetencionfuenteivaLogic;
	}

	public void setTipoRetencionFuenteIvaLogic(TipoRetencionFuenteIvaLogic tiporetencionfuenteivaLogic) {
		this.tiporetencionfuenteivaLogic = tiporetencionfuenteivaLogic;
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
	
	public Boolean getIsEsNuevoTipoRetencionFuenteIva() {
		return isEsNuevoTipoRetencionFuenteIva;
	}

	public void setIsEsNuevoTipoRetencionFuenteIva(Boolean isEsNuevoTipoRetencionFuenteIva) {
		this.isEsNuevoTipoRetencionFuenteIva = isEsNuevoTipoRetencionFuenteIva;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoRetencionFuenteIva() {
		return esParaAccionDesdeFormularioTipoRetencionFuenteIva;
	}
	
	public void setEsParaAccionDesdeFormularioTipoRetencionFuenteIva(Boolean esParaAccionDesdeFormularioTipoRetencionFuenteIva) {
		this.esParaAccionDesdeFormularioTipoRetencionFuenteIva = esParaAccionDesdeFormularioTipoRetencionFuenteIva;
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
	
	
	public void cargarCombosPaissForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.paissForeignKey=new ArrayList<Pais>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PaisLogic paisLogic=new PaisLogic();

			paisLogic.getPaisDataAccess().setIsForForeingKeyData(true);

			if(this.tiporetencionfuenteivaSessionBean==null) {
				this.tiporetencionfuenteivaSessionBean=new TipoRetencionFuenteIvaSessionBean();
			}

			if(!this.tiporetencionfuenteivaSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					paisLogic.getPaisDataAccess().setIsForForeingKeyData(true);

					paisLogic.getTodosPaissWithConnection(sFinalQuery,new Pagination());

					this.paissForeignKey=paisLogic.getPaiss();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPais(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					paisLogic.getEntityWithConnection(tiporetencionfuenteivaSessionBean.getlidPaisActual());
					this.paissForeignKey.add(paisLogic.getPais());
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

			cuentacontableLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

			if(this.tiporetencionfuenteivaSessionBean==null) {
				this.tiporetencionfuenteivaSessionBean=new TipoRetencionFuenteIvaSessionBean();
			}

			if(!this.tiporetencionfuenteivaSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontableLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

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
					cuentacontableLogic.getEntityWithConnection(tiporetencionfuenteivaSessionBean.getlidCuentaContableActual());
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

			cuentacontableLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

			if(this.tiporetencionfuenteivaSessionBean==null) {
				this.tiporetencionfuenteivaSessionBean=new TipoRetencionFuenteIvaSessionBean();
			}

			if(!this.tiporetencionfuenteivaSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableCredito()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontablecreditoLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

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
					cuentacontableLogic.getEntityWithConnection(tiporetencionfuenteivaSessionBean.getlidCuentaContableCreditoActual());
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

	
	
	public void setActualPaisForeignKey(Long idPaisSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(paisTemp!=null) {

					if(this.tiporetencionfuenteiva!=null) {
						this.tiporetencionfuenteiva.setPais(paisTemp);
					}

					if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) {
						this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxid_paisTipoRetencionFuenteIva.setSelectedItem(paisTemp);
					}
				} else {
					//jComboBoxid_paisTipoRetencionFuenteIva.setSelectedItem(paisTemp);
					if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) {
						if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxid_paisTipoRetencionFuenteIva.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxid_paisTipoRetencionFuenteIva.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){
					if(paisTemp!=null && jComboBoxid_paisFK_IdPaisTipoRetencionFuenteIva!=null) {
						jComboBoxid_paisFK_IdPaisTipoRetencionFuenteIva.setSelectedItem(paisTemp);
					} else {
						if(jComboBoxid_paisFK_IdPaisTipoRetencionFuenteIva!=null) {
							//jComboBoxid_paisFK_IdPaisTipoRetencionFuenteIva.setSelectedItem(paisTemp);
							if(jComboBoxid_paisFK_IdPaisTipoRetencionFuenteIva.getItemCount()>0) {
								jComboBoxid_paisFK_IdPaisTipoRetencionFuenteIva.setSelectedIndex(0);
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

	public String getActualPaisForeignKeyDescripcion(Long idPaisSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}


			sDescripcion=PaisConstantesFunciones.getPaisDescripcion(paisTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPaisForeignKeyGenerico(Long idPaisSeleccionado,JComboBox jComboBoxid_paisTipoRetencionFuenteIvaGenerico)throws Exception
	{
		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}

			if(paisTemp!=null) {
				jComboBoxid_paisTipoRetencionFuenteIvaGenerico.setSelectedItem(paisTemp);
			} else {
				if(jComboBoxid_paisTipoRetencionFuenteIvaGenerico!=null && jComboBoxid_paisTipoRetencionFuenteIvaGenerico.getItemCount()>0) {
					jComboBoxid_paisTipoRetencionFuenteIvaGenerico.setSelectedIndex(0);
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

					if(this.tiporetencionfuenteiva!=null) {
						this.tiporetencionfuenteiva.setCuentaContable(cuentacontableTemp);
					}

					if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) {
						this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxid_cuenta_contableTipoRetencionFuenteIva.setSelectedItem(cuentacontableTemp);
					}
				} else {
					//jComboBoxid_cuenta_contableTipoRetencionFuenteIva.setSelectedItem(cuentacontableTemp);
					if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) {
						if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxid_cuenta_contableTipoRetencionFuenteIva.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxid_cuenta_contableTipoRetencionFuenteIva.setSelectedIndex(0);
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
	public void setActualCuentaContableForeignKeyGenerico(Long idCuentaContableSeleccionado,JComboBox jComboBoxid_cuenta_contableTipoRetencionFuenteIvaGenerico)throws Exception
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
				jComboBoxid_cuenta_contableTipoRetencionFuenteIvaGenerico.setSelectedItem(cuentacontableTemp);
			} else {
				if(jComboBoxid_cuenta_contableTipoRetencionFuenteIvaGenerico!=null && jComboBoxid_cuenta_contableTipoRetencionFuenteIvaGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contableTipoRetencionFuenteIvaGenerico.setSelectedIndex(0);
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

					if(this.tiporetencionfuenteiva!=null) {
						this.tiporetencionfuenteiva.setCuentaContableCredito(cuentacontablecreditoTemp);
					}

					if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) {
						this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxid_cuenta_contable_creditoTipoRetencionFuenteIva.setSelectedItem(cuentacontablecreditoTemp);
					}
				} else {
					//jComboBoxid_cuenta_contable_creditoTipoRetencionFuenteIva.setSelectedItem(cuentacontablecreditoTemp);
					if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) {
						if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxid_cuenta_contable_creditoTipoRetencionFuenteIva.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxid_cuenta_contable_creditoTipoRetencionFuenteIva.setSelectedIndex(0);
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
	public void setActualCuentaContableCreditoForeignKeyGenerico(Long idCuentaContableCreditoSeleccionado,JComboBox jComboBoxid_cuenta_contable_creditoTipoRetencionFuenteIvaGenerico)throws Exception
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
				jComboBoxid_cuenta_contable_creditoTipoRetencionFuenteIvaGenerico.setSelectedItem(cuentacontablecreditoTemp);
			} else {
				if(jComboBoxid_cuenta_contable_creditoTipoRetencionFuenteIvaGenerico!=null && jComboBoxid_cuenta_contable_creditoTipoRetencionFuenteIvaGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contable_creditoTipoRetencionFuenteIvaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPaisForeignKey(TipoRetencionFuenteIva tiporetencionfuenteiva,JComboBox jComboBoxid_paisTipoRetencionFuenteIvaGenerico)throws Exception
	{
		try
		{
			Pais  paisAux=new Pais();

			if(jComboBoxid_paisTipoRetencionFuenteIvaGenerico==null) {
				paisAux=(Pais)this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxid_paisTipoRetencionFuenteIva.getSelectedItem();
			} else {
				paisAux=(Pais)jComboBoxid_paisTipoRetencionFuenteIvaGenerico.getSelectedItem();
			}

			if(paisAux!=null && paisAux.getId()!=null) {
				tiporetencionfuenteiva.setid_pais(paisAux.getId());
				tiporetencionfuenteiva.setpais_descripcion(TipoRetencionFuenteIvaConstantesFunciones.getPaisDescripcion(paisAux));
				tiporetencionfuenteiva.setPais(paisAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableForeignKey(TipoRetencionFuenteIva tiporetencionfuenteiva,JComboBox jComboBoxid_cuenta_contableTipoRetencionFuenteIvaGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contableTipoRetencionFuenteIvaGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxid_cuenta_contableTipoRetencionFuenteIva.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contableTipoRetencionFuenteIvaGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null) {
				tiporetencionfuenteiva.setid_cuenta_contable(cuentacontableAux.getId());
				tiporetencionfuenteiva.setcuentacontable_descripcion(TipoRetencionFuenteIvaConstantesFunciones.getCuentaContableDescripcion(cuentacontableAux));
				tiporetencionfuenteiva.setCuentaContable(cuentacontableAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableCreditoForeignKey(TipoRetencionFuenteIva tiporetencionfuenteiva,JComboBox jComboBoxid_cuenta_contable_creditoTipoRetencionFuenteIvaGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contable_creditoTipoRetencionFuenteIvaGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxid_cuenta_contable_creditoTipoRetencionFuenteIva.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contable_creditoTipoRetencionFuenteIvaGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null) {
				tiporetencionfuenteiva.setid_cuenta_contable_credito(cuentacontableAux.getId());
				tiporetencionfuenteiva.setcuentacontablecredito_descripcion(TipoRetencionFuenteIvaConstantesFunciones.getCuentaContableCreditoDescripcion(cuentacontableAux));
				tiporetencionfuenteiva.setCuentaContableCredito(cuentacontableAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePaissForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPais=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TipoRetencionFuenteIvaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) { 
							this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxid_paisTipoRetencionFuenteIva.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxid_paisTipoRetencionFuenteIva.addItem(pais);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) { 
					}

					if(!TipoRetencionFuenteIvaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TipoRetencionFuenteIvaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_paisFK_IdPaisTipoRetencionFuenteIva.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jComboBoxid_paisFK_IdPaisTipoRetencionFuenteIva.addItem(pais);
							}
						}

						if(!TipoRetencionFuenteIvaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!TipoRetencionFuenteIvaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) { 
							this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxid_cuenta_contableTipoRetencionFuenteIva.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxid_cuenta_contableTipoRetencionFuenteIva.addItem(cuentacontable);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) { 
					}

					if(!TipoRetencionFuenteIvaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


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

					if(!TipoRetencionFuenteIvaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) { 
							this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxid_cuenta_contable_creditoTipoRetencionFuenteIva.removeAllItems();

							for(CuentaContable cuentacontablecredito:this.cuentacontablecreditosForeignKey) {
								this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxid_cuenta_contable_creditoTipoRetencionFuenteIva.addItem(cuentacontablecredito);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) { 
					}

					if(!TipoRetencionFuenteIvaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFramePaisForeignKey(Pais pais,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) {
							this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxid_paisTipoRetencionFuenteIva.setSelectedItem(pais);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) {
							this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxid_paisTipoRetencionFuenteIva.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_paisFK_IdPaisTipoRetencionFuenteIva.setSelectedItem(pais);
						} else {
							this.jComboBoxid_paisFK_IdPaisTipoRetencionFuenteIva.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) {
							this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxid_cuenta_contableTipoRetencionFuenteIva.setSelectedItem(cuentacontable);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) {
							this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxid_cuenta_contableTipoRetencionFuenteIva.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameCuentaContableCreditoForeignKey(CuentaContable cuentacontablecredito,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) {
							this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxid_cuenta_contable_creditoTipoRetencionFuenteIva.setSelectedItem(cuentacontablecredito);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) {
							this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxid_cuenta_contable_creditoTipoRetencionFuenteIva.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoRetencionFuenteIva() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoRetencionFuenteIvaConstantesFunciones.refrescarForeignKeysDescripcionesTipoRetencionFuenteIva(this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoRetencionFuenteIvaConstantesFunciones.refrescarForeignKeysDescripcionesTipoRetencionFuenteIva(this.tiporetencionfuenteivas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Pais.class));
		classes.add(new Classe(CuentaContable.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tiporetencionfuenteivaLogic.setTipoRetencionFuenteIvas(this.tiporetencionfuenteivas);
			tiporetencionfuenteivaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoRetencionFuenteIvaParameterReturnGeneral getTipoRetencionFuenteIvaParameterGeneral() {
		return this.tiporetencionfuenteivaParameterGeneral;
	}
	
	public void setTipoRetencionFuenteIvaParameterGeneral(TipoRetencionFuenteIvaParameterReturnGeneral tiporetencionfuenteivaParameterGeneral) {
		this.tiporetencionfuenteivaParameterGeneral = tiporetencionfuenteivaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoRetencionFuenteIva() {
		return isPermisoTodoTipoRetencionFuenteIva;
	}

	public void setIsPermisoTodoTipoRetencionFuenteIva(Boolean isPermisoTodoTipoRetencionFuenteIva) {
		this.isPermisoTodoTipoRetencionFuenteIva = isPermisoTodoTipoRetencionFuenteIva;
	}

	public Boolean getIsPermisoNuevoTipoRetencionFuenteIva() {
		return isPermisoNuevoTipoRetencionFuenteIva;
	}

	public void setIsPermisoNuevoTipoRetencionFuenteIva(Boolean isPermisoNuevoTipoRetencionFuenteIva) {
		this.isPermisoNuevoTipoRetencionFuenteIva = isPermisoNuevoTipoRetencionFuenteIva;
	}

	public Boolean getIsPermisoActualizarTipoRetencionFuenteIva() {
		return isPermisoActualizarTipoRetencionFuenteIva;
	}

	public void setIsPermisoActualizarTipoRetencionFuenteIva(Boolean isPermisoActualizarTipoRetencionFuenteIva) {
		this.isPermisoActualizarTipoRetencionFuenteIva = isPermisoActualizarTipoRetencionFuenteIva;
	}

	public Boolean getIsPermisoEliminarTipoRetencionFuenteIva() {
		return isPermisoEliminarTipoRetencionFuenteIva;
	}

	public void setIsPermisoEliminarTipoRetencionFuenteIva(Boolean isPermisoEliminarTipoRetencionFuenteIva) {
		this.isPermisoEliminarTipoRetencionFuenteIva = isPermisoEliminarTipoRetencionFuenteIva;
	}

	public Boolean getIsPermisoGuardarCambiosTipoRetencionFuenteIva() {
		return isPermisoGuardarCambiosTipoRetencionFuenteIva;
	}

	public void setIsPermisoGuardarCambiosTipoRetencionFuenteIva(Boolean isPermisoGuardarCambiosTipoRetencionFuenteIva) {
		this.isPermisoGuardarCambiosTipoRetencionFuenteIva = isPermisoGuardarCambiosTipoRetencionFuenteIva;
	}
	
	public Boolean getIsPermisoConsultaTipoRetencionFuenteIva() {
		return isPermisoConsultaTipoRetencionFuenteIva;
	}

	public void setIsPermisoConsultaTipoRetencionFuenteIva(Boolean isPermisoConsultaTipoRetencionFuenteIva) {
		this.isPermisoConsultaTipoRetencionFuenteIva = isPermisoConsultaTipoRetencionFuenteIva;
	}

	public Boolean getIsPermisoBusquedaTipoRetencionFuenteIva() {
		return isPermisoBusquedaTipoRetencionFuenteIva;
	}

	public void setIsPermisoBusquedaTipoRetencionFuenteIva(Boolean isPermisoBusquedaTipoRetencionFuenteIva) {
		this.isPermisoBusquedaTipoRetencionFuenteIva = isPermisoBusquedaTipoRetencionFuenteIva;
	}

	public Boolean getIsPermisoReporteTipoRetencionFuenteIva() {
		return isPermisoReporteTipoRetencionFuenteIva;
	}

	public void setIsPermisoReporteTipoRetencionFuenteIva(Boolean isPermisoReporteTipoRetencionFuenteIva) {
		this.isPermisoReporteTipoRetencionFuenteIva = isPermisoReporteTipoRetencionFuenteIva;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoRetencionFuenteIva() {
		return isPermisoPaginacionMedioTipoRetencionFuenteIva;
	}

	public void setIsPermisoPaginacionMedioTipoRetencionFuenteIva(Boolean isPermisoPaginacionMedioTipoRetencionFuenteIva) {
		this.isPermisoPaginacionMedioTipoRetencionFuenteIva = isPermisoPaginacionMedioTipoRetencionFuenteIva;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoRetencionFuenteIva() {
		return isPermisoPaginacionTodoTipoRetencionFuenteIva;
	}

	public void setIsPermisoPaginacionTodoTipoRetencionFuenteIva(Boolean isPermisoPaginacionTodoTipoRetencionFuenteIva) {
		this.isPermisoPaginacionTodoTipoRetencionFuenteIva = isPermisoPaginacionTodoTipoRetencionFuenteIva;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoRetencionFuenteIva() {
		return isPermisoPaginacionAltoTipoRetencionFuenteIva;
	}

	public void setIsPermisoPaginacionAltoTipoRetencionFuenteIva(Boolean isPermisoPaginacionAltoTipoRetencionFuenteIva) {
		this.isPermisoPaginacionAltoTipoRetencionFuenteIva = isPermisoPaginacionAltoTipoRetencionFuenteIva;
	}
	
	public Boolean getIsPermisoCopiarTipoRetencionFuenteIva() {
		return isPermisoCopiarTipoRetencionFuenteIva;
	}

	public void setIsPermisoCopiarTipoRetencionFuenteIva(Boolean isPermisoCopiarTipoRetencionFuenteIva) {
		this.isPermisoCopiarTipoRetencionFuenteIva = isPermisoCopiarTipoRetencionFuenteIva;
	}
	
	public Boolean getIsPermisoVerFormTipoRetencionFuenteIva() {
		return isPermisoVerFormTipoRetencionFuenteIva;
	}

	public void setIsPermisoVerFormTipoRetencionFuenteIva(Boolean isPermisoVerFormTipoRetencionFuenteIva) {
		this.isPermisoVerFormTipoRetencionFuenteIva = isPermisoVerFormTipoRetencionFuenteIva;
	}
	
	public Boolean getIsPermisoDuplicarTipoRetencionFuenteIva() {
		return isPermisoDuplicarTipoRetencionFuenteIva;
	}

	public void setIsPermisoDuplicarTipoRetencionFuenteIva(Boolean isPermisoDuplicarTipoRetencionFuenteIva) {
		this.isPermisoDuplicarTipoRetencionFuenteIva = isPermisoDuplicarTipoRetencionFuenteIva;
	}
	
	public Boolean getIsPermisoOrdenTipoRetencionFuenteIva() {
		return isPermisoOrdenTipoRetencionFuenteIva;
	}

	public void setIsPermisoOrdenTipoRetencionFuenteIva(Boolean isPermisoOrdenTipoRetencionFuenteIva) {
		this.isPermisoOrdenTipoRetencionFuenteIva = isPermisoOrdenTipoRetencionFuenteIva;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoRetencionFuenteIva() {
		return isVisibilidadCeldaNuevoTipoRetencionFuenteIva;
	}

	public void setIsVisibilidadCeldaNuevoTipoRetencionFuenteIva(Boolean isVisibilidadCeldaNuevoTipoRetencionFuenteIva) {
		this.isVisibilidadCeldaNuevoTipoRetencionFuenteIva = isVisibilidadCeldaNuevoTipoRetencionFuenteIva;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoRetencionFuenteIva() {
		return isVisibilidadCeldaDuplicarTipoRetencionFuenteIva;
	}

	public void setIsVisibilidadCeldaDuplicarTipoRetencionFuenteIva(Boolean isVisibilidadCeldaDuplicarTipoRetencionFuenteIva) {
		this.isVisibilidadCeldaDuplicarTipoRetencionFuenteIva = isVisibilidadCeldaDuplicarTipoRetencionFuenteIva;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoRetencionFuenteIva() {
		return isVisibilidadCeldaCopiarTipoRetencionFuenteIva;
	}

	public void setIsVisibilidadCeldaCopiarTipoRetencionFuenteIva(Boolean isVisibilidadCeldaCopiarTipoRetencionFuenteIva) {
		this.isVisibilidadCeldaCopiarTipoRetencionFuenteIva = isVisibilidadCeldaCopiarTipoRetencionFuenteIva;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoRetencionFuenteIva() {
		return isVisibilidadCeldaVerFormTipoRetencionFuenteIva;
	}

	public void setIsVisibilidadCeldaVerFormTipoRetencionFuenteIva(Boolean isVisibilidadCeldaVerFormTipoRetencionFuenteIva) {
		this.isVisibilidadCeldaVerFormTipoRetencionFuenteIva = isVisibilidadCeldaVerFormTipoRetencionFuenteIva;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoRetencionFuenteIva() {
		return isVisibilidadCeldaOrdenTipoRetencionFuenteIva;
	}

	public void setIsVisibilidadCeldaOrdenTipoRetencionFuenteIva(Boolean isVisibilidadCeldaOrdenTipoRetencionFuenteIva) {
		this.isVisibilidadCeldaOrdenTipoRetencionFuenteIva = isVisibilidadCeldaOrdenTipoRetencionFuenteIva;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoRetencionFuenteIva() {
		return isVisibilidadCeldaNuevoRelacionesTipoRetencionFuenteIva;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoRetencionFuenteIva(Boolean isVisibilidadCeldaNuevoRelacionesTipoRetencionFuenteIva) {
		this.isVisibilidadCeldaNuevoRelacionesTipoRetencionFuenteIva = isVisibilidadCeldaNuevoRelacionesTipoRetencionFuenteIva;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoRetencionFuenteIva() {
		return isVisibilidadCeldaModificarTipoRetencionFuenteIva;
	}

	public void setIsVisibilidadCeldaModificarTipoRetencionFuenteIva(Boolean isVisibilidadCeldaModificarTipoRetencionFuenteIva) {
		this.isVisibilidadCeldaModificarTipoRetencionFuenteIva = isVisibilidadCeldaModificarTipoRetencionFuenteIva;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoRetencionFuenteIva() {
		return isVisibilidadCeldaActualizarTipoRetencionFuenteIva;
	}

	public void setIsVisibilidadCeldaActualizarTipoRetencionFuenteIva(Boolean isVisibilidadCeldaActualizarTipoRetencionFuenteIva) {
		this.isVisibilidadCeldaActualizarTipoRetencionFuenteIva = isVisibilidadCeldaActualizarTipoRetencionFuenteIva;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoRetencionFuenteIva() {
		return isVisibilidadCeldaEliminarTipoRetencionFuenteIva;
	}

	public void setIsVisibilidadCeldaEliminarTipoRetencionFuenteIva(Boolean isVisibilidadCeldaEliminarTipoRetencionFuenteIva) {
		this.isVisibilidadCeldaEliminarTipoRetencionFuenteIva = isVisibilidadCeldaEliminarTipoRetencionFuenteIva;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoRetencionFuenteIva() {
		return isVisibilidadCeldaCancelarTipoRetencionFuenteIva;
	}

	public void setIsVisibilidadCeldaCancelarTipoRetencionFuenteIva(Boolean isVisibilidadCeldaCancelarTipoRetencionFuenteIva) {
		this.isVisibilidadCeldaCancelarTipoRetencionFuenteIva = isVisibilidadCeldaCancelarTipoRetencionFuenteIva;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoRetencionFuenteIva() {
		return isVisibilidadCeldaGuardarTipoRetencionFuenteIva;
	}

	public void setIsVisibilidadCeldaGuardarTipoRetencionFuenteIva(Boolean isVisibilidadCeldaGuardarTipoRetencionFuenteIva) {
		this.isVisibilidadCeldaGuardarTipoRetencionFuenteIva = isVisibilidadCeldaGuardarTipoRetencionFuenteIva;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoRetencionFuenteIva() {
		return isVisibilidadCeldaGuardarCambiosTipoRetencionFuenteIva;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoRetencionFuenteIva(Boolean isVisibilidadCeldaGuardarCambiosTipoRetencionFuenteIva) {
		this.isVisibilidadCeldaGuardarCambiosTipoRetencionFuenteIva = isVisibilidadCeldaGuardarCambiosTipoRetencionFuenteIva;
	}
		
	public TipoRetencionFuenteIvaSessionBean gettiporetencionfuenteivaSessionBean() {
		return this.tiporetencionfuenteivaSessionBean;
	}
	
	public void settiporetencionfuenteivaSessionBean(TipoRetencionFuenteIvaSessionBean tiporetencionfuenteivaSessionBean) {
		this.tiporetencionfuenteivaSessionBean=tiporetencionfuenteivaSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorCodigo() {
		return this.isVisibilidadBusquedaPorCodigo;
	}

	public void setisVisibilidadBusquedaPorCodigo(Boolean isVisibilidadBusquedaPorCodigo) {
		this.isVisibilidadBusquedaPorCodigo=isVisibilidadBusquedaPorCodigo;
	}

	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	public Boolean getisVisibilidadFK_IdCuentaContable() {
		return this.isVisibilidadFK_IdCuentaContable;
	}

	public void setisVisibilidadFK_IdCuentaContable(Boolean isVisibilidadFK_IdCuentaContable) {
		this.isVisibilidadFK_IdCuentaContable=isVisibilidadFK_IdCuentaContable;
	}

	public Boolean getisVisibilidadFK_IdCuentaContableCredito() {
		return this.isVisibilidadFK_IdCuentaContableCredito;
	}

	public void setisVisibilidadFK_IdCuentaContableCredito(Boolean isVisibilidadFK_IdCuentaContableCredito) {
		this.isVisibilidadFK_IdCuentaContableCredito=isVisibilidadFK_IdCuentaContableCredito;
	}

	public Boolean getisVisibilidadFK_IdPais() {
		return this.isVisibilidadFK_IdPais;
	}

	public void setisVisibilidadFK_IdPais(Boolean isVisibilidadFK_IdPais) {
		this.isVisibilidadFK_IdPais=isVisibilidadFK_IdPais;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoRetencionFuenteIva(TipoRetencionFuenteIva tiporetencionfuenteiva)throws Exception {
		try {
			
				this.setActualParaGuardarPaisForeignKey(tiporetencionfuenteiva,null);
				this.setActualParaGuardarCuentaContableForeignKey(tiporetencionfuenteiva,null);
				this.setActualParaGuardarCuentaContableCreditoForeignKey(tiporetencionfuenteiva,null);
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
	
	public void bugActualizarReferenciaActual(TipoRetencionFuenteIva tiporetencionfuenteiva,TipoRetencionFuenteIva tiporetencionfuenteivaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoRetencionFuenteIva(tiporetencionfuenteiva);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tiporetencionfuenteivaAux.setId(tiporetencionfuenteiva.getId());
		tiporetencionfuenteivaAux.setVersionRow(tiporetencionfuenteiva.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoRetencionFuenteIva();
		
			int intSelectedRow = this.jTableDatosTipoRetencionFuenteIva.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteiva =(TipoRetencionFuenteIva) this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tiporetencionfuenteiva =(TipoRetencionFuenteIva) this.tiporetencionfuenteivas.toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoRetencionFuenteIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoRetencionFuenteIva(this.tiporetencionfuenteiva,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencionFuenteIva(this.tiporetencionfuenteiva);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tiporetencionfuenteivaValidator.getInvalidValues(this.tiporetencionfuenteiva);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tiporetencionfuenteivaLogic.setDatosCliente(datosCliente);
			tiporetencionfuenteivaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tiporetencionfuenteivaAux=new  TipoRetencionFuenteIva();
				
				tiporetencionfuenteivaAux.setIsNew(true);
				tiporetencionfuenteivaAux.setIsChanged(true);
				
				tiporetencionfuenteivaAux.setTipoRetencionFuenteIvaOriginal(this.tiporetencionfuenteiva);
				
				tiporetencionfuenteivaAux.setId(this.tiporetencionfuenteiva.getId());	
				tiporetencionfuenteivaAux.setVersionRow(this.tiporetencionfuenteiva.getVersionRow());	
				tiporetencionfuenteivaAux.setid_pais(this.tiporetencionfuenteiva.getid_pais());	
				tiporetencionfuenteivaAux.setcodigo(this.tiporetencionfuenteiva.getcodigo());	
				tiporetencionfuenteivaAux.setnombre(this.tiporetencionfuenteiva.getnombre());	
				tiporetencionfuenteivaAux.setporcentaje(this.tiporetencionfuenteiva.getporcentaje());	
				tiporetencionfuenteivaAux.setmonto_minimo(this.tiporetencionfuenteiva.getmonto_minimo());	
				tiporetencionfuenteivaAux.setid_cuenta_contable(this.tiporetencionfuenteiva.getid_cuenta_contable());	
				tiporetencionfuenteivaAux.setid_cuenta_contable_credito(this.tiporetencionfuenteiva.getid_cuenta_contable_credito());	
				tiporetencionfuenteivaAux.setes_retencion_iva(this.tiporetencionfuenteiva.getes_retencion_iva());	
				tiporetencionfuenteivaAux.setes_debito(this.tiporetencionfuenteiva.getes_debito());	
				tiporetencionfuenteivaAux.setes_con_iva_factura(this.tiporetencionfuenteiva.getes_con_iva_factura());	
				tiporetencionfuenteivaAux.setes_con_sub_total_factura(this.tiporetencionfuenteiva.getes_con_sub_total_factura());	
				tiporetencionfuenteivaAux.setes_con_secuencial(this.tiporetencionfuenteiva.getes_con_secuencial());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tiporetencionfuenteivaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tiporetencionfuenteivaAux,tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiporetencionfuenteivaAux,tiporetencionfuenteivas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tiporetencionfuenteivaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporetencionfuenteivaLogic.saveTipoRetencionFuenteIvas();//WithConnection
						//tiporetencionfuenteivaLogic.getSetVersionRowTipoRetencionFuenteIvas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tiporetencionfuenteiva,tiporetencionfuenteivaAux);
					
					this.refrescarForeignKeysDescripcionesTipoRetencionFuenteIva();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tiporetencionfuenteivaAux=new  TipoRetencionFuenteIva();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado() 
					|| (this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado() && this.tiporetencionfuenteiva.getId()>=0)) {
						
					tiporetencionfuenteivaAux.setIsNew(false);
				}
				
				tiporetencionfuenteivaAux.setIsDeleted(false);
			
				tiporetencionfuenteivaAux.setId(this.tiporetencionfuenteiva.getId());	
				tiporetencionfuenteivaAux.setVersionRow(this.tiporetencionfuenteiva.getVersionRow());	
				tiporetencionfuenteivaAux.setid_pais(this.tiporetencionfuenteiva.getid_pais());	
				tiporetencionfuenteivaAux.setcodigo(this.tiporetencionfuenteiva.getcodigo());	
				tiporetencionfuenteivaAux.setnombre(this.tiporetencionfuenteiva.getnombre());	
				tiporetencionfuenteivaAux.setporcentaje(this.tiporetencionfuenteiva.getporcentaje());	
				tiporetencionfuenteivaAux.setmonto_minimo(this.tiporetencionfuenteiva.getmonto_minimo());	
				tiporetencionfuenteivaAux.setid_cuenta_contable(this.tiporetencionfuenteiva.getid_cuenta_contable());	
				tiporetencionfuenteivaAux.setid_cuenta_contable_credito(this.tiporetencionfuenteiva.getid_cuenta_contable_credito());	
				tiporetencionfuenteivaAux.setes_retencion_iva(this.tiporetencionfuenteiva.getes_retencion_iva());	
				tiporetencionfuenteivaAux.setes_debito(this.tiporetencionfuenteiva.getes_debito());	
				tiporetencionfuenteivaAux.setes_con_iva_factura(this.tiporetencionfuenteiva.getes_con_iva_factura());	
				tiporetencionfuenteivaAux.setes_con_sub_total_factura(this.tiporetencionfuenteiva.getes_con_sub_total_factura());	
				tiporetencionfuenteivaAux.setes_con_secuencial(this.tiporetencionfuenteiva.getes_con_secuencial());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tiporetencionfuenteivaAux,tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiporetencionfuenteivaAux,tiporetencionfuenteivas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tiporetencionfuenteivaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporetencionfuenteivaLogic.saveTipoRetencionFuenteIvas();//WithConnection
						//tiporetencionfuenteivaLogic.getSetVersionRowTipoRetencionFuenteIvas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tiporetencionfuenteiva,tiporetencionfuenteivaAux);
					
					this.refrescarForeignKeysDescripcionesTipoRetencionFuenteIva();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tiporetencionfuenteivaAux=new  TipoRetencionFuenteIva();
				
				tiporetencionfuenteivaAux.setIsNew(false);
				tiporetencionfuenteivaAux.setIsChanged(false);
				
				tiporetencionfuenteivaAux.setIsDeleted(true);
				
				tiporetencionfuenteivaAux.setId(this.tiporetencionfuenteiva.getId());	
				tiporetencionfuenteivaAux.setVersionRow(this.tiporetencionfuenteiva.getVersionRow());	
				tiporetencionfuenteivaAux.setid_pais(this.tiporetencionfuenteiva.getid_pais());	
				tiporetencionfuenteivaAux.setcodigo(this.tiporetencionfuenteiva.getcodigo());	
				tiporetencionfuenteivaAux.setnombre(this.tiporetencionfuenteiva.getnombre());	
				tiporetencionfuenteivaAux.setporcentaje(this.tiporetencionfuenteiva.getporcentaje());	
				tiporetencionfuenteivaAux.setmonto_minimo(this.tiporetencionfuenteiva.getmonto_minimo());	
				tiporetencionfuenteivaAux.setid_cuenta_contable(this.tiporetencionfuenteiva.getid_cuenta_contable());	
				tiporetencionfuenteivaAux.setid_cuenta_contable_credito(this.tiporetencionfuenteiva.getid_cuenta_contable_credito());	
				tiporetencionfuenteivaAux.setes_retencion_iva(this.tiporetencionfuenteiva.getes_retencion_iva());	
				tiporetencionfuenteivaAux.setes_debito(this.tiporetencionfuenteiva.getes_debito());	
				tiporetencionfuenteivaAux.setes_con_iva_factura(this.tiporetencionfuenteiva.getes_con_iva_factura());	
				tiporetencionfuenteivaAux.setes_con_sub_total_factura(this.tiporetencionfuenteiva.getes_con_sub_total_factura());	
				tiporetencionfuenteivaAux.setes_con_secuencial(this.tiporetencionfuenteiva.getes_con_secuencial());	
				
				if(this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tiporetencionfuenteivaAux.getId()>=0) {	
						this.tiporetencionfuenteivasEliminados.add(tiporetencionfuenteivaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tiporetencionfuenteivaAux,tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiporetencionfuenteivaAux,tiporetencionfuenteivas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tiporetencionfuenteivaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporetencionfuenteivaLogic.saveTipoRetencionFuenteIvas();//WithConnection
						//tiporetencionfuenteivaLogic.getSetVersionRowTipoRetencionFuenteIvas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().addAll(this.tiporetencionfuenteivasEliminados);
					
					tiporetencionfuenteivaLogic.saveTipoRetencionFuenteIvas();//WithConnection
					//tiporetencionfuenteivaLogic.getSetVersionRowTipoRetencionFuenteIvas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoRetencionFuenteIva();
				
				this.tiporetencionfuenteivasEliminados= new ArrayList<TipoRetencionFuenteIva>();		
			}
			
			if(this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Retencion Fuente Iva GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Retencion Fuente Iva",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tiporetencionfuenteiva=tiporetencionfuenteivaAux;
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
      		//this.finishProcessTipoRetencionFuenteIva();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoRetencionFuenteIva tiporetencionfuenteivaLocal) throws Exception {
		
		if(this.tiporetencionfuenteivaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoRetencionFuenteIva tiporetencionfuenteivaLocal) throws Exception {	
		if(this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(PaisDetalleFormJInternalFrame.class)) {
				PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrameLocal=(PaisBeanSwingJInternalFrame) ((PaisDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				paisBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPais(paisBeanSwingJInternalFrameLocal.getpais(),true);
				paisBeanSwingJInternalFrameLocal.actualizarLista(paisBeanSwingJInternalFrameLocal.pais,this.paissForeignKey);

				paisBeanSwingJInternalFrameLocal.actualizarRelaciones(paisBeanSwingJInternalFrameLocal.pais);

				tiporetencionfuenteivaLocal.setPais(paisBeanSwingJInternalFrameLocal.pais);

				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey("Formulario");
				this.setActualPaisForeignKey(paisBeanSwingJInternalFrameLocal.pais.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontableBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontableBeanSwingJInternalFrameLocal.actualizarLista(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontablesForeignKey);

				cuentacontableBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				tiporetencionfuenteivaLocal.setCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContable();
				this.cargarCombosFrameCuentaContablesForeignKey("Formulario");
				this.setActualCuentaContableForeignKey(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontablecreditoBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontablecreditoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontablecreditoBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontablecreditoBeanSwingJInternalFrameLocal.actualizarLista(cuentacontablecreditoBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontablecreditosForeignKey);

				cuentacontablecreditoBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontablecreditoBeanSwingJInternalFrameLocal.cuentacontable);

				tiporetencionfuenteivaLocal.setCuentaContableCredito(cuentacontablecreditoBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContableCredito();
				this.cargarCombosFrameCuentaContableCreditosForeignKey("Formulario");
				this.setActualCuentaContableCreditoForeignKey(cuentacontablecreditoBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoRetencionFuenteIvaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoRetencionFuenteIva.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tiporetencionfuenteiva =(TipoRetencionFuenteIva) this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tiporetencionfuenteiva =(TipoRetencionFuenteIva) this.tiporetencionfuenteivas.toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tiporetencionfuenteivaValidator.getInvalidValues(this.tiporetencionfuenteiva);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoRetencionFuenteIva tiporetencionfuenteiva,List<TipoRetencionFuenteIva> tiporetencionfuenteivas) throws Exception {
		try	{		
			TipoRetencionFuenteIvaConstantesFunciones.actualizarLista(tiporetencionfuenteiva,tiporetencionfuenteivas,this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoRetencionFuenteIva tiporetencionfuenteiva,List<TipoRetencionFuenteIva> tiporetencionfuenteivas) throws Exception {
		try	{			
			TipoRetencionFuenteIvaConstantesFunciones.actualizarSelectedLista(tiporetencionfuenteiva,tiporetencionfuenteivas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoRetencionFuenteIva> tiporetencionfuenteivasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tiporetencionfuenteivasLocal=this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tiporetencionfuenteivasLocal=this.tiporetencionfuenteivas;
			}
			//ARCHITECTURE
		
			for(TipoRetencionFuenteIva tiporetencionfuenteivaLocal:tiporetencionfuenteivasLocal) {
				if(this.permiteMantenimiento(tiporetencionfuenteivaLocal) && tiporetencionfuenteivaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoRetencionFuenteIvaConstantesFunciones.getTipoRetencionFuenteIvaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoRetencionFuenteIvaConstantesFunciones.IDPAIS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jLabelid_paisTipoRetencionFuenteIva,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoRetencionFuenteIvaConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jLabelcodigoTipoRetencionFuenteIva,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoRetencionFuenteIvaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jLabelnombreTipoRetencionFuenteIva,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoRetencionFuenteIvaConstantesFunciones.PORCENTAJE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jLabelporcentajeTipoRetencionFuenteIva,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoRetencionFuenteIvaConstantesFunciones.MONTOMINIMO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jLabelmonto_minimoTipoRetencionFuenteIva,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoRetencionFuenteIvaConstantesFunciones.IDCUENTACONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jLabelid_cuenta_contableTipoRetencionFuenteIva,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoRetencionFuenteIvaConstantesFunciones.IDCUENTACONTABLECREDITO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jLabelid_cuenta_contable_creditoTipoRetencionFuenteIva,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoRetencionFuenteIvaConstantesFunciones.ESRETENCIONIVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jLabeles_retencion_ivaTipoRetencionFuenteIva,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoRetencionFuenteIvaConstantesFunciones.ESDEBITO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jLabeles_debitoTipoRetencionFuenteIva,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoRetencionFuenteIvaConstantesFunciones.ESCONIVAFACTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jLabeles_con_iva_facturaTipoRetencionFuenteIva,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoRetencionFuenteIvaConstantesFunciones.ESCONSUBTOTALFACTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jLabeles_con_sub_total_facturaTipoRetencionFuenteIva,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoRetencionFuenteIvaConstantesFunciones.ESCONSECUENCIAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jLabeles_con_secuencialTipoRetencionFuenteIva,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jLabelid_paisTipoRetencionFuenteIva,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jLabelcodigoTipoRetencionFuenteIva,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jLabelnombreTipoRetencionFuenteIva,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jLabelporcentajeTipoRetencionFuenteIva,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jLabelmonto_minimoTipoRetencionFuenteIva,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jLabelid_cuenta_contableTipoRetencionFuenteIva,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jLabelid_cuenta_contable_creditoTipoRetencionFuenteIva,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jLabeles_retencion_ivaTipoRetencionFuenteIva,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jLabeles_debitoTipoRetencionFuenteIva,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jLabeles_con_iva_facturaTipoRetencionFuenteIva,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jLabeles_con_sub_total_facturaTipoRetencionFuenteIva,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jLabeles_con_secuencialTipoRetencionFuenteIva,"");
		
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
		this.iIdNuevoTipoRetencionFuenteIva--;	
		
		
		this.tiporetencionfuenteivaAux=new TipoRetencionFuenteIva();
		
		this.tiporetencionfuenteivaAux.setId(this.iIdNuevoTipoRetencionFuenteIva);
		this.tiporetencionfuenteivaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().add(this.tiporetencionfuenteivaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tiporetencionfuenteivas.add(this.tiporetencionfuenteivaAux);
		}
		//ARCHITECTURE
		
		this.tiporetencionfuenteiva=this.tiporetencionfuenteivaAux;
		
		if(TipoRetencionFuenteIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoRetencionFuenteIva(this.tiporetencionfuenteiva);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoRetencionFuenteIva(this.tiporetencionfuenteiva);
		}
				
		//this.setDefaultControlesTipoRetencionFuenteIva();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoRetencionFuenteIva();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoRetencionFuenteIva();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoRetencionFuenteIva();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoRetencionFuenteIva(this.tiporetencionfuenteivaBean,this.tiporetencionfuenteiva,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencionFuenteIva(this.tiporetencionfuenteiva);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tiporetencionfuenteivaSessionBean.getConGuardarRelaciones()) {
			classes=TipoRetencionFuenteIvaConstantesFunciones.getClassesRelationshipsOfTipoRetencionFuenteIva(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tiporetencionfuenteivaReturnGeneral=tiporetencionfuenteivaLogic.procesarEventosTipoRetencionFuenteIvasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas(),this.tiporetencionfuenteiva,this.tiporetencionfuenteivaParameterGeneral,this.isEsNuevoTipoRetencionFuenteIva,classes);//this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIva()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoRetencionFuenteIva(this.tiporetencionfuenteivaReturnGeneral,this.tiporetencionfuenteivaBean,false);
		
		if(this.tiporetencionfuenteivaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoRetencionFuenteIva(this.tiporetencionfuenteivaReturnGeneral.getTipoRetencionFuenteIva());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoRetencionFuenteIva(this.tiporetencionfuenteivaReturnGeneral.getTipoRetencionFuenteIva());
		}
		
		if(this.tiporetencionfuenteivaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoRetencionFuenteIva(this.tiporetencionfuenteivaReturnGeneral.getTipoRetencionFuenteIva(),classes);//this.tiporetencionfuenteivaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoRetencionFuenteIva(this.tiporetencionfuenteiva,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoRetencionFuenteIva();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoRetencionFuenteIva();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional.RecargarFormTipoRetencionFuenteIva(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoRetencionFuenteIva(false);
						
			if(tiporetencionfuenteivaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoRetencionFuenteIvaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoRetencionFuenteIva();
			}
			
			this.actualizarVisualTableDatosTipoRetencionFuenteIva();
			
			this.jTableDatosTipoRetencionFuenteIva.setRowSelectionInterval(this.getIndiceNuevoTipoRetencionFuenteIva(), this.getIndiceNuevoTipoRetencionFuenteIva());
			
			this.seleccionarFilaTablaTipoRetencionFuenteIvaActual();
						
			this.actualizarEstadoCeldasBotonesTipoRetencionFuenteIva("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoRetencionFuenteIva(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jTextFieldcodigoTipoRetencionFuenteIva.setEnabled(isHabilitar && this.tiporetencionfuenteivaConstantesFunciones.activarcodigoTipoRetencionFuenteIva);
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jTextAreanombreTipoRetencionFuenteIva.setEnabled(isHabilitar && this.tiporetencionfuenteivaConstantesFunciones.activarnombreTipoRetencionFuenteIva);
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jTextFieldporcentajeTipoRetencionFuenteIva.setEnabled(isHabilitar && this.tiporetencionfuenteivaConstantesFunciones.activarporcentajeTipoRetencionFuenteIva);
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jTextFieldmonto_minimoTipoRetencionFuenteIva.setEnabled(isHabilitar && this.tiporetencionfuenteivaConstantesFunciones.activarmonto_minimoTipoRetencionFuenteIva);
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jCheckBoxes_retencion_ivaTipoRetencionFuenteIva.setEnabled(isHabilitar && this.tiporetencionfuenteivaConstantesFunciones.activares_retencion_ivaTipoRetencionFuenteIva);
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jCheckBoxes_debitoTipoRetencionFuenteIva.setEnabled(isHabilitar && this.tiporetencionfuenteivaConstantesFunciones.activares_debitoTipoRetencionFuenteIva);
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jCheckBoxes_con_iva_facturaTipoRetencionFuenteIva.setEnabled(isHabilitar && this.tiporetencionfuenteivaConstantesFunciones.activares_con_iva_facturaTipoRetencionFuenteIva);
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jCheckBoxes_con_sub_total_facturaTipoRetencionFuenteIva.setEnabled(isHabilitar && this.tiporetencionfuenteivaConstantesFunciones.activares_con_sub_total_facturaTipoRetencionFuenteIva);
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jCheckBoxes_con_secuencialTipoRetencionFuenteIva.setEnabled(isHabilitar && this.tiporetencionfuenteivaConstantesFunciones.activares_con_secuencialTipoRetencionFuenteIva);	
		
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxid_paisTipoRetencionFuenteIva.setEnabled(isHabilitar && this.tiporetencionfuenteivaConstantesFunciones.activarid_paisTipoRetencionFuenteIva);
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxid_cuenta_contableTipoRetencionFuenteIva.setEnabled(isHabilitar && this.tiporetencionfuenteivaConstantesFunciones.activarid_cuenta_contableTipoRetencionFuenteIva);
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxid_cuenta_contable_creditoTipoRetencionFuenteIva.setEnabled(isHabilitar && this.tiporetencionfuenteivaConstantesFunciones.activarid_cuenta_contable_creditoTipoRetencionFuenteIva);
	};
	
	public void setDefaultControlesTipoRetencionFuenteIva() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoRetencionFuenteIva(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tiporetencionfuenteivaSessionBean.setConGuardarRelaciones(true);			
			this.tiporetencionfuenteivaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jTabbedPaneRelacionesTipoRetencionFuenteIva.setVisible(true);
			
					
		} else {
			//this.tiporetencionfuenteivaSessionBean.setConGuardarRelaciones(false);			
			this.tiporetencionfuenteivaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jTabbedPaneRelacionesTipoRetencionFuenteIva.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoRetencionFuenteIva() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRetencionFuenteIva tiporetencionfuenteivaAux:this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas()) {
				if(tiporetencionfuenteivaAux.getId().equals(this.iIdNuevoTipoRetencionFuenteIva)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRetencionFuenteIva tiporetencionfuenteivaAux:this.tiporetencionfuenteivas) {
				if(tiporetencionfuenteivaAux.getId().equals(this.iIdNuevoTipoRetencionFuenteIva)) {
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
	
	public int getIndiceActualTipoRetencionFuenteIva(TipoRetencionFuenteIva tiporetencionfuenteiva,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRetencionFuenteIva tiporetencionfuenteivaAux:this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas()) {
				if(tiporetencionfuenteivaAux.getId().equals(tiporetencionfuenteiva.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRetencionFuenteIva tiporetencionfuenteivaAux:this.tiporetencionfuenteivas) {
				if(tiporetencionfuenteivaAux.getId().equals(tiporetencionfuenteiva.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoRetencionFuenteIva(TipoRetencionFuenteIva tiporetencionfuenteivaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRetencionFuenteIva tiporetencionfuenteivaAux:this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas()) {
				if(tiporetencionfuenteivaAux.getTipoRetencionFuenteIvaOriginal().getId().equals(tiporetencionfuenteivaOriginal.getId())) {
					existe=true;
					tiporetencionfuenteivaOriginal.setId(tiporetencionfuenteivaAux.getId());
					tiporetencionfuenteivaOriginal.setVersionRow(tiporetencionfuenteivaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRetencionFuenteIva tiporetencionfuenteivaAux:this.tiporetencionfuenteivas) {
				if(tiporetencionfuenteivaAux.getTipoRetencionFuenteIvaOriginal().getId().equals(tiporetencionfuenteivaOriginal.getId())) {
					existe=true;
					tiporetencionfuenteivaOriginal.setId(tiporetencionfuenteivaAux.getId());
					tiporetencionfuenteivaOriginal.setVersionRow(tiporetencionfuenteivaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoRetencionFuenteIva(Boolean esParaCancelar) throws Exception {
		tiporetencionfuenteivasAux=new ArrayList<TipoRetencionFuenteIva>();
		tiporetencionfuenteivaAux=new TipoRetencionFuenteIva();
		
		if(!this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoRetencionFuenteIva tiporetencionfuenteivaAux:this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas()) {
					if(tiporetencionfuenteivaAux.getId()<0) {
						tiporetencionfuenteivasAux.add(tiporetencionfuenteivaAux);
					}		
				}
				this.iIdNuevoTipoRetencionFuenteIva=0L;
				this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().removeAll(tiporetencionfuenteivasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoRetencionFuenteIva tiporetencionfuenteivaAux:this.tiporetencionfuenteivas) {
					if(tiporetencionfuenteivaAux.getId()<0) {
						tiporetencionfuenteivasAux.add(tiporetencionfuenteivaAux);
					}		
				}
				this.iIdNuevoTipoRetencionFuenteIva=0L;
				this.tiporetencionfuenteivas.removeAll(tiporetencionfuenteivasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoRetencionFuenteIva 
					&& this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().size()>0
					) {
					tiporetencionfuenteivaAux=this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().get(this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().size() - 1);
				
					if(tiporetencionfuenteivaAux.getId()<0) {
						this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().remove(tiporetencionfuenteivaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoRetencionFuenteIva && this.tiporetencionfuenteivas.size()>0) {
					tiporetencionfuenteivaAux=this.tiporetencionfuenteivas.get(this.tiporetencionfuenteivas.size() - 1);
				
					if(tiporetencionfuenteivaAux.getId()<0) {
						this.tiporetencionfuenteivas.remove(tiporetencionfuenteivaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoRetencionFuenteIva(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tiporetencionfuenteiva.getId()<0) {
				this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().remove(this.tiporetencionfuenteiva);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tiporetencionfuenteiva.getId()<0) {
				this.tiporetencionfuenteivas.remove(this.tiporetencionfuenteiva);
			}
		}			
	}
	
	public void setEstadosInicialesTipoRetencionFuenteIva(List<TipoRetencionFuenteIva> tiporetencionfuenteivasAux) throws Exception {
		TipoRetencionFuenteIvaConstantesFunciones.setEstadosInicialesTipoRetencionFuenteIva(tiporetencionfuenteivasAux);
	}
	
	public void setEstadosInicialesTipoRetencionFuenteIva(TipoRetencionFuenteIva tiporetencionfuenteivaAux) throws Exception {
		TipoRetencionFuenteIvaConstantesFunciones.setEstadosInicialesTipoRetencionFuenteIva(tiporetencionfuenteivaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoRetencionFuenteIvaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoRetencionFuenteIva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoRetencionFuenteIvaActual()) {
				if(!this.isEsNuevoTipoRetencionFuenteIva) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoRetencionFuenteIva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoRetencionFuenteIva=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoRetencionFuenteIvaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Retencion Fuente Iva ?", "MANTENIMIENTO DE Tipo Retencion Fuente Iva", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoRetencionFuenteIva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoRetencionFuenteIva tiporetencionfuenteiva) throws Exception {
		TipoRetencionFuenteIvaConstantesFunciones.seleccionarAsignar(this.tiporetencionfuenteiva,tiporetencionfuenteiva);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoRetencionFuenteIva=this.isPermisoActualizarOriginalTipoRetencionFuenteIva;
			
			
			this.seleccionarAsignar(tiporetencionfuenteiva);
			
			

			idCuentaContableActual=tiporetencionfuenteiva.getid_cuenta_contable();
			this.seleccionarCuentaContableActual();

			idCuentaContableCreditoActual=tiporetencionfuenteiva.getid_cuenta_contable_credito();
			this.seleccionarCuentaContableCreditoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoRetencionFuenteIvaConstantesFunciones.quitarEspaciosTipoRetencionFuenteIva(this.tiporetencionfuenteiva,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoRetencionFuenteIva("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tiporetencionfuenteivaSessionBean.setsFuncionBusquedaRapida(this.tiporetencionfuenteivaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoTipoRetencionFuenteIva) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoRetencionFuenteIva(esParaCancelar);				
				this.cancelarNuevoTipoRetencionFuenteIva(esParaCancelar);								
			}
			
			this.tiporetencionfuenteiva=new TipoRetencionFuenteIva();
			
			this.inicializarTipoRetencionFuenteIva();
			
			this.actualizarEstadoCeldasBotonesTipoRetencionFuenteIva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoRetencionFuenteIva() throws Exception {
		try {
			TipoRetencionFuenteIvaConstantesFunciones.inicializarTipoRetencionFuenteIva(this.tiporetencionfuenteiva);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoRetencionFuenteIvas(String sAccionBusqueda,List<TipoRetencionFuenteIva> tiporetencionfuenteivasParaReportes) throws Exception {
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
					sPathReporteFinal="TipoRetencionFuenteIva"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoRetencionFuenteIvaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoRetencionFuenteIvaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoRetencionFuenteIva"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Retencion Fuente Ivas");		
		parameters.put("busquedapor", TipoRetencionFuenteIvaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoRetencionFuenteIva=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoRetencionFuenteIvaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoRetencionFuenteIvaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoRetencionFuenteIva=new JRBeanArrayDataSource(TipoRetencionFuenteIvaJInternalFrame.TraerTipoRetencionFuenteIvaBeans(tiporetencionfuenteivasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoRetencionFuenteIva);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoRetencionFuenteIvaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoRetencionFuenteIvaBean.TraerTipoRetencionFuenteIvaBeans(tiporetencionfuenteivasParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoRetencionFuenteIvas(sAccionBusqueda,sTipoArchivoReporte,tiporetencionfuenteivasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoRetencionFuenteIvas(sAccionBusqueda,sTipoArchivoReporte,tiporetencionfuenteivasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoRetencionFuenteIvaActionPerformed(null);
					//this.generarExcelReporteTipoRetencionFuenteIvas(sAccionBusqueda,sTipoArchivoReporte,tiporetencionfuenteivasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoRetencionFuenteIvas(sAccionBusqueda,sTipoArchivoReporte,tiporetencionfuenteivasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoRetencionFuenteIvas(sAccionBusqueda,sTipoArchivoReporte,tiporetencionfuenteivasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoRetencionFuenteIvas(sAccionBusqueda,sTipoArchivoReporte,tiporetencionfuenteivasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoRetencionFuenteIvas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoRetencionFuenteIva> tiporetencionfuenteivasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporetencionfuenteiva";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoRetencionFuenteIvas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoRetencionFuenteIva("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoRetencionFuenteIva tiporetencionfuenteiva : tiporetencionfuenteivasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoRetencionFuenteIvaConstantesFunciones.generarExcelReporteDataTipoRetencionFuenteIva("NORMAL",row,workbook,tiporetencionfuenteiva,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Retencion Fuente Iva",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoRetencionFuenteIva(String sTipo,Row row,Workbook workbook) {
		
		TipoRetencionFuenteIvaConstantesFunciones.generarExcelReporteHeaderTipoRetencionFuenteIva(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoRetencionFuenteIvas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoRetencionFuenteIva> tiporetencionfuenteivasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporetencionfuenteiva_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoRetencionFuenteIvas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoRetencionFuenteIva tiporetencionfuenteiva : tiporetencionfuenteivasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoRetencionFuenteIvaConstantesFunciones.getTipoRetencionFuenteIvaDescripcion(tiporetencionfuenteiva));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoRetencionFuenteIvaConstantesFunciones.LABEL_IDPAIS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoRetencionFuenteIvaConstantesFunciones.LABEL_IDPAIS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiporetencionfuenteiva.getpais_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoRetencionFuenteIvaConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoRetencionFuenteIvaConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiporetencionfuenteiva.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoRetencionFuenteIvaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoRetencionFuenteIvaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiporetencionfuenteiva.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoRetencionFuenteIvaConstantesFunciones.LABEL_PORCENTAJE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoRetencionFuenteIvaConstantesFunciones.LABEL_PORCENTAJE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiporetencionfuenteiva.getporcentaje());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoRetencionFuenteIvaConstantesFunciones.LABEL_MONTOMINIMO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoRetencionFuenteIvaConstantesFunciones.LABEL_MONTOMINIMO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiporetencionfuenteiva.getmonto_minimo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoRetencionFuenteIvaConstantesFunciones.LABEL_IDCUENTACONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoRetencionFuenteIvaConstantesFunciones.LABEL_IDCUENTACONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiporetencionfuenteiva.getcuentacontable_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoRetencionFuenteIvaConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoRetencionFuenteIvaConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiporetencionfuenteiva.getcuentacontablecredito_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESRETENCIONIVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESRETENCIONIVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(tiporetencionfuenteiva.getes_retencion_iva()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESDEBITO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESDEBITO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(tiporetencionfuenteiva.getes_debito()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESCONIVAFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESCONIVAFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(tiporetencionfuenteiva.getes_con_iva_factura()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESCONSUBTOTALFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESCONSUBTOTALFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(tiporetencionfuenteiva.getes_con_sub_total_factura()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESCONSECUENCIAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESCONSECUENCIAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(tiporetencionfuenteiva.getes_con_secuencial()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Retencion Fuente Iva",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoRetencionFuenteIvas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoRetencionFuenteIva> tiporetencionfuenteivasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoRetencionFuenteIva> tiporetencionfuenteivasRespaldo=null;
		
		classes=TipoRetencionFuenteIvaConstantesFunciones.getClassesRelationshipsOfTipoRetencionFuenteIva(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tiporetencionfuenteivaLogic.setDatosCliente(this.datosCliente);
		this.tiporetencionfuenteivaLogic.setDatosDeep(this.datosDeep);
		this.tiporetencionfuenteivaLogic.setIsConDeep(true);
		
		tiporetencionfuenteivasRespaldo=this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas();
		
		this.tiporetencionfuenteivaLogic.setTipoRetencionFuenteIvas(tiporetencionfuenteivasParaReportes);	
		this.tiporetencionfuenteivaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tiporetencionfuenteivasParaReportes=this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas();
		this.tiporetencionfuenteivaLogic.setTipoRetencionFuenteIvas(tiporetencionfuenteivasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporetencionfuenteiva_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoRetencionFuenteIvas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoRetencionFuenteIva("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoRetencionFuenteIva tiporetencionfuenteiva : tiporetencionfuenteivasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoRetencionFuenteIva("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoRetencionFuenteIvaConstantesFunciones.generarExcelReporteDataTipoRetencionFuenteIva("NORMAL",row,workbook,tiporetencionfuenteiva,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoRetencionFuenteIvaConstantesFunciones.getTipoRetencionFuenteIvaDescripcion(tiporetencionfuenteiva));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Retencion Fuente Iva",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoRetencionFuenteIva() throws Exception {		
		this.startProcessTipoRetencionFuenteIva(true);
	}
	
	public void startProcessTipoRetencionFuenteIva(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoRetencionFuenteIva ,this.jPanelParametrosReportesTipoRetencionFuenteIva, this.jScrollPanelDatosTipoRetencionFuenteIva,this.jPanelPaginacionTipoRetencionFuenteIva, this.jScrollPanelDatosEdicionTipoRetencionFuenteIva, this.jPanelAccionesTipoRetencionFuenteIva,this.jPanelAccionesFormularioTipoRetencionFuenteIva,this.jmenuBarTipoRetencionFuenteIva,this.jmenuBarDetalleTipoRetencionFuenteIva,this.jTtoolBarTipoRetencionFuenteIva,this.jTtoolBarDetalleTipoRetencionFuenteIva);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoRetencionFuenteIva=this.jTabbedPaneBusquedasTipoRetencionFuenteIva; 
		
		final JPanel jPanelParametrosReportesTipoRetencionFuenteIva=this.jPanelParametrosReportesTipoRetencionFuenteIva;
		//final JScrollPane jScrollPanelDatosTipoRetencionFuenteIva=this.jScrollPanelDatosTipoRetencionFuenteIva;
		final JTable jTableDatosTipoRetencionFuenteIva=this.jTableDatosTipoRetencionFuenteIva;		
		final JPanel jPanelPaginacionTipoRetencionFuenteIva=this.jPanelPaginacionTipoRetencionFuenteIva;
		//final JScrollPane jScrollPanelDatosEdicionTipoRetencionFuenteIva=this.jScrollPanelDatosEdicionTipoRetencionFuenteIva;
		final JPanel jPanelAccionesTipoRetencionFuenteIva=this.jPanelAccionesTipoRetencionFuenteIva;
		
		JPanel jPanelCamposAuxiliarTipoRetencionFuenteIva=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoRetencionFuenteIva=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) {
			jPanelCamposAuxiliarTipoRetencionFuenteIva=this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jPanelCamposTipoRetencionFuenteIva;
			jPanelAccionesFormularioAuxiliarTipoRetencionFuenteIva=this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jPanelAccionesFormularioTipoRetencionFuenteIva;
		}
		
		final JPanel jPanelCamposTipoRetencionFuenteIva=jPanelCamposAuxiliarTipoRetencionFuenteIva;
		final JPanel jPanelAccionesFormularioTipoRetencionFuenteIva=jPanelAccionesFormularioAuxiliarTipoRetencionFuenteIva;
		
		
		final JMenuBar jmenuBarTipoRetencionFuenteIva=this.jmenuBarTipoRetencionFuenteIva;
		final JToolBar jTtoolBarTipoRetencionFuenteIva=this.jTtoolBarTipoRetencionFuenteIva;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoRetencionFuenteIva=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoRetencionFuenteIva=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) {
			jmenuBarDetalleAuxiliarTipoRetencionFuenteIva=this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jmenuBarDetalleTipoRetencionFuenteIva;
			jTtoolBarDetalleAuxiliarTipoRetencionFuenteIva=this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jTtoolBarDetalleTipoRetencionFuenteIva;
		}
		
		final JMenuBar jmenuBarDetalleTipoRetencionFuenteIva=jmenuBarDetalleAuxiliarTipoRetencionFuenteIva;
		final JToolBar jTtoolBarDetalleTipoRetencionFuenteIva=jTtoolBarDetalleAuxiliarTipoRetencionFuenteIva;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoRetencionFuenteIva;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoRetencionFuenteIva;
			processRunnable.jTableDatos=jTableDatosTipoRetencionFuenteIva;
			processRunnable.jPanelCampos=jPanelCamposTipoRetencionFuenteIva;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoRetencionFuenteIva;
			processRunnable.jPanelAcciones=jPanelAccionesTipoRetencionFuenteIva;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoRetencionFuenteIva;
			
			
			processRunnable.jmenuBar=jmenuBarTipoRetencionFuenteIva;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoRetencionFuenteIva;
			processRunnable.jTtoolBar=jTtoolBarTipoRetencionFuenteIva;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoRetencionFuenteIva;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoRetencionFuenteIva ,jPanelParametrosReportesTipoRetencionFuenteIva,jTableDatosTipoRetencionFuenteIva, /*jScrollPanelDatosTipoRetencionFuenteIva,*/jPanelCamposTipoRetencionFuenteIva,jPanelPaginacionTipoRetencionFuenteIva, /*jScrollPanelDatosEdicionTipoRetencionFuenteIva,*/ jPanelAccionesTipoRetencionFuenteIva,jPanelAccionesFormularioTipoRetencionFuenteIva,jmenuBarTipoRetencionFuenteIva,jmenuBarDetalleTipoRetencionFuenteIva,jTtoolBarTipoRetencionFuenteIva,jTtoolBarDetalleTipoRetencionFuenteIva);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoRetencionFuenteIva ,jPanelParametrosReportesTipoRetencionFuenteIva, jScrollPanelDatosTipoRetencionFuenteIva,jPanelPaginacionTipoRetencionFuenteIva, jScrollPanelDatosEdicionTipoRetencionFuenteIva, jPanelAccionesTipoRetencionFuenteIva,jPanelAccionesFormularioTipoRetencionFuenteIva,jmenuBarTipoRetencionFuenteIva,jmenuBarDetalleTipoRetencionFuenteIva,jTtoolBarTipoRetencionFuenteIva,jTtoolBarDetalleTipoRetencionFuenteIva);
						
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
	
	public void finishProcessTipoRetencionFuenteIva() {// throws Exception 
		this.finishProcessTipoRetencionFuenteIva(true);
	}
	
	public void finishProcessTipoRetencionFuenteIva(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoRetencionFuenteIva ,this.jPanelParametrosReportesTipoRetencionFuenteIva, this.jScrollPanelDatosTipoRetencionFuenteIva,this.jPanelPaginacionTipoRetencionFuenteIva, this.jScrollPanelDatosEdicionTipoRetencionFuenteIva, this.jPanelAccionesTipoRetencionFuenteIva,this.jPanelAccionesFormularioTipoRetencionFuenteIva,this.jmenuBarTipoRetencionFuenteIva,this.jmenuBarDetalleTipoRetencionFuenteIva,this.jTtoolBarTipoRetencionFuenteIva,this.jTtoolBarDetalleTipoRetencionFuenteIva);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoRetencionFuenteIva=this.jTabbedPaneBusquedasTipoRetencionFuenteIva; 
		
		final JPanel jPanelParametrosReportesTipoRetencionFuenteIva=this.jPanelParametrosReportesTipoRetencionFuenteIva;
		//final JScrollPane jScrollPanelDatosTipoRetencionFuenteIva=this.jScrollPanelDatosTipoRetencionFuenteIva;
		final JTable jTableDatosTipoRetencionFuenteIva=this.jTableDatosTipoRetencionFuenteIva;		
		final JPanel jPanelPaginacionTipoRetencionFuenteIva=this.jPanelPaginacionTipoRetencionFuenteIva;
		//final JScrollPane jScrollPanelDatosEdicionTipoRetencionFuenteIva=this.jScrollPanelDatosEdicionTipoRetencionFuenteIva;
		final JPanel jPanelAccionesTipoRetencionFuenteIva=this.jPanelAccionesTipoRetencionFuenteIva;
		
		JPanel jPanelCamposAuxiliarTipoRetencionFuenteIva=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoRetencionFuenteIva=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) {
			jPanelCamposAuxiliarTipoRetencionFuenteIva=this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jPanelCamposTipoRetencionFuenteIva;
			jPanelAccionesFormularioAuxiliarTipoRetencionFuenteIva=this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jPanelAccionesFormularioTipoRetencionFuenteIva;
		}
		
		final JPanel jPanelCamposTipoRetencionFuenteIva=jPanelCamposAuxiliarTipoRetencionFuenteIva;
		final JPanel jPanelAccionesFormularioTipoRetencionFuenteIva=jPanelAccionesFormularioAuxiliarTipoRetencionFuenteIva;
		
		
		final JMenuBar jmenuBarTipoRetencionFuenteIva=this.jmenuBarTipoRetencionFuenteIva;		
		final JToolBar jTtoolBarTipoRetencionFuenteIva=this.jTtoolBarTipoRetencionFuenteIva;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoRetencionFuenteIva=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoRetencionFuenteIva=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) {
			jmenuBarDetalleAuxiliarTipoRetencionFuenteIva=this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jmenuBarDetalleTipoRetencionFuenteIva;
			jTtoolBarDetalleAuxiliarTipoRetencionFuenteIva=this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jTtoolBarDetalleTipoRetencionFuenteIva;		
		}
		
		final JMenuBar jmenuBarDetalleTipoRetencionFuenteIva=jmenuBarDetalleAuxiliarTipoRetencionFuenteIva;
		final JToolBar jTtoolBarDetalleTipoRetencionFuenteIva=jTtoolBarDetalleAuxiliarTipoRetencionFuenteIva;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoRetencionFuenteIva;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoRetencionFuenteIva;
			processRunnable.jTableDatos=jTableDatosTipoRetencionFuenteIva;
			processRunnable.jPanelCampos=jPanelCamposTipoRetencionFuenteIva;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoRetencionFuenteIva;
			processRunnable.jPanelAcciones=jPanelAccionesTipoRetencionFuenteIva;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoRetencionFuenteIva;
			
			
			processRunnable.jmenuBar=jmenuBarTipoRetencionFuenteIva;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoRetencionFuenteIva;
			processRunnable.jTtoolBar=jTtoolBarTipoRetencionFuenteIva;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoRetencionFuenteIva;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoRetencionFuenteIva ,jPanelParametrosReportesTipoRetencionFuenteIva, jTableDatosTipoRetencionFuenteIva,/*jScrollPanelDatosTipoRetencionFuenteIva,*/jPanelCamposTipoRetencionFuenteIva,jPanelPaginacionTipoRetencionFuenteIva, /*jScrollPanelDatosEdicionTipoRetencionFuenteIva,*/ jPanelAccionesTipoRetencionFuenteIva,jPanelAccionesFormularioTipoRetencionFuenteIva,jmenuBarTipoRetencionFuenteIva,jmenuBarDetalleTipoRetencionFuenteIva,jTtoolBarTipoRetencionFuenteIva,jTtoolBarDetalleTipoRetencionFuenteIva));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoRetencionFuenteIva(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoRetencionFuenteIva(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoRetencionFuenteIva(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoRetencionFuenteIva(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoRetencionFuenteIva,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoRetencionFuenteIva,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoRetencionFuenteIva(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoRetencionFuenteIva,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoRetencionFuenteIva,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tiporetencionfuenteivaConstantesFunciones.getsFinalQueryTipoRetencionFuenteIva();
		String  finalQueryPaginacionTodos=this.tiporetencionfuenteivaConstantesFunciones.getsFinalQueryTipoRetencionFuenteIva();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoRetencionFuenteIvaConstantesFunciones.getArrayColumnasGlobalesNoTipoRetencionFuenteIva(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoRetencionFuenteIvaConstantesFunciones.getArrayColumnasGlobalesTipoRetencionFuenteIva(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoRetencionFuenteIvaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tiporetencionfuenteivasEliminados= new ArrayList<TipoRetencionFuenteIva>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoRetencionFuenteIva();
		
				///*TipoRetencionFuenteIvaSessionBean*/this.tiporetencionfuenteivaSessionBean=new TipoRetencionFuenteIvaSessionBean();
			
			if(this.tiporetencionfuenteivaSessionBean==null) {
				this.tiporetencionfuenteivaSessionBean=new TipoRetencionFuenteIvaSessionBean();
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
					this.iNumeroPaginacion=TipoRetencionFuenteIvaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoRetencionFuenteIvaConstantesFunciones.getClassesForeignKeysOfTipoRetencionFuenteIva(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tiporetencionfuenteiva."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tiporetencionfuenteivasAux= new ArrayList<TipoRetencionFuenteIva>();
			
				
			tiporetencionfuenteivaLogic.setDatosCliente(this.datosCliente);
			tiporetencionfuenteivaLogic.setDatosDeep(this.datosDeep);
			tiporetencionfuenteivaLogic.setIsConDeep(true);
			
			
			tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tiporetencionfuenteivaLogic.getTodosTipoRetencionFuenteIvas(finalQueryGlobal,pagination);
					
					//tiporetencionfuenteivaLogic.getTodosTipoRetencionFuenteIvasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas()==null|| tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiporetencionfuenteivasAux= new ArrayList<TipoRetencionFuenteIva>();
							tiporetencionfuenteivasAux.addAll(tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporetencionfuenteivasAux= new ArrayList<TipoRetencionFuenteIva>();
							tiporetencionfuenteivasAux.addAll(tiporetencionfuenteivas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiporetencionfuenteivaLogic.getTodosTipoRetencionFuenteIvas(finalQueryGlobal+"",this.pagination);												
							
							//tiporetencionfuenteivaLogic.getTodosTipoRetencionFuenteIvasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoRetencionFuenteIvas("Todos",tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiporetencionfuenteivaLogic.setTipoRetencionFuenteIvas(new ArrayList<TipoRetencionFuenteIva>());					
							tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().addAll(tiporetencionfuenteivasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporetencionfuenteivas=new ArrayList<TipoRetencionFuenteIva>();
							tiporetencionfuenteivas.addAll(tiporetencionfuenteivasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoRetencionFuenteIva=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoRetencionFuenteIva=this.idActual;
				
				} else if(this.idTipoRetencionFuenteIvaActual!=null && this.idTipoRetencionFuenteIvaActual!=0L) {
					idTipoRetencionFuenteIva=idTipoRetencionFuenteIvaActual;
				}
				
					
				this.sDetalleReporte=TipoRetencionFuenteIvaConstantesFunciones.getDetalleIndicePorId(idTipoRetencionFuenteIva);
				
				this.tiporetencionfuenteivas=new ArrayList<TipoRetencionFuenteIva>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tiporetencionfuenteivaLogic.getEntity(idTipoRetencionFuenteIva);
					
					//tiporetencionfuenteivaLogic.getEntityWithConnection(idTipoRetencionFuenteIva);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporetencionfuenteivaLogic.setTipoRetencionFuenteIvas(new ArrayList<TipoRetencionFuenteIva>());
					tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().add(tiporetencionfuenteivaLogic.getTipoRetencionFuenteIva());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiporetencionfuenteivas=new ArrayList<TipoRetencionFuenteIva>();
					this.tiporetencionfuenteivas.add(tiporetencionfuenteiva);
				}
				
				if(tiporetencionfuenteivaLogic.getTipoRetencionFuenteIva()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=TipoRetencionFuenteIvaConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvasBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoRetencionFuenteIvaConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoRetencionFuenteIvaConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas()==null||tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tiporetencionfuenteivas==null|| tiporetencionfuenteivas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporetencionfuenteivasAux=new ArrayList<TipoRetencionFuenteIva>();
						tiporetencionfuenteivasAux.addAll(tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporetencionfuenteivasAux=new ArrayList<TipoRetencionFuenteIva>();
							tiporetencionfuenteivasAux.addAll(tiporetencionfuenteivas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvasBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoRetencionFuenteIvaConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoRetencionFuenteIvaConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoRetencionFuenteIvas("BusquedaPorCodigo",tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoRetencionFuenteIvas("BusquedaPorCodigo",tiporetencionfuenteivas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporetencionfuenteivaLogic.setTipoRetencionFuenteIvas(new ArrayList<TipoRetencionFuenteIva>());
						tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().addAll(tiporetencionfuenteivasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporetencionfuenteivas=new ArrayList<TipoRetencionFuenteIva>();
							tiporetencionfuenteivas.addAll(tiporetencionfuenteivasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=TipoRetencionFuenteIvaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvasBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoRetencionFuenteIvaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoRetencionFuenteIvaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas()==null||tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tiporetencionfuenteivas==null|| tiporetencionfuenteivas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporetencionfuenteivasAux=new ArrayList<TipoRetencionFuenteIva>();
						tiporetencionfuenteivasAux.addAll(tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporetencionfuenteivasAux=new ArrayList<TipoRetencionFuenteIva>();
							tiporetencionfuenteivasAux.addAll(tiporetencionfuenteivas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvasBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoRetencionFuenteIvaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoRetencionFuenteIvaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoRetencionFuenteIvas("BusquedaPorNombre",tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoRetencionFuenteIvas("BusquedaPorNombre",tiporetencionfuenteivas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporetencionfuenteivaLogic.setTipoRetencionFuenteIvas(new ArrayList<TipoRetencionFuenteIva>());
						tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().addAll(tiporetencionfuenteivasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporetencionfuenteivas=new ArrayList<TipoRetencionFuenteIva>();
							tiporetencionfuenteivas.addAll(tiporetencionfuenteivasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPais")) {
				this.sDetalleReporte=TipoRetencionFuenteIvaConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvasFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoRetencionFuenteIvaConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoRetencionFuenteIvaConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas()==null||tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tiporetencionfuenteivas==null|| tiporetencionfuenteivas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporetencionfuenteivasAux=new ArrayList<TipoRetencionFuenteIva>();
						tiporetencionfuenteivasAux.addAll(tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporetencionfuenteivasAux=new ArrayList<TipoRetencionFuenteIva>();
							tiporetencionfuenteivasAux.addAll(tiporetencionfuenteivas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvasFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoRetencionFuenteIvaConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoRetencionFuenteIvaConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoRetencionFuenteIvas("FK_IdPais",tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoRetencionFuenteIvas("FK_IdPais",tiporetencionfuenteivas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporetencionfuenteivaLogic.setTipoRetencionFuenteIvas(new ArrayList<TipoRetencionFuenteIva>());
						tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().addAll(tiporetencionfuenteivasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporetencionfuenteivas=new ArrayList<TipoRetencionFuenteIva>();
							tiporetencionfuenteivas.addAll(tiporetencionfuenteivasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoRetencionFuenteIva();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoRetencionFuenteIva();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiporetencionfuenteivas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiporetencionfuenteivas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoRetencionFuenteIva tiporetencionfuenteiva) {
		Boolean permite=true;
		
		if(this.tiporetencionfuenteiva.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoRetencionFuenteIvaConstantesFunciones.getOrderByListaTipoRetencionFuenteIva();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoRetencionFuenteIvaConstantesFunciones.getOrderByListaTipoRetencionFuenteIva();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRetencionFuenteIva tiporetencionfuenteiva:tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas()) {
				if(tiporetencionfuenteiva.getsType().equals(Constantes2.S_TOTALES)) {
					tiporetencionfuenteivaTotales=tiporetencionfuenteiva;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRetencionFuenteIva tiporetencionfuenteiva:this.tiporetencionfuenteivas) {
				if(tiporetencionfuenteiva.getsType().equals(Constantes2.S_TOTALES)) {
					tiporetencionfuenteivaTotales=tiporetencionfuenteiva;
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
			this.tiporetencionfuenteivaAux=new TipoRetencionFuenteIva();
			this.tiporetencionfuenteivaAux.setsType(Constantes2.S_TOTALES);
			this.tiporetencionfuenteivaAux.setIsNew(false);
			this.tiporetencionfuenteivaAux.setIsChanged(false);
			this.tiporetencionfuenteivaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoRetencionFuenteIvaConstantesFunciones.TotalizarValoresFilaTipoRetencionFuenteIva(this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas(),this.tiporetencionfuenteivaAux);
				
				this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().add(this.tiporetencionfuenteivaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoRetencionFuenteIvaConstantesFunciones.TotalizarValoresFilaTipoRetencionFuenteIva(this.tiporetencionfuenteivas,this.tiporetencionfuenteivaAux);
				
				this.tiporetencionfuenteivas.add(this.tiporetencionfuenteivaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tiporetencionfuenteivaTotales=new TipoRetencionFuenteIva();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().remove(tiporetencionfuenteivaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tiporetencionfuenteivas.remove(tiporetencionfuenteivaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tiporetencionfuenteivaTotales=new TipoRetencionFuenteIva();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRetencionFuenteIva tiporetencionfuenteiva:tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas()) {
				if(tiporetencionfuenteiva.getsType().equals(Constantes2.S_TOTALES)) {
					tiporetencionfuenteivaTotales=tiporetencionfuenteiva;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoRetencionFuenteIvaConstantesFunciones.TotalizarValoresFilaTipoRetencionFuenteIva(this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas(),tiporetencionfuenteivaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRetencionFuenteIva tiporetencionfuenteiva:this.tiporetencionfuenteivas) {
				if(tiporetencionfuenteiva.getsType().equals(Constantes2.S_TOTALES)) {
					tiporetencionfuenteivaTotales=tiporetencionfuenteiva;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoRetencionFuenteIvaConstantesFunciones.TotalizarValoresFilaTipoRetencionFuenteIva(this.tiporetencionfuenteivas,tiporetencionfuenteivaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoRetencionFuenteIvasBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoRetencionFuenteIvasBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoRetencionFuenteIvasFK_IdCuentaContable()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaContable";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoRetencionFuenteIvasFK_IdCuentaContableCredito()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaContableCredito";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoRetencionFuenteIvasFK_IdPais()throws Exception {
		try {
			sAccionBusqueda="FK_IdPais";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoRetencionFuenteIvasBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvasBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoRetencionFuenteIvasBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvasBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoRetencionFuenteIvasFK_IdCuentaContable(String sFinalQuery,Long id_cuenta_contable)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvasFK_IdCuentaContable(sFinalQuery,this.pagination,id_cuenta_contable);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoRetencionFuenteIvasFK_IdCuentaContableCredito(String sFinalQuery,Long id_cuenta_contable_credito)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvasFK_IdCuentaContableCredito(sFinalQuery,this.pagination,id_cuenta_contable_credito);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoRetencionFuenteIvasFK_IdPais(String sFinalQuery,Long id_pais)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvasFK_IdPais(sFinalQuery,this.pagination,id_pais);
				
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
	
	public void inicializarPermisosTipoRetencionFuenteIva() {
		this.isPermisoTodoTipoRetencionFuenteIva=false;
		this.isPermisoNuevoTipoRetencionFuenteIva=false;
		this.isPermisoActualizarTipoRetencionFuenteIva=false;
		this.isPermisoActualizarOriginalTipoRetencionFuenteIva=false;
		this.isPermisoEliminarTipoRetencionFuenteIva=false;
		this.isPermisoGuardarCambiosTipoRetencionFuenteIva=false;
		this.isPermisoConsultaTipoRetencionFuenteIva=false;
		this.isPermisoBusquedaTipoRetencionFuenteIva=false;
		this.isPermisoReporteTipoRetencionFuenteIva=false;		
		this.isPermisoOrdenTipoRetencionFuenteIva=false;		
		this.isPermisoPaginacionMedioTipoRetencionFuenteIva=false;		
		this.isPermisoPaginacionAltoTipoRetencionFuenteIva=false;
		this.isPermisoPaginacionTodoTipoRetencionFuenteIva=false;
		this.isPermisoCopiarTipoRetencionFuenteIva=false;		
		this.isPermisoVerFormTipoRetencionFuenteIva=false;		
		this.isPermisoDuplicarTipoRetencionFuenteIva=false;		
		this.isPermisoOrdenTipoRetencionFuenteIva=false;		
	}
	
	public void setPermisosUsuarioTipoRetencionFuenteIva(Boolean isPermiso) {
		this.isPermisoTodoTipoRetencionFuenteIva=isPermiso;
		this.isPermisoNuevoTipoRetencionFuenteIva=isPermiso;
		this.isPermisoActualizarTipoRetencionFuenteIva=isPermiso;
		this.isPermisoActualizarOriginalTipoRetencionFuenteIva=isPermiso;
		this.isPermisoEliminarTipoRetencionFuenteIva=isPermiso;
		this.isPermisoGuardarCambiosTipoRetencionFuenteIva=isPermiso;
		this.isPermisoConsultaTipoRetencionFuenteIva=isPermiso;
		this.isPermisoBusquedaTipoRetencionFuenteIva=isPermiso;
		this.isPermisoReporteTipoRetencionFuenteIva=isPermiso;
		this.isPermisoOrdenTipoRetencionFuenteIva=isPermiso;		
		this.isPermisoPaginacionMedioTipoRetencionFuenteIva=isPermiso;		
		this.isPermisoPaginacionAltoTipoRetencionFuenteIva=isPermiso;		
		this.isPermisoPaginacionTodoTipoRetencionFuenteIva=isPermiso;		
		this.isPermisoCopiarTipoRetencionFuenteIva=isPermiso;		
		this.isPermisoVerFormTipoRetencionFuenteIva=isPermiso;		
		this.isPermisoDuplicarTipoRetencionFuenteIva=isPermiso;
		this.isPermisoOrdenTipoRetencionFuenteIva=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoRetencionFuenteIva(Boolean isPermiso) {
		//this.isPermisoTodoTipoRetencionFuenteIva=isPermiso;
		this.isPermisoNuevoTipoRetencionFuenteIva=isPermiso;
		this.isPermisoActualizarTipoRetencionFuenteIva=isPermiso;
		this.isPermisoActualizarOriginalTipoRetencionFuenteIva=isPermiso;
		this.isPermisoEliminarTipoRetencionFuenteIva=isPermiso;
		this.isPermisoGuardarCambiosTipoRetencionFuenteIva=isPermiso;
		//this.isPermisoConsultaTipoRetencionFuenteIva=isPermiso;
		//this.isPermisoBusquedaTipoRetencionFuenteIva=isPermiso;
		//this.isPermisoReporteTipoRetencionFuenteIva=isPermiso;
		//this.isPermisoOrdenTipoRetencionFuenteIva=isPermiso;		
		//this.isPermisoPaginacionMedioTipoRetencionFuenteIva=isPermiso;		
		//this.isPermisoPaginacionAltoTipoRetencionFuenteIva=isPermiso;		
		//this.isPermisoPaginacionTodoTipoRetencionFuenteIva=isPermiso;		
		//this.isPermisoCopiarTipoRetencionFuenteIva=isPermiso;		
		//this.isPermisoDuplicarTipoRetencionFuenteIva=isPermiso;
		//this.isPermisoOrdenTipoRetencionFuenteIva=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoRetencionFuenteIvaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoRetencionFuenteIvaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoRetencionFuenteIva(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoRetencionFuenteIvaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoRetencionFuenteIvaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoRetencionFuenteIvaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoRetencionFuenteIvaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoRetencionFuenteIva() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoRetencionFuenteIvaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoRetencionFuenteIvaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoRetencionFuenteIva=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoRetencionFuenteIva=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoRetencionFuenteIva=this.isPermisoActualizarTipoRetencionFuenteIva;
			this.isPermisoEliminarTipoRetencionFuenteIva=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoRetencionFuenteIva=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoRetencionFuenteIva=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoRetencionFuenteIva=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoRetencionFuenteIva=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoRetencionFuenteIva=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoRetencionFuenteIva=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoRetencionFuenteIva=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoRetencionFuenteIva=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoRetencionFuenteIva=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoRetencionFuenteIva=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoRetencionFuenteIva=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoRetencionFuenteIva=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoRetencionFuenteIva=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoRetencionFuenteIva.setToolTipText(this.jTableDatosTipoRetencionFuenteIva.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoRetencionFuenteIva(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoRetencionFuenteIva(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoRetencionFuenteIvaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoRetencionFuenteIvaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoRetencionFuenteIva() throws Exception {
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
	public void inicializarCombosForeignKeyTipoRetencionFuenteIvaListas()throws Exception {
		try	{						
			
				this.paissForeignKey=new ArrayList();
				this.cuentacontablesForeignKey=new ArrayList();
				this.cuentacontablecreditosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoRetencionFuenteIvaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoRetencionFuenteIvaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoRetencionFuenteIvaListas(false);
			} else {
			
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCuentaContableListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCuentaContableCreditoListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyPaisListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.paissForeignKey==null||this.paissForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PaisConstantesFunciones.SFINALQUERY;

				this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
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
	
	public void cargarCombosLoteForeignKeyTipoRetencionFuenteIvaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoRetencionFuenteIvaParameterReturnGeneral tiporetencionfuenteivaReturnGeneral=new TipoRetencionFuenteIvaParameterReturnGeneral();
						
			


				String finalQueryGlobalPais="";

				if(((this.paissForeignKey==null||this.paissForeignKey.size()<=0) && this.tiporetencionfuenteivaConstantesFunciones.cargarid_paisTipoRetencionFuenteIva)
					 || (this.esRecargarFks && this.tiporetencionfuenteivaConstantesFunciones.cargarid_paisTipoRetencionFuenteIva)) {

					if(!this.tiporetencionfuenteivaSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPais=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

						finalQueryGlobalPais=Funciones.GetFinalQueryAppend(finalQueryGlobalPais, "");
						finalQueryGlobalPais+=PaisConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPais=" WHERE " + ConstantesSql.ID + "="+tiporetencionfuenteivaSessionBean.getlidPaisActual();
					}
				} else {
					finalQueryGlobalPais="NONE";
				}


				String finalQueryGlobalCuentaContable="";

				if(((this.cuentacontablesForeignKey==null||this.cuentacontablesForeignKey.size()<=0) && this.tiporetencionfuenteivaConstantesFunciones.cargarid_cuenta_contableTipoRetencionFuenteIva)
					 || (this.esRecargarFks && this.tiporetencionfuenteivaConstantesFunciones.cargarid_cuenta_contableTipoRetencionFuenteIva)) {

					if(!this.tiporetencionfuenteivaSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();

						this.arrDatoGeneralNo.add("id_modulo");

						arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCuentaContable=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

						finalQueryGlobalCuentaContable=Funciones.GetFinalQueryAppend(finalQueryGlobalCuentaContable, "");
						finalQueryGlobalCuentaContable+=CuentaContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCuentaContablesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCuentaContable=" WHERE " + ConstantesSql.ID + "="+tiporetencionfuenteivaSessionBean.getlidCuentaContableActual();
					}
				} else {
					finalQueryGlobalCuentaContable="NONE";
				}


				String finalQueryGlobalCuentaContableCredito="";

				if(((this.cuentacontablecreditosForeignKey==null||this.cuentacontablecreditosForeignKey.size()<=0) && this.tiporetencionfuenteivaConstantesFunciones.cargarid_cuenta_contable_creditoTipoRetencionFuenteIva)
					 || (this.esRecargarFks && this.tiporetencionfuenteivaConstantesFunciones.cargarid_cuenta_contable_creditoTipoRetencionFuenteIva)) {

					if(!this.tiporetencionfuenteivaSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableCredito()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();

						this.arrDatoGeneralNo.add("id_modulo");

						arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCuentaContableCredito=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

						finalQueryGlobalCuentaContableCredito=Funciones.GetFinalQueryAppend(finalQueryGlobalCuentaContableCredito, "");
						finalQueryGlobalCuentaContableCredito+=CuentaContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCuentaContableCreditosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCuentaContableCredito=" WHERE " + ConstantesSql.ID + "="+tiporetencionfuenteivaSessionBean.getlidCuentaContableCreditoActual();
					}
				} else {
					finalQueryGlobalCuentaContableCredito="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tiporetencionfuenteivaReturnGeneral=tiporetencionfuenteivaLogic.cargarCombosLoteForeignKeyTipoRetencionFuenteIva(finalQueryGlobalPais,finalQueryGlobalCuentaContable,finalQueryGlobalCuentaContableCredito);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalPais.equals("NONE")) {
				this.paissForeignKey=tiporetencionfuenteivaReturnGeneral.getpaissForeignKey();
			}

			if(!finalQueryGlobalCuentaContable.equals("NONE")) {
				this.cuentacontablesForeignKey=tiporetencionfuenteivaReturnGeneral.getcuentacontablesForeignKey();
			}

			if(!finalQueryGlobalCuentaContableCredito.equals("NONE")) {
				this.cuentacontablecreditosForeignKey=tiporetencionfuenteivaReturnGeneral.getcuentacontablecreditosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoRetencionFuenteIva()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyPais();
			this.addItemDefectoCombosForeignKeyCuentaContable();
			this.addItemDefectoCombosForeignKeyCuentaContableCredito();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyPais()throws Exception {
		try {
			if(this.tiporetencionfuenteivaSessionBean==null) {
				this.tiporetencionfuenteivaSessionBean=new TipoRetencionFuenteIvaSessionBean();
			}

			if(!this.tiporetencionfuenteivaSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
				Pais pais=new Pais();
				PaisConstantesFunciones.setPaisDescripcion(pais,Constantes.SMENSAJE_ESCOJA_OPCION);
				pais.setId(null);

				if(!PaisConstantesFunciones.ExisteEnLista(this.paissForeignKey,pais,true)) {

					this.paissForeignKey.add(0,pais);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCuentaContable()throws Exception {
		try {

			if(!this.tiporetencionfuenteivaSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
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

			if(!this.tiporetencionfuenteivaSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableCredito()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoRetencionFuenteIva()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoRetencionFuenteIva(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoRetencionFuenteIva()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoRetencionFuenteIva();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoRetencionFuenteIva(TipoRetencionFuenteIva tiporetencionfuenteiva)throws Exception {	
		try {
			
			this.setActualPaisForeignKey(tiporetencionfuenteiva.getid_pais(),false,"Formulario");
			this.setActualCuentaContableForeignKey(tiporetencionfuenteiva.getid_cuenta_contable(),false,"Formulario");
			this.setActualCuentaContableCreditoForeignKey(tiporetencionfuenteiva.getid_cuenta_contable_credito(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoRetencionFuenteIva(TipoRetencionFuenteIva tiporetencionfuenteiva,String sTipoEvento)throws Exception {	
		try {
			
			

				if(tiporetencionfuenteiva.getCuentaContable()!=null && !sTipoEvento.equals("id_cuenta_contableTipoRetencionFuenteIva")) { //sTipoEvento Evita Bucle Infinito

					this.cuentacontablesForeignKey=new ArrayList<CuentaContable>();
					this.cuentacontablesForeignKey.add(tiporetencionfuenteiva.getCuentaContable());

					this.addItemDefectoCombosForeignKeyCuentaContable();
					this.cargarCombosFrameCuentaContablesForeignKey("Todos");
				}

				if(tiporetencionfuenteiva.getCuentaContableCredito()!=null && !sTipoEvento.equals("id_cuenta_contable_creditoTipoRetencionFuenteIva")) { //sTipoEvento Evita Bucle Infinito

					this.cuentacontablecreditosForeignKey=new ArrayList<CuentaContable>();
					this.cuentacontablecreditosForeignKey.add(tiporetencionfuenteiva.getCuentaContableCredito());

					this.addItemDefectoCombosForeignKeyCuentaContableCredito();
					this.cargarCombosFrameCuentaContableCreditosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoRetencionFuenteIva()throws Exception {	
		try {
			
			this.setActualPaisForeignKey(this.tiporetencionfuenteivaConstantesFunciones.getid_pais(),false,"Formulario");
			this.setActualCuentaContableForeignKey(this.tiporetencionfuenteivaConstantesFunciones.getid_cuenta_contable(),false,"Formulario");
			this.setActualCuentaContableCreditoForeignKey(this.tiporetencionfuenteivaConstantesFunciones.getid_cuenta_contable_credito(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoRetencionFuenteIva()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoRetencionFuenteIva()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoRetencionFuenteIva()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoRetencionFuenteIva()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoRetencionFuenteIva()throws Exception {
		try {
			

			this.cargarCombosFramePaissForeignKey("Todos");
			this.cargarCombosFrameCuentaContablesForeignKey("Todos");
			this.cargarCombosFrameCuentaContableCreditosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoRetencionFuenteIva(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCuentaContablesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCuentaContableCreditosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoRetencionFuenteIva()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxid_paisTipoRetencionFuenteIva!=null && this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxid_paisTipoRetencionFuenteIva.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxid_paisTipoRetencionFuenteIva.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxid_cuenta_contableTipoRetencionFuenteIva!=null && this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxid_cuenta_contableTipoRetencionFuenteIva.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxid_cuenta_contableTipoRetencionFuenteIva.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxid_cuenta_contable_creditoTipoRetencionFuenteIva!=null && this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxid_cuenta_contable_creditoTipoRetencionFuenteIva.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxid_cuenta_contable_creditoTipoRetencionFuenteIva.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public TipoRetencionFuenteIvaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoRetencionFuenteIvaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoRetencionFuenteIvaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tiporetencionfuenteivaSessionBean=new TipoRetencionFuenteIvaSessionBean(); 
		this.tiporetencionfuenteivaConstantesFunciones=new TipoRetencionFuenteIvaConstantesFunciones(); 
		this.tiporetencionfuenteivaBean=new TipoRetencionFuenteIva();//(this.tiporetencionfuenteivaConstantesFunciones); 		
		this.tiporetencionfuenteivaReturnGeneral=new TipoRetencionFuenteIvaParameterReturnGeneral(); 
		
		this.tiporetencionfuenteivaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiporetencionfuenteivaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoRetencionFuenteIvaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoRetencionFuenteIvaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoRetencionFuenteIvaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoRetencionFuenteIva(true);
			
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
			
			this.tiporetencionfuenteivaConstantesFunciones=new TipoRetencionFuenteIvaConstantesFunciones(); 
			this.tiporetencionfuenteivaBean=new TipoRetencionFuenteIva();//this.tiporetencionfuenteivaConstantesFunciones); 			
			this.tiporetencionfuenteivaReturnGeneral=new TipoRetencionFuenteIvaParameterReturnGeneral(); 
		
			TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Retencion Fuente Iva Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.tiporetencionfuenteiva=new TipoRetencionFuenteIva();
			this.tiporetencionfuenteivas = new ArrayList<TipoRetencionFuenteIva>();
			this.tiporetencionfuenteivasAux = new ArrayList<TipoRetencionFuenteIva>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic=new TipoRetencionFuenteIvaLogic();
				this.tiporetencionfuenteivaLogic.getNewConnexionToDeep("");
			}
			
			//this.tiporetencionfuenteivaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tiporetencionfuenteivaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoRetencionFuenteIva);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva);	
					}
					
					if(this.jInternalFrameImportacionTipoRetencionFuenteIva!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoRetencionFuenteIva);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoRetencionFuenteIva!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoRetencionFuenteIva);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoRetencionFuenteIva);
				this.jInternalFrameDetalleFormTipoRetencionFuenteIva.setVisible(false);
				this.jInternalFrameDetalleFormTipoRetencionFuenteIva.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva);
					this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoRetencionFuenteIva!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoRetencionFuenteIva);
					this.jInternalFrameImportacionTipoRetencionFuenteIva.setVisible(false);
					this.jInternalFrameImportacionTipoRetencionFuenteIva.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoRetencionFuenteIva!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoRetencionFuenteIva);
					this.jInternalFrameOrderByTipoRetencionFuenteIva.setVisible(false);
					this.jInternalFrameOrderByTipoRetencionFuenteIva.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoRetencionFuenteIvaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoRetencionFuenteIvaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tiporetencionfuenteivaReturnGeneral=new TipoRetencionFuenteIvaParameterReturnGeneral();
			
			this.tiporetencionfuenteivaParameterGeneral=new TipoRetencionFuenteIvaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tiporetencionfuenteivaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoRetencionFuenteIvaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoRetencionFuenteIvaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado(),this.tiporetencionfuenteivaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoRetencionFuenteIvaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado(),this.tiporetencionfuenteivaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoRetencionFuenteIva=false;
			this.isVisibilidadCeldaDuplicarTipoRetencionFuenteIva=true;
			this.isVisibilidadCeldaCopiarTipoRetencionFuenteIva=true;
			this.isVisibilidadCeldaVerFormTipoRetencionFuenteIva=true;
			this.isVisibilidadCeldaOrdenTipoRetencionFuenteIva=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoRetencionFuenteIva=false;
			this.isVisibilidadCeldaModificarTipoRetencionFuenteIva=false;
			this.isVisibilidadCeldaActualizarTipoRetencionFuenteIva=false;
			this.isVisibilidadCeldaEliminarTipoRetencionFuenteIva=false;
			this.isVisibilidadCeldaCancelarTipoRetencionFuenteIva=false;
			this.isVisibilidadCeldaGuardarTipoRetencionFuenteIva=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRetencionFuenteIva=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdCuentaContable=true;
			this.isVisibilidadFK_IdCuentaContableCredito=true;
			this.isVisibilidadFK_IdPais=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoRetencionFuenteIva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoRetencionFuenteIva();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoRetencionFuenteIva(false);
			
			this.setPermisosUsuarioTipoRetencionFuenteIva();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado() 
				|| (this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado() && this.tiporetencionfuenteivaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoRetencionFuenteIvaClasesRelacionadas();
			}
			
			if(this.tiporetencionfuenteivaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoRetencionFuenteIvaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoRetencionFuenteIvaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoRetencionFuenteIva();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoRetencionFuenteIva();
			}
			
			if(!this.isPermisoBusquedaTipoRetencionFuenteIva) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoRetencionFuenteIva.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoRetencionFuenteIva,this.isPermisoPaginacionMedioTipoRetencionFuenteIva,this.isPermisoPaginacionTodoTipoRetencionFuenteIva);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoRetencionFuenteIvaConstantesFunciones.getTiposSeleccionarTipoRetencionFuenteIva());
				
				this.tiposColumnasSelect=TipoRetencionFuenteIvaConstantesFunciones.getTiposSeleccionarTipoRetencionFuenteIva(true);
				
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
			//if(!this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoRetencionFuenteIva();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioTipoRetencionFuenteIva(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioTipoRetencionFuenteIva(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoRetencionFuenteIva() ;
			
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
			
			this.paisLogic=new PaisLogic();
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
				tiporetencionfuenteivaImplementable= (TipoRetencionFuenteIvaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoRetencionFuenteIvaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tiporetencionfuenteivaImplementableHome= (TipoRetencionFuenteIvaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoRetencionFuenteIvaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tiporetencionfuenteivas= new ArrayList<TipoRetencionFuenteIva>();
			this.tiporetencionfuenteivasEliminados= new ArrayList<TipoRetencionFuenteIva>();
						
			this.isEsNuevoTipoRetencionFuenteIva=false;
			this.esParaAccionDesdeFormularioTipoRetencionFuenteIva=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idCuentaContableActual=0L;
			this.idCuentaContableCreditoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.paissForeignKey=new ArrayList<Pais>() ;
			this.cuentacontablesForeignKey=new ArrayList<CuentaContable>() ;
			this.cuentacontablecreditosForeignKey=new ArrayList<CuentaContable>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoRetencionFuenteIva(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoRetencionFuenteIva();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoRetencionFuenteIvaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoRetencionFuenteIva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoRetencionFuenteIva(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoRetencionFuenteIva();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoRetencionFuenteIva();
			}
			
			TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoRetencionFuenteIva.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoRetencionFuenteIva.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoRetencionFuenteIva.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoRetencionFuenteIva(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoRetencionFuenteIva: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoRetencionFuenteIva() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoRetencionFuenteIva")) {
				iIndex=this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jTabbedPaneRelacionesTipoRetencionFuenteIva.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jTabbedPaneRelacionesTipoRetencionFuenteIva.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoRetencionFuenteIva.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoRetencionFuenteIva();	
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
	
	public void cargarCombosForeignKeyTipoRetencionFuenteIva(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoRetencionFuenteIva(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoRetencionFuenteIva(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoRetencionFuenteIvaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoRetencionFuenteIva();
		
		this.cargarCombosFrameForeignKeyTipoRetencionFuenteIva();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoRetencionFuenteIva();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoRetencionFuenteIva();
		}
	}
	
	

	public void cargarCombosForeignKeyPais(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaPais(this.paissForeignKey);

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
	
	public void jButtonNuevoTipoRetencionFuenteIvaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tiporetencionfuenteivaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiporetencionfuenteiva,new Object(),this.tiporetencionfuenteivaParameterGeneral,this.tiporetencionfuenteivaReturnGeneral);
			
			
			if(jTableDatosTipoRetencionFuenteIva.getRowCount()>=1) {
				jTableDatosTipoRetencionFuenteIva.removeRowSelectionInterval(0, jTableDatosTipoRetencionFuenteIva.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoRetencionFuenteIva=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoRetencionFuenteIva(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoRetencionFuenteIva(true);			
			//this.tiporetencionfuenteiva=new TipoRetencionFuenteIva();
			//this.tiporetencionfuenteiva.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoRetencionFuenteIva(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoRetencionFuenteIva() ;
			
			if(TipoRetencionFuenteIvaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoRetencionFuenteIva(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tiporetencionfuenteiva);	
			this.actualizarInformacion("INFO_PADRE",false,this.tiporetencionfuenteiva);				
			
			TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiporetencionfuenteiva,new Object(),this.tiporetencionfuenteivaParameterGeneral,this.tiporetencionfuenteivaReturnGeneral);
			
			if(this.tiporetencionfuenteivaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoRetencionFuenteIva: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tiporetencionfuenteiva,new Object(),this.tiporetencionfuenteivaParameterGeneral,this.tiporetencionfuenteivaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoRetencionFuenteIvaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoRetencionFuenteIva> tiporetencionfuenteivasSeleccionados=new ArrayList<TipoRetencionFuenteIva>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoRetencionFuenteIva.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoRetencionFuenteIva.getSelectedRows().length;			
			}
			
			tiporetencionfuenteivasSeleccionados=this.getTipoRetencionFuenteIvasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoRetencionFuenteIva--;			
				//TipoRetencionFuenteIva tiporetencionfuenteivaAux= new TipoRetencionFuenteIva();			
				//tiporetencionfuenteivaAux.setId(this.iIdNuevoTipoRetencionFuenteIva);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoRetencionFuenteIva tiporetencionfuenteivaOrigen=new TipoRetencionFuenteIva();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoRetencionFuenteIva tiporetencionfuenteivaOrigen : tiporetencionfuenteivasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoRetencionFuenteIva.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tiporetencionfuenteivaOrigen =(TipoRetencionFuenteIva) this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporetencionfuenteivaOrigen =(TipoRetencionFuenteIva) this.tiporetencionfuenteivas.toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoRetencionFuenteIva();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tiporetencionfuenteiva.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoRetencionFuenteIva(tiporetencionfuenteivaOrigen,this.tiporetencionfuenteiva,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencionFuenteIva(this.tiporetencionfuenteiva);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().add(this.tiporetencionfuenteivaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tiporetencionfuenteivas.add(this.tiporetencionfuenteivaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoRetencionFuenteIva(false);
				
				this.jTableDatosTipoRetencionFuenteIva.setRowSelectionInterval(this.getIndiceNuevoTipoRetencionFuenteIva(), this.getIndiceNuevoTipoRetencionFuenteIva());
				
				int iLastRow =  this.jTableDatosTipoRetencionFuenteIva.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoRetencionFuenteIva.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoRetencionFuenteIva.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoRetencionFuenteIva(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoRetencionFuenteIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoRetencionFuenteIva> tiporetencionfuenteivasSeleccionados=new ArrayList<TipoRetencionFuenteIva>();									
		
			TipoRetencionFuenteIva tiporetencionfuenteivaOrigen=new TipoRetencionFuenteIva();
			TipoRetencionFuenteIva tiporetencionfuenteivaDestino=new TipoRetencionFuenteIva();
				
			tiporetencionfuenteivasSeleccionados=this.getTipoRetencionFuenteIvasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoRetencionFuenteIva.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tiporetencionfuenteivasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoRetencionFuenteIva.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporetencionfuenteivaOrigen =(TipoRetencionFuenteIva) this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tiporetencionfuenteivaOrigen =(TipoRetencionFuenteIva) this.tiporetencionfuenteivas.toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporetencionfuenteivaDestino =(TipoRetencionFuenteIva) this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tiporetencionfuenteivaDestino =(TipoRetencionFuenteIva) this.tiporetencionfuenteivas.toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tiporetencionfuenteivaOrigen =tiporetencionfuenteivasSeleccionados.get(0);
				tiporetencionfuenteivaDestino =tiporetencionfuenteivasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoRetencionFuenteIva(tiporetencionfuenteivaOrigen,tiporetencionfuenteivaDestino,true,false);
				
				tiporetencionfuenteivaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tiporetencionfuenteivaDestino,tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiporetencionfuenteivaDestino,tiporetencionfuenteivas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoRetencionFuenteIva(false);
				
				//this.jTableDatosTipoRetencionFuenteIva.setRowSelectionInterval(this.getIndiceNuevoTipoRetencionFuenteIva(), this.getIndiceNuevoTipoRetencionFuenteIva());
				
				int iLastRow =  this.jTableDatosTipoRetencionFuenteIva.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoRetencionFuenteIva.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoRetencionFuenteIva.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoRetencionFuenteIva(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoRetencionFuenteIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoRetencionFuenteIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoRetencionFuenteIva.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoRetencionFuenteIva.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoRetencionFuenteIva.setVisible(!isVisible);
			this.jPanelPaginacionTipoRetencionFuenteIva.setVisible(!isVisible);
			this.jPanelAccionesTipoRetencionFuenteIva.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoRetencionFuenteIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoRetencionFuenteIva();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoRetencionFuenteIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoRetencionFuenteIva();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoRetencionFuenteIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoRetencionFuenteIva();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoRetencionFuenteIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoRetencionFuenteIva();
			
			this.abrirFrameOrderByTipoRetencionFuenteIva();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoRetencionFuenteIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoRetencionFuenteIva();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoRetencionFuenteIva(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoRetencionFuenteIva);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva.isMaximum()) {
					this.jInternalFrameDetalleFormTipoRetencionFuenteIva.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.setSize(this.jInternalFrameDetalleFormTipoRetencionFuenteIva.iWidthFormulario,this.jInternalFrameDetalleFormTipoRetencionFuenteIva.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoRetencionFuenteIva.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoRetencionFuenteIva.isMaximum()) {
						this.jInternalFrameDetalleFormTipoRetencionFuenteIva.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jContentPaneDetalleTipoRetencionFuenteIva.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jTabbedPaneRelacionesTipoRetencionFuenteIva.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jContentPaneDetalleTipoRetencionFuenteIva.getWidth(),TipoRetencionFuenteIvaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jTabbedPaneRelacionesTipoRetencionFuenteIva.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jContentPaneDetalleTipoRetencionFuenteIva.getWidth(),TipoRetencionFuenteIvaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jTabbedPaneRelacionesTipoRetencionFuenteIva.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jContentPaneDetalleTipoRetencionFuenteIva.getWidth(),TipoRetencionFuenteIvaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoRetencionFuenteIva.setVisible(true);
	        this.jInternalFrameDetalleFormTipoRetencionFuenteIva.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoRetencionFuenteIva() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoRetencionFuenteIva==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoRetencionFuenteIva=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoRetencionFuenteIva,false,this);
				} else {
					this.jInternalFrameOrderByTipoRetencionFuenteIva=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoRetencionFuenteIva,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoRetencionFuenteIva);
				this.jInternalFrameOrderByTipoRetencionFuenteIva.setVisible(false);
				this.jInternalFrameOrderByTipoRetencionFuenteIva.setSelected(false);
				
				this.jInternalFrameOrderByTipoRetencionFuenteIva.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoRetencionFuenteIva"));
				
				this.inicializarActualizarBindingTablaOrderByTipoRetencionFuenteIva();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoRetencionFuenteIva() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoRetencionFuenteIva==null) {
				
				this.jInternalFrameImportacionTipoRetencionFuenteIva=new ImportacionJInternalFrame(TipoRetencionFuenteIvaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoRetencionFuenteIva);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoRetencionFuenteIva);
				this.jInternalFrameImportacionTipoRetencionFuenteIva.setVisible(false);
				this.jInternalFrameImportacionTipoRetencionFuenteIva.setSelected(false);


				this.jInternalFrameImportacionTipoRetencionFuenteIva.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoRetencionFuenteIva"));
				this.jInternalFrameImportacionTipoRetencionFuenteIva.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoRetencionFuenteIva"));
				this.jInternalFrameImportacionTipoRetencionFuenteIva.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoRetencionFuenteIva"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoRetencionFuenteIva() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva==null) {
				this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva=new ReporteDinamicoJInternalFrame(TipoRetencionFuenteIvaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva);
				this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoRetencionFuenteIva"));
				this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoRetencionFuenteIva"));
				this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoRetencionFuenteIva"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoRetencionFuenteIva();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetalleTipoRetencionFuenteIva() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoRetencionFuenteIva);
			
	       	this.jInternalFrameDetalleFormTipoRetencionFuenteIva.setVisible(false);
	        this.jInternalFrameDetalleFormTipoRetencionFuenteIva.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoRetencionFuenteIva.dispose();
			//this.jInternalFrameDetalleFormTipoRetencionFuenteIva=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoRetencionFuenteIva() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoRetencionFuenteIva() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoRetencionFuenteIva.setVisible(true);
	        this.jInternalFrameImportacionTipoRetencionFuenteIva.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoRetencionFuenteIva() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoRetencionFuenteIva.setVisible(true);
	        this.jInternalFrameOrderByTipoRetencionFuenteIva.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoRetencionFuenteIva() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoRetencionFuenteIva.setVisible(false);
	        this.jInternalFrameOrderByTipoRetencionFuenteIva.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoRetencionFuenteIva() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoRetencionFuenteIva() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoRetencionFuenteIva.setVisible(false);
	        this.jInternalFrameImportacionTipoRetencionFuenteIva.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
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
						TitledBorder titledBorderTipoRetencionFuenteIva=(TitledBorder)this.jScrollPanelDatosTipoRetencionFuenteIva.getBorder();
						TitledBorder titledBorderCuentaContable=(TitledBorder)cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

						titledBorderCuentaContable.setTitle(titledBorderTipoRetencionFuenteIva.getTitle() + " -> Cuenta Contable");


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
						TitledBorder titledBorderTipoRetencionFuenteIva=(TitledBorder)this.jScrollPanelDatosTipoRetencionFuenteIva.getBorder();
						TitledBorder titledBorderCuentaContableCredito=(TitledBorder)cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

						titledBorderCuentaContableCredito.setTitle(titledBorderTipoRetencionFuenteIva.getTitle() + " -> Cuenta Contable");


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
	
	public void jButtonModificarTipoRetencionFuenteIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoRetencionFuenteIva(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoRetencionFuenteIva(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoRetencionFuenteIva.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoRetencionFuenteIva(true);
			//this.isEsNuevoTipoRetencionFuenteIva=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteiva =(TipoRetencionFuenteIva) this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiporetencionfuenteiva =(TipoRetencionFuenteIva) this.tiporetencionfuenteivas.toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoRetencionFuenteIva("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoRetencionFuenteIva(false) ;
			
			if(tiporetencionfuenteivaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoRetencionFuenteIvaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoRetencionFuenteIva(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoRetencionFuenteIva(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoRetencionFuenteIvaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoRetencionFuenteIva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteiva =(TipoRetencionFuenteIva) this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporetencionfuenteiva =(TipoRetencionFuenteIva) this.tiporetencionfuenteivas.toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoRetencionFuenteIva(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoRetencionFuenteIva.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoRetencionFuenteIva(true);
			//this.isEsNuevoTipoRetencionFuenteIva=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteiva =(TipoRetencionFuenteIva) this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiporetencionfuenteiva =(TipoRetencionFuenteIva) this.tiporetencionfuenteivas.toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tiporetencionfuenteiva.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoRetencionFuenteIva("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoRetencionFuenteIva(false) ;
			
			if(TipoRetencionFuenteIvaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoRetencionFuenteIva(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoRetencionFuenteIva(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("CuentaContable")) {
				if(!this.tiporetencionfuenteivaConstantesFunciones.cargarid_cuenta_contableTipoRetencionFuenteIva) {
					this.cargarCombosCuentaContablesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingTipoRetencionFuenteIva(false,false);
					this.cargarCombosFrameCuentaContablesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cuenta_contable (id);

				this.recargarComboTablaCuentaContable(this.cuentacontablesForeignKey);

			}
			
			if(sType.equals("CuentaContableCredito")) {
				if(!this.tiporetencionfuenteivaConstantesFunciones.cargarid_cuenta_contable_creditoTipoRetencionFuenteIva) {
					this.cargarCombosCuentaContableCreditosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingTipoRetencionFuenteIva(false,false);
					this.cargarCombosFrameCuentaContableCreditosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cuenta_contable_credito (id);

				this.recargarComboTablaCuentaContableCredito(this.cuentacontablecreditosForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaPais(List<Pais> paissForeignKey)throws Exception{
		TableColumn tableColumnPais=this.jTableDatosTipoRetencionFuenteIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRetencionFuenteIva,TipoRetencionFuenteIvaConstantesFunciones.LABEL_IDPAIS));
		TableCellEditor tableCellEditorPais =tableColumnPais.getCellEditor();

		PaisTableCell paisTableCellFk=(PaisTableCell)tableCellEditorPais;

		if(paisTableCellFk!=null) {
			paisTableCellFk.setpaissForeignKey(paissForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTipoRetencionFuenteIva.getSelectedRow();

		//if(intSelectedRow<=0) {
			//paisTableCellFk.setRowActual(intSelectedRow);
			//paisTableCellFk.setpaissForeignKeyActual(paissForeignKey);
		//}


		if(paisTableCellFk!=null) {
			paisTableCellFk.RecargarPaissForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCuentaContable(List<CuentaContable> cuentacontablesForeignKey)throws Exception{
		TableColumn tableColumnCuentaContable=this.jTableDatosTipoRetencionFuenteIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRetencionFuenteIva,TipoRetencionFuenteIvaConstantesFunciones.LABEL_IDCUENTACONTABLE));
		TableCellEditor tableCellEditorCuentaContable =tableColumnCuentaContable.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContable;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontablesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTipoRetencionFuenteIva.getSelectedRow();

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
		TableColumn tableColumnCuentaContableCredito=this.jTableDatosTipoRetencionFuenteIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRetencionFuenteIva,TipoRetencionFuenteIvaConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO));
		TableCellEditor tableCellEditorCuentaContableCredito =tableColumnCuentaContableCredito.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContableCredito;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontablecreditosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTipoRetencionFuenteIva.getSelectedRow();

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
	
	public void jButtonActualizarTipoRetencionFuenteIvaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoRetencionFuenteIva(false);
			
			//if(!this.isEsNuevoTipoRetencionFuenteIva) {								
				int intSelectedRow = this.jTableDatosTipoRetencionFuenteIva.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteiva =(TipoRetencionFuenteIva) this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiporetencionfuenteiva =(TipoRetencionFuenteIva) this.tiporetencionfuenteivas.toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoRetencionFuenteIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoRetencionFuenteIva(this.tiporetencionfuenteiva,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencionFuenteIva(this.tiporetencionfuenteiva);
				
			}
			
			if(this.permiteMantenimiento(this.tiporetencionfuenteiva)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoRetencionFuenteIva=true;
					this.inicializarActualizarBindingTablaTipoRetencionFuenteIva(false);
					this.isEsNuevoTipoRetencionFuenteIva=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoRetencionFuenteIva=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoRetencionFuenteIva=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoRetencionFuenteIva(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoRetencionFuenteIva(false);
				
				this.habilitarDeshabilitarControlesTipoRetencionFuenteIva(false);
			
												
				
				if(TipoRetencionFuenteIvaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoRetencionFuenteIva();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoRetencionFuenteIvaActionPerformed(evt,tiporetencionfuenteivaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoRetencionFuenteIva(this.tiporetencionfuenteiva,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoRetencionFuenteIva.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tiporetencionfuenteivaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tiporetencionfuenteiva.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoRetencionFuenteIva.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRetencionFuenteIva.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoRetencionFuenteIvaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoRetencionFuenteIva.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteiva =(TipoRetencionFuenteIva) this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
				this.tiporetencionfuenteiva.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiporetencionfuenteiva =(TipoRetencionFuenteIva) this.tiporetencionfuenteivas.toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
				this.tiporetencionfuenteiva.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tiporetencionfuenteiva)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoRetencionFuenteIvaModel) this.jTableDatosTipoRetencionFuenteIva.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoRetencionFuenteIva=true;
				this.inicializarActualizarBindingTablaTipoRetencionFuenteIva(false);
				this.isEsNuevoTipoRetencionFuenteIva=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoRetencionFuenteIva(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoRetencionFuenteIva(false);
				
				this.habilitarDeshabilitarControlesTipoRetencionFuenteIva(false);
				
				
				
				if(TipoRetencionFuenteIvaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoRetencionFuenteIva();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoRetencionFuenteIvaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoRetencionFuenteIva.getRowCount()>=1) {
				jTableDatosTipoRetencionFuenteIva.removeRowSelectionInterval(0, jTableDatosTipoRetencionFuenteIva.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoRetencionFuenteIva(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoRetencionFuenteIva(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoRetencionFuenteIva(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoRetencionFuenteIva(false) ;
			
			this.isEsNuevoTipoRetencionFuenteIva=false;
			
			if(TipoRetencionFuenteIvaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoRetencionFuenteIva();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoRetencionFuenteIvaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoRetencionFuenteIva(false);
				
				//SI ES MANUAL
				if(TipoRetencionFuenteIvaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoRetencionFuenteIva();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoRetencionFuenteIvaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoRetencionFuenteIva--;			
			//TipoRetencionFuenteIva tiporetencionfuenteivaAux= new TipoRetencionFuenteIva();			
			//tiporetencionfuenteivaAux.setId(this.iIdNuevoTipoRetencionFuenteIva);
			
			if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoRetencionFuenteIva();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencionFuenteIva(this.tiporetencionfuenteiva);
			
			this.tiporetencionfuenteiva.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().add(this.tiporetencionfuenteivaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tiporetencionfuenteivas.add(this.tiporetencionfuenteivaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoRetencionFuenteIva(false);
			
			this.jTableDatosTipoRetencionFuenteIva.setRowSelectionInterval(this.getIndiceNuevoTipoRetencionFuenteIva(), this.getIndiceNuevoTipoRetencionFuenteIva());
			
			int iLastRow =  this.jTableDatosTipoRetencionFuenteIva.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoRetencionFuenteIva.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoRetencionFuenteIva.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoRetencionFuenteIva(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoRetencionFuenteIvaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoRetencionFuenteIva(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoRetencionFuenteIva(false);
			
			//SI ES MANUAL
			if(TipoRetencionFuenteIvaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoRetencionFuenteIva();
			}
			
			//this.abrirFrameTreeTipoRetencionFuenteIva();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoRetencionFuenteIvaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Retencion Fuente IvaS ?", "MANTENIMIENTO DE Tipo Retencion Fuente Iva", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoRetencionFuenteIva.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoRetencionFuenteIva();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tiporetencionfuenteivaReturnGeneral=tiporetencionfuenteivaLogic.procesarImportacionTipoRetencionFuenteIvasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tiporetencionfuenteivaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoRetencionFuenteIvaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoRetencionFuenteIvaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoRetencionFuenteIva.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoRetencionFuenteIva.setFileImportacion(this.jInternalFrameImportacionTipoRetencionFuenteIva.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoRetencionFuenteIva.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoRetencionFuenteIva.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoRetencionFuenteIva.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoRetencionFuenteIva.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoRetencionFuenteIvaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoRetencionFuenteIva> tiporetencionfuenteivasSeleccionados=new ArrayList<TipoRetencionFuenteIva>();		

		tiporetencionfuenteivasSeleccionados=this.getTipoRetencionFuenteIvasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoRetencionFuenteIvaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoRetencionFuenteIvaBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoRetencionFuenteIvas("Todos",tiporetencionfuenteivasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Retencion Fuente Iva",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_IDPAIS:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Pais_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Pais_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Pais_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Pais_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_PORCENTAJE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentaje_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentaje_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentaje_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentaje_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_MONTOMINIMO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntoMinimo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntoMinimo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntoMinimo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntoMinimo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CuentaContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CuentaContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CuentaContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CuentaContable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CuentaContableCredito_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CuentaContableCredito_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CuentaContableCredito_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CuentaContableCredito_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESRETENCIONIVA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_RetencionIva_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_RetencionIva_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_RetencionIva_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_RetencionIva_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESDEBITO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Debito_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Debito_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Debito_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Debito_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESCONIVAFACTURA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ConIvaFactura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ConIvaFactura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ConIvaFactura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ConIvaFactura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESCONSUBTOTALFACTURA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ConSubTotalFactura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ConSubTotalFactura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ConSubTotalFactura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ConSubTotalFactura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESCONSECUENCIAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ConSecuencial_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ConSecuencial_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ConSecuencial_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ConSecuencial_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoria="id_pais";
					break;

				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoria="porcentaje";
					break;

				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_MONTOMINIMO:
					sNombreCampoCategoria="monto_minimo";
					break;

				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_IDCUENTACONTABLE:
					sNombreCampoCategoria="id_cuenta_contable";
					break;

				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO:
					sNombreCampoCategoria="id_cuenta_contable_credito";
					break;

				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESRETENCIONIVA:
					sNombreCampoCategoria="es_retencion_iva";
					break;

				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESDEBITO:
					sNombreCampoCategoria="es_debito";
					break;

				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESCONIVAFACTURA:
					sNombreCampoCategoria="es_con_iva_factura";
					break;

				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESCONSUBTOTALFACTURA:
					sNombreCampoCategoria="es_con_sub_total_factura";
					break;

				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESCONSECUENCIAL:
					sNombreCampoCategoria="es_con_secuencial";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoriaValor="id_pais";
					break;

				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoriaValor="porcentaje";
					break;

				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_MONTOMINIMO:
					sNombreCampoCategoriaValor="monto_minimo";
					break;

				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_IDCUENTACONTABLE:
					sNombreCampoCategoriaValor="id_cuenta_contable";
					break;

				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO:
					sNombreCampoCategoriaValor="id_cuenta_contable_credito";
					break;

				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESRETENCIONIVA:
					sNombreCampoCategoriaValor="es_retencion_iva";
					break;

				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESDEBITO:
					sNombreCampoCategoriaValor="es_debito";
					break;

				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESCONIVAFACTURA:
					sNombreCampoCategoriaValor="es_con_iva_factura";
					break;

				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESCONSUBTOTALFACTURA:
					sNombreCampoCategoriaValor="es_con_sub_total_factura";
					break;

				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESCONSECUENCIAL:
					sNombreCampoCategoriaValor="es_con_secuencial";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_IDPAIS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Pais",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_pais");
					break;

				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_PORCENTAJE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje");
					break;

				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_MONTOMINIMO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Monto Minimo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"monto_minimo");
					break;

				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_IDCUENTACONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cuenta Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cuenta_contable");
					break;

				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cuenta Contable Credito",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cuenta_contable_credito");
					break;

				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESRETENCIONIVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Retencion Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_retencion_iva");
					break;

				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESDEBITO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Debito",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_debito");
					break;

				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESCONIVAFACTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Con Iva Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_con_iva_factura");
					break;

				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESCONSUBTOTALFACTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Con Sub Total Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_con_sub_total_factura");
					break;

				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESCONSECUENCIAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Con Secuencial",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_con_secuencial");
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoRetencionFuenteIvaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoRetencionFuenteIva> tiporetencionfuenteivasSeleccionados=new ArrayList<TipoRetencionFuenteIva>();		
		
		tiporetencionfuenteivasSeleccionados=this.getTipoRetencionFuenteIvasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporetencionfuenteiva";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoRetencionFuenteIvas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_IDPAIS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoRetencionFuenteIvaConstantesFunciones.LABEL_IDPAIS);
					iRow++;

					for(TipoRetencionFuenteIva tiporetencionfuenteiva:tiporetencionfuenteivasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiporetencionfuenteiva.getpais_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoRetencionFuenteIvaConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoRetencionFuenteIva tiporetencionfuenteiva:tiporetencionfuenteivasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiporetencionfuenteiva.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoRetencionFuenteIvaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoRetencionFuenteIva tiporetencionfuenteiva:tiporetencionfuenteivasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiporetencionfuenteiva.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_PORCENTAJE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoRetencionFuenteIvaConstantesFunciones.LABEL_PORCENTAJE);
					iRow++;

					for(TipoRetencionFuenteIva tiporetencionfuenteiva:tiporetencionfuenteivasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiporetencionfuenteiva.getporcentaje());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_MONTOMINIMO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoRetencionFuenteIvaConstantesFunciones.LABEL_MONTOMINIMO);
					iRow++;

					for(TipoRetencionFuenteIva tiporetencionfuenteiva:tiporetencionfuenteivasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiporetencionfuenteiva.getmonto_minimo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoRetencionFuenteIvaConstantesFunciones.LABEL_IDCUENTACONTABLE);
					iRow++;

					for(TipoRetencionFuenteIva tiporetencionfuenteiva:tiporetencionfuenteivasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiporetencionfuenteiva.getcuentacontable_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoRetencionFuenteIvaConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO);
					iRow++;

					for(TipoRetencionFuenteIva tiporetencionfuenteiva:tiporetencionfuenteivasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiporetencionfuenteiva.getcuentacontablecredito_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESRETENCIONIVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESRETENCIONIVA);
					iRow++;

					for(TipoRetencionFuenteIva tiporetencionfuenteiva:tiporetencionfuenteivasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiporetencionfuenteiva.getes_retencion_iva());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESDEBITO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESDEBITO);
					iRow++;

					for(TipoRetencionFuenteIva tiporetencionfuenteiva:tiporetencionfuenteivasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiporetencionfuenteiva.getes_debito());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESCONIVAFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESCONIVAFACTURA);
					iRow++;

					for(TipoRetencionFuenteIva tiporetencionfuenteiva:tiporetencionfuenteivasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiporetencionfuenteiva.getes_con_iva_factura());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESCONSUBTOTALFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESCONSUBTOTALFACTURA);
					iRow++;

					for(TipoRetencionFuenteIva tiporetencionfuenteiva:tiporetencionfuenteivasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiporetencionfuenteiva.getes_con_sub_total_factura());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESCONSECUENCIAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESCONSECUENCIAL);
					iRow++;

					for(TipoRetencionFuenteIva tiporetencionfuenteiva:tiporetencionfuenteivasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiporetencionfuenteiva.getes_con_secuencial());
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
			//	this.getFilaCabeceraExportarExcelTipoRetencionFuenteIva(row);				
			//	iRow++;
			//}				
			
			//for(TipoRetencionFuenteIva tiporetencionfuenteivaAux:tiporetencionfuenteivasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoRetencionFuenteIva(tiporetencionfuenteivaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Retencion Fuente Iva",JOptionPane.INFORMATION_MESSAGE);
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
				this.tiporetencionfuenteivaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoRetencionFuenteIva(false);
			
			//SI ES MANUAL
			if(TipoRetencionFuenteIvaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoRetencionFuenteIva();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoRetencionFuenteIvaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoRetencionFuenteIva(false);
			
			//SI ES MANUAL
			if(TipoRetencionFuenteIvaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoRetencionFuenteIva();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoRetencionFuenteIvaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoRetencionFuenteIva(false);
			
			//SI ES MANUAL
			if(TipoRetencionFuenteIvaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoRetencionFuenteIva();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoRetencionFuenteIva() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoRetencionFuenteIva.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoRetencionFuenteIva.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoRetencionFuenteIva.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoRetencionFuenteIva.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoRetencionFuenteIva.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoRetencionFuenteIva.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoRetencionFuenteIva.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoRetencionFuenteIva(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoRetencionFuenteIva(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoRetencionFuenteIva(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoRetencionFuenteIva(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoRetencionFuenteIva(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoRetencionFuenteIva(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoRetencionFuenteIva(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoRetencionFuenteIva(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoRetencionFuenteIvaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoRetencionFuenteIvaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoRetencionFuenteIva() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoRetencionFuenteIva();
		
		this.inicializarActualizarBindingBotonesManualTipoRetencionFuenteIva(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoRetencionFuenteIva();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoRetencionFuenteIva() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoRetencionFuenteIva(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoRetencionFuenteIva(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoRetencionFuenteIva.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoRetencionFuenteIva.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoRetencionFuenteIva.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jCheckBoxPostAccionNuevoTipoRetencionFuenteIva.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jCheckBoxPostAccionSinCerrarTipoRetencionFuenteIva.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jCheckBoxPostAccionSinMensajeTipoRetencionFuenteIva.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoRetencionFuenteIva.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoRetencionFuenteIva.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoRetencionFuenteIva.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) {
				this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jCheckBoxPostAccionNuevoTipoRetencionFuenteIva.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jCheckBoxPostAccionSinCerrarTipoRetencionFuenteIva.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jCheckBoxPostAccionSinMensajeTipoRetencionFuenteIva.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoRetencionFuenteIva.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoRetencionFuenteIva.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxTiposAccionesFormularioTipoRetencionFuenteIva.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoRetencionFuenteIva.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoRetencionFuenteIva.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoRetencionFuenteIva.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoRetencionFuenteIva.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoRetencionFuenteIva.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoRetencionFuenteIva.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoRetencionFuenteIva.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoRetencionFuenteIva(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoRetencionFuenteIvaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoRetencionFuenteIva(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoRetencionFuenteIva() throws Exception {
		try	{
			if(TipoRetencionFuenteIvaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoRetencionFuenteIva();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoRetencionFuenteIva() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxTiposAccionesFormularioTipoRetencionFuenteIva.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxTiposAccionesFormularioTipoRetencionFuenteIva.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoRetencionFuenteIva() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoRetencionFuenteIva.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoRetencionFuenteIva.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoRetencionFuenteIva.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoRetencionFuenteIva.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoRetencionFuenteIva.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoRetencionFuenteIva.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoRetencionFuenteIva.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoRetencionFuenteIva.addItem(reporte);
			}
			
			
			if(!this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoRetencionFuenteIva.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoRetencionFuenteIva.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoRetencionFuenteIva.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoRetencionFuenteIva.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoRetencionFuenteIva.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoRetencionFuenteIva.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxTiposAccionesFormularioTipoRetencionFuenteIva.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxTiposAccionesFormularioTipoRetencionFuenteIva.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoRetencionFuenteIva.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoRetencionFuenteIva.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoRetencionFuenteIva.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoRetencionFuenteIva();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoRetencionFuenteIva() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva!=null) {
				this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva!=null) {
				this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=TipoRetencionFuenteIvaConstantesFunciones.getTiposSeleccionarTipoRetencionFuenteIva(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=TipoRetencionFuenteIvaConstantesFunciones.getTiposSeleccionarTipoRetencionFuenteIva(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=TipoRetencionFuenteIvaConstantesFunciones.getTiposSeleccionarTipoRetencionFuenteIva(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoRetencionFuenteIva()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoTipoRetencionFuenteIva.getText();
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreTipoRetencionFuenteIva.getText();
		if(this.jComboBoxid_paisFK_IdPaisTipoRetencionFuenteIva.getSelectedItem()!=null){this.id_paisFK_IdPais=((Pais)this.jComboBoxid_paisFK_IdPaisTipoRetencionFuenteIva.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoRetencionFuenteIva(Boolean esInicializar) throws Exception {				
		if(TipoRetencionFuenteIvaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoRetencionFuenteIva();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoRetencionFuenteIva() throws Exception {
		this.inicializarActualizarBindingTablaTipoRetencionFuenteIva(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoRetencionFuenteIva() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoRetencionFuenteIva.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoRetencionFuenteIva.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoRetencionFuenteIva.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoRetencionFuenteIvaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoRetencionFuenteIva.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoRetencionFuenteIva.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoRetencionFuenteIvaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoRetencionFuenteIvaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRetencionFuenteIvaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoRetencionFuenteIvaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoRetencionFuenteIva.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoRetencionFuenteIva.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoRetencionFuenteIvaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoRetencionFuenteIva.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoRetencionFuenteIva(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tiporetencionfuenteivas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoRetencionFuenteIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoRetencionFuenteIva.setModel(new TipoRetencionFuenteIvaModel(this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoRetencionFuenteIva.setModel(new TipoRetencionFuenteIvaModel(this.tiporetencionfuenteivas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoRetencionFuenteIva!=null && this.jInternalFrameOrderByTipoRetencionFuenteIva.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoRetencionFuenteIva();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoRetencionFuenteIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRetencionFuenteIva,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoRetencionFuenteIvaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoRetencionFuenteIvaConstantesFunciones.SCLASSWEBTITULO,tiporetencionfuenteivaConstantesFunciones.resaltarSeleccionarTipoRetencionFuenteIva,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoRetencionFuenteIvaConstantesFunciones.SCLASSWEBTITULO,tiporetencionfuenteivaConstantesFunciones.resaltarSeleccionarTipoRetencionFuenteIva,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoRetencionFuenteIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRetencionFuenteIva,TipoRetencionFuenteIvaConstantesFunciones.LABEL_ID));

		if(this.tiporetencionfuenteivaConstantesFunciones.mostraridTipoRetencionFuenteIva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRetencionFuenteIvaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tiporetencionfuenteivaConstantesFunciones.resaltaridTipoRetencionFuenteIva,this.tiporetencionfuenteivaConstantesFunciones.activaridTipoRetencionFuenteIva,iSizeTabla,this,true,"idTipoRetencionFuenteIva","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiporetencionfuenteivaConstantesFunciones.resaltaridTipoRetencionFuenteIva,this.tiporetencionfuenteivaConstantesFunciones.activaridTipoRetencionFuenteIva,this,true,"idTipoRetencionFuenteIva","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoRetencionFuenteIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRetencionFuenteIva,TipoRetencionFuenteIvaConstantesFunciones.LABEL_IDPAIS));

		if(this.tiporetencionfuenteivaConstantesFunciones.mostrarid_paisTipoRetencionFuenteIva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRetencionFuenteIvaConstantesFunciones.LABEL_IDPAIS,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PaisTableCell(this.paissForeignKey,this.tiporetencionfuenteivaConstantesFunciones.resaltarid_paisTipoRetencionFuenteIva,this,this.tiporetencionfuenteivaConstantesFunciones.activarid_paisTipoRetencionFuenteIva,iSizeTabla));
			tableColumn.setCellEditor(new PaisTableCell(this.paissForeignKey,this.tiporetencionfuenteivaConstantesFunciones.resaltarid_paisTipoRetencionFuenteIva,this,this.tiporetencionfuenteivaConstantesFunciones.activarid_paisTipoRetencionFuenteIva,true,"id_paisTipoRetencionFuenteIva","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoRetencionFuenteIvaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoRetencionFuenteIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRetencionFuenteIva,TipoRetencionFuenteIvaConstantesFunciones.LABEL_CODIGO));

		if(this.tiporetencionfuenteivaConstantesFunciones.mostrarcodigoTipoRetencionFuenteIva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRetencionFuenteIvaConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tiporetencionfuenteivaConstantesFunciones.resaltarcodigoTipoRetencionFuenteIva,this.tiporetencionfuenteivaConstantesFunciones.activarcodigoTipoRetencionFuenteIva,iSizeTabla,this,true,"codigoTipoRetencionFuenteIva","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiporetencionfuenteivaConstantesFunciones.resaltarcodigoTipoRetencionFuenteIva,this.tiporetencionfuenteivaConstantesFunciones.activarcodigoTipoRetencionFuenteIva,this,true,"codigoTipoRetencionFuenteIva","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoRetencionFuenteIvaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoRetencionFuenteIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRetencionFuenteIva,TipoRetencionFuenteIvaConstantesFunciones.LABEL_NOMBRE));

		if(this.tiporetencionfuenteivaConstantesFunciones.mostrarnombreTipoRetencionFuenteIva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRetencionFuenteIvaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tiporetencionfuenteivaConstantesFunciones.resaltarnombreTipoRetencionFuenteIva,this.tiporetencionfuenteivaConstantesFunciones.activarnombreTipoRetencionFuenteIva,iSizeTabla,this,true,"nombreTipoRetencionFuenteIva","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiporetencionfuenteivaConstantesFunciones.resaltarnombreTipoRetencionFuenteIva,this.tiporetencionfuenteivaConstantesFunciones.activarnombreTipoRetencionFuenteIva,this,true,"nombreTipoRetencionFuenteIva","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new TipoRetencionFuenteIvaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoRetencionFuenteIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRetencionFuenteIva,TipoRetencionFuenteIvaConstantesFunciones.LABEL_PORCENTAJE));

		if(this.tiporetencionfuenteivaConstantesFunciones.mostrarporcentajeTipoRetencionFuenteIva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRetencionFuenteIvaConstantesFunciones.LABEL_PORCENTAJE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tiporetencionfuenteivaConstantesFunciones.resaltarporcentajeTipoRetencionFuenteIva,this.tiporetencionfuenteivaConstantesFunciones.activarporcentajeTipoRetencionFuenteIva,iSizeTabla,this,true,"porcentajeTipoRetencionFuenteIva","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiporetencionfuenteivaConstantesFunciones.resaltarporcentajeTipoRetencionFuenteIva,this.tiporetencionfuenteivaConstantesFunciones.activarporcentajeTipoRetencionFuenteIva,this,true,"porcentajeTipoRetencionFuenteIva","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TipoRetencionFuenteIvaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoRetencionFuenteIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRetencionFuenteIva,TipoRetencionFuenteIvaConstantesFunciones.LABEL_MONTOMINIMO));

		if(this.tiporetencionfuenteivaConstantesFunciones.mostrarmonto_minimoTipoRetencionFuenteIva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRetencionFuenteIvaConstantesFunciones.LABEL_MONTOMINIMO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tiporetencionfuenteivaConstantesFunciones.resaltarmonto_minimoTipoRetencionFuenteIva,this.tiporetencionfuenteivaConstantesFunciones.activarmonto_minimoTipoRetencionFuenteIva,iSizeTabla,this,true,"monto_minimoTipoRetencionFuenteIva","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiporetencionfuenteivaConstantesFunciones.resaltarmonto_minimoTipoRetencionFuenteIva,this.tiporetencionfuenteivaConstantesFunciones.activarmonto_minimoTipoRetencionFuenteIva,this,true,"monto_minimoTipoRetencionFuenteIva","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TipoRetencionFuenteIvaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoRetencionFuenteIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRetencionFuenteIva,TipoRetencionFuenteIvaConstantesFunciones.LABEL_IDCUENTACONTABLE));

		if(this.tiporetencionfuenteivaConstantesFunciones.mostrarid_cuenta_contableTipoRetencionFuenteIva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRetencionFuenteIvaConstantesFunciones.LABEL_IDCUENTACONTABLE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CuentaContableTableCell(this.cuentacontablesForeignKey,this.tiporetencionfuenteivaConstantesFunciones.resaltarid_cuenta_contableTipoRetencionFuenteIva,this,this.tiporetencionfuenteivaConstantesFunciones.activarid_cuenta_contableTipoRetencionFuenteIva,iSizeTabla));
			tableColumn.setCellEditor(new CuentaContableTableCell(this.cuentacontablesForeignKey,this.tiporetencionfuenteivaConstantesFunciones.resaltarid_cuenta_contableTipoRetencionFuenteIva,this,this.tiporetencionfuenteivaConstantesFunciones.activarid_cuenta_contableTipoRetencionFuenteIva,true,"id_cuenta_contableTipoRetencionFuenteIva","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70);
			//tableColumn.addPropertyChangeListener(new TipoRetencionFuenteIvaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoRetencionFuenteIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRetencionFuenteIva,TipoRetencionFuenteIvaConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO));

		if(this.tiporetencionfuenteivaConstantesFunciones.mostrarid_cuenta_contable_creditoTipoRetencionFuenteIva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRetencionFuenteIvaConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CuentaContableTableCell(this.cuentacontablecreditosForeignKey,this.tiporetencionfuenteivaConstantesFunciones.resaltarid_cuenta_contable_creditoTipoRetencionFuenteIva,this,this.tiporetencionfuenteivaConstantesFunciones.activarid_cuenta_contable_creditoTipoRetencionFuenteIva,iSizeTabla));
			tableColumn.setCellEditor(new CuentaContableTableCell(this.cuentacontablecreditosForeignKey,this.tiporetencionfuenteivaConstantesFunciones.resaltarid_cuenta_contable_creditoTipoRetencionFuenteIva,this,this.tiporetencionfuenteivaConstantesFunciones.activarid_cuenta_contable_creditoTipoRetencionFuenteIva,true,"id_cuenta_contable_creditoTipoRetencionFuenteIva","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70);
			//tableColumn.addPropertyChangeListener(new TipoRetencionFuenteIvaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoRetencionFuenteIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRetencionFuenteIva,TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESRETENCIONIVA));

		if(this.tiporetencionfuenteivaConstantesFunciones.mostrares_retencion_ivaTipoRetencionFuenteIva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESRETENCIONIVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.tiporetencionfuenteivaConstantesFunciones.resaltares_retencion_ivaTipoRetencionFuenteIva,this.tiporetencionfuenteivaConstantesFunciones.activares_retencion_ivaTipoRetencionFuenteIva,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.tiporetencionfuenteivaConstantesFunciones.resaltares_retencion_ivaTipoRetencionFuenteIva,this.tiporetencionfuenteivaConstantesFunciones.activares_retencion_ivaTipoRetencionFuenteIva,this,true,"es_retencion_ivaTipoRetencionFuenteIva","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TipoRetencionFuenteIvaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoRetencionFuenteIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRetencionFuenteIva,TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESDEBITO));

		if(this.tiporetencionfuenteivaConstantesFunciones.mostrares_debitoTipoRetencionFuenteIva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESDEBITO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.tiporetencionfuenteivaConstantesFunciones.resaltares_debitoTipoRetencionFuenteIva,this.tiporetencionfuenteivaConstantesFunciones.activares_debitoTipoRetencionFuenteIva,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.tiporetencionfuenteivaConstantesFunciones.resaltares_debitoTipoRetencionFuenteIva,this.tiporetencionfuenteivaConstantesFunciones.activares_debitoTipoRetencionFuenteIva,this,true,"es_debitoTipoRetencionFuenteIva","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TipoRetencionFuenteIvaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoRetencionFuenteIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRetencionFuenteIva,TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESCONIVAFACTURA));

		if(this.tiporetencionfuenteivaConstantesFunciones.mostrares_con_iva_facturaTipoRetencionFuenteIva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESCONIVAFACTURA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.tiporetencionfuenteivaConstantesFunciones.resaltares_con_iva_facturaTipoRetencionFuenteIva,this.tiporetencionfuenteivaConstantesFunciones.activares_con_iva_facturaTipoRetencionFuenteIva,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.tiporetencionfuenteivaConstantesFunciones.resaltares_con_iva_facturaTipoRetencionFuenteIva,this.tiporetencionfuenteivaConstantesFunciones.activares_con_iva_facturaTipoRetencionFuenteIva,this,true,"es_con_iva_facturaTipoRetencionFuenteIva","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TipoRetencionFuenteIvaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoRetencionFuenteIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRetencionFuenteIva,TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESCONSUBTOTALFACTURA));

		if(this.tiporetencionfuenteivaConstantesFunciones.mostrares_con_sub_total_facturaTipoRetencionFuenteIva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESCONSUBTOTALFACTURA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.tiporetencionfuenteivaConstantesFunciones.resaltares_con_sub_total_facturaTipoRetencionFuenteIva,this.tiporetencionfuenteivaConstantesFunciones.activares_con_sub_total_facturaTipoRetencionFuenteIva,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.tiporetencionfuenteivaConstantesFunciones.resaltares_con_sub_total_facturaTipoRetencionFuenteIva,this.tiporetencionfuenteivaConstantesFunciones.activares_con_sub_total_facturaTipoRetencionFuenteIva,this,true,"es_con_sub_total_facturaTipoRetencionFuenteIva","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TipoRetencionFuenteIvaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoRetencionFuenteIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRetencionFuenteIva,TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESCONSECUENCIAL));

		if(this.tiporetencionfuenteivaConstantesFunciones.mostrares_con_secuencialTipoRetencionFuenteIva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESCONSECUENCIAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.tiporetencionfuenteivaConstantesFunciones.resaltares_con_secuencialTipoRetencionFuenteIva,this.tiporetencionfuenteivaConstantesFunciones.activares_con_secuencialTipoRetencionFuenteIva,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.tiporetencionfuenteivaConstantesFunciones.resaltares_con_secuencialTipoRetencionFuenteIva,this.tiporetencionfuenteivaConstantesFunciones.activares_con_secuencialTipoRetencionFuenteIva,this,true,"es_con_secuencialTipoRetencionFuenteIva","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TipoRetencionFuenteIvaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoRetencionFuenteIva.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoRetencionFuenteIva.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoRetencionFuenteIva && this.isPermisoGuardarCambiosTipoRetencionFuenteIva) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoRetencionFuenteIva.addColumn(tableColumn);
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
			
			this.jTableDatosTipoRetencionFuenteIva.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoRetencionFuenteIva && this.isPermisoGuardarCambiosTipoRetencionFuenteIva) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoRetencionFuenteIva && this.isPermisoGuardarCambiosTipoRetencionFuenteIva) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoRetencionFuenteIva.moveColumn(this.jTableDatosTipoRetencionFuenteIva.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoRetencionFuenteIva.moveColumn(this.jTableDatosTipoRetencionFuenteIva.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoRetencionFuenteIva.moveColumn(this.jTableDatosTipoRetencionFuenteIva.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoRetencionFuenteIva.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoRetencionFuenteIva.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoRetencionFuenteIva,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoRetencionFuenteIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoRetencionFuenteIva.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoRetencionFuenteIva.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoRetencionFuenteIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoRetencionFuenteIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoRetencionFuenteIva.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoRetencionFuenteIva.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoRetencionFuenteIva.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tiporetencionfuenteivas.size()-1;
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
		//this.jTableDatosTipoRetencionFuenteIva.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoRetencionFuenteIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoRetencionFuenteIva();
			
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
				
				//this.isEsNuevoTipoRetencionFuenteIva=false;
					
				TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tiporetencionfuenteiva,new Object(),this.tiporetencionfuenteivaParameterGeneral,this.tiporetencionfuenteivaReturnGeneral);
			
				if(this.tiporetencionfuenteivaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoRetencionFuenteIva.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoRetencionFuenteIva.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteiva =(TipoRetencionFuenteIva) this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporetencionfuenteiva =(TipoRetencionFuenteIva) this.tiporetencionfuenteivas.toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tiporetencionfuenteiva.getsType().equals("DUPLICADO")
				   || this.tiporetencionfuenteiva.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoRetencionFuenteIva=true;
				
				} else {
					this.isEsNuevoTipoRetencionFuenteIva=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado()) {
					if(this.tiporetencionfuenteiva.getId()>=0 && !this.tiporetencionfuenteiva.getIsNew()) {						
						this.isEsNuevoTipoRetencionFuenteIva=false;
						
					} else {
						this.isEsNuevoTipoRetencionFuenteIva=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoRetencionFuenteIva(esRelaciones);						
				
				this.seleccionarTipoRetencionFuenteIva(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tiporetencionfuenteiva.getId()<0) {
					this.isEsNuevoTipoRetencionFuenteIva=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoRetencionFuenteIva(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoRetencionFuenteIva(evt,rowIndex);
				}	
				
				if(this.tiporetencionfuenteivaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoRetencionFuenteIva: " + this.dDif); 
					}
				}								
				
				TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tiporetencionfuenteiva,new Object(),this.tiporetencionfuenteivaParameterGeneral,this.tiporetencionfuenteivaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoRetencionFuenteIva(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tiporetencionfuenteiva)) {
					if(this.tiporetencionfuenteiva.getId()>0) {
						this.tiporetencionfuenteiva.setIsDeleted(true);
						
						this.tiporetencionfuenteivasEliminados.add(this.tiporetencionfuenteiva);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().remove(this.tiporetencionfuenteiva);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tiporetencionfuenteivas.remove(this.tiporetencionfuenteiva);				
					}
					
					
					((TipoRetencionFuenteIvaModel) this.jTableDatosTipoRetencionFuenteIva.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoRetencionFuenteIva(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoRetencionFuenteIva(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoRetencionFuenteIva) {
			
			if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoRetencionFuenteIva.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoRetencionFuenteIva.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteiva =(TipoRetencionFuenteIva) this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporetencionfuenteiva =(TipoRetencionFuenteIva) this.tiporetencionfuenteivas.toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoRetencionFuenteIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoRetencionFuenteIva(this.tiporetencionfuenteiva);
				}
				
				//ARCHITECTURE
				try {
					

					//Pais
					if(!this.tiporetencionfuenteivaConstantesFunciones.cargarid_paisTipoRetencionFuenteIva || this.tiporetencionfuenteivaConstantesFunciones.event_dependid_paisTipoRetencionFuenteIva) {
						//this.cargarCombosPaissForeignKeyLista(" where id="+this.tiporetencionfuenteiva.getid_pais());
									//this.inicializarActualizarBindingTipoRetencionFuenteIva(false,false);
						this.paissForeignKey=new ArrayList<Pais>();

						if(tiporetencionfuenteiva.getPais()!=null) {
							this.paissForeignKey.add(tiporetencionfuenteiva.getPais());
						}

						this.addItemDefectoCombosForeignKeyPais();
						this.cargarCombosFramePaissForeignKey("Todos");
					}
					this.setActualPaisForeignKey(this.tiporetencionfuenteiva.getid_pais(),false,"Formulario");

					//CuentaContable
					if(!this.tiporetencionfuenteivaConstantesFunciones.cargarid_cuenta_contableTipoRetencionFuenteIva || this.tiporetencionfuenteivaConstantesFunciones.event_dependid_cuenta_contableTipoRetencionFuenteIva) {
						//this.cargarCombosCuentaContablesForeignKeyLista(" where id="+this.tiporetencionfuenteiva.getid_cuenta_contable());
									//this.inicializarActualizarBindingTipoRetencionFuenteIva(false,false);
						this.cuentacontablesForeignKey=new ArrayList<CuentaContable>();

						if(tiporetencionfuenteiva.getCuentaContable()!=null) {
							this.cuentacontablesForeignKey.add(tiporetencionfuenteiva.getCuentaContable());
						}

						this.addItemDefectoCombosForeignKeyCuentaContable();
						this.cargarCombosFrameCuentaContablesForeignKey("Todos");
					}
					this.setActualCuentaContableForeignKey(this.tiporetencionfuenteiva.getid_cuenta_contable(),false,"Formulario");

					//CuentaContableCredito
					if(!this.tiporetencionfuenteivaConstantesFunciones.cargarid_cuenta_contable_creditoTipoRetencionFuenteIva || this.tiporetencionfuenteivaConstantesFunciones.event_dependid_cuenta_contable_creditoTipoRetencionFuenteIva) {
						//this.cargarCombosCuentaContableCreditosForeignKeyLista(" where id="+this.tiporetencionfuenteiva.getid_cuenta_contable_credito());
									//this.inicializarActualizarBindingTipoRetencionFuenteIva(false,false);
						this.cuentacontablecreditosForeignKey=new ArrayList<CuentaContable>();

						if(tiporetencionfuenteiva.getCuentaContableCredito()!=null) {
							this.cuentacontablecreditosForeignKey.add(tiporetencionfuenteiva.getCuentaContableCredito());
						}

						this.addItemDefectoCombosForeignKeyCuentaContableCredito();
						this.cargarCombosFrameCuentaContableCreditosForeignKey("Todos");
					}
					this.setActualCuentaContableCreditoForeignKey(this.tiporetencionfuenteiva.getid_cuenta_contable_credito(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoRetencionFuenteIva("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoRetencionFuenteIva(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoRetencionFuenteIva() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoRetencionFuenteIva(TipoRetencionFuenteIva tiporetencionfuenteiva) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoRetencionFuenteIva(tiporetencionfuenteiva,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoRetencionFuenteIva(TipoRetencionFuenteIva tiporetencionfuenteiva,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoRetencionFuenteIva(tiporetencionfuenteiva);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoRetencionFuenteIva(tiporetencionfuenteiva,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoRetencionFuenteIva(tiporetencionfuenteiva);
	}
	
	public void setVariablesObjetoActualToFormularioTipoRetencionFuenteIva(TipoRetencionFuenteIva tiporetencionfuenteiva) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jTextFieldidTipoRetencionFuenteIva.setText(tiporetencionfuenteiva.getId().toString());
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jTextFieldcodigoTipoRetencionFuenteIva.setText(tiporetencionfuenteiva.getcodigo());
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jTextAreanombreTipoRetencionFuenteIva.setText(tiporetencionfuenteiva.getnombre());
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jTextFieldporcentajeTipoRetencionFuenteIva.setText(tiporetencionfuenteiva.getporcentaje().toString());
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jTextFieldmonto_minimoTipoRetencionFuenteIva.setText(tiporetencionfuenteiva.getmonto_minimo().toString());
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jCheckBoxes_retencion_ivaTipoRetencionFuenteIva.setSelected(tiporetencionfuenteiva.getes_retencion_iva());
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jCheckBoxes_debitoTipoRetencionFuenteIva.setSelected(tiporetencionfuenteiva.getes_debito());
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jCheckBoxes_con_iva_facturaTipoRetencionFuenteIva.setSelected(tiporetencionfuenteiva.getes_con_iva_factura());
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jCheckBoxes_con_sub_total_facturaTipoRetencionFuenteIva.setSelected(tiporetencionfuenteiva.getes_con_sub_total_factura());
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jCheckBoxes_con_secuencialTipoRetencionFuenteIva.setSelected(tiporetencionfuenteiva.getes_con_secuencial());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoRetencionFuenteIva tiporetencionfuenteivaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tiporetencionfuenteivaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoRetencionFuenteIva tiporetencionfuenteivaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tiporetencionfuenteivaLocal=this.tiporetencionfuenteiva;
			} else {
				tiporetencionfuenteivaLocal=this.tiporetencionfuenteivaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tiporetencionfuenteivaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoRetencionFuenteIva(tiporetencionfuenteivaLocal,true);
					
					if(tiporetencionfuenteivaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tiporetencionfuenteivaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tiporetencionfuenteivaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoRetencionFuenteIva(TipoRetencionFuenteIva tiporetencionfuenteiva,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoRetencionFuenteIva(tiporetencionfuenteiva,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencionFuenteIva(tiporetencionfuenteiva);
	}
	
	public void setVariablesFormularioToObjetoActualTipoRetencionFuenteIva(TipoRetencionFuenteIva tiporetencionfuenteiva,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoRetencionFuenteIva(tiporetencionfuenteiva,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoRetencionFuenteIva(TipoRetencionFuenteIva tiporetencionfuenteiva,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jTextFieldidTipoRetencionFuenteIva.getText()==null || this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jTextFieldidTipoRetencionFuenteIva.getText()=="" || this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jTextFieldidTipoRetencionFuenteIva.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jTextFieldidTipoRetencionFuenteIva.setText("0");
			}

			if(conColumnasBase) {tiporetencionfuenteiva.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jTextFieldidTipoRetencionFuenteIva.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoRetencionFuenteIvaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jLabelIdTipoRetencionFuenteIva,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiporetencionfuenteiva.setcodigo(this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jTextFieldcodigoTipoRetencionFuenteIva.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoRetencionFuenteIvaConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jLabelcodigoTipoRetencionFuenteIva,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiporetencionfuenteiva.setnombre(this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jTextAreanombreTipoRetencionFuenteIva.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoRetencionFuenteIvaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jLabelnombreTipoRetencionFuenteIva,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiporetencionfuenteiva.setporcentaje(Double.parseDouble(this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jTextFieldporcentajeTipoRetencionFuenteIva.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoRetencionFuenteIvaConstantesFunciones.LABEL_PORCENTAJE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jLabelporcentajeTipoRetencionFuenteIva,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiporetencionfuenteiva.setmonto_minimo(Double.parseDouble(this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jTextFieldmonto_minimoTipoRetencionFuenteIva.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoRetencionFuenteIvaConstantesFunciones.LABEL_MONTOMINIMO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jLabelmonto_minimoTipoRetencionFuenteIva,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiporetencionfuenteiva.setes_retencion_iva(this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jCheckBoxes_retencion_ivaTipoRetencionFuenteIva.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESRETENCIONIVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jLabeles_retencion_ivaTipoRetencionFuenteIva,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiporetencionfuenteiva.setes_debito(this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jCheckBoxes_debitoTipoRetencionFuenteIva.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESDEBITO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jLabeles_debitoTipoRetencionFuenteIva,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiporetencionfuenteiva.setes_con_iva_factura(this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jCheckBoxes_con_iva_facturaTipoRetencionFuenteIva.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESCONIVAFACTURA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jLabeles_con_iva_facturaTipoRetencionFuenteIva,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiporetencionfuenteiva.setes_con_sub_total_factura(this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jCheckBoxes_con_sub_total_facturaTipoRetencionFuenteIva.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESCONSUBTOTALFACTURA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jLabeles_con_sub_total_facturaTipoRetencionFuenteIva,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiporetencionfuenteiva.setes_con_secuencial(this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jCheckBoxes_con_secuencialTipoRetencionFuenteIva.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESCONSECUENCIAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jLabeles_con_secuencialTipoRetencionFuenteIva,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoRetencionFuenteIva(TipoRetencionFuenteIva tiporetencionfuenteivaBean,TipoRetencionFuenteIva tiporetencionfuenteiva,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && tiporetencionfuenteivaBean.getid_pais()!=null && !tiporetencionfuenteivaBean.getid_pais().equals(-1L))) {tiporetencionfuenteiva.setid_pais(tiporetencionfuenteivaBean.getid_pais());}
			if(conDefault || (!conDefault && tiporetencionfuenteivaBean.getid_cuenta_contable()!=null && !tiporetencionfuenteivaBean.getid_cuenta_contable().equals(null))) {tiporetencionfuenteiva.setid_cuenta_contable(tiporetencionfuenteivaBean.getid_cuenta_contable());}
			if(conDefault || (!conDefault && tiporetencionfuenteivaBean.getid_cuenta_contable_credito()!=null && !tiporetencionfuenteivaBean.getid_cuenta_contable_credito().equals(null))) {tiporetencionfuenteiva.setid_cuenta_contable_credito(tiporetencionfuenteivaBean.getid_cuenta_contable_credito());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoRetencionFuenteIva(TipoRetencionFuenteIva tiporetencionfuenteivaOrigen,TipoRetencionFuenteIva tiporetencionfuenteiva,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tiporetencionfuenteivaOrigen.getId()!=null && !tiporetencionfuenteivaOrigen.getId().equals(0L))) {tiporetencionfuenteiva.setId(tiporetencionfuenteivaOrigen.getId());}}
			if(conDefault || (!conDefault && tiporetencionfuenteivaOrigen.getid_pais()!=null && !tiporetencionfuenteivaOrigen.getid_pais().equals(-1L))) {tiporetencionfuenteiva.setid_pais(tiporetencionfuenteivaOrigen.getid_pais());}
			if(conDefault || (!conDefault && tiporetencionfuenteivaOrigen.getcodigo()!=null && !tiporetencionfuenteivaOrigen.getcodigo().equals(""))) {tiporetencionfuenteiva.setcodigo(tiporetencionfuenteivaOrigen.getcodigo());}
			if(conDefault || (!conDefault && tiporetencionfuenteivaOrigen.getnombre()!=null && !tiporetencionfuenteivaOrigen.getnombre().equals(""))) {tiporetencionfuenteiva.setnombre(tiporetencionfuenteivaOrigen.getnombre());}
			if(conDefault || (!conDefault && tiporetencionfuenteivaOrigen.getporcentaje()!=null && !tiporetencionfuenteivaOrigen.getporcentaje().equals(0.0))) {tiporetencionfuenteiva.setporcentaje(tiporetencionfuenteivaOrigen.getporcentaje());}
			if(conDefault || (!conDefault && tiporetencionfuenteivaOrigen.getmonto_minimo()!=null && !tiporetencionfuenteivaOrigen.getmonto_minimo().equals(0.0))) {tiporetencionfuenteiva.setmonto_minimo(tiporetencionfuenteivaOrigen.getmonto_minimo());}
			if(conDefault || (!conDefault && tiporetencionfuenteivaOrigen.getid_cuenta_contable()!=null && !tiporetencionfuenteivaOrigen.getid_cuenta_contable().equals(null))) {tiporetencionfuenteiva.setid_cuenta_contable(tiporetencionfuenteivaOrigen.getid_cuenta_contable());}
			if(conDefault || (!conDefault && tiporetencionfuenteivaOrigen.getid_cuenta_contable_credito()!=null && !tiporetencionfuenteivaOrigen.getid_cuenta_contable_credito().equals(null))) {tiporetencionfuenteiva.setid_cuenta_contable_credito(tiporetencionfuenteivaOrigen.getid_cuenta_contable_credito());}
			if(conDefault || (!conDefault && tiporetencionfuenteivaOrigen.getes_retencion_iva()!=null && !tiporetencionfuenteivaOrigen.getes_retencion_iva().equals(false))) {tiporetencionfuenteiva.setes_retencion_iva(tiporetencionfuenteivaOrigen.getes_retencion_iva());}
			if(conDefault || (!conDefault && tiporetencionfuenteivaOrigen.getes_debito()!=null && !tiporetencionfuenteivaOrigen.getes_debito().equals(false))) {tiporetencionfuenteiva.setes_debito(tiporetencionfuenteivaOrigen.getes_debito());}
			if(conDefault || (!conDefault && tiporetencionfuenteivaOrigen.getes_con_iva_factura()!=null && !tiporetencionfuenteivaOrigen.getes_con_iva_factura().equals(false))) {tiporetencionfuenteiva.setes_con_iva_factura(tiporetencionfuenteivaOrigen.getes_con_iva_factura());}
			if(conDefault || (!conDefault && tiporetencionfuenteivaOrigen.getes_con_sub_total_factura()!=null && !tiporetencionfuenteivaOrigen.getes_con_sub_total_factura().equals(false))) {tiporetencionfuenteiva.setes_con_sub_total_factura(tiporetencionfuenteivaOrigen.getes_con_sub_total_factura());}
			if(conDefault || (!conDefault && tiporetencionfuenteivaOrigen.getes_con_secuencial()!=null && !tiporetencionfuenteivaOrigen.getes_con_secuencial().equals(false))) {tiporetencionfuenteiva.setes_con_secuencial(tiporetencionfuenteivaOrigen.getes_con_secuencial());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoRetencionFuenteIva(TipoRetencionFuenteIva tiporetencionfuenteiva) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jTextFieldidTipoRetencionFuenteIva.setText(tiporetencionfuenteiva.getId().toString());
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jTextFieldcodigoTipoRetencionFuenteIva.setText(tiporetencionfuenteiva.getcodigo());
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jTextAreanombreTipoRetencionFuenteIva.setText(tiporetencionfuenteiva.getnombre());
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jTextFieldporcentajeTipoRetencionFuenteIva.setText(tiporetencionfuenteiva.getporcentaje().toString());
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jTextFieldmonto_minimoTipoRetencionFuenteIva.setText(tiporetencionfuenteiva.getmonto_minimo().toString());
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jCheckBoxes_retencion_ivaTipoRetencionFuenteIva.setSelected(tiporetencionfuenteiva.getes_retencion_iva());
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jCheckBoxes_debitoTipoRetencionFuenteIva.setSelected(tiporetencionfuenteiva.getes_debito());
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jCheckBoxes_con_iva_facturaTipoRetencionFuenteIva.setSelected(tiporetencionfuenteiva.getes_con_iva_factura());
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jCheckBoxes_con_sub_total_facturaTipoRetencionFuenteIva.setSelected(tiporetencionfuenteiva.getes_con_sub_total_factura());
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jCheckBoxes_con_secuencialTipoRetencionFuenteIva.setSelected(tiporetencionfuenteiva.getes_con_secuencial());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoRetencionFuenteIva(TipoRetencionFuenteIvaBean tiporetencionfuenteivaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jTextFieldidTipoRetencionFuenteIva.setText(tiporetencionfuenteivaBean.getId().toString());
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jTextFieldcodigoTipoRetencionFuenteIva.setText(tiporetencionfuenteivaBean.getcodigo());
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jTextAreanombreTipoRetencionFuenteIva.setText(tiporetencionfuenteivaBean.getnombre());
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jTextFieldporcentajeTipoRetencionFuenteIva.setText(tiporetencionfuenteivaBean.getporcentaje().toString());
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jTextFieldmonto_minimoTipoRetencionFuenteIva.setText(tiporetencionfuenteivaBean.getmonto_minimo().toString());
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jCheckBoxes_retencion_ivaTipoRetencionFuenteIva.setSelected(tiporetencionfuenteivaBean.getes_retencion_iva());
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jCheckBoxes_debitoTipoRetencionFuenteIva.setSelected(tiporetencionfuenteivaBean.getes_debito());
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jCheckBoxes_con_iva_facturaTipoRetencionFuenteIva.setSelected(tiporetencionfuenteivaBean.getes_con_iva_factura());
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jCheckBoxes_con_sub_total_facturaTipoRetencionFuenteIva.setSelected(tiporetencionfuenteivaBean.getes_con_sub_total_factura());
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jCheckBoxes_con_secuencialTipoRetencionFuenteIva.setSelected(tiporetencionfuenteivaBean.getes_con_secuencial());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoRetencionFuenteIva(TipoRetencionFuenteIvaParameterReturnGeneral tiporetencionfuenteivaReturnGeneral,TipoRetencionFuenteIvaBean tiporetencionfuenteivaBean,Boolean conDefault) throws Exception { 
		try {
			TipoRetencionFuenteIva tiporetencionfuenteivaLocal=new TipoRetencionFuenteIva();
			
			tiporetencionfuenteivaLocal=tiporetencionfuenteivaReturnGeneral.getTipoRetencionFuenteIva();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tiporetencionfuenteivaLocal.getId()!=null && !tiporetencionfuenteivaLocal.getId().equals(0L))) {tiporetencionfuenteivaBean.setId(tiporetencionfuenteivaLocal.getId());}}
			if(conDefault || (!conDefault && tiporetencionfuenteivaLocal.getid_pais()!=null && !tiporetencionfuenteivaLocal.getid_pais().equals(-1L))) {tiporetencionfuenteivaBean.setid_pais(tiporetencionfuenteivaLocal.getid_pais());}
			if(conDefault || (!conDefault && tiporetencionfuenteivaLocal.getcodigo()!=null && !tiporetencionfuenteivaLocal.getcodigo().equals(""))) {tiporetencionfuenteivaBean.setcodigo(tiporetencionfuenteivaLocal.getcodigo());}
			if(conDefault || (!conDefault && tiporetencionfuenteivaLocal.getnombre()!=null && !tiporetencionfuenteivaLocal.getnombre().equals(""))) {tiporetencionfuenteivaBean.setnombre(tiporetencionfuenteivaLocal.getnombre());}
			if(conDefault || (!conDefault && tiporetencionfuenteivaLocal.getporcentaje()!=null && !tiporetencionfuenteivaLocal.getporcentaje().equals(0.0))) {tiporetencionfuenteivaBean.setporcentaje(tiporetencionfuenteivaLocal.getporcentaje());}
			if(conDefault || (!conDefault && tiporetencionfuenteivaLocal.getmonto_minimo()!=null && !tiporetencionfuenteivaLocal.getmonto_minimo().equals(0.0))) {tiporetencionfuenteivaBean.setmonto_minimo(tiporetencionfuenteivaLocal.getmonto_minimo());}
			if(conDefault || (!conDefault && tiporetencionfuenteivaLocal.getid_cuenta_contable()!=null && !tiporetencionfuenteivaLocal.getid_cuenta_contable().equals(null))) {tiporetencionfuenteivaBean.setid_cuenta_contable(tiporetencionfuenteivaLocal.getid_cuenta_contable());}
			if(conDefault || (!conDefault && tiporetencionfuenteivaLocal.getid_cuenta_contable_credito()!=null && !tiporetencionfuenteivaLocal.getid_cuenta_contable_credito().equals(null))) {tiporetencionfuenteivaBean.setid_cuenta_contable_credito(tiporetencionfuenteivaLocal.getid_cuenta_contable_credito());}
			if(conDefault || (!conDefault && tiporetencionfuenteivaLocal.getes_retencion_iva()!=null && !tiporetencionfuenteivaLocal.getes_retencion_iva().equals(false))) {tiporetencionfuenteivaBean.setes_retencion_iva(tiporetencionfuenteivaLocal.getes_retencion_iva());}
			if(conDefault || (!conDefault && tiporetencionfuenteivaLocal.getes_debito()!=null && !tiporetencionfuenteivaLocal.getes_debito().equals(false))) {tiporetencionfuenteivaBean.setes_debito(tiporetencionfuenteivaLocal.getes_debito());}
			if(conDefault || (!conDefault && tiporetencionfuenteivaLocal.getes_con_iva_factura()!=null && !tiporetencionfuenteivaLocal.getes_con_iva_factura().equals(false))) {tiporetencionfuenteivaBean.setes_con_iva_factura(tiporetencionfuenteivaLocal.getes_con_iva_factura());}
			if(conDefault || (!conDefault && tiporetencionfuenteivaLocal.getes_con_sub_total_factura()!=null && !tiporetencionfuenteivaLocal.getes_con_sub_total_factura().equals(false))) {tiporetencionfuenteivaBean.setes_con_sub_total_factura(tiporetencionfuenteivaLocal.getes_con_sub_total_factura());}
			if(conDefault || (!conDefault && tiporetencionfuenteivaLocal.getes_con_secuencial()!=null && !tiporetencionfuenteivaLocal.getes_con_secuencial().equals(false))) {tiporetencionfuenteivaBean.setes_con_secuencial(tiporetencionfuenteivaLocal.getes_con_secuencial());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoRetencionFuenteIvaGenerico(Long idTipoRetencionFuenteIvaSeleccionado,JComboBox jComboBoxTipoRetencionFuenteIva,List<TipoRetencionFuenteIva> tiporetencionfuenteivasLocal)throws Exception {
		try {
			TipoRetencionFuenteIva  tiporetencionfuenteivaTemp=null;

			for(TipoRetencionFuenteIva tiporetencionfuenteivaAux:tiporetencionfuenteivasLocal) {
				if(tiporetencionfuenteivaAux.getId()!=null && tiporetencionfuenteivaAux.getId().equals(idTipoRetencionFuenteIvaSeleccionado)) {
					tiporetencionfuenteivaTemp=tiporetencionfuenteivaAux;
					break;
				}
			}

			jComboBoxTipoRetencionFuenteIva.setSelectedItem(tiporetencionfuenteivaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoRetencionFuenteIvaGenerico(JComboBox jComboBoxTipoRetencionFuenteIva,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoRetencionFuenteIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoRetencionFuenteIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoRetencionFuenteIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoRetencionFuenteIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoRetencionFuenteIva.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoRetencionFuenteIva.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoRetencionFuenteIva.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoRetencionFuenteIva.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoRetencionFuenteIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoRetencionFuenteIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiporetencionfuenteiva=(TipoRetencionFuenteIva) tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tiporetencionfuenteiva =(TipoRetencionFuenteIva) tiporetencionfuenteivas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Pais")) {
			//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
			if(!tiporetencionfuenteiva.getIsNew() && !tiporetencionfuenteiva.getIsChanged() && !tiporetencionfuenteiva.getIsDeleted()) {
				sDescripcion=tiporetencionfuenteiva.getpais_descripcion();
			} else {
				//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
				sDescripcion=tiporetencionfuenteiva.getpais_descripcion();
			}
		}

		if(sTipo.equals("CuentaContable")) {
			//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
			if(!tiporetencionfuenteiva.getIsNew() && !tiporetencionfuenteiva.getIsChanged() && !tiporetencionfuenteiva.getIsDeleted()) {
				sDescripcion=tiporetencionfuenteiva.getcuentacontable_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
				sDescripcion=tiporetencionfuenteiva.getcuentacontable_descripcion();
			}
		}

		if(sTipo.equals("CuentaContableCredito")) {
			//sDescripcion=this.getActualCuentaContableCreditoForeignKeyDescripcion((Long)value);
			if(!tiporetencionfuenteiva.getIsNew() && !tiporetencionfuenteiva.getIsChanged() && !tiporetencionfuenteiva.getIsDeleted()) {
				sDescripcion=tiporetencionfuenteiva.getcuentacontablecredito_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableCreditoForeignKeyDescripcion((Long)value);
				sDescripcion=tiporetencionfuenteiva.getcuentacontablecredito_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoRetencionFuenteIva tiporetencionfuenteivaRow=new TipoRetencionFuenteIva();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiporetencionfuenteivaRow=(TipoRetencionFuenteIva) tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tiporetencionfuenteivaRow=(TipoRetencionFuenteIva) tiporetencionfuenteivas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoRetencionFuenteIva(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoRetencionFuenteIva.setVisible((this.isVisibilidadCeldaNuevoTipoRetencionFuenteIva && this.isPermisoNuevoTipoRetencionFuenteIva));			
			this.jButtonDuplicarTipoRetencionFuenteIva.setVisible((this.isVisibilidadCeldaDuplicarTipoRetencionFuenteIva && this.isPermisoDuplicarTipoRetencionFuenteIva));			
			this.jButtonCopiarTipoRetencionFuenteIva.setVisible((this.isVisibilidadCeldaCopiarTipoRetencionFuenteIva && this.isPermisoCopiarTipoRetencionFuenteIva));
			this.jButtonVerFormTipoRetencionFuenteIva.setVisible((this.isVisibilidadCeldaVerFormTipoRetencionFuenteIva && this.isPermisoVerFormTipoRetencionFuenteIva));
			
			this.jButtonAbrirOrderByTipoRetencionFuenteIva.setVisible((this.isVisibilidadCeldaOrdenTipoRetencionFuenteIva && this.isPermisoOrdenTipoRetencionFuenteIva));			
			
			this.jButtonNuevoRelacionesTipoRetencionFuenteIva.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoRetencionFuenteIva && this.isPermisoNuevoTipoRetencionFuenteIva));			
			this.jButtonNuevoGuardarCambiosTipoRetencionFuenteIva.setVisible((this.isVisibilidadCeldaNuevoTipoRetencionFuenteIva && this.isPermisoNuevoTipoRetencionFuenteIva && this.isPermisoGuardarCambiosTipoRetencionFuenteIva));
			
			if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) {
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonModificarTipoRetencionFuenteIva.setVisible((this.isVisibilidadCeldaModificarTipoRetencionFuenteIva && this.isPermisoActualizarTipoRetencionFuenteIva));	
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonActualizarTipoRetencionFuenteIva.setVisible((this.isVisibilidadCeldaActualizarTipoRetencionFuenteIva && this.isPermisoActualizarTipoRetencionFuenteIva));	
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonEliminarTipoRetencionFuenteIva.setVisible((this.isVisibilidadCeldaEliminarTipoRetencionFuenteIva && this.isPermisoEliminarTipoRetencionFuenteIva));
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonCancelarTipoRetencionFuenteIva.setVisible(this.isVisibilidadCeldaCancelarTipoRetencionFuenteIva);							
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonGuardarCambiosTipoRetencionFuenteIva.setVisible((this.isVisibilidadCeldaGuardarTipoRetencionFuenteIva && this.isPermisoGuardarCambiosTipoRetencionFuenteIva));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoRetencionFuenteIva.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoRetencionFuenteIva && this.isPermisoGuardarCambiosTipoRetencionFuenteIva));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoRetencionFuenteIva.setVisible((this.isVisibilidadCeldaNuevoTipoRetencionFuenteIva && this.isPermisoNuevoTipoRetencionFuenteIva));						
			this.jButtonDuplicarToolBarTipoRetencionFuenteIva.setVisible((this.isVisibilidadCeldaDuplicarTipoRetencionFuenteIva && this.isPermisoDuplicarTipoRetencionFuenteIva));						
			this.jButtonCopiarToolBarTipoRetencionFuenteIva.setVisible((this.isVisibilidadCeldaCopiarTipoRetencionFuenteIva && this.isPermisoCopiarTipoRetencionFuenteIva));			
			this.jButtonVerFormToolBarTipoRetencionFuenteIva.setVisible((this.isVisibilidadCeldaVerFormTipoRetencionFuenteIva && this.isPermisoVerFormTipoRetencionFuenteIva));			
			this.jButtonAbrirOrderByToolBarTipoRetencionFuenteIva.setVisible((this.isVisibilidadCeldaOrdenTipoRetencionFuenteIva && this.isPermisoOrdenTipoRetencionFuenteIva));
			this.jButtonNuevoRelacionesToolBarTipoRetencionFuenteIva.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoRetencionFuenteIva && this.isPermisoNuevoTipoRetencionFuenteIva));			
			this.jButtonNuevoGuardarCambiosToolBarTipoRetencionFuenteIva.setVisible((this.isVisibilidadCeldaNuevoTipoRetencionFuenteIva && this.isPermisoNuevoTipoRetencionFuenteIva && this.isPermisoGuardarCambiosTipoRetencionFuenteIva));			
			
			if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) {
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonModificarToolBarTipoRetencionFuenteIva.setVisible((this.isVisibilidadCeldaModificarTipoRetencionFuenteIva && this.isPermisoActualizarTipoRetencionFuenteIva));	
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonActualizarToolBarTipoRetencionFuenteIva.setVisible((this.isVisibilidadCeldaActualizarTipoRetencionFuenteIva  && this.isPermisoActualizarTipoRetencionFuenteIva));	
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonEliminarToolBarTipoRetencionFuenteIva.setVisible((this.isVisibilidadCeldaEliminarTipoRetencionFuenteIva && this.isPermisoEliminarTipoRetencionFuenteIva));
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonCancelarToolBarTipoRetencionFuenteIva.setVisible(this.isVisibilidadCeldaCancelarTipoRetencionFuenteIva);				
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonGuardarCambiosToolBarTipoRetencionFuenteIva.setVisible((this.isVisibilidadCeldaGuardarTipoRetencionFuenteIva && this.isPermisoGuardarCambiosTipoRetencionFuenteIva));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoRetencionFuenteIva.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoRetencionFuenteIva && this.isPermisoGuardarCambiosTipoRetencionFuenteIva));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoRetencionFuenteIva.setVisible((this.isVisibilidadCeldaNuevoTipoRetencionFuenteIva && this.isPermisoNuevoTipoRetencionFuenteIva));			
			this.jMenuItemDuplicarTipoRetencionFuenteIva.setVisible((this.isVisibilidadCeldaDuplicarTipoRetencionFuenteIva && this.isPermisoDuplicarTipoRetencionFuenteIva));			
			this.jMenuItemCopiarTipoRetencionFuenteIva.setVisible((this.isVisibilidadCeldaCopiarTipoRetencionFuenteIva && this.isPermisoCopiarTipoRetencionFuenteIva));			
			this.jMenuItemVerFormTipoRetencionFuenteIva.setVisible((this.isVisibilidadCeldaVerFormTipoRetencionFuenteIva && this.isPermisoVerFormTipoRetencionFuenteIva));			
			this.jMenuItemAbrirOrderByTipoRetencionFuenteIva.setVisible((this.isVisibilidadCeldaOrdenTipoRetencionFuenteIva && this.isPermisoOrdenTipoRetencionFuenteIva));			
			//this.jMenuItemMostrarOcultarTipoRetencionFuenteIva.setVisible((this.isVisibilidadCeldaOrdenTipoRetencionFuenteIva && this.isPermisoOrdenTipoRetencionFuenteIva));
			this.jMenuItemDetalleAbrirOrderByTipoRetencionFuenteIva.setVisible((this.isVisibilidadCeldaOrdenTipoRetencionFuenteIva && this.isPermisoOrdenTipoRetencionFuenteIva));			
			//this.jMenuItemDetalleMostrarOcultarTipoRetencionFuenteIva.setVisible((this.isVisibilidadCeldaOrdenTipoRetencionFuenteIva && this.isPermisoOrdenTipoRetencionFuenteIva));			
			this.jMenuItemNuevoRelacionesTipoRetencionFuenteIva.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoRetencionFuenteIva && this.isPermisoNuevoTipoRetencionFuenteIva));			
			this.jMenuItemNuevoGuardarCambiosTipoRetencionFuenteIva.setVisible((this.isVisibilidadCeldaNuevoTipoRetencionFuenteIva && this.isPermisoNuevoTipoRetencionFuenteIva && this.isPermisoGuardarCambiosTipoRetencionFuenteIva));									
			
			if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) {
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jMenuItemModificarTipoRetencionFuenteIva.setVisible((this.isVisibilidadCeldaModificarTipoRetencionFuenteIva && this.isPermisoActualizarTipoRetencionFuenteIva));	
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jMenuItemActualizarTipoRetencionFuenteIva.setVisible((this.isVisibilidadCeldaActualizarTipoRetencionFuenteIva && this.isPermisoActualizarTipoRetencionFuenteIva));	
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jMenuItemEliminarTipoRetencionFuenteIva.setVisible((this.isVisibilidadCeldaEliminarTipoRetencionFuenteIva && this.isPermisoEliminarTipoRetencionFuenteIva));
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jMenuItemCancelarTipoRetencionFuenteIva.setVisible(this.isVisibilidadCeldaCancelarTipoRetencionFuenteIva);				
			}
			
			this.jMenuItemGuardarCambiosTipoRetencionFuenteIva.setVisible((this.isVisibilidadCeldaGuardarTipoRetencionFuenteIva && this.isPermisoGuardarCambiosTipoRetencionFuenteIva));						
			this.jMenuItemGuardarCambiosTablaTipoRetencionFuenteIva.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoRetencionFuenteIva && this.isPermisoGuardarCambiosTipoRetencionFuenteIva));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoRetencionFuenteIva=this.jButtonNuevoTipoRetencionFuenteIva.isVisible();
			this.isVisibilidadCeldaDuplicarTipoRetencionFuenteIva=this.jButtonDuplicarTipoRetencionFuenteIva.isVisible();
			this.isVisibilidadCeldaCopiarTipoRetencionFuenteIva=this.jButtonCopiarTipoRetencionFuenteIva.isVisible();
			this.isVisibilidadCeldaVerFormTipoRetencionFuenteIva=this.jButtonVerFormTipoRetencionFuenteIva.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoRetencionFuenteIva=this.jButtonAbrirOrderByTipoRetencionFuenteIva.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoRetencionFuenteIva=this.jButtonNuevoRelacionesTipoRetencionFuenteIva.isVisible();
			this.isVisibilidadCeldaModificarTipoRetencionFuenteIva=this.jButtonModificarTipoRetencionFuenteIva.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) {
			this.isVisibilidadCeldaActualizarTipoRetencionFuenteIva=this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonActualizarTipoRetencionFuenteIva.isVisible();
			this.isVisibilidadCeldaEliminarTipoRetencionFuenteIva=this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonEliminarTipoRetencionFuenteIva.isVisible();
			this.isVisibilidadCeldaCancelarTipoRetencionFuenteIva=this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonCancelarTipoRetencionFuenteIva.isVisible();
			this.isVisibilidadCeldaGuardarTipoRetencionFuenteIva=this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonGuardarCambiosTipoRetencionFuenteIva.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoRetencionFuenteIva=this.jButtonGuardarCambiosTablaTipoRetencionFuenteIva.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoRetencionFuenteIva=this.jButtonNuevoToolBarTipoRetencionFuenteIva.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoRetencionFuenteIva=this.jButtonNuevoRelacionesToolBarTipoRetencionFuenteIva.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) {
			this.isVisibilidadCeldaModificarTipoRetencionFuenteIva=this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonModificarToolBarTipoRetencionFuenteIva.isVisible();
			this.isVisibilidadCeldaActualizarTipoRetencionFuenteIva=this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonActualizarToolBarTipoRetencionFuenteIva.isVisible();
			this.isVisibilidadCeldaEliminarTipoRetencionFuenteIva=this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonEliminarToolBarTipoRetencionFuenteIva.isVisible();
			this.isVisibilidadCeldaCancelarTipoRetencionFuenteIva=this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonCancelarToolBarTipoRetencionFuenteIva.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoRetencionFuenteIva=this.jButtonGuardarCambiosToolBarTipoRetencionFuenteIva.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoRetencionFuenteIva=this.jButtonGuardarCambiosTablaToolBarTipoRetencionFuenteIva.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoRetencionFuenteIva=this.jMenuItemNuevoTipoRetencionFuenteIva.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoRetencionFuenteIva=this.jMenuItemNuevoRelacionesTipoRetencionFuenteIva.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) {
			this.isVisibilidadCeldaModificarTipoRetencionFuenteIva=this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jMenuItemModificarTipoRetencionFuenteIva.isVisible();
			this.isVisibilidadCeldaActualizarTipoRetencionFuenteIva=this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jMenuItemActualizarTipoRetencionFuenteIva.isVisible();
			this.isVisibilidadCeldaEliminarTipoRetencionFuenteIva=this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jMenuItemEliminarTipoRetencionFuenteIva.isVisible();
			this.isVisibilidadCeldaCancelarTipoRetencionFuenteIva=this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jMenuItemCancelarTipoRetencionFuenteIva.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoRetencionFuenteIva=this.jMenuItemGuardarCambiosTipoRetencionFuenteIva.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoRetencionFuenteIva=this.jMenuItemGuardarCambiosTablaTipoRetencionFuenteIva.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoRetencionFuenteIva(Boolean esInicializar) {
		if(TipoRetencionFuenteIvaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tiporetencionfuenteivaSessionBean.getConGuardarRelaciones()) {
				//if(this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoRetencionFuenteIva();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoRetencionFuenteIva(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoRetencionFuenteIva() {
		this.jButtonNuevoTipoRetencionFuenteIva.setVisible(this.isPermisoNuevoTipoRetencionFuenteIva);			
		this.jButtonDuplicarTipoRetencionFuenteIva.setVisible(this.isPermisoDuplicarTipoRetencionFuenteIva);			
		this.jButtonCopiarTipoRetencionFuenteIva.setVisible(this.isPermisoCopiarTipoRetencionFuenteIva);			
		this.jButtonVerFormTipoRetencionFuenteIva.setVisible(this.isPermisoVerFormTipoRetencionFuenteIva);			
		
		this.jButtonAbrirOrderByTipoRetencionFuenteIva.setVisible(this.isPermisoOrdenTipoRetencionFuenteIva);					
		
		this.jButtonNuevoRelacionesTipoRetencionFuenteIva.setVisible(this.isPermisoNuevoTipoRetencionFuenteIva);			
		
		if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonModificarTipoRetencionFuenteIva.setVisible(this.isPermisoActualizarTipoRetencionFuenteIva);	
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonActualizarTipoRetencionFuenteIva.setVisible(this.isPermisoActualizarTipoRetencionFuenteIva);	
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonEliminarTipoRetencionFuenteIva.setVisible(this.isPermisoEliminarTipoRetencionFuenteIva);
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonCancelarTipoRetencionFuenteIva.setVisible(this.isVisibilidadCeldaCancelarTipoRetencionFuenteIva);						
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonGuardarCambiosTipoRetencionFuenteIva.setVisible(this.isPermisoGuardarCambiosTipoRetencionFuenteIva);							
		}
		
		this.jButtonGuardarCambiosTablaTipoRetencionFuenteIva.setVisible(this.isPermisoActualizarTipoRetencionFuenteIva);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoRetencionFuenteIva() {
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonModificarTipoRetencionFuenteIva.setVisible(this.isPermisoActualizarTipoRetencionFuenteIva);	
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonActualizarTipoRetencionFuenteIva.setVisible(this.isPermisoActualizarTipoRetencionFuenteIva);	
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonEliminarTipoRetencionFuenteIva.setVisible(this.isPermisoEliminarTipoRetencionFuenteIva);
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonCancelarTipoRetencionFuenteIva.setVisible(this.isVisibilidadCeldaCancelarTipoRetencionFuenteIva);							
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonGuardarCambiosTipoRetencionFuenteIva.setVisible((this.isVisibilidadCeldaGuardarTipoRetencionFuenteIva && this.isPermisoGuardarCambiosTipoRetencionFuenteIva));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoRetencionFuenteIva() {
		if(TipoRetencionFuenteIvaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoRetencionFuenteIva();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoRetencionFuenteIva() {
	}
	
	public void jTableDatosTipoRetencionFuenteIvaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoRetencionFuenteIva(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoRetencionFuenteIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRetencionFuenteIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRetencionFuenteIva(this.gettiporetencionfuenteiva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencionFuenteIva(this.tiporetencionfuenteiva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporetencionfuenteiva =(TipoRetencionFuenteIva) this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporetencionfuenteiva =(TipoRetencionFuenteIva) this.tiporetencionfuenteivas.toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporetencionfuenteiva==null) {
						this.tiporetencionfuenteiva = new TipoRetencionFuenteIva();
					}

					this.setVariablesFormularioToObjetoActualTipoRetencionFuenteIva(this.tiporetencionfuenteiva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencionFuenteIva(this.tiporetencionfuenteiva);
				}

				if(this.tiporetencionfuenteiva.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tiporetencionfuenteiva.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRetencionFuenteIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_paisTipoRetencionFuenteIvaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopais=true;

			idTienePermisopais=this.tienePermisosUsuarioEnPaginaWebTipoRetencionFuenteIva(PaisConstantesFunciones.CLASSNAME);

			if(idTienePermisopais) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRetencionFuenteIva.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoRetencionFuenteIva.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoRetencionFuenteIva.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteiva =(TipoRetencionFuenteIva) this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiporetencionfuenteiva =(TipoRetencionFuenteIva) this.tiporetencionfuenteivas.toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoRetencionFuenteIva(this.gettiporetencionfuenteiva(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencionFuenteIva(this.tiporetencionfuenteiva);

				this.paisBeanSwingJInternalFrame=new PaisBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.paisBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.paisBeanSwingJInternalFrame.getPaisLogic().setConnexion(this.tiporetencionfuenteivaLogic.getConnexion());

				if(this.tiporetencionfuenteiva.getid_pais()!=null) {
					this.paisBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.paisBeanSwingJInternalFrame.setIdActual(this.tiporetencionfuenteiva.getid_pais());
					this.paisBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.inicializarActualizarBindingTablaPais();
				}

				JInternalFrameBase jinternalFrame =this.paisBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoRetencionFuenteIva=(TitledBorder)this.jScrollPanelDatosTipoRetencionFuenteIva.getBorder();
				TitledBorder titledBorderpais=(TitledBorder)this.paisBeanSwingJInternalFrame.jScrollPanelDatosPais.getBorder();

				titledBorderpais.setTitle(titledBorderTipoRetencionFuenteIva.getTitle() + " -> Pais");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_paisTipoRetencionFuenteIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRetencionFuenteIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRetencionFuenteIva(this.gettiporetencionfuenteiva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencionFuenteIva(this.tiporetencionfuenteiva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporetencionfuenteiva =(TipoRetencionFuenteIva) this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporetencionfuenteiva =(TipoRetencionFuenteIva) this.tiporetencionfuenteivas.toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporetencionfuenteiva==null) {
						this.tiporetencionfuenteiva = new TipoRetencionFuenteIva();
					}

					this.setVariablesFormularioToObjetoActualTipoRetencionFuenteIva(this.tiporetencionfuenteiva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencionFuenteIva(this.tiporetencionfuenteiva);
				}

				if(this.tiporetencionfuenteiva.getid_pais()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_pais = "+this.tiporetencionfuenteiva.getid_pais().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRetencionFuenteIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoRetencionFuenteIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRetencionFuenteIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRetencionFuenteIva(this.gettiporetencionfuenteiva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencionFuenteIva(this.tiporetencionfuenteiva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporetencionfuenteiva =(TipoRetencionFuenteIva) this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporetencionfuenteiva =(TipoRetencionFuenteIva) this.tiporetencionfuenteivas.toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporetencionfuenteiva==null) {
						this.tiporetencionfuenteiva = new TipoRetencionFuenteIva();
					}

					this.setVariablesFormularioToObjetoActualTipoRetencionFuenteIva(this.tiporetencionfuenteiva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencionFuenteIva(this.tiporetencionfuenteiva);
				}

				if(this.tiporetencionfuenteiva.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tiporetencionfuenteiva.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRetencionFuenteIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoRetencionFuenteIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRetencionFuenteIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRetencionFuenteIva(this.gettiporetencionfuenteiva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencionFuenteIva(this.tiporetencionfuenteiva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporetencionfuenteiva =(TipoRetencionFuenteIva) this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporetencionfuenteiva =(TipoRetencionFuenteIva) this.tiporetencionfuenteivas.toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporetencionfuenteiva==null) {
						this.tiporetencionfuenteiva = new TipoRetencionFuenteIva();
					}

					this.setVariablesFormularioToObjetoActualTipoRetencionFuenteIva(this.tiporetencionfuenteiva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencionFuenteIva(this.tiporetencionfuenteiva);
				}

				if(this.tiporetencionfuenteiva.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tiporetencionfuenteiva.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRetencionFuenteIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentajeTipoRetencionFuenteIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRetencionFuenteIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRetencionFuenteIva(this.gettiporetencionfuenteiva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencionFuenteIva(this.tiporetencionfuenteiva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporetencionfuenteiva =(TipoRetencionFuenteIva) this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporetencionfuenteiva =(TipoRetencionFuenteIva) this.tiporetencionfuenteivas.toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporetencionfuenteiva==null) {
						this.tiporetencionfuenteiva = new TipoRetencionFuenteIva();
					}

					this.setVariablesFormularioToObjetoActualTipoRetencionFuenteIva(this.tiporetencionfuenteiva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencionFuenteIva(this.tiporetencionfuenteiva);
				}

				if(this.tiporetencionfuenteiva.getporcentaje()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje = "+this.tiporetencionfuenteiva.getporcentaje().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRetencionFuenteIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonmonto_minimoTipoRetencionFuenteIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRetencionFuenteIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRetencionFuenteIva(this.gettiporetencionfuenteiva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencionFuenteIva(this.tiporetencionfuenteiva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporetencionfuenteiva =(TipoRetencionFuenteIva) this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporetencionfuenteiva =(TipoRetencionFuenteIva) this.tiporetencionfuenteivas.toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporetencionfuenteiva==null) {
						this.tiporetencionfuenteiva = new TipoRetencionFuenteIva();
					}

					this.setVariablesFormularioToObjetoActualTipoRetencionFuenteIva(this.tiporetencionfuenteiva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencionFuenteIva(this.tiporetencionfuenteiva);
				}

				if(this.tiporetencionfuenteiva.getmonto_minimo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where monto_minimo = "+this.tiporetencionfuenteiva.getmonto_minimo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRetencionFuenteIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contableTipoRetencionFuenteIvaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderTipoRetencionFuenteIva=null;
			TitledBorder titledBordercuentacontable=null;

			if(!this.jScrollPanelDatosTipoRetencionFuenteIva.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderTipoRetencionFuenteIva=(TitledBorder)this.jScrollPanelDatosTipoRetencionFuenteIva.getBorder();
				titledBordercuentacontable=(TitledBorder)this.cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontable.setTitle(titledBorderTipoRetencionFuenteIva.getTitle() + " -> Cuenta Contable");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_cuenta_contableTipoRetencionFuenteIvaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontable=true;

			idTienePermisocuentacontable=this.tienePermisosUsuarioEnPaginaWebTipoRetencionFuenteIva(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontable) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRetencionFuenteIva.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoRetencionFuenteIva.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoRetencionFuenteIva.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteiva =(TipoRetencionFuenteIva) this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiporetencionfuenteiva =(TipoRetencionFuenteIva) this.tiporetencionfuenteivas.toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoRetencionFuenteIva(this.gettiporetencionfuenteiva(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencionFuenteIva(this.tiporetencionfuenteiva);

				this.cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontableBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.tiporetencionfuenteivaLogic.getConnexion());

				if(this.tiporetencionfuenteiva.getid_cuenta_contable()!=null) {
					this.cuentacontableBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontableBeanSwingJInternalFrame.setIdActual(this.tiporetencionfuenteiva.getid_cuenta_contable());
					this.cuentacontableBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontableBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoRetencionFuenteIva=(TitledBorder)this.jScrollPanelDatosTipoRetencionFuenteIva.getBorder();
				TitledBorder titledBordercuentacontable=(TitledBorder)this.cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontable.setTitle(titledBorderTipoRetencionFuenteIva.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contableTipoRetencionFuenteIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRetencionFuenteIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRetencionFuenteIva(this.gettiporetencionfuenteiva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencionFuenteIva(this.tiporetencionfuenteiva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporetencionfuenteiva =(TipoRetencionFuenteIva) this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporetencionfuenteiva =(TipoRetencionFuenteIva) this.tiporetencionfuenteivas.toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporetencionfuenteiva==null) {
						this.tiporetencionfuenteiva = new TipoRetencionFuenteIva();
					}

					this.setVariablesFormularioToObjetoActualTipoRetencionFuenteIva(this.tiporetencionfuenteiva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencionFuenteIva(this.tiporetencionfuenteiva);
				}

				if(this.tiporetencionfuenteiva.getid_cuenta_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable = "+this.tiporetencionfuenteiva.getid_cuenta_contable().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRetencionFuenteIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contable_creditoTipoRetencionFuenteIvaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderTipoRetencionFuenteIva=null;
			TitledBorder titledBordercuentacontablecredito=null;

			if(!this.jScrollPanelDatosTipoRetencionFuenteIva.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderTipoRetencionFuenteIva=(TitledBorder)this.jScrollPanelDatosTipoRetencionFuenteIva.getBorder();
				titledBordercuentacontablecredito=(TitledBorder)this.cuentacontablecreditoBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontablecredito.setTitle(titledBorderTipoRetencionFuenteIva.getTitle() + " -> Cuenta Contable");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_cuenta_contable_creditoTipoRetencionFuenteIvaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontablecredito=true;

			idTienePermisocuentacontablecredito=this.tienePermisosUsuarioEnPaginaWebTipoRetencionFuenteIva(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontablecredito) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRetencionFuenteIva.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoRetencionFuenteIva.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoRetencionFuenteIva.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteiva =(TipoRetencionFuenteIva) this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiporetencionfuenteiva =(TipoRetencionFuenteIva) this.tiporetencionfuenteivas.toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoRetencionFuenteIva(this.gettiporetencionfuenteiva(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencionFuenteIva(this.tiporetencionfuenteiva);

				this.cuentacontablecreditoBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontablecreditoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontablecreditoBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.tiporetencionfuenteivaLogic.getConnexion());

				if(this.tiporetencionfuenteiva.getid_cuenta_contable_credito()!=null) {
					this.cuentacontablecreditoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontablecreditoBeanSwingJInternalFrame.setIdActual(this.tiporetencionfuenteiva.getid_cuenta_contable_credito());
					this.cuentacontablecreditoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontablecreditoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontablecreditoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontablecreditoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoRetencionFuenteIva=(TitledBorder)this.jScrollPanelDatosTipoRetencionFuenteIva.getBorder();
				TitledBorder titledBordercuentacontablecredito=(TitledBorder)this.cuentacontablecreditoBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontablecredito.setTitle(titledBorderTipoRetencionFuenteIva.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contable_creditoTipoRetencionFuenteIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRetencionFuenteIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRetencionFuenteIva(this.gettiporetencionfuenteiva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencionFuenteIva(this.tiporetencionfuenteiva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporetencionfuenteiva =(TipoRetencionFuenteIva) this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporetencionfuenteiva =(TipoRetencionFuenteIva) this.tiporetencionfuenteivas.toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporetencionfuenteiva==null) {
						this.tiporetencionfuenteiva = new TipoRetencionFuenteIva();
					}

					this.setVariablesFormularioToObjetoActualTipoRetencionFuenteIva(this.tiporetencionfuenteiva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencionFuenteIva(this.tiporetencionfuenteiva);
				}

				if(this.tiporetencionfuenteiva.getid_cuenta_contable_credito()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable_credito = "+this.tiporetencionfuenteiva.getid_cuenta_contable_credito().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRetencionFuenteIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_retencion_ivaTipoRetencionFuenteIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRetencionFuenteIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRetencionFuenteIva(this.gettiporetencionfuenteiva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencionFuenteIva(this.tiporetencionfuenteiva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporetencionfuenteiva =(TipoRetencionFuenteIva) this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporetencionfuenteiva =(TipoRetencionFuenteIva) this.tiporetencionfuenteivas.toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporetencionfuenteiva==null) {
						this.tiporetencionfuenteiva = new TipoRetencionFuenteIva();
					}

					this.setVariablesFormularioToObjetoActualTipoRetencionFuenteIva(this.tiporetencionfuenteiva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencionFuenteIva(this.tiporetencionfuenteiva);
				}

				if(this.tiporetencionfuenteiva.getes_retencion_iva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_retencion_iva = "+this.tiporetencionfuenteiva.getes_retencion_iva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRetencionFuenteIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_debitoTipoRetencionFuenteIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRetencionFuenteIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRetencionFuenteIva(this.gettiporetencionfuenteiva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencionFuenteIva(this.tiporetencionfuenteiva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporetencionfuenteiva =(TipoRetencionFuenteIva) this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporetencionfuenteiva =(TipoRetencionFuenteIva) this.tiporetencionfuenteivas.toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporetencionfuenteiva==null) {
						this.tiporetencionfuenteiva = new TipoRetencionFuenteIva();
					}

					this.setVariablesFormularioToObjetoActualTipoRetencionFuenteIva(this.tiporetencionfuenteiva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencionFuenteIva(this.tiporetencionfuenteiva);
				}

				if(this.tiporetencionfuenteiva.getes_debito()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_debito = "+this.tiporetencionfuenteiva.getes_debito().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRetencionFuenteIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_con_iva_facturaTipoRetencionFuenteIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRetencionFuenteIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRetencionFuenteIva(this.gettiporetencionfuenteiva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencionFuenteIva(this.tiporetencionfuenteiva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporetencionfuenteiva =(TipoRetencionFuenteIva) this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporetencionfuenteiva =(TipoRetencionFuenteIva) this.tiporetencionfuenteivas.toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporetencionfuenteiva==null) {
						this.tiporetencionfuenteiva = new TipoRetencionFuenteIva();
					}

					this.setVariablesFormularioToObjetoActualTipoRetencionFuenteIva(this.tiporetencionfuenteiva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencionFuenteIva(this.tiporetencionfuenteiva);
				}

				if(this.tiporetencionfuenteiva.getes_con_iva_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_con_iva_factura = "+this.tiporetencionfuenteiva.getes_con_iva_factura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRetencionFuenteIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_con_sub_total_facturaTipoRetencionFuenteIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRetencionFuenteIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRetencionFuenteIva(this.gettiporetencionfuenteiva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencionFuenteIva(this.tiporetencionfuenteiva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporetencionfuenteiva =(TipoRetencionFuenteIva) this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporetencionfuenteiva =(TipoRetencionFuenteIva) this.tiporetencionfuenteivas.toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporetencionfuenteiva==null) {
						this.tiporetencionfuenteiva = new TipoRetencionFuenteIva();
					}

					this.setVariablesFormularioToObjetoActualTipoRetencionFuenteIva(this.tiporetencionfuenteiva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencionFuenteIva(this.tiporetencionfuenteiva);
				}

				if(this.tiporetencionfuenteiva.getes_con_sub_total_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_con_sub_total_factura = "+this.tiporetencionfuenteiva.getes_con_sub_total_factura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRetencionFuenteIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_con_secuencialTipoRetencionFuenteIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRetencionFuenteIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRetencionFuenteIva(this.gettiporetencionfuenteiva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencionFuenteIva(this.tiporetencionfuenteiva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporetencionfuenteiva =(TipoRetencionFuenteIva) this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporetencionfuenteiva =(TipoRetencionFuenteIva) this.tiporetencionfuenteivas.toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporetencionfuenteiva==null) {
						this.tiporetencionfuenteiva = new TipoRetencionFuenteIva();
					}

					this.setVariablesFormularioToObjetoActualTipoRetencionFuenteIva(this.tiporetencionfuenteiva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencionFuenteIva(this.tiporetencionfuenteiva);
				}

				if(this.tiporetencionfuenteiva.getes_con_secuencial()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_con_secuencial = "+this.tiporetencionfuenteiva.getes_con_secuencial().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRetencionFuenteIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoTipoRetencionFuenteIvaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoRetencionFuenteIva(false,false);

			this.getTipoRetencionFuenteIvasBusquedaPorCodigo();

			this.inicializarActualizarBindingTipoRetencionFuenteIva(false);

			//if(TipoRetencionFuenteIvaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoRetencionFuenteIva(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreTipoRetencionFuenteIvaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoRetencionFuenteIva(false,false);

			this.getTipoRetencionFuenteIvasBusquedaPorNombre();

			this.inicializarActualizarBindingTipoRetencionFuenteIva(false);

			//if(TipoRetencionFuenteIvaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoRetencionFuenteIva(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCuentaContableTipoRetencionFuenteIvaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoRetencionFuenteIva(false,false);

			this.getTipoRetencionFuenteIvasFK_IdCuentaContable();

			this.inicializarActualizarBindingTipoRetencionFuenteIva(false);

			//if(TipoRetencionFuenteIvaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoRetencionFuenteIva(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCuentaContableCreditoTipoRetencionFuenteIvaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoRetencionFuenteIva(false,false);

			this.getTipoRetencionFuenteIvasFK_IdCuentaContableCredito();

			this.inicializarActualizarBindingTipoRetencionFuenteIva(false);

			//if(TipoRetencionFuenteIvaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoRetencionFuenteIva(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPaisTipoRetencionFuenteIvaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoRetencionFuenteIva(false,false);

			this.getTipoRetencionFuenteIvasFK_IdPais();

			this.inicializarActualizarBindingTipoRetencionFuenteIva(false);

			//if(TipoRetencionFuenteIvaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoRetencionFuenteIva(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionfuenteivaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoRetencionFuenteIva() {
		if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) {
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.dispose();
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva!=null) {
			this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.dispose();
			this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva=null;
		}
		
		if(this.jInternalFrameImportacionTipoRetencionFuenteIva!=null) {
			this.jInternalFrameImportacionTipoRetencionFuenteIva.setVisible(false);	    			
			this.jInternalFrameImportacionTipoRetencionFuenteIva.dispose();
			this.jInternalFrameImportacionTipoRetencionFuenteIva=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoRetencionFuenteIva();
			
			TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporetencionfuenteiva,new Object(),this.tiporetencionfuenteivaParameterGeneral,this.tiporetencionfuenteivaReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoRetencionFuenteIva")) {
				jButtonNuevoTipoRetencionFuenteIvaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoRetencionFuenteIva")) {
				jButtonDuplicarTipoRetencionFuenteIvaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoRetencionFuenteIva")) {
				jButtonCopiarTipoRetencionFuenteIvaActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoRetencionFuenteIva")) {
				jButtonVerFormTipoRetencionFuenteIvaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoRetencionFuenteIva")) {
				jButtonNuevoTipoRetencionFuenteIvaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoRetencionFuenteIva")) {
				jButtonDuplicarTipoRetencionFuenteIvaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoRetencionFuenteIva")) {
				jButtonNuevoTipoRetencionFuenteIvaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoRetencionFuenteIva")) {
				jButtonDuplicarTipoRetencionFuenteIvaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoRetencionFuenteIva")) {
				jButtonNuevoTipoRetencionFuenteIvaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoRetencionFuenteIva")) {
				jButtonNuevoTipoRetencionFuenteIvaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoRetencionFuenteIva")) {
				jButtonNuevoTipoRetencionFuenteIvaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoRetencionFuenteIva")) {
				jButtonModificarTipoRetencionFuenteIvaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoRetencionFuenteIva")) {
				jButtonModificarTipoRetencionFuenteIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoRetencionFuenteIva")) {
				jButtonModificarTipoRetencionFuenteIvaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoRetencionFuenteIva")) {
				jButtonActualizarTipoRetencionFuenteIvaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoRetencionFuenteIva")) {
				jButtonActualizarTipoRetencionFuenteIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoRetencionFuenteIva")) {
				jButtonActualizarTipoRetencionFuenteIvaActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoRetencionFuenteIva")) {
				jButtonEliminarTipoRetencionFuenteIvaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoRetencionFuenteIva")) {
				jButtonEliminarTipoRetencionFuenteIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoRetencionFuenteIva")) {
				jButtonEliminarTipoRetencionFuenteIvaActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoRetencionFuenteIva")) {
				jButtonCancelarTipoRetencionFuenteIvaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoRetencionFuenteIva")) {
				jButtonCancelarTipoRetencionFuenteIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoRetencionFuenteIva")) {
				jButtonCancelarTipoRetencionFuenteIvaActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoRetencionFuenteIva")) {
				jButtonCerrarTipoRetencionFuenteIvaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoRetencionFuenteIva")) {
				jButtonCerrarTipoRetencionFuenteIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoRetencionFuenteIva")) {
				jButtonCerrarTipoRetencionFuenteIvaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoRetencionFuenteIva")) {
				jButtonMostrarOcultarTipoRetencionFuenteIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoRetencionFuenteIva")) {
				jButtonCancelarTipoRetencionFuenteIvaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoRetencionFuenteIva")) {
				jButtonGuardarCambiosTipoRetencionFuenteIvaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoRetencionFuenteIva")) {
				jButtonGuardarCambiosTipoRetencionFuenteIvaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoRetencionFuenteIva")) {
				jButtonCopiarTipoRetencionFuenteIvaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoRetencionFuenteIva")) {
				jButtonVerFormTipoRetencionFuenteIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoRetencionFuenteIva")) {
				jButtonGuardarCambiosTipoRetencionFuenteIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoRetencionFuenteIva")) {
				jButtonCopiarTipoRetencionFuenteIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoRetencionFuenteIva")) {
				jButtonVerFormTipoRetencionFuenteIvaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoRetencionFuenteIva")) {
				jButtonGuardarCambiosTipoRetencionFuenteIvaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoRetencionFuenteIva")) {
				jButtonGuardarCambiosTipoRetencionFuenteIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoRetencionFuenteIva")) {
				jButtonGuardarCambiosTipoRetencionFuenteIvaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoRetencionFuenteIva")) {
				jButtonRecargarInformacionTipoRetencionFuenteIvaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoRetencionFuenteIva")) {
				jButtonRecargarInformacionTipoRetencionFuenteIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoRetencionFuenteIva")) {
				jButtonRecargarInformacionTipoRetencionFuenteIvaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoRetencionFuenteIva")) {
				jButtonAnterioresTipoRetencionFuenteIvaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoRetencionFuenteIva")) {
				jButtonAnterioresTipoRetencionFuenteIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoRetencionFuenteIva")) {
				jButtonAnterioresTipoRetencionFuenteIvaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoRetencionFuenteIva")) {
				jButtonSiguientesTipoRetencionFuenteIvaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoRetencionFuenteIva")) {
				jButtonSiguientesTipoRetencionFuenteIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoRetencionFuenteIva")) {
				jButtonSiguientesTipoRetencionFuenteIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoRetencionFuenteIva") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoRetencionFuenteIva")) {
				jButtonAbrirOrderByTipoRetencionFuenteIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoRetencionFuenteIva") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoRetencionFuenteIva")) {
				jButtonMostrarOcultarTipoRetencionFuenteIvaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoRetencionFuenteIva")) {
				jButtonNuevoGuardarCambiosTipoRetencionFuenteIvaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoRetencionFuenteIva")) {
				jButtonNuevoGuardarCambiosTipoRetencionFuenteIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoRetencionFuenteIva")) {
				jButtonNuevoGuardarCambiosTipoRetencionFuenteIvaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoRetencionFuenteIva")) {
				jButtonCerrarReporteDinamicoTipoRetencionFuenteIvaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoRetencionFuenteIva")) {
				jButtonGenerarReporteDinamicoTipoRetencionFuenteIvaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoRetencionFuenteIva")) {
				
				jButtonGenerarExcelReporteDinamicoTipoRetencionFuenteIvaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoRetencionFuenteIva")) {
				jButtonCerrarImportacionTipoRetencionFuenteIvaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoRetencionFuenteIva")) {
				
				jButtonGenerarImportacionTipoRetencionFuenteIvaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoRetencionFuenteIva")) {
				
				jButtonAbrirImportacionTipoRetencionFuenteIvaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoRetencionFuenteIva")) {
				jComboBoxTiposAccionesTipoRetencionFuenteIvaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoRetencionFuenteIva")) {
				jComboBoxTiposRelacionesTipoRetencionFuenteIvaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoRetencionFuenteIva")) {
				jComboBoxTiposAccionesTipoRetencionFuenteIvaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoRetencionFuenteIva")) {
				
				jComboBoxTiposSeleccionarTipoRetencionFuenteIvaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoRetencionFuenteIva")) {
				jTextFieldValorCampoGeneralTipoRetencionFuenteIvaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoRetencionFuenteIva")) {
				jButtonAbrirOrderByTipoRetencionFuenteIvaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoRetencionFuenteIva")) {
				jButtonAbrirOrderByTipoRetencionFuenteIvaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoRetencionFuenteIva")) {
				jButtonCerrarOrderByTipoRetencionFuenteIvaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoRetencionFuenteIvaBusqueda")) {
				this.jButtonidTipoRetencionFuenteIvaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisTipoRetencionFuenteIvaUpdate")) {
				this.jButtonid_paisTipoRetencionFuenteIvaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisTipoRetencionFuenteIvaBusqueda")) {
				this.jButtonid_paisTipoRetencionFuenteIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoRetencionFuenteIvaBusqueda")) {
				this.jButtoncodigoTipoRetencionFuenteIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoRetencionFuenteIvaBusqueda")) {
				this.jButtonnombreTipoRetencionFuenteIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeTipoRetencionFuenteIvaBusqueda")) {
				this.jButtonporcentajeTipoRetencionFuenteIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("monto_minimoTipoRetencionFuenteIvaBusqueda")) {
				this.jButtonmonto_minimoTipoRetencionFuenteIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contableTipoRetencionFuenteIva")) {
				this.jButtonid_cuenta_contableTipoRetencionFuenteIvaActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contableTipoRetencionFuenteIvaArbol")) {
				this.abrirFrameTreeCuentaContable("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contableTipoRetencionFuenteIvaUpdate")) {
				this.jButtonid_cuenta_contableTipoRetencionFuenteIvaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contableTipoRetencionFuenteIvaBusqueda")) {
				this.jButtonid_cuenta_contableTipoRetencionFuenteIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoTipoRetencionFuenteIva")) {
				this.jButtonid_cuenta_contable_creditoTipoRetencionFuenteIvaActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoTipoRetencionFuenteIvaArbol")) {
				this.abrirFrameTreeCuentaContableCredito("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoTipoRetencionFuenteIvaUpdate")) {
				this.jButtonid_cuenta_contable_creditoTipoRetencionFuenteIvaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoTipoRetencionFuenteIvaBusqueda")) {
				this.jButtonid_cuenta_contable_creditoTipoRetencionFuenteIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_retencion_ivaTipoRetencionFuenteIvaBusqueda")) {
				this.jButtones_retencion_ivaTipoRetencionFuenteIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_debitoTipoRetencionFuenteIvaBusqueda")) {
				this.jButtones_debitoTipoRetencionFuenteIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_con_iva_facturaTipoRetencionFuenteIvaBusqueda")) {
				this.jButtones_con_iva_facturaTipoRetencionFuenteIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_con_sub_total_facturaTipoRetencionFuenteIvaBusqueda")) {
				this.jButtones_con_sub_total_facturaTipoRetencionFuenteIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_con_secuencialTipoRetencionFuenteIvaBusqueda")) {
				this.jButtones_con_secuencialTipoRetencionFuenteIvaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoTipoRetencionFuenteIva")) {
				this.jButtonBusquedaPorCodigoTipoRetencionFuenteIvaActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreTipoRetencionFuenteIva")) {
				this.jButtonBusquedaPorNombreTipoRetencionFuenteIvaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdPaisTipoRetencionFuenteIva")) {
				this.jButtonFK_IdPaisTipoRetencionFuenteIvaActionPerformed(evt);
			}
			
			;
			
			
			TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporetencionfuenteiva,new Object(),this.tiporetencionfuenteivaParameterGeneral,this.tiporetencionfuenteivaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoRetencionFuenteIva();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRetencionFuenteIvaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporetencionfuenteiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporetencionfuenteiva);
				
				TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencionfuenteiva,new Object(),this.tiporetencionfuenteivaParameterGeneral,this.tiporetencionfuenteivaReturnGeneral);
				
				


				
				TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencionfuenteiva,new Object(),this.tiporetencionfuenteivaParameterGeneral,this.tiporetencionfuenteivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRetencionFuenteIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRetencionFuenteIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoRetencionFuenteIva tiporetencionfuenteivaLocal=null;
			
			if(!this.getEsControlTabla()) {
				tiporetencionfuenteivaLocal=this.tiporetencionfuenteiva;
			} else {
				tiporetencionfuenteivaLocal=this.tiporetencionfuenteivaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporetencionfuenteiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporetencionfuenteiva);
				
				TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencionfuenteiva,new Object(),this.tiporetencionfuenteivaParameterGeneral,this.tiporetencionfuenteivaReturnGeneral);
							
				
				


				
				TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencionfuenteiva,new Object(),this.tiporetencionfuenteivaParameterGeneral,this.tiporetencionfuenteivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRetencionFuenteIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRetencionFuenteIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRetencionFuenteIvaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRetencionFuenteIva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaAnterior =(TipoRetencionFuenteIva) this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporetencionfuenteivaAnterior =(TipoRetencionFuenteIva) this.tiporetencionfuenteivas.toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
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
			
			TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencionfuenteiva,new Object(),this.tiporetencionfuenteivaParameterGeneral,this.tiporetencionfuenteivaReturnGeneral);
			
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
			
			


			
			TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencionfuenteiva,new Object(),this.tiporetencionfuenteivaParameterGeneral,this.tiporetencionfuenteivaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRetencionFuenteIvaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporetencionfuenteiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporetencionfuenteiva);
				
				TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencionfuenteiva,new Object(),this.tiporetencionfuenteivaParameterGeneral,this.tiporetencionfuenteivaReturnGeneral);
								
						
				


				
				TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencionfuenteiva,new Object(),this.tiporetencionfuenteivaParameterGeneral,this.tiporetencionfuenteivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRetencionFuenteIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRetencionFuenteIva.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporetencionfuenteiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporetencionfuenteiva);
				
				TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencionfuenteiva,new Object(),this.tiporetencionfuenteivaParameterGeneral,this.tiporetencionfuenteivaReturnGeneral);
								
				
				


				
				TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencionfuenteiva,new Object(),this.tiporetencionfuenteivaParameterGeneral,this.tiporetencionfuenteivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRetencionFuenteIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRetencionFuenteIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRetencionFuenteIvaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRetencionFuenteIva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaAnterior =(TipoRetencionFuenteIva) this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporetencionfuenteivaAnterior =(TipoRetencionFuenteIva) this.tiporetencionfuenteivas.toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporetencionfuenteiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporetencionfuenteiva);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRetencionFuenteIvaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRetencionFuenteIva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaAnterior =(TipoRetencionFuenteIva) this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporetencionfuenteivaAnterior =(TipoRetencionFuenteIva) this.tiporetencionfuenteivas.toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRetencionFuenteIvaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporetencionfuenteiva);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiporetencionfuenteiva);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporetencionfuenteiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporetencionfuenteiva);
				
				TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencionfuenteiva,new Object(),this.tiporetencionfuenteivaParameterGeneral,this.tiporetencionfuenteivaReturnGeneral);
							
				
				


				
				TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencionfuenteiva,new Object(),this.tiporetencionfuenteivaParameterGeneral,this.tiporetencionfuenteivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRetencionFuenteIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRetencionFuenteIva.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRetencionFuenteIvaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoRetencionFuenteIva.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporetencionfuenteivaAnterior =(TipoRetencionFuenteIva) this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tiporetencionfuenteivaAnterior =(TipoRetencionFuenteIva) this.tiporetencionfuenteivas.toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
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
			
			TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencionfuenteiva,new Object(),this.tiporetencionfuenteivaParameterGeneral,this.tiporetencionfuenteivaReturnGeneral);
			
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
			
			


			
			TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencionfuenteiva,new Object(),this.tiporetencionfuenteivaParameterGeneral,this.tiporetencionfuenteivaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRetencionFuenteIvaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporetencionfuenteiva);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiporetencionfuenteiva);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporetencionfuenteiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporetencionfuenteiva);
				
				TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencionfuenteiva,new Object(),this.tiporetencionfuenteivaParameterGeneral,this.tiporetencionfuenteivaReturnGeneral);
								
				
				


				
				TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencionfuenteiva,new Object(),this.tiporetencionfuenteivaParameterGeneral,this.tiporetencionfuenteivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRetencionFuenteIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRetencionFuenteIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRetencionFuenteIvaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRetencionFuenteIva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaAnterior =(TipoRetencionFuenteIva) this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporetencionfuenteivaAnterior =(TipoRetencionFuenteIva) this.tiporetencionfuenteivas.toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRetencionFuenteIvaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporetencionfuenteiva);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiporetencionfuenteiva);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRetencionFuenteIvaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporetencionfuenteiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporetencionfuenteiva);
				
				TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporetencionfuenteiva,new Object(),this.tiporetencionfuenteivaParameterGeneral,this.tiporetencionfuenteivaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoRetencionFuenteIva")) {
					jCheckBoxSeleccionarTodosTipoRetencionFuenteIvaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoRetencionFuenteIva")) {
					jCheckBoxSeleccionadosTipoRetencionFuenteIvaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoRetencionFuenteIva")) {
					
				}
				
				


				
				
				TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporetencionfuenteiva,new Object(),this.tiporetencionfuenteivaParameterGeneral,this.tiporetencionfuenteivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRetencionFuenteIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRetencionFuenteIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporetencionfuenteiva);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tiporetencionfuenteiva);
				
				TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporetencionfuenteiva,new Object(),this.tiporetencionfuenteivaParameterGeneral,this.tiporetencionfuenteivaReturnGeneral);
												
				
				


				
				
				TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporetencionfuenteiva,new Object(),this.tiporetencionfuenteivaParameterGeneral,this.tiporetencionfuenteivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRetencionFuenteIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRetencionFuenteIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRetencionFuenteIvaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoRetencionFuenteIva.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporetencionfuenteivaAnterior =(TipoRetencionFuenteIva) this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tiporetencionfuenteivaAnterior =(TipoRetencionFuenteIva) this.tiporetencionfuenteivas.toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRetencionFuenteIvaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporetencionfuenteiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporetencionfuenteiva);
				
				TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporetencionfuenteiva,new Object(),this.tiporetencionfuenteivaParameterGeneral,this.tiporetencionfuenteivaReturnGeneral);
				
				
				TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporetencionfuenteiva,new Object(),this.tiporetencionfuenteivaParameterGeneral,this.tiporetencionfuenteivaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
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
			
			TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiporetencionfuenteiva,new Object(),this.tiporetencionfuenteivaParameterGeneral,this.tiporetencionfuenteivaReturnGeneral);
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
			
			


			
			TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencionfuenteiva,new Object(),this.tiporetencionfuenteivaParameterGeneral,this.tiporetencionfuenteivaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRetencionFuenteIvaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporetencionfuenteiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporetencionfuenteiva);
				
				TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiporetencionfuenteiva,new Object(),this.tiporetencionfuenteivaParameterGeneral,this.tiporetencionfuenteivaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencionfuenteiva,new Object(),this.tiporetencionfuenteivaParameterGeneral,this.tiporetencionfuenteivaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRetencionFuenteIva.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRetencionFuenteIva.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporetencionfuenteiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporetencionfuenteiva);
				
				TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiporetencionfuenteiva,new Object(),this.tiporetencionfuenteivaParameterGeneral,this.tiporetencionfuenteivaReturnGeneral);
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
				
				


				
				TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencionfuenteiva,new Object(),this.tiporetencionfuenteivaParameterGeneral,this.tiporetencionfuenteivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRetencionFuenteIva.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRetencionFuenteIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRetencionFuenteIvaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRetencionFuenteIva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionfuenteivaAnterior =(TipoRetencionFuenteIva) this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporetencionfuenteivaAnterior =(TipoRetencionFuenteIva) this.tiporetencionfuenteivas.toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencionfuenteiva,new Object(),this.tiporetencionfuenteivaParameterGeneral,this.tiporetencionfuenteivaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoRetencionFuenteIva")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoRetencionFuenteIvaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoRetencionFuenteIva.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tiporetencionfuenteiva =(TipoRetencionFuenteIva) this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tiporetencionfuenteiva =(TipoRetencionFuenteIva) this.tiporetencionfuenteivas.toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tiporetencionfuenteiva);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoRetencionFuenteIva")) {
				
				}
				
				TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencionfuenteiva,new Object(),this.tiporetencionfuenteivaParameterGeneral,this.tiporetencionfuenteivaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tiporetencionfuenteiva,new Object(),this.tiporetencionfuenteivaParameterGeneral,this.tiporetencionfuenteivaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoRetencionFuenteIva")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoRetencionFuenteIva.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoRetencionFuenteIva")) {
			
			}
			
			TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tiporetencionfuenteiva,new Object(),this.tiporetencionfuenteivaParameterGeneral,this.tiporetencionfuenteivaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoRetencionFuenteIva();
			
			TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporetencionfuenteiva,new Object(),this.tiporetencionfuenteivaParameterGeneral,this.tiporetencionfuenteivaReturnGeneral);
			
			if(sTipo.equals("NuevoTipoRetencionFuenteIva")) {
				jButtonNuevoTipoRetencionFuenteIvaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoRetencionFuenteIva")) {
				jButtonDuplicarTipoRetencionFuenteIvaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoRetencionFuenteIva")) {
				jButtonCopiarTipoRetencionFuenteIvaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoRetencionFuenteIva")) {
				jButtonVerFormTipoRetencionFuenteIvaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoRetencionFuenteIva")) {
				jButtonNuevoTipoRetencionFuenteIvaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoRetencionFuenteIva")) {
				jButtonModificarTipoRetencionFuenteIvaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoRetencionFuenteIva")) {
				jButtonActualizarTipoRetencionFuenteIvaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoRetencionFuenteIva")) {
				jButtonEliminarTipoRetencionFuenteIvaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoRetencionFuenteIva")) {
				jButtonGuardarCambiosTipoRetencionFuenteIvaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoRetencionFuenteIva")) {
				jButtonCancelarTipoRetencionFuenteIvaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoRetencionFuenteIva")) {
				jButtonCerrarTipoRetencionFuenteIvaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoRetencionFuenteIva")) {
				jButtonGuardarCambiosTipoRetencionFuenteIvaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoRetencionFuenteIva")) {
				jButtonNuevoGuardarCambiosTipoRetencionFuenteIvaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoRetencionFuenteIva")) {
				jButtonAbrirOrderByTipoRetencionFuenteIvaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoRetencionFuenteIva")) {
				jButtonRecargarInformacionTipoRetencionFuenteIvaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoRetencionFuenteIva")) {
				jButtonAnterioresTipoRetencionFuenteIvaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoRetencionFuenteIva")) {
				jButtonSiguientesTipoRetencionFuenteIvaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoRetencionFuenteIvaBusqueda")) {
				this.jButtonidTipoRetencionFuenteIvaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisTipoRetencionFuenteIvaUpdate")) {
				this.jButtonid_paisTipoRetencionFuenteIvaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisTipoRetencionFuenteIvaBusqueda")) {
				this.jButtonid_paisTipoRetencionFuenteIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoRetencionFuenteIvaBusqueda")) {
				this.jButtoncodigoTipoRetencionFuenteIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoRetencionFuenteIvaBusqueda")) {
				this.jButtonnombreTipoRetencionFuenteIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeTipoRetencionFuenteIvaBusqueda")) {
				this.jButtonporcentajeTipoRetencionFuenteIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("monto_minimoTipoRetencionFuenteIvaBusqueda")) {
				this.jButtonmonto_minimoTipoRetencionFuenteIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contableTipoRetencionFuenteIva")) {
				this.jButtonid_cuenta_contableTipoRetencionFuenteIvaActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contableTipoRetencionFuenteIvaArbol")) {
				this.abrirFrameTreeCuentaContable("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contableTipoRetencionFuenteIvaUpdate")) {
				this.jButtonid_cuenta_contableTipoRetencionFuenteIvaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contableTipoRetencionFuenteIvaBusqueda")) {
				this.jButtonid_cuenta_contableTipoRetencionFuenteIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoTipoRetencionFuenteIva")) {
				this.jButtonid_cuenta_contable_creditoTipoRetencionFuenteIvaActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoTipoRetencionFuenteIvaArbol")) {
				this.abrirFrameTreeCuentaContableCredito("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoTipoRetencionFuenteIvaUpdate")) {
				this.jButtonid_cuenta_contable_creditoTipoRetencionFuenteIvaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoTipoRetencionFuenteIvaBusqueda")) {
				this.jButtonid_cuenta_contable_creditoTipoRetencionFuenteIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_retencion_ivaTipoRetencionFuenteIvaBusqueda")) {
				this.jButtones_retencion_ivaTipoRetencionFuenteIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_debitoTipoRetencionFuenteIvaBusqueda")) {
				this.jButtones_debitoTipoRetencionFuenteIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_con_iva_facturaTipoRetencionFuenteIvaBusqueda")) {
				this.jButtones_con_iva_facturaTipoRetencionFuenteIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_con_sub_total_facturaTipoRetencionFuenteIvaBusqueda")) {
				this.jButtones_con_sub_total_facturaTipoRetencionFuenteIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_con_secuencialTipoRetencionFuenteIvaBusqueda")) {
				this.jButtones_con_secuencialTipoRetencionFuenteIvaBusquedaActionPerformed(evt);
			}
			
			TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporetencionfuenteiva,new Object(),this.tiporetencionfuenteivaParameterGeneral,this.tiporetencionfuenteivaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoRetencionFuenteIva();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tiporetencionfuenteiva,new Object(),this.tiporetencionfuenteivaParameterGeneral,this.tiporetencionfuenteivaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoRetencionFuenteIva")) {
				closingInternalFrameTipoRetencionFuenteIva();
				
			} else if(sTipo.equals("jButtonCancelarTipoRetencionFuenteIva")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoRetencionFuenteIva = (JInternalFrameBase)evt.getSource();
	            	
	            TipoRetencionFuenteIvaBeanSwingJInternalFrame jInternalFrameParent=(TipoRetencionFuenteIvaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoRetencionFuenteIva.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoRetencionFuenteIvaActionPerformed(null);
			}
			
			TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tiporetencionfuenteiva,new Object(),this.tiporetencionfuenteivaParameterGeneral,this.tiporetencionfuenteivaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoRetencionFuenteIva(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoRetencionFuenteIva(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoRetencionFuenteIva(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tiporetencionfuenteiva)) {
			if(!esControlTabla) {
				if(TipoRetencionFuenteIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoRetencionFuenteIva(this.tiporetencionfuenteiva,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencionFuenteIva(this.tiporetencionfuenteiva);			
				}
				
				if(this.tiporetencionfuenteivaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoRetencionFuenteIva(this.tiporetencionfuenteiva,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tiporetencionfuenteivaReturnGeneral=tiporetencionfuenteivaLogic.procesarEventosTipoRetencionFuenteIvasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas(),this.tiporetencionfuenteiva,this.tiporetencionfuenteivaParameterGeneral,this.isEsNuevoTipoRetencionFuenteIva,classes);//this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIva()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoRetencionFuenteIva(this.tiporetencionfuenteivaReturnGeneral,this.tiporetencionfuenteivaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tiporetencionfuenteivaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoRetencionFuenteIva(classes,this.tiporetencionfuenteivaReturnGeneral,this.tiporetencionfuenteivaBean,false);
					}
						
					if(this.tiporetencionfuenteivaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoRetencionFuenteIva(this.tiporetencionfuenteivaReturnGeneral.getTipoRetencionFuenteIva());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoRetencionFuenteIva(this.tiporetencionfuenteivaReturnGeneral.getTipoRetencionFuenteIva());	
					}
						
					if(this.tiporetencionfuenteivaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoRetencionFuenteIva(this.tiporetencionfuenteivaReturnGeneral.getTipoRetencionFuenteIva(),classes);//this.tiporetencionfuenteivaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoRetencionFuenteIva(this.tiporetencionfuenteiva,classes);//this.tiporetencionfuenteivaBean);									
				}
			
				if(TipoRetencionFuenteIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoRetencionFuenteIva(this.tiporetencionfuenteiva,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencionFuenteIva(this.tiporetencionfuenteiva);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tiporetencionfuenteivaAnterior!=null) {
						this.tiporetencionfuenteiva=this.tiporetencionfuenteivaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tiporetencionfuenteivaReturnGeneral=tiporetencionfuenteivaLogic.procesarEventosTipoRetencionFuenteIvasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas(),this.tiporetencionfuenteiva,this.tiporetencionfuenteivaParameterGeneral,this.isEsNuevoTipoRetencionFuenteIva,classes);//this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIva()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tiporetencionfuenteivaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tiporetencionfuenteivaReturnGeneral.getTipoRetencionFuenteIva(),tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tiporetencionfuenteivaReturnGeneral.getTipoRetencionFuenteIva(),this.tiporetencionfuenteivas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoRetencionFuenteIva.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoRetencionFuenteIva.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoRetencionFuenteIva();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoRetencionFuenteIva() throws Exception {
		
		TipoRetencionFuenteIvaModel tiporetencionfuenteivaModel=(TipoRetencionFuenteIvaModel)this.jTableDatosTipoRetencionFuenteIva.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiporetencionfuenteivaModel.tiporetencionfuenteivas=this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tiporetencionfuenteivaModel.tiporetencionfuenteivas=this.tiporetencionfuenteivas;
		}
		
		
		((TipoRetencionFuenteIvaModel) this.jTableDatosTipoRetencionFuenteIva.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoRetencionFuenteIva() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettiporetencionfuenteivaAnterior(),this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettiporetencionfuenteivaAnterior(),this.tiporetencionfuenteivas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoRetencionFuenteIva();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoRetencionFuenteIva(TipoRetencionFuenteIva tiporetencionfuenteiva,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
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
										
				TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiporetencionfuenteiva,new Object(),generalEntityParameterGeneral,this.tiporetencionfuenteivaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tiporetencionfuenteivaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoRetencionFuenteIvaConstantesFunciones.getClassesRelationshipsOfTipoRetencionFuenteIva(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoRetencionFuenteIvaConstantesFunciones.getClassesRelationshipsFromStringsOfTipoRetencionFuenteIva(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoRetencionFuenteIva(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiporetencionfuenteiva,new Object(),generalEntityParameterGeneral,this.tiporetencionfuenteivaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoRetencionFuenteIva(TipoRetencionFuenteIvaBean tiporetencionfuenteivaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoRetencionFuenteIva(ArrayList<Classe> classes,TipoRetencionFuenteIvaReturnGeneral tiporetencionfuenteivaReturnGeneral,TipoRetencionFuenteIvaBean tiporetencionfuenteivaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoRetencionFuenteIva(TipoRetencionFuenteIva tiporetencionfuenteiva,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tiporetencionfuenteiva)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva = new TipoRetencionFuenteIvaDetalleFormJInternalFrame(jDesktopPane,this.tiporetencionfuenteivaSessionBean.getConGuardarRelaciones(),this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoRetencionFuenteIva);
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.setVisible(false);
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.tiporetencionfuenteivaLogic=this.tiporetencionfuenteivaLogic;
		
		this.cargarCombosFrameForeignKeyTipoRetencionFuenteIva("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoRetencionFuenteIva();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoRetencionFuenteIva();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoRetencionFuenteIva("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoRetencionFuenteIva();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoRetencionFuenteIva"));
		
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonModificarTipoRetencionFuenteIva.addActionListener(new ButtonActionListener(this,"ModificarTipoRetencionFuenteIva"));

		
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonModificarToolBarTipoRetencionFuenteIva.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoRetencionFuenteIva"));
					
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jMenuItemModificarTipoRetencionFuenteIva.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoRetencionFuenteIva"));		
		
		
		
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonActualizarTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"ActualizarTipoRetencionFuenteIva"));
		
		
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonActualizarToolBarTipoRetencionFuenteIva.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoRetencionFuenteIva"));
						
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jMenuItemActualizarTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoRetencionFuenteIva"));		
		
		
		
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonEliminarTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"EliminarTipoRetencionFuenteIva"));
		
		
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonEliminarToolBarTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoRetencionFuenteIva"));
								
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jMenuItemEliminarTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoRetencionFuenteIva"));		
		
		
		
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonCancelarTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"CancelarTipoRetencionFuenteIva"));
		
		
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonCancelarToolBarTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoRetencionFuenteIva"));
					
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jMenuItemCancelarTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoRetencionFuenteIva"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jMenuItemDetalleCerrarTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoRetencionFuenteIva"));		
		
		
		
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonGuardarCambiosToolBarTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoRetencionFuenteIva"));
		
		
		
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonGuardarCambiosToolBarTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoRetencionFuenteIva"));
		
		
		
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxTiposAccionesFormularioTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoRetencionFuenteIva"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonidTipoRetencionFuenteIvaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoRetencionFuenteIvaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonid_paisTipoRetencionFuenteIvaUpdate.addActionListener(new ButtonActionListener(this,"id_paisTipoRetencionFuenteIvaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonid_paisTipoRetencionFuenteIvaBusqueda.addActionListener(new ButtonActionListener(this,"id_paisTipoRetencionFuenteIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtoncodigoTipoRetencionFuenteIvaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoRetencionFuenteIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonnombreTipoRetencionFuenteIvaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoRetencionFuenteIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonporcentajeTipoRetencionFuenteIvaBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeTipoRetencionFuenteIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonmonto_minimoTipoRetencionFuenteIvaBusqueda.addActionListener(new ButtonActionListener(this,"monto_minimoTipoRetencionFuenteIvaBusqueda"));
		//jButtonid_cuenta_contableTipoRetencionFuenteIva.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contableTipoRetencionFuenteIvaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonid_cuenta_contableTipoRetencionFuenteIva.addActionListener(new ButtonActionListener(this,"id_cuenta_contableTipoRetencionFuenteIva"));
		//jButtonid_cuenta_contableTipoRetencionFuenteIvaArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContable("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonid_cuenta_contableTipoRetencionFuenteIvaArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contableTipoRetencionFuenteIvaArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonid_cuenta_contableTipoRetencionFuenteIvaUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableTipoRetencionFuenteIvaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonid_cuenta_contableTipoRetencionFuenteIvaBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableTipoRetencionFuenteIvaBusqueda"));
		//jButtonid_cuenta_contable_creditoTipoRetencionFuenteIva.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contable_creditoTipoRetencionFuenteIvaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonid_cuenta_contable_creditoTipoRetencionFuenteIva.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoTipoRetencionFuenteIva"));
		//jButtonid_cuenta_contable_creditoTipoRetencionFuenteIvaArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContableCredito("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonid_cuenta_contable_creditoTipoRetencionFuenteIvaArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoTipoRetencionFuenteIvaArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonid_cuenta_contable_creditoTipoRetencionFuenteIvaUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoTipoRetencionFuenteIvaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonid_cuenta_contable_creditoTipoRetencionFuenteIvaBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoTipoRetencionFuenteIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtones_retencion_ivaTipoRetencionFuenteIvaBusqueda.addActionListener(new ButtonActionListener(this,"es_retencion_ivaTipoRetencionFuenteIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtones_debitoTipoRetencionFuenteIvaBusqueda.addActionListener(new ButtonActionListener(this,"es_debitoTipoRetencionFuenteIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtones_con_iva_facturaTipoRetencionFuenteIvaBusqueda.addActionListener(new ButtonActionListener(this,"es_con_iva_facturaTipoRetencionFuenteIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtones_con_sub_total_facturaTipoRetencionFuenteIvaBusqueda.addActionListener(new ButtonActionListener(this,"es_con_sub_total_facturaTipoRetencionFuenteIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtones_con_secuencialTipoRetencionFuenteIvaBusqueda.addActionListener(new ButtonActionListener(this,"es_con_secuencialTipoRetencionFuenteIvaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jTabbedPaneRelacionesTipoRetencionFuenteIva.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoRetencionFuenteIva"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoRetencionFuenteIva"));
		
		if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoRetencionFuenteIva"));
		}
		
		this.jTableDatosTipoRetencionFuenteIva.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoRetencionFuenteIva"));
		
		this.jTableDatosTipoRetencionFuenteIva.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoRetencionFuenteIva"));
		
		this.jButtonNuevoTipoRetencionFuenteIva.addActionListener(new ButtonActionListener(this,"NuevoTipoRetencionFuenteIva"));
		
		this.jButtonDuplicarTipoRetencionFuenteIva.addActionListener(new ButtonActionListener(this,"DuplicarTipoRetencionFuenteIva"));
		
		this.jButtonCopiarTipoRetencionFuenteIva.addActionListener(new ButtonActionListener(this,"CopiarTipoRetencionFuenteIva"));
		
		this.jButtonVerFormTipoRetencionFuenteIva.addActionListener(new ButtonActionListener(this,"VerFormTipoRetencionFuenteIva"));
		
		
		this.jButtonNuevoToolBarTipoRetencionFuenteIva.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoRetencionFuenteIva"));
			
		this.jButtonDuplicarToolBarTipoRetencionFuenteIva.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoRetencionFuenteIva"));
			
		this.jMenuItemNuevoTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoRetencionFuenteIva"));
			
		this.jMenuItemDuplicarTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoRetencionFuenteIva"));		
		
		
		this.jButtonNuevoRelacionesTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoRetencionFuenteIva"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoRetencionFuenteIva.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoRetencionFuenteIva"));
			
		this.jMenuItemNuevoRelacionesTipoRetencionFuenteIva.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoRetencionFuenteIva"));		
		
		
		if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonModificarTipoRetencionFuenteIva.addActionListener(new ButtonActionListener(this,"ModificarTipoRetencionFuenteIva"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonModificarToolBarTipoRetencionFuenteIva.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoRetencionFuenteIva"));
			
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jMenuItemModificarTipoRetencionFuenteIva.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoRetencionFuenteIva"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonActualizarTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"ActualizarTipoRetencionFuenteIva"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonActualizarToolBarTipoRetencionFuenteIva.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoRetencionFuenteIva"));
				
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jMenuItemActualizarTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoRetencionFuenteIva"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonEliminarTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"EliminarTipoRetencionFuenteIva"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonEliminarToolBarTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoRetencionFuenteIva"));
						
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jMenuItemEliminarTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoRetencionFuenteIva"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonCancelarTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"CancelarTipoRetencionFuenteIva"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonCancelarToolBarTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoRetencionFuenteIva"));
			
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jMenuItemCancelarTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoRetencionFuenteIva"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoRetencionFuenteIva"));		
		
		
		this.jButtonCerrarTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"CerrarTipoRetencionFuenteIva"));
		
		
		this.jButtonCerrarToolBarTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoRetencionFuenteIva"));
			
		this.jMenuItemCerrarTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoRetencionFuenteIva"));
			
		if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jMenuItemDetalleCerrarTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoRetencionFuenteIva"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonGuardarCambiosTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoRetencionFuenteIva"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonGuardarCambiosToolBarTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoRetencionFuenteIva"));
		}
		
		this.jButtonCopiarToolBarTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoRetencionFuenteIva"));
			
		this.jButtonVerFormToolBarTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoRetencionFuenteIva"));
		
		this.jMenuItemGuardarCambiosTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoRetencionFuenteIva"));
			
		this.jMenuItemCopiarTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoRetencionFuenteIva"));		
		
		this.jMenuItemVerFormTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoRetencionFuenteIva"));		
		
		
		this.jButtonGuardarCambiosTablaTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoRetencionFuenteIva"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoRetencionFuenteIva"));
			
		this.jMenuItemGuardarCambiosTablaTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoRetencionFuenteIva"));		
		
		
		
		this.jButtonRecargarInformacionTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoRetencionFuenteIva"));
					
		this.jButtonRecargarInformacionToolBarTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoRetencionFuenteIva"));
		
		this.jMenuItemRecargarInformacionTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoRetencionFuenteIva"));		
		
		
		
		this.jButtonAnterioresTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"AnterioresTipoRetencionFuenteIva"));
		
		
		this.jButtonAnterioresToolBarTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoRetencionFuenteIva"));
		
		this.jMenuItemAnterioresTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoRetencionFuenteIva"));		
		
		
		this.jButtonSiguientesTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"SiguientesTipoRetencionFuenteIva"));
		
		
		this.jButtonSiguientesToolBarTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoRetencionFuenteIva"));
			
		this.jMenuItemSiguientesTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoRetencionFuenteIva"));
			
		this.jMenuItemAbrirOrderByTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoRetencionFuenteIva"));
			
		this.jMenuItemMostrarOcultarTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoRetencionFuenteIva"));
			
		this.jMenuItemDetalleAbrirOrderByTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoRetencionFuenteIva"));
			
		this.jMenuItemDetalleMostarOcultarTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoRetencionFuenteIva"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoRetencionFuenteIva"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoRetencionFuenteIva"));
			
		this.jMenuItemNuevoGuardarCambiosTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoRetencionFuenteIva"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoRetencionFuenteIva.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoRetencionFuenteIva"));

		this.jCheckBoxSeleccionadosTipoRetencionFuenteIva.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoRetencionFuenteIva"));
		
		if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxTiposAccionesFormularioTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoRetencionFuenteIva"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoRetencionFuenteIva"));
			
		this.jComboBoxTiposAccionesTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoRetencionFuenteIva"));
					
		this.jComboBoxTiposSeleccionarTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoRetencionFuenteIva"));
			
		this.jTextFieldValorCampoGeneralTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoRetencionFuenteIva"));		
		
		
		if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonidTipoRetencionFuenteIvaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoRetencionFuenteIvaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonid_paisTipoRetencionFuenteIvaUpdate.addActionListener(new ButtonActionListener(this,"id_paisTipoRetencionFuenteIvaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonid_paisTipoRetencionFuenteIvaBusqueda.addActionListener(new ButtonActionListener(this,"id_paisTipoRetencionFuenteIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtoncodigoTipoRetencionFuenteIvaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoRetencionFuenteIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonnombreTipoRetencionFuenteIvaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoRetencionFuenteIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonporcentajeTipoRetencionFuenteIvaBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeTipoRetencionFuenteIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonmonto_minimoTipoRetencionFuenteIvaBusqueda.addActionListener(new ButtonActionListener(this,"monto_minimoTipoRetencionFuenteIvaBusqueda"));
		//jButtonid_cuenta_contableTipoRetencionFuenteIva.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contableTipoRetencionFuenteIvaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonid_cuenta_contableTipoRetencionFuenteIva.addActionListener(new ButtonActionListener(this,"id_cuenta_contableTipoRetencionFuenteIva"));
		//jButtonid_cuenta_contableTipoRetencionFuenteIvaArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContable("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonid_cuenta_contableTipoRetencionFuenteIvaArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contableTipoRetencionFuenteIvaArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonid_cuenta_contableTipoRetencionFuenteIvaUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableTipoRetencionFuenteIvaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonid_cuenta_contableTipoRetencionFuenteIvaBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableTipoRetencionFuenteIvaBusqueda"));
		//jButtonid_cuenta_contable_creditoTipoRetencionFuenteIva.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contable_creditoTipoRetencionFuenteIvaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonid_cuenta_contable_creditoTipoRetencionFuenteIva.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoTipoRetencionFuenteIva"));
		//jButtonid_cuenta_contable_creditoTipoRetencionFuenteIvaArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContableCredito("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonid_cuenta_contable_creditoTipoRetencionFuenteIvaArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoTipoRetencionFuenteIvaArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonid_cuenta_contable_creditoTipoRetencionFuenteIvaUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoTipoRetencionFuenteIvaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonid_cuenta_contable_creditoTipoRetencionFuenteIvaBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoTipoRetencionFuenteIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtones_retencion_ivaTipoRetencionFuenteIvaBusqueda.addActionListener(new ButtonActionListener(this,"es_retencion_ivaTipoRetencionFuenteIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtones_debitoTipoRetencionFuenteIvaBusqueda.addActionListener(new ButtonActionListener(this,"es_debitoTipoRetencionFuenteIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtones_con_iva_facturaTipoRetencionFuenteIvaBusqueda.addActionListener(new ButtonActionListener(this,"es_con_iva_facturaTipoRetencionFuenteIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtones_con_sub_total_facturaTipoRetencionFuenteIvaBusqueda.addActionListener(new ButtonActionListener(this,"es_con_sub_total_facturaTipoRetencionFuenteIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtones_con_secuencialTipoRetencionFuenteIvaBusqueda.addActionListener(new ButtonActionListener(this,"es_con_secuencialTipoRetencionFuenteIvaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoTipoRetencionFuenteIva.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTipoRetencionFuenteIva"));

			this.jButtonBusquedaPorNombreTipoRetencionFuenteIva.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoRetencionFuenteIva"));

			this.jButtonFK_IdPaisTipoRetencionFuenteIva.addActionListener(new ButtonActionListener(this,"FK_IdPaisTipoRetencionFuenteIva"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva!=null) {
				this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoRetencionFuenteIva"));
				this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoRetencionFuenteIva"));
				this.jInternalFrameReporteDinamicoTipoRetencionFuenteIva.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoRetencionFuenteIva"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoRetencionFuenteIva"));				
			//this.jButtonGenerarReporteDinamicoTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoRetencionFuenteIva"));
			//this.jButtonGenerarExcelReporteDinamicoTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoRetencionFuenteIva"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoRetencionFuenteIva!=null) {
				this.jInternalFrameImportacionTipoRetencionFuenteIva.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoRetencionFuenteIva"));
				this.jInternalFrameImportacionTipoRetencionFuenteIva.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoRetencionFuenteIva"));
				this.jInternalFrameImportacionTipoRetencionFuenteIva.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoRetencionFuenteIva"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoRetencionFuenteIva"));
			
			this.jButtonAbrirOrderByToolBarTipoRetencionFuenteIva.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoRetencionFuenteIva"));			
			
			if(this.jInternalFrameOrderByTipoRetencionFuenteIva!=null) {
				this.jInternalFrameOrderByTipoRetencionFuenteIva.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoRetencionFuenteIva"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jTabbedPaneRelacionesTipoRetencionFuenteIva.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoRetencionFuenteIva"));
		
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
            		closingInternalFrameTipoRetencionFuenteIva();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoRetencionFuenteIva = (JInternalFrameBase)event.getSource();
	            	
	            TipoRetencionFuenteIvaBeanSwingJInternalFrame jInternalFrameParent=(TipoRetencionFuenteIvaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoRetencionFuenteIva.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoRetencionFuenteIvaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoRetencionFuenteIva.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoRetencionFuenteIvaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoRetencionFuenteIva.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoRetencionFuenteIva.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoRetencionFuenteIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRetencionFuenteIvaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoRetencionFuenteIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRetencionFuenteIvaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoRetencionFuenteIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRetencionFuenteIvaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoRetencionFuenteIva";
		inputMap = this.jButtonNuevoTipoRetencionFuenteIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoRetencionFuenteIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoRetencionFuenteIvaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoRetencionFuenteIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRetencionFuenteIvaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoRetencionFuenteIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRetencionFuenteIvaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoRetencionFuenteIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRetencionFuenteIvaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoRetencionFuenteIva";
		inputMap = this.jButtonNuevoRelacionesTipoRetencionFuenteIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoRetencionFuenteIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoRetencionFuenteIvaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoRetencionFuenteIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoRetencionFuenteIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoRetencionFuenteIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoRetencionFuenteIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoRetencionFuenteIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoRetencionFuenteIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoRetencionFuenteIva";
		inputMap = this.jButtonModificarTipoRetencionFuenteIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoRetencionFuenteIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoRetencionFuenteIvaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoRetencionFuenteIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoRetencionFuenteIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoRetencionFuenteIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoRetencionFuenteIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoRetencionFuenteIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoRetencionFuenteIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoRetencionFuenteIva";
		inputMap = this.jButtonActualizarTipoRetencionFuenteIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoRetencionFuenteIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoRetencionFuenteIvaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoRetencionFuenteIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoRetencionFuenteIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoRetencionFuenteIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoRetencionFuenteIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoRetencionFuenteIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoRetencionFuenteIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoRetencionFuenteIva";
		inputMap = this.jButtonEliminarTipoRetencionFuenteIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoRetencionFuenteIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoRetencionFuenteIvaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoRetencionFuenteIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoRetencionFuenteIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoRetencionFuenteIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoRetencionFuenteIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoRetencionFuenteIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoRetencionFuenteIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoRetencionFuenteIva";
		inputMap = this.jButtonCancelarTipoRetencionFuenteIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoRetencionFuenteIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoRetencionFuenteIvaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoRetencionFuenteIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoRetencionFuenteIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoRetencionFuenteIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoRetencionFuenteIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoRetencionFuenteIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoRetencionFuenteIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoRetencionFuenteIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoRetencionFuenteIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoRetencionFuenteIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoRetencionFuenteIva";
		inputMap = this.jButtonCerrarTipoRetencionFuenteIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoRetencionFuenteIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoRetencionFuenteIvaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonGuardarCambiosTipoRetencionFuenteIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRetencionFuenteIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoRetencionFuenteIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRetencionFuenteIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoRetencionFuenteIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRetencionFuenteIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoRetencionFuenteIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRetencionFuenteIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoRetencionFuenteIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRetencionFuenteIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoRetencionFuenteIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRetencionFuenteIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoRetencionFuenteIva";
		inputMap = this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonGuardarCambiosTipoRetencionFuenteIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonGuardarCambiosTipoRetencionFuenteIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoRetencionFuenteIvaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoRetencionFuenteIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoRetencionFuenteIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoRetencionFuenteIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoRetencionFuenteIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoRetencionFuenteIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoRetencionFuenteIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoRetencionFuenteIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoRetencionFuenteIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoRetencionFuenteIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoRetencionFuenteIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoRetencionFuenteIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoRetencionFuenteIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoRetencionFuenteIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoRetencionFuenteIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoRetencionFuenteIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoRetencionFuenteIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoRetencionFuenteIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoRetencionFuenteIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoRetencionFuenteIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoRetencionFuenteIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoRetencionFuenteIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoRetencionFuenteIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoRetencionFuenteIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoRetencionFuenteIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoRetencionFuenteIva.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoRetencionFuenteIvaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoRetencionFuenteIva.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoRetencionFuenteIvaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoRetencionFuenteIva.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoRetencionFuenteIvaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoRetencionFuenteIva.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoRetencionFuenteIvaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonidTipoRetencionFuenteIvaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoRetencionFuenteIvaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonid_paisTipoRetencionFuenteIvaUpdate.addActionListener(new ButtonActionListener(this,"id_paisTipoRetencionFuenteIvaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonid_paisTipoRetencionFuenteIvaBusqueda.addActionListener(new ButtonActionListener(this,"id_paisTipoRetencionFuenteIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtoncodigoTipoRetencionFuenteIvaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoRetencionFuenteIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonnombreTipoRetencionFuenteIvaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoRetencionFuenteIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonporcentajeTipoRetencionFuenteIvaBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeTipoRetencionFuenteIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonmonto_minimoTipoRetencionFuenteIvaBusqueda.addActionListener(new ButtonActionListener(this,"monto_minimoTipoRetencionFuenteIvaBusqueda"));
		//jButtonid_cuenta_contableTipoRetencionFuenteIva.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contableTipoRetencionFuenteIvaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonid_cuenta_contableTipoRetencionFuenteIva.addActionListener(new ButtonActionListener(this,"id_cuenta_contableTipoRetencionFuenteIva"));
		//jButtonid_cuenta_contableTipoRetencionFuenteIvaArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContable("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonid_cuenta_contableTipoRetencionFuenteIvaArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contableTipoRetencionFuenteIvaArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonid_cuenta_contableTipoRetencionFuenteIvaUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableTipoRetencionFuenteIvaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonid_cuenta_contableTipoRetencionFuenteIvaBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableTipoRetencionFuenteIvaBusqueda"));
		//jButtonid_cuenta_contable_creditoTipoRetencionFuenteIva.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contable_creditoTipoRetencionFuenteIvaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonid_cuenta_contable_creditoTipoRetencionFuenteIva.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoTipoRetencionFuenteIva"));
		//jButtonid_cuenta_contable_creditoTipoRetencionFuenteIvaArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContableCredito("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonid_cuenta_contable_creditoTipoRetencionFuenteIvaArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoTipoRetencionFuenteIvaArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonid_cuenta_contable_creditoTipoRetencionFuenteIvaUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoTipoRetencionFuenteIvaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonid_cuenta_contable_creditoTipoRetencionFuenteIvaBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoTipoRetencionFuenteIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtones_retencion_ivaTipoRetencionFuenteIvaBusqueda.addActionListener(new ButtonActionListener(this,"es_retencion_ivaTipoRetencionFuenteIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtones_debitoTipoRetencionFuenteIvaBusqueda.addActionListener(new ButtonActionListener(this,"es_debitoTipoRetencionFuenteIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtones_con_iva_facturaTipoRetencionFuenteIvaBusqueda.addActionListener(new ButtonActionListener(this,"es_con_iva_facturaTipoRetencionFuenteIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtones_con_sub_total_facturaTipoRetencionFuenteIvaBusqueda.addActionListener(new ButtonActionListener(this,"es_con_sub_total_facturaTipoRetencionFuenteIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtones_con_secuencialTipoRetencionFuenteIvaBusqueda.addActionListener(new ButtonActionListener(this,"es_con_secuencialTipoRetencionFuenteIvaBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoTipoRetencionFuenteIva.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTipoRetencionFuenteIva"));

		this.jButtonBusquedaPorNombreTipoRetencionFuenteIva.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoRetencionFuenteIva"));

		this.jButtonFK_IdPaisTipoRetencionFuenteIva.addActionListener(new ButtonActionListener(this,"FK_IdPaisTipoRetencionFuenteIva"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoRetencionFuenteIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoRetencionFuenteIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoRetencionFuenteIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoRetencionFuenteIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoRetencionFuenteIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoRetencionFuenteIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoRetencionFuenteIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoRetencionFuenteIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoRetencionFuenteIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoRetencionFuenteIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoRetencionFuenteIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoRetencionFuenteIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoRetencionFuenteIvaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoRetencionFuenteIva.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoRetencionFuenteIva(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoRetencionFuenteIva tiporetencionfuenteivaAux:this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas()) {
					tiporetencionfuenteivaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoRetencionFuenteIva tiporetencionfuenteivaAux:tiporetencionfuenteivas) {
					tiporetencionfuenteivaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoRetencionFuenteIvaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoRetencionFuenteIva(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoRetencionFuenteIva tiporetencionfuenteivaAux:this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas()) {
						tiporetencionfuenteivaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoRetencionFuenteIva tiporetencionfuenteivaAux:tiporetencionfuenteivas) {
						tiporetencionfuenteivaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoRetencionFuenteIva tiporetencionfuenteivaAux:this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas()) {
					
						if(sTipoSeleccionar.equals(TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESRETENCIONIVA)) {
							existe=true;
							tiporetencionfuenteivaAux.setes_retencion_iva(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESDEBITO)) {
							existe=true;
							tiporetencionfuenteivaAux.setes_debito(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESCONIVAFACTURA)) {
							existe=true;
							tiporetencionfuenteivaAux.setes_con_iva_factura(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESCONSUBTOTALFACTURA)) {
							existe=true;
							tiporetencionfuenteivaAux.setes_con_sub_total_factura(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESCONSECUENCIAL)) {
							existe=true;
							tiporetencionfuenteivaAux.setes_con_secuencial(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoRetencionFuenteIva tiporetencionfuenteivaAux:tiporetencionfuenteivas) {
						
						if(sTipoSeleccionar.equals(TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESRETENCIONIVA)) {
							existe=true;
							tiporetencionfuenteivaAux.setes_retencion_iva(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESDEBITO)) {
							existe=true;
							tiporetencionfuenteivaAux.setes_debito(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESCONIVAFACTURA)) {
							existe=true;
							tiporetencionfuenteivaAux.setes_con_iva_factura(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESCONSUBTOTALFACTURA)) {
							existe=true;
							tiporetencionfuenteivaAux.setes_con_sub_total_factura(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESCONSECUENCIAL)) {
							existe=true;
							tiporetencionfuenteivaAux.setes_con_secuencial(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoRetencionFuenteIva(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoRetencionFuenteIva.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoRetencionFuenteIva.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoRetencionFuenteIva,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoRetencionFuenteIvaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoRetencionFuenteIva(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoRetencionFuenteIva.getSelectedRows();
			
			TipoRetencionFuenteIva tiporetencionfuenteivaLocal=new TipoRetencionFuenteIva();
			
			//this.seleccionarTodosTipoRetencionFuenteIva(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporetencionfuenteivaLocal =(TipoRetencionFuenteIva) this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas().toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tiporetencionfuenteivaLocal =(TipoRetencionFuenteIva) this.tiporetencionfuenteivas.toArray()[this.jTableDatosTipoRetencionFuenteIva.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tiporetencionfuenteivaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoRetencionFuenteIva tiporetencionfuenteivaAux:this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas()) {
						tiporetencionfuenteivaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoRetencionFuenteIva tiporetencionfuenteivaAux:tiporetencionfuenteivas) {
						tiporetencionfuenteivaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoRetencionFuenteIva(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoRetencionFuenteIva.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoRetencionFuenteIva.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoRetencionFuenteIva,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoRetencionFuenteIvaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoRetencionFuenteIvaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoRetencionFuenteIvaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoRetencionFuenteIva(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoRetencionFuenteIva.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoRetencionFuenteIva tiporetencionfuenteivaAux:this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas()) {
				
						if(sTipoSeleccionar.equals(TipoRetencionFuenteIvaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tiporetencionfuenteivaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoRetencionFuenteIvaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tiporetencionfuenteivaAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoRetencionFuenteIvaConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							tiporetencionfuenteivaAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TipoRetencionFuenteIvaConstantesFunciones.LABEL_MONTOMINIMO)) {
							existe=true;
							tiporetencionfuenteivaAux.setmonto_minimo(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoRetencionFuenteIva tiporetencionfuenteivaAux:tiporetencionfuenteivas) {
					
						if(sTipoSeleccionar.equals(TipoRetencionFuenteIvaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tiporetencionfuenteivaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoRetencionFuenteIvaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tiporetencionfuenteivaAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoRetencionFuenteIvaConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							tiporetencionfuenteivaAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TipoRetencionFuenteIvaConstantesFunciones.LABEL_MONTOMINIMO)) {
							existe=true;
							tiporetencionfuenteivaAux.setmonto_minimo(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoRetencionFuenteIva(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoRetencionFuenteIvaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoRetencionFuenteIva(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoRetencionFuenteIva=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoRetencionFuenteIva.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxTiposAccionesFormularioTipoRetencionFuenteIva.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoRetencionFuenteIva) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoRetencionFuenteIva(conSplash);
				
					this.generarReporteTipoRetencionFuenteIvasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoRetencionFuenteIva.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxTiposAccionesFormularioTipoRetencionFuenteIva.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoRetencionFuenteIvasSeleccionados();
				//this.jComboBoxTiposAccionesTipoRetencionFuenteIva.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoRetencionFuenteIvasSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoRetencionFuenteIva.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoRetencionFuenteIvasSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoRetencionFuenteIva.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoRetencionFuenteIva();
				
				this.exportarTipoRetencionFuenteIvasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoRetencionFuenteIva.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxTiposAccionesFormularioTipoRetencionFuenteIva.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoRetencionFuenteIvas();
				//this.importarTipoRetencionFuenteIvas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoRetencionFuenteIva.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxTiposAccionesFormularioTipoRetencionFuenteIva.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoRetencionFuenteIva();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoRetencionFuenteIvasSeleccionados();
				//this.jComboBoxTiposAccionesTipoRetencionFuenteIva.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Retencion Fuente Iva", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoRetencionFuenteIva();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoRetencionFuenteIva)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoRetencionFuenteIva(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Retencion Fuente Iva",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoRetencionFuenteIva.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxTiposAccionesFormularioTipoRetencionFuenteIva.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoRetencionFuenteIvaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoRetencionFuenteIva) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoRetencionFuenteIva(conSplash);
					
						//this.actualizarParametrosGeneralTipoRetencionFuenteIva();
						
						this.generarReporteProcesoAccionTipoRetencionFuenteIvasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoRetencionFuenteIva.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxTiposAccionesFormularioTipoRetencionFuenteIva.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Retencion Fuente IvaS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Retencion Fuente Iva", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoRetencionFuenteIva();
				
						this.actualizarParametrosGeneralTipoRetencionFuenteIva();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tiporetencionfuenteivaReturnGeneral=tiporetencionfuenteivaLogic.procesarAccionTipoRetencionFuenteIvasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas(),this.tiporetencionfuenteivaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoRetencionFuenteIvaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoRetencionFuenteIva.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxTiposAccionesFormularioTipoRetencionFuenteIva.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoRetencionFuenteIva();
					
					TipoRetencionFuenteIvaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoRetencionFuenteIvaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoRetencionFuenteIva.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxTiposAccionesFormularioTipoRetencionFuenteIva.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoRetencionFuenteIva(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoRetencionFuenteIvaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoRetencionFuenteIva();
			
			if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoRetencionFuenteIva> tiporetencionfuenteivasSeleccionados=new ArrayList<TipoRetencionFuenteIva>();		
			TipoRetencionFuenteIva tiporetencionfuenteiva=new TipoRetencionFuenteIva();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoRetencionFuenteIva(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoRetencionFuenteIva.getSelectedItem();
			
			
			
			
			tiporetencionfuenteivasSeleccionados=this.getTipoRetencionFuenteIvasSeleccionados(true);
			//this.sTipoAccion;
			
			if(tiporetencionfuenteivasSeleccionados.size()==1) {
				for(TipoRetencionFuenteIva tiporetencionfuenteivaAux:tiporetencionfuenteivasSeleccionados) {
					tiporetencionfuenteiva=tiporetencionfuenteivaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoRetencionFuenteIva();
			
      		//this.finishProcessTipoRetencionFuenteIva(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoRetencionFuenteIvaReturnGeneral() throws Exception {
		if(this.tiporetencionfuenteivaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tiporetencionfuenteivaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tiporetencionfuenteivaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tiporetencionfuenteivaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tiporetencionfuenteivaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tiporetencionfuenteivaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoRetencionFuenteIva(false);
		}
		
		if(this.tiporetencionfuenteivaReturnGeneral.getConRetornoLista() || this.tiporetencionfuenteivaReturnGeneral.getConRetornoObjeto()) {
			if(this.tiporetencionfuenteivaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tiporetencionfuenteivaLogic.setTipoRetencionFuenteIvas(this.tiporetencionfuenteivaReturnGeneral.getTipoRetencionFuenteIvas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tiporetencionfuenteivaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tiporetencionfuenteivaLogic.setTipoRetencionFuenteIva(this.tiporetencionfuenteivaReturnGeneral.getTipoRetencionFuenteIva());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoRetencionFuenteIva(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoRetencionFuenteIva() throws Exception {
		
		
	}
	
	public ArrayList<TipoRetencionFuenteIva> getTipoRetencionFuenteIvasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoRetencionFuenteIva> tiporetencionfuenteivasSeleccionados=new ArrayList<TipoRetencionFuenteIva>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoRetencionFuenteIva) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoRetencionFuenteIva tiporetencionfuenteivaAux:tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas()) {
					if(tiporetencionfuenteivaAux.getIsSelected()) {
						tiporetencionfuenteivasSeleccionados.add(tiporetencionfuenteivaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoRetencionFuenteIva tiporetencionfuenteivaAux:this.tiporetencionfuenteivas) {
					if(tiporetencionfuenteivaAux.getIsSelected()) {
						tiporetencionfuenteivasSeleccionados.add(tiporetencionfuenteivaAux);				
					}
				}
			}
			
			if(tiporetencionfuenteivasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tiporetencionfuenteivasSeleccionados.addAll(this.tiporetencionfuenteivaLogic.getTipoRetencionFuenteIvas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tiporetencionfuenteivasSeleccionados.addAll(this.tiporetencionfuenteivas);				
					}
				}
			}
		} else {
			tiporetencionfuenteivasSeleccionados.add(this.tiporetencionfuenteiva);
		}
		
		return tiporetencionfuenteivasSeleccionados;
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
	
	public void generarReporteTipoRetencionFuenteIvasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoRetencionFuenteIvasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoRetencionFuenteIvasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoRetencionFuenteIvasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoRetencionFuenteIvasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Retencion Fuente Iva",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoRetencionFuenteIvasSeleccionados() throws Exception {
		ArrayList<TipoRetencionFuenteIva> tiporetencionfuenteivasSeleccionados=new ArrayList<TipoRetencionFuenteIva>();		
		
		tiporetencionfuenteivasSeleccionados=this.getTipoRetencionFuenteIvasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoRetencionFuenteIvas("Todos",tiporetencionfuenteivasSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoRetencionFuenteIvasSeleccionados() throws Exception {
		ArrayList<TipoRetencionFuenteIva> tiporetencionfuenteivasSeleccionados=new ArrayList<TipoRetencionFuenteIva>();		
		
		tiporetencionfuenteivasSeleccionados=this.getTipoRetencionFuenteIvasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoRetencionFuenteIvas("Todos",tiporetencionfuenteivasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoRetencionFuenteIvasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoRetencionFuenteIva> tiporetencionfuenteivasSeleccionados=new ArrayList<TipoRetencionFuenteIva>();
		
		tiporetencionfuenteivasSeleccionados=this.getTipoRetencionFuenteIvasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoRetencionFuenteIvas("Todos",tiporetencionfuenteivasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoRetencionFuenteIvasSeleccionados() throws Exception {
		ArrayList<TipoRetencionFuenteIva> tiporetencionfuenteivasSeleccionados=new ArrayList<TipoRetencionFuenteIva>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoRetencionFuenteIva();
		
		
		tiporetencionfuenteivasSeleccionados=this.getTipoRetencionFuenteIvasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoRetencionFuenteIva();
		
		
		//this.generarReporteTipoRetencionFuenteIvas("Todos",tiporetencionfuenteivasSeleccionados ,tiporetencionfuenteivaImplementable,tiporetencionfuenteivaImplementableHome);
	}
	
	public void mostrarImportacionTipoRetencionFuenteIvas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoRetencionFuenteIva();
		
		this.abrirFrameImportacionTipoRetencionFuenteIva();		
		
			
		//this.generarReporteTipoRetencionFuenteIvas("Todos",tiporetencionfuenteivasSeleccionados ,tiporetencionfuenteivaImplementable,tiporetencionfuenteivaImplementableHome);
	}
	
	public void importarTipoRetencionFuenteIvas() throws Exception {		
	
	}
	
	public void exportarTipoRetencionFuenteIvasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoRetencionFuenteIvasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoRetencionFuenteIvasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoRetencionFuenteIvasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Retencion Fuente Iva",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoRetencionFuenteIvasSeleccionados() throws Exception {
		ArrayList<TipoRetencionFuenteIva> tiporetencionfuenteivasSeleccionados=new ArrayList<TipoRetencionFuenteIva>();		
		
		tiporetencionfuenteivasSeleccionados=this.getTipoRetencionFuenteIvasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporetencionfuenteiva."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoRetencionFuenteIva(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoRetencionFuenteIva tiporetencionfuenteivaAux:tiporetencionfuenteivasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoRetencionFuenteIva(tiporetencionfuenteivaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tiporetencionfuenteivaAux.setsDetalleGeneralEntityReporte(tiporetencionfuenteivaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Retencion Fuente Iva",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoRetencionFuenteIva(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoRetencionFuenteIvaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRetencionFuenteIvaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRetencionFuenteIvaConstantesFunciones.LABEL_IDPAIS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRetencionFuenteIvaConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRetencionFuenteIvaConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRetencionFuenteIvaConstantesFunciones.LABEL_PORCENTAJE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRetencionFuenteIvaConstantesFunciones.LABEL_MONTOMINIMO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRetencionFuenteIvaConstantesFunciones.LABEL_IDCUENTACONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRetencionFuenteIvaConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESRETENCIONIVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESDEBITO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESCONIVAFACTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESCONSUBTOTALFACTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESCONSECUENCIAL;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoRetencionFuenteIva(TipoRetencionFuenteIva tiporetencionfuenteiva,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tiporetencionfuenteiva.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporetencionfuenteiva.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporetencionfuenteiva.getpais_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporetencionfuenteiva.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporetencionfuenteiva.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporetencionfuenteiva.getporcentaje().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporetencionfuenteiva.getmonto_minimo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporetencionfuenteiva.getcuentacontable_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporetencionfuenteiva.getcuentacontablecredito_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporetencionfuenteiva.getes_retencion_iva().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporetencionfuenteiva.getes_debito().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporetencionfuenteiva.getes_con_iva_factura().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporetencionfuenteiva.getes_con_sub_total_factura().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporetencionfuenteiva.getes_con_secuencial().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoRetencionFuenteIvasSeleccionados() throws Exception {
		ArrayList<TipoRetencionFuenteIva> tiporetencionfuenteivasSeleccionados=new ArrayList<TipoRetencionFuenteIva>();		
		
		tiporetencionfuenteivasSeleccionados=this.getTipoRetencionFuenteIvasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporetencionfuenteiva.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoRetencionFuenteIvas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoRetencionFuenteIva(row);				
				iRow++;
			}				
			
			for(TipoRetencionFuenteIva tiporetencionfuenteivaAux:tiporetencionfuenteivasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoRetencionFuenteIva(tiporetencionfuenteivaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Retencion Fuente Iva",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoRetencionFuenteIvasSeleccionados() throws Exception {
		ArrayList<TipoRetencionFuenteIva> tiporetencionfuenteivasSeleccionados=new ArrayList<TipoRetencionFuenteIva>();		
		
		tiporetencionfuenteivasSeleccionados=this.getTipoRetencionFuenteIvasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporetencionfuenteiva.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tiporetencionfuenteivas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tiporetencionfuenteiva");
			//elementRoot.appendChild(element);
		
			for(TipoRetencionFuenteIva tiporetencionfuenteivaAux:tiporetencionfuenteivasSeleccionados) {
				element = document.createElement("tiporetencionfuenteiva");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoRetencionFuenteIva(tiporetencionfuenteivaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Retencion Fuente Iva",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoRetencionFuenteIva(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRetencionFuenteIvaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRetencionFuenteIvaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoRetencionFuenteIvaConstantesFunciones.LABEL_IDPAIS);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRetencionFuenteIvaConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRetencionFuenteIvaConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRetencionFuenteIvaConstantesFunciones.LABEL_PORCENTAJE);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRetencionFuenteIvaConstantesFunciones.LABEL_MONTOMINIMO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRetencionFuenteIvaConstantesFunciones.LABEL_IDCUENTACONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRetencionFuenteIvaConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESRETENCIONIVA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESDEBITO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESCONIVAFACTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESCONSUBTOTALFACTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESCONSECUENCIAL);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoRetencionFuenteIva(TipoRetencionFuenteIva tiporetencionfuenteiva,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tiporetencionfuenteiva.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tiporetencionfuenteiva.getpais_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tiporetencionfuenteiva.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tiporetencionfuenteiva.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(tiporetencionfuenteiva.getporcentaje());
		cell = row.createCell(iColumn++);cell.setCellValue(tiporetencionfuenteiva.getmonto_minimo());
		cell = row.createCell(iColumn++);cell.setCellValue(tiporetencionfuenteiva.getcuentacontable_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tiporetencionfuenteiva.getcuentacontablecredito_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tiporetencionfuenteiva.getes_retencion_iva());
		cell = row.createCell(iColumn++);cell.setCellValue(tiporetencionfuenteiva.getes_debito());
		cell = row.createCell(iColumn++);cell.setCellValue(tiporetencionfuenteiva.getes_con_iva_factura());
		cell = row.createCell(iColumn++);cell.setCellValue(tiporetencionfuenteiva.getes_con_sub_total_factura());
		cell = row.createCell(iColumn++);cell.setCellValue(tiporetencionfuenteiva.getes_con_secuencial());				
	}
	
	public void setFilaDatosExportarXmlTipoRetencionFuenteIva(TipoRetencionFuenteIva tiporetencionfuenteiva,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoRetencionFuenteIvaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tiporetencionfuenteiva.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoRetencionFuenteIvaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tiporetencionfuenteiva.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementpais_descripcion = document.createElement(TipoRetencionFuenteIvaConstantesFunciones.IDPAIS);
		elementpais_descripcion.appendChild(document.createTextNode(tiporetencionfuenteiva.getpais_descripcion()));
		element.appendChild(elementpais_descripcion);

		Element elementcodigo = document.createElement(TipoRetencionFuenteIvaConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tiporetencionfuenteiva.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoRetencionFuenteIvaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tiporetencionfuenteiva.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementporcentaje = document.createElement(TipoRetencionFuenteIvaConstantesFunciones.PORCENTAJE);
		elementporcentaje.appendChild(document.createTextNode(tiporetencionfuenteiva.getporcentaje().toString().trim()));
		element.appendChild(elementporcentaje);

		Element elementmonto_minimo = document.createElement(TipoRetencionFuenteIvaConstantesFunciones.MONTOMINIMO);
		elementmonto_minimo.appendChild(document.createTextNode(tiporetencionfuenteiva.getmonto_minimo().toString().trim()));
		element.appendChild(elementmonto_minimo);

		Element elementcuentacontable_descripcion = document.createElement(TipoRetencionFuenteIvaConstantesFunciones.IDCUENTACONTABLE);
		elementcuentacontable_descripcion.appendChild(document.createTextNode(tiporetencionfuenteiva.getcuentacontable_descripcion()));
		element.appendChild(elementcuentacontable_descripcion);

		Element elementcuentacontablecredito_descripcion = document.createElement(TipoRetencionFuenteIvaConstantesFunciones.IDCUENTACONTABLECREDITO);
		elementcuentacontablecredito_descripcion.appendChild(document.createTextNode(tiporetencionfuenteiva.getcuentacontablecredito_descripcion()));
		element.appendChild(elementcuentacontablecredito_descripcion);

		Element elementes_retencion_iva = document.createElement(TipoRetencionFuenteIvaConstantesFunciones.ESRETENCIONIVA);
		elementes_retencion_iva.appendChild(document.createTextNode(tiporetencionfuenteiva.getes_retencion_iva().toString().trim()));
		element.appendChild(elementes_retencion_iva);

		Element elementes_debito = document.createElement(TipoRetencionFuenteIvaConstantesFunciones.ESDEBITO);
		elementes_debito.appendChild(document.createTextNode(tiporetencionfuenteiva.getes_debito().toString().trim()));
		element.appendChild(elementes_debito);

		Element elementes_con_iva_factura = document.createElement(TipoRetencionFuenteIvaConstantesFunciones.ESCONIVAFACTURA);
		elementes_con_iva_factura.appendChild(document.createTextNode(tiporetencionfuenteiva.getes_con_iva_factura().toString().trim()));
		element.appendChild(elementes_con_iva_factura);

		Element elementes_con_sub_total_factura = document.createElement(TipoRetencionFuenteIvaConstantesFunciones.ESCONSUBTOTALFACTURA);
		elementes_con_sub_total_factura.appendChild(document.createTextNode(tiporetencionfuenteiva.getes_con_sub_total_factura().toString().trim()));
		element.appendChild(elementes_con_sub_total_factura);

		Element elementes_con_secuencial = document.createElement(TipoRetencionFuenteIvaConstantesFunciones.ESCONSECUENCIAL);
		elementes_con_secuencial.appendChild(document.createTextNode(tiporetencionfuenteiva.getes_con_secuencial().toString().trim()));
		element.appendChild(elementes_con_secuencial);
	}
	
	public void generarReporteGroupGenericoTipoRetencionFuenteIvasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoRetencionFuenteIva> tiporetencionfuenteivasSeleccionados=new ArrayList<TipoRetencionFuenteIva>();
		
		tiporetencionfuenteivasSeleccionados=this.getTipoRetencionFuenteIvasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoRetencionFuenteIva(tiporetencionfuenteivasSeleccionados);
		
		this.generarReporteTipoRetencionFuenteIvas("Todos",tiporetencionfuenteivasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoRetencionFuenteIva(ArrayList<TipoRetencionFuenteIva> tiporetencionfuenteivasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoRetencionFuenteIva tiporetencionfuenteivaAux:tiporetencionfuenteivasSeleccionados) {
				tiporetencionfuenteivaAux.setsDetalleGeneralEntityReporte(tiporetencionfuenteivaAux.toString());
			
				if(sTipoSeleccionar.equals(TipoRetencionFuenteIvaConstantesFunciones.LABEL_IDPAIS)) {
					existe=true;
					tiporetencionfuenteivaAux.setsDescripcionGeneralEntityReporte1(tiporetencionfuenteivaAux.getpais_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoRetencionFuenteIvaConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tiporetencionfuenteivaAux.setsDescripcionGeneralEntityReporte1(tiporetencionfuenteivaAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoRetencionFuenteIvaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tiporetencionfuenteivaAux.setsDescripcionGeneralEntityReporte1(tiporetencionfuenteivaAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(TipoRetencionFuenteIvaConstantesFunciones.LABEL_IDCUENTACONTABLE)) {
					existe=true;
					tiporetencionfuenteivaAux.setsDescripcionGeneralEntityReporte1(tiporetencionfuenteivaAux.getcuentacontable_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoRetencionFuenteIvaConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO)) {
					existe=true;
					tiporetencionfuenteivaAux.setsDescripcionGeneralEntityReporte1(tiporetencionfuenteivaAux.getcuentacontablecredito_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESRETENCIONIVA)) {
					existe=true;
					tiporetencionfuenteivaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(tiporetencionfuenteivaAux.getes_retencion_iva()));
				}
				 else if(sTipoSeleccionar.equals(TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESDEBITO)) {
					existe=true;
					tiporetencionfuenteivaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(tiporetencionfuenteivaAux.getes_debito()));
				}
				 else if(sTipoSeleccionar.equals(TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESCONIVAFACTURA)) {
					existe=true;
					tiporetencionfuenteivaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(tiporetencionfuenteivaAux.getes_con_iva_factura()));
				}
				 else if(sTipoSeleccionar.equals(TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESCONSUBTOTALFACTURA)) {
					existe=true;
					tiporetencionfuenteivaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(tiporetencionfuenteivaAux.getes_con_sub_total_factura()));
				}
				 else if(sTipoSeleccionar.equals(TipoRetencionFuenteIvaConstantesFunciones.LABEL_ESCONSECUENCIAL)) {
					existe=true;
					tiporetencionfuenteivaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(tiporetencionfuenteivaAux.getes_con_secuencial()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionFuenteIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoRetencionFuenteIva(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoRetencionFuenteIva=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoRetencionFuenteIva=true;
				this.isVisibilidadCeldaGuardarCambiosTipoRetencionFuenteIva=true;
			}
			
			this.isVisibilidadCeldaModificarTipoRetencionFuenteIva=false;
			this.isVisibilidadCeldaActualizarTipoRetencionFuenteIva=false;
			this.isVisibilidadCeldaEliminarTipoRetencionFuenteIva=false;
			this.isVisibilidadCeldaCancelarTipoRetencionFuenteIva=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRetencionFuenteIva=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoRetencionFuenteIva=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoRetencionFuenteIva=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRetencionFuenteIva=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRetencionFuenteIva=false;
			this.isVisibilidadCeldaModificarTipoRetencionFuenteIva=false;
			this.isVisibilidadCeldaActualizarTipoRetencionFuenteIva=true;
			this.isVisibilidadCeldaEliminarTipoRetencionFuenteIva=false;
			this.isVisibilidadCeldaCancelarTipoRetencionFuenteIva=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRetencionFuenteIva=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoRetencionFuenteIva=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoRetencionFuenteIva=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRetencionFuenteIva=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRetencionFuenteIva=false;
			this.isVisibilidadCeldaModificarTipoRetencionFuenteIva=false;
			this.isVisibilidadCeldaActualizarTipoRetencionFuenteIva=true;
			this.isVisibilidadCeldaEliminarTipoRetencionFuenteIva=true;
			this.isVisibilidadCeldaCancelarTipoRetencionFuenteIva=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRetencionFuenteIva=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoRetencionFuenteIva=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoRetencionFuenteIva=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRetencionFuenteIva=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRetencionFuenteIva=false;
			this.isVisibilidadCeldaModificarTipoRetencionFuenteIva=false;
			this.isVisibilidadCeldaActualizarTipoRetencionFuenteIva=true;
			this.isVisibilidadCeldaEliminarTipoRetencionFuenteIva=false;
			this.isVisibilidadCeldaCancelarTipoRetencionFuenteIva=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRetencionFuenteIva=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoRetencionFuenteIva=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoRetencionFuenteIva=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoRetencionFuenteIva=true;
			this.isVisibilidadCeldaGuardarCambiosTipoRetencionFuenteIva=true;
			this.isVisibilidadCeldaModificarTipoRetencionFuenteIva=false;
			this.isVisibilidadCeldaActualizarTipoRetencionFuenteIva=false;
			this.isVisibilidadCeldaEliminarTipoRetencionFuenteIva=false;
			this.isVisibilidadCeldaCancelarTipoRetencionFuenteIva=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRetencionFuenteIva=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoRetencionFuenteIva=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoRetencionFuenteIva=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRetencionFuenteIva=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRetencionFuenteIva=false;
			this.isVisibilidadCeldaActualizarTipoRetencionFuenteIva=false;
			this.isVisibilidadCeldaEliminarTipoRetencionFuenteIva=false;
			this.isVisibilidadCeldaCancelarTipoRetencionFuenteIva=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRetencionFuenteIva=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoRetencionFuenteIva=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoRetencionFuenteIva=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRetencionFuenteIva=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRetencionFuenteIva=false;
			this.isVisibilidadCeldaModificarTipoRetencionFuenteIva=true;
			this.isVisibilidadCeldaActualizarTipoRetencionFuenteIva=false;
			this.isVisibilidadCeldaEliminarTipoRetencionFuenteIva=false;
			this.isVisibilidadCeldaCancelarTipoRetencionFuenteIva=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRetencionFuenteIva=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoRetencionFuenteIva=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoRetencionFuenteIvaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoRetencionFuenteIva=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoRetencionFuenteIva=true;
			this.isVisibilidadCeldaGuardarCambiosTipoRetencionFuenteIva=true;
		} else {
			this.actualizarEstadoPanelsTipoRetencionFuenteIva(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoRetencionFuenteIva=false;
			//this.isVisibilidadCeldaVerFormTipoRetencionFuenteIva=false;
			this.isVisibilidadCeldaDuplicarTipoRetencionFuenteIva=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tiporetencionfuenteivaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoRetencionFuenteIva=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoRetencionFuenteIva=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRetencionFuenteIva=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado()) {
			if(!tiporetencionfuenteivaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoRetencionFuenteIva=false;												
			}
			
			this.jButtonCerrarTipoRetencionFuenteIva.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoRetencionFuenteIva=false;
		}
		
		if(!this.permiteMantenimiento(this.tiporetencionfuenteiva)) {
			this.isVisibilidadCeldaActualizarTipoRetencionFuenteIva=false;
			this.isVisibilidadCeldaEliminarTipoRetencionFuenteIva=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoRetencionFuenteIva() {
	}
	
	public void actualizarEstadoPanelsTipoRetencionFuenteIva(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoRetencionFuenteIva!=null) {
				this.jScrollPanelDatosEdicionTipoRetencionFuenteIva.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRetencionFuenteIva!=null) {
				this.jTabbedPaneBusquedasTipoRetencionFuenteIva.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoRetencionFuenteIva!=null) {
				this.jScrollPanelDatosTipoRetencionFuenteIva.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoRetencionFuenteIva!=null) {
				this.jPanelPaginacionTipoRetencionFuenteIva.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoRetencionFuenteIva!=null) {
				this.jPanelParametrosReportesTipoRetencionFuenteIva.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoRetencionFuenteIva!=null) {
				this.jScrollPanelDatosEdicionTipoRetencionFuenteIva.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRetencionFuenteIva!=null) {
				this.jTabbedPaneBusquedasTipoRetencionFuenteIva.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoRetencionFuenteIva!=null) {
				this.jScrollPanelDatosTipoRetencionFuenteIva.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoRetencionFuenteIva!=null) {
				this.jPanelPaginacionTipoRetencionFuenteIva.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoRetencionFuenteIva!=null) {
				this.jPanelParametrosReportesTipoRetencionFuenteIva.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoRetencionFuenteIva!=null) {
				this.jScrollPanelDatosEdicionTipoRetencionFuenteIva.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRetencionFuenteIva!=null) {
				this.jTabbedPaneBusquedasTipoRetencionFuenteIva.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoRetencionFuenteIva!=null) {
				this.jScrollPanelDatosTipoRetencionFuenteIva.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoRetencionFuenteIva!=null) {
				this.jPanelPaginacionTipoRetencionFuenteIva.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoRetencionFuenteIva!=null) {
				this.jPanelParametrosReportesTipoRetencionFuenteIva.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoRetencionFuenteIva!=null) {
				this.jScrollPanelDatosEdicionTipoRetencionFuenteIva.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRetencionFuenteIva!=null) {
				this.jTabbedPaneBusquedasTipoRetencionFuenteIva.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoRetencionFuenteIva!=null) {
				this.jScrollPanelDatosTipoRetencionFuenteIva.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoRetencionFuenteIva!=null) {
				this.jPanelPaginacionTipoRetencionFuenteIva.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoRetencionFuenteIva!=null) {
				this.jPanelParametrosReportesTipoRetencionFuenteIva.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoRetencionFuenteIva!=null) {
				this.jScrollPanelDatosEdicionTipoRetencionFuenteIva.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRetencionFuenteIva!=null) {
				this.jTabbedPaneBusquedasTipoRetencionFuenteIva.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoRetencionFuenteIva!=null) {
				this.jScrollPanelDatosTipoRetencionFuenteIva.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoRetencionFuenteIva!=null) {
				this.jPanelPaginacionTipoRetencionFuenteIva.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoRetencionFuenteIva!=null) {
				this.jPanelParametrosReportesTipoRetencionFuenteIva.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoRetencionFuenteIva!=null) {
				this.jScrollPanelDatosEdicionTipoRetencionFuenteIva.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRetencionFuenteIva!=null) {
				this.jTabbedPaneBusquedasTipoRetencionFuenteIva.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoRetencionFuenteIva!=null) {
				this.jScrollPanelDatosTipoRetencionFuenteIva.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoRetencionFuenteIva!=null) {
				this.jPanelPaginacionTipoRetencionFuenteIva.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoRetencionFuenteIva!=null) {
				this.jPanelParametrosReportesTipoRetencionFuenteIva.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoRetencionFuenteIva!=null) {
				this.jScrollPanelDatosEdicionTipoRetencionFuenteIva.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRetencionFuenteIva!=null) {
				this.jTabbedPaneBusquedasTipoRetencionFuenteIva.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoRetencionFuenteIva!=null) {
				this.jScrollPanelDatosTipoRetencionFuenteIva.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoRetencionFuenteIva!=null) {
				this.jPanelPaginacionTipoRetencionFuenteIva.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoRetencionFuenteIva!=null) {
				this.jPanelParametrosReportesTipoRetencionFuenteIva.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoRetencionFuenteIva!=null) {
					this.jTabbedPaneBusquedasTipoRetencionFuenteIva.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoRetencionFuenteIva!=null) {
				this.jPanelParametrosReportesTipoRetencionFuenteIva.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tiporetencionfuenteivaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRetencionFuenteIva!=null) {
				this.jTabbedPaneBusquedasTipoRetencionFuenteIva.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoRetencionFuenteIva!=null) {
				this.jPanelParametrosReportesTipoRetencionFuenteIva.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaPais(Boolean isParaPais){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPaisNegation=!isParaPais;

			this.isVisibilidadBusquedaPorCodigo=isParaPaisNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasTipoRetencionFuenteIva.remove(jPanelBusquedaPorCodigoTipoRetencionFuenteIva);}

			this.isVisibilidadBusquedaPorNombre=isParaPaisNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTipoRetencionFuenteIva.remove(jPanelBusquedaPorNombreTipoRetencionFuenteIva);}

			this.isVisibilidadFK_IdPais=isParaPais;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasTipoRetencionFuenteIva.remove(jPanelFK_IdPaisTipoRetencionFuenteIva);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaContable(Boolean isParaCuentaContable){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableNegation=!isParaCuentaContable;

			this.isVisibilidadBusquedaPorCodigo=isParaCuentaContableNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasTipoRetencionFuenteIva.remove(jPanelBusquedaPorCodigoTipoRetencionFuenteIva);}

			this.isVisibilidadBusquedaPorNombre=isParaCuentaContableNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTipoRetencionFuenteIva.remove(jPanelBusquedaPorNombreTipoRetencionFuenteIva);}

			this.isVisibilidadFK_IdPais=isParaCuentaContableNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasTipoRetencionFuenteIva.remove(jPanelFK_IdPaisTipoRetencionFuenteIva);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaContableCredito(Boolean isParaCuentaContableCredito){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableCreditoNegation=!isParaCuentaContableCredito;

			this.isVisibilidadBusquedaPorCodigo=isParaCuentaContableCreditoNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasTipoRetencionFuenteIva.remove(jPanelBusquedaPorCodigoTipoRetencionFuenteIva);}

			this.isVisibilidadBusquedaPorNombre=isParaCuentaContableCreditoNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTipoRetencionFuenteIva.remove(jPanelBusquedaPorNombreTipoRetencionFuenteIva);}

			this.isVisibilidadFK_IdPais=isParaCuentaContableCreditoNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasTipoRetencionFuenteIva.remove(jPanelFK_IdPaisTipoRetencionFuenteIva);}
		}
		
	}
	
	
	
	

	public String registrarSesionTipoRetencionFuenteIvaParaBusquedaCuentaContables() throws Exception {
		Boolean isPaginaPopupCuentaContable=false;

		try {

			if(tiporetencionfuenteivaSessionBean==null) {
				tiporetencionfuenteivaSessionBean=new TipoRetencionFuenteIvaSessionBean();
			}

			if(cuentacontableSessionBean==null) {
				cuentacontableSessionBean=new CuentaContableSessionBean();
			}

			cuentacontableSessionBean.setsPathNavegacionActual(tiporetencionfuenteivaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CuentaContableConstantesFunciones.SCLASSWEBTITULO);
			cuentacontableSessionBean.setisPermiteRecargarInformacion(false);
			cuentacontableSessionBean.setisPaginaPopup(true);
			isPaginaPopupCuentaContable=cuentacontableSessionBean.getisPaginaPopup();
			cuentacontableSessionBean.setisPaginaPopup(false);
			cuentacontableSessionBean.setEstaModoBusqueda(true);
			cuentacontableSessionBean.setsFuncionBusquedaRapida("window.opener.tiporetencionfuenteivaFuncionGeneral.setCombosCodigoDesdeBusquedaid_cuenta_contable(TO_REPLACE);");
			cuentacontableSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCuentaContable(true);
			cuentacontableSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContable(TipoRetencionFuenteIvaConstantesFunciones.SNOMBREOPCION);
			//cuentacontableSessionBean.setisBusquedaDesdeForeignKeySesionTipoRetencionFuenteIva(true);
			//cuentacontableSessionBean.setlidTipoRetencionFuenteIvaActual(this.idTipoRetencionFuenteIvaActual);

			tiporetencionfuenteivaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoRetencionFuenteIva(true);
			tiporetencionfuenteivaSessionBean.setlIdTipoRetencionFuenteIvaActualForeignKey(this.idTipoRetencionFuenteIvaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}

	public String registrarSesionTipoRetencionFuenteIvaParaBusquedaCuentaContableCreditos() throws Exception {
		Boolean isPaginaPopupCuentaContable=false;

		try {

			if(tiporetencionfuenteivaSessionBean==null) {
				tiporetencionfuenteivaSessionBean=new TipoRetencionFuenteIvaSessionBean();
			}

			if(cuentacontablecreditoSessionBean==null) {
				cuentacontablecreditoSessionBean=new CuentaContableSessionBean();
			}

			cuentacontablecreditoSessionBean.setsPathNavegacionActual(tiporetencionfuenteivaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CuentaContableConstantesFunciones.SCLASSWEBTITULO);
			cuentacontablecreditoSessionBean.setisPermiteRecargarInformacion(false);
			cuentacontablecreditoSessionBean.setisPaginaPopup(true);
			isPaginaPopupCuentaContable=cuentacontablecreditoSessionBean.getisPaginaPopup();
			cuentacontablecreditoSessionBean.setisPaginaPopup(false);
			cuentacontablecreditoSessionBean.setEstaModoBusqueda(true);
			cuentacontablecreditoSessionBean.setsFuncionBusquedaRapida("window.opener.tiporetencionfuenteivaFuncionGeneral.setCombosCodigoDesdeBusquedaid_cuenta_contable_credito(TO_REPLACE);");
			cuentacontablecreditoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCuentaContable(true);
			cuentacontablecreditoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContable(TipoRetencionFuenteIvaConstantesFunciones.SNOMBREOPCION);
			//cuentacontableSessionBean.setisBusquedaDesdeForeignKeySesionTipoRetencionFuenteIva(true);
			//cuentacontableSessionBean.setlidTipoRetencionFuenteIvaActual(this.idTipoRetencionFuenteIvaActual);

			tiporetencionfuenteivaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoRetencionFuenteIva(true);
			tiporetencionfuenteivaSessionBean.setlIdTipoRetencionFuenteIvaActualForeignKey(this.idTipoRetencionFuenteIvaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoRetencionFuenteIvaSessionBean tiporetencionfuenteivaSessionBean=new TipoRetencionFuenteIvaSessionBean();
		
		if(this.tiporetencionfuenteivaSessionBean==null) {
			this.tiporetencionfuenteivaSessionBean=new TipoRetencionFuenteIvaSessionBean();
		}
		
		this.tiporetencionfuenteivaSessionBean.setsUltimaBusquedaTipoRetencionFuenteIva(this.getsAccionBusqueda());
		this.tiporetencionfuenteivaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tiporetencionfuenteivaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			tiporetencionfuenteivaSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			tiporetencionfuenteivaSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
			tiporetencionfuenteivaSessionBean.setid_pais(this.getid_paisFK_IdPais());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoRetencionFuenteIvaSessionBean tiporetencionfuenteivaSessionBean=new TipoRetencionFuenteIvaSessionBean();
		
		if(this.tiporetencionfuenteivaSessionBean==null) {
			this.tiporetencionfuenteivaSessionBean=new TipoRetencionFuenteIvaSessionBean();
		}
		
		if(this.tiporetencionfuenteivaSessionBean.getsUltimaBusquedaTipoRetencionFuenteIva()!=null&&!this.tiporetencionfuenteivaSessionBean.getsUltimaBusquedaTipoRetencionFuenteIva().equals("")) {
			this.setsAccionBusqueda(tiporetencionfuenteivaSessionBean.getsUltimaBusquedaTipoRetencionFuenteIva());
			this.setiNumeroPaginacion(tiporetencionfuenteivaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tiporetencionfuenteivaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(tiporetencionfuenteivaSessionBean.getcodigo());
				tiporetencionfuenteivaSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(tiporetencionfuenteivaSessionBean.getnombre());
				tiporetencionfuenteivaSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
				this.setid_paisFK_IdPais(tiporetencionfuenteivaSessionBean.getid_pais());
				tiporetencionfuenteivaSessionBean.setid_pais(-1L);
			}
		}
		
		this.tiporetencionfuenteivaSessionBean.setsUltimaBusquedaTipoRetencionFuenteIva("");
		this.tiporetencionfuenteivaSessionBean.setiNumeroPaginacion(TipoRetencionFuenteIvaConstantesFunciones.INUMEROPAGINACION);
		this.tiporetencionfuenteivaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoRetencionFuenteIva(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoRetencionFuenteIva() {
		this.updateBorderResaltarBusquedasFormularioTipoRetencionFuenteIva();
		this.updateVisibilidadBusquedasFormularioTipoRetencionFuenteIva();
		this.updateHabilitarBusquedasFormularioTipoRetencionFuenteIva();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoRetencionFuenteIva() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoRetencionFuenteIva.getComponents().length>0) {
	

		if(this.tiporetencionfuenteivaConstantesFunciones.resaltarBusquedaPorCodigoTipoRetencionFuenteIva!=null) {
			index= this.jTabbedPaneBusquedasTipoRetencionFuenteIva.indexOfComponent(this.jPanelBusquedaPorCodigoTipoRetencionFuenteIva);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoRetencionFuenteIva.getComponent(index);
				jPanel.setBorder(this.tiporetencionfuenteivaConstantesFunciones.resaltarBusquedaPorCodigoTipoRetencionFuenteIva);
			}
		}

		if(this.tiporetencionfuenteivaConstantesFunciones.resaltarBusquedaPorNombreTipoRetencionFuenteIva!=null) {
			index= this.jTabbedPaneBusquedasTipoRetencionFuenteIva.indexOfComponent(this.jPanelBusquedaPorNombreTipoRetencionFuenteIva);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoRetencionFuenteIva.getComponent(index);
				jPanel.setBorder(this.tiporetencionfuenteivaConstantesFunciones.resaltarBusquedaPorNombreTipoRetencionFuenteIva);
			}
		}

		if(this.tiporetencionfuenteivaConstantesFunciones.resaltarFK_IdPaisTipoRetencionFuenteIva!=null) {
			index= this.jTabbedPaneBusquedasTipoRetencionFuenteIva.indexOfComponent(this.jPanelFK_IdPaisTipoRetencionFuenteIva);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoRetencionFuenteIva.getComponent(index);
				jPanel.setBorder(this.tiporetencionfuenteivaConstantesFunciones.resaltarFK_IdPaisTipoRetencionFuenteIva);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoRetencionFuenteIva() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoRetencionFuenteIva.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoRetencionFuenteIva.indexOfComponent(this.jPanelBusquedaPorCodigoTipoRetencionFuenteIva);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoRetencionFuenteIva.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tiporetencionfuenteivaConstantesFunciones.mostrarBusquedaPorCodigoTipoRetencionFuenteIva);
			if(!this.tiporetencionfuenteivaConstantesFunciones.mostrarBusquedaPorCodigoTipoRetencionFuenteIva && index>-1) {
				this.jTabbedPaneBusquedasTipoRetencionFuenteIva.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoRetencionFuenteIva.indexOfComponent(this.jPanelBusquedaPorNombreTipoRetencionFuenteIva);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoRetencionFuenteIva.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tiporetencionfuenteivaConstantesFunciones.mostrarBusquedaPorNombreTipoRetencionFuenteIva);
			if(!this.tiporetencionfuenteivaConstantesFunciones.mostrarBusquedaPorNombreTipoRetencionFuenteIva && index>-1) {
				this.jTabbedPaneBusquedasTipoRetencionFuenteIva.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoRetencionFuenteIva.indexOfComponent(this.jPanelFK_IdPaisTipoRetencionFuenteIva);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoRetencionFuenteIva.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tiporetencionfuenteivaConstantesFunciones.mostrarFK_IdPaisTipoRetencionFuenteIva);
			if(!this.tiporetencionfuenteivaConstantesFunciones.mostrarFK_IdPaisTipoRetencionFuenteIva && index>-1) {
				this.jTabbedPaneBusquedasTipoRetencionFuenteIva.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoRetencionFuenteIva() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoRetencionFuenteIva.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoRetencionFuenteIva.indexOfComponent(this.jPanelBusquedaPorCodigoTipoRetencionFuenteIva);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoRetencionFuenteIva.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tiporetencionfuenteivaConstantesFunciones.activarBusquedaPorCodigoTipoRetencionFuenteIva);
				this.jTabbedPaneBusquedasTipoRetencionFuenteIva.setEnabledAt(index,this.tiporetencionfuenteivaConstantesFunciones.activarBusquedaPorCodigoTipoRetencionFuenteIva);
			}

			index= this.jTabbedPaneBusquedasTipoRetencionFuenteIva.indexOfComponent(this.jPanelBusquedaPorNombreTipoRetencionFuenteIva);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoRetencionFuenteIva.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tiporetencionfuenteivaConstantesFunciones.activarBusquedaPorNombreTipoRetencionFuenteIva);
				this.jTabbedPaneBusquedasTipoRetencionFuenteIva.setEnabledAt(index,this.tiporetencionfuenteivaConstantesFunciones.activarBusquedaPorNombreTipoRetencionFuenteIva);
			}

			index= this.jTabbedPaneBusquedasTipoRetencionFuenteIva.indexOfComponent(this.jPanelFK_IdPaisTipoRetencionFuenteIva);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoRetencionFuenteIva.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tiporetencionfuenteivaConstantesFunciones.activarFK_IdPaisTipoRetencionFuenteIva);
				this.jTabbedPaneBusquedasTipoRetencionFuenteIva.setEnabledAt(index,this.tiporetencionfuenteivaConstantesFunciones.activarFK_IdPaisTipoRetencionFuenteIva);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoRetencionFuenteIva(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasTipoRetencionFuenteIva.indexOfComponent(this.jPanelBusquedaPorCodigoTipoRetencionFuenteIva);

			this.jTabbedPaneBusquedasTipoRetencionFuenteIva.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoRetencionFuenteIva.getComponent(index);

			this.tiporetencionfuenteivaConstantesFunciones.setResaltarBusquedaPorCodigoTipoRetencionFuenteIva(resaltar);

			jPanel.setBorder(this.tiporetencionfuenteivaConstantesFunciones.resaltarBusquedaPorCodigoTipoRetencionFuenteIva);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasTipoRetencionFuenteIva.indexOfComponent(this.jPanelBusquedaPorNombreTipoRetencionFuenteIva);

			this.jTabbedPaneBusquedasTipoRetencionFuenteIva.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoRetencionFuenteIva.getComponent(index);

			this.tiporetencionfuenteivaConstantesFunciones.setResaltarBusquedaPorNombreTipoRetencionFuenteIva(resaltar);

			jPanel.setBorder(this.tiporetencionfuenteivaConstantesFunciones.resaltarBusquedaPorNombreTipoRetencionFuenteIva);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdPais")) {
			index= this.jTabbedPaneBusquedasTipoRetencionFuenteIva.indexOfComponent(this.jPanelFK_IdPaisTipoRetencionFuenteIva);

			this.jTabbedPaneBusquedasTipoRetencionFuenteIva.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoRetencionFuenteIva.getComponent(index);

			this.tiporetencionfuenteivaConstantesFunciones.setResaltarFK_IdPaisTipoRetencionFuenteIva(resaltar);

			jPanel.setBorder(this.tiporetencionfuenteivaConstantesFunciones.resaltarFK_IdPaisTipoRetencionFuenteIva);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoRetencionFuenteIva.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoRetencionFuenteIva() throws Exception {

		if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoRetencionFuenteIva();
		this.updateVisibilidadResaltarControlesFormularioTipoRetencionFuenteIva();
		this.updateHabilitarResaltarControlesFormularioTipoRetencionFuenteIva();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoRetencionFuenteIva() throws Exception {
		if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tiporetencionfuenteivaConstantesFunciones.resaltaridTipoRetencionFuenteIva!=null && this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) {this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jTextFieldidTipoRetencionFuenteIva.setBorder(this.tiporetencionfuenteivaConstantesFunciones.resaltaridTipoRetencionFuenteIva);}
		if(this.tiporetencionfuenteivaConstantesFunciones.resaltarid_paisTipoRetencionFuenteIva!=null && this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) {this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxid_paisTipoRetencionFuenteIva.setBorder(this.tiporetencionfuenteivaConstantesFunciones.resaltarid_paisTipoRetencionFuenteIva);}
		if(this.tiporetencionfuenteivaConstantesFunciones.resaltarcodigoTipoRetencionFuenteIva!=null && this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) {this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jTextFieldcodigoTipoRetencionFuenteIva.setBorder(this.tiporetencionfuenteivaConstantesFunciones.resaltarcodigoTipoRetencionFuenteIva);}
		if(this.tiporetencionfuenteivaConstantesFunciones.resaltarnombreTipoRetencionFuenteIva!=null && this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) {this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jTextAreanombreTipoRetencionFuenteIva.setBorder(this.tiporetencionfuenteivaConstantesFunciones.resaltarnombreTipoRetencionFuenteIva);}
		if(this.tiporetencionfuenteivaConstantesFunciones.resaltarporcentajeTipoRetencionFuenteIva!=null && this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) {this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jTextFieldporcentajeTipoRetencionFuenteIva.setBorder(this.tiporetencionfuenteivaConstantesFunciones.resaltarporcentajeTipoRetencionFuenteIva);}
		if(this.tiporetencionfuenteivaConstantesFunciones.resaltarmonto_minimoTipoRetencionFuenteIva!=null && this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) {this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jTextFieldmonto_minimoTipoRetencionFuenteIva.setBorder(this.tiporetencionfuenteivaConstantesFunciones.resaltarmonto_minimoTipoRetencionFuenteIva);}
		if(this.tiporetencionfuenteivaConstantesFunciones.resaltarid_cuenta_contableTipoRetencionFuenteIva!=null && this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) {this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxid_cuenta_contableTipoRetencionFuenteIva.setBorder(this.tiporetencionfuenteivaConstantesFunciones.resaltarid_cuenta_contableTipoRetencionFuenteIva);}
		if(this.tiporetencionfuenteivaConstantesFunciones.resaltarid_cuenta_contable_creditoTipoRetencionFuenteIva!=null && this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) {this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxid_cuenta_contable_creditoTipoRetencionFuenteIva.setBorder(this.tiporetencionfuenteivaConstantesFunciones.resaltarid_cuenta_contable_creditoTipoRetencionFuenteIva);}
		if(this.tiporetencionfuenteivaConstantesFunciones.resaltares_retencion_ivaTipoRetencionFuenteIva!=null && this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) {this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jCheckBoxes_retencion_ivaTipoRetencionFuenteIva.setBorderPainted(true);this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jCheckBoxes_retencion_ivaTipoRetencionFuenteIva.setBorder(this.tiporetencionfuenteivaConstantesFunciones.resaltares_retencion_ivaTipoRetencionFuenteIva);}
		if(this.tiporetencionfuenteivaConstantesFunciones.resaltares_debitoTipoRetencionFuenteIva!=null && this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) {this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jCheckBoxes_debitoTipoRetencionFuenteIva.setBorderPainted(true);this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jCheckBoxes_debitoTipoRetencionFuenteIva.setBorder(this.tiporetencionfuenteivaConstantesFunciones.resaltares_debitoTipoRetencionFuenteIva);}
		if(this.tiporetencionfuenteivaConstantesFunciones.resaltares_con_iva_facturaTipoRetencionFuenteIva!=null && this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) {this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jCheckBoxes_con_iva_facturaTipoRetencionFuenteIva.setBorderPainted(true);this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jCheckBoxes_con_iva_facturaTipoRetencionFuenteIva.setBorder(this.tiporetencionfuenteivaConstantesFunciones.resaltares_con_iva_facturaTipoRetencionFuenteIva);}
		if(this.tiporetencionfuenteivaConstantesFunciones.resaltares_con_sub_total_facturaTipoRetencionFuenteIva!=null && this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) {this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jCheckBoxes_con_sub_total_facturaTipoRetencionFuenteIva.setBorderPainted(true);this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jCheckBoxes_con_sub_total_facturaTipoRetencionFuenteIva.setBorder(this.tiporetencionfuenteivaConstantesFunciones.resaltares_con_sub_total_facturaTipoRetencionFuenteIva);}
		if(this.tiporetencionfuenteivaConstantesFunciones.resaltares_con_secuencialTipoRetencionFuenteIva!=null && this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) {this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jCheckBoxes_con_secuencialTipoRetencionFuenteIva.setBorderPainted(true);this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jCheckBoxes_con_secuencialTipoRetencionFuenteIva.setBorder(this.tiporetencionfuenteivaConstantesFunciones.resaltares_con_secuencialTipoRetencionFuenteIva);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoRetencionFuenteIva() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) {
	
		//this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jTextFieldidTipoRetencionFuenteIva.setVisible(this.tiporetencionfuenteivaConstantesFunciones.mostraridTipoRetencionFuenteIva);
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jPanelidTipoRetencionFuenteIva.setVisible(this.tiporetencionfuenteivaConstantesFunciones.mostraridTipoRetencionFuenteIva);
		//this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxid_paisTipoRetencionFuenteIva.setVisible(this.tiporetencionfuenteivaConstantesFunciones.mostrarid_paisTipoRetencionFuenteIva);
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jPanelid_paisTipoRetencionFuenteIva.setVisible(this.tiporetencionfuenteivaConstantesFunciones.mostrarid_paisTipoRetencionFuenteIva);
		//this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jTextFieldcodigoTipoRetencionFuenteIva.setVisible(this.tiporetencionfuenteivaConstantesFunciones.mostrarcodigoTipoRetencionFuenteIva);
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jPanelcodigoTipoRetencionFuenteIva.setVisible(this.tiporetencionfuenteivaConstantesFunciones.mostrarcodigoTipoRetencionFuenteIva);
		//this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jTextAreanombreTipoRetencionFuenteIva.setVisible(this.tiporetencionfuenteivaConstantesFunciones.mostrarnombreTipoRetencionFuenteIva);
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jPanelnombreTipoRetencionFuenteIva.setVisible(this.tiporetencionfuenteivaConstantesFunciones.mostrarnombreTipoRetencionFuenteIva);
		//this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jTextFieldporcentajeTipoRetencionFuenteIva.setVisible(this.tiporetencionfuenteivaConstantesFunciones.mostrarporcentajeTipoRetencionFuenteIva);
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jPanelporcentajeTipoRetencionFuenteIva.setVisible(this.tiporetencionfuenteivaConstantesFunciones.mostrarporcentajeTipoRetencionFuenteIva);
		//this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jTextFieldmonto_minimoTipoRetencionFuenteIva.setVisible(this.tiporetencionfuenteivaConstantesFunciones.mostrarmonto_minimoTipoRetencionFuenteIva);
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jPanelmonto_minimoTipoRetencionFuenteIva.setVisible(this.tiporetencionfuenteivaConstantesFunciones.mostrarmonto_minimoTipoRetencionFuenteIva);
		//this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxid_cuenta_contableTipoRetencionFuenteIva.setVisible(this.tiporetencionfuenteivaConstantesFunciones.mostrarid_cuenta_contableTipoRetencionFuenteIva);
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jPanelid_cuenta_contableTipoRetencionFuenteIva.setVisible(this.tiporetencionfuenteivaConstantesFunciones.mostrarid_cuenta_contableTipoRetencionFuenteIva);
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonid_cuenta_contableTipoRetencionFuenteIva.setVisible(this.tiporetencionfuenteivaConstantesFunciones.mostrarid_cuenta_contableTipoRetencionFuenteIva);
		//this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxid_cuenta_contable_creditoTipoRetencionFuenteIva.setVisible(this.tiporetencionfuenteivaConstantesFunciones.mostrarid_cuenta_contable_creditoTipoRetencionFuenteIva);
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jPanelid_cuenta_contable_creditoTipoRetencionFuenteIva.setVisible(this.tiporetencionfuenteivaConstantesFunciones.mostrarid_cuenta_contable_creditoTipoRetencionFuenteIva);
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonid_cuenta_contable_creditoTipoRetencionFuenteIva.setVisible(this.tiporetencionfuenteivaConstantesFunciones.mostrarid_cuenta_contable_creditoTipoRetencionFuenteIva);
		//this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jCheckBoxes_retencion_ivaTipoRetencionFuenteIva.setVisible(this.tiporetencionfuenteivaConstantesFunciones.mostrares_retencion_ivaTipoRetencionFuenteIva);
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jPaneles_retencion_ivaTipoRetencionFuenteIva.setVisible(this.tiporetencionfuenteivaConstantesFunciones.mostrares_retencion_ivaTipoRetencionFuenteIva);
		//this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jCheckBoxes_debitoTipoRetencionFuenteIva.setVisible(this.tiporetencionfuenteivaConstantesFunciones.mostrares_debitoTipoRetencionFuenteIva);
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jPaneles_debitoTipoRetencionFuenteIva.setVisible(this.tiporetencionfuenteivaConstantesFunciones.mostrares_debitoTipoRetencionFuenteIva);
		//this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jCheckBoxes_con_iva_facturaTipoRetencionFuenteIva.setVisible(this.tiporetencionfuenteivaConstantesFunciones.mostrares_con_iva_facturaTipoRetencionFuenteIva);
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jPaneles_con_iva_facturaTipoRetencionFuenteIva.setVisible(this.tiporetencionfuenteivaConstantesFunciones.mostrares_con_iva_facturaTipoRetencionFuenteIva);
		//this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jCheckBoxes_con_sub_total_facturaTipoRetencionFuenteIva.setVisible(this.tiporetencionfuenteivaConstantesFunciones.mostrares_con_sub_total_facturaTipoRetencionFuenteIva);
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jPaneles_con_sub_total_facturaTipoRetencionFuenteIva.setVisible(this.tiporetencionfuenteivaConstantesFunciones.mostrares_con_sub_total_facturaTipoRetencionFuenteIva);
		//this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jCheckBoxes_con_secuencialTipoRetencionFuenteIva.setVisible(this.tiporetencionfuenteivaConstantesFunciones.mostrares_con_secuencialTipoRetencionFuenteIva);
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jPaneles_con_secuencialTipoRetencionFuenteIva.setVisible(this.tiporetencionfuenteivaConstantesFunciones.mostrares_con_secuencialTipoRetencionFuenteIva);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoRetencionFuenteIva() throws Exception {
		if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoRetencionFuenteIva!=null) {
	
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jTextFieldidTipoRetencionFuenteIva.setEnabled(this.tiporetencionfuenteivaConstantesFunciones.activaridTipoRetencionFuenteIva);
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxid_paisTipoRetencionFuenteIva.setEnabled(this.tiporetencionfuenteivaConstantesFunciones.activarid_paisTipoRetencionFuenteIva);
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jTextFieldcodigoTipoRetencionFuenteIva.setEnabled(this.tiporetencionfuenteivaConstantesFunciones.activarcodigoTipoRetencionFuenteIva);
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jTextAreanombreTipoRetencionFuenteIva.setEnabled(this.tiporetencionfuenteivaConstantesFunciones.activarnombreTipoRetencionFuenteIva);
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jTextFieldporcentajeTipoRetencionFuenteIva.setEnabled(this.tiporetencionfuenteivaConstantesFunciones.activarporcentajeTipoRetencionFuenteIva);
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jTextFieldmonto_minimoTipoRetencionFuenteIva.setEnabled(this.tiporetencionfuenteivaConstantesFunciones.activarmonto_minimoTipoRetencionFuenteIva);
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxid_cuenta_contableTipoRetencionFuenteIva.setEnabled(this.tiporetencionfuenteivaConstantesFunciones.activarid_cuenta_contableTipoRetencionFuenteIva);
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonid_cuenta_contableTipoRetencionFuenteIva.setEnabled(this.tiporetencionfuenteivaConstantesFunciones.activarid_cuenta_contableTipoRetencionFuenteIva);
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jComboBoxid_cuenta_contable_creditoTipoRetencionFuenteIva.setEnabled(this.tiporetencionfuenteivaConstantesFunciones.activarid_cuenta_contable_creditoTipoRetencionFuenteIva);
			this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jButtonid_cuenta_contable_creditoTipoRetencionFuenteIva.setEnabled(this.tiporetencionfuenteivaConstantesFunciones.activarid_cuenta_contable_creditoTipoRetencionFuenteIva);
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jCheckBoxes_retencion_ivaTipoRetencionFuenteIva.setEnabled(this.tiporetencionfuenteivaConstantesFunciones.activares_retencion_ivaTipoRetencionFuenteIva);
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jCheckBoxes_debitoTipoRetencionFuenteIva.setEnabled(this.tiporetencionfuenteivaConstantesFunciones.activares_debitoTipoRetencionFuenteIva);
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jCheckBoxes_con_iva_facturaTipoRetencionFuenteIva.setEnabled(this.tiporetencionfuenteivaConstantesFunciones.activares_con_iva_facturaTipoRetencionFuenteIva);
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jCheckBoxes_con_sub_total_facturaTipoRetencionFuenteIva.setEnabled(this.tiporetencionfuenteivaConstantesFunciones.activares_con_sub_total_facturaTipoRetencionFuenteIva);
		this.jInternalFrameDetalleFormTipoRetencionFuenteIva.jCheckBoxes_con_secuencialTipoRetencionFuenteIva.setEnabled(this.tiporetencionfuenteivaConstantesFunciones.activares_con_secuencialTipoRetencionFuenteIva);
		}
	}
	
		
}