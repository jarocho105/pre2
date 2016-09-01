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

import com.bydan.erp.contabilidad.util.PresuProyectoConstantesFunciones;
import com.bydan.erp.contabilidad.util.PresuProyectoParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.PresuProyectoParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.PresuProyectoBean;
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
import com.bydan.erp.nomina.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class PresuProyectoBeanSwingJInternalFrame extends PresuProyectoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(PresuProyectoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<PresuProyecto> presuproyectoValidator = new ClassValidator<PresuProyecto>(PresuProyecto.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public PresuProyecto presuproyecto;	
	public PresuProyecto presuproyectoAux;
	public PresuProyecto presuproyectoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public PresuProyecto presuproyectoTotales;
	public Long idPresuProyectoActual;
	public Long iIdNuevoPresuProyecto=0L;
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

	public String sFinalQueryComboPresuTipoProyecto="";

	public List<PresuTipoProyecto> presutipoproyectosForeignKey;

	public List<PresuTipoProyecto> getpresutipoproyectosForeignKey() {
		return presutipoproyectosForeignKey;
	}

	public void setpresutipoproyectosForeignKey(List<PresuTipoProyecto> presutipoproyectosForeignKey) {
		this.presutipoproyectosForeignKey = presutipoproyectosForeignKey;
	}

	//OBJETO FK ACTUAL
	public PresuTipoProyecto presutipoproyectoForeignKey;

	public PresuTipoProyecto getpresutipoproyectoForeignKey() {
		return presutipoproyectoForeignKey;
	}

	public void setpresutipoproyectoForeignKey(PresuTipoProyecto presutipoproyectoForeignKey) {
		this.presutipoproyectoForeignKey = presutipoproyectoForeignKey;
	}

	public String sFinalQueryComboCentroCosto="";

	public List<CentroCosto> centrocostosForeignKey;

	public List<CentroCosto> getcentrocostosForeignKey() {
		return centrocostosForeignKey;
	}

	public void setcentrocostosForeignKey(List<CentroCosto> centrocostosForeignKey) {
		this.centrocostosForeignKey = centrocostosForeignKey;
	}

	//OBJETO FK ACTUAL
	public CentroCosto centrocostoForeignKey;

	public CentroCosto getcentrocostoForeignKey() {
		return centrocostoForeignKey;
	}

	public void setcentrocostoForeignKey(CentroCosto centrocostoForeignKey) {
		this.centrocostoForeignKey = centrocostoForeignKey;
	}

	public String sFinalQueryComboPresuEstado="";

	public List<PresuEstado> presuestadosForeignKey;

	public List<PresuEstado> getpresuestadosForeignKey() {
		return presuestadosForeignKey;
	}

	public void setpresuestadosForeignKey(List<PresuEstado> presuestadosForeignKey) {
		this.presuestadosForeignKey = presuestadosForeignKey;
	}

	//OBJETO FK ACTUAL
	public PresuEstado presuestadoForeignKey;

	public PresuEstado getpresuestadoForeignKey() {
		return presuestadoForeignKey;
	}

	public void setpresuestadoForeignKey(PresuEstado presuestadoForeignKey) {
		this.presuestadoForeignKey = presuestadoForeignKey;
	}

		
	
	
	
	
	

	public Boolean isTienePermisosPresuTransferencia=false;

	public Boolean getIsTienePermisosPresuTransferencia() {
		return isTienePermisosPresuTransferencia;
	}

	public void setIsTienePermisosPresuTransferencia(Boolean isTienePermisosPresuTransferencia) {
		this.isTienePermisosPresuTransferencia= isTienePermisosPresuTransferencia;
	}


	public Boolean isTienePermisosPresuProyectoCuenta=false;

	public Boolean getIsTienePermisosPresuProyectoCuenta() {
		return isTienePermisosPresuProyectoCuenta;
	}

	public void setIsTienePermisosPresuProyectoCuenta(Boolean isTienePermisosPresuProyectoCuenta) {
		this.isTienePermisosPresuProyectoCuenta= isTienePermisosPresuProyectoCuenta;
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
	
	public Boolean isPermisoTodoPresuProyecto;
	public Boolean isPermisoNuevoPresuProyecto;
	public Boolean isPermisoActualizarPresuProyecto;
	public Boolean isPermisoActualizarOriginalPresuProyecto;
	public Boolean isPermisoEliminarPresuProyecto;
	public Boolean isPermisoGuardarCambiosPresuProyecto;
	public Boolean isPermisoConsultaPresuProyecto;
	public Boolean isPermisoBusquedaPresuProyecto;
	public Boolean isPermisoReportePresuProyecto;
	public Boolean isPermisoPaginacionMedioPresuProyecto;
	public Boolean isPermisoPaginacionAltoPresuProyecto;
	public Boolean isPermisoPaginacionTodoPresuProyecto;
	public Boolean isPermisoCopiarPresuProyecto;
	public Boolean isPermisoVerFormPresuProyecto;
	public Boolean isPermisoDuplicarPresuProyecto;
	public Boolean isPermisoOrdenPresuProyecto;
	
	
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
	
	public PresuProyectoParameterReturnGeneral presuproyectoReturnGeneral;
	public PresuProyectoParameterReturnGeneral presuproyectoParameterGeneral;
	
	

	public PresuTransferenciaLogic presutransferenciaLogic=null;

	public PresuTransferenciaLogic getPresuTransferenciaLogic() {
		return presutransferenciaLogic;
	}

	public void setPresuTransferenciaLogic(PresuTransferenciaLogic presutransferenciaLogic) {
		this.presutransferenciaLogic = presutransferenciaLogic;
	}


	public PresuProyectoCuentaLogic presuproyectocuentaLogic=null;

	public PresuProyectoCuentaLogic getPresuProyectoCuentaLogic() {
		return presuproyectocuentaLogic;
	}

	public void setPresuProyectoCuentaLogic(PresuProyectoCuentaLogic presuproyectocuentaLogic) {
		this.presuproyectocuentaLogic = presuproyectocuentaLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoPresuProyecto=false;
	public Boolean esParaAccionDesdeFormularioPresuProyecto=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected PresuProyectoSessionBeanAdditional presuproyectoSessionBeanAdditional=null;
	
	public PresuProyectoSessionBeanAdditional getPresuProyectoSessionBeanAdditional() {
		return this.presuproyectoSessionBeanAdditional;
	}
	
	public void setPresuProyectoSessionBeanAdditional(PresuProyectoSessionBeanAdditional presuproyectoSessionBeanAdditional) {
		try {
			this.presuproyectoSessionBeanAdditional=presuproyectoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected PresuProyectoBeanSwingJInternalFrameAdditional presuproyectoBeanSwingJInternalFrameAdditional=null;
	//public class PresuProyectoBeanSwingJInternalFrame
	
	public PresuProyectoBeanSwingJInternalFrameAdditional getPresuProyectoBeanSwingJInternalFrameAdditional() {
		return this.presuproyectoBeanSwingJInternalFrameAdditional;
	}
	
	public void setPresuProyectoBeanSwingJInternalFrameAdditional(PresuProyectoBeanSwingJInternalFrameAdditional presuproyectoBeanSwingJInternalFrameAdditional) {
		try {
			this.presuproyectoBeanSwingJInternalFrameAdditional=presuproyectoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public PresuProyectoLogic presuproyectoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public PresuProyecto presuproyectoBean;
	public PresuProyectoConstantesFunciones presuproyectoConstantesFunciones;
	//public PresuProyectoParameterReturnGeneral presuproyectoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EjercicioLogic ejercicioLogic;
	public PresuTipoProyectoLogic presutipoproyectoLogic;
	public CentroCostoLogic centrocostoLogic;
	public PresuEstadoLogic presuestadoLogic;
	
	//PARAMETROS
	
	
	//public List<PresuProyecto> presuproyectos;	
	//public List<PresuProyecto> presuproyectosEliminados;
	//public List<PresuProyecto> presuproyectosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoPresuProyecto=false;
	public Boolean isVisibilidadCeldaDuplicarPresuProyecto=true;
	public Boolean isVisibilidadCeldaCopiarPresuProyecto=true;
	public Boolean isVisibilidadCeldaVerFormPresuProyecto=true;
	public Boolean isVisibilidadCeldaOrdenPresuProyecto=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesPresuProyecto=false;
	public Boolean isVisibilidadCeldaModificarPresuProyecto=false;
	public Boolean isVisibilidadCeldaActualizarPresuProyecto=false;
	public Boolean isVisibilidadCeldaEliminarPresuProyecto=false;
	public Boolean isVisibilidadCeldaCancelarPresuProyecto=false;
	public Boolean isVisibilidadCeldaGuardarPresuProyecto=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosPresuProyecto=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdCentroCosto=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdPresuEstado=false;
	public Boolean isVisibilidadFK_IdPresuTipoProyecto=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoPresuProyecto() {
		return this.iIdNuevoPresuProyecto;
	}

	public void setiIdNuevoPresuProyecto(Long iIdNuevoPresuProyecto) {
		this.iIdNuevoPresuProyecto = iIdNuevoPresuProyecto;
	}
	
	public Long getidPresuProyectoActual() {
		return this.idPresuProyectoActual;
	}

	public void setidPresuProyectoActual(Long idPresuProyectoActual) {
		this.idPresuProyectoActual = idPresuProyectoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public PresuProyecto getpresuproyecto() {
		return this.presuproyecto;
	}

	public void setpresuproyecto(PresuProyecto presuproyecto) {
		this.presuproyecto = presuproyecto;
	}
	
	public PresuProyecto getpresuproyectoAux() {
		return this.presuproyectoAux;
	}

	public void setpresuproyectoAux(PresuProyecto presuproyectoAux) {
		this.presuproyectoAux = presuproyectoAux;
	}				
	
	public PresuProyecto getpresuproyectoAnterior() {
		return this.presuproyectoAnterior;
	}

	public void setpresuproyectoAnterior(PresuProyecto presuproyectoAnterior) {
		this.presuproyectoAnterior = presuproyectoAnterior;
	}	
	
	public PresuProyecto getpresuproyectoTotales() {
		return this.presuproyectoTotales;
	}

	public void setpresuproyectoTotales(PresuProyecto presuproyectoTotales) {
		this.presuproyectoTotales = presuproyectoTotales;
	}	
	
	public PresuProyecto getpresuproyectoBean() {
		return this.presuproyectoBean;
	}

	public void setpresuproyectoBean(PresuProyecto presuproyectoBean) {
		this.presuproyectoBean = presuproyectoBean;
	}	
	
	public PresuProyectoParameterReturnGeneral getpresuproyectoReturnGeneral() {
		return this.presuproyectoReturnGeneral;
	}

	public void setpresuproyectoReturnGeneral(PresuProyectoParameterReturnGeneral presuproyectoReturnGeneral) {
		this.presuproyectoReturnGeneral = presuproyectoReturnGeneral;
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

	public Long id_centro_costoFK_IdCentroCosto=null;

	public Long getid_centro_costoFK_IdCentroCosto() {
		return this.id_centro_costoFK_IdCentroCosto;
	}

	public void setid_centro_costoFK_IdCentroCosto(Long id_centro_costoFK_IdCentroCosto) {
		this.id_centro_costoFK_IdCentroCosto = id_centro_costoFK_IdCentroCosto;
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

	public Long id_presu_estadoFK_IdPresuEstado=-1L;

	public Long getid_presu_estadoFK_IdPresuEstado() {
		return this.id_presu_estadoFK_IdPresuEstado;
	}

	public void setid_presu_estadoFK_IdPresuEstado(Long id_presu_estadoFK_IdPresuEstado) {
		this.id_presu_estadoFK_IdPresuEstado = id_presu_estadoFK_IdPresuEstado;
	}

	public Long id_presu_tipo_proyectoFK_IdPresuTipoProyecto=-1L;

	public Long getid_presu_tipo_proyectoFK_IdPresuTipoProyecto() {
		return this.id_presu_tipo_proyectoFK_IdPresuTipoProyecto;
	}

	public void setid_presu_tipo_proyectoFK_IdPresuTipoProyecto(Long id_presu_tipo_proyectoFK_IdPresuTipoProyecto) {
		this.id_presu_tipo_proyectoFK_IdPresuTipoProyecto = id_presu_tipo_proyectoFK_IdPresuTipoProyecto;
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
	
	
	public PresuProyectoLogic getPresuProyectoLogic()	{		
		return presuproyectoLogic;
	}

	public void setPresuProyectoLogic(PresuProyectoLogic presuproyectoLogic) {
		this.presuproyectoLogic = presuproyectoLogic;
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
	
	public Boolean getIsEsNuevoPresuProyecto() {
		return isEsNuevoPresuProyecto;
	}

	public void setIsEsNuevoPresuProyecto(Boolean isEsNuevoPresuProyecto) {
		this.isEsNuevoPresuProyecto = isEsNuevoPresuProyecto;
	}

	public Boolean getEsParaAccionDesdeFormularioPresuProyecto() {
		return esParaAccionDesdeFormularioPresuProyecto;
	}
	
	public void setEsParaAccionDesdeFormularioPresuProyecto(Boolean esParaAccionDesdeFormularioPresuProyecto) {
		this.esParaAccionDesdeFormularioPresuProyecto = esParaAccionDesdeFormularioPresuProyecto;
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

			if(this.presuproyectoSessionBean==null) {
				this.presuproyectoSessionBean=new PresuProyectoSessionBean();
			}

			if(!this.presuproyectoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(presuproyectoSessionBean.getlidEmpresaActual());
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

			if(this.presuproyectoSessionBean==null) {
				this.presuproyectoSessionBean=new PresuProyectoSessionBean();
			}

			if(!this.presuproyectoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(presuproyectoSessionBean.getlidSucursalActual());
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

			if(this.presuproyectoSessionBean==null) {
				this.presuproyectoSessionBean=new PresuProyectoSessionBean();
			}

			if(!this.presuproyectoSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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
					ejercicioLogic.getEntityWithConnection(presuproyectoSessionBean.getlidEjercicioActual());
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

	public void cargarCombosPresuTipoProyectosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.presutipoproyectosForeignKey=new ArrayList<PresuTipoProyecto>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PresuTipoProyectoLogic presutipoproyectoLogic=new PresuTipoProyectoLogic();

			//presutipoproyectoLogic.getPresuTipoProyectoDataAccess().setIsForForeingKeyData(true);

			if(this.presuproyectoSessionBean==null) {
				this.presuproyectoSessionBean=new PresuProyectoSessionBean();
			}

			if(!this.presuproyectoSessionBean.getisBusquedaDesdeForeignKeySesionPresuTipoProyecto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//presutipoproyectoLogic.getPresuTipoProyectoDataAccess().setIsForForeingKeyData(true);

					presutipoproyectoLogic.getTodosPresuTipoProyectosWithConnection(sFinalQuery,new Pagination());

					this.presutipoproyectosForeignKey=presutipoproyectoLogic.getPresuTipoProyectos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPresuTipoProyecto(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					presutipoproyectoLogic.getEntityWithConnection(presuproyectoSessionBean.getlidPresuTipoProyectoActual());
					this.presutipoproyectosForeignKey.add(presutipoproyectoLogic.getPresuTipoProyecto());
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

	public void cargarCombosCentroCostosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.centrocostosForeignKey=new ArrayList<CentroCosto>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CentroCosto centrocostoNulo = new CentroCosto();

			CentroCostoLogic centrocostoLogic=new CentroCostoLogic();

			//centrocostoLogic.getCentroCostoDataAccess().setIsForForeingKeyData(true);

			if(this.presuproyectoSessionBean==null) {
				this.presuproyectoSessionBean=new PresuProyectoSessionBean();
			}

			if(!this.presuproyectoSessionBean.getisBusquedaDesdeForeignKeySesionCentroCosto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//centrocostoLogic.getCentroCostoDataAccess().setIsForForeingKeyData(true);

					centrocostoLogic.getTodosCentroCostosWithConnection(sFinalQuery,new Pagination());

					this.centrocostosForeignKey=centrocostoLogic.getCentroCostos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}

				this.centrocostosForeignKey.add(0, centrocostoNulo);

				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCentroCosto(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					centrocostoLogic.getEntityWithConnection(presuproyectoSessionBean.getlidCentroCostoActual());
					this.centrocostosForeignKey.add(centrocostoLogic.getCentroCosto());
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

	public void cargarCombosPresuEstadosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.presuestadosForeignKey=new ArrayList<PresuEstado>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PresuEstadoLogic presuestadoLogic=new PresuEstadoLogic();

			//presuestadoLogic.getPresuEstadoDataAccess().setIsForForeingKeyData(true);

			if(this.presuproyectoSessionBean==null) {
				this.presuproyectoSessionBean=new PresuProyectoSessionBean();
			}

			if(!this.presuproyectoSessionBean.getisBusquedaDesdeForeignKeySesionPresuEstado()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//presuestadoLogic.getPresuEstadoDataAccess().setIsForForeingKeyData(true);

					presuestadoLogic.getTodosPresuEstadosWithConnection(sFinalQuery,new Pagination());

					this.presuestadosForeignKey=presuestadoLogic.getPresuEstados();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPresuEstado(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					presuestadoLogic.getEntityWithConnection(presuproyectoSessionBean.getlidPresuEstadoActual());
					this.presuestadosForeignKey.add(presuestadoLogic.getPresuEstado());
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

					if(this.presuproyecto!=null) {
						this.presuproyecto.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormPresuProyecto!=null) {
						this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_empresaPresuProyecto.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaPresuProyecto.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormPresuProyecto!=null) {
						if(this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_empresaPresuProyecto.getItemCount()>0) {
							this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_empresaPresuProyecto.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaPresuProyectoGenerico)throws Exception
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
				jComboBoxid_empresaPresuProyectoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaPresuProyectoGenerico!=null && jComboBoxid_empresaPresuProyectoGenerico.getItemCount()>0) {
					jComboBoxid_empresaPresuProyectoGenerico.setSelectedIndex(0);
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

					if(this.presuproyecto!=null) {
						this.presuproyecto.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormPresuProyecto!=null) {
						this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_sucursalPresuProyecto.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalPresuProyecto.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormPresuProyecto!=null) {
						if(this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_sucursalPresuProyecto.getItemCount()>0) {
							this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_sucursalPresuProyecto.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalPresuProyectoGenerico)throws Exception
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
				jComboBoxid_sucursalPresuProyectoGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalPresuProyectoGenerico!=null && jComboBoxid_sucursalPresuProyectoGenerico.getItemCount()>0) {
					jComboBoxid_sucursalPresuProyectoGenerico.setSelectedIndex(0);
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

					if(this.presuproyecto!=null) {
						this.presuproyecto.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormPresuProyecto!=null) {
						this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_ejercicioPresuProyecto.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioPresuProyecto.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormPresuProyecto!=null) {
						if(this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_ejercicioPresuProyecto.getItemCount()>0) {
							this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_ejercicioPresuProyecto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEjercicio") || sFormularioTipoBusqueda.equals("Todos")){
					if(ejercicioTemp!=null && jComboBoxid_ejercicioFK_IdEjercicioPresuProyecto!=null) {
						jComboBoxid_ejercicioFK_IdEjercicioPresuProyecto.setSelectedItem(ejercicioTemp);
					} else {
						if(jComboBoxid_ejercicioFK_IdEjercicioPresuProyecto!=null) {
							//jComboBoxid_ejercicioFK_IdEjercicioPresuProyecto.setSelectedItem(ejercicioTemp);
							if(jComboBoxid_ejercicioFK_IdEjercicioPresuProyecto.getItemCount()>0) {
								jComboBoxid_ejercicioFK_IdEjercicioPresuProyecto.setSelectedIndex(0);
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
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioPresuProyectoGenerico)throws Exception
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
				jComboBoxid_ejercicioPresuProyectoGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioPresuProyectoGenerico!=null && jComboBoxid_ejercicioPresuProyectoGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioPresuProyectoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualPresuTipoProyectoForeignKey(Long idPresuTipoProyectoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			PresuTipoProyecto  presutipoproyectoTemp=null;

			for(PresuTipoProyecto presutipoproyectoAux:presutipoproyectosForeignKey) {
				if(presutipoproyectoAux.getId()!=null && presutipoproyectoAux.getId().equals(idPresuTipoProyectoSeleccionado)) {
					presutipoproyectoTemp=presutipoproyectoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(presutipoproyectoTemp!=null) {

					if(this.presuproyecto!=null) {
						this.presuproyecto.setPresuTipoProyecto(presutipoproyectoTemp);
					}

					if(this.jInternalFrameDetalleFormPresuProyecto!=null) {
						this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_presu_tipo_proyectoPresuProyecto.setSelectedItem(presutipoproyectoTemp);
					}
				} else {
					//jComboBoxid_presu_tipo_proyectoPresuProyecto.setSelectedItem(presutipoproyectoTemp);
					if(this.jInternalFrameDetalleFormPresuProyecto!=null) {
						if(this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_presu_tipo_proyectoPresuProyecto.getItemCount()>0) {
							this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_presu_tipo_proyectoPresuProyecto.setSelectedIndex(0);
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

	public String getActualPresuTipoProyectoForeignKeyDescripcion(Long idPresuTipoProyectoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			PresuTipoProyecto  presutipoproyectoTemp=null;

			for(PresuTipoProyecto presutipoproyectoAux:presutipoproyectosForeignKey) {
				if(presutipoproyectoAux.getId()!=null && presutipoproyectoAux.getId().equals(idPresuTipoProyectoSeleccionado)) {
					presutipoproyectoTemp=presutipoproyectoAux;
					break;
				}
			}


			sDescripcion=PresuTipoProyectoConstantesFunciones.getPresuTipoProyectoDescripcion(presutipoproyectoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPresuTipoProyectoForeignKeyGenerico(Long idPresuTipoProyectoSeleccionado,JComboBox jComboBoxid_presu_tipo_proyectoPresuProyectoGenerico)throws Exception
	{
		try
		{
			PresuTipoProyecto  presutipoproyectoTemp=null;

			for(PresuTipoProyecto presutipoproyectoAux:presutipoproyectosForeignKey) {
				if(presutipoproyectoAux.getId()!=null && presutipoproyectoAux.getId().equals(idPresuTipoProyectoSeleccionado)) {
					presutipoproyectoTemp=presutipoproyectoAux;
					break;
				}
			}

			if(presutipoproyectoTemp!=null) {
				jComboBoxid_presu_tipo_proyectoPresuProyectoGenerico.setSelectedItem(presutipoproyectoTemp);
			} else {
				if(jComboBoxid_presu_tipo_proyectoPresuProyectoGenerico!=null && jComboBoxid_presu_tipo_proyectoPresuProyectoGenerico.getItemCount()>0) {
					jComboBoxid_presu_tipo_proyectoPresuProyectoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCentroCostoForeignKey(Long idCentroCostoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			CentroCosto  centrocostoTemp=null;

			for(CentroCosto centrocostoAux:centrocostosForeignKey) {
				if(centrocostoAux.getId()!=null && centrocostoAux.getId().equals(idCentroCostoSeleccionado)) {
					centrocostoTemp=centrocostoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(centrocostoTemp!=null) {

					if(this.presuproyecto!=null) {
						this.presuproyecto.setCentroCosto(centrocostoTemp);
					}

					if(this.jInternalFrameDetalleFormPresuProyecto!=null) {
						this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_centro_costoPresuProyecto.setSelectedItem(centrocostoTemp);
					}
				} else {
					//jComboBoxid_centro_costoPresuProyecto.setSelectedItem(centrocostoTemp);
					if(this.jInternalFrameDetalleFormPresuProyecto!=null) {
						if(this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_centro_costoPresuProyecto.getItemCount()>0) {
							this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_centro_costoPresuProyecto.setSelectedIndex(0);
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

	public String getActualCentroCostoForeignKeyDescripcion(Long idCentroCostoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			CentroCosto  centrocostoTemp=null;

			for(CentroCosto centrocostoAux:centrocostosForeignKey) {
				if(centrocostoAux.getId()!=null && centrocostoAux.getId().equals(idCentroCostoSeleccionado)) {
					centrocostoTemp=centrocostoAux;
					break;
				}
			}


			sDescripcion=CentroCostoConstantesFunciones.getCentroCostoDescripcion(centrocostoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCentroCostoForeignKeyGenerico(Long idCentroCostoSeleccionado,JComboBox jComboBoxid_centro_costoPresuProyectoGenerico)throws Exception
	{
		try
		{
			CentroCosto  centrocostoTemp=null;

			for(CentroCosto centrocostoAux:centrocostosForeignKey) {
				if(centrocostoAux.getId()!=null && centrocostoAux.getId().equals(idCentroCostoSeleccionado)) {
					centrocostoTemp=centrocostoAux;
					break;
				}
			}

			if(centrocostoTemp!=null) {
				jComboBoxid_centro_costoPresuProyectoGenerico.setSelectedItem(centrocostoTemp);
			} else {
				if(jComboBoxid_centro_costoPresuProyectoGenerico!=null && jComboBoxid_centro_costoPresuProyectoGenerico.getItemCount()>0) {
					jComboBoxid_centro_costoPresuProyectoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualPresuEstadoForeignKey(Long idPresuEstadoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			PresuEstado  presuestadoTemp=null;

			for(PresuEstado presuestadoAux:presuestadosForeignKey) {
				if(presuestadoAux.getId()!=null && presuestadoAux.getId().equals(idPresuEstadoSeleccionado)) {
					presuestadoTemp=presuestadoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(presuestadoTemp!=null) {

					if(this.presuproyecto!=null) {
						this.presuproyecto.setPresuEstado(presuestadoTemp);
					}

					if(this.jInternalFrameDetalleFormPresuProyecto!=null) {
						this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_presu_estadoPresuProyecto.setSelectedItem(presuestadoTemp);
					}
				} else {
					//jComboBoxid_presu_estadoPresuProyecto.setSelectedItem(presuestadoTemp);
					if(this.jInternalFrameDetalleFormPresuProyecto!=null) {
						if(this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_presu_estadoPresuProyecto.getItemCount()>0) {
							this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_presu_estadoPresuProyecto.setSelectedIndex(0);
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

	public String getActualPresuEstadoForeignKeyDescripcion(Long idPresuEstadoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			PresuEstado  presuestadoTemp=null;

			for(PresuEstado presuestadoAux:presuestadosForeignKey) {
				if(presuestadoAux.getId()!=null && presuestadoAux.getId().equals(idPresuEstadoSeleccionado)) {
					presuestadoTemp=presuestadoAux;
					break;
				}
			}


			sDescripcion=PresuEstadoConstantesFunciones.getPresuEstadoDescripcion(presuestadoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPresuEstadoForeignKeyGenerico(Long idPresuEstadoSeleccionado,JComboBox jComboBoxid_presu_estadoPresuProyectoGenerico)throws Exception
	{
		try
		{
			PresuEstado  presuestadoTemp=null;

			for(PresuEstado presuestadoAux:presuestadosForeignKey) {
				if(presuestadoAux.getId()!=null && presuestadoAux.getId().equals(idPresuEstadoSeleccionado)) {
					presuestadoTemp=presuestadoAux;
					break;
				}
			}

			if(presuestadoTemp!=null) {
				jComboBoxid_presu_estadoPresuProyectoGenerico.setSelectedItem(presuestadoTemp);
			} else {
				if(jComboBoxid_presu_estadoPresuProyectoGenerico!=null && jComboBoxid_presu_estadoPresuProyectoGenerico.getItemCount()>0) {
					jComboBoxid_presu_estadoPresuProyectoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(PresuProyecto presuproyecto,JComboBox jComboBoxid_empresaPresuProyectoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaPresuProyectoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_empresaPresuProyecto.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaPresuProyectoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				presuproyecto.setid_empresa(empresaAux.getId());
				presuproyecto.setempresa_descripcion(PresuProyectoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				presuproyecto.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(PresuProyecto presuproyecto,JComboBox jComboBoxid_sucursalPresuProyectoGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalPresuProyectoGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_sucursalPresuProyecto.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalPresuProyectoGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				presuproyecto.setid_sucursal(sucursalAux.getId());
				presuproyecto.setsucursal_descripcion(PresuProyectoConstantesFunciones.getSucursalDescripcion(sucursalAux));
				presuproyecto.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(PresuProyecto presuproyecto,JComboBox jComboBoxid_ejercicioPresuProyectoGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioPresuProyectoGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_ejercicioPresuProyecto.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioPresuProyectoGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				presuproyecto.setid_ejercicio(ejercicioAux.getId());
				presuproyecto.setejercicio_descripcion(PresuProyectoConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				presuproyecto.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPresuTipoProyectoForeignKey(PresuProyecto presuproyecto,JComboBox jComboBoxid_presu_tipo_proyectoPresuProyectoGenerico)throws Exception
	{
		try
		{
			PresuTipoProyecto  presutipoproyectoAux=new PresuTipoProyecto();

			if(jComboBoxid_presu_tipo_proyectoPresuProyectoGenerico==null) {
				presutipoproyectoAux=(PresuTipoProyecto)this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_presu_tipo_proyectoPresuProyecto.getSelectedItem();
			} else {
				presutipoproyectoAux=(PresuTipoProyecto)jComboBoxid_presu_tipo_proyectoPresuProyectoGenerico.getSelectedItem();
			}

			if(presutipoproyectoAux!=null && presutipoproyectoAux.getId()!=null) {
				presuproyecto.setid_presu_tipo_proyecto(presutipoproyectoAux.getId());
				presuproyecto.setpresutipoproyecto_descripcion(PresuProyectoConstantesFunciones.getPresuTipoProyectoDescripcion(presutipoproyectoAux));
				presuproyecto.setPresuTipoProyecto(presutipoproyectoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCentroCostoForeignKey(PresuProyecto presuproyecto,JComboBox jComboBoxid_centro_costoPresuProyectoGenerico)throws Exception
	{
		try
		{
			CentroCosto  centrocostoAux=new CentroCosto();

			if(jComboBoxid_centro_costoPresuProyectoGenerico==null) {
				centrocostoAux=(CentroCosto)this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_centro_costoPresuProyecto.getSelectedItem();
			} else {
				centrocostoAux=(CentroCosto)jComboBoxid_centro_costoPresuProyectoGenerico.getSelectedItem();
			}

			if(centrocostoAux!=null) {
				presuproyecto.setid_centro_costo(centrocostoAux.getId());
				presuproyecto.setcentrocosto_descripcion(PresuProyectoConstantesFunciones.getCentroCostoDescripcion(centrocostoAux));
				presuproyecto.setCentroCosto(centrocostoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPresuEstadoForeignKey(PresuProyecto presuproyecto,JComboBox jComboBoxid_presu_estadoPresuProyectoGenerico)throws Exception
	{
		try
		{
			PresuEstado  presuestadoAux=new PresuEstado();

			if(jComboBoxid_presu_estadoPresuProyectoGenerico==null) {
				presuestadoAux=(PresuEstado)this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_presu_estadoPresuProyecto.getSelectedItem();
			} else {
				presuestadoAux=(PresuEstado)jComboBoxid_presu_estadoPresuProyectoGenerico.getSelectedItem();
			}

			if(presuestadoAux!=null && presuestadoAux.getId()!=null) {
				presuproyecto.setid_presu_estado(presuestadoAux.getId());
				presuproyecto.setpresuestado_descripcion(PresuProyectoConstantesFunciones.getPresuEstadoDescripcion(presuestadoAux));
				presuproyecto.setPresuEstado(presuestadoAux);			}
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

					if(!PresuProyectoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPresuProyecto!=null) { 
							this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_empresaPresuProyecto.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_empresaPresuProyecto.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPresuProyecto!=null) { 
					}

					if(!PresuProyectoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PresuProyectoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPresuProyecto!=null) { 
							this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_sucursalPresuProyecto.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_sucursalPresuProyecto.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPresuProyecto!=null) { 
					}

					if(!PresuProyectoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PresuProyectoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPresuProyecto!=null) { 
							this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_ejercicioPresuProyecto.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_ejercicioPresuProyecto.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPresuProyecto!=null) { 
					}

					if(!PresuProyectoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEjercicio") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PresuProyectoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_ejercicioFK_IdEjercicioPresuProyecto.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jComboBoxid_ejercicioFK_IdEjercicioPresuProyecto.addItem(ejercicio);
							}
						}

						if(!PresuProyectoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePresuTipoProyectosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPresuTipoProyecto=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PresuProyectoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPresuProyecto!=null) { 
							this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_presu_tipo_proyectoPresuProyecto.removeAllItems();

							for(PresuTipoProyecto presutipoproyecto:this.presutipoproyectosForeignKey) {
								this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_presu_tipo_proyectoPresuProyecto.addItem(presutipoproyecto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPresuProyecto!=null) { 
					}

					if(!PresuProyectoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCentroCostosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCentroCosto=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PresuProyectoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPresuProyecto!=null) { 
							this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_centro_costoPresuProyecto.removeAllItems();

							for(CentroCosto centrocosto:this.centrocostosForeignKey) {
								this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_centro_costoPresuProyecto.addItem(centrocosto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPresuProyecto!=null) { 
					}

					if(!PresuProyectoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePresuEstadosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPresuEstado=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PresuProyectoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPresuProyecto!=null) { 
							this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_presu_estadoPresuProyecto.removeAllItems();

							for(PresuEstado presuestado:this.presuestadosForeignKey) {
								this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_presu_estadoPresuProyecto.addItem(presuestado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPresuProyecto!=null) { 
					}

					if(!PresuProyectoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormPresuProyecto!=null) {
							this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_empresaPresuProyecto.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormPresuProyecto!=null) {
							this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_empresaPresuProyecto.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPresuProyecto!=null) {
							this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_sucursalPresuProyecto.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormPresuProyecto!=null) {
							this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_sucursalPresuProyecto.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPresuProyecto!=null) {
							this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_ejercicioPresuProyecto.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormPresuProyecto!=null) {
							this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_ejercicioPresuProyecto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_ejercicioFK_IdEjercicioPresuProyecto.setSelectedItem(ejercicio);
						} else {
							this.jComboBoxid_ejercicioFK_IdEjercicioPresuProyecto.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFramePresuTipoProyectoForeignKey(PresuTipoProyecto presutipoproyecto,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPresuProyecto!=null) {
							this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_presu_tipo_proyectoPresuProyecto.setSelectedItem(presutipoproyecto);
						}
					} else {
						if(this.jInternalFrameDetalleFormPresuProyecto!=null) {
							this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_presu_tipo_proyectoPresuProyecto.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameCentroCostoForeignKey(CentroCosto centrocosto,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPresuProyecto!=null) {
							this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_centro_costoPresuProyecto.setSelectedItem(centrocosto);
						}
					} else {
						if(this.jInternalFrameDetalleFormPresuProyecto!=null) {
							this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_centro_costoPresuProyecto.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFramePresuEstadoForeignKey(PresuEstado presuestado,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPresuProyecto!=null) {
							this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_presu_estadoPresuProyecto.setSelectedItem(presuestado);
						}
					} else {
						if(this.jInternalFrameDetalleFormPresuProyecto!=null) {
							this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_presu_estadoPresuProyecto.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesPresuProyecto() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			PresuProyectoConstantesFunciones.refrescarForeignKeysDescripcionesPresuProyecto(this.presuproyectoLogic.getPresuProyectos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			PresuProyectoConstantesFunciones.refrescarForeignKeysDescripcionesPresuProyecto(this.presuproyectos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Ejercicio.class));
		classes.add(new Classe(PresuTipoProyecto.class));
		classes.add(new Classe(CentroCosto.class));
		classes.add(new Classe(PresuEstado.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//presuproyectoLogic.setPresuProyectos(this.presuproyectos);
			presuproyectoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public PresuProyectoParameterReturnGeneral getPresuProyectoParameterGeneral() {
		return this.presuproyectoParameterGeneral;
	}
	
	public void setPresuProyectoParameterGeneral(PresuProyectoParameterReturnGeneral presuproyectoParameterGeneral) {
		this.presuproyectoParameterGeneral = presuproyectoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoPresuProyecto() {
		return isPermisoTodoPresuProyecto;
	}

	public void setIsPermisoTodoPresuProyecto(Boolean isPermisoTodoPresuProyecto) {
		this.isPermisoTodoPresuProyecto = isPermisoTodoPresuProyecto;
	}

	public Boolean getIsPermisoNuevoPresuProyecto() {
		return isPermisoNuevoPresuProyecto;
	}

	public void setIsPermisoNuevoPresuProyecto(Boolean isPermisoNuevoPresuProyecto) {
		this.isPermisoNuevoPresuProyecto = isPermisoNuevoPresuProyecto;
	}

	public Boolean getIsPermisoActualizarPresuProyecto() {
		return isPermisoActualizarPresuProyecto;
	}

	public void setIsPermisoActualizarPresuProyecto(Boolean isPermisoActualizarPresuProyecto) {
		this.isPermisoActualizarPresuProyecto = isPermisoActualizarPresuProyecto;
	}

	public Boolean getIsPermisoEliminarPresuProyecto() {
		return isPermisoEliminarPresuProyecto;
	}

	public void setIsPermisoEliminarPresuProyecto(Boolean isPermisoEliminarPresuProyecto) {
		this.isPermisoEliminarPresuProyecto = isPermisoEliminarPresuProyecto;
	}

	public Boolean getIsPermisoGuardarCambiosPresuProyecto() {
		return isPermisoGuardarCambiosPresuProyecto;
	}

	public void setIsPermisoGuardarCambiosPresuProyecto(Boolean isPermisoGuardarCambiosPresuProyecto) {
		this.isPermisoGuardarCambiosPresuProyecto = isPermisoGuardarCambiosPresuProyecto;
	}
	
	public Boolean getIsPermisoConsultaPresuProyecto() {
		return isPermisoConsultaPresuProyecto;
	}

	public void setIsPermisoConsultaPresuProyecto(Boolean isPermisoConsultaPresuProyecto) {
		this.isPermisoConsultaPresuProyecto = isPermisoConsultaPresuProyecto;
	}

	public Boolean getIsPermisoBusquedaPresuProyecto() {
		return isPermisoBusquedaPresuProyecto;
	}

	public void setIsPermisoBusquedaPresuProyecto(Boolean isPermisoBusquedaPresuProyecto) {
		this.isPermisoBusquedaPresuProyecto = isPermisoBusquedaPresuProyecto;
	}

	public Boolean getIsPermisoReportePresuProyecto() {
		return isPermisoReportePresuProyecto;
	}

	public void setIsPermisoReportePresuProyecto(Boolean isPermisoReportePresuProyecto) {
		this.isPermisoReportePresuProyecto = isPermisoReportePresuProyecto;
	}
	
	public Boolean getIsPermisoPaginacionMedioPresuProyecto() {
		return isPermisoPaginacionMedioPresuProyecto;
	}

	public void setIsPermisoPaginacionMedioPresuProyecto(Boolean isPermisoPaginacionMedioPresuProyecto) {
		this.isPermisoPaginacionMedioPresuProyecto = isPermisoPaginacionMedioPresuProyecto;
	}
	
	public Boolean getIsPermisoPaginacionTodoPresuProyecto() {
		return isPermisoPaginacionTodoPresuProyecto;
	}

	public void setIsPermisoPaginacionTodoPresuProyecto(Boolean isPermisoPaginacionTodoPresuProyecto) {
		this.isPermisoPaginacionTodoPresuProyecto = isPermisoPaginacionTodoPresuProyecto;
	}
	
	public Boolean getIsPermisoPaginacionAltoPresuProyecto() {
		return isPermisoPaginacionAltoPresuProyecto;
	}

	public void setIsPermisoPaginacionAltoPresuProyecto(Boolean isPermisoPaginacionAltoPresuProyecto) {
		this.isPermisoPaginacionAltoPresuProyecto = isPermisoPaginacionAltoPresuProyecto;
	}
	
	public Boolean getIsPermisoCopiarPresuProyecto() {
		return isPermisoCopiarPresuProyecto;
	}

	public void setIsPermisoCopiarPresuProyecto(Boolean isPermisoCopiarPresuProyecto) {
		this.isPermisoCopiarPresuProyecto = isPermisoCopiarPresuProyecto;
	}
	
	public Boolean getIsPermisoVerFormPresuProyecto() {
		return isPermisoVerFormPresuProyecto;
	}

	public void setIsPermisoVerFormPresuProyecto(Boolean isPermisoVerFormPresuProyecto) {
		this.isPermisoVerFormPresuProyecto = isPermisoVerFormPresuProyecto;
	}
	
	public Boolean getIsPermisoDuplicarPresuProyecto() {
		return isPermisoDuplicarPresuProyecto;
	}

	public void setIsPermisoDuplicarPresuProyecto(Boolean isPermisoDuplicarPresuProyecto) {
		this.isPermisoDuplicarPresuProyecto = isPermisoDuplicarPresuProyecto;
	}
	
	public Boolean getIsPermisoOrdenPresuProyecto() {
		return isPermisoOrdenPresuProyecto;
	}

	public void setIsPermisoOrdenPresuProyecto(Boolean isPermisoOrdenPresuProyecto) {
		this.isPermisoOrdenPresuProyecto = isPermisoOrdenPresuProyecto;
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
	
	public Boolean getIsVisibilidadCeldaNuevoPresuProyecto() {
		return isVisibilidadCeldaNuevoPresuProyecto;
	}

	public void setIsVisibilidadCeldaNuevoPresuProyecto(Boolean isVisibilidadCeldaNuevoPresuProyecto) {
		this.isVisibilidadCeldaNuevoPresuProyecto = isVisibilidadCeldaNuevoPresuProyecto;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarPresuProyecto() {
		return isVisibilidadCeldaDuplicarPresuProyecto;
	}

	public void setIsVisibilidadCeldaDuplicarPresuProyecto(Boolean isVisibilidadCeldaDuplicarPresuProyecto) {
		this.isVisibilidadCeldaDuplicarPresuProyecto = isVisibilidadCeldaDuplicarPresuProyecto;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarPresuProyecto() {
		return isVisibilidadCeldaCopiarPresuProyecto;
	}

	public void setIsVisibilidadCeldaCopiarPresuProyecto(Boolean isVisibilidadCeldaCopiarPresuProyecto) {
		this.isVisibilidadCeldaCopiarPresuProyecto = isVisibilidadCeldaCopiarPresuProyecto;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormPresuProyecto() {
		return isVisibilidadCeldaVerFormPresuProyecto;
	}

	public void setIsVisibilidadCeldaVerFormPresuProyecto(Boolean isVisibilidadCeldaVerFormPresuProyecto) {
		this.isVisibilidadCeldaVerFormPresuProyecto = isVisibilidadCeldaVerFormPresuProyecto;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenPresuProyecto() {
		return isVisibilidadCeldaOrdenPresuProyecto;
	}

	public void setIsVisibilidadCeldaOrdenPresuProyecto(Boolean isVisibilidadCeldaOrdenPresuProyecto) {
		this.isVisibilidadCeldaOrdenPresuProyecto = isVisibilidadCeldaOrdenPresuProyecto;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesPresuProyecto() {
		return isVisibilidadCeldaNuevoRelacionesPresuProyecto;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesPresuProyecto(Boolean isVisibilidadCeldaNuevoRelacionesPresuProyecto) {
		this.isVisibilidadCeldaNuevoRelacionesPresuProyecto = isVisibilidadCeldaNuevoRelacionesPresuProyecto;
	}
	
	public Boolean getIsVisibilidadCeldaModificarPresuProyecto() {
		return isVisibilidadCeldaModificarPresuProyecto;
	}

	public void setIsVisibilidadCeldaModificarPresuProyecto(Boolean isVisibilidadCeldaModificarPresuProyecto) {
		this.isVisibilidadCeldaModificarPresuProyecto = isVisibilidadCeldaModificarPresuProyecto;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarPresuProyecto() {
		return isVisibilidadCeldaActualizarPresuProyecto;
	}

	public void setIsVisibilidadCeldaActualizarPresuProyecto(Boolean isVisibilidadCeldaActualizarPresuProyecto) {
		this.isVisibilidadCeldaActualizarPresuProyecto = isVisibilidadCeldaActualizarPresuProyecto;
	}

	public Boolean getIsVisibilidadCeldaEliminarPresuProyecto() {
		return isVisibilidadCeldaEliminarPresuProyecto;
	}

	public void setIsVisibilidadCeldaEliminarPresuProyecto(Boolean isVisibilidadCeldaEliminarPresuProyecto) {
		this.isVisibilidadCeldaEliminarPresuProyecto = isVisibilidadCeldaEliminarPresuProyecto;
	}

	public Boolean getIsVisibilidadCeldaCancelarPresuProyecto() {
		return isVisibilidadCeldaCancelarPresuProyecto;
	}

	public void setIsVisibilidadCeldaCancelarPresuProyecto(Boolean isVisibilidadCeldaCancelarPresuProyecto) {
		this.isVisibilidadCeldaCancelarPresuProyecto = isVisibilidadCeldaCancelarPresuProyecto;
	}

	public Boolean getIsVisibilidadCeldaGuardarPresuProyecto() {
		return isVisibilidadCeldaGuardarPresuProyecto;
	}

	public void setIsVisibilidadCeldaGuardarPresuProyecto(Boolean isVisibilidadCeldaGuardarPresuProyecto) {
		this.isVisibilidadCeldaGuardarPresuProyecto = isVisibilidadCeldaGuardarPresuProyecto;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosPresuProyecto() {
		return isVisibilidadCeldaGuardarCambiosPresuProyecto;
	}

	public void setIsVisibilidadCeldaGuardarCambiosPresuProyecto(Boolean isVisibilidadCeldaGuardarCambiosPresuProyecto) {
		this.isVisibilidadCeldaGuardarCambiosPresuProyecto = isVisibilidadCeldaGuardarCambiosPresuProyecto;
	}
		
	public PresuProyectoSessionBean getpresuproyectoSessionBean() {
		return this.presuproyectoSessionBean;
	}
	
	public void setpresuproyectoSessionBean(PresuProyectoSessionBean presuproyectoSessionBean) {
		this.presuproyectoSessionBean=presuproyectoSessionBean;
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

	public Boolean getisVisibilidadFK_IdCentroCosto() {
		return this.isVisibilidadFK_IdCentroCosto;
	}

	public void setisVisibilidadFK_IdCentroCosto(Boolean isVisibilidadFK_IdCentroCosto) {
		this.isVisibilidadFK_IdCentroCosto=isVisibilidadFK_IdCentroCosto;
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

	public Boolean getisVisibilidadFK_IdPresuEstado() {
		return this.isVisibilidadFK_IdPresuEstado;
	}

	public void setisVisibilidadFK_IdPresuEstado(Boolean isVisibilidadFK_IdPresuEstado) {
		this.isVisibilidadFK_IdPresuEstado=isVisibilidadFK_IdPresuEstado;
	}

	public Boolean getisVisibilidadFK_IdPresuTipoProyecto() {
		return this.isVisibilidadFK_IdPresuTipoProyecto;
	}

	public void setisVisibilidadFK_IdPresuTipoProyecto(Boolean isVisibilidadFK_IdPresuTipoProyecto) {
		this.isVisibilidadFK_IdPresuTipoProyecto=isVisibilidadFK_IdPresuTipoProyecto;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysPresuProyecto(PresuProyecto presuproyecto)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(presuproyecto,null);
				this.setActualParaGuardarSucursalForeignKey(presuproyecto,null);
				this.setActualParaGuardarEjercicioForeignKey(presuproyecto,null);
				this.setActualParaGuardarPresuTipoProyectoForeignKey(presuproyecto,null);
				this.setActualParaGuardarCentroCostoForeignKey(presuproyecto,null);
				this.setActualParaGuardarPresuEstadoForeignKey(presuproyecto,null);
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
	
	public void bugActualizarReferenciaActual(PresuProyecto presuproyecto,PresuProyecto presuproyectoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalPresuProyecto(presuproyecto);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		presuproyectoAux.setId(presuproyecto.getId());
		presuproyectoAux.setVersionRow(presuproyecto.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessPresuProyecto();
		
			int intSelectedRow = this.jTableDatosPresuProyecto.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyecto =(PresuProyecto) this.presuproyectoLogic.getPresuProyectos().toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.presuproyecto =(PresuProyecto) this.presuproyectos.toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(PresuProyectoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualPresuProyecto(this.presuproyecto,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysPresuProyecto(this.presuproyecto);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = presuproyectoValidator.getInvalidValues(this.presuproyecto);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			presuproyectoLogic.setDatosCliente(datosCliente);
			presuproyectoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				presuproyectoAux=new  PresuProyecto();
				
				presuproyectoAux.setIsNew(true);
				presuproyectoAux.setIsChanged(true);
				
				presuproyectoAux.setPresuProyectoOriginal(this.presuproyecto);
				
				presuproyectoAux.setId(this.presuproyecto.getId());	
				presuproyectoAux.setVersionRow(this.presuproyecto.getVersionRow());	
				presuproyectoAux.setid_empresa(this.presuproyecto.getid_empresa());	
				presuproyectoAux.setid_sucursal(this.presuproyecto.getid_sucursal());	
				presuproyectoAux.setid_ejercicio(this.presuproyecto.getid_ejercicio());	
				presuproyectoAux.setcodigo(this.presuproyecto.getcodigo());	
				presuproyectoAux.setnombre(this.presuproyecto.getnombre());	
				presuproyectoAux.setid_presu_tipo_proyecto(this.presuproyecto.getid_presu_tipo_proyecto());	
				
				if(this.presuproyecto.getid_centro_costo()!=null && this.presuproyecto.getid_centro_costo()>0L) {
					presuproyectoAux.setid_centro_costo(this.presuproyecto.getid_centro_costo());
				} else {
					presuproyectoAux.setid_centro_costo(null);
				}	
				presuproyectoAux.setfecha(this.presuproyecto.getfecha());	
				presuproyectoAux.setvalor(this.presuproyecto.getvalor());	
				presuproyectoAux.setid_presu_estado(this.presuproyecto.getid_presu_estado());	
				presuproyectoAux.setdescripcion(this.presuproyecto.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.presuproyectoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.presuproyectoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(presuproyectoAux,presuproyectoLogic.getPresuProyectos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(presuproyectoAux,presuproyectos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.presuproyectoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.presuproyectoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presuproyectoLogic.savePresuProyectos();//WithConnection
						//presuproyectoLogic.getSetVersionRowPresuProyectos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.presuproyecto,presuproyectoAux);
					
					this.refrescarForeignKeysDescripcionesPresuProyecto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.presuproyectoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.presutransferenciaLogic.getPresuTransferencias().addAll(this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.presutransferenciasEliminados);
							this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.presuproyectocuentaLogic.getPresuProyectoCuentas().addAll(this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.presuproyectocuentasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.presutransferencias.addAll(this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.presutransferenciasEliminados);
							this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.presuproyectocuentas.addAll(this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.presuproyectocuentasEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.presuproyectoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								presuproyectoLogic.savePresuProyectoRelaciones(presuproyectoAux,this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.presutransferenciaLogic.getPresuTransferencias(),this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.presuproyectocuentaLogic.getPresuProyectoCuentas());//WithConnection
								//presuproyectoLogic.getSetVersionRowPresuProyectos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.presuproyecto,presuproyectoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.presutransferenciaLogic.setPresuTransferencias(new ArrayList<PresuTransferencia>());
							this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.presuproyectocuentaLogic.setPresuProyectoCuentas(new ArrayList<PresuProyectoCuenta>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.presutransferencias= new ArrayList<PresuTransferencia>();
							this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.presuproyectocuentas= new ArrayList<PresuProyectoCuenta>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.quitarFilaTotales();}
							presuproyectoAux.setPresuTransferencias(this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.presutransferenciaLogic.getPresuTransferencias());

							if(this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.quitarFilaTotales();}
							presuproyectoAux.setPresuProyectoCuentas(this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.presuproyectocuentaLogic.getPresuProyectoCuentas());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.presuproyectoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.presuproyectoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(presuproyectoAux,presuproyectoLogic.getPresuProyectos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(presuproyectoAux,presuproyectos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.presuproyecto,presuproyectoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				presuproyectoAux=new  PresuProyecto();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.presuproyectoSessionBean.getEsGuardarRelacionado() 
					|| (this.presuproyectoSessionBean.getEsGuardarRelacionado() && this.presuproyecto.getId()>=0)) {
						
					presuproyectoAux.setIsNew(false);
				}
				
				presuproyectoAux.setIsDeleted(false);
			
				presuproyectoAux.setId(this.presuproyecto.getId());	
				presuproyectoAux.setVersionRow(this.presuproyecto.getVersionRow());	
				presuproyectoAux.setid_empresa(this.presuproyecto.getid_empresa());	
				presuproyectoAux.setid_sucursal(this.presuproyecto.getid_sucursal());	
				presuproyectoAux.setid_ejercicio(this.presuproyecto.getid_ejercicio());	
				presuproyectoAux.setcodigo(this.presuproyecto.getcodigo());	
				presuproyectoAux.setnombre(this.presuproyecto.getnombre());	
				presuproyectoAux.setid_presu_tipo_proyecto(this.presuproyecto.getid_presu_tipo_proyecto());	
				
				if(this.presuproyecto.getid_centro_costo()!=null && this.presuproyecto.getid_centro_costo()>0L) {
					presuproyectoAux.setid_centro_costo(this.presuproyecto.getid_centro_costo());
				} else {
					presuproyectoAux.setid_centro_costo(null);
				}	
				presuproyectoAux.setfecha(this.presuproyecto.getfecha());	
				presuproyectoAux.setvalor(this.presuproyecto.getvalor());	
				presuproyectoAux.setid_presu_estado(this.presuproyecto.getid_presu_estado());	
				presuproyectoAux.setdescripcion(this.presuproyecto.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(presuproyectoAux,presuproyectoLogic.getPresuProyectos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(presuproyectoAux,presuproyectos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.presuproyectoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.presuproyectoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presuproyectoLogic.savePresuProyectos();//WithConnection
						//presuproyectoLogic.getSetVersionRowPresuProyectos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.presuproyecto,presuproyectoAux);
					
					this.refrescarForeignKeysDescripcionesPresuProyecto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.presuproyectoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.presutransferenciaLogic.getPresuTransferencias().addAll(this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.presutransferenciasEliminados);
							this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.presuproyectocuentaLogic.getPresuProyectoCuentas().addAll(this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.presuproyectocuentasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.presutransferencias.addAll(this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.presutransferenciasEliminados);
							this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.presuproyectocuentas.addAll(this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.presuproyectocuentasEliminados);
						}
						//ARCHITECTURE
						
						if(!this.presuproyectoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								presuproyectoLogic.savePresuProyectoRelaciones(presuproyectoAux,this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.presutransferenciaLogic.getPresuTransferencias(),this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.presuproyectocuentaLogic.getPresuProyectoCuentas());//WithConnection
								//presuproyectoLogic.getSetVersionRowPresuProyectos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.presuproyecto,presuproyectoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.presutransferenciaLogic.setPresuTransferencias(new ArrayList<PresuTransferencia>());
							this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.presuproyectocuentaLogic.setPresuProyectoCuentas(new ArrayList<PresuProyectoCuenta>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.presutransferencias= new ArrayList<PresuTransferencia>();
							this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.presuproyectocuentas= new ArrayList<PresuProyectoCuenta>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.quitarFilaTotales();}
							presuproyectoAux.setPresuTransferencias(this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.presutransferenciaLogic.getPresuTransferencias());

							if(this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.quitarFilaTotales();}
							presuproyectoAux.setPresuProyectoCuentas(this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.presuproyectocuentaLogic.getPresuProyectoCuentas());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.presuproyectoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.presuproyectoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(presuproyectoAux,presuproyectoLogic.getPresuProyectos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(presuproyectoAux,presuproyectos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.presuproyecto,presuproyectoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				presuproyectoAux=new  PresuProyecto();
				
				presuproyectoAux.setIsNew(false);
				presuproyectoAux.setIsChanged(false);
				
				presuproyectoAux.setIsDeleted(true);
				
				presuproyectoAux.setId(this.presuproyecto.getId());	
				presuproyectoAux.setVersionRow(this.presuproyecto.getVersionRow());	
				presuproyectoAux.setid_empresa(this.presuproyecto.getid_empresa());	
				presuproyectoAux.setid_sucursal(this.presuproyecto.getid_sucursal());	
				presuproyectoAux.setid_ejercicio(this.presuproyecto.getid_ejercicio());	
				presuproyectoAux.setcodigo(this.presuproyecto.getcodigo());	
				presuproyectoAux.setnombre(this.presuproyecto.getnombre());	
				presuproyectoAux.setid_presu_tipo_proyecto(this.presuproyecto.getid_presu_tipo_proyecto());	
				
				if(this.presuproyecto.getid_centro_costo()!=null && this.presuproyecto.getid_centro_costo()>0L) {
					presuproyectoAux.setid_centro_costo(this.presuproyecto.getid_centro_costo());
				} else {
					presuproyectoAux.setid_centro_costo(null);
				}	
				presuproyectoAux.setfecha(this.presuproyecto.getfecha());	
				presuproyectoAux.setvalor(this.presuproyecto.getvalor());	
				presuproyectoAux.setid_presu_estado(this.presuproyecto.getid_presu_estado());	
				presuproyectoAux.setdescripcion(this.presuproyecto.getdescripcion());	
				
				if(this.presuproyectoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.presuproyectoAux.getId()>=0) {	
						this.presuproyectosEliminados.add(presuproyectoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(presuproyectoAux,presuproyectoLogic.getPresuProyectos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(presuproyectoAux,presuproyectos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.presuproyectoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.presuproyectoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presuproyectoLogic.savePresuProyectos();//WithConnection
						//presuproyectoLogic.getSetVersionRowPresuProyectos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.presuproyectoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.presutransferenciaLogic.getPresuTransferencias().addAll(this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.presutransferenciasEliminados);
							this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.presuproyectocuentaLogic.getPresuProyectoCuentas().addAll(this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.presuproyectocuentasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.presutransferencias.addAll(this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.presutransferenciasEliminados);
							this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.presuproyectocuentas.addAll(this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.presuproyectocuentasEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.presuproyectoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.jInternalFrameDetalleFormPresuProyectoCuenta.presuasignacionBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								presuproyectoLogic.savePresuProyectoRelaciones(presuproyectoAux,this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.presutransferenciaLogic.getPresuTransferencias(),this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.presuproyectocuentaLogic.getPresuProyectoCuentas());//WithConnection
								//presuproyectoLogic.getSetVersionRowPresuProyectos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.presutransferenciaLogic.setPresuTransferencias(new ArrayList<PresuTransferencia>());
							this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.presuproyectocuentaLogic.setPresuProyectoCuentas(new ArrayList<PresuProyectoCuenta>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.presutransferencias= new ArrayList<PresuTransferencia>();
							this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.presuproyectocuentas= new ArrayList<PresuProyectoCuenta>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.quitarFilaTotales();}
							presuproyectoAux.setPresuTransferencias(this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.presutransferenciaLogic.getPresuTransferencias());

							if(this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.quitarFilaTotales();}
							presuproyectoAux.setPresuProyectoCuentas(this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.presuproyectocuentaLogic.getPresuProyectoCuentas());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.presuproyectoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.presuproyectoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(presuproyectoAux,presuproyectoLogic.getPresuProyectos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(presuproyectoAux,presuproyectos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoLogic.getPresuProyectos().addAll(this.presuproyectosEliminados);
					
					presuproyectoLogic.savePresuProyectos();//WithConnection
					//presuproyectoLogic.getSetVersionRowPresuProyectos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesPresuProyecto();
				
				this.presuproyectosEliminados= new ArrayList<PresuProyecto>();		
			}
			
			if(this.presuproyectoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presuproyectoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Proyecto GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Proyecto",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.presuproyecto=presuproyectoAux;
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
      		//this.finishProcessPresuProyecto();
      	}
		
	}	
	
	public void actualizarRelaciones(PresuProyecto presuproyectoLocal) throws Exception {
		
		if(this.presuproyectoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				presuproyectoLocal.setPresuTransferencias(this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.presutransferenciaLogic.getPresuTransferencias());
				presuproyectoLocal.setPresuProyectoCuentas(this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.presuproyectocuentaLogic.getPresuProyectoCuentas());
			
			} else {
			
				presuproyectoLocal.setPresuTransferencias(this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.presutransferencias);
				presuproyectoLocal.setPresuProyectoCuentas(this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.presuproyectocuentas);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(PresuProyecto presuproyectoLocal) throws Exception {	
		if(this.presuproyectoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				presuproyectoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				presuproyectoLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				presuproyectoLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PresuTipoProyectoDetalleFormJInternalFrame.class)) {
				PresuTipoProyectoBeanSwingJInternalFrame presutipoproyectoBeanSwingJInternalFrameLocal=(PresuTipoProyectoBeanSwingJInternalFrame) ((PresuTipoProyectoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				presutipoproyectoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPresuTipoProyecto(presutipoproyectoBeanSwingJInternalFrameLocal.getpresutipoproyecto(),true);
				presutipoproyectoBeanSwingJInternalFrameLocal.actualizarLista(presutipoproyectoBeanSwingJInternalFrameLocal.presutipoproyecto,this.presutipoproyectosForeignKey);

				presutipoproyectoBeanSwingJInternalFrameLocal.actualizarRelaciones(presutipoproyectoBeanSwingJInternalFrameLocal.presutipoproyecto);

				presuproyectoLocal.setPresuTipoProyecto(presutipoproyectoBeanSwingJInternalFrameLocal.presutipoproyecto);

				this.addItemDefectoCombosForeignKeyPresuTipoProyecto();
				this.cargarCombosFramePresuTipoProyectosForeignKey("Formulario");
				this.setActualPresuTipoProyectoForeignKey(presutipoproyectoBeanSwingJInternalFrameLocal.presutipoproyecto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CentroCostoDetalleFormJInternalFrame.class)) {
				CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrameLocal=(CentroCostoBeanSwingJInternalFrame) ((CentroCostoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				centrocostoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCentroCosto(centrocostoBeanSwingJInternalFrameLocal.getcentrocosto(),true);
				centrocostoBeanSwingJInternalFrameLocal.actualizarLista(centrocostoBeanSwingJInternalFrameLocal.centrocosto,this.centrocostosForeignKey);

				centrocostoBeanSwingJInternalFrameLocal.actualizarRelaciones(centrocostoBeanSwingJInternalFrameLocal.centrocosto);

				presuproyectoLocal.setCentroCosto(centrocostoBeanSwingJInternalFrameLocal.centrocosto);

				this.addItemDefectoCombosForeignKeyCentroCosto();
				this.cargarCombosFrameCentroCostosForeignKey("Formulario");
				this.setActualCentroCostoForeignKey(centrocostoBeanSwingJInternalFrameLocal.centrocosto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PresuEstadoDetalleFormJInternalFrame.class)) {
				PresuEstadoBeanSwingJInternalFrame presuestadoBeanSwingJInternalFrameLocal=(PresuEstadoBeanSwingJInternalFrame) ((PresuEstadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				presuestadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPresuEstado(presuestadoBeanSwingJInternalFrameLocal.getpresuestado(),true);
				presuestadoBeanSwingJInternalFrameLocal.actualizarLista(presuestadoBeanSwingJInternalFrameLocal.presuestado,this.presuestadosForeignKey);

				presuestadoBeanSwingJInternalFrameLocal.actualizarRelaciones(presuestadoBeanSwingJInternalFrameLocal.presuestado);

				presuproyectoLocal.setPresuEstado(presuestadoBeanSwingJInternalFrameLocal.presuestado);

				this.addItemDefectoCombosForeignKeyPresuEstado();
				this.cargarCombosFramePresuEstadosForeignKey("Formulario");
				this.setActualPresuEstadoForeignKey(presuestadoBeanSwingJInternalFrameLocal.presuestado.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarPresuProyectoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosPresuProyecto.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.presuproyecto =(PresuProyecto) this.presuproyectoLogic.getPresuProyectos().toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.presuproyecto =(PresuProyecto) this.presuproyectos.toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = presuproyectoValidator.getInvalidValues(this.presuproyecto);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(PresuProyecto presuproyecto,List<PresuProyecto> presuproyectos) throws Exception {
		try	{		
			PresuProyectoConstantesFunciones.actualizarLista(presuproyecto,presuproyectos,this.presuproyectoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(PresuProyecto presuproyecto,List<PresuProyecto> presuproyectos) throws Exception {
		try	{			
			PresuProyectoConstantesFunciones.actualizarSelectedLista(presuproyecto,presuproyectos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<PresuProyecto> presuproyectosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				presuproyectosLocal=this.presuproyectoLogic.getPresuProyectos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				presuproyectosLocal=this.presuproyectos;
			}
			//ARCHITECTURE
		
			for(PresuProyecto presuproyectoLocal:presuproyectosLocal) {
				if(this.permiteMantenimiento(presuproyectoLocal) && presuproyectoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+PresuProyectoConstantesFunciones.getPresuProyectoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(PresuProyectoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuProyecto.jLabelid_empresaPresuProyecto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresuProyectoConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuProyecto.jLabelid_sucursalPresuProyecto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresuProyectoConstantesFunciones.IDEJERCICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuProyecto.jLabelid_ejercicioPresuProyecto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresuProyectoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuProyecto.jLabelcodigoPresuProyecto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresuProyectoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuProyecto.jLabelnombrePresuProyecto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresuProyectoConstantesFunciones.IDPRESUTIPOPROYECTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuProyecto.jLabelid_presu_tipo_proyectoPresuProyecto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresuProyectoConstantesFunciones.IDCENTROCOSTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuProyecto.jLabelid_centro_costoPresuProyecto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresuProyectoConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuProyecto.jLabelfechaPresuProyecto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresuProyectoConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuProyecto.jLabelvalorPresuProyecto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresuProyectoConstantesFunciones.IDPRESUESTADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuProyecto.jLabelid_presu_estadoPresuProyecto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresuProyectoConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuProyecto.jLabeldescripcionPresuProyecto,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormPresuProyecto!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresuProyecto.jLabelid_empresaPresuProyecto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresuProyecto.jLabelid_sucursalPresuProyecto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresuProyecto.jLabelid_ejercicioPresuProyecto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresuProyecto.jLabelcodigoPresuProyecto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresuProyecto.jLabelnombrePresuProyecto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresuProyecto.jLabelid_presu_tipo_proyectoPresuProyecto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresuProyecto.jLabelid_centro_costoPresuProyecto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresuProyecto.jLabelfechaPresuProyecto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresuProyecto.jLabelvalorPresuProyecto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresuProyecto.jLabelid_presu_estadoPresuProyecto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresuProyecto.jLabeldescripcionPresuProyecto,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("PresuTransferencia")) {
			if(this.presuproyecto==null) {
				this.presuproyecto= new PresuProyecto();
			}

			if(this.presuproyectoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoPresuProyecto
				this.setVariablesFormularioToObjetoActualPresuProyecto(this.presuproyecto,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysPresuProyecto(this.presuproyecto);

				this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.getpresutransferencia().setPresuProyecto(this.presuproyecto);
			}

			return;
		}
		 else  if(sTipo.equals("PresuProyectoCuenta")) {
			if(this.presuproyecto==null) {
				this.presuproyecto= new PresuProyecto();
			}

			if(this.presuproyectoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoPresuProyecto
				this.setVariablesFormularioToObjetoActualPresuProyecto(this.presuproyecto,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysPresuProyecto(this.presuproyecto);

				this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.getpresuproyectocuenta().setPresuProyecto(this.presuproyecto);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoPresuProyecto--;	
		
		
		this.presuproyectoAux=new PresuProyecto();
		
		this.presuproyectoAux.setId(this.iIdNuevoPresuProyecto);
		this.presuproyectoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.presuproyectoLogic.getPresuProyectos().add(this.presuproyectoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.presuproyectos.add(this.presuproyectoAux);
		}
		//ARCHITECTURE
		
		this.presuproyecto=this.presuproyectoAux;
		
		if(PresuProyectoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioPresuProyecto(this.presuproyecto);
			this.setVariablesObjetoActualToFormularioForeignKeyPresuProyecto(this.presuproyecto);
		}
				
		//this.setDefaultControlesPresuProyecto();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyPresuProyecto();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyPresuProyecto();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyPresuProyecto();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPresuProyecto(this.presuproyectoBean,this.presuproyecto,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysPresuProyecto(this.presuproyecto);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(PresuProyectoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.presuproyectoSessionBean.getConGuardarRelaciones()) {
			classes=PresuProyectoConstantesFunciones.getClassesRelationshipsOfPresuProyecto(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.presuproyectoReturnGeneral=presuproyectoLogic.procesarEventosPresuProyectosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.presuproyectoLogic.getPresuProyectos(),this.presuproyecto,this.presuproyectoParameterGeneral,this.isEsNuevoPresuProyecto,classes);//this.presuproyectoLogic.getPresuProyecto()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanPresuProyecto(this.presuproyectoReturnGeneral,this.presuproyectoBean,false);
		
		if(this.presuproyectoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyPresuProyecto(this.presuproyectoReturnGeneral.getPresuProyecto());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioPresuProyecto(this.presuproyectoReturnGeneral.getPresuProyecto());
		}
		
		if(this.presuproyectoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioPresuProyecto(this.presuproyectoReturnGeneral.getPresuProyecto(),classes);//this.presuproyectoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualPresuProyecto(this.presuproyecto,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyPresuProyecto();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyPresuProyecto();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PresuProyectoBeanSwingJInternalFrameAdditional.RecargarFormPresuProyecto(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingPresuProyecto(false);
						
			if(presuproyectoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.presutransferenciaSessionBean.getEsGuardarRelacionado() && PresuTransferenciaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPresuTransferenciaActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.presuproyectocuentaSessionBean.getEsGuardarRelacionado() && PresuProyectoCuentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPresuProyectoCuentaActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(PresuProyectoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPresuProyecto();
			}
			
			this.actualizarVisualTableDatosPresuProyecto();
			
			this.jTableDatosPresuProyecto.setRowSelectionInterval(this.getIndiceNuevoPresuProyecto(), this.getIndiceNuevoPresuProyecto());
			
			this.seleccionarFilaTablaPresuProyectoActual();
						
			this.actualizarEstadoCeldasBotonesPresuProyecto("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesPresuProyecto(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormPresuProyecto.jTextAreacodigoPresuProyecto.setEnabled(isHabilitar && this.presuproyectoConstantesFunciones.activarcodigoPresuProyecto);
		this.jInternalFrameDetalleFormPresuProyecto.jTextAreanombrePresuProyecto.setEnabled(isHabilitar && this.presuproyectoConstantesFunciones.activarnombrePresuProyecto);
		this.jInternalFrameDetalleFormPresuProyecto.jDateChooserfechaPresuProyecto.setEnabled(isHabilitar && this.presuproyectoConstantesFunciones.activarfechaPresuProyecto);
		this.jInternalFrameDetalleFormPresuProyecto.jTextFieldvalorPresuProyecto.setEnabled(isHabilitar && this.presuproyectoConstantesFunciones.activarvalorPresuProyecto);
		this.jInternalFrameDetalleFormPresuProyecto.jTextAreadescripcionPresuProyecto.setEnabled(isHabilitar && this.presuproyectoConstantesFunciones.activardescripcionPresuProyecto);	
		//
		this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_empresaPresuProyecto.setEnabled(isHabilitar && this.presuproyectoConstantesFunciones.activarid_empresaPresuProyecto);//
		this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_sucursalPresuProyecto.setEnabled(isHabilitar && this.presuproyectoConstantesFunciones.activarid_sucursalPresuProyecto);
		this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_ejercicioPresuProyecto.setEnabled(isHabilitar && this.presuproyectoConstantesFunciones.activarid_ejercicioPresuProyecto);
		this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_presu_tipo_proyectoPresuProyecto.setEnabled(isHabilitar && this.presuproyectoConstantesFunciones.activarid_presu_tipo_proyectoPresuProyecto);
		this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_centro_costoPresuProyecto.setEnabled(isHabilitar && this.presuproyectoConstantesFunciones.activarid_centro_costoPresuProyecto);
		this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_presu_estadoPresuProyecto.setEnabled(isHabilitar && this.presuproyectoConstantesFunciones.activarid_presu_estadoPresuProyecto);
	};
	
	public void setDefaultControlesPresuProyecto() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoPresuProyecto(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.presuproyectoSessionBean.setConGuardarRelaciones(true);			
			this.presuproyectoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormPresuProyecto.jTabbedPaneRelacionesPresuProyecto.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.presutransferenciaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.presuproyectocuentaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.presuproyectoSessionBean.setConGuardarRelaciones(false);			
			this.presuproyectoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormPresuProyecto.jTabbedPaneRelacionesPresuProyecto.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.presutransferenciaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.presuproyectocuentaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoPresuProyecto() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresuProyecto presuproyectoAux:this.presuproyectoLogic.getPresuProyectos()) {
				if(presuproyectoAux.getId().equals(this.iIdNuevoPresuProyecto)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresuProyecto presuproyectoAux:this.presuproyectos) {
				if(presuproyectoAux.getId().equals(this.iIdNuevoPresuProyecto)) {
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
	
	public int getIndiceActualPresuProyecto(PresuProyecto presuproyecto,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresuProyecto presuproyectoAux:this.presuproyectoLogic.getPresuProyectos()) {
				if(presuproyectoAux.getId().equals(presuproyecto.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresuProyecto presuproyectoAux:this.presuproyectos) {
				if(presuproyectoAux.getId().equals(presuproyecto.getId())) {
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
	
	public void setCamposBaseDesdeOriginalPresuProyecto(PresuProyecto presuproyectoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresuProyecto presuproyectoAux:this.presuproyectoLogic.getPresuProyectos()) {
				if(presuproyectoAux.getPresuProyectoOriginal().getId().equals(presuproyectoOriginal.getId())) {
					existe=true;
					presuproyectoOriginal.setId(presuproyectoAux.getId());
					presuproyectoOriginal.setVersionRow(presuproyectoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresuProyecto presuproyectoAux:this.presuproyectos) {
				if(presuproyectoAux.getPresuProyectoOriginal().getId().equals(presuproyectoOriginal.getId())) {
					existe=true;
					presuproyectoOriginal.setId(presuproyectoAux.getId());
					presuproyectoOriginal.setVersionRow(presuproyectoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosPresuProyecto(Boolean esParaCancelar) throws Exception {
		presuproyectosAux=new ArrayList<PresuProyecto>();
		presuproyectoAux=new PresuProyecto();
		
		if(!this.presuproyectoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PresuProyecto presuproyectoAux:this.presuproyectoLogic.getPresuProyectos()) {
					if(presuproyectoAux.getId()<0) {
						presuproyectosAux.add(presuproyectoAux);
					}		
				}
				this.iIdNuevoPresuProyecto=0L;
				this.presuproyectoLogic.getPresuProyectos().removeAll(presuproyectosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PresuProyecto presuproyectoAux:this.presuproyectos) {
					if(presuproyectoAux.getId()<0) {
						presuproyectosAux.add(presuproyectoAux);
					}		
				}
				this.iIdNuevoPresuProyecto=0L;
				this.presuproyectos.removeAll(presuproyectosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoPresuProyecto 
					&& this.presuproyectoLogic.getPresuProyectos().size()>0
					) {
					presuproyectoAux=this.presuproyectoLogic.getPresuProyectos().get(this.presuproyectoLogic.getPresuProyectos().size() - 1);
				
					if(presuproyectoAux.getId()<0) {
						this.presuproyectoLogic.getPresuProyectos().remove(presuproyectoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoPresuProyecto && this.presuproyectos.size()>0) {
					presuproyectoAux=this.presuproyectos.get(this.presuproyectos.size() - 1);
				
					if(presuproyectoAux.getId()<0) {
						this.presuproyectos.remove(presuproyectoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoPresuProyecto(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(presuproyecto.getId()<0) {
				this.presuproyectoLogic.getPresuProyectos().remove(this.presuproyecto);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(presuproyecto.getId()<0) {
				this.presuproyectos.remove(this.presuproyecto);
			}
		}			
	}
	
	public void setEstadosInicialesPresuProyecto(List<PresuProyecto> presuproyectosAux) throws Exception {
		PresuProyectoConstantesFunciones.setEstadosInicialesPresuProyecto(presuproyectosAux);
	}
	
	public void setEstadosInicialesPresuProyecto(PresuProyecto presuproyectoAux) throws Exception {
		PresuProyectoConstantesFunciones.setEstadosInicialesPresuProyecto(presuproyectoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarPresuProyectoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesPresuProyecto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarPresuProyectoActual()) {
				if(!this.isEsNuevoPresuProyecto) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesPresuProyecto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoPresuProyecto=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarPresuProyectoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Proyecto ?", "MANTENIMIENTO DE Proyecto", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesPresuProyecto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(PresuProyecto presuproyecto) throws Exception {
		PresuProyectoConstantesFunciones.seleccionarAsignar(this.presuproyecto,presuproyecto);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarPresuProyecto=this.isPermisoActualizarOriginalPresuProyecto;
			
			
			this.seleccionarAsignar(presuproyecto);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PresuProyectoConstantesFunciones.quitarEspaciosPresuProyecto(this.presuproyecto,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesPresuProyecto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.presuproyectoSessionBean.setsFuncionBusquedaRapida(this.presuproyectoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoPresuProyecto) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosPresuProyecto(esParaCancelar);				
				this.cancelarNuevoPresuProyecto(esParaCancelar);								
			}
			
			this.presuproyecto=new PresuProyecto();
			
			this.inicializarPresuProyecto();
			
			this.actualizarEstadoCeldasBotonesPresuProyecto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarPresuProyecto() throws Exception {
		try {
			PresuProyectoConstantesFunciones.inicializarPresuProyecto(this.presuproyecto);
			
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
			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.presuproyectoLogic.getPresuProyectos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReportePresuProyectos(String sAccionBusqueda,List<PresuProyecto> presuproyectosParaReportes) throws Exception {
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
					sPathReporteFinal="PresuProyecto"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="PresuProyectoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("PresuProyectoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="PresuProyecto"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Proyectoes");		
		parameters.put("busquedapor", PresuProyectoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(PresuTransferencia.class));
			classes.add(new Classe(PresuProyectoCuenta.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					PresuProyectoLogic presuproyectoLogicAuxiliar=new PresuProyectoLogic();
					presuproyectoLogicAuxiliar.setDatosCliente(presuproyectoLogic.getDatosCliente());				
					presuproyectoLogicAuxiliar.setPresuProyectos(presuproyectosParaReportes);
					
					presuproyectoLogicAuxiliar.cargarRelacionesLoteForeignKeyPresuProyectoWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					presuproyectosParaReportes=presuproyectoLogicAuxiliar.getPresuProyectos();
					
					//presuproyectoLogic.getNewConnexionToDeep();
					
					//for (PresuProyecto presuproyecto:presuproyectosParaReportes) {
					//	presuproyectoLogic.deepLoad(presuproyecto, false, DeepLoadType.INCLUDE, classes);
					//}						
					//presuproyectoLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//presuproyectoLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFilePresuTransferencia = AuxiliarReportes.class.getResourceAsStream("PresuTransferenciaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_presutransferencia", reportFilePresuTransferencia);

			InputStream reportFilePresuProyectoCuenta = AuxiliarReportes.class.getResourceAsStream("PresuProyectoCuentaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_presuproyectocuenta", reportFilePresuProyectoCuenta);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourcePresuProyecto=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			PresuProyectoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			PresuProyectoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourcePresuProyecto=new JRBeanArrayDataSource(PresuProyectoJInternalFrame.TraerPresuProyectoBeans(presuproyectosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourcePresuProyecto);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+PresuProyectoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+PresuProyectoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(PresuProyectoBean.TraerPresuProyectoBeans(presuproyectosParaReportes).toArray()));
							
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
				this.generarExcelReportePresuProyectos(sAccionBusqueda,sTipoArchivoReporte,presuproyectosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalPresuProyectos(sAccionBusqueda,sTipoArchivoReporte,presuproyectosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoPresuProyectoActionPerformed(null);
					//this.generarExcelReportePresuProyectos(sAccionBusqueda,sTipoArchivoReporte,presuproyectosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalPresuProyectos(sAccionBusqueda,sTipoArchivoReporte,presuproyectosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesPresuProyectos(sAccionBusqueda,sTipoArchivoReporte,presuproyectosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesPresuProyectos(sAccionBusqueda,sTipoArchivoReporte,presuproyectosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReportePresuProyectos(String sAccionBusqueda,String sTipoArchivoReporte,List<PresuProyecto> presuproyectosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presuproyecto";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PresuProyectos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPresuProyecto("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(PresuProyecto presuproyecto : presuproyectosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			PresuProyectoConstantesFunciones.generarExcelReporteDataPresuProyecto("NORMAL",row,workbook,presuproyecto,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presuproyectoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proyecto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderPresuProyecto(String sTipo,Row row,Workbook workbook) {
		
		PresuProyectoConstantesFunciones.generarExcelReporteHeaderPresuProyecto(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalPresuProyectos(String sAccionBusqueda,String sTipoArchivoReporte,List<PresuProyecto> presuproyectosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presuproyecto_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PresuProyectos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(PresuProyecto presuproyecto : presuproyectosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(PresuProyectoConstantesFunciones.getPresuProyectoDescripcion(presuproyecto));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresuProyectoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresuProyectoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presuproyecto.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresuProyectoConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresuProyectoConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presuproyecto.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresuProyectoConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresuProyectoConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presuproyecto.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresuProyectoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresuProyectoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presuproyecto.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresuProyectoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresuProyectoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presuproyecto.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresuProyectoConstantesFunciones.LABEL_IDPRESUTIPOPROYECTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresuProyectoConstantesFunciones.LABEL_IDPRESUTIPOPROYECTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presuproyecto.getpresutipoproyecto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresuProyectoConstantesFunciones.LABEL_IDCENTROCOSTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresuProyectoConstantesFunciones.LABEL_IDCENTROCOSTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presuproyecto.getcentrocosto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresuProyectoConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresuProyectoConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presuproyecto.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresuProyectoConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresuProyectoConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presuproyecto.getvalor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresuProyectoConstantesFunciones.LABEL_IDPRESUESTADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresuProyectoConstantesFunciones.LABEL_IDPRESUESTADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presuproyecto.getpresuestado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresuProyectoConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresuProyectoConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presuproyecto.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presuproyectoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proyecto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesPresuProyectos(String sAccionBusqueda,String sTipoArchivoReporte,List<PresuProyecto> presuproyectosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<PresuProyecto> presuproyectosRespaldo=null;
		
		classes=PresuProyectoConstantesFunciones.getClassesRelationshipsOfPresuProyecto(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.presuproyectoLogic.setDatosCliente(this.datosCliente);
		this.presuproyectoLogic.setDatosDeep(this.datosDeep);
		this.presuproyectoLogic.setIsConDeep(true);
		
		presuproyectosRespaldo=this.presuproyectoLogic.getPresuProyectos();
		
		this.presuproyectoLogic.setPresuProyectos(presuproyectosParaReportes);	
		this.presuproyectoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		presuproyectosParaReportes=this.presuproyectoLogic.getPresuProyectos();
		this.presuproyectoLogic.setPresuProyectos(presuproyectosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presuproyecto_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PresuProyectos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPresuProyecto("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(PresuProyecto presuproyecto : presuproyectosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderPresuProyecto("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			PresuProyectoConstantesFunciones.generarExcelReporteDataPresuProyecto("NORMAL",row,workbook,presuproyecto,cellStyleDataAux);
		
			
			


				//PresuTransferencia
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(PresuTransferenciaConstantesFunciones.SCLASSWEBTITULO))) {

				if(presuproyecto.getPresuTransferencias()!=null && presuproyecto.getPresuTransferencias().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(PresuTransferenciaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					PresuTransferenciaConstantesFunciones.generarExcelReporteHeaderPresuTransferencia("RELACIONADO",row,workbook);
				}

				if(presuproyecto.getPresuTransferencias()!=null) {
					i2=0;
					for(PresuTransferencia presutransferencia : presuproyecto.getPresuTransferencias()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						PresuTransferenciaConstantesFunciones.generarExcelReporteDataPresuTransferencia("RELACIONADO",row,workbook,presutransferencia,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//PresuProyectoCuenta
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(PresuProyectoCuentaConstantesFunciones.SCLASSWEBTITULO))) {

				if(presuproyecto.getPresuProyectoCuentas()!=null && presuproyecto.getPresuProyectoCuentas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(PresuProyectoCuentaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					PresuProyectoCuentaConstantesFunciones.generarExcelReporteHeaderPresuProyectoCuenta("RELACIONADO",row,workbook);
				}

				if(presuproyecto.getPresuProyectoCuentas()!=null) {
					i2=0;
					for(PresuProyectoCuenta presuproyectocuenta : presuproyecto.getPresuProyectoCuentas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						PresuProyectoCuentaConstantesFunciones.generarExcelReporteDataPresuProyectoCuenta("RELACIONADO",row,workbook,presuproyectocuenta,cellStyleDataAuxHijo);
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
		cell.setCellValue(PresuProyectoConstantesFunciones.getPresuProyectoDescripcion(presuproyecto));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presuproyectoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proyecto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoPresuProyecto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPresuProyecto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoPresuProyecto.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPresuProyecto.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessPresuProyecto() throws Exception {		
		this.startProcessPresuProyecto(true);
	}
	
	public void startProcessPresuProyecto(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasPresuProyecto ,this.jPanelParametrosReportesPresuProyecto, this.jScrollPanelDatosPresuProyecto,this.jPanelPaginacionPresuProyecto, this.jScrollPanelDatosEdicionPresuProyecto, this.jPanelAccionesPresuProyecto,this.jPanelAccionesFormularioPresuProyecto,this.jmenuBarPresuProyecto,this.jmenuBarDetallePresuProyecto,this.jTtoolBarPresuProyecto,this.jTtoolBarDetallePresuProyecto);		
		
		final JTabbedPane jTabbedPaneBusquedasPresuProyecto=this.jTabbedPaneBusquedasPresuProyecto; 
		
		final JPanel jPanelParametrosReportesPresuProyecto=this.jPanelParametrosReportesPresuProyecto;
		//final JScrollPane jScrollPanelDatosPresuProyecto=this.jScrollPanelDatosPresuProyecto;
		final JTable jTableDatosPresuProyecto=this.jTableDatosPresuProyecto;		
		final JPanel jPanelPaginacionPresuProyecto=this.jPanelPaginacionPresuProyecto;
		//final JScrollPane jScrollPanelDatosEdicionPresuProyecto=this.jScrollPanelDatosEdicionPresuProyecto;
		final JPanel jPanelAccionesPresuProyecto=this.jPanelAccionesPresuProyecto;
		
		JPanel jPanelCamposAuxiliarPresuProyecto=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarPresuProyecto=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormPresuProyecto!=null) {
			jPanelCamposAuxiliarPresuProyecto=this.jInternalFrameDetalleFormPresuProyecto.jPanelCamposPresuProyecto;
			jPanelAccionesFormularioAuxiliarPresuProyecto=this.jInternalFrameDetalleFormPresuProyecto.jPanelAccionesFormularioPresuProyecto;
		}
		
		final JPanel jPanelCamposPresuProyecto=jPanelCamposAuxiliarPresuProyecto;
		final JPanel jPanelAccionesFormularioPresuProyecto=jPanelAccionesFormularioAuxiliarPresuProyecto;
		
		
		final JMenuBar jmenuBarPresuProyecto=this.jmenuBarPresuProyecto;
		final JToolBar jTtoolBarPresuProyecto=this.jTtoolBarPresuProyecto;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarPresuProyecto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPresuProyecto=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormPresuProyecto!=null) {
			jmenuBarDetalleAuxiliarPresuProyecto=this.jInternalFrameDetalleFormPresuProyecto.jmenuBarDetallePresuProyecto;
			jTtoolBarDetalleAuxiliarPresuProyecto=this.jInternalFrameDetalleFormPresuProyecto.jTtoolBarDetallePresuProyecto;
		}
		
		final JMenuBar jmenuBarDetallePresuProyecto=jmenuBarDetalleAuxiliarPresuProyecto;
		final JToolBar jTtoolBarDetallePresuProyecto=jTtoolBarDetalleAuxiliarPresuProyecto;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPresuProyecto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPresuProyecto;
			processRunnable.jTableDatos=jTableDatosPresuProyecto;
			processRunnable.jPanelCampos=jPanelCamposPresuProyecto;
			processRunnable.jPanelPaginacion=jPanelPaginacionPresuProyecto;
			processRunnable.jPanelAcciones=jPanelAccionesPresuProyecto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPresuProyecto;
			
			
			processRunnable.jmenuBar=jmenuBarPresuProyecto;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePresuProyecto;
			processRunnable.jTtoolBar=jTtoolBarPresuProyecto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePresuProyecto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPresuProyecto ,jPanelParametrosReportesPresuProyecto,jTableDatosPresuProyecto, /*jScrollPanelDatosPresuProyecto,*/jPanelCamposPresuProyecto,jPanelPaginacionPresuProyecto, /*jScrollPanelDatosEdicionPresuProyecto,*/ jPanelAccionesPresuProyecto,jPanelAccionesFormularioPresuProyecto,jmenuBarPresuProyecto,jmenuBarDetallePresuProyecto,jTtoolBarPresuProyecto,jTtoolBarDetallePresuProyecto);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPresuProyecto ,jPanelParametrosReportesPresuProyecto, jScrollPanelDatosPresuProyecto,jPanelPaginacionPresuProyecto, jScrollPanelDatosEdicionPresuProyecto, jPanelAccionesPresuProyecto,jPanelAccionesFormularioPresuProyecto,jmenuBarPresuProyecto,jmenuBarDetallePresuProyecto,jTtoolBarPresuProyecto,jTtoolBarDetallePresuProyecto);
						
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
	
	public void finishProcessPresuProyecto() {// throws Exception 
		this.finishProcessPresuProyecto(true);
	}
	
	public void finishProcessPresuProyecto(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasPresuProyecto ,this.jPanelParametrosReportesPresuProyecto, this.jScrollPanelDatosPresuProyecto,this.jPanelPaginacionPresuProyecto, this.jScrollPanelDatosEdicionPresuProyecto, this.jPanelAccionesPresuProyecto,this.jPanelAccionesFormularioPresuProyecto,this.jmenuBarPresuProyecto,this.jmenuBarDetallePresuProyecto,this.jTtoolBarPresuProyecto,this.jTtoolBarDetallePresuProyecto);		
		
		final JTabbedPane jTabbedPaneBusquedasPresuProyecto=this.jTabbedPaneBusquedasPresuProyecto; 
		
		final JPanel jPanelParametrosReportesPresuProyecto=this.jPanelParametrosReportesPresuProyecto;
		//final JScrollPane jScrollPanelDatosPresuProyecto=this.jScrollPanelDatosPresuProyecto;
		final JTable jTableDatosPresuProyecto=this.jTableDatosPresuProyecto;		
		final JPanel jPanelPaginacionPresuProyecto=this.jPanelPaginacionPresuProyecto;
		//final JScrollPane jScrollPanelDatosEdicionPresuProyecto=this.jScrollPanelDatosEdicionPresuProyecto;
		final JPanel jPanelAccionesPresuProyecto=this.jPanelAccionesPresuProyecto;
		
		JPanel jPanelCamposAuxiliarPresuProyecto=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarPresuProyecto=new JPanel();
		
		if(this.jInternalFrameDetalleFormPresuProyecto!=null) {
			jPanelCamposAuxiliarPresuProyecto=this.jInternalFrameDetalleFormPresuProyecto.jPanelCamposPresuProyecto;
			jPanelAccionesFormularioAuxiliarPresuProyecto=this.jInternalFrameDetalleFormPresuProyecto.jPanelAccionesFormularioPresuProyecto;
		}
		
		final JPanel jPanelCamposPresuProyecto=jPanelCamposAuxiliarPresuProyecto;
		final JPanel jPanelAccionesFormularioPresuProyecto=jPanelAccionesFormularioAuxiliarPresuProyecto;
		
		
		final JMenuBar jmenuBarPresuProyecto=this.jmenuBarPresuProyecto;		
		final JToolBar jTtoolBarPresuProyecto=this.jTtoolBarPresuProyecto;
				
		JMenuBar jmenuBarDetalleAuxiliarPresuProyecto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPresuProyecto=new JToolBar();
		
		if(this.jInternalFrameDetalleFormPresuProyecto!=null) {
			jmenuBarDetalleAuxiliarPresuProyecto=this.jInternalFrameDetalleFormPresuProyecto.jmenuBarDetallePresuProyecto;
			jTtoolBarDetalleAuxiliarPresuProyecto=this.jInternalFrameDetalleFormPresuProyecto.jTtoolBarDetallePresuProyecto;		
		}
		
		final JMenuBar jmenuBarDetallePresuProyecto=jmenuBarDetalleAuxiliarPresuProyecto;
		final JToolBar jTtoolBarDetallePresuProyecto=jTtoolBarDetalleAuxiliarPresuProyecto;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPresuProyecto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPresuProyecto;
			processRunnable.jTableDatos=jTableDatosPresuProyecto;
			processRunnable.jPanelCampos=jPanelCamposPresuProyecto;
			processRunnable.jPanelPaginacion=jPanelPaginacionPresuProyecto;
			processRunnable.jPanelAcciones=jPanelAccionesPresuProyecto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPresuProyecto;
			
			
			processRunnable.jmenuBar=jmenuBarPresuProyecto;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePresuProyecto;
			processRunnable.jTtoolBar=jTtoolBarPresuProyecto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePresuProyecto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasPresuProyecto ,jPanelParametrosReportesPresuProyecto, jTableDatosPresuProyecto,/*jScrollPanelDatosPresuProyecto,*/jPanelCamposPresuProyecto,jPanelPaginacionPresuProyecto, /*jScrollPanelDatosEdicionPresuProyecto,*/ jPanelAccionesPresuProyecto,jPanelAccionesFormularioPresuProyecto,jmenuBarPresuProyecto,jmenuBarDetallePresuProyecto,jTtoolBarPresuProyecto,jTtoolBarDetallePresuProyecto));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesPresuProyecto(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarPresuProyecto(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuPresuProyecto(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarPresuProyecto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarPresuProyecto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetallePresuProyecto,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuPresuProyecto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarPresuProyecto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetallePresuProyecto,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.presuproyectoConstantesFunciones.getsFinalQueryPresuProyecto();
		String  finalQueryPaginacionTodos=this.presuproyectoConstantesFunciones.getsFinalQueryPresuProyecto();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=PresuProyectoConstantesFunciones.getArrayColumnasGlobalesNoPresuProyecto(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=PresuProyectoConstantesFunciones.getArrayColumnasGlobalesPresuProyecto(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,PresuProyectoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.presuproyectosEliminados= new ArrayList<PresuProyecto>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessPresuProyecto();
		
				///*PresuProyectoSessionBean*/this.presuproyectoSessionBean=new PresuProyectoSessionBean();
			
			if(this.presuproyectoSessionBean==null) {
				this.presuproyectoSessionBean=new PresuProyectoSessionBean();
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
					this.iNumeroPaginacion=PresuProyectoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=PresuProyectoConstantesFunciones.getClassesForeignKeysOfPresuProyecto(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/presuproyecto."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			presuproyectosAux= new ArrayList<PresuProyecto>();
			
				
			presuproyectoLogic.setDatosCliente(this.datosCliente);
			presuproyectoLogic.setDatosDeep(this.datosDeep);
			presuproyectoLogic.setIsConDeep(true);
			
			
			presuproyectoLogic.getPresuProyectoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					presuproyectoLogic.getTodosPresuProyectos(finalQueryGlobal,pagination);
					
					//presuproyectoLogic.getTodosPresuProyectosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(presuproyectoLogic.getPresuProyectos()==null|| presuproyectoLogic.getPresuProyectos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							presuproyectosAux= new ArrayList<PresuProyecto>();
							presuproyectosAux.addAll(presuproyectoLogic.getPresuProyectos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presuproyectosAux= new ArrayList<PresuProyecto>();
							presuproyectosAux.addAll(presuproyectos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							presuproyectoLogic.getTodosPresuProyectos(finalQueryGlobal+"",this.pagination);												
							
							//presuproyectoLogic.getTodosPresuProyectosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReportePresuProyectos("Todos",presuproyectoLogic.getPresuProyectos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							presuproyectoLogic.setPresuProyectos(new ArrayList<PresuProyecto>());					
							presuproyectoLogic.getPresuProyectos().addAll(presuproyectosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presuproyectos=new ArrayList<PresuProyecto>();
							presuproyectos.addAll(presuproyectosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idPresuProyecto=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idPresuProyecto=this.idActual;
				
				} else if(this.idPresuProyectoActual!=null && this.idPresuProyectoActual!=0L) {
					idPresuProyecto=idPresuProyectoActual;
				}
				
					
				this.sDetalleReporte=PresuProyectoConstantesFunciones.getDetalleIndicePorId(idPresuProyecto);
				
				this.presuproyectos=new ArrayList<PresuProyecto>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					presuproyectoLogic.getEntity(idPresuProyecto);
					
					//presuproyectoLogic.getEntityWithConnection(idPresuProyecto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presuproyectoLogic.setPresuProyectos(new ArrayList<PresuProyecto>());
					presuproyectoLogic.getPresuProyectos().add(presuproyectoLogic.getPresuProyecto());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presuproyectos=new ArrayList<PresuProyecto>();
					this.presuproyectos.add(presuproyecto);
				}
				
				if(presuproyectoLogic.getPresuProyecto()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=PresuProyectoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					presuproyectoLogic.getPresuProyectosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresuProyectoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresuProyectoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=presuproyectoLogic.getPresuProyectos()==null||presuproyectoLogic.getPresuProyectos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=presuproyectos==null|| presuproyectos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						presuproyectosAux=new ArrayList<PresuProyecto>();
						presuproyectosAux.addAll(presuproyectoLogic.getPresuProyectos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presuproyectosAux=new ArrayList<PresuProyecto>();
							presuproyectosAux.addAll(presuproyectos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							presuproyectoLogic.getPresuProyectosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresuProyectoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresuProyectoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePresuProyectos("BusquedaPorCodigo",presuproyectoLogic.getPresuProyectos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePresuProyectos("BusquedaPorCodigo",presuproyectos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						presuproyectoLogic.setPresuProyectos(new ArrayList<PresuProyecto>());
						presuproyectoLogic.getPresuProyectos().addAll(presuproyectosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presuproyectos=new ArrayList<PresuProyecto>();
							presuproyectos.addAll(presuproyectosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=PresuProyectoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					presuproyectoLogic.getPresuProyectosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresuProyectoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresuProyectoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=presuproyectoLogic.getPresuProyectos()==null||presuproyectoLogic.getPresuProyectos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=presuproyectos==null|| presuproyectos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						presuproyectosAux=new ArrayList<PresuProyecto>();
						presuproyectosAux.addAll(presuproyectoLogic.getPresuProyectos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presuproyectosAux=new ArrayList<PresuProyecto>();
							presuproyectosAux.addAll(presuproyectos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							presuproyectoLogic.getPresuProyectosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresuProyectoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresuProyectoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePresuProyectos("BusquedaPorNombre",presuproyectoLogic.getPresuProyectos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePresuProyectos("BusquedaPorNombre",presuproyectos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						presuproyectoLogic.setPresuProyectos(new ArrayList<PresuProyecto>());
						presuproyectoLogic.getPresuProyectos().addAll(presuproyectosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presuproyectos=new ArrayList<PresuProyecto>();
							presuproyectos.addAll(presuproyectosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEjercicio")) {
				this.sDetalleReporte=PresuProyectoConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					presuproyectoLogic.getPresuProyectosFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresuProyectoConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresuProyectoConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=presuproyectoLogic.getPresuProyectos()==null||presuproyectoLogic.getPresuProyectos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=presuproyectos==null|| presuproyectos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						presuproyectosAux=new ArrayList<PresuProyecto>();
						presuproyectosAux.addAll(presuproyectoLogic.getPresuProyectos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presuproyectosAux=new ArrayList<PresuProyecto>();
							presuproyectosAux.addAll(presuproyectos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							presuproyectoLogic.getPresuProyectosFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresuProyectoConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresuProyectoConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePresuProyectos("FK_IdEjercicio",presuproyectoLogic.getPresuProyectos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePresuProyectos("FK_IdEjercicio",presuproyectos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						presuproyectoLogic.setPresuProyectos(new ArrayList<PresuProyecto>());
						presuproyectoLogic.getPresuProyectos().addAll(presuproyectosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presuproyectos=new ArrayList<PresuProyecto>();
							presuproyectos.addAll(presuproyectosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=PresuProyectoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					presuproyectoLogic.getPresuProyectosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresuProyectoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresuProyectoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=presuproyectoLogic.getPresuProyectos()==null||presuproyectoLogic.getPresuProyectos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=presuproyectos==null|| presuproyectos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						presuproyectosAux=new ArrayList<PresuProyecto>();
						presuproyectosAux.addAll(presuproyectoLogic.getPresuProyectos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presuproyectosAux=new ArrayList<PresuProyecto>();
							presuproyectosAux.addAll(presuproyectos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							presuproyectoLogic.getPresuProyectosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresuProyectoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresuProyectoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePresuProyectos("FK_IdEmpresa",presuproyectoLogic.getPresuProyectos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePresuProyectos("FK_IdEmpresa",presuproyectos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						presuproyectoLogic.setPresuProyectos(new ArrayList<PresuProyecto>());
						presuproyectoLogic.getPresuProyectos().addAll(presuproyectosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presuproyectos=new ArrayList<PresuProyecto>();
							presuproyectos.addAll(presuproyectosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=PresuProyectoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					presuproyectoLogic.getPresuProyectosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresuProyectoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresuProyectoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=presuproyectoLogic.getPresuProyectos()==null||presuproyectoLogic.getPresuProyectos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=presuproyectos==null|| presuproyectos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						presuproyectosAux=new ArrayList<PresuProyecto>();
						presuproyectosAux.addAll(presuproyectoLogic.getPresuProyectos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presuproyectosAux=new ArrayList<PresuProyecto>();
							presuproyectosAux.addAll(presuproyectos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							presuproyectoLogic.getPresuProyectosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresuProyectoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresuProyectoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePresuProyectos("FK_IdSucursal",presuproyectoLogic.getPresuProyectos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePresuProyectos("FK_IdSucursal",presuproyectos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						presuproyectoLogic.setPresuProyectos(new ArrayList<PresuProyecto>());
						presuproyectoLogic.getPresuProyectos().addAll(presuproyectosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presuproyectos=new ArrayList<PresuProyecto>();
							presuproyectos.addAll(presuproyectosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesPresuProyecto();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessPresuProyecto();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=presuproyectoLogic.getPresuProyectos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=presuproyectos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=presuproyectoLogic.getPresuProyectos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=presuproyectos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(PresuProyecto presuproyecto) {
		Boolean permite=true;
		
		if(this.presuproyecto.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=PresuProyectoConstantesFunciones.getOrderByListaPresuProyecto();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=PresuProyectoConstantesFunciones.getOrderByListaPresuProyecto();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresuProyecto presuproyecto:presuproyectoLogic.getPresuProyectos()) {
				if(presuproyecto.getsType().equals(Constantes2.S_TOTALES)) {
					presuproyectoTotales=presuproyecto;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresuProyecto presuproyecto:this.presuproyectos) {
				if(presuproyecto.getsType().equals(Constantes2.S_TOTALES)) {
					presuproyectoTotales=presuproyecto;
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
			this.presuproyectoAux=new PresuProyecto();
			this.presuproyectoAux.setsType(Constantes2.S_TOTALES);
			this.presuproyectoAux.setIsNew(false);
			this.presuproyectoAux.setIsChanged(false);
			this.presuproyectoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				PresuProyectoConstantesFunciones.TotalizarValoresFilaPresuProyecto(this.presuproyectoLogic.getPresuProyectos(),this.presuproyectoAux);
				
				this.presuproyectoLogic.getPresuProyectos().add(this.presuproyectoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				PresuProyectoConstantesFunciones.TotalizarValoresFilaPresuProyecto(this.presuproyectos,this.presuproyectoAux);
				
				this.presuproyectos.add(this.presuproyectoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		presuproyectoTotales=new PresuProyecto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.presuproyectoLogic.getPresuProyectos().remove(presuproyectoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.presuproyectos.remove(presuproyectoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		presuproyectoTotales=new PresuProyecto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresuProyecto presuproyecto:presuproyectoLogic.getPresuProyectos()) {
				if(presuproyecto.getsType().equals(Constantes2.S_TOTALES)) {
					presuproyectoTotales=presuproyecto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PresuProyectoConstantesFunciones.TotalizarValoresFilaPresuProyecto(this.presuproyectoLogic.getPresuProyectos(),presuproyectoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresuProyecto presuproyecto:this.presuproyectos) {
				if(presuproyecto.getsType().equals(Constantes2.S_TOTALES)) {
					presuproyectoTotales=presuproyecto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PresuProyectoConstantesFunciones.TotalizarValoresFilaPresuProyecto(this.presuproyectos,presuproyectoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getPresuProyectosBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPresuProyectosBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPresuProyectosFK_IdCentroCosto()throws Exception {
		try {
			sAccionBusqueda="FK_IdCentroCosto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPresuProyectosFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPresuProyectosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPresuProyectosFK_IdPresuEstado()throws Exception {
		try {
			sAccionBusqueda="FK_IdPresuEstado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPresuProyectosFK_IdPresuTipoProyecto()throws Exception {
		try {
			sAccionBusqueda="FK_IdPresuTipoProyecto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPresuProyectosFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getPresuProyectosBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presuproyectoLogic.getPresuProyectosBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPresuProyectosBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presuproyectoLogic.getPresuProyectosBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPresuProyectosFK_IdCentroCosto(String sFinalQuery,Long id_centro_costo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presuproyectoLogic.getPresuProyectosFK_IdCentroCosto(sFinalQuery,this.pagination,id_centro_costo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPresuProyectosFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presuproyectoLogic.getPresuProyectosFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPresuProyectosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presuproyectoLogic.getPresuProyectosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPresuProyectosFK_IdPresuEstado(String sFinalQuery,Long id_presu_estado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presuproyectoLogic.getPresuProyectosFK_IdPresuEstado(sFinalQuery,this.pagination,id_presu_estado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPresuProyectosFK_IdPresuTipoProyecto(String sFinalQuery,Long id_presu_tipo_proyecto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presuproyectoLogic.getPresuProyectosFK_IdPresuTipoProyecto(sFinalQuery,this.pagination,id_presu_tipo_proyecto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPresuProyectosFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presuproyectoLogic.getPresuProyectosFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosPresuProyecto() {
		this.isPermisoTodoPresuProyecto=false;
		this.isPermisoNuevoPresuProyecto=false;
		this.isPermisoActualizarPresuProyecto=false;
		this.isPermisoActualizarOriginalPresuProyecto=false;
		this.isPermisoEliminarPresuProyecto=false;
		this.isPermisoGuardarCambiosPresuProyecto=false;
		this.isPermisoConsultaPresuProyecto=false;
		this.isPermisoBusquedaPresuProyecto=false;
		this.isPermisoReportePresuProyecto=false;		
		this.isPermisoOrdenPresuProyecto=false;		
		this.isPermisoPaginacionMedioPresuProyecto=false;		
		this.isPermisoPaginacionAltoPresuProyecto=false;
		this.isPermisoPaginacionTodoPresuProyecto=false;
		this.isPermisoCopiarPresuProyecto=false;		
		this.isPermisoVerFormPresuProyecto=false;		
		this.isPermisoDuplicarPresuProyecto=false;		
		this.isPermisoOrdenPresuProyecto=false;		
	}
	
	public void setPermisosUsuarioPresuProyecto(Boolean isPermiso) {
		this.isPermisoTodoPresuProyecto=isPermiso;
		this.isPermisoNuevoPresuProyecto=isPermiso;
		this.isPermisoActualizarPresuProyecto=isPermiso;
		this.isPermisoActualizarOriginalPresuProyecto=isPermiso;
		this.isPermisoEliminarPresuProyecto=isPermiso;
		this.isPermisoGuardarCambiosPresuProyecto=isPermiso;
		this.isPermisoConsultaPresuProyecto=isPermiso;
		this.isPermisoBusquedaPresuProyecto=isPermiso;
		this.isPermisoReportePresuProyecto=isPermiso;
		this.isPermisoOrdenPresuProyecto=isPermiso;		
		this.isPermisoPaginacionMedioPresuProyecto=isPermiso;		
		this.isPermisoPaginacionAltoPresuProyecto=isPermiso;		
		this.isPermisoPaginacionTodoPresuProyecto=isPermiso;		
		this.isPermisoCopiarPresuProyecto=isPermiso;		
		this.isPermisoVerFormPresuProyecto=isPermiso;		
		this.isPermisoDuplicarPresuProyecto=isPermiso;
		this.isPermisoOrdenPresuProyecto=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioPresuProyecto(Boolean isPermiso) {
		//this.isPermisoTodoPresuProyecto=isPermiso;
		this.isPermisoNuevoPresuProyecto=isPermiso;
		this.isPermisoActualizarPresuProyecto=isPermiso;
		this.isPermisoActualizarOriginalPresuProyecto=isPermiso;
		this.isPermisoEliminarPresuProyecto=isPermiso;
		this.isPermisoGuardarCambiosPresuProyecto=isPermiso;
		//this.isPermisoConsultaPresuProyecto=isPermiso;
		//this.isPermisoBusquedaPresuProyecto=isPermiso;
		//this.isPermisoReportePresuProyecto=isPermiso;
		//this.isPermisoOrdenPresuProyecto=isPermiso;		
		//this.isPermisoPaginacionMedioPresuProyecto=isPermiso;		
		//this.isPermisoPaginacionAltoPresuProyecto=isPermiso;		
		//this.isPermisoPaginacionTodoPresuProyecto=isPermiso;		
		//this.isPermisoCopiarPresuProyecto=isPermiso;		
		//this.isPermisoDuplicarPresuProyecto=isPermiso;
		//this.isPermisoOrdenPresuProyecto=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioPresuProyectoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(PresuTransferenciaConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(PresuProyectoCuentaConstantesFunciones.SNOMBREOPCION);
		
		if(PresuProyectoJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosPresuTransferencia=false;
		this.isTienePermisosPresuTransferencia=this.verificarGetPermisosUsuarioOpcionPresuProyectoClaseRelacionada(this.opcionsRelacionadas,PresuTransferenciaConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosPresuProyectoCuenta=false;
		this.isTienePermisosPresuProyectoCuenta=this.verificarGetPermisosUsuarioOpcionPresuProyectoClaseRelacionada(this.opcionsRelacionadas,PresuProyectoCuentaConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebPresuProyecto(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioPresuProyectoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosPresuTransferencia=conPermiso;
		this.isTienePermisosPresuProyectoCuenta=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioPresuProyectoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionPresuProyectoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioPresuProyectoClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosPresuTransferencia && this.jInternalFrameDetalleFormPresuProyecto!=null && this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormPresuProyecto.jTabbedPaneRelacionesPresuProyecto.remove(this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosPresuProyectoCuenta && this.jInternalFrameDetalleFormPresuProyecto!=null && this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormPresuProyecto.jTabbedPaneRelacionesPresuProyecto.remove(this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioPresuProyecto() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(PresuProyectoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.presuproyectoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, PresuProyectoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoPresuProyecto=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarPresuProyecto=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalPresuProyecto=this.isPermisoActualizarPresuProyecto;
			this.isPermisoEliminarPresuProyecto=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosPresuProyecto=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaPresuProyecto=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaPresuProyecto=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoPresuProyecto=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReportePresuProyecto=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPresuProyecto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioPresuProyecto=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoPresuProyecto=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoPresuProyecto=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarPresuProyecto=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormPresuProyecto=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarPresuProyecto=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPresuProyecto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.presuproyectoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosPresuProyecto.setToolTipText(this.jTableDatosPresuProyecto.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioPresuProyecto(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioPresuProyecto(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(PresuProyectoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(PresuProyectoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioPresuProyecto() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosPresuTransferencia && this.presuproyectoConstantesFunciones.mostrarPresuTransferenciaPresuProyecto && !PresuProyectoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Transferencia");
			reporte.setsDescripcion("Transferencia");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosPresuProyectoCuenta && this.presuproyectoConstantesFunciones.mostrarPresuProyectoCuentaPresuProyecto && !PresuProyectoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Cuenta Contable Proyecto");
			reporte.setsDescripcion("Cuenta Contable Proyecto");
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
	public void inicializarCombosForeignKeyPresuProyectoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.presutipoproyectosForeignKey=new ArrayList();
				this.centrocostosForeignKey=new ArrayList();
				this.presuestadosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyPresuProyectoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(PresuProyectoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyPresuProyectoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPresuTipoProyectoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCentroCostoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPresuEstadoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyPresuTipoProyectoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.presutipoproyectosForeignKey==null||this.presutipoproyectosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PresuTipoProyectoConstantesFunciones.getArrayColumnasGlobalesPresuTipoProyecto(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PresuTipoProyectoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PresuTipoProyectoConstantesFunciones.SFINALQUERY;

				this.cargarCombosPresuTipoProyectosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCentroCostoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.centrocostosForeignKey==null||this.centrocostosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CentroCostoConstantesFunciones.getArrayColumnasGlobalesCentroCosto(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CentroCostoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CentroCostoConstantesFunciones.SFINALQUERY;

				this.cargarCombosCentroCostosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyPresuEstadoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.presuestadosForeignKey==null||this.presuestadosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PresuEstadoConstantesFunciones.getArrayColumnasGlobalesPresuEstado(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PresuEstadoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PresuEstadoConstantesFunciones.SFINALQUERY;

				this.cargarCombosPresuEstadosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyPresuProyectoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			PresuProyectoParameterReturnGeneral presuproyectoReturnGeneral=new PresuProyectoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.presuproyectoConstantesFunciones.cargarid_empresaPresuProyecto)
					 || (this.esRecargarFks && this.presuproyectoConstantesFunciones.cargarid_empresaPresuProyecto)) {

					if(!this.presuproyectoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+presuproyectoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.presuproyectoConstantesFunciones.cargarid_sucursalPresuProyecto)
					 || (this.esRecargarFks && this.presuproyectoConstantesFunciones.cargarid_sucursalPresuProyecto)) {

					if(!this.presuproyectoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+presuproyectoSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalEjercicio="";

				if(((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0) && this.presuproyectoConstantesFunciones.cargarid_ejercicioPresuProyecto)
					 || (this.esRecargarFks && this.presuproyectoConstantesFunciones.cargarid_ejercicioPresuProyecto)) {

					if(!this.presuproyectoSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEjercicio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

						finalQueryGlobalEjercicio=Funciones.GetFinalQueryAppend(finalQueryGlobalEjercicio, "");
						finalQueryGlobalEjercicio+=EjercicioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEjercicio=" WHERE " + ConstantesSql.ID + "="+presuproyectoSessionBean.getlidEjercicioActual();
					}
				} else {
					finalQueryGlobalEjercicio="NONE";
				}


				String finalQueryGlobalPresuTipoProyecto="";

				if(((this.presutipoproyectosForeignKey==null||this.presutipoproyectosForeignKey.size()<=0) && this.presuproyectoConstantesFunciones.cargarid_presu_tipo_proyectoPresuProyecto)
					 || (this.esRecargarFks && this.presuproyectoConstantesFunciones.cargarid_presu_tipo_proyectoPresuProyecto)) {

					if(!this.presuproyectoSessionBean.getisBusquedaDesdeForeignKeySesionPresuTipoProyecto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PresuTipoProyectoConstantesFunciones.getArrayColumnasGlobalesPresuTipoProyecto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPresuTipoProyecto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PresuTipoProyectoConstantesFunciones.TABLENAME);

						finalQueryGlobalPresuTipoProyecto=Funciones.GetFinalQueryAppend(finalQueryGlobalPresuTipoProyecto, "");
						finalQueryGlobalPresuTipoProyecto+=PresuTipoProyectoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPresuTipoProyectosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPresuTipoProyecto=" WHERE " + ConstantesSql.ID + "="+presuproyectoSessionBean.getlidPresuTipoProyectoActual();
					}
				} else {
					finalQueryGlobalPresuTipoProyecto="NONE";
				}


				String finalQueryGlobalCentroCosto="";

				if(((this.centrocostosForeignKey==null||this.centrocostosForeignKey.size()<=0) && this.presuproyectoConstantesFunciones.cargarid_centro_costoPresuProyecto)
					 || (this.esRecargarFks && this.presuproyectoConstantesFunciones.cargarid_centro_costoPresuProyecto)) {

					if(!this.presuproyectoSessionBean.getisBusquedaDesdeForeignKeySesionCentroCosto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=CentroCostoConstantesFunciones.getArrayColumnasGlobalesCentroCosto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCentroCosto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CentroCostoConstantesFunciones.TABLENAME);

						finalQueryGlobalCentroCosto=Funciones.GetFinalQueryAppend(finalQueryGlobalCentroCosto, "");
						finalQueryGlobalCentroCosto+=CentroCostoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCentroCostosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCentroCosto=" WHERE " + ConstantesSql.ID + "="+presuproyectoSessionBean.getlidCentroCostoActual();
					}
				} else {
					finalQueryGlobalCentroCosto="NONE";
				}


				String finalQueryGlobalPresuEstado="";

				if(((this.presuestadosForeignKey==null||this.presuestadosForeignKey.size()<=0) && this.presuproyectoConstantesFunciones.cargarid_presu_estadoPresuProyecto)
					 || (this.esRecargarFks && this.presuproyectoConstantesFunciones.cargarid_presu_estadoPresuProyecto)) {

					if(!this.presuproyectoSessionBean.getisBusquedaDesdeForeignKeySesionPresuEstado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PresuEstadoConstantesFunciones.getArrayColumnasGlobalesPresuEstado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPresuEstado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PresuEstadoConstantesFunciones.TABLENAME);

						finalQueryGlobalPresuEstado=Funciones.GetFinalQueryAppend(finalQueryGlobalPresuEstado, "");
						finalQueryGlobalPresuEstado+=PresuEstadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPresuEstadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPresuEstado=" WHERE " + ConstantesSql.ID + "="+presuproyectoSessionBean.getlidPresuEstadoActual();
					}
				} else {
					finalQueryGlobalPresuEstado="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				presuproyectoReturnGeneral=presuproyectoLogic.cargarCombosLoteForeignKeyPresuProyecto(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalEjercicio,finalQueryGlobalPresuTipoProyecto,finalQueryGlobalCentroCosto,finalQueryGlobalPresuEstado);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=presuproyectoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=presuproyectoReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalEjercicio.equals("NONE")) {
				this.ejerciciosForeignKey=presuproyectoReturnGeneral.getejerciciosForeignKey();
			}

			if(!finalQueryGlobalPresuTipoProyecto.equals("NONE")) {
				this.presutipoproyectosForeignKey=presuproyectoReturnGeneral.getpresutipoproyectosForeignKey();
			}

			if(!finalQueryGlobalCentroCosto.equals("NONE")) {
				this.centrocostosForeignKey=presuproyectoReturnGeneral.getcentrocostosForeignKey();
			}

			if(!finalQueryGlobalPresuEstado.equals("NONE")) {
				this.presuestadosForeignKey=presuproyectoReturnGeneral.getpresuestadosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyPresuProyecto()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyPresuTipoProyecto();
			this.addItemDefectoCombosForeignKeyCentroCosto();
			this.addItemDefectoCombosForeignKeyPresuEstado();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.presuproyectoSessionBean==null) {
				this.presuproyectoSessionBean=new PresuProyectoSessionBean();
			}

			if(!this.presuproyectoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.presuproyectoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.presuproyectoSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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

	public void addItemDefectoCombosForeignKeyPresuTipoProyecto()throws Exception {
		try {

			if(!this.presuproyectoSessionBean.getisBusquedaDesdeForeignKeySesionPresuTipoProyecto()) {
				PresuTipoProyecto presutipoproyecto=new PresuTipoProyecto();
				PresuTipoProyectoConstantesFunciones.setPresuTipoProyectoDescripcion(presutipoproyecto,Constantes.SMENSAJE_ESCOJA_OPCION);
				presutipoproyecto.setId(null);

				if(!PresuTipoProyectoConstantesFunciones.ExisteEnLista(this.presutipoproyectosForeignKey,presutipoproyecto,true)) {

					this.presutipoproyectosForeignKey.add(0,presutipoproyecto);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCentroCosto()throws Exception {
		try {

			if(!this.presuproyectoSessionBean.getisBusquedaDesdeForeignKeySesionCentroCosto()) {
				CentroCosto centrocosto=new CentroCosto();
				CentroCostoConstantesFunciones.setCentroCostoDescripcion(centrocosto,Constantes.SMENSAJE_ESCOJA_OPCION);
				centrocosto.setId(null);

				if(!CentroCostoConstantesFunciones.ExisteEnLista(this.centrocostosForeignKey,centrocosto,true)) {

					this.centrocostosForeignKey.add(0,centrocosto);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyPresuEstado()throws Exception {
		try {

			if(!this.presuproyectoSessionBean.getisBusquedaDesdeForeignKeySesionPresuEstado()) {
				PresuEstado presuestado=new PresuEstado();
				PresuEstadoConstantesFunciones.setPresuEstadoDescripcion(presuestado,Constantes.SMENSAJE_ESCOJA_OPCION);
				presuestado.setId(null);

				if(!PresuEstadoConstantesFunciones.ExisteEnLista(this.presuestadosForeignKey,presuestado,true)) {

					this.presuestadosForeignKey.add(0,presuestado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyPresuProyecto()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyPresuProyecto(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyPresuProyecto()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
				this.presuproyecto.setfecha(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyPresuProyecto();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyPresuProyecto(PresuProyecto presuproyecto)throws Exception {	
		try {
			
			this.setActualEjercicioForeignKey(presuproyecto.getid_ejercicio(),false,"Formulario");
			this.setActualPresuTipoProyectoForeignKey(presuproyecto.getid_presu_tipo_proyecto(),false,"Formulario");
			this.setActualCentroCostoForeignKey(presuproyecto.getid_centro_costo(),false,"Formulario");
			this.setActualPresuEstadoForeignKey(presuproyecto.getid_presu_estado(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyPresuProyecto(PresuProyecto presuproyecto,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyPresuProyecto()throws Exception {	
		try {
			
			this.setActualEjercicioForeignKey(this.presuproyectoConstantesFunciones.getid_ejercicio(),false,"Formulario");
			this.setActualPresuTipoProyectoForeignKey(this.presuproyectoConstantesFunciones.getid_presu_tipo_proyecto(),false,"Formulario");
			this.setActualCentroCostoForeignKey(this.presuproyectoConstantesFunciones.getid_centro_costo(),false,"Formulario");
			this.setActualPresuEstadoForeignKey(this.presuproyectoConstantesFunciones.getid_presu_estado(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyPresuProyecto()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyPresuProyecto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyPresuProyecto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroPresuProyecto()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyPresuProyecto()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFramePresuTipoProyectosForeignKey("Todos");
			this.cargarCombosFrameCentroCostosForeignKey("Todos");
			this.cargarCombosFramePresuEstadosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyPresuProyecto(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePresuTipoProyectosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCentroCostosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePresuEstadosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyPresuProyecto()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_empresaPresuProyecto!=null && this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_empresaPresuProyecto.getItemCount()>0) {
				this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_empresaPresuProyecto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_sucursalPresuProyecto!=null && this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_sucursalPresuProyecto.getItemCount()>0) {
				this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_sucursalPresuProyecto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_ejercicioPresuProyecto!=null && this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_ejercicioPresuProyecto.getItemCount()>0) {
				this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_ejercicioPresuProyecto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_presu_tipo_proyectoPresuProyecto!=null && this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_presu_tipo_proyectoPresuProyecto.getItemCount()>0) {
				this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_presu_tipo_proyectoPresuProyecto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_centro_costoPresuProyecto!=null && this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_centro_costoPresuProyecto.getItemCount()>0) {
				this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_centro_costoPresuProyecto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_presu_estadoPresuProyecto!=null && this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_presu_estadoPresuProyecto.getItemCount()>0) {
				this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_presu_estadoPresuProyecto.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	












	
	

	public PresuProyectoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public PresuProyectoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public PresuProyectoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.presuproyectoSessionBean=new PresuProyectoSessionBean(); 
		this.presuproyectoConstantesFunciones=new PresuProyectoConstantesFunciones(); 
		this.presuproyectoBean=new PresuProyecto();//(this.presuproyectoConstantesFunciones); 		
		this.presuproyectoReturnGeneral=new PresuProyectoParameterReturnGeneral(); 
		
		this.presuproyectoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.presuproyectoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public PresuProyectoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public PresuProyectoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public PresuProyectoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessPresuProyecto(true);
			
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
			
			this.presuproyectoConstantesFunciones=new PresuProyectoConstantesFunciones(); 
			this.presuproyectoBean=new PresuProyecto();//this.presuproyectoConstantesFunciones); 			
			this.presuproyectoReturnGeneral=new PresuProyectoParameterReturnGeneral(); 
		
			PresuProyectoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proyecto Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.presuproyecto=new PresuProyecto();
			this.presuproyectos = new ArrayList<PresuProyecto>();
			this.presuproyectosAux = new ArrayList<PresuProyecto>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic=new PresuProyectoLogic();
				this.presuproyectoLogic.getNewConnexionToDeep("");
			}
			
			//this.presuproyectoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.presuproyectoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormPresuProyecto);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoPresuProyecto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPresuProyecto);	
					}
					
					if(this.jInternalFrameImportacionPresuProyecto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPresuProyecto);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByPresuProyecto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByPresuProyecto);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormPresuProyecto!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormPresuProyecto);
				this.jInternalFrameDetalleFormPresuProyecto.setVisible(false);
				this.jInternalFrameDetalleFormPresuProyecto.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoPresuProyecto!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPresuProyecto);
					this.jInternalFrameReporteDinamicoPresuProyecto.setVisible(false);
					this.jInternalFrameReporteDinamicoPresuProyecto.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionPresuProyecto!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionPresuProyecto);
					this.jInternalFrameImportacionPresuProyecto.setVisible(false);
					this.jInternalFrameImportacionPresuProyecto.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByPresuProyecto!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByPresuProyecto);
					this.jInternalFrameOrderByPresuProyecto.setVisible(false);
					this.jInternalFrameOrderByPresuProyecto.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idPresuProyectoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=PresuProyectoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.presuproyectoReturnGeneral=new PresuProyectoParameterReturnGeneral();
			
			this.presuproyectoParameterGeneral=new PresuProyectoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.presuproyectoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.presuproyectoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(PresuProyectoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.presuproyectoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(PresuTransferenciaConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(PresuProyectoCuentaConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PresuProyectoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.presuproyectoSessionBean.getEsGuardarRelacionado(),this.presuproyectoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PresuProyectoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.presuproyectoSessionBean.getEsGuardarRelacionado(),this.presuproyectoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoPresuProyecto=false;
			this.isVisibilidadCeldaDuplicarPresuProyecto=true;
			this.isVisibilidadCeldaCopiarPresuProyecto=true;
			this.isVisibilidadCeldaVerFormPresuProyecto=true;
			this.isVisibilidadCeldaOrdenPresuProyecto=true;
			this.isVisibilidadCeldaNuevoRelacionesPresuProyecto=false;
			this.isVisibilidadCeldaModificarPresuProyecto=false;
			this.isVisibilidadCeldaActualizarPresuProyecto=false;
			this.isVisibilidadCeldaEliminarPresuProyecto=false;
			this.isVisibilidadCeldaCancelarPresuProyecto=false;
			this.isVisibilidadCeldaGuardarPresuProyecto=false;
			this.isVisibilidadCeldaGuardarCambiosPresuProyecto=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdCentroCosto=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdPresuEstado=true;
			this.isVisibilidadFK_IdPresuTipoProyecto=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesPresuProyecto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosPresuProyecto();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioPresuProyecto(false);
			
			this.setPermisosUsuarioPresuProyecto();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.presuproyectoSessionBean.getEsGuardarRelacionado() 
				|| (this.presuproyectoSessionBean.getEsGuardarRelacionado() && this.presuproyectoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioPresuProyectoClasesRelacionadas();
			}
			
			if(this.presuproyectoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioPresuProyectoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!PresuProyectoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosPresuProyecto();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualPresuProyecto();
			}
			
			if(!this.isPermisoBusquedaPresuProyecto) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasPresuProyecto.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.presuproyectoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioPresuProyecto,this.isPermisoPaginacionMedioPresuProyecto,this.isPermisoPaginacionTodoPresuProyecto);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(PresuProyectoConstantesFunciones.getTiposSeleccionarPresuProyecto());
				
				this.tiposColumnasSelect=PresuProyectoConstantesFunciones.getTiposSeleccionarPresuProyecto(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectPresuProyecto();				
				//this.tiposRelacionesSelect=PresuProyectoConstantesFunciones.getTiposRelacionesPresuProyecto(true);
				
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
			//if(!this.presuproyectoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioPresuProyecto();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioPresuProyecto(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioPresuProyecto(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesPresuProyecto() ;
			
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
			
			
			this.presutransferenciaLogic=new PresuTransferenciaLogic();
			this.presuproyectocuentaLogic=new PresuProyectoCuentaLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			this.ejercicioLogic=new EjercicioLogic();
			this.presutipoproyectoLogic=new PresuTipoProyectoLogic();
			this.centrocostoLogic=new CentroCostoLogic();
			this.presuestadoLogic=new PresuEstadoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				presuproyectoImplementable= (PresuProyectoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PresuProyectoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				presuproyectoImplementableHome= (PresuProyectoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PresuProyectoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.presuproyectos= new ArrayList<PresuProyecto>();
			this.presuproyectosEliminados= new ArrayList<PresuProyecto>();
						
			this.isEsNuevoPresuProyecto=false;
			this.esParaAccionDesdeFormularioPresuProyecto=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			this.presutipoproyectosForeignKey=new ArrayList<PresuTipoProyecto>() ;
			this.centrocostosForeignKey=new ArrayList<CentroCosto>() ;
			this.presuestadosForeignKey=new ArrayList<PresuEstado>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyPresuProyecto(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroPresuProyecto();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.presuproyectoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			PresuProyectoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=PresuProyectoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesPresuProyecto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingPresuProyecto(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormPresuProyecto!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioPresuProyecto();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioPresuProyecto();
			}
			
			PresuProyectoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasPresuProyecto.getTabCount(); i++) {
					this.jTabbedPaneBusquedasPresuProyecto.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasPresuProyecto.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessPresuProyecto(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga PresuProyecto: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectPresuProyecto() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(PresuTransferenciaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(PresuTransferenciaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(PresuProyectoCuentaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(PresuProyectoCuentaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesPresuProyecto")) {
				iIndex=this.jInternalFrameDetalleFormPresuProyecto.jTabbedPaneRelacionesPresuProyecto.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormPresuProyecto.jTabbedPaneRelacionesPresuProyecto.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosPresuProyecto.getSelectedRow();	
				
				

				if(sTitle.equals("Cuenta Contable Proyectoes")) {
					if(!PresuProyectoCuentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessPresuProyecto();

						this.cargarParteTabPanelRelacionadaPresuProyectoCuenta(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Transferenciaes")) {
					if(!PresuTransferenciaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessPresuProyecto();

						this.cargarParteTabPanelRelacionadaPresuTransferencia(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessPresuProyecto();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaPresuProyectoCuenta(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormPresuProyecto.cargarSessionConBeanSwingJInternalFramePresuProyectoCuenta(false,true,iIndex);
		this.jButtonPresuProyectoCuentaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaPresuProyectoCuenta();

		//this.jTabbedPaneRelacionesPresuProyecto.updateUI();
		//this.jTabbedPaneRelacionesPresuProyecto.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesPresuProyecto.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaPresuTransferencia(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormPresuProyecto.cargarSessionConBeanSwingJInternalFramePresuTransferencia(false,true,iIndex);
		this.jButtonPresuTransferenciaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaPresuTransferencia();

		//this.jTabbedPaneRelacionesPresuProyecto.updateUI();
		//this.jTabbedPaneRelacionesPresuProyecto.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesPresuProyecto.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("PresuTransferencia")) {
				int row=this.jTableDatosPresuProyecto.getSelectedRow();
				jButtonPresuTransferenciaActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("PresuProyectoCuenta")) {
				int row=this.jTableDatosPresuProyecto.getSelectedRow();
				jButtonPresuProyectoCuentaActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.presuproyectoSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Transferencia")) {

					if(this.isTienePermisosPresuTransferencia && this.presuproyectoConstantesFunciones.mostrarPresuTransferenciaPresuProyecto && !PresuProyectoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Transferenciaes"+"("+PresuTransferenciaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Transferenciaes");

						if(presuproyectoConstantesFunciones.resaltarPresuTransferenciaPresuProyecto!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(presuproyectoConstantesFunciones.resaltarPresuTransferenciaPresuProyecto);
						}

						jmenuItem.setEnabled(this.presuproyectoConstantesFunciones.activarPresuTransferenciaPresuProyecto);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"PresuTransferencia"));

						

						this.jInternalFrameDetalleFormPresuProyecto.jmenuDetallePresuProyecto.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Cuenta Contable Proyecto")) {

					if(this.isTienePermisosPresuProyectoCuenta && this.presuproyectoConstantesFunciones.mostrarPresuProyectoCuentaPresuProyecto && !PresuProyectoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Cuenta Contable Proyectoes"+"("+PresuProyectoCuentaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Cuenta Contable Proyectoes");

						if(presuproyectoConstantesFunciones.resaltarPresuProyectoCuentaPresuProyecto!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(presuproyectoConstantesFunciones.resaltarPresuProyectoCuentaPresuProyecto);
						}

						jmenuItem.setEnabled(this.presuproyectoConstantesFunciones.activarPresuProyectoCuentaPresuProyecto);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"PresuProyectoCuenta"));

						

						this.jInternalFrameDetalleFormPresuProyecto.jmenuDetallePresuProyecto.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyPresuProyecto(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyPresuProyecto(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyPresuProyecto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyPresuProyectoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyPresuProyecto();
		
		this.cargarCombosFrameForeignKeyPresuProyecto();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyPresuProyecto();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyPresuProyecto();
		}
	}
	
	

	public void cargarCombosForeignKeyEjercicio(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEjercicio(this.ejerciciosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyPresuTipoProyecto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPresuTipoProyectoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPresuTipoProyecto();
				this.cargarCombosFramePresuTipoProyectosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaPresuTipoProyecto(this.presutipoproyectosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCentroCosto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCentroCostoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCentroCosto();
				this.cargarCombosFrameCentroCostosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCentroCosto(this.centrocostosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyPresuEstado(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPresuEstadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPresuEstado();
				this.cargarCombosFramePresuEstadosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaPresuEstado(this.presuestadosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoPresuProyectoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.presuproyectoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormPresuProyecto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			PresuProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.presuproyecto,new Object(),this.presuproyectoParameterGeneral,this.presuproyectoReturnGeneral);
			
			
			if(jTableDatosPresuProyecto.getRowCount()>=1) {
				jTableDatosPresuProyecto.removeRowSelectionInterval(0, jTableDatosPresuProyecto.getRowCount()-1);						
			}
			
			this.isEsNuevoPresuProyecto=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoPresuProyecto(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesPresuProyecto(true);			
			//this.presuproyecto=new PresuProyecto();
			//this.presuproyecto.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPresuProyecto(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPresuProyecto() ;
			
			if(PresuProyectoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePresuProyecto(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.presuproyecto);	
			this.actualizarInformacion("INFO_PADRE",false,this.presuproyecto);				
			
			PresuProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.presuproyecto,new Object(),this.presuproyectoParameterGeneral,this.presuproyectoReturnGeneral);
			
			if(this.presuproyectoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar PresuProyecto: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			PresuProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.presuproyecto,new Object(),this.presuproyectoParameterGeneral,this.presuproyectoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarPresuProyectoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<PresuProyecto> presuproyectosSeleccionados=new ArrayList<PresuProyecto>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosPresuProyecto.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosPresuProyecto.getSelectedRows().length;			
			}
			
			presuproyectosSeleccionados=this.getPresuProyectosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoPresuProyecto--;			
				//PresuProyecto presuproyectoAux= new PresuProyecto();			
				//presuproyectoAux.setId(this.iIdNuevoPresuProyecto);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//PresuProyecto presuproyectoOrigen=new PresuProyecto();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(PresuProyecto presuproyectoOrigen : presuproyectosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosPresuProyecto.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							presuproyectoOrigen =(PresuProyecto) this.presuproyectoLogic.getPresuProyectos().toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presuproyectoOrigen =(PresuProyecto) this.presuproyectos.toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaPresuProyecto();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.presuproyecto.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosPresuProyecto(presuproyectoOrigen,this.presuproyecto,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysPresuProyecto(this.presuproyecto);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.presuproyectoLogic.getPresuProyectos().add(this.presuproyectoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.presuproyectos.add(this.presuproyectoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaPresuProyecto(false);
				
				this.jTableDatosPresuProyecto.setRowSelectionInterval(this.getIndiceNuevoPresuProyecto(), this.getIndiceNuevoPresuProyecto());
				
				int iLastRow =  this.jTableDatosPresuProyecto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPresuProyecto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPresuProyecto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPresuProyecto(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarPresuProyectoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<PresuProyecto> presuproyectosSeleccionados=new ArrayList<PresuProyecto>();									
		
			PresuProyecto presuproyectoOrigen=new PresuProyecto();
			PresuProyecto presuproyectoDestino=new PresuProyecto();
				
			presuproyectosSeleccionados=this.getPresuProyectosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosPresuProyecto.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || presuproyectosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosPresuProyecto.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presuproyectoOrigen =(PresuProyecto) this.presuproyectoLogic.getPresuProyectos().toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						presuproyectoOrigen =(PresuProyecto) this.presuproyectos.toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presuproyectoDestino =(PresuProyecto) this.presuproyectoLogic.getPresuProyectos().toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						presuproyectoDestino =(PresuProyecto) this.presuproyectos.toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				presuproyectoOrigen =presuproyectosSeleccionados.get(0);
				presuproyectoDestino =presuproyectosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosPresuProyecto(presuproyectoOrigen,presuproyectoDestino,true,false);
				
				presuproyectoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(presuproyectoDestino,presuproyectoLogic.getPresuProyectos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(presuproyectoDestino,presuproyectos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaPresuProyecto(false);
				
				//this.jTableDatosPresuProyecto.setRowSelectionInterval(this.getIndiceNuevoPresuProyecto(), this.getIndiceNuevoPresuProyecto());
				
				int iLastRow =  this.jTableDatosPresuProyecto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPresuProyecto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPresuProyecto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPresuProyecto(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormPresuProyectoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPresuProyecto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormPresuProyecto.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarPresuProyectoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesPresuProyecto.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasPresuProyecto.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesPresuProyecto.setVisible(!isVisible);
			this.jPanelPaginacionPresuProyecto.setVisible(!isVisible);
			this.jPanelAccionesPresuProyecto.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarPresuProyectoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFramePresuProyecto();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoPresuProyectoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoPresuProyecto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionPresuProyectoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionPresuProyecto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByPresuProyectoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByPresuProyecto();
			
			this.abrirFrameOrderByPresuProyecto();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByPresuProyectoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByPresuProyecto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetallePresuProyecto(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormPresuProyecto);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormPresuProyecto.isMaximum()) {
					this.jInternalFrameDetalleFormPresuProyecto.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormPresuProyecto.setSize(this.jInternalFrameDetalleFormPresuProyecto.iWidthFormulario,this.jInternalFrameDetalleFormPresuProyecto.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormPresuProyecto.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormPresuProyecto.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormPresuProyecto.isMaximum()) {
						this.jInternalFrameDetalleFormPresuProyecto.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormPresuProyecto.jContentPaneDetallePresuProyecto.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormPresuProyecto.jTabbedPaneRelacionesPresuProyecto.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormPresuProyecto.jContentPaneDetallePresuProyecto.getWidth(),PresuProyectoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPresuProyecto.jTabbedPaneRelacionesPresuProyecto.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormPresuProyecto.jContentPaneDetallePresuProyecto.getWidth(),PresuProyectoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPresuProyecto.jTabbedPaneRelacionesPresuProyecto.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormPresuProyecto.jContentPaneDetallePresuProyecto.getWidth(),PresuProyectoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(PresuProyectoCuentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaPresuProyectoCuenta();
					}

					if(PresuTransferenciaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaPresuTransferencia();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormPresuProyecto.setVisible(true);
	        this.jInternalFrameDetalleFormPresuProyecto.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByPresuProyecto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByPresuProyecto==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByPresuProyecto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPresuProyecto,false,this);
				} else {
					this.jInternalFrameOrderByPresuProyecto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPresuProyecto,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByPresuProyecto);
				this.jInternalFrameOrderByPresuProyecto.setVisible(false);
				this.jInternalFrameOrderByPresuProyecto.setSelected(false);
				
				this.jInternalFrameOrderByPresuProyecto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPresuProyecto"));
				
				this.inicializarActualizarBindingTablaOrderByPresuProyecto();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionPresuProyecto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionPresuProyecto==null) {
				
				this.jInternalFrameImportacionPresuProyecto=new ImportacionJInternalFrame(PresuProyectoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPresuProyecto);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionPresuProyecto);
				this.jInternalFrameImportacionPresuProyecto.setVisible(false);
				this.jInternalFrameImportacionPresuProyecto.setSelected(false);


				this.jInternalFrameImportacionPresuProyecto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPresuProyecto"));
				this.jInternalFrameImportacionPresuProyecto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPresuProyecto"));
				this.jInternalFrameImportacionPresuProyecto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPresuProyecto"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoPresuProyecto() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoPresuProyecto==null) {
				this.jInternalFrameReporteDinamicoPresuProyecto=new ReporteDinamicoJInternalFrame(PresuProyectoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPresuProyecto);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPresuProyecto);
				this.jInternalFrameReporteDinamicoPresuProyecto.setVisible(false);
				this.jInternalFrameReporteDinamicoPresuProyecto.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoPresuProyecto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPresuProyecto"));
				this.jInternalFrameReporteDinamicoPresuProyecto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPresuProyecto"));
				this.jInternalFrameReporteDinamicoPresuProyecto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPresuProyecto"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPresuProyecto();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaPresuProyectoCuenta() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.jScrollPanelDatosPresuProyectoCuenta.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormPresuProyecto.jContentPaneDetallePresuProyecto.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.jScrollPanelDatosPresuProyectoCuenta.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.jScrollPanelDatosPresuProyectoCuenta.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.jScrollPanelDatosPresuProyectoCuenta.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaPresuTransferencia() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.jScrollPanelDatosPresuTransferencia.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormPresuProyecto.jContentPaneDetallePresuProyecto.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.jScrollPanelDatosPresuTransferencia.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.jScrollPanelDatosPresuTransferencia.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.jScrollPanelDatosPresuTransferencia.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetallePresuProyecto() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormPresuProyecto);
			
	       	this.jInternalFrameDetalleFormPresuProyecto.setVisible(false);
	        this.jInternalFrameDetalleFormPresuProyecto.setSelected(false);
			
			//this.jInternalFrameDetalleFormPresuProyecto.dispose();
			//this.jInternalFrameDetalleFormPresuProyecto=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoPresuProyecto() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoPresuProyecto.setVisible(true);
	        this.jInternalFrameReporteDinamicoPresuProyecto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionPresuProyecto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionPresuProyecto.setVisible(true);
	        this.jInternalFrameImportacionPresuProyecto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByPresuProyecto() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByPresuProyecto.setVisible(true);
	        this.jInternalFrameOrderByPresuProyecto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByPresuProyecto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByPresuProyecto.setVisible(false);
	        this.jInternalFrameOrderByPresuProyecto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoPresuProyecto() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoPresuProyecto.setVisible(false);
	        this.jInternalFrameReporteDinamicoPresuProyecto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionPresuProyecto() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionPresuProyecto.setVisible(false);
	        this.jInternalFrameImportacionPresuProyecto.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	

				public void abrirFrameTreeCentroCosto(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeCentroCosto);
						CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame=new CentroCostoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						centrocostoBeanSwingJInternalFrame.setJInternalFrameParent(this);
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.sTipoBusqueda="CentroCosto";
						}

						centrocostoBeanSwingJInternalFrame.getTodosCentroCostoArbol();
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.setCentroCostos(centrocostoBeanSwingJInternalFrame.centrocostosArbol);
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.CargarTreeCentroCosto();
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.setVisible(true);
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.jInternalFrameParent=this;
						TitledBorder titledBorderPresuProyecto=(TitledBorder)this.jScrollPanelDatosPresuProyecto.getBorder();
						TitledBorder titledBorderCentroCosto=(TitledBorder)centrocostoBeanSwingJInternalFrame.jScrollPanelDatosCentroCosto.getBorder();

						titledBorderCentroCosto.setTitle(titledBorderPresuProyecto.getTitle() + " -> Centro Costo");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,centrocostoBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(centrocostoBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeCentroCosto(CentroCostoBeanSwingJInternalFrame jInternalFrameTreeCentroCosto) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeCentroCosto);
						jInternalFrameTreeCentroCosto.setVisible(false);
						jInternalFrameTreeCentroCosto.setSelected(false);
						//jInternalFrameTreeCentroCosto.dispose();
						//jInternalFrameTreeCentroCosto=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}
	
	public void jButtonModificarPresuProyectoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarPresuProyecto(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarPresuProyecto(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPresuProyecto.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesPresuProyecto(true);
			//this.isEsNuevoPresuProyecto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyecto =(PresuProyecto) this.presuproyectoLogic.getPresuProyectos().toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.presuproyecto =(PresuProyecto) this.presuproyectos.toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesPresuProyecto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPresuProyecto(false) ;
			
			if(presuproyectoSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.presutransferenciaSessionBean.getEsGuardarRelacionado() && PresuTransferenciaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPresuTransferenciaActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.presuproyectocuentaSessionBean.getEsGuardarRelacionado() && PresuProyectoCuentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPresuProyectoCuentaActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(PresuProyectoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePresuProyecto(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPresuProyecto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaPresuProyectoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosPresuProyecto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyecto =(PresuProyecto) this.presuproyectoLogic.getPresuProyectos().toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presuproyecto =(PresuProyecto) this.presuproyectos.toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarPresuProyecto(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPresuProyecto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPresuProyecto.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesPresuProyecto(true);
			//this.isEsNuevoPresuProyecto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyecto =(PresuProyecto) this.presuproyectoLogic.getPresuProyectos().toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.presuproyecto =(PresuProyecto) this.presuproyectos.toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.presuproyecto.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesPresuProyecto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesPresuProyecto(false) ;
			
			if(PresuProyectoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePresuProyecto(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPresuProyecto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaEjercicio(List<Ejercicio> ejerciciosForeignKey)throws Exception{
		TableColumn tableColumnEjercicio=this.jTableDatosPresuProyecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuProyecto,PresuProyectoConstantesFunciones.LABEL_IDEJERCICIO));
		TableCellEditor tableCellEditorEjercicio =tableColumnEjercicio.getCellEditor();

		EjercicioTableCell ejercicioTableCellFk=(EjercicioTableCell)tableCellEditorEjercicio;

		if(ejercicioTableCellFk!=null) {
			ejercicioTableCellFk.setejerciciosForeignKey(ejerciciosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPresuProyecto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//ejercicioTableCellFk.setRowActual(intSelectedRow);
			//ejercicioTableCellFk.setejerciciosForeignKeyActual(ejerciciosForeignKey);
		//}


		if(ejercicioTableCellFk!=null) {
			ejercicioTableCellFk.RecargarEjerciciosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaPresuTipoProyecto(List<PresuTipoProyecto> presutipoproyectosForeignKey)throws Exception{
		TableColumn tableColumnPresuTipoProyecto=this.jTableDatosPresuProyecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuProyecto,PresuProyectoConstantesFunciones.LABEL_IDPRESUTIPOPROYECTO));
		TableCellEditor tableCellEditorPresuTipoProyecto =tableColumnPresuTipoProyecto.getCellEditor();

		PresuTipoProyectoTableCell presutipoproyectoTableCellFk=(PresuTipoProyectoTableCell)tableCellEditorPresuTipoProyecto;

		if(presutipoproyectoTableCellFk!=null) {
			presutipoproyectoTableCellFk.setpresutipoproyectosForeignKey(presutipoproyectosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPresuProyecto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//presutipoproyectoTableCellFk.setRowActual(intSelectedRow);
			//presutipoproyectoTableCellFk.setpresutipoproyectosForeignKeyActual(presutipoproyectosForeignKey);
		//}


		if(presutipoproyectoTableCellFk!=null) {
			presutipoproyectoTableCellFk.RecargarPresuTipoProyectosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCentroCosto(List<CentroCosto> centrocostosForeignKey)throws Exception{
		TableColumn tableColumnCentroCosto=this.jTableDatosPresuProyecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuProyecto,PresuProyectoConstantesFunciones.LABEL_IDCENTROCOSTO));
		TableCellEditor tableCellEditorCentroCosto =tableColumnCentroCosto.getCellEditor();

		CentroCostoTableCell centrocostoTableCellFk=(CentroCostoTableCell)tableCellEditorCentroCosto;

		if(centrocostoTableCellFk!=null) {
			centrocostoTableCellFk.setcentrocostosForeignKey(centrocostosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPresuProyecto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//centrocostoTableCellFk.setRowActual(intSelectedRow);
			//centrocostoTableCellFk.setcentrocostosForeignKeyActual(centrocostosForeignKey);
		//}


		if(centrocostoTableCellFk!=null) {
			centrocostoTableCellFk.RecargarCentroCostosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaPresuEstado(List<PresuEstado> presuestadosForeignKey)throws Exception{
		TableColumn tableColumnPresuEstado=this.jTableDatosPresuProyecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuProyecto,PresuProyectoConstantesFunciones.LABEL_IDPRESUESTADO));
		TableCellEditor tableCellEditorPresuEstado =tableColumnPresuEstado.getCellEditor();

		PresuEstadoTableCell presuestadoTableCellFk=(PresuEstadoTableCell)tableCellEditorPresuEstado;

		if(presuestadoTableCellFk!=null) {
			presuestadoTableCellFk.setpresuestadosForeignKey(presuestadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPresuProyecto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//presuestadoTableCellFk.setRowActual(intSelectedRow);
			//presuestadoTableCellFk.setpresuestadosForeignKeyActual(presuestadosForeignKey);
		//}


		if(presuestadoTableCellFk!=null) {
			presuestadoTableCellFk.RecargarPresuEstadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarPresuProyectoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesPresuProyecto(false);
			
			//if(!this.isEsNuevoPresuProyecto) {								
				int intSelectedRow = this.jTableDatosPresuProyecto.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyecto =(PresuProyecto) this.presuproyectoLogic.getPresuProyectos().toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presuproyecto =(PresuProyecto) this.presuproyectos.toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(PresuProyectoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualPresuProyecto(this.presuproyecto,true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresuProyecto(this.presuproyecto);
				
			}
			
			if(this.permiteMantenimiento(this.presuproyecto)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.presuproyectoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoPresuProyecto=true;
					this.inicializarActualizarBindingTablaPresuProyecto(false);
					this.isEsNuevoPresuProyecto=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoPresuProyecto=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoPresuProyecto=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPresuProyecto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPresuProyecto(false);
				
				this.habilitarDeshabilitarControlesPresuProyecto(false);
			
												
				
				if(PresuProyectoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetallePresuProyecto();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoPresuProyectoActionPerformed(evt,presuproyectoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualPresuProyecto(this.presuproyecto,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosPresuProyecto.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,presuproyectoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.presuproyecto.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(PresuProyecto.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuProyecto.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarPresuProyectoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosPresuProyecto.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyecto =(PresuProyecto) this.presuproyectoLogic.getPresuProyectos().toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
				this.presuproyecto.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.presuproyecto =(PresuProyecto) this.presuproyectos.toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
				this.presuproyecto.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.presuproyecto)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.presuproyectoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((PresuProyectoModel) this.jTableDatosPresuProyecto.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoPresuProyecto=true;
				this.inicializarActualizarBindingTablaPresuProyecto(false);
				this.isEsNuevoPresuProyecto=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPresuProyecto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPresuProyecto(false);
				
				this.habilitarDeshabilitarControlesPresuProyecto(false);
				
				
				
				if(PresuProyectoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetallePresuProyecto();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarPresuProyectoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosPresuProyecto.getRowCount()>=1) {
				jTableDatosPresuProyecto.removeRowSelectionInterval(0, jTableDatosPresuProyecto.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesPresuProyecto(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaPresuProyecto(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPresuProyecto(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPresuProyecto(false) ;
			
			this.isEsNuevoPresuProyecto=false;
			
			if(PresuProyectoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetallePresuProyecto();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosPresuProyectoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingPresuProyecto(false);
				
				//SI ES MANUAL
				if(PresuProyectoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualPresuProyecto();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosPresuProyectoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoPresuProyecto--;			
			//PresuProyecto presuproyectoAux= new PresuProyecto();			
			//presuproyectoAux.setId(this.iIdNuevoPresuProyecto);
			
			if(this.jInternalFrameDetalleFormPresuProyecto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaPresuProyecto();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysPresuProyecto(this.presuproyecto);
			
			this.presuproyecto.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.presuproyectoLogic.getPresuProyectos().add(this.presuproyectoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.presuproyectos.add(this.presuproyectoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaPresuProyecto(false);
			
			this.jTableDatosPresuProyecto.setRowSelectionInterval(this.getIndiceNuevoPresuProyecto(), this.getIndiceNuevoPresuProyecto());
			
			int iLastRow =  this.jTableDatosPresuProyecto.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosPresuProyecto.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosPresuProyecto.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaPresuProyecto(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionPresuProyectoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingPresuProyecto(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPresuProyecto(false);
			
			//SI ES MANUAL
			if(PresuProyectoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPresuProyecto();
			}
			
			//this.abrirFrameTreePresuProyecto();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionPresuProyectoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE ProyectoES ?", "MANTENIMIENTO DE Proyecto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionPresuProyecto.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralPresuProyecto();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.presuproyectoReturnGeneral=presuproyectoLogic.procesarImportacionPresuProyectosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.presuproyectoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarPresuProyectoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionPresuProyectoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionPresuProyecto.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionPresuProyecto.setFileImportacion(this.jInternalFrameImportacionPresuProyecto.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionPresuProyecto.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionPresuProyecto.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionPresuProyecto.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionPresuProyecto.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoPresuProyectoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<PresuProyecto> presuproyectosSeleccionados=new ArrayList<PresuProyecto>();		

		presuproyectosSeleccionados=this.getPresuProyectosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPresuProyecto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPresuProyecto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("PresuProyectoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"PresuProyectoBaseDesign.jrxml";
			
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
			
			this.generarReportePresuProyectos("Todos",presuproyectosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presuproyectoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proyecto",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoPresuProyecto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPresuProyecto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PresuProyectoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresuProyectoConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresuProyectoConstantesFunciones.LABEL_IDEJERCICIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ejercicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ejercicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ejercicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ejercicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresuProyectoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresuProyectoConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresuProyectoConstantesFunciones.LABEL_IDPRESUTIPOPROYECTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_PresuTipoProyecto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_PresuTipoProyecto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_PresuTipoProyecto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_PresuTipoProyecto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresuProyectoConstantesFunciones.LABEL_IDCENTROCOSTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CentroCosto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CentroCosto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CentroCosto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CentroCosto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresuProyectoConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresuProyectoConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresuProyectoConstantesFunciones.LABEL_IDPRESUESTADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_PresuEstado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_PresuEstado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_PresuEstado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_PresuEstado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresuProyectoConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoPresuProyecto.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoPresuProyecto.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoPresuProyecto.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case PresuProyectoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case PresuProyectoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case PresuProyectoConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoria="id_ejercicio";
					break;

				case PresuProyectoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case PresuProyectoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case PresuProyectoConstantesFunciones.LABEL_IDPRESUTIPOPROYECTO:
					sNombreCampoCategoria="id_presu_tipo_proyecto";
					break;

				case PresuProyectoConstantesFunciones.LABEL_IDCENTROCOSTO:
					sNombreCampoCategoria="id_centro_costo";
					break;

				case PresuProyectoConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case PresuProyectoConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;

				case PresuProyectoConstantesFunciones.LABEL_IDPRESUESTADO:
					sNombreCampoCategoria="id_presu_estado";
					break;

				case PresuProyectoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoPresuProyecto.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case PresuProyectoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case PresuProyectoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case PresuProyectoConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoriaValor="id_ejercicio";
					break;

				case PresuProyectoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case PresuProyectoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case PresuProyectoConstantesFunciones.LABEL_IDPRESUTIPOPROYECTO:
					sNombreCampoCategoriaValor="id_presu_tipo_proyecto";
					break;

				case PresuProyectoConstantesFunciones.LABEL_IDCENTROCOSTO:
					sNombreCampoCategoriaValor="id_centro_costo";
					break;

				case PresuProyectoConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case PresuProyectoConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;

				case PresuProyectoConstantesFunciones.LABEL_IDPRESUESTADO:
					sNombreCampoCategoriaValor="id_presu_estado";
					break;

				case PresuProyectoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoPresuProyecto.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPresuProyecto.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PresuProyectoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case PresuProyectoConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case PresuProyectoConstantesFunciones.LABEL_IDEJERCICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ejercicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ejercicio");
					break;

				case PresuProyectoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case PresuProyectoConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case PresuProyectoConstantesFunciones.LABEL_IDPRESUTIPOPROYECTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Proyecto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_presu_tipo_proyecto");
					break;

				case PresuProyectoConstantesFunciones.LABEL_IDCENTROCOSTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Centro Costo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_centro_costo");
					break;

				case PresuProyectoConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case PresuProyectoConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
					break;

				case PresuProyectoConstantesFunciones.LABEL_IDPRESUESTADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_presu_estado");
					break;

				case PresuProyectoConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoPresuProyectoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<PresuProyecto> presuproyectosSeleccionados=new ArrayList<PresuProyecto>();		
		
		presuproyectosSeleccionados=this.getPresuProyectosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presuproyecto";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("PresuProyectos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoPresuProyecto.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoPresuProyecto.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case PresuProyectoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresuProyectoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(PresuProyecto presuproyecto:presuproyectosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presuproyecto.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresuProyectoConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresuProyectoConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(PresuProyecto presuproyecto:presuproyectosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presuproyecto.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresuProyectoConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresuProyectoConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(PresuProyecto presuproyecto:presuproyectosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presuproyecto.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresuProyectoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresuProyectoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(PresuProyecto presuproyecto:presuproyectosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presuproyecto.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresuProyectoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresuProyectoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(PresuProyecto presuproyecto:presuproyectosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presuproyecto.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresuProyectoConstantesFunciones.LABEL_IDPRESUTIPOPROYECTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresuProyectoConstantesFunciones.LABEL_IDPRESUTIPOPROYECTO);
					iRow++;

					for(PresuProyecto presuproyecto:presuproyectosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presuproyecto.getpresutipoproyecto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresuProyectoConstantesFunciones.LABEL_IDCENTROCOSTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresuProyectoConstantesFunciones.LABEL_IDCENTROCOSTO);
					iRow++;

					for(PresuProyecto presuproyecto:presuproyectosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presuproyecto.getcentrocosto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresuProyectoConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresuProyectoConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(PresuProyecto presuproyecto:presuproyectosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presuproyecto.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresuProyectoConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresuProyectoConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(PresuProyecto presuproyecto:presuproyectosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presuproyecto.getvalor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresuProyectoConstantesFunciones.LABEL_IDPRESUESTADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresuProyectoConstantesFunciones.LABEL_IDPRESUESTADO);
					iRow++;

					for(PresuProyecto presuproyecto:presuproyectosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presuproyecto.getpresuestado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresuProyectoConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresuProyectoConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(PresuProyecto presuproyecto:presuproyectosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presuproyecto.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelPresuProyecto(row);				
			//	iRow++;
			//}				
			
			//for(PresuProyecto presuproyectoAux:presuproyectosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelPresuProyecto(presuproyectoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presuproyectoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proyecto",JOptionPane.INFORMATION_MESSAGE);
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
				this.presuproyectoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPresuProyecto(false);
			
			//SI ES MANUAL
			if(PresuProyectoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPresuProyecto();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresPresuProyectoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPresuProyecto(false);
			
			//SI ES MANUAL
			if(PresuProyectoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPresuProyecto();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesPresuProyectoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPresuProyecto(false);
			
			//SI ES MANUAL
			if(PresuProyectoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPresuProyecto();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaPresuProyecto() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosPresuProyecto.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosPresuProyecto.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosPresuProyecto.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosPresuProyecto.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosPresuProyecto.setMinimumSize(dimensionMinimum);
		this.jTableDatosPresuProyecto.setMaximumSize(dimensionMaximum);
		this.jTableDatosPresuProyecto.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingPresuProyecto(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingPresuProyecto(esInicializar,true);
	}
	
	public void inicializarActualizarBindingPresuProyecto(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaPresuProyecto(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesPresuProyecto(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.presuproyectoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasPresuProyecto(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPresuProyecto(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesPresuProyecto(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !PresuProyectoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!PresuProyectoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualPresuProyecto() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaPresuProyecto();
		
		this.inicializarActualizarBindingBotonesManualPresuProyecto(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.presuproyectoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualPresuProyecto();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPresuProyecto() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualPresuProyecto(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualPresuProyecto(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosPresuProyecto.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosPresuProyecto.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReportePresuProyecto.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormPresuProyecto!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormPresuProyecto.jCheckBoxPostAccionNuevoPresuProyecto.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormPresuProyecto.jCheckBoxPostAccionSinCerrarPresuProyecto.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormPresuProyecto.jCheckBoxPostAccionSinMensajePresuProyecto.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosPresuProyecto.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosPresuProyecto.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReportePresuProyecto.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormPresuProyecto!=null) {
				this.jInternalFrameDetalleFormPresuProyecto.jCheckBoxPostAccionNuevoPresuProyecto.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormPresuProyecto.jCheckBoxPostAccionSinCerrarPresuProyecto.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormPresuProyecto.jCheckBoxPostAccionSinMensajePresuProyecto.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionPresuProyecto.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionPresuProyecto.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormPresuProyecto!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormPresuProyecto.jComboBoxTiposAccionesFormularioPresuProyecto.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesPresuProyecto.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoPresuProyecto!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPresuProyecto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesPresuProyecto.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesPresuProyecto.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarPresuProyecto.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesPresuProyecto.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoPresuProyecto!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPresuProyecto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesPresuProyecto.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralPresuProyecto.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPresuProyecto(Boolean esInicializar) throws Exception {
		try	{	
			if(PresuProyectoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualPresuProyecto(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesPresuProyecto() throws Exception {
		try	{
			if(PresuProyectoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualPresuProyecto();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePresuProyecto() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormPresuProyecto.jComboBoxTiposAccionesFormularioPresuProyecto.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormPresuProyecto.jComboBoxTiposAccionesFormularioPresuProyecto.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualPresuProyecto() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesPresuProyecto.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesPresuProyecto.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesPresuProyecto.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesPresuProyecto.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesPresuProyecto.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesPresuProyecto.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionPresuProyecto.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionPresuProyecto.addItem(reporte);
			}
			
			
			if(!this.presuproyectoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionPresuProyecto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionPresuProyecto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesPresuProyecto.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesPresuProyecto.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesPresuProyecto.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesPresuProyecto.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormPresuProyecto!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormPresuProyecto.jComboBoxTiposAccionesFormularioPresuProyecto.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormPresuProyecto.jComboBoxTiposAccionesFormularioPresuProyecto.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarPresuProyecto.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarPresuProyecto.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarPresuProyecto.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPresuProyecto();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPresuProyecto() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPresuProyecto!=null) {
				this.jInternalFrameReporteDinamicoPresuProyecto.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoPresuProyecto.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPresuProyecto!=null) {
				this.jInternalFrameReporteDinamicoPresuProyecto.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoPresuProyecto.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoPresuProyecto!=null) {
				
				if(this.jInternalFrameReporteDinamicoPresuProyecto.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPresuProyecto.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPresuProyecto.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoPresuProyecto.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPresuProyecto.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPresuProyecto.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoPresuProyecto.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoPresuProyecto.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=PresuProyectoConstantesFunciones.getTiposSeleccionarPresuProyecto(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoPresuProyecto.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoPresuProyecto.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoPresuProyecto.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=PresuProyectoConstantesFunciones.getTiposSeleccionarPresuProyecto(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoPresuProyecto.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoPresuProyecto.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoPresuProyecto.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=PresuProyectoConstantesFunciones.getTiposSeleccionarPresuProyecto(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPresuProyecto.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoPresuProyecto.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoPresuProyecto.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoPresuProyecto.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualPresuProyecto()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextAreacodigoBusquedaPorCodigoPresuProyecto.getText();
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombrePresuProyecto.getText();
		if(this.jComboBoxid_ejercicioFK_IdEjercicioPresuProyecto.getSelectedItem()!=null){this.id_ejercicioFK_IdEjercicio=((Ejercicio)this.jComboBoxid_ejercicioFK_IdEjercicioPresuProyecto.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasPresuProyecto(Boolean esInicializar) throws Exception {				
		if(PresuProyectoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualPresuProyecto();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaPresuProyecto() throws Exception {
		this.inicializarActualizarBindingTablaPresuProyecto(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByPresuProyecto() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByPresuProyecto.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByPresuProyecto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPresuProyecto.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new PresuProyectoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByPresuProyecto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPresuProyecto.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new PresuProyectoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosPresuProyectoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuProyectoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new PresuProyectoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByPresuProyecto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPresuProyecto.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new PresuProyectoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByPresuProyecto.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaPresuProyecto(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=presuproyectoLogic.getPresuProyectos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=presuproyectos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(PresuProyectoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosPresuProyecto.setModel(new PresuProyectoModel(this.presuproyectoLogic.getPresuProyectos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosPresuProyecto.setModel(new PresuProyectoModel(this.presuproyectos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByPresuProyecto!=null && this.jInternalFrameOrderByPresuProyecto.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByPresuProyecto();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosPresuProyecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuProyecto,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new PresuProyectoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+PresuProyectoConstantesFunciones.SCLASSWEBTITULO,presuproyectoConstantesFunciones.resaltarSeleccionarPresuProyecto,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+PresuProyectoConstantesFunciones.SCLASSWEBTITULO,presuproyectoConstantesFunciones.resaltarSeleccionarPresuProyecto,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosPresuProyecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuProyecto,PresuProyectoConstantesFunciones.LABEL_ID));

		if(this.presuproyectoConstantesFunciones.mostraridPresuProyecto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresuProyectoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.presuproyectoConstantesFunciones.resaltaridPresuProyecto,this.presuproyectoConstantesFunciones.activaridPresuProyecto,iSizeTabla,this,true,"idPresuProyecto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presuproyectoConstantesFunciones.resaltaridPresuProyecto,this.presuproyectoConstantesFunciones.activaridPresuProyecto,this,true,"idPresuProyecto","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresuProyecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuProyecto,PresuProyectoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.presuproyectoConstantesFunciones.mostrarid_empresaPresuProyecto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresuProyectoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.presuproyectoConstantesFunciones.resaltarid_empresaPresuProyecto,this,this.presuproyectoConstantesFunciones.activarid_empresaPresuProyecto,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.presuproyectoConstantesFunciones.resaltarid_empresaPresuProyecto,this,this.presuproyectoConstantesFunciones.activarid_empresaPresuProyecto,false,"id_empresaPresuProyecto","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PresuProyectoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresuProyecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuProyecto,PresuProyectoConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.presuproyectoConstantesFunciones.mostrarid_sucursalPresuProyecto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresuProyectoConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.presuproyectoConstantesFunciones.resaltarid_sucursalPresuProyecto,this,this.presuproyectoConstantesFunciones.activarid_sucursalPresuProyecto,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.presuproyectoConstantesFunciones.resaltarid_sucursalPresuProyecto,this,this.presuproyectoConstantesFunciones.activarid_sucursalPresuProyecto,false,"id_sucursalPresuProyecto","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PresuProyectoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresuProyecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuProyecto,PresuProyectoConstantesFunciones.LABEL_IDEJERCICIO));

		if(this.presuproyectoConstantesFunciones.mostrarid_ejercicioPresuProyecto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresuProyectoConstantesFunciones.LABEL_IDEJERCICIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EjercicioTableCell(this.ejerciciosForeignKey,this.presuproyectoConstantesFunciones.resaltarid_ejercicioPresuProyecto,this,this.presuproyectoConstantesFunciones.activarid_ejercicioPresuProyecto,iSizeTabla));
			tableColumn.setCellEditor(new EjercicioTableCell(this.ejerciciosForeignKey,this.presuproyectoConstantesFunciones.resaltarid_ejercicioPresuProyecto,this,this.presuproyectoConstantesFunciones.activarid_ejercicioPresuProyecto,true,"id_ejercicioPresuProyecto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PresuProyectoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresuProyecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuProyecto,PresuProyectoConstantesFunciones.LABEL_CODIGO));

		if(this.presuproyectoConstantesFunciones.mostrarcodigoPresuProyecto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresuProyectoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.presuproyectoConstantesFunciones.resaltarcodigoPresuProyecto,this.presuproyectoConstantesFunciones.activarcodigoPresuProyecto,iSizeTabla,this,true,"codigoPresuProyecto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presuproyectoConstantesFunciones.resaltarcodigoPresuProyecto,this.presuproyectoConstantesFunciones.activarcodigoPresuProyecto,this,true,"codigoPresuProyecto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PresuProyectoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresuProyecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuProyecto,PresuProyectoConstantesFunciones.LABEL_NOMBRE));

		if(this.presuproyectoConstantesFunciones.mostrarnombrePresuProyecto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresuProyectoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.presuproyectoConstantesFunciones.resaltarnombrePresuProyecto,this.presuproyectoConstantesFunciones.activarnombrePresuProyecto,iSizeTabla,this,true,"nombrePresuProyecto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presuproyectoConstantesFunciones.resaltarnombrePresuProyecto,this.presuproyectoConstantesFunciones.activarnombrePresuProyecto,this,true,"nombrePresuProyecto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PresuProyectoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresuProyecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuProyecto,PresuProyectoConstantesFunciones.LABEL_IDPRESUTIPOPROYECTO));

		if(this.presuproyectoConstantesFunciones.mostrarid_presu_tipo_proyectoPresuProyecto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresuProyectoConstantesFunciones.LABEL_IDPRESUTIPOPROYECTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PresuTipoProyectoTableCell(this.presutipoproyectosForeignKey,this.presuproyectoConstantesFunciones.resaltarid_presu_tipo_proyectoPresuProyecto,this,this.presuproyectoConstantesFunciones.activarid_presu_tipo_proyectoPresuProyecto,iSizeTabla));
			tableColumn.setCellEditor(new PresuTipoProyectoTableCell(this.presutipoproyectosForeignKey,this.presuproyectoConstantesFunciones.resaltarid_presu_tipo_proyectoPresuProyecto,this,this.presuproyectoConstantesFunciones.activarid_presu_tipo_proyectoPresuProyecto,true,"id_presu_tipo_proyectoPresuProyecto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PresuProyectoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresuProyecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuProyecto,PresuProyectoConstantesFunciones.LABEL_IDCENTROCOSTO));

		if(this.presuproyectoConstantesFunciones.mostrarid_centro_costoPresuProyecto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresuProyectoConstantesFunciones.LABEL_IDCENTROCOSTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CentroCostoTableCell(this.centrocostosForeignKey,this.presuproyectoConstantesFunciones.resaltarid_centro_costoPresuProyecto,this,this.presuproyectoConstantesFunciones.activarid_centro_costoPresuProyecto,iSizeTabla));
			tableColumn.setCellEditor(new CentroCostoTableCell(this.centrocostosForeignKey,this.presuproyectoConstantesFunciones.resaltarid_centro_costoPresuProyecto,this,this.presuproyectoConstantesFunciones.activarid_centro_costoPresuProyecto,true,"id_centro_costoPresuProyecto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PresuProyectoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresuProyecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuProyecto,PresuProyectoConstantesFunciones.LABEL_FECHA));

		if(this.presuproyectoConstantesFunciones.mostrarfechaPresuProyecto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresuProyectoConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.presuproyectoConstantesFunciones.resaltarfechaPresuProyecto,this.presuproyectoConstantesFunciones.activarfechaPresuProyecto,iSizeTabla,this,true,"fechaPresuProyecto","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.presuproyectoConstantesFunciones.resaltarfechaPresuProyecto,this.presuproyectoConstantesFunciones.activarfechaPresuProyecto,this,true,"fechaPresuProyecto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new PresuProyectoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresuProyecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuProyecto,PresuProyectoConstantesFunciones.LABEL_VALOR));

		if(this.presuproyectoConstantesFunciones.mostrarvalorPresuProyecto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresuProyectoConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.presuproyectoConstantesFunciones.resaltarvalorPresuProyecto,this.presuproyectoConstantesFunciones.activarvalorPresuProyecto,iSizeTabla,this,true,"valorPresuProyecto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presuproyectoConstantesFunciones.resaltarvalorPresuProyecto,this.presuproyectoConstantesFunciones.activarvalorPresuProyecto,this,true,"valorPresuProyecto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PresuProyectoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresuProyecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuProyecto,PresuProyectoConstantesFunciones.LABEL_IDPRESUESTADO));

		if(this.presuproyectoConstantesFunciones.mostrarid_presu_estadoPresuProyecto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresuProyectoConstantesFunciones.LABEL_IDPRESUESTADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PresuEstadoTableCell(this.presuestadosForeignKey,this.presuproyectoConstantesFunciones.resaltarid_presu_estadoPresuProyecto,this,this.presuproyectoConstantesFunciones.activarid_presu_estadoPresuProyecto,iSizeTabla));
			tableColumn.setCellEditor(new PresuEstadoTableCell(this.presuestadosForeignKey,this.presuproyectoConstantesFunciones.resaltarid_presu_estadoPresuProyecto,this,this.presuproyectoConstantesFunciones.activarid_presu_estadoPresuProyecto,true,"id_presu_estadoPresuProyecto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PresuProyectoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresuProyecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuProyecto,PresuProyectoConstantesFunciones.LABEL_DESCRIPCION));

		if(this.presuproyectoConstantesFunciones.mostrardescripcionPresuProyecto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresuProyectoConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.presuproyectoConstantesFunciones.resaltardescripcionPresuProyecto,this.presuproyectoConstantesFunciones.activardescripcionPresuProyecto,iSizeTabla,this,true,"descripcionPresuProyecto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presuproyectoConstantesFunciones.resaltardescripcionPresuProyecto,this.presuproyectoConstantesFunciones.activardescripcionPresuProyecto,this,true,"descripcionPresuProyecto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PresuProyectoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.presuproyectoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosPresuTransferencia && this.presuproyectoConstantesFunciones.mostrarPresuTransferenciaPresuProyecto && !PresuProyectoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Transferenciaes");
				tableColumn.setHeaderValue("Transferenciaes");
				tableColumn.setCellRenderer(new PresuTransferenciaTableCell(presuproyectoConstantesFunciones.resaltarPresuTransferenciaPresuProyecto,this,this.presuproyectoConstantesFunciones.activarPresuTransferenciaPresuProyecto));
				tableColumn.setCellEditor(new PresuTransferenciaTableCell(presuproyectoConstantesFunciones.resaltarPresuTransferenciaPresuProyecto,this,this.presuproyectoConstantesFunciones.activarPresuTransferenciaPresuProyecto));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosPresuProyecto.addColumn(tableColumn);
			}

			if(this.isTienePermisosPresuProyectoCuenta && this.presuproyectoConstantesFunciones.mostrarPresuProyectoCuentaPresuProyecto && !PresuProyectoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Cuenta Contable Proyectoes");
				tableColumn.setHeaderValue("Cuenta Contable Proyectoes");
				tableColumn.setCellRenderer(new PresuProyectoCuentaTableCell(presuproyectoConstantesFunciones.resaltarPresuProyectoCuentaPresuProyecto,this,this.presuproyectoConstantesFunciones.activarPresuProyectoCuentaPresuProyecto));
				tableColumn.setCellEditor(new PresuProyectoCuentaTableCell(presuproyectoConstantesFunciones.resaltarPresuProyectoCuentaPresuProyecto,this,this.presuproyectoConstantesFunciones.activarPresuProyectoCuentaPresuProyecto));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosPresuProyecto.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.presuproyectoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.presuproyectoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPresuProyecto.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.presuproyectoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.presuproyectoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPresuProyecto.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarPresuProyecto && this.isPermisoGuardarCambiosPresuProyecto) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.presuproyectoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.presuproyectoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosPresuProyecto.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.presuproyectoSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false,iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,true,false,iSizeTabla));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosPresuProyecto.addColumn(tableColumn);
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
			
			this.jTableDatosPresuProyecto.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPresuProyecto && this.isPermisoGuardarCambiosPresuProyecto) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.presuproyectoSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPresuProyecto && this.isPermisoGuardarCambiosPresuProyecto) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosPresuProyecto.moveColumn(this.jTableDatosPresuProyecto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosPresuProyecto.moveColumn(this.jTableDatosPresuProyecto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.presuproyectoSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosPresuProyecto.moveColumn(this.jTableDatosPresuProyecto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosPresuProyecto.moveColumn(this.jTableDatosPresuProyecto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosPresuProyecto.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosPresuProyecto.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosPresuProyecto,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!PresuProyectoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosPresuProyecto.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosPresuProyecto.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!PresuProyectoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!PresuProyectoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosPresuProyecto.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosPresuProyecto.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosPresuProyecto.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=presuproyectoLogic.getPresuProyectos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=presuproyectos.size()-1;
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
		//this.jTableDatosPresuProyecto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosPresuProyecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosPresuProyecto();
			
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
				
				//this.isEsNuevoPresuProyecto=false;
					
				PresuProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.presuproyecto,new Object(),this.presuproyectoParameterGeneral,this.presuproyectoReturnGeneral);
			
				if(this.presuproyectoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormPresuProyecto==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPresuProyecto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPresuProyecto.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyecto =(PresuProyecto) this.presuproyectoLogic.getPresuProyectos().toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presuproyecto =(PresuProyecto) this.presuproyectos.toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.presuproyecto.getsType().equals("DUPLICADO")
				   || this.presuproyecto.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoPresuProyecto=true;
				
				} else {
					this.isEsNuevoPresuProyecto=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.presuproyectoSessionBean.getEsGuardarRelacionado()) {
					if(this.presuproyecto.getId()>=0 && !this.presuproyecto.getIsNew()) {						
						this.isEsNuevoPresuProyecto=false;
						
					} else {
						this.isEsNuevoPresuProyecto=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoPresuProyecto(esRelaciones);						
				
				this.seleccionarPresuProyecto(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.presuproyecto.getId()<0) {
					this.isEsNuevoPresuProyecto=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarPresuProyecto(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarPresuProyecto(evt,rowIndex);
				}	
				
				if(this.presuproyectoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion PresuProyecto: " + this.dDif); 
					}
				}								
				
				PresuProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.presuproyecto,new Object(),this.presuproyectoParameterGeneral,this.presuproyectoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarPresuProyecto(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.presuproyecto)) {
					if(this.presuproyecto.getId()>0) {
						this.presuproyecto.setIsDeleted(true);
						
						this.presuproyectosEliminados.add(this.presuproyecto);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.presuproyectoLogic.getPresuProyectos().remove(this.presuproyecto);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.presuproyectos.remove(this.presuproyecto);				
					}
					
					
					((PresuProyectoModel) this.jTableDatosPresuProyecto.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaPresuProyecto(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarPresuProyecto(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoPresuProyecto) {
			
			if(this.jInternalFrameDetalleFormPresuProyecto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPresuProyecto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPresuProyecto.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyecto =(PresuProyecto) this.presuproyectoLogic.getPresuProyectos().toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presuproyecto =(PresuProyecto) this.presuproyectos.toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(PresuProyectoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioPresuProyecto(this.presuproyecto);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.presuproyectoConstantesFunciones.cargarid_empresaPresuProyecto || this.presuproyectoConstantesFunciones.event_dependid_empresaPresuProyecto) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.presuproyecto.getid_empresa());
									//this.inicializarActualizarBindingPresuProyecto(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(presuproyecto.getEmpresa()!=null) {
							this.empresasForeignKey.add(presuproyecto.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.presuproyecto.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.presuproyectoConstantesFunciones.cargarid_sucursalPresuProyecto || this.presuproyectoConstantesFunciones.event_dependid_sucursalPresuProyecto) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.presuproyecto.getid_sucursal());
									//this.inicializarActualizarBindingPresuProyecto(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(presuproyecto.getSucursal()!=null) {
							this.sucursalsForeignKey.add(presuproyecto.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.presuproyecto.getid_sucursal(),false,"Formulario");

					//Ejercicio
					if(!this.presuproyectoConstantesFunciones.cargarid_ejercicioPresuProyecto || this.presuproyectoConstantesFunciones.event_dependid_ejercicioPresuProyecto) {
						//this.cargarCombosEjerciciosForeignKeyLista(" where id="+this.presuproyecto.getid_ejercicio());
									//this.inicializarActualizarBindingPresuProyecto(false,false);
						this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

						if(presuproyecto.getEjercicio()!=null) {
							this.ejerciciosForeignKey.add(presuproyecto.getEjercicio());
						}

						this.addItemDefectoCombosForeignKeyEjercicio();
						this.cargarCombosFrameEjerciciosForeignKey("Todos");
					}
					this.setActualEjercicioForeignKey(this.presuproyecto.getid_ejercicio(),false,"Formulario");

					//PresuTipoProyecto
					if(!this.presuproyectoConstantesFunciones.cargarid_presu_tipo_proyectoPresuProyecto || this.presuproyectoConstantesFunciones.event_dependid_presu_tipo_proyectoPresuProyecto) {
						//this.cargarCombosPresuTipoProyectosForeignKeyLista(" where id="+this.presuproyecto.getid_presu_tipo_proyecto());
									//this.inicializarActualizarBindingPresuProyecto(false,false);
						this.presutipoproyectosForeignKey=new ArrayList<PresuTipoProyecto>();

						if(presuproyecto.getPresuTipoProyecto()!=null) {
							this.presutipoproyectosForeignKey.add(presuproyecto.getPresuTipoProyecto());
						}

						this.addItemDefectoCombosForeignKeyPresuTipoProyecto();
						this.cargarCombosFramePresuTipoProyectosForeignKey("Todos");
					}
					this.setActualPresuTipoProyectoForeignKey(this.presuproyecto.getid_presu_tipo_proyecto(),false,"Formulario");

					//CentroCosto
					if(!this.presuproyectoConstantesFunciones.cargarid_centro_costoPresuProyecto || this.presuproyectoConstantesFunciones.event_dependid_centro_costoPresuProyecto) {
						//this.cargarCombosCentroCostosForeignKeyLista(" where id="+this.presuproyecto.getid_centro_costo());
									//this.inicializarActualizarBindingPresuProyecto(false,false);
						this.centrocostosForeignKey=new ArrayList<CentroCosto>();

						if(presuproyecto.getCentroCosto()!=null) {
							this.centrocostosForeignKey.add(presuproyecto.getCentroCosto());
						}

						this.addItemDefectoCombosForeignKeyCentroCosto();
						this.cargarCombosFrameCentroCostosForeignKey("Todos");
					}
					this.setActualCentroCostoForeignKey(this.presuproyecto.getid_centro_costo(),false,"Formulario");

					//PresuEstado
					if(!this.presuproyectoConstantesFunciones.cargarid_presu_estadoPresuProyecto || this.presuproyectoConstantesFunciones.event_dependid_presu_estadoPresuProyecto) {
						//this.cargarCombosPresuEstadosForeignKeyLista(" where id="+this.presuproyecto.getid_presu_estado());
									//this.inicializarActualizarBindingPresuProyecto(false,false);
						this.presuestadosForeignKey=new ArrayList<PresuEstado>();

						if(presuproyecto.getPresuEstado()!=null) {
							this.presuestadosForeignKey.add(presuproyecto.getPresuEstado());
						}

						this.addItemDefectoCombosForeignKeyPresuEstado();
						this.cargarCombosFramePresuEstadosForeignKey("Todos");
					}
					this.setActualPresuEstadoForeignKey(this.presuproyecto.getid_presu_estado(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesPresuProyecto("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesPresuProyecto(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPresuProyecto() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoPresuProyecto(PresuProyecto presuproyecto) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoPresuProyecto(presuproyecto,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoPresuProyecto(PresuProyecto presuproyecto,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioPresuProyecto(presuproyecto);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyPresuProyecto(presuproyecto,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyPresuProyecto(presuproyecto);
	}
	
	public void setVariablesObjetoActualToFormularioPresuProyecto(PresuProyecto presuproyecto) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormPresuProyecto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormPresuProyecto.jLabelidPresuProyecto.setText(presuproyecto.getId().toString());
			this.jInternalFrameDetalleFormPresuProyecto.jTextAreacodigoPresuProyecto.setText(presuproyecto.getcodigo());
			this.jInternalFrameDetalleFormPresuProyecto.jTextAreanombrePresuProyecto.setText(presuproyecto.getnombre());
			this.jInternalFrameDetalleFormPresuProyecto.jDateChooserfechaPresuProyecto.setDate(presuproyecto.getfecha());
			this.jInternalFrameDetalleFormPresuProyecto.jTextFieldvalorPresuProyecto.setText(presuproyecto.getvalor().toString());
			this.jInternalFrameDetalleFormPresuProyecto.jTextAreadescripcionPresuProyecto.setText(presuproyecto.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,PresuProyecto presuproyectoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,presuproyectoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,PresuProyecto presuproyectoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				presuproyectoLocal=this.presuproyecto;
			} else {
				presuproyectoLocal=this.presuproyectoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(presuproyectoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoPresuProyecto(presuproyectoLocal,true);
					
					if(presuproyectoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(presuproyectoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.presuproyectoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(presuproyectoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoPresuProyecto(PresuProyecto presuproyecto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPresuProyecto(presuproyecto,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysPresuProyecto(presuproyecto);
	}
	
	public void setVariablesFormularioToObjetoActualPresuProyecto(PresuProyecto presuproyecto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPresuProyecto(presuproyecto,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualPresuProyecto(PresuProyecto presuproyecto,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormPresuProyecto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormPresuProyecto.jLabelidPresuProyecto.getText()==null || this.jInternalFrameDetalleFormPresuProyecto.jLabelidPresuProyecto.getText()=="" || this.jInternalFrameDetalleFormPresuProyecto.jLabelidPresuProyecto.getText()=="Id") {
				this.jInternalFrameDetalleFormPresuProyecto.jLabelidPresuProyecto.setText("0");
			}

			if(conColumnasBase) {presuproyecto.setId(Long.parseLong(this.jInternalFrameDetalleFormPresuProyecto.jLabelidPresuProyecto.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresuProyectoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuProyecto.jLabelIdPresuProyecto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presuproyecto.setcodigo(this.jInternalFrameDetalleFormPresuProyecto.jTextAreacodigoPresuProyecto.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresuProyectoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuProyecto.jLabelcodigoPresuProyecto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presuproyecto.setnombre(this.jInternalFrameDetalleFormPresuProyecto.jTextAreanombrePresuProyecto.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresuProyectoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuProyecto.jLabelnombrePresuProyecto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presuproyecto.setfecha(this.jInternalFrameDetalleFormPresuProyecto.jDateChooserfechaPresuProyecto.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresuProyectoConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuProyecto.jLabelfechaPresuProyecto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presuproyecto.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormPresuProyecto.jTextFieldvalorPresuProyecto.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresuProyectoConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuProyecto.jLabelvalorPresuProyecto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presuproyecto.setdescripcion(this.jInternalFrameDetalleFormPresuProyecto.jTextAreadescripcionPresuProyecto.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresuProyectoConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuProyecto.jLabeldescripcionPresuProyecto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPresuProyecto(PresuProyecto presuproyectoBean,PresuProyecto presuproyecto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && presuproyectoBean.getid_ejercicio()!=null && !presuproyectoBean.getid_ejercicio().equals(-1L))) {presuproyecto.setid_ejercicio(presuproyectoBean.getid_ejercicio());}
			if(conDefault || (!conDefault && presuproyectoBean.getid_presu_tipo_proyecto()!=null && !presuproyectoBean.getid_presu_tipo_proyecto().equals(-1L))) {presuproyecto.setid_presu_tipo_proyecto(presuproyectoBean.getid_presu_tipo_proyecto());}
			if(conDefault || (!conDefault && presuproyectoBean.getid_centro_costo()!=null && !presuproyectoBean.getid_centro_costo().equals(null))) {presuproyecto.setid_centro_costo(presuproyectoBean.getid_centro_costo());}
			if(conDefault || (!conDefault && presuproyectoBean.getid_presu_estado()!=null && !presuproyectoBean.getid_presu_estado().equals(-1L))) {presuproyecto.setid_presu_estado(presuproyectoBean.getid_presu_estado());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosPresuProyecto(PresuProyecto presuproyectoOrigen,PresuProyecto presuproyecto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && presuproyectoOrigen.getId()!=null && !presuproyectoOrigen.getId().equals(0L))) {presuproyecto.setId(presuproyectoOrigen.getId());}}
			if(conDefault || (!conDefault && presuproyectoOrigen.getid_ejercicio()!=null && !presuproyectoOrigen.getid_ejercicio().equals(-1L))) {presuproyecto.setid_ejercicio(presuproyectoOrigen.getid_ejercicio());}
			if(conDefault || (!conDefault && presuproyectoOrigen.getcodigo()!=null && !presuproyectoOrigen.getcodigo().equals(""))) {presuproyecto.setcodigo(presuproyectoOrigen.getcodigo());}
			if(conDefault || (!conDefault && presuproyectoOrigen.getnombre()!=null && !presuproyectoOrigen.getnombre().equals(""))) {presuproyecto.setnombre(presuproyectoOrigen.getnombre());}
			if(conDefault || (!conDefault && presuproyectoOrigen.getid_presu_tipo_proyecto()!=null && !presuproyectoOrigen.getid_presu_tipo_proyecto().equals(-1L))) {presuproyecto.setid_presu_tipo_proyecto(presuproyectoOrigen.getid_presu_tipo_proyecto());}
			if(conDefault || (!conDefault && presuproyectoOrigen.getid_centro_costo()!=null && !presuproyectoOrigen.getid_centro_costo().equals(null))) {presuproyecto.setid_centro_costo(presuproyectoOrigen.getid_centro_costo());}
			if(conDefault || (!conDefault && presuproyectoOrigen.getfecha()!=null && !presuproyectoOrigen.getfecha().equals(new Date()))) {presuproyecto.setfecha(presuproyectoOrigen.getfecha());}
			if(conDefault || (!conDefault && presuproyectoOrigen.getvalor()!=null && !presuproyectoOrigen.getvalor().equals(0.0))) {presuproyecto.setvalor(presuproyectoOrigen.getvalor());}
			if(conDefault || (!conDefault && presuproyectoOrigen.getid_presu_estado()!=null && !presuproyectoOrigen.getid_presu_estado().equals(-1L))) {presuproyecto.setid_presu_estado(presuproyectoOrigen.getid_presu_estado());}
			if(conDefault || (!conDefault && presuproyectoOrigen.getdescripcion()!=null && !presuproyectoOrigen.getdescripcion().equals(""))) {presuproyecto.setdescripcion(presuproyectoOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPresuProyecto(PresuProyecto presuproyecto) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPresuProyecto.jLabelidPresuProyecto.setText(presuproyecto.getId().toString());
			this.jInternalFrameDetalleFormPresuProyecto.jTextAreacodigoPresuProyecto.setText(presuproyecto.getcodigo());
			this.jInternalFrameDetalleFormPresuProyecto.jTextAreanombrePresuProyecto.setText(presuproyecto.getnombre());
			this.jInternalFrameDetalleFormPresuProyecto.jDateChooserfechaPresuProyecto.setDate(presuproyecto.getfecha());
			this.jInternalFrameDetalleFormPresuProyecto.jTextFieldvalorPresuProyecto.setText(presuproyecto.getvalor().toString());
			this.jInternalFrameDetalleFormPresuProyecto.jTextAreadescripcionPresuProyecto.setText(presuproyecto.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPresuProyecto(PresuProyectoBean presuproyectoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPresuProyecto.jLabelidPresuProyecto.setText(presuproyectoBean.getId().toString());
			this.jInternalFrameDetalleFormPresuProyecto.jTextAreacodigoPresuProyecto.setText(presuproyectoBean.getcodigo());
			this.jInternalFrameDetalleFormPresuProyecto.jTextAreanombrePresuProyecto.setText(presuproyectoBean.getnombre());
			this.jInternalFrameDetalleFormPresuProyecto.jDateChooserfechaPresuProyecto.setDate(presuproyectoBean.getfecha());
			this.jInternalFrameDetalleFormPresuProyecto.jTextFieldvalorPresuProyecto.setText(presuproyectoBean.getvalor().toString());
			this.jInternalFrameDetalleFormPresuProyecto.jTextAreadescripcionPresuProyecto.setText(presuproyectoBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanPresuProyecto(PresuProyectoParameterReturnGeneral presuproyectoReturnGeneral,PresuProyectoBean presuproyectoBean,Boolean conDefault) throws Exception { 
		try {
			PresuProyecto presuproyectoLocal=new PresuProyecto();
			
			presuproyectoLocal=presuproyectoReturnGeneral.getPresuProyecto();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && presuproyectoLocal.getId()!=null && !presuproyectoLocal.getId().equals(0L))) {presuproyectoBean.setId(presuproyectoLocal.getId());}}
			if(conDefault || (!conDefault && presuproyectoLocal.getid_ejercicio()!=null && !presuproyectoLocal.getid_ejercicio().equals(-1L))) {presuproyectoBean.setid_ejercicio(presuproyectoLocal.getid_ejercicio());}
			if(conDefault || (!conDefault && presuproyectoLocal.getcodigo()!=null && !presuproyectoLocal.getcodigo().equals(""))) {presuproyectoBean.setcodigo(presuproyectoLocal.getcodigo());}
			if(conDefault || (!conDefault && presuproyectoLocal.getnombre()!=null && !presuproyectoLocal.getnombre().equals(""))) {presuproyectoBean.setnombre(presuproyectoLocal.getnombre());}
			if(conDefault || (!conDefault && presuproyectoLocal.getid_presu_tipo_proyecto()!=null && !presuproyectoLocal.getid_presu_tipo_proyecto().equals(-1L))) {presuproyectoBean.setid_presu_tipo_proyecto(presuproyectoLocal.getid_presu_tipo_proyecto());}
			if(conDefault || (!conDefault && presuproyectoLocal.getid_centro_costo()!=null && !presuproyectoLocal.getid_centro_costo().equals(null))) {presuproyectoBean.setid_centro_costo(presuproyectoLocal.getid_centro_costo());}
			if(conDefault || (!conDefault && presuproyectoLocal.getfecha()!=null && !presuproyectoLocal.getfecha().equals(new Date()))) {presuproyectoBean.setfecha(presuproyectoLocal.getfecha());}
			if(conDefault || (!conDefault && presuproyectoLocal.getvalor()!=null && !presuproyectoLocal.getvalor().equals(0.0))) {presuproyectoBean.setvalor(presuproyectoLocal.getvalor());}
			if(conDefault || (!conDefault && presuproyectoLocal.getid_presu_estado()!=null && !presuproyectoLocal.getid_presu_estado().equals(-1L))) {presuproyectoBean.setid_presu_estado(presuproyectoLocal.getid_presu_estado());}
			if(conDefault || (!conDefault && presuproyectoLocal.getdescripcion()!=null && !presuproyectoLocal.getdescripcion().equals(""))) {presuproyectoBean.setdescripcion(presuproyectoLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxPresuProyectoGenerico(Long idPresuProyectoSeleccionado,JComboBox jComboBoxPresuProyecto,List<PresuProyecto> presuproyectosLocal)throws Exception {
		try {
			PresuProyecto  presuproyectoTemp=null;

			for(PresuProyecto presuproyectoAux:presuproyectosLocal) {
				if(presuproyectoAux.getId()!=null && presuproyectoAux.getId().equals(idPresuProyectoSeleccionado)) {
					presuproyectoTemp=presuproyectoAux;
					break;
				}
			}

			jComboBoxPresuProyecto.setSelectedItem(presuproyectoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxPresuProyectoGenerico(JComboBox jComboBoxPresuProyecto,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxPresuProyecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPresuProyecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxPresuProyecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPresuProyecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPresuProyecto.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxPresuProyecto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPresuProyecto.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxPresuProyecto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxPresuProyecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxPresuProyecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("PresuTransferencia")) {
			jButtonPresuTransferenciaActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("PresuProyectoCuenta")) {
			jButtonPresuProyectoCuentaActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			presuproyecto=(PresuProyecto) presuproyectoLogic.getPresuProyectos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			presuproyecto =(PresuProyecto) presuproyectos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!presuproyecto.getIsNew() && !presuproyecto.getIsChanged() && !presuproyecto.getIsDeleted()) {
				sDescripcion=presuproyecto.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=presuproyecto.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!presuproyecto.getIsNew() && !presuproyecto.getIsChanged() && !presuproyecto.getIsDeleted()) {
				sDescripcion=presuproyecto.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=presuproyecto.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!presuproyecto.getIsNew() && !presuproyecto.getIsChanged() && !presuproyecto.getIsDeleted()) {
				sDescripcion=presuproyecto.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=presuproyecto.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("PresuTipoProyecto")) {
			//sDescripcion=this.getActualPresuTipoProyectoForeignKeyDescripcion((Long)value);
			if(!presuproyecto.getIsNew() && !presuproyecto.getIsChanged() && !presuproyecto.getIsDeleted()) {
				sDescripcion=presuproyecto.getpresutipoproyecto_descripcion();
			} else {
				//sDescripcion=this.getActualPresuTipoProyectoForeignKeyDescripcion((Long)value);
				sDescripcion=presuproyecto.getpresutipoproyecto_descripcion();
			}
		}

		if(sTipo.equals("CentroCosto")) {
			//sDescripcion=this.getActualCentroCostoForeignKeyDescripcion((Long)value);
			if(!presuproyecto.getIsNew() && !presuproyecto.getIsChanged() && !presuproyecto.getIsDeleted()) {
				sDescripcion=presuproyecto.getcentrocosto_descripcion();
			} else {
				//sDescripcion=this.getActualCentroCostoForeignKeyDescripcion((Long)value);
				sDescripcion=presuproyecto.getcentrocosto_descripcion();
			}
		}

		if(sTipo.equals("PresuEstado")) {
			//sDescripcion=this.getActualPresuEstadoForeignKeyDescripcion((Long)value);
			if(!presuproyecto.getIsNew() && !presuproyecto.getIsChanged() && !presuproyecto.getIsDeleted()) {
				sDescripcion=presuproyecto.getpresuestado_descripcion();
			} else {
				//sDescripcion=this.getActualPresuEstadoForeignKeyDescripcion((Long)value);
				sDescripcion=presuproyecto.getpresuestado_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		PresuProyecto presuproyectoRow=new PresuProyecto();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			presuproyectoRow=(PresuProyecto) presuproyectoLogic.getPresuProyectos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			presuproyectoRow=(PresuProyecto) presuproyectos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonPresuTransferenciaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,PresuProyecto presuproyecto) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormPresuProyecto==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presuproyecto = (PresuProyecto)this.presuproyectoLogic.getPresuProyectos().toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.presuproyecto = (PresuProyecto)this.presuproyectos.toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(presuproyecto!=null) {
						this.presuproyecto = presuproyecto;
					} else {
						this.presuproyecto = new PresuProyecto();
					}
				}

				if(this.isTienePermisosPresuTransferencia && this.permiteMantenimiento(this.presuproyecto)) {
					PresuTransferenciaBeanSwingJInternalFrame presutransferenciaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFramePopup=new PresuTransferenciaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						presutransferenciaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFramePopup;
					} else {
						presutransferenciaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame;
					}

					List<PresuProyecto> presuproyectos=new ArrayList<PresuProyecto>();
					presuproyectos.add(this.presuproyecto);
					if(!esRelacionado) {
						//presutransferenciaBeanSwingJInternalFrame.presutransferenciaSessionBean.setConGuardarRelaciones(false);
						//presutransferenciaBeanSwingJInternalFrame.presutransferenciaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					presutransferenciaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormPresuProyecto.cargarPresuTransferenciaBeanSwingJInternalFrame(presuproyectos,this.presuproyecto,presutransferenciaBeanSwingJInternalFrame,/*conInicializar,*/presutransferenciaBeanSwingJInternalFrame.presutransferenciaSessionBean.getConGuardarRelaciones(),presutransferenciaBeanSwingJInternalFrame.presutransferenciaSessionBean.getEsGuardarRelacionado());
					presutransferenciaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						presutransferenciaBeanSwingJInternalFrame.actualizarEstadoPanelsPresuTransferencia("no_relacionado");

						presutransferenciaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(PresuTransferenciaConstantesFunciones.ITAMANIOFILATABLA + (PresuTransferenciaConstantesFunciones.ITAMANIOFILATABLA/2));

						presutransferenciaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderPresuProyecto=(TitledBorder)this.jScrollPanelDatosPresuProyecto.getBorder();
						TitledBorder titledBorderPresuTransferencia=(TitledBorder)presutransferenciaBeanSwingJInternalFrame.jScrollPanelDatosPresuTransferencia.getBorder();

						titledBorderPresuTransferencia.setTitle(titledBorderPresuProyecto.getTitle() + " -> Transferencia");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,presutransferenciaBeanSwingJInternalFrame);
						}

						presutransferenciaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(presutransferenciaBeanSwingJInternalFrame);

						presutransferenciaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.presuproyectoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Transferencia",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonPresuProyectoCuentaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,PresuProyecto presuproyecto) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormPresuProyecto==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presuproyecto = (PresuProyecto)this.presuproyectoLogic.getPresuProyectos().toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.presuproyecto = (PresuProyecto)this.presuproyectos.toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(presuproyecto!=null) {
						this.presuproyecto = presuproyecto;
					} else {
						this.presuproyecto = new PresuProyecto();
					}
				}

				if(this.isTienePermisosPresuProyectoCuenta && this.permiteMantenimiento(this.presuproyecto)) {
					PresuProyectoCuentaBeanSwingJInternalFrame presuproyectocuentaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFramePopup=new PresuProyectoCuentaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						presuproyectocuentaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFramePopup;
					} else {
						presuproyectocuentaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame;
					}

					List<PresuProyecto> presuproyectos=new ArrayList<PresuProyecto>();
					presuproyectos.add(this.presuproyecto);
					if(!esRelacionado) {
						//presuproyectocuentaBeanSwingJInternalFrame.presuproyectocuentaSessionBean.setConGuardarRelaciones(false);
						//presuproyectocuentaBeanSwingJInternalFrame.presuproyectocuentaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					presuproyectocuentaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormPresuProyecto.cargarPresuProyectoCuentaBeanSwingJInternalFrame(presuproyectos,this.presuproyecto,presuproyectocuentaBeanSwingJInternalFrame,/*conInicializar,*/presuproyectocuentaBeanSwingJInternalFrame.presuproyectocuentaSessionBean.getConGuardarRelaciones(),presuproyectocuentaBeanSwingJInternalFrame.presuproyectocuentaSessionBean.getEsGuardarRelacionado());
					presuproyectocuentaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						presuproyectocuentaBeanSwingJInternalFrame.actualizarEstadoPanelsPresuProyectoCuenta("no_relacionado");

						presuproyectocuentaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(PresuProyectoCuentaConstantesFunciones.ITAMANIOFILATABLA + (PresuProyectoCuentaConstantesFunciones.ITAMANIOFILATABLA/2));

						presuproyectocuentaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderPresuProyecto=(TitledBorder)this.jScrollPanelDatosPresuProyecto.getBorder();
						TitledBorder titledBorderPresuProyectoCuenta=(TitledBorder)presuproyectocuentaBeanSwingJInternalFrame.jScrollPanelDatosPresuProyectoCuenta.getBorder();

						titledBorderPresuProyectoCuenta.setTitle(titledBorderPresuProyecto.getTitle() + " -> Cuenta Contable Proyecto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,presuproyectocuentaBeanSwingJInternalFrame);
						}

						presuproyectocuentaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(presuproyectocuentaBeanSwingJInternalFrame);

						presuproyectocuentaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.presuproyectoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Cuenta Contable Proyecto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualPresuProyecto(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoPresuProyecto.setVisible((this.isVisibilidadCeldaNuevoPresuProyecto && this.isPermisoNuevoPresuProyecto));			
			this.jButtonDuplicarPresuProyecto.setVisible((this.isVisibilidadCeldaDuplicarPresuProyecto && this.isPermisoDuplicarPresuProyecto));			
			this.jButtonCopiarPresuProyecto.setVisible((this.isVisibilidadCeldaCopiarPresuProyecto && this.isPermisoCopiarPresuProyecto));
			this.jButtonVerFormPresuProyecto.setVisible((this.isVisibilidadCeldaVerFormPresuProyecto && this.isPermisoVerFormPresuProyecto));
			
			this.jButtonAbrirOrderByPresuProyecto.setVisible((this.isVisibilidadCeldaOrdenPresuProyecto && this.isPermisoOrdenPresuProyecto));			
			
			this.jButtonNuevoRelacionesPresuProyecto.setVisible((this.isVisibilidadCeldaNuevoRelacionesPresuProyecto && this.isPermisoNuevoPresuProyecto));			
			this.jButtonNuevoGuardarCambiosPresuProyecto.setVisible((this.isVisibilidadCeldaNuevoPresuProyecto && this.isPermisoNuevoPresuProyecto && this.isPermisoGuardarCambiosPresuProyecto));
			
			if(this.jInternalFrameDetalleFormPresuProyecto!=null) {
			this.jInternalFrameDetalleFormPresuProyecto.jButtonModificarPresuProyecto.setVisible((this.isVisibilidadCeldaModificarPresuProyecto && this.isPermisoActualizarPresuProyecto));	
			this.jInternalFrameDetalleFormPresuProyecto.jButtonActualizarPresuProyecto.setVisible((this.isVisibilidadCeldaActualizarPresuProyecto && this.isPermisoActualizarPresuProyecto));	
			this.jInternalFrameDetalleFormPresuProyecto.jButtonEliminarPresuProyecto.setVisible((this.isVisibilidadCeldaEliminarPresuProyecto && this.isPermisoEliminarPresuProyecto));
			this.jInternalFrameDetalleFormPresuProyecto.jButtonCancelarPresuProyecto.setVisible(this.isVisibilidadCeldaCancelarPresuProyecto);							
			this.jInternalFrameDetalleFormPresuProyecto.jButtonGuardarCambiosPresuProyecto.setVisible((this.isVisibilidadCeldaGuardarPresuProyecto && this.isPermisoGuardarCambiosPresuProyecto));			
			
			}
						
			this.jButtonGuardarCambiosTablaPresuProyecto.setVisible((this.isVisibilidadCeldaGuardarCambiosPresuProyecto && this.isPermisoGuardarCambiosPresuProyecto));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarPresuProyecto.setVisible((this.isVisibilidadCeldaNuevoPresuProyecto && this.isPermisoNuevoPresuProyecto));						
			this.jButtonDuplicarToolBarPresuProyecto.setVisible((this.isVisibilidadCeldaDuplicarPresuProyecto && this.isPermisoDuplicarPresuProyecto));						
			this.jButtonCopiarToolBarPresuProyecto.setVisible((this.isVisibilidadCeldaCopiarPresuProyecto && this.isPermisoCopiarPresuProyecto));			
			this.jButtonVerFormToolBarPresuProyecto.setVisible((this.isVisibilidadCeldaVerFormPresuProyecto && this.isPermisoVerFormPresuProyecto));			
			this.jButtonAbrirOrderByToolBarPresuProyecto.setVisible((this.isVisibilidadCeldaOrdenPresuProyecto && this.isPermisoOrdenPresuProyecto));
			this.jButtonNuevoRelacionesToolBarPresuProyecto.setVisible((this.isVisibilidadCeldaNuevoRelacionesPresuProyecto && this.isPermisoNuevoPresuProyecto));			
			this.jButtonNuevoGuardarCambiosToolBarPresuProyecto.setVisible((this.isVisibilidadCeldaNuevoPresuProyecto && this.isPermisoNuevoPresuProyecto && this.isPermisoGuardarCambiosPresuProyecto));			
			
			if(this.jInternalFrameDetalleFormPresuProyecto!=null) {
			this.jInternalFrameDetalleFormPresuProyecto.jButtonModificarToolBarPresuProyecto.setVisible((this.isVisibilidadCeldaModificarPresuProyecto && this.isPermisoActualizarPresuProyecto));	
			this.jInternalFrameDetalleFormPresuProyecto.jButtonActualizarToolBarPresuProyecto.setVisible((this.isVisibilidadCeldaActualizarPresuProyecto  && this.isPermisoActualizarPresuProyecto));	
			this.jInternalFrameDetalleFormPresuProyecto.jButtonEliminarToolBarPresuProyecto.setVisible((this.isVisibilidadCeldaEliminarPresuProyecto && this.isPermisoEliminarPresuProyecto));
			this.jInternalFrameDetalleFormPresuProyecto.jButtonCancelarToolBarPresuProyecto.setVisible(this.isVisibilidadCeldaCancelarPresuProyecto);				
			this.jInternalFrameDetalleFormPresuProyecto.jButtonGuardarCambiosToolBarPresuProyecto.setVisible((this.isVisibilidadCeldaGuardarPresuProyecto && this.isPermisoGuardarCambiosPresuProyecto));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarPresuProyecto.setVisible((this.isVisibilidadCeldaGuardarCambiosPresuProyecto && this.isPermisoGuardarCambiosPresuProyecto));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoPresuProyecto.setVisible((this.isVisibilidadCeldaNuevoPresuProyecto && this.isPermisoNuevoPresuProyecto));			
			this.jMenuItemDuplicarPresuProyecto.setVisible((this.isVisibilidadCeldaDuplicarPresuProyecto && this.isPermisoDuplicarPresuProyecto));			
			this.jMenuItemCopiarPresuProyecto.setVisible((this.isVisibilidadCeldaCopiarPresuProyecto && this.isPermisoCopiarPresuProyecto));			
			this.jMenuItemVerFormPresuProyecto.setVisible((this.isVisibilidadCeldaVerFormPresuProyecto && this.isPermisoVerFormPresuProyecto));			
			this.jMenuItemAbrirOrderByPresuProyecto.setVisible((this.isVisibilidadCeldaOrdenPresuProyecto && this.isPermisoOrdenPresuProyecto));			
			//this.jMenuItemMostrarOcultarPresuProyecto.setVisible((this.isVisibilidadCeldaOrdenPresuProyecto && this.isPermisoOrdenPresuProyecto));
			this.jMenuItemDetalleAbrirOrderByPresuProyecto.setVisible((this.isVisibilidadCeldaOrdenPresuProyecto && this.isPermisoOrdenPresuProyecto));			
			//this.jMenuItemDetalleMostrarOcultarPresuProyecto.setVisible((this.isVisibilidadCeldaOrdenPresuProyecto && this.isPermisoOrdenPresuProyecto));			
			this.jMenuItemNuevoRelacionesPresuProyecto.setVisible((this.isVisibilidadCeldaNuevoRelacionesPresuProyecto && this.isPermisoNuevoPresuProyecto));			
			this.jMenuItemNuevoGuardarCambiosPresuProyecto.setVisible((this.isVisibilidadCeldaNuevoPresuProyecto && this.isPermisoNuevoPresuProyecto && this.isPermisoGuardarCambiosPresuProyecto));									
			
			if(this.jInternalFrameDetalleFormPresuProyecto!=null) {
			this.jInternalFrameDetalleFormPresuProyecto.jMenuItemModificarPresuProyecto.setVisible((this.isVisibilidadCeldaModificarPresuProyecto && this.isPermisoActualizarPresuProyecto));	
			this.jInternalFrameDetalleFormPresuProyecto.jMenuItemActualizarPresuProyecto.setVisible((this.isVisibilidadCeldaActualizarPresuProyecto && this.isPermisoActualizarPresuProyecto));	
			this.jInternalFrameDetalleFormPresuProyecto.jMenuItemEliminarPresuProyecto.setVisible((this.isVisibilidadCeldaEliminarPresuProyecto && this.isPermisoEliminarPresuProyecto));
			this.jInternalFrameDetalleFormPresuProyecto.jMenuItemCancelarPresuProyecto.setVisible(this.isVisibilidadCeldaCancelarPresuProyecto);				
			}
			
			this.jMenuItemGuardarCambiosPresuProyecto.setVisible((this.isVisibilidadCeldaGuardarPresuProyecto && this.isPermisoGuardarCambiosPresuProyecto));						
			this.jMenuItemGuardarCambiosTablaPresuProyecto.setVisible((this.isVisibilidadCeldaGuardarCambiosPresuProyecto && this.isPermisoGuardarCambiosPresuProyecto));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoPresuProyecto=this.jButtonNuevoPresuProyecto.isVisible();
			this.isVisibilidadCeldaDuplicarPresuProyecto=this.jButtonDuplicarPresuProyecto.isVisible();
			this.isVisibilidadCeldaCopiarPresuProyecto=this.jButtonCopiarPresuProyecto.isVisible();
			this.isVisibilidadCeldaVerFormPresuProyecto=this.jButtonVerFormPresuProyecto.isVisible();
			
			this.isVisibilidadCeldaOrdenPresuProyecto=this.jButtonAbrirOrderByPresuProyecto.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesPresuProyecto=this.jButtonNuevoRelacionesPresuProyecto.isVisible();
			this.isVisibilidadCeldaModificarPresuProyecto=this.jButtonModificarPresuProyecto.isVisible();
			
			if(this.jInternalFrameDetalleFormPresuProyecto!=null) {
			this.isVisibilidadCeldaActualizarPresuProyecto=this.jInternalFrameDetalleFormPresuProyecto.jButtonActualizarPresuProyecto.isVisible();
			this.isVisibilidadCeldaEliminarPresuProyecto=this.jInternalFrameDetalleFormPresuProyecto.jButtonEliminarPresuProyecto.isVisible();
			this.isVisibilidadCeldaCancelarPresuProyecto=this.jInternalFrameDetalleFormPresuProyecto.jButtonCancelarPresuProyecto.isVisible();
			this.isVisibilidadCeldaGuardarPresuProyecto=this.jInternalFrameDetalleFormPresuProyecto.jButtonGuardarCambiosPresuProyecto.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosPresuProyecto=this.jButtonGuardarCambiosTablaPresuProyecto.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoPresuProyecto=this.jButtonNuevoToolBarPresuProyecto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPresuProyecto=this.jButtonNuevoRelacionesToolBarPresuProyecto.isVisible();
			
			if(this.jInternalFrameDetalleFormPresuProyecto!=null) {
			this.isVisibilidadCeldaModificarPresuProyecto=this.jInternalFrameDetalleFormPresuProyecto.jButtonModificarToolBarPresuProyecto.isVisible();
			this.isVisibilidadCeldaActualizarPresuProyecto=this.jInternalFrameDetalleFormPresuProyecto.jButtonActualizarToolBarPresuProyecto.isVisible();
			this.isVisibilidadCeldaEliminarPresuProyecto=this.jInternalFrameDetalleFormPresuProyecto.jButtonEliminarToolBarPresuProyecto.isVisible();
			this.isVisibilidadCeldaCancelarPresuProyecto=this.jInternalFrameDetalleFormPresuProyecto.jButtonCancelarToolBarPresuProyecto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPresuProyecto=this.jButtonGuardarCambiosToolBarPresuProyecto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPresuProyecto=this.jButtonGuardarCambiosTablaToolBarPresuProyecto.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoPresuProyecto=this.jMenuItemNuevoPresuProyecto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPresuProyecto=this.jMenuItemNuevoRelacionesPresuProyecto.isVisible();
			
			if(this.jInternalFrameDetalleFormPresuProyecto!=null) {
			this.isVisibilidadCeldaModificarPresuProyecto=this.jInternalFrameDetalleFormPresuProyecto.jMenuItemModificarPresuProyecto.isVisible();
			this.isVisibilidadCeldaActualizarPresuProyecto=this.jInternalFrameDetalleFormPresuProyecto.jMenuItemActualizarPresuProyecto.isVisible();
			this.isVisibilidadCeldaEliminarPresuProyecto=this.jInternalFrameDetalleFormPresuProyecto.jMenuItemEliminarPresuProyecto.isVisible();
			this.isVisibilidadCeldaCancelarPresuProyecto=this.jInternalFrameDetalleFormPresuProyecto.jMenuItemCancelarPresuProyecto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPresuProyecto=this.jMenuItemGuardarCambiosPresuProyecto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPresuProyecto=this.jMenuItemGuardarCambiosTablaPresuProyecto.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesPresuProyecto(Boolean esInicializar) {
		if(PresuProyectoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.presuproyectoSessionBean.getConGuardarRelaciones()) {
				//if(this.presuproyectoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesPresuProyecto();
			}
			
			this.inicializarActualizarBindingBotonesManualPresuProyecto(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualPresuProyecto() {
		this.jButtonNuevoPresuProyecto.setVisible(this.isPermisoNuevoPresuProyecto);			
		this.jButtonDuplicarPresuProyecto.setVisible(this.isPermisoDuplicarPresuProyecto);			
		this.jButtonCopiarPresuProyecto.setVisible(this.isPermisoCopiarPresuProyecto);			
		this.jButtonVerFormPresuProyecto.setVisible(this.isPermisoVerFormPresuProyecto);			
		
		this.jButtonAbrirOrderByPresuProyecto.setVisible(this.isPermisoOrdenPresuProyecto);					
		
		this.jButtonNuevoRelacionesPresuProyecto.setVisible(this.isPermisoNuevoPresuProyecto);			
		
		if(this.jInternalFrameDetalleFormPresuProyecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuProyecto.jButtonModificarPresuProyecto.setVisible(this.isPermisoActualizarPresuProyecto);	
			this.jInternalFrameDetalleFormPresuProyecto.jButtonActualizarPresuProyecto.setVisible(this.isPermisoActualizarPresuProyecto);	
			this.jInternalFrameDetalleFormPresuProyecto.jButtonEliminarPresuProyecto.setVisible(this.isPermisoEliminarPresuProyecto);
			this.jInternalFrameDetalleFormPresuProyecto.jButtonCancelarPresuProyecto.setVisible(this.isVisibilidadCeldaCancelarPresuProyecto);						
			this.jInternalFrameDetalleFormPresuProyecto.jButtonGuardarCambiosPresuProyecto.setVisible(this.isPermisoGuardarCambiosPresuProyecto);							
		}
		
		this.jButtonGuardarCambiosTablaPresuProyecto.setVisible(this.isPermisoActualizarPresuProyecto);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetallePresuProyecto() {
		this.jInternalFrameDetalleFormPresuProyecto.jButtonModificarPresuProyecto.setVisible(this.isPermisoActualizarPresuProyecto);	
		this.jInternalFrameDetalleFormPresuProyecto.jButtonActualizarPresuProyecto.setVisible(this.isPermisoActualizarPresuProyecto);	
		this.jInternalFrameDetalleFormPresuProyecto.jButtonEliminarPresuProyecto.setVisible(this.isPermisoEliminarPresuProyecto);
		this.jInternalFrameDetalleFormPresuProyecto.jButtonCancelarPresuProyecto.setVisible(this.isVisibilidadCeldaCancelarPresuProyecto);							
		this.jInternalFrameDetalleFormPresuProyecto.jButtonGuardarCambiosPresuProyecto.setVisible((this.isVisibilidadCeldaGuardarPresuProyecto && this.isPermisoGuardarCambiosPresuProyecto));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosPresuProyecto() {
		if(PresuProyectoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualPresuProyecto();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesPresuProyecto() {
	}
	
	public void jTableDatosPresuProyectoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarPresuProyecto(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidPresuProyectoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuProyecto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresuProyecto(this.getpresuproyecto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuProyecto(this.presuproyecto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presuproyecto =(PresuProyecto) this.presuproyectoLogic.getPresuProyectos().toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presuproyecto =(PresuProyecto) this.presuproyectos.toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presuproyecto==null) {
						this.presuproyecto = new PresuProyecto();
					}

					this.setVariablesFormularioToObjetoActualPresuProyecto(this.presuproyecto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuProyecto(this.presuproyecto);
				}

				if(this.presuproyecto.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.presuproyecto.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresuProyecto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaPresuProyectoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebPresuProyecto(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuProyecto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPresuProyecto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPresuProyecto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyecto =(PresuProyecto) this.presuproyectoLogic.getPresuProyectos().toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presuproyecto =(PresuProyecto) this.presuproyectos.toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPresuProyecto(this.getpresuproyecto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresuProyecto(this.presuproyecto);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.presuproyectoLogic.getConnexion());

				if(this.presuproyecto.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.presuproyecto.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPresuProyecto=(TitledBorder)this.jScrollPanelDatosPresuProyecto.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderPresuProyecto.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaPresuProyectoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuProyecto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresuProyecto(this.getpresuproyecto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuProyecto(this.presuproyecto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presuproyecto =(PresuProyecto) this.presuproyectoLogic.getPresuProyectos().toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presuproyecto =(PresuProyecto) this.presuproyectos.toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presuproyecto==null) {
						this.presuproyecto = new PresuProyecto();
					}

					this.setVariablesFormularioToObjetoActualPresuProyecto(this.presuproyecto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuProyecto(this.presuproyecto);
				}

				if(this.presuproyecto.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.presuproyecto.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresuProyecto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalPresuProyectoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebPresuProyecto(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuProyecto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPresuProyecto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPresuProyecto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyecto =(PresuProyecto) this.presuproyectoLogic.getPresuProyectos().toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presuproyecto =(PresuProyecto) this.presuproyectos.toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPresuProyecto(this.getpresuproyecto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresuProyecto(this.presuproyecto);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.presuproyectoLogic.getConnexion());

				if(this.presuproyecto.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.presuproyecto.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPresuProyecto=(TitledBorder)this.jScrollPanelDatosPresuProyecto.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderPresuProyecto.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalPresuProyectoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuProyecto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresuProyecto(this.getpresuproyecto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuProyecto(this.presuproyecto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presuproyecto =(PresuProyecto) this.presuproyectoLogic.getPresuProyectos().toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presuproyecto =(PresuProyecto) this.presuproyectos.toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presuproyecto==null) {
						this.presuproyecto = new PresuProyecto();
					}

					this.setVariablesFormularioToObjetoActualPresuProyecto(this.presuproyecto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuProyecto(this.presuproyecto);
				}

				if(this.presuproyecto.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.presuproyecto.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresuProyecto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioPresuProyectoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebPresuProyecto(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuProyecto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPresuProyecto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPresuProyecto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyecto =(PresuProyecto) this.presuproyectoLogic.getPresuProyectos().toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presuproyecto =(PresuProyecto) this.presuproyectos.toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPresuProyecto(this.getpresuproyecto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresuProyecto(this.presuproyecto);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.presuproyectoLogic.getConnexion());

				if(this.presuproyecto.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.presuproyecto.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPresuProyecto=(TitledBorder)this.jScrollPanelDatosPresuProyecto.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderPresuProyecto.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioPresuProyectoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuProyecto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresuProyecto(this.getpresuproyecto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuProyecto(this.presuproyecto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presuproyecto =(PresuProyecto) this.presuproyectoLogic.getPresuProyectos().toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presuproyecto =(PresuProyecto) this.presuproyectos.toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presuproyecto==null) {
						this.presuproyecto = new PresuProyecto();
					}

					this.setVariablesFormularioToObjetoActualPresuProyecto(this.presuproyecto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuProyecto(this.presuproyecto);
				}

				if(this.presuproyecto.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.presuproyecto.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresuProyecto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoPresuProyectoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuProyecto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresuProyecto(this.getpresuproyecto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuProyecto(this.presuproyecto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presuproyecto =(PresuProyecto) this.presuproyectoLogic.getPresuProyectos().toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presuproyecto =(PresuProyecto) this.presuproyectos.toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presuproyecto==null) {
						this.presuproyecto = new PresuProyecto();
					}

					this.setVariablesFormularioToObjetoActualPresuProyecto(this.presuproyecto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuProyecto(this.presuproyecto);
				}

				if(this.presuproyecto.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.presuproyecto.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresuProyecto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombrePresuProyectoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuProyecto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresuProyecto(this.getpresuproyecto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuProyecto(this.presuproyecto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presuproyecto =(PresuProyecto) this.presuproyectoLogic.getPresuProyectos().toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presuproyecto =(PresuProyecto) this.presuproyectos.toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presuproyecto==null) {
						this.presuproyecto = new PresuProyecto();
					}

					this.setVariablesFormularioToObjetoActualPresuProyecto(this.presuproyecto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuProyecto(this.presuproyecto);
				}

				if(this.presuproyecto.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.presuproyecto.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresuProyecto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_presu_tipo_proyectoPresuProyectoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopresutipoproyecto=true;

			idTienePermisopresutipoproyecto=this.tienePermisosUsuarioEnPaginaWebPresuProyecto(PresuTipoProyectoConstantesFunciones.CLASSNAME);

			if(idTienePermisopresutipoproyecto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuProyecto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPresuProyecto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPresuProyecto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyecto =(PresuProyecto) this.presuproyectoLogic.getPresuProyectos().toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presuproyecto =(PresuProyecto) this.presuproyectos.toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPresuProyecto(this.getpresuproyecto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresuProyecto(this.presuproyecto);

				this.presutipoproyectoBeanSwingJInternalFrame=new PresuTipoProyectoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.presutipoproyectoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.presutipoproyectoBeanSwingJInternalFrame.getPresuTipoProyectoLogic().setConnexion(this.presuproyectoLogic.getConnexion());

				if(this.presuproyecto.getid_presu_tipo_proyecto()!=null) {
					this.presutipoproyectoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.presutipoproyectoBeanSwingJInternalFrame.setIdActual(this.presuproyecto.getid_presu_tipo_proyecto());
					this.presutipoproyectoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.presutipoproyectoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.presutipoproyectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPresuTipoProyecto();
				}

				JInternalFrameBase jinternalFrame =this.presutipoproyectoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPresuProyecto=(TitledBorder)this.jScrollPanelDatosPresuProyecto.getBorder();
				TitledBorder titledBorderpresutipoproyecto=(TitledBorder)this.presutipoproyectoBeanSwingJInternalFrame.jScrollPanelDatosPresuTipoProyecto.getBorder();

				titledBorderpresutipoproyecto.setTitle(titledBorderPresuProyecto.getTitle() + " -> Tipo Proyecto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_presu_tipo_proyectoPresuProyectoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuProyecto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresuProyecto(this.getpresuproyecto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuProyecto(this.presuproyecto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presuproyecto =(PresuProyecto) this.presuproyectoLogic.getPresuProyectos().toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presuproyecto =(PresuProyecto) this.presuproyectos.toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presuproyecto==null) {
						this.presuproyecto = new PresuProyecto();
					}

					this.setVariablesFormularioToObjetoActualPresuProyecto(this.presuproyecto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuProyecto(this.presuproyecto);
				}

				if(this.presuproyecto.getid_presu_tipo_proyecto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_presu_tipo_proyecto = "+this.presuproyecto.getid_presu_tipo_proyecto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresuProyecto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_centro_costoPresuProyectoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocentrocosto=true;

			idTienePermisocentrocosto=this.tienePermisosUsuarioEnPaginaWebPresuProyecto(CentroCostoConstantesFunciones.CLASSNAME);

			if(idTienePermisocentrocosto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuProyecto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPresuProyecto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPresuProyecto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyecto =(PresuProyecto) this.presuproyectoLogic.getPresuProyectos().toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presuproyecto =(PresuProyecto) this.presuproyectos.toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPresuProyecto(this.getpresuproyecto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresuProyecto(this.presuproyecto);

				this.centrocostoBeanSwingJInternalFrame=new CentroCostoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.centrocostoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.centrocostoBeanSwingJInternalFrame.getCentroCostoLogic().setConnexion(this.presuproyectoLogic.getConnexion());

				if(this.presuproyecto.getid_centro_costo()!=null) {
					this.centrocostoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.centrocostoBeanSwingJInternalFrame.setIdActual(this.presuproyecto.getid_centro_costo());
					this.centrocostoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.centrocostoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.centrocostoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCentroCosto();
				}

				JInternalFrameBase jinternalFrame =this.centrocostoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPresuProyecto=(TitledBorder)this.jScrollPanelDatosPresuProyecto.getBorder();
				TitledBorder titledBordercentrocosto=(TitledBorder)this.centrocostoBeanSwingJInternalFrame.jScrollPanelDatosCentroCosto.getBorder();

				titledBordercentrocosto.setTitle(titledBorderPresuProyecto.getTitle() + " -> Centro Costo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_centro_costoPresuProyectoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuProyecto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresuProyecto(this.getpresuproyecto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuProyecto(this.presuproyecto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presuproyecto =(PresuProyecto) this.presuproyectoLogic.getPresuProyectos().toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presuproyecto =(PresuProyecto) this.presuproyectos.toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presuproyecto==null) {
						this.presuproyecto = new PresuProyecto();
					}

					this.setVariablesFormularioToObjetoActualPresuProyecto(this.presuproyecto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuProyecto(this.presuproyecto);
				}

				if(this.presuproyecto.getid_centro_costo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_centro_costo = "+this.presuproyecto.getid_centro_costo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresuProyecto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaPresuProyectoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuProyecto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresuProyecto(this.getpresuproyecto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuProyecto(this.presuproyecto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presuproyecto =(PresuProyecto) this.presuproyectoLogic.getPresuProyectos().toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presuproyecto =(PresuProyecto) this.presuproyectos.toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presuproyecto==null) {
						this.presuproyecto = new PresuProyecto();
					}

					this.setVariablesFormularioToObjetoActualPresuProyecto(this.presuproyecto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuProyecto(this.presuproyecto);
				}

				if(this.presuproyecto.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.presuproyecto.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresuProyecto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorPresuProyectoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuProyecto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresuProyecto(this.getpresuproyecto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuProyecto(this.presuproyecto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presuproyecto =(PresuProyecto) this.presuproyectoLogic.getPresuProyectos().toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presuproyecto =(PresuProyecto) this.presuproyectos.toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presuproyecto==null) {
						this.presuproyecto = new PresuProyecto();
					}

					this.setVariablesFormularioToObjetoActualPresuProyecto(this.presuproyecto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuProyecto(this.presuproyecto);
				}

				if(this.presuproyecto.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.presuproyecto.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresuProyecto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_presu_estadoPresuProyectoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopresuestado=true;

			idTienePermisopresuestado=this.tienePermisosUsuarioEnPaginaWebPresuProyecto(PresuEstadoConstantesFunciones.CLASSNAME);

			if(idTienePermisopresuestado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuProyecto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPresuProyecto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPresuProyecto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyecto =(PresuProyecto) this.presuproyectoLogic.getPresuProyectos().toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presuproyecto =(PresuProyecto) this.presuproyectos.toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPresuProyecto(this.getpresuproyecto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresuProyecto(this.presuproyecto);

				this.presuestadoBeanSwingJInternalFrame=new PresuEstadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.presuestadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.presuestadoBeanSwingJInternalFrame.getPresuEstadoLogic().setConnexion(this.presuproyectoLogic.getConnexion());

				if(this.presuproyecto.getid_presu_estado()!=null) {
					this.presuestadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.presuestadoBeanSwingJInternalFrame.setIdActual(this.presuproyecto.getid_presu_estado());
					this.presuestadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.presuestadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.presuestadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPresuEstado();
				}

				JInternalFrameBase jinternalFrame =this.presuestadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPresuProyecto=(TitledBorder)this.jScrollPanelDatosPresuProyecto.getBorder();
				TitledBorder titledBorderpresuestado=(TitledBorder)this.presuestadoBeanSwingJInternalFrame.jScrollPanelDatosPresuEstado.getBorder();

				titledBorderpresuestado.setTitle(titledBorderPresuProyecto.getTitle() + " -> Estado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_presu_estadoPresuProyectoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuProyecto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresuProyecto(this.getpresuproyecto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuProyecto(this.presuproyecto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presuproyecto =(PresuProyecto) this.presuproyectoLogic.getPresuProyectos().toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presuproyecto =(PresuProyecto) this.presuproyectos.toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presuproyecto==null) {
						this.presuproyecto = new PresuProyecto();
					}

					this.setVariablesFormularioToObjetoActualPresuProyecto(this.presuproyecto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuProyecto(this.presuproyecto);
				}

				if(this.presuproyecto.getid_presu_estado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_presu_estado = "+this.presuproyecto.getid_presu_estado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresuProyecto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionPresuProyectoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuProyecto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresuProyecto(this.getpresuproyecto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuProyecto(this.presuproyecto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presuproyecto =(PresuProyecto) this.presuproyectoLogic.getPresuProyectos().toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presuproyecto =(PresuProyecto) this.presuproyectos.toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presuproyecto==null) {
						this.presuproyecto = new PresuProyecto();
					}

					this.setVariablesFormularioToObjetoActualPresuProyecto(this.presuproyecto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuProyecto(this.presuproyecto);
				}

				if(this.presuproyecto.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.presuproyecto.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresuProyecto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoPresuProyectoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresuProyecto(false,false);

			this.getPresuProyectosBusquedaPorCodigo();

			this.inicializarActualizarBindingPresuProyecto(false);

			//if(PresuProyectoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresuProyecto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombrePresuProyectoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresuProyecto(false,false);

			this.getPresuProyectosBusquedaPorNombre();

			this.inicializarActualizarBindingPresuProyecto(false);

			//if(PresuProyectoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresuProyecto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCentroCostoPresuProyectoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresuProyecto(false,false);

			this.getPresuProyectosFK_IdCentroCosto();

			this.inicializarActualizarBindingPresuProyecto(false);

			//if(PresuProyectoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresuProyecto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioPresuProyectoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresuProyecto(false,false);

			this.getPresuProyectosFK_IdEjercicio();

			this.inicializarActualizarBindingPresuProyecto(false);

			//if(PresuProyectoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresuProyecto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaPresuProyectoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresuProyecto(false,false);

			this.getPresuProyectosFK_IdEmpresa();

			this.inicializarActualizarBindingPresuProyecto(false);

			//if(PresuProyectoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresuProyecto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPresuEstadoPresuProyectoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresuProyecto(false,false);

			this.getPresuProyectosFK_IdPresuEstado();

			this.inicializarActualizarBindingPresuProyecto(false);

			//if(PresuProyectoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresuProyecto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPresuTipoProyectoPresuProyectoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresuProyecto(false,false);

			this.getPresuProyectosFK_IdPresuTipoProyecto();

			this.inicializarActualizarBindingPresuProyecto(false);

			//if(PresuProyectoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresuProyecto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalPresuProyectoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresuProyecto(false,false);

			this.getPresuProyectosFK_IdSucursal();

			this.inicializarActualizarBindingPresuProyecto(false);

			//if(PresuProyectoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresuProyecto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuproyectoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFramePresuProyecto() {
		if(this.jInternalFrameDetalleFormPresuProyecto!=null) {
		

		if(this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormPresuProyecto!=null) {
			this.jInternalFrameDetalleFormPresuProyecto.setVisible(false);	    			
			this.jInternalFrameDetalleFormPresuProyecto.dispose();
			this.jInternalFrameDetalleFormPresuProyecto=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoPresuProyecto!=null) {
			this.jInternalFrameReporteDinamicoPresuProyecto.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoPresuProyecto.dispose();
			this.jInternalFrameReporteDinamicoPresuProyecto=null;
		}
		
		if(this.jInternalFrameImportacionPresuProyecto!=null) {
			this.jInternalFrameImportacionPresuProyecto.setVisible(false);	    			
			this.jInternalFrameImportacionPresuProyecto.dispose();
			this.jInternalFrameImportacionPresuProyecto=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessPresuProyecto();
			
			PresuProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presuproyecto,new Object(),this.presuproyectoParameterGeneral,this.presuproyectoReturnGeneral);
			
			
			if(sTipo.equals("NuevoPresuProyecto")) {
				jButtonNuevoPresuProyectoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarPresuProyecto")) {
				jButtonDuplicarPresuProyectoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarPresuProyecto")) {
				jButtonCopiarPresuProyectoActionPerformed(evt);
			} else if(sTipo.equals("VerFormPresuProyecto")) {
				jButtonVerFormPresuProyectoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarPresuProyecto")) {
				jButtonNuevoPresuProyectoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarPresuProyecto")) {
				jButtonDuplicarPresuProyectoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoPresuProyecto")) {
				jButtonNuevoPresuProyectoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarPresuProyecto")) {
				jButtonDuplicarPresuProyectoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesPresuProyecto")) {
				jButtonNuevoPresuProyectoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarPresuProyecto")) {
				jButtonNuevoPresuProyectoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesPresuProyecto")) {
				jButtonNuevoPresuProyectoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarPresuProyecto")) {
				jButtonModificarPresuProyectoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarPresuProyecto")) {
				jButtonModificarPresuProyectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarPresuProyecto")) {
				jButtonModificarPresuProyectoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarPresuProyecto")) {
				jButtonActualizarPresuProyectoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarPresuProyecto")) {
				jButtonActualizarPresuProyectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarPresuProyecto")) {
				jButtonActualizarPresuProyectoActionPerformed(evt);
			} else if(sTipo.equals("EliminarPresuProyecto")) {
				jButtonEliminarPresuProyectoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarPresuProyecto")) {
				jButtonEliminarPresuProyectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarPresuProyecto")) {
				jButtonEliminarPresuProyectoActionPerformed(evt);
			} else if(sTipo.equals("CancelarPresuProyecto")) {
				jButtonCancelarPresuProyectoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarPresuProyecto")) {
				jButtonCancelarPresuProyectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarPresuProyecto")) {
				jButtonCancelarPresuProyectoActionPerformed(evt);
			} else if(sTipo.equals("CerrarPresuProyecto")) {
				jButtonCerrarPresuProyectoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarPresuProyecto")) {
				jButtonCerrarPresuProyectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarPresuProyecto")) {
				jButtonCerrarPresuProyectoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarPresuProyecto")) {
				jButtonMostrarOcultarPresuProyectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarPresuProyecto")) {
				jButtonCancelarPresuProyectoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosPresuProyecto")) {
				jButtonGuardarCambiosPresuProyectoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarPresuProyecto")) {
				jButtonGuardarCambiosPresuProyectoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarPresuProyecto")) {
				jButtonCopiarPresuProyectoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarPresuProyecto")) {
				jButtonVerFormPresuProyectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosPresuProyecto")) {
				jButtonGuardarCambiosPresuProyectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarPresuProyecto")) {
				jButtonCopiarPresuProyectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormPresuProyecto")) {
				jButtonVerFormPresuProyectoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaPresuProyecto")) {
				jButtonGuardarCambiosPresuProyectoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarPresuProyecto")) {
				jButtonGuardarCambiosPresuProyectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaPresuProyecto")) {
				jButtonGuardarCambiosPresuProyectoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionPresuProyecto")) {
				jButtonRecargarInformacionPresuProyectoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarPresuProyecto")) {
				jButtonRecargarInformacionPresuProyectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionPresuProyecto")) {
				jButtonRecargarInformacionPresuProyectoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresPresuProyecto")) {
				jButtonAnterioresPresuProyectoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarPresuProyecto")) {
				jButtonAnterioresPresuProyectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnteriorePresuProyecto")) {
				jButtonAnterioresPresuProyectoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesPresuProyecto")) {
				jButtonSiguientesPresuProyectoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarPresuProyecto")) {
				jButtonSiguientesPresuProyectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesPresuProyecto")) {
				jButtonSiguientesPresuProyectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByPresuProyecto") || sTipo.equals("MenuItemDetalleAbrirOrderByPresuProyecto")) {
				jButtonAbrirOrderByPresuProyectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarPresuProyecto") || sTipo.equals("MenuItemDetalleMostrarOcultarPresuProyecto")) {
				jButtonMostrarOcultarPresuProyectoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosPresuProyecto")) {
				jButtonNuevoGuardarCambiosPresuProyectoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarPresuProyecto")) {
				jButtonNuevoGuardarCambiosPresuProyectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosPresuProyecto")) {
				jButtonNuevoGuardarCambiosPresuProyectoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoPresuProyecto")) {
				jButtonCerrarReporteDinamicoPresuProyectoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoPresuProyecto")) {
				jButtonGenerarReporteDinamicoPresuProyectoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoPresuProyecto")) {
				
				jButtonGenerarExcelReporteDinamicoPresuProyectoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionPresuProyecto")) {
				jButtonCerrarImportacionPresuProyectoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionPresuProyecto")) {
				
				jButtonGenerarImportacionPresuProyectoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionPresuProyecto")) {
				
				jButtonAbrirImportacionPresuProyectoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesPresuProyecto")) {
				jComboBoxTiposAccionesPresuProyectoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesPresuProyecto")) {
				jComboBoxTiposRelacionesPresuProyectoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioPresuProyecto")) {
				jComboBoxTiposAccionesPresuProyectoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarPresuProyecto")) {
				
				jComboBoxTiposSeleccionarPresuProyectoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralPresuProyecto")) {
				jTextFieldValorCampoGeneralPresuProyectoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByPresuProyecto")) {
				jButtonAbrirOrderByPresuProyectoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarPresuProyecto")) {
				jButtonAbrirOrderByPresuProyectoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByPresuProyecto")) {
				jButtonCerrarOrderByPresuProyectoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPresuProyectoBusqueda")) {
				this.jButtonidPresuProyectoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPresuProyectoUpdate")) {
				this.jButtonid_empresaPresuProyectoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPresuProyectoBusqueda")) {
				this.jButtonid_empresaPresuProyectoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalPresuProyectoUpdate")) {
				this.jButtonid_sucursalPresuProyectoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalPresuProyectoBusqueda")) {
				this.jButtonid_sucursalPresuProyectoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioPresuProyectoUpdate")) {
				this.jButtonid_ejercicioPresuProyectoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioPresuProyectoBusqueda")) {
				this.jButtonid_ejercicioPresuProyectoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoPresuProyectoBusqueda")) {
				this.jButtoncodigoPresuProyectoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombrePresuProyectoBusqueda")) {
				this.jButtonnombrePresuProyectoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_presu_tipo_proyectoPresuProyectoUpdate")) {
				this.jButtonid_presu_tipo_proyectoPresuProyectoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_presu_tipo_proyectoPresuProyectoBusqueda")) {
				this.jButtonid_presu_tipo_proyectoPresuProyectoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_centro_costoPresuProyectoUpdate")) {
				this.jButtonid_centro_costoPresuProyectoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_centro_costoPresuProyectoBusqueda")) {
				this.jButtonid_centro_costoPresuProyectoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaPresuProyectoBusqueda")) {
				this.jButtonfechaPresuProyectoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorPresuProyectoBusqueda")) {
				this.jButtonvalorPresuProyectoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_presu_estadoPresuProyectoUpdate")) {
				this.jButtonid_presu_estadoPresuProyectoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_presu_estadoPresuProyectoBusqueda")) {
				this.jButtonid_presu_estadoPresuProyectoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionPresuProyectoBusqueda")) {
				this.jButtondescripcionPresuProyectoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoPresuProyecto")) {
				this.jButtonBusquedaPorCodigoPresuProyectoActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombrePresuProyecto")) {
				this.jButtonBusquedaPorNombrePresuProyectoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEjercicioPresuProyecto")) {
				this.jButtonFK_IdEjercicioPresuProyectoActionPerformed(evt);
			}
			
			;
			
			
			PresuProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presuproyecto,new Object(),this.presuproyectoParameterGeneral,this.presuproyectoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessPresuProyecto();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresuProyectoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presuproyecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presuproyecto);
				
				PresuProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuproyecto,new Object(),this.presuproyectoParameterGeneral,this.presuproyectoReturnGeneral);
				
				


				
				PresuProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuproyecto,new Object(),this.presuproyectoParameterGeneral,this.presuproyectoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuProyecto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuProyecto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			PresuProyecto presuproyectoLocal=null;
			
			if(!this.getEsControlTabla()) {
				presuproyectoLocal=this.presuproyecto;
			} else {
				presuproyectoLocal=this.presuproyectoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presuproyecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presuproyecto);
				
				PresuProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuproyecto,new Object(),this.presuproyectoParameterGeneral,this.presuproyectoReturnGeneral);
							
				
				


				
				PresuProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuproyecto,new Object(),this.presuproyectoParameterGeneral,this.presuproyectoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuProyecto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuProyecto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresuProyectoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresuProyecto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoAnterior =(PresuProyecto) this.presuproyectoLogic.getPresuProyectos().toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presuproyectoAnterior =(PresuProyecto) this.presuproyectos.toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
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
			
			PresuProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuproyecto,new Object(),this.presuproyectoParameterGeneral,this.presuproyectoReturnGeneral);
			
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
			
			


			
			PresuProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuproyecto,new Object(),this.presuproyectoParameterGeneral,this.presuproyectoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresuProyectoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presuproyecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presuproyecto);
				
				PresuProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuproyecto,new Object(),this.presuproyectoParameterGeneral,this.presuproyectoReturnGeneral);
								
						
				


				
				PresuProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuproyecto,new Object(),this.presuproyectoParameterGeneral,this.presuproyectoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuProyecto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuProyecto.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presuproyecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presuproyecto);
				
				PresuProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuproyecto,new Object(),this.presuproyectoParameterGeneral,this.presuproyectoReturnGeneral);
								
				
				


				
				PresuProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuproyecto,new Object(),this.presuproyectoParameterGeneral,this.presuproyectoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuProyecto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuProyecto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresuProyectoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresuProyecto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoAnterior =(PresuProyecto) this.presuproyectoLogic.getPresuProyectos().toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presuproyectoAnterior =(PresuProyecto) this.presuproyectos.toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presuproyecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presuproyecto);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresuProyectoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresuProyecto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoAnterior =(PresuProyecto) this.presuproyectoLogic.getPresuProyectos().toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presuproyectoAnterior =(PresuProyecto) this.presuproyectos.toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresuProyectoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.presuproyecto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.presuproyecto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presuproyecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presuproyecto);
				
				PresuProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuproyecto,new Object(),this.presuproyectoParameterGeneral,this.presuproyectoReturnGeneral);
							
				
				


				
				PresuProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuproyecto,new Object(),this.presuproyectoParameterGeneral,this.presuproyectoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuProyecto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuProyecto.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresuProyectoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPresuProyecto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presuproyectoAnterior =(PresuProyecto) this.presuproyectoLogic.getPresuProyectos().toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.presuproyectoAnterior =(PresuProyecto) this.presuproyectos.toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
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
			
			PresuProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuproyecto,new Object(),this.presuproyectoParameterGeneral,this.presuproyectoReturnGeneral);
			
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
			
			


			
			PresuProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuproyecto,new Object(),this.presuproyectoParameterGeneral,this.presuproyectoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresuProyectoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.presuproyecto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.presuproyecto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presuproyecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presuproyecto);
				
				PresuProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuproyecto,new Object(),this.presuproyectoParameterGeneral,this.presuproyectoReturnGeneral);
								
				
				


				
				PresuProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuproyecto,new Object(),this.presuproyectoParameterGeneral,this.presuproyectoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuProyecto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuProyecto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresuProyectoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresuProyecto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoAnterior =(PresuProyecto) this.presuproyectoLogic.getPresuProyectos().toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presuproyectoAnterior =(PresuProyecto) this.presuproyectos.toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresuProyectoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.presuproyecto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.presuproyecto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresuProyectoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presuproyecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presuproyecto);
				
				PresuProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presuproyecto,new Object(),this.presuproyectoParameterGeneral,this.presuproyectoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosPresuProyecto")) {
					jCheckBoxSeleccionarTodosPresuProyectoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosPresuProyecto")) {
					jCheckBoxSeleccionadosPresuProyectoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarPresuProyecto")) {
					
				}
				
				


				
				
				PresuProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presuproyecto,new Object(),this.presuproyectoParameterGeneral,this.presuproyectoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuProyecto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuProyecto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.presuproyecto);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.presuproyecto);
				
				PresuProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presuproyecto,new Object(),this.presuproyectoParameterGeneral,this.presuproyectoReturnGeneral);
												
				
				


				
				
				PresuProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presuproyecto,new Object(),this.presuproyectoParameterGeneral,this.presuproyectoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuProyecto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuProyecto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresuProyectoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPresuProyecto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presuproyectoAnterior =(PresuProyecto) this.presuproyectoLogic.getPresuProyectos().toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.presuproyectoAnterior =(PresuProyecto) this.presuproyectos.toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresuProyectoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presuproyecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presuproyecto);
				
				PresuProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presuproyecto,new Object(),this.presuproyectoParameterGeneral,this.presuproyectoReturnGeneral);
				
				
				PresuProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presuproyecto,new Object(),this.presuproyectoParameterGeneral,this.presuproyectoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
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
			
			PresuProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.presuproyecto,new Object(),this.presuproyectoParameterGeneral,this.presuproyectoReturnGeneral);
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
			
			


			
			PresuProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuproyecto,new Object(),this.presuproyectoParameterGeneral,this.presuproyectoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresuProyectoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presuproyecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presuproyecto);
				
				PresuProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.presuproyecto,new Object(),this.presuproyectoParameterGeneral,this.presuproyectoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				PresuProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuproyecto,new Object(),this.presuproyectoParameterGeneral,this.presuproyectoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuProyecto.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuProyecto.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presuproyecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presuproyecto);
				
				PresuProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.presuproyecto,new Object(),this.presuproyectoParameterGeneral,this.presuproyectoReturnGeneral);
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
				
				


				
				PresuProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuproyecto,new Object(),this.presuproyectoParameterGeneral,this.presuproyectoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuProyecto.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuProyecto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresuProyectoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresuProyecto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuproyectoAnterior =(PresuProyecto) this.presuproyectoLogic.getPresuProyectos().toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presuproyectoAnterior =(PresuProyecto) this.presuproyectos.toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				PresuProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuproyecto,new Object(),this.presuproyectoParameterGeneral,this.presuproyectoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarPresuProyecto")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosPresuProyectoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosPresuProyecto.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.presuproyecto =(PresuProyecto) this.presuproyectoLogic.getPresuProyectos().toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.presuproyecto =(PresuProyecto) this.presuproyectos.toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.presuproyecto);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarPresuProyecto")) {
				
				}
				
				PresuProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuproyecto,new Object(),this.presuproyectoParameterGeneral,this.presuproyectoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			PresuProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.presuproyecto,new Object(),this.presuproyectoParameterGeneral,this.presuproyectoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarPresuProyecto")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosPresuProyecto.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarPresuProyecto")) {
			
			}
			
			PresuProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.presuproyecto,new Object(),this.presuproyectoParameterGeneral,this.presuproyectoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessPresuProyecto();
			
			PresuProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presuproyecto,new Object(),this.presuproyectoParameterGeneral,this.presuproyectoReturnGeneral);
			
			if(sTipo.equals("NuevoPresuProyecto")) {
				jButtonNuevoPresuProyectoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarPresuProyecto")) {
				jButtonDuplicarPresuProyectoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarPresuProyecto")) {
				jButtonCopiarPresuProyectoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormPresuProyecto")) {
				jButtonVerFormPresuProyectoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesPresuProyecto")) {
				jButtonNuevoPresuProyectoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarPresuProyecto")) {
				jButtonModificarPresuProyectoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarPresuProyecto")) {
				jButtonActualizarPresuProyectoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarPresuProyecto")) {
				jButtonEliminarPresuProyectoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaPresuProyecto")) {
				jButtonGuardarCambiosPresuProyectoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarPresuProyecto")) {
				jButtonCancelarPresuProyectoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarPresuProyecto")) {
				jButtonCerrarPresuProyectoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosPresuProyecto")) {
				jButtonGuardarCambiosPresuProyectoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosPresuProyecto")) {
				jButtonNuevoGuardarCambiosPresuProyectoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByPresuProyecto")) {
				jButtonAbrirOrderByPresuProyectoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionPresuProyecto")) {
				jButtonRecargarInformacionPresuProyectoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresPresuProyecto")) {
				jButtonAnterioresPresuProyectoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesPresuProyecto")) {
				jButtonSiguientesPresuProyectoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPresuProyectoBusqueda")) {
				this.jButtonidPresuProyectoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPresuProyectoUpdate")) {
				this.jButtonid_empresaPresuProyectoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPresuProyectoBusqueda")) {
				this.jButtonid_empresaPresuProyectoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalPresuProyectoUpdate")) {
				this.jButtonid_sucursalPresuProyectoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalPresuProyectoBusqueda")) {
				this.jButtonid_sucursalPresuProyectoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioPresuProyectoUpdate")) {
				this.jButtonid_ejercicioPresuProyectoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioPresuProyectoBusqueda")) {
				this.jButtonid_ejercicioPresuProyectoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoPresuProyectoBusqueda")) {
				this.jButtoncodigoPresuProyectoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombrePresuProyectoBusqueda")) {
				this.jButtonnombrePresuProyectoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_presu_tipo_proyectoPresuProyectoUpdate")) {
				this.jButtonid_presu_tipo_proyectoPresuProyectoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_presu_tipo_proyectoPresuProyectoBusqueda")) {
				this.jButtonid_presu_tipo_proyectoPresuProyectoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_centro_costoPresuProyectoUpdate")) {
				this.jButtonid_centro_costoPresuProyectoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_centro_costoPresuProyectoBusqueda")) {
				this.jButtonid_centro_costoPresuProyectoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaPresuProyectoBusqueda")) {
				this.jButtonfechaPresuProyectoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorPresuProyectoBusqueda")) {
				this.jButtonvalorPresuProyectoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_presu_estadoPresuProyectoUpdate")) {
				this.jButtonid_presu_estadoPresuProyectoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_presu_estadoPresuProyectoBusqueda")) {
				this.jButtonid_presu_estadoPresuProyectoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionPresuProyectoBusqueda")) {
				this.jButtondescripcionPresuProyectoBusquedaActionPerformed(evt);
			}
			
			PresuProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presuproyecto,new Object(),this.presuproyectoParameterGeneral,this.presuproyectoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessPresuProyecto();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			PresuProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.presuproyecto,new Object(),this.presuproyectoParameterGeneral,this.presuproyectoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFramePresuProyecto")) {
				closingInternalFramePresuProyecto();
				
			} else if(sTipo.equals("jButtonCancelarPresuProyecto")) {
				JInternalFrameBase jInternalFrameDetalleFormPresuProyecto = (JInternalFrameBase)evt.getSource();
	            	
	            PresuProyectoBeanSwingJInternalFrame jInternalFrameParent=(PresuProyectoBeanSwingJInternalFrame)jInternalFrameDetalleFormPresuProyecto.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarPresuProyectoActionPerformed(null);
			}
			
			PresuProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.presuproyecto,new Object(),this.presuproyectoParameterGeneral,this.presuproyectoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormPresuProyecto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormPresuProyecto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormPresuProyecto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.presuproyecto)) {
			if(!esControlTabla) {
				if(PresuProyectoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualPresuProyecto(this.presuproyecto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuProyecto(this.presuproyecto);			
				}
				
				if(this.presuproyectoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualPresuProyecto(this.presuproyecto,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.presuproyectoReturnGeneral=presuproyectoLogic.procesarEventosPresuProyectosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.presuproyectoLogic.getPresuProyectos(),this.presuproyecto,this.presuproyectoParameterGeneral,this.isEsNuevoPresuProyecto,classes);//this.presuproyectoLogic.getPresuProyecto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanPresuProyecto(this.presuproyectoReturnGeneral,this.presuproyectoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.presuproyectoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanPresuProyecto(classes,this.presuproyectoReturnGeneral,this.presuproyectoBean,false);
					}
						
					if(this.presuproyectoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyPresuProyecto(this.presuproyectoReturnGeneral.getPresuProyecto());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioPresuProyecto(this.presuproyectoReturnGeneral.getPresuProyecto());	
					}
						
					if(this.presuproyectoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioPresuProyecto(this.presuproyectoReturnGeneral.getPresuProyecto(),classes);//this.presuproyectoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioPresuProyecto(this.presuproyecto,classes);//this.presuproyectoBean);									
				}
			
				if(PresuProyectoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualPresuProyecto(this.presuproyecto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuProyecto(this.presuproyecto);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.presuproyectoAnterior!=null) {
						this.presuproyecto=this.presuproyectoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.presuproyectoReturnGeneral=presuproyectoLogic.procesarEventosPresuProyectosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.presuproyectoLogic.getPresuProyectos(),this.presuproyecto,this.presuproyectoParameterGeneral,this.isEsNuevoPresuProyecto,classes);//this.presuproyectoLogic.getPresuProyecto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.presuproyectoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.presuproyectoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.presuproyectoReturnGeneral.getPresuProyecto(),presuproyectoLogic.getPresuProyectos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.presuproyectoReturnGeneral.getPresuProyecto(),this.presuproyectos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosPresuProyecto.repaint();
				
				//((AbstractTableModel) this.jTableDatosPresuProyecto.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosPresuProyecto();
			}
		}
	}
	
	public void actualizarVisualTableDatosPresuProyecto() throws Exception {
		
		PresuProyectoModel presuproyectoModel=(PresuProyectoModel)this.jTableDatosPresuProyecto.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			presuproyectoModel.presuproyectos=this.presuproyectoLogic.getPresuProyectos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			presuproyectoModel.presuproyectos=this.presuproyectos;
		}
		
		
		((PresuProyectoModel) this.jTableDatosPresuProyecto.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaPresuProyecto() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getpresuproyectoAnterior(),this.presuproyectoLogic.getPresuProyectos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getpresuproyectoAnterior(),this.presuproyectos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosPresuProyecto();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioPresuProyecto(PresuProyecto presuproyecto,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(PresuTransferencia.class)) {
					this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.presutransferenciaLogic.setPresuTransferencias(presuproyecto.getPresuTransferencias());
					this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.inicializarActualizarBindingTablaPresuTransferencia(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(PresuProyectoCuenta.class)) {
					this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.presuproyectocuentaLogic.setPresuProyectoCuentas(presuproyecto.getPresuProyectoCuentas());
					this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.inicializarActualizarBindingTablaPresuProyectoCuenta(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
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
										
				PresuProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.presuproyecto,new Object(),generalEntityParameterGeneral,this.presuproyectoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.presuproyectoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=PresuProyectoConstantesFunciones.getClassesRelationshipsOfPresuProyecto(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=PresuProyectoConstantesFunciones.getClassesRelationshipsFromStringsOfPresuProyecto(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormPresuProyecto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				PresuProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.presuproyecto,new Object(),generalEntityParameterGeneral,this.presuproyectoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioPresuProyecto(PresuProyectoBean presuproyectoBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(PresuTransferencia.class)) {
					this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.presutransferenciaLogic.setPresuTransferencias(presuproyecto.getPresuTransferencias());
					this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.inicializarActualizarBindingTablaPresuTransferencia(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(PresuProyectoCuenta.class)) {
					this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.presuproyectocuentaLogic.setPresuProyectoCuentas(presuproyecto.getPresuProyectoCuentas());
					this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.inicializarActualizarBindingTablaPresuProyectoCuenta(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanPresuProyecto(ArrayList<Classe> classes,PresuProyectoReturnGeneral presuproyectoReturnGeneral,PresuProyectoBean presuproyectoBean,Boolean conDefault) throws Exception {
		
			this.presuproyectoBean.setPresuTransferencias(presuproyectoReturnGeneral.getPresuProyecto().getPresuTransferencias());
			this.presuproyectoBean.setPresuProyectoCuentas(presuproyectoReturnGeneral.getPresuProyecto().getPresuProyectoCuentas());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualPresuProyecto(PresuProyecto presuproyecto,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(PresuTransferencia.class)) {
					presuproyecto.setPresuTransferencias(this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaBeanSwingJInternalFrame.presutransferenciaLogic.getPresuTransferencias());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(PresuProyectoCuenta.class)) {
					presuproyecto.setPresuProyectoCuentas(this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaBeanSwingJInternalFrame.presuproyectocuentaLogic.getPresuProyectoCuentas());
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
		if(!paraTabla && !this.permiteMantenimiento(this.presuproyecto)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormPresuProyecto = new PresuProyectoDetalleFormJInternalFrame(jDesktopPane,this.presuproyectoSessionBean.getConGuardarRelaciones(),this.presuproyectoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormPresuProyecto);
		this.jInternalFrameDetalleFormPresuProyecto.setVisible(false);
		this.jInternalFrameDetalleFormPresuProyecto.setSelected(false);						
		
		this.jInternalFrameDetalleFormPresuProyecto.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormPresuProyecto.presuproyectoLogic=this.presuproyectoLogic;
		
		this.cargarCombosFrameForeignKeyPresuProyecto("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetallePresuProyecto();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePresuProyecto();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyPresuProyecto("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyPresuProyecto();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormPresuProyecto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPresuProyecto"));
		
		this.jInternalFrameDetalleFormPresuProyecto.jButtonModificarPresuProyecto.addActionListener(new ButtonActionListener(this,"ModificarPresuProyecto"));

		
		this.jInternalFrameDetalleFormPresuProyecto.jButtonModificarToolBarPresuProyecto.addActionListener(new ButtonActionListener(this,"ModificarToolBarPresuProyecto"));
					
		this.jInternalFrameDetalleFormPresuProyecto.jMenuItemModificarPresuProyecto.addActionListener(new ButtonActionListener(this,"MenuItemModificarPresuProyecto"));		
		
		
		
		this.jInternalFrameDetalleFormPresuProyecto.jButtonActualizarPresuProyecto.addActionListener (new ButtonActionListener(this,"ActualizarPresuProyecto"));
		
		
		this.jInternalFrameDetalleFormPresuProyecto.jButtonActualizarToolBarPresuProyecto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPresuProyecto"));
						
		this.jInternalFrameDetalleFormPresuProyecto.jMenuItemActualizarPresuProyecto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPresuProyecto"));		
		
		
		
		this.jInternalFrameDetalleFormPresuProyecto.jButtonEliminarPresuProyecto.addActionListener (new ButtonActionListener(this,"EliminarPresuProyecto"));
		
		
		this.jInternalFrameDetalleFormPresuProyecto.jButtonEliminarToolBarPresuProyecto.addActionListener (new ButtonActionListener(this,"EliminarToolBarPresuProyecto"));
								
		this.jInternalFrameDetalleFormPresuProyecto.jMenuItemEliminarPresuProyecto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPresuProyecto"));		
		
		
		
		this.jInternalFrameDetalleFormPresuProyecto.jButtonCancelarPresuProyecto.addActionListener (new ButtonActionListener(this,"CancelarPresuProyecto"));
		
		
		this.jInternalFrameDetalleFormPresuProyecto.jButtonCancelarToolBarPresuProyecto.addActionListener (new ButtonActionListener(this,"CancelarToolBarPresuProyecto"));
					
		this.jInternalFrameDetalleFormPresuProyecto.jMenuItemCancelarPresuProyecto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPresuProyecto"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormPresuProyecto.jMenuItemDetalleCerrarPresuProyecto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPresuProyecto"));		
		
		
		
		this.jInternalFrameDetalleFormPresuProyecto.jButtonGuardarCambiosToolBarPresuProyecto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPresuProyecto"));
		
		
		
		this.jInternalFrameDetalleFormPresuProyecto.jButtonGuardarCambiosToolBarPresuProyecto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPresuProyecto"));
		
		
		
		this.jInternalFrameDetalleFormPresuProyecto.jComboBoxTiposAccionesFormularioPresuProyecto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPresuProyecto"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyecto.jButtonidPresuProyectoBusqueda.addActionListener(new ButtonActionListener(this,"idPresuProyectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuProyecto.jButtonid_empresaPresuProyectoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPresuProyectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyecto.jButtonid_empresaPresuProyectoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPresuProyectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuProyecto.jButtonid_sucursalPresuProyectoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalPresuProyectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyecto.jButtonid_sucursalPresuProyectoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalPresuProyectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuProyecto.jButtonid_ejercicioPresuProyectoUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioPresuProyectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyecto.jButtonid_ejercicioPresuProyectoBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioPresuProyectoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyecto.jButtoncodigoPresuProyectoBusqueda.addActionListener(new ButtonActionListener(this,"codigoPresuProyectoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyecto.jButtonnombrePresuProyectoBusqueda.addActionListener(new ButtonActionListener(this,"nombrePresuProyectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuProyecto.jButtonid_presu_tipo_proyectoPresuProyectoUpdate.addActionListener(new ButtonActionListener(this,"id_presu_tipo_proyectoPresuProyectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyecto.jButtonid_presu_tipo_proyectoPresuProyectoBusqueda.addActionListener(new ButtonActionListener(this,"id_presu_tipo_proyectoPresuProyectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuProyecto.jButtonid_centro_costoPresuProyectoUpdate.addActionListener(new ButtonActionListener(this,"id_centro_costoPresuProyectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyecto.jButtonid_centro_costoPresuProyectoBusqueda.addActionListener(new ButtonActionListener(this,"id_centro_costoPresuProyectoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyecto.jButtonfechaPresuProyectoBusqueda.addActionListener(new ButtonActionListener(this,"fechaPresuProyectoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyecto.jButtonvalorPresuProyectoBusqueda.addActionListener(new ButtonActionListener(this,"valorPresuProyectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuProyecto.jButtonid_presu_estadoPresuProyectoUpdate.addActionListener(new ButtonActionListener(this,"id_presu_estadoPresuProyectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyecto.jButtonid_presu_estadoPresuProyectoBusqueda.addActionListener(new ButtonActionListener(this,"id_presu_estadoPresuProyectoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyecto.jButtondescripcionPresuProyectoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionPresuProyectoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormPresuProyecto.jTabbedPaneRelacionesPresuProyecto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPresuProyecto"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFramePresuProyecto"));
		
		if(this.jInternalFrameDetalleFormPresuProyecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuProyecto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPresuProyecto"));
		}
		
		this.jTableDatosPresuProyecto.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarPresuProyecto"));
		
		this.jTableDatosPresuProyecto.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarPresuProyecto"));
		
		this.jButtonNuevoPresuProyecto.addActionListener(new ButtonActionListener(this,"NuevoPresuProyecto"));
		
		this.jButtonDuplicarPresuProyecto.addActionListener(new ButtonActionListener(this,"DuplicarPresuProyecto"));
		
		this.jButtonCopiarPresuProyecto.addActionListener(new ButtonActionListener(this,"CopiarPresuProyecto"));
		
		this.jButtonVerFormPresuProyecto.addActionListener(new ButtonActionListener(this,"VerFormPresuProyecto"));
		
		
		this.jButtonNuevoToolBarPresuProyecto.addActionListener(new ButtonActionListener(this,"NuevoToolBarPresuProyecto"));
			
		this.jButtonDuplicarToolBarPresuProyecto.addActionListener(new ButtonActionListener(this,"DuplicarToolBarPresuProyecto"));
			
		this.jMenuItemNuevoPresuProyecto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoPresuProyecto"));
			
		this.jMenuItemDuplicarPresuProyecto.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarPresuProyecto"));		
		
		
		this.jButtonNuevoRelacionesPresuProyecto.addActionListener (new ButtonActionListener(this,"NuevoRelacionesPresuProyecto"));
		
		
		this.jButtonNuevoRelacionesToolBarPresuProyecto.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarPresuProyecto"));
			
		this.jMenuItemNuevoRelacionesPresuProyecto.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesPresuProyecto"));		
		
		
		if(this.jInternalFrameDetalleFormPresuProyecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuProyecto.jButtonModificarPresuProyecto.addActionListener(new ButtonActionListener(this,"ModificarPresuProyecto"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresuProyecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuProyecto.jButtonModificarToolBarPresuProyecto.addActionListener(new ButtonActionListener(this,"ModificarToolBarPresuProyecto"));
			
			this.jInternalFrameDetalleFormPresuProyecto.jMenuItemModificarPresuProyecto.addActionListener(new ButtonActionListener(this,"MenuItemModificarPresuProyecto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPresuProyecto!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormPresuProyecto.jButtonActualizarPresuProyecto.addActionListener (new ButtonActionListener(this,"ActualizarPresuProyecto"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresuProyecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuProyecto.jButtonActualizarToolBarPresuProyecto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPresuProyecto"));
				
			this.jInternalFrameDetalleFormPresuProyecto.jMenuItemActualizarPresuProyecto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPresuProyecto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPresuProyecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuProyecto.jButtonEliminarPresuProyecto.addActionListener (new ButtonActionListener(this,"EliminarPresuProyecto"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresuProyecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuProyecto.jButtonEliminarToolBarPresuProyecto.addActionListener (new ButtonActionListener(this,"EliminarToolBarPresuProyecto"));
						
			this.jInternalFrameDetalleFormPresuProyecto.jMenuItemEliminarPresuProyecto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPresuProyecto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPresuProyecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuProyecto.jButtonCancelarPresuProyecto.addActionListener (new ButtonActionListener(this,"CancelarPresuProyecto"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresuProyecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuProyecto.jButtonCancelarToolBarPresuProyecto.addActionListener (new ButtonActionListener(this,"CancelarToolBarPresuProyecto"));
			
			this.jInternalFrameDetalleFormPresuProyecto.jMenuItemCancelarPresuProyecto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPresuProyecto"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarPresuProyecto.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarPresuProyecto"));		
		
		
		this.jButtonCerrarPresuProyecto.addActionListener (new ButtonActionListener(this,"CerrarPresuProyecto"));
		
		
		this.jButtonCerrarToolBarPresuProyecto.addActionListener (new ButtonActionListener(this,"CerrarToolBarPresuProyecto"));
			
		this.jMenuItemCerrarPresuProyecto.addActionListener (new ButtonActionListener(this,"MenuItemCerrarPresuProyecto"));
			
		if(this.jInternalFrameDetalleFormPresuProyecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuProyecto.jMenuItemDetalleCerrarPresuProyecto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPresuProyecto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPresuProyecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuProyecto.jButtonGuardarCambiosPresuProyecto.addActionListener (new ButtonActionListener(this,"GuardarCambiosPresuProyecto"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresuProyecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuProyecto.jButtonGuardarCambiosToolBarPresuProyecto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPresuProyecto"));
		}
		
		this.jButtonCopiarToolBarPresuProyecto.addActionListener (new ButtonActionListener(this,"CopiarToolBarPresuProyecto"));
			
		this.jButtonVerFormToolBarPresuProyecto.addActionListener (new ButtonActionListener(this,"VerFormToolBarPresuProyecto"));
		
		this.jMenuItemGuardarCambiosPresuProyecto.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosPresuProyecto"));
			
		this.jMenuItemCopiarPresuProyecto.addActionListener (new ButtonActionListener(this,"MenuItemCopiarPresuProyecto"));		
		
		this.jMenuItemVerFormPresuProyecto.addActionListener (new ButtonActionListener(this,"MenuItemVerFormPresuProyecto"));		
		
		
		this.jButtonGuardarCambiosTablaPresuProyecto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPresuProyecto"));
		
		
		this.jButtonGuardarCambiosTablaToolBarPresuProyecto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarPresuProyecto"));
			
		this.jMenuItemGuardarCambiosTablaPresuProyecto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPresuProyecto"));		
		
		
		
		this.jButtonRecargarInformacionPresuProyecto.addActionListener (new ButtonActionListener(this,"RecargarInformacionPresuProyecto"));
					
		this.jButtonRecargarInformacionToolBarPresuProyecto.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarPresuProyecto"));
		
		this.jMenuItemRecargarInformacionPresuProyecto.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionPresuProyecto"));		
		
		
		
		this.jButtonAnterioresPresuProyecto.addActionListener (new ButtonActionListener(this,"AnterioresPresuProyecto"));
		
		
		this.jButtonAnterioresToolBarPresuProyecto.addActionListener (new ButtonActionListener(this,"AnterioresToolBarPresuProyecto"));
		
		this.jMenuItemAnterioresPresuProyecto.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresPresuProyecto"));		
		
		
		this.jButtonSiguientesPresuProyecto.addActionListener (new ButtonActionListener(this,"SiguientesPresuProyecto"));
		
		
		this.jButtonSiguientesToolBarPresuProyecto.addActionListener (new ButtonActionListener(this,"SiguientesToolBarPresuProyecto"));
			
		this.jMenuItemSiguientesPresuProyecto.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesPresuProyecto"));
			
		this.jMenuItemAbrirOrderByPresuProyecto.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByPresuProyecto"));
			
		this.jMenuItemMostrarOcultarPresuProyecto.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarPresuProyecto"));
			
		this.jMenuItemDetalleAbrirOrderByPresuProyecto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByPresuProyecto"));
			
		this.jMenuItemDetalleMostarOcultarPresuProyecto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarPresuProyecto"));		
		
		
		this.jButtonNuevoGuardarCambiosPresuProyecto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosPresuProyecto"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarPresuProyecto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarPresuProyecto"));
			
		this.jMenuItemNuevoGuardarCambiosPresuProyecto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosPresuProyecto"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosPresuProyecto.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosPresuProyecto"));

		this.jCheckBoxSeleccionadosPresuProyecto.addItemListener(new CheckBoxItemListener(this,"SeleccionadosPresuProyecto"));
		
		if(this.jInternalFrameDetalleFormPresuProyecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuProyecto.jComboBoxTiposAccionesFormularioPresuProyecto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPresuProyecto"));
		}
		
		
		this.jComboBoxTiposRelacionesPresuProyecto.addActionListener (new ButtonActionListener(this,"TiposRelacionesPresuProyecto"));
			
		this.jComboBoxTiposAccionesPresuProyecto.addActionListener (new ButtonActionListener(this,"TiposAccionesPresuProyecto"));
					
		this.jComboBoxTiposSeleccionarPresuProyecto.addActionListener (new ButtonActionListener(this,"TiposSeleccionarPresuProyecto"));
			
		this.jTextFieldValorCampoGeneralPresuProyecto.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralPresuProyecto"));		
		
		
		if(this.jInternalFrameDetalleFormPresuProyecto!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyecto.jButtonidPresuProyectoBusqueda.addActionListener(new ButtonActionListener(this,"idPresuProyectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuProyecto.jButtonid_empresaPresuProyectoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPresuProyectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyecto.jButtonid_empresaPresuProyectoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPresuProyectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuProyecto.jButtonid_sucursalPresuProyectoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalPresuProyectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyecto.jButtonid_sucursalPresuProyectoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalPresuProyectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuProyecto.jButtonid_ejercicioPresuProyectoUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioPresuProyectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyecto.jButtonid_ejercicioPresuProyectoBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioPresuProyectoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyecto.jButtoncodigoPresuProyectoBusqueda.addActionListener(new ButtonActionListener(this,"codigoPresuProyectoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyecto.jButtonnombrePresuProyectoBusqueda.addActionListener(new ButtonActionListener(this,"nombrePresuProyectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuProyecto.jButtonid_presu_tipo_proyectoPresuProyectoUpdate.addActionListener(new ButtonActionListener(this,"id_presu_tipo_proyectoPresuProyectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyecto.jButtonid_presu_tipo_proyectoPresuProyectoBusqueda.addActionListener(new ButtonActionListener(this,"id_presu_tipo_proyectoPresuProyectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuProyecto.jButtonid_centro_costoPresuProyectoUpdate.addActionListener(new ButtonActionListener(this,"id_centro_costoPresuProyectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyecto.jButtonid_centro_costoPresuProyectoBusqueda.addActionListener(new ButtonActionListener(this,"id_centro_costoPresuProyectoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyecto.jButtonfechaPresuProyectoBusqueda.addActionListener(new ButtonActionListener(this,"fechaPresuProyectoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyecto.jButtonvalorPresuProyectoBusqueda.addActionListener(new ButtonActionListener(this,"valorPresuProyectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuProyecto.jButtonid_presu_estadoPresuProyectoUpdate.addActionListener(new ButtonActionListener(this,"id_presu_estadoPresuProyectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyecto.jButtonid_presu_estadoPresuProyectoBusqueda.addActionListener(new ButtonActionListener(this,"id_presu_estadoPresuProyectoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyecto.jButtondescripcionPresuProyectoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionPresuProyectoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoPresuProyecto.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoPresuProyecto"));

			this.jButtonBusquedaPorNombrePresuProyecto.addActionListener(new ButtonActionListener(this,"BusquedaPorNombrePresuProyecto"));

			this.jButtonFK_IdEjercicioPresuProyecto.addActionListener(new ButtonActionListener(this,"FK_IdEjercicioPresuProyecto"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoPresuProyecto!=null) {
				this.jInternalFrameReporteDinamicoPresuProyecto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPresuProyecto"));
				this.jInternalFrameReporteDinamicoPresuProyecto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPresuProyecto"));
				this.jInternalFrameReporteDinamicoPresuProyecto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPresuProyecto"));
			}
			
			//this.jButtonCerrarReporteDinamicoPresuProyecto.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPresuProyecto"));				
			//this.jButtonGenerarReporteDinamicoPresuProyecto.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPresuProyecto"));
			//this.jButtonGenerarExcelReporteDinamicoPresuProyecto.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPresuProyecto"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionPresuProyecto!=null) {
				this.jInternalFrameImportacionPresuProyecto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPresuProyecto"));
				this.jInternalFrameImportacionPresuProyecto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPresuProyecto"));
				this.jInternalFrameImportacionPresuProyecto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPresuProyecto"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByPresuProyecto.addActionListener (new ButtonActionListener(this,"AbrirOrderByPresuProyecto"));
			
			this.jButtonAbrirOrderByToolBarPresuProyecto.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarPresuProyecto"));			
			
			if(this.jInternalFrameOrderByPresuProyecto!=null) {
				this.jInternalFrameOrderByPresuProyecto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPresuProyecto"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormPresuProyecto!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormPresuProyecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuProyecto.jTabbedPaneRelacionesPresuProyecto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPresuProyecto"));
		
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
            		closingInternalFramePresuProyecto();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormPresuProyecto.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormPresuProyecto = (JInternalFrameBase)event.getSource();
	            	
	            PresuProyectoBeanSwingJInternalFrame jInternalFrameParent=(PresuProyectoBeanSwingJInternalFrame)jInternalFrameDetalleFormPresuProyecto.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarPresuProyectoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosPresuProyecto.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosPresuProyectoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosPresuProyecto.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosPresuProyecto.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoPresuProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresuProyectoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarPresuProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresuProyectoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoPresuProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresuProyectoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoPresuProyecto";
		inputMap = this.jButtonNuevoPresuProyecto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoPresuProyecto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPresuProyectoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesPresuProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresuProyectoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarPresuProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresuProyectoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesPresuProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresuProyectoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesPresuProyecto";
		inputMap = this.jButtonNuevoRelacionesPresuProyecto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesPresuProyecto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPresuProyectoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarPresuProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPresuProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarPresuProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPresuProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarPresuProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPresuProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarPresuProyecto";
		inputMap = this.jButtonModificarPresuProyecto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarPresuProyecto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarPresuProyectoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarPresuProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPresuProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarPresuProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPresuProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarPresuProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPresuProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarPresuProyecto";
		inputMap = this.jButtonActualizarPresuProyecto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarPresuProyecto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarPresuProyectoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarPresuProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPresuProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarPresuProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPresuProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarPresuProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPresuProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarPresuProyecto";
		inputMap = this.jButtonEliminarPresuProyecto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarPresuProyecto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarPresuProyectoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarPresuProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPresuProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarPresuProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPresuProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarPresuProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPresuProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarPresuProyecto";
		inputMap = this.jButtonCancelarPresuProyecto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarPresuProyecto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarPresuProyectoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarPresuProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPresuProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarPresuProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPresuProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarPresuProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPresuProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarPresuProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarPresuProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarPresuProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarPresuProyecto";
		inputMap = this.jButtonCerrarPresuProyecto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarPresuProyecto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarPresuProyectoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormPresuProyecto.jButtonGuardarCambiosPresuProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresuProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarPresuProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresuProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosPresuProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresuProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaPresuProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresuProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarPresuProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresuProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaPresuProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresuProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosPresuProyecto";
		inputMap = this.jInternalFrameDetalleFormPresuProyecto.jButtonGuardarCambiosPresuProyecto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormPresuProyecto.jButtonGuardarCambiosPresuProyecto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosPresuProyectoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionPresuProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPresuProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarPresuProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPresuProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionPresuProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPresuProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresPresuProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPresuProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarPresuProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPresuProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresPresuProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPresuProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesPresuProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPresuProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarPresuProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPresuProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesPresuProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPresuProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosPresuProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPresuProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarPresuProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPresuProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosPresuProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPresuProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosPresuProyecto.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosPresuProyectoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesPresuProyecto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesPresuProyectoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarPresuProyecto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarPresuProyectoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralPresuProyecto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralPresuProyectoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyecto.jButtonidPresuProyectoBusqueda.addActionListener(new ButtonActionListener(this,"idPresuProyectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuProyecto.jButtonid_empresaPresuProyectoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPresuProyectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyecto.jButtonid_empresaPresuProyectoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPresuProyectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuProyecto.jButtonid_sucursalPresuProyectoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalPresuProyectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyecto.jButtonid_sucursalPresuProyectoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalPresuProyectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuProyecto.jButtonid_ejercicioPresuProyectoUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioPresuProyectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyecto.jButtonid_ejercicioPresuProyectoBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioPresuProyectoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyecto.jButtoncodigoPresuProyectoBusqueda.addActionListener(new ButtonActionListener(this,"codigoPresuProyectoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyecto.jButtonnombrePresuProyectoBusqueda.addActionListener(new ButtonActionListener(this,"nombrePresuProyectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuProyecto.jButtonid_presu_tipo_proyectoPresuProyectoUpdate.addActionListener(new ButtonActionListener(this,"id_presu_tipo_proyectoPresuProyectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyecto.jButtonid_presu_tipo_proyectoPresuProyectoBusqueda.addActionListener(new ButtonActionListener(this,"id_presu_tipo_proyectoPresuProyectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuProyecto.jButtonid_centro_costoPresuProyectoUpdate.addActionListener(new ButtonActionListener(this,"id_centro_costoPresuProyectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyecto.jButtonid_centro_costoPresuProyectoBusqueda.addActionListener(new ButtonActionListener(this,"id_centro_costoPresuProyectoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyecto.jButtonfechaPresuProyectoBusqueda.addActionListener(new ButtonActionListener(this,"fechaPresuProyectoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyecto.jButtonvalorPresuProyectoBusqueda.addActionListener(new ButtonActionListener(this,"valorPresuProyectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuProyecto.jButtonid_presu_estadoPresuProyectoUpdate.addActionListener(new ButtonActionListener(this,"id_presu_estadoPresuProyectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyecto.jButtonid_presu_estadoPresuProyectoBusqueda.addActionListener(new ButtonActionListener(this,"id_presu_estadoPresuProyectoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuProyecto.jButtondescripcionPresuProyectoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionPresuProyectoBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoPresuProyecto.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoPresuProyecto"));

		this.jButtonBusquedaPorNombrePresuProyecto.addActionListener(new ButtonActionListener(this,"BusquedaPorNombrePresuProyecto"));

		this.jButtonFK_IdEjercicioPresuProyecto.addActionListener(new ButtonActionListener(this,"FK_IdEjercicioPresuProyecto"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoPresuProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoPresuProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoPresuProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoPresuProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoPresuProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoPresuProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionPresuProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionPresuProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionPresuProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionPresuProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionPresuProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionPresuProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarPresuProyectoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarPresuProyecto.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosPresuProyecto(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(PresuProyecto presuproyectoAux:this.presuproyectoLogic.getPresuProyectos()) {
					presuproyectoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PresuProyecto presuproyectoAux:presuproyectos) {
					presuproyectoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosPresuProyectoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPresuProyecto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PresuProyecto presuproyectoAux:this.presuproyectoLogic.getPresuProyectos()) {
						presuproyectoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PresuProyecto presuproyectoAux:presuproyectos) {
						presuproyectoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(PresuProyecto presuproyectoAux:this.presuproyectoLogic.getPresuProyectos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PresuProyecto presuproyectoAux:presuproyectos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaPresuProyecto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPresuProyecto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPresuProyecto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPresuProyecto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosPresuProyectoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPresuProyecto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosPresuProyecto.getSelectedRows();
			
			PresuProyecto presuproyectoLocal=new PresuProyecto();
			
			//this.seleccionarTodosPresuProyecto(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presuproyectoLocal =(PresuProyecto) this.presuproyectoLogic.getPresuProyectos().toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					presuproyectoLocal =(PresuProyecto) this.presuproyectos.toArray()[this.jTableDatosPresuProyecto.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				presuproyectoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PresuProyecto presuproyectoAux:this.presuproyectoLogic.getPresuProyectos()) {
						presuproyectoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PresuProyecto presuproyectoAux:presuproyectos) {
						presuproyectoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaPresuProyecto(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPresuProyecto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPresuProyecto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPresuProyecto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualPresuProyectoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarPresuProyectoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralPresuProyectoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingPresuProyecto(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralPresuProyecto.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PresuProyecto presuproyectoAux:this.presuproyectoLogic.getPresuProyectos()) {
				
						if(sTipoSeleccionar.equals(PresuProyectoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							presuproyectoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PresuProyectoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							presuproyectoAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PresuProyectoConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							presuproyectoAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresuProyectoConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							presuproyectoAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresuProyectoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							presuproyectoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PresuProyecto presuproyectoAux:presuproyectos) {
					
						if(sTipoSeleccionar.equals(PresuProyectoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							presuproyectoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PresuProyectoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							presuproyectoAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PresuProyectoConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							presuproyectoAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresuProyectoConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							presuproyectoAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresuProyectoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							presuproyectoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaPresuProyecto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesPresuProyectoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingPresuProyecto(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioPresuProyecto=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesPresuProyecto.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormPresuProyecto.jComboBoxTiposAccionesFormularioPresuProyecto.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReportePresuProyecto) {				
					conSplash=true;//false;										
					
					//this.startProcessPresuProyecto(conSplash);
				
					this.generarReportePresuProyectosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPresuProyecto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPresuProyecto.jComboBoxTiposAccionesFormularioPresuProyecto.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoPresuProyectosSeleccionados();
				//this.jComboBoxTiposAccionesPresuProyecto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPresuProyectosSeleccionados(false);
				//this.jComboBoxTiposAccionesPresuProyecto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPresuProyectosSeleccionados(true);
				//this.jComboBoxTiposAccionesPresuProyecto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPresuProyecto();
				
				this.exportarPresuProyectosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPresuProyecto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPresuProyecto.jComboBoxTiposAccionesFormularioPresuProyecto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionPresuProyectos();
				//this.importarPresuProyectos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPresuProyecto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPresuProyecto.jComboBoxTiposAccionesFormularioPresuProyecto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPresuProyecto();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelPresuProyectosSeleccionados();
				//this.jComboBoxTiposAccionesPresuProyecto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Proyecto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessPresuProyecto();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoPresuProyecto)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyPresuProyecto(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Proyecto",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPresuProyecto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPresuProyecto.jComboBoxTiposAccionesFormularioPresuProyecto.setSelectedIndex(0);					
				}	
			} 			
			else if(PresuProyectoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReportePresuProyecto) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessPresuProyecto(conSplash);
					
						//this.actualizarParametrosGeneralPresuProyecto();
						
						this.generarReporteProcesoAccionPresuProyectosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesPresuProyecto.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormPresuProyecto.jComboBoxTiposAccionesFormularioPresuProyecto.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(PresuProyectoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO ProyectoES SELECCIONADOS?", "MANTENIMIENTO DE Proyecto", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessPresuProyecto();
				
						this.actualizarParametrosGeneralPresuProyecto();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.presuproyectoReturnGeneral=presuproyectoLogic.procesarAccionPresuProyectosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.presuproyectoLogic.getPresuProyectos(),this.presuproyectoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarPresuProyectoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPresuProyecto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPresuProyecto.jComboBoxTiposAccionesFormularioPresuProyecto.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralPresuProyecto();
					
					PresuProyectoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarPresuProyectoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPresuProyecto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPresuProyecto.jComboBoxTiposAccionesFormularioPresuProyecto.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessPresuProyecto(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesPresuProyectoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessPresuProyecto();
			
			if(this.jInternalFrameDetalleFormPresuProyecto==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<PresuProyecto> presuproyectosSeleccionados=new ArrayList<PresuProyecto>();		
			PresuProyecto presuproyecto=new PresuProyecto();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingPresuProyecto(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesPresuProyecto.getSelectedItem();
			
			
			
			
			presuproyectosSeleccionados=this.getPresuProyectosSeleccionados(true);
			//this.sTipoAccion;
			
			if(presuproyectosSeleccionados.size()==1) {
				for(PresuProyecto presuproyectoAux:presuproyectosSeleccionados) {
					presuproyecto=presuproyectoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Transferencia")) {
					jButtonPresuTransferenciaActionPerformed(null,rowIndex,true,false,presuproyecto);
				}
				else if(this.sTipoRelacion.equals("Cuenta Contable Proyecto")) {
					jButtonPresuProyectoCuentaActionPerformed(null,rowIndex,true,false,presuproyecto);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessPresuProyecto();
			
      		//this.finishProcessPresuProyecto(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarPresuProyectoReturnGeneral() throws Exception {
		if(this.presuproyectoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.presuproyectoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.presuproyectoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.presuproyectoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.presuproyectoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.presuproyectoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingPresuProyecto(false);
		}
		
		if(this.presuproyectoReturnGeneral.getConRetornoLista() || this.presuproyectoReturnGeneral.getConRetornoObjeto()) {
			if(this.presuproyectoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.presuproyectoLogic.setPresuProyectos(this.presuproyectoReturnGeneral.getPresuProyectos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.presuproyectoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.presuproyectoLogic.setPresuProyecto(this.presuproyectoReturnGeneral.getPresuProyecto());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingPresuProyecto(false);
		}
	}
	
	public void actualizarParametrosGeneralPresuProyecto() throws Exception {
		
		
	}
	
	public ArrayList<PresuProyecto> getPresuProyectosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<PresuProyecto> presuproyectosSeleccionados=new ArrayList<PresuProyecto>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioPresuProyecto) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(PresuProyecto presuproyectoAux:presuproyectoLogic.getPresuProyectos()) {
					if(presuproyectoAux.getIsSelected()) {
						presuproyectosSeleccionados.add(presuproyectoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PresuProyecto presuproyectoAux:this.presuproyectos) {
					if(presuproyectoAux.getIsSelected()) {
						presuproyectosSeleccionados.add(presuproyectoAux);				
					}
				}
			}
			
			if(presuproyectosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						presuproyectosSeleccionados.addAll(this.presuproyectoLogic.getPresuProyectos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						presuproyectosSeleccionados.addAll(this.presuproyectos);				
					}
				}
			}
		} else {
			presuproyectosSeleccionados.add(this.presuproyecto);
		}
		
		return presuproyectosSeleccionados;
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
	
	public void generarReportePresuProyectosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalPresuProyectosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoPresuProyectosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPresuProyectosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPresuProyectosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesPresuProyectosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Proyecto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesPresuProyectosSeleccionados() throws Exception {
		ArrayList<PresuProyecto> presuproyectosSeleccionados=new ArrayList<PresuProyecto>();		
		
		presuproyectosSeleccionados=this.getPresuProyectosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReportePresuProyectos("Todos",presuproyectosSeleccionados);
		
	}	
	
	public void generarReporteNormalPresuProyectosSeleccionados() throws Exception {
		ArrayList<PresuProyecto> presuproyectosSeleccionados=new ArrayList<PresuProyecto>();		
		
		presuproyectosSeleccionados=this.getPresuProyectosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReportePresuProyectos("Todos",presuproyectosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionPresuProyectosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<PresuProyecto> presuproyectosSeleccionados=new ArrayList<PresuProyecto>();
		
		presuproyectosSeleccionados=this.getPresuProyectosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReportePresuProyectos("Todos",presuproyectosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoPresuProyectosSeleccionados() throws Exception {
		ArrayList<PresuProyecto> presuproyectosSeleccionados=new ArrayList<PresuProyecto>();		
		
		
		this.abrirInicializarFrameReporteDinamicoPresuProyecto();
		
		
		presuproyectosSeleccionados=this.getPresuProyectosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoPresuProyecto();
		
		
		//this.generarReportePresuProyectos("Todos",presuproyectosSeleccionados ,presuproyectoImplementable,presuproyectoImplementableHome);
	}
	
	public void mostrarImportacionPresuProyectos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionPresuProyecto();
		
		this.abrirFrameImportacionPresuProyecto();		
		
			
		//this.generarReportePresuProyectos("Todos",presuproyectosSeleccionados ,presuproyectoImplementable,presuproyectoImplementableHome);
	}
	
	public void importarPresuProyectos() throws Exception {		
	
	}
	
	public void exportarPresuProyectosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelPresuProyectosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoPresuProyectosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlPresuProyectosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Proyecto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoPresuProyectosSeleccionados() throws Exception {
		ArrayList<PresuProyecto> presuproyectosSeleccionados=new ArrayList<PresuProyecto>();		
		
		presuproyectosSeleccionados=this.getPresuProyectosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presuproyecto."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarPresuProyecto(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(PresuProyecto presuproyectoAux:presuproyectosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarPresuProyecto(presuproyectoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//presuproyectoAux.setsDetalleGeneralEntityReporte(presuproyectoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presuproyectoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proyecto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarPresuProyecto(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=PresuProyectoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresuProyectoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresuProyectoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresuProyectoConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresuProyectoConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresuProyectoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresuProyectoConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresuProyectoConstantesFunciones.LABEL_IDPRESUTIPOPROYECTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresuProyectoConstantesFunciones.LABEL_IDCENTROCOSTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresuProyectoConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresuProyectoConstantesFunciones.LABEL_VALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresuProyectoConstantesFunciones.LABEL_IDPRESUESTADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresuProyectoConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarPresuProyecto(PresuProyecto presuproyecto,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=presuproyecto.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=presuproyecto.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=presuproyecto.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presuproyecto.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presuproyecto.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presuproyecto.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presuproyecto.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presuproyecto.getpresutipoproyecto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presuproyecto.getcentrocosto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presuproyecto.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presuproyecto.getvalor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presuproyecto.getpresuestado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presuproyecto.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelPresuProyectosSeleccionados() throws Exception {
		ArrayList<PresuProyecto> presuproyectosSeleccionados=new ArrayList<PresuProyecto>();		
		
		presuproyectosSeleccionados=this.getPresuProyectosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presuproyecto.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("PresuProyectos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelPresuProyecto(row);				
				iRow++;
			}				
			
			for(PresuProyecto presuproyectoAux:presuproyectosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelPresuProyecto(presuproyectoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presuproyectoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proyecto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlPresuProyectosSeleccionados() throws Exception {
		ArrayList<PresuProyecto> presuproyectosSeleccionados=new ArrayList<PresuProyecto>();		
		
		presuproyectosSeleccionados=this.getPresuProyectosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presuproyecto.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("presuproyectos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("presuproyecto");
			//elementRoot.appendChild(element);
		
			for(PresuProyecto presuproyectoAux:presuproyectosSeleccionados) {
				element = document.createElement("presuproyecto");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlPresuProyecto(presuproyectoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presuproyectoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proyecto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelPresuProyecto(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(PresuProyectoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(PresuProyectoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(PresuProyectoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(PresuProyectoConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(PresuProyectoConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(PresuProyectoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(PresuProyectoConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(PresuProyectoConstantesFunciones.LABEL_IDPRESUTIPOPROYECTO);
		cell = row.createCell(iColumn++);cell.setCellValue(PresuProyectoConstantesFunciones.LABEL_IDCENTROCOSTO);
		cell = row.createCell(iColumn++);cell.setCellValue(PresuProyectoConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(PresuProyectoConstantesFunciones.LABEL_VALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(PresuProyectoConstantesFunciones.LABEL_IDPRESUESTADO);
		cell = row.createCell(iColumn++);cell.setCellValue(PresuProyectoConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelPresuProyecto(PresuProyecto presuproyecto,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(presuproyecto.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(presuproyecto.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(presuproyecto.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(presuproyecto.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(presuproyecto.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(presuproyecto.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(presuproyecto.getpresutipoproyecto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(presuproyecto.getcentrocosto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(presuproyecto.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(presuproyecto.getvalor());
		cell = row.createCell(iColumn++);cell.setCellValue(presuproyecto.getpresuestado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(presuproyecto.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlPresuProyecto(PresuProyecto presuproyecto,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(PresuProyectoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(presuproyecto.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(PresuProyectoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(presuproyecto.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(PresuProyectoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(presuproyecto.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(PresuProyectoConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(presuproyecto.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementejercicio_descripcion = document.createElement(PresuProyectoConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(presuproyecto.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementcodigo = document.createElement(PresuProyectoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(presuproyecto.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(PresuProyectoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(presuproyecto.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementpresutipoproyecto_descripcion = document.createElement(PresuProyectoConstantesFunciones.IDPRESUTIPOPROYECTO);
		elementpresutipoproyecto_descripcion.appendChild(document.createTextNode(presuproyecto.getpresutipoproyecto_descripcion()));
		element.appendChild(elementpresutipoproyecto_descripcion);

		Element elementcentrocosto_descripcion = document.createElement(PresuProyectoConstantesFunciones.IDCENTROCOSTO);
		elementcentrocosto_descripcion.appendChild(document.createTextNode(presuproyecto.getcentrocosto_descripcion()));
		element.appendChild(elementcentrocosto_descripcion);

		Element elementfecha = document.createElement(PresuProyectoConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(presuproyecto.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementvalor = document.createElement(PresuProyectoConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(presuproyecto.getvalor().toString().trim()));
		element.appendChild(elementvalor);

		Element elementpresuestado_descripcion = document.createElement(PresuProyectoConstantesFunciones.IDPRESUESTADO);
		elementpresuestado_descripcion.appendChild(document.createTextNode(presuproyecto.getpresuestado_descripcion()));
		element.appendChild(elementpresuestado_descripcion);

		Element elementdescripcion = document.createElement(PresuProyectoConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(presuproyecto.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoPresuProyectosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<PresuProyecto> presuproyectosSeleccionados=new ArrayList<PresuProyecto>();
		
		presuproyectosSeleccionados=this.getPresuProyectosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoPresuProyecto(presuproyectosSeleccionados);
		
		this.generarReportePresuProyectos("Todos",presuproyectosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoPresuProyecto(ArrayList<PresuProyecto> presuproyectosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(PresuProyecto presuproyectoAux:presuproyectosSeleccionados) {
				presuproyectoAux.setsDetalleGeneralEntityReporte(presuproyectoAux.toString());
			
				if(sTipoSeleccionar.equals(PresuProyectoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					presuproyectoAux.setsDescripcionGeneralEntityReporte1(presuproyectoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PresuProyectoConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					presuproyectoAux.setsDescripcionGeneralEntityReporte1(presuproyectoAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PresuProyectoConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					presuproyectoAux.setsDescripcionGeneralEntityReporte1(presuproyectoAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PresuProyectoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					presuproyectoAux.setsDescripcionGeneralEntityReporte1(presuproyectoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(PresuProyectoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					presuproyectoAux.setsDescripcionGeneralEntityReporte1(presuproyectoAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(PresuProyectoConstantesFunciones.LABEL_IDPRESUTIPOPROYECTO)) {
					existe=true;
					presuproyectoAux.setsDescripcionGeneralEntityReporte1(presuproyectoAux.getpresutipoproyecto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PresuProyectoConstantesFunciones.LABEL_IDCENTROCOSTO)) {
					existe=true;
					presuproyectoAux.setsDescripcionGeneralEntityReporte1(presuproyectoAux.getcentrocosto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PresuProyectoConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					presuproyectoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(presuproyectoAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(PresuProyectoConstantesFunciones.LABEL_IDPRESUESTADO)) {
					existe=true;
					presuproyectoAux.setsDescripcionGeneralEntityReporte1(presuproyectoAux.getpresuestado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PresuProyectoConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					presuproyectoAux.setsDescripcionGeneralEntityReporte1(presuproyectoAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesPresuProyecto(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoPresuProyecto=true;
				this.isVisibilidadCeldaNuevoRelacionesPresuProyecto=true;
				this.isVisibilidadCeldaGuardarCambiosPresuProyecto=true;
			}
			
			this.isVisibilidadCeldaModificarPresuProyecto=false;
			this.isVisibilidadCeldaActualizarPresuProyecto=false;
			this.isVisibilidadCeldaEliminarPresuProyecto=false;
			this.isVisibilidadCeldaCancelarPresuProyecto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresuProyecto=true;
				} else {
					this.isVisibilidadCeldaGuardarPresuProyecto=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoPresuProyecto=false;
			this.isVisibilidadCeldaNuevoRelacionesPresuProyecto=false;
			this.isVisibilidadCeldaGuardarCambiosPresuProyecto=false;
			this.isVisibilidadCeldaModificarPresuProyecto=false;
			this.isVisibilidadCeldaActualizarPresuProyecto=true;
			this.isVisibilidadCeldaEliminarPresuProyecto=false;
			this.isVisibilidadCeldaCancelarPresuProyecto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresuProyecto=true;
				} else {
					this.isVisibilidadCeldaGuardarPresuProyecto=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoPresuProyecto=false;
			this.isVisibilidadCeldaNuevoRelacionesPresuProyecto=false;
			this.isVisibilidadCeldaGuardarCambiosPresuProyecto=false;
			this.isVisibilidadCeldaModificarPresuProyecto=false;
			this.isVisibilidadCeldaActualizarPresuProyecto=true;
			this.isVisibilidadCeldaEliminarPresuProyecto=true;
			this.isVisibilidadCeldaCancelarPresuProyecto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresuProyecto=true;
				} else {
					this.isVisibilidadCeldaGuardarPresuProyecto=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoPresuProyecto=false;
			this.isVisibilidadCeldaNuevoRelacionesPresuProyecto=false;
			this.isVisibilidadCeldaGuardarCambiosPresuProyecto=false;
			this.isVisibilidadCeldaModificarPresuProyecto=false;
			this.isVisibilidadCeldaActualizarPresuProyecto=true;
			this.isVisibilidadCeldaEliminarPresuProyecto=false;
			this.isVisibilidadCeldaCancelarPresuProyecto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresuProyecto=false;
				} else {
					this.isVisibilidadCeldaGuardarPresuProyecto=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoPresuProyecto=true;
			this.isVisibilidadCeldaNuevoRelacionesPresuProyecto=true;
			this.isVisibilidadCeldaGuardarCambiosPresuProyecto=true;
			this.isVisibilidadCeldaModificarPresuProyecto=false;
			this.isVisibilidadCeldaActualizarPresuProyecto=false;
			this.isVisibilidadCeldaEliminarPresuProyecto=false;
			this.isVisibilidadCeldaCancelarPresuProyecto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresuProyecto=true;
				} else {
					this.isVisibilidadCeldaGuardarPresuProyecto=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoPresuProyecto=false;
			this.isVisibilidadCeldaNuevoRelacionesPresuProyecto=false;
			this.isVisibilidadCeldaGuardarCambiosPresuProyecto=false;
			this.isVisibilidadCeldaActualizarPresuProyecto=false;
			this.isVisibilidadCeldaEliminarPresuProyecto=false;
			this.isVisibilidadCeldaCancelarPresuProyecto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresuProyecto=false;
				} else {
					this.isVisibilidadCeldaGuardarPresuProyecto=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoPresuProyecto=false;
			this.isVisibilidadCeldaNuevoRelacionesPresuProyecto=false;
			this.isVisibilidadCeldaGuardarCambiosPresuProyecto=false;
			this.isVisibilidadCeldaModificarPresuProyecto=true;
			this.isVisibilidadCeldaActualizarPresuProyecto=false;
			this.isVisibilidadCeldaEliminarPresuProyecto=false;
			this.isVisibilidadCeldaCancelarPresuProyecto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresuProyecto=false;
				} else {
					this.isVisibilidadCeldaGuardarPresuProyecto=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(PresuProyectoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoPresuProyecto=true;
			this.isVisibilidadCeldaNuevoRelacionesPresuProyecto=true;
			this.isVisibilidadCeldaGuardarCambiosPresuProyecto=true;
		} else {
			this.actualizarEstadoPanelsPresuProyecto(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarPresuProyecto=false;
			//this.isVisibilidadCeldaVerFormPresuProyecto=false;
			this.isVisibilidadCeldaDuplicarPresuProyecto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!presuproyectoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesPresuProyecto=false;
		} else {
			this.isVisibilidadCeldaNuevoPresuProyecto=false;
			this.isVisibilidadCeldaGuardarCambiosPresuProyecto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(presuproyectoSessionBean.getEsGuardarRelacionado()) {
			if(!presuproyectoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesPresuProyecto=false;												
			}
			
			this.jButtonCerrarPresuProyecto.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesPresuProyecto=false;
		}
		
		if(!this.permiteMantenimiento(this.presuproyecto)) {
			this.isVisibilidadCeldaActualizarPresuProyecto=false;
			this.isVisibilidadCeldaEliminarPresuProyecto=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesPresuProyecto() {
		this.isVisibilidadCeldaNuevoPresuProyecto=false;
		this.isVisibilidadCeldaGuardarCambiosPresuProyecto=false;
	}
	
	public void actualizarEstadoPanelsPresuProyecto(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionPresuProyecto!=null) {
				this.jScrollPanelDatosEdicionPresuProyecto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresuProyecto!=null) {
				this.jTabbedPaneBusquedasPresuProyecto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPresuProyecto!=null) {
				this.jScrollPanelDatosPresuProyecto.setVisible(true);
			}
			
			if(this.jPanelPaginacionPresuProyecto!=null) {
				this.jPanelPaginacionPresuProyecto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPresuProyecto!=null) {
				this.jPanelParametrosReportesPresuProyecto.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionPresuProyecto!=null) {
				this.jScrollPanelDatosEdicionPresuProyecto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresuProyecto!=null) {
				this.jTabbedPaneBusquedasPresuProyecto.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosPresuProyecto!=null) {
				this.jScrollPanelDatosPresuProyecto.setVisible(false);
			}
			
			if(this.jPanelPaginacionPresuProyecto!=null) {
				this.jPanelPaginacionPresuProyecto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPresuProyecto!=null) {
				this.jPanelParametrosReportesPresuProyecto.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionPresuProyecto!=null) {
				this.jScrollPanelDatosEdicionPresuProyecto.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresuProyecto!=null) {
				this.jTabbedPaneBusquedasPresuProyecto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPresuProyecto!=null) {
				this.jScrollPanelDatosPresuProyecto.setVisible(false);
			}
			
			if(this.jPanelPaginacionPresuProyecto!=null) {
				this.jPanelPaginacionPresuProyecto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPresuProyecto!=null) {
				this.jPanelParametrosReportesPresuProyecto.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionPresuProyecto!=null) {
				this.jScrollPanelDatosEdicionPresuProyecto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresuProyecto!=null) {
				this.jTabbedPaneBusquedasPresuProyecto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPresuProyecto!=null) {
				this.jScrollPanelDatosPresuProyecto.setVisible(false);
			}
			
			if(this.jPanelPaginacionPresuProyecto!=null) {
				this.jPanelPaginacionPresuProyecto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPresuProyecto!=null) {
				this.jPanelParametrosReportesPresuProyecto.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionPresuProyecto!=null) {
				this.jScrollPanelDatosEdicionPresuProyecto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresuProyecto!=null) {
				this.jTabbedPaneBusquedasPresuProyecto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPresuProyecto!=null) {
				this.jScrollPanelDatosPresuProyecto.setVisible(true);
			}
			
			if(this.jPanelPaginacionPresuProyecto!=null) {
				this.jPanelPaginacionPresuProyecto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPresuProyecto!=null) {
				this.jPanelParametrosReportesPresuProyecto.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionPresuProyecto!=null) {
				this.jScrollPanelDatosEdicionPresuProyecto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresuProyecto!=null) {
				this.jTabbedPaneBusquedasPresuProyecto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPresuProyecto!=null) {
				this.jScrollPanelDatosPresuProyecto.setVisible(true);
			}
			
			if(this.jPanelPaginacionPresuProyecto!=null) {
				this.jPanelPaginacionPresuProyecto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPresuProyecto!=null) {
				this.jPanelParametrosReportesPresuProyecto.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionPresuProyecto!=null) {
				this.jScrollPanelDatosEdicionPresuProyecto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresuProyecto!=null) {
				this.jTabbedPaneBusquedasPresuProyecto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPresuProyecto!=null) {
				this.jScrollPanelDatosPresuProyecto.setVisible(true);
			}
			
			if(this.jPanelPaginacionPresuProyecto!=null) {
				this.jPanelPaginacionPresuProyecto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPresuProyecto!=null) {
				this.jPanelParametrosReportesPresuProyecto.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.presuproyectoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasPresuProyecto!=null) {
					this.jTabbedPaneBusquedasPresuProyecto.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesPresuProyecto!=null) {
				this.jPanelParametrosReportesPresuProyecto.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.presuproyectoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresuProyecto!=null) {
				this.jTabbedPaneBusquedasPresuProyecto.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesPresuProyecto!=null) {
				this.jPanelParametrosReportesPresuProyecto.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorCodigo=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasPresuProyecto.remove(jPanelBusquedaPorCodigoPresuProyecto);}

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasPresuProyecto.remove(jPanelBusquedaPorNombrePresuProyecto);}

			this.isVisibilidadFK_IdEjercicio=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEjercicio) {this.jTabbedPaneBusquedasPresuProyecto.remove(jPanelFK_IdEjercicioPresuProyecto);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaPorCodigo=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasPresuProyecto.remove(jPanelBusquedaPorCodigoPresuProyecto);}

			this.isVisibilidadBusquedaPorNombre=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasPresuProyecto.remove(jPanelBusquedaPorNombrePresuProyecto);}

			this.isVisibilidadFK_IdEjercicio=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdEjercicio) {this.jTabbedPaneBusquedasPresuProyecto.remove(jPanelFK_IdEjercicioPresuProyecto);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadBusquedaPorCodigo=isParaEjercicioNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasPresuProyecto.remove(jPanelBusquedaPorCodigoPresuProyecto);}

			this.isVisibilidadBusquedaPorNombre=isParaEjercicioNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasPresuProyecto.remove(jPanelBusquedaPorNombrePresuProyecto);}

			this.isVisibilidadFK_IdEjercicio=isParaEjercicio;
			if(!this.isVisibilidadFK_IdEjercicio) {this.jTabbedPaneBusquedasPresuProyecto.remove(jPanelFK_IdEjercicioPresuProyecto);}
		}
		
	}

	public void setVisibilidadBusquedasParaPresuTipoProyecto(Boolean isParaPresuTipoProyecto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPresuTipoProyectoNegation=!isParaPresuTipoProyecto;

			this.isVisibilidadBusquedaPorCodigo=isParaPresuTipoProyectoNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasPresuProyecto.remove(jPanelBusquedaPorCodigoPresuProyecto);}

			this.isVisibilidadBusquedaPorNombre=isParaPresuTipoProyectoNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasPresuProyecto.remove(jPanelBusquedaPorNombrePresuProyecto);}

			this.isVisibilidadFK_IdEjercicio=isParaPresuTipoProyectoNegation;
			if(!this.isVisibilidadFK_IdEjercicio) {this.jTabbedPaneBusquedasPresuProyecto.remove(jPanelFK_IdEjercicioPresuProyecto);}
		}
		
	}

	public void setVisibilidadBusquedasParaCentroCosto(Boolean isParaCentroCosto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCentroCostoNegation=!isParaCentroCosto;

			this.isVisibilidadBusquedaPorCodigo=isParaCentroCostoNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasPresuProyecto.remove(jPanelBusquedaPorCodigoPresuProyecto);}

			this.isVisibilidadBusquedaPorNombre=isParaCentroCostoNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasPresuProyecto.remove(jPanelBusquedaPorNombrePresuProyecto);}

			this.isVisibilidadFK_IdEjercicio=isParaCentroCostoNegation;
			if(!this.isVisibilidadFK_IdEjercicio) {this.jTabbedPaneBusquedasPresuProyecto.remove(jPanelFK_IdEjercicioPresuProyecto);}
		}
		
	}

	public void setVisibilidadBusquedasParaPresuEstado(Boolean isParaPresuEstado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPresuEstadoNegation=!isParaPresuEstado;

			this.isVisibilidadBusquedaPorCodigo=isParaPresuEstadoNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasPresuProyecto.remove(jPanelBusquedaPorCodigoPresuProyecto);}

			this.isVisibilidadBusquedaPorNombre=isParaPresuEstadoNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasPresuProyecto.remove(jPanelBusquedaPorNombrePresuProyecto);}

			this.isVisibilidadFK_IdEjercicio=isParaPresuEstadoNegation;
			if(!this.isVisibilidadFK_IdEjercicio) {this.jTabbedPaneBusquedasPresuProyecto.remove(jPanelFK_IdEjercicioPresuProyecto);}
		}
		
	}
	
	

	public String registrarSesionPresuProyectoParaPresuTransferenciaes() throws Exception {
		Boolean isPaginaPopupPresuTransferencia=false;

		try {

			if(this.presuproyectoSessionBean==null) {
				this.presuproyectoSessionBean=new PresuProyectoSessionBean();
			}

			if(this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaSessionBean==null) {
				this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaSessionBean=new PresuTransferenciaSessionBean();
			}

			this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaSessionBean.setsPathNavegacionActual(presuproyectoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+PresuTransferenciaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupPresuTransferencia=this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdePresuTransferencia(true);
			this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdePresuTransferencia(PresuProyectoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaSessionBean.setisBusquedaDesdeForeignKeySesionPresuProyecto(true);
			this.jInternalFrameDetalleFormPresuProyecto.presutransferenciaSessionBean.setlidPresuProyectoActual(this.idPresuProyectoActual);

			presuproyectoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyPresuProyecto(true);
			presuproyectoSessionBean.setlIdPresuProyectoActualForeignKey(this.idPresuProyectoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionPresuProyectoParaPresuProyectoCuentaes() throws Exception {
		Boolean isPaginaPopupPresuProyectoCuenta=false;

		try {

			if(this.presuproyectoSessionBean==null) {
				this.presuproyectoSessionBean=new PresuProyectoSessionBean();
			}

			if(this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaSessionBean==null) {
				this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaSessionBean=new PresuProyectoCuentaSessionBean();
			}

			this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaSessionBean.setsPathNavegacionActual(presuproyectoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+PresuProyectoCuentaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupPresuProyectoCuenta=this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdePresuProyectoCuenta(true);
			this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdePresuProyectoCuenta(PresuProyectoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaSessionBean.setisBusquedaDesdeForeignKeySesionPresuProyecto(true);
			this.jInternalFrameDetalleFormPresuProyecto.presuproyectocuentaSessionBean.setlidPresuProyectoActual(this.idPresuProyectoActual);

			presuproyectoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyPresuProyecto(true);
			presuproyectoSessionBean.setlIdPresuProyectoActualForeignKey(this.idPresuProyectoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//PresuProyectoSessionBean presuproyectoSessionBean=new PresuProyectoSessionBean();
		
		if(this.presuproyectoSessionBean==null) {
			this.presuproyectoSessionBean=new PresuProyectoSessionBean();
		}
		
		this.presuproyectoSessionBean.setsUltimaBusquedaPresuProyecto(this.getsAccionBusqueda());
		this.presuproyectoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.presuproyectoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			presuproyectoSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			presuproyectoSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
			presuproyectoSessionBean.setid_ejercicio(this.getid_ejercicioFK_IdEjercicio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			presuproyectoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			presuproyectoSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//PresuProyectoSessionBean presuproyectoSessionBean=new PresuProyectoSessionBean();
		
		if(this.presuproyectoSessionBean==null) {
			this.presuproyectoSessionBean=new PresuProyectoSessionBean();
		}
		
		if(this.presuproyectoSessionBean.getsUltimaBusquedaPresuProyecto()!=null&&!this.presuproyectoSessionBean.getsUltimaBusquedaPresuProyecto().equals("")) {
			this.setsAccionBusqueda(presuproyectoSessionBean.getsUltimaBusquedaPresuProyecto());
			this.setiNumeroPaginacion(presuproyectoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(presuproyectoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(presuproyectoSessionBean.getcodigo());
				presuproyectoSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(presuproyectoSessionBean.getnombre());
				presuproyectoSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
				this.setid_ejercicioFK_IdEjercicio(presuproyectoSessionBean.getid_ejercicio());
				presuproyectoSessionBean.setid_ejercicio(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(presuproyectoSessionBean.getid_empresa());
				presuproyectoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(presuproyectoSessionBean.getid_sucursal());
				presuproyectoSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.presuproyectoSessionBean.setsUltimaBusquedaPresuProyecto("");
		this.presuproyectoSessionBean.setiNumeroPaginacion(PresuProyectoConstantesFunciones.INUMEROPAGINACION);
		this.presuproyectoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaPresuProyecto(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioPresuProyecto() {
		this.updateBorderResaltarBusquedasFormularioPresuProyecto();
		this.updateVisibilidadBusquedasFormularioPresuProyecto();
		this.updateHabilitarBusquedasFormularioPresuProyecto();
	}
	
	public void updateBorderResaltarBusquedasFormularioPresuProyecto() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasPresuProyecto.getComponents().length>0) {
	

		if(this.presuproyectoConstantesFunciones.resaltarBusquedaPorCodigoPresuProyecto!=null) {
			index= this.jTabbedPaneBusquedasPresuProyecto.indexOfComponent(this.jPanelBusquedaPorCodigoPresuProyecto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresuProyecto.getComponent(index);
				jPanel.setBorder(this.presuproyectoConstantesFunciones.resaltarBusquedaPorCodigoPresuProyecto);
			}
		}

		if(this.presuproyectoConstantesFunciones.resaltarBusquedaPorNombrePresuProyecto!=null) {
			index= this.jTabbedPaneBusquedasPresuProyecto.indexOfComponent(this.jPanelBusquedaPorNombrePresuProyecto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresuProyecto.getComponent(index);
				jPanel.setBorder(this.presuproyectoConstantesFunciones.resaltarBusquedaPorNombrePresuProyecto);
			}
		}

		if(this.presuproyectoConstantesFunciones.resaltarFK_IdEjercicioPresuProyecto!=null) {
			index= this.jTabbedPaneBusquedasPresuProyecto.indexOfComponent(this.jPanelFK_IdEjercicioPresuProyecto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresuProyecto.getComponent(index);
				jPanel.setBorder(this.presuproyectoConstantesFunciones.resaltarFK_IdEjercicioPresuProyecto);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioPresuProyecto() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasPresuProyecto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPresuProyecto.indexOfComponent(this.jPanelBusquedaPorCodigoPresuProyecto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPresuProyecto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.presuproyectoConstantesFunciones.mostrarBusquedaPorCodigoPresuProyecto);
			if(!this.presuproyectoConstantesFunciones.mostrarBusquedaPorCodigoPresuProyecto && index>-1) {
				this.jTabbedPaneBusquedasPresuProyecto.remove(index);
			}

			index= this.jTabbedPaneBusquedasPresuProyecto.indexOfComponent(this.jPanelBusquedaPorNombrePresuProyecto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPresuProyecto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.presuproyectoConstantesFunciones.mostrarBusquedaPorNombrePresuProyecto);
			if(!this.presuproyectoConstantesFunciones.mostrarBusquedaPorNombrePresuProyecto && index>-1) {
				this.jTabbedPaneBusquedasPresuProyecto.remove(index);
			}

			index= this.jTabbedPaneBusquedasPresuProyecto.indexOfComponent(this.jPanelFK_IdEjercicioPresuProyecto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPresuProyecto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.presuproyectoConstantesFunciones.mostrarFK_IdEjercicioPresuProyecto);
			if(!this.presuproyectoConstantesFunciones.mostrarFK_IdEjercicioPresuProyecto && index>-1) {
				this.jTabbedPaneBusquedasPresuProyecto.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioPresuProyecto() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasPresuProyecto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPresuProyecto.indexOfComponent(this.jPanelBusquedaPorCodigoPresuProyecto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPresuProyecto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.presuproyectoConstantesFunciones.activarBusquedaPorCodigoPresuProyecto);
				this.jTabbedPaneBusquedasPresuProyecto.setEnabledAt(index,this.presuproyectoConstantesFunciones.activarBusquedaPorCodigoPresuProyecto);
			}

			index= this.jTabbedPaneBusquedasPresuProyecto.indexOfComponent(this.jPanelBusquedaPorNombrePresuProyecto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPresuProyecto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.presuproyectoConstantesFunciones.activarBusquedaPorNombrePresuProyecto);
				this.jTabbedPaneBusquedasPresuProyecto.setEnabledAt(index,this.presuproyectoConstantesFunciones.activarBusquedaPorNombrePresuProyecto);
			}

			index= this.jTabbedPaneBusquedasPresuProyecto.indexOfComponent(this.jPanelFK_IdEjercicioPresuProyecto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPresuProyecto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.presuproyectoConstantesFunciones.activarFK_IdEjercicioPresuProyecto);
				this.jTabbedPaneBusquedasPresuProyecto.setEnabledAt(index,this.presuproyectoConstantesFunciones.activarFK_IdEjercicioPresuProyecto);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaPresuProyecto(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasPresuProyecto.indexOfComponent(this.jPanelBusquedaPorCodigoPresuProyecto);

			this.jTabbedPaneBusquedasPresuProyecto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresuProyecto.getComponent(index);

			this.presuproyectoConstantesFunciones.setResaltarBusquedaPorCodigoPresuProyecto(resaltar);

			jPanel.setBorder(this.presuproyectoConstantesFunciones.resaltarBusquedaPorCodigoPresuProyecto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasPresuProyecto.indexOfComponent(this.jPanelBusquedaPorNombrePresuProyecto);

			this.jTabbedPaneBusquedasPresuProyecto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresuProyecto.getComponent(index);

			this.presuproyectoConstantesFunciones.setResaltarBusquedaPorNombrePresuProyecto(resaltar);

			jPanel.setBorder(this.presuproyectoConstantesFunciones.resaltarBusquedaPorNombrePresuProyecto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEjercicio")) {
			index= this.jTabbedPaneBusquedasPresuProyecto.indexOfComponent(this.jPanelFK_IdEjercicioPresuProyecto);

			this.jTabbedPaneBusquedasPresuProyecto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresuProyecto.getComponent(index);

			this.presuproyectoConstantesFunciones.setResaltarFK_IdEjercicioPresuProyecto(resaltar);

			jPanel.setBorder(this.presuproyectoConstantesFunciones.resaltarFK_IdEjercicioPresuProyecto);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarPresuProyecto.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioPresuProyecto() throws Exception {

		if(this.jInternalFrameDetalleFormPresuProyecto==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioPresuProyecto();
		this.updateVisibilidadResaltarControlesFormularioPresuProyecto();
		this.updateHabilitarResaltarControlesFormularioPresuProyecto();
		
	}
	
	public void updateBorderResaltarControlesFormularioPresuProyecto() throws Exception {
		if(this.jInternalFrameDetalleFormPresuProyecto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.presuproyectoConstantesFunciones.resaltaridPresuProyecto!=null && this.jInternalFrameDetalleFormPresuProyecto!=null) {this.jInternalFrameDetalleFormPresuProyecto.jLabelidPresuProyecto.setBorder(this.presuproyectoConstantesFunciones.resaltaridPresuProyecto);}
		if(this.presuproyectoConstantesFunciones.resaltarid_empresaPresuProyecto!=null && this.jInternalFrameDetalleFormPresuProyecto!=null) {this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_empresaPresuProyecto.setBorder(this.presuproyectoConstantesFunciones.resaltarid_empresaPresuProyecto);}
		if(this.presuproyectoConstantesFunciones.resaltarid_sucursalPresuProyecto!=null && this.jInternalFrameDetalleFormPresuProyecto!=null) {this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_sucursalPresuProyecto.setBorder(this.presuproyectoConstantesFunciones.resaltarid_sucursalPresuProyecto);}
		if(this.presuproyectoConstantesFunciones.resaltarid_ejercicioPresuProyecto!=null && this.jInternalFrameDetalleFormPresuProyecto!=null) {this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_ejercicioPresuProyecto.setBorder(this.presuproyectoConstantesFunciones.resaltarid_ejercicioPresuProyecto);}
		if(this.presuproyectoConstantesFunciones.resaltarcodigoPresuProyecto!=null && this.jInternalFrameDetalleFormPresuProyecto!=null) {this.jInternalFrameDetalleFormPresuProyecto.jTextAreacodigoPresuProyecto.setBorder(this.presuproyectoConstantesFunciones.resaltarcodigoPresuProyecto);}
		if(this.presuproyectoConstantesFunciones.resaltarnombrePresuProyecto!=null && this.jInternalFrameDetalleFormPresuProyecto!=null) {this.jInternalFrameDetalleFormPresuProyecto.jTextAreanombrePresuProyecto.setBorder(this.presuproyectoConstantesFunciones.resaltarnombrePresuProyecto);}
		if(this.presuproyectoConstantesFunciones.resaltarid_presu_tipo_proyectoPresuProyecto!=null && this.jInternalFrameDetalleFormPresuProyecto!=null) {this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_presu_tipo_proyectoPresuProyecto.setBorder(this.presuproyectoConstantesFunciones.resaltarid_presu_tipo_proyectoPresuProyecto);}
		if(this.presuproyectoConstantesFunciones.resaltarid_centro_costoPresuProyecto!=null && this.jInternalFrameDetalleFormPresuProyecto!=null) {this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_centro_costoPresuProyecto.setBorder(this.presuproyectoConstantesFunciones.resaltarid_centro_costoPresuProyecto);}
		if(this.presuproyectoConstantesFunciones.resaltarfechaPresuProyecto!=null && this.jInternalFrameDetalleFormPresuProyecto!=null) {this.jInternalFrameDetalleFormPresuProyecto.jDateChooserfechaPresuProyecto.setBorder(this.presuproyectoConstantesFunciones.resaltarfechaPresuProyecto);}
		if(this.presuproyectoConstantesFunciones.resaltarvalorPresuProyecto!=null && this.jInternalFrameDetalleFormPresuProyecto!=null) {this.jInternalFrameDetalleFormPresuProyecto.jTextFieldvalorPresuProyecto.setBorder(this.presuproyectoConstantesFunciones.resaltarvalorPresuProyecto);}
		if(this.presuproyectoConstantesFunciones.resaltarid_presu_estadoPresuProyecto!=null && this.jInternalFrameDetalleFormPresuProyecto!=null) {this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_presu_estadoPresuProyecto.setBorder(this.presuproyectoConstantesFunciones.resaltarid_presu_estadoPresuProyecto);}
		if(this.presuproyectoConstantesFunciones.resaltardescripcionPresuProyecto!=null && this.jInternalFrameDetalleFormPresuProyecto!=null) {this.jInternalFrameDetalleFormPresuProyecto.jTextAreadescripcionPresuProyecto.setBorder(this.presuproyectoConstantesFunciones.resaltardescripcionPresuProyecto);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioPresuProyecto() throws Exception {		
		if(this.jInternalFrameDetalleFormPresuProyecto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPresuProyecto!=null) {
	
		//this.jInternalFrameDetalleFormPresuProyecto.jLabelidPresuProyecto.setVisible(this.presuproyectoConstantesFunciones.mostraridPresuProyecto);
		this.jInternalFrameDetalleFormPresuProyecto.jPanelidPresuProyecto.setVisible(this.presuproyectoConstantesFunciones.mostraridPresuProyecto);
		//this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_empresaPresuProyecto.setVisible(this.presuproyectoConstantesFunciones.mostrarid_empresaPresuProyecto);
		this.jInternalFrameDetalleFormPresuProyecto.jPanelid_empresaPresuProyecto.setVisible(this.presuproyectoConstantesFunciones.mostrarid_empresaPresuProyecto);
		//this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_sucursalPresuProyecto.setVisible(this.presuproyectoConstantesFunciones.mostrarid_sucursalPresuProyecto);
		this.jInternalFrameDetalleFormPresuProyecto.jPanelid_sucursalPresuProyecto.setVisible(this.presuproyectoConstantesFunciones.mostrarid_sucursalPresuProyecto);
		//this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_ejercicioPresuProyecto.setVisible(this.presuproyectoConstantesFunciones.mostrarid_ejercicioPresuProyecto);
		this.jInternalFrameDetalleFormPresuProyecto.jPanelid_ejercicioPresuProyecto.setVisible(this.presuproyectoConstantesFunciones.mostrarid_ejercicioPresuProyecto);
		//this.jInternalFrameDetalleFormPresuProyecto.jTextAreacodigoPresuProyecto.setVisible(this.presuproyectoConstantesFunciones.mostrarcodigoPresuProyecto);
		this.jInternalFrameDetalleFormPresuProyecto.jPanelcodigoPresuProyecto.setVisible(this.presuproyectoConstantesFunciones.mostrarcodigoPresuProyecto);
		//this.jInternalFrameDetalleFormPresuProyecto.jTextAreanombrePresuProyecto.setVisible(this.presuproyectoConstantesFunciones.mostrarnombrePresuProyecto);
		this.jInternalFrameDetalleFormPresuProyecto.jPanelnombrePresuProyecto.setVisible(this.presuproyectoConstantesFunciones.mostrarnombrePresuProyecto);
		//this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_presu_tipo_proyectoPresuProyecto.setVisible(this.presuproyectoConstantesFunciones.mostrarid_presu_tipo_proyectoPresuProyecto);
		this.jInternalFrameDetalleFormPresuProyecto.jPanelid_presu_tipo_proyectoPresuProyecto.setVisible(this.presuproyectoConstantesFunciones.mostrarid_presu_tipo_proyectoPresuProyecto);
		//this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_centro_costoPresuProyecto.setVisible(this.presuproyectoConstantesFunciones.mostrarid_centro_costoPresuProyecto);
		this.jInternalFrameDetalleFormPresuProyecto.jPanelid_centro_costoPresuProyecto.setVisible(this.presuproyectoConstantesFunciones.mostrarid_centro_costoPresuProyecto);
		//this.jInternalFrameDetalleFormPresuProyecto.jDateChooserfechaPresuProyecto.setVisible(this.presuproyectoConstantesFunciones.mostrarfechaPresuProyecto);
		this.jInternalFrameDetalleFormPresuProyecto.jPanelfechaPresuProyecto.setVisible(this.presuproyectoConstantesFunciones.mostrarfechaPresuProyecto);
		//this.jInternalFrameDetalleFormPresuProyecto.jTextFieldvalorPresuProyecto.setVisible(this.presuproyectoConstantesFunciones.mostrarvalorPresuProyecto);
		this.jInternalFrameDetalleFormPresuProyecto.jPanelvalorPresuProyecto.setVisible(this.presuproyectoConstantesFunciones.mostrarvalorPresuProyecto);
		//this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_presu_estadoPresuProyecto.setVisible(this.presuproyectoConstantesFunciones.mostrarid_presu_estadoPresuProyecto);
		this.jInternalFrameDetalleFormPresuProyecto.jPanelid_presu_estadoPresuProyecto.setVisible(this.presuproyectoConstantesFunciones.mostrarid_presu_estadoPresuProyecto);
		//this.jInternalFrameDetalleFormPresuProyecto.jTextAreadescripcionPresuProyecto.setVisible(this.presuproyectoConstantesFunciones.mostrardescripcionPresuProyecto);
		this.jInternalFrameDetalleFormPresuProyecto.jPaneldescripcionPresuProyecto.setVisible(this.presuproyectoConstantesFunciones.mostrardescripcionPresuProyecto);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioPresuProyecto() throws Exception {
		if(this.jInternalFrameDetalleFormPresuProyecto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPresuProyecto!=null) {
	
		this.jInternalFrameDetalleFormPresuProyecto.jLabelidPresuProyecto.setEnabled(this.presuproyectoConstantesFunciones.activaridPresuProyecto);
		this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_empresaPresuProyecto.setEnabled(this.presuproyectoConstantesFunciones.activarid_empresaPresuProyecto);
		this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_sucursalPresuProyecto.setEnabled(this.presuproyectoConstantesFunciones.activarid_sucursalPresuProyecto);
		this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_ejercicioPresuProyecto.setEnabled(this.presuproyectoConstantesFunciones.activarid_ejercicioPresuProyecto);
		this.jInternalFrameDetalleFormPresuProyecto.jTextAreacodigoPresuProyecto.setEnabled(this.presuproyectoConstantesFunciones.activarcodigoPresuProyecto);
		this.jInternalFrameDetalleFormPresuProyecto.jTextAreanombrePresuProyecto.setEnabled(this.presuproyectoConstantesFunciones.activarnombrePresuProyecto);
		this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_presu_tipo_proyectoPresuProyecto.setEnabled(this.presuproyectoConstantesFunciones.activarid_presu_tipo_proyectoPresuProyecto);
		this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_centro_costoPresuProyecto.setEnabled(this.presuproyectoConstantesFunciones.activarid_centro_costoPresuProyecto);
		this.jInternalFrameDetalleFormPresuProyecto.jDateChooserfechaPresuProyecto.setEnabled(this.presuproyectoConstantesFunciones.activarfechaPresuProyecto);
		this.jInternalFrameDetalleFormPresuProyecto.jTextFieldvalorPresuProyecto.setEnabled(this.presuproyectoConstantesFunciones.activarvalorPresuProyecto);
		this.jInternalFrameDetalleFormPresuProyecto.jComboBoxid_presu_estadoPresuProyecto.setEnabled(this.presuproyectoConstantesFunciones.activarid_presu_estadoPresuProyecto);
		this.jInternalFrameDetalleFormPresuProyecto.jTextAreadescripcionPresuProyecto.setEnabled(this.presuproyectoConstantesFunciones.activardescripcionPresuProyecto);
		}
	}
	
		
}