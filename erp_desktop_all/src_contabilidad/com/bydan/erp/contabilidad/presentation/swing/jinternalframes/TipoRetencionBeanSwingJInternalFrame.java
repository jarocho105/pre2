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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;




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

import com.bydan.erp.contabilidad.util.TipoRetencionConstantesFunciones;
import com.bydan.erp.contabilidad.util.TipoRetencionParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.TipoRetencionParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.TipoRetencionBean;
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

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.contabilidad.resources.reportes.AuxiliarReportes;


import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.contabilidad.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.sris.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.puntoventa.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.produccion.business.logic.*;
import com.bydan.erp.importaciones.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.produccion.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.sris.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.produccion.util.*;
import com.bydan.erp.importaciones.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoRetencionBeanSwingJInternalFrame extends TipoRetencionJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoRetencionBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoRetencion> tiporetencionValidator = new ClassValidator<TipoRetencion>(TipoRetencion.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoRetencion tiporetencion;	
	public TipoRetencion tiporetencionAux;
	public TipoRetencion tiporetencionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoRetencion tiporetencionTotales;
	public Long idTipoRetencionActual;
	public Long iIdNuevoTipoRetencion=0L;
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
	
	public Boolean isPermisoTodoTipoRetencion;
	public Boolean isPermisoNuevoTipoRetencion;
	public Boolean isPermisoActualizarTipoRetencion;
	public Boolean isPermisoActualizarOriginalTipoRetencion;
	public Boolean isPermisoEliminarTipoRetencion;
	public Boolean isPermisoGuardarCambiosTipoRetencion;
	public Boolean isPermisoConsultaTipoRetencion;
	public Boolean isPermisoBusquedaTipoRetencion;
	public Boolean isPermisoReporteTipoRetencion;
	public Boolean isPermisoPaginacionMedioTipoRetencion;
	public Boolean isPermisoPaginacionAltoTipoRetencion;
	public Boolean isPermisoPaginacionTodoTipoRetencion;
	public Boolean isPermisoCopiarTipoRetencion;
	public Boolean isPermisoVerFormTipoRetencion;
	public Boolean isPermisoDuplicarTipoRetencion;
	public Boolean isPermisoOrdenTipoRetencion;
	
	
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
	
	public TipoRetencionParameterReturnGeneral tiporetencionReturnGeneral;
	public TipoRetencionParameterReturnGeneral tiporetencionParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoRetencion=false;
	public Boolean esParaAccionDesdeFormularioTipoRetencion=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoRetencionSessionBeanAdditional tiporetencionSessionBeanAdditional=null;
	
	public TipoRetencionSessionBeanAdditional getTipoRetencionSessionBeanAdditional() {
		return this.tiporetencionSessionBeanAdditional;
	}
	
	public void setTipoRetencionSessionBeanAdditional(TipoRetencionSessionBeanAdditional tiporetencionSessionBeanAdditional) {
		try {
			this.tiporetencionSessionBeanAdditional=tiporetencionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoRetencionBeanSwingJInternalFrameAdditional tiporetencionBeanSwingJInternalFrameAdditional=null;
	//public class TipoRetencionBeanSwingJInternalFrame
	
	public TipoRetencionBeanSwingJInternalFrameAdditional getTipoRetencionBeanSwingJInternalFrameAdditional() {
		return this.tiporetencionBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoRetencionBeanSwingJInternalFrameAdditional(TipoRetencionBeanSwingJInternalFrameAdditional tiporetencionBeanSwingJInternalFrameAdditional) {
		try {
			this.tiporetencionBeanSwingJInternalFrameAdditional=tiporetencionBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoRetencionLogic tiporetencionLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoRetencion tiporetencionBean;
	public TipoRetencionConstantesFunciones tiporetencionConstantesFunciones;
	//public TipoRetencionParameterReturnGeneral tiporetencionReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public CuentaContableLogic cuentacontableLogic;
	public CuentaContableLogic cuentacontablecreditoLogic;
	
	//PARAMETROS
	
	
	//public List<TipoRetencion> tiporetencions;	
	//public List<TipoRetencion> tiporetencionsEliminados;
	//public List<TipoRetencion> tiporetencionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoRetencion=false;
	public Boolean isVisibilidadCeldaDuplicarTipoRetencion=true;
	public Boolean isVisibilidadCeldaCopiarTipoRetencion=true;
	public Boolean isVisibilidadCeldaVerFormTipoRetencion=true;
	public Boolean isVisibilidadCeldaOrdenTipoRetencion=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoRetencion=false;
	public Boolean isVisibilidadCeldaModificarTipoRetencion=false;
	public Boolean isVisibilidadCeldaActualizarTipoRetencion=false;
	public Boolean isVisibilidadCeldaEliminarTipoRetencion=false;
	public Boolean isVisibilidadCeldaCancelarTipoRetencion=false;
	public Boolean isVisibilidadCeldaGuardarTipoRetencion=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoRetencion=false;	
	
	
	public Boolean isVisibilidadBusquedaPoNombre=false;
	public Boolean isVisibilidadBusquedaPorCodigoSri=false;
	public Boolean isVisibilidadBusquedaPorId=false;
	public Boolean isVisibilidadFK_IdCuentaContable=false;
	public Boolean isVisibilidadFK_IdCuentaContableCredito=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoRetencion() {
		return this.iIdNuevoTipoRetencion;
	}

	public void setiIdNuevoTipoRetencion(Long iIdNuevoTipoRetencion) {
		this.iIdNuevoTipoRetencion = iIdNuevoTipoRetencion;
	}
	
	public Long getidTipoRetencionActual() {
		return this.idTipoRetencionActual;
	}

	public void setidTipoRetencionActual(Long idTipoRetencionActual) {
		this.idTipoRetencionActual = idTipoRetencionActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoRetencion gettiporetencion() {
		return this.tiporetencion;
	}

	public void settiporetencion(TipoRetencion tiporetencion) {
		this.tiporetencion = tiporetencion;
	}
	
	public TipoRetencion gettiporetencionAux() {
		return this.tiporetencionAux;
	}

	public void settiporetencionAux(TipoRetencion tiporetencionAux) {
		this.tiporetencionAux = tiporetencionAux;
	}				
	
	public TipoRetencion gettiporetencionAnterior() {
		return this.tiporetencionAnterior;
	}

	public void settiporetencionAnterior(TipoRetencion tiporetencionAnterior) {
		this.tiporetencionAnterior = tiporetencionAnterior;
	}	
	
	public TipoRetencion gettiporetencionTotales() {
		return this.tiporetencionTotales;
	}

	public void settiporetencionTotales(TipoRetencion tiporetencionTotales) {
		this.tiporetencionTotales = tiporetencionTotales;
	}	
	
	public TipoRetencion gettiporetencionBean() {
		return this.tiporetencionBean;
	}

	public void settiporetencionBean(TipoRetencion tiporetencionBean) {
		this.tiporetencionBean = tiporetencionBean;
	}	
	
	public TipoRetencionParameterReturnGeneral gettiporetencionReturnGeneral() {
		return this.tiporetencionReturnGeneral;
	}

	public void settiporetencionReturnGeneral(TipoRetencionParameterReturnGeneral tiporetencionReturnGeneral) {
		this.tiporetencionReturnGeneral = tiporetencionReturnGeneral;
	}	
	
	
	public String nombreBusquedaPoNombre="";

	public String getnombreBusquedaPoNombre() {
		return this.nombreBusquedaPoNombre;
	}

	public void setnombreBusquedaPoNombre(String nombreBusquedaPoNombre) {
		this.nombreBusquedaPoNombre = nombreBusquedaPoNombre;
	}

	public String codigoBusquedaPorCodigoSri="";

	public String getcodigoBusquedaPorCodigoSri() {
		return this.codigoBusquedaPorCodigoSri;
	}

	public void setcodigoBusquedaPorCodigoSri(String codigoBusquedaPorCodigoSri) {
		this.codigoBusquedaPorCodigoSri = codigoBusquedaPorCodigoSri;
	}

	public Long idBusquedaPorId=0L;

	public Long getidBusquedaPorId() {
		return this.idBusquedaPorId;
	}

	public void setidBusquedaPorId(Long idBusquedaPorId) {
		this.idBusquedaPorId = idBusquedaPorId;
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

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoRetencionLogic getTipoRetencionLogic()	{		
		return tiporetencionLogic;
	}

	public void setTipoRetencionLogic(TipoRetencionLogic tiporetencionLogic) {
		this.tiporetencionLogic = tiporetencionLogic;
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
	
	public Boolean getIsEsNuevoTipoRetencion() {
		return isEsNuevoTipoRetencion;
	}

	public void setIsEsNuevoTipoRetencion(Boolean isEsNuevoTipoRetencion) {
		this.isEsNuevoTipoRetencion = isEsNuevoTipoRetencion;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoRetencion() {
		return esParaAccionDesdeFormularioTipoRetencion;
	}
	
	public void setEsParaAccionDesdeFormularioTipoRetencion(Boolean esParaAccionDesdeFormularioTipoRetencion) {
		this.esParaAccionDesdeFormularioTipoRetencion = esParaAccionDesdeFormularioTipoRetencion;
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

			if(this.tiporetencionSessionBean==null) {
				this.tiporetencionSessionBean=new TipoRetencionSessionBean();
			}

			if(!this.tiporetencionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tiporetencionSessionBean.getlidEmpresaActual());
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

			if(this.tiporetencionSessionBean==null) {
				this.tiporetencionSessionBean=new TipoRetencionSessionBean();
			}

			if(!this.tiporetencionSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
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
					cuentacontableLogic.getEntityWithConnection(tiporetencionSessionBean.getlidCuentaContableActual());
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

			if(this.tiporetencionSessionBean==null) {
				this.tiporetencionSessionBean=new TipoRetencionSessionBean();
			}

			if(!this.tiporetencionSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableCredito()) {
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
					cuentacontableLogic.getEntityWithConnection(tiporetencionSessionBean.getlidCuentaContableCreditoActual());
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

					if(this.tiporetencion!=null) {
						this.tiporetencion.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoRetencion!=null) {
						this.jInternalFrameDetalleFormTipoRetencion.jComboBoxid_empresaTipoRetencion.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoRetencion.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoRetencion!=null) {
						if(this.jInternalFrameDetalleFormTipoRetencion.jComboBoxid_empresaTipoRetencion.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoRetencion.jComboBoxid_empresaTipoRetencion.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoRetencionGenerico)throws Exception
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
				jComboBoxid_empresaTipoRetencionGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoRetencionGenerico!=null && jComboBoxid_empresaTipoRetencionGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoRetencionGenerico.setSelectedIndex(0);
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

					if(this.tiporetencion!=null) {
						this.tiporetencion.setCuentaContable(cuentacontableTemp);
					}

					if(this.jInternalFrameDetalleFormTipoRetencion!=null) {
						this.jInternalFrameDetalleFormTipoRetencion.jComboBoxid_cuenta_contableTipoRetencion.setSelectedItem(cuentacontableTemp);
					}
				} else {
					//jComboBoxid_cuenta_contableTipoRetencion.setSelectedItem(cuentacontableTemp);
					if(this.jInternalFrameDetalleFormTipoRetencion!=null) {
						if(this.jInternalFrameDetalleFormTipoRetencion.jComboBoxid_cuenta_contableTipoRetencion.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoRetencion.jComboBoxid_cuenta_contableTipoRetencion.setSelectedIndex(0);
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
	public void setActualCuentaContableForeignKeyGenerico(Long idCuentaContableSeleccionado,JComboBox jComboBoxid_cuenta_contableTipoRetencionGenerico)throws Exception
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
				jComboBoxid_cuenta_contableTipoRetencionGenerico.setSelectedItem(cuentacontableTemp);
			} else {
				if(jComboBoxid_cuenta_contableTipoRetencionGenerico!=null && jComboBoxid_cuenta_contableTipoRetencionGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contableTipoRetencionGenerico.setSelectedIndex(0);
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

					if(this.tiporetencion!=null) {
						this.tiporetencion.setCuentaContableCredito(cuentacontablecreditoTemp);
					}

					if(this.jInternalFrameDetalleFormTipoRetencion!=null) {
						this.jInternalFrameDetalleFormTipoRetencion.jComboBoxid_cuenta_contable_creditoTipoRetencion.setSelectedItem(cuentacontablecreditoTemp);
					}
				} else {
					//jComboBoxid_cuenta_contable_creditoTipoRetencion.setSelectedItem(cuentacontablecreditoTemp);
					if(this.jInternalFrameDetalleFormTipoRetencion!=null) {
						if(this.jInternalFrameDetalleFormTipoRetencion.jComboBoxid_cuenta_contable_creditoTipoRetencion.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoRetencion.jComboBoxid_cuenta_contable_creditoTipoRetencion.setSelectedIndex(0);
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
	public void setActualCuentaContableCreditoForeignKeyGenerico(Long idCuentaContableCreditoSeleccionado,JComboBox jComboBoxid_cuenta_contable_creditoTipoRetencionGenerico)throws Exception
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
				jComboBoxid_cuenta_contable_creditoTipoRetencionGenerico.setSelectedItem(cuentacontablecreditoTemp);
			} else {
				if(jComboBoxid_cuenta_contable_creditoTipoRetencionGenerico!=null && jComboBoxid_cuenta_contable_creditoTipoRetencionGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contable_creditoTipoRetencionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoRetencion tiporetencion,JComboBox jComboBoxid_empresaTipoRetencionGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoRetencionGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoRetencion.jComboBoxid_empresaTipoRetencion.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoRetencionGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tiporetencion.setid_empresa(empresaAux.getId());
				tiporetencion.setempresa_descripcion(TipoRetencionConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tiporetencion.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableForeignKey(TipoRetencion tiporetencion,JComboBox jComboBoxid_cuenta_contableTipoRetencionGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contableTipoRetencionGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormTipoRetencion.jComboBoxid_cuenta_contableTipoRetencion.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contableTipoRetencionGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null) {
				tiporetencion.setid_cuenta_contable(cuentacontableAux.getId());
				tiporetencion.setcuentacontable_descripcion(TipoRetencionConstantesFunciones.getCuentaContableDescripcion(cuentacontableAux));
				tiporetencion.setCuentaContable(cuentacontableAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableCreditoForeignKey(TipoRetencion tiporetencion,JComboBox jComboBoxid_cuenta_contable_creditoTipoRetencionGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contable_creditoTipoRetencionGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormTipoRetencion.jComboBoxid_cuenta_contable_creditoTipoRetencion.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contable_creditoTipoRetencionGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null) {
				tiporetencion.setid_cuenta_contable_credito(cuentacontableAux.getId());
				tiporetencion.setcuentacontablecredito_descripcion(TipoRetencionConstantesFunciones.getCuentaContableCreditoDescripcion(cuentacontableAux));
				tiporetencion.setCuentaContableCredito(cuentacontableAux);			}
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

					if(!TipoRetencionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoRetencion!=null) { 
							this.jInternalFrameDetalleFormTipoRetencion.jComboBoxid_empresaTipoRetencion.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoRetencion.jComboBoxid_empresaTipoRetencion.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoRetencion!=null) { 
					}

					if(!TipoRetencionJInternalFrame.ISBINDING_MANUAL) {
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

					if(!TipoRetencionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoRetencion!=null) { 
							this.jInternalFrameDetalleFormTipoRetencion.jComboBoxid_cuenta_contableTipoRetencion.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jInternalFrameDetalleFormTipoRetencion.jComboBoxid_cuenta_contableTipoRetencion.addItem(cuentacontable);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoRetencion!=null) { 
					}

					if(!TipoRetencionJInternalFrame.ISBINDING_MANUAL) {
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

					if(!TipoRetencionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoRetencion!=null) { 
							this.jInternalFrameDetalleFormTipoRetencion.jComboBoxid_cuenta_contable_creditoTipoRetencion.removeAllItems();

							for(CuentaContable cuentacontablecredito:this.cuentacontablecreditosForeignKey) {
								this.jInternalFrameDetalleFormTipoRetencion.jComboBoxid_cuenta_contable_creditoTipoRetencion.addItem(cuentacontablecredito);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoRetencion!=null) { 
					}

					if(!TipoRetencionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTipoRetencion!=null) {
							this.jInternalFrameDetalleFormTipoRetencion.jComboBoxid_empresaTipoRetencion.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoRetencion!=null) {
							this.jInternalFrameDetalleFormTipoRetencion.jComboBoxid_empresaTipoRetencion.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormTipoRetencion!=null) {
							this.jInternalFrameDetalleFormTipoRetencion.jComboBoxid_cuenta_contableTipoRetencion.setSelectedItem(cuentacontable);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoRetencion!=null) {
							this.jInternalFrameDetalleFormTipoRetencion.jComboBoxid_cuenta_contableTipoRetencion.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormTipoRetencion!=null) {
							this.jInternalFrameDetalleFormTipoRetencion.jComboBoxid_cuenta_contable_creditoTipoRetencion.setSelectedItem(cuentacontablecredito);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoRetencion!=null) {
							this.jInternalFrameDetalleFormTipoRetencion.jComboBoxid_cuenta_contable_creditoTipoRetencion.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoRetencion() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoRetencionConstantesFunciones.refrescarForeignKeysDescripcionesTipoRetencion(this.tiporetencionLogic.getTipoRetencions());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoRetencionConstantesFunciones.refrescarForeignKeysDescripcionesTipoRetencion(this.tiporetencions);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(CuentaContable.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tiporetencionLogic.setTipoRetencions(this.tiporetencions);
			tiporetencionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoRetencionParameterReturnGeneral getTipoRetencionParameterGeneral() {
		return this.tiporetencionParameterGeneral;
	}
	
	public void setTipoRetencionParameterGeneral(TipoRetencionParameterReturnGeneral tiporetencionParameterGeneral) {
		this.tiporetencionParameterGeneral = tiporetencionParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoRetencion() {
		return isPermisoTodoTipoRetencion;
	}

	public void setIsPermisoTodoTipoRetencion(Boolean isPermisoTodoTipoRetencion) {
		this.isPermisoTodoTipoRetencion = isPermisoTodoTipoRetencion;
	}

	public Boolean getIsPermisoNuevoTipoRetencion() {
		return isPermisoNuevoTipoRetencion;
	}

	public void setIsPermisoNuevoTipoRetencion(Boolean isPermisoNuevoTipoRetencion) {
		this.isPermisoNuevoTipoRetencion = isPermisoNuevoTipoRetencion;
	}

	public Boolean getIsPermisoActualizarTipoRetencion() {
		return isPermisoActualizarTipoRetencion;
	}

	public void setIsPermisoActualizarTipoRetencion(Boolean isPermisoActualizarTipoRetencion) {
		this.isPermisoActualizarTipoRetencion = isPermisoActualizarTipoRetencion;
	}

	public Boolean getIsPermisoEliminarTipoRetencion() {
		return isPermisoEliminarTipoRetencion;
	}

	public void setIsPermisoEliminarTipoRetencion(Boolean isPermisoEliminarTipoRetencion) {
		this.isPermisoEliminarTipoRetencion = isPermisoEliminarTipoRetencion;
	}

	public Boolean getIsPermisoGuardarCambiosTipoRetencion() {
		return isPermisoGuardarCambiosTipoRetencion;
	}

	public void setIsPermisoGuardarCambiosTipoRetencion(Boolean isPermisoGuardarCambiosTipoRetencion) {
		this.isPermisoGuardarCambiosTipoRetencion = isPermisoGuardarCambiosTipoRetencion;
	}
	
	public Boolean getIsPermisoConsultaTipoRetencion() {
		return isPermisoConsultaTipoRetencion;
	}

	public void setIsPermisoConsultaTipoRetencion(Boolean isPermisoConsultaTipoRetencion) {
		this.isPermisoConsultaTipoRetencion = isPermisoConsultaTipoRetencion;
	}

	public Boolean getIsPermisoBusquedaTipoRetencion() {
		return isPermisoBusquedaTipoRetencion;
	}

	public void setIsPermisoBusquedaTipoRetencion(Boolean isPermisoBusquedaTipoRetencion) {
		this.isPermisoBusquedaTipoRetencion = isPermisoBusquedaTipoRetencion;
	}

	public Boolean getIsPermisoReporteTipoRetencion() {
		return isPermisoReporteTipoRetencion;
	}

	public void setIsPermisoReporteTipoRetencion(Boolean isPermisoReporteTipoRetencion) {
		this.isPermisoReporteTipoRetencion = isPermisoReporteTipoRetencion;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoRetencion() {
		return isPermisoPaginacionMedioTipoRetencion;
	}

	public void setIsPermisoPaginacionMedioTipoRetencion(Boolean isPermisoPaginacionMedioTipoRetencion) {
		this.isPermisoPaginacionMedioTipoRetencion = isPermisoPaginacionMedioTipoRetencion;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoRetencion() {
		return isPermisoPaginacionTodoTipoRetencion;
	}

	public void setIsPermisoPaginacionTodoTipoRetencion(Boolean isPermisoPaginacionTodoTipoRetencion) {
		this.isPermisoPaginacionTodoTipoRetencion = isPermisoPaginacionTodoTipoRetencion;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoRetencion() {
		return isPermisoPaginacionAltoTipoRetencion;
	}

	public void setIsPermisoPaginacionAltoTipoRetencion(Boolean isPermisoPaginacionAltoTipoRetencion) {
		this.isPermisoPaginacionAltoTipoRetencion = isPermisoPaginacionAltoTipoRetencion;
	}
	
	public Boolean getIsPermisoCopiarTipoRetencion() {
		return isPermisoCopiarTipoRetencion;
	}

	public void setIsPermisoCopiarTipoRetencion(Boolean isPermisoCopiarTipoRetencion) {
		this.isPermisoCopiarTipoRetencion = isPermisoCopiarTipoRetencion;
	}
	
	public Boolean getIsPermisoVerFormTipoRetencion() {
		return isPermisoVerFormTipoRetencion;
	}

	public void setIsPermisoVerFormTipoRetencion(Boolean isPermisoVerFormTipoRetencion) {
		this.isPermisoVerFormTipoRetencion = isPermisoVerFormTipoRetencion;
	}
	
	public Boolean getIsPermisoDuplicarTipoRetencion() {
		return isPermisoDuplicarTipoRetencion;
	}

	public void setIsPermisoDuplicarTipoRetencion(Boolean isPermisoDuplicarTipoRetencion) {
		this.isPermisoDuplicarTipoRetencion = isPermisoDuplicarTipoRetencion;
	}
	
	public Boolean getIsPermisoOrdenTipoRetencion() {
		return isPermisoOrdenTipoRetencion;
	}

	public void setIsPermisoOrdenTipoRetencion(Boolean isPermisoOrdenTipoRetencion) {
		this.isPermisoOrdenTipoRetencion = isPermisoOrdenTipoRetencion;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoRetencion() {
		return isVisibilidadCeldaNuevoTipoRetencion;
	}

	public void setIsVisibilidadCeldaNuevoTipoRetencion(Boolean isVisibilidadCeldaNuevoTipoRetencion) {
		this.isVisibilidadCeldaNuevoTipoRetencion = isVisibilidadCeldaNuevoTipoRetencion;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoRetencion() {
		return isVisibilidadCeldaDuplicarTipoRetencion;
	}

	public void setIsVisibilidadCeldaDuplicarTipoRetencion(Boolean isVisibilidadCeldaDuplicarTipoRetencion) {
		this.isVisibilidadCeldaDuplicarTipoRetencion = isVisibilidadCeldaDuplicarTipoRetencion;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoRetencion() {
		return isVisibilidadCeldaCopiarTipoRetencion;
	}

	public void setIsVisibilidadCeldaCopiarTipoRetencion(Boolean isVisibilidadCeldaCopiarTipoRetencion) {
		this.isVisibilidadCeldaCopiarTipoRetencion = isVisibilidadCeldaCopiarTipoRetencion;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoRetencion() {
		return isVisibilidadCeldaVerFormTipoRetencion;
	}

	public void setIsVisibilidadCeldaVerFormTipoRetencion(Boolean isVisibilidadCeldaVerFormTipoRetencion) {
		this.isVisibilidadCeldaVerFormTipoRetencion = isVisibilidadCeldaVerFormTipoRetencion;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoRetencion() {
		return isVisibilidadCeldaOrdenTipoRetencion;
	}

	public void setIsVisibilidadCeldaOrdenTipoRetencion(Boolean isVisibilidadCeldaOrdenTipoRetencion) {
		this.isVisibilidadCeldaOrdenTipoRetencion = isVisibilidadCeldaOrdenTipoRetencion;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoRetencion() {
		return isVisibilidadCeldaNuevoRelacionesTipoRetencion;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoRetencion(Boolean isVisibilidadCeldaNuevoRelacionesTipoRetencion) {
		this.isVisibilidadCeldaNuevoRelacionesTipoRetencion = isVisibilidadCeldaNuevoRelacionesTipoRetencion;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoRetencion() {
		return isVisibilidadCeldaModificarTipoRetencion;
	}

	public void setIsVisibilidadCeldaModificarTipoRetencion(Boolean isVisibilidadCeldaModificarTipoRetencion) {
		this.isVisibilidadCeldaModificarTipoRetencion = isVisibilidadCeldaModificarTipoRetencion;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoRetencion() {
		return isVisibilidadCeldaActualizarTipoRetencion;
	}

	public void setIsVisibilidadCeldaActualizarTipoRetencion(Boolean isVisibilidadCeldaActualizarTipoRetencion) {
		this.isVisibilidadCeldaActualizarTipoRetencion = isVisibilidadCeldaActualizarTipoRetencion;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoRetencion() {
		return isVisibilidadCeldaEliminarTipoRetencion;
	}

	public void setIsVisibilidadCeldaEliminarTipoRetencion(Boolean isVisibilidadCeldaEliminarTipoRetencion) {
		this.isVisibilidadCeldaEliminarTipoRetencion = isVisibilidadCeldaEliminarTipoRetencion;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoRetencion() {
		return isVisibilidadCeldaCancelarTipoRetencion;
	}

	public void setIsVisibilidadCeldaCancelarTipoRetencion(Boolean isVisibilidadCeldaCancelarTipoRetencion) {
		this.isVisibilidadCeldaCancelarTipoRetencion = isVisibilidadCeldaCancelarTipoRetencion;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoRetencion() {
		return isVisibilidadCeldaGuardarTipoRetencion;
	}

	public void setIsVisibilidadCeldaGuardarTipoRetencion(Boolean isVisibilidadCeldaGuardarTipoRetencion) {
		this.isVisibilidadCeldaGuardarTipoRetencion = isVisibilidadCeldaGuardarTipoRetencion;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoRetencion() {
		return isVisibilidadCeldaGuardarCambiosTipoRetencion;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoRetencion(Boolean isVisibilidadCeldaGuardarCambiosTipoRetencion) {
		this.isVisibilidadCeldaGuardarCambiosTipoRetencion = isVisibilidadCeldaGuardarCambiosTipoRetencion;
	}
		
	public TipoRetencionSessionBean gettiporetencionSessionBean() {
		return this.tiporetencionSessionBean;
	}
	
	public void settiporetencionSessionBean(TipoRetencionSessionBean tiporetencionSessionBean) {
		this.tiporetencionSessionBean=tiporetencionSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPoNombre() {
		return this.isVisibilidadBusquedaPoNombre;
	}

	public void setisVisibilidadBusquedaPoNombre(Boolean isVisibilidadBusquedaPoNombre) {
		this.isVisibilidadBusquedaPoNombre=isVisibilidadBusquedaPoNombre;
	}

	public Boolean getisVisibilidadBusquedaPorCodigoSri() {
		return this.isVisibilidadBusquedaPorCodigoSri;
	}

	public void setisVisibilidadBusquedaPorCodigoSri(Boolean isVisibilidadBusquedaPorCodigoSri) {
		this.isVisibilidadBusquedaPorCodigoSri=isVisibilidadBusquedaPorCodigoSri;
	}

	public Boolean getisVisibilidadBusquedaPorId() {
		return this.isVisibilidadBusquedaPorId;
	}

	public void setisVisibilidadBusquedaPorId(Boolean isVisibilidadBusquedaPorId) {
		this.isVisibilidadBusquedaPorId=isVisibilidadBusquedaPorId;
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

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoRetencion(TipoRetencion tiporetencion)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tiporetencion,null);
				this.setActualParaGuardarCuentaContableForeignKey(tiporetencion,null);
				this.setActualParaGuardarCuentaContableCreditoForeignKey(tiporetencion,null);
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
	
	public void bugActualizarReferenciaActual(TipoRetencion tiporetencion,TipoRetencion tiporetencionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoRetencion(tiporetencion);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tiporetencionAux.setId(tiporetencion.getId());
		tiporetencionAux.setVersionRow(tiporetencion.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoRetencion();
		
			int intSelectedRow = this.jTableDatosTipoRetencion.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencion =(TipoRetencion) this.tiporetencionLogic.getTipoRetencions().toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tiporetencion =(TipoRetencion) this.tiporetencions.toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoRetencion(this.tiporetencion,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencion(this.tiporetencion);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tiporetencionValidator.getInvalidValues(this.tiporetencion);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tiporetencionLogic.setDatosCliente(datosCliente);
			tiporetencionLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tiporetencionAux=new  TipoRetencion();
				
				tiporetencionAux.setIsNew(true);
				tiporetencionAux.setIsChanged(true);
				
				tiporetencionAux.setTipoRetencionOriginal(this.tiporetencion);
				
				tiporetencionAux.setId(this.tiporetencion.getId());	
				tiporetencionAux.setVersionRow(this.tiporetencion.getVersionRow());	
				tiporetencionAux.setid_empresa(this.tiporetencion.getid_empresa());	
				tiporetencionAux.setnombre(this.tiporetencion.getnombre());	
				tiporetencionAux.setcodigo(this.tiporetencion.getcodigo());	
				tiporetencionAux.setporcentaje(this.tiporetencion.getporcentaje());	
				tiporetencionAux.setmonto_minimo(this.tiporetencion.getmonto_minimo());	
				tiporetencionAux.setid_cuenta_contable(this.tiporetencion.getid_cuenta_contable());	
				tiporetencionAux.setid_cuenta_contable_credito(this.tiporetencion.getid_cuenta_contable_credito());	
				tiporetencionAux.setes_retencion_iva(this.tiporetencion.getes_retencion_iva());	
				tiporetencionAux.setes_debito(this.tiporetencion.getes_debito());	
				tiporetencionAux.setes_con_iva_factura(this.tiporetencion.getes_con_iva_factura());	
				tiporetencionAux.setes_con_sub_total_factura(this.tiporetencion.getes_con_sub_total_factura());	
				tiporetencionAux.setes_con_secuencial(this.tiporetencion.getes_con_secuencial());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tiporetencionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tiporetencionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tiporetencionAux,tiporetencionLogic.getTipoRetencions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiporetencionAux,tiporetencions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tiporetencionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiporetencionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporetencionLogic.saveTipoRetencions();//WithConnection
						//tiporetencionLogic.getSetVersionRowTipoRetencions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tiporetencion,tiporetencionAux);
					
					this.refrescarForeignKeysDescripcionesTipoRetencion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tiporetencionAux=new  TipoRetencion();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tiporetencionSessionBean.getEsGuardarRelacionado() 
					|| (this.tiporetencionSessionBean.getEsGuardarRelacionado() && this.tiporetencion.getId()>=0)) {
						
					tiporetencionAux.setIsNew(false);
				}
				
				tiporetencionAux.setIsDeleted(false);
			
				tiporetencionAux.setId(this.tiporetencion.getId());	
				tiporetencionAux.setVersionRow(this.tiporetencion.getVersionRow());	
				tiporetencionAux.setid_empresa(this.tiporetencion.getid_empresa());	
				tiporetencionAux.setnombre(this.tiporetencion.getnombre());	
				tiporetencionAux.setcodigo(this.tiporetencion.getcodigo());	
				tiporetencionAux.setporcentaje(this.tiporetencion.getporcentaje());	
				tiporetencionAux.setmonto_minimo(this.tiporetencion.getmonto_minimo());	
				tiporetencionAux.setid_cuenta_contable(this.tiporetencion.getid_cuenta_contable());	
				tiporetencionAux.setid_cuenta_contable_credito(this.tiporetencion.getid_cuenta_contable_credito());	
				tiporetencionAux.setes_retencion_iva(this.tiporetencion.getes_retencion_iva());	
				tiporetencionAux.setes_debito(this.tiporetencion.getes_debito());	
				tiporetencionAux.setes_con_iva_factura(this.tiporetencion.getes_con_iva_factura());	
				tiporetencionAux.setes_con_sub_total_factura(this.tiporetencion.getes_con_sub_total_factura());	
				tiporetencionAux.setes_con_secuencial(this.tiporetencion.getes_con_secuencial());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tiporetencionAux,tiporetencionLogic.getTipoRetencions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiporetencionAux,tiporetencions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tiporetencionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiporetencionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporetencionLogic.saveTipoRetencions();//WithConnection
						//tiporetencionLogic.getSetVersionRowTipoRetencions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tiporetencion,tiporetencionAux);
					
					this.refrescarForeignKeysDescripcionesTipoRetencion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tiporetencionAux=new  TipoRetencion();
				
				tiporetencionAux.setIsNew(false);
				tiporetencionAux.setIsChanged(false);
				
				tiporetencionAux.setIsDeleted(true);
				
				tiporetencionAux.setId(this.tiporetencion.getId());	
				tiporetencionAux.setVersionRow(this.tiporetencion.getVersionRow());	
				tiporetencionAux.setid_empresa(this.tiporetencion.getid_empresa());	
				tiporetencionAux.setnombre(this.tiporetencion.getnombre());	
				tiporetencionAux.setcodigo(this.tiporetencion.getcodigo());	
				tiporetencionAux.setporcentaje(this.tiporetencion.getporcentaje());	
				tiporetencionAux.setmonto_minimo(this.tiporetencion.getmonto_minimo());	
				tiporetencionAux.setid_cuenta_contable(this.tiporetencion.getid_cuenta_contable());	
				tiporetencionAux.setid_cuenta_contable_credito(this.tiporetencion.getid_cuenta_contable_credito());	
				tiporetencionAux.setes_retencion_iva(this.tiporetencion.getes_retencion_iva());	
				tiporetencionAux.setes_debito(this.tiporetencion.getes_debito());	
				tiporetencionAux.setes_con_iva_factura(this.tiporetencion.getes_con_iva_factura());	
				tiporetencionAux.setes_con_sub_total_factura(this.tiporetencion.getes_con_sub_total_factura());	
				tiporetencionAux.setes_con_secuencial(this.tiporetencion.getes_con_secuencial());	
				
				if(this.tiporetencionSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tiporetencionAux.getId()>=0) {	
						this.tiporetencionsEliminados.add(tiporetencionAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tiporetencionAux,tiporetencionLogic.getTipoRetencions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiporetencionAux,tiporetencions);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tiporetencionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiporetencionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporetencionLogic.saveTipoRetencions();//WithConnection
						//tiporetencionLogic.getSetVersionRowTipoRetencions();//WithConnection
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
					this.tiporetencionLogic.getTipoRetencions().addAll(this.tiporetencionsEliminados);
					
					tiporetencionLogic.saveTipoRetencions();//WithConnection
					//tiporetencionLogic.getSetVersionRowTipoRetencions();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoRetencion();
				
				this.tiporetencionsEliminados= new ArrayList<TipoRetencion>();		
			}
			
			if(this.tiporetencionSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporetencionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Retencion  GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Retencion ",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tiporetencion=tiporetencionAux;
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
      		//this.finishProcessTipoRetencion();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoRetencion tiporetencionLocal) throws Exception {
		
		if(this.tiporetencionSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoRetencion tiporetencionLocal) throws Exception {	
		if(this.tiporetencionSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tiporetencionLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontableBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontableBeanSwingJInternalFrameLocal.actualizarLista(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontablesForeignKey);

				cuentacontableBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				tiporetencionLocal.setCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContable();
				this.cargarCombosFrameCuentaContablesForeignKey("Formulario");
				this.setActualCuentaContableForeignKey(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontablecreditoBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontablecreditoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontablecreditoBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontablecreditoBeanSwingJInternalFrameLocal.actualizarLista(cuentacontablecreditoBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontablecreditosForeignKey);

				cuentacontablecreditoBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontablecreditoBeanSwingJInternalFrameLocal.cuentacontable);

				tiporetencionLocal.setCuentaContableCredito(cuentacontablecreditoBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContableCredito();
				this.cargarCombosFrameCuentaContableCreditosForeignKey("Formulario");
				this.setActualCuentaContableCreditoForeignKey(cuentacontablecreditoBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoRetencionActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoRetencion.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tiporetencion =(TipoRetencion) this.tiporetencionLogic.getTipoRetencions().toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tiporetencion =(TipoRetencion) this.tiporetencions.toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tiporetencionValidator.getInvalidValues(this.tiporetencion);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoRetencion tiporetencion,List<TipoRetencion> tiporetencions) throws Exception {
		try	{		
			TipoRetencionConstantesFunciones.actualizarLista(tiporetencion,tiporetencions,this.tiporetencionSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoRetencion tiporetencion,List<TipoRetencion> tiporetencions) throws Exception {
		try	{			
			TipoRetencionConstantesFunciones.actualizarSelectedLista(tiporetencion,tiporetencions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoRetencion> tiporetencionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tiporetencionsLocal=this.tiporetencionLogic.getTipoRetencions();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tiporetencionsLocal=this.tiporetencions;
			}
			//ARCHITECTURE
		
			for(TipoRetencion tiporetencionLocal:tiporetencionsLocal) {
				if(this.permiteMantenimiento(tiporetencionLocal) && tiporetencionLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoRetencionConstantesFunciones.getTipoRetencionLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoRetencionConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRetencion.jLabelid_empresaTipoRetencion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoRetencionConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRetencion.jLabelnombreTipoRetencion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoRetencionConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRetencion.jLabelcodigoTipoRetencion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoRetencionConstantesFunciones.PORCENTAJE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRetencion.jLabelporcentajeTipoRetencion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoRetencionConstantesFunciones.MONTOMINIMO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRetencion.jLabelmonto_minimoTipoRetencion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoRetencionConstantesFunciones.IDCUENTACONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRetencion.jLabelid_cuenta_contableTipoRetencion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoRetencionConstantesFunciones.IDCUENTACONTABLECREDITO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRetencion.jLabelid_cuenta_contable_creditoTipoRetencion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoRetencionConstantesFunciones.ESRETENCIONIVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRetencion.jLabeles_retencion_ivaTipoRetencion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoRetencionConstantesFunciones.ESDEBITO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRetencion.jLabeles_debitoTipoRetencion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoRetencionConstantesFunciones.ESCONIVAFACTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRetencion.jLabeles_con_iva_facturaTipoRetencion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoRetencionConstantesFunciones.ESCONSUBTOTALFACTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRetencion.jLabeles_con_sub_total_facturaTipoRetencion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoRetencionConstantesFunciones.ESCONSECUENCIAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRetencion.jLabeles_con_secuencialTipoRetencion,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoRetencion!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoRetencion.jLabelid_empresaTipoRetencion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoRetencion.jLabelnombreTipoRetencion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoRetencion.jLabelcodigoTipoRetencion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoRetencion.jLabelporcentajeTipoRetencion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoRetencion.jLabelmonto_minimoTipoRetencion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoRetencion.jLabelid_cuenta_contableTipoRetencion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoRetencion.jLabelid_cuenta_contable_creditoTipoRetencion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoRetencion.jLabeles_retencion_ivaTipoRetencion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoRetencion.jLabeles_debitoTipoRetencion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoRetencion.jLabeles_con_iva_facturaTipoRetencion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoRetencion.jLabeles_con_sub_total_facturaTipoRetencion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoRetencion.jLabeles_con_secuencialTipoRetencion,"");
		
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
		this.iIdNuevoTipoRetencion--;	
		
		
		this.tiporetencionAux=new TipoRetencion();
		
		this.tiporetencionAux.setId(this.iIdNuevoTipoRetencion);
		this.tiporetencionAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tiporetencionLogic.getTipoRetencions().add(this.tiporetencionAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tiporetencions.add(this.tiporetencionAux);
		}
		//ARCHITECTURE
		
		this.tiporetencion=this.tiporetencionAux;
		
		if(TipoRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoRetencion(this.tiporetencion);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoRetencion(this.tiporetencion);
		}
				
		//this.setDefaultControlesTipoRetencion();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoRetencion();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoRetencion();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoRetencion();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoRetencion(this.tiporetencionBean,this.tiporetencion,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencion(this.tiporetencion);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoRetencionConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tiporetencionSessionBean.getConGuardarRelaciones()) {
			classes=TipoRetencionConstantesFunciones.getClassesRelationshipsOfTipoRetencion(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tiporetencionReturnGeneral=tiporetencionLogic.procesarEventosTipoRetencionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiporetencionLogic.getTipoRetencions(),this.tiporetencion,this.tiporetencionParameterGeneral,this.isEsNuevoTipoRetencion,classes);//this.tiporetencionLogic.getTipoRetencion()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoRetencion(this.tiporetencionReturnGeneral,this.tiporetencionBean,false);
		
		if(this.tiporetencionReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoRetencion(this.tiporetencionReturnGeneral.getTipoRetencion());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoRetencion(this.tiporetencionReturnGeneral.getTipoRetencion());
		}
		
		if(this.tiporetencionReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoRetencion(this.tiporetencionReturnGeneral.getTipoRetencion(),classes);//this.tiporetencionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoRetencion(this.tiporetencion,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoRetencion();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoRetencion();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoRetencionBeanSwingJInternalFrameAdditional.RecargarFormTipoRetencion(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoRetencion(false);
						
			if(tiporetencionSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoRetencionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoRetencion();
			}
			
			this.actualizarVisualTableDatosTipoRetencion();
			
			this.jTableDatosTipoRetencion.setRowSelectionInterval(this.getIndiceNuevoTipoRetencion(), this.getIndiceNuevoTipoRetencion());
			
			this.seleccionarFilaTablaTipoRetencionActual();
						
			this.actualizarEstadoCeldasBotonesTipoRetencion("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoRetencion(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoRetencion.jTextAreanombreTipoRetencion.setEnabled(isHabilitar && this.tiporetencionConstantesFunciones.activarnombreTipoRetencion);
		this.jInternalFrameDetalleFormTipoRetencion.jTextFieldcodigoTipoRetencion.setEnabled(isHabilitar && this.tiporetencionConstantesFunciones.activarcodigoTipoRetencion);
		this.jInternalFrameDetalleFormTipoRetencion.jTextFieldporcentajeTipoRetencion.setEnabled(isHabilitar && this.tiporetencionConstantesFunciones.activarporcentajeTipoRetencion);
		this.jInternalFrameDetalleFormTipoRetencion.jTextFieldmonto_minimoTipoRetencion.setEnabled(isHabilitar && this.tiporetencionConstantesFunciones.activarmonto_minimoTipoRetencion);
		this.jInternalFrameDetalleFormTipoRetencion.jCheckBoxes_retencion_ivaTipoRetencion.setEnabled(isHabilitar && this.tiporetencionConstantesFunciones.activares_retencion_ivaTipoRetencion);
		this.jInternalFrameDetalleFormTipoRetencion.jCheckBoxes_debitoTipoRetencion.setEnabled(isHabilitar && this.tiporetencionConstantesFunciones.activares_debitoTipoRetencion);
		this.jInternalFrameDetalleFormTipoRetencion.jCheckBoxes_con_iva_facturaTipoRetencion.setEnabled(isHabilitar && this.tiporetencionConstantesFunciones.activares_con_iva_facturaTipoRetencion);
		this.jInternalFrameDetalleFormTipoRetencion.jCheckBoxes_con_sub_total_facturaTipoRetencion.setEnabled(isHabilitar && this.tiporetencionConstantesFunciones.activares_con_sub_total_facturaTipoRetencion);
		this.jInternalFrameDetalleFormTipoRetencion.jCheckBoxes_con_secuencialTipoRetencion.setEnabled(isHabilitar && this.tiporetencionConstantesFunciones.activares_con_secuencialTipoRetencion);	
		//
		this.jInternalFrameDetalleFormTipoRetencion.jComboBoxid_empresaTipoRetencion.setEnabled(isHabilitar && this.tiporetencionConstantesFunciones.activarid_empresaTipoRetencion);
		this.jInternalFrameDetalleFormTipoRetencion.jComboBoxid_cuenta_contableTipoRetencion.setEnabled(isHabilitar && this.tiporetencionConstantesFunciones.activarid_cuenta_contableTipoRetencion);
		this.jInternalFrameDetalleFormTipoRetencion.jComboBoxid_cuenta_contable_creditoTipoRetencion.setEnabled(isHabilitar && this.tiporetencionConstantesFunciones.activarid_cuenta_contable_creditoTipoRetencion);
	};
	
	public void setDefaultControlesTipoRetencion() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoRetencion(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tiporetencionSessionBean.setConGuardarRelaciones(true);			
			this.tiporetencionSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoRetencion.jTabbedPaneRelacionesTipoRetencion.setVisible(true);
			
					
		} else {
			//this.tiporetencionSessionBean.setConGuardarRelaciones(false);			
			this.tiporetencionSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoRetencion.jTabbedPaneRelacionesTipoRetencion.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoRetencion() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRetencion tiporetencionAux:this.tiporetencionLogic.getTipoRetencions()) {
				if(tiporetencionAux.getId().equals(this.iIdNuevoTipoRetencion)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRetencion tiporetencionAux:this.tiporetencions) {
				if(tiporetencionAux.getId().equals(this.iIdNuevoTipoRetencion)) {
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
	
	public int getIndiceActualTipoRetencion(TipoRetencion tiporetencion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRetencion tiporetencionAux:this.tiporetencionLogic.getTipoRetencions()) {
				if(tiporetencionAux.getId().equals(tiporetencion.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRetencion tiporetencionAux:this.tiporetencions) {
				if(tiporetencionAux.getId().equals(tiporetencion.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoRetencion(TipoRetencion tiporetencionOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRetencion tiporetencionAux:this.tiporetencionLogic.getTipoRetencions()) {
				if(tiporetencionAux.getTipoRetencionOriginal().getId().equals(tiporetencionOriginal.getId())) {
					existe=true;
					tiporetencionOriginal.setId(tiporetencionAux.getId());
					tiporetencionOriginal.setVersionRow(tiporetencionAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRetencion tiporetencionAux:this.tiporetencions) {
				if(tiporetencionAux.getTipoRetencionOriginal().getId().equals(tiporetencionOriginal.getId())) {
					existe=true;
					tiporetencionOriginal.setId(tiporetencionAux.getId());
					tiporetencionOriginal.setVersionRow(tiporetencionAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoRetencion(Boolean esParaCancelar) throws Exception {
		tiporetencionsAux=new ArrayList<TipoRetencion>();
		tiporetencionAux=new TipoRetencion();
		
		if(!this.tiporetencionSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoRetencion tiporetencionAux:this.tiporetencionLogic.getTipoRetencions()) {
					if(tiporetencionAux.getId()<0) {
						tiporetencionsAux.add(tiporetencionAux);
					}		
				}
				this.iIdNuevoTipoRetencion=0L;
				this.tiporetencionLogic.getTipoRetencions().removeAll(tiporetencionsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoRetencion tiporetencionAux:this.tiporetencions) {
					if(tiporetencionAux.getId()<0) {
						tiporetencionsAux.add(tiporetencionAux);
					}		
				}
				this.iIdNuevoTipoRetencion=0L;
				this.tiporetencions.removeAll(tiporetencionsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoRetencion 
					&& this.tiporetencionLogic.getTipoRetencions().size()>0
					) {
					tiporetencionAux=this.tiporetencionLogic.getTipoRetencions().get(this.tiporetencionLogic.getTipoRetencions().size() - 1);
				
					if(tiporetencionAux.getId()<0) {
						this.tiporetencionLogic.getTipoRetencions().remove(tiporetencionAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoRetencion && this.tiporetencions.size()>0) {
					tiporetencionAux=this.tiporetencions.get(this.tiporetencions.size() - 1);
				
					if(tiporetencionAux.getId()<0) {
						this.tiporetencions.remove(tiporetencionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoRetencion(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tiporetencion.getId()<0) {
				this.tiporetencionLogic.getTipoRetencions().remove(this.tiporetencion);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tiporetencion.getId()<0) {
				this.tiporetencions.remove(this.tiporetencion);
			}
		}			
	}
	
	public void setEstadosInicialesTipoRetencion(List<TipoRetencion> tiporetencionsAux) throws Exception {
		TipoRetencionConstantesFunciones.setEstadosInicialesTipoRetencion(tiporetencionsAux);
	}
	
	public void setEstadosInicialesTipoRetencion(TipoRetencion tiporetencionAux) throws Exception {
		TipoRetencionConstantesFunciones.setEstadosInicialesTipoRetencion(tiporetencionAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoRetencionActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoRetencion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoRetencionActual()) {
				if(!this.isEsNuevoTipoRetencion) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoRetencion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoRetencion=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoRetencionActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Retencion  ?", "MANTENIMIENTO DE Tipo Retencion ", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoRetencion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoRetencion tiporetencion) throws Exception {
		TipoRetencionConstantesFunciones.seleccionarAsignar(this.tiporetencion,tiporetencion);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoRetencion=this.isPermisoActualizarOriginalTipoRetencion;
			
			
			this.seleccionarAsignar(tiporetencion);
			
			

			idCuentaContableActual=tiporetencion.getid_cuenta_contable();
			this.seleccionarCuentaContableActual();

			idCuentaContableCreditoActual=tiporetencion.getid_cuenta_contable_credito();
			this.seleccionarCuentaContableCreditoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoRetencionConstantesFunciones.quitarEspaciosTipoRetencion(this.tiporetencion,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoRetencion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tiporetencionSessionBean.setsFuncionBusquedaRapida(this.tiporetencionSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoTipoRetencion) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoRetencion(esParaCancelar);				
				this.cancelarNuevoTipoRetencion(esParaCancelar);								
			}
			
			this.tiporetencion=new TipoRetencion();
			
			this.inicializarTipoRetencion();
			
			this.actualizarEstadoCeldasBotonesTipoRetencion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoRetencion() throws Exception {
		try {
			TipoRetencionConstantesFunciones.inicializarTipoRetencion(this.tiporetencion);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tiporetencionLogic.getTipoRetencions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoRetencions(String sAccionBusqueda,List<TipoRetencion> tiporetencionsParaReportes) throws Exception {
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
					sPathReporteFinal="TipoRetencion"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoRetencionMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoRetencionMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoRetencion"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Retencion s");		
		parameters.put("busquedapor", TipoRetencionConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoRetencion=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoRetencionConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoRetencionConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoRetencion=new JRBeanArrayDataSource(TipoRetencionJInternalFrame.TraerTipoRetencionBeans(tiporetencionsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoRetencion);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoRetencionConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoRetencionConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoRetencionBean.TraerTipoRetencionBeans(tiporetencionsParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoRetencions(sAccionBusqueda,sTipoArchivoReporte,tiporetencionsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoRetencions(sAccionBusqueda,sTipoArchivoReporte,tiporetencionsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoRetencionActionPerformed(null);
					//this.generarExcelReporteTipoRetencions(sAccionBusqueda,sTipoArchivoReporte,tiporetencionsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoRetencions(sAccionBusqueda,sTipoArchivoReporte,tiporetencionsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoRetencions(sAccionBusqueda,sTipoArchivoReporte,tiporetencionsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoRetencions(sAccionBusqueda,sTipoArchivoReporte,tiporetencionsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoRetencions(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoRetencion> tiporetencionsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporetencion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoRetencions");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoRetencion("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoRetencion tiporetencion : tiporetencionsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoRetencionConstantesFunciones.generarExcelReporteDataTipoRetencion("NORMAL",row,workbook,tiporetencion,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporetencionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Retencion ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoRetencion(String sTipo,Row row,Workbook workbook) {
		
		TipoRetencionConstantesFunciones.generarExcelReporteHeaderTipoRetencion(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoRetencions(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoRetencion> tiporetencionsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporetencion_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoRetencions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoRetencion tiporetencion : tiporetencionsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoRetencionConstantesFunciones.getTipoRetencionDescripcion(tiporetencion));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoRetencionConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoRetencionConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiporetencion.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoRetencionConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoRetencionConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiporetencion.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoRetencionConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoRetencionConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiporetencion.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoRetencionConstantesFunciones.LABEL_PORCENTAJE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoRetencionConstantesFunciones.LABEL_PORCENTAJE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiporetencion.getporcentaje());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoRetencionConstantesFunciones.LABEL_MONTOMINIMO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoRetencionConstantesFunciones.LABEL_MONTOMINIMO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiporetencion.getmonto_minimo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoRetencionConstantesFunciones.LABEL_IDCUENTACONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoRetencionConstantesFunciones.LABEL_IDCUENTACONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiporetencion.getcuentacontable_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoRetencionConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoRetencionConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiporetencion.getcuentacontablecredito_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoRetencionConstantesFunciones.LABEL_ESRETENCIONIVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoRetencionConstantesFunciones.LABEL_ESRETENCIONIVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(tiporetencion.getes_retencion_iva()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoRetencionConstantesFunciones.LABEL_ESDEBITO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoRetencionConstantesFunciones.LABEL_ESDEBITO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(tiporetencion.getes_debito()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoRetencionConstantesFunciones.LABEL_ESCONIVAFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoRetencionConstantesFunciones.LABEL_ESCONIVAFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(tiporetencion.getes_con_iva_factura()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoRetencionConstantesFunciones.LABEL_ESCONSUBTOTALFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoRetencionConstantesFunciones.LABEL_ESCONSUBTOTALFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(tiporetencion.getes_con_sub_total_factura()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoRetencionConstantesFunciones.LABEL_ESCONSECUENCIAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoRetencionConstantesFunciones.LABEL_ESCONSECUENCIAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(tiporetencion.getes_con_secuencial()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporetencionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Retencion ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoRetencions(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoRetencion> tiporetencionsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoRetencion> tiporetencionsRespaldo=null;
		
		classes=TipoRetencionConstantesFunciones.getClassesRelationshipsOfTipoRetencion(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tiporetencionLogic.setDatosCliente(this.datosCliente);
		this.tiporetencionLogic.setDatosDeep(this.datosDeep);
		this.tiporetencionLogic.setIsConDeep(true);
		
		tiporetencionsRespaldo=this.tiporetencionLogic.getTipoRetencions();
		
		this.tiporetencionLogic.setTipoRetencions(tiporetencionsParaReportes);	
		this.tiporetencionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tiporetencionsParaReportes=this.tiporetencionLogic.getTipoRetencions();
		this.tiporetencionLogic.setTipoRetencions(tiporetencionsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporetencion_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoRetencions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoRetencion("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoRetencion tiporetencion : tiporetencionsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoRetencion("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoRetencionConstantesFunciones.generarExcelReporteDataTipoRetencion("NORMAL",row,workbook,tiporetencion,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoRetencionConstantesFunciones.getTipoRetencionDescripcion(tiporetencion));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporetencionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Retencion ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoRetencion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRetencion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoRetencion.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRetencion.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoRetencion() throws Exception {		
		this.startProcessTipoRetencion(true);
	}
	
	public void startProcessTipoRetencion(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoRetencion ,this.jPanelParametrosReportesTipoRetencion, this.jScrollPanelDatosTipoRetencion,this.jPanelPaginacionTipoRetencion, this.jScrollPanelDatosEdicionTipoRetencion, this.jPanelAccionesTipoRetencion,this.jPanelAccionesFormularioTipoRetencion,this.jmenuBarTipoRetencion,this.jmenuBarDetalleTipoRetencion,this.jTtoolBarTipoRetencion,this.jTtoolBarDetalleTipoRetencion);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoRetencion=this.jTabbedPaneBusquedasTipoRetencion; 
		
		final JPanel jPanelParametrosReportesTipoRetencion=this.jPanelParametrosReportesTipoRetencion;
		//final JScrollPane jScrollPanelDatosTipoRetencion=this.jScrollPanelDatosTipoRetencion;
		final JTable jTableDatosTipoRetencion=this.jTableDatosTipoRetencion;		
		final JPanel jPanelPaginacionTipoRetencion=this.jPanelPaginacionTipoRetencion;
		//final JScrollPane jScrollPanelDatosEdicionTipoRetencion=this.jScrollPanelDatosEdicionTipoRetencion;
		final JPanel jPanelAccionesTipoRetencion=this.jPanelAccionesTipoRetencion;
		
		JPanel jPanelCamposAuxiliarTipoRetencion=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoRetencion=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoRetencion!=null) {
			jPanelCamposAuxiliarTipoRetencion=this.jInternalFrameDetalleFormTipoRetencion.jPanelCamposTipoRetencion;
			jPanelAccionesFormularioAuxiliarTipoRetencion=this.jInternalFrameDetalleFormTipoRetencion.jPanelAccionesFormularioTipoRetencion;
		}
		
		final JPanel jPanelCamposTipoRetencion=jPanelCamposAuxiliarTipoRetencion;
		final JPanel jPanelAccionesFormularioTipoRetencion=jPanelAccionesFormularioAuxiliarTipoRetencion;
		
		
		final JMenuBar jmenuBarTipoRetencion=this.jmenuBarTipoRetencion;
		final JToolBar jTtoolBarTipoRetencion=this.jTtoolBarTipoRetencion;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoRetencion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoRetencion=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoRetencion!=null) {
			jmenuBarDetalleAuxiliarTipoRetencion=this.jInternalFrameDetalleFormTipoRetencion.jmenuBarDetalleTipoRetencion;
			jTtoolBarDetalleAuxiliarTipoRetencion=this.jInternalFrameDetalleFormTipoRetencion.jTtoolBarDetalleTipoRetencion;
		}
		
		final JMenuBar jmenuBarDetalleTipoRetencion=jmenuBarDetalleAuxiliarTipoRetencion;
		final JToolBar jTtoolBarDetalleTipoRetencion=jTtoolBarDetalleAuxiliarTipoRetencion;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoRetencion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoRetencion;
			processRunnable.jTableDatos=jTableDatosTipoRetencion;
			processRunnable.jPanelCampos=jPanelCamposTipoRetencion;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoRetencion;
			processRunnable.jPanelAcciones=jPanelAccionesTipoRetencion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoRetencion;
			
			
			processRunnable.jmenuBar=jmenuBarTipoRetencion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoRetencion;
			processRunnable.jTtoolBar=jTtoolBarTipoRetencion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoRetencion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoRetencion ,jPanelParametrosReportesTipoRetencion,jTableDatosTipoRetencion, /*jScrollPanelDatosTipoRetencion,*/jPanelCamposTipoRetencion,jPanelPaginacionTipoRetencion, /*jScrollPanelDatosEdicionTipoRetencion,*/ jPanelAccionesTipoRetencion,jPanelAccionesFormularioTipoRetencion,jmenuBarTipoRetencion,jmenuBarDetalleTipoRetencion,jTtoolBarTipoRetencion,jTtoolBarDetalleTipoRetencion);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoRetencion ,jPanelParametrosReportesTipoRetencion, jScrollPanelDatosTipoRetencion,jPanelPaginacionTipoRetencion, jScrollPanelDatosEdicionTipoRetencion, jPanelAccionesTipoRetencion,jPanelAccionesFormularioTipoRetencion,jmenuBarTipoRetencion,jmenuBarDetalleTipoRetencion,jTtoolBarTipoRetencion,jTtoolBarDetalleTipoRetencion);
						
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
	
	public void finishProcessTipoRetencion() {// throws Exception 
		this.finishProcessTipoRetencion(true);
	}
	
	public void finishProcessTipoRetencion(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoRetencion ,this.jPanelParametrosReportesTipoRetencion, this.jScrollPanelDatosTipoRetencion,this.jPanelPaginacionTipoRetencion, this.jScrollPanelDatosEdicionTipoRetencion, this.jPanelAccionesTipoRetencion,this.jPanelAccionesFormularioTipoRetencion,this.jmenuBarTipoRetencion,this.jmenuBarDetalleTipoRetencion,this.jTtoolBarTipoRetencion,this.jTtoolBarDetalleTipoRetencion);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoRetencion=this.jTabbedPaneBusquedasTipoRetencion; 
		
		final JPanel jPanelParametrosReportesTipoRetencion=this.jPanelParametrosReportesTipoRetencion;
		//final JScrollPane jScrollPanelDatosTipoRetencion=this.jScrollPanelDatosTipoRetencion;
		final JTable jTableDatosTipoRetencion=this.jTableDatosTipoRetencion;		
		final JPanel jPanelPaginacionTipoRetencion=this.jPanelPaginacionTipoRetencion;
		//final JScrollPane jScrollPanelDatosEdicionTipoRetencion=this.jScrollPanelDatosEdicionTipoRetencion;
		final JPanel jPanelAccionesTipoRetencion=this.jPanelAccionesTipoRetencion;
		
		JPanel jPanelCamposAuxiliarTipoRetencion=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoRetencion=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoRetencion!=null) {
			jPanelCamposAuxiliarTipoRetencion=this.jInternalFrameDetalleFormTipoRetencion.jPanelCamposTipoRetencion;
			jPanelAccionesFormularioAuxiliarTipoRetencion=this.jInternalFrameDetalleFormTipoRetencion.jPanelAccionesFormularioTipoRetencion;
		}
		
		final JPanel jPanelCamposTipoRetencion=jPanelCamposAuxiliarTipoRetencion;
		final JPanel jPanelAccionesFormularioTipoRetencion=jPanelAccionesFormularioAuxiliarTipoRetencion;
		
		
		final JMenuBar jmenuBarTipoRetencion=this.jmenuBarTipoRetencion;		
		final JToolBar jTtoolBarTipoRetencion=this.jTtoolBarTipoRetencion;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoRetencion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoRetencion=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoRetencion!=null) {
			jmenuBarDetalleAuxiliarTipoRetencion=this.jInternalFrameDetalleFormTipoRetencion.jmenuBarDetalleTipoRetencion;
			jTtoolBarDetalleAuxiliarTipoRetencion=this.jInternalFrameDetalleFormTipoRetencion.jTtoolBarDetalleTipoRetencion;		
		}
		
		final JMenuBar jmenuBarDetalleTipoRetencion=jmenuBarDetalleAuxiliarTipoRetencion;
		final JToolBar jTtoolBarDetalleTipoRetencion=jTtoolBarDetalleAuxiliarTipoRetencion;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoRetencion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoRetencion;
			processRunnable.jTableDatos=jTableDatosTipoRetencion;
			processRunnable.jPanelCampos=jPanelCamposTipoRetencion;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoRetencion;
			processRunnable.jPanelAcciones=jPanelAccionesTipoRetencion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoRetencion;
			
			
			processRunnable.jmenuBar=jmenuBarTipoRetencion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoRetencion;
			processRunnable.jTtoolBar=jTtoolBarTipoRetencion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoRetencion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoRetencion ,jPanelParametrosReportesTipoRetencion, jTableDatosTipoRetencion,/*jScrollPanelDatosTipoRetencion,*/jPanelCamposTipoRetencion,jPanelPaginacionTipoRetencion, /*jScrollPanelDatosEdicionTipoRetencion,*/ jPanelAccionesTipoRetencion,jPanelAccionesFormularioTipoRetencion,jmenuBarTipoRetencion,jmenuBarDetalleTipoRetencion,jTtoolBarTipoRetencion,jTtoolBarDetalleTipoRetencion));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoRetencion(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoRetencion(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoRetencion(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoRetencion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoRetencion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoRetencion,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoRetencion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoRetencion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoRetencion,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tiporetencionConstantesFunciones.getsFinalQueryTipoRetencion();
		String  finalQueryPaginacionTodos=this.tiporetencionConstantesFunciones.getsFinalQueryTipoRetencion();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoRetencionConstantesFunciones.getArrayColumnasGlobalesNoTipoRetencion(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoRetencionConstantesFunciones.getArrayColumnasGlobalesTipoRetencion(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoRetencionConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tiporetencionsEliminados= new ArrayList<TipoRetencion>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoRetencion();
		
				///*TipoRetencionSessionBean*/this.tiporetencionSessionBean=new TipoRetencionSessionBean();
			
			if(this.tiporetencionSessionBean==null) {
				this.tiporetencionSessionBean=new TipoRetencionSessionBean();
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
					this.iNumeroPaginacion=TipoRetencionConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoRetencionConstantesFunciones.getClassesForeignKeysOfTipoRetencion(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tiporetencion."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tiporetencionsAux= new ArrayList<TipoRetencion>();
			
				
			tiporetencionLogic.setDatosCliente(this.datosCliente);
			tiporetencionLogic.setDatosDeep(this.datosDeep);
			tiporetencionLogic.setIsConDeep(true);
			
			
			tiporetencionLogic.getTipoRetencionDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tiporetencionLogic.getTodosTipoRetencions(finalQueryGlobal,pagination);
					
					//tiporetencionLogic.getTodosTipoRetencionsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tiporetencionLogic.getTipoRetencions()==null|| tiporetencionLogic.getTipoRetencions().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiporetencionsAux= new ArrayList<TipoRetencion>();
							tiporetencionsAux.addAll(tiporetencionLogic.getTipoRetencions());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporetencionsAux= new ArrayList<TipoRetencion>();
							tiporetencionsAux.addAll(tiporetencions);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiporetencionLogic.getTodosTipoRetencions(finalQueryGlobal+"",this.pagination);												
							
							//tiporetencionLogic.getTodosTipoRetencionsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoRetencions("Todos",tiporetencionLogic.getTipoRetencions() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiporetencionLogic.setTipoRetencions(new ArrayList<TipoRetencion>());					
							tiporetencionLogic.getTipoRetencions().addAll(tiporetencionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporetencions=new ArrayList<TipoRetencion>();
							tiporetencions.addAll(tiporetencionsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoRetencion=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoRetencion=this.idActual;
				
				} else if(this.idTipoRetencionActual!=null && this.idTipoRetencionActual!=0L) {
					idTipoRetencion=idTipoRetencionActual;
				}
				
					
				this.sDetalleReporte=TipoRetencionConstantesFunciones.getDetalleIndicePorId(idTipoRetencion);
				
				this.tiporetencions=new ArrayList<TipoRetencion>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tiporetencionLogic.getEntity(idTipoRetencion);
					
					//tiporetencionLogic.getEntityWithConnection(idTipoRetencion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporetencionLogic.setTipoRetencions(new ArrayList<TipoRetencion>());
					tiporetencionLogic.getTipoRetencions().add(tiporetencionLogic.getTipoRetencion());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiporetencions=new ArrayList<TipoRetencion>();
					this.tiporetencions.add(tiporetencion);
				}
				
				if(tiporetencionLogic.getTipoRetencion()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPoNombre")) {
				this.sDetalleReporte=TipoRetencionConstantesFunciones.getDetalleIndiceBusquedaPoNombre(nombreBusquedaPoNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tiporetencionLogic.getTipoRetencionsBusquedaPoNombre(finalQueryGlobal,pagination,nombreBusquedaPoNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoRetencionConstantesFunciones.getDetalleIndiceBusquedaPoNombre(nombreBusquedaPoNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoRetencionConstantesFunciones.getDetalleIndiceBusquedaPoNombre(nombreBusquedaPoNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tiporetencionLogic.getTipoRetencions()==null||tiporetencionLogic.getTipoRetencions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tiporetencions==null|| tiporetencions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporetencionsAux=new ArrayList<TipoRetencion>();
						tiporetencionsAux.addAll(tiporetencionLogic.getTipoRetencions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporetencionsAux=new ArrayList<TipoRetencion>();
							tiporetencionsAux.addAll(tiporetencions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tiporetencionLogic.getTipoRetencionsBusquedaPoNombre(finalQueryGlobal,pagination,nombreBusquedaPoNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoRetencionConstantesFunciones.getDetalleIndiceBusquedaPoNombre(nombreBusquedaPoNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoRetencionConstantesFunciones.getDetalleIndiceBusquedaPoNombre(nombreBusquedaPoNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoRetencions("BusquedaPoNombre",tiporetencionLogic.getTipoRetencions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoRetencions("BusquedaPoNombre",tiporetencions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporetencionLogic.setTipoRetencions(new ArrayList<TipoRetencion>());
						tiporetencionLogic.getTipoRetencions().addAll(tiporetencionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporetencions=new ArrayList<TipoRetencion>();
							tiporetencions.addAll(tiporetencionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorCodigoSri")) {
				this.sDetalleReporte=TipoRetencionConstantesFunciones.getDetalleIndiceBusquedaPorCodigoSri(codigoBusquedaPorCodigoSri);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tiporetencionLogic.getTipoRetencionsBusquedaPorCodigoSri(finalQueryGlobal,pagination,codigoBusquedaPorCodigoSri);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoRetencionConstantesFunciones.getDetalleIndiceBusquedaPorCodigoSri(codigoBusquedaPorCodigoSri);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoRetencionConstantesFunciones.getDetalleIndiceBusquedaPorCodigoSri(codigoBusquedaPorCodigoSri);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tiporetencionLogic.getTipoRetencions()==null||tiporetencionLogic.getTipoRetencions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tiporetencions==null|| tiporetencions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporetencionsAux=new ArrayList<TipoRetencion>();
						tiporetencionsAux.addAll(tiporetencionLogic.getTipoRetencions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporetencionsAux=new ArrayList<TipoRetencion>();
							tiporetencionsAux.addAll(tiporetencions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tiporetencionLogic.getTipoRetencionsBusquedaPorCodigoSri(finalQueryGlobal,pagination,codigoBusquedaPorCodigoSri);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoRetencionConstantesFunciones.getDetalleIndiceBusquedaPorCodigoSri(codigoBusquedaPorCodigoSri);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoRetencionConstantesFunciones.getDetalleIndiceBusquedaPorCodigoSri(codigoBusquedaPorCodigoSri);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoRetencions("BusquedaPorCodigoSri",tiporetencionLogic.getTipoRetencions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoRetencions("BusquedaPorCodigoSri",tiporetencions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporetencionLogic.setTipoRetencions(new ArrayList<TipoRetencion>());
						tiporetencionLogic.getTipoRetencions().addAll(tiporetencionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporetencions=new ArrayList<TipoRetencion>();
							tiporetencions.addAll(tiporetencionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorId")) {
				this.sDetalleReporte=TipoRetencionConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tiporetencionLogic.getTipoRetencionsBusquedaPorId(finalQueryGlobal,pagination,idBusquedaPorId);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoRetencionConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoRetencionConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tiporetencionLogic.getTipoRetencions()==null||tiporetencionLogic.getTipoRetencions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tiporetencions==null|| tiporetencions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporetencionsAux=new ArrayList<TipoRetencion>();
						tiporetencionsAux.addAll(tiporetencionLogic.getTipoRetencions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporetencionsAux=new ArrayList<TipoRetencion>();
							tiporetencionsAux.addAll(tiporetencions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tiporetencionLogic.getTipoRetencionsBusquedaPorId(finalQueryGlobal,pagination,idBusquedaPorId);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoRetencionConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoRetencionConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoRetencions("BusquedaPorId",tiporetencionLogic.getTipoRetencions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoRetencions("BusquedaPorId",tiporetencions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporetencionLogic.setTipoRetencions(new ArrayList<TipoRetencion>());
						tiporetencionLogic.getTipoRetencions().addAll(tiporetencionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporetencions=new ArrayList<TipoRetencion>();
							tiporetencions.addAll(tiporetencionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoRetencionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tiporetencionLogic.getTipoRetencionsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoRetencionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoRetencionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tiporetencionLogic.getTipoRetencions()==null||tiporetencionLogic.getTipoRetencions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tiporetencions==null|| tiporetencions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporetencionsAux=new ArrayList<TipoRetencion>();
						tiporetencionsAux.addAll(tiporetencionLogic.getTipoRetencions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporetencionsAux=new ArrayList<TipoRetencion>();
							tiporetencionsAux.addAll(tiporetencions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tiporetencionLogic.getTipoRetencionsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoRetencionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoRetencionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoRetencions("FK_IdEmpresa",tiporetencionLogic.getTipoRetencions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoRetencions("FK_IdEmpresa",tiporetencions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporetencionLogic.setTipoRetencions(new ArrayList<TipoRetencion>());
						tiporetencionLogic.getTipoRetencions().addAll(tiporetencionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporetencions=new ArrayList<TipoRetencion>();
							tiporetencions.addAll(tiporetencionsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoRetencion();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoRetencion();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tiporetencionLogic.getTipoRetencions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiporetencions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tiporetencionLogic.getTipoRetencions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiporetencions.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoRetencion tiporetencion) {
		Boolean permite=true;
		
		if(this.tiporetencion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoRetencionConstantesFunciones.getOrderByListaTipoRetencion();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoRetencionConstantesFunciones.getOrderByListaTipoRetencion();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRetencion tiporetencion:tiporetencionLogic.getTipoRetencions()) {
				if(tiporetencion.getsType().equals(Constantes2.S_TOTALES)) {
					tiporetencionTotales=tiporetencion;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRetencion tiporetencion:this.tiporetencions) {
				if(tiporetencion.getsType().equals(Constantes2.S_TOTALES)) {
					tiporetencionTotales=tiporetencion;
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
			this.tiporetencionAux=new TipoRetencion();
			this.tiporetencionAux.setsType(Constantes2.S_TOTALES);
			this.tiporetencionAux.setIsNew(false);
			this.tiporetencionAux.setIsChanged(false);
			this.tiporetencionAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoRetencionConstantesFunciones.TotalizarValoresFilaTipoRetencion(this.tiporetencionLogic.getTipoRetencions(),this.tiporetencionAux);
				
				this.tiporetencionLogic.getTipoRetencions().add(this.tiporetencionAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoRetencionConstantesFunciones.TotalizarValoresFilaTipoRetencion(this.tiporetencions,this.tiporetencionAux);
				
				this.tiporetencions.add(this.tiporetencionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tiporetencionTotales=new TipoRetencion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tiporetencionLogic.getTipoRetencions().remove(tiporetencionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tiporetencions.remove(tiporetencionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tiporetencionTotales=new TipoRetencion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRetencion tiporetencion:tiporetencionLogic.getTipoRetencions()) {
				if(tiporetencion.getsType().equals(Constantes2.S_TOTALES)) {
					tiporetencionTotales=tiporetencion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoRetencionConstantesFunciones.TotalizarValoresFilaTipoRetencion(this.tiporetencionLogic.getTipoRetencions(),tiporetencionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRetencion tiporetencion:this.tiporetencions) {
				if(tiporetencion.getsType().equals(Constantes2.S_TOTALES)) {
					tiporetencionTotales=tiporetencion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoRetencionConstantesFunciones.TotalizarValoresFilaTipoRetencion(this.tiporetencions,tiporetencionTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoRetencionsBusquedaPoNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPoNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoRetencionsBusquedaPorCodigoSri()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigoSri";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoRetencionsBusquedaPorId()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorId";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoRetencionsFK_IdCuentaContable()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaContable";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoRetencionsFK_IdCuentaContableCredito()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaContableCredito";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoRetencionsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoRetencionPorNombre()throws Exception {
		try {
			sAccionBusqueda="PorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getTipoRetencionsBusquedaPoNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporetencionLogic.getTipoRetencionsBusquedaPoNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoRetencionsBusquedaPorCodigoSri(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporetencionLogic.getTipoRetencionsBusquedaPorCodigoSri(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoRetencionsBusquedaPorId(String sFinalQuery,Long id)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporetencionLogic.getTipoRetencionsBusquedaPorId(sFinalQuery,this.pagination,id);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoRetencionsFK_IdCuentaContable(String sFinalQuery,Long id_cuenta_contable)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporetencionLogic.getTipoRetencionsFK_IdCuentaContable(sFinalQuery,this.pagination,id_cuenta_contable);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoRetencionsFK_IdCuentaContableCredito(String sFinalQuery,Long id_cuenta_contable_credito)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporetencionLogic.getTipoRetencionsFK_IdCuentaContableCredito(sFinalQuery,this.pagination,id_cuenta_contable_credito);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoRetencionsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporetencionLogic.getTipoRetencionsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoRetencionPorNombre(String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporetencionLogic.getTipoRetencionPorNombre(nombre);
				
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
	
	public void inicializarPermisosTipoRetencion() {
		this.isPermisoTodoTipoRetencion=false;
		this.isPermisoNuevoTipoRetencion=false;
		this.isPermisoActualizarTipoRetencion=false;
		this.isPermisoActualizarOriginalTipoRetencion=false;
		this.isPermisoEliminarTipoRetencion=false;
		this.isPermisoGuardarCambiosTipoRetencion=false;
		this.isPermisoConsultaTipoRetencion=false;
		this.isPermisoBusquedaTipoRetencion=false;
		this.isPermisoReporteTipoRetencion=false;		
		this.isPermisoOrdenTipoRetencion=false;		
		this.isPermisoPaginacionMedioTipoRetencion=false;		
		this.isPermisoPaginacionAltoTipoRetencion=false;
		this.isPermisoPaginacionTodoTipoRetencion=false;
		this.isPermisoCopiarTipoRetencion=false;		
		this.isPermisoVerFormTipoRetencion=false;		
		this.isPermisoDuplicarTipoRetencion=false;		
		this.isPermisoOrdenTipoRetencion=false;		
	}
	
	public void setPermisosUsuarioTipoRetencion(Boolean isPermiso) {
		this.isPermisoTodoTipoRetencion=isPermiso;
		this.isPermisoNuevoTipoRetencion=isPermiso;
		this.isPermisoActualizarTipoRetencion=isPermiso;
		this.isPermisoActualizarOriginalTipoRetencion=isPermiso;
		this.isPermisoEliminarTipoRetencion=isPermiso;
		this.isPermisoGuardarCambiosTipoRetencion=isPermiso;
		this.isPermisoConsultaTipoRetencion=isPermiso;
		this.isPermisoBusquedaTipoRetencion=isPermiso;
		this.isPermisoReporteTipoRetencion=isPermiso;
		this.isPermisoOrdenTipoRetencion=isPermiso;		
		this.isPermisoPaginacionMedioTipoRetencion=isPermiso;		
		this.isPermisoPaginacionAltoTipoRetencion=isPermiso;		
		this.isPermisoPaginacionTodoTipoRetencion=isPermiso;		
		this.isPermisoCopiarTipoRetencion=isPermiso;		
		this.isPermisoVerFormTipoRetencion=isPermiso;		
		this.isPermisoDuplicarTipoRetencion=isPermiso;
		this.isPermisoOrdenTipoRetencion=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoRetencion(Boolean isPermiso) {
		//this.isPermisoTodoTipoRetencion=isPermiso;
		this.isPermisoNuevoTipoRetencion=isPermiso;
		this.isPermisoActualizarTipoRetencion=isPermiso;
		this.isPermisoActualizarOriginalTipoRetencion=isPermiso;
		this.isPermisoEliminarTipoRetencion=isPermiso;
		this.isPermisoGuardarCambiosTipoRetencion=isPermiso;
		//this.isPermisoConsultaTipoRetencion=isPermiso;
		//this.isPermisoBusquedaTipoRetencion=isPermiso;
		//this.isPermisoReporteTipoRetencion=isPermiso;
		//this.isPermisoOrdenTipoRetencion=isPermiso;		
		//this.isPermisoPaginacionMedioTipoRetencion=isPermiso;		
		//this.isPermisoPaginacionAltoTipoRetencion=isPermiso;		
		//this.isPermisoPaginacionTodoTipoRetencion=isPermiso;		
		//this.isPermisoCopiarTipoRetencion=isPermiso;		
		//this.isPermisoDuplicarTipoRetencion=isPermiso;
		//this.isPermisoOrdenTipoRetencion=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoRetencionClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoRetencionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoRetencion(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoRetencionClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoRetencionClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoRetencionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoRetencionClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoRetencion() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoRetencionJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tiporetencionSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoRetencionConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoRetencion=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoRetencion=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoRetencion=this.isPermisoActualizarTipoRetencion;
			this.isPermisoEliminarTipoRetencion=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoRetencion=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoRetencion=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoRetencion=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoRetencion=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoRetencion=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoRetencion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoRetencion=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoRetencion=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoRetencion=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoRetencion=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoRetencion=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoRetencion=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoRetencion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tiporetencionSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoRetencion.setToolTipText(this.jTableDatosTipoRetencion.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoRetencion(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoRetencion(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoRetencionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoRetencionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoRetencion() throws Exception {
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
	public void inicializarCombosForeignKeyTipoRetencionListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.cuentacontablesForeignKey=new ArrayList();
				this.cuentacontablecreditosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoRetencionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoRetencionJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoRetencionListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoRetencionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoRetencionParameterReturnGeneral tiporetencionReturnGeneral=new TipoRetencionParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tiporetencionConstantesFunciones.cargarid_empresaTipoRetencion)
					 || (this.esRecargarFks && this.tiporetencionConstantesFunciones.cargarid_empresaTipoRetencion)) {

					if(!this.tiporetencionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tiporetencionSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalCuentaContable="";

				if(((this.cuentacontablesForeignKey==null||this.cuentacontablesForeignKey.size()<=0) && this.tiporetencionConstantesFunciones.cargarid_cuenta_contableTipoRetencion)
					 || (this.esRecargarFks && this.tiporetencionConstantesFunciones.cargarid_cuenta_contableTipoRetencion)) {

					if(!this.tiporetencionSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();

						this.arrDatoGeneralNo.add("id_modulo");

						arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCuentaContable=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

						finalQueryGlobalCuentaContable=Funciones.GetFinalQueryAppend(finalQueryGlobalCuentaContable, "");
						finalQueryGlobalCuentaContable+=CuentaContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCuentaContablesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCuentaContable=" WHERE " + ConstantesSql.ID + "="+tiporetencionSessionBean.getlidCuentaContableActual();
					}
				} else {
					finalQueryGlobalCuentaContable="NONE";
				}


				String finalQueryGlobalCuentaContableCredito="";

				if(((this.cuentacontablecreditosForeignKey==null||this.cuentacontablecreditosForeignKey.size()<=0) && this.tiporetencionConstantesFunciones.cargarid_cuenta_contable_creditoTipoRetencion)
					 || (this.esRecargarFks && this.tiporetencionConstantesFunciones.cargarid_cuenta_contable_creditoTipoRetencion)) {

					if(!this.tiporetencionSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableCredito()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();

						this.arrDatoGeneralNo.add("id_modulo");

						arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCuentaContableCredito=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

						finalQueryGlobalCuentaContableCredito=Funciones.GetFinalQueryAppend(finalQueryGlobalCuentaContableCredito, "");
						finalQueryGlobalCuentaContableCredito+=CuentaContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCuentaContableCreditosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCuentaContableCredito=" WHERE " + ConstantesSql.ID + "="+tiporetencionSessionBean.getlidCuentaContableCreditoActual();
					}
				} else {
					finalQueryGlobalCuentaContableCredito="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tiporetencionReturnGeneral=tiporetencionLogic.cargarCombosLoteForeignKeyTipoRetencion(finalQueryGlobalEmpresa,finalQueryGlobalCuentaContable,finalQueryGlobalCuentaContableCredito);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tiporetencionReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalCuentaContable.equals("NONE")) {
				this.cuentacontablesForeignKey=tiporetencionReturnGeneral.getcuentacontablesForeignKey();
			}

			if(!finalQueryGlobalCuentaContableCredito.equals("NONE")) {
				this.cuentacontablecreditosForeignKey=tiporetencionReturnGeneral.getcuentacontablecreditosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoRetencion()throws Exception {
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
			if(this.tiporetencionSessionBean==null) {
				this.tiporetencionSessionBean=new TipoRetencionSessionBean();
			}

			if(!this.tiporetencionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.tiporetencionSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
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

			if(!this.tiporetencionSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableCredito()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoRetencion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoRetencion(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoRetencion()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoRetencion();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoRetencion(TipoRetencion tiporetencion)throws Exception {	
		try {
			
			this.setActualCuentaContableForeignKey(tiporetencion.getid_cuenta_contable(),false,"Formulario");
			this.setActualCuentaContableCreditoForeignKey(tiporetencion.getid_cuenta_contable_credito(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoRetencion(TipoRetencion tiporetencion,String sTipoEvento)throws Exception {	
		try {
			
			

				if(tiporetencion.getCuentaContable()!=null && !sTipoEvento.equals("id_cuenta_contableTipoRetencion")) { //sTipoEvento Evita Bucle Infinito

					this.cuentacontablesForeignKey=new ArrayList<CuentaContable>();
					this.cuentacontablesForeignKey.add(tiporetencion.getCuentaContable());

					this.addItemDefectoCombosForeignKeyCuentaContable();
					this.cargarCombosFrameCuentaContablesForeignKey("Todos");
				}

				if(tiporetencion.getCuentaContableCredito()!=null && !sTipoEvento.equals("id_cuenta_contable_creditoTipoRetencion")) { //sTipoEvento Evita Bucle Infinito

					this.cuentacontablecreditosForeignKey=new ArrayList<CuentaContable>();
					this.cuentacontablecreditosForeignKey.add(tiporetencion.getCuentaContableCredito());

					this.addItemDefectoCombosForeignKeyCuentaContableCredito();
					this.cargarCombosFrameCuentaContableCreditosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoRetencion()throws Exception {	
		try {
			
			this.setActualCuentaContableForeignKey(this.tiporetencionConstantesFunciones.getid_cuenta_contable(),false,"Formulario");
			this.setActualCuentaContableCreditoForeignKey(this.tiporetencionConstantesFunciones.getid_cuenta_contable_credito(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoRetencion()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoRetencion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoRetencion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoRetencion()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoRetencion()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameCuentaContablesForeignKey("Todos");
			this.cargarCombosFrameCuentaContableCreditosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoRetencion(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCuentaContablesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCuentaContableCreditosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoRetencion()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoRetencion.jComboBoxid_empresaTipoRetencion!=null && this.jInternalFrameDetalleFormTipoRetencion.jComboBoxid_empresaTipoRetencion.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoRetencion.jComboBoxid_empresaTipoRetencion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTipoRetencion.jComboBoxid_cuenta_contableTipoRetencion!=null && this.jInternalFrameDetalleFormTipoRetencion.jComboBoxid_cuenta_contableTipoRetencion.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoRetencion.jComboBoxid_cuenta_contableTipoRetencion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTipoRetencion.jComboBoxid_cuenta_contable_creditoTipoRetencion!=null && this.jInternalFrameDetalleFormTipoRetencion.jComboBoxid_cuenta_contable_creditoTipoRetencion.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoRetencion.jComboBoxid_cuenta_contable_creditoTipoRetencion.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public TipoRetencionBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoRetencionBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoRetencionBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tiporetencionSessionBean=new TipoRetencionSessionBean(); 
		this.tiporetencionConstantesFunciones=new TipoRetencionConstantesFunciones(); 
		this.tiporetencionBean=new TipoRetencion();//(this.tiporetencionConstantesFunciones); 		
		this.tiporetencionReturnGeneral=new TipoRetencionParameterReturnGeneral(); 
		
		this.tiporetencionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiporetencionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoRetencionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoRetencionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoRetencionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoRetencion(true);
			
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
			
			this.tiporetencionConstantesFunciones=new TipoRetencionConstantesFunciones(); 
			this.tiporetencionBean=new TipoRetencion();//this.tiporetencionConstantesFunciones); 			
			this.tiporetencionReturnGeneral=new TipoRetencionParameterReturnGeneral(); 
		
			TipoRetencionBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Retencion  Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.tiporetencion=new TipoRetencion();
			this.tiporetencions = new ArrayList<TipoRetencion>();
			this.tiporetencionsAux = new ArrayList<TipoRetencion>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic=new TipoRetencionLogic();
				this.tiporetencionLogic.getNewConnexionToDeep("");
			}
			
			//this.tiporetencionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tiporetencionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoRetencion);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoRetencion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoRetencion);	
					}
					
					if(this.jInternalFrameImportacionTipoRetencion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoRetencion);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoRetencion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoRetencion);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoRetencion!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoRetencion);
				this.jInternalFrameDetalleFormTipoRetencion.setVisible(false);
				this.jInternalFrameDetalleFormTipoRetencion.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoRetencion!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoRetencion);
					this.jInternalFrameReporteDinamicoTipoRetencion.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoRetencion.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoRetencion!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoRetencion);
					this.jInternalFrameImportacionTipoRetencion.setVisible(false);
					this.jInternalFrameImportacionTipoRetencion.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoRetencion!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoRetencion);
					this.jInternalFrameOrderByTipoRetencion.setVisible(false);
					this.jInternalFrameOrderByTipoRetencion.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoRetencionActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoRetencionConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tiporetencionReturnGeneral=new TipoRetencionParameterReturnGeneral();
			
			this.tiporetencionParameterGeneral=new TipoRetencionParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tiporetencionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tiporetencionSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoRetencionJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tiporetencionSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoRetencionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tiporetencionSessionBean.getEsGuardarRelacionado(),this.tiporetencionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoRetencionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tiporetencionSessionBean.getEsGuardarRelacionado(),this.tiporetencionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoRetencion=false;
			this.isVisibilidadCeldaDuplicarTipoRetencion=true;
			this.isVisibilidadCeldaCopiarTipoRetencion=true;
			this.isVisibilidadCeldaVerFormTipoRetencion=true;
			this.isVisibilidadCeldaOrdenTipoRetencion=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoRetencion=false;
			this.isVisibilidadCeldaModificarTipoRetencion=false;
			this.isVisibilidadCeldaActualizarTipoRetencion=false;
			this.isVisibilidadCeldaEliminarTipoRetencion=false;
			this.isVisibilidadCeldaCancelarTipoRetencion=false;
			this.isVisibilidadCeldaGuardarTipoRetencion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRetencion=false;
			
			
			this.isVisibilidadBusquedaPoNombre=true;
			this.isVisibilidadBusquedaPorCodigoSri=true;
			this.isVisibilidadBusquedaPorId=true;
			this.isVisibilidadFK_IdCuentaContable=true;
			this.isVisibilidadFK_IdCuentaContableCredito=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoRetencion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoRetencion();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoRetencion(false);
			
			this.setPermisosUsuarioTipoRetencion();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiporetencionSessionBean.getEsGuardarRelacionado() 
				|| (this.tiporetencionSessionBean.getEsGuardarRelacionado() && this.tiporetencionSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoRetencionClasesRelacionadas();
			}
			
			if(this.tiporetencionSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoRetencionClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoRetencionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoRetencion();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoRetencion();
			}
			
			if(!this.isPermisoBusquedaTipoRetencion) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoRetencion.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiporetencionSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoRetencion,this.isPermisoPaginacionMedioTipoRetencion,this.isPermisoPaginacionTodoTipoRetencion);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoRetencionConstantesFunciones.getTiposSeleccionarTipoRetencion());
				
				this.tiposColumnasSelect=TipoRetencionConstantesFunciones.getTiposSeleccionarTipoRetencion(true);
				
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
			//if(!this.tiporetencionSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoRetencion();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioTipoRetencion(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioTipoRetencion(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoRetencion() ;
			
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
				tiporetencionImplementable= (TipoRetencionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoRetencionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tiporetencionImplementableHome= (TipoRetencionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoRetencionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tiporetencions= new ArrayList<TipoRetencion>();
			this.tiporetencionsEliminados= new ArrayList<TipoRetencion>();
						
			this.isEsNuevoTipoRetencion=false;
			this.esParaAccionDesdeFormularioTipoRetencion=false;
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
				this.cargarCombosForeignKeyTipoRetencion(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoRetencion();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiporetencionSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoRetencionBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoRetencionConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoRetencion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoRetencion(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoRetencion!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoRetencion();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoRetencion();
			}
			
			TipoRetencionBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoRetencion.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoRetencion.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoRetencion.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoRetencion(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoRetencion: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoRetencion() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoRetencion")) {
				iIndex=this.jInternalFrameDetalleFormTipoRetencion.jTabbedPaneRelacionesTipoRetencion.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoRetencion.jTabbedPaneRelacionesTipoRetencion.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoRetencion.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoRetencion();	
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
	
	public void cargarCombosForeignKeyTipoRetencion(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoRetencion(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoRetencion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoRetencionListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoRetencion();
		
		this.cargarCombosFrameForeignKeyTipoRetencion();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoRetencion();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoRetencion();
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
	
	public void jButtonNuevoTipoRetencionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tiporetencionSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoRetencion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiporetencion,new Object(),this.tiporetencionParameterGeneral,this.tiporetencionReturnGeneral);
			
			
			if(jTableDatosTipoRetencion.getRowCount()>=1) {
				jTableDatosTipoRetencion.removeRowSelectionInterval(0, jTableDatosTipoRetencion.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoRetencion=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoRetencion(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoRetencion(true);			
			//this.tiporetencion=new TipoRetencion();
			//this.tiporetencion.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoRetencion(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoRetencion() ;
			
			if(TipoRetencionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoRetencion(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tiporetencion);	
			this.actualizarInformacion("INFO_PADRE",false,this.tiporetencion);				
			
			TipoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiporetencion,new Object(),this.tiporetencionParameterGeneral,this.tiporetencionReturnGeneral);
			
			if(this.tiporetencionSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoRetencion: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tiporetencion,new Object(),this.tiporetencionParameterGeneral,this.tiporetencionReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoRetencionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoRetencion> tiporetencionsSeleccionados=new ArrayList<TipoRetencion>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoRetencion.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoRetencion.getSelectedRows().length;			
			}
			
			tiporetencionsSeleccionados=this.getTipoRetencionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoRetencion--;			
				//TipoRetencion tiporetencionAux= new TipoRetencion();			
				//tiporetencionAux.setId(this.iIdNuevoTipoRetencion);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoRetencion tiporetencionOrigen=new TipoRetencion();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoRetencion tiporetencionOrigen : tiporetencionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoRetencion.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tiporetencionOrigen =(TipoRetencion) this.tiporetencionLogic.getTipoRetencions().toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporetencionOrigen =(TipoRetencion) this.tiporetencions.toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoRetencion();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tiporetencion.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoRetencion(tiporetencionOrigen,this.tiporetencion,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencion(this.tiporetencion);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tiporetencionLogic.getTipoRetencions().add(this.tiporetencionAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tiporetencions.add(this.tiporetencionAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoRetencion(false);
				
				this.jTableDatosTipoRetencion.setRowSelectionInterval(this.getIndiceNuevoTipoRetencion(), this.getIndiceNuevoTipoRetencion());
				
				int iLastRow =  this.jTableDatosTipoRetencion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoRetencion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoRetencion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoRetencion(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoRetencion> tiporetencionsSeleccionados=new ArrayList<TipoRetencion>();									
		
			TipoRetencion tiporetencionOrigen=new TipoRetencion();
			TipoRetencion tiporetencionDestino=new TipoRetencion();
				
			tiporetencionsSeleccionados=this.getTipoRetencionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoRetencion.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tiporetencionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoRetencion.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporetencionOrigen =(TipoRetencion) this.tiporetencionLogic.getTipoRetencions().toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tiporetencionOrigen =(TipoRetencion) this.tiporetencions.toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporetencionDestino =(TipoRetencion) this.tiporetencionLogic.getTipoRetencions().toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tiporetencionDestino =(TipoRetencion) this.tiporetencions.toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tiporetencionOrigen =tiporetencionsSeleccionados.get(0);
				tiporetencionDestino =tiporetencionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoRetencion(tiporetencionOrigen,tiporetencionDestino,true,false);
				
				tiporetencionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tiporetencionDestino,tiporetencionLogic.getTipoRetencions());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiporetencionDestino,tiporetencions);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoRetencion(false);
				
				//this.jTableDatosTipoRetencion.setRowSelectionInterval(this.getIndiceNuevoTipoRetencion(), this.getIndiceNuevoTipoRetencion());
				
				int iLastRow =  this.jTableDatosTipoRetencion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoRetencion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoRetencion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoRetencion(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoRetencion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoRetencion.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoRetencion.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoRetencion.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoRetencion.setVisible(!isVisible);
			this.jPanelPaginacionTipoRetencion.setVisible(!isVisible);
			this.jPanelAccionesTipoRetencion.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoRetencion();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoRetencion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoRetencion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoRetencion();
			
			this.abrirFrameOrderByTipoRetencion();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoRetencion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoRetencion(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoRetencion);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoRetencion.isMaximum()) {
					this.jInternalFrameDetalleFormTipoRetencion.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoRetencion.setSize(this.jInternalFrameDetalleFormTipoRetencion.iWidthFormulario,this.jInternalFrameDetalleFormTipoRetencion.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoRetencion.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoRetencion.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoRetencion.isMaximum()) {
						this.jInternalFrameDetalleFormTipoRetencion.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoRetencion.jContentPaneDetalleTipoRetencion.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoRetencion.jTabbedPaneRelacionesTipoRetencion.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoRetencion.jContentPaneDetalleTipoRetencion.getWidth(),TipoRetencionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoRetencion.jTabbedPaneRelacionesTipoRetencion.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoRetencion.jContentPaneDetalleTipoRetencion.getWidth(),TipoRetencionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoRetencion.jTabbedPaneRelacionesTipoRetencion.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoRetencion.jContentPaneDetalleTipoRetencion.getWidth(),TipoRetencionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoRetencion.setVisible(true);
	        this.jInternalFrameDetalleFormTipoRetencion.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoRetencion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoRetencion==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoRetencion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoRetencion,false,this);
				} else {
					this.jInternalFrameOrderByTipoRetencion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoRetencion,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoRetencion);
				this.jInternalFrameOrderByTipoRetencion.setVisible(false);
				this.jInternalFrameOrderByTipoRetencion.setSelected(false);
				
				this.jInternalFrameOrderByTipoRetencion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoRetencion"));
				
				this.inicializarActualizarBindingTablaOrderByTipoRetencion();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoRetencion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoRetencion==null) {
				
				this.jInternalFrameImportacionTipoRetencion=new ImportacionJInternalFrame(TipoRetencionConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoRetencion);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoRetencion);
				this.jInternalFrameImportacionTipoRetencion.setVisible(false);
				this.jInternalFrameImportacionTipoRetencion.setSelected(false);


				this.jInternalFrameImportacionTipoRetencion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoRetencion"));
				this.jInternalFrameImportacionTipoRetencion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoRetencion"));
				this.jInternalFrameImportacionTipoRetencion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoRetencion"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoRetencion() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoRetencion==null) {
				this.jInternalFrameReporteDinamicoTipoRetencion=new ReporteDinamicoJInternalFrame(TipoRetencionConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoRetencion);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoRetencion);
				this.jInternalFrameReporteDinamicoTipoRetencion.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoRetencion.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoRetencion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoRetencion"));
				this.jInternalFrameReporteDinamicoTipoRetencion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoRetencion"));
				this.jInternalFrameReporteDinamicoTipoRetencion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoRetencion"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoRetencion();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetalleTipoRetencion() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoRetencion);
			
	       	this.jInternalFrameDetalleFormTipoRetencion.setVisible(false);
	        this.jInternalFrameDetalleFormTipoRetencion.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoRetencion.dispose();
			//this.jInternalFrameDetalleFormTipoRetencion=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoRetencion() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoRetencion.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoRetencion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoRetencion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoRetencion.setVisible(true);
	        this.jInternalFrameImportacionTipoRetencion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoRetencion() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoRetencion.setVisible(true);
	        this.jInternalFrameOrderByTipoRetencion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoRetencion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoRetencion.setVisible(false);
	        this.jInternalFrameOrderByTipoRetencion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoRetencion() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoRetencion.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoRetencion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoRetencion() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoRetencion.setVisible(false);
	        this.jInternalFrameImportacionTipoRetencion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
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
						TitledBorder titledBorderTipoRetencion=(TitledBorder)this.jScrollPanelDatosTipoRetencion.getBorder();
						TitledBorder titledBorderCuentaContable=(TitledBorder)cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

						titledBorderCuentaContable.setTitle(titledBorderTipoRetencion.getTitle() + " -> Cuenta Contable");


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
						TitledBorder titledBorderTipoRetencion=(TitledBorder)this.jScrollPanelDatosTipoRetencion.getBorder();
						TitledBorder titledBorderCuentaContableCredito=(TitledBorder)cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

						titledBorderCuentaContableCredito.setTitle(titledBorderTipoRetencion.getTitle() + " -> Cuenta Contable");


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
	
	public void jButtonModificarTipoRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoRetencion(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoRetencion(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoRetencion.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoRetencion(true);
			//this.isEsNuevoTipoRetencion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencion =(TipoRetencion) this.tiporetencionLogic.getTipoRetencions().toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiporetencion =(TipoRetencion) this.tiporetencions.toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoRetencion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoRetencion(false) ;
			
			if(tiporetencionSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoRetencionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoRetencion(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoRetencion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoRetencionActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoRetencion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencion =(TipoRetencion) this.tiporetencionLogic.getTipoRetencions().toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporetencion =(TipoRetencion) this.tiporetencions.toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoRetencion(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoRetencion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoRetencion.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoRetencion(true);
			//this.isEsNuevoTipoRetencion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencion =(TipoRetencion) this.tiporetencionLogic.getTipoRetencions().toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiporetencion =(TipoRetencion) this.tiporetencions.toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tiporetencion.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoRetencion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoRetencion(false) ;
			
			if(TipoRetencionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoRetencion(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoRetencion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("CuentaContable")) {
				if(!this.tiporetencionConstantesFunciones.cargarid_cuenta_contableTipoRetencion) {
					this.cargarCombosCuentaContablesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingTipoRetencion(false,false);
					this.cargarCombosFrameCuentaContablesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cuenta_contable (id);

				this.recargarComboTablaCuentaContable(this.cuentacontablesForeignKey);

			}
			
			if(sType.equals("CuentaContableCredito")) {
				if(!this.tiporetencionConstantesFunciones.cargarid_cuenta_contable_creditoTipoRetencion) {
					this.cargarCombosCuentaContableCreditosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingTipoRetencion(false,false);
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
		TableColumn tableColumnCuentaContable=this.jTableDatosTipoRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRetencion,TipoRetencionConstantesFunciones.LABEL_IDCUENTACONTABLE));
		TableCellEditor tableCellEditorCuentaContable =tableColumnCuentaContable.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContable;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontablesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTipoRetencion.getSelectedRow();

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
		TableColumn tableColumnCuentaContableCredito=this.jTableDatosTipoRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRetencion,TipoRetencionConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO));
		TableCellEditor tableCellEditorCuentaContableCredito =tableColumnCuentaContableCredito.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContableCredito;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontablecreditosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTipoRetencion.getSelectedRow();

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
	
	public void jButtonActualizarTipoRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoRetencion(false);
			
			//if(!this.isEsNuevoTipoRetencion) {								
				int intSelectedRow = this.jTableDatosTipoRetencion.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencion =(TipoRetencion) this.tiporetencionLogic.getTipoRetencions().toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiporetencion =(TipoRetencion) this.tiporetencions.toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoRetencion(this.tiporetencion,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencion(this.tiporetencion);
				
			}
			
			if(this.permiteMantenimiento(this.tiporetencion)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tiporetencionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoRetencion=true;
					this.inicializarActualizarBindingTablaTipoRetencion(false);
					this.isEsNuevoTipoRetencion=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoRetencion=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoRetencion=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoRetencion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoRetencion(false);
				
				this.habilitarDeshabilitarControlesTipoRetencion(false);
			
												
				
				if(TipoRetencionJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoRetencion();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoRetencionActionPerformed(evt,tiporetencionSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoRetencion(this.tiporetencion,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoRetencion.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tiporetencionSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tiporetencion.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoRetencion.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRetencion.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoRetencion.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencion =(TipoRetencion) this.tiporetencionLogic.getTipoRetencions().toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
				this.tiporetencion.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiporetencion =(TipoRetencion) this.tiporetencions.toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
				this.tiporetencion.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tiporetencion)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tiporetencionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoRetencionModel) this.jTableDatosTipoRetencion.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoRetencion=true;
				this.inicializarActualizarBindingTablaTipoRetencion(false);
				this.isEsNuevoTipoRetencion=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoRetencion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoRetencion(false);
				
				this.habilitarDeshabilitarControlesTipoRetencion(false);
				
				
				
				if(TipoRetencionJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoRetencion();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoRetencionActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoRetencion.getRowCount()>=1) {
				jTableDatosTipoRetencion.removeRowSelectionInterval(0, jTableDatosTipoRetencion.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoRetencion(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoRetencion(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoRetencion(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoRetencion(false) ;
			
			this.isEsNuevoTipoRetencion=false;
			
			if(TipoRetencionJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoRetencion();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoRetencionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoRetencion(false);
				
				//SI ES MANUAL
				if(TipoRetencionJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoRetencion();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoRetencionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoRetencion--;			
			//TipoRetencion tiporetencionAux= new TipoRetencion();			
			//tiporetencionAux.setId(this.iIdNuevoTipoRetencion);
			
			if(this.jInternalFrameDetalleFormTipoRetencion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoRetencion();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencion(this.tiporetencion);
			
			this.tiporetencion.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tiporetencionLogic.getTipoRetencions().add(this.tiporetencionAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tiporetencions.add(this.tiporetencionAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoRetencion(false);
			
			this.jTableDatosTipoRetencion.setRowSelectionInterval(this.getIndiceNuevoTipoRetencion(), this.getIndiceNuevoTipoRetencion());
			
			int iLastRow =  this.jTableDatosTipoRetencion.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoRetencion.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoRetencion.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoRetencion(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoRetencionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoRetencion(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoRetencion(false);
			
			//SI ES MANUAL
			if(TipoRetencionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoRetencion();
			}
			
			//this.abrirFrameTreeTipoRetencion();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoRetencionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Retencion S ?", "MANTENIMIENTO DE Tipo Retencion ", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoRetencion.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoRetencion();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tiporetencionReturnGeneral=tiporetencionLogic.procesarImportacionTipoRetencionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tiporetencionParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoRetencionReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoRetencionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoRetencion.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoRetencion.setFileImportacion(this.jInternalFrameImportacionTipoRetencion.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoRetencion.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoRetencion.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoRetencion.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoRetencion.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoRetencionActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoRetencion> tiporetencionsSeleccionados=new ArrayList<TipoRetencion>();		

		tiporetencionsSeleccionados=this.getTipoRetencionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoRetencion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoRetencion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoRetencionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoRetencionBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoRetencions("Todos",tiporetencionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporetencionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Retencion ",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoRetencion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRetencion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoRetencionConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoRetencionConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoRetencionConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoRetencionConstantesFunciones.LABEL_PORCENTAJE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentaje_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentaje_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentaje_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentaje_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoRetencionConstantesFunciones.LABEL_MONTOMINIMO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntoMinimo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntoMinimo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntoMinimo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntoMinimo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoRetencionConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CuentaContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CuentaContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CuentaContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CuentaContable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoRetencionConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CuentaContableCredito_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CuentaContableCredito_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CuentaContableCredito_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CuentaContableCredito_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoRetencionConstantesFunciones.LABEL_ESRETENCIONIVA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_RetencionIva_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_RetencionIva_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_RetencionIva_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_RetencionIva_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoRetencionConstantesFunciones.LABEL_ESDEBITO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Debito_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Debito_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Debito_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Debito_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoRetencionConstantesFunciones.LABEL_ESCONIVAFACTURA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ConIvaFactura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ConIvaFactura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ConIvaFactura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ConIvaFactura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoRetencionConstantesFunciones.LABEL_ESCONSUBTOTALFACTURA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ConSubTotalFactura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ConSubTotalFactura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ConSubTotalFactura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ConSubTotalFactura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoRetencionConstantesFunciones.LABEL_ESCONSECUENCIAL:
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
		
		if(this.jInternalFrameReporteDinamicoTipoRetencion.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoRetencion.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoRetencion.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoRetencionConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoRetencionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case TipoRetencionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoRetencionConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoria="porcentaje";
					break;

				case TipoRetencionConstantesFunciones.LABEL_MONTOMINIMO:
					sNombreCampoCategoria="monto_minimo";
					break;

				case TipoRetencionConstantesFunciones.LABEL_IDCUENTACONTABLE:
					sNombreCampoCategoria="id_cuenta_contable";
					break;

				case TipoRetencionConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO:
					sNombreCampoCategoria="id_cuenta_contable_credito";
					break;

				case TipoRetencionConstantesFunciones.LABEL_ESRETENCIONIVA:
					sNombreCampoCategoria="es_retencion_iva";
					break;

				case TipoRetencionConstantesFunciones.LABEL_ESDEBITO:
					sNombreCampoCategoria="es_debito";
					break;

				case TipoRetencionConstantesFunciones.LABEL_ESCONIVAFACTURA:
					sNombreCampoCategoria="es_con_iva_factura";
					break;

				case TipoRetencionConstantesFunciones.LABEL_ESCONSUBTOTALFACTURA:
					sNombreCampoCategoria="es_con_sub_total_factura";
					break;

				case TipoRetencionConstantesFunciones.LABEL_ESCONSECUENCIAL:
					sNombreCampoCategoria="es_con_secuencial";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoRetencion.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoRetencionConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoRetencionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case TipoRetencionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoRetencionConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoriaValor="porcentaje";
					break;

				case TipoRetencionConstantesFunciones.LABEL_MONTOMINIMO:
					sNombreCampoCategoriaValor="monto_minimo";
					break;

				case TipoRetencionConstantesFunciones.LABEL_IDCUENTACONTABLE:
					sNombreCampoCategoriaValor="id_cuenta_contable";
					break;

				case TipoRetencionConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO:
					sNombreCampoCategoriaValor="id_cuenta_contable_credito";
					break;

				case TipoRetencionConstantesFunciones.LABEL_ESRETENCIONIVA:
					sNombreCampoCategoriaValor="es_retencion_iva";
					break;

				case TipoRetencionConstantesFunciones.LABEL_ESDEBITO:
					sNombreCampoCategoriaValor="es_debito";
					break;

				case TipoRetencionConstantesFunciones.LABEL_ESCONIVAFACTURA:
					sNombreCampoCategoriaValor="es_con_iva_factura";
					break;

				case TipoRetencionConstantesFunciones.LABEL_ESCONSUBTOTALFACTURA:
					sNombreCampoCategoriaValor="es_con_sub_total_factura";
					break;

				case TipoRetencionConstantesFunciones.LABEL_ESCONSECUENCIAL:
					sNombreCampoCategoriaValor="es_con_secuencial";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoRetencion.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRetencion.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoRetencionConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoRetencionConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case TipoRetencionConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Sri",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoRetencionConstantesFunciones.LABEL_PORCENTAJE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje");
					break;

				case TipoRetencionConstantesFunciones.LABEL_MONTOMINIMO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Monto Minimo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"monto_minimo");
					break;

				case TipoRetencionConstantesFunciones.LABEL_IDCUENTACONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cuenta Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cuenta_contable");
					break;

				case TipoRetencionConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cuenta Contable Credito",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cuenta_contable_credito");
					break;

				case TipoRetencionConstantesFunciones.LABEL_ESRETENCIONIVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Retencion Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_retencion_iva");
					break;

				case TipoRetencionConstantesFunciones.LABEL_ESDEBITO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Debito",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_debito");
					break;

				case TipoRetencionConstantesFunciones.LABEL_ESCONIVAFACTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Con Iva Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_con_iva_factura");
					break;

				case TipoRetencionConstantesFunciones.LABEL_ESCONSUBTOTALFACTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Con Sub Total Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_con_sub_total_factura");
					break;

				case TipoRetencionConstantesFunciones.LABEL_ESCONSECUENCIAL:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoRetencionActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoRetencion> tiporetencionsSeleccionados=new ArrayList<TipoRetencion>();		
		
		tiporetencionsSeleccionados=this.getTipoRetencionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporetencion";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoRetencions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoRetencion.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRetencion.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoRetencionConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoRetencionConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoRetencion tiporetencion:tiporetencionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiporetencion.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoRetencionConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoRetencionConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoRetencion tiporetencion:tiporetencionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiporetencion.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoRetencionConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoRetencionConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoRetencion tiporetencion:tiporetencionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiporetencion.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoRetencionConstantesFunciones.LABEL_PORCENTAJE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoRetencionConstantesFunciones.LABEL_PORCENTAJE);
					iRow++;

					for(TipoRetencion tiporetencion:tiporetencionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiporetencion.getporcentaje());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoRetencionConstantesFunciones.LABEL_MONTOMINIMO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoRetencionConstantesFunciones.LABEL_MONTOMINIMO);
					iRow++;

					for(TipoRetencion tiporetencion:tiporetencionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiporetencion.getmonto_minimo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoRetencionConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoRetencionConstantesFunciones.LABEL_IDCUENTACONTABLE);
					iRow++;

					for(TipoRetencion tiporetencion:tiporetencionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiporetencion.getcuentacontable_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoRetencionConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoRetencionConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO);
					iRow++;

					for(TipoRetencion tiporetencion:tiporetencionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiporetencion.getcuentacontablecredito_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoRetencionConstantesFunciones.LABEL_ESRETENCIONIVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoRetencionConstantesFunciones.LABEL_ESRETENCIONIVA);
					iRow++;

					for(TipoRetencion tiporetencion:tiporetencionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiporetencion.getes_retencion_iva());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoRetencionConstantesFunciones.LABEL_ESDEBITO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoRetencionConstantesFunciones.LABEL_ESDEBITO);
					iRow++;

					for(TipoRetencion tiporetencion:tiporetencionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiporetencion.getes_debito());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoRetencionConstantesFunciones.LABEL_ESCONIVAFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoRetencionConstantesFunciones.LABEL_ESCONIVAFACTURA);
					iRow++;

					for(TipoRetencion tiporetencion:tiporetencionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiporetencion.getes_con_iva_factura());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoRetencionConstantesFunciones.LABEL_ESCONSUBTOTALFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoRetencionConstantesFunciones.LABEL_ESCONSUBTOTALFACTURA);
					iRow++;

					for(TipoRetencion tiporetencion:tiporetencionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiporetencion.getes_con_sub_total_factura());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoRetencionConstantesFunciones.LABEL_ESCONSECUENCIAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoRetencionConstantesFunciones.LABEL_ESCONSECUENCIAL);
					iRow++;

					for(TipoRetencion tiporetencion:tiporetencionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiporetencion.getes_con_secuencial());
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
			//	this.getFilaCabeceraExportarExcelTipoRetencion(row);				
			//	iRow++;
			//}				
			
			//for(TipoRetencion tiporetencionAux:tiporetencionsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoRetencion(tiporetencionAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporetencionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Retencion ",JOptionPane.INFORMATION_MESSAGE);
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
				this.tiporetencionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoRetencion(false);
			
			//SI ES MANUAL
			if(TipoRetencionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoRetencion();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoRetencionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoRetencion(false);
			
			//SI ES MANUAL
			if(TipoRetencionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoRetencion();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoRetencionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoRetencion(false);
			
			//SI ES MANUAL
			if(TipoRetencionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoRetencion();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoRetencion() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoRetencion.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoRetencion.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoRetencion.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoRetencion.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoRetencion.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoRetencion.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoRetencion.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoRetencion(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoRetencion(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoRetencion(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoRetencion(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoRetencion(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tiporetencionSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoRetencion(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoRetencion(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoRetencion(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoRetencionJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoRetencionJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoRetencion() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoRetencion();
		
		this.inicializarActualizarBindingBotonesManualTipoRetencion(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tiporetencionSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoRetencion();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoRetencion() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoRetencion(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoRetencion(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoRetencion.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoRetencion.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoRetencion.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoRetencion!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoRetencion.jCheckBoxPostAccionNuevoTipoRetencion.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoRetencion.jCheckBoxPostAccionSinCerrarTipoRetencion.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoRetencion.jCheckBoxPostAccionSinMensajeTipoRetencion.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoRetencion.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoRetencion.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoRetencion.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoRetencion!=null) {
				this.jInternalFrameDetalleFormTipoRetencion.jCheckBoxPostAccionNuevoTipoRetencion.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoRetencion.jCheckBoxPostAccionSinCerrarTipoRetencion.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoRetencion.jCheckBoxPostAccionSinMensajeTipoRetencion.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoRetencion.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoRetencion.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoRetencion!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoRetencion.jComboBoxTiposAccionesFormularioTipoRetencion.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoRetencion.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoRetencion!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoRetencion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoRetencion.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoRetencion.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoRetencion.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoRetencion.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoRetencion!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoRetencion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoRetencion.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoRetencion.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoRetencion(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoRetencionJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoRetencion(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoRetencion() throws Exception {
		try	{
			if(TipoRetencionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoRetencion();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoRetencion() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoRetencion.jComboBoxTiposAccionesFormularioTipoRetencion.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoRetencion.jComboBoxTiposAccionesFormularioTipoRetencion.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoRetencion() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoRetencion.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoRetencion.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoRetencion.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoRetencion.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoRetencion.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoRetencion.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoRetencion.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoRetencion.addItem(reporte);
			}
			
			
			if(!this.tiporetencionSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoRetencion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoRetencion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoRetencion.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoRetencion.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoRetencion.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoRetencion.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoRetencion!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoRetencion.jComboBoxTiposAccionesFormularioTipoRetencion.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoRetencion.jComboBoxTiposAccionesFormularioTipoRetencion.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoRetencion.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoRetencion.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoRetencion.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoRetencion();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoRetencion() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoRetencion!=null) {
				this.jInternalFrameReporteDinamicoTipoRetencion.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoRetencion.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoRetencion!=null) {
				this.jInternalFrameReporteDinamicoTipoRetencion.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoRetencion.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoRetencion!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoRetencion.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoRetencion.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoRetencion.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoRetencion.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoRetencion.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoRetencion.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoRetencion.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoTipoRetencion.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=TipoRetencionConstantesFunciones.getTiposSeleccionarTipoRetencion(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoTipoRetencion.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoRetencion.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoTipoRetencion.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=TipoRetencionConstantesFunciones.getTiposSeleccionarTipoRetencion(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoTipoRetencion.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoTipoRetencion.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoTipoRetencion.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=TipoRetencionConstantesFunciones.getTiposSeleccionarTipoRetencion(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoRetencion.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoTipoRetencion.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoTipoRetencion.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoTipoRetencion.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoRetencion()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.nombreBusquedaPoNombre=this.jTextAreanombreBusquedaPoNombreTipoRetencion.getText();
		this.codigoBusquedaPorCodigoSri=this.jTextFieldcodigoBusquedaPorCodigoSriTipoRetencion.getText();
		//this.idBusquedaPorId=Long.parseLong(this.jTextFieldidTipoRetencionBusquedaPorId.getText());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoRetencion(Boolean esInicializar) throws Exception {				
		if(TipoRetencionJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoRetencion();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoRetencion() throws Exception {
		this.inicializarActualizarBindingTablaTipoRetencion(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoRetencion() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoRetencion.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoRetencion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoRetencion.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoRetencionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoRetencion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoRetencion.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoRetencionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoRetencionOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRetencionOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoRetencionPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoRetencion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoRetencion.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoRetencionPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoRetencion.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoRetencion(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tiporetencionLogic.getTipoRetencions().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tiporetencions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoRetencion.setModel(new TipoRetencionModel(this.tiporetencionLogic.getTipoRetencions(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoRetencion.setModel(new TipoRetencionModel(this.tiporetencions,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoRetencion!=null && this.jInternalFrameOrderByTipoRetencion.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoRetencion();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRetencion,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoRetencionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoRetencionConstantesFunciones.SCLASSWEBTITULO,tiporetencionConstantesFunciones.resaltarSeleccionarTipoRetencion,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoRetencionConstantesFunciones.SCLASSWEBTITULO,tiporetencionConstantesFunciones.resaltarSeleccionarTipoRetencion,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRetencion,TipoRetencionConstantesFunciones.LABEL_ID));

		if(this.tiporetencionConstantesFunciones.mostraridTipoRetencion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRetencionConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tiporetencionConstantesFunciones.resaltaridTipoRetencion,this.tiporetencionConstantesFunciones.activaridTipoRetencion,iSizeTabla,this,true,"idTipoRetencion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiporetencionConstantesFunciones.resaltaridTipoRetencion,this.tiporetencionConstantesFunciones.activaridTipoRetencion,this,true,"idTipoRetencion","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRetencion,TipoRetencionConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tiporetencionConstantesFunciones.mostrarid_empresaTipoRetencion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRetencionConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tiporetencionConstantesFunciones.resaltarid_empresaTipoRetencion,this,this.tiporetencionConstantesFunciones.activarid_empresaTipoRetencion,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tiporetencionConstantesFunciones.resaltarid_empresaTipoRetencion,this,this.tiporetencionConstantesFunciones.activarid_empresaTipoRetencion,false,"id_empresaTipoRetencion","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoRetencionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRetencion,TipoRetencionConstantesFunciones.LABEL_NOMBRE));

		if(this.tiporetencionConstantesFunciones.mostrarnombreTipoRetencion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRetencionConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tiporetencionConstantesFunciones.resaltarnombreTipoRetencion,this.tiporetencionConstantesFunciones.activarnombreTipoRetencion,iSizeTabla,this,true,"nombreTipoRetencion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiporetencionConstantesFunciones.resaltarnombreTipoRetencion,this.tiporetencionConstantesFunciones.activarnombreTipoRetencion,this,true,"nombreTipoRetencion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new TipoRetencionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRetencion,TipoRetencionConstantesFunciones.LABEL_CODIGO));

		if(this.tiporetencionConstantesFunciones.mostrarcodigoTipoRetencion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRetencionConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tiporetencionConstantesFunciones.resaltarcodigoTipoRetencion,this.tiporetencionConstantesFunciones.activarcodigoTipoRetencion,iSizeTabla,this,true,"codigoTipoRetencion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiporetencionConstantesFunciones.resaltarcodigoTipoRetencion,this.tiporetencionConstantesFunciones.activarcodigoTipoRetencion,this,true,"codigoTipoRetencion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoRetencionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRetencion,TipoRetencionConstantesFunciones.LABEL_PORCENTAJE));

		if(this.tiporetencionConstantesFunciones.mostrarporcentajeTipoRetencion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRetencionConstantesFunciones.LABEL_PORCENTAJE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tiporetencionConstantesFunciones.resaltarporcentajeTipoRetencion,this.tiporetencionConstantesFunciones.activarporcentajeTipoRetencion,iSizeTabla,this,true,"porcentajeTipoRetencion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiporetencionConstantesFunciones.resaltarporcentajeTipoRetencion,this.tiporetencionConstantesFunciones.activarporcentajeTipoRetencion,this,true,"porcentajeTipoRetencion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TipoRetencionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRetencion,TipoRetencionConstantesFunciones.LABEL_MONTOMINIMO));

		if(this.tiporetencionConstantesFunciones.mostrarmonto_minimoTipoRetencion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRetencionConstantesFunciones.LABEL_MONTOMINIMO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tiporetencionConstantesFunciones.resaltarmonto_minimoTipoRetencion,this.tiporetencionConstantesFunciones.activarmonto_minimoTipoRetencion,iSizeTabla,this,true,"monto_minimoTipoRetencion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiporetencionConstantesFunciones.resaltarmonto_minimoTipoRetencion,this.tiporetencionConstantesFunciones.activarmonto_minimoTipoRetencion,this,true,"monto_minimoTipoRetencion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TipoRetencionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRetencion,TipoRetencionConstantesFunciones.LABEL_IDCUENTACONTABLE));

		if(this.tiporetencionConstantesFunciones.mostrarid_cuenta_contableTipoRetencion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRetencionConstantesFunciones.LABEL_IDCUENTACONTABLE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CuentaContableTableCell(this.cuentacontablesForeignKey,this.tiporetencionConstantesFunciones.resaltarid_cuenta_contableTipoRetencion,this,this.tiporetencionConstantesFunciones.activarid_cuenta_contableTipoRetencion,iSizeTabla));
			tableColumn.setCellEditor(new CuentaContableTableCell(this.cuentacontablesForeignKey,this.tiporetencionConstantesFunciones.resaltarid_cuenta_contableTipoRetencion,this,this.tiporetencionConstantesFunciones.activarid_cuenta_contableTipoRetencion,true,"id_cuenta_contableTipoRetencion","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70);
			//tableColumn.addPropertyChangeListener(new TipoRetencionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRetencion,TipoRetencionConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO));

		if(this.tiporetencionConstantesFunciones.mostrarid_cuenta_contable_creditoTipoRetencion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRetencionConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CuentaContableTableCell(this.cuentacontablecreditosForeignKey,this.tiporetencionConstantesFunciones.resaltarid_cuenta_contable_creditoTipoRetencion,this,this.tiporetencionConstantesFunciones.activarid_cuenta_contable_creditoTipoRetencion,iSizeTabla));
			tableColumn.setCellEditor(new CuentaContableTableCell(this.cuentacontablecreditosForeignKey,this.tiporetencionConstantesFunciones.resaltarid_cuenta_contable_creditoTipoRetencion,this,this.tiporetencionConstantesFunciones.activarid_cuenta_contable_creditoTipoRetencion,true,"id_cuenta_contable_creditoTipoRetencion","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70);
			//tableColumn.addPropertyChangeListener(new TipoRetencionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRetencion,TipoRetencionConstantesFunciones.LABEL_ESRETENCIONIVA));

		if(this.tiporetencionConstantesFunciones.mostrares_retencion_ivaTipoRetencion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRetencionConstantesFunciones.LABEL_ESRETENCIONIVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.tiporetencionConstantesFunciones.resaltares_retencion_ivaTipoRetencion,this.tiporetencionConstantesFunciones.activares_retencion_ivaTipoRetencion,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.tiporetencionConstantesFunciones.resaltares_retencion_ivaTipoRetencion,this.tiporetencionConstantesFunciones.activares_retencion_ivaTipoRetencion,this,true,"es_retencion_ivaTipoRetencion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TipoRetencionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRetencion,TipoRetencionConstantesFunciones.LABEL_ESDEBITO));

		if(this.tiporetencionConstantesFunciones.mostrares_debitoTipoRetencion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRetencionConstantesFunciones.LABEL_ESDEBITO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.tiporetencionConstantesFunciones.resaltares_debitoTipoRetencion,this.tiporetencionConstantesFunciones.activares_debitoTipoRetencion,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.tiporetencionConstantesFunciones.resaltares_debitoTipoRetencion,this.tiporetencionConstantesFunciones.activares_debitoTipoRetencion,this,true,"es_debitoTipoRetencion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TipoRetencionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRetencion,TipoRetencionConstantesFunciones.LABEL_ESCONIVAFACTURA));

		if(this.tiporetencionConstantesFunciones.mostrares_con_iva_facturaTipoRetencion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRetencionConstantesFunciones.LABEL_ESCONIVAFACTURA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.tiporetencionConstantesFunciones.resaltares_con_iva_facturaTipoRetencion,this.tiporetencionConstantesFunciones.activares_con_iva_facturaTipoRetencion,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.tiporetencionConstantesFunciones.resaltares_con_iva_facturaTipoRetencion,this.tiporetencionConstantesFunciones.activares_con_iva_facturaTipoRetencion,this,true,"es_con_iva_facturaTipoRetencion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TipoRetencionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRetencion,TipoRetencionConstantesFunciones.LABEL_ESCONSUBTOTALFACTURA));

		if(this.tiporetencionConstantesFunciones.mostrares_con_sub_total_facturaTipoRetencion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRetencionConstantesFunciones.LABEL_ESCONSUBTOTALFACTURA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.tiporetencionConstantesFunciones.resaltares_con_sub_total_facturaTipoRetencion,this.tiporetencionConstantesFunciones.activares_con_sub_total_facturaTipoRetencion,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.tiporetencionConstantesFunciones.resaltares_con_sub_total_facturaTipoRetencion,this.tiporetencionConstantesFunciones.activares_con_sub_total_facturaTipoRetencion,this,true,"es_con_sub_total_facturaTipoRetencion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TipoRetencionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRetencion,TipoRetencionConstantesFunciones.LABEL_ESCONSECUENCIAL));

		if(this.tiporetencionConstantesFunciones.mostrares_con_secuencialTipoRetencion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRetencionConstantesFunciones.LABEL_ESCONSECUENCIAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.tiporetencionConstantesFunciones.resaltares_con_secuencialTipoRetencion,this.tiporetencionConstantesFunciones.activares_con_secuencialTipoRetencion,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.tiporetencionConstantesFunciones.resaltares_con_secuencialTipoRetencion,this.tiporetencionConstantesFunciones.activares_con_secuencialTipoRetencion,this,true,"es_con_secuencialTipoRetencion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TipoRetencionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tiporetencionSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tiporetencionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tiporetencionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoRetencion.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tiporetencionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tiporetencionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoRetencion.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoRetencion && this.isPermisoGuardarCambiosTipoRetencion) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tiporetencionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tiporetencionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoRetencion.addColumn(tableColumn);
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
			
			this.jTableDatosTipoRetencion.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoRetencion && this.isPermisoGuardarCambiosTipoRetencion) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoRetencion && this.isPermisoGuardarCambiosTipoRetencion) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoRetencion.moveColumn(this.jTableDatosTipoRetencion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoRetencion.moveColumn(this.jTableDatosTipoRetencion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoRetencion.moveColumn(this.jTableDatosTipoRetencion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoRetencion.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoRetencion.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoRetencion,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoRetencion.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoRetencion.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoRetencion.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoRetencion.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoRetencion.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tiporetencionLogic.getTipoRetencions().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tiporetencions.size()-1;
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
		//this.jTableDatosTipoRetencion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoRetencion();
			
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
				
				//this.isEsNuevoTipoRetencion=false;
					
				TipoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tiporetencion,new Object(),this.tiporetencionParameterGeneral,this.tiporetencionReturnGeneral);
			
				if(this.tiporetencionSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoRetencion==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoRetencion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoRetencion.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencion =(TipoRetencion) this.tiporetencionLogic.getTipoRetencions().toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporetencion =(TipoRetencion) this.tiporetencions.toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tiporetencion.getsType().equals("DUPLICADO")
				   || this.tiporetencion.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoRetencion=true;
				
				} else {
					this.isEsNuevoTipoRetencion=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tiporetencionSessionBean.getEsGuardarRelacionado()) {
					if(this.tiporetencion.getId()>=0 && !this.tiporetencion.getIsNew()) {						
						this.isEsNuevoTipoRetencion=false;
						
					} else {
						this.isEsNuevoTipoRetencion=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoRetencion(esRelaciones);						
				
				this.seleccionarTipoRetencion(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tiporetencion.getId()<0) {
					this.isEsNuevoTipoRetencion=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoRetencion(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoRetencion(evt,rowIndex);
				}	
				
				if(this.tiporetencionSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoRetencion: " + this.dDif); 
					}
				}								
				
				TipoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tiporetencion,new Object(),this.tiporetencionParameterGeneral,this.tiporetencionReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoRetencion(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tiporetencion)) {
					if(this.tiporetencion.getId()>0) {
						this.tiporetencion.setIsDeleted(true);
						
						this.tiporetencionsEliminados.add(this.tiporetencion);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tiporetencionLogic.getTipoRetencions().remove(this.tiporetencion);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tiporetencions.remove(this.tiporetencion);				
					}
					
					
					((TipoRetencionModel) this.jTableDatosTipoRetencion.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoRetencion(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoRetencion(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoRetencion) {
			
			if(this.jInternalFrameDetalleFormTipoRetencion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoRetencion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoRetencion.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencion =(TipoRetencion) this.tiporetencionLogic.getTipoRetencions().toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporetencion =(TipoRetencion) this.tiporetencions.toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoRetencion(this.tiporetencion);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tiporetencionConstantesFunciones.cargarid_empresaTipoRetencion || this.tiporetencionConstantesFunciones.event_dependid_empresaTipoRetencion) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tiporetencion.getid_empresa());
									//this.inicializarActualizarBindingTipoRetencion(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tiporetencion.getEmpresa()!=null) {
							this.empresasForeignKey.add(tiporetencion.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tiporetencion.getid_empresa(),false,"Formulario");

					//CuentaContable
					if(!this.tiporetencionConstantesFunciones.cargarid_cuenta_contableTipoRetencion || this.tiporetencionConstantesFunciones.event_dependid_cuenta_contableTipoRetencion) {
						//this.cargarCombosCuentaContablesForeignKeyLista(" where id="+this.tiporetencion.getid_cuenta_contable());
									//this.inicializarActualizarBindingTipoRetencion(false,false);
						this.cuentacontablesForeignKey=new ArrayList<CuentaContable>();

						if(tiporetencion.getCuentaContable()!=null) {
							this.cuentacontablesForeignKey.add(tiporetencion.getCuentaContable());
						}

						this.addItemDefectoCombosForeignKeyCuentaContable();
						this.cargarCombosFrameCuentaContablesForeignKey("Todos");
					}
					this.setActualCuentaContableForeignKey(this.tiporetencion.getid_cuenta_contable(),false,"Formulario");

					//CuentaContableCredito
					if(!this.tiporetencionConstantesFunciones.cargarid_cuenta_contable_creditoTipoRetencion || this.tiporetencionConstantesFunciones.event_dependid_cuenta_contable_creditoTipoRetencion) {
						//this.cargarCombosCuentaContableCreditosForeignKeyLista(" where id="+this.tiporetencion.getid_cuenta_contable_credito());
									//this.inicializarActualizarBindingTipoRetencion(false,false);
						this.cuentacontablecreditosForeignKey=new ArrayList<CuentaContable>();

						if(tiporetencion.getCuentaContableCredito()!=null) {
							this.cuentacontablecreditosForeignKey.add(tiporetencion.getCuentaContableCredito());
						}

						this.addItemDefectoCombosForeignKeyCuentaContableCredito();
						this.cargarCombosFrameCuentaContableCreditosForeignKey("Todos");
					}
					this.setActualCuentaContableCreditoForeignKey(this.tiporetencion.getid_cuenta_contable_credito(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoRetencion("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoRetencion(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoRetencion() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoRetencion(TipoRetencion tiporetencion) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoRetencion(tiporetencion,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoRetencion(TipoRetencion tiporetencion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoRetencion(tiporetencion);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoRetencion(tiporetencion,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoRetencion(tiporetencion);
	}
	
	public void setVariablesObjetoActualToFormularioTipoRetencion(TipoRetencion tiporetencion) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoRetencion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoRetencion.jTextFieldidTipoRetencion.setText(tiporetencion.getId().toString());
			this.jInternalFrameDetalleFormTipoRetencion.jTextAreanombreTipoRetencion.setText(tiporetencion.getnombre());
			this.jInternalFrameDetalleFormTipoRetencion.jTextFieldcodigoTipoRetencion.setText(tiporetencion.getcodigo());
			this.jInternalFrameDetalleFormTipoRetencion.jTextFieldporcentajeTipoRetencion.setText(tiporetencion.getporcentaje().toString());
			this.jInternalFrameDetalleFormTipoRetencion.jTextFieldmonto_minimoTipoRetencion.setText(tiporetencion.getmonto_minimo().toString());
			this.jInternalFrameDetalleFormTipoRetencion.jCheckBoxes_retencion_ivaTipoRetencion.setSelected(tiporetencion.getes_retencion_iva());
			this.jInternalFrameDetalleFormTipoRetencion.jCheckBoxes_debitoTipoRetencion.setSelected(tiporetencion.getes_debito());
			this.jInternalFrameDetalleFormTipoRetencion.jCheckBoxes_con_iva_facturaTipoRetencion.setSelected(tiporetencion.getes_con_iva_factura());
			this.jInternalFrameDetalleFormTipoRetencion.jCheckBoxes_con_sub_total_facturaTipoRetencion.setSelected(tiporetencion.getes_con_sub_total_factura());
			this.jInternalFrameDetalleFormTipoRetencion.jCheckBoxes_con_secuencialTipoRetencion.setSelected(tiporetencion.getes_con_secuencial());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoRetencion tiporetencionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tiporetencionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoRetencion tiporetencionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tiporetencionLocal=this.tiporetencion;
			} else {
				tiporetencionLocal=this.tiporetencionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tiporetencionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoRetencion(tiporetencionLocal,true);
					
					if(tiporetencionSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tiporetencionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tiporetencionSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tiporetencionLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoRetencion(TipoRetencion tiporetencion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoRetencion(tiporetencion,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencion(tiporetencion);
	}
	
	public void setVariablesFormularioToObjetoActualTipoRetencion(TipoRetencion tiporetencion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoRetencion(tiporetencion,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoRetencion(TipoRetencion tiporetencion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoRetencion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoRetencion.jTextFieldidTipoRetencion.getText()==null || this.jInternalFrameDetalleFormTipoRetencion.jTextFieldidTipoRetencion.getText()=="" || this.jInternalFrameDetalleFormTipoRetencion.jTextFieldidTipoRetencion.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoRetencion.jTextFieldidTipoRetencion.setText("0");
			}

			if(conColumnasBase) {tiporetencion.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoRetencion.jTextFieldidTipoRetencion.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoRetencionConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRetencion.jLabelIdTipoRetencion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiporetencion.setnombre(this.jInternalFrameDetalleFormTipoRetencion.jTextAreanombreTipoRetencion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoRetencionConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRetencion.jLabelnombreTipoRetencion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiporetencion.setcodigo(this.jInternalFrameDetalleFormTipoRetencion.jTextFieldcodigoTipoRetencion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoRetencionConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRetencion.jLabelcodigoTipoRetencion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiporetencion.setporcentaje(Double.parseDouble(this.jInternalFrameDetalleFormTipoRetencion.jTextFieldporcentajeTipoRetencion.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoRetencionConstantesFunciones.LABEL_PORCENTAJE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRetencion.jLabelporcentajeTipoRetencion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiporetencion.setmonto_minimo(Double.parseDouble(this.jInternalFrameDetalleFormTipoRetencion.jTextFieldmonto_minimoTipoRetencion.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoRetencionConstantesFunciones.LABEL_MONTOMINIMO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRetencion.jLabelmonto_minimoTipoRetencion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiporetencion.setes_retencion_iva(this.jInternalFrameDetalleFormTipoRetencion.jCheckBoxes_retencion_ivaTipoRetencion.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoRetencionConstantesFunciones.LABEL_ESRETENCIONIVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRetencion.jLabeles_retencion_ivaTipoRetencion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiporetencion.setes_debito(this.jInternalFrameDetalleFormTipoRetencion.jCheckBoxes_debitoTipoRetencion.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoRetencionConstantesFunciones.LABEL_ESDEBITO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRetencion.jLabeles_debitoTipoRetencion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiporetencion.setes_con_iva_factura(this.jInternalFrameDetalleFormTipoRetencion.jCheckBoxes_con_iva_facturaTipoRetencion.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoRetencionConstantesFunciones.LABEL_ESCONIVAFACTURA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRetencion.jLabeles_con_iva_facturaTipoRetencion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiporetencion.setes_con_sub_total_factura(this.jInternalFrameDetalleFormTipoRetencion.jCheckBoxes_con_sub_total_facturaTipoRetencion.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoRetencionConstantesFunciones.LABEL_ESCONSUBTOTALFACTURA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRetencion.jLabeles_con_sub_total_facturaTipoRetencion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiporetencion.setes_con_secuencial(this.jInternalFrameDetalleFormTipoRetencion.jCheckBoxes_con_secuencialTipoRetencion.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoRetencionConstantesFunciones.LABEL_ESCONSECUENCIAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRetencion.jLabeles_con_secuencialTipoRetencion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoRetencion(TipoRetencion tiporetencionBean,TipoRetencion tiporetencion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && tiporetencionBean.getid_cuenta_contable()!=null && !tiporetencionBean.getid_cuenta_contable().equals(null))) {tiporetencion.setid_cuenta_contable(tiporetencionBean.getid_cuenta_contable());}
			if(conDefault || (!conDefault && tiporetencionBean.getid_cuenta_contable_credito()!=null && !tiporetencionBean.getid_cuenta_contable_credito().equals(null))) {tiporetencion.setid_cuenta_contable_credito(tiporetencionBean.getid_cuenta_contable_credito());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoRetencion(TipoRetencion tiporetencionOrigen,TipoRetencion tiporetencion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tiporetencionOrigen.getId()!=null && !tiporetencionOrigen.getId().equals(0L))) {tiporetencion.setId(tiporetencionOrigen.getId());}}
			if(conDefault || (!conDefault && tiporetencionOrigen.getnombre()!=null && !tiporetencionOrigen.getnombre().equals(""))) {tiporetencion.setnombre(tiporetencionOrigen.getnombre());}
			if(conDefault || (!conDefault && tiporetencionOrigen.getcodigo()!=null && !tiporetencionOrigen.getcodigo().equals(""))) {tiporetencion.setcodigo(tiporetencionOrigen.getcodigo());}
			if(conDefault || (!conDefault && tiporetencionOrigen.getporcentaje()!=null && !tiporetencionOrigen.getporcentaje().equals(0.0))) {tiporetencion.setporcentaje(tiporetencionOrigen.getporcentaje());}
			if(conDefault || (!conDefault && tiporetencionOrigen.getmonto_minimo()!=null && !tiporetencionOrigen.getmonto_minimo().equals(0.0))) {tiporetencion.setmonto_minimo(tiporetencionOrigen.getmonto_minimo());}
			if(conDefault || (!conDefault && tiporetencionOrigen.getid_cuenta_contable()!=null && !tiporetencionOrigen.getid_cuenta_contable().equals(null))) {tiporetencion.setid_cuenta_contable(tiporetencionOrigen.getid_cuenta_contable());}
			if(conDefault || (!conDefault && tiporetencionOrigen.getid_cuenta_contable_credito()!=null && !tiporetencionOrigen.getid_cuenta_contable_credito().equals(null))) {tiporetencion.setid_cuenta_contable_credito(tiporetencionOrigen.getid_cuenta_contable_credito());}
			if(conDefault || (!conDefault && tiporetencionOrigen.getes_retencion_iva()!=null && !tiporetencionOrigen.getes_retencion_iva().equals(false))) {tiporetencion.setes_retencion_iva(tiporetencionOrigen.getes_retencion_iva());}
			if(conDefault || (!conDefault && tiporetencionOrigen.getes_debito()!=null && !tiporetencionOrigen.getes_debito().equals(false))) {tiporetencion.setes_debito(tiporetencionOrigen.getes_debito());}
			if(conDefault || (!conDefault && tiporetencionOrigen.getes_con_iva_factura()!=null && !tiporetencionOrigen.getes_con_iva_factura().equals(false))) {tiporetencion.setes_con_iva_factura(tiporetencionOrigen.getes_con_iva_factura());}
			if(conDefault || (!conDefault && tiporetencionOrigen.getes_con_sub_total_factura()!=null && !tiporetencionOrigen.getes_con_sub_total_factura().equals(false))) {tiporetencion.setes_con_sub_total_factura(tiporetencionOrigen.getes_con_sub_total_factura());}
			if(conDefault || (!conDefault && tiporetencionOrigen.getes_con_secuencial()!=null && !tiporetencionOrigen.getes_con_secuencial().equals(false))) {tiporetencion.setes_con_secuencial(tiporetencionOrigen.getes_con_secuencial());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoRetencion(TipoRetencion tiporetencion) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoRetencion.jTextFieldidTipoRetencion.setText(tiporetencion.getId().toString());
			this.jInternalFrameDetalleFormTipoRetencion.jTextAreanombreTipoRetencion.setText(tiporetencion.getnombre());
			this.jInternalFrameDetalleFormTipoRetencion.jTextFieldcodigoTipoRetencion.setText(tiporetencion.getcodigo());
			this.jInternalFrameDetalleFormTipoRetencion.jTextFieldporcentajeTipoRetencion.setText(tiporetencion.getporcentaje().toString());
			this.jInternalFrameDetalleFormTipoRetencion.jTextFieldmonto_minimoTipoRetencion.setText(tiporetencion.getmonto_minimo().toString());
			this.jInternalFrameDetalleFormTipoRetencion.jCheckBoxes_retencion_ivaTipoRetencion.setSelected(tiporetencion.getes_retencion_iva());
			this.jInternalFrameDetalleFormTipoRetencion.jCheckBoxes_debitoTipoRetencion.setSelected(tiporetencion.getes_debito());
			this.jInternalFrameDetalleFormTipoRetencion.jCheckBoxes_con_iva_facturaTipoRetencion.setSelected(tiporetencion.getes_con_iva_factura());
			this.jInternalFrameDetalleFormTipoRetencion.jCheckBoxes_con_sub_total_facturaTipoRetencion.setSelected(tiporetencion.getes_con_sub_total_factura());
			this.jInternalFrameDetalleFormTipoRetencion.jCheckBoxes_con_secuencialTipoRetencion.setSelected(tiporetencion.getes_con_secuencial());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoRetencion(TipoRetencionBean tiporetencionBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoRetencion.jTextFieldidTipoRetencion.setText(tiporetencionBean.getId().toString());
			this.jInternalFrameDetalleFormTipoRetencion.jTextAreanombreTipoRetencion.setText(tiporetencionBean.getnombre());
			this.jInternalFrameDetalleFormTipoRetencion.jTextFieldcodigoTipoRetencion.setText(tiporetencionBean.getcodigo());
			this.jInternalFrameDetalleFormTipoRetencion.jTextFieldporcentajeTipoRetencion.setText(tiporetencionBean.getporcentaje().toString());
			this.jInternalFrameDetalleFormTipoRetencion.jTextFieldmonto_minimoTipoRetencion.setText(tiporetencionBean.getmonto_minimo().toString());
			this.jInternalFrameDetalleFormTipoRetencion.jCheckBoxes_retencion_ivaTipoRetencion.setSelected(tiporetencionBean.getes_retencion_iva());
			this.jInternalFrameDetalleFormTipoRetencion.jCheckBoxes_debitoTipoRetencion.setSelected(tiporetencionBean.getes_debito());
			this.jInternalFrameDetalleFormTipoRetencion.jCheckBoxes_con_iva_facturaTipoRetencion.setSelected(tiporetencionBean.getes_con_iva_factura());
			this.jInternalFrameDetalleFormTipoRetencion.jCheckBoxes_con_sub_total_facturaTipoRetencion.setSelected(tiporetencionBean.getes_con_sub_total_factura());
			this.jInternalFrameDetalleFormTipoRetencion.jCheckBoxes_con_secuencialTipoRetencion.setSelected(tiporetencionBean.getes_con_secuencial());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoRetencion(TipoRetencionParameterReturnGeneral tiporetencionReturnGeneral,TipoRetencionBean tiporetencionBean,Boolean conDefault) throws Exception { 
		try {
			TipoRetencion tiporetencionLocal=new TipoRetencion();
			
			tiporetencionLocal=tiporetencionReturnGeneral.getTipoRetencion();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tiporetencionLocal.getId()!=null && !tiporetencionLocal.getId().equals(0L))) {tiporetencionBean.setId(tiporetencionLocal.getId());}}
			if(conDefault || (!conDefault && tiporetencionLocal.getnombre()!=null && !tiporetencionLocal.getnombre().equals(""))) {tiporetencionBean.setnombre(tiporetencionLocal.getnombre());}
			if(conDefault || (!conDefault && tiporetencionLocal.getcodigo()!=null && !tiporetencionLocal.getcodigo().equals(""))) {tiporetencionBean.setcodigo(tiporetencionLocal.getcodigo());}
			if(conDefault || (!conDefault && tiporetencionLocal.getporcentaje()!=null && !tiporetencionLocal.getporcentaje().equals(0.0))) {tiporetencionBean.setporcentaje(tiporetencionLocal.getporcentaje());}
			if(conDefault || (!conDefault && tiporetencionLocal.getmonto_minimo()!=null && !tiporetencionLocal.getmonto_minimo().equals(0.0))) {tiporetencionBean.setmonto_minimo(tiporetencionLocal.getmonto_minimo());}
			if(conDefault || (!conDefault && tiporetencionLocal.getid_cuenta_contable()!=null && !tiporetencionLocal.getid_cuenta_contable().equals(null))) {tiporetencionBean.setid_cuenta_contable(tiporetencionLocal.getid_cuenta_contable());}
			if(conDefault || (!conDefault && tiporetencionLocal.getid_cuenta_contable_credito()!=null && !tiporetencionLocal.getid_cuenta_contable_credito().equals(null))) {tiporetencionBean.setid_cuenta_contable_credito(tiporetencionLocal.getid_cuenta_contable_credito());}
			if(conDefault || (!conDefault && tiporetencionLocal.getes_retencion_iva()!=null && !tiporetencionLocal.getes_retencion_iva().equals(false))) {tiporetencionBean.setes_retencion_iva(tiporetencionLocal.getes_retencion_iva());}
			if(conDefault || (!conDefault && tiporetencionLocal.getes_debito()!=null && !tiporetencionLocal.getes_debito().equals(false))) {tiporetencionBean.setes_debito(tiporetencionLocal.getes_debito());}
			if(conDefault || (!conDefault && tiporetencionLocal.getes_con_iva_factura()!=null && !tiporetencionLocal.getes_con_iva_factura().equals(false))) {tiporetencionBean.setes_con_iva_factura(tiporetencionLocal.getes_con_iva_factura());}
			if(conDefault || (!conDefault && tiporetencionLocal.getes_con_sub_total_factura()!=null && !tiporetencionLocal.getes_con_sub_total_factura().equals(false))) {tiporetencionBean.setes_con_sub_total_factura(tiporetencionLocal.getes_con_sub_total_factura());}
			if(conDefault || (!conDefault && tiporetencionLocal.getes_con_secuencial()!=null && !tiporetencionLocal.getes_con_secuencial().equals(false))) {tiporetencionBean.setes_con_secuencial(tiporetencionLocal.getes_con_secuencial());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoRetencionGenerico(Long idTipoRetencionSeleccionado,JComboBox jComboBoxTipoRetencion,List<TipoRetencion> tiporetencionsLocal)throws Exception {
		try {
			TipoRetencion  tiporetencionTemp=null;

			for(TipoRetencion tiporetencionAux:tiporetencionsLocal) {
				if(tiporetencionAux.getId()!=null && tiporetencionAux.getId().equals(idTipoRetencionSeleccionado)) {
					tiporetencionTemp=tiporetencionAux;
					break;
				}
			}

			jComboBoxTipoRetencion.setSelectedItem(tiporetencionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoRetencionGenerico(JComboBox jComboBoxTipoRetencion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoRetencion.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoRetencion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoRetencion.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoRetencion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiporetencion=(TipoRetencion) tiporetencionLogic.getTipoRetencions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tiporetencion =(TipoRetencion) tiporetencions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tiporetencion.getIsNew() && !tiporetencion.getIsChanged() && !tiporetencion.getIsDeleted()) {
				sDescripcion=tiporetencion.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tiporetencion.getempresa_descripcion();
			}
		}

		if(sTipo.equals("CuentaContable")) {
			//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
			if(!tiporetencion.getIsNew() && !tiporetencion.getIsChanged() && !tiporetencion.getIsDeleted()) {
				sDescripcion=tiporetencion.getcuentacontable_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
				sDescripcion=tiporetencion.getcuentacontable_descripcion();
			}
		}

		if(sTipo.equals("CuentaContableCredito")) {
			//sDescripcion=this.getActualCuentaContableCreditoForeignKeyDescripcion((Long)value);
			if(!tiporetencion.getIsNew() && !tiporetencion.getIsChanged() && !tiporetencion.getIsDeleted()) {
				sDescripcion=tiporetencion.getcuentacontablecredito_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableCreditoForeignKeyDescripcion((Long)value);
				sDescripcion=tiporetencion.getcuentacontablecredito_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoRetencion tiporetencionRow=new TipoRetencion();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiporetencionRow=(TipoRetencion) tiporetencionLogic.getTipoRetencions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tiporetencionRow=(TipoRetencion) tiporetencions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoRetencion(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoRetencion.setVisible((this.isVisibilidadCeldaNuevoTipoRetencion && this.isPermisoNuevoTipoRetencion));			
			this.jButtonDuplicarTipoRetencion.setVisible((this.isVisibilidadCeldaDuplicarTipoRetencion && this.isPermisoDuplicarTipoRetencion));			
			this.jButtonCopiarTipoRetencion.setVisible((this.isVisibilidadCeldaCopiarTipoRetencion && this.isPermisoCopiarTipoRetencion));
			this.jButtonVerFormTipoRetencion.setVisible((this.isVisibilidadCeldaVerFormTipoRetencion && this.isPermisoVerFormTipoRetencion));
			
			this.jButtonAbrirOrderByTipoRetencion.setVisible((this.isVisibilidadCeldaOrdenTipoRetencion && this.isPermisoOrdenTipoRetencion));			
			
			this.jButtonNuevoRelacionesTipoRetencion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoRetencion && this.isPermisoNuevoTipoRetencion));			
			this.jButtonNuevoGuardarCambiosTipoRetencion.setVisible((this.isVisibilidadCeldaNuevoTipoRetencion && this.isPermisoNuevoTipoRetencion && this.isPermisoGuardarCambiosTipoRetencion));
			
			if(this.jInternalFrameDetalleFormTipoRetencion!=null) {
			this.jInternalFrameDetalleFormTipoRetencion.jButtonModificarTipoRetencion.setVisible((this.isVisibilidadCeldaModificarTipoRetencion && this.isPermisoActualizarTipoRetencion));	
			this.jInternalFrameDetalleFormTipoRetencion.jButtonActualizarTipoRetencion.setVisible((this.isVisibilidadCeldaActualizarTipoRetencion && this.isPermisoActualizarTipoRetencion));	
			this.jInternalFrameDetalleFormTipoRetencion.jButtonEliminarTipoRetencion.setVisible((this.isVisibilidadCeldaEliminarTipoRetencion && this.isPermisoEliminarTipoRetencion));
			this.jInternalFrameDetalleFormTipoRetencion.jButtonCancelarTipoRetencion.setVisible(this.isVisibilidadCeldaCancelarTipoRetencion);							
			this.jInternalFrameDetalleFormTipoRetencion.jButtonGuardarCambiosTipoRetencion.setVisible((this.isVisibilidadCeldaGuardarTipoRetencion && this.isPermisoGuardarCambiosTipoRetencion));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoRetencion.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoRetencion && this.isPermisoGuardarCambiosTipoRetencion));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoRetencion.setVisible((this.isVisibilidadCeldaNuevoTipoRetencion && this.isPermisoNuevoTipoRetencion));						
			this.jButtonDuplicarToolBarTipoRetencion.setVisible((this.isVisibilidadCeldaDuplicarTipoRetencion && this.isPermisoDuplicarTipoRetencion));						
			this.jButtonCopiarToolBarTipoRetencion.setVisible((this.isVisibilidadCeldaCopiarTipoRetencion && this.isPermisoCopiarTipoRetencion));			
			this.jButtonVerFormToolBarTipoRetencion.setVisible((this.isVisibilidadCeldaVerFormTipoRetencion && this.isPermisoVerFormTipoRetencion));			
			this.jButtonAbrirOrderByToolBarTipoRetencion.setVisible((this.isVisibilidadCeldaOrdenTipoRetencion && this.isPermisoOrdenTipoRetencion));
			this.jButtonNuevoRelacionesToolBarTipoRetencion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoRetencion && this.isPermisoNuevoTipoRetencion));			
			this.jButtonNuevoGuardarCambiosToolBarTipoRetencion.setVisible((this.isVisibilidadCeldaNuevoTipoRetencion && this.isPermisoNuevoTipoRetencion && this.isPermisoGuardarCambiosTipoRetencion));			
			
			if(this.jInternalFrameDetalleFormTipoRetencion!=null) {
			this.jInternalFrameDetalleFormTipoRetencion.jButtonModificarToolBarTipoRetencion.setVisible((this.isVisibilidadCeldaModificarTipoRetencion && this.isPermisoActualizarTipoRetencion));	
			this.jInternalFrameDetalleFormTipoRetencion.jButtonActualizarToolBarTipoRetencion.setVisible((this.isVisibilidadCeldaActualizarTipoRetencion  && this.isPermisoActualizarTipoRetencion));	
			this.jInternalFrameDetalleFormTipoRetencion.jButtonEliminarToolBarTipoRetencion.setVisible((this.isVisibilidadCeldaEliminarTipoRetencion && this.isPermisoEliminarTipoRetencion));
			this.jInternalFrameDetalleFormTipoRetencion.jButtonCancelarToolBarTipoRetencion.setVisible(this.isVisibilidadCeldaCancelarTipoRetencion);				
			this.jInternalFrameDetalleFormTipoRetencion.jButtonGuardarCambiosToolBarTipoRetencion.setVisible((this.isVisibilidadCeldaGuardarTipoRetencion && this.isPermisoGuardarCambiosTipoRetencion));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoRetencion.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoRetencion && this.isPermisoGuardarCambiosTipoRetencion));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoRetencion.setVisible((this.isVisibilidadCeldaNuevoTipoRetencion && this.isPermisoNuevoTipoRetencion));			
			this.jMenuItemDuplicarTipoRetencion.setVisible((this.isVisibilidadCeldaDuplicarTipoRetencion && this.isPermisoDuplicarTipoRetencion));			
			this.jMenuItemCopiarTipoRetencion.setVisible((this.isVisibilidadCeldaCopiarTipoRetencion && this.isPermisoCopiarTipoRetencion));			
			this.jMenuItemVerFormTipoRetencion.setVisible((this.isVisibilidadCeldaVerFormTipoRetencion && this.isPermisoVerFormTipoRetencion));			
			this.jMenuItemAbrirOrderByTipoRetencion.setVisible((this.isVisibilidadCeldaOrdenTipoRetencion && this.isPermisoOrdenTipoRetencion));			
			//this.jMenuItemMostrarOcultarTipoRetencion.setVisible((this.isVisibilidadCeldaOrdenTipoRetencion && this.isPermisoOrdenTipoRetencion));
			this.jMenuItemDetalleAbrirOrderByTipoRetencion.setVisible((this.isVisibilidadCeldaOrdenTipoRetencion && this.isPermisoOrdenTipoRetencion));			
			//this.jMenuItemDetalleMostrarOcultarTipoRetencion.setVisible((this.isVisibilidadCeldaOrdenTipoRetencion && this.isPermisoOrdenTipoRetencion));			
			this.jMenuItemNuevoRelacionesTipoRetencion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoRetencion && this.isPermisoNuevoTipoRetencion));			
			this.jMenuItemNuevoGuardarCambiosTipoRetencion.setVisible((this.isVisibilidadCeldaNuevoTipoRetencion && this.isPermisoNuevoTipoRetencion && this.isPermisoGuardarCambiosTipoRetencion));									
			
			if(this.jInternalFrameDetalleFormTipoRetencion!=null) {
			this.jInternalFrameDetalleFormTipoRetencion.jMenuItemModificarTipoRetencion.setVisible((this.isVisibilidadCeldaModificarTipoRetencion && this.isPermisoActualizarTipoRetencion));	
			this.jInternalFrameDetalleFormTipoRetencion.jMenuItemActualizarTipoRetencion.setVisible((this.isVisibilidadCeldaActualizarTipoRetencion && this.isPermisoActualizarTipoRetencion));	
			this.jInternalFrameDetalleFormTipoRetencion.jMenuItemEliminarTipoRetencion.setVisible((this.isVisibilidadCeldaEliminarTipoRetencion && this.isPermisoEliminarTipoRetencion));
			this.jInternalFrameDetalleFormTipoRetencion.jMenuItemCancelarTipoRetencion.setVisible(this.isVisibilidadCeldaCancelarTipoRetencion);				
			}
			
			this.jMenuItemGuardarCambiosTipoRetencion.setVisible((this.isVisibilidadCeldaGuardarTipoRetencion && this.isPermisoGuardarCambiosTipoRetencion));						
			this.jMenuItemGuardarCambiosTablaTipoRetencion.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoRetencion && this.isPermisoGuardarCambiosTipoRetencion));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoRetencion=this.jButtonNuevoTipoRetencion.isVisible();
			this.isVisibilidadCeldaDuplicarTipoRetencion=this.jButtonDuplicarTipoRetencion.isVisible();
			this.isVisibilidadCeldaCopiarTipoRetencion=this.jButtonCopiarTipoRetencion.isVisible();
			this.isVisibilidadCeldaVerFormTipoRetencion=this.jButtonVerFormTipoRetencion.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoRetencion=this.jButtonAbrirOrderByTipoRetencion.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoRetencion=this.jButtonNuevoRelacionesTipoRetencion.isVisible();
			this.isVisibilidadCeldaModificarTipoRetencion=this.jButtonModificarTipoRetencion.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoRetencion!=null) {
			this.isVisibilidadCeldaActualizarTipoRetencion=this.jInternalFrameDetalleFormTipoRetencion.jButtonActualizarTipoRetencion.isVisible();
			this.isVisibilidadCeldaEliminarTipoRetencion=this.jInternalFrameDetalleFormTipoRetencion.jButtonEliminarTipoRetencion.isVisible();
			this.isVisibilidadCeldaCancelarTipoRetencion=this.jInternalFrameDetalleFormTipoRetencion.jButtonCancelarTipoRetencion.isVisible();
			this.isVisibilidadCeldaGuardarTipoRetencion=this.jInternalFrameDetalleFormTipoRetencion.jButtonGuardarCambiosTipoRetencion.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoRetencion=this.jButtonGuardarCambiosTablaTipoRetencion.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoRetencion=this.jButtonNuevoToolBarTipoRetencion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoRetencion=this.jButtonNuevoRelacionesToolBarTipoRetencion.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoRetencion!=null) {
			this.isVisibilidadCeldaModificarTipoRetencion=this.jInternalFrameDetalleFormTipoRetencion.jButtonModificarToolBarTipoRetencion.isVisible();
			this.isVisibilidadCeldaActualizarTipoRetencion=this.jInternalFrameDetalleFormTipoRetencion.jButtonActualizarToolBarTipoRetencion.isVisible();
			this.isVisibilidadCeldaEliminarTipoRetencion=this.jInternalFrameDetalleFormTipoRetencion.jButtonEliminarToolBarTipoRetencion.isVisible();
			this.isVisibilidadCeldaCancelarTipoRetencion=this.jInternalFrameDetalleFormTipoRetencion.jButtonCancelarToolBarTipoRetencion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoRetencion=this.jButtonGuardarCambiosToolBarTipoRetencion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoRetencion=this.jButtonGuardarCambiosTablaToolBarTipoRetencion.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoRetencion=this.jMenuItemNuevoTipoRetencion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoRetencion=this.jMenuItemNuevoRelacionesTipoRetencion.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoRetencion!=null) {
			this.isVisibilidadCeldaModificarTipoRetencion=this.jInternalFrameDetalleFormTipoRetencion.jMenuItemModificarTipoRetencion.isVisible();
			this.isVisibilidadCeldaActualizarTipoRetencion=this.jInternalFrameDetalleFormTipoRetencion.jMenuItemActualizarTipoRetencion.isVisible();
			this.isVisibilidadCeldaEliminarTipoRetencion=this.jInternalFrameDetalleFormTipoRetencion.jMenuItemEliminarTipoRetencion.isVisible();
			this.isVisibilidadCeldaCancelarTipoRetencion=this.jInternalFrameDetalleFormTipoRetencion.jMenuItemCancelarTipoRetencion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoRetencion=this.jMenuItemGuardarCambiosTipoRetencion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoRetencion=this.jMenuItemGuardarCambiosTablaTipoRetencion.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoRetencion(Boolean esInicializar) {
		if(TipoRetencionJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tiporetencionSessionBean.getConGuardarRelaciones()) {
				//if(this.tiporetencionSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoRetencion();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoRetencion(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoRetencion() {
		this.jButtonNuevoTipoRetencion.setVisible(this.isPermisoNuevoTipoRetencion);			
		this.jButtonDuplicarTipoRetencion.setVisible(this.isPermisoDuplicarTipoRetencion);			
		this.jButtonCopiarTipoRetencion.setVisible(this.isPermisoCopiarTipoRetencion);			
		this.jButtonVerFormTipoRetencion.setVisible(this.isPermisoVerFormTipoRetencion);			
		
		this.jButtonAbrirOrderByTipoRetencion.setVisible(this.isPermisoOrdenTipoRetencion);					
		
		this.jButtonNuevoRelacionesTipoRetencion.setVisible(this.isPermisoNuevoTipoRetencion);			
		
		if(this.jInternalFrameDetalleFormTipoRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRetencion.jButtonModificarTipoRetencion.setVisible(this.isPermisoActualizarTipoRetencion);	
			this.jInternalFrameDetalleFormTipoRetencion.jButtonActualizarTipoRetencion.setVisible(this.isPermisoActualizarTipoRetencion);	
			this.jInternalFrameDetalleFormTipoRetencion.jButtonEliminarTipoRetencion.setVisible(this.isPermisoEliminarTipoRetencion);
			this.jInternalFrameDetalleFormTipoRetencion.jButtonCancelarTipoRetencion.setVisible(this.isVisibilidadCeldaCancelarTipoRetencion);						
			this.jInternalFrameDetalleFormTipoRetencion.jButtonGuardarCambiosTipoRetencion.setVisible(this.isPermisoGuardarCambiosTipoRetencion);							
		}
		
		this.jButtonGuardarCambiosTablaTipoRetencion.setVisible(this.isPermisoActualizarTipoRetencion);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoRetencion() {
		this.jInternalFrameDetalleFormTipoRetencion.jButtonModificarTipoRetencion.setVisible(this.isPermisoActualizarTipoRetencion);	
		this.jInternalFrameDetalleFormTipoRetencion.jButtonActualizarTipoRetencion.setVisible(this.isPermisoActualizarTipoRetencion);	
		this.jInternalFrameDetalleFormTipoRetencion.jButtonEliminarTipoRetencion.setVisible(this.isPermisoEliminarTipoRetencion);
		this.jInternalFrameDetalleFormTipoRetencion.jButtonCancelarTipoRetencion.setVisible(this.isVisibilidadCeldaCancelarTipoRetencion);							
		this.jInternalFrameDetalleFormTipoRetencion.jButtonGuardarCambiosTipoRetencion.setVisible((this.isVisibilidadCeldaGuardarTipoRetencion && this.isPermisoGuardarCambiosTipoRetencion));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoRetencion() {
		if(TipoRetencionJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoRetencion();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoRetencion() {
	}
	
	public void jTableDatosTipoRetencionListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoRetencion(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoRetencionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRetencion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRetencion(this.gettiporetencion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencion(this.tiporetencion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporetencion =(TipoRetencion) this.tiporetencionLogic.getTipoRetencions().toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporetencion =(TipoRetencion) this.tiporetencions.toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporetencion==null) {
						this.tiporetencion = new TipoRetencion();
					}

					this.setVariablesFormularioToObjetoActualTipoRetencion(this.tiporetencion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencion(this.tiporetencion);
				}

				if(this.tiporetencion.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tiporetencion.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRetencion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoRetencionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoRetencion(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRetencion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoRetencion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoRetencion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencion =(TipoRetencion) this.tiporetencionLogic.getTipoRetencions().toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiporetencion =(TipoRetencion) this.tiporetencions.toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoRetencion(this.gettiporetencion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencion(this.tiporetencion);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tiporetencionLogic.getConnexion());

				if(this.tiporetencion.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tiporetencion.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoRetencion=(TitledBorder)this.jScrollPanelDatosTipoRetencion.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoRetencion.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoRetencionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRetencion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRetencion(this.gettiporetencion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencion(this.tiporetencion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporetencion =(TipoRetencion) this.tiporetencionLogic.getTipoRetencions().toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporetencion =(TipoRetencion) this.tiporetencions.toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporetencion==null) {
						this.tiporetencion = new TipoRetencion();
					}

					this.setVariablesFormularioToObjetoActualTipoRetencion(this.tiporetencion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencion(this.tiporetencion);
				}

				if(this.tiporetencion.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tiporetencion.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRetencion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoRetencionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRetencion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRetencion(this.gettiporetencion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencion(this.tiporetencion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporetencion =(TipoRetencion) this.tiporetencionLogic.getTipoRetencions().toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporetencion =(TipoRetencion) this.tiporetencions.toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporetencion==null) {
						this.tiporetencion = new TipoRetencion();
					}

					this.setVariablesFormularioToObjetoActualTipoRetencion(this.tiporetencion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencion(this.tiporetencion);
				}

				if(this.tiporetencion.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tiporetencion.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRetencion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoRetencionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRetencion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRetencion(this.gettiporetencion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencion(this.tiporetencion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporetencion =(TipoRetencion) this.tiporetencionLogic.getTipoRetencions().toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporetencion =(TipoRetencion) this.tiporetencions.toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporetencion==null) {
						this.tiporetencion = new TipoRetencion();
					}

					this.setVariablesFormularioToObjetoActualTipoRetencion(this.tiporetencion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencion(this.tiporetencion);
				}

				if(this.tiporetencion.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tiporetencion.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRetencion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentajeTipoRetencionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRetencion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRetencion(this.gettiporetencion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencion(this.tiporetencion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporetencion =(TipoRetencion) this.tiporetencionLogic.getTipoRetencions().toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporetencion =(TipoRetencion) this.tiporetencions.toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporetencion==null) {
						this.tiporetencion = new TipoRetencion();
					}

					this.setVariablesFormularioToObjetoActualTipoRetencion(this.tiporetencion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencion(this.tiporetencion);
				}

				if(this.tiporetencion.getporcentaje()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje = "+this.tiporetencion.getporcentaje().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRetencion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonmonto_minimoTipoRetencionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRetencion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRetencion(this.gettiporetencion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencion(this.tiporetencion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporetencion =(TipoRetencion) this.tiporetencionLogic.getTipoRetencions().toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporetencion =(TipoRetencion) this.tiporetencions.toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporetencion==null) {
						this.tiporetencion = new TipoRetencion();
					}

					this.setVariablesFormularioToObjetoActualTipoRetencion(this.tiporetencion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencion(this.tiporetencion);
				}

				if(this.tiporetencion.getmonto_minimo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where monto_minimo = "+this.tiporetencion.getmonto_minimo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRetencion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contableTipoRetencionActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderTipoRetencion=null;
			TitledBorder titledBordercuentacontable=null;

			if(!this.jScrollPanelDatosTipoRetencion.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderTipoRetencion=(TitledBorder)this.jScrollPanelDatosTipoRetencion.getBorder();
				titledBordercuentacontable=(TitledBorder)this.cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontable.setTitle(titledBorderTipoRetencion.getTitle() + " -> Cuenta Contable");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_cuenta_contableTipoRetencionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontable=true;

			idTienePermisocuentacontable=this.tienePermisosUsuarioEnPaginaWebTipoRetencion(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontable) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRetencion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoRetencion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoRetencion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencion =(TipoRetencion) this.tiporetencionLogic.getTipoRetencions().toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiporetencion =(TipoRetencion) this.tiporetencions.toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoRetencion(this.gettiporetencion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencion(this.tiporetencion);

				this.cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontableBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.tiporetencionLogic.getConnexion());

				if(this.tiporetencion.getid_cuenta_contable()!=null) {
					this.cuentacontableBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontableBeanSwingJInternalFrame.setIdActual(this.tiporetencion.getid_cuenta_contable());
					this.cuentacontableBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontableBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoRetencion=(TitledBorder)this.jScrollPanelDatosTipoRetencion.getBorder();
				TitledBorder titledBordercuentacontable=(TitledBorder)this.cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontable.setTitle(titledBorderTipoRetencion.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contableTipoRetencionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRetencion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRetencion(this.gettiporetencion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencion(this.tiporetencion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporetencion =(TipoRetencion) this.tiporetencionLogic.getTipoRetencions().toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporetencion =(TipoRetencion) this.tiporetencions.toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporetencion==null) {
						this.tiporetencion = new TipoRetencion();
					}

					this.setVariablesFormularioToObjetoActualTipoRetencion(this.tiporetencion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencion(this.tiporetencion);
				}

				if(this.tiporetencion.getid_cuenta_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable = "+this.tiporetencion.getid_cuenta_contable().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRetencion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contable_creditoTipoRetencionActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderTipoRetencion=null;
			TitledBorder titledBordercuentacontablecredito=null;

			if(!this.jScrollPanelDatosTipoRetencion.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderTipoRetencion=(TitledBorder)this.jScrollPanelDatosTipoRetencion.getBorder();
				titledBordercuentacontablecredito=(TitledBorder)this.cuentacontablecreditoBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontablecredito.setTitle(titledBorderTipoRetencion.getTitle() + " -> Cuenta Contable");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_cuenta_contable_creditoTipoRetencionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontablecredito=true;

			idTienePermisocuentacontablecredito=this.tienePermisosUsuarioEnPaginaWebTipoRetencion(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontablecredito) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRetencion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoRetencion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoRetencion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencion =(TipoRetencion) this.tiporetencionLogic.getTipoRetencions().toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiporetencion =(TipoRetencion) this.tiporetencions.toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoRetencion(this.gettiporetencion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencion(this.tiporetencion);

				this.cuentacontablecreditoBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontablecreditoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontablecreditoBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.tiporetencionLogic.getConnexion());

				if(this.tiporetencion.getid_cuenta_contable_credito()!=null) {
					this.cuentacontablecreditoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontablecreditoBeanSwingJInternalFrame.setIdActual(this.tiporetencion.getid_cuenta_contable_credito());
					this.cuentacontablecreditoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontablecreditoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontablecreditoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontablecreditoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoRetencion=(TitledBorder)this.jScrollPanelDatosTipoRetencion.getBorder();
				TitledBorder titledBordercuentacontablecredito=(TitledBorder)this.cuentacontablecreditoBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontablecredito.setTitle(titledBorderTipoRetencion.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contable_creditoTipoRetencionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRetencion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRetencion(this.gettiporetencion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencion(this.tiporetencion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporetencion =(TipoRetencion) this.tiporetencionLogic.getTipoRetencions().toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporetencion =(TipoRetencion) this.tiporetencions.toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporetencion==null) {
						this.tiporetencion = new TipoRetencion();
					}

					this.setVariablesFormularioToObjetoActualTipoRetencion(this.tiporetencion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencion(this.tiporetencion);
				}

				if(this.tiporetencion.getid_cuenta_contable_credito()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable_credito = "+this.tiporetencion.getid_cuenta_contable_credito().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRetencion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_retencion_ivaTipoRetencionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRetencion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRetencion(this.gettiporetencion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencion(this.tiporetencion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporetencion =(TipoRetencion) this.tiporetencionLogic.getTipoRetencions().toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporetencion =(TipoRetencion) this.tiporetencions.toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporetencion==null) {
						this.tiporetencion = new TipoRetencion();
					}

					this.setVariablesFormularioToObjetoActualTipoRetencion(this.tiporetencion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencion(this.tiporetencion);
				}

				if(this.tiporetencion.getes_retencion_iva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_retencion_iva = "+this.tiporetencion.getes_retencion_iva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRetencion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_debitoTipoRetencionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRetencion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRetencion(this.gettiporetencion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencion(this.tiporetencion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporetencion =(TipoRetencion) this.tiporetencionLogic.getTipoRetencions().toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporetencion =(TipoRetencion) this.tiporetencions.toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporetencion==null) {
						this.tiporetencion = new TipoRetencion();
					}

					this.setVariablesFormularioToObjetoActualTipoRetencion(this.tiporetencion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencion(this.tiporetencion);
				}

				if(this.tiporetencion.getes_debito()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_debito = "+this.tiporetencion.getes_debito().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRetencion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_con_iva_facturaTipoRetencionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRetencion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRetencion(this.gettiporetencion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencion(this.tiporetencion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporetencion =(TipoRetencion) this.tiporetencionLogic.getTipoRetencions().toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporetencion =(TipoRetencion) this.tiporetencions.toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporetencion==null) {
						this.tiporetencion = new TipoRetencion();
					}

					this.setVariablesFormularioToObjetoActualTipoRetencion(this.tiporetencion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencion(this.tiporetencion);
				}

				if(this.tiporetencion.getes_con_iva_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_con_iva_factura = "+this.tiporetencion.getes_con_iva_factura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRetencion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_con_sub_total_facturaTipoRetencionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRetencion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRetencion(this.gettiporetencion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencion(this.tiporetencion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporetencion =(TipoRetencion) this.tiporetencionLogic.getTipoRetencions().toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporetencion =(TipoRetencion) this.tiporetencions.toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporetencion==null) {
						this.tiporetencion = new TipoRetencion();
					}

					this.setVariablesFormularioToObjetoActualTipoRetencion(this.tiporetencion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencion(this.tiporetencion);
				}

				if(this.tiporetencion.getes_con_sub_total_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_con_sub_total_factura = "+this.tiporetencion.getes_con_sub_total_factura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRetencion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_con_secuencialTipoRetencionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRetencion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRetencion(this.gettiporetencion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencion(this.tiporetencion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporetencion =(TipoRetencion) this.tiporetencionLogic.getTipoRetencions().toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporetencion =(TipoRetencion) this.tiporetencions.toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporetencion==null) {
						this.tiporetencion = new TipoRetencion();
					}

					this.setVariablesFormularioToObjetoActualTipoRetencion(this.tiporetencion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencion(this.tiporetencion);
				}

				if(this.tiporetencion.getes_con_secuencial()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_con_secuencial = "+this.tiporetencion.getes_con_secuencial().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRetencion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPoNombreTipoRetencionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoRetencion(false,false);

			this.getTipoRetencionsBusquedaPoNombre();

			this.inicializarActualizarBindingTipoRetencion(false);

			//if(TipoRetencionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoRetencion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorCodigoSriTipoRetencionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoRetencion(false,false);

			this.getTipoRetencionsBusquedaPorCodigoSri();

			this.inicializarActualizarBindingTipoRetencion(false);

			//if(TipoRetencionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoRetencion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorIdTipoRetencionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoRetencion(false,false);

			this.getTipoRetencionsBusquedaPorId();

			this.inicializarActualizarBindingTipoRetencion(false);

			//if(TipoRetencionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoRetencion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCuentaContableTipoRetencionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoRetencion(false,false);

			this.getTipoRetencionsFK_IdCuentaContable();

			this.inicializarActualizarBindingTipoRetencion(false);

			//if(TipoRetencionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoRetencion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCuentaContableCreditoTipoRetencionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoRetencion(false,false);

			this.getTipoRetencionsFK_IdCuentaContableCredito();

			this.inicializarActualizarBindingTipoRetencion(false);

			//if(TipoRetencionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoRetencion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaTipoRetencionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoRetencion(false,false);

			this.getTipoRetencionsFK_IdEmpresa();

			this.inicializarActualizarBindingTipoRetencion(false);

			//if(TipoRetencionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoRetencion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporetencionLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoRetencion() {
		if(this.jInternalFrameDetalleFormTipoRetencion!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoRetencion!=null) {
			this.jInternalFrameDetalleFormTipoRetencion.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoRetencion.dispose();
			this.jInternalFrameDetalleFormTipoRetencion=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoRetencion!=null) {
			this.jInternalFrameReporteDinamicoTipoRetencion.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoRetencion.dispose();
			this.jInternalFrameReporteDinamicoTipoRetencion=null;
		}
		
		if(this.jInternalFrameImportacionTipoRetencion!=null) {
			this.jInternalFrameImportacionTipoRetencion.setVisible(false);	    			
			this.jInternalFrameImportacionTipoRetencion.dispose();
			this.jInternalFrameImportacionTipoRetencion=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoRetencion();
			
			TipoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporetencion,new Object(),this.tiporetencionParameterGeneral,this.tiporetencionReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoRetencion")) {
				jButtonNuevoTipoRetencionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoRetencion")) {
				jButtonDuplicarTipoRetencionActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoRetencion")) {
				jButtonCopiarTipoRetencionActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoRetencion")) {
				jButtonVerFormTipoRetencionActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoRetencion")) {
				jButtonNuevoTipoRetencionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoRetencion")) {
				jButtonDuplicarTipoRetencionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoRetencion")) {
				jButtonNuevoTipoRetencionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoRetencion")) {
				jButtonDuplicarTipoRetencionActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoRetencion")) {
				jButtonNuevoTipoRetencionActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoRetencion")) {
				jButtonNuevoTipoRetencionActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoRetencion")) {
				jButtonNuevoTipoRetencionActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoRetencion")) {
				jButtonModificarTipoRetencionActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoRetencion")) {
				jButtonModificarTipoRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoRetencion")) {
				jButtonModificarTipoRetencionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoRetencion")) {
				jButtonActualizarTipoRetencionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoRetencion")) {
				jButtonActualizarTipoRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoRetencion")) {
				jButtonActualizarTipoRetencionActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoRetencion")) {
				jButtonEliminarTipoRetencionActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoRetencion")) {
				jButtonEliminarTipoRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoRetencion")) {
				jButtonEliminarTipoRetencionActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoRetencion")) {
				jButtonCancelarTipoRetencionActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoRetencion")) {
				jButtonCancelarTipoRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoRetencion")) {
				jButtonCancelarTipoRetencionActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoRetencion")) {
				jButtonCerrarTipoRetencionActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoRetencion")) {
				jButtonCerrarTipoRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoRetencion")) {
				jButtonCerrarTipoRetencionActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoRetencion")) {
				jButtonMostrarOcultarTipoRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoRetencion")) {
				jButtonCancelarTipoRetencionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoRetencion")) {
				jButtonGuardarCambiosTipoRetencionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoRetencion")) {
				jButtonGuardarCambiosTipoRetencionActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoRetencion")) {
				jButtonCopiarTipoRetencionActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoRetencion")) {
				jButtonVerFormTipoRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoRetencion")) {
				jButtonGuardarCambiosTipoRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoRetencion")) {
				jButtonCopiarTipoRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoRetencion")) {
				jButtonVerFormTipoRetencionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoRetencion")) {
				jButtonGuardarCambiosTipoRetencionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoRetencion")) {
				jButtonGuardarCambiosTipoRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoRetencion")) {
				jButtonGuardarCambiosTipoRetencionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoRetencion")) {
				jButtonRecargarInformacionTipoRetencionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoRetencion")) {
				jButtonRecargarInformacionTipoRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoRetencion")) {
				jButtonRecargarInformacionTipoRetencionActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoRetencion")) {
				jButtonAnterioresTipoRetencionActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoRetencion")) {
				jButtonAnterioresTipoRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoRetencion")) {
				jButtonAnterioresTipoRetencionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoRetencion")) {
				jButtonSiguientesTipoRetencionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoRetencion")) {
				jButtonSiguientesTipoRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoRetencion")) {
				jButtonSiguientesTipoRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoRetencion") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoRetencion")) {
				jButtonAbrirOrderByTipoRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoRetencion") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoRetencion")) {
				jButtonMostrarOcultarTipoRetencionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoRetencion")) {
				jButtonNuevoGuardarCambiosTipoRetencionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoRetencion")) {
				jButtonNuevoGuardarCambiosTipoRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoRetencion")) {
				jButtonNuevoGuardarCambiosTipoRetencionActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoRetencion")) {
				jButtonCerrarReporteDinamicoTipoRetencionActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoRetencion")) {
				jButtonGenerarReporteDinamicoTipoRetencionActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoRetencion")) {
				
				jButtonGenerarExcelReporteDinamicoTipoRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoRetencion")) {
				jButtonCerrarImportacionTipoRetencionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoRetencion")) {
				
				jButtonGenerarImportacionTipoRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoRetencion")) {
				
				jButtonAbrirImportacionTipoRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoRetencion")) {
				jComboBoxTiposAccionesTipoRetencionActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoRetencion")) {
				jComboBoxTiposRelacionesTipoRetencionActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoRetencion")) {
				jComboBoxTiposAccionesTipoRetencionActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoRetencion")) {
				
				jComboBoxTiposSeleccionarTipoRetencionActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoRetencion")) {
				jTextFieldValorCampoGeneralTipoRetencionActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoRetencion")) {
				jButtonAbrirOrderByTipoRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoRetencion")) {
				jButtonAbrirOrderByTipoRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoRetencion")) {
				jButtonCerrarOrderByTipoRetencionActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoRetencionBusqueda")) {
				this.jButtonidTipoRetencionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoRetencionUpdate")) {
				this.jButtonid_empresaTipoRetencionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoRetencionBusqueda")) {
				this.jButtonid_empresaTipoRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoRetencionBusqueda")) {
				this.jButtonnombreTipoRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoRetencionBusqueda")) {
				this.jButtoncodigoTipoRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeTipoRetencionBusqueda")) {
				this.jButtonporcentajeTipoRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("monto_minimoTipoRetencionBusqueda")) {
				this.jButtonmonto_minimoTipoRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contableTipoRetencion")) {
				this.jButtonid_cuenta_contableTipoRetencionActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contableTipoRetencionArbol")) {
				this.abrirFrameTreeCuentaContable("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contableTipoRetencionUpdate")) {
				this.jButtonid_cuenta_contableTipoRetencionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contableTipoRetencionBusqueda")) {
				this.jButtonid_cuenta_contableTipoRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoTipoRetencion")) {
				this.jButtonid_cuenta_contable_creditoTipoRetencionActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoTipoRetencionArbol")) {
				this.abrirFrameTreeCuentaContableCredito("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoTipoRetencionUpdate")) {
				this.jButtonid_cuenta_contable_creditoTipoRetencionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoTipoRetencionBusqueda")) {
				this.jButtonid_cuenta_contable_creditoTipoRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_retencion_ivaTipoRetencionBusqueda")) {
				this.jButtones_retencion_ivaTipoRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_debitoTipoRetencionBusqueda")) {
				this.jButtones_debitoTipoRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_con_iva_facturaTipoRetencionBusqueda")) {
				this.jButtones_con_iva_facturaTipoRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_con_sub_total_facturaTipoRetencionBusqueda")) {
				this.jButtones_con_sub_total_facturaTipoRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_con_secuencialTipoRetencionBusqueda")) {
				this.jButtones_con_secuencialTipoRetencionBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPoNombreTipoRetencion")) {
				this.jButtonBusquedaPoNombreTipoRetencionActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorCodigoSriTipoRetencion")) {
				this.jButtonBusquedaPorCodigoSriTipoRetencionActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorIdTipoRetencion")) {
				this.jButtonBusquedaPorIdTipoRetencionActionPerformed(evt);
			}
			
			;
			
			
			TipoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporetencion,new Object(),this.tiporetencionParameterGeneral,this.tiporetencionReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoRetencion();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRetencionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporetencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporetencion);
				
				TipoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencion,new Object(),this.tiporetencionParameterGeneral,this.tiporetencionReturnGeneral);
				
				


				
				TipoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencion,new Object(),this.tiporetencionParameterGeneral,this.tiporetencionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRetencion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRetencion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoRetencion tiporetencionLocal=null;
			
			if(!this.getEsControlTabla()) {
				tiporetencionLocal=this.tiporetencion;
			} else {
				tiporetencionLocal=this.tiporetencionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporetencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporetencion);
				
				TipoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencion,new Object(),this.tiporetencionParameterGeneral,this.tiporetencionReturnGeneral);
							
				
				


				
				TipoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencion,new Object(),this.tiporetencionParameterGeneral,this.tiporetencionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRetencion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRetencion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRetencionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRetencion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionAnterior =(TipoRetencion) this.tiporetencionLogic.getTipoRetencions().toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporetencionAnterior =(TipoRetencion) this.tiporetencions.toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
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
			
			TipoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencion,new Object(),this.tiporetencionParameterGeneral,this.tiporetencionReturnGeneral);
			
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
			
			


			
			TipoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencion,new Object(),this.tiporetencionParameterGeneral,this.tiporetencionReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRetencionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporetencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporetencion);
				
				TipoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencion,new Object(),this.tiporetencionParameterGeneral,this.tiporetencionReturnGeneral);
								
						
				


				
				TipoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencion,new Object(),this.tiporetencionParameterGeneral,this.tiporetencionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRetencion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRetencion.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporetencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporetencion);
				
				TipoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencion,new Object(),this.tiporetencionParameterGeneral,this.tiporetencionReturnGeneral);
								
				
				


				
				TipoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencion,new Object(),this.tiporetencionParameterGeneral,this.tiporetencionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRetencion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRetencion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRetencionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRetencion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionAnterior =(TipoRetencion) this.tiporetencionLogic.getTipoRetencions().toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporetencionAnterior =(TipoRetencion) this.tiporetencions.toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporetencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporetencion);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRetencionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRetencion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionAnterior =(TipoRetencion) this.tiporetencionLogic.getTipoRetencions().toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporetencionAnterior =(TipoRetencion) this.tiporetencions.toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRetencionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporetencion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiporetencion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporetencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporetencion);
				
				TipoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencion,new Object(),this.tiporetencionParameterGeneral,this.tiporetencionReturnGeneral);
							
				
				


				
				TipoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencion,new Object(),this.tiporetencionParameterGeneral,this.tiporetencionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRetencion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRetencion.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRetencionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoRetencion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporetencionAnterior =(TipoRetencion) this.tiporetencionLogic.getTipoRetencions().toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tiporetencionAnterior =(TipoRetencion) this.tiporetencions.toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
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
			
			TipoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencion,new Object(),this.tiporetencionParameterGeneral,this.tiporetencionReturnGeneral);
			
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
			
			


			
			TipoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencion,new Object(),this.tiporetencionParameterGeneral,this.tiporetencionReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRetencionActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporetencion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiporetencion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporetencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporetencion);
				
				TipoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencion,new Object(),this.tiporetencionParameterGeneral,this.tiporetencionReturnGeneral);
								
				
				


				
				TipoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencion,new Object(),this.tiporetencionParameterGeneral,this.tiporetencionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRetencion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRetencion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRetencionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRetencion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionAnterior =(TipoRetencion) this.tiporetencionLogic.getTipoRetencions().toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporetencionAnterior =(TipoRetencion) this.tiporetencions.toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRetencionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporetencion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiporetencion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRetencionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporetencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporetencion);
				
				TipoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporetencion,new Object(),this.tiporetencionParameterGeneral,this.tiporetencionReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoRetencion")) {
					jCheckBoxSeleccionarTodosTipoRetencionItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoRetencion")) {
					jCheckBoxSeleccionadosTipoRetencionItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoRetencion")) {
					
				}
				
				


				
				
				TipoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporetencion,new Object(),this.tiporetencionParameterGeneral,this.tiporetencionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRetencion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRetencion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporetencion);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tiporetencion);
				
				TipoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporetencion,new Object(),this.tiporetencionParameterGeneral,this.tiporetencionReturnGeneral);
												
				
				


				
				
				TipoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporetencion,new Object(),this.tiporetencionParameterGeneral,this.tiporetencionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRetencion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRetencion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRetencionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoRetencion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporetencionAnterior =(TipoRetencion) this.tiporetencionLogic.getTipoRetencions().toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tiporetencionAnterior =(TipoRetencion) this.tiporetencions.toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRetencionActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporetencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporetencion);
				
				TipoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporetencion,new Object(),this.tiporetencionParameterGeneral,this.tiporetencionReturnGeneral);
				
				
				TipoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporetencion,new Object(),this.tiporetencionParameterGeneral,this.tiporetencionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
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
			
			TipoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiporetencion,new Object(),this.tiporetencionParameterGeneral,this.tiporetencionReturnGeneral);
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
			
			


			
			TipoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencion,new Object(),this.tiporetencionParameterGeneral,this.tiporetencionReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRetencionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporetencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporetencion);
				
				TipoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiporetencion,new Object(),this.tiporetencionParameterGeneral,this.tiporetencionReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencion,new Object(),this.tiporetencionParameterGeneral,this.tiporetencionReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRetencion.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRetencion.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporetencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporetencion);
				
				TipoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiporetencion,new Object(),this.tiporetencionParameterGeneral,this.tiporetencionReturnGeneral);
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
				
				


				
				TipoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencion,new Object(),this.tiporetencionParameterGeneral,this.tiporetencionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRetencion.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRetencion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRetencionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRetencion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporetencionAnterior =(TipoRetencion) this.tiporetencionLogic.getTipoRetencions().toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporetencionAnterior =(TipoRetencion) this.tiporetencions.toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencion,new Object(),this.tiporetencionParameterGeneral,this.tiporetencionReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoRetencion")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoRetencionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoRetencion.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tiporetencion =(TipoRetencion) this.tiporetencionLogic.getTipoRetencions().toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tiporetencion =(TipoRetencion) this.tiporetencions.toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tiporetencion);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoRetencion")) {
				
				}
				
				TipoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporetencion,new Object(),this.tiporetencionParameterGeneral,this.tiporetencionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tiporetencion,new Object(),this.tiporetencionParameterGeneral,this.tiporetencionReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoRetencion")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoRetencion.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoRetencion")) {
			
			}
			
			TipoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tiporetencion,new Object(),this.tiporetencionParameterGeneral,this.tiporetencionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoRetencion();
			
			TipoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporetencion,new Object(),this.tiporetencionParameterGeneral,this.tiporetencionReturnGeneral);
			
			if(sTipo.equals("NuevoTipoRetencion")) {
				jButtonNuevoTipoRetencionActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoRetencion")) {
				jButtonDuplicarTipoRetencionActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoRetencion")) {
				jButtonCopiarTipoRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoRetencion")) {
				jButtonVerFormTipoRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoRetencion")) {
				jButtonNuevoTipoRetencionActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoRetencion")) {
				jButtonModificarTipoRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoRetencion")) {
				jButtonActualizarTipoRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoRetencion")) {
				jButtonEliminarTipoRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoRetencion")) {
				jButtonGuardarCambiosTipoRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoRetencion")) {
				jButtonCancelarTipoRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoRetencion")) {
				jButtonCerrarTipoRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoRetencion")) {
				jButtonGuardarCambiosTipoRetencionActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoRetencion")) {
				jButtonNuevoGuardarCambiosTipoRetencionActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoRetencion")) {
				jButtonAbrirOrderByTipoRetencionActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoRetencion")) {
				jButtonRecargarInformacionTipoRetencionActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoRetencion")) {
				jButtonAnterioresTipoRetencionActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoRetencion")) {
				jButtonSiguientesTipoRetencionActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoRetencionBusqueda")) {
				this.jButtonidTipoRetencionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoRetencionUpdate")) {
				this.jButtonid_empresaTipoRetencionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoRetencionBusqueda")) {
				this.jButtonid_empresaTipoRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoRetencionBusqueda")) {
				this.jButtonnombreTipoRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoRetencionBusqueda")) {
				this.jButtoncodigoTipoRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeTipoRetencionBusqueda")) {
				this.jButtonporcentajeTipoRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("monto_minimoTipoRetencionBusqueda")) {
				this.jButtonmonto_minimoTipoRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contableTipoRetencion")) {
				this.jButtonid_cuenta_contableTipoRetencionActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contableTipoRetencionArbol")) {
				this.abrirFrameTreeCuentaContable("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contableTipoRetencionUpdate")) {
				this.jButtonid_cuenta_contableTipoRetencionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contableTipoRetencionBusqueda")) {
				this.jButtonid_cuenta_contableTipoRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoTipoRetencion")) {
				this.jButtonid_cuenta_contable_creditoTipoRetencionActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoTipoRetencionArbol")) {
				this.abrirFrameTreeCuentaContableCredito("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoTipoRetencionUpdate")) {
				this.jButtonid_cuenta_contable_creditoTipoRetencionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoTipoRetencionBusqueda")) {
				this.jButtonid_cuenta_contable_creditoTipoRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_retencion_ivaTipoRetencionBusqueda")) {
				this.jButtones_retencion_ivaTipoRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_debitoTipoRetencionBusqueda")) {
				this.jButtones_debitoTipoRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_con_iva_facturaTipoRetencionBusqueda")) {
				this.jButtones_con_iva_facturaTipoRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_con_sub_total_facturaTipoRetencionBusqueda")) {
				this.jButtones_con_sub_total_facturaTipoRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_con_secuencialTipoRetencionBusqueda")) {
				this.jButtones_con_secuencialTipoRetencionBusquedaActionPerformed(evt);
			}
			
			TipoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporetencion,new Object(),this.tiporetencionParameterGeneral,this.tiporetencionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoRetencion();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tiporetencion,new Object(),this.tiporetencionParameterGeneral,this.tiporetencionReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoRetencion")) {
				closingInternalFrameTipoRetencion();
				
			} else if(sTipo.equals("jButtonCancelarTipoRetencion")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoRetencion = (JInternalFrameBase)evt.getSource();
	            	
	            TipoRetencionBeanSwingJInternalFrame jInternalFrameParent=(TipoRetencionBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoRetencion.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoRetencionActionPerformed(null);
			}
			
			TipoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tiporetencion,new Object(),this.tiporetencionParameterGeneral,this.tiporetencionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoRetencion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoRetencion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoRetencion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tiporetencion)) {
			if(!esControlTabla) {
				if(TipoRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoRetencion(this.tiporetencion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencion(this.tiporetencion);			
				}
				
				if(this.tiporetencionSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoRetencion(this.tiporetencion,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tiporetencionReturnGeneral=tiporetencionLogic.procesarEventosTipoRetencionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiporetencionLogic.getTipoRetencions(),this.tiporetencion,this.tiporetencionParameterGeneral,this.isEsNuevoTipoRetencion,classes);//this.tiporetencionLogic.getTipoRetencion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoRetencion(this.tiporetencionReturnGeneral,this.tiporetencionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tiporetencionSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoRetencion(classes,this.tiporetencionReturnGeneral,this.tiporetencionBean,false);
					}
						
					if(this.tiporetencionReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoRetencion(this.tiporetencionReturnGeneral.getTipoRetencion());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoRetencion(this.tiporetencionReturnGeneral.getTipoRetencion());	
					}
						
					if(this.tiporetencionReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoRetencion(this.tiporetencionReturnGeneral.getTipoRetencion(),classes);//this.tiporetencionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoRetencion(this.tiporetencion,classes);//this.tiporetencionBean);									
				}
			
				if(TipoRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoRetencion(this.tiporetencion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRetencion(this.tiporetencion);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tiporetencionAnterior!=null) {
						this.tiporetencion=this.tiporetencionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tiporetencionReturnGeneral=tiporetencionLogic.procesarEventosTipoRetencionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiporetencionLogic.getTipoRetencions(),this.tiporetencion,this.tiporetencionParameterGeneral,this.isEsNuevoTipoRetencion,classes);//this.tiporetencionLogic.getTipoRetencion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tiporetencionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tiporetencionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tiporetencionReturnGeneral.getTipoRetencion(),tiporetencionLogic.getTipoRetencions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tiporetencionReturnGeneral.getTipoRetencion(),this.tiporetencions);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoRetencion.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoRetencion.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoRetencion();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoRetencion() throws Exception {
		
		TipoRetencionModel tiporetencionModel=(TipoRetencionModel)this.jTableDatosTipoRetencion.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiporetencionModel.tiporetencions=this.tiporetencionLogic.getTipoRetencions();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tiporetencionModel.tiporetencions=this.tiporetencions;
		}
		
		
		((TipoRetencionModel) this.jTableDatosTipoRetencion.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoRetencion() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettiporetencionAnterior(),this.tiporetencionLogic.getTipoRetencions());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettiporetencionAnterior(),this.tiporetencions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoRetencion();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoRetencion(TipoRetencion tiporetencion,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
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
										
				TipoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiporetencion,new Object(),generalEntityParameterGeneral,this.tiporetencionReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tiporetencionSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoRetencionConstantesFunciones.getClassesRelationshipsOfTipoRetencion(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoRetencionConstantesFunciones.getClassesRelationshipsFromStringsOfTipoRetencion(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoRetencion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiporetencion,new Object(),generalEntityParameterGeneral,this.tiporetencionReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoRetencion(TipoRetencionBean tiporetencionBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoRetencion(ArrayList<Classe> classes,TipoRetencionReturnGeneral tiporetencionReturnGeneral,TipoRetencionBean tiporetencionBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoRetencion(TipoRetencion tiporetencion,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tiporetencion)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoRetencion = new TipoRetencionDetalleFormJInternalFrame(jDesktopPane,this.tiporetencionSessionBean.getConGuardarRelaciones(),this.tiporetencionSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoRetencion);
		this.jInternalFrameDetalleFormTipoRetencion.setVisible(false);
		this.jInternalFrameDetalleFormTipoRetencion.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoRetencion.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoRetencion.tiporetencionLogic=this.tiporetencionLogic;
		
		this.cargarCombosFrameForeignKeyTipoRetencion("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoRetencion();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoRetencion();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoRetencion("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoRetencion();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoRetencion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoRetencion"));
		
		this.jInternalFrameDetalleFormTipoRetencion.jButtonModificarTipoRetencion.addActionListener(new ButtonActionListener(this,"ModificarTipoRetencion"));

		
		this.jInternalFrameDetalleFormTipoRetencion.jButtonModificarToolBarTipoRetencion.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoRetencion"));
					
		this.jInternalFrameDetalleFormTipoRetencion.jMenuItemModificarTipoRetencion.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoRetencion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoRetencion.jButtonActualizarTipoRetencion.addActionListener (new ButtonActionListener(this,"ActualizarTipoRetencion"));
		
		
		this.jInternalFrameDetalleFormTipoRetencion.jButtonActualizarToolBarTipoRetencion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoRetencion"));
						
		this.jInternalFrameDetalleFormTipoRetencion.jMenuItemActualizarTipoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoRetencion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoRetencion.jButtonEliminarTipoRetencion.addActionListener (new ButtonActionListener(this,"EliminarTipoRetencion"));
		
		
		this.jInternalFrameDetalleFormTipoRetencion.jButtonEliminarToolBarTipoRetencion.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoRetencion"));
								
		this.jInternalFrameDetalleFormTipoRetencion.jMenuItemEliminarTipoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoRetencion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoRetencion.jButtonCancelarTipoRetencion.addActionListener (new ButtonActionListener(this,"CancelarTipoRetencion"));
		
		
		this.jInternalFrameDetalleFormTipoRetencion.jButtonCancelarToolBarTipoRetencion.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoRetencion"));
					
		this.jInternalFrameDetalleFormTipoRetencion.jMenuItemCancelarTipoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoRetencion"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoRetencion.jMenuItemDetalleCerrarTipoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoRetencion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoRetencion.jButtonGuardarCambiosToolBarTipoRetencion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoRetencion"));
		
		
		
		this.jInternalFrameDetalleFormTipoRetencion.jButtonGuardarCambiosToolBarTipoRetencion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoRetencion"));
		
		
		
		this.jInternalFrameDetalleFormTipoRetencion.jComboBoxTiposAccionesFormularioTipoRetencion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoRetencion"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencion.jButtonidTipoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"idTipoRetencionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoRetencion.jButtonid_empresaTipoRetencionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoRetencionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencion.jButtonid_empresaTipoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencion.jButtonnombreTipoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencion.jButtoncodigoTipoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencion.jButtonporcentajeTipoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeTipoRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencion.jButtonmonto_minimoTipoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"monto_minimoTipoRetencionBusqueda"));
		//jButtonid_cuenta_contableTipoRetencion.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contableTipoRetencionActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormTipoRetencion.jButtonid_cuenta_contableTipoRetencion.addActionListener(new ButtonActionListener(this,"id_cuenta_contableTipoRetencion"));
		//jButtonid_cuenta_contableTipoRetencionArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContable("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormTipoRetencion.jButtonid_cuenta_contableTipoRetencionArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contableTipoRetencionArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoRetencion.jButtonid_cuenta_contableTipoRetencionUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableTipoRetencionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencion.jButtonid_cuenta_contableTipoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableTipoRetencionBusqueda"));
		//jButtonid_cuenta_contable_creditoTipoRetencion.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contable_creditoTipoRetencionActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormTipoRetencion.jButtonid_cuenta_contable_creditoTipoRetencion.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoTipoRetencion"));
		//jButtonid_cuenta_contable_creditoTipoRetencionArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContableCredito("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormTipoRetencion.jButtonid_cuenta_contable_creditoTipoRetencionArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoTipoRetencionArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoRetencion.jButtonid_cuenta_contable_creditoTipoRetencionUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoTipoRetencionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencion.jButtonid_cuenta_contable_creditoTipoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoTipoRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencion.jButtones_retencion_ivaTipoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"es_retencion_ivaTipoRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencion.jButtones_debitoTipoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"es_debitoTipoRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencion.jButtones_con_iva_facturaTipoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"es_con_iva_facturaTipoRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencion.jButtones_con_sub_total_facturaTipoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"es_con_sub_total_facturaTipoRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencion.jButtones_con_secuencialTipoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"es_con_secuencialTipoRetencionBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoRetencion.jTabbedPaneRelacionesTipoRetencion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoRetencion"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoRetencion"));
		
		if(this.jInternalFrameDetalleFormTipoRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRetencion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoRetencion"));
		}
		
		this.jTableDatosTipoRetencion.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoRetencion"));
		
		this.jTableDatosTipoRetencion.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoRetencion"));
		
		this.jButtonNuevoTipoRetencion.addActionListener(new ButtonActionListener(this,"NuevoTipoRetencion"));
		
		this.jButtonDuplicarTipoRetencion.addActionListener(new ButtonActionListener(this,"DuplicarTipoRetencion"));
		
		this.jButtonCopiarTipoRetencion.addActionListener(new ButtonActionListener(this,"CopiarTipoRetencion"));
		
		this.jButtonVerFormTipoRetencion.addActionListener(new ButtonActionListener(this,"VerFormTipoRetencion"));
		
		
		this.jButtonNuevoToolBarTipoRetencion.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoRetencion"));
			
		this.jButtonDuplicarToolBarTipoRetencion.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoRetencion"));
			
		this.jMenuItemNuevoTipoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoRetencion"));
			
		this.jMenuItemDuplicarTipoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoRetencion"));		
		
		
		this.jButtonNuevoRelacionesTipoRetencion.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoRetencion"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoRetencion.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoRetencion"));
			
		this.jMenuItemNuevoRelacionesTipoRetencion.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoRetencion"));		
		
		
		if(this.jInternalFrameDetalleFormTipoRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRetencion.jButtonModificarTipoRetencion.addActionListener(new ButtonActionListener(this,"ModificarTipoRetencion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRetencion.jButtonModificarToolBarTipoRetencion.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoRetencion"));
			
			this.jInternalFrameDetalleFormTipoRetencion.jMenuItemModificarTipoRetencion.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoRetencion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRetencion!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoRetencion.jButtonActualizarTipoRetencion.addActionListener (new ButtonActionListener(this,"ActualizarTipoRetencion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRetencion.jButtonActualizarToolBarTipoRetencion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoRetencion"));
				
			this.jInternalFrameDetalleFormTipoRetencion.jMenuItemActualizarTipoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoRetencion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRetencion.jButtonEliminarTipoRetencion.addActionListener (new ButtonActionListener(this,"EliminarTipoRetencion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRetencion.jButtonEliminarToolBarTipoRetencion.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoRetencion"));
						
			this.jInternalFrameDetalleFormTipoRetencion.jMenuItemEliminarTipoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoRetencion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRetencion.jButtonCancelarTipoRetencion.addActionListener (new ButtonActionListener(this,"CancelarTipoRetencion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRetencion.jButtonCancelarToolBarTipoRetencion.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoRetencion"));
			
			this.jInternalFrameDetalleFormTipoRetencion.jMenuItemCancelarTipoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoRetencion"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoRetencion.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoRetencion"));		
		
		
		this.jButtonCerrarTipoRetencion.addActionListener (new ButtonActionListener(this,"CerrarTipoRetencion"));
		
		
		this.jButtonCerrarToolBarTipoRetencion.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoRetencion"));
			
		this.jMenuItemCerrarTipoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoRetencion"));
			
		if(this.jInternalFrameDetalleFormTipoRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRetencion.jMenuItemDetalleCerrarTipoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoRetencion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRetencion.jButtonGuardarCambiosTipoRetencion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoRetencion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRetencion.jButtonGuardarCambiosToolBarTipoRetencion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoRetencion"));
		}
		
		this.jButtonCopiarToolBarTipoRetencion.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoRetencion"));
			
		this.jButtonVerFormToolBarTipoRetencion.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoRetencion"));
		
		this.jMenuItemGuardarCambiosTipoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoRetencion"));
			
		this.jMenuItemCopiarTipoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoRetencion"));		
		
		this.jMenuItemVerFormTipoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoRetencion"));		
		
		
		this.jButtonGuardarCambiosTablaTipoRetencion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoRetencion"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoRetencion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoRetencion"));
			
		this.jMenuItemGuardarCambiosTablaTipoRetencion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoRetencion"));		
		
		
		
		this.jButtonRecargarInformacionTipoRetencion.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoRetencion"));
					
		this.jButtonRecargarInformacionToolBarTipoRetencion.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoRetencion"));
		
		this.jMenuItemRecargarInformacionTipoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoRetencion"));		
		
		
		
		this.jButtonAnterioresTipoRetencion.addActionListener (new ButtonActionListener(this,"AnterioresTipoRetencion"));
		
		
		this.jButtonAnterioresToolBarTipoRetencion.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoRetencion"));
		
		this.jMenuItemAnterioresTipoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoRetencion"));		
		
		
		this.jButtonSiguientesTipoRetencion.addActionListener (new ButtonActionListener(this,"SiguientesTipoRetencion"));
		
		
		this.jButtonSiguientesToolBarTipoRetencion.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoRetencion"));
			
		this.jMenuItemSiguientesTipoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoRetencion"));
			
		this.jMenuItemAbrirOrderByTipoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoRetencion"));
			
		this.jMenuItemMostrarOcultarTipoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoRetencion"));
			
		this.jMenuItemDetalleAbrirOrderByTipoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoRetencion"));
			
		this.jMenuItemDetalleMostarOcultarTipoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoRetencion"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoRetencion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoRetencion"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoRetencion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoRetencion"));
			
		this.jMenuItemNuevoGuardarCambiosTipoRetencion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoRetencion"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoRetencion.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoRetencion"));

		this.jCheckBoxSeleccionadosTipoRetencion.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoRetencion"));
		
		if(this.jInternalFrameDetalleFormTipoRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRetencion.jComboBoxTiposAccionesFormularioTipoRetencion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoRetencion"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoRetencion.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoRetencion"));
			
		this.jComboBoxTiposAccionesTipoRetencion.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoRetencion"));
					
		this.jComboBoxTiposSeleccionarTipoRetencion.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoRetencion"));
			
		this.jTextFieldValorCampoGeneralTipoRetencion.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoRetencion"));		
		
		
		if(this.jInternalFrameDetalleFormTipoRetencion!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencion.jButtonidTipoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"idTipoRetencionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoRetencion.jButtonid_empresaTipoRetencionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoRetencionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencion.jButtonid_empresaTipoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencion.jButtonnombreTipoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencion.jButtoncodigoTipoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencion.jButtonporcentajeTipoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeTipoRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencion.jButtonmonto_minimoTipoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"monto_minimoTipoRetencionBusqueda"));
		//jButtonid_cuenta_contableTipoRetencion.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contableTipoRetencionActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormTipoRetencion.jButtonid_cuenta_contableTipoRetencion.addActionListener(new ButtonActionListener(this,"id_cuenta_contableTipoRetencion"));
		//jButtonid_cuenta_contableTipoRetencionArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContable("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormTipoRetencion.jButtonid_cuenta_contableTipoRetencionArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contableTipoRetencionArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoRetencion.jButtonid_cuenta_contableTipoRetencionUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableTipoRetencionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencion.jButtonid_cuenta_contableTipoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableTipoRetencionBusqueda"));
		//jButtonid_cuenta_contable_creditoTipoRetencion.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contable_creditoTipoRetencionActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormTipoRetencion.jButtonid_cuenta_contable_creditoTipoRetencion.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoTipoRetencion"));
		//jButtonid_cuenta_contable_creditoTipoRetencionArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContableCredito("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormTipoRetencion.jButtonid_cuenta_contable_creditoTipoRetencionArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoTipoRetencionArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoRetencion.jButtonid_cuenta_contable_creditoTipoRetencionUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoTipoRetencionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencion.jButtonid_cuenta_contable_creditoTipoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoTipoRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencion.jButtones_retencion_ivaTipoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"es_retencion_ivaTipoRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencion.jButtones_debitoTipoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"es_debitoTipoRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencion.jButtones_con_iva_facturaTipoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"es_con_iva_facturaTipoRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencion.jButtones_con_sub_total_facturaTipoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"es_con_sub_total_facturaTipoRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencion.jButtones_con_secuencialTipoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"es_con_secuencialTipoRetencionBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPoNombreTipoRetencion.addActionListener(new ButtonActionListener(this,"BusquedaPoNombreTipoRetencion"));

			this.jButtonBusquedaPorCodigoSriTipoRetencion.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoSriTipoRetencion"));

			this.jButtonBusquedaPorIdTipoRetencion.addActionListener(new ButtonActionListener(this,"BusquedaPorIdTipoRetencion"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoRetencion!=null) {
				this.jInternalFrameReporteDinamicoTipoRetencion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoRetencion"));
				this.jInternalFrameReporteDinamicoTipoRetencion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoRetencion"));
				this.jInternalFrameReporteDinamicoTipoRetencion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoRetencion"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoRetencion.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoRetencion"));				
			//this.jButtonGenerarReporteDinamicoTipoRetencion.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoRetencion"));
			//this.jButtonGenerarExcelReporteDinamicoTipoRetencion.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoRetencion"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoRetencion!=null) {
				this.jInternalFrameImportacionTipoRetencion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoRetencion"));
				this.jInternalFrameImportacionTipoRetencion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoRetencion"));
				this.jInternalFrameImportacionTipoRetencion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoRetencion"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoRetencion.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoRetencion"));
			
			this.jButtonAbrirOrderByToolBarTipoRetencion.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoRetencion"));			
			
			if(this.jInternalFrameOrderByTipoRetencion!=null) {
				this.jInternalFrameOrderByTipoRetencion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoRetencion"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoRetencion!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRetencion.jTabbedPaneRelacionesTipoRetencion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoRetencion"));
		
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
            		closingInternalFrameTipoRetencion();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoRetencion.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoRetencion = (JInternalFrameBase)event.getSource();
	            	
	            TipoRetencionBeanSwingJInternalFrame jInternalFrameParent=(TipoRetencionBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoRetencion.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoRetencionActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoRetencion.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoRetencionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoRetencion.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoRetencion.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRetencionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRetencionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRetencionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoRetencion";
		inputMap = this.jButtonNuevoTipoRetencion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoRetencion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoRetencionActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRetencionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRetencionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRetencionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoRetencion";
		inputMap = this.jButtonNuevoRelacionesTipoRetencion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoRetencion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoRetencionActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoRetencion";
		inputMap = this.jButtonModificarTipoRetencion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoRetencion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoRetencionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoRetencion";
		inputMap = this.jButtonActualizarTipoRetencion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoRetencion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoRetencionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoRetencion";
		inputMap = this.jButtonEliminarTipoRetencion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoRetencion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoRetencionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoRetencion";
		inputMap = this.jButtonCancelarTipoRetencion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoRetencion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoRetencionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoRetencion";
		inputMap = this.jButtonCerrarTipoRetencion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoRetencion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoRetencionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoRetencion.jButtonGuardarCambiosTipoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoRetencion";
		inputMap = this.jInternalFrameDetalleFormTipoRetencion.jButtonGuardarCambiosTipoRetencion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoRetencion.jButtonGuardarCambiosTipoRetencion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoRetencionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoRetencion.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoRetencionItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoRetencion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoRetencionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoRetencion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoRetencionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoRetencion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoRetencionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencion.jButtonidTipoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"idTipoRetencionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoRetencion.jButtonid_empresaTipoRetencionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoRetencionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencion.jButtonid_empresaTipoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencion.jButtonnombreTipoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencion.jButtoncodigoTipoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencion.jButtonporcentajeTipoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeTipoRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencion.jButtonmonto_minimoTipoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"monto_minimoTipoRetencionBusqueda"));
		//jButtonid_cuenta_contableTipoRetencion.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contableTipoRetencionActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormTipoRetencion.jButtonid_cuenta_contableTipoRetencion.addActionListener(new ButtonActionListener(this,"id_cuenta_contableTipoRetencion"));
		//jButtonid_cuenta_contableTipoRetencionArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContable("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormTipoRetencion.jButtonid_cuenta_contableTipoRetencionArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contableTipoRetencionArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoRetencion.jButtonid_cuenta_contableTipoRetencionUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableTipoRetencionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencion.jButtonid_cuenta_contableTipoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableTipoRetencionBusqueda"));
		//jButtonid_cuenta_contable_creditoTipoRetencion.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contable_creditoTipoRetencionActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormTipoRetencion.jButtonid_cuenta_contable_creditoTipoRetencion.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoTipoRetencion"));
		//jButtonid_cuenta_contable_creditoTipoRetencionArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContableCredito("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormTipoRetencion.jButtonid_cuenta_contable_creditoTipoRetencionArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoTipoRetencionArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoRetencion.jButtonid_cuenta_contable_creditoTipoRetencionUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoTipoRetencionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencion.jButtonid_cuenta_contable_creditoTipoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoTipoRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencion.jButtones_retencion_ivaTipoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"es_retencion_ivaTipoRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencion.jButtones_debitoTipoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"es_debitoTipoRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencion.jButtones_con_iva_facturaTipoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"es_con_iva_facturaTipoRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencion.jButtones_con_sub_total_facturaTipoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"es_con_sub_total_facturaTipoRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRetencion.jButtones_con_secuencialTipoRetencionBusqueda.addActionListener(new ButtonActionListener(this,"es_con_secuencialTipoRetencionBusqueda"));
		
		
		this.jButtonBusquedaPoNombreTipoRetencion.addActionListener(new ButtonActionListener(this,"BusquedaPoNombreTipoRetencion"));

		this.jButtonBusquedaPorCodigoSriTipoRetencion.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoSriTipoRetencion"));

		this.jButtonBusquedaPorIdTipoRetencion.addActionListener(new ButtonActionListener(this,"BusquedaPorIdTipoRetencion"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoRetencionActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoRetencion.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoRetencion(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoRetencion tiporetencionAux:this.tiporetencionLogic.getTipoRetencions()) {
					tiporetencionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoRetencion tiporetencionAux:tiporetencions) {
					tiporetencionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoRetencionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoRetencion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoRetencion tiporetencionAux:this.tiporetencionLogic.getTipoRetencions()) {
						tiporetencionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoRetencion tiporetencionAux:tiporetencions) {
						tiporetencionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoRetencion tiporetencionAux:this.tiporetencionLogic.getTipoRetencions()) {
					
						if(sTipoSeleccionar.equals(TipoRetencionConstantesFunciones.LABEL_ESRETENCIONIVA)) {
							existe=true;
							tiporetencionAux.setes_retencion_iva(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(TipoRetencionConstantesFunciones.LABEL_ESDEBITO)) {
							existe=true;
							tiporetencionAux.setes_debito(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(TipoRetencionConstantesFunciones.LABEL_ESCONIVAFACTURA)) {
							existe=true;
							tiporetencionAux.setes_con_iva_factura(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(TipoRetencionConstantesFunciones.LABEL_ESCONSUBTOTALFACTURA)) {
							existe=true;
							tiporetencionAux.setes_con_sub_total_factura(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(TipoRetencionConstantesFunciones.LABEL_ESCONSECUENCIAL)) {
							existe=true;
							tiporetencionAux.setes_con_secuencial(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoRetencion tiporetencionAux:tiporetencions) {
						
						if(sTipoSeleccionar.equals(TipoRetencionConstantesFunciones.LABEL_ESRETENCIONIVA)) {
							existe=true;
							tiporetencionAux.setes_retencion_iva(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(TipoRetencionConstantesFunciones.LABEL_ESDEBITO)) {
							existe=true;
							tiporetencionAux.setes_debito(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(TipoRetencionConstantesFunciones.LABEL_ESCONIVAFACTURA)) {
							existe=true;
							tiporetencionAux.setes_con_iva_factura(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(TipoRetencionConstantesFunciones.LABEL_ESCONSUBTOTALFACTURA)) {
							existe=true;
							tiporetencionAux.setes_con_sub_total_factura(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(TipoRetencionConstantesFunciones.LABEL_ESCONSECUENCIAL)) {
							existe=true;
							tiporetencionAux.setes_con_secuencial(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoRetencion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoRetencion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoRetencion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoRetencion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoRetencionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoRetencion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoRetencion.getSelectedRows();
			
			TipoRetencion tiporetencionLocal=new TipoRetencion();
			
			//this.seleccionarTodosTipoRetencion(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporetencionLocal =(TipoRetencion) this.tiporetencionLogic.getTipoRetencions().toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tiporetencionLocal =(TipoRetencion) this.tiporetencions.toArray()[this.jTableDatosTipoRetencion.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tiporetencionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoRetencion tiporetencionAux:this.tiporetencionLogic.getTipoRetencions()) {
						tiporetencionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoRetencion tiporetencionAux:tiporetencions) {
						tiporetencionAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoRetencion(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoRetencion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoRetencion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoRetencion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoRetencionItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoRetencionParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoRetencionActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoRetencion(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoRetencion.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoRetencion tiporetencionAux:this.tiporetencionLogic.getTipoRetencions()) {
				
						if(sTipoSeleccionar.equals(TipoRetencionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tiporetencionAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoRetencionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tiporetencionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoRetencionConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							tiporetencionAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TipoRetencionConstantesFunciones.LABEL_MONTOMINIMO)) {
							existe=true;
							tiporetencionAux.setmonto_minimo(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoRetencion tiporetencionAux:tiporetencions) {
					
						if(sTipoSeleccionar.equals(TipoRetencionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tiporetencionAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoRetencionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tiporetencionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoRetencionConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							tiporetencionAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TipoRetencionConstantesFunciones.LABEL_MONTOMINIMO)) {
							existe=true;
							tiporetencionAux.setmonto_minimo(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoRetencion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoRetencionActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoRetencion(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoRetencion=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoRetencion.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoRetencion.jComboBoxTiposAccionesFormularioTipoRetencion.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoRetencion) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoRetencion(conSplash);
				
					this.generarReporteTipoRetencionsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoRetencion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoRetencion.jComboBoxTiposAccionesFormularioTipoRetencion.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoRetencionsSeleccionados();
				//this.jComboBoxTiposAccionesTipoRetencion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoRetencionsSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoRetencion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoRetencionsSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoRetencion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoRetencion();
				
				this.exportarTipoRetencionsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoRetencion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoRetencion.jComboBoxTiposAccionesFormularioTipoRetencion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoRetencions();
				//this.importarTipoRetencions();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoRetencion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoRetencion.jComboBoxTiposAccionesFormularioTipoRetencion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoRetencion();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoRetencionsSeleccionados();
				//this.jComboBoxTiposAccionesTipoRetencion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Retencion ", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoRetencion();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoRetencion)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoRetencion(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Retencion ",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoRetencion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoRetencion.jComboBoxTiposAccionesFormularioTipoRetencion.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoRetencionBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoRetencion) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoRetencion(conSplash);
					
						//this.actualizarParametrosGeneralTipoRetencion();
						
						this.generarReporteProcesoAccionTipoRetencionsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoRetencion.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoRetencion.jComboBoxTiposAccionesFormularioTipoRetencion.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoRetencionBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Retencion S SELECCIONADOS?", "MANTENIMIENTO DE Tipo Retencion ", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoRetencion();
				
						this.actualizarParametrosGeneralTipoRetencion();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tiporetencionReturnGeneral=tiporetencionLogic.procesarAccionTipoRetencionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tiporetencionLogic.getTipoRetencions(),this.tiporetencionParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoRetencionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoRetencion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoRetencion.jComboBoxTiposAccionesFormularioTipoRetencion.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoRetencion();
					
					TipoRetencionBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoRetencionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoRetencion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoRetencion.jComboBoxTiposAccionesFormularioTipoRetencion.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoRetencion(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoRetencionActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoRetencion();
			
			if(this.jInternalFrameDetalleFormTipoRetencion==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoRetencion> tiporetencionsSeleccionados=new ArrayList<TipoRetencion>();		
			TipoRetencion tiporetencion=new TipoRetencion();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoRetencion(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoRetencion.getSelectedItem();
			
			
			
			
			tiporetencionsSeleccionados=this.getTipoRetencionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(tiporetencionsSeleccionados.size()==1) {
				for(TipoRetencion tiporetencionAux:tiporetencionsSeleccionados) {
					tiporetencion=tiporetencionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoRetencion();
			
      		//this.finishProcessTipoRetencion(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoRetencionReturnGeneral() throws Exception {
		if(this.tiporetencionReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tiporetencionReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tiporetencionReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tiporetencionReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tiporetencionReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tiporetencionReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoRetencion(false);
		}
		
		if(this.tiporetencionReturnGeneral.getConRetornoLista() || this.tiporetencionReturnGeneral.getConRetornoObjeto()) {
			if(this.tiporetencionReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tiporetencionLogic.setTipoRetencions(this.tiporetencionReturnGeneral.getTipoRetencions());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tiporetencionReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tiporetencionLogic.setTipoRetencion(this.tiporetencionReturnGeneral.getTipoRetencion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoRetencion(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoRetencion() throws Exception {
		
		
	}
	
	public ArrayList<TipoRetencion> getTipoRetencionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoRetencion> tiporetencionsSeleccionados=new ArrayList<TipoRetencion>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoRetencion) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoRetencion tiporetencionAux:tiporetencionLogic.getTipoRetencions()) {
					if(tiporetencionAux.getIsSelected()) {
						tiporetencionsSeleccionados.add(tiporetencionAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoRetencion tiporetencionAux:this.tiporetencions) {
					if(tiporetencionAux.getIsSelected()) {
						tiporetencionsSeleccionados.add(tiporetencionAux);				
					}
				}
			}
			
			if(tiporetencionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tiporetencionsSeleccionados.addAll(this.tiporetencionLogic.getTipoRetencions());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tiporetencionsSeleccionados.addAll(this.tiporetencions);				
					}
				}
			}
		} else {
			tiporetencionsSeleccionados.add(this.tiporetencion);
		}
		
		return tiporetencionsSeleccionados;
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
	
	public void generarReporteTipoRetencionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoRetencionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoRetencionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoRetencionsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoRetencionsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Retencion ",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoRetencionsSeleccionados() throws Exception {
		ArrayList<TipoRetencion> tiporetencionsSeleccionados=new ArrayList<TipoRetencion>();		
		
		tiporetencionsSeleccionados=this.getTipoRetencionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoRetencions("Todos",tiporetencionsSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoRetencionsSeleccionados() throws Exception {
		ArrayList<TipoRetencion> tiporetencionsSeleccionados=new ArrayList<TipoRetencion>();		
		
		tiporetencionsSeleccionados=this.getTipoRetencionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoRetencions("Todos",tiporetencionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoRetencionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoRetencion> tiporetencionsSeleccionados=new ArrayList<TipoRetencion>();
		
		tiporetencionsSeleccionados=this.getTipoRetencionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoRetencions("Todos",tiporetencionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoRetencionsSeleccionados() throws Exception {
		ArrayList<TipoRetencion> tiporetencionsSeleccionados=new ArrayList<TipoRetencion>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoRetencion();
		
		
		tiporetencionsSeleccionados=this.getTipoRetencionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoRetencion();
		
		
		//this.generarReporteTipoRetencions("Todos",tiporetencionsSeleccionados ,tiporetencionImplementable,tiporetencionImplementableHome);
	}
	
	public void mostrarImportacionTipoRetencions() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoRetencion();
		
		this.abrirFrameImportacionTipoRetencion();		
		
			
		//this.generarReporteTipoRetencions("Todos",tiporetencionsSeleccionados ,tiporetencionImplementable,tiporetencionImplementableHome);
	}
	
	public void importarTipoRetencions() throws Exception {		
	
	}
	
	public void exportarTipoRetencionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoRetencionsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoRetencionsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoRetencionsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Retencion ",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoRetencionsSeleccionados() throws Exception {
		ArrayList<TipoRetencion> tiporetencionsSeleccionados=new ArrayList<TipoRetencion>();		
		
		tiporetencionsSeleccionados=this.getTipoRetencionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporetencion."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoRetencion(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoRetencion tiporetencionAux:tiporetencionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoRetencion(tiporetencionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tiporetencionAux.setsDetalleGeneralEntityReporte(tiporetencionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporetencionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Retencion ",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoRetencion(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoRetencionConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRetencionConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRetencionConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRetencionConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRetencionConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRetencionConstantesFunciones.LABEL_PORCENTAJE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRetencionConstantesFunciones.LABEL_MONTOMINIMO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRetencionConstantesFunciones.LABEL_IDCUENTACONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRetencionConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRetencionConstantesFunciones.LABEL_ESRETENCIONIVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRetencionConstantesFunciones.LABEL_ESDEBITO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRetencionConstantesFunciones.LABEL_ESCONIVAFACTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRetencionConstantesFunciones.LABEL_ESCONSUBTOTALFACTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRetencionConstantesFunciones.LABEL_ESCONSECUENCIAL;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoRetencion(TipoRetencion tiporetencion,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tiporetencion.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporetencion.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporetencion.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporetencion.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporetencion.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporetencion.getporcentaje().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporetencion.getmonto_minimo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporetencion.getcuentacontable_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporetencion.getcuentacontablecredito_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporetencion.getes_retencion_iva().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporetencion.getes_debito().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporetencion.getes_con_iva_factura().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporetencion.getes_con_sub_total_factura().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporetencion.getes_con_secuencial().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoRetencionsSeleccionados() throws Exception {
		ArrayList<TipoRetencion> tiporetencionsSeleccionados=new ArrayList<TipoRetencion>();		
		
		tiporetencionsSeleccionados=this.getTipoRetencionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporetencion.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoRetencions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoRetencion(row);				
				iRow++;
			}				
			
			for(TipoRetencion tiporetencionAux:tiporetencionsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoRetencion(tiporetencionAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporetencionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Retencion ",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoRetencionsSeleccionados() throws Exception {
		ArrayList<TipoRetencion> tiporetencionsSeleccionados=new ArrayList<TipoRetencion>();		
		
		tiporetencionsSeleccionados=this.getTipoRetencionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporetencion.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tiporetencions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tiporetencion");
			//elementRoot.appendChild(element);
		
			for(TipoRetencion tiporetencionAux:tiporetencionsSeleccionados) {
				element = document.createElement("tiporetencion");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoRetencion(tiporetencionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporetencionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Retencion ",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoRetencion(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRetencionConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRetencionConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoRetencionConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRetencionConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRetencionConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRetencionConstantesFunciones.LABEL_PORCENTAJE);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRetencionConstantesFunciones.LABEL_MONTOMINIMO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRetencionConstantesFunciones.LABEL_IDCUENTACONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRetencionConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRetencionConstantesFunciones.LABEL_ESRETENCIONIVA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRetencionConstantesFunciones.LABEL_ESDEBITO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRetencionConstantesFunciones.LABEL_ESCONIVAFACTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRetencionConstantesFunciones.LABEL_ESCONSUBTOTALFACTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRetencionConstantesFunciones.LABEL_ESCONSECUENCIAL);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoRetencion(TipoRetencion tiporetencion,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tiporetencion.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tiporetencion.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tiporetencion.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(tiporetencion.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tiporetencion.getporcentaje());
		cell = row.createCell(iColumn++);cell.setCellValue(tiporetencion.getmonto_minimo());
		cell = row.createCell(iColumn++);cell.setCellValue(tiporetencion.getcuentacontable_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tiporetencion.getcuentacontablecredito_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tiporetencion.getes_retencion_iva());
		cell = row.createCell(iColumn++);cell.setCellValue(tiporetencion.getes_debito());
		cell = row.createCell(iColumn++);cell.setCellValue(tiporetencion.getes_con_iva_factura());
		cell = row.createCell(iColumn++);cell.setCellValue(tiporetencion.getes_con_sub_total_factura());
		cell = row.createCell(iColumn++);cell.setCellValue(tiporetencion.getes_con_secuencial());				
	}
	
	public void setFilaDatosExportarXmlTipoRetencion(TipoRetencion tiporetencion,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoRetencionConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tiporetencion.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoRetencionConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tiporetencion.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoRetencionConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tiporetencion.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementnombre = document.createElement(TipoRetencionConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tiporetencion.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementcodigo = document.createElement(TipoRetencionConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tiporetencion.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementporcentaje = document.createElement(TipoRetencionConstantesFunciones.PORCENTAJE);
		elementporcentaje.appendChild(document.createTextNode(tiporetencion.getporcentaje().toString().trim()));
		element.appendChild(elementporcentaje);

		Element elementmonto_minimo = document.createElement(TipoRetencionConstantesFunciones.MONTOMINIMO);
		elementmonto_minimo.appendChild(document.createTextNode(tiporetencion.getmonto_minimo().toString().trim()));
		element.appendChild(elementmonto_minimo);

		Element elementcuentacontable_descripcion = document.createElement(TipoRetencionConstantesFunciones.IDCUENTACONTABLE);
		elementcuentacontable_descripcion.appendChild(document.createTextNode(tiporetencion.getcuentacontable_descripcion()));
		element.appendChild(elementcuentacontable_descripcion);

		Element elementcuentacontablecredito_descripcion = document.createElement(TipoRetencionConstantesFunciones.IDCUENTACONTABLECREDITO);
		elementcuentacontablecredito_descripcion.appendChild(document.createTextNode(tiporetencion.getcuentacontablecredito_descripcion()));
		element.appendChild(elementcuentacontablecredito_descripcion);

		Element elementes_retencion_iva = document.createElement(TipoRetencionConstantesFunciones.ESRETENCIONIVA);
		elementes_retencion_iva.appendChild(document.createTextNode(tiporetencion.getes_retencion_iva().toString().trim()));
		element.appendChild(elementes_retencion_iva);

		Element elementes_debito = document.createElement(TipoRetencionConstantesFunciones.ESDEBITO);
		elementes_debito.appendChild(document.createTextNode(tiporetencion.getes_debito().toString().trim()));
		element.appendChild(elementes_debito);

		Element elementes_con_iva_factura = document.createElement(TipoRetencionConstantesFunciones.ESCONIVAFACTURA);
		elementes_con_iva_factura.appendChild(document.createTextNode(tiporetencion.getes_con_iva_factura().toString().trim()));
		element.appendChild(elementes_con_iva_factura);

		Element elementes_con_sub_total_factura = document.createElement(TipoRetencionConstantesFunciones.ESCONSUBTOTALFACTURA);
		elementes_con_sub_total_factura.appendChild(document.createTextNode(tiporetencion.getes_con_sub_total_factura().toString().trim()));
		element.appendChild(elementes_con_sub_total_factura);

		Element elementes_con_secuencial = document.createElement(TipoRetencionConstantesFunciones.ESCONSECUENCIAL);
		elementes_con_secuencial.appendChild(document.createTextNode(tiporetencion.getes_con_secuencial().toString().trim()));
		element.appendChild(elementes_con_secuencial);
	}
	
	public void generarReporteGroupGenericoTipoRetencionsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoRetencion> tiporetencionsSeleccionados=new ArrayList<TipoRetencion>();
		
		tiporetencionsSeleccionados=this.getTipoRetencionsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoRetencion(tiporetencionsSeleccionados);
		
		this.generarReporteTipoRetencions("Todos",tiporetencionsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoRetencion(ArrayList<TipoRetencion> tiporetencionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoRetencion tiporetencionAux:tiporetencionsSeleccionados) {
				tiporetencionAux.setsDetalleGeneralEntityReporte(tiporetencionAux.toString());
			
				if(sTipoSeleccionar.equals(TipoRetencionConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tiporetencionAux.setsDescripcionGeneralEntityReporte1(tiporetencionAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoRetencionConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tiporetencionAux.setsDescripcionGeneralEntityReporte1(tiporetencionAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(TipoRetencionConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tiporetencionAux.setsDescripcionGeneralEntityReporte1(tiporetencionAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoRetencionConstantesFunciones.LABEL_IDCUENTACONTABLE)) {
					existe=true;
					tiporetencionAux.setsDescripcionGeneralEntityReporte1(tiporetencionAux.getcuentacontable_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoRetencionConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO)) {
					existe=true;
					tiporetencionAux.setsDescripcionGeneralEntityReporte1(tiporetencionAux.getcuentacontablecredito_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoRetencionConstantesFunciones.LABEL_ESRETENCIONIVA)) {
					existe=true;
					tiporetencionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(tiporetencionAux.getes_retencion_iva()));
				}
				 else if(sTipoSeleccionar.equals(TipoRetencionConstantesFunciones.LABEL_ESDEBITO)) {
					existe=true;
					tiporetencionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(tiporetencionAux.getes_debito()));
				}
				 else if(sTipoSeleccionar.equals(TipoRetencionConstantesFunciones.LABEL_ESCONIVAFACTURA)) {
					existe=true;
					tiporetencionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(tiporetencionAux.getes_con_iva_factura()));
				}
				 else if(sTipoSeleccionar.equals(TipoRetencionConstantesFunciones.LABEL_ESCONSUBTOTALFACTURA)) {
					existe=true;
					tiporetencionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(tiporetencionAux.getes_con_sub_total_factura()));
				}
				 else if(sTipoSeleccionar.equals(TipoRetencionConstantesFunciones.LABEL_ESCONSECUENCIAL)) {
					existe=true;
					tiporetencionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(tiporetencionAux.getes_con_secuencial()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoRetencion(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoRetencion=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoRetencion=true;
				this.isVisibilidadCeldaGuardarCambiosTipoRetencion=true;
			}
			
			this.isVisibilidadCeldaModificarTipoRetencion=false;
			this.isVisibilidadCeldaActualizarTipoRetencion=false;
			this.isVisibilidadCeldaEliminarTipoRetencion=false;
			this.isVisibilidadCeldaCancelarTipoRetencion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRetencion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoRetencion=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoRetencion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRetencion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRetencion=false;
			this.isVisibilidadCeldaModificarTipoRetencion=false;
			this.isVisibilidadCeldaActualizarTipoRetencion=true;
			this.isVisibilidadCeldaEliminarTipoRetencion=false;
			this.isVisibilidadCeldaCancelarTipoRetencion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRetencion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoRetencion=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoRetencion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRetencion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRetencion=false;
			this.isVisibilidadCeldaModificarTipoRetencion=false;
			this.isVisibilidadCeldaActualizarTipoRetencion=true;
			this.isVisibilidadCeldaEliminarTipoRetencion=true;
			this.isVisibilidadCeldaCancelarTipoRetencion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRetencion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoRetencion=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoRetencion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRetencion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRetencion=false;
			this.isVisibilidadCeldaModificarTipoRetencion=false;
			this.isVisibilidadCeldaActualizarTipoRetencion=true;
			this.isVisibilidadCeldaEliminarTipoRetencion=false;
			this.isVisibilidadCeldaCancelarTipoRetencion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRetencion=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoRetencion=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoRetencion=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoRetencion=true;
			this.isVisibilidadCeldaGuardarCambiosTipoRetencion=true;
			this.isVisibilidadCeldaModificarTipoRetencion=false;
			this.isVisibilidadCeldaActualizarTipoRetencion=false;
			this.isVisibilidadCeldaEliminarTipoRetencion=false;
			this.isVisibilidadCeldaCancelarTipoRetencion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRetencion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoRetencion=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoRetencion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRetencion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRetencion=false;
			this.isVisibilidadCeldaActualizarTipoRetencion=false;
			this.isVisibilidadCeldaEliminarTipoRetencion=false;
			this.isVisibilidadCeldaCancelarTipoRetencion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRetencion=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoRetencion=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoRetencion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRetencion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRetencion=false;
			this.isVisibilidadCeldaModificarTipoRetencion=true;
			this.isVisibilidadCeldaActualizarTipoRetencion=false;
			this.isVisibilidadCeldaEliminarTipoRetencion=false;
			this.isVisibilidadCeldaCancelarTipoRetencion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRetencion=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoRetencion=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoRetencionJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoRetencion=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoRetencion=true;
			this.isVisibilidadCeldaGuardarCambiosTipoRetencion=true;
		} else {
			this.actualizarEstadoPanelsTipoRetencion(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoRetencion=false;
			//this.isVisibilidadCeldaVerFormTipoRetencion=false;
			this.isVisibilidadCeldaDuplicarTipoRetencion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tiporetencionSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoRetencion=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoRetencion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRetencion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tiporetencionSessionBean.getEsGuardarRelacionado()) {
			if(!tiporetencionSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoRetencion=false;												
			}
			
			this.jButtonCerrarTipoRetencion.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoRetencion=false;
		}
		
		if(!this.permiteMantenimiento(this.tiporetencion)) {
			this.isVisibilidadCeldaActualizarTipoRetencion=false;
			this.isVisibilidadCeldaEliminarTipoRetencion=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoRetencion() {
	}
	
	public void actualizarEstadoPanelsTipoRetencion(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoRetencion!=null) {
				this.jScrollPanelDatosEdicionTipoRetencion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRetencion!=null) {
				this.jTabbedPaneBusquedasTipoRetencion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoRetencion!=null) {
				this.jScrollPanelDatosTipoRetencion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoRetencion!=null) {
				this.jPanelPaginacionTipoRetencion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoRetencion!=null) {
				this.jPanelParametrosReportesTipoRetencion.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoRetencion!=null) {
				this.jScrollPanelDatosEdicionTipoRetencion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRetencion!=null) {
				this.jTabbedPaneBusquedasTipoRetencion.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoRetencion!=null) {
				this.jScrollPanelDatosTipoRetencion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoRetencion!=null) {
				this.jPanelPaginacionTipoRetencion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoRetencion!=null) {
				this.jPanelParametrosReportesTipoRetencion.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoRetencion!=null) {
				this.jScrollPanelDatosEdicionTipoRetencion.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRetencion!=null) {
				this.jTabbedPaneBusquedasTipoRetencion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoRetencion!=null) {
				this.jScrollPanelDatosTipoRetencion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoRetencion!=null) {
				this.jPanelPaginacionTipoRetencion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoRetencion!=null) {
				this.jPanelParametrosReportesTipoRetencion.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoRetencion!=null) {
				this.jScrollPanelDatosEdicionTipoRetencion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRetencion!=null) {
				this.jTabbedPaneBusquedasTipoRetencion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoRetencion!=null) {
				this.jScrollPanelDatosTipoRetencion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoRetencion!=null) {
				this.jPanelPaginacionTipoRetencion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoRetencion!=null) {
				this.jPanelParametrosReportesTipoRetencion.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoRetencion!=null) {
				this.jScrollPanelDatosEdicionTipoRetencion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRetencion!=null) {
				this.jTabbedPaneBusquedasTipoRetencion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoRetencion!=null) {
				this.jScrollPanelDatosTipoRetencion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoRetencion!=null) {
				this.jPanelPaginacionTipoRetencion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoRetencion!=null) {
				this.jPanelParametrosReportesTipoRetencion.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoRetencion!=null) {
				this.jScrollPanelDatosEdicionTipoRetencion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRetencion!=null) {
				this.jTabbedPaneBusquedasTipoRetencion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoRetencion!=null) {
				this.jScrollPanelDatosTipoRetencion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoRetencion!=null) {
				this.jPanelPaginacionTipoRetencion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoRetencion!=null) {
				this.jPanelParametrosReportesTipoRetencion.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoRetencion!=null) {
				this.jScrollPanelDatosEdicionTipoRetencion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRetencion!=null) {
				this.jTabbedPaneBusquedasTipoRetencion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoRetencion!=null) {
				this.jScrollPanelDatosTipoRetencion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoRetencion!=null) {
				this.jPanelPaginacionTipoRetencion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoRetencion!=null) {
				this.jPanelParametrosReportesTipoRetencion.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tiporetencionSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoRetencion!=null) {
					this.jTabbedPaneBusquedasTipoRetencion.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoRetencion!=null) {
				this.jPanelParametrosReportesTipoRetencion.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tiporetencionSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRetencion!=null) {
				this.jTabbedPaneBusquedasTipoRetencion.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoRetencion!=null) {
				this.jPanelParametrosReportesTipoRetencion.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPoNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPoNombre) {this.jTabbedPaneBusquedasTipoRetencion.remove(jPanelBusquedaPoNombreTipoRetencion);}

			this.isVisibilidadBusquedaPorCodigoSri=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorCodigoSri) {this.jTabbedPaneBusquedasTipoRetencion.remove(jPanelBusquedaPorCodigoSriTipoRetencion);}

			this.isVisibilidadBusquedaPorId=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorId) {this.jTabbedPaneBusquedasTipoRetencion.remove(jPanelBusquedaPorIdTipoRetencion);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaContable(Boolean isParaCuentaContable){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableNegation=!isParaCuentaContable;

			this.isVisibilidadBusquedaPoNombre=isParaCuentaContableNegation;
			if(!this.isVisibilidadBusquedaPoNombre) {this.jTabbedPaneBusquedasTipoRetencion.remove(jPanelBusquedaPoNombreTipoRetencion);}

			this.isVisibilidadBusquedaPorCodigoSri=isParaCuentaContableNegation;
			if(!this.isVisibilidadBusquedaPorCodigoSri) {this.jTabbedPaneBusquedasTipoRetencion.remove(jPanelBusquedaPorCodigoSriTipoRetencion);}

			this.isVisibilidadBusquedaPorId=isParaCuentaContableNegation;
			if(!this.isVisibilidadBusquedaPorId) {this.jTabbedPaneBusquedasTipoRetencion.remove(jPanelBusquedaPorIdTipoRetencion);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaContableCredito(Boolean isParaCuentaContableCredito){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableCreditoNegation=!isParaCuentaContableCredito;

			this.isVisibilidadBusquedaPoNombre=isParaCuentaContableCreditoNegation;
			if(!this.isVisibilidadBusquedaPoNombre) {this.jTabbedPaneBusquedasTipoRetencion.remove(jPanelBusquedaPoNombreTipoRetencion);}

			this.isVisibilidadBusquedaPorCodigoSri=isParaCuentaContableCreditoNegation;
			if(!this.isVisibilidadBusquedaPorCodigoSri) {this.jTabbedPaneBusquedasTipoRetencion.remove(jPanelBusquedaPorCodigoSriTipoRetencion);}

			this.isVisibilidadBusquedaPorId=isParaCuentaContableCreditoNegation;
			if(!this.isVisibilidadBusquedaPorId) {this.jTabbedPaneBusquedasTipoRetencion.remove(jPanelBusquedaPorIdTipoRetencion);}
		}
		
	}
	
	
	
	

	public String registrarSesionTipoRetencionParaBusquedaCuentaContables() throws Exception {
		Boolean isPaginaPopupCuentaContable=false;

		try {

			if(tiporetencionSessionBean==null) {
				tiporetencionSessionBean=new TipoRetencionSessionBean();
			}

			if(cuentacontableSessionBean==null) {
				cuentacontableSessionBean=new CuentaContableSessionBean();
			}

			cuentacontableSessionBean.setsPathNavegacionActual(tiporetencionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CuentaContableConstantesFunciones.SCLASSWEBTITULO);
			cuentacontableSessionBean.setisPermiteRecargarInformacion(false);
			cuentacontableSessionBean.setisPaginaPopup(true);
			isPaginaPopupCuentaContable=cuentacontableSessionBean.getisPaginaPopup();
			cuentacontableSessionBean.setisPaginaPopup(false);
			cuentacontableSessionBean.setEstaModoBusqueda(true);
			cuentacontableSessionBean.setsFuncionBusquedaRapida("window.opener.tiporetencionFuncionGeneral.setCombosCodigoDesdeBusquedaid_cuenta_contable(TO_REPLACE);");
			cuentacontableSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCuentaContable(true);
			cuentacontableSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContable(TipoRetencionConstantesFunciones.SNOMBREOPCION);
			//cuentacontableSessionBean.setisBusquedaDesdeForeignKeySesionTipoRetencion(true);
			//cuentacontableSessionBean.setlidTipoRetencionActual(this.idTipoRetencionActual);

			tiporetencionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoRetencion(true);
			tiporetencionSessionBean.setlIdTipoRetencionActualForeignKey(this.idTipoRetencionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}

	public String registrarSesionTipoRetencionParaBusquedaCuentaContableCreditos() throws Exception {
		Boolean isPaginaPopupCuentaContable=false;

		try {

			if(tiporetencionSessionBean==null) {
				tiporetencionSessionBean=new TipoRetencionSessionBean();
			}

			if(cuentacontablecreditoSessionBean==null) {
				cuentacontablecreditoSessionBean=new CuentaContableSessionBean();
			}

			cuentacontablecreditoSessionBean.setsPathNavegacionActual(tiporetencionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CuentaContableConstantesFunciones.SCLASSWEBTITULO);
			cuentacontablecreditoSessionBean.setisPermiteRecargarInformacion(false);
			cuentacontablecreditoSessionBean.setisPaginaPopup(true);
			isPaginaPopupCuentaContable=cuentacontablecreditoSessionBean.getisPaginaPopup();
			cuentacontablecreditoSessionBean.setisPaginaPopup(false);
			cuentacontablecreditoSessionBean.setEstaModoBusqueda(true);
			cuentacontablecreditoSessionBean.setsFuncionBusquedaRapida("window.opener.tiporetencionFuncionGeneral.setCombosCodigoDesdeBusquedaid_cuenta_contable_credito(TO_REPLACE);");
			cuentacontablecreditoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCuentaContable(true);
			cuentacontablecreditoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContable(TipoRetencionConstantesFunciones.SNOMBREOPCION);
			//cuentacontableSessionBean.setisBusquedaDesdeForeignKeySesionTipoRetencion(true);
			//cuentacontableSessionBean.setlidTipoRetencionActual(this.idTipoRetencionActual);

			tiporetencionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoRetencion(true);
			tiporetencionSessionBean.setlIdTipoRetencionActualForeignKey(this.idTipoRetencionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoRetencionSessionBean tiporetencionSessionBean=new TipoRetencionSessionBean();
		
		if(this.tiporetencionSessionBean==null) {
			this.tiporetencionSessionBean=new TipoRetencionSessionBean();
		}
		
		this.tiporetencionSessionBean.setsUltimaBusquedaTipoRetencion(this.getsAccionBusqueda());
		this.tiporetencionSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tiporetencionSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPoNombre")) {
			tiporetencionSessionBean.setnombre(this.getnombreBusquedaPoNombre());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigoSri")) {
			tiporetencionSessionBean.setcodigo(this.getcodigoBusquedaPorCodigoSri());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorId")) {
			tiporetencionSessionBean.setid(this.getidBusquedaPorId());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tiporetencionSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoRetencionSessionBean tiporetencionSessionBean=new TipoRetencionSessionBean();
		
		if(this.tiporetencionSessionBean==null) {
			this.tiporetencionSessionBean=new TipoRetencionSessionBean();
		}
		
		if(this.tiporetencionSessionBean.getsUltimaBusquedaTipoRetencion()!=null&&!this.tiporetencionSessionBean.getsUltimaBusquedaTipoRetencion().equals("")) {
			this.setsAccionBusqueda(tiporetencionSessionBean.getsUltimaBusquedaTipoRetencion());
			this.setiNumeroPaginacion(tiporetencionSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tiporetencionSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPoNombre")) {
				this.setnombreBusquedaPoNombre(tiporetencionSessionBean.getnombre());
				tiporetencionSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigoSri")) {
				this.setcodigoBusquedaPorCodigoSri(tiporetencionSessionBean.getcodigo());
				tiporetencionSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorId")) {
				this.setidBusquedaPorId(tiporetencionSessionBean.getid());
				tiporetencionSessionBean.setid(0L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tiporetencionSessionBean.getid_empresa());
				tiporetencionSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tiporetencionSessionBean.setsUltimaBusquedaTipoRetencion("");
		this.tiporetencionSessionBean.setiNumeroPaginacion(TipoRetencionConstantesFunciones.INUMEROPAGINACION);
		this.tiporetencionSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoRetencion(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoRetencion() {
		this.updateBorderResaltarBusquedasFormularioTipoRetencion();
		this.updateVisibilidadBusquedasFormularioTipoRetencion();
		this.updateHabilitarBusquedasFormularioTipoRetencion();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoRetencion() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoRetencion.getComponents().length>0) {
	

		if(this.tiporetencionConstantesFunciones.resaltarBusquedaPoNombreTipoRetencion!=null) {
			index= this.jTabbedPaneBusquedasTipoRetencion.indexOfComponent(this.jPanelBusquedaPoNombreTipoRetencion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoRetencion.getComponent(index);
				jPanel.setBorder(this.tiporetencionConstantesFunciones.resaltarBusquedaPoNombreTipoRetencion);
			}
		}

		if(this.tiporetencionConstantesFunciones.resaltarBusquedaPorCodigoSriTipoRetencion!=null) {
			index= this.jTabbedPaneBusquedasTipoRetencion.indexOfComponent(this.jPanelBusquedaPorCodigoSriTipoRetencion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoRetencion.getComponent(index);
				jPanel.setBorder(this.tiporetencionConstantesFunciones.resaltarBusquedaPorCodigoSriTipoRetencion);
			}
		}

		if(this.tiporetencionConstantesFunciones.resaltarBusquedaPorIdTipoRetencion!=null) {
			index= this.jTabbedPaneBusquedasTipoRetencion.indexOfComponent(this.jPanelBusquedaPorIdTipoRetencion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoRetencion.getComponent(index);
				jPanel.setBorder(this.tiporetencionConstantesFunciones.resaltarBusquedaPorIdTipoRetencion);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoRetencion() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoRetencion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoRetencion.indexOfComponent(this.jPanelBusquedaPoNombreTipoRetencion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoRetencion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tiporetencionConstantesFunciones.mostrarBusquedaPoNombreTipoRetencion);
			if(!this.tiporetencionConstantesFunciones.mostrarBusquedaPoNombreTipoRetencion && index>-1) {
				this.jTabbedPaneBusquedasTipoRetencion.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoRetencion.indexOfComponent(this.jPanelBusquedaPorCodigoSriTipoRetencion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoRetencion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tiporetencionConstantesFunciones.mostrarBusquedaPorCodigoSriTipoRetencion);
			if(!this.tiporetencionConstantesFunciones.mostrarBusquedaPorCodigoSriTipoRetencion && index>-1) {
				this.jTabbedPaneBusquedasTipoRetencion.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoRetencion.indexOfComponent(this.jPanelBusquedaPorIdTipoRetencion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoRetencion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tiporetencionConstantesFunciones.mostrarBusquedaPorIdTipoRetencion);
			if(!this.tiporetencionConstantesFunciones.mostrarBusquedaPorIdTipoRetencion && index>-1) {
				this.jTabbedPaneBusquedasTipoRetencion.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoRetencion() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoRetencion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoRetencion.indexOfComponent(this.jPanelBusquedaPoNombreTipoRetencion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoRetencion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tiporetencionConstantesFunciones.activarBusquedaPoNombreTipoRetencion);
				this.jTabbedPaneBusquedasTipoRetencion.setEnabledAt(index,this.tiporetencionConstantesFunciones.activarBusquedaPoNombreTipoRetencion);
			}

			index= this.jTabbedPaneBusquedasTipoRetencion.indexOfComponent(this.jPanelBusquedaPorCodigoSriTipoRetencion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoRetencion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tiporetencionConstantesFunciones.activarBusquedaPorCodigoSriTipoRetencion);
				this.jTabbedPaneBusquedasTipoRetencion.setEnabledAt(index,this.tiporetencionConstantesFunciones.activarBusquedaPorCodigoSriTipoRetencion);
			}

			index= this.jTabbedPaneBusquedasTipoRetencion.indexOfComponent(this.jPanelBusquedaPorIdTipoRetencion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoRetencion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tiporetencionConstantesFunciones.activarBusquedaPorIdTipoRetencion);
				this.jTabbedPaneBusquedasTipoRetencion.setEnabledAt(index,this.tiporetencionConstantesFunciones.activarBusquedaPorIdTipoRetencion);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoRetencion(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPoNombre")) {
			index= this.jTabbedPaneBusquedasTipoRetencion.indexOfComponent(this.jPanelBusquedaPoNombreTipoRetencion);

			this.jTabbedPaneBusquedasTipoRetencion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoRetencion.getComponent(index);

			this.tiporetencionConstantesFunciones.setResaltarBusquedaPoNombreTipoRetencion(resaltar);

			jPanel.setBorder(this.tiporetencionConstantesFunciones.resaltarBusquedaPoNombreTipoRetencion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorCodigoSri")) {
			index= this.jTabbedPaneBusquedasTipoRetencion.indexOfComponent(this.jPanelBusquedaPorCodigoSriTipoRetencion);

			this.jTabbedPaneBusquedasTipoRetencion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoRetencion.getComponent(index);

			this.tiporetencionConstantesFunciones.setResaltarBusquedaPorCodigoSriTipoRetencion(resaltar);

			jPanel.setBorder(this.tiporetencionConstantesFunciones.resaltarBusquedaPorCodigoSriTipoRetencion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorId")) {
			index= this.jTabbedPaneBusquedasTipoRetencion.indexOfComponent(this.jPanelBusquedaPorIdTipoRetencion);

			this.jTabbedPaneBusquedasTipoRetencion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoRetencion.getComponent(index);

			this.tiporetencionConstantesFunciones.setResaltarBusquedaPorIdTipoRetencion(resaltar);

			jPanel.setBorder(this.tiporetencionConstantesFunciones.resaltarBusquedaPorIdTipoRetencion);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoRetencion.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoRetencion() throws Exception {

		if(this.jInternalFrameDetalleFormTipoRetencion==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoRetencion();
		this.updateVisibilidadResaltarControlesFormularioTipoRetencion();
		this.updateHabilitarResaltarControlesFormularioTipoRetencion();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoRetencion() throws Exception {
		if(this.jInternalFrameDetalleFormTipoRetencion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tiporetencionConstantesFunciones.resaltaridTipoRetencion!=null && this.jInternalFrameDetalleFormTipoRetencion!=null) {this.jInternalFrameDetalleFormTipoRetencion.jTextFieldidTipoRetencion.setBorder(this.tiporetencionConstantesFunciones.resaltaridTipoRetencion);}
		if(this.tiporetencionConstantesFunciones.resaltarid_empresaTipoRetencion!=null && this.jInternalFrameDetalleFormTipoRetencion!=null) {this.jInternalFrameDetalleFormTipoRetencion.jComboBoxid_empresaTipoRetencion.setBorder(this.tiporetencionConstantesFunciones.resaltarid_empresaTipoRetencion);}
		if(this.tiporetencionConstantesFunciones.resaltarnombreTipoRetencion!=null && this.jInternalFrameDetalleFormTipoRetencion!=null) {this.jInternalFrameDetalleFormTipoRetencion.jTextAreanombreTipoRetencion.setBorder(this.tiporetencionConstantesFunciones.resaltarnombreTipoRetencion);}
		if(this.tiporetencionConstantesFunciones.resaltarcodigoTipoRetencion!=null && this.jInternalFrameDetalleFormTipoRetencion!=null) {this.jInternalFrameDetalleFormTipoRetencion.jTextFieldcodigoTipoRetencion.setBorder(this.tiporetencionConstantesFunciones.resaltarcodigoTipoRetencion);}
		if(this.tiporetencionConstantesFunciones.resaltarporcentajeTipoRetencion!=null && this.jInternalFrameDetalleFormTipoRetencion!=null) {this.jInternalFrameDetalleFormTipoRetencion.jTextFieldporcentajeTipoRetencion.setBorder(this.tiporetencionConstantesFunciones.resaltarporcentajeTipoRetencion);}
		if(this.tiporetencionConstantesFunciones.resaltarmonto_minimoTipoRetencion!=null && this.jInternalFrameDetalleFormTipoRetencion!=null) {this.jInternalFrameDetalleFormTipoRetencion.jTextFieldmonto_minimoTipoRetencion.setBorder(this.tiporetencionConstantesFunciones.resaltarmonto_minimoTipoRetencion);}
		if(this.tiporetencionConstantesFunciones.resaltarid_cuenta_contableTipoRetencion!=null && this.jInternalFrameDetalleFormTipoRetencion!=null) {this.jInternalFrameDetalleFormTipoRetencion.jComboBoxid_cuenta_contableTipoRetencion.setBorder(this.tiporetencionConstantesFunciones.resaltarid_cuenta_contableTipoRetencion);}
		if(this.tiporetencionConstantesFunciones.resaltarid_cuenta_contable_creditoTipoRetencion!=null && this.jInternalFrameDetalleFormTipoRetencion!=null) {this.jInternalFrameDetalleFormTipoRetencion.jComboBoxid_cuenta_contable_creditoTipoRetencion.setBorder(this.tiporetencionConstantesFunciones.resaltarid_cuenta_contable_creditoTipoRetencion);}
		if(this.tiporetencionConstantesFunciones.resaltares_retencion_ivaTipoRetencion!=null && this.jInternalFrameDetalleFormTipoRetencion!=null) {this.jInternalFrameDetalleFormTipoRetencion.jCheckBoxes_retencion_ivaTipoRetencion.setBorderPainted(true);this.jInternalFrameDetalleFormTipoRetencion.jCheckBoxes_retencion_ivaTipoRetencion.setBorder(this.tiporetencionConstantesFunciones.resaltares_retencion_ivaTipoRetencion);}
		if(this.tiporetencionConstantesFunciones.resaltares_debitoTipoRetencion!=null && this.jInternalFrameDetalleFormTipoRetencion!=null) {this.jInternalFrameDetalleFormTipoRetencion.jCheckBoxes_debitoTipoRetencion.setBorderPainted(true);this.jInternalFrameDetalleFormTipoRetencion.jCheckBoxes_debitoTipoRetencion.setBorder(this.tiporetencionConstantesFunciones.resaltares_debitoTipoRetencion);}
		if(this.tiporetencionConstantesFunciones.resaltares_con_iva_facturaTipoRetencion!=null && this.jInternalFrameDetalleFormTipoRetencion!=null) {this.jInternalFrameDetalleFormTipoRetencion.jCheckBoxes_con_iva_facturaTipoRetencion.setBorderPainted(true);this.jInternalFrameDetalleFormTipoRetencion.jCheckBoxes_con_iva_facturaTipoRetencion.setBorder(this.tiporetencionConstantesFunciones.resaltares_con_iva_facturaTipoRetencion);}
		if(this.tiporetencionConstantesFunciones.resaltares_con_sub_total_facturaTipoRetencion!=null && this.jInternalFrameDetalleFormTipoRetencion!=null) {this.jInternalFrameDetalleFormTipoRetencion.jCheckBoxes_con_sub_total_facturaTipoRetencion.setBorderPainted(true);this.jInternalFrameDetalleFormTipoRetencion.jCheckBoxes_con_sub_total_facturaTipoRetencion.setBorder(this.tiporetencionConstantesFunciones.resaltares_con_sub_total_facturaTipoRetencion);}
		if(this.tiporetencionConstantesFunciones.resaltares_con_secuencialTipoRetencion!=null && this.jInternalFrameDetalleFormTipoRetencion!=null) {this.jInternalFrameDetalleFormTipoRetencion.jCheckBoxes_con_secuencialTipoRetencion.setBorderPainted(true);this.jInternalFrameDetalleFormTipoRetencion.jCheckBoxes_con_secuencialTipoRetencion.setBorder(this.tiporetencionConstantesFunciones.resaltares_con_secuencialTipoRetencion);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoRetencion() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoRetencion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoRetencion!=null) {
	
		//this.jInternalFrameDetalleFormTipoRetencion.jTextFieldidTipoRetencion.setVisible(this.tiporetencionConstantesFunciones.mostraridTipoRetencion);
		this.jInternalFrameDetalleFormTipoRetencion.jPanelidTipoRetencion.setVisible(this.tiporetencionConstantesFunciones.mostraridTipoRetencion);
		//this.jInternalFrameDetalleFormTipoRetencion.jComboBoxid_empresaTipoRetencion.setVisible(this.tiporetencionConstantesFunciones.mostrarid_empresaTipoRetencion);
		this.jInternalFrameDetalleFormTipoRetencion.jPanelid_empresaTipoRetencion.setVisible(this.tiporetencionConstantesFunciones.mostrarid_empresaTipoRetencion);
		//this.jInternalFrameDetalleFormTipoRetencion.jTextAreanombreTipoRetencion.setVisible(this.tiporetencionConstantesFunciones.mostrarnombreTipoRetencion);
		this.jInternalFrameDetalleFormTipoRetencion.jPanelnombreTipoRetencion.setVisible(this.tiporetencionConstantesFunciones.mostrarnombreTipoRetencion);
		//this.jInternalFrameDetalleFormTipoRetencion.jTextFieldcodigoTipoRetencion.setVisible(this.tiporetencionConstantesFunciones.mostrarcodigoTipoRetencion);
		this.jInternalFrameDetalleFormTipoRetencion.jPanelcodigoTipoRetencion.setVisible(this.tiporetencionConstantesFunciones.mostrarcodigoTipoRetencion);
		//this.jInternalFrameDetalleFormTipoRetencion.jTextFieldporcentajeTipoRetencion.setVisible(this.tiporetencionConstantesFunciones.mostrarporcentajeTipoRetencion);
		this.jInternalFrameDetalleFormTipoRetencion.jPanelporcentajeTipoRetencion.setVisible(this.tiporetencionConstantesFunciones.mostrarporcentajeTipoRetencion);
		//this.jInternalFrameDetalleFormTipoRetencion.jTextFieldmonto_minimoTipoRetencion.setVisible(this.tiporetencionConstantesFunciones.mostrarmonto_minimoTipoRetencion);
		this.jInternalFrameDetalleFormTipoRetencion.jPanelmonto_minimoTipoRetencion.setVisible(this.tiporetencionConstantesFunciones.mostrarmonto_minimoTipoRetencion);
		//this.jInternalFrameDetalleFormTipoRetencion.jComboBoxid_cuenta_contableTipoRetencion.setVisible(this.tiporetencionConstantesFunciones.mostrarid_cuenta_contableTipoRetencion);
		this.jInternalFrameDetalleFormTipoRetencion.jPanelid_cuenta_contableTipoRetencion.setVisible(this.tiporetencionConstantesFunciones.mostrarid_cuenta_contableTipoRetencion);
			this.jInternalFrameDetalleFormTipoRetencion.jButtonid_cuenta_contableTipoRetencion.setVisible(this.tiporetencionConstantesFunciones.mostrarid_cuenta_contableTipoRetencion);
		//this.jInternalFrameDetalleFormTipoRetencion.jComboBoxid_cuenta_contable_creditoTipoRetencion.setVisible(this.tiporetencionConstantesFunciones.mostrarid_cuenta_contable_creditoTipoRetencion);
		this.jInternalFrameDetalleFormTipoRetencion.jPanelid_cuenta_contable_creditoTipoRetencion.setVisible(this.tiporetencionConstantesFunciones.mostrarid_cuenta_contable_creditoTipoRetencion);
			this.jInternalFrameDetalleFormTipoRetencion.jButtonid_cuenta_contable_creditoTipoRetencion.setVisible(this.tiporetencionConstantesFunciones.mostrarid_cuenta_contable_creditoTipoRetencion);
		//this.jInternalFrameDetalleFormTipoRetencion.jCheckBoxes_retencion_ivaTipoRetencion.setVisible(this.tiporetencionConstantesFunciones.mostrares_retencion_ivaTipoRetencion);
		this.jInternalFrameDetalleFormTipoRetencion.jPaneles_retencion_ivaTipoRetencion.setVisible(this.tiporetencionConstantesFunciones.mostrares_retencion_ivaTipoRetencion);
		//this.jInternalFrameDetalleFormTipoRetencion.jCheckBoxes_debitoTipoRetencion.setVisible(this.tiporetencionConstantesFunciones.mostrares_debitoTipoRetencion);
		this.jInternalFrameDetalleFormTipoRetencion.jPaneles_debitoTipoRetencion.setVisible(this.tiporetencionConstantesFunciones.mostrares_debitoTipoRetencion);
		//this.jInternalFrameDetalleFormTipoRetencion.jCheckBoxes_con_iva_facturaTipoRetencion.setVisible(this.tiporetencionConstantesFunciones.mostrares_con_iva_facturaTipoRetencion);
		this.jInternalFrameDetalleFormTipoRetencion.jPaneles_con_iva_facturaTipoRetencion.setVisible(this.tiporetencionConstantesFunciones.mostrares_con_iva_facturaTipoRetencion);
		//this.jInternalFrameDetalleFormTipoRetencion.jCheckBoxes_con_sub_total_facturaTipoRetencion.setVisible(this.tiporetencionConstantesFunciones.mostrares_con_sub_total_facturaTipoRetencion);
		this.jInternalFrameDetalleFormTipoRetencion.jPaneles_con_sub_total_facturaTipoRetencion.setVisible(this.tiporetencionConstantesFunciones.mostrares_con_sub_total_facturaTipoRetencion);
		//this.jInternalFrameDetalleFormTipoRetencion.jCheckBoxes_con_secuencialTipoRetencion.setVisible(this.tiporetencionConstantesFunciones.mostrares_con_secuencialTipoRetencion);
		this.jInternalFrameDetalleFormTipoRetencion.jPaneles_con_secuencialTipoRetencion.setVisible(this.tiporetencionConstantesFunciones.mostrares_con_secuencialTipoRetencion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoRetencion() throws Exception {
		if(this.jInternalFrameDetalleFormTipoRetencion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoRetencion!=null) {
	
		this.jInternalFrameDetalleFormTipoRetencion.jTextFieldidTipoRetencion.setEnabled(this.tiporetencionConstantesFunciones.activaridTipoRetencion);
		this.jInternalFrameDetalleFormTipoRetencion.jComboBoxid_empresaTipoRetencion.setEnabled(this.tiporetencionConstantesFunciones.activarid_empresaTipoRetencion);
		this.jInternalFrameDetalleFormTipoRetencion.jTextAreanombreTipoRetencion.setEnabled(this.tiporetencionConstantesFunciones.activarnombreTipoRetencion);
		this.jInternalFrameDetalleFormTipoRetencion.jTextFieldcodigoTipoRetencion.setEnabled(this.tiporetencionConstantesFunciones.activarcodigoTipoRetencion);
		this.jInternalFrameDetalleFormTipoRetencion.jTextFieldporcentajeTipoRetencion.setEnabled(this.tiporetencionConstantesFunciones.activarporcentajeTipoRetencion);
		this.jInternalFrameDetalleFormTipoRetencion.jTextFieldmonto_minimoTipoRetencion.setEnabled(this.tiporetencionConstantesFunciones.activarmonto_minimoTipoRetencion);
		this.jInternalFrameDetalleFormTipoRetencion.jComboBoxid_cuenta_contableTipoRetencion.setEnabled(this.tiporetencionConstantesFunciones.activarid_cuenta_contableTipoRetencion);
			this.jInternalFrameDetalleFormTipoRetencion.jButtonid_cuenta_contableTipoRetencion.setEnabled(this.tiporetencionConstantesFunciones.activarid_cuenta_contableTipoRetencion);
		this.jInternalFrameDetalleFormTipoRetencion.jComboBoxid_cuenta_contable_creditoTipoRetencion.setEnabled(this.tiporetencionConstantesFunciones.activarid_cuenta_contable_creditoTipoRetencion);
			this.jInternalFrameDetalleFormTipoRetencion.jButtonid_cuenta_contable_creditoTipoRetencion.setEnabled(this.tiporetencionConstantesFunciones.activarid_cuenta_contable_creditoTipoRetencion);
		this.jInternalFrameDetalleFormTipoRetencion.jCheckBoxes_retencion_ivaTipoRetencion.setEnabled(this.tiporetencionConstantesFunciones.activares_retencion_ivaTipoRetencion);
		this.jInternalFrameDetalleFormTipoRetencion.jCheckBoxes_debitoTipoRetencion.setEnabled(this.tiporetencionConstantesFunciones.activares_debitoTipoRetencion);
		this.jInternalFrameDetalleFormTipoRetencion.jCheckBoxes_con_iva_facturaTipoRetencion.setEnabled(this.tiporetencionConstantesFunciones.activares_con_iva_facturaTipoRetencion);
		this.jInternalFrameDetalleFormTipoRetencion.jCheckBoxes_con_sub_total_facturaTipoRetencion.setEnabled(this.tiporetencionConstantesFunciones.activares_con_sub_total_facturaTipoRetencion);
		this.jInternalFrameDetalleFormTipoRetencion.jCheckBoxes_con_secuencialTipoRetencion.setEnabled(this.tiporetencionConstantesFunciones.activares_con_secuencialTipoRetencion);
		}
	}
	
		
}