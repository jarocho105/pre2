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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;




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

import com.bydan.erp.cartera.util.EvaluacionProveedorConstantesFunciones;
import com.bydan.erp.cartera.util.EvaluacionProveedorParameterReturnGeneral;
//import com.bydan.erp.cartera.util.EvaluacionProveedorParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.EvaluacionProveedorBean;
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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.cartera.resources.reportes.AuxiliarReportes;


import com.bydan.erp.cartera.util.*;
import com.bydan.erp.cartera.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
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


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

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
public class EvaluacionProveedorBeanSwingJInternalFrame extends EvaluacionProveedorJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EvaluacionProveedorBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EvaluacionProveedor> evaluacionproveedorValidator = new ClassValidator<EvaluacionProveedor>(EvaluacionProveedor.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EvaluacionProveedor evaluacionproveedor;	
	public EvaluacionProveedor evaluacionproveedorAux;
	public EvaluacionProveedor evaluacionproveedorAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EvaluacionProveedor evaluacionproveedorTotales;
	public Long idEvaluacionProveedorActual;
	public Long iIdNuevoEvaluacionProveedor=0L;
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

	public String sFinalQueryComboPeriodo="";

	public List<Periodo> periodosForeignKey;

	public List<Periodo> getperiodosForeignKey() {
		return periodosForeignKey;
	}

	public void setperiodosForeignKey(List<Periodo> periodosForeignKey) {
		this.periodosForeignKey = periodosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Periodo periodoForeignKey;

	public Periodo getperiodoForeignKey() {
		return periodoForeignKey;
	}

	public void setperiodoForeignKey(Periodo periodoForeignKey) {
		this.periodoForeignKey = periodoForeignKey;
	}

	public String sFinalQueryComboCliente="";

	public List<Cliente> clientesForeignKey;

	public List<Cliente> getclientesForeignKey() {
		return clientesForeignKey;
	}

	public void setclientesForeignKey(List<Cliente> clientesForeignKey) {
		this.clientesForeignKey = clientesForeignKey;
	}

	//OBJETO FK ACTUAL
	public Cliente clienteForeignKey;

	public Cliente getclienteForeignKey() {
		return clienteForeignKey;
	}

	public void setclienteForeignKey(Cliente clienteForeignKey) {
		this.clienteForeignKey = clienteForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idClienteActual=0L;

	public Long getidClienteActual() {
		return idClienteActual;
	}

	public void setidClienteActual(Long idClienteActual) {
		this.idClienteActual= idClienteActual;
	}
	
	

	public Boolean isTienePermisosDetalleEvaluacionProveedor=false;

	public Boolean getIsTienePermisosDetalleEvaluacionProveedor() {
		return isTienePermisosDetalleEvaluacionProveedor;
	}

	public void setIsTienePermisosDetalleEvaluacionProveedor(Boolean isTienePermisosDetalleEvaluacionProveedor) {
		this.isTienePermisosDetalleEvaluacionProveedor= isTienePermisosDetalleEvaluacionProveedor;
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
	
	public Boolean isPermisoTodoEvaluacionProveedor;
	public Boolean isPermisoNuevoEvaluacionProveedor;
	public Boolean isPermisoActualizarEvaluacionProveedor;
	public Boolean isPermisoActualizarOriginalEvaluacionProveedor;
	public Boolean isPermisoEliminarEvaluacionProveedor;
	public Boolean isPermisoGuardarCambiosEvaluacionProveedor;
	public Boolean isPermisoConsultaEvaluacionProveedor;
	public Boolean isPermisoBusquedaEvaluacionProveedor;
	public Boolean isPermisoReporteEvaluacionProveedor;
	public Boolean isPermisoPaginacionMedioEvaluacionProveedor;
	public Boolean isPermisoPaginacionAltoEvaluacionProveedor;
	public Boolean isPermisoPaginacionTodoEvaluacionProveedor;
	public Boolean isPermisoCopiarEvaluacionProveedor;
	public Boolean isPermisoVerFormEvaluacionProveedor;
	public Boolean isPermisoDuplicarEvaluacionProveedor;
	public Boolean isPermisoOrdenEvaluacionProveedor;
	
	
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
	
	public EvaluacionProveedorParameterReturnGeneral evaluacionproveedorReturnGeneral;
	public EvaluacionProveedorParameterReturnGeneral evaluacionproveedorParameterGeneral;
	
	

	public DetalleEvaluacionProveedorLogic detalleevaluacionproveedorLogic=null;

	public DetalleEvaluacionProveedorLogic getDetalleEvaluacionProveedorLogic() {
		return detalleevaluacionproveedorLogic;
	}

	public void setDetalleEvaluacionProveedorLogic(DetalleEvaluacionProveedorLogic detalleevaluacionproveedorLogic) {
		this.detalleevaluacionproveedorLogic = detalleevaluacionproveedorLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEvaluacionProveedor=false;
	public Boolean esParaAccionDesdeFormularioEvaluacionProveedor=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected EvaluacionProveedorSessionBeanAdditional evaluacionproveedorSessionBeanAdditional=null;
	
	public EvaluacionProveedorSessionBeanAdditional getEvaluacionProveedorSessionBeanAdditional() {
		return this.evaluacionproveedorSessionBeanAdditional;
	}
	
	public void setEvaluacionProveedorSessionBeanAdditional(EvaluacionProveedorSessionBeanAdditional evaluacionproveedorSessionBeanAdditional) {
		try {
			this.evaluacionproveedorSessionBeanAdditional=evaluacionproveedorSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected EvaluacionProveedorBeanSwingJInternalFrameAdditional evaluacionproveedorBeanSwingJInternalFrameAdditional=null;
	//public class EvaluacionProveedorBeanSwingJInternalFrame
	
	public EvaluacionProveedorBeanSwingJInternalFrameAdditional getEvaluacionProveedorBeanSwingJInternalFrameAdditional() {
		return this.evaluacionproveedorBeanSwingJInternalFrameAdditional;
	}
	
	public void setEvaluacionProveedorBeanSwingJInternalFrameAdditional(EvaluacionProveedorBeanSwingJInternalFrameAdditional evaluacionproveedorBeanSwingJInternalFrameAdditional) {
		try {
			this.evaluacionproveedorBeanSwingJInternalFrameAdditional=evaluacionproveedorBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public EvaluacionProveedorLogic evaluacionproveedorLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EvaluacionProveedor evaluacionproveedorBean;
	public EvaluacionProveedorConstantesFunciones evaluacionproveedorConstantesFunciones;
	//public EvaluacionProveedorParameterReturnGeneral evaluacionproveedorReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EjercicioLogic ejercicioLogic;
	public PeriodoLogic periodoLogic;
	public ClienteLogic clienteLogic;
	
	//PARAMETROS
	
	
	//public List<EvaluacionProveedor> evaluacionproveedors;	
	//public List<EvaluacionProveedor> evaluacionproveedorsEliminados;
	//public List<EvaluacionProveedor> evaluacionproveedorsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEvaluacionProveedor=false;
	public Boolean isVisibilidadCeldaDuplicarEvaluacionProveedor=true;
	public Boolean isVisibilidadCeldaCopiarEvaluacionProveedor=true;
	public Boolean isVisibilidadCeldaVerFormEvaluacionProveedor=true;
	public Boolean isVisibilidadCeldaOrdenEvaluacionProveedor=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEvaluacionProveedor=false;
	public Boolean isVisibilidadCeldaModificarEvaluacionProveedor=false;
	public Boolean isVisibilidadCeldaActualizarEvaluacionProveedor=false;
	public Boolean isVisibilidadCeldaEliminarEvaluacionProveedor=false;
	public Boolean isVisibilidadCeldaCancelarEvaluacionProveedor=false;
	public Boolean isVisibilidadCeldaGuardarEvaluacionProveedor=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEvaluacionProveedor=false;	
	
	
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdPeriodo=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoEvaluacionProveedor() {
		return this.iIdNuevoEvaluacionProveedor;
	}

	public void setiIdNuevoEvaluacionProveedor(Long iIdNuevoEvaluacionProveedor) {
		this.iIdNuevoEvaluacionProveedor = iIdNuevoEvaluacionProveedor;
	}
	
	public Long getidEvaluacionProveedorActual() {
		return this.idEvaluacionProveedorActual;
	}

	public void setidEvaluacionProveedorActual(Long idEvaluacionProveedorActual) {
		this.idEvaluacionProveedorActual = idEvaluacionProveedorActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EvaluacionProveedor getevaluacionproveedor() {
		return this.evaluacionproveedor;
	}

	public void setevaluacionproveedor(EvaluacionProveedor evaluacionproveedor) {
		this.evaluacionproveedor = evaluacionproveedor;
	}
	
	public EvaluacionProveedor getevaluacionproveedorAux() {
		return this.evaluacionproveedorAux;
	}

	public void setevaluacionproveedorAux(EvaluacionProveedor evaluacionproveedorAux) {
		this.evaluacionproveedorAux = evaluacionproveedorAux;
	}				
	
	public EvaluacionProveedor getevaluacionproveedorAnterior() {
		return this.evaluacionproveedorAnterior;
	}

	public void setevaluacionproveedorAnterior(EvaluacionProveedor evaluacionproveedorAnterior) {
		this.evaluacionproveedorAnterior = evaluacionproveedorAnterior;
	}	
	
	public EvaluacionProveedor getevaluacionproveedorTotales() {
		return this.evaluacionproveedorTotales;
	}

	public void setevaluacionproveedorTotales(EvaluacionProveedor evaluacionproveedorTotales) {
		this.evaluacionproveedorTotales = evaluacionproveedorTotales;
	}	
	
	public EvaluacionProveedor getevaluacionproveedorBean() {
		return this.evaluacionproveedorBean;
	}

	public void setevaluacionproveedorBean(EvaluacionProveedor evaluacionproveedorBean) {
		this.evaluacionproveedorBean = evaluacionproveedorBean;
	}	
	
	public EvaluacionProveedorParameterReturnGeneral getevaluacionproveedorReturnGeneral() {
		return this.evaluacionproveedorReturnGeneral;
	}

	public void setevaluacionproveedorReturnGeneral(EvaluacionProveedorParameterReturnGeneral evaluacionproveedorReturnGeneral) {
		this.evaluacionproveedorReturnGeneral = evaluacionproveedorReturnGeneral;
	}	
	
	
	public Long id_clienteFK_IdCliente=-1L;

	public Long getid_clienteFK_IdCliente() {
		return this.id_clienteFK_IdCliente;
	}

	public void setid_clienteFK_IdCliente(Long id_clienteFK_IdCliente) {
		this.id_clienteFK_IdCliente = id_clienteFK_IdCliente;
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

	public Long id_periodoFK_IdPeriodo=-1L;

	public Long getid_periodoFK_IdPeriodo() {
		return this.id_periodoFK_IdPeriodo;
	}

	public void setid_periodoFK_IdPeriodo(Long id_periodoFK_IdPeriodo) {
		this.id_periodoFK_IdPeriodo = id_periodoFK_IdPeriodo;
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
	
	
	public EvaluacionProveedorLogic getEvaluacionProveedorLogic()	{		
		return evaluacionproveedorLogic;
	}

	public void setEvaluacionProveedorLogic(EvaluacionProveedorLogic evaluacionproveedorLogic) {
		this.evaluacionproveedorLogic = evaluacionproveedorLogic;
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
	
	public Boolean getIsEsNuevoEvaluacionProveedor() {
		return isEsNuevoEvaluacionProveedor;
	}

	public void setIsEsNuevoEvaluacionProveedor(Boolean isEsNuevoEvaluacionProveedor) {
		this.isEsNuevoEvaluacionProveedor = isEsNuevoEvaluacionProveedor;
	}

	public Boolean getEsParaAccionDesdeFormularioEvaluacionProveedor() {
		return esParaAccionDesdeFormularioEvaluacionProveedor;
	}
	
	public void setEsParaAccionDesdeFormularioEvaluacionProveedor(Boolean esParaAccionDesdeFormularioEvaluacionProveedor) {
		this.esParaAccionDesdeFormularioEvaluacionProveedor = esParaAccionDesdeFormularioEvaluacionProveedor;
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

			if(this.evaluacionproveedorSessionBean==null) {
				this.evaluacionproveedorSessionBean=new EvaluacionProveedorSessionBean();
			}

			if(!this.evaluacionproveedorSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(evaluacionproveedorSessionBean.getlidEmpresaActual());
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

			if(this.evaluacionproveedorSessionBean==null) {
				this.evaluacionproveedorSessionBean=new EvaluacionProveedorSessionBean();
			}

			if(!this.evaluacionproveedorSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(evaluacionproveedorSessionBean.getlidSucursalActual());
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

			if(this.evaluacionproveedorSessionBean==null) {
				this.evaluacionproveedorSessionBean=new EvaluacionProveedorSessionBean();
			}

			if(!this.evaluacionproveedorSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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
					ejercicioLogic.getEntityWithConnection(evaluacionproveedorSessionBean.getlidEjercicioActual());
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

	public void cargarCombosPeriodosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.periodosForeignKey=new ArrayList<Periodo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PeriodoLogic periodoLogic=new PeriodoLogic();

			//periodoLogic.getPeriodoDataAccess().setIsForForeingKeyData(true);

			if(this.evaluacionproveedorSessionBean==null) {
				this.evaluacionproveedorSessionBean=new EvaluacionProveedorSessionBean();
			}

			if(!this.evaluacionproveedorSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//periodoLogic.getPeriodoDataAccess().setIsForForeingKeyData(true);

					periodoLogic.getTodosPeriodosWithConnection(sFinalQuery,new Pagination());

					this.periodosForeignKey=periodoLogic.getPeriodos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPeriodo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					periodoLogic.getEntityWithConnection(evaluacionproveedorSessionBean.getlidPeriodoActual());
					this.periodosForeignKey.add(periodoLogic.getPeriodo());
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

	public void cargarCombosClientesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.clientesForeignKey=new ArrayList<Cliente>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ClienteLogic clienteLogic=new ClienteLogic();

			//clienteLogic.getClienteDataAccess().setIsForForeingKeyData(true);

			if(this.evaluacionproveedorSessionBean==null) {
				this.evaluacionproveedorSessionBean=new EvaluacionProveedorSessionBean();
			}

			if(!this.evaluacionproveedorSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//clienteLogic.getClienteDataAccess().setIsForForeingKeyData(true);

					clienteLogic.getTodosClientesWithConnection(sFinalQuery,new Pagination());

					this.clientesForeignKey=clienteLogic.getClientes();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCliente(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					clienteLogic.getEntityWithConnection(evaluacionproveedorSessionBean.getlidClienteActual());
					this.clientesForeignKey.add(clienteLogic.getCliente());
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

					if(this.evaluacionproveedor!=null) {
						this.evaluacionproveedor.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) {
						this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_empresaEvaluacionProveedor.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaEvaluacionProveedor.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) {
						if(this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_empresaEvaluacionProveedor.getItemCount()>0) {
							this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_empresaEvaluacionProveedor.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaEvaluacionProveedorGenerico)throws Exception
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
				jComboBoxid_empresaEvaluacionProveedorGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaEvaluacionProveedorGenerico!=null && jComboBoxid_empresaEvaluacionProveedorGenerico.getItemCount()>0) {
					jComboBoxid_empresaEvaluacionProveedorGenerico.setSelectedIndex(0);
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

					if(this.evaluacionproveedor!=null) {
						this.evaluacionproveedor.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) {
						this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_sucursalEvaluacionProveedor.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalEvaluacionProveedor.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) {
						if(this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_sucursalEvaluacionProveedor.getItemCount()>0) {
							this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_sucursalEvaluacionProveedor.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalEvaluacionProveedorGenerico)throws Exception
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
				jComboBoxid_sucursalEvaluacionProveedorGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalEvaluacionProveedorGenerico!=null && jComboBoxid_sucursalEvaluacionProveedorGenerico.getItemCount()>0) {
					jComboBoxid_sucursalEvaluacionProveedorGenerico.setSelectedIndex(0);
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

					if(this.evaluacionproveedor!=null) {
						this.evaluacionproveedor.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) {
						this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_ejercicioEvaluacionProveedor.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioEvaluacionProveedor.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) {
						if(this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_ejercicioEvaluacionProveedor.getItemCount()>0) {
							this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_ejercicioEvaluacionProveedor.setSelectedIndex(0);
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
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioEvaluacionProveedorGenerico)throws Exception
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
				jComboBoxid_ejercicioEvaluacionProveedorGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioEvaluacionProveedorGenerico!=null && jComboBoxid_ejercicioEvaluacionProveedorGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioEvaluacionProveedorGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualPeriodoForeignKey(Long idPeriodoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosForeignKey) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(periodoTemp!=null) {

					if(this.evaluacionproveedor!=null) {
						this.evaluacionproveedor.setPeriodo(periodoTemp);
					}

					if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) {
						this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_periodoEvaluacionProveedor.setSelectedItem(periodoTemp);
					}
				} else {
					//jComboBoxid_periodoEvaluacionProveedor.setSelectedItem(periodoTemp);
					if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) {
						if(this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_periodoEvaluacionProveedor.getItemCount()>0) {
							this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_periodoEvaluacionProveedor.setSelectedIndex(0);
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

	public String getActualPeriodoForeignKeyDescripcion(Long idPeriodoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosForeignKey) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}


			sDescripcion=PeriodoConstantesFunciones.getPeriodoDescripcion(periodoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPeriodoForeignKeyGenerico(Long idPeriodoSeleccionado,JComboBox jComboBoxid_periodoEvaluacionProveedorGenerico)throws Exception
	{
		try
		{
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosForeignKey) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}

			if(periodoTemp!=null) {
				jComboBoxid_periodoEvaluacionProveedorGenerico.setSelectedItem(periodoTemp);
			} else {
				if(jComboBoxid_periodoEvaluacionProveedorGenerico!=null && jComboBoxid_periodoEvaluacionProveedorGenerico.getItemCount()>0) {
					jComboBoxid_periodoEvaluacionProveedorGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualClienteForeignKey(Long idClienteSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(clienteTemp!=null) {

					if(this.evaluacionproveedor!=null) {
						this.evaluacionproveedor.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) {
						this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_clienteEvaluacionProveedor.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxid_clienteEvaluacionProveedor.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) {
						if(this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_clienteEvaluacionProveedor.getItemCount()>0) {
							this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_clienteEvaluacionProveedor.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){
					if(clienteTemp!=null && jComboBoxid_clienteFK_IdClienteEvaluacionProveedor!=null) {
						jComboBoxid_clienteFK_IdClienteEvaluacionProveedor.setSelectedItem(clienteTemp);
					} else {
						if(jComboBoxid_clienteFK_IdClienteEvaluacionProveedor!=null) {
							//jComboBoxid_clienteFK_IdClienteEvaluacionProveedor.setSelectedItem(clienteTemp);
							if(jComboBoxid_clienteFK_IdClienteEvaluacionProveedor.getItemCount()>0) {
								jComboBoxid_clienteFK_IdClienteEvaluacionProveedor.setSelectedIndex(0);
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

	public String getActualClienteForeignKeyDescripcion(Long idClienteSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}


			sDescripcion=ClienteConstantesFunciones.getClienteDescripcion(clienteTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxid_clienteEvaluacionProveedorGenerico)throws Exception
	{
		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}

			if(clienteTemp!=null) {
				jComboBoxid_clienteEvaluacionProveedorGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxid_clienteEvaluacionProveedorGenerico!=null && jComboBoxid_clienteEvaluacionProveedorGenerico.getItemCount()>0) {
					jComboBoxid_clienteEvaluacionProveedorGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(EvaluacionProveedor evaluacionproveedor,JComboBox jComboBoxid_empresaEvaluacionProveedorGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaEvaluacionProveedorGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_empresaEvaluacionProveedor.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaEvaluacionProveedorGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				evaluacionproveedor.setid_empresa(empresaAux.getId());
				evaluacionproveedor.setempresa_descripcion(EvaluacionProveedorConstantesFunciones.getEmpresaDescripcion(empresaAux));
				evaluacionproveedor.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(EvaluacionProveedor evaluacionproveedor,JComboBox jComboBoxid_sucursalEvaluacionProveedorGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalEvaluacionProveedorGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_sucursalEvaluacionProveedor.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalEvaluacionProveedorGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				evaluacionproveedor.setid_sucursal(sucursalAux.getId());
				evaluacionproveedor.setsucursal_descripcion(EvaluacionProveedorConstantesFunciones.getSucursalDescripcion(sucursalAux));
				evaluacionproveedor.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(EvaluacionProveedor evaluacionproveedor,JComboBox jComboBoxid_ejercicioEvaluacionProveedorGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioEvaluacionProveedorGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_ejercicioEvaluacionProveedor.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioEvaluacionProveedorGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				evaluacionproveedor.setid_ejercicio(ejercicioAux.getId());
				evaluacionproveedor.setejercicio_descripcion(EvaluacionProveedorConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				evaluacionproveedor.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPeriodoForeignKey(EvaluacionProveedor evaluacionproveedor,JComboBox jComboBoxid_periodoEvaluacionProveedorGenerico)throws Exception
	{
		try
		{
			Periodo  periodoAux=new Periodo();

			if(jComboBoxid_periodoEvaluacionProveedorGenerico==null) {
				periodoAux=(Periodo)this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_periodoEvaluacionProveedor.getSelectedItem();
			} else {
				periodoAux=(Periodo)jComboBoxid_periodoEvaluacionProveedorGenerico.getSelectedItem();
			}

			if(periodoAux!=null && periodoAux.getId()!=null) {
				if(periodoAux.getid_estado_periodo().equals(0L)) {
					throw new Exception("Periodo INACTIVO, NO PUEDE GUARDAR LA INFORMACION CONSULTE CON EL ADMINISTRADOR");
				}

				evaluacionproveedor.setid_periodo(periodoAux.getId());
				evaluacionproveedor.setperiodo_descripcion(EvaluacionProveedorConstantesFunciones.getPeriodoDescripcion(periodoAux));
				evaluacionproveedor.setPeriodo(periodoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(EvaluacionProveedor evaluacionproveedor,JComboBox jComboBoxid_clienteEvaluacionProveedorGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxid_clienteEvaluacionProveedorGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_clienteEvaluacionProveedor.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxid_clienteEvaluacionProveedorGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				evaluacionproveedor.setid_cliente(clienteAux.getId());
				evaluacionproveedor.setcliente_descripcion(EvaluacionProveedorConstantesFunciones.getClienteDescripcion(clienteAux));
				evaluacionproveedor.setCliente(clienteAux);			}
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

					if(!EvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) { 
							this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_empresaEvaluacionProveedor.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_empresaEvaluacionProveedor.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) { 
					}

					if(!EvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
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

					if(!EvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) { 
							this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_sucursalEvaluacionProveedor.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_sucursalEvaluacionProveedor.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) { 
					}

					if(!EvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
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

					if(!EvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) { 
							this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_ejercicioEvaluacionProveedor.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_ejercicioEvaluacionProveedor.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) { 
					}

					if(!EvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePeriodosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPeriodo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!EvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) { 
							this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_periodoEvaluacionProveedor.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_periodoEvaluacionProveedor.addItem(periodo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) { 
					}

					if(!EvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameClientesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCliente=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!EvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) { 
							this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_clienteEvaluacionProveedor.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_clienteEvaluacionProveedor.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) { 
					}

					if(!EvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_clienteFK_IdClienteEvaluacionProveedor.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jComboBoxid_clienteFK_IdClienteEvaluacionProveedor.addItem(cliente);
							}
						}

						if(!EvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) {
							this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_empresaEvaluacionProveedor.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) {
							this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_empresaEvaluacionProveedor.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) {
							this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_sucursalEvaluacionProveedor.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) {
							this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_sucursalEvaluacionProveedor.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) {
							this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_ejercicioEvaluacionProveedor.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) {
							this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_ejercicioEvaluacionProveedor.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFramePeriodoForeignKey(Periodo periodo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) {
							this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_periodoEvaluacionProveedor.setSelectedItem(periodo);
						}
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) {
							this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_periodoEvaluacionProveedor.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameClienteForeignKey(Cliente cliente,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) {
							this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_clienteEvaluacionProveedor.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) {
							this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_clienteEvaluacionProveedor.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_clienteFK_IdClienteEvaluacionProveedor.setSelectedItem(cliente);
						} else {
							this.jComboBoxid_clienteFK_IdClienteEvaluacionProveedor.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesEvaluacionProveedor() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EvaluacionProveedorConstantesFunciones.refrescarForeignKeysDescripcionesEvaluacionProveedor(this.evaluacionproveedorLogic.getEvaluacionProveedors());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EvaluacionProveedorConstantesFunciones.refrescarForeignKeysDescripcionesEvaluacionProveedor(this.evaluacionproveedors);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Ejercicio.class));
		classes.add(new Classe(Periodo.class));
		classes.add(new Classe(Cliente.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//evaluacionproveedorLogic.setEvaluacionProveedors(this.evaluacionproveedors);
			evaluacionproveedorLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EvaluacionProveedorParameterReturnGeneral getEvaluacionProveedorParameterGeneral() {
		return this.evaluacionproveedorParameterGeneral;
	}
	
	public void setEvaluacionProveedorParameterGeneral(EvaluacionProveedorParameterReturnGeneral evaluacionproveedorParameterGeneral) {
		this.evaluacionproveedorParameterGeneral = evaluacionproveedorParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEvaluacionProveedor() {
		return isPermisoTodoEvaluacionProveedor;
	}

	public void setIsPermisoTodoEvaluacionProveedor(Boolean isPermisoTodoEvaluacionProveedor) {
		this.isPermisoTodoEvaluacionProveedor = isPermisoTodoEvaluacionProveedor;
	}

	public Boolean getIsPermisoNuevoEvaluacionProveedor() {
		return isPermisoNuevoEvaluacionProveedor;
	}

	public void setIsPermisoNuevoEvaluacionProveedor(Boolean isPermisoNuevoEvaluacionProveedor) {
		this.isPermisoNuevoEvaluacionProveedor = isPermisoNuevoEvaluacionProveedor;
	}

	public Boolean getIsPermisoActualizarEvaluacionProveedor() {
		return isPermisoActualizarEvaluacionProveedor;
	}

	public void setIsPermisoActualizarEvaluacionProveedor(Boolean isPermisoActualizarEvaluacionProveedor) {
		this.isPermisoActualizarEvaluacionProveedor = isPermisoActualizarEvaluacionProveedor;
	}

	public Boolean getIsPermisoEliminarEvaluacionProveedor() {
		return isPermisoEliminarEvaluacionProveedor;
	}

	public void setIsPermisoEliminarEvaluacionProveedor(Boolean isPermisoEliminarEvaluacionProveedor) {
		this.isPermisoEliminarEvaluacionProveedor = isPermisoEliminarEvaluacionProveedor;
	}

	public Boolean getIsPermisoGuardarCambiosEvaluacionProveedor() {
		return isPermisoGuardarCambiosEvaluacionProveedor;
	}

	public void setIsPermisoGuardarCambiosEvaluacionProveedor(Boolean isPermisoGuardarCambiosEvaluacionProveedor) {
		this.isPermisoGuardarCambiosEvaluacionProveedor = isPermisoGuardarCambiosEvaluacionProveedor;
	}
	
	public Boolean getIsPermisoConsultaEvaluacionProveedor() {
		return isPermisoConsultaEvaluacionProveedor;
	}

	public void setIsPermisoConsultaEvaluacionProveedor(Boolean isPermisoConsultaEvaluacionProveedor) {
		this.isPermisoConsultaEvaluacionProveedor = isPermisoConsultaEvaluacionProveedor;
	}

	public Boolean getIsPermisoBusquedaEvaluacionProveedor() {
		return isPermisoBusquedaEvaluacionProveedor;
	}

	public void setIsPermisoBusquedaEvaluacionProveedor(Boolean isPermisoBusquedaEvaluacionProveedor) {
		this.isPermisoBusquedaEvaluacionProveedor = isPermisoBusquedaEvaluacionProveedor;
	}

	public Boolean getIsPermisoReporteEvaluacionProveedor() {
		return isPermisoReporteEvaluacionProveedor;
	}

	public void setIsPermisoReporteEvaluacionProveedor(Boolean isPermisoReporteEvaluacionProveedor) {
		this.isPermisoReporteEvaluacionProveedor = isPermisoReporteEvaluacionProveedor;
	}
	
	public Boolean getIsPermisoPaginacionMedioEvaluacionProveedor() {
		return isPermisoPaginacionMedioEvaluacionProveedor;
	}

	public void setIsPermisoPaginacionMedioEvaluacionProveedor(Boolean isPermisoPaginacionMedioEvaluacionProveedor) {
		this.isPermisoPaginacionMedioEvaluacionProveedor = isPermisoPaginacionMedioEvaluacionProveedor;
	}
	
	public Boolean getIsPermisoPaginacionTodoEvaluacionProveedor() {
		return isPermisoPaginacionTodoEvaluacionProveedor;
	}

	public void setIsPermisoPaginacionTodoEvaluacionProveedor(Boolean isPermisoPaginacionTodoEvaluacionProveedor) {
		this.isPermisoPaginacionTodoEvaluacionProveedor = isPermisoPaginacionTodoEvaluacionProveedor;
	}
	
	public Boolean getIsPermisoPaginacionAltoEvaluacionProveedor() {
		return isPermisoPaginacionAltoEvaluacionProveedor;
	}

	public void setIsPermisoPaginacionAltoEvaluacionProveedor(Boolean isPermisoPaginacionAltoEvaluacionProveedor) {
		this.isPermisoPaginacionAltoEvaluacionProveedor = isPermisoPaginacionAltoEvaluacionProveedor;
	}
	
	public Boolean getIsPermisoCopiarEvaluacionProveedor() {
		return isPermisoCopiarEvaluacionProveedor;
	}

	public void setIsPermisoCopiarEvaluacionProveedor(Boolean isPermisoCopiarEvaluacionProveedor) {
		this.isPermisoCopiarEvaluacionProveedor = isPermisoCopiarEvaluacionProveedor;
	}
	
	public Boolean getIsPermisoVerFormEvaluacionProveedor() {
		return isPermisoVerFormEvaluacionProveedor;
	}

	public void setIsPermisoVerFormEvaluacionProveedor(Boolean isPermisoVerFormEvaluacionProveedor) {
		this.isPermisoVerFormEvaluacionProveedor = isPermisoVerFormEvaluacionProveedor;
	}
	
	public Boolean getIsPermisoDuplicarEvaluacionProveedor() {
		return isPermisoDuplicarEvaluacionProveedor;
	}

	public void setIsPermisoDuplicarEvaluacionProveedor(Boolean isPermisoDuplicarEvaluacionProveedor) {
		this.isPermisoDuplicarEvaluacionProveedor = isPermisoDuplicarEvaluacionProveedor;
	}
	
	public Boolean getIsPermisoOrdenEvaluacionProveedor() {
		return isPermisoOrdenEvaluacionProveedor;
	}

	public void setIsPermisoOrdenEvaluacionProveedor(Boolean isPermisoOrdenEvaluacionProveedor) {
		this.isPermisoOrdenEvaluacionProveedor = isPermisoOrdenEvaluacionProveedor;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEvaluacionProveedor() {
		return isVisibilidadCeldaNuevoEvaluacionProveedor;
	}

	public void setIsVisibilidadCeldaNuevoEvaluacionProveedor(Boolean isVisibilidadCeldaNuevoEvaluacionProveedor) {
		this.isVisibilidadCeldaNuevoEvaluacionProveedor = isVisibilidadCeldaNuevoEvaluacionProveedor;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEvaluacionProveedor() {
		return isVisibilidadCeldaDuplicarEvaluacionProveedor;
	}

	public void setIsVisibilidadCeldaDuplicarEvaluacionProveedor(Boolean isVisibilidadCeldaDuplicarEvaluacionProveedor) {
		this.isVisibilidadCeldaDuplicarEvaluacionProveedor = isVisibilidadCeldaDuplicarEvaluacionProveedor;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEvaluacionProveedor() {
		return isVisibilidadCeldaCopiarEvaluacionProveedor;
	}

	public void setIsVisibilidadCeldaCopiarEvaluacionProveedor(Boolean isVisibilidadCeldaCopiarEvaluacionProveedor) {
		this.isVisibilidadCeldaCopiarEvaluacionProveedor = isVisibilidadCeldaCopiarEvaluacionProveedor;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEvaluacionProveedor() {
		return isVisibilidadCeldaVerFormEvaluacionProveedor;
	}

	public void setIsVisibilidadCeldaVerFormEvaluacionProveedor(Boolean isVisibilidadCeldaVerFormEvaluacionProveedor) {
		this.isVisibilidadCeldaVerFormEvaluacionProveedor = isVisibilidadCeldaVerFormEvaluacionProveedor;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEvaluacionProveedor() {
		return isVisibilidadCeldaOrdenEvaluacionProveedor;
	}

	public void setIsVisibilidadCeldaOrdenEvaluacionProveedor(Boolean isVisibilidadCeldaOrdenEvaluacionProveedor) {
		this.isVisibilidadCeldaOrdenEvaluacionProveedor = isVisibilidadCeldaOrdenEvaluacionProveedor;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEvaluacionProveedor() {
		return isVisibilidadCeldaNuevoRelacionesEvaluacionProveedor;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEvaluacionProveedor(Boolean isVisibilidadCeldaNuevoRelacionesEvaluacionProveedor) {
		this.isVisibilidadCeldaNuevoRelacionesEvaluacionProveedor = isVisibilidadCeldaNuevoRelacionesEvaluacionProveedor;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEvaluacionProveedor() {
		return isVisibilidadCeldaModificarEvaluacionProveedor;
	}

	public void setIsVisibilidadCeldaModificarEvaluacionProveedor(Boolean isVisibilidadCeldaModificarEvaluacionProveedor) {
		this.isVisibilidadCeldaModificarEvaluacionProveedor = isVisibilidadCeldaModificarEvaluacionProveedor;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEvaluacionProveedor() {
		return isVisibilidadCeldaActualizarEvaluacionProveedor;
	}

	public void setIsVisibilidadCeldaActualizarEvaluacionProveedor(Boolean isVisibilidadCeldaActualizarEvaluacionProveedor) {
		this.isVisibilidadCeldaActualizarEvaluacionProveedor = isVisibilidadCeldaActualizarEvaluacionProveedor;
	}

	public Boolean getIsVisibilidadCeldaEliminarEvaluacionProveedor() {
		return isVisibilidadCeldaEliminarEvaluacionProveedor;
	}

	public void setIsVisibilidadCeldaEliminarEvaluacionProveedor(Boolean isVisibilidadCeldaEliminarEvaluacionProveedor) {
		this.isVisibilidadCeldaEliminarEvaluacionProveedor = isVisibilidadCeldaEliminarEvaluacionProveedor;
	}

	public Boolean getIsVisibilidadCeldaCancelarEvaluacionProveedor() {
		return isVisibilidadCeldaCancelarEvaluacionProveedor;
	}

	public void setIsVisibilidadCeldaCancelarEvaluacionProveedor(Boolean isVisibilidadCeldaCancelarEvaluacionProveedor) {
		this.isVisibilidadCeldaCancelarEvaluacionProveedor = isVisibilidadCeldaCancelarEvaluacionProveedor;
	}

	public Boolean getIsVisibilidadCeldaGuardarEvaluacionProveedor() {
		return isVisibilidadCeldaGuardarEvaluacionProveedor;
	}

	public void setIsVisibilidadCeldaGuardarEvaluacionProveedor(Boolean isVisibilidadCeldaGuardarEvaluacionProveedor) {
		this.isVisibilidadCeldaGuardarEvaluacionProveedor = isVisibilidadCeldaGuardarEvaluacionProveedor;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEvaluacionProveedor() {
		return isVisibilidadCeldaGuardarCambiosEvaluacionProveedor;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEvaluacionProveedor(Boolean isVisibilidadCeldaGuardarCambiosEvaluacionProveedor) {
		this.isVisibilidadCeldaGuardarCambiosEvaluacionProveedor = isVisibilidadCeldaGuardarCambiosEvaluacionProveedor;
	}
		
	public EvaluacionProveedorSessionBean getevaluacionproveedorSessionBean() {
		return this.evaluacionproveedorSessionBean;
	}
	
	public void setevaluacionproveedorSessionBean(EvaluacionProveedorSessionBean evaluacionproveedorSessionBean) {
		this.evaluacionproveedorSessionBean=evaluacionproveedorSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCliente() {
		return this.isVisibilidadFK_IdCliente;
	}

	public void setisVisibilidadFK_IdCliente(Boolean isVisibilidadFK_IdCliente) {
		this.isVisibilidadFK_IdCliente=isVisibilidadFK_IdCliente;
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

	public Boolean getisVisibilidadFK_IdPeriodo() {
		return this.isVisibilidadFK_IdPeriodo;
	}

	public void setisVisibilidadFK_IdPeriodo(Boolean isVisibilidadFK_IdPeriodo) {
		this.isVisibilidadFK_IdPeriodo=isVisibilidadFK_IdPeriodo;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEvaluacionProveedor(EvaluacionProveedor evaluacionproveedor)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(evaluacionproveedor,null);
				this.setActualParaGuardarSucursalForeignKey(evaluacionproveedor,null);
				this.setActualParaGuardarEjercicioForeignKey(evaluacionproveedor,null);
				this.setActualParaGuardarPeriodoForeignKey(evaluacionproveedor,null);
				this.setActualParaGuardarClienteForeignKey(evaluacionproveedor,null);
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
	
	public void bugActualizarReferenciaActual(EvaluacionProveedor evaluacionproveedor,EvaluacionProveedor evaluacionproveedorAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEvaluacionProveedor(evaluacionproveedor);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		evaluacionproveedorAux.setId(evaluacionproveedor.getId());
		evaluacionproveedorAux.setVersionRow(evaluacionproveedor.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEvaluacionProveedor();
		
			int intSelectedRow = this.jTableDatosEvaluacionProveedor.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedorLogic.getEvaluacionProveedors().toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedors.toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EvaluacionProveedorJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEvaluacionProveedor(this.evaluacionproveedor,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionProveedor(this.evaluacionproveedor);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = evaluacionproveedorValidator.getInvalidValues(this.evaluacionproveedor);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			evaluacionproveedorLogic.setDatosCliente(datosCliente);
			evaluacionproveedorLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				evaluacionproveedorAux=new  EvaluacionProveedor();
				
				evaluacionproveedorAux.setIsNew(true);
				evaluacionproveedorAux.setIsChanged(true);
				
				evaluacionproveedorAux.setEvaluacionProveedorOriginal(this.evaluacionproveedor);
				
				evaluacionproveedorAux.setId(this.evaluacionproveedor.getId());	
				evaluacionproveedorAux.setVersionRow(this.evaluacionproveedor.getVersionRow());	
				evaluacionproveedorAux.setid_empresa(this.evaluacionproveedor.getid_empresa());	
				evaluacionproveedorAux.setid_sucursal(this.evaluacionproveedor.getid_sucursal());	
				evaluacionproveedorAux.setid_ejercicio(this.evaluacionproveedor.getid_ejercicio());	
				evaluacionproveedorAux.setid_periodo(this.evaluacionproveedor.getid_periodo());	
				evaluacionproveedorAux.setid_cliente(this.evaluacionproveedor.getid_cliente());	
				evaluacionproveedorAux.setfecha(this.evaluacionproveedor.getfecha());	
				evaluacionproveedorAux.setcontacto(this.evaluacionproveedor.getcontacto());	
				evaluacionproveedorAux.setevaluado(this.evaluacionproveedor.getevaluado());	
				evaluacionproveedorAux.setresultado(this.evaluacionproveedor.getresultado());	
				evaluacionproveedorAux.setresponsable(this.evaluacionproveedor.getresponsable());	
				evaluacionproveedorAux.setfecha_desde(this.evaluacionproveedor.getfecha_desde());	
				evaluacionproveedorAux.setfecha_hasta(this.evaluacionproveedor.getfecha_hasta());	
				evaluacionproveedorAux.setobservacion(this.evaluacionproveedor.getobservacion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.evaluacionproveedorSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.evaluacionproveedorSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(evaluacionproveedorAux,evaluacionproveedorLogic.getEvaluacionProveedors());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(evaluacionproveedorAux,evaluacionproveedors);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.evaluacionproveedorSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.evaluacionproveedorSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						evaluacionproveedorLogic.saveEvaluacionProveedors();//WithConnection
						//evaluacionproveedorLogic.getSetVersionRowEvaluacionProveedors();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.evaluacionproveedor,evaluacionproveedorAux);
					
					this.refrescarForeignKeysDescripcionesEvaluacionProveedor();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.evaluacionproveedorSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().addAll(this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedors.addAll(this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorsEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.evaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								evaluacionproveedorLogic.saveEvaluacionProveedorRelaciones(evaluacionproveedorAux,this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors());//WithConnection
								//evaluacionproveedorLogic.getSetVersionRowEvaluacionProveedors();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.evaluacionproveedor,evaluacionproveedorAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorLogic.setDetalleEvaluacionProveedors(new ArrayList<DetalleEvaluacionProveedor>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedors= new ArrayList<DetalleEvaluacionProveedor>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.quitarFilaTotales();}
							evaluacionproveedorAux.setDetalleEvaluacionProveedors(this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.evaluacionproveedorSessionBean.getEstaModoGuardarRelaciones() 
									|| this.evaluacionproveedorSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(evaluacionproveedorAux,evaluacionproveedorLogic.getEvaluacionProveedors());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(evaluacionproveedorAux,evaluacionproveedors);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.evaluacionproveedor,evaluacionproveedorAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				evaluacionproveedorAux=new  EvaluacionProveedor();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.evaluacionproveedorSessionBean.getEsGuardarRelacionado() 
					|| (this.evaluacionproveedorSessionBean.getEsGuardarRelacionado() && this.evaluacionproveedor.getId()>=0)) {
						
					evaluacionproveedorAux.setIsNew(false);
				}
				
				evaluacionproveedorAux.setIsDeleted(false);
			
				evaluacionproveedorAux.setId(this.evaluacionproveedor.getId());	
				evaluacionproveedorAux.setVersionRow(this.evaluacionproveedor.getVersionRow());	
				evaluacionproveedorAux.setid_empresa(this.evaluacionproveedor.getid_empresa());	
				evaluacionproveedorAux.setid_sucursal(this.evaluacionproveedor.getid_sucursal());	
				evaluacionproveedorAux.setid_ejercicio(this.evaluacionproveedor.getid_ejercicio());	
				evaluacionproveedorAux.setid_periodo(this.evaluacionproveedor.getid_periodo());	
				evaluacionproveedorAux.setid_cliente(this.evaluacionproveedor.getid_cliente());	
				evaluacionproveedorAux.setfecha(this.evaluacionproveedor.getfecha());	
				evaluacionproveedorAux.setcontacto(this.evaluacionproveedor.getcontacto());	
				evaluacionproveedorAux.setevaluado(this.evaluacionproveedor.getevaluado());	
				evaluacionproveedorAux.setresultado(this.evaluacionproveedor.getresultado());	
				evaluacionproveedorAux.setresponsable(this.evaluacionproveedor.getresponsable());	
				evaluacionproveedorAux.setfecha_desde(this.evaluacionproveedor.getfecha_desde());	
				evaluacionproveedorAux.setfecha_hasta(this.evaluacionproveedor.getfecha_hasta());	
				evaluacionproveedorAux.setobservacion(this.evaluacionproveedor.getobservacion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(evaluacionproveedorAux,evaluacionproveedorLogic.getEvaluacionProveedors());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(evaluacionproveedorAux,evaluacionproveedors);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.evaluacionproveedorSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.evaluacionproveedorSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						evaluacionproveedorLogic.saveEvaluacionProveedors();//WithConnection
						//evaluacionproveedorLogic.getSetVersionRowEvaluacionProveedors();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.evaluacionproveedor,evaluacionproveedorAux);
					
					this.refrescarForeignKeysDescripcionesEvaluacionProveedor();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.evaluacionproveedorSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().addAll(this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedors.addAll(this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorsEliminados);
						}
						//ARCHITECTURE
						
						if(!this.evaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								evaluacionproveedorLogic.saveEvaluacionProveedorRelaciones(evaluacionproveedorAux,this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors());//WithConnection
								//evaluacionproveedorLogic.getSetVersionRowEvaluacionProveedors();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.evaluacionproveedor,evaluacionproveedorAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorLogic.setDetalleEvaluacionProveedors(new ArrayList<DetalleEvaluacionProveedor>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedors= new ArrayList<DetalleEvaluacionProveedor>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.quitarFilaTotales();}
							evaluacionproveedorAux.setDetalleEvaluacionProveedors(this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.evaluacionproveedorSessionBean.getEstaModoGuardarRelaciones() 
									|| this.evaluacionproveedorSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(evaluacionproveedorAux,evaluacionproveedorLogic.getEvaluacionProveedors());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(evaluacionproveedorAux,evaluacionproveedors);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.evaluacionproveedor,evaluacionproveedorAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				evaluacionproveedorAux=new  EvaluacionProveedor();
				
				evaluacionproveedorAux.setIsNew(false);
				evaluacionproveedorAux.setIsChanged(false);
				
				evaluacionproveedorAux.setIsDeleted(true);
				
				evaluacionproveedorAux.setId(this.evaluacionproveedor.getId());	
				evaluacionproveedorAux.setVersionRow(this.evaluacionproveedor.getVersionRow());	
				evaluacionproveedorAux.setid_empresa(this.evaluacionproveedor.getid_empresa());	
				evaluacionproveedorAux.setid_sucursal(this.evaluacionproveedor.getid_sucursal());	
				evaluacionproveedorAux.setid_ejercicio(this.evaluacionproveedor.getid_ejercicio());	
				evaluacionproveedorAux.setid_periodo(this.evaluacionproveedor.getid_periodo());	
				evaluacionproveedorAux.setid_cliente(this.evaluacionproveedor.getid_cliente());	
				evaluacionproveedorAux.setfecha(this.evaluacionproveedor.getfecha());	
				evaluacionproveedorAux.setcontacto(this.evaluacionproveedor.getcontacto());	
				evaluacionproveedorAux.setevaluado(this.evaluacionproveedor.getevaluado());	
				evaluacionproveedorAux.setresultado(this.evaluacionproveedor.getresultado());	
				evaluacionproveedorAux.setresponsable(this.evaluacionproveedor.getresponsable());	
				evaluacionproveedorAux.setfecha_desde(this.evaluacionproveedor.getfecha_desde());	
				evaluacionproveedorAux.setfecha_hasta(this.evaluacionproveedor.getfecha_hasta());	
				evaluacionproveedorAux.setobservacion(this.evaluacionproveedor.getobservacion());	
				
				if(this.evaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.evaluacionproveedorAux.getId()>=0) {	
						this.evaluacionproveedorsEliminados.add(evaluacionproveedorAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(evaluacionproveedorAux,evaluacionproveedorLogic.getEvaluacionProveedors());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(evaluacionproveedorAux,evaluacionproveedors);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.evaluacionproveedorSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.evaluacionproveedorSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						evaluacionproveedorLogic.saveEvaluacionProveedors();//WithConnection
						//evaluacionproveedorLogic.getSetVersionRowEvaluacionProveedors();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.evaluacionproveedorSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors().addAll(this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedors.addAll(this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorsEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.evaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								evaluacionproveedorLogic.saveEvaluacionProveedorRelaciones(evaluacionproveedorAux,this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors());//WithConnection
								//evaluacionproveedorLogic.getSetVersionRowEvaluacionProveedors();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorLogic.setDetalleEvaluacionProveedors(new ArrayList<DetalleEvaluacionProveedor>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedors= new ArrayList<DetalleEvaluacionProveedor>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.quitarFilaTotales();}
							evaluacionproveedorAux.setDetalleEvaluacionProveedors(this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.evaluacionproveedorSessionBean.getEstaModoGuardarRelaciones() 
								|| this.evaluacionproveedorSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(evaluacionproveedorAux,evaluacionproveedorLogic.getEvaluacionProveedors());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(evaluacionproveedorAux,evaluacionproveedors);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.getEvaluacionProveedors().addAll(this.evaluacionproveedorsEliminados);
					
					evaluacionproveedorLogic.saveEvaluacionProveedors();//WithConnection
					//evaluacionproveedorLogic.getSetVersionRowEvaluacionProveedors();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesEvaluacionProveedor();
				
				this.evaluacionproveedorsEliminados= new ArrayList<EvaluacionProveedor>();		
			}
			
			if(this.evaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.evaluacionproveedorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Evaluacion Proveedor GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Evaluacion Proveedor",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.evaluacionproveedor=evaluacionproveedorAux;
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
      		//this.finishProcessEvaluacionProveedor();
      	}
		
	}	
	
	public void actualizarRelaciones(EvaluacionProveedor evaluacionproveedorLocal) throws Exception {
		
		if(this.evaluacionproveedorSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				evaluacionproveedorLocal.setDetalleEvaluacionProveedors(this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors());
			
			} else {
			
				evaluacionproveedorLocal.setDetalleEvaluacionProveedors(this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedors);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EvaluacionProveedor evaluacionproveedorLocal) throws Exception {	
		if(this.evaluacionproveedorSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				evaluacionproveedorLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				evaluacionproveedorLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				evaluacionproveedorLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PeriodoDetalleFormJInternalFrame.class)) {
				PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrameLocal=(PeriodoBeanSwingJInternalFrame) ((PeriodoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				periodoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPeriodo(periodoBeanSwingJInternalFrameLocal.getperiodo(),true);
				periodoBeanSwingJInternalFrameLocal.actualizarLista(periodoBeanSwingJInternalFrameLocal.periodo,this.periodosForeignKey);

				periodoBeanSwingJInternalFrameLocal.actualizarRelaciones(periodoBeanSwingJInternalFrameLocal.periodo);

				evaluacionproveedorLocal.setPeriodo(periodoBeanSwingJInternalFrameLocal.periodo);

				this.addItemDefectoCombosForeignKeyPeriodo();
				this.cargarCombosFramePeriodosForeignKey("Formulario");
				this.setActualPeriodoForeignKey(periodoBeanSwingJInternalFrameLocal.periodo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				evaluacionproveedorLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarEvaluacionProveedorActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEvaluacionProveedor.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedorLogic.getEvaluacionProveedors().toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedors.toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = evaluacionproveedorValidator.getInvalidValues(this.evaluacionproveedor);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EvaluacionProveedor evaluacionproveedor,List<EvaluacionProveedor> evaluacionproveedors) throws Exception {
		try	{		
			EvaluacionProveedorConstantesFunciones.actualizarLista(evaluacionproveedor,evaluacionproveedors,this.evaluacionproveedorSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EvaluacionProveedor evaluacionproveedor,List<EvaluacionProveedor> evaluacionproveedors) throws Exception {
		try	{			
			EvaluacionProveedorConstantesFunciones.actualizarSelectedLista(evaluacionproveedor,evaluacionproveedors);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EvaluacionProveedor> evaluacionproveedorsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				evaluacionproveedorsLocal=this.evaluacionproveedorLogic.getEvaluacionProveedors();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				evaluacionproveedorsLocal=this.evaluacionproveedors;
			}
			//ARCHITECTURE
		
			for(EvaluacionProveedor evaluacionproveedorLocal:evaluacionproveedorsLocal) {
				if(this.permiteMantenimiento(evaluacionproveedorLocal) && evaluacionproveedorLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EvaluacionProveedorConstantesFunciones.getEvaluacionProveedorLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EvaluacionProveedorConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionProveedor.jLabelid_empresaEvaluacionProveedor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EvaluacionProveedorConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionProveedor.jLabelid_sucursalEvaluacionProveedor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EvaluacionProveedorConstantesFunciones.IDEJERCICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionProveedor.jLabelid_ejercicioEvaluacionProveedor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EvaluacionProveedorConstantesFunciones.IDPERIODO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionProveedor.jLabelid_periodoEvaluacionProveedor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EvaluacionProveedorConstantesFunciones.IDCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionProveedor.jLabelid_clienteEvaluacionProveedor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EvaluacionProveedorConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionProveedor.jLabelfechaEvaluacionProveedor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EvaluacionProveedorConstantesFunciones.CONTACTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionProveedor.jLabelcontactoEvaluacionProveedor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EvaluacionProveedorConstantesFunciones.EVALUADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionProveedor.jLabelevaluadoEvaluacionProveedor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EvaluacionProveedorConstantesFunciones.RESULTADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionProveedor.jLabelresultadoEvaluacionProveedor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EvaluacionProveedorConstantesFunciones.RESPONSABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionProveedor.jLabelresponsableEvaluacionProveedor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EvaluacionProveedorConstantesFunciones.FECHADESDE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionProveedor.jLabelfecha_desdeEvaluacionProveedor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EvaluacionProveedorConstantesFunciones.FECHAHASTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionProveedor.jLabelfecha_hastaEvaluacionProveedor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EvaluacionProveedorConstantesFunciones.OBSERVACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionProveedor.jLabelobservacionEvaluacionProveedor,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEvaluacionProveedor.jLabelid_empresaEvaluacionProveedor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEvaluacionProveedor.jLabelid_sucursalEvaluacionProveedor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEvaluacionProveedor.jLabelid_ejercicioEvaluacionProveedor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEvaluacionProveedor.jLabelid_periodoEvaluacionProveedor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEvaluacionProveedor.jLabelid_clienteEvaluacionProveedor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEvaluacionProveedor.jLabelfechaEvaluacionProveedor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEvaluacionProveedor.jLabelcontactoEvaluacionProveedor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEvaluacionProveedor.jLabelevaluadoEvaluacionProveedor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEvaluacionProveedor.jLabelresultadoEvaluacionProveedor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEvaluacionProveedor.jLabelresponsableEvaluacionProveedor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEvaluacionProveedor.jLabelfecha_desdeEvaluacionProveedor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEvaluacionProveedor.jLabelfecha_hastaEvaluacionProveedor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEvaluacionProveedor.jLabelobservacionEvaluacionProveedor,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("DetalleEvaluacionProveedor")) {
			if(this.evaluacionproveedor==null) {
				this.evaluacionproveedor= new EvaluacionProveedor();
			}

			if(this.evaluacionproveedorSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEvaluacionProveedor
				this.setVariablesFormularioToObjetoActualEvaluacionProveedor(this.evaluacionproveedor,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionProveedor(this.evaluacionproveedor);

				this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.getdetalleevaluacionproveedor().setEvaluacionProveedor(this.evaluacionproveedor);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoEvaluacionProveedor--;	
		
		
		this.evaluacionproveedorAux=new EvaluacionProveedor();
		
		this.evaluacionproveedorAux.setId(this.iIdNuevoEvaluacionProveedor);
		this.evaluacionproveedorAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.evaluacionproveedorLogic.getEvaluacionProveedors().add(this.evaluacionproveedorAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.evaluacionproveedors.add(this.evaluacionproveedorAux);
		}
		//ARCHITECTURE
		
		this.evaluacionproveedor=this.evaluacionproveedorAux;
		
		if(EvaluacionProveedorJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEvaluacionProveedor(this.evaluacionproveedor);
			this.setVariablesObjetoActualToFormularioForeignKeyEvaluacionProveedor(this.evaluacionproveedor);
		}
				
		//this.setDefaultControlesEvaluacionProveedor();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEvaluacionProveedor();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEvaluacionProveedor();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEvaluacionProveedor();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEvaluacionProveedor(this.evaluacionproveedorBean,this.evaluacionproveedor,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionProveedor(this.evaluacionproveedor);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EvaluacionProveedorConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.evaluacionproveedorSessionBean.getConGuardarRelaciones()) {
			classes=EvaluacionProveedorConstantesFunciones.getClassesRelationshipsOfEvaluacionProveedor(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.evaluacionproveedorReturnGeneral=evaluacionproveedorLogic.procesarEventosEvaluacionProveedorsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.evaluacionproveedorLogic.getEvaluacionProveedors(),this.evaluacionproveedor,this.evaluacionproveedorParameterGeneral,this.isEsNuevoEvaluacionProveedor,classes);//this.evaluacionproveedorLogic.getEvaluacionProveedor()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEvaluacionProveedor(this.evaluacionproveedorReturnGeneral,this.evaluacionproveedorBean,false);
		
		if(this.evaluacionproveedorReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEvaluacionProveedor(this.evaluacionproveedorReturnGeneral.getEvaluacionProveedor());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEvaluacionProveedor(this.evaluacionproveedorReturnGeneral.getEvaluacionProveedor());
		}
		
		if(this.evaluacionproveedorReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEvaluacionProveedor(this.evaluacionproveedorReturnGeneral.getEvaluacionProveedor(),classes);//this.evaluacionproveedorBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEvaluacionProveedor(this.evaluacionproveedor,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEvaluacionProveedor();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEvaluacionProveedor();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EvaluacionProveedorBeanSwingJInternalFrameAdditional.RecargarFormEvaluacionProveedor(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEvaluacionProveedor(false);
						
			if(evaluacionproveedorSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado() && DetalleEvaluacionProveedorJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleEvaluacionProveedorActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(EvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEvaluacionProveedor();
			}
			
			this.actualizarVisualTableDatosEvaluacionProveedor();
			
			this.jTableDatosEvaluacionProveedor.setRowSelectionInterval(this.getIndiceNuevoEvaluacionProveedor(), this.getIndiceNuevoEvaluacionProveedor());
			
			this.seleccionarFilaTablaEvaluacionProveedorActual();
						
			this.actualizarEstadoCeldasBotonesEvaluacionProveedor("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEvaluacionProveedor(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEvaluacionProveedor.jDateChooserfechaEvaluacionProveedor.setEnabled(isHabilitar && this.evaluacionproveedorConstantesFunciones.activarfechaEvaluacionProveedor);
		this.jInternalFrameDetalleFormEvaluacionProveedor.jTextAreacontactoEvaluacionProveedor.setEnabled(isHabilitar && this.evaluacionproveedorConstantesFunciones.activarcontactoEvaluacionProveedor);
		this.jInternalFrameDetalleFormEvaluacionProveedor.jTextAreaevaluadoEvaluacionProveedor.setEnabled(isHabilitar && this.evaluacionproveedorConstantesFunciones.activarevaluadoEvaluacionProveedor);
		this.jInternalFrameDetalleFormEvaluacionProveedor.jTextArearesultadoEvaluacionProveedor.setEnabled(isHabilitar && this.evaluacionproveedorConstantesFunciones.activarresultadoEvaluacionProveedor);
		this.jInternalFrameDetalleFormEvaluacionProveedor.jTextArearesponsableEvaluacionProveedor.setEnabled(isHabilitar && this.evaluacionproveedorConstantesFunciones.activarresponsableEvaluacionProveedor);
		this.jInternalFrameDetalleFormEvaluacionProveedor.jDateChooserfecha_desdeEvaluacionProveedor.setEnabled(isHabilitar && this.evaluacionproveedorConstantesFunciones.activarfecha_desdeEvaluacionProveedor);
		this.jInternalFrameDetalleFormEvaluacionProveedor.jDateChooserfecha_hastaEvaluacionProveedor.setEnabled(isHabilitar && this.evaluacionproveedorConstantesFunciones.activarfecha_hastaEvaluacionProveedor);
		this.jInternalFrameDetalleFormEvaluacionProveedor.jTextAreaobservacionEvaluacionProveedor.setEnabled(isHabilitar && this.evaluacionproveedorConstantesFunciones.activarobservacionEvaluacionProveedor);	
		//
		this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_empresaEvaluacionProveedor.setEnabled(isHabilitar && this.evaluacionproveedorConstantesFunciones.activarid_empresaEvaluacionProveedor);//
		this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_sucursalEvaluacionProveedor.setEnabled(isHabilitar && this.evaluacionproveedorConstantesFunciones.activarid_sucursalEvaluacionProveedor);//
		this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_ejercicioEvaluacionProveedor.setEnabled(isHabilitar && this.evaluacionproveedorConstantesFunciones.activarid_ejercicioEvaluacionProveedor);//
		this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_periodoEvaluacionProveedor.setEnabled(isHabilitar && this.evaluacionproveedorConstantesFunciones.activarid_periodoEvaluacionProveedor);
		this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_clienteEvaluacionProveedor.setEnabled(isHabilitar && this.evaluacionproveedorConstantesFunciones.activarid_clienteEvaluacionProveedor);
	};
	
	public void setDefaultControlesEvaluacionProveedor() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEvaluacionProveedor(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.evaluacionproveedorSessionBean.setConGuardarRelaciones(true);			
			this.evaluacionproveedorSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEvaluacionProveedor.jTabbedPaneRelacionesEvaluacionProveedor.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.evaluacionproveedorSessionBean.setConGuardarRelaciones(false);			
			this.evaluacionproveedorSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEvaluacionProveedor.jTabbedPaneRelacionesEvaluacionProveedor.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoEvaluacionProveedor() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EvaluacionProveedor evaluacionproveedorAux:this.evaluacionproveedorLogic.getEvaluacionProveedors()) {
				if(evaluacionproveedorAux.getId().equals(this.iIdNuevoEvaluacionProveedor)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EvaluacionProveedor evaluacionproveedorAux:this.evaluacionproveedors) {
				if(evaluacionproveedorAux.getId().equals(this.iIdNuevoEvaluacionProveedor)) {
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
	
	public int getIndiceActualEvaluacionProveedor(EvaluacionProveedor evaluacionproveedor,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EvaluacionProveedor evaluacionproveedorAux:this.evaluacionproveedorLogic.getEvaluacionProveedors()) {
				if(evaluacionproveedorAux.getId().equals(evaluacionproveedor.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EvaluacionProveedor evaluacionproveedorAux:this.evaluacionproveedors) {
				if(evaluacionproveedorAux.getId().equals(evaluacionproveedor.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEvaluacionProveedor(EvaluacionProveedor evaluacionproveedorOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EvaluacionProveedor evaluacionproveedorAux:this.evaluacionproveedorLogic.getEvaluacionProveedors()) {
				if(evaluacionproveedorAux.getEvaluacionProveedorOriginal().getId().equals(evaluacionproveedorOriginal.getId())) {
					existe=true;
					evaluacionproveedorOriginal.setId(evaluacionproveedorAux.getId());
					evaluacionproveedorOriginal.setVersionRow(evaluacionproveedorAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EvaluacionProveedor evaluacionproveedorAux:this.evaluacionproveedors) {
				if(evaluacionproveedorAux.getEvaluacionProveedorOriginal().getId().equals(evaluacionproveedorOriginal.getId())) {
					existe=true;
					evaluacionproveedorOriginal.setId(evaluacionproveedorAux.getId());
					evaluacionproveedorOriginal.setVersionRow(evaluacionproveedorAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEvaluacionProveedor(Boolean esParaCancelar) throws Exception {
		evaluacionproveedorsAux=new ArrayList<EvaluacionProveedor>();
		evaluacionproveedorAux=new EvaluacionProveedor();
		
		if(!this.evaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EvaluacionProveedor evaluacionproveedorAux:this.evaluacionproveedorLogic.getEvaluacionProveedors()) {
					if(evaluacionproveedorAux.getId()<0) {
						evaluacionproveedorsAux.add(evaluacionproveedorAux);
					}		
				}
				this.iIdNuevoEvaluacionProveedor=0L;
				this.evaluacionproveedorLogic.getEvaluacionProveedors().removeAll(evaluacionproveedorsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EvaluacionProveedor evaluacionproveedorAux:this.evaluacionproveedors) {
					if(evaluacionproveedorAux.getId()<0) {
						evaluacionproveedorsAux.add(evaluacionproveedorAux);
					}		
				}
				this.iIdNuevoEvaluacionProveedor=0L;
				this.evaluacionproveedors.removeAll(evaluacionproveedorsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEvaluacionProveedor 
					&& this.evaluacionproveedorLogic.getEvaluacionProveedors().size()>0
					) {
					evaluacionproveedorAux=this.evaluacionproveedorLogic.getEvaluacionProveedors().get(this.evaluacionproveedorLogic.getEvaluacionProveedors().size() - 1);
				
					if(evaluacionproveedorAux.getId()<0) {
						this.evaluacionproveedorLogic.getEvaluacionProveedors().remove(evaluacionproveedorAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEvaluacionProveedor && this.evaluacionproveedors.size()>0) {
					evaluacionproveedorAux=this.evaluacionproveedors.get(this.evaluacionproveedors.size() - 1);
				
					if(evaluacionproveedorAux.getId()<0) {
						this.evaluacionproveedors.remove(evaluacionproveedorAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEvaluacionProveedor(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(evaluacionproveedor.getId()<0) {
				this.evaluacionproveedorLogic.getEvaluacionProveedors().remove(this.evaluacionproveedor);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(evaluacionproveedor.getId()<0) {
				this.evaluacionproveedors.remove(this.evaluacionproveedor);
			}
		}			
	}
	
	public void setEstadosInicialesEvaluacionProveedor(List<EvaluacionProveedor> evaluacionproveedorsAux) throws Exception {
		EvaluacionProveedorConstantesFunciones.setEstadosInicialesEvaluacionProveedor(evaluacionproveedorsAux);
	}
	
	public void setEstadosInicialesEvaluacionProveedor(EvaluacionProveedor evaluacionproveedorAux) throws Exception {
		EvaluacionProveedorConstantesFunciones.setEstadosInicialesEvaluacionProveedor(evaluacionproveedorAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEvaluacionProveedorActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEvaluacionProveedor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEvaluacionProveedorActual()) {
				if(!this.isEsNuevoEvaluacionProveedor) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEvaluacionProveedor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEvaluacionProveedor=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEvaluacionProveedorActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Evaluacion Proveedor ?", "MANTENIMIENTO DE Evaluacion Proveedor", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEvaluacionProveedor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EvaluacionProveedor evaluacionproveedor) throws Exception {
		EvaluacionProveedorConstantesFunciones.seleccionarAsignar(this.evaluacionproveedor,evaluacionproveedor);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEvaluacionProveedor=this.isPermisoActualizarOriginalEvaluacionProveedor;
			
			
			this.seleccionarAsignar(evaluacionproveedor);
			
			

			idClienteActual=evaluacionproveedor.getid_cliente();
			this.seleccionarClienteActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EvaluacionProveedorConstantesFunciones.quitarEspaciosEvaluacionProveedor(this.evaluacionproveedor,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEvaluacionProveedor("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.evaluacionproveedorSessionBean.setsFuncionBusquedaRapida(this.evaluacionproveedorSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarClienteActual() throws Exception {
		try	{
			Cliente clienteAux=new Cliente();

			if(this.idClienteActual != null && this.idClienteActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					clienteLogic.getEntityWithConnection(this.idClienteActual);
					clienteAux= clienteLogic.getCliente();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				clientesForeignKey=new ArrayList<Cliente>();
				clientesForeignKey.add(clienteAux);
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
			if(this.isEsNuevoEvaluacionProveedor) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEvaluacionProveedor(esParaCancelar);				
				this.cancelarNuevoEvaluacionProveedor(esParaCancelar);								
			}
			
			this.evaluacionproveedor=new EvaluacionProveedor();
			
			this.inicializarEvaluacionProveedor();
			
			this.actualizarEstadoCeldasBotonesEvaluacionProveedor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEvaluacionProveedor() throws Exception {
		try {
			EvaluacionProveedorConstantesFunciones.inicializarEvaluacionProveedor(this.evaluacionproveedor);
			
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
			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.evaluacionproveedorLogic.getEvaluacionProveedors().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEvaluacionProveedors(String sAccionBusqueda,List<EvaluacionProveedor> evaluacionproveedorsParaReportes) throws Exception {
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
					sPathReporteFinal="EvaluacionProveedor"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EvaluacionProveedorMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EvaluacionProveedorMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EvaluacionProveedor"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Evaluacion Proveedores");		
		parameters.put("busquedapor", EvaluacionProveedorConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(DetalleEvaluacionProveedor.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					EvaluacionProveedorLogic evaluacionproveedorLogicAuxiliar=new EvaluacionProveedorLogic();
					evaluacionproveedorLogicAuxiliar.setDatosCliente(evaluacionproveedorLogic.getDatosCliente());				
					evaluacionproveedorLogicAuxiliar.setEvaluacionProveedors(evaluacionproveedorsParaReportes);
					
					evaluacionproveedorLogicAuxiliar.cargarRelacionesLoteForeignKeyEvaluacionProveedorWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					evaluacionproveedorsParaReportes=evaluacionproveedorLogicAuxiliar.getEvaluacionProveedors();
					
					//evaluacionproveedorLogic.getNewConnexionToDeep();
					
					//for (EvaluacionProveedor evaluacionproveedor:evaluacionproveedorsParaReportes) {
					//	evaluacionproveedorLogic.deepLoad(evaluacionproveedor, false, DeepLoadType.INCLUDE, classes);
					//}						
					//evaluacionproveedorLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//evaluacionproveedorLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileDetalleEvaluacionProveedor = AuxiliarReportes.class.getResourceAsStream("DetalleEvaluacionProveedorDetalleRelacionesDesign.jasper");
			parameters.put("subreport_detalleevaluacionproveedor", reportFileDetalleEvaluacionProveedor);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEvaluacionProveedor=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EvaluacionProveedorConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EvaluacionProveedorConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEvaluacionProveedor=new JRBeanArrayDataSource(EvaluacionProveedorJInternalFrame.TraerEvaluacionProveedorBeans(evaluacionproveedorsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEvaluacionProveedor);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EvaluacionProveedorConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EvaluacionProveedorConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EvaluacionProveedorBean.TraerEvaluacionProveedorBeans(evaluacionproveedorsParaReportes).toArray()));
							
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
				this.generarExcelReporteEvaluacionProveedors(sAccionBusqueda,sTipoArchivoReporte,evaluacionproveedorsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEvaluacionProveedors(sAccionBusqueda,sTipoArchivoReporte,evaluacionproveedorsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEvaluacionProveedorActionPerformed(null);
					//this.generarExcelReporteEvaluacionProveedors(sAccionBusqueda,sTipoArchivoReporte,evaluacionproveedorsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEvaluacionProveedors(sAccionBusqueda,sTipoArchivoReporte,evaluacionproveedorsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEvaluacionProveedors(sAccionBusqueda,sTipoArchivoReporte,evaluacionproveedorsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEvaluacionProveedors(sAccionBusqueda,sTipoArchivoReporte,evaluacionproveedorsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEvaluacionProveedors(String sAccionBusqueda,String sTipoArchivoReporte,List<EvaluacionProveedor> evaluacionproveedorsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"evaluacionproveedor";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EvaluacionProveedors");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEvaluacionProveedor("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EvaluacionProveedor evaluacionproveedor : evaluacionproveedorsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EvaluacionProveedorConstantesFunciones.generarExcelReporteDataEvaluacionProveedor("NORMAL",row,workbook,evaluacionproveedor,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.evaluacionproveedorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Evaluacion Proveedor",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEvaluacionProveedor(String sTipo,Row row,Workbook workbook) {
		
		EvaluacionProveedorConstantesFunciones.generarExcelReporteHeaderEvaluacionProveedor(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEvaluacionProveedors(String sAccionBusqueda,String sTipoArchivoReporte,List<EvaluacionProveedor> evaluacionproveedorsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"evaluacionproveedor_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EvaluacionProveedors");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EvaluacionProveedor evaluacionproveedor : evaluacionproveedorsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EvaluacionProveedorConstantesFunciones.getEvaluacionProveedorDescripcion(evaluacionproveedor));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionProveedorConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionProveedorConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionproveedor.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionProveedorConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionProveedorConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionproveedor.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionProveedorConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionProveedorConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionproveedor.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionProveedorConstantesFunciones.LABEL_IDPERIODO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionProveedorConstantesFunciones.LABEL_IDPERIODO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionproveedor.getperiodo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionProveedorConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionProveedorConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionproveedor.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionProveedorConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionProveedorConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionproveedor.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionProveedorConstantesFunciones.LABEL_CONTACTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionProveedorConstantesFunciones.LABEL_CONTACTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionproveedor.getcontacto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionProveedorConstantesFunciones.LABEL_EVALUADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionProveedorConstantesFunciones.LABEL_EVALUADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionproveedor.getevaluado());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionProveedorConstantesFunciones.LABEL_RESULTADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionProveedorConstantesFunciones.LABEL_RESULTADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionproveedor.getresultado());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionProveedorConstantesFunciones.LABEL_RESPONSABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionProveedorConstantesFunciones.LABEL_RESPONSABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionproveedor.getresponsable());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionProveedorConstantesFunciones.LABEL_FECHADESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionProveedorConstantesFunciones.LABEL_FECHADESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionproveedor.getfecha_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionProveedorConstantesFunciones.LABEL_FECHAHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionProveedorConstantesFunciones.LABEL_FECHAHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionproveedor.getfecha_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EvaluacionProveedorConstantesFunciones.LABEL_OBSERVACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EvaluacionProveedorConstantesFunciones.LABEL_OBSERVACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(evaluacionproveedor.getobservacion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.evaluacionproveedorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Evaluacion Proveedor",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEvaluacionProveedors(String sAccionBusqueda,String sTipoArchivoReporte,List<EvaluacionProveedor> evaluacionproveedorsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EvaluacionProveedor> evaluacionproveedorsRespaldo=null;
		
		classes=EvaluacionProveedorConstantesFunciones.getClassesRelationshipsOfEvaluacionProveedor(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.evaluacionproveedorLogic.setDatosCliente(this.datosCliente);
		this.evaluacionproveedorLogic.setDatosDeep(this.datosDeep);
		this.evaluacionproveedorLogic.setIsConDeep(true);
		
		evaluacionproveedorsRespaldo=this.evaluacionproveedorLogic.getEvaluacionProveedors();
		
		this.evaluacionproveedorLogic.setEvaluacionProveedors(evaluacionproveedorsParaReportes);	
		this.evaluacionproveedorLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		evaluacionproveedorsParaReportes=this.evaluacionproveedorLogic.getEvaluacionProveedors();
		this.evaluacionproveedorLogic.setEvaluacionProveedors(evaluacionproveedorsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"evaluacionproveedor_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EvaluacionProveedors");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEvaluacionProveedor("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EvaluacionProveedor evaluacionproveedor : evaluacionproveedorsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEvaluacionProveedor("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EvaluacionProveedorConstantesFunciones.generarExcelReporteDataEvaluacionProveedor("NORMAL",row,workbook,evaluacionproveedor,cellStyleDataAux);
		
			
			


				//DetalleEvaluacionProveedor
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO))) {

				if(evaluacionproveedor.getDetalleEvaluacionProveedors()!=null && evaluacionproveedor.getDetalleEvaluacionProveedors().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DetalleEvaluacionProveedorConstantesFunciones.generarExcelReporteHeaderDetalleEvaluacionProveedor("RELACIONADO",row,workbook);
				}

				if(evaluacionproveedor.getDetalleEvaluacionProveedors()!=null) {
					i2=0;
					for(DetalleEvaluacionProveedor detalleevaluacionproveedor : evaluacionproveedor.getDetalleEvaluacionProveedors()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DetalleEvaluacionProveedorConstantesFunciones.generarExcelReporteDataDetalleEvaluacionProveedor("RELACIONADO",row,workbook,detalleevaluacionproveedor,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(EvaluacionProveedorConstantesFunciones.getEvaluacionProveedorDescripcion(evaluacionproveedor));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.evaluacionproveedorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Evaluacion Proveedor",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEvaluacionProveedor.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEvaluacionProveedor.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEvaluacionProveedor.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEvaluacionProveedor.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEvaluacionProveedor() throws Exception {		
		this.startProcessEvaluacionProveedor(true);
	}
	
	public void startProcessEvaluacionProveedor(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasEvaluacionProveedor ,this.jPanelParametrosReportesEvaluacionProveedor, this.jScrollPanelDatosEvaluacionProveedor,this.jPanelPaginacionEvaluacionProveedor, this.jScrollPanelDatosEdicionEvaluacionProveedor, this.jPanelAccionesEvaluacionProveedor,this.jPanelAccionesFormularioEvaluacionProveedor,this.jmenuBarEvaluacionProveedor,this.jmenuBarDetalleEvaluacionProveedor,this.jTtoolBarEvaluacionProveedor,this.jTtoolBarDetalleEvaluacionProveedor);		
		
		final JTabbedPane jTabbedPaneBusquedasEvaluacionProveedor=this.jTabbedPaneBusquedasEvaluacionProveedor; 
		
		final JPanel jPanelParametrosReportesEvaluacionProveedor=this.jPanelParametrosReportesEvaluacionProveedor;
		//final JScrollPane jScrollPanelDatosEvaluacionProveedor=this.jScrollPanelDatosEvaluacionProveedor;
		final JTable jTableDatosEvaluacionProveedor=this.jTableDatosEvaluacionProveedor;		
		final JPanel jPanelPaginacionEvaluacionProveedor=this.jPanelPaginacionEvaluacionProveedor;
		//final JScrollPane jScrollPanelDatosEdicionEvaluacionProveedor=this.jScrollPanelDatosEdicionEvaluacionProveedor;
		final JPanel jPanelAccionesEvaluacionProveedor=this.jPanelAccionesEvaluacionProveedor;
		
		JPanel jPanelCamposAuxiliarEvaluacionProveedor=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEvaluacionProveedor=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) {
			jPanelCamposAuxiliarEvaluacionProveedor=this.jInternalFrameDetalleFormEvaluacionProveedor.jPanelCamposEvaluacionProveedor;
			jPanelAccionesFormularioAuxiliarEvaluacionProveedor=this.jInternalFrameDetalleFormEvaluacionProveedor.jPanelAccionesFormularioEvaluacionProveedor;
		}
		
		final JPanel jPanelCamposEvaluacionProveedor=jPanelCamposAuxiliarEvaluacionProveedor;
		final JPanel jPanelAccionesFormularioEvaluacionProveedor=jPanelAccionesFormularioAuxiliarEvaluacionProveedor;
		
		
		final JMenuBar jmenuBarEvaluacionProveedor=this.jmenuBarEvaluacionProveedor;
		final JToolBar jTtoolBarEvaluacionProveedor=this.jTtoolBarEvaluacionProveedor;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEvaluacionProveedor=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEvaluacionProveedor=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) {
			jmenuBarDetalleAuxiliarEvaluacionProveedor=this.jInternalFrameDetalleFormEvaluacionProveedor.jmenuBarDetalleEvaluacionProveedor;
			jTtoolBarDetalleAuxiliarEvaluacionProveedor=this.jInternalFrameDetalleFormEvaluacionProveedor.jTtoolBarDetalleEvaluacionProveedor;
		}
		
		final JMenuBar jmenuBarDetalleEvaluacionProveedor=jmenuBarDetalleAuxiliarEvaluacionProveedor;
		final JToolBar jTtoolBarDetalleEvaluacionProveedor=jTtoolBarDetalleAuxiliarEvaluacionProveedor;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEvaluacionProveedor;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEvaluacionProveedor;
			processRunnable.jTableDatos=jTableDatosEvaluacionProveedor;
			processRunnable.jPanelCampos=jPanelCamposEvaluacionProveedor;
			processRunnable.jPanelPaginacion=jPanelPaginacionEvaluacionProveedor;
			processRunnable.jPanelAcciones=jPanelAccionesEvaluacionProveedor;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEvaluacionProveedor;
			
			
			processRunnable.jmenuBar=jmenuBarEvaluacionProveedor;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEvaluacionProveedor;
			processRunnable.jTtoolBar=jTtoolBarEvaluacionProveedor;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEvaluacionProveedor;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEvaluacionProveedor ,jPanelParametrosReportesEvaluacionProveedor,jTableDatosEvaluacionProveedor, /*jScrollPanelDatosEvaluacionProveedor,*/jPanelCamposEvaluacionProveedor,jPanelPaginacionEvaluacionProveedor, /*jScrollPanelDatosEdicionEvaluacionProveedor,*/ jPanelAccionesEvaluacionProveedor,jPanelAccionesFormularioEvaluacionProveedor,jmenuBarEvaluacionProveedor,jmenuBarDetalleEvaluacionProveedor,jTtoolBarEvaluacionProveedor,jTtoolBarDetalleEvaluacionProveedor);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEvaluacionProveedor ,jPanelParametrosReportesEvaluacionProveedor, jScrollPanelDatosEvaluacionProveedor,jPanelPaginacionEvaluacionProveedor, jScrollPanelDatosEdicionEvaluacionProveedor, jPanelAccionesEvaluacionProveedor,jPanelAccionesFormularioEvaluacionProveedor,jmenuBarEvaluacionProveedor,jmenuBarDetalleEvaluacionProveedor,jTtoolBarEvaluacionProveedor,jTtoolBarDetalleEvaluacionProveedor);
						
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
	
	public void finishProcessEvaluacionProveedor() {// throws Exception 
		this.finishProcessEvaluacionProveedor(true);
	}
	
	public void finishProcessEvaluacionProveedor(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasEvaluacionProveedor ,this.jPanelParametrosReportesEvaluacionProveedor, this.jScrollPanelDatosEvaluacionProveedor,this.jPanelPaginacionEvaluacionProveedor, this.jScrollPanelDatosEdicionEvaluacionProveedor, this.jPanelAccionesEvaluacionProveedor,this.jPanelAccionesFormularioEvaluacionProveedor,this.jmenuBarEvaluacionProveedor,this.jmenuBarDetalleEvaluacionProveedor,this.jTtoolBarEvaluacionProveedor,this.jTtoolBarDetalleEvaluacionProveedor);		
		
		final JTabbedPane jTabbedPaneBusquedasEvaluacionProveedor=this.jTabbedPaneBusquedasEvaluacionProveedor; 
		
		final JPanel jPanelParametrosReportesEvaluacionProveedor=this.jPanelParametrosReportesEvaluacionProveedor;
		//final JScrollPane jScrollPanelDatosEvaluacionProveedor=this.jScrollPanelDatosEvaluacionProveedor;
		final JTable jTableDatosEvaluacionProveedor=this.jTableDatosEvaluacionProveedor;		
		final JPanel jPanelPaginacionEvaluacionProveedor=this.jPanelPaginacionEvaluacionProveedor;
		//final JScrollPane jScrollPanelDatosEdicionEvaluacionProveedor=this.jScrollPanelDatosEdicionEvaluacionProveedor;
		final JPanel jPanelAccionesEvaluacionProveedor=this.jPanelAccionesEvaluacionProveedor;
		
		JPanel jPanelCamposAuxiliarEvaluacionProveedor=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEvaluacionProveedor=new JPanel();
		
		if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) {
			jPanelCamposAuxiliarEvaluacionProveedor=this.jInternalFrameDetalleFormEvaluacionProveedor.jPanelCamposEvaluacionProveedor;
			jPanelAccionesFormularioAuxiliarEvaluacionProveedor=this.jInternalFrameDetalleFormEvaluacionProveedor.jPanelAccionesFormularioEvaluacionProveedor;
		}
		
		final JPanel jPanelCamposEvaluacionProveedor=jPanelCamposAuxiliarEvaluacionProveedor;
		final JPanel jPanelAccionesFormularioEvaluacionProveedor=jPanelAccionesFormularioAuxiliarEvaluacionProveedor;
		
		
		final JMenuBar jmenuBarEvaluacionProveedor=this.jmenuBarEvaluacionProveedor;		
		final JToolBar jTtoolBarEvaluacionProveedor=this.jTtoolBarEvaluacionProveedor;
				
		JMenuBar jmenuBarDetalleAuxiliarEvaluacionProveedor=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEvaluacionProveedor=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) {
			jmenuBarDetalleAuxiliarEvaluacionProveedor=this.jInternalFrameDetalleFormEvaluacionProveedor.jmenuBarDetalleEvaluacionProveedor;
			jTtoolBarDetalleAuxiliarEvaluacionProveedor=this.jInternalFrameDetalleFormEvaluacionProveedor.jTtoolBarDetalleEvaluacionProveedor;		
		}
		
		final JMenuBar jmenuBarDetalleEvaluacionProveedor=jmenuBarDetalleAuxiliarEvaluacionProveedor;
		final JToolBar jTtoolBarDetalleEvaluacionProveedor=jTtoolBarDetalleAuxiliarEvaluacionProveedor;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEvaluacionProveedor;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEvaluacionProveedor;
			processRunnable.jTableDatos=jTableDatosEvaluacionProveedor;
			processRunnable.jPanelCampos=jPanelCamposEvaluacionProveedor;
			processRunnable.jPanelPaginacion=jPanelPaginacionEvaluacionProveedor;
			processRunnable.jPanelAcciones=jPanelAccionesEvaluacionProveedor;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEvaluacionProveedor;
			
			
			processRunnable.jmenuBar=jmenuBarEvaluacionProveedor;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEvaluacionProveedor;
			processRunnable.jTtoolBar=jTtoolBarEvaluacionProveedor;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEvaluacionProveedor;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEvaluacionProveedor ,jPanelParametrosReportesEvaluacionProveedor, jTableDatosEvaluacionProveedor,/*jScrollPanelDatosEvaluacionProveedor,*/jPanelCamposEvaluacionProveedor,jPanelPaginacionEvaluacionProveedor, /*jScrollPanelDatosEdicionEvaluacionProveedor,*/ jPanelAccionesEvaluacionProveedor,jPanelAccionesFormularioEvaluacionProveedor,jmenuBarEvaluacionProveedor,jmenuBarDetalleEvaluacionProveedor,jTtoolBarEvaluacionProveedor,jTtoolBarDetalleEvaluacionProveedor));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEvaluacionProveedor(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEvaluacionProveedor(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEvaluacionProveedor(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEvaluacionProveedor(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEvaluacionProveedor,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEvaluacionProveedor,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEvaluacionProveedor(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEvaluacionProveedor,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEvaluacionProveedor,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.evaluacionproveedorConstantesFunciones.getsFinalQueryEvaluacionProveedor();
		String  finalQueryPaginacionTodos=this.evaluacionproveedorConstantesFunciones.getsFinalQueryEvaluacionProveedor();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EvaluacionProveedorConstantesFunciones.getArrayColumnasGlobalesNoEvaluacionProveedor(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EvaluacionProveedorConstantesFunciones.getArrayColumnasGlobalesEvaluacionProveedor(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EvaluacionProveedorConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.evaluacionproveedorsEliminados= new ArrayList<EvaluacionProveedor>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEvaluacionProveedor();
		
				///*EvaluacionProveedorSessionBean*/this.evaluacionproveedorSessionBean=new EvaluacionProveedorSessionBean();
			
			if(this.evaluacionproveedorSessionBean==null) {
				this.evaluacionproveedorSessionBean=new EvaluacionProveedorSessionBean();
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
					this.iNumeroPaginacion=EvaluacionProveedorConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EvaluacionProveedorConstantesFunciones.getClassesForeignKeysOfEvaluacionProveedor(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/evaluacionproveedor."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			evaluacionproveedorsAux= new ArrayList<EvaluacionProveedor>();
			
				
			evaluacionproveedorLogic.setDatosCliente(this.datosCliente);
			evaluacionproveedorLogic.setDatosDeep(this.datosDeep);
			evaluacionproveedorLogic.setIsConDeep(true);
			
			
			evaluacionproveedorLogic.getEvaluacionProveedorDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					evaluacionproveedorLogic.getTodosEvaluacionProveedors(finalQueryGlobal,pagination);
					
					//evaluacionproveedorLogic.getTodosEvaluacionProveedorsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(evaluacionproveedorLogic.getEvaluacionProveedors()==null|| evaluacionproveedorLogic.getEvaluacionProveedors().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							evaluacionproveedorsAux= new ArrayList<EvaluacionProveedor>();
							evaluacionproveedorsAux.addAll(evaluacionproveedorLogic.getEvaluacionProveedors());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							evaluacionproveedorsAux= new ArrayList<EvaluacionProveedor>();
							evaluacionproveedorsAux.addAll(evaluacionproveedors);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							evaluacionproveedorLogic.getTodosEvaluacionProveedors(finalQueryGlobal+"",this.pagination);												
							
							//evaluacionproveedorLogic.getTodosEvaluacionProveedorsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEvaluacionProveedors("Todos",evaluacionproveedorLogic.getEvaluacionProveedors() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							evaluacionproveedorLogic.setEvaluacionProveedors(new ArrayList<EvaluacionProveedor>());					
							evaluacionproveedorLogic.getEvaluacionProveedors().addAll(evaluacionproveedorsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							evaluacionproveedors=new ArrayList<EvaluacionProveedor>();
							evaluacionproveedors.addAll(evaluacionproveedorsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEvaluacionProveedor=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEvaluacionProveedor=this.idActual;
				
				} else if(this.idEvaluacionProveedorActual!=null && this.idEvaluacionProveedorActual!=0L) {
					idEvaluacionProveedor=idEvaluacionProveedorActual;
				}
				
					
				this.sDetalleReporte=EvaluacionProveedorConstantesFunciones.getDetalleIndicePorId(idEvaluacionProveedor);
				
				this.evaluacionproveedors=new ArrayList<EvaluacionProveedor>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					evaluacionproveedorLogic.getEntity(idEvaluacionProveedor);
					
					//evaluacionproveedorLogic.getEntityWithConnection(idEvaluacionProveedor);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					evaluacionproveedorLogic.setEvaluacionProveedors(new ArrayList<EvaluacionProveedor>());
					evaluacionproveedorLogic.getEvaluacionProveedors().add(evaluacionproveedorLogic.getEvaluacionProveedor());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.evaluacionproveedors=new ArrayList<EvaluacionProveedor>();
					this.evaluacionproveedors.add(evaluacionproveedor);
				}
				
				if(evaluacionproveedorLogic.getEvaluacionProveedor()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCliente")) {
				this.sDetalleReporte=EvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					evaluacionproveedorLogic.getEvaluacionProveedorsFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=evaluacionproveedorLogic.getEvaluacionProveedors()==null||evaluacionproveedorLogic.getEvaluacionProveedors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=evaluacionproveedors==null|| evaluacionproveedors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						evaluacionproveedorsAux=new ArrayList<EvaluacionProveedor>();
						evaluacionproveedorsAux.addAll(evaluacionproveedorLogic.getEvaluacionProveedors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							evaluacionproveedorsAux=new ArrayList<EvaluacionProveedor>();
							evaluacionproveedorsAux.addAll(evaluacionproveedors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							evaluacionproveedorLogic.getEvaluacionProveedorsFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEvaluacionProveedors("FK_IdCliente",evaluacionproveedorLogic.getEvaluacionProveedors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEvaluacionProveedors("FK_IdCliente",evaluacionproveedors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						evaluacionproveedorLogic.setEvaluacionProveedors(new ArrayList<EvaluacionProveedor>());
						evaluacionproveedorLogic.getEvaluacionProveedors().addAll(evaluacionproveedorsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							evaluacionproveedors=new ArrayList<EvaluacionProveedor>();
							evaluacionproveedors.addAll(evaluacionproveedorsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEjercicio")) {
				this.sDetalleReporte=EvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					evaluacionproveedorLogic.getEvaluacionProveedorsFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=evaluacionproveedorLogic.getEvaluacionProveedors()==null||evaluacionproveedorLogic.getEvaluacionProveedors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=evaluacionproveedors==null|| evaluacionproveedors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						evaluacionproveedorsAux=new ArrayList<EvaluacionProveedor>();
						evaluacionproveedorsAux.addAll(evaluacionproveedorLogic.getEvaluacionProveedors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							evaluacionproveedorsAux=new ArrayList<EvaluacionProveedor>();
							evaluacionproveedorsAux.addAll(evaluacionproveedors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							evaluacionproveedorLogic.getEvaluacionProveedorsFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEvaluacionProveedors("FK_IdEjercicio",evaluacionproveedorLogic.getEvaluacionProveedors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEvaluacionProveedors("FK_IdEjercicio",evaluacionproveedors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						evaluacionproveedorLogic.setEvaluacionProveedors(new ArrayList<EvaluacionProveedor>());
						evaluacionproveedorLogic.getEvaluacionProveedors().addAll(evaluacionproveedorsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							evaluacionproveedors=new ArrayList<EvaluacionProveedor>();
							evaluacionproveedors.addAll(evaluacionproveedorsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=EvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					evaluacionproveedorLogic.getEvaluacionProveedorsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=evaluacionproveedorLogic.getEvaluacionProveedors()==null||evaluacionproveedorLogic.getEvaluacionProveedors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=evaluacionproveedors==null|| evaluacionproveedors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						evaluacionproveedorsAux=new ArrayList<EvaluacionProveedor>();
						evaluacionproveedorsAux.addAll(evaluacionproveedorLogic.getEvaluacionProveedors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							evaluacionproveedorsAux=new ArrayList<EvaluacionProveedor>();
							evaluacionproveedorsAux.addAll(evaluacionproveedors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							evaluacionproveedorLogic.getEvaluacionProveedorsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEvaluacionProveedors("FK_IdEmpresa",evaluacionproveedorLogic.getEvaluacionProveedors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEvaluacionProveedors("FK_IdEmpresa",evaluacionproveedors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						evaluacionproveedorLogic.setEvaluacionProveedors(new ArrayList<EvaluacionProveedor>());
						evaluacionproveedorLogic.getEvaluacionProveedors().addAll(evaluacionproveedorsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							evaluacionproveedors=new ArrayList<EvaluacionProveedor>();
							evaluacionproveedors.addAll(evaluacionproveedorsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPeriodo")) {
				this.sDetalleReporte=EvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					evaluacionproveedorLogic.getEvaluacionProveedorsFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=evaluacionproveedorLogic.getEvaluacionProveedors()==null||evaluacionproveedorLogic.getEvaluacionProveedors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=evaluacionproveedors==null|| evaluacionproveedors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						evaluacionproveedorsAux=new ArrayList<EvaluacionProveedor>();
						evaluacionproveedorsAux.addAll(evaluacionproveedorLogic.getEvaluacionProveedors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							evaluacionproveedorsAux=new ArrayList<EvaluacionProveedor>();
							evaluacionproveedorsAux.addAll(evaluacionproveedors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							evaluacionproveedorLogic.getEvaluacionProveedorsFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEvaluacionProveedors("FK_IdPeriodo",evaluacionproveedorLogic.getEvaluacionProveedors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEvaluacionProveedors("FK_IdPeriodo",evaluacionproveedors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						evaluacionproveedorLogic.setEvaluacionProveedors(new ArrayList<EvaluacionProveedor>());
						evaluacionproveedorLogic.getEvaluacionProveedors().addAll(evaluacionproveedorsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							evaluacionproveedors=new ArrayList<EvaluacionProveedor>();
							evaluacionproveedors.addAll(evaluacionproveedorsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=EvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					evaluacionproveedorLogic.getEvaluacionProveedorsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=evaluacionproveedorLogic.getEvaluacionProveedors()==null||evaluacionproveedorLogic.getEvaluacionProveedors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=evaluacionproveedors==null|| evaluacionproveedors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						evaluacionproveedorsAux=new ArrayList<EvaluacionProveedor>();
						evaluacionproveedorsAux.addAll(evaluacionproveedorLogic.getEvaluacionProveedors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							evaluacionproveedorsAux=new ArrayList<EvaluacionProveedor>();
							evaluacionproveedorsAux.addAll(evaluacionproveedors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							evaluacionproveedorLogic.getEvaluacionProveedorsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EvaluacionProveedorConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEvaluacionProveedors("FK_IdSucursal",evaluacionproveedorLogic.getEvaluacionProveedors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEvaluacionProveedors("FK_IdSucursal",evaluacionproveedors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						evaluacionproveedorLogic.setEvaluacionProveedors(new ArrayList<EvaluacionProveedor>());
						evaluacionproveedorLogic.getEvaluacionProveedors().addAll(evaluacionproveedorsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							evaluacionproveedors=new ArrayList<EvaluacionProveedor>();
							evaluacionproveedors.addAll(evaluacionproveedorsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEvaluacionProveedor();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEvaluacionProveedor();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=evaluacionproveedorLogic.getEvaluacionProveedors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=evaluacionproveedors.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=evaluacionproveedorLogic.getEvaluacionProveedors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=evaluacionproveedors.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EvaluacionProveedor evaluacionproveedor) {
		Boolean permite=true;
		
		if(this.evaluacionproveedor.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EvaluacionProveedorConstantesFunciones.getOrderByListaEvaluacionProveedor();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EvaluacionProveedorConstantesFunciones.getOrderByListaEvaluacionProveedor();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EvaluacionProveedor evaluacionproveedor:evaluacionproveedorLogic.getEvaluacionProveedors()) {
				if(evaluacionproveedor.getsType().equals(Constantes2.S_TOTALES)) {
					evaluacionproveedorTotales=evaluacionproveedor;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EvaluacionProveedor evaluacionproveedor:this.evaluacionproveedors) {
				if(evaluacionproveedor.getsType().equals(Constantes2.S_TOTALES)) {
					evaluacionproveedorTotales=evaluacionproveedor;
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
			this.evaluacionproveedorAux=new EvaluacionProveedor();
			this.evaluacionproveedorAux.setsType(Constantes2.S_TOTALES);
			this.evaluacionproveedorAux.setIsNew(false);
			this.evaluacionproveedorAux.setIsChanged(false);
			this.evaluacionproveedorAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EvaluacionProveedorConstantesFunciones.TotalizarValoresFilaEvaluacionProveedor(this.evaluacionproveedorLogic.getEvaluacionProveedors(),this.evaluacionproveedorAux);
				
				this.evaluacionproveedorLogic.getEvaluacionProveedors().add(this.evaluacionproveedorAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EvaluacionProveedorConstantesFunciones.TotalizarValoresFilaEvaluacionProveedor(this.evaluacionproveedors,this.evaluacionproveedorAux);
				
				this.evaluacionproveedors.add(this.evaluacionproveedorAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		evaluacionproveedorTotales=new EvaluacionProveedor();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.evaluacionproveedorLogic.getEvaluacionProveedors().remove(evaluacionproveedorTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.evaluacionproveedors.remove(evaluacionproveedorTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		evaluacionproveedorTotales=new EvaluacionProveedor();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EvaluacionProveedor evaluacionproveedor:evaluacionproveedorLogic.getEvaluacionProveedors()) {
				if(evaluacionproveedor.getsType().equals(Constantes2.S_TOTALES)) {
					evaluacionproveedorTotales=evaluacionproveedor;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EvaluacionProveedorConstantesFunciones.TotalizarValoresFilaEvaluacionProveedor(this.evaluacionproveedorLogic.getEvaluacionProveedors(),evaluacionproveedorTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EvaluacionProveedor evaluacionproveedor:this.evaluacionproveedors) {
				if(evaluacionproveedor.getsType().equals(Constantes2.S_TOTALES)) {
					evaluacionproveedorTotales=evaluacionproveedor;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EvaluacionProveedorConstantesFunciones.TotalizarValoresFilaEvaluacionProveedor(this.evaluacionproveedors,evaluacionproveedorTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getEvaluacionProveedorsFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEvaluacionProveedorsFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEvaluacionProveedorsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEvaluacionProveedorsFK_IdPeriodo()throws Exception {
		try {
			sAccionBusqueda="FK_IdPeriodo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEvaluacionProveedorsFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getEvaluacionProveedorsFK_IdCliente(String sFinalQuery,Long id_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					evaluacionproveedorLogic.getEvaluacionProveedorsFK_IdCliente(sFinalQuery,this.pagination,id_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEvaluacionProveedorsFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					evaluacionproveedorLogic.getEvaluacionProveedorsFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEvaluacionProveedorsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					evaluacionproveedorLogic.getEvaluacionProveedorsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEvaluacionProveedorsFK_IdPeriodo(String sFinalQuery,Long id_periodo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					evaluacionproveedorLogic.getEvaluacionProveedorsFK_IdPeriodo(sFinalQuery,this.pagination,id_periodo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEvaluacionProveedorsFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					evaluacionproveedorLogic.getEvaluacionProveedorsFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosEvaluacionProveedor() {
		this.isPermisoTodoEvaluacionProveedor=false;
		this.isPermisoNuevoEvaluacionProveedor=false;
		this.isPermisoActualizarEvaluacionProveedor=false;
		this.isPermisoActualizarOriginalEvaluacionProveedor=false;
		this.isPermisoEliminarEvaluacionProveedor=false;
		this.isPermisoGuardarCambiosEvaluacionProveedor=false;
		this.isPermisoConsultaEvaluacionProveedor=false;
		this.isPermisoBusquedaEvaluacionProveedor=false;
		this.isPermisoReporteEvaluacionProveedor=false;		
		this.isPermisoOrdenEvaluacionProveedor=false;		
		this.isPermisoPaginacionMedioEvaluacionProveedor=false;		
		this.isPermisoPaginacionAltoEvaluacionProveedor=false;
		this.isPermisoPaginacionTodoEvaluacionProveedor=false;
		this.isPermisoCopiarEvaluacionProveedor=false;		
		this.isPermisoVerFormEvaluacionProveedor=false;		
		this.isPermisoDuplicarEvaluacionProveedor=false;		
		this.isPermisoOrdenEvaluacionProveedor=false;		
	}
	
	public void setPermisosUsuarioEvaluacionProveedor(Boolean isPermiso) {
		this.isPermisoTodoEvaluacionProveedor=isPermiso;
		this.isPermisoNuevoEvaluacionProveedor=isPermiso;
		this.isPermisoActualizarEvaluacionProveedor=isPermiso;
		this.isPermisoActualizarOriginalEvaluacionProveedor=isPermiso;
		this.isPermisoEliminarEvaluacionProveedor=isPermiso;
		this.isPermisoGuardarCambiosEvaluacionProveedor=isPermiso;
		this.isPermisoConsultaEvaluacionProveedor=isPermiso;
		this.isPermisoBusquedaEvaluacionProveedor=isPermiso;
		this.isPermisoReporteEvaluacionProveedor=isPermiso;
		this.isPermisoOrdenEvaluacionProveedor=isPermiso;		
		this.isPermisoPaginacionMedioEvaluacionProveedor=isPermiso;		
		this.isPermisoPaginacionAltoEvaluacionProveedor=isPermiso;		
		this.isPermisoPaginacionTodoEvaluacionProveedor=isPermiso;		
		this.isPermisoCopiarEvaluacionProveedor=isPermiso;		
		this.isPermisoVerFormEvaluacionProveedor=isPermiso;		
		this.isPermisoDuplicarEvaluacionProveedor=isPermiso;
		this.isPermisoOrdenEvaluacionProveedor=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEvaluacionProveedor(Boolean isPermiso) {
		//this.isPermisoTodoEvaluacionProveedor=isPermiso;
		this.isPermisoNuevoEvaluacionProveedor=isPermiso;
		this.isPermisoActualizarEvaluacionProveedor=isPermiso;
		this.isPermisoActualizarOriginalEvaluacionProveedor=isPermiso;
		this.isPermisoEliminarEvaluacionProveedor=isPermiso;
		this.isPermisoGuardarCambiosEvaluacionProveedor=isPermiso;
		//this.isPermisoConsultaEvaluacionProveedor=isPermiso;
		//this.isPermisoBusquedaEvaluacionProveedor=isPermiso;
		//this.isPermisoReporteEvaluacionProveedor=isPermiso;
		//this.isPermisoOrdenEvaluacionProveedor=isPermiso;		
		//this.isPermisoPaginacionMedioEvaluacionProveedor=isPermiso;		
		//this.isPermisoPaginacionAltoEvaluacionProveedor=isPermiso;		
		//this.isPermisoPaginacionTodoEvaluacionProveedor=isPermiso;		
		//this.isPermisoCopiarEvaluacionProveedor=isPermiso;		
		//this.isPermisoDuplicarEvaluacionProveedor=isPermiso;
		//this.isPermisoOrdenEvaluacionProveedor=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEvaluacionProveedorClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(DetalleEvaluacionProveedorConstantesFunciones.SNOMBREOPCION);
		
		if(EvaluacionProveedorJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosDetalleEvaluacionProveedor=false;
		this.isTienePermisosDetalleEvaluacionProveedor=this.verificarGetPermisosUsuarioOpcionEvaluacionProveedorClaseRelacionada(this.opcionsRelacionadas,DetalleEvaluacionProveedorConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebEvaluacionProveedor(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEvaluacionProveedorClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosDetalleEvaluacionProveedor=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioEvaluacionProveedorClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEvaluacionProveedorClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEvaluacionProveedorClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosDetalleEvaluacionProveedor && this.jInternalFrameDetalleFormEvaluacionProveedor!=null && this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEvaluacionProveedor.jTabbedPaneRelacionesEvaluacionProveedor.remove(this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioEvaluacionProveedor() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EvaluacionProveedorJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.evaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EvaluacionProveedorConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEvaluacionProveedor=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEvaluacionProveedor=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEvaluacionProveedor=this.isPermisoActualizarEvaluacionProveedor;
			this.isPermisoEliminarEvaluacionProveedor=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEvaluacionProveedor=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEvaluacionProveedor=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEvaluacionProveedor=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEvaluacionProveedor=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEvaluacionProveedor=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEvaluacionProveedor=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEvaluacionProveedor=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEvaluacionProveedor=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEvaluacionProveedor=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEvaluacionProveedor=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEvaluacionProveedor=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEvaluacionProveedor=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEvaluacionProveedor=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.evaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEvaluacionProveedor.setToolTipText(this.jTableDatosEvaluacionProveedor.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEvaluacionProveedor(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEvaluacionProveedor(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EvaluacionProveedorJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EvaluacionProveedorJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEvaluacionProveedor() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosDetalleEvaluacionProveedor && this.evaluacionproveedorConstantesFunciones.mostrarDetalleEvaluacionProveedorEvaluacionProveedor && !EvaluacionProveedorConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Detalle Evaluacion Proveedor");
			reporte.setsDescripcion("Detalle Evaluacion Proveedor");
			this.tiposRelaciones.add(reporte);
		}
		
		
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
	public void inicializarCombosForeignKeyEvaluacionProveedorListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.periodosForeignKey=new ArrayList();
				this.clientesForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEvaluacionProveedorListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EvaluacionProveedorJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEvaluacionProveedorListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPeriodoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyPeriodoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.periodosForeignKey==null||this.periodosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PeriodoConstantesFunciones.getArrayColumnasGlobalesPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PeriodoConstantesFunciones.SFINALQUERY;

				this.cargarCombosPeriodosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyClienteListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ClienteConstantesFunciones.SFINALQUERY;

				this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyEvaluacionProveedorListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			EvaluacionProveedorParameterReturnGeneral evaluacionproveedorReturnGeneral=new EvaluacionProveedorParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.evaluacionproveedorConstantesFunciones.cargarid_empresaEvaluacionProveedor)
					 || (this.esRecargarFks && this.evaluacionproveedorConstantesFunciones.cargarid_empresaEvaluacionProveedor)) {

					if(!this.evaluacionproveedorSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+evaluacionproveedorSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.evaluacionproveedorConstantesFunciones.cargarid_sucursalEvaluacionProveedor)
					 || (this.esRecargarFks && this.evaluacionproveedorConstantesFunciones.cargarid_sucursalEvaluacionProveedor)) {

					if(!this.evaluacionproveedorSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+evaluacionproveedorSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalEjercicio="";

				if(((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0) && this.evaluacionproveedorConstantesFunciones.cargarid_ejercicioEvaluacionProveedor)
					 || (this.esRecargarFks && this.evaluacionproveedorConstantesFunciones.cargarid_ejercicioEvaluacionProveedor)) {

					if(!this.evaluacionproveedorSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEjercicio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

						finalQueryGlobalEjercicio=Funciones.GetFinalQueryAppend(finalQueryGlobalEjercicio, "");
						finalQueryGlobalEjercicio+=EjercicioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEjercicio=" WHERE " + ConstantesSql.ID + "="+evaluacionproveedorSessionBean.getlidEjercicioActual();
					}
				} else {
					finalQueryGlobalEjercicio="NONE";
				}


				String finalQueryGlobalPeriodo="";

				if(((this.periodosForeignKey==null||this.periodosForeignKey.size()<=0) && this.evaluacionproveedorConstantesFunciones.cargarid_periodoEvaluacionProveedor)
					 || (this.esRecargarFks && this.evaluacionproveedorConstantesFunciones.cargarid_periodoEvaluacionProveedor)) {

					if(!this.evaluacionproveedorSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PeriodoConstantesFunciones.getArrayColumnasGlobalesPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPeriodo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoConstantesFunciones.TABLENAME);

						finalQueryGlobalPeriodo=Funciones.GetFinalQueryAppend(finalQueryGlobalPeriodo, "");
						finalQueryGlobalPeriodo+=PeriodoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPeriodosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPeriodo=" WHERE " + ConstantesSql.ID + "="+evaluacionproveedorSessionBean.getlidPeriodoActual();
					}
				} else {
					finalQueryGlobalPeriodo="NONE";
				}


				String finalQueryGlobalCliente="";

				if(((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0) && this.evaluacionproveedorConstantesFunciones.cargarid_clienteEvaluacionProveedor)
					 || (this.esRecargarFks && this.evaluacionproveedorConstantesFunciones.cargarid_clienteEvaluacionProveedor)) {

					if(!this.evaluacionproveedorSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCliente=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

						finalQueryGlobalCliente=Funciones.GetFinalQueryAppend(finalQueryGlobalCliente, "");
						finalQueryGlobalCliente+=ClienteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCliente=" WHERE " + ConstantesSql.ID + "="+evaluacionproveedorSessionBean.getlidClienteActual();
					}
				} else {
					finalQueryGlobalCliente="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				evaluacionproveedorReturnGeneral=evaluacionproveedorLogic.cargarCombosLoteForeignKeyEvaluacionProveedor(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalEjercicio,finalQueryGlobalPeriodo,finalQueryGlobalCliente);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=evaluacionproveedorReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=evaluacionproveedorReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalEjercicio.equals("NONE")) {
				this.ejerciciosForeignKey=evaluacionproveedorReturnGeneral.getejerciciosForeignKey();
			}

			if(!finalQueryGlobalPeriodo.equals("NONE")) {
				this.periodosForeignKey=evaluacionproveedorReturnGeneral.getperiodosForeignKey();
			}

			if(!finalQueryGlobalCliente.equals("NONE")) {
				this.clientesForeignKey=evaluacionproveedorReturnGeneral.getclientesForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEvaluacionProveedor()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyPeriodo();
			this.addItemDefectoCombosForeignKeyCliente();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.evaluacionproveedorSessionBean==null) {
				this.evaluacionproveedorSessionBean=new EvaluacionProveedorSessionBean();
			}

			if(!this.evaluacionproveedorSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.evaluacionproveedorSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.evaluacionproveedorSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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

	public void addItemDefectoCombosForeignKeyPeriodo()throws Exception {
		try {

			if(!this.evaluacionproveedorSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
				Periodo periodo=new Periodo();
				PeriodoConstantesFunciones.setPeriodoDescripcion(periodo,Constantes.SMENSAJE_ESCOJA_OPCION);
				periodo.setId(null);

				if(!PeriodoConstantesFunciones.ExisteEnLista(this.periodosForeignKey,periodo,true)) {

					this.periodosForeignKey.add(0,periodo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCliente()throws Exception {
		try {

			if(!this.evaluacionproveedorSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
				Cliente cliente=new Cliente();
				ClienteConstantesFunciones.setClienteDescripcion(cliente,Constantes.SMENSAJE_ESCOJA_OPCION);
				cliente.setId(null);

				if(!ClienteConstantesFunciones.ExisteEnLista(this.clientesForeignKey,cliente,true)) {

					this.clientesForeignKey.add(0,cliente);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyEvaluacionProveedor()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEvaluacionProveedor(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEvaluacionProveedor()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
				this.setActualEjercicioForeignKey(this.parametroGeneralUsuario.getid_ejercicio(),false,"Formulario");
				this.setActualPeriodoForeignKey(this.parametroGeneralUsuario.getid_periodo(),false,"Formulario");
			
			
				this.evaluacionproveedor.setfecha(this.parametroGeneralUsuario.getfecha_sistema());
				this.evaluacionproveedor.setfecha_desde(this.parametroGeneralUsuario.getfecha_sistema());
				this.evaluacionproveedor.setfecha_hasta(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEvaluacionProveedor();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEvaluacionProveedor(EvaluacionProveedor evaluacionproveedor)throws Exception {	
		try {
			
			this.setActualClienteForeignKey(evaluacionproveedor.getid_cliente(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEvaluacionProveedor(EvaluacionProveedor evaluacionproveedor,String sTipoEvento)throws Exception {	
		try {
			
			

				if(evaluacionproveedor.getCliente()!=null && !sTipoEvento.equals("id_clienteEvaluacionProveedor")) { //sTipoEvento Evita Bucle Infinito

					this.clientesForeignKey=new ArrayList<Cliente>();
					this.clientesForeignKey.add(evaluacionproveedor.getCliente());

					this.addItemDefectoCombosForeignKeyCliente();
					this.cargarCombosFrameClientesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEvaluacionProveedor()throws Exception {	
		try {
			
			this.setActualClienteForeignKey(this.evaluacionproveedorConstantesFunciones.getid_cliente(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEvaluacionProveedor()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_ejercicioEvaluacionProveedor.getSelectedItem();
				}

				if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) {
					Periodo periodoActual=(Periodo)this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_periodoEvaluacionProveedor.getSelectedItem();
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEvaluacionProveedor()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEvaluacionProveedor()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEvaluacionProveedor()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEvaluacionProveedor()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFramePeriodosForeignKey("Todos");
			this.cargarCombosFrameClientesForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEvaluacionProveedor(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePeriodosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEvaluacionProveedor()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_empresaEvaluacionProveedor!=null && this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_empresaEvaluacionProveedor.getItemCount()>0) {
				this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_empresaEvaluacionProveedor.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_sucursalEvaluacionProveedor!=null && this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_sucursalEvaluacionProveedor.getItemCount()>0) {
				this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_sucursalEvaluacionProveedor.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_ejercicioEvaluacionProveedor!=null && this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_ejercicioEvaluacionProveedor.getItemCount()>0) {
				this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_ejercicioEvaluacionProveedor.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_periodoEvaluacionProveedor!=null && this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_periodoEvaluacionProveedor.getItemCount()>0) {
				this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_periodoEvaluacionProveedor.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_clienteEvaluacionProveedor!=null && this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_clienteEvaluacionProveedor.getItemCount()>0) {
				this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_clienteEvaluacionProveedor.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	










	
	

	public EvaluacionProveedorBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EvaluacionProveedorBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EvaluacionProveedorBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.evaluacionproveedorSessionBean=new EvaluacionProveedorSessionBean(); 
		this.evaluacionproveedorConstantesFunciones=new EvaluacionProveedorConstantesFunciones(); 
		this.evaluacionproveedorBean=new EvaluacionProveedor();//(this.evaluacionproveedorConstantesFunciones); 		
		this.evaluacionproveedorReturnGeneral=new EvaluacionProveedorParameterReturnGeneral(); 
		
		this.evaluacionproveedorSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.evaluacionproveedorSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EvaluacionProveedorBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EvaluacionProveedorBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EvaluacionProveedorBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEvaluacionProveedor(true);
			
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
			
			this.evaluacionproveedorConstantesFunciones=new EvaluacionProveedorConstantesFunciones(); 
			this.evaluacionproveedorBean=new EvaluacionProveedor();//this.evaluacionproveedorConstantesFunciones); 			
			this.evaluacionproveedorReturnGeneral=new EvaluacionProveedorParameterReturnGeneral(); 
		
			EvaluacionProveedorBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Evaluacion Proveedor Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.evaluacionproveedor=new EvaluacionProveedor();
			this.evaluacionproveedors = new ArrayList<EvaluacionProveedor>();
			this.evaluacionproveedorsAux = new ArrayList<EvaluacionProveedor>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic=new EvaluacionProveedorLogic();
				this.evaluacionproveedorLogic.getNewConnexionToDeep("");
			}
			
			//this.evaluacionproveedorSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.evaluacionproveedorSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEvaluacionProveedor);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEvaluacionProveedor!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEvaluacionProveedor);	
					}
					
					if(this.jInternalFrameImportacionEvaluacionProveedor!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEvaluacionProveedor);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEvaluacionProveedor!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEvaluacionProveedor);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEvaluacionProveedor);
				this.jInternalFrameDetalleFormEvaluacionProveedor.setVisible(false);
				this.jInternalFrameDetalleFormEvaluacionProveedor.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEvaluacionProveedor!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEvaluacionProveedor);
					this.jInternalFrameReporteDinamicoEvaluacionProveedor.setVisible(false);
					this.jInternalFrameReporteDinamicoEvaluacionProveedor.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEvaluacionProveedor!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEvaluacionProveedor);
					this.jInternalFrameImportacionEvaluacionProveedor.setVisible(false);
					this.jInternalFrameImportacionEvaluacionProveedor.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEvaluacionProveedor!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEvaluacionProveedor);
					this.jInternalFrameOrderByEvaluacionProveedor.setVisible(false);
					this.jInternalFrameOrderByEvaluacionProveedor.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEvaluacionProveedorActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EvaluacionProveedorConstantesFunciones.INUMEROPAGINACION;
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
			
			this.evaluacionproveedorReturnGeneral=new EvaluacionProveedorParameterReturnGeneral();
			
			this.evaluacionproveedorParameterGeneral=new EvaluacionProveedorParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.evaluacionproveedorLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.evaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EvaluacionProveedorJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.evaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(DetalleEvaluacionProveedorConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EvaluacionProveedorConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.evaluacionproveedorSessionBean.getEsGuardarRelacionado(),this.evaluacionproveedorSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EvaluacionProveedorConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.evaluacionproveedorSessionBean.getEsGuardarRelacionado(),this.evaluacionproveedorSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEvaluacionProveedor=false;
			this.isVisibilidadCeldaDuplicarEvaluacionProveedor=true;
			this.isVisibilidadCeldaCopiarEvaluacionProveedor=true;
			this.isVisibilidadCeldaVerFormEvaluacionProveedor=true;
			this.isVisibilidadCeldaOrdenEvaluacionProveedor=true;
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionProveedor=false;
			this.isVisibilidadCeldaModificarEvaluacionProveedor=false;
			this.isVisibilidadCeldaActualizarEvaluacionProveedor=false;
			this.isVisibilidadCeldaEliminarEvaluacionProveedor=false;
			this.isVisibilidadCeldaCancelarEvaluacionProveedor=false;
			this.isVisibilidadCeldaGuardarEvaluacionProveedor=false;
			this.isVisibilidadCeldaGuardarCambiosEvaluacionProveedor=false;
			
			
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdPeriodo=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEvaluacionProveedor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEvaluacionProveedor();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEvaluacionProveedor(false);
			
			this.setPermisosUsuarioEvaluacionProveedor();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.evaluacionproveedorSessionBean.getEsGuardarRelacionado() 
				|| (this.evaluacionproveedorSessionBean.getEsGuardarRelacionado() && this.evaluacionproveedorSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEvaluacionProveedorClasesRelacionadas();
			}
			
			if(this.evaluacionproveedorSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEvaluacionProveedorClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEvaluacionProveedor();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEvaluacionProveedor();
			}
			
			if(!this.isPermisoBusquedaEvaluacionProveedor) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasEvaluacionProveedor.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.evaluacionproveedorSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEvaluacionProveedor,this.isPermisoPaginacionMedioEvaluacionProveedor,this.isPermisoPaginacionTodoEvaluacionProveedor);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EvaluacionProveedorConstantesFunciones.getTiposSeleccionarEvaluacionProveedor());
				
				this.tiposColumnasSelect=EvaluacionProveedorConstantesFunciones.getTiposSeleccionarEvaluacionProveedor(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectEvaluacionProveedor();				
				//this.tiposRelacionesSelect=EvaluacionProveedorConstantesFunciones.getTiposRelacionesEvaluacionProveedor(true);
				
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
			//if(!this.evaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEvaluacionProveedor();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioEvaluacionProveedor(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioEvaluacionProveedor(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEvaluacionProveedor() ;
			
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
			
			
			this.detalleevaluacionproveedorLogic=new DetalleEvaluacionProveedorLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			this.ejercicioLogic=new EjercicioLogic();
			this.periodoLogic=new PeriodoLogic();
			this.clienteLogic=new ClienteLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				evaluacionproveedorImplementable= (EvaluacionProveedorImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EvaluacionProveedorConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				evaluacionproveedorImplementableHome= (EvaluacionProveedorImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EvaluacionProveedorConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.evaluacionproveedors= new ArrayList<EvaluacionProveedor>();
			this.evaluacionproveedorsEliminados= new ArrayList<EvaluacionProveedor>();
						
			this.isEsNuevoEvaluacionProveedor=false;
			this.esParaAccionDesdeFormularioEvaluacionProveedor=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idClienteActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			this.periodosForeignKey=new ArrayList<Periodo>() ;
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEvaluacionProveedor(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEvaluacionProveedor();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.evaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			EvaluacionProveedorBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EvaluacionProveedorConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEvaluacionProveedor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEvaluacionProveedor(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEvaluacionProveedor();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEvaluacionProveedor();
			}
			
			EvaluacionProveedorBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasEvaluacionProveedor.getTabCount(); i++) {
					this.jTabbedPaneBusquedasEvaluacionProveedor.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasEvaluacionProveedor.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEvaluacionProveedor(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EvaluacionProveedor: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEvaluacionProveedor() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEvaluacionProveedor")) {
				iIndex=this.jInternalFrameDetalleFormEvaluacionProveedor.jTabbedPaneRelacionesEvaluacionProveedor.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEvaluacionProveedor.jTabbedPaneRelacionesEvaluacionProveedor.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEvaluacionProveedor.getSelectedRow();	
				
				

				if(sTitle.equals("Detalle Evaluacion Proveedores")) {
					if(!DetalleEvaluacionProveedorJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEvaluacionProveedor();

						this.cargarParteTabPanelRelacionadaDetalleEvaluacionProveedor(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEvaluacionProveedor();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaDetalleEvaluacionProveedor(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEvaluacionProveedor.cargarSessionConBeanSwingJInternalFrameDetalleEvaluacionProveedor(false,true,iIndex);
		this.jButtonDetalleEvaluacionProveedorActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDetalleEvaluacionProveedor();

		//this.jTabbedPaneRelacionesEvaluacionProveedor.updateUI();
		//this.jTabbedPaneRelacionesEvaluacionProveedor.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEvaluacionProveedor.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("DetalleEvaluacionProveedor")) {
				int row=this.jTableDatosEvaluacionProveedor.getSelectedRow();
				jButtonDetalleEvaluacionProveedorActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.evaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Detalle Evaluacion Proveedor")) {

					if(this.isTienePermisosDetalleEvaluacionProveedor && this.evaluacionproveedorConstantesFunciones.mostrarDetalleEvaluacionProveedorEvaluacionProveedor && !EvaluacionProveedorConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Detalle Evaluacion Proveedores"+"("+DetalleEvaluacionProveedorConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Detalle Evaluacion Proveedores");

						if(evaluacionproveedorConstantesFunciones.resaltarDetalleEvaluacionProveedorEvaluacionProveedor!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(evaluacionproveedorConstantesFunciones.resaltarDetalleEvaluacionProveedorEvaluacionProveedor);
						}

						jmenuItem.setEnabled(this.evaluacionproveedorConstantesFunciones.activarDetalleEvaluacionProveedorEvaluacionProveedor);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DetalleEvaluacionProveedor"));

						

						this.jInternalFrameDetalleFormEvaluacionProveedor.jmenuDetalleEvaluacionProveedor.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyEvaluacionProveedor(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEvaluacionProveedor(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEvaluacionProveedor(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEvaluacionProveedorListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEvaluacionProveedor();
		
		this.cargarCombosFrameForeignKeyEvaluacionProveedor();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEvaluacionProveedor();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEvaluacionProveedor();
		}
	}
	
	

	public void cargarCombosForeignKeyCliente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCliente(this.clientesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoEvaluacionProveedorActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.evaluacionproveedorSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEvaluacionProveedor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.evaluacionproveedor,new Object(),this.evaluacionproveedorParameterGeneral,this.evaluacionproveedorReturnGeneral);
			
			
			if(jTableDatosEvaluacionProveedor.getRowCount()>=1) {
				jTableDatosEvaluacionProveedor.removeRowSelectionInterval(0, jTableDatosEvaluacionProveedor.getRowCount()-1);						
			}
			
			this.isEsNuevoEvaluacionProveedor=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEvaluacionProveedor(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEvaluacionProveedor(true);			
			//this.evaluacionproveedor=new EvaluacionProveedor();
			//this.evaluacionproveedor.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEvaluacionProveedor(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEvaluacionProveedor() ;
			
			if(EvaluacionProveedorJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEvaluacionProveedor(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.evaluacionproveedor);	
			this.actualizarInformacion("INFO_PADRE",false,this.evaluacionproveedor);				
			
			EvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.evaluacionproveedor,new Object(),this.evaluacionproveedorParameterGeneral,this.evaluacionproveedorReturnGeneral);
			
			if(this.evaluacionproveedorSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EvaluacionProveedor: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.evaluacionproveedor,new Object(),this.evaluacionproveedorParameterGeneral,this.evaluacionproveedorReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEvaluacionProveedorActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EvaluacionProveedor> evaluacionproveedorsSeleccionados=new ArrayList<EvaluacionProveedor>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEvaluacionProveedor.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEvaluacionProveedor.getSelectedRows().length;			
			}
			
			evaluacionproveedorsSeleccionados=this.getEvaluacionProveedorsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEvaluacionProveedor--;			
				//EvaluacionProveedor evaluacionproveedorAux= new EvaluacionProveedor();			
				//evaluacionproveedorAux.setId(this.iIdNuevoEvaluacionProveedor);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EvaluacionProveedor evaluacionproveedorOrigen=new EvaluacionProveedor();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EvaluacionProveedor evaluacionproveedorOrigen : evaluacionproveedorsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEvaluacionProveedor.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							evaluacionproveedorOrigen =(EvaluacionProveedor) this.evaluacionproveedorLogic.getEvaluacionProveedors().toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							evaluacionproveedorOrigen =(EvaluacionProveedor) this.evaluacionproveedors.toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEvaluacionProveedor();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.evaluacionproveedor.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEvaluacionProveedor(evaluacionproveedorOrigen,this.evaluacionproveedor,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionProveedor(this.evaluacionproveedor);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.evaluacionproveedorLogic.getEvaluacionProveedors().add(this.evaluacionproveedorAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.evaluacionproveedors.add(this.evaluacionproveedorAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEvaluacionProveedor(false);
				
				this.jTableDatosEvaluacionProveedor.setRowSelectionInterval(this.getIndiceNuevoEvaluacionProveedor(), this.getIndiceNuevoEvaluacionProveedor());
				
				int iLastRow =  this.jTableDatosEvaluacionProveedor.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEvaluacionProveedor.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEvaluacionProveedor.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEvaluacionProveedor(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEvaluacionProveedorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EvaluacionProveedor> evaluacionproveedorsSeleccionados=new ArrayList<EvaluacionProveedor>();									
		
			EvaluacionProveedor evaluacionproveedorOrigen=new EvaluacionProveedor();
			EvaluacionProveedor evaluacionproveedorDestino=new EvaluacionProveedor();
				
			evaluacionproveedorsSeleccionados=this.getEvaluacionProveedorsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEvaluacionProveedor.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || evaluacionproveedorsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEvaluacionProveedor.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						evaluacionproveedorOrigen =(EvaluacionProveedor) this.evaluacionproveedorLogic.getEvaluacionProveedors().toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						evaluacionproveedorOrigen =(EvaluacionProveedor) this.evaluacionproveedors.toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						evaluacionproveedorDestino =(EvaluacionProveedor) this.evaluacionproveedorLogic.getEvaluacionProveedors().toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						evaluacionproveedorDestino =(EvaluacionProveedor) this.evaluacionproveedors.toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				evaluacionproveedorOrigen =evaluacionproveedorsSeleccionados.get(0);
				evaluacionproveedorDestino =evaluacionproveedorsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEvaluacionProveedor(evaluacionproveedorOrigen,evaluacionproveedorDestino,true,false);
				
				evaluacionproveedorDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(evaluacionproveedorDestino,evaluacionproveedorLogic.getEvaluacionProveedors());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(evaluacionproveedorDestino,evaluacionproveedors);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEvaluacionProveedor(false);
				
				//this.jTableDatosEvaluacionProveedor.setRowSelectionInterval(this.getIndiceNuevoEvaluacionProveedor(), this.getIndiceNuevoEvaluacionProveedor());
				
				int iLastRow =  this.jTableDatosEvaluacionProveedor.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEvaluacionProveedor.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEvaluacionProveedor.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEvaluacionProveedor(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEvaluacionProveedorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEvaluacionProveedor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEvaluacionProveedor.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEvaluacionProveedorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEvaluacionProveedor.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasEvaluacionProveedor.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesEvaluacionProveedor.setVisible(!isVisible);
			this.jPanelPaginacionEvaluacionProveedor.setVisible(!isVisible);
			this.jPanelAccionesEvaluacionProveedor.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEvaluacionProveedorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEvaluacionProveedor();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEvaluacionProveedorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEvaluacionProveedor();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEvaluacionProveedorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEvaluacionProveedor();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEvaluacionProveedorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEvaluacionProveedor();
			
			this.abrirFrameOrderByEvaluacionProveedor();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEvaluacionProveedorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEvaluacionProveedor();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEvaluacionProveedor(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEvaluacionProveedor);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEvaluacionProveedor.isMaximum()) {
					this.jInternalFrameDetalleFormEvaluacionProveedor.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEvaluacionProveedor.setSize(this.jInternalFrameDetalleFormEvaluacionProveedor.iWidthFormulario,this.jInternalFrameDetalleFormEvaluacionProveedor.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEvaluacionProveedor.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEvaluacionProveedor.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEvaluacionProveedor.isMaximum()) {
						this.jInternalFrameDetalleFormEvaluacionProveedor.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEvaluacionProveedor.jContentPaneDetalleEvaluacionProveedor.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEvaluacionProveedor.jTabbedPaneRelacionesEvaluacionProveedor.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEvaluacionProveedor.jContentPaneDetalleEvaluacionProveedor.getWidth(),EvaluacionProveedorConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEvaluacionProveedor.jTabbedPaneRelacionesEvaluacionProveedor.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEvaluacionProveedor.jContentPaneDetalleEvaluacionProveedor.getWidth(),EvaluacionProveedorConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEvaluacionProveedor.jTabbedPaneRelacionesEvaluacionProveedor.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEvaluacionProveedor.jContentPaneDetalleEvaluacionProveedor.getWidth(),EvaluacionProveedorConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(DetalleEvaluacionProveedorJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDetalleEvaluacionProveedor();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEvaluacionProveedor.setVisible(true);
	        this.jInternalFrameDetalleFormEvaluacionProveedor.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEvaluacionProveedor() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEvaluacionProveedor==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEvaluacionProveedor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEvaluacionProveedor,false,this);
				} else {
					this.jInternalFrameOrderByEvaluacionProveedor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEvaluacionProveedor,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEvaluacionProveedor);
				this.jInternalFrameOrderByEvaluacionProveedor.setVisible(false);
				this.jInternalFrameOrderByEvaluacionProveedor.setSelected(false);
				
				this.jInternalFrameOrderByEvaluacionProveedor.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEvaluacionProveedor"));
				
				this.inicializarActualizarBindingTablaOrderByEvaluacionProveedor();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEvaluacionProveedor() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEvaluacionProveedor==null) {
				
				this.jInternalFrameImportacionEvaluacionProveedor=new ImportacionJInternalFrame(EvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEvaluacionProveedor);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEvaluacionProveedor);
				this.jInternalFrameImportacionEvaluacionProveedor.setVisible(false);
				this.jInternalFrameImportacionEvaluacionProveedor.setSelected(false);


				this.jInternalFrameImportacionEvaluacionProveedor.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEvaluacionProveedor"));
				this.jInternalFrameImportacionEvaluacionProveedor.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEvaluacionProveedor"));
				this.jInternalFrameImportacionEvaluacionProveedor.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEvaluacionProveedor"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEvaluacionProveedor() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEvaluacionProveedor==null) {
				this.jInternalFrameReporteDinamicoEvaluacionProveedor=new ReporteDinamicoJInternalFrame(EvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEvaluacionProveedor);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEvaluacionProveedor);
				this.jInternalFrameReporteDinamicoEvaluacionProveedor.setVisible(false);
				this.jInternalFrameReporteDinamicoEvaluacionProveedor.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEvaluacionProveedor.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEvaluacionProveedor"));
				this.jInternalFrameReporteDinamicoEvaluacionProveedor.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEvaluacionProveedor"));
				this.jInternalFrameReporteDinamicoEvaluacionProveedor.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEvaluacionProveedor"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEvaluacionProveedor();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaDetalleEvaluacionProveedor() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.jScrollPanelDatosDetalleEvaluacionProveedor.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEvaluacionProveedor.jContentPaneDetalleEvaluacionProveedor.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.jScrollPanelDatosDetalleEvaluacionProveedor.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.jScrollPanelDatosDetalleEvaluacionProveedor.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.jScrollPanelDatosDetalleEvaluacionProveedor.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleEvaluacionProveedor() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEvaluacionProveedor);
			
	       	this.jInternalFrameDetalleFormEvaluacionProveedor.setVisible(false);
	        this.jInternalFrameDetalleFormEvaluacionProveedor.setSelected(false);
			
			//this.jInternalFrameDetalleFormEvaluacionProveedor.dispose();
			//this.jInternalFrameDetalleFormEvaluacionProveedor=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEvaluacionProveedor() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEvaluacionProveedor.setVisible(true);
	        this.jInternalFrameReporteDinamicoEvaluacionProveedor.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEvaluacionProveedor() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEvaluacionProveedor.setVisible(true);
	        this.jInternalFrameImportacionEvaluacionProveedor.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEvaluacionProveedor() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEvaluacionProveedor.setVisible(true);
	        this.jInternalFrameOrderByEvaluacionProveedor.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEvaluacionProveedor() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEvaluacionProveedor.setVisible(false);
	        this.jInternalFrameOrderByEvaluacionProveedor.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEvaluacionProveedor() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEvaluacionProveedor.setVisible(false);
	        this.jInternalFrameReporteDinamicoEvaluacionProveedor.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEvaluacionProveedor() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEvaluacionProveedor.setVisible(false);
	        this.jInternalFrameImportacionEvaluacionProveedor.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEvaluacionProveedorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEvaluacionProveedor(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEvaluacionProveedor(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEvaluacionProveedor.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEvaluacionProveedor(true);
			//this.isEsNuevoEvaluacionProveedor=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedorLogic.getEvaluacionProveedors().toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedors.toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEvaluacionProveedor("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEvaluacionProveedor(false) ;
			
			if(evaluacionproveedorSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado() && DetalleEvaluacionProveedorJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleEvaluacionProveedorActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(EvaluacionProveedorJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEvaluacionProveedor(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEvaluacionProveedor(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEvaluacionProveedorActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEvaluacionProveedor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedorLogic.getEvaluacionProveedors().toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedors.toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEvaluacionProveedor(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEvaluacionProveedor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEvaluacionProveedor.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEvaluacionProveedor(true);
			//this.isEsNuevoEvaluacionProveedor=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedorLogic.getEvaluacionProveedors().toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedors.toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.evaluacionproveedor.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEvaluacionProveedor("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEvaluacionProveedor(false) ;
			
			if(EvaluacionProveedorJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEvaluacionProveedor(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEvaluacionProveedor(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Cliente")) {
				if(!this.evaluacionproveedorConstantesFunciones.cargarid_clienteEvaluacionProveedor) {
					this.cargarCombosClientesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingEvaluacionProveedor(false,false);
					this.cargarCombosFrameClientesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cliente (id);

				this.recargarComboTablaCliente(this.clientesForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
					
	
	public void recargarComboTablaCliente(List<Cliente> clientesForeignKey)throws Exception{
		TableColumn tableColumnCliente=this.jTableDatosEvaluacionProveedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionProveedor,EvaluacionProveedorConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEvaluacionProveedor.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_cliente (Long id) throws Exception {
		this.setActualClienteForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarEvaluacionProveedorActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEvaluacionProveedor(false);
			
			//if(!this.isEsNuevoEvaluacionProveedor) {								
				int intSelectedRow = this.jTableDatosEvaluacionProveedor.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedorLogic.getEvaluacionProveedors().toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedors.toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EvaluacionProveedorJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEvaluacionProveedor(this.evaluacionproveedor,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionProveedor(this.evaluacionproveedor);
				
			}
			
			if(this.permiteMantenimiento(this.evaluacionproveedor)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.evaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEvaluacionProveedor=true;
					this.inicializarActualizarBindingTablaEvaluacionProveedor(false);
					this.isEsNuevoEvaluacionProveedor=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEvaluacionProveedor=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEvaluacionProveedor=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEvaluacionProveedor(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEvaluacionProveedor(false);
				
				this.habilitarDeshabilitarControlesEvaluacionProveedor(false);
			
												
				
				if(EvaluacionProveedorJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEvaluacionProveedor();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEvaluacionProveedorActionPerformed(evt,evaluacionproveedorSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEvaluacionProveedor(this.evaluacionproveedor,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEvaluacionProveedor.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,evaluacionproveedorSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.evaluacionproveedor.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EvaluacionProveedor.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EvaluacionProveedor.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEvaluacionProveedorActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEvaluacionProveedor.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedorLogic.getEvaluacionProveedors().toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				this.evaluacionproveedor.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedors.toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				this.evaluacionproveedor.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.evaluacionproveedor)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.evaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EvaluacionProveedorModel) this.jTableDatosEvaluacionProveedor.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEvaluacionProveedor=true;
				this.inicializarActualizarBindingTablaEvaluacionProveedor(false);
				this.isEsNuevoEvaluacionProveedor=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEvaluacionProveedor(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEvaluacionProveedor(false);
				
				this.habilitarDeshabilitarControlesEvaluacionProveedor(false);
				
				
				
				if(EvaluacionProveedorJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEvaluacionProveedor();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEvaluacionProveedorActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEvaluacionProveedor.getRowCount()>=1) {
				jTableDatosEvaluacionProveedor.removeRowSelectionInterval(0, jTableDatosEvaluacionProveedor.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEvaluacionProveedor(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEvaluacionProveedor(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEvaluacionProveedor(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEvaluacionProveedor(false) ;
			
			this.isEsNuevoEvaluacionProveedor=false;
			
			if(EvaluacionProveedorJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEvaluacionProveedor();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEvaluacionProveedorActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEvaluacionProveedor(false);
				
				//SI ES MANUAL
				if(EvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEvaluacionProveedor();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEvaluacionProveedorActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEvaluacionProveedor--;			
			//EvaluacionProveedor evaluacionproveedorAux= new EvaluacionProveedor();			
			//evaluacionproveedorAux.setId(this.iIdNuevoEvaluacionProveedor);
			
			if(this.jInternalFrameDetalleFormEvaluacionProveedor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEvaluacionProveedor();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionProveedor(this.evaluacionproveedor);
			
			this.evaluacionproveedor.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.evaluacionproveedorLogic.getEvaluacionProveedors().add(this.evaluacionproveedorAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.evaluacionproveedors.add(this.evaluacionproveedorAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEvaluacionProveedor(false);
			
			this.jTableDatosEvaluacionProveedor.setRowSelectionInterval(this.getIndiceNuevoEvaluacionProveedor(), this.getIndiceNuevoEvaluacionProveedor());
			
			int iLastRow =  this.jTableDatosEvaluacionProveedor.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEvaluacionProveedor.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEvaluacionProveedor.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEvaluacionProveedor(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEvaluacionProveedorActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEvaluacionProveedor(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEvaluacionProveedor(false);
			
			//SI ES MANUAL
			if(EvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEvaluacionProveedor();
			}
			
			//this.abrirFrameTreeEvaluacionProveedor();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEvaluacionProveedorActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Evaluacion ProveedorES ?", "MANTENIMIENTO DE Evaluacion Proveedor", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEvaluacionProveedor.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEvaluacionProveedor();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.evaluacionproveedorReturnGeneral=evaluacionproveedorLogic.procesarImportacionEvaluacionProveedorsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.evaluacionproveedorParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEvaluacionProveedorReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEvaluacionProveedorActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEvaluacionProveedor.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEvaluacionProveedor.setFileImportacion(this.jInternalFrameImportacionEvaluacionProveedor.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEvaluacionProveedor.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEvaluacionProveedor.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEvaluacionProveedor.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEvaluacionProveedor.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEvaluacionProveedorActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EvaluacionProveedor> evaluacionproveedorsSeleccionados=new ArrayList<EvaluacionProveedor>();		

		evaluacionproveedorsSeleccionados=this.getEvaluacionProveedorsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEvaluacionProveedor.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEvaluacionProveedor.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EvaluacionProveedorBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EvaluacionProveedorBaseDesign.jrxml";
			
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
			
			this.generarReporteEvaluacionProveedors("Todos",evaluacionproveedorsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.evaluacionproveedorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Evaluacion Proveedor",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEvaluacionProveedor.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEvaluacionProveedor.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EvaluacionProveedorConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_IDEJERCICIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ejercicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ejercicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ejercicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ejercicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_IDPERIODO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Periodo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Periodo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Periodo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Periodo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_IDCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_CONTACTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntacto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntacto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntacto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntacto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_EVALUADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_aluado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_aluado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_aluado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_aluado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_RESULTADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_sultado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_sultado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_sultado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_sultado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_RESPONSABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_sponsable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_sponsable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_sponsable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_sponsable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_FECHADESDE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaDesde_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaDesde_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaDesde_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaDesde_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_FECHAHASTA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaHasta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaHasta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaHasta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaHasta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_OBSERVACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_servacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_servacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_servacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_servacion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoEvaluacionProveedor.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEvaluacionProveedor.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEvaluacionProveedor.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EvaluacionProveedorConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoria="id_ejercicio";
					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoria="id_periodo";
					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoria="id_cliente";
					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_CONTACTO:
					sNombreCampoCategoria="contacto";
					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_EVALUADO:
					sNombreCampoCategoria="evaluado";
					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_RESULTADO:
					sNombreCampoCategoria="resultado";
					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_RESPONSABLE:
					sNombreCampoCategoria="responsable";
					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_FECHADESDE:
					sNombreCampoCategoria="fecha_desde";
					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_FECHAHASTA:
					sNombreCampoCategoria="fecha_hasta";
					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_OBSERVACION:
					sNombreCampoCategoria="observacion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEvaluacionProveedor.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EvaluacionProveedorConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoriaValor="id_ejercicio";
					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoriaValor="id_periodo";
					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoriaValor="id_cliente";
					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_CONTACTO:
					sNombreCampoCategoriaValor="contacto";
					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_EVALUADO:
					sNombreCampoCategoriaValor="evaluado";
					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_RESULTADO:
					sNombreCampoCategoriaValor="resultado";
					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_RESPONSABLE:
					sNombreCampoCategoriaValor="responsable";
					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_FECHADESDE:
					sNombreCampoCategoriaValor="fecha_desde";
					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_FECHAHASTA:
					sNombreCampoCategoriaValor="fecha_hasta";
					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_OBSERVACION:
					sNombreCampoCategoriaValor="observacion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEvaluacionProveedor.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEvaluacionProveedor.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EvaluacionProveedorConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_IDEJERCICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ejercicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ejercicio");
					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_IDPERIODO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Periodo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_periodo");
					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_IDCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cliente");
					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_CONTACTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Contacto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"contacto");
					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_EVALUADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Evaluado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"evaluado");
					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_RESULTADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Resultado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"resultado");
					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_RESPONSABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Responsable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"responsable");
					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_FECHADESDE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Desde",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_desde");
					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_FECHAHASTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Hasta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_hasta");
					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_OBSERVACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Observacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"observacion");
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
	
	public void jButtonGenerarExcelReporteDinamicoEvaluacionProveedorActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EvaluacionProveedor> evaluacionproveedorsSeleccionados=new ArrayList<EvaluacionProveedor>();		
		
		evaluacionproveedorsSeleccionados=this.getEvaluacionProveedorsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"evaluacionproveedor";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EvaluacionProveedors");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEvaluacionProveedor.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEvaluacionProveedor.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EvaluacionProveedorConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionProveedorConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(EvaluacionProveedor evaluacionproveedor:evaluacionproveedorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionproveedor.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionProveedorConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(EvaluacionProveedor evaluacionproveedor:evaluacionproveedorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionproveedor.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionProveedorConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(EvaluacionProveedor evaluacionproveedor:evaluacionproveedorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionproveedor.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_IDPERIODO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionProveedorConstantesFunciones.LABEL_IDPERIODO);
					iRow++;

					for(EvaluacionProveedor evaluacionproveedor:evaluacionproveedorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionproveedor.getperiodo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionProveedorConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(EvaluacionProveedor evaluacionproveedor:evaluacionproveedorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionproveedor.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionProveedorConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(EvaluacionProveedor evaluacionproveedor:evaluacionproveedorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionproveedor.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_CONTACTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionProveedorConstantesFunciones.LABEL_CONTACTO);
					iRow++;

					for(EvaluacionProveedor evaluacionproveedor:evaluacionproveedorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionproveedor.getcontacto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_EVALUADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionProveedorConstantesFunciones.LABEL_EVALUADO);
					iRow++;

					for(EvaluacionProveedor evaluacionproveedor:evaluacionproveedorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionproveedor.getevaluado());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_RESULTADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionProveedorConstantesFunciones.LABEL_RESULTADO);
					iRow++;

					for(EvaluacionProveedor evaluacionproveedor:evaluacionproveedorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionproveedor.getresultado());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_RESPONSABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionProveedorConstantesFunciones.LABEL_RESPONSABLE);
					iRow++;

					for(EvaluacionProveedor evaluacionproveedor:evaluacionproveedorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionproveedor.getresponsable());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_FECHADESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionProveedorConstantesFunciones.LABEL_FECHADESDE);
					iRow++;

					for(EvaluacionProveedor evaluacionproveedor:evaluacionproveedorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionproveedor.getfecha_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_FECHAHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionProveedorConstantesFunciones.LABEL_FECHAHASTA);
					iRow++;

					for(EvaluacionProveedor evaluacionproveedor:evaluacionproveedorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionproveedor.getfecha_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EvaluacionProveedorConstantesFunciones.LABEL_OBSERVACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EvaluacionProveedorConstantesFunciones.LABEL_OBSERVACION);
					iRow++;

					for(EvaluacionProveedor evaluacionproveedor:evaluacionproveedorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(evaluacionproveedor.getobservacion());
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
			//	this.getFilaCabeceraExportarExcelEvaluacionProveedor(row);				
			//	iRow++;
			//}				
			
			//for(EvaluacionProveedor evaluacionproveedorAux:evaluacionproveedorsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEvaluacionProveedor(evaluacionproveedorAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.evaluacionproveedorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Evaluacion Proveedor",JOptionPane.INFORMATION_MESSAGE);
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
				this.evaluacionproveedorLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEvaluacionProveedor(false);
			
			//SI ES MANUAL
			if(EvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEvaluacionProveedor();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEvaluacionProveedorActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEvaluacionProveedor(false);
			
			//SI ES MANUAL
			if(EvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEvaluacionProveedor();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEvaluacionProveedorActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEvaluacionProveedor(false);
			
			//SI ES MANUAL
			if(EvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEvaluacionProveedor();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEvaluacionProveedor() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEvaluacionProveedor.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEvaluacionProveedor.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEvaluacionProveedor.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEvaluacionProveedor.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEvaluacionProveedor.setMinimumSize(dimensionMinimum);
		this.jTableDatosEvaluacionProveedor.setMaximumSize(dimensionMaximum);
		this.jTableDatosEvaluacionProveedor.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEvaluacionProveedor(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEvaluacionProveedor(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEvaluacionProveedor(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEvaluacionProveedor(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEvaluacionProveedor(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.evaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEvaluacionProveedor(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEvaluacionProveedor(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEvaluacionProveedor(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EvaluacionProveedorJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEvaluacionProveedor() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEvaluacionProveedor();
		
		this.inicializarActualizarBindingBotonesManualEvaluacionProveedor(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.evaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEvaluacionProveedor();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEvaluacionProveedor() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEvaluacionProveedor(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEvaluacionProveedor(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEvaluacionProveedor.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEvaluacionProveedor.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEvaluacionProveedor.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEvaluacionProveedor.jCheckBoxPostAccionNuevoEvaluacionProveedor.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEvaluacionProveedor.jCheckBoxPostAccionSinCerrarEvaluacionProveedor.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEvaluacionProveedor.jCheckBoxPostAccionSinMensajeEvaluacionProveedor.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEvaluacionProveedor.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEvaluacionProveedor.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEvaluacionProveedor.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) {
				this.jInternalFrameDetalleFormEvaluacionProveedor.jCheckBoxPostAccionNuevoEvaluacionProveedor.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEvaluacionProveedor.jCheckBoxPostAccionSinCerrarEvaluacionProveedor.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEvaluacionProveedor.jCheckBoxPostAccionSinMensajeEvaluacionProveedor.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEvaluacionProveedor.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEvaluacionProveedor.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxTiposAccionesFormularioEvaluacionProveedor.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEvaluacionProveedor.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEvaluacionProveedor!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEvaluacionProveedor.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEvaluacionProveedor.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEvaluacionProveedor.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEvaluacionProveedor.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEvaluacionProveedor.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEvaluacionProveedor!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEvaluacionProveedor.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEvaluacionProveedor.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEvaluacionProveedor.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEvaluacionProveedor(Boolean esInicializar) throws Exception {
		try	{	
			if(EvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEvaluacionProveedor(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEvaluacionProveedor() throws Exception {
		try	{
			if(EvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEvaluacionProveedor();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEvaluacionProveedor() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxTiposAccionesFormularioEvaluacionProveedor.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxTiposAccionesFormularioEvaluacionProveedor.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEvaluacionProveedor() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEvaluacionProveedor.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEvaluacionProveedor.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEvaluacionProveedor.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEvaluacionProveedor.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEvaluacionProveedor.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEvaluacionProveedor.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEvaluacionProveedor.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEvaluacionProveedor.addItem(reporte);
			}
			
			
			if(!this.evaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEvaluacionProveedor.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEvaluacionProveedor.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEvaluacionProveedor.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEvaluacionProveedor.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEvaluacionProveedor.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEvaluacionProveedor.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxTiposAccionesFormularioEvaluacionProveedor.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxTiposAccionesFormularioEvaluacionProveedor.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEvaluacionProveedor.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEvaluacionProveedor.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEvaluacionProveedor.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEvaluacionProveedor();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEvaluacionProveedor() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEvaluacionProveedor!=null) {
				this.jInternalFrameReporteDinamicoEvaluacionProveedor.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEvaluacionProveedor.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEvaluacionProveedor!=null) {
				this.jInternalFrameReporteDinamicoEvaluacionProveedor.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEvaluacionProveedor.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEvaluacionProveedor!=null) {
				
				if(this.jInternalFrameReporteDinamicoEvaluacionProveedor.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEvaluacionProveedor.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEvaluacionProveedor.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEvaluacionProveedor.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEvaluacionProveedor.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEvaluacionProveedor.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEvaluacionProveedor()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_clienteFK_IdClienteEvaluacionProveedor.getSelectedItem()!=null){this.id_clienteFK_IdCliente=((Cliente)this.jComboBoxid_clienteFK_IdClienteEvaluacionProveedor.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEvaluacionProveedor(Boolean esInicializar) throws Exception {				
		if(EvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEvaluacionProveedor();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEvaluacionProveedor() throws Exception {
		this.inicializarActualizarBindingTablaEvaluacionProveedor(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEvaluacionProveedor() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEvaluacionProveedor.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEvaluacionProveedor.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEvaluacionProveedor.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EvaluacionProveedorPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEvaluacionProveedor.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEvaluacionProveedor.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EvaluacionProveedorPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEvaluacionProveedorOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionProveedorOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EvaluacionProveedorPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEvaluacionProveedor.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEvaluacionProveedor.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EvaluacionProveedorPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEvaluacionProveedor.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEvaluacionProveedor(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=evaluacionproveedorLogic.getEvaluacionProveedors().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=evaluacionproveedors.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EvaluacionProveedorJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEvaluacionProveedor.setModel(new EvaluacionProveedorModel(this.evaluacionproveedorLogic.getEvaluacionProveedors(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEvaluacionProveedor.setModel(new EvaluacionProveedorModel(this.evaluacionproveedors,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEvaluacionProveedor!=null && this.jInternalFrameOrderByEvaluacionProveedor.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEvaluacionProveedor();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEvaluacionProveedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionProveedor,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EvaluacionProveedorPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO,evaluacionproveedorConstantesFunciones.resaltarSeleccionarEvaluacionProveedor,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO,evaluacionproveedorConstantesFunciones.resaltarSeleccionarEvaluacionProveedor,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEvaluacionProveedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionProveedor,EvaluacionProveedorConstantesFunciones.LABEL_ID));

		if(this.evaluacionproveedorConstantesFunciones.mostraridEvaluacionProveedor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EvaluacionProveedorConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.evaluacionproveedorConstantesFunciones.resaltaridEvaluacionProveedor,this.evaluacionproveedorConstantesFunciones.activaridEvaluacionProveedor,this,true,"idEvaluacionProveedor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.evaluacionproveedorConstantesFunciones.resaltaridEvaluacionProveedor,this.evaluacionproveedorConstantesFunciones.activaridEvaluacionProveedor,this,true,"idEvaluacionProveedor","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEvaluacionProveedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionProveedor,EvaluacionProveedorConstantesFunciones.LABEL_IDEMPRESA));

		if(this.evaluacionproveedorConstantesFunciones.mostrarid_empresaEvaluacionProveedor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EvaluacionProveedorConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.evaluacionproveedorConstantesFunciones.resaltarid_empresaEvaluacionProveedor,this,this.evaluacionproveedorConstantesFunciones.activarid_empresaEvaluacionProveedor));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.evaluacionproveedorConstantesFunciones.resaltarid_empresaEvaluacionProveedor,this,this.evaluacionproveedorConstantesFunciones.activarid_empresaEvaluacionProveedor,false,"id_empresaEvaluacionProveedor","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EvaluacionProveedorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEvaluacionProveedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionProveedor,EvaluacionProveedorConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.evaluacionproveedorConstantesFunciones.mostrarid_sucursalEvaluacionProveedor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EvaluacionProveedorConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.evaluacionproveedorConstantesFunciones.resaltarid_sucursalEvaluacionProveedor,this,this.evaluacionproveedorConstantesFunciones.activarid_sucursalEvaluacionProveedor));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.evaluacionproveedorConstantesFunciones.resaltarid_sucursalEvaluacionProveedor,this,this.evaluacionproveedorConstantesFunciones.activarid_sucursalEvaluacionProveedor,false,"id_sucursalEvaluacionProveedor","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EvaluacionProveedorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEvaluacionProveedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionProveedor,EvaluacionProveedorConstantesFunciones.LABEL_IDEJERCICIO));

		if(this.evaluacionproveedorConstantesFunciones.mostrarid_ejercicioEvaluacionProveedor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EvaluacionProveedorConstantesFunciones.LABEL_IDEJERCICIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EjercicioTableCell(this.ejerciciosForeignKey,this.evaluacionproveedorConstantesFunciones.resaltarid_ejercicioEvaluacionProveedor,this,this.evaluacionproveedorConstantesFunciones.activarid_ejercicioEvaluacionProveedor));
			tableColumn.setCellEditor(new EjercicioTableCell(this.ejerciciosForeignKey,this.evaluacionproveedorConstantesFunciones.resaltarid_ejercicioEvaluacionProveedor,this,this.evaluacionproveedorConstantesFunciones.activarid_ejercicioEvaluacionProveedor,false,"id_ejercicioEvaluacionProveedor","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EvaluacionProveedorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEvaluacionProveedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionProveedor,EvaluacionProveedorConstantesFunciones.LABEL_IDPERIODO));

		if(this.evaluacionproveedorConstantesFunciones.mostrarid_periodoEvaluacionProveedor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EvaluacionProveedorConstantesFunciones.LABEL_IDPERIODO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new PeriodoTableCell(this.periodosForeignKey,this.evaluacionproveedorConstantesFunciones.resaltarid_periodoEvaluacionProveedor,this,this.evaluacionproveedorConstantesFunciones.activarid_periodoEvaluacionProveedor));
			tableColumn.setCellEditor(new PeriodoTableCell(this.periodosForeignKey,this.evaluacionproveedorConstantesFunciones.resaltarid_periodoEvaluacionProveedor,this,this.evaluacionproveedorConstantesFunciones.activarid_periodoEvaluacionProveedor,false,"id_periodoEvaluacionProveedor","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EvaluacionProveedorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEvaluacionProveedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionProveedor,EvaluacionProveedorConstantesFunciones.LABEL_IDCLIENTE));

		if(this.evaluacionproveedorConstantesFunciones.mostrarid_clienteEvaluacionProveedor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EvaluacionProveedorConstantesFunciones.LABEL_IDCLIENTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ClienteTableCell(this.clientesForeignKey,this.evaluacionproveedorConstantesFunciones.resaltarid_clienteEvaluacionProveedor,this,this.evaluacionproveedorConstantesFunciones.activarid_clienteEvaluacionProveedor));
			tableColumn.setCellEditor(new ClienteTableCell(this.clientesForeignKey,this.evaluacionproveedorConstantesFunciones.resaltarid_clienteEvaluacionProveedor,this,this.evaluacionproveedorConstantesFunciones.activarid_clienteEvaluacionProveedor,true,"id_clienteEvaluacionProveedor","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new EvaluacionProveedorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEvaluacionProveedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionProveedor,EvaluacionProveedorConstantesFunciones.LABEL_FECHA));

		if(this.evaluacionproveedorConstantesFunciones.mostrarfechaEvaluacionProveedor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EvaluacionProveedorConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.evaluacionproveedorConstantesFunciones.resaltarfechaEvaluacionProveedor,this.evaluacionproveedorConstantesFunciones.activarfechaEvaluacionProveedor,this,true,"fechaEvaluacionProveedor","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.evaluacionproveedorConstantesFunciones.resaltarfechaEvaluacionProveedor,this.evaluacionproveedorConstantesFunciones.activarfechaEvaluacionProveedor,this,true,"fechaEvaluacionProveedor","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new EvaluacionProveedorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEvaluacionProveedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionProveedor,EvaluacionProveedorConstantesFunciones.LABEL_CONTACTO));

		if(this.evaluacionproveedorConstantesFunciones.mostrarcontactoEvaluacionProveedor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EvaluacionProveedorConstantesFunciones.LABEL_CONTACTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.evaluacionproveedorConstantesFunciones.resaltarcontactoEvaluacionProveedor,this.evaluacionproveedorConstantesFunciones.activarcontactoEvaluacionProveedor,this,true,"contactoEvaluacionProveedor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.evaluacionproveedorConstantesFunciones.resaltarcontactoEvaluacionProveedor,this.evaluacionproveedorConstantesFunciones.activarcontactoEvaluacionProveedor,this,true,"contactoEvaluacionProveedor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EvaluacionProveedorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEvaluacionProveedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionProveedor,EvaluacionProveedorConstantesFunciones.LABEL_EVALUADO));

		if(this.evaluacionproveedorConstantesFunciones.mostrarevaluadoEvaluacionProveedor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EvaluacionProveedorConstantesFunciones.LABEL_EVALUADO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.evaluacionproveedorConstantesFunciones.resaltarevaluadoEvaluacionProveedor,this.evaluacionproveedorConstantesFunciones.activarevaluadoEvaluacionProveedor,this,true,"evaluadoEvaluacionProveedor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.evaluacionproveedorConstantesFunciones.resaltarevaluadoEvaluacionProveedor,this.evaluacionproveedorConstantesFunciones.activarevaluadoEvaluacionProveedor,this,true,"evaluadoEvaluacionProveedor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EvaluacionProveedorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEvaluacionProveedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionProveedor,EvaluacionProveedorConstantesFunciones.LABEL_RESULTADO));

		if(this.evaluacionproveedorConstantesFunciones.mostrarresultadoEvaluacionProveedor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EvaluacionProveedorConstantesFunciones.LABEL_RESULTADO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.evaluacionproveedorConstantesFunciones.resaltarresultadoEvaluacionProveedor,this.evaluacionproveedorConstantesFunciones.activarresultadoEvaluacionProveedor,this,true,"resultadoEvaluacionProveedor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.evaluacionproveedorConstantesFunciones.resaltarresultadoEvaluacionProveedor,this.evaluacionproveedorConstantesFunciones.activarresultadoEvaluacionProveedor,this,true,"resultadoEvaluacionProveedor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EvaluacionProveedorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEvaluacionProveedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionProveedor,EvaluacionProveedorConstantesFunciones.LABEL_RESPONSABLE));

		if(this.evaluacionproveedorConstantesFunciones.mostrarresponsableEvaluacionProveedor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EvaluacionProveedorConstantesFunciones.LABEL_RESPONSABLE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.evaluacionproveedorConstantesFunciones.resaltarresponsableEvaluacionProveedor,this.evaluacionproveedorConstantesFunciones.activarresponsableEvaluacionProveedor,this,true,"responsableEvaluacionProveedor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.evaluacionproveedorConstantesFunciones.resaltarresponsableEvaluacionProveedor,this.evaluacionproveedorConstantesFunciones.activarresponsableEvaluacionProveedor,this,true,"responsableEvaluacionProveedor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EvaluacionProveedorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEvaluacionProveedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionProveedor,EvaluacionProveedorConstantesFunciones.LABEL_FECHADESDE));

		if(this.evaluacionproveedorConstantesFunciones.mostrarfecha_desdeEvaluacionProveedor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EvaluacionProveedorConstantesFunciones.LABEL_FECHADESDE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.evaluacionproveedorConstantesFunciones.resaltarfecha_desdeEvaluacionProveedor,this.evaluacionproveedorConstantesFunciones.activarfecha_desdeEvaluacionProveedor,this,true,"fecha_desdeEvaluacionProveedor","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.evaluacionproveedorConstantesFunciones.resaltarfecha_desdeEvaluacionProveedor,this.evaluacionproveedorConstantesFunciones.activarfecha_desdeEvaluacionProveedor,this,true,"fecha_desdeEvaluacionProveedor","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new EvaluacionProveedorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEvaluacionProveedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionProveedor,EvaluacionProveedorConstantesFunciones.LABEL_FECHAHASTA));

		if(this.evaluacionproveedorConstantesFunciones.mostrarfecha_hastaEvaluacionProveedor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EvaluacionProveedorConstantesFunciones.LABEL_FECHAHASTA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.evaluacionproveedorConstantesFunciones.resaltarfecha_hastaEvaluacionProveedor,this.evaluacionproveedorConstantesFunciones.activarfecha_hastaEvaluacionProveedor,this,true,"fecha_hastaEvaluacionProveedor","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.evaluacionproveedorConstantesFunciones.resaltarfecha_hastaEvaluacionProveedor,this.evaluacionproveedorConstantesFunciones.activarfecha_hastaEvaluacionProveedor,this,true,"fecha_hastaEvaluacionProveedor","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new EvaluacionProveedorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEvaluacionProveedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionProveedor,EvaluacionProveedorConstantesFunciones.LABEL_OBSERVACION));

		if(this.evaluacionproveedorConstantesFunciones.mostrarobservacionEvaluacionProveedor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EvaluacionProveedorConstantesFunciones.LABEL_OBSERVACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.evaluacionproveedorConstantesFunciones.resaltarobservacionEvaluacionProveedor,this.evaluacionproveedorConstantesFunciones.activarobservacionEvaluacionProveedor,this,true,"observacionEvaluacionProveedor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.evaluacionproveedorConstantesFunciones.resaltarobservacionEvaluacionProveedor,this.evaluacionproveedorConstantesFunciones.activarobservacionEvaluacionProveedor,this,true,"observacionEvaluacionProveedor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EvaluacionProveedorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.evaluacionproveedorSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosDetalleEvaluacionProveedor && this.evaluacionproveedorConstantesFunciones.mostrarDetalleEvaluacionProveedorEvaluacionProveedor && !EvaluacionProveedorConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Detalle Evaluacion Proveedores");
				tableColumn.setHeaderValue("Detalle Evaluacion Proveedores");
				tableColumn.setCellRenderer(new DetalleEvaluacionProveedorTableCell(evaluacionproveedorConstantesFunciones.resaltarDetalleEvaluacionProveedorEvaluacionProveedor,this,this.evaluacionproveedorConstantesFunciones.activarDetalleEvaluacionProveedorEvaluacionProveedor));
				tableColumn.setCellEditor(new DetalleEvaluacionProveedorTableCell(evaluacionproveedorConstantesFunciones.resaltarDetalleEvaluacionProveedorEvaluacionProveedor,this,this.evaluacionproveedorConstantesFunciones.activarDetalleEvaluacionProveedorEvaluacionProveedor));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEvaluacionProveedor.addColumn(tableColumn);
			}
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.evaluacionproveedorSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.evaluacionproveedorSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEvaluacionProveedor.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.evaluacionproveedorSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.evaluacionproveedorSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEvaluacionProveedor.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEvaluacionProveedor && this.isPermisoGuardarCambiosEvaluacionProveedor) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.evaluacionproveedorSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.evaluacionproveedorSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEvaluacionProveedor.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.evaluacionproveedorSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false));
					tableColumn.setCellEditor(new IdTableCell(this,true,false));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosEvaluacionProveedor.addColumn(tableColumn);
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
			
			this.jTableDatosEvaluacionProveedor.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEvaluacionProveedor && this.isPermisoGuardarCambiosEvaluacionProveedor) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.evaluacionproveedorSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEvaluacionProveedor && this.isPermisoGuardarCambiosEvaluacionProveedor) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEvaluacionProveedor.moveColumn(this.jTableDatosEvaluacionProveedor.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEvaluacionProveedor.moveColumn(this.jTableDatosEvaluacionProveedor.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.evaluacionproveedorSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosEvaluacionProveedor.moveColumn(this.jTableDatosEvaluacionProveedor.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEvaluacionProveedor.moveColumn(this.jTableDatosEvaluacionProveedor.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEvaluacionProveedor.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEvaluacionProveedor.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEvaluacionProveedor,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EvaluacionProveedorJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEvaluacionProveedor.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEvaluacionProveedor.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EvaluacionProveedorJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EvaluacionProveedorJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEvaluacionProveedor.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEvaluacionProveedor.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEvaluacionProveedor.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=evaluacionproveedorLogic.getEvaluacionProveedors().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=evaluacionproveedors.size()-1;
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
		//this.jTableDatosEvaluacionProveedor.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEvaluacionProveedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEvaluacionProveedor();
			
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
				
				//this.isEsNuevoEvaluacionProveedor=false;
					
				EvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.evaluacionproveedor,new Object(),this.evaluacionproveedorParameterGeneral,this.evaluacionproveedorReturnGeneral);
			
				if(this.evaluacionproveedorSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEvaluacionProveedor==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEvaluacionProveedor.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEvaluacionProveedor.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedorLogic.getEvaluacionProveedors().toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedors.toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.evaluacionproveedor.getsType().equals("DUPLICADO")
				   || this.evaluacionproveedor.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEvaluacionProveedor=true;
				
				} else {
					this.isEsNuevoEvaluacionProveedor=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.evaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
					if(this.evaluacionproveedor.getId()>=0 && !this.evaluacionproveedor.getIsNew()) {						
						this.isEsNuevoEvaluacionProveedor=false;
						
					} else {
						this.isEsNuevoEvaluacionProveedor=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEvaluacionProveedor(esRelaciones);						
				
				this.seleccionarEvaluacionProveedor(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.evaluacionproveedor.getId()<0) {
					this.isEsNuevoEvaluacionProveedor=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEvaluacionProveedor(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEvaluacionProveedor(evt,rowIndex);
				}	
				
				if(this.evaluacionproveedorSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EvaluacionProveedor: " + this.dDif); 
					}
				}								
				
				EvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.evaluacionproveedor,new Object(),this.evaluacionproveedorParameterGeneral,this.evaluacionproveedorReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEvaluacionProveedor(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.evaluacionproveedor)) {
					if(this.evaluacionproveedor.getId()>0) {
						this.evaluacionproveedor.setIsDeleted(true);
						
						this.evaluacionproveedorsEliminados.add(this.evaluacionproveedor);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.evaluacionproveedorLogic.getEvaluacionProveedors().remove(this.evaluacionproveedor);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.evaluacionproveedors.remove(this.evaluacionproveedor);				
					}
					
					
					((EvaluacionProveedorModel) this.jTableDatosEvaluacionProveedor.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEvaluacionProveedor(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEvaluacionProveedor(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEvaluacionProveedor) {
			
			if(this.jInternalFrameDetalleFormEvaluacionProveedor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEvaluacionProveedor.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEvaluacionProveedor.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedorLogic.getEvaluacionProveedors().toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedors.toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EvaluacionProveedorJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEvaluacionProveedor(this.evaluacionproveedor);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.evaluacionproveedorConstantesFunciones.cargarid_empresaEvaluacionProveedor || this.evaluacionproveedorConstantesFunciones.event_dependid_empresaEvaluacionProveedor) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.evaluacionproveedor.getid_empresa());
									//this.inicializarActualizarBindingEvaluacionProveedor(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(evaluacionproveedor.getEmpresa()!=null) {
							this.empresasForeignKey.add(evaluacionproveedor.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.evaluacionproveedor.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.evaluacionproveedorConstantesFunciones.cargarid_sucursalEvaluacionProveedor || this.evaluacionproveedorConstantesFunciones.event_dependid_sucursalEvaluacionProveedor) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.evaluacionproveedor.getid_sucursal());
									//this.inicializarActualizarBindingEvaluacionProveedor(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(evaluacionproveedor.getSucursal()!=null) {
							this.sucursalsForeignKey.add(evaluacionproveedor.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.evaluacionproveedor.getid_sucursal(),false,"Formulario");

					//Ejercicio
					if(!this.evaluacionproveedorConstantesFunciones.cargarid_ejercicioEvaluacionProveedor || this.evaluacionproveedorConstantesFunciones.event_dependid_ejercicioEvaluacionProveedor) {
						//this.cargarCombosEjerciciosForeignKeyLista(" where id="+this.evaluacionproveedor.getid_ejercicio());
									//this.inicializarActualizarBindingEvaluacionProveedor(false,false);
						this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

						if(evaluacionproveedor.getEjercicio()!=null) {
							this.ejerciciosForeignKey.add(evaluacionproveedor.getEjercicio());
						}

						this.addItemDefectoCombosForeignKeyEjercicio();
						this.cargarCombosFrameEjerciciosForeignKey("Todos");
					}
					this.setActualEjercicioForeignKey(this.evaluacionproveedor.getid_ejercicio(),false,"Formulario");

					//Periodo
					if(!this.evaluacionproveedorConstantesFunciones.cargarid_periodoEvaluacionProveedor || this.evaluacionproveedorConstantesFunciones.event_dependid_periodoEvaluacionProveedor) {
						//this.cargarCombosPeriodosForeignKeyLista(" where id="+this.evaluacionproveedor.getid_periodo());
									//this.inicializarActualizarBindingEvaluacionProveedor(false,false);
						this.periodosForeignKey=new ArrayList<Periodo>();

						if(evaluacionproveedor.getPeriodo()!=null) {
							this.periodosForeignKey.add(evaluacionproveedor.getPeriodo());
						}

						this.addItemDefectoCombosForeignKeyPeriodo();
						this.cargarCombosFramePeriodosForeignKey("Todos");
					}
					this.setActualPeriodoForeignKey(this.evaluacionproveedor.getid_periodo(),false,"Formulario");

					//Cliente
					if(!this.evaluacionproveedorConstantesFunciones.cargarid_clienteEvaluacionProveedor || this.evaluacionproveedorConstantesFunciones.event_dependid_clienteEvaluacionProveedor) {
						//this.cargarCombosClientesForeignKeyLista(" where id="+this.evaluacionproveedor.getid_cliente());
									//this.inicializarActualizarBindingEvaluacionProveedor(false,false);
						this.clientesForeignKey=new ArrayList<Cliente>();

						if(evaluacionproveedor.getCliente()!=null) {
							this.clientesForeignKey.add(evaluacionproveedor.getCliente());
						}

						this.addItemDefectoCombosForeignKeyCliente();
						this.cargarCombosFrameClientesForeignKey("Todos");
					}
					this.setActualClienteForeignKey(this.evaluacionproveedor.getid_cliente(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEvaluacionProveedor("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEvaluacionProveedor(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEvaluacionProveedor() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEvaluacionProveedor(EvaluacionProveedor evaluacionproveedor) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEvaluacionProveedor(evaluacionproveedor,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEvaluacionProveedor(EvaluacionProveedor evaluacionproveedor,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEvaluacionProveedor(evaluacionproveedor);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEvaluacionProveedor(evaluacionproveedor,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEvaluacionProveedor(evaluacionproveedor);
	}
	
	public void setVariablesObjetoActualToFormularioEvaluacionProveedor(EvaluacionProveedor evaluacionproveedor) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEvaluacionProveedor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEvaluacionProveedor.jLabelidEvaluacionProveedor.setText(evaluacionproveedor.getId().toString());
			this.jInternalFrameDetalleFormEvaluacionProveedor.jDateChooserfechaEvaluacionProveedor.setDate(evaluacionproveedor.getfecha());
			this.jInternalFrameDetalleFormEvaluacionProveedor.jTextAreacontactoEvaluacionProveedor.setText(evaluacionproveedor.getcontacto());
			this.jInternalFrameDetalleFormEvaluacionProveedor.jTextAreaevaluadoEvaluacionProveedor.setText(evaluacionproveedor.getevaluado());
			this.jInternalFrameDetalleFormEvaluacionProveedor.jTextArearesultadoEvaluacionProveedor.setText(evaluacionproveedor.getresultado());
			this.jInternalFrameDetalleFormEvaluacionProveedor.jTextArearesponsableEvaluacionProveedor.setText(evaluacionproveedor.getresponsable());
			this.jInternalFrameDetalleFormEvaluacionProveedor.jDateChooserfecha_desdeEvaluacionProveedor.setDate(evaluacionproveedor.getfecha_desde());
			this.jInternalFrameDetalleFormEvaluacionProveedor.jDateChooserfecha_hastaEvaluacionProveedor.setDate(evaluacionproveedor.getfecha_hasta());
			this.jInternalFrameDetalleFormEvaluacionProveedor.jTextAreaobservacionEvaluacionProveedor.setText(evaluacionproveedor.getobservacion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EvaluacionProveedor evaluacionproveedorLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,evaluacionproveedorLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EvaluacionProveedor evaluacionproveedorLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				evaluacionproveedorLocal=this.evaluacionproveedor;
			} else {
				evaluacionproveedorLocal=this.evaluacionproveedorAnterior;
			}
		}
		
		if(this.permiteMantenimiento(evaluacionproveedorLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEvaluacionProveedor(evaluacionproveedorLocal,true);
					
					if(evaluacionproveedorSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(evaluacionproveedorLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.evaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(evaluacionproveedorLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEvaluacionProveedor(EvaluacionProveedor evaluacionproveedor,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEvaluacionProveedor(evaluacionproveedor,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionProveedor(evaluacionproveedor);
	}
	
	public void setVariablesFormularioToObjetoActualEvaluacionProveedor(EvaluacionProveedor evaluacionproveedor,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEvaluacionProveedor(evaluacionproveedor,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEvaluacionProveedor(EvaluacionProveedor evaluacionproveedor,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEvaluacionProveedor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEvaluacionProveedor.jLabelidEvaluacionProveedor.getText()==null || this.jInternalFrameDetalleFormEvaluacionProveedor.jLabelidEvaluacionProveedor.getText()=="" || this.jInternalFrameDetalleFormEvaluacionProveedor.jLabelidEvaluacionProveedor.getText()=="Id") {
				this.jInternalFrameDetalleFormEvaluacionProveedor.jLabelidEvaluacionProveedor.setText("0");
			}

			if(conColumnasBase) {evaluacionproveedor.setId(Long.parseLong(this.jInternalFrameDetalleFormEvaluacionProveedor.jLabelidEvaluacionProveedor.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EvaluacionProveedorConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionProveedor.jLabelIdEvaluacionProveedor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			evaluacionproveedor.setfecha(this.jInternalFrameDetalleFormEvaluacionProveedor.jDateChooserfechaEvaluacionProveedor.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EvaluacionProveedorConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionProveedor.jLabelfechaEvaluacionProveedor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			evaluacionproveedor.setcontacto(this.jInternalFrameDetalleFormEvaluacionProveedor.jTextAreacontactoEvaluacionProveedor.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EvaluacionProveedorConstantesFunciones.LABEL_CONTACTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionProveedor.jLabelcontactoEvaluacionProveedor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			evaluacionproveedor.setevaluado(this.jInternalFrameDetalleFormEvaluacionProveedor.jTextAreaevaluadoEvaluacionProveedor.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EvaluacionProveedorConstantesFunciones.LABEL_EVALUADO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionProveedor.jLabelevaluadoEvaluacionProveedor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			evaluacionproveedor.setresultado(this.jInternalFrameDetalleFormEvaluacionProveedor.jTextArearesultadoEvaluacionProveedor.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EvaluacionProveedorConstantesFunciones.LABEL_RESULTADO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionProveedor.jLabelresultadoEvaluacionProveedor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			evaluacionproveedor.setresponsable(this.jInternalFrameDetalleFormEvaluacionProveedor.jTextArearesponsableEvaluacionProveedor.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EvaluacionProveedorConstantesFunciones.LABEL_RESPONSABLE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionProveedor.jLabelresponsableEvaluacionProveedor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			evaluacionproveedor.setfecha_desde(this.jInternalFrameDetalleFormEvaluacionProveedor.jDateChooserfecha_desdeEvaluacionProveedor.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EvaluacionProveedorConstantesFunciones.LABEL_FECHADESDE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionProveedor.jLabelfecha_desdeEvaluacionProveedor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			evaluacionproveedor.setfecha_hasta(this.jInternalFrameDetalleFormEvaluacionProveedor.jDateChooserfecha_hastaEvaluacionProveedor.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EvaluacionProveedorConstantesFunciones.LABEL_FECHAHASTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionProveedor.jLabelfecha_hastaEvaluacionProveedor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			evaluacionproveedor.setobservacion(this.jInternalFrameDetalleFormEvaluacionProveedor.jTextAreaobservacionEvaluacionProveedor.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EvaluacionProveedorConstantesFunciones.LABEL_OBSERVACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEvaluacionProveedor.jLabelobservacionEvaluacionProveedor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEvaluacionProveedor(EvaluacionProveedor evaluacionproveedorBean,EvaluacionProveedor evaluacionproveedor,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && evaluacionproveedorBean.getid_cliente()!=null && !evaluacionproveedorBean.getid_cliente().equals(-1L))) {evaluacionproveedor.setid_cliente(evaluacionproveedorBean.getid_cliente());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEvaluacionProveedor(EvaluacionProveedor evaluacionproveedorOrigen,EvaluacionProveedor evaluacionproveedor,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && evaluacionproveedorOrigen.getId()!=null && !evaluacionproveedorOrigen.getId().equals(0L))) {evaluacionproveedor.setId(evaluacionproveedorOrigen.getId());}}
			if(conDefault || (!conDefault && evaluacionproveedorOrigen.getid_cliente()!=null && !evaluacionproveedorOrigen.getid_cliente().equals(-1L))) {evaluacionproveedor.setid_cliente(evaluacionproveedorOrigen.getid_cliente());}
			if(conDefault || (!conDefault && evaluacionproveedorOrigen.getfecha()!=null && !evaluacionproveedorOrigen.getfecha().equals(new Date()))) {evaluacionproveedor.setfecha(evaluacionproveedorOrigen.getfecha());}
			if(conDefault || (!conDefault && evaluacionproveedorOrigen.getcontacto()!=null && !evaluacionproveedorOrigen.getcontacto().equals(""))) {evaluacionproveedor.setcontacto(evaluacionproveedorOrigen.getcontacto());}
			if(conDefault || (!conDefault && evaluacionproveedorOrigen.getevaluado()!=null && !evaluacionproveedorOrigen.getevaluado().equals(""))) {evaluacionproveedor.setevaluado(evaluacionproveedorOrigen.getevaluado());}
			if(conDefault || (!conDefault && evaluacionproveedorOrigen.getresultado()!=null && !evaluacionproveedorOrigen.getresultado().equals(""))) {evaluacionproveedor.setresultado(evaluacionproveedorOrigen.getresultado());}
			if(conDefault || (!conDefault && evaluacionproveedorOrigen.getresponsable()!=null && !evaluacionproveedorOrigen.getresponsable().equals(""))) {evaluacionproveedor.setresponsable(evaluacionproveedorOrigen.getresponsable());}
			if(conDefault || (!conDefault && evaluacionproveedorOrigen.getfecha_desde()!=null && !evaluacionproveedorOrigen.getfecha_desde().equals(new Date()))) {evaluacionproveedor.setfecha_desde(evaluacionproveedorOrigen.getfecha_desde());}
			if(conDefault || (!conDefault && evaluacionproveedorOrigen.getfecha_hasta()!=null && !evaluacionproveedorOrigen.getfecha_hasta().equals(new Date()))) {evaluacionproveedor.setfecha_hasta(evaluacionproveedorOrigen.getfecha_hasta());}
			if(conDefault || (!conDefault && evaluacionproveedorOrigen.getobservacion()!=null && !evaluacionproveedorOrigen.getobservacion().equals(""))) {evaluacionproveedor.setobservacion(evaluacionproveedorOrigen.getobservacion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEvaluacionProveedor(EvaluacionProveedor evaluacionproveedor) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEvaluacionProveedor.jLabelidEvaluacionProveedor.setText(evaluacionproveedor.getId().toString());
			this.jInternalFrameDetalleFormEvaluacionProveedor.jDateChooserfechaEvaluacionProveedor.setDate(evaluacionproveedor.getfecha());
			this.jInternalFrameDetalleFormEvaluacionProveedor.jTextAreacontactoEvaluacionProveedor.setText(evaluacionproveedor.getcontacto());
			this.jInternalFrameDetalleFormEvaluacionProveedor.jTextAreaevaluadoEvaluacionProveedor.setText(evaluacionproveedor.getevaluado());
			this.jInternalFrameDetalleFormEvaluacionProveedor.jTextArearesultadoEvaluacionProveedor.setText(evaluacionproveedor.getresultado());
			this.jInternalFrameDetalleFormEvaluacionProveedor.jTextArearesponsableEvaluacionProveedor.setText(evaluacionproveedor.getresponsable());
			this.jInternalFrameDetalleFormEvaluacionProveedor.jDateChooserfecha_desdeEvaluacionProveedor.setDate(evaluacionproveedor.getfecha_desde());
			this.jInternalFrameDetalleFormEvaluacionProveedor.jDateChooserfecha_hastaEvaluacionProveedor.setDate(evaluacionproveedor.getfecha_hasta());
			this.jInternalFrameDetalleFormEvaluacionProveedor.jTextAreaobservacionEvaluacionProveedor.setText(evaluacionproveedor.getobservacion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEvaluacionProveedor(EvaluacionProveedorBean evaluacionproveedorBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEvaluacionProveedor.jLabelidEvaluacionProveedor.setText(evaluacionproveedorBean.getId().toString());
			this.jInternalFrameDetalleFormEvaluacionProveedor.jDateChooserfechaEvaluacionProveedor.setDate(evaluacionproveedorBean.getfecha());
			this.jInternalFrameDetalleFormEvaluacionProveedor.jTextAreacontactoEvaluacionProveedor.setText(evaluacionproveedorBean.getcontacto());
			this.jInternalFrameDetalleFormEvaluacionProveedor.jTextAreaevaluadoEvaluacionProveedor.setText(evaluacionproveedorBean.getevaluado());
			this.jInternalFrameDetalleFormEvaluacionProveedor.jTextArearesultadoEvaluacionProveedor.setText(evaluacionproveedorBean.getresultado());
			this.jInternalFrameDetalleFormEvaluacionProveedor.jTextArearesponsableEvaluacionProveedor.setText(evaluacionproveedorBean.getresponsable());
			this.jInternalFrameDetalleFormEvaluacionProveedor.jDateChooserfecha_desdeEvaluacionProveedor.setDate(evaluacionproveedorBean.getfecha_desde());
			this.jInternalFrameDetalleFormEvaluacionProveedor.jDateChooserfecha_hastaEvaluacionProveedor.setDate(evaluacionproveedorBean.getfecha_hasta());
			this.jInternalFrameDetalleFormEvaluacionProveedor.jTextAreaobservacionEvaluacionProveedor.setText(evaluacionproveedorBean.getobservacion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEvaluacionProveedor(EvaluacionProveedorParameterReturnGeneral evaluacionproveedorReturnGeneral,EvaluacionProveedorBean evaluacionproveedorBean,Boolean conDefault) throws Exception { 
		try {
			EvaluacionProveedor evaluacionproveedorLocal=new EvaluacionProveedor();
			
			evaluacionproveedorLocal=evaluacionproveedorReturnGeneral.getEvaluacionProveedor();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && evaluacionproveedorLocal.getId()!=null && !evaluacionproveedorLocal.getId().equals(0L))) {evaluacionproveedorBean.setId(evaluacionproveedorLocal.getId());}}
			if(conDefault || (!conDefault && evaluacionproveedorLocal.getid_cliente()!=null && !evaluacionproveedorLocal.getid_cliente().equals(-1L))) {evaluacionproveedorBean.setid_cliente(evaluacionproveedorLocal.getid_cliente());}
			if(conDefault || (!conDefault && evaluacionproveedorLocal.getfecha()!=null && !evaluacionproveedorLocal.getfecha().equals(new Date()))) {evaluacionproveedorBean.setfecha(evaluacionproveedorLocal.getfecha());}
			if(conDefault || (!conDefault && evaluacionproveedorLocal.getcontacto()!=null && !evaluacionproveedorLocal.getcontacto().equals(""))) {evaluacionproveedorBean.setcontacto(evaluacionproveedorLocal.getcontacto());}
			if(conDefault || (!conDefault && evaluacionproveedorLocal.getevaluado()!=null && !evaluacionproveedorLocal.getevaluado().equals(""))) {evaluacionproveedorBean.setevaluado(evaluacionproveedorLocal.getevaluado());}
			if(conDefault || (!conDefault && evaluacionproveedorLocal.getresultado()!=null && !evaluacionproveedorLocal.getresultado().equals(""))) {evaluacionproveedorBean.setresultado(evaluacionproveedorLocal.getresultado());}
			if(conDefault || (!conDefault && evaluacionproveedorLocal.getresponsable()!=null && !evaluacionproveedorLocal.getresponsable().equals(""))) {evaluacionproveedorBean.setresponsable(evaluacionproveedorLocal.getresponsable());}
			if(conDefault || (!conDefault && evaluacionproveedorLocal.getfecha_desde()!=null && !evaluacionproveedorLocal.getfecha_desde().equals(new Date()))) {evaluacionproveedorBean.setfecha_desde(evaluacionproveedorLocal.getfecha_desde());}
			if(conDefault || (!conDefault && evaluacionproveedorLocal.getfecha_hasta()!=null && !evaluacionproveedorLocal.getfecha_hasta().equals(new Date()))) {evaluacionproveedorBean.setfecha_hasta(evaluacionproveedorLocal.getfecha_hasta());}
			if(conDefault || (!conDefault && evaluacionproveedorLocal.getobservacion()!=null && !evaluacionproveedorLocal.getobservacion().equals(""))) {evaluacionproveedorBean.setobservacion(evaluacionproveedorLocal.getobservacion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEvaluacionProveedorGenerico(Long idEvaluacionProveedorSeleccionado,JComboBox jComboBoxEvaluacionProveedor,List<EvaluacionProveedor> evaluacionproveedorsLocal)throws Exception {
		try {
			EvaluacionProveedor  evaluacionproveedorTemp=null;

			for(EvaluacionProveedor evaluacionproveedorAux:evaluacionproveedorsLocal) {
				if(evaluacionproveedorAux.getId()!=null && evaluacionproveedorAux.getId().equals(idEvaluacionProveedorSeleccionado)) {
					evaluacionproveedorTemp=evaluacionproveedorAux;
					break;
				}
			}

			jComboBoxEvaluacionProveedor.setSelectedItem(evaluacionproveedorTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEvaluacionProveedorGenerico(JComboBox jComboBoxEvaluacionProveedor,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEvaluacionProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEvaluacionProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEvaluacionProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEvaluacionProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEvaluacionProveedor.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEvaluacionProveedor.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEvaluacionProveedor.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEvaluacionProveedor.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEvaluacionProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEvaluacionProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("DetalleEvaluacionProveedor")) {
			jButtonDetalleEvaluacionProveedorActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			evaluacionproveedor=(EvaluacionProveedor) evaluacionproveedorLogic.getEvaluacionProveedors().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			evaluacionproveedor =(EvaluacionProveedor) evaluacionproveedors.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!evaluacionproveedor.getIsNew() && !evaluacionproveedor.getIsChanged() && !evaluacionproveedor.getIsDeleted()) {
				sDescripcion=evaluacionproveedor.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=evaluacionproveedor.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!evaluacionproveedor.getIsNew() && !evaluacionproveedor.getIsChanged() && !evaluacionproveedor.getIsDeleted()) {
				sDescripcion=evaluacionproveedor.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=evaluacionproveedor.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!evaluacionproveedor.getIsNew() && !evaluacionproveedor.getIsChanged() && !evaluacionproveedor.getIsDeleted()) {
				sDescripcion=evaluacionproveedor.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=evaluacionproveedor.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("Periodo")) {
			//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
			if(!evaluacionproveedor.getIsNew() && !evaluacionproveedor.getIsChanged() && !evaluacionproveedor.getIsDeleted()) {
				sDescripcion=evaluacionproveedor.getperiodo_descripcion();
			} else {
				//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
				sDescripcion=evaluacionproveedor.getperiodo_descripcion();
			}
		}

		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!evaluacionproveedor.getIsNew() && !evaluacionproveedor.getIsChanged() && !evaluacionproveedor.getIsDeleted()) {
				sDescripcion=evaluacionproveedor.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=evaluacionproveedor.getcliente_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EvaluacionProveedor evaluacionproveedorRow=new EvaluacionProveedor();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			evaluacionproveedorRow=(EvaluacionProveedor) evaluacionproveedorLogic.getEvaluacionProveedors().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			evaluacionproveedorRow=(EvaluacionProveedor) evaluacionproveedors.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonDetalleEvaluacionProveedorActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EvaluacionProveedor evaluacionproveedor) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEvaluacionProveedor==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionproveedor = (EvaluacionProveedor)this.evaluacionproveedorLogic.getEvaluacionProveedors().toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.evaluacionproveedor = (EvaluacionProveedor)this.evaluacionproveedors.toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(evaluacionproveedor!=null) {
						this.evaluacionproveedor = evaluacionproveedor;
					} else {
						this.evaluacionproveedor = new EvaluacionProveedor();
					}
				}

				if(this.isTienePermisosDetalleEvaluacionProveedor && this.permiteMantenimiento(this.evaluacionproveedor)) {
					DetalleEvaluacionProveedorBeanSwingJInternalFrame detalleevaluacionproveedorBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFramePopup=new DetalleEvaluacionProveedorBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						detalleevaluacionproveedorBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFramePopup;
					} else {
						detalleevaluacionproveedorBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame;
					}

					List<EvaluacionProveedor> evaluacionproveedors=new ArrayList<EvaluacionProveedor>();
					evaluacionproveedors.add(this.evaluacionproveedor);
					if(!esRelacionado) {
						//detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorSessionBean.setConGuardarRelaciones(false);
						//detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					detalleevaluacionproveedorBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEvaluacionProveedor.cargarDetalleEvaluacionProveedorBeanSwingJInternalFrame(evaluacionproveedors,this.evaluacionproveedor,detalleevaluacionproveedorBeanSwingJInternalFrame,/*conInicializar,*/detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorSessionBean.getConGuardarRelaciones(),detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado());
					detalleevaluacionproveedorBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						detalleevaluacionproveedorBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleEvaluacionProveedor("no_relacionado");

						detalleevaluacionproveedorBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DetalleEvaluacionProveedorConstantesFunciones.ITAMANIOFILATABLA + (DetalleEvaluacionProveedorConstantesFunciones.ITAMANIOFILATABLA/2));

						detalleevaluacionproveedorBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEvaluacionProveedor=(TitledBorder)this.jScrollPanelDatosEvaluacionProveedor.getBorder();
						TitledBorder titledBorderDetalleEvaluacionProveedor=(TitledBorder)detalleevaluacionproveedorBeanSwingJInternalFrame.jScrollPanelDatosDetalleEvaluacionProveedor.getBorder();

						titledBorderDetalleEvaluacionProveedor.setTitle(titledBorderEvaluacionProveedor.getTitle() + " -> Detalle Evaluacion Proveedor");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,detalleevaluacionproveedorBeanSwingJInternalFrame);
						}

						detalleevaluacionproveedorBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(detalleevaluacionproveedorBeanSwingJInternalFrame);

						detalleevaluacionproveedorBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.evaluacionproveedorSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Detalle Evaluacion Proveedor",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEvaluacionProveedor(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEvaluacionProveedor.setVisible((this.isVisibilidadCeldaNuevoEvaluacionProveedor && this.isPermisoNuevoEvaluacionProveedor));			
			this.jButtonDuplicarEvaluacionProveedor.setVisible((this.isVisibilidadCeldaDuplicarEvaluacionProveedor && this.isPermisoDuplicarEvaluacionProveedor));			
			this.jButtonCopiarEvaluacionProveedor.setVisible((this.isVisibilidadCeldaCopiarEvaluacionProveedor && this.isPermisoCopiarEvaluacionProveedor));
			this.jButtonVerFormEvaluacionProveedor.setVisible((this.isVisibilidadCeldaVerFormEvaluacionProveedor && this.isPermisoVerFormEvaluacionProveedor));
			
			this.jButtonAbrirOrderByEvaluacionProveedor.setVisible((this.isVisibilidadCeldaOrdenEvaluacionProveedor && this.isPermisoOrdenEvaluacionProveedor));			
			
			this.jButtonNuevoRelacionesEvaluacionProveedor.setVisible((this.isVisibilidadCeldaNuevoRelacionesEvaluacionProveedor && this.isPermisoNuevoEvaluacionProveedor));			
			this.jButtonNuevoGuardarCambiosEvaluacionProveedor.setVisible((this.isVisibilidadCeldaNuevoEvaluacionProveedor && this.isPermisoNuevoEvaluacionProveedor && this.isPermisoGuardarCambiosEvaluacionProveedor));
			
			if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) {
			this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonModificarEvaluacionProveedor.setVisible((this.isVisibilidadCeldaModificarEvaluacionProveedor && this.isPermisoActualizarEvaluacionProveedor));	
			this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonActualizarEvaluacionProveedor.setVisible((this.isVisibilidadCeldaActualizarEvaluacionProveedor && this.isPermisoActualizarEvaluacionProveedor));	
			this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonEliminarEvaluacionProveedor.setVisible((this.isVisibilidadCeldaEliminarEvaluacionProveedor && this.isPermisoEliminarEvaluacionProveedor));
			this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonCancelarEvaluacionProveedor.setVisible(this.isVisibilidadCeldaCancelarEvaluacionProveedor);							
			this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonGuardarCambiosEvaluacionProveedor.setVisible((this.isVisibilidadCeldaGuardarEvaluacionProveedor && this.isPermisoGuardarCambiosEvaluacionProveedor));			
			
			}
						
			this.jButtonGuardarCambiosTablaEvaluacionProveedor.setVisible((this.isVisibilidadCeldaGuardarCambiosEvaluacionProveedor && this.isPermisoGuardarCambiosEvaluacionProveedor));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEvaluacionProveedor.setVisible((this.isVisibilidadCeldaNuevoEvaluacionProveedor && this.isPermisoNuevoEvaluacionProveedor));						
			this.jButtonDuplicarToolBarEvaluacionProveedor.setVisible((this.isVisibilidadCeldaDuplicarEvaluacionProveedor && this.isPermisoDuplicarEvaluacionProveedor));						
			this.jButtonCopiarToolBarEvaluacionProveedor.setVisible((this.isVisibilidadCeldaCopiarEvaluacionProveedor && this.isPermisoCopiarEvaluacionProveedor));			
			this.jButtonVerFormToolBarEvaluacionProveedor.setVisible((this.isVisibilidadCeldaVerFormEvaluacionProveedor && this.isPermisoVerFormEvaluacionProveedor));			
			this.jButtonAbrirOrderByToolBarEvaluacionProveedor.setVisible((this.isVisibilidadCeldaOrdenEvaluacionProveedor && this.isPermisoOrdenEvaluacionProveedor));
			this.jButtonNuevoRelacionesToolBarEvaluacionProveedor.setVisible((this.isVisibilidadCeldaNuevoRelacionesEvaluacionProveedor && this.isPermisoNuevoEvaluacionProveedor));			
			this.jButtonNuevoGuardarCambiosToolBarEvaluacionProveedor.setVisible((this.isVisibilidadCeldaNuevoEvaluacionProveedor && this.isPermisoNuevoEvaluacionProveedor && this.isPermisoGuardarCambiosEvaluacionProveedor));			
			
			if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) {
			this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonModificarToolBarEvaluacionProveedor.setVisible((this.isVisibilidadCeldaModificarEvaluacionProveedor && this.isPermisoActualizarEvaluacionProveedor));	
			this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonActualizarToolBarEvaluacionProveedor.setVisible((this.isVisibilidadCeldaActualizarEvaluacionProveedor  && this.isPermisoActualizarEvaluacionProveedor));	
			this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonEliminarToolBarEvaluacionProveedor.setVisible((this.isVisibilidadCeldaEliminarEvaluacionProveedor && this.isPermisoEliminarEvaluacionProveedor));
			this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonCancelarToolBarEvaluacionProveedor.setVisible(this.isVisibilidadCeldaCancelarEvaluacionProveedor);				
			this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonGuardarCambiosToolBarEvaluacionProveedor.setVisible((this.isVisibilidadCeldaGuardarEvaluacionProveedor && this.isPermisoGuardarCambiosEvaluacionProveedor));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEvaluacionProveedor.setVisible((this.isVisibilidadCeldaGuardarCambiosEvaluacionProveedor && this.isPermisoGuardarCambiosEvaluacionProveedor));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEvaluacionProveedor.setVisible((this.isVisibilidadCeldaNuevoEvaluacionProveedor && this.isPermisoNuevoEvaluacionProveedor));			
			this.jMenuItemDuplicarEvaluacionProveedor.setVisible((this.isVisibilidadCeldaDuplicarEvaluacionProveedor && this.isPermisoDuplicarEvaluacionProveedor));			
			this.jMenuItemCopiarEvaluacionProveedor.setVisible((this.isVisibilidadCeldaCopiarEvaluacionProveedor && this.isPermisoCopiarEvaluacionProveedor));			
			this.jMenuItemVerFormEvaluacionProveedor.setVisible((this.isVisibilidadCeldaVerFormEvaluacionProveedor && this.isPermisoVerFormEvaluacionProveedor));			
			this.jMenuItemAbrirOrderByEvaluacionProveedor.setVisible((this.isVisibilidadCeldaOrdenEvaluacionProveedor && this.isPermisoOrdenEvaluacionProveedor));			
			//this.jMenuItemMostrarOcultarEvaluacionProveedor.setVisible((this.isVisibilidadCeldaOrdenEvaluacionProveedor && this.isPermisoOrdenEvaluacionProveedor));
			this.jMenuItemDetalleAbrirOrderByEvaluacionProveedor.setVisible((this.isVisibilidadCeldaOrdenEvaluacionProveedor && this.isPermisoOrdenEvaluacionProveedor));			
			//this.jMenuItemDetalleMostrarOcultarEvaluacionProveedor.setVisible((this.isVisibilidadCeldaOrdenEvaluacionProveedor && this.isPermisoOrdenEvaluacionProveedor));			
			this.jMenuItemNuevoRelacionesEvaluacionProveedor.setVisible((this.isVisibilidadCeldaNuevoRelacionesEvaluacionProveedor && this.isPermisoNuevoEvaluacionProveedor));			
			this.jMenuItemNuevoGuardarCambiosEvaluacionProveedor.setVisible((this.isVisibilidadCeldaNuevoEvaluacionProveedor && this.isPermisoNuevoEvaluacionProveedor && this.isPermisoGuardarCambiosEvaluacionProveedor));									
			
			if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) {
			this.jInternalFrameDetalleFormEvaluacionProveedor.jMenuItemModificarEvaluacionProveedor.setVisible((this.isVisibilidadCeldaModificarEvaluacionProveedor && this.isPermisoActualizarEvaluacionProveedor));	
			this.jInternalFrameDetalleFormEvaluacionProveedor.jMenuItemActualizarEvaluacionProveedor.setVisible((this.isVisibilidadCeldaActualizarEvaluacionProveedor && this.isPermisoActualizarEvaluacionProveedor));	
			this.jInternalFrameDetalleFormEvaluacionProveedor.jMenuItemEliminarEvaluacionProveedor.setVisible((this.isVisibilidadCeldaEliminarEvaluacionProveedor && this.isPermisoEliminarEvaluacionProveedor));
			this.jInternalFrameDetalleFormEvaluacionProveedor.jMenuItemCancelarEvaluacionProveedor.setVisible(this.isVisibilidadCeldaCancelarEvaluacionProveedor);				
			}
			
			this.jMenuItemGuardarCambiosEvaluacionProveedor.setVisible((this.isVisibilidadCeldaGuardarEvaluacionProveedor && this.isPermisoGuardarCambiosEvaluacionProveedor));						
			this.jMenuItemGuardarCambiosTablaEvaluacionProveedor.setVisible((this.isVisibilidadCeldaGuardarCambiosEvaluacionProveedor && this.isPermisoGuardarCambiosEvaluacionProveedor));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEvaluacionProveedor=this.jButtonNuevoEvaluacionProveedor.isVisible();
			this.isVisibilidadCeldaDuplicarEvaluacionProveedor=this.jButtonDuplicarEvaluacionProveedor.isVisible();
			this.isVisibilidadCeldaCopiarEvaluacionProveedor=this.jButtonCopiarEvaluacionProveedor.isVisible();
			this.isVisibilidadCeldaVerFormEvaluacionProveedor=this.jButtonVerFormEvaluacionProveedor.isVisible();
			
			this.isVisibilidadCeldaOrdenEvaluacionProveedor=this.jButtonAbrirOrderByEvaluacionProveedor.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionProveedor=this.jButtonNuevoRelacionesEvaluacionProveedor.isVisible();
			this.isVisibilidadCeldaModificarEvaluacionProveedor=this.jButtonModificarEvaluacionProveedor.isVisible();
			
			if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) {
			this.isVisibilidadCeldaActualizarEvaluacionProveedor=this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonActualizarEvaluacionProveedor.isVisible();
			this.isVisibilidadCeldaEliminarEvaluacionProveedor=this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonEliminarEvaluacionProveedor.isVisible();
			this.isVisibilidadCeldaCancelarEvaluacionProveedor=this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonCancelarEvaluacionProveedor.isVisible();
			this.isVisibilidadCeldaGuardarEvaluacionProveedor=this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonGuardarCambiosEvaluacionProveedor.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEvaluacionProveedor=this.jButtonGuardarCambiosTablaEvaluacionProveedor.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEvaluacionProveedor=this.jButtonNuevoToolBarEvaluacionProveedor.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionProveedor=this.jButtonNuevoRelacionesToolBarEvaluacionProveedor.isVisible();
			
			if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) {
			this.isVisibilidadCeldaModificarEvaluacionProveedor=this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonModificarToolBarEvaluacionProveedor.isVisible();
			this.isVisibilidadCeldaActualizarEvaluacionProveedor=this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonActualizarToolBarEvaluacionProveedor.isVisible();
			this.isVisibilidadCeldaEliminarEvaluacionProveedor=this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonEliminarToolBarEvaluacionProveedor.isVisible();
			this.isVisibilidadCeldaCancelarEvaluacionProveedor=this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonCancelarToolBarEvaluacionProveedor.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEvaluacionProveedor=this.jButtonGuardarCambiosToolBarEvaluacionProveedor.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEvaluacionProveedor=this.jButtonGuardarCambiosTablaToolBarEvaluacionProveedor.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEvaluacionProveedor=this.jMenuItemNuevoEvaluacionProveedor.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionProveedor=this.jMenuItemNuevoRelacionesEvaluacionProveedor.isVisible();
			
			if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) {
			this.isVisibilidadCeldaModificarEvaluacionProveedor=this.jInternalFrameDetalleFormEvaluacionProveedor.jMenuItemModificarEvaluacionProveedor.isVisible();
			this.isVisibilidadCeldaActualizarEvaluacionProveedor=this.jInternalFrameDetalleFormEvaluacionProveedor.jMenuItemActualizarEvaluacionProveedor.isVisible();
			this.isVisibilidadCeldaEliminarEvaluacionProveedor=this.jInternalFrameDetalleFormEvaluacionProveedor.jMenuItemEliminarEvaluacionProveedor.isVisible();
			this.isVisibilidadCeldaCancelarEvaluacionProveedor=this.jInternalFrameDetalleFormEvaluacionProveedor.jMenuItemCancelarEvaluacionProveedor.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEvaluacionProveedor=this.jMenuItemGuardarCambiosEvaluacionProveedor.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEvaluacionProveedor=this.jMenuItemGuardarCambiosTablaEvaluacionProveedor.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEvaluacionProveedor(Boolean esInicializar) {
		if(EvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {			
			if(this.evaluacionproveedorSessionBean.getConGuardarRelaciones()) {
				//if(this.evaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEvaluacionProveedor();
			}
			
			this.inicializarActualizarBindingBotonesManualEvaluacionProveedor(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEvaluacionProveedor() {
		this.jButtonNuevoEvaluacionProveedor.setVisible(this.isPermisoNuevoEvaluacionProveedor);			
		this.jButtonDuplicarEvaluacionProveedor.setVisible(this.isPermisoDuplicarEvaluacionProveedor);			
		this.jButtonCopiarEvaluacionProveedor.setVisible(this.isPermisoCopiarEvaluacionProveedor);			
		this.jButtonVerFormEvaluacionProveedor.setVisible(this.isPermisoVerFormEvaluacionProveedor);			
		
		this.jButtonAbrirOrderByEvaluacionProveedor.setVisible(this.isPermisoOrdenEvaluacionProveedor);					
		
		this.jButtonNuevoRelacionesEvaluacionProveedor.setVisible(this.isPermisoNuevoEvaluacionProveedor);			
		
		if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonModificarEvaluacionProveedor.setVisible(this.isPermisoActualizarEvaluacionProveedor);	
			this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonActualizarEvaluacionProveedor.setVisible(this.isPermisoActualizarEvaluacionProveedor);	
			this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonEliminarEvaluacionProveedor.setVisible(this.isPermisoEliminarEvaluacionProveedor);
			this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonCancelarEvaluacionProveedor.setVisible(this.isVisibilidadCeldaCancelarEvaluacionProveedor);						
			this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonGuardarCambiosEvaluacionProveedor.setVisible(this.isPermisoGuardarCambiosEvaluacionProveedor);							
		}
		
		this.jButtonGuardarCambiosTablaEvaluacionProveedor.setVisible(this.isPermisoActualizarEvaluacionProveedor);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEvaluacionProveedor() {
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonModificarEvaluacionProveedor.setVisible(this.isPermisoActualizarEvaluacionProveedor);	
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonActualizarEvaluacionProveedor.setVisible(this.isPermisoActualizarEvaluacionProveedor);	
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonEliminarEvaluacionProveedor.setVisible(this.isPermisoEliminarEvaluacionProveedor);
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonCancelarEvaluacionProveedor.setVisible(this.isVisibilidadCeldaCancelarEvaluacionProveedor);							
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonGuardarCambiosEvaluacionProveedor.setVisible((this.isVisibilidadCeldaGuardarEvaluacionProveedor && this.isPermisoGuardarCambiosEvaluacionProveedor));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEvaluacionProveedor() {
		if(EvaluacionProveedorJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEvaluacionProveedor();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEvaluacionProveedor() {
	}
	
	public void jTableDatosEvaluacionProveedorListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEvaluacionProveedor(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEvaluacionProveedorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionProveedor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionProveedor(this.getevaluacionproveedor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionProveedor(this.evaluacionproveedor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedorLogic.getEvaluacionProveedors().toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedors.toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionproveedor==null) {
						this.evaluacionproveedor = new EvaluacionProveedor();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionProveedor(this.evaluacionproveedor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionProveedor(this.evaluacionproveedor);
				}

				if(this.evaluacionproveedor.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.evaluacionproveedor.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionProveedor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaEvaluacionProveedorUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebEvaluacionProveedor(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionProveedor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEvaluacionProveedor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEvaluacionProveedor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedorLogic.getEvaluacionProveedors().toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedors.toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEvaluacionProveedor(this.getevaluacionproveedor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionProveedor(this.evaluacionproveedor);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.evaluacionproveedorLogic.getConnexion());

				if(this.evaluacionproveedor.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.evaluacionproveedor.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEvaluacionProveedor=(TitledBorder)this.jScrollPanelDatosEvaluacionProveedor.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderEvaluacionProveedor.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaEvaluacionProveedorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionProveedor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionProveedor(this.getevaluacionproveedor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionProveedor(this.evaluacionproveedor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedorLogic.getEvaluacionProveedors().toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedors.toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionproveedor==null) {
						this.evaluacionproveedor = new EvaluacionProveedor();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionProveedor(this.evaluacionproveedor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionProveedor(this.evaluacionproveedor);
				}

				if(this.evaluacionproveedor.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.evaluacionproveedor.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionProveedor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalEvaluacionProveedorUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebEvaluacionProveedor(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionProveedor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEvaluacionProveedor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEvaluacionProveedor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedorLogic.getEvaluacionProveedors().toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedors.toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEvaluacionProveedor(this.getevaluacionproveedor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionProveedor(this.evaluacionproveedor);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.evaluacionproveedorLogic.getConnexion());

				if(this.evaluacionproveedor.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.evaluacionproveedor.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEvaluacionProveedor=(TitledBorder)this.jScrollPanelDatosEvaluacionProveedor.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderEvaluacionProveedor.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalEvaluacionProveedorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionProveedor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionProveedor(this.getevaluacionproveedor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionProveedor(this.evaluacionproveedor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedorLogic.getEvaluacionProveedors().toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedors.toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionproveedor==null) {
						this.evaluacionproveedor = new EvaluacionProveedor();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionProveedor(this.evaluacionproveedor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionProveedor(this.evaluacionproveedor);
				}

				if(this.evaluacionproveedor.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.evaluacionproveedor.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionProveedor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioEvaluacionProveedorUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebEvaluacionProveedor(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionProveedor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEvaluacionProveedor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEvaluacionProveedor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedorLogic.getEvaluacionProveedors().toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedors.toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEvaluacionProveedor(this.getevaluacionproveedor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionProveedor(this.evaluacionproveedor);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.evaluacionproveedorLogic.getConnexion());

				if(this.evaluacionproveedor.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.evaluacionproveedor.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEvaluacionProveedor=(TitledBorder)this.jScrollPanelDatosEvaluacionProveedor.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderEvaluacionProveedor.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioEvaluacionProveedorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionProveedor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionProveedor(this.getevaluacionproveedor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionProveedor(this.evaluacionproveedor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedorLogic.getEvaluacionProveedors().toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedors.toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionproveedor==null) {
						this.evaluacionproveedor = new EvaluacionProveedor();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionProveedor(this.evaluacionproveedor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionProveedor(this.evaluacionproveedor);
				}

				if(this.evaluacionproveedor.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.evaluacionproveedor.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionProveedor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_periodoEvaluacionProveedorUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperiodo=true;

			idTienePermisoperiodo=this.tienePermisosUsuarioEnPaginaWebEvaluacionProveedor(PeriodoConstantesFunciones.CLASSNAME);

			if(idTienePermisoperiodo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionProveedor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEvaluacionProveedor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEvaluacionProveedor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedorLogic.getEvaluacionProveedors().toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedors.toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEvaluacionProveedor(this.getevaluacionproveedor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionProveedor(this.evaluacionproveedor);

				this.periodoBeanSwingJInternalFrame=new PeriodoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.periodoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.periodoBeanSwingJInternalFrame.getPeriodoLogic().setConnexion(this.evaluacionproveedorLogic.getConnexion());

				if(this.evaluacionproveedor.getid_periodo()!=null) {
					this.periodoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.periodoBeanSwingJInternalFrame.setIdActual(this.evaluacionproveedor.getid_periodo());
					this.periodoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPeriodo();
				}

				JInternalFrameBase jinternalFrame =this.periodoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEvaluacionProveedor=(TitledBorder)this.jScrollPanelDatosEvaluacionProveedor.getBorder();
				TitledBorder titledBorderperiodo=(TitledBorder)this.periodoBeanSwingJInternalFrame.jScrollPanelDatosPeriodo.getBorder();

				titledBorderperiodo.setTitle(titledBorderEvaluacionProveedor.getTitle() + " -> Periodo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_periodoEvaluacionProveedorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionProveedor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionProveedor(this.getevaluacionproveedor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionProveedor(this.evaluacionproveedor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedorLogic.getEvaluacionProveedors().toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedors.toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionproveedor==null) {
						this.evaluacionproveedor = new EvaluacionProveedor();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionProveedor(this.evaluacionproveedor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionProveedor(this.evaluacionproveedor);
				}

				if(this.evaluacionproveedor.getid_periodo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_periodo = "+this.evaluacionproveedor.getid_periodo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionProveedor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_clienteEvaluacionProveedorActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.clienteBeanSwingJInternalFrame.sTipoBusqueda="Cliente";

			if(!this.sFinalQueryGeneral_cliente.equals("")) {
				this.clienteBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_cliente);
				this.clienteBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.clienteBeanSwingJInternalFrame.procesarBusqueda(this.clienteBeanSwingJInternalFrame.sAccionBusqueda);
				this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingCliente(false);
			}

			if(!this.sFinalQueryComboCliente.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderEvaluacionProveedor=null;
			TitledBorder titledBordercliente=null;

			if(!this.jScrollPanelDatosEvaluacionProveedor.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderEvaluacionProveedor=(TitledBorder)this.jScrollPanelDatosEvaluacionProveedor.getBorder();
				titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderEvaluacionProveedor.getTitle() + " -> Cliente");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_clienteEvaluacionProveedorUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebEvaluacionProveedor(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionProveedor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEvaluacionProveedor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEvaluacionProveedor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedorLogic.getEvaluacionProveedors().toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedors.toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEvaluacionProveedor(this.getevaluacionproveedor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionProveedor(this.evaluacionproveedor);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.evaluacionproveedorLogic.getConnexion());

				if(this.evaluacionproveedor.getid_cliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.evaluacionproveedor.getid_cliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEvaluacionProveedor=(TitledBorder)this.jScrollPanelDatosEvaluacionProveedor.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderEvaluacionProveedor.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_clienteEvaluacionProveedorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionProveedor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionProveedor(this.getevaluacionproveedor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionProveedor(this.evaluacionproveedor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedorLogic.getEvaluacionProveedors().toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedors.toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionproveedor==null) {
						this.evaluacionproveedor = new EvaluacionProveedor();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionProveedor(this.evaluacionproveedor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionProveedor(this.evaluacionproveedor);
				}

				if(this.evaluacionproveedor.getid_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cliente = "+this.evaluacionproveedor.getid_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionProveedor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaEvaluacionProveedorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionProveedor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionProveedor(this.getevaluacionproveedor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionProveedor(this.evaluacionproveedor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedorLogic.getEvaluacionProveedors().toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedors.toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionproveedor==null) {
						this.evaluacionproveedor = new EvaluacionProveedor();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionProveedor(this.evaluacionproveedor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionProveedor(this.evaluacionproveedor);
				}

				if(this.evaluacionproveedor.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.evaluacionproveedor.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionProveedor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncontactoEvaluacionProveedorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionProveedor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionProveedor(this.getevaluacionproveedor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionProveedor(this.evaluacionproveedor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedorLogic.getEvaluacionProveedors().toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedors.toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionproveedor==null) {
						this.evaluacionproveedor = new EvaluacionProveedor();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionProveedor(this.evaluacionproveedor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionProveedor(this.evaluacionproveedor);
				}

				if(this.evaluacionproveedor.getcontacto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where contacto like '%"+this.evaluacionproveedor.getcontacto()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionProveedor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonevaluadoEvaluacionProveedorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionProveedor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionProveedor(this.getevaluacionproveedor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionProveedor(this.evaluacionproveedor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedorLogic.getEvaluacionProveedors().toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedors.toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionproveedor==null) {
						this.evaluacionproveedor = new EvaluacionProveedor();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionProveedor(this.evaluacionproveedor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionProveedor(this.evaluacionproveedor);
				}

				if(this.evaluacionproveedor.getevaluado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where evaluado like '%"+this.evaluacionproveedor.getevaluado()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionProveedor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonresultadoEvaluacionProveedorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionProveedor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionProveedor(this.getevaluacionproveedor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionProveedor(this.evaluacionproveedor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedorLogic.getEvaluacionProveedors().toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedors.toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionproveedor==null) {
						this.evaluacionproveedor = new EvaluacionProveedor();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionProveedor(this.evaluacionproveedor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionProveedor(this.evaluacionproveedor);
				}

				if(this.evaluacionproveedor.getresultado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where resultado like '%"+this.evaluacionproveedor.getresultado()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionProveedor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonresponsableEvaluacionProveedorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionProveedor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionProveedor(this.getevaluacionproveedor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionProveedor(this.evaluacionproveedor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedorLogic.getEvaluacionProveedors().toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedors.toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionproveedor==null) {
						this.evaluacionproveedor = new EvaluacionProveedor();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionProveedor(this.evaluacionproveedor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionProveedor(this.evaluacionproveedor);
				}

				if(this.evaluacionproveedor.getresponsable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where responsable like '%"+this.evaluacionproveedor.getresponsable()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionProveedor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_desdeEvaluacionProveedorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionProveedor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionProveedor(this.getevaluacionproveedor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionProveedor(this.evaluacionproveedor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedorLogic.getEvaluacionProveedors().toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedors.toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionproveedor==null) {
						this.evaluacionproveedor = new EvaluacionProveedor();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionProveedor(this.evaluacionproveedor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionProveedor(this.evaluacionproveedor);
				}

				if(this.evaluacionproveedor.getfecha_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_desde = '"+Funciones2.getStringPostgresDate(this.evaluacionproveedor.getfecha_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionProveedor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_hastaEvaluacionProveedorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionProveedor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionProveedor(this.getevaluacionproveedor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionProveedor(this.evaluacionproveedor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedorLogic.getEvaluacionProveedors().toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedors.toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionproveedor==null) {
						this.evaluacionproveedor = new EvaluacionProveedor();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionProveedor(this.evaluacionproveedor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionProveedor(this.evaluacionproveedor);
				}

				if(this.evaluacionproveedor.getfecha_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_hasta = '"+Funciones2.getStringPostgresDate(this.evaluacionproveedor.getfecha_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionProveedor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonobservacionEvaluacionProveedorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEvaluacionProveedor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEvaluacionProveedor(this.getevaluacionproveedor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionProveedor(this.evaluacionproveedor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedorLogic.getEvaluacionProveedors().toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedors.toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.evaluacionproveedor==null) {
						this.evaluacionproveedor = new EvaluacionProveedor();
					}

					this.setVariablesFormularioToObjetoActualEvaluacionProveedor(this.evaluacionproveedor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionProveedor(this.evaluacionproveedor);
				}

				if(this.evaluacionproveedor.getobservacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where observacion like '%"+this.evaluacionproveedor.getobservacion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEvaluacionProveedor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdClienteEvaluacionProveedorActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEvaluacionProveedor(false,false);

			this.getEvaluacionProveedorsFK_IdCliente();

			this.inicializarActualizarBindingEvaluacionProveedor(false);

			//if(EvaluacionProveedorBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEvaluacionProveedor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioEvaluacionProveedorActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEvaluacionProveedor(false,false);

			this.getEvaluacionProveedorsFK_IdEjercicio();

			this.inicializarActualizarBindingEvaluacionProveedor(false);

			//if(EvaluacionProveedorBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEvaluacionProveedor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaEvaluacionProveedorActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEvaluacionProveedor(false,false);

			this.getEvaluacionProveedorsFK_IdEmpresa();

			this.inicializarActualizarBindingEvaluacionProveedor(false);

			//if(EvaluacionProveedorBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEvaluacionProveedor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPeriodoEvaluacionProveedorActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEvaluacionProveedor(false,false);

			this.getEvaluacionProveedorsFK_IdPeriodo();

			this.inicializarActualizarBindingEvaluacionProveedor(false);

			//if(EvaluacionProveedorBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEvaluacionProveedor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalEvaluacionProveedorActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEvaluacionProveedor(false,false);

			this.getEvaluacionProveedorsFK_IdSucursal();

			this.inicializarActualizarBindingEvaluacionProveedor(false);

			//if(EvaluacionProveedorBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEvaluacionProveedor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.evaluacionproveedorLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameEvaluacionProveedor() {
		if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) {
		

		if(this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) {
			this.jInternalFrameDetalleFormEvaluacionProveedor.setVisible(false);	    			
			this.jInternalFrameDetalleFormEvaluacionProveedor.dispose();
			this.jInternalFrameDetalleFormEvaluacionProveedor=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEvaluacionProveedor!=null) {
			this.jInternalFrameReporteDinamicoEvaluacionProveedor.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEvaluacionProveedor.dispose();
			this.jInternalFrameReporteDinamicoEvaluacionProveedor=null;
		}
		
		if(this.jInternalFrameImportacionEvaluacionProveedor!=null) {
			this.jInternalFrameImportacionEvaluacionProveedor.setVisible(false);	    			
			this.jInternalFrameImportacionEvaluacionProveedor.dispose();
			this.jInternalFrameImportacionEvaluacionProveedor=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEvaluacionProveedor();
			
			EvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.evaluacionproveedor,new Object(),this.evaluacionproveedorParameterGeneral,this.evaluacionproveedorReturnGeneral);
			
			
			if(sTipo.equals("NuevoEvaluacionProveedor")) {
				jButtonNuevoEvaluacionProveedorActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEvaluacionProveedor")) {
				jButtonDuplicarEvaluacionProveedorActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEvaluacionProveedor")) {
				jButtonCopiarEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("VerFormEvaluacionProveedor")) {
				jButtonVerFormEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEvaluacionProveedor")) {
				jButtonNuevoEvaluacionProveedorActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEvaluacionProveedor")) {
				jButtonDuplicarEvaluacionProveedorActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEvaluacionProveedor")) {
				jButtonNuevoEvaluacionProveedorActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEvaluacionProveedor")) {
				jButtonDuplicarEvaluacionProveedorActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEvaluacionProveedor")) {
				jButtonNuevoEvaluacionProveedorActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEvaluacionProveedor")) {
				jButtonNuevoEvaluacionProveedorActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEvaluacionProveedor")) {
				jButtonNuevoEvaluacionProveedorActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEvaluacionProveedor")) {
				jButtonModificarEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEvaluacionProveedor")) {
				jButtonModificarEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEvaluacionProveedor")) {
				jButtonModificarEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEvaluacionProveedor")) {
				jButtonActualizarEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEvaluacionProveedor")) {
				jButtonActualizarEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEvaluacionProveedor")) {
				jButtonActualizarEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("EliminarEvaluacionProveedor")) {
				jButtonEliminarEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEvaluacionProveedor")) {
				jButtonEliminarEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEvaluacionProveedor")) {
				jButtonEliminarEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("CancelarEvaluacionProveedor")) {
				jButtonCancelarEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEvaluacionProveedor")) {
				jButtonCancelarEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEvaluacionProveedor")) {
				jButtonCancelarEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("CerrarEvaluacionProveedor")) {
				jButtonCerrarEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEvaluacionProveedor")) {
				jButtonCerrarEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEvaluacionProveedor")) {
				jButtonCerrarEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEvaluacionProveedor")) {
				jButtonMostrarOcultarEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEvaluacionProveedor")) {
				jButtonCancelarEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEvaluacionProveedor")) {
				jButtonGuardarCambiosEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEvaluacionProveedor")) {
				jButtonGuardarCambiosEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEvaluacionProveedor")) {
				jButtonCopiarEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEvaluacionProveedor")) {
				jButtonVerFormEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEvaluacionProveedor")) {
				jButtonGuardarCambiosEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEvaluacionProveedor")) {
				jButtonCopiarEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEvaluacionProveedor")) {
				jButtonVerFormEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEvaluacionProveedor")) {
				jButtonGuardarCambiosEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEvaluacionProveedor")) {
				jButtonGuardarCambiosEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEvaluacionProveedor")) {
				jButtonGuardarCambiosEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEvaluacionProveedor")) {
				jButtonRecargarInformacionEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEvaluacionProveedor")) {
				jButtonRecargarInformacionEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEvaluacionProveedor")) {
				jButtonRecargarInformacionEvaluacionProveedorActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEvaluacionProveedor")) {
				jButtonAnterioresEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEvaluacionProveedor")) {
				jButtonAnterioresEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEvaluacionProveedor")) {
				jButtonAnterioresEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEvaluacionProveedor")) {
				jButtonSiguientesEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEvaluacionProveedor")) {
				jButtonSiguientesEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEvaluacionProveedor")) {
				jButtonSiguientesEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEvaluacionProveedor") || sTipo.equals("MenuItemDetalleAbrirOrderByEvaluacionProveedor")) {
				jButtonAbrirOrderByEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEvaluacionProveedor") || sTipo.equals("MenuItemDetalleMostrarOcultarEvaluacionProveedor")) {
				jButtonMostrarOcultarEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEvaluacionProveedor")) {
				jButtonNuevoGuardarCambiosEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEvaluacionProveedor")) {
				jButtonNuevoGuardarCambiosEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEvaluacionProveedor")) {
				jButtonNuevoGuardarCambiosEvaluacionProveedorActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEvaluacionProveedor")) {
				jButtonCerrarReporteDinamicoEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEvaluacionProveedor")) {
				jButtonGenerarReporteDinamicoEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEvaluacionProveedor")) {
				
				jButtonGenerarExcelReporteDinamicoEvaluacionProveedorActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEvaluacionProveedor")) {
				jButtonCerrarImportacionEvaluacionProveedorActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEvaluacionProveedor")) {
				
				jButtonGenerarImportacionEvaluacionProveedorActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEvaluacionProveedor")) {
				
				jButtonAbrirImportacionEvaluacionProveedorActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEvaluacionProveedor")) {
				jComboBoxTiposAccionesEvaluacionProveedorActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEvaluacionProveedor")) {
				jComboBoxTiposRelacionesEvaluacionProveedorActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEvaluacionProveedor")) {
				jComboBoxTiposAccionesEvaluacionProveedorActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEvaluacionProveedor")) {
				
				jComboBoxTiposSeleccionarEvaluacionProveedorActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEvaluacionProveedor")) {
				jTextFieldValorCampoGeneralEvaluacionProveedorActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEvaluacionProveedor")) {
				jButtonAbrirOrderByEvaluacionProveedorActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEvaluacionProveedor")) {
				jButtonAbrirOrderByEvaluacionProveedorActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEvaluacionProveedor")) {
				jButtonCerrarOrderByEvaluacionProveedorActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEvaluacionProveedorBusqueda")) {
				this.jButtonidEvaluacionProveedorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEvaluacionProveedorUpdate")) {
				this.jButtonid_empresaEvaluacionProveedorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEvaluacionProveedorBusqueda")) {
				this.jButtonid_empresaEvaluacionProveedorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalEvaluacionProveedorUpdate")) {
				this.jButtonid_sucursalEvaluacionProveedorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalEvaluacionProveedorBusqueda")) {
				this.jButtonid_sucursalEvaluacionProveedorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioEvaluacionProveedorUpdate")) {
				this.jButtonid_ejercicioEvaluacionProveedorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioEvaluacionProveedorBusqueda")) {
				this.jButtonid_ejercicioEvaluacionProveedorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoEvaluacionProveedorUpdate")) {
				this.jButtonid_periodoEvaluacionProveedorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoEvaluacionProveedorBusqueda")) {
				this.jButtonid_periodoEvaluacionProveedorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteEvaluacionProveedor")) {
				this.jButtonid_clienteEvaluacionProveedorActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteEvaluacionProveedorUpdate")) {
				this.jButtonid_clienteEvaluacionProveedorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteEvaluacionProveedorBusqueda")) {
				this.jButtonid_clienteEvaluacionProveedorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaEvaluacionProveedorBusqueda")) {
				this.jButtonfechaEvaluacionProveedorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("contactoEvaluacionProveedorBusqueda")) {
				this.jButtoncontactoEvaluacionProveedorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("evaluadoEvaluacionProveedorBusqueda")) {
				this.jButtonevaluadoEvaluacionProveedorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("resultadoEvaluacionProveedorBusqueda")) {
				this.jButtonresultadoEvaluacionProveedorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("responsableEvaluacionProveedorBusqueda")) {
				this.jButtonresponsableEvaluacionProveedorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_desdeEvaluacionProveedorBusqueda")) {
				this.jButtonfecha_desdeEvaluacionProveedorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_hastaEvaluacionProveedorBusqueda")) {
				this.jButtonfecha_hastaEvaluacionProveedorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("observacionEvaluacionProveedorBusqueda")) {
				this.jButtonobservacionEvaluacionProveedorBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_clienteEvaluacionProveedor")) {
				this.jButtonid_clienteEvaluacionProveedorActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdClienteEvaluacionProveedor")) {
				this.jButtonFK_IdClienteEvaluacionProveedorActionPerformed(evt);
			}
			
			;
			
			
			EvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.evaluacionproveedor,new Object(),this.evaluacionproveedorParameterGeneral,this.evaluacionproveedorReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEvaluacionProveedor();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEvaluacionProveedorActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionproveedor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.evaluacionproveedor);
				
				EvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionproveedor,new Object(),this.evaluacionproveedorParameterGeneral,this.evaluacionproveedorReturnGeneral);
				
				


				
				EvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionproveedor,new Object(),this.evaluacionproveedorParameterGeneral,this.evaluacionproveedorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EvaluacionProveedor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EvaluacionProveedor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EvaluacionProveedor evaluacionproveedorLocal=null;
			
			if(!this.getEsControlTabla()) {
				evaluacionproveedorLocal=this.evaluacionproveedor;
			} else {
				evaluacionproveedorLocal=this.evaluacionproveedorAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionproveedor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.evaluacionproveedor);
				
				EvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionproveedor,new Object(),this.evaluacionproveedorParameterGeneral,this.evaluacionproveedorReturnGeneral);
							
				
				


				
				EvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionproveedor,new Object(),this.evaluacionproveedorParameterGeneral,this.evaluacionproveedorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EvaluacionProveedor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EvaluacionProveedor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEvaluacionProveedorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEvaluacionProveedor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorAnterior =(EvaluacionProveedor) this.evaluacionproveedorLogic.getEvaluacionProveedors().toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.evaluacionproveedorAnterior =(EvaluacionProveedor) this.evaluacionproveedors.toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
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
			
			EvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionproveedor,new Object(),this.evaluacionproveedorParameterGeneral,this.evaluacionproveedorReturnGeneral);
			
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
			
			


			
			EvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionproveedor,new Object(),this.evaluacionproveedorParameterGeneral,this.evaluacionproveedorReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEvaluacionProveedorActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionproveedor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.evaluacionproveedor);
				
				EvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionproveedor,new Object(),this.evaluacionproveedorParameterGeneral,this.evaluacionproveedorReturnGeneral);
								
						
				


				
				EvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionproveedor,new Object(),this.evaluacionproveedorParameterGeneral,this.evaluacionproveedorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EvaluacionProveedor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EvaluacionProveedor.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionproveedor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.evaluacionproveedor);
				
				EvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionproveedor,new Object(),this.evaluacionproveedorParameterGeneral,this.evaluacionproveedorReturnGeneral);
								
				
				


				
				EvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionproveedor,new Object(),this.evaluacionproveedorParameterGeneral,this.evaluacionproveedorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EvaluacionProveedor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EvaluacionProveedor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEvaluacionProveedorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEvaluacionProveedor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorAnterior =(EvaluacionProveedor) this.evaluacionproveedorLogic.getEvaluacionProveedors().toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.evaluacionproveedorAnterior =(EvaluacionProveedor) this.evaluacionproveedors.toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionproveedor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.evaluacionproveedor);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEvaluacionProveedorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEvaluacionProveedor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorAnterior =(EvaluacionProveedor) this.evaluacionproveedorLogic.getEvaluacionProveedors().toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.evaluacionproveedorAnterior =(EvaluacionProveedor) this.evaluacionproveedors.toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEvaluacionProveedorActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionproveedor);
			
			this.actualizarInformacion("INFO_PADRE",false,this.evaluacionproveedor);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionproveedor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.evaluacionproveedor);
				
				EvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionproveedor,new Object(),this.evaluacionproveedorParameterGeneral,this.evaluacionproveedorReturnGeneral);
							
				
				


				
				EvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionproveedor,new Object(),this.evaluacionproveedorParameterGeneral,this.evaluacionproveedorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EvaluacionProveedor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EvaluacionProveedor.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEvaluacionProveedorActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEvaluacionProveedor.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionproveedorAnterior =(EvaluacionProveedor) this.evaluacionproveedorLogic.getEvaluacionProveedors().toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.evaluacionproveedorAnterior =(EvaluacionProveedor) this.evaluacionproveedors.toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
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
			
			EvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionproveedor,new Object(),this.evaluacionproveedorParameterGeneral,this.evaluacionproveedorReturnGeneral);
			
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
			
			


			
			EvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionproveedor,new Object(),this.evaluacionproveedorParameterGeneral,this.evaluacionproveedorReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEvaluacionProveedorActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionproveedor);
			
			this.actualizarInformacion("INFO_PADRE",false,this.evaluacionproveedor);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionproveedor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.evaluacionproveedor);
				
				EvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionproveedor,new Object(),this.evaluacionproveedorParameterGeneral,this.evaluacionproveedorReturnGeneral);
								
				
				


				
				EvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionproveedor,new Object(),this.evaluacionproveedorParameterGeneral,this.evaluacionproveedorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EvaluacionProveedor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EvaluacionProveedor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEvaluacionProveedorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEvaluacionProveedor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorAnterior =(EvaluacionProveedor) this.evaluacionproveedorLogic.getEvaluacionProveedors().toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.evaluacionproveedorAnterior =(EvaluacionProveedor) this.evaluacionproveedors.toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEvaluacionProveedorActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionproveedor);
			
			this.actualizarInformacion("INFO_PADRE",false,this.evaluacionproveedor);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEvaluacionProveedorActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionproveedor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.evaluacionproveedor);
				
				EvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.evaluacionproveedor,new Object(),this.evaluacionproveedorParameterGeneral,this.evaluacionproveedorReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEvaluacionProveedor")) {
					jCheckBoxSeleccionarTodosEvaluacionProveedorItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEvaluacionProveedor")) {
					jCheckBoxSeleccionadosEvaluacionProveedorItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEvaluacionProveedor")) {
					
				}
				
				


				
				
				EvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.evaluacionproveedor,new Object(),this.evaluacionproveedorParameterGeneral,this.evaluacionproveedorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EvaluacionProveedor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EvaluacionProveedor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionproveedor);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.evaluacionproveedor);
				
				EvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.evaluacionproveedor,new Object(),this.evaluacionproveedorParameterGeneral,this.evaluacionproveedorReturnGeneral);
												
				
				


				
				
				EvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.evaluacionproveedor,new Object(),this.evaluacionproveedorParameterGeneral,this.evaluacionproveedorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EvaluacionProveedor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EvaluacionProveedor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEvaluacionProveedorActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEvaluacionProveedor.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.evaluacionproveedorAnterior =(EvaluacionProveedor) this.evaluacionproveedorLogic.getEvaluacionProveedors().toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.evaluacionproveedorAnterior =(EvaluacionProveedor) this.evaluacionproveedors.toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEvaluacionProveedorActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionproveedor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.evaluacionproveedor);
				
				EvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.evaluacionproveedor,new Object(),this.evaluacionproveedorParameterGeneral,this.evaluacionproveedorReturnGeneral);
				
				
				EvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.evaluacionproveedor,new Object(),this.evaluacionproveedorParameterGeneral,this.evaluacionproveedorReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
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
			
			EvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.evaluacionproveedor,new Object(),this.evaluacionproveedorParameterGeneral,this.evaluacionproveedorReturnGeneral);
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
			
			


			
			EvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionproveedor,new Object(),this.evaluacionproveedorParameterGeneral,this.evaluacionproveedorReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEvaluacionProveedorActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionproveedor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.evaluacionproveedor);
				
				EvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.evaluacionproveedor,new Object(),this.evaluacionproveedorParameterGeneral,this.evaluacionproveedorReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionproveedor,new Object(),this.evaluacionproveedorParameterGeneral,this.evaluacionproveedorReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EvaluacionProveedor.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EvaluacionProveedor.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.evaluacionproveedor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.evaluacionproveedor);
				
				EvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.evaluacionproveedor,new Object(),this.evaluacionproveedorParameterGeneral,this.evaluacionproveedorReturnGeneral);
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
				
				


				
				EvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionproveedor,new Object(),this.evaluacionproveedorParameterGeneral,this.evaluacionproveedorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EvaluacionProveedor.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EvaluacionProveedor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEvaluacionProveedorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEvaluacionProveedor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.evaluacionproveedorAnterior =(EvaluacionProveedor) this.evaluacionproveedorLogic.getEvaluacionProveedors().toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.evaluacionproveedorAnterior =(EvaluacionProveedor) this.evaluacionproveedors.toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionproveedor,new Object(),this.evaluacionproveedorParameterGeneral,this.evaluacionproveedorReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEvaluacionProveedor")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEvaluacionProveedorListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEvaluacionProveedor.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedorLogic.getEvaluacionProveedors().toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.evaluacionproveedor =(EvaluacionProveedor) this.evaluacionproveedors.toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.evaluacionproveedor);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEvaluacionProveedor")) {
				
				}
				
				EvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.evaluacionproveedor,new Object(),this.evaluacionproveedorParameterGeneral,this.evaluacionproveedorReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.evaluacionproveedor,new Object(),this.evaluacionproveedorParameterGeneral,this.evaluacionproveedorReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEvaluacionProveedor")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEvaluacionProveedor.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEvaluacionProveedor")) {
			
			}
			
			EvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.evaluacionproveedor,new Object(),this.evaluacionproveedorParameterGeneral,this.evaluacionproveedorReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEvaluacionProveedor();
			
			EvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.evaluacionproveedor,new Object(),this.evaluacionproveedorParameterGeneral,this.evaluacionproveedorReturnGeneral);
			
			if(sTipo.equals("NuevoEvaluacionProveedor")) {
				jButtonNuevoEvaluacionProveedorActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEvaluacionProveedor")) {
				jButtonDuplicarEvaluacionProveedorActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEvaluacionProveedor")) {
				jButtonCopiarEvaluacionProveedorActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEvaluacionProveedor")) {
				jButtonVerFormEvaluacionProveedorActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEvaluacionProveedor")) {
				jButtonNuevoEvaluacionProveedorActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEvaluacionProveedor")) {
				jButtonModificarEvaluacionProveedorActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEvaluacionProveedor")) {
				jButtonActualizarEvaluacionProveedorActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEvaluacionProveedor")) {
				jButtonEliminarEvaluacionProveedorActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEvaluacionProveedor")) {
				jButtonGuardarCambiosEvaluacionProveedorActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEvaluacionProveedor")) {
				jButtonCancelarEvaluacionProveedorActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEvaluacionProveedor")) {
				jButtonCerrarEvaluacionProveedorActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEvaluacionProveedor")) {
				jButtonGuardarCambiosEvaluacionProveedorActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEvaluacionProveedor")) {
				jButtonNuevoGuardarCambiosEvaluacionProveedorActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEvaluacionProveedor")) {
				jButtonAbrirOrderByEvaluacionProveedorActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEvaluacionProveedor")) {
				jButtonRecargarInformacionEvaluacionProveedorActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEvaluacionProveedor")) {
				jButtonAnterioresEvaluacionProveedorActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEvaluacionProveedor")) {
				jButtonSiguientesEvaluacionProveedorActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEvaluacionProveedorBusqueda")) {
				this.jButtonidEvaluacionProveedorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEvaluacionProveedorUpdate")) {
				this.jButtonid_empresaEvaluacionProveedorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEvaluacionProveedorBusqueda")) {
				this.jButtonid_empresaEvaluacionProveedorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalEvaluacionProveedorUpdate")) {
				this.jButtonid_sucursalEvaluacionProveedorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalEvaluacionProveedorBusqueda")) {
				this.jButtonid_sucursalEvaluacionProveedorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioEvaluacionProveedorUpdate")) {
				this.jButtonid_ejercicioEvaluacionProveedorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioEvaluacionProveedorBusqueda")) {
				this.jButtonid_ejercicioEvaluacionProveedorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoEvaluacionProveedorUpdate")) {
				this.jButtonid_periodoEvaluacionProveedorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoEvaluacionProveedorBusqueda")) {
				this.jButtonid_periodoEvaluacionProveedorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteEvaluacionProveedor")) {
				this.jButtonid_clienteEvaluacionProveedorActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteEvaluacionProveedorUpdate")) {
				this.jButtonid_clienteEvaluacionProveedorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteEvaluacionProveedorBusqueda")) {
				this.jButtonid_clienteEvaluacionProveedorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaEvaluacionProveedorBusqueda")) {
				this.jButtonfechaEvaluacionProveedorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("contactoEvaluacionProveedorBusqueda")) {
				this.jButtoncontactoEvaluacionProveedorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("evaluadoEvaluacionProveedorBusqueda")) {
				this.jButtonevaluadoEvaluacionProveedorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("resultadoEvaluacionProveedorBusqueda")) {
				this.jButtonresultadoEvaluacionProveedorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("responsableEvaluacionProveedorBusqueda")) {
				this.jButtonresponsableEvaluacionProveedorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_desdeEvaluacionProveedorBusqueda")) {
				this.jButtonfecha_desdeEvaluacionProveedorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_hastaEvaluacionProveedorBusqueda")) {
				this.jButtonfecha_hastaEvaluacionProveedorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("observacionEvaluacionProveedorBusqueda")) {
				this.jButtonobservacionEvaluacionProveedorBusquedaActionPerformed(evt);
			}
			
			EvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.evaluacionproveedor,new Object(),this.evaluacionproveedorParameterGeneral,this.evaluacionproveedorReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEvaluacionProveedor();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.evaluacionproveedor,new Object(),this.evaluacionproveedorParameterGeneral,this.evaluacionproveedorReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEvaluacionProveedor")) {
				closingInternalFrameEvaluacionProveedor();
				
			} else if(sTipo.equals("jButtonCancelarEvaluacionProveedor")) {
				JInternalFrameBase jInternalFrameDetalleFormEvaluacionProveedor = (JInternalFrameBase)evt.getSource();
	            	
	            EvaluacionProveedorBeanSwingJInternalFrame jInternalFrameParent=(EvaluacionProveedorBeanSwingJInternalFrame)jInternalFrameDetalleFormEvaluacionProveedor.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEvaluacionProveedorActionPerformed(null);
			}
			
			EvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.evaluacionproveedor,new Object(),this.evaluacionproveedorParameterGeneral,this.evaluacionproveedorReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEvaluacionProveedor(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEvaluacionProveedor(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEvaluacionProveedor(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.evaluacionproveedor)) {
			if(!esControlTabla) {
				if(EvaluacionProveedorJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEvaluacionProveedor(this.evaluacionproveedor,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionProveedor(this.evaluacionproveedor);			
				}
				
				if(this.evaluacionproveedorSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEvaluacionProveedor(this.evaluacionproveedor,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.evaluacionproveedorReturnGeneral=evaluacionproveedorLogic.procesarEventosEvaluacionProveedorsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.evaluacionproveedorLogic.getEvaluacionProveedors(),this.evaluacionproveedor,this.evaluacionproveedorParameterGeneral,this.isEsNuevoEvaluacionProveedor,classes);//this.evaluacionproveedorLogic.getEvaluacionProveedor()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEvaluacionProveedor(this.evaluacionproveedorReturnGeneral,this.evaluacionproveedorBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.evaluacionproveedorSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEvaluacionProveedor(classes,this.evaluacionproveedorReturnGeneral,this.evaluacionproveedorBean,false);
					}
						
					if(this.evaluacionproveedorReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEvaluacionProveedor(this.evaluacionproveedorReturnGeneral.getEvaluacionProveedor());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEvaluacionProveedor(this.evaluacionproveedorReturnGeneral.getEvaluacionProveedor());	
					}
						
					if(this.evaluacionproveedorReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEvaluacionProveedor(this.evaluacionproveedorReturnGeneral.getEvaluacionProveedor(),classes);//this.evaluacionproveedorBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEvaluacionProveedor(this.evaluacionproveedor,classes);//this.evaluacionproveedorBean);									
				}
			
				if(EvaluacionProveedorJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEvaluacionProveedor(this.evaluacionproveedor,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEvaluacionProveedor(this.evaluacionproveedor);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.evaluacionproveedorAnterior!=null) {
						this.evaluacionproveedor=this.evaluacionproveedorAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.evaluacionproveedorReturnGeneral=evaluacionproveedorLogic.procesarEventosEvaluacionProveedorsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.evaluacionproveedorLogic.getEvaluacionProveedors(),this.evaluacionproveedor,this.evaluacionproveedorParameterGeneral,this.isEsNuevoEvaluacionProveedor,classes);//this.evaluacionproveedorLogic.getEvaluacionProveedor()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.evaluacionproveedorSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.evaluacionproveedorSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.evaluacionproveedorReturnGeneral.getEvaluacionProveedor(),evaluacionproveedorLogic.getEvaluacionProveedors());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.evaluacionproveedorReturnGeneral.getEvaluacionProveedor(),this.evaluacionproveedors);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEvaluacionProveedor.repaint();
				
				//((AbstractTableModel) this.jTableDatosEvaluacionProveedor.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEvaluacionProveedor();
			}
		}
	}
	
	public void actualizarVisualTableDatosEvaluacionProveedor() throws Exception {
		
		EvaluacionProveedorModel evaluacionproveedorModel=(EvaluacionProveedorModel)this.jTableDatosEvaluacionProveedor.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			evaluacionproveedorModel.evaluacionproveedors=this.evaluacionproveedorLogic.getEvaluacionProveedors();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			evaluacionproveedorModel.evaluacionproveedors=this.evaluacionproveedors;
		}
		
		
		((EvaluacionProveedorModel) this.jTableDatosEvaluacionProveedor.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEvaluacionProveedor() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getevaluacionproveedorAnterior(),this.evaluacionproveedorLogic.getEvaluacionProveedors());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getevaluacionproveedorAnterior(),this.evaluacionproveedors);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEvaluacionProveedor();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEvaluacionProveedor(EvaluacionProveedor evaluacionproveedor,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleEvaluacionProveedor.class)) {
					this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorLogic.setDetalleEvaluacionProveedors(evaluacionproveedor.getDetalleEvaluacionProveedors());
					this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleEvaluacionProveedor(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
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
										
				EvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.evaluacionproveedor,new Object(),generalEntityParameterGeneral,this.evaluacionproveedorReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.evaluacionproveedorSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EvaluacionProveedorConstantesFunciones.getClassesRelationshipsOfEvaluacionProveedor(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EvaluacionProveedorConstantesFunciones.getClassesRelationshipsFromStringsOfEvaluacionProveedor(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEvaluacionProveedor(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EvaluacionProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.evaluacionproveedor,new Object(),generalEntityParameterGeneral,this.evaluacionproveedorReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEvaluacionProveedor(EvaluacionProveedorBean evaluacionproveedorBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleEvaluacionProveedor.class)) {
					this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorLogic.setDetalleEvaluacionProveedors(evaluacionproveedor.getDetalleEvaluacionProveedors());
					this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleEvaluacionProveedor(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEvaluacionProveedor(ArrayList<Classe> classes,EvaluacionProveedorReturnGeneral evaluacionproveedorReturnGeneral,EvaluacionProveedorBean evaluacionproveedorBean,Boolean conDefault) throws Exception {
		
			this.evaluacionproveedorBean.setDetalleEvaluacionProveedors(evaluacionproveedorReturnGeneral.getEvaluacionProveedor().getDetalleEvaluacionProveedors());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEvaluacionProveedor(EvaluacionProveedor evaluacionproveedor,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleEvaluacionProveedor.class)) {
					evaluacionproveedor.setDetalleEvaluacionProveedors(this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorBeanSwingJInternalFrame.detalleevaluacionproveedorLogic.getDetalleEvaluacionProveedors());
					break;
				}
			}
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.evaluacionproveedor)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEvaluacionProveedor = new EvaluacionProveedorDetalleFormJInternalFrame(jDesktopPane,this.evaluacionproveedorSessionBean.getConGuardarRelaciones(),this.evaluacionproveedorSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEvaluacionProveedor);
		this.jInternalFrameDetalleFormEvaluacionProveedor.setVisible(false);
		this.jInternalFrameDetalleFormEvaluacionProveedor.setSelected(false);						
		
		this.jInternalFrameDetalleFormEvaluacionProveedor.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEvaluacionProveedor.evaluacionproveedorLogic=this.evaluacionproveedorLogic;
		
		this.cargarCombosFrameForeignKeyEvaluacionProveedor("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEvaluacionProveedor();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEvaluacionProveedor();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEvaluacionProveedor("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEvaluacionProveedor();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEvaluacionProveedor.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEvaluacionProveedor"));
		
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonModificarEvaluacionProveedor.addActionListener(new ButtonActionListener(this,"ModificarEvaluacionProveedor"));

		
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonModificarToolBarEvaluacionProveedor.addActionListener(new ButtonActionListener(this,"ModificarToolBarEvaluacionProveedor"));
					
		this.jInternalFrameDetalleFormEvaluacionProveedor.jMenuItemModificarEvaluacionProveedor.addActionListener(new ButtonActionListener(this,"MenuItemModificarEvaluacionProveedor"));		
		
		
		
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonActualizarEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"ActualizarEvaluacionProveedor"));
		
		
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonActualizarToolBarEvaluacionProveedor.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEvaluacionProveedor"));
						
		this.jInternalFrameDetalleFormEvaluacionProveedor.jMenuItemActualizarEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEvaluacionProveedor"));		
		
		
		
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonEliminarEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"EliminarEvaluacionProveedor"));
		
		
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonEliminarToolBarEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"EliminarToolBarEvaluacionProveedor"));
								
		this.jInternalFrameDetalleFormEvaluacionProveedor.jMenuItemEliminarEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEvaluacionProveedor"));		
		
		
		
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonCancelarEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"CancelarEvaluacionProveedor"));
		
		
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonCancelarToolBarEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"CancelarToolBarEvaluacionProveedor"));
					
		this.jInternalFrameDetalleFormEvaluacionProveedor.jMenuItemCancelarEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEvaluacionProveedor"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEvaluacionProveedor.jMenuItemDetalleCerrarEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEvaluacionProveedor"));		
		
		
		
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonGuardarCambiosToolBarEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEvaluacionProveedor"));
		
		
		
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonGuardarCambiosToolBarEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEvaluacionProveedor"));
		
		
		
		this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxTiposAccionesFormularioEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEvaluacionProveedor"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonidEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"idEvaluacionProveedorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonid_empresaEvaluacionProveedorUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEvaluacionProveedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonid_empresaEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEvaluacionProveedorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonid_sucursalEvaluacionProveedorUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalEvaluacionProveedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonid_sucursalEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalEvaluacionProveedorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonid_ejercicioEvaluacionProveedorUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioEvaluacionProveedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonid_ejercicioEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioEvaluacionProveedorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonid_periodoEvaluacionProveedorUpdate.addActionListener(new ButtonActionListener(this,"id_periodoEvaluacionProveedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonid_periodoEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoEvaluacionProveedorBusqueda"));
		//jButtonid_clienteEvaluacionProveedor.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteEvaluacionProveedorActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonid_clienteEvaluacionProveedor.addActionListener(new ButtonActionListener(this,"id_clienteEvaluacionProveedor"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonid_clienteEvaluacionProveedorUpdate.addActionListener(new ButtonActionListener(this,"id_clienteEvaluacionProveedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonid_clienteEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteEvaluacionProveedorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonfechaEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"fechaEvaluacionProveedorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtoncontactoEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"contactoEvaluacionProveedorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonevaluadoEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"evaluadoEvaluacionProveedorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonresultadoEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"resultadoEvaluacionProveedorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonresponsableEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"responsableEvaluacionProveedorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonfecha_desdeEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdeEvaluacionProveedorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonfecha_hastaEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaEvaluacionProveedorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonobservacionEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"observacionEvaluacionProveedorBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEvaluacionProveedor.jTabbedPaneRelacionesEvaluacionProveedor.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEvaluacionProveedor"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEvaluacionProveedor"));
		
		if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionProveedor.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEvaluacionProveedor"));
		}
		
		this.jTableDatosEvaluacionProveedor.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEvaluacionProveedor"));
		
		this.jTableDatosEvaluacionProveedor.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEvaluacionProveedor"));
		
		this.jButtonNuevoEvaluacionProveedor.addActionListener(new ButtonActionListener(this,"NuevoEvaluacionProveedor"));
		
		this.jButtonDuplicarEvaluacionProveedor.addActionListener(new ButtonActionListener(this,"DuplicarEvaluacionProveedor"));
		
		this.jButtonCopiarEvaluacionProveedor.addActionListener(new ButtonActionListener(this,"CopiarEvaluacionProveedor"));
		
		this.jButtonVerFormEvaluacionProveedor.addActionListener(new ButtonActionListener(this,"VerFormEvaluacionProveedor"));
		
		
		this.jButtonNuevoToolBarEvaluacionProveedor.addActionListener(new ButtonActionListener(this,"NuevoToolBarEvaluacionProveedor"));
			
		this.jButtonDuplicarToolBarEvaluacionProveedor.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEvaluacionProveedor"));
			
		this.jMenuItemNuevoEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEvaluacionProveedor"));
			
		this.jMenuItemDuplicarEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEvaluacionProveedor"));		
		
		
		this.jButtonNuevoRelacionesEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEvaluacionProveedor"));
		
		
		this.jButtonNuevoRelacionesToolBarEvaluacionProveedor.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEvaluacionProveedor"));
			
		this.jMenuItemNuevoRelacionesEvaluacionProveedor.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEvaluacionProveedor"));		
		
		
		if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonModificarEvaluacionProveedor.addActionListener(new ButtonActionListener(this,"ModificarEvaluacionProveedor"));
		}
		
		
		if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonModificarToolBarEvaluacionProveedor.addActionListener(new ButtonActionListener(this,"ModificarToolBarEvaluacionProveedor"));
			
			this.jInternalFrameDetalleFormEvaluacionProveedor.jMenuItemModificarEvaluacionProveedor.addActionListener(new ButtonActionListener(this,"MenuItemModificarEvaluacionProveedor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonActualizarEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"ActualizarEvaluacionProveedor"));
		}
		
		
		if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonActualizarToolBarEvaluacionProveedor.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEvaluacionProveedor"));
				
			this.jInternalFrameDetalleFormEvaluacionProveedor.jMenuItemActualizarEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEvaluacionProveedor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonEliminarEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"EliminarEvaluacionProveedor"));
		}
		
		
		if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonEliminarToolBarEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"EliminarToolBarEvaluacionProveedor"));
						
			this.jInternalFrameDetalleFormEvaluacionProveedor.jMenuItemEliminarEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEvaluacionProveedor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonCancelarEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"CancelarEvaluacionProveedor"));
		}
		
		
		if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonCancelarToolBarEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"CancelarToolBarEvaluacionProveedor"));
			
			this.jInternalFrameDetalleFormEvaluacionProveedor.jMenuItemCancelarEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEvaluacionProveedor"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEvaluacionProveedor"));		
		
		
		this.jButtonCerrarEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"CerrarEvaluacionProveedor"));
		
		
		this.jButtonCerrarToolBarEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"CerrarToolBarEvaluacionProveedor"));
			
		this.jMenuItemCerrarEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEvaluacionProveedor"));
			
		if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionProveedor.jMenuItemDetalleCerrarEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEvaluacionProveedor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonGuardarCambiosEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"GuardarCambiosEvaluacionProveedor"));
		}
		
		
		if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonGuardarCambiosToolBarEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEvaluacionProveedor"));
		}
		
		this.jButtonCopiarToolBarEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"CopiarToolBarEvaluacionProveedor"));
			
		this.jButtonVerFormToolBarEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"VerFormToolBarEvaluacionProveedor"));
		
		this.jMenuItemGuardarCambiosEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEvaluacionProveedor"));
			
		this.jMenuItemCopiarEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEvaluacionProveedor"));		
		
		this.jMenuItemVerFormEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEvaluacionProveedor"));		
		
		
		this.jButtonGuardarCambiosTablaEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEvaluacionProveedor"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEvaluacionProveedor"));
			
		this.jMenuItemGuardarCambiosTablaEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEvaluacionProveedor"));		
		
		
		
		this.jButtonRecargarInformacionEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"RecargarInformacionEvaluacionProveedor"));
					
		this.jButtonRecargarInformacionToolBarEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEvaluacionProveedor"));
		
		this.jMenuItemRecargarInformacionEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEvaluacionProveedor"));		
		
		
		
		this.jButtonAnterioresEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"AnterioresEvaluacionProveedor"));
		
		
		this.jButtonAnterioresToolBarEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEvaluacionProveedor"));
		
		this.jMenuItemAnterioresEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEvaluacionProveedor"));		
		
		
		this.jButtonSiguientesEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"SiguientesEvaluacionProveedor"));
		
		
		this.jButtonSiguientesToolBarEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEvaluacionProveedor"));
			
		this.jMenuItemSiguientesEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEvaluacionProveedor"));
			
		this.jMenuItemAbrirOrderByEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEvaluacionProveedor"));
			
		this.jMenuItemMostrarOcultarEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEvaluacionProveedor"));
			
		this.jMenuItemDetalleAbrirOrderByEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEvaluacionProveedor"));
			
		this.jMenuItemDetalleMostarOcultarEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEvaluacionProveedor"));		
		
		
		this.jButtonNuevoGuardarCambiosEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEvaluacionProveedor"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEvaluacionProveedor"));
			
		this.jMenuItemNuevoGuardarCambiosEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEvaluacionProveedor"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEvaluacionProveedor.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEvaluacionProveedor"));

		this.jCheckBoxSeleccionadosEvaluacionProveedor.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEvaluacionProveedor"));
		
		if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxTiposAccionesFormularioEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEvaluacionProveedor"));
		}
		
		
		this.jComboBoxTiposRelacionesEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"TiposRelacionesEvaluacionProveedor"));
			
		this.jComboBoxTiposAccionesEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"TiposAccionesEvaluacionProveedor"));
					
		this.jComboBoxTiposSeleccionarEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEvaluacionProveedor"));
			
		this.jTextFieldValorCampoGeneralEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEvaluacionProveedor"));		
		
		
		if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonidEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"idEvaluacionProveedorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonid_empresaEvaluacionProveedorUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEvaluacionProveedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonid_empresaEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEvaluacionProveedorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonid_sucursalEvaluacionProveedorUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalEvaluacionProveedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonid_sucursalEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalEvaluacionProveedorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonid_ejercicioEvaluacionProveedorUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioEvaluacionProveedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonid_ejercicioEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioEvaluacionProveedorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonid_periodoEvaluacionProveedorUpdate.addActionListener(new ButtonActionListener(this,"id_periodoEvaluacionProveedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonid_periodoEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoEvaluacionProveedorBusqueda"));
		//jButtonid_clienteEvaluacionProveedor.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteEvaluacionProveedorActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonid_clienteEvaluacionProveedor.addActionListener(new ButtonActionListener(this,"id_clienteEvaluacionProveedor"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonid_clienteEvaluacionProveedorUpdate.addActionListener(new ButtonActionListener(this,"id_clienteEvaluacionProveedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonid_clienteEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteEvaluacionProveedorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonfechaEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"fechaEvaluacionProveedorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtoncontactoEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"contactoEvaluacionProveedorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonevaluadoEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"evaluadoEvaluacionProveedorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonresultadoEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"resultadoEvaluacionProveedorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonresponsableEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"responsableEvaluacionProveedorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonfecha_desdeEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdeEvaluacionProveedorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonfecha_hastaEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaEvaluacionProveedorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonobservacionEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"observacionEvaluacionProveedorBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdClienteEvaluacionProveedor.addActionListener(new ButtonActionListener(this,"FK_IdClienteEvaluacionProveedor"));

			this.jButtonBuscarFK_IdClienteid_clienteEvaluacionProveedor.addActionListener(new ButtonActionListener(this,"id_clienteEvaluacionProveedor"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEvaluacionProveedor!=null) {
				this.jInternalFrameReporteDinamicoEvaluacionProveedor.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEvaluacionProveedor"));
				this.jInternalFrameReporteDinamicoEvaluacionProveedor.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEvaluacionProveedor"));
				this.jInternalFrameReporteDinamicoEvaluacionProveedor.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEvaluacionProveedor"));
			}
			
			//this.jButtonCerrarReporteDinamicoEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEvaluacionProveedor"));				
			//this.jButtonGenerarReporteDinamicoEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEvaluacionProveedor"));
			//this.jButtonGenerarExcelReporteDinamicoEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEvaluacionProveedor"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEvaluacionProveedor!=null) {
				this.jInternalFrameImportacionEvaluacionProveedor.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEvaluacionProveedor"));
				this.jInternalFrameImportacionEvaluacionProveedor.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEvaluacionProveedor"));
				this.jInternalFrameImportacionEvaluacionProveedor.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEvaluacionProveedor"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"AbrirOrderByEvaluacionProveedor"));
			
			this.jButtonAbrirOrderByToolBarEvaluacionProveedor.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEvaluacionProveedor"));			
			
			if(this.jInternalFrameOrderByEvaluacionProveedor!=null) {
				this.jInternalFrameOrderByEvaluacionProveedor.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEvaluacionProveedor"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEvaluacionProveedor.jTabbedPaneRelacionesEvaluacionProveedor.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEvaluacionProveedor"));
		
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
            		closingInternalFrameEvaluacionProveedor();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEvaluacionProveedor.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEvaluacionProveedor = (JInternalFrameBase)event.getSource();
	            	
	            EvaluacionProveedorBeanSwingJInternalFrame jInternalFrameParent=(EvaluacionProveedorBeanSwingJInternalFrame)jInternalFrameDetalleFormEvaluacionProveedor.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEvaluacionProveedorActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEvaluacionProveedor.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEvaluacionProveedorListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEvaluacionProveedor.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEvaluacionProveedor.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEvaluacionProveedorActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEvaluacionProveedorActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEvaluacionProveedorActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEvaluacionProveedor";
		inputMap = this.jButtonNuevoEvaluacionProveedor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEvaluacionProveedor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEvaluacionProveedorActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEvaluacionProveedorActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEvaluacionProveedorActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEvaluacionProveedorActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEvaluacionProveedor";
		inputMap = this.jButtonNuevoRelacionesEvaluacionProveedor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEvaluacionProveedor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEvaluacionProveedorActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEvaluacionProveedor";
		inputMap = this.jButtonModificarEvaluacionProveedor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEvaluacionProveedor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEvaluacionProveedorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEvaluacionProveedor";
		inputMap = this.jButtonActualizarEvaluacionProveedor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEvaluacionProveedor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEvaluacionProveedorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEvaluacionProveedor";
		inputMap = this.jButtonEliminarEvaluacionProveedor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEvaluacionProveedor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEvaluacionProveedorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEvaluacionProveedor";
		inputMap = this.jButtonCancelarEvaluacionProveedor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEvaluacionProveedor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEvaluacionProveedorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEvaluacionProveedor";
		inputMap = this.jButtonCerrarEvaluacionProveedor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEvaluacionProveedor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEvaluacionProveedorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonGuardarCambiosEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEvaluacionProveedor";
		inputMap = this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonGuardarCambiosEvaluacionProveedor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonGuardarCambiosEvaluacionProveedor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEvaluacionProveedorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEvaluacionProveedor.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEvaluacionProveedorItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEvaluacionProveedor.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEvaluacionProveedorActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEvaluacionProveedor.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEvaluacionProveedorActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEvaluacionProveedor.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEvaluacionProveedorActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonidEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"idEvaluacionProveedorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonid_empresaEvaluacionProveedorUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEvaluacionProveedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonid_empresaEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEvaluacionProveedorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonid_sucursalEvaluacionProveedorUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalEvaluacionProveedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonid_sucursalEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalEvaluacionProveedorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonid_ejercicioEvaluacionProveedorUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioEvaluacionProveedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonid_ejercicioEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioEvaluacionProveedorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonid_periodoEvaluacionProveedorUpdate.addActionListener(new ButtonActionListener(this,"id_periodoEvaluacionProveedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonid_periodoEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoEvaluacionProveedorBusqueda"));
		//jButtonid_clienteEvaluacionProveedor.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteEvaluacionProveedorActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonid_clienteEvaluacionProveedor.addActionListener(new ButtonActionListener(this,"id_clienteEvaluacionProveedor"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonid_clienteEvaluacionProveedorUpdate.addActionListener(new ButtonActionListener(this,"id_clienteEvaluacionProveedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonid_clienteEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteEvaluacionProveedorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonfechaEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"fechaEvaluacionProveedorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtoncontactoEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"contactoEvaluacionProveedorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonevaluadoEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"evaluadoEvaluacionProveedorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonresultadoEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"resultadoEvaluacionProveedorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonresponsableEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"responsableEvaluacionProveedorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonfecha_desdeEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdeEvaluacionProveedorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonfecha_hastaEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaEvaluacionProveedorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonobservacionEvaluacionProveedorBusqueda.addActionListener(new ButtonActionListener(this,"observacionEvaluacionProveedorBusqueda"));
		
		
		this.jButtonFK_IdClienteEvaluacionProveedor.addActionListener(new ButtonActionListener(this,"FK_IdClienteEvaluacionProveedor"));

		this.jButtonBuscarFK_IdClienteid_clienteEvaluacionProveedor.addActionListener(new ButtonActionListener(this,"id_clienteEvaluacionProveedor"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEvaluacionProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEvaluacionProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEvaluacionProveedorActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEvaluacionProveedor.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEvaluacionProveedor(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EvaluacionProveedor evaluacionproveedorAux:this.evaluacionproveedorLogic.getEvaluacionProveedors()) {
					evaluacionproveedorAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EvaluacionProveedor evaluacionproveedorAux:evaluacionproveedors) {
					evaluacionproveedorAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEvaluacionProveedorItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEvaluacionProveedor(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EvaluacionProveedor evaluacionproveedorAux:this.evaluacionproveedorLogic.getEvaluacionProveedors()) {
						evaluacionproveedorAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EvaluacionProveedor evaluacionproveedorAux:evaluacionproveedors) {
						evaluacionproveedorAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EvaluacionProveedor evaluacionproveedorAux:this.evaluacionproveedorLogic.getEvaluacionProveedors()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EvaluacionProveedor evaluacionproveedorAux:evaluacionproveedors) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEvaluacionProveedor(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEvaluacionProveedor.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEvaluacionProveedor.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionProveedor,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEvaluacionProveedorItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEvaluacionProveedor(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEvaluacionProveedor.getSelectedRows();
			
			EvaluacionProveedor evaluacionproveedorLocal=new EvaluacionProveedor();
			
			//this.seleccionarTodosEvaluacionProveedor(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					evaluacionproveedorLocal =(EvaluacionProveedor) this.evaluacionproveedorLogic.getEvaluacionProveedors().toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					evaluacionproveedorLocal =(EvaluacionProveedor) this.evaluacionproveedors.toArray()[this.jTableDatosEvaluacionProveedor.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				evaluacionproveedorLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EvaluacionProveedor evaluacionproveedorAux:this.evaluacionproveedorLogic.getEvaluacionProveedors()) {
						evaluacionproveedorAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EvaluacionProveedor evaluacionproveedorAux:evaluacionproveedors) {
						evaluacionproveedorAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEvaluacionProveedor(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEvaluacionProveedor.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEvaluacionProveedor.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEvaluacionProveedor,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEvaluacionProveedorItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEvaluacionProveedorParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEvaluacionProveedorActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEvaluacionProveedor(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEvaluacionProveedor.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EvaluacionProveedor evaluacionproveedorAux:this.evaluacionproveedorLogic.getEvaluacionProveedors()) {
				
						if(sTipoSeleccionar.equals(EvaluacionProveedorConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							evaluacionproveedorAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EvaluacionProveedorConstantesFunciones.LABEL_CONTACTO)) {
							existe=true;
							evaluacionproveedorAux.setcontacto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EvaluacionProveedorConstantesFunciones.LABEL_EVALUADO)) {
							existe=true;
							evaluacionproveedorAux.setevaluado(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EvaluacionProveedorConstantesFunciones.LABEL_RESULTADO)) {
							existe=true;
							evaluacionproveedorAux.setresultado(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EvaluacionProveedorConstantesFunciones.LABEL_RESPONSABLE)) {
							existe=true;
							evaluacionproveedorAux.setresponsable(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EvaluacionProveedorConstantesFunciones.LABEL_FECHADESDE)) {
							existe=true;
							evaluacionproveedorAux.setfecha_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EvaluacionProveedorConstantesFunciones.LABEL_FECHAHASTA)) {
							existe=true;
							evaluacionproveedorAux.setfecha_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EvaluacionProveedorConstantesFunciones.LABEL_OBSERVACION)) {
							existe=true;
							evaluacionproveedorAux.setobservacion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EvaluacionProveedor evaluacionproveedorAux:evaluacionproveedors) {
					
						if(sTipoSeleccionar.equals(EvaluacionProveedorConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							evaluacionproveedorAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EvaluacionProveedorConstantesFunciones.LABEL_CONTACTO)) {
							existe=true;
							evaluacionproveedorAux.setcontacto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EvaluacionProveedorConstantesFunciones.LABEL_EVALUADO)) {
							existe=true;
							evaluacionproveedorAux.setevaluado(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EvaluacionProveedorConstantesFunciones.LABEL_RESULTADO)) {
							existe=true;
							evaluacionproveedorAux.setresultado(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EvaluacionProveedorConstantesFunciones.LABEL_RESPONSABLE)) {
							existe=true;
							evaluacionproveedorAux.setresponsable(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EvaluacionProveedorConstantesFunciones.LABEL_FECHADESDE)) {
							existe=true;
							evaluacionproveedorAux.setfecha_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EvaluacionProveedorConstantesFunciones.LABEL_FECHAHASTA)) {
							existe=true;
							evaluacionproveedorAux.setfecha_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EvaluacionProveedorConstantesFunciones.LABEL_OBSERVACION)) {
							existe=true;
							evaluacionproveedorAux.setobservacion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEvaluacionProveedor(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEvaluacionProveedorActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEvaluacionProveedor(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEvaluacionProveedor=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEvaluacionProveedor.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxTiposAccionesFormularioEvaluacionProveedor.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEvaluacionProveedor) {				
					conSplash=true;//false;										
					
					//this.startProcessEvaluacionProveedor(conSplash);
				
					this.generarReporteEvaluacionProveedorsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEvaluacionProveedor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxTiposAccionesFormularioEvaluacionProveedor.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEvaluacionProveedorsSeleccionados();
				//this.jComboBoxTiposAccionesEvaluacionProveedor.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEvaluacionProveedorsSeleccionados(false);
				//this.jComboBoxTiposAccionesEvaluacionProveedor.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEvaluacionProveedorsSeleccionados(true);
				//this.jComboBoxTiposAccionesEvaluacionProveedor.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEvaluacionProveedor();
				
				this.exportarEvaluacionProveedorsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEvaluacionProveedor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxTiposAccionesFormularioEvaluacionProveedor.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEvaluacionProveedors();
				//this.importarEvaluacionProveedors();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEvaluacionProveedor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxTiposAccionesFormularioEvaluacionProveedor.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEvaluacionProveedor();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEvaluacionProveedorsSeleccionados();
				//this.jComboBoxTiposAccionesEvaluacionProveedor.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Evaluacion Proveedor", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEvaluacionProveedor();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEvaluacionProveedor)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEvaluacionProveedor(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Evaluacion Proveedor",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEvaluacionProveedor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxTiposAccionesFormularioEvaluacionProveedor.setSelectedIndex(0);					
				}	
			} 			
			else if(EvaluacionProveedorBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteEvaluacionProveedor) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessEvaluacionProveedor(conSplash);
					
						//this.actualizarParametrosGeneralEvaluacionProveedor();
						
						this.generarReporteProcesoAccionEvaluacionProveedorsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesEvaluacionProveedor.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxTiposAccionesFormularioEvaluacionProveedor.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(EvaluacionProveedorBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Evaluacion ProveedorES SELECCIONADOS?", "MANTENIMIENTO DE Evaluacion Proveedor", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessEvaluacionProveedor();
				
						this.actualizarParametrosGeneralEvaluacionProveedor();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.evaluacionproveedorReturnGeneral=evaluacionproveedorLogic.procesarAccionEvaluacionProveedorsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.evaluacionproveedorLogic.getEvaluacionProveedors(),this.evaluacionproveedorParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarEvaluacionProveedorReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEvaluacionProveedor.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxTiposAccionesFormularioEvaluacionProveedor.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEvaluacionProveedor();
					
					EvaluacionProveedorBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarEvaluacionProveedorReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEvaluacionProveedor.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxTiposAccionesFormularioEvaluacionProveedor.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEvaluacionProveedor(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEvaluacionProveedorActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEvaluacionProveedor();
			
			if(this.jInternalFrameDetalleFormEvaluacionProveedor==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EvaluacionProveedor> evaluacionproveedorsSeleccionados=new ArrayList<EvaluacionProveedor>();		
			EvaluacionProveedor evaluacionproveedor=new EvaluacionProveedor();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEvaluacionProveedor(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEvaluacionProveedor.getSelectedItem();
			
			
			
			
			evaluacionproveedorsSeleccionados=this.getEvaluacionProveedorsSeleccionados(true);
			//this.sTipoAccion;
			
			if(evaluacionproveedorsSeleccionados.size()==1) {
				for(EvaluacionProveedor evaluacionproveedorAux:evaluacionproveedorsSeleccionados) {
					evaluacionproveedor=evaluacionproveedorAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Detalle Evaluacion Proveedor")) {
					jButtonDetalleEvaluacionProveedorActionPerformed(null,rowIndex,true,false,evaluacionproveedor);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEvaluacionProveedor();
			
      		//this.finishProcessEvaluacionProveedor(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEvaluacionProveedorReturnGeneral() throws Exception {
		if(this.evaluacionproveedorReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.evaluacionproveedorReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.evaluacionproveedorReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.evaluacionproveedorReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.evaluacionproveedorReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.evaluacionproveedorReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEvaluacionProveedor(false);
		}
		
		if(this.evaluacionproveedorReturnGeneral.getConRetornoLista() || this.evaluacionproveedorReturnGeneral.getConRetornoObjeto()) {
			if(this.evaluacionproveedorReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.evaluacionproveedorLogic.setEvaluacionProveedors(this.evaluacionproveedorReturnGeneral.getEvaluacionProveedors());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.evaluacionproveedorReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.evaluacionproveedorLogic.setEvaluacionProveedor(this.evaluacionproveedorReturnGeneral.getEvaluacionProveedor());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEvaluacionProveedor(false);
		}
	}
	
	public void actualizarParametrosGeneralEvaluacionProveedor() throws Exception {
		
		
	}
	
	public ArrayList<EvaluacionProveedor> getEvaluacionProveedorsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EvaluacionProveedor> evaluacionproveedorsSeleccionados=new ArrayList<EvaluacionProveedor>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEvaluacionProveedor) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EvaluacionProveedor evaluacionproveedorAux:evaluacionproveedorLogic.getEvaluacionProveedors()) {
					if(evaluacionproveedorAux.getIsSelected()) {
						evaluacionproveedorsSeleccionados.add(evaluacionproveedorAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EvaluacionProveedor evaluacionproveedorAux:this.evaluacionproveedors) {
					if(evaluacionproveedorAux.getIsSelected()) {
						evaluacionproveedorsSeleccionados.add(evaluacionproveedorAux);				
					}
				}
			}
			
			if(evaluacionproveedorsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						evaluacionproveedorsSeleccionados.addAll(this.evaluacionproveedorLogic.getEvaluacionProveedors());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						evaluacionproveedorsSeleccionados.addAll(this.evaluacionproveedors);				
					}
				}
			}
		} else {
			evaluacionproveedorsSeleccionados.add(this.evaluacionproveedor);
		}
		
		return evaluacionproveedorsSeleccionados;
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
	
	public void generarReporteEvaluacionProveedorsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEvaluacionProveedorsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEvaluacionProveedorsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEvaluacionProveedorsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEvaluacionProveedorsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesEvaluacionProveedorsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Evaluacion Proveedor",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEvaluacionProveedorsSeleccionados() throws Exception {
		ArrayList<EvaluacionProveedor> evaluacionproveedorsSeleccionados=new ArrayList<EvaluacionProveedor>();		
		
		evaluacionproveedorsSeleccionados=this.getEvaluacionProveedorsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEvaluacionProveedors("Todos",evaluacionproveedorsSeleccionados);
		
	}	
	
	public void generarReporteNormalEvaluacionProveedorsSeleccionados() throws Exception {
		ArrayList<EvaluacionProveedor> evaluacionproveedorsSeleccionados=new ArrayList<EvaluacionProveedor>();		
		
		evaluacionproveedorsSeleccionados=this.getEvaluacionProveedorsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEvaluacionProveedors("Todos",evaluacionproveedorsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEvaluacionProveedorsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EvaluacionProveedor> evaluacionproveedorsSeleccionados=new ArrayList<EvaluacionProveedor>();
		
		evaluacionproveedorsSeleccionados=this.getEvaluacionProveedorsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEvaluacionProveedors("Todos",evaluacionproveedorsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEvaluacionProveedorsSeleccionados() throws Exception {
		ArrayList<EvaluacionProveedor> evaluacionproveedorsSeleccionados=new ArrayList<EvaluacionProveedor>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEvaluacionProveedor();
		
		
		evaluacionproveedorsSeleccionados=this.getEvaluacionProveedorsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEvaluacionProveedor();
		
		
		//this.generarReporteEvaluacionProveedors("Todos",evaluacionproveedorsSeleccionados ,evaluacionproveedorImplementable,evaluacionproveedorImplementableHome);
	}
	
	public void mostrarImportacionEvaluacionProveedors() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEvaluacionProveedor();
		
		this.abrirFrameImportacionEvaluacionProveedor();		
		
			
		//this.generarReporteEvaluacionProveedors("Todos",evaluacionproveedorsSeleccionados ,evaluacionproveedorImplementable,evaluacionproveedorImplementableHome);
	}
	
	public void importarEvaluacionProveedors() throws Exception {		
	
	}
	
	public void exportarEvaluacionProveedorsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEvaluacionProveedorsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEvaluacionProveedorsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEvaluacionProveedorsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Evaluacion Proveedor",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEvaluacionProveedorsSeleccionados() throws Exception {
		ArrayList<EvaluacionProveedor> evaluacionproveedorsSeleccionados=new ArrayList<EvaluacionProveedor>();		
		
		evaluacionproveedorsSeleccionados=this.getEvaluacionProveedorsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"evaluacionproveedor."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEvaluacionProveedor(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EvaluacionProveedor evaluacionproveedorAux:evaluacionproveedorsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEvaluacionProveedor(evaluacionproveedorAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//evaluacionproveedorAux.setsDetalleGeneralEntityReporte(evaluacionproveedorAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.evaluacionproveedorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Evaluacion Proveedor",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEvaluacionProveedor(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EvaluacionProveedorConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionProveedorConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionProveedorConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionProveedorConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionProveedorConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionProveedorConstantesFunciones.LABEL_IDPERIODO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionProveedorConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionProveedorConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionProveedorConstantesFunciones.LABEL_CONTACTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionProveedorConstantesFunciones.LABEL_EVALUADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionProveedorConstantesFunciones.LABEL_RESULTADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionProveedorConstantesFunciones.LABEL_RESPONSABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionProveedorConstantesFunciones.LABEL_FECHADESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionProveedorConstantesFunciones.LABEL_FECHAHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EvaluacionProveedorConstantesFunciones.LABEL_OBSERVACION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEvaluacionProveedor(EvaluacionProveedor evaluacionproveedor,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=evaluacionproveedor.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionproveedor.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionproveedor.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionproveedor.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionproveedor.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionproveedor.getperiodo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionproveedor.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionproveedor.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionproveedor.getcontacto();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionproveedor.getevaluado();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionproveedor.getresultado();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionproveedor.getresponsable();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionproveedor.getfecha_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionproveedor.getfecha_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=evaluacionproveedor.getobservacion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEvaluacionProveedorsSeleccionados() throws Exception {
		ArrayList<EvaluacionProveedor> evaluacionproveedorsSeleccionados=new ArrayList<EvaluacionProveedor>();		
		
		evaluacionproveedorsSeleccionados=this.getEvaluacionProveedorsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"evaluacionproveedor.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EvaluacionProveedors");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEvaluacionProveedor(row);				
				iRow++;
			}				
			
			for(EvaluacionProveedor evaluacionproveedorAux:evaluacionproveedorsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEvaluacionProveedor(evaluacionproveedorAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.evaluacionproveedorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Evaluacion Proveedor",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEvaluacionProveedorsSeleccionados() throws Exception {
		ArrayList<EvaluacionProveedor> evaluacionproveedorsSeleccionados=new ArrayList<EvaluacionProveedor>();		
		
		evaluacionproveedorsSeleccionados=this.getEvaluacionProveedorsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"evaluacionproveedor.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("evaluacionproveedors");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("evaluacionproveedor");
			//elementRoot.appendChild(element);
		
			for(EvaluacionProveedor evaluacionproveedorAux:evaluacionproveedorsSeleccionados) {
				element = document.createElement("evaluacionproveedor");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEvaluacionProveedor(evaluacionproveedorAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.evaluacionproveedorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Evaluacion Proveedor",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEvaluacionProveedor(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionProveedorConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionProveedorConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionProveedorConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionProveedorConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionProveedorConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionProveedorConstantesFunciones.LABEL_IDPERIODO);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionProveedorConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionProveedorConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionProveedorConstantesFunciones.LABEL_CONTACTO);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionProveedorConstantesFunciones.LABEL_EVALUADO);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionProveedorConstantesFunciones.LABEL_RESULTADO);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionProveedorConstantesFunciones.LABEL_RESPONSABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionProveedorConstantesFunciones.LABEL_FECHADESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionProveedorConstantesFunciones.LABEL_FECHAHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(EvaluacionProveedorConstantesFunciones.LABEL_OBSERVACION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEvaluacionProveedor(EvaluacionProveedor evaluacionproveedor,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionproveedor.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionproveedor.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionproveedor.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionproveedor.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionproveedor.getperiodo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionproveedor.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionproveedor.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionproveedor.getcontacto());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionproveedor.getevaluado());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionproveedor.getresultado());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionproveedor.getresponsable());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionproveedor.getfecha_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionproveedor.getfecha_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(evaluacionproveedor.getobservacion());				
	}
	
	public void setFilaDatosExportarXmlEvaluacionProveedor(EvaluacionProveedor evaluacionproveedor,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EvaluacionProveedorConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(evaluacionproveedor.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EvaluacionProveedorConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(evaluacionproveedor.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(EvaluacionProveedorConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(evaluacionproveedor.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(EvaluacionProveedorConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(evaluacionproveedor.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementejercicio_descripcion = document.createElement(EvaluacionProveedorConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(evaluacionproveedor.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementperiodo_descripcion = document.createElement(EvaluacionProveedorConstantesFunciones.IDPERIODO);
		elementperiodo_descripcion.appendChild(document.createTextNode(evaluacionproveedor.getperiodo_descripcion()));
		element.appendChild(elementperiodo_descripcion);

		Element elementcliente_descripcion = document.createElement(EvaluacionProveedorConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(evaluacionproveedor.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementfecha = document.createElement(EvaluacionProveedorConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(evaluacionproveedor.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementcontacto = document.createElement(EvaluacionProveedorConstantesFunciones.CONTACTO);
		elementcontacto.appendChild(document.createTextNode(evaluacionproveedor.getcontacto().trim()));
		element.appendChild(elementcontacto);

		Element elementevaluado = document.createElement(EvaluacionProveedorConstantesFunciones.EVALUADO);
		elementevaluado.appendChild(document.createTextNode(evaluacionproveedor.getevaluado().trim()));
		element.appendChild(elementevaluado);

		Element elementresultado = document.createElement(EvaluacionProveedorConstantesFunciones.RESULTADO);
		elementresultado.appendChild(document.createTextNode(evaluacionproveedor.getresultado().trim()));
		element.appendChild(elementresultado);

		Element elementresponsable = document.createElement(EvaluacionProveedorConstantesFunciones.RESPONSABLE);
		elementresponsable.appendChild(document.createTextNode(evaluacionproveedor.getresponsable().trim()));
		element.appendChild(elementresponsable);

		Element elementfecha_desde = document.createElement(EvaluacionProveedorConstantesFunciones.FECHADESDE);
		elementfecha_desde.appendChild(document.createTextNode(evaluacionproveedor.getfecha_desde().toString().trim()));
		element.appendChild(elementfecha_desde);

		Element elementfecha_hasta = document.createElement(EvaluacionProveedorConstantesFunciones.FECHAHASTA);
		elementfecha_hasta.appendChild(document.createTextNode(evaluacionproveedor.getfecha_hasta().toString().trim()));
		element.appendChild(elementfecha_hasta);

		Element elementobservacion = document.createElement(EvaluacionProveedorConstantesFunciones.OBSERVACION);
		elementobservacion.appendChild(document.createTextNode(evaluacionproveedor.getobservacion().trim()));
		element.appendChild(elementobservacion);
	}
	
	public void generarReporteGroupGenericoEvaluacionProveedorsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EvaluacionProveedor> evaluacionproveedorsSeleccionados=new ArrayList<EvaluacionProveedor>();
		
		evaluacionproveedorsSeleccionados=this.getEvaluacionProveedorsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEvaluacionProveedor(evaluacionproveedorsSeleccionados);
		
		this.generarReporteEvaluacionProveedors("Todos",evaluacionproveedorsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEvaluacionProveedor(ArrayList<EvaluacionProveedor> evaluacionproveedorsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EvaluacionProveedor evaluacionproveedorAux:evaluacionproveedorsSeleccionados) {
				evaluacionproveedorAux.setsDetalleGeneralEntityReporte(evaluacionproveedorAux.toString());
			
				if(sTipoSeleccionar.equals(EvaluacionProveedorConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					evaluacionproveedorAux.setsDescripcionGeneralEntityReporte1(evaluacionproveedorAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EvaluacionProveedorConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					evaluacionproveedorAux.setsDescripcionGeneralEntityReporte1(evaluacionproveedorAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EvaluacionProveedorConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					evaluacionproveedorAux.setsDescripcionGeneralEntityReporte1(evaluacionproveedorAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EvaluacionProveedorConstantesFunciones.LABEL_IDPERIODO)) {
					existe=true;
					evaluacionproveedorAux.setsDescripcionGeneralEntityReporte1(evaluacionproveedorAux.getperiodo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EvaluacionProveedorConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					evaluacionproveedorAux.setsDescripcionGeneralEntityReporte1(evaluacionproveedorAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EvaluacionProveedorConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					evaluacionproveedorAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(evaluacionproveedorAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(EvaluacionProveedorConstantesFunciones.LABEL_CONTACTO)) {
					existe=true;
					evaluacionproveedorAux.setsDescripcionGeneralEntityReporte1(evaluacionproveedorAux.getcontacto());
				}
				 else if(sTipoSeleccionar.equals(EvaluacionProveedorConstantesFunciones.LABEL_EVALUADO)) {
					existe=true;
					evaluacionproveedorAux.setsDescripcionGeneralEntityReporte1(evaluacionproveedorAux.getevaluado());
				}
				 else if(sTipoSeleccionar.equals(EvaluacionProveedorConstantesFunciones.LABEL_RESULTADO)) {
					existe=true;
					evaluacionproveedorAux.setsDescripcionGeneralEntityReporte1(evaluacionproveedorAux.getresultado());
				}
				 else if(sTipoSeleccionar.equals(EvaluacionProveedorConstantesFunciones.LABEL_RESPONSABLE)) {
					existe=true;
					evaluacionproveedorAux.setsDescripcionGeneralEntityReporte1(evaluacionproveedorAux.getresponsable());
				}
				 else if(sTipoSeleccionar.equals(EvaluacionProveedorConstantesFunciones.LABEL_FECHADESDE)) {
					existe=true;
					evaluacionproveedorAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(evaluacionproveedorAux.getfecha_desde()));
				}
				 else if(sTipoSeleccionar.equals(EvaluacionProveedorConstantesFunciones.LABEL_FECHAHASTA)) {
					existe=true;
					evaluacionproveedorAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(evaluacionproveedorAux.getfecha_hasta()));
				}
				 else if(sTipoSeleccionar.equals(EvaluacionProveedorConstantesFunciones.LABEL_OBSERVACION)) {
					existe=true;
					evaluacionproveedorAux.setsDescripcionGeneralEntityReporte1(evaluacionproveedorAux.getobservacion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EvaluacionProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEvaluacionProveedor(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEvaluacionProveedor=true;
				this.isVisibilidadCeldaNuevoRelacionesEvaluacionProveedor=true;
				this.isVisibilidadCeldaGuardarCambiosEvaluacionProveedor=true;
			}
			
			this.isVisibilidadCeldaModificarEvaluacionProveedor=false;
			this.isVisibilidadCeldaActualizarEvaluacionProveedor=false;
			this.isVisibilidadCeldaEliminarEvaluacionProveedor=false;
			this.isVisibilidadCeldaCancelarEvaluacionProveedor=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEvaluacionProveedor=true;
				} else {
					this.isVisibilidadCeldaGuardarEvaluacionProveedor=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEvaluacionProveedor=false;
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionProveedor=false;
			this.isVisibilidadCeldaGuardarCambiosEvaluacionProveedor=false;
			this.isVisibilidadCeldaModificarEvaluacionProveedor=false;
			this.isVisibilidadCeldaActualizarEvaluacionProveedor=true;
			this.isVisibilidadCeldaEliminarEvaluacionProveedor=false;
			this.isVisibilidadCeldaCancelarEvaluacionProveedor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEvaluacionProveedor=true;
				} else {
					this.isVisibilidadCeldaGuardarEvaluacionProveedor=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEvaluacionProveedor=false;
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionProveedor=false;
			this.isVisibilidadCeldaGuardarCambiosEvaluacionProveedor=false;
			this.isVisibilidadCeldaModificarEvaluacionProveedor=false;
			this.isVisibilidadCeldaActualizarEvaluacionProveedor=true;
			this.isVisibilidadCeldaEliminarEvaluacionProveedor=true;
			this.isVisibilidadCeldaCancelarEvaluacionProveedor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEvaluacionProveedor=true;
				} else {
					this.isVisibilidadCeldaGuardarEvaluacionProveedor=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEvaluacionProveedor=false;
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionProveedor=false;
			this.isVisibilidadCeldaGuardarCambiosEvaluacionProveedor=false;
			this.isVisibilidadCeldaModificarEvaluacionProveedor=false;
			this.isVisibilidadCeldaActualizarEvaluacionProveedor=true;
			this.isVisibilidadCeldaEliminarEvaluacionProveedor=false;
			this.isVisibilidadCeldaCancelarEvaluacionProveedor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEvaluacionProveedor=false;
				} else {
					this.isVisibilidadCeldaGuardarEvaluacionProveedor=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEvaluacionProveedor=true;
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionProveedor=true;
			this.isVisibilidadCeldaGuardarCambiosEvaluacionProveedor=true;
			this.isVisibilidadCeldaModificarEvaluacionProveedor=false;
			this.isVisibilidadCeldaActualizarEvaluacionProveedor=false;
			this.isVisibilidadCeldaEliminarEvaluacionProveedor=false;
			this.isVisibilidadCeldaCancelarEvaluacionProveedor=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEvaluacionProveedor=true;
				} else {
					this.isVisibilidadCeldaGuardarEvaluacionProveedor=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEvaluacionProveedor=false;
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionProveedor=false;
			this.isVisibilidadCeldaGuardarCambiosEvaluacionProveedor=false;
			this.isVisibilidadCeldaActualizarEvaluacionProveedor=false;
			this.isVisibilidadCeldaEliminarEvaluacionProveedor=false;
			this.isVisibilidadCeldaCancelarEvaluacionProveedor=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEvaluacionProveedor=false;
				} else {
					this.isVisibilidadCeldaGuardarEvaluacionProveedor=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEvaluacionProveedor=false;
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionProveedor=false;
			this.isVisibilidadCeldaGuardarCambiosEvaluacionProveedor=false;
			this.isVisibilidadCeldaModificarEvaluacionProveedor=true;
			this.isVisibilidadCeldaActualizarEvaluacionProveedor=false;
			this.isVisibilidadCeldaEliminarEvaluacionProveedor=false;
			this.isVisibilidadCeldaCancelarEvaluacionProveedor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEvaluacionProveedor=false;
				} else {
					this.isVisibilidadCeldaGuardarEvaluacionProveedor=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EvaluacionProveedorJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEvaluacionProveedor=true;
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionProveedor=true;
			this.isVisibilidadCeldaGuardarCambiosEvaluacionProveedor=true;
		} else {
			this.actualizarEstadoPanelsEvaluacionProveedor(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEvaluacionProveedor=false;
			//this.isVisibilidadCeldaVerFormEvaluacionProveedor=false;
			this.isVisibilidadCeldaDuplicarEvaluacionProveedor=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!evaluacionproveedorSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionProveedor=false;
		} else {
			this.isVisibilidadCeldaNuevoEvaluacionProveedor=false;
			this.isVisibilidadCeldaGuardarCambiosEvaluacionProveedor=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(evaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
			if(!evaluacionproveedorSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEvaluacionProveedor=false;												
			}
			
			this.jButtonCerrarEvaluacionProveedor.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEvaluacionProveedor=false;
		}
		
		if(!this.permiteMantenimiento(this.evaluacionproveedor)) {
			this.isVisibilidadCeldaActualizarEvaluacionProveedor=false;
			this.isVisibilidadCeldaEliminarEvaluacionProveedor=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEvaluacionProveedor() {
		this.isVisibilidadCeldaNuevoEvaluacionProveedor=false;
		this.isVisibilidadCeldaGuardarCambiosEvaluacionProveedor=false;
	}
	
	public void actualizarEstadoPanelsEvaluacionProveedor(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEvaluacionProveedor!=null) {
				this.jScrollPanelDatosEdicionEvaluacionProveedor.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEvaluacionProveedor!=null) {
				this.jTabbedPaneBusquedasEvaluacionProveedor.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEvaluacionProveedor!=null) {
				this.jScrollPanelDatosEvaluacionProveedor.setVisible(true);
			}
			
			if(this.jPanelPaginacionEvaluacionProveedor!=null) {
				this.jPanelPaginacionEvaluacionProveedor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEvaluacionProveedor!=null) {
				this.jPanelParametrosReportesEvaluacionProveedor.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEvaluacionProveedor!=null) {
				this.jScrollPanelDatosEdicionEvaluacionProveedor.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEvaluacionProveedor!=null) {
				this.jTabbedPaneBusquedasEvaluacionProveedor.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosEvaluacionProveedor!=null) {
				this.jScrollPanelDatosEvaluacionProveedor.setVisible(false);
			}
			
			if(this.jPanelPaginacionEvaluacionProveedor!=null) {
				this.jPanelPaginacionEvaluacionProveedor.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEvaluacionProveedor!=null) {
				this.jPanelParametrosReportesEvaluacionProveedor.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEvaluacionProveedor!=null) {
				this.jScrollPanelDatosEdicionEvaluacionProveedor.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEvaluacionProveedor!=null) {
				this.jTabbedPaneBusquedasEvaluacionProveedor.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEvaluacionProveedor!=null) {
				this.jScrollPanelDatosEvaluacionProveedor.setVisible(false);
			}
			
			if(this.jPanelPaginacionEvaluacionProveedor!=null) {
				this.jPanelPaginacionEvaluacionProveedor.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEvaluacionProveedor!=null) {
				this.jPanelParametrosReportesEvaluacionProveedor.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEvaluacionProveedor!=null) {
				this.jScrollPanelDatosEdicionEvaluacionProveedor.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEvaluacionProveedor!=null) {
				this.jTabbedPaneBusquedasEvaluacionProveedor.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEvaluacionProveedor!=null) {
				this.jScrollPanelDatosEvaluacionProveedor.setVisible(false);
			}
			
			if(this.jPanelPaginacionEvaluacionProveedor!=null) {
				this.jPanelPaginacionEvaluacionProveedor.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEvaluacionProveedor!=null) {
				this.jPanelParametrosReportesEvaluacionProveedor.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEvaluacionProveedor!=null) {
				this.jScrollPanelDatosEdicionEvaluacionProveedor.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEvaluacionProveedor!=null) {
				this.jTabbedPaneBusquedasEvaluacionProveedor.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEvaluacionProveedor!=null) {
				this.jScrollPanelDatosEvaluacionProveedor.setVisible(true);
			}
			
			if(this.jPanelPaginacionEvaluacionProveedor!=null) {
				this.jPanelPaginacionEvaluacionProveedor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEvaluacionProveedor!=null) {
				this.jPanelParametrosReportesEvaluacionProveedor.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEvaluacionProveedor!=null) {
				this.jScrollPanelDatosEdicionEvaluacionProveedor.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEvaluacionProveedor!=null) {
				this.jTabbedPaneBusquedasEvaluacionProveedor.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEvaluacionProveedor!=null) {
				this.jScrollPanelDatosEvaluacionProveedor.setVisible(true);
			}
			
			if(this.jPanelPaginacionEvaluacionProveedor!=null) {
				this.jPanelPaginacionEvaluacionProveedor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEvaluacionProveedor!=null) {
				this.jPanelParametrosReportesEvaluacionProveedor.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEvaluacionProveedor!=null) {
				this.jScrollPanelDatosEdicionEvaluacionProveedor.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEvaluacionProveedor!=null) {
				this.jTabbedPaneBusquedasEvaluacionProveedor.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEvaluacionProveedor!=null) {
				this.jScrollPanelDatosEvaluacionProveedor.setVisible(true);
			}
			
			if(this.jPanelPaginacionEvaluacionProveedor!=null) {
				this.jPanelPaginacionEvaluacionProveedor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEvaluacionProveedor!=null) {
				this.jPanelParametrosReportesEvaluacionProveedor.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.evaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasEvaluacionProveedor!=null) {
					this.jTabbedPaneBusquedasEvaluacionProveedor.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesEvaluacionProveedor!=null) {
				this.jPanelParametrosReportesEvaluacionProveedor.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.evaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEvaluacionProveedor!=null) {
				this.jTabbedPaneBusquedasEvaluacionProveedor.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesEvaluacionProveedor!=null) {
				this.jPanelParametrosReportesEvaluacionProveedor.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCliente=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasEvaluacionProveedor.remove(jPanelFK_IdClienteEvaluacionProveedor);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdCliente=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasEvaluacionProveedor.remove(jPanelFK_IdClienteEvaluacionProveedor);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadFK_IdCliente=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasEvaluacionProveedor.remove(jPanelFK_IdClienteEvaluacionProveedor);}
		}
		
	}

	public void setVisibilidadBusquedasParaPeriodo(Boolean isParaPeriodo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPeriodoNegation=!isParaPeriodo;

			this.isVisibilidadFK_IdCliente=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasEvaluacionProveedor.remove(jPanelFK_IdClienteEvaluacionProveedor);}
		}
		
	}

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadFK_IdCliente=isParaCliente;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasEvaluacionProveedor.remove(jPanelFK_IdClienteEvaluacionProveedor);}
		}
		
	}
	
	

	public String registrarSesionEvaluacionProveedorParaDetalleEvaluacionProveedores() throws Exception {
		Boolean isPaginaPopupDetalleEvaluacionProveedor=false;

		try {

			if(this.evaluacionproveedorSessionBean==null) {
				this.evaluacionproveedorSessionBean=new EvaluacionProveedorSessionBean();
			}

			if(this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorSessionBean==null) {
				this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorSessionBean=new DetalleEvaluacionProveedorSessionBean();
			}

			this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorSessionBean.setsPathNavegacionActual(evaluacionproveedorSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDetalleEvaluacionProveedor=this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDetalleEvaluacionProveedor(true);
			this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleEvaluacionProveedor(EvaluacionProveedorConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorSessionBean.setisBusquedaDesdeForeignKeySesionEvaluacionProveedor(true);
			this.jInternalFrameDetalleFormEvaluacionProveedor.detalleevaluacionproveedorSessionBean.setlidEvaluacionProveedorActual(this.idEvaluacionProveedorActual);

			evaluacionproveedorSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEvaluacionProveedor(true);
			evaluacionproveedorSessionBean.setlIdEvaluacionProveedorActualForeignKey(this.idEvaluacionProveedorActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	

	public String registrarSesionEvaluacionProveedorParaBusquedaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(evaluacionproveedorSessionBean==null) {
				evaluacionproveedorSessionBean=new EvaluacionProveedorSessionBean();
			}

			if(clienteSessionBean==null) {
				clienteSessionBean=new ClienteSessionBean();
			}

			clienteSessionBean.setsPathNavegacionActual(evaluacionproveedorSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			clienteSessionBean.setisPermiteRecargarInformacion(false);
			clienteSessionBean.setisPaginaPopup(true);
			isPaginaPopupCliente=clienteSessionBean.getisPaginaPopup();
			clienteSessionBean.setisPaginaPopup(false);
			clienteSessionBean.setEstaModoBusqueda(true);
			clienteSessionBean.setsFuncionBusquedaRapida("window.opener.evaluacionproveedorFuncionGeneral.setCombosCodigoDesdeBusquedaid_cliente(TO_REPLACE);");
			clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(EvaluacionProveedorConstantesFunciones.SNOMBREOPCION);
			//clienteSessionBean.setisBusquedaDesdeForeignKeySesionEvaluacionProveedor(true);
			//clienteSessionBean.setlidEvaluacionProveedorActual(this.idEvaluacionProveedorActual);

			evaluacionproveedorSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEvaluacionProveedor(true);
			evaluacionproveedorSessionBean.setlIdEvaluacionProveedorActualForeignKey(this.idEvaluacionProveedorActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EvaluacionProveedorSessionBean evaluacionproveedorSessionBean=new EvaluacionProveedorSessionBean();
		
		if(this.evaluacionproveedorSessionBean==null) {
			this.evaluacionproveedorSessionBean=new EvaluacionProveedorSessionBean();
		}
		
		this.evaluacionproveedorSessionBean.setsUltimaBusquedaEvaluacionProveedor(this.getsAccionBusqueda());
		this.evaluacionproveedorSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.evaluacionproveedorSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
			evaluacionproveedorSessionBean.setid_cliente(this.getid_clienteFK_IdCliente());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
			evaluacionproveedorSessionBean.setid_ejercicio(this.getid_ejercicioFK_IdEjercicio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			evaluacionproveedorSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
			evaluacionproveedorSessionBean.setid_periodo(this.getid_periodoFK_IdPeriodo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			evaluacionproveedorSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EvaluacionProveedorSessionBean evaluacionproveedorSessionBean=new EvaluacionProveedorSessionBean();
		
		if(this.evaluacionproveedorSessionBean==null) {
			this.evaluacionproveedorSessionBean=new EvaluacionProveedorSessionBean();
		}
		
		if(this.evaluacionproveedorSessionBean.getsUltimaBusquedaEvaluacionProveedor()!=null&&!this.evaluacionproveedorSessionBean.getsUltimaBusquedaEvaluacionProveedor().equals("")) {
			this.setsAccionBusqueda(evaluacionproveedorSessionBean.getsUltimaBusquedaEvaluacionProveedor());
			this.setiNumeroPaginacion(evaluacionproveedorSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(evaluacionproveedorSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
				this.setid_clienteFK_IdCliente(evaluacionproveedorSessionBean.getid_cliente());
				evaluacionproveedorSessionBean.setid_cliente(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
				this.setid_ejercicioFK_IdEjercicio(evaluacionproveedorSessionBean.getid_ejercicio());
				evaluacionproveedorSessionBean.setid_ejercicio(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(evaluacionproveedorSessionBean.getid_empresa());
				evaluacionproveedorSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
				this.setid_periodoFK_IdPeriodo(evaluacionproveedorSessionBean.getid_periodo());
				evaluacionproveedorSessionBean.setid_periodo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(evaluacionproveedorSessionBean.getid_sucursal());
				evaluacionproveedorSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.evaluacionproveedorSessionBean.setsUltimaBusquedaEvaluacionProveedor("");
		this.evaluacionproveedorSessionBean.setiNumeroPaginacion(EvaluacionProveedorConstantesFunciones.INUMEROPAGINACION);
		this.evaluacionproveedorSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEvaluacionProveedor(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEvaluacionProveedor() {
		this.updateBorderResaltarBusquedasFormularioEvaluacionProveedor();
		this.updateVisibilidadBusquedasFormularioEvaluacionProveedor();
		this.updateHabilitarBusquedasFormularioEvaluacionProveedor();
	}
	
	public void updateBorderResaltarBusquedasFormularioEvaluacionProveedor() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasEvaluacionProveedor.getComponents().length>0) {
	

		if(this.evaluacionproveedorConstantesFunciones.resaltarFK_IdClienteEvaluacionProveedor!=null) {
			index= this.jTabbedPaneBusquedasEvaluacionProveedor.indexOfComponent(this.jPanelFK_IdClienteEvaluacionProveedor);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEvaluacionProveedor.getComponent(index);
				jPanel.setBorder(this.evaluacionproveedorConstantesFunciones.resaltarFK_IdClienteEvaluacionProveedor);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioEvaluacionProveedor() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasEvaluacionProveedor.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEvaluacionProveedor.indexOfComponent(this.jPanelFK_IdClienteEvaluacionProveedor);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEvaluacionProveedor.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.evaluacionproveedorConstantesFunciones.mostrarFK_IdClienteEvaluacionProveedor);
			if(!this.evaluacionproveedorConstantesFunciones.mostrarFK_IdClienteEvaluacionProveedor && index>-1) {
				this.jTabbedPaneBusquedasEvaluacionProveedor.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioEvaluacionProveedor() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasEvaluacionProveedor.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEvaluacionProveedor.indexOfComponent(this.jPanelFK_IdClienteEvaluacionProveedor);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEvaluacionProveedor.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.evaluacionproveedorConstantesFunciones.activarFK_IdClienteEvaluacionProveedor);
				this.jTabbedPaneBusquedasEvaluacionProveedor.setEnabledAt(index,this.evaluacionproveedorConstantesFunciones.activarFK_IdClienteEvaluacionProveedor);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaEvaluacionProveedor(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCliente")) {
			index= this.jTabbedPaneBusquedasEvaluacionProveedor.indexOfComponent(this.jPanelFK_IdClienteEvaluacionProveedor);

			this.jTabbedPaneBusquedasEvaluacionProveedor.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEvaluacionProveedor.getComponent(index);

			this.evaluacionproveedorConstantesFunciones.setResaltarFK_IdClienteEvaluacionProveedor(resaltar);

			jPanel.setBorder(this.evaluacionproveedorConstantesFunciones.resaltarFK_IdClienteEvaluacionProveedor);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarEvaluacionProveedor.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioEvaluacionProveedor() throws Exception {

		if(this.jInternalFrameDetalleFormEvaluacionProveedor==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEvaluacionProveedor();
		this.updateVisibilidadResaltarControlesFormularioEvaluacionProveedor();
		this.updateHabilitarResaltarControlesFormularioEvaluacionProveedor();
		
	}
	
	public void updateBorderResaltarControlesFormularioEvaluacionProveedor() throws Exception {
		if(this.jInternalFrameDetalleFormEvaluacionProveedor==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.evaluacionproveedorConstantesFunciones.resaltaridEvaluacionProveedor!=null && this.jInternalFrameDetalleFormEvaluacionProveedor!=null) {this.jInternalFrameDetalleFormEvaluacionProveedor.jLabelidEvaluacionProveedor.setBorder(this.evaluacionproveedorConstantesFunciones.resaltaridEvaluacionProveedor);}
		if(this.evaluacionproveedorConstantesFunciones.resaltarid_empresaEvaluacionProveedor!=null && this.jInternalFrameDetalleFormEvaluacionProveedor!=null) {this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_empresaEvaluacionProveedor.setBorder(this.evaluacionproveedorConstantesFunciones.resaltarid_empresaEvaluacionProveedor);}
		if(this.evaluacionproveedorConstantesFunciones.resaltarid_sucursalEvaluacionProveedor!=null && this.jInternalFrameDetalleFormEvaluacionProveedor!=null) {this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_sucursalEvaluacionProveedor.setBorder(this.evaluacionproveedorConstantesFunciones.resaltarid_sucursalEvaluacionProveedor);}
		if(this.evaluacionproveedorConstantesFunciones.resaltarid_ejercicioEvaluacionProveedor!=null && this.jInternalFrameDetalleFormEvaluacionProveedor!=null) {this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_ejercicioEvaluacionProveedor.setBorder(this.evaluacionproveedorConstantesFunciones.resaltarid_ejercicioEvaluacionProveedor);}
		if(this.evaluacionproveedorConstantesFunciones.resaltarid_periodoEvaluacionProveedor!=null && this.jInternalFrameDetalleFormEvaluacionProveedor!=null) {this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_periodoEvaluacionProveedor.setBorder(this.evaluacionproveedorConstantesFunciones.resaltarid_periodoEvaluacionProveedor);}
		if(this.evaluacionproveedorConstantesFunciones.resaltarid_clienteEvaluacionProveedor!=null && this.jInternalFrameDetalleFormEvaluacionProveedor!=null) {this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_clienteEvaluacionProveedor.setBorder(this.evaluacionproveedorConstantesFunciones.resaltarid_clienteEvaluacionProveedor);}
		if(this.evaluacionproveedorConstantesFunciones.resaltarfechaEvaluacionProveedor!=null && this.jInternalFrameDetalleFormEvaluacionProveedor!=null) {this.jInternalFrameDetalleFormEvaluacionProveedor.jDateChooserfechaEvaluacionProveedor.setBorder(this.evaluacionproveedorConstantesFunciones.resaltarfechaEvaluacionProveedor);}
		if(this.evaluacionproveedorConstantesFunciones.resaltarcontactoEvaluacionProveedor!=null && this.jInternalFrameDetalleFormEvaluacionProveedor!=null) {this.jInternalFrameDetalleFormEvaluacionProveedor.jTextAreacontactoEvaluacionProveedor.setBorder(this.evaluacionproveedorConstantesFunciones.resaltarcontactoEvaluacionProveedor);}
		if(this.evaluacionproveedorConstantesFunciones.resaltarevaluadoEvaluacionProveedor!=null && this.jInternalFrameDetalleFormEvaluacionProveedor!=null) {this.jInternalFrameDetalleFormEvaluacionProveedor.jTextAreaevaluadoEvaluacionProveedor.setBorder(this.evaluacionproveedorConstantesFunciones.resaltarevaluadoEvaluacionProveedor);}
		if(this.evaluacionproveedorConstantesFunciones.resaltarresultadoEvaluacionProveedor!=null && this.jInternalFrameDetalleFormEvaluacionProveedor!=null) {this.jInternalFrameDetalleFormEvaluacionProveedor.jTextArearesultadoEvaluacionProveedor.setBorder(this.evaluacionproveedorConstantesFunciones.resaltarresultadoEvaluacionProveedor);}
		if(this.evaluacionproveedorConstantesFunciones.resaltarresponsableEvaluacionProveedor!=null && this.jInternalFrameDetalleFormEvaluacionProveedor!=null) {this.jInternalFrameDetalleFormEvaluacionProveedor.jTextArearesponsableEvaluacionProveedor.setBorder(this.evaluacionproveedorConstantesFunciones.resaltarresponsableEvaluacionProveedor);}
		if(this.evaluacionproveedorConstantesFunciones.resaltarfecha_desdeEvaluacionProveedor!=null && this.jInternalFrameDetalleFormEvaluacionProveedor!=null) {this.jInternalFrameDetalleFormEvaluacionProveedor.jDateChooserfecha_desdeEvaluacionProveedor.setBorder(this.evaluacionproveedorConstantesFunciones.resaltarfecha_desdeEvaluacionProveedor);}
		if(this.evaluacionproveedorConstantesFunciones.resaltarfecha_hastaEvaluacionProveedor!=null && this.jInternalFrameDetalleFormEvaluacionProveedor!=null) {this.jInternalFrameDetalleFormEvaluacionProveedor.jDateChooserfecha_hastaEvaluacionProveedor.setBorder(this.evaluacionproveedorConstantesFunciones.resaltarfecha_hastaEvaluacionProveedor);}
		if(this.evaluacionproveedorConstantesFunciones.resaltarobservacionEvaluacionProveedor!=null && this.jInternalFrameDetalleFormEvaluacionProveedor!=null) {this.jInternalFrameDetalleFormEvaluacionProveedor.jTextAreaobservacionEvaluacionProveedor.setBorder(this.evaluacionproveedorConstantesFunciones.resaltarobservacionEvaluacionProveedor);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEvaluacionProveedor() throws Exception {		
		if(this.jInternalFrameDetalleFormEvaluacionProveedor==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) {
	
		//this.jInternalFrameDetalleFormEvaluacionProveedor.jLabelidEvaluacionProveedor.setVisible(this.evaluacionproveedorConstantesFunciones.mostraridEvaluacionProveedor);
		this.jInternalFrameDetalleFormEvaluacionProveedor.jPanelidEvaluacionProveedor.setVisible(this.evaluacionproveedorConstantesFunciones.mostraridEvaluacionProveedor);
		//this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_empresaEvaluacionProveedor.setVisible(this.evaluacionproveedorConstantesFunciones.mostrarid_empresaEvaluacionProveedor);
		this.jInternalFrameDetalleFormEvaluacionProveedor.jPanelid_empresaEvaluacionProveedor.setVisible(this.evaluacionproveedorConstantesFunciones.mostrarid_empresaEvaluacionProveedor);
		//this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_sucursalEvaluacionProveedor.setVisible(this.evaluacionproveedorConstantesFunciones.mostrarid_sucursalEvaluacionProveedor);
		this.jInternalFrameDetalleFormEvaluacionProveedor.jPanelid_sucursalEvaluacionProveedor.setVisible(this.evaluacionproveedorConstantesFunciones.mostrarid_sucursalEvaluacionProveedor);
		//this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_ejercicioEvaluacionProveedor.setVisible(this.evaluacionproveedorConstantesFunciones.mostrarid_ejercicioEvaluacionProveedor);
		this.jInternalFrameDetalleFormEvaluacionProveedor.jPanelid_ejercicioEvaluacionProveedor.setVisible(this.evaluacionproveedorConstantesFunciones.mostrarid_ejercicioEvaluacionProveedor);
		//this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_periodoEvaluacionProveedor.setVisible(this.evaluacionproveedorConstantesFunciones.mostrarid_periodoEvaluacionProveedor);
		this.jInternalFrameDetalleFormEvaluacionProveedor.jPanelid_periodoEvaluacionProveedor.setVisible(this.evaluacionproveedorConstantesFunciones.mostrarid_periodoEvaluacionProveedor);
		//this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_clienteEvaluacionProveedor.setVisible(this.evaluacionproveedorConstantesFunciones.mostrarid_clienteEvaluacionProveedor);
		this.jInternalFrameDetalleFormEvaluacionProveedor.jPanelid_clienteEvaluacionProveedor.setVisible(this.evaluacionproveedorConstantesFunciones.mostrarid_clienteEvaluacionProveedor);
			this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonid_clienteEvaluacionProveedor.setVisible(this.evaluacionproveedorConstantesFunciones.mostrarid_clienteEvaluacionProveedor);
		//this.jInternalFrameDetalleFormEvaluacionProveedor.jDateChooserfechaEvaluacionProveedor.setVisible(this.evaluacionproveedorConstantesFunciones.mostrarfechaEvaluacionProveedor);
		this.jInternalFrameDetalleFormEvaluacionProveedor.jPanelfechaEvaluacionProveedor.setVisible(this.evaluacionproveedorConstantesFunciones.mostrarfechaEvaluacionProveedor);
		//this.jInternalFrameDetalleFormEvaluacionProveedor.jTextAreacontactoEvaluacionProveedor.setVisible(this.evaluacionproveedorConstantesFunciones.mostrarcontactoEvaluacionProveedor);
		this.jInternalFrameDetalleFormEvaluacionProveedor.jPanelcontactoEvaluacionProveedor.setVisible(this.evaluacionproveedorConstantesFunciones.mostrarcontactoEvaluacionProveedor);
		//this.jInternalFrameDetalleFormEvaluacionProveedor.jTextAreaevaluadoEvaluacionProveedor.setVisible(this.evaluacionproveedorConstantesFunciones.mostrarevaluadoEvaluacionProveedor);
		this.jInternalFrameDetalleFormEvaluacionProveedor.jPanelevaluadoEvaluacionProveedor.setVisible(this.evaluacionproveedorConstantesFunciones.mostrarevaluadoEvaluacionProveedor);
		//this.jInternalFrameDetalleFormEvaluacionProveedor.jTextArearesultadoEvaluacionProveedor.setVisible(this.evaluacionproveedorConstantesFunciones.mostrarresultadoEvaluacionProveedor);
		this.jInternalFrameDetalleFormEvaluacionProveedor.jPanelresultadoEvaluacionProveedor.setVisible(this.evaluacionproveedorConstantesFunciones.mostrarresultadoEvaluacionProveedor);
		//this.jInternalFrameDetalleFormEvaluacionProveedor.jTextArearesponsableEvaluacionProveedor.setVisible(this.evaluacionproveedorConstantesFunciones.mostrarresponsableEvaluacionProveedor);
		this.jInternalFrameDetalleFormEvaluacionProveedor.jPanelresponsableEvaluacionProveedor.setVisible(this.evaluacionproveedorConstantesFunciones.mostrarresponsableEvaluacionProveedor);
		//this.jInternalFrameDetalleFormEvaluacionProveedor.jDateChooserfecha_desdeEvaluacionProveedor.setVisible(this.evaluacionproveedorConstantesFunciones.mostrarfecha_desdeEvaluacionProveedor);
		this.jInternalFrameDetalleFormEvaluacionProveedor.jPanelfecha_desdeEvaluacionProveedor.setVisible(this.evaluacionproveedorConstantesFunciones.mostrarfecha_desdeEvaluacionProveedor);
		//this.jInternalFrameDetalleFormEvaluacionProveedor.jDateChooserfecha_hastaEvaluacionProveedor.setVisible(this.evaluacionproveedorConstantesFunciones.mostrarfecha_hastaEvaluacionProveedor);
		this.jInternalFrameDetalleFormEvaluacionProveedor.jPanelfecha_hastaEvaluacionProveedor.setVisible(this.evaluacionproveedorConstantesFunciones.mostrarfecha_hastaEvaluacionProveedor);
		//this.jInternalFrameDetalleFormEvaluacionProveedor.jTextAreaobservacionEvaluacionProveedor.setVisible(this.evaluacionproveedorConstantesFunciones.mostrarobservacionEvaluacionProveedor);
		this.jInternalFrameDetalleFormEvaluacionProveedor.jPanelobservacionEvaluacionProveedor.setVisible(this.evaluacionproveedorConstantesFunciones.mostrarobservacionEvaluacionProveedor);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEvaluacionProveedor() throws Exception {
		if(this.jInternalFrameDetalleFormEvaluacionProveedor==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEvaluacionProveedor!=null) {
	
		this.jInternalFrameDetalleFormEvaluacionProveedor.jLabelidEvaluacionProveedor.setEnabled(this.evaluacionproveedorConstantesFunciones.activaridEvaluacionProveedor);
		this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_empresaEvaluacionProveedor.setEnabled(this.evaluacionproveedorConstantesFunciones.activarid_empresaEvaluacionProveedor);
		this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_sucursalEvaluacionProveedor.setEnabled(this.evaluacionproveedorConstantesFunciones.activarid_sucursalEvaluacionProveedor);
		this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_ejercicioEvaluacionProveedor.setEnabled(this.evaluacionproveedorConstantesFunciones.activarid_ejercicioEvaluacionProveedor);
		this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_periodoEvaluacionProveedor.setEnabled(this.evaluacionproveedorConstantesFunciones.activarid_periodoEvaluacionProveedor);
		this.jInternalFrameDetalleFormEvaluacionProveedor.jComboBoxid_clienteEvaluacionProveedor.setEnabled(this.evaluacionproveedorConstantesFunciones.activarid_clienteEvaluacionProveedor);
			this.jInternalFrameDetalleFormEvaluacionProveedor.jButtonid_clienteEvaluacionProveedor.setEnabled(this.evaluacionproveedorConstantesFunciones.activarid_clienteEvaluacionProveedor);
		this.jInternalFrameDetalleFormEvaluacionProveedor.jDateChooserfechaEvaluacionProveedor.setEnabled(this.evaluacionproveedorConstantesFunciones.activarfechaEvaluacionProveedor);
		this.jInternalFrameDetalleFormEvaluacionProveedor.jTextAreacontactoEvaluacionProveedor.setEnabled(this.evaluacionproveedorConstantesFunciones.activarcontactoEvaluacionProveedor);
		this.jInternalFrameDetalleFormEvaluacionProveedor.jTextAreaevaluadoEvaluacionProveedor.setEnabled(this.evaluacionproveedorConstantesFunciones.activarevaluadoEvaluacionProveedor);
		this.jInternalFrameDetalleFormEvaluacionProveedor.jTextArearesultadoEvaluacionProveedor.setEnabled(this.evaluacionproveedorConstantesFunciones.activarresultadoEvaluacionProveedor);
		this.jInternalFrameDetalleFormEvaluacionProveedor.jTextArearesponsableEvaluacionProveedor.setEnabled(this.evaluacionproveedorConstantesFunciones.activarresponsableEvaluacionProveedor);
		this.jInternalFrameDetalleFormEvaluacionProveedor.jDateChooserfecha_desdeEvaluacionProveedor.setEnabled(this.evaluacionproveedorConstantesFunciones.activarfecha_desdeEvaluacionProveedor);
		this.jInternalFrameDetalleFormEvaluacionProveedor.jDateChooserfecha_hastaEvaluacionProveedor.setEnabled(this.evaluacionproveedorConstantesFunciones.activarfecha_hastaEvaluacionProveedor);
		this.jInternalFrameDetalleFormEvaluacionProveedor.jTextAreaobservacionEvaluacionProveedor.setEnabled(this.evaluacionproveedorConstantesFunciones.activarobservacionEvaluacionProveedor);
		}
	}
	
		
}