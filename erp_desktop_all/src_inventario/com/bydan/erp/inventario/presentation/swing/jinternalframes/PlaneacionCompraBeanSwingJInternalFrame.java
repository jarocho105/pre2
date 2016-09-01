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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;




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

import com.bydan.erp.inventario.util.PlaneacionCompraConstantesFunciones;
import com.bydan.erp.inventario.util.PlaneacionCompraParameterReturnGeneral;
//import com.bydan.erp.inventario.util.PlaneacionCompraParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.PlaneacionCompraBean;
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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.inventario.resources.reportes.AuxiliarReportes;


import com.bydan.erp.inventario.util.*;
import com.bydan.erp.inventario.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
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


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class PlaneacionCompraBeanSwingJInternalFrame extends PlaneacionCompraJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(PlaneacionCompraBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<PlaneacionCompra> planeacioncompraValidator = new ClassValidator<PlaneacionCompra>(PlaneacionCompra.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public PlaneacionCompra planeacioncompra;	
	public PlaneacionCompra planeacioncompraAux;
	public PlaneacionCompra planeacioncompraAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public PlaneacionCompra planeacioncompraTotales;
	public Long idPlaneacionCompraActual;
	public Long iIdNuevoPlaneacionCompra=0L;
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

	public String sFinalQueryComboEmpleado="";

	public List<Empleado> empleadosForeignKey;

	public List<Empleado> getempleadosForeignKey() {
		return empleadosForeignKey;
	}

	public void setempleadosForeignKey(List<Empleado> empleadosForeignKey) {
		this.empleadosForeignKey = empleadosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empleado empleadoForeignKey;

	public Empleado getempleadoForeignKey() {
		return empleadoForeignKey;
	}

	public void setempleadoForeignKey(Empleado empleadoForeignKey) {
		this.empleadoForeignKey = empleadoForeignKey;
	}

	public String sFinalQueryComboUsuario="";

	public List<Usuario> usuariosForeignKey;

	public List<Usuario> getusuariosForeignKey() {
		return usuariosForeignKey;
	}

	public void setusuariosForeignKey(List<Usuario> usuariosForeignKey) {
		this.usuariosForeignKey = usuariosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Usuario usuarioForeignKey;

	public Usuario getusuarioForeignKey() {
		return usuarioForeignKey;
	}

	public void setusuarioForeignKey(Usuario usuarioForeignKey) {
		this.usuarioForeignKey = usuarioForeignKey;
	}

	public String sFinalQueryComboFormato="";

	public List<Formato> formatosForeignKey;

	public List<Formato> getformatosForeignKey() {
		return formatosForeignKey;
	}

	public void setformatosForeignKey(List<Formato> formatosForeignKey) {
		this.formatosForeignKey = formatosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Formato formatoForeignKey;

	public Formato getformatoForeignKey() {
		return formatoForeignKey;
	}

	public void setformatoForeignKey(Formato formatoForeignKey) {
		this.formatoForeignKey = formatoForeignKey;
	}

	public String sFinalQueryComboMesInicio="";

	public List<Mes> mesiniciosForeignKey;

	public List<Mes> getmesiniciosForeignKey() {
		return mesiniciosForeignKey;
	}

	public void setmesiniciosForeignKey(List<Mes> mesiniciosForeignKey) {
		this.mesiniciosForeignKey = mesiniciosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Mes mesinicioForeignKey;

	public Mes getmesinicioForeignKey() {
		return mesinicioForeignKey;
	}

	public void setmesinicioForeignKey(Mes mesinicioForeignKey) {
		this.mesinicioForeignKey = mesinicioForeignKey;
	}

	public String sFinalQueryComboMesFin="";

	public List<Mes> mesfinsForeignKey;

	public List<Mes> getmesfinsForeignKey() {
		return mesfinsForeignKey;
	}

	public void setmesfinsForeignKey(List<Mes> mesfinsForeignKey) {
		this.mesfinsForeignKey = mesfinsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Mes mesfinForeignKey;

	public Mes getmesfinForeignKey() {
		return mesfinForeignKey;
	}

	public void setmesfinForeignKey(Mes mesfinForeignKey) {
		this.mesfinForeignKey = mesfinForeignKey;
	}

		
	
	
	
	
	

	public Boolean isTienePermisosDetallePlaneacionCompra=false;

	public Boolean getIsTienePermisosDetallePlaneacionCompra() {
		return isTienePermisosDetallePlaneacionCompra;
	}

	public void setIsTienePermisosDetallePlaneacionCompra(Boolean isTienePermisosDetallePlaneacionCompra) {
		this.isTienePermisosDetallePlaneacionCompra= isTienePermisosDetallePlaneacionCompra;
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
	
	public Boolean isPermisoTodoPlaneacionCompra;
	public Boolean isPermisoNuevoPlaneacionCompra;
	public Boolean isPermisoActualizarPlaneacionCompra;
	public Boolean isPermisoActualizarOriginalPlaneacionCompra;
	public Boolean isPermisoEliminarPlaneacionCompra;
	public Boolean isPermisoGuardarCambiosPlaneacionCompra;
	public Boolean isPermisoConsultaPlaneacionCompra;
	public Boolean isPermisoBusquedaPlaneacionCompra;
	public Boolean isPermisoReportePlaneacionCompra;
	public Boolean isPermisoPaginacionMedioPlaneacionCompra;
	public Boolean isPermisoPaginacionAltoPlaneacionCompra;
	public Boolean isPermisoPaginacionTodoPlaneacionCompra;
	public Boolean isPermisoCopiarPlaneacionCompra;
	public Boolean isPermisoVerFormPlaneacionCompra;
	public Boolean isPermisoDuplicarPlaneacionCompra;
	public Boolean isPermisoOrdenPlaneacionCompra;
	
	
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
	
	public PlaneacionCompraParameterReturnGeneral planeacioncompraReturnGeneral;
	public PlaneacionCompraParameterReturnGeneral planeacioncompraParameterGeneral;
	
	

	public DetallePlaneacionCompraLogic detalleplaneacioncompraLogic=null;

	public DetallePlaneacionCompraLogic getDetallePlaneacionCompraLogic() {
		return detalleplaneacioncompraLogic;
	}

	public void setDetallePlaneacionCompraLogic(DetallePlaneacionCompraLogic detalleplaneacioncompraLogic) {
		this.detalleplaneacioncompraLogic = detalleplaneacioncompraLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoPlaneacionCompra=false;
	public Boolean esParaAccionDesdeFormularioPlaneacionCompra=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected PlaneacionCompraSessionBeanAdditional planeacioncompraSessionBeanAdditional=null;
	
	public PlaneacionCompraSessionBeanAdditional getPlaneacionCompraSessionBeanAdditional() {
		return this.planeacioncompraSessionBeanAdditional;
	}
	
	public void setPlaneacionCompraSessionBeanAdditional(PlaneacionCompraSessionBeanAdditional planeacioncompraSessionBeanAdditional) {
		try {
			this.planeacioncompraSessionBeanAdditional=planeacioncompraSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected PlaneacionCompraBeanSwingJInternalFrameAdditional planeacioncompraBeanSwingJInternalFrameAdditional=null;
	//public class PlaneacionCompraBeanSwingJInternalFrame
	
	public PlaneacionCompraBeanSwingJInternalFrameAdditional getPlaneacionCompraBeanSwingJInternalFrameAdditional() {
		return this.planeacioncompraBeanSwingJInternalFrameAdditional;
	}
	
	public void setPlaneacionCompraBeanSwingJInternalFrameAdditional(PlaneacionCompraBeanSwingJInternalFrameAdditional planeacioncompraBeanSwingJInternalFrameAdditional) {
		try {
			this.planeacioncompraBeanSwingJInternalFrameAdditional=planeacioncompraBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public PlaneacionCompraLogic planeacioncompraLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public PlaneacionCompra planeacioncompraBean;
	public PlaneacionCompraConstantesFunciones planeacioncompraConstantesFunciones;
	//public PlaneacionCompraParameterReturnGeneral planeacioncompraReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EjercicioLogic ejercicioLogic;
	public PeriodoLogic periodoLogic;
	public EmpleadoLogic empleadoLogic;
	public UsuarioLogic usuarioLogic;
	public FormatoLogic formatoLogic;
	public MesLogic mesinicioLogic;
	public MesLogic mesfinLogic;
	
	//PARAMETROS
	
	
	//public List<PlaneacionCompra> planeacioncompras;	
	//public List<PlaneacionCompra> planeacioncomprasEliminados;
	//public List<PlaneacionCompra> planeacioncomprasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoPlaneacionCompra=false;
	public Boolean isVisibilidadCeldaDuplicarPlaneacionCompra=true;
	public Boolean isVisibilidadCeldaCopiarPlaneacionCompra=true;
	public Boolean isVisibilidadCeldaVerFormPlaneacionCompra=true;
	public Boolean isVisibilidadCeldaOrdenPlaneacionCompra=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesPlaneacionCompra=false;
	public Boolean isVisibilidadCeldaModificarPlaneacionCompra=false;
	public Boolean isVisibilidadCeldaActualizarPlaneacionCompra=false;
	public Boolean isVisibilidadCeldaEliminarPlaneacionCompra=false;
	public Boolean isVisibilidadCeldaCancelarPlaneacionCompra=false;
	public Boolean isVisibilidadCeldaGuardarPlaneacionCompra=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosPlaneacionCompra=false;	
	
	
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdFormato=false;
	public Boolean isVisibilidadFK_IdMesFin=false;
	public Boolean isVisibilidadFK_IdMesInicio=false;
	public Boolean isVisibilidadFK_IdPeriodo=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdUsuario=false;
	
	public Long getiIdNuevoPlaneacionCompra() {
		return this.iIdNuevoPlaneacionCompra;
	}

	public void setiIdNuevoPlaneacionCompra(Long iIdNuevoPlaneacionCompra) {
		this.iIdNuevoPlaneacionCompra = iIdNuevoPlaneacionCompra;
	}
	
	public Long getidPlaneacionCompraActual() {
		return this.idPlaneacionCompraActual;
	}

	public void setidPlaneacionCompraActual(Long idPlaneacionCompraActual) {
		this.idPlaneacionCompraActual = idPlaneacionCompraActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public PlaneacionCompra getplaneacioncompra() {
		return this.planeacioncompra;
	}

	public void setplaneacioncompra(PlaneacionCompra planeacioncompra) {
		this.planeacioncompra = planeacioncompra;
	}
	
	public PlaneacionCompra getplaneacioncompraAux() {
		return this.planeacioncompraAux;
	}

	public void setplaneacioncompraAux(PlaneacionCompra planeacioncompraAux) {
		this.planeacioncompraAux = planeacioncompraAux;
	}				
	
	public PlaneacionCompra getplaneacioncompraAnterior() {
		return this.planeacioncompraAnterior;
	}

	public void setplaneacioncompraAnterior(PlaneacionCompra planeacioncompraAnterior) {
		this.planeacioncompraAnterior = planeacioncompraAnterior;
	}	
	
	public PlaneacionCompra getplaneacioncompraTotales() {
		return this.planeacioncompraTotales;
	}

	public void setplaneacioncompraTotales(PlaneacionCompra planeacioncompraTotales) {
		this.planeacioncompraTotales = planeacioncompraTotales;
	}	
	
	public PlaneacionCompra getplaneacioncompraBean() {
		return this.planeacioncompraBean;
	}

	public void setplaneacioncompraBean(PlaneacionCompra planeacioncompraBean) {
		this.planeacioncompraBean = planeacioncompraBean;
	}	
	
	public PlaneacionCompraParameterReturnGeneral getplaneacioncompraReturnGeneral() {
		return this.planeacioncompraReturnGeneral;
	}

	public void setplaneacioncompraReturnGeneral(PlaneacionCompraParameterReturnGeneral planeacioncompraReturnGeneral) {
		this.planeacioncompraReturnGeneral = planeacioncompraReturnGeneral;
	}	
	
	
	public Long id_ejercicioFK_IdEjercicio=-1L;

	public Long getid_ejercicioFK_IdEjercicio() {
		return this.id_ejercicioFK_IdEjercicio;
	}

	public void setid_ejercicioFK_IdEjercicio(Long id_ejercicioFK_IdEjercicio) {
		this.id_ejercicioFK_IdEjercicio = id_ejercicioFK_IdEjercicio;
	}

	public Long id_empleadoFK_IdEmpleado=-1L;

	public Long getid_empleadoFK_IdEmpleado() {
		return this.id_empleadoFK_IdEmpleado;
	}

	public void setid_empleadoFK_IdEmpleado(Long id_empleadoFK_IdEmpleado) {
		this.id_empleadoFK_IdEmpleado = id_empleadoFK_IdEmpleado;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_formatoFK_IdFormato=-1L;

	public Long getid_formatoFK_IdFormato() {
		return this.id_formatoFK_IdFormato;
	}

	public void setid_formatoFK_IdFormato(Long id_formatoFK_IdFormato) {
		this.id_formatoFK_IdFormato = id_formatoFK_IdFormato;
	}

	public Long id_mes_finFK_IdMesFin=-1L;

	public Long getid_mes_finFK_IdMesFin() {
		return this.id_mes_finFK_IdMesFin;
	}

	public void setid_mes_finFK_IdMesFin(Long id_mes_finFK_IdMesFin) {
		this.id_mes_finFK_IdMesFin = id_mes_finFK_IdMesFin;
	}

	public Long id_mes_inicioFK_IdMesInicio=-1L;

	public Long getid_mes_inicioFK_IdMesInicio() {
		return this.id_mes_inicioFK_IdMesInicio;
	}

	public void setid_mes_inicioFK_IdMesInicio(Long id_mes_inicioFK_IdMesInicio) {
		this.id_mes_inicioFK_IdMesInicio = id_mes_inicioFK_IdMesInicio;
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

	public Long id_usuarioFK_IdUsuario=-1L;

	public Long getid_usuarioFK_IdUsuario() {
		return this.id_usuarioFK_IdUsuario;
	}

	public void setid_usuarioFK_IdUsuario(Long id_usuarioFK_IdUsuario) {
		this.id_usuarioFK_IdUsuario = id_usuarioFK_IdUsuario;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public PlaneacionCompraLogic getPlaneacionCompraLogic()	{		
		return planeacioncompraLogic;
	}

	public void setPlaneacionCompraLogic(PlaneacionCompraLogic planeacioncompraLogic) {
		this.planeacioncompraLogic = planeacioncompraLogic;
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
	
	public Boolean getIsEsNuevoPlaneacionCompra() {
		return isEsNuevoPlaneacionCompra;
	}

	public void setIsEsNuevoPlaneacionCompra(Boolean isEsNuevoPlaneacionCompra) {
		this.isEsNuevoPlaneacionCompra = isEsNuevoPlaneacionCompra;
	}

	public Boolean getEsParaAccionDesdeFormularioPlaneacionCompra() {
		return esParaAccionDesdeFormularioPlaneacionCompra;
	}
	
	public void setEsParaAccionDesdeFormularioPlaneacionCompra(Boolean esParaAccionDesdeFormularioPlaneacionCompra) {
		this.esParaAccionDesdeFormularioPlaneacionCompra = esParaAccionDesdeFormularioPlaneacionCompra;
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

			if(this.planeacioncompraSessionBean==null) {
				this.planeacioncompraSessionBean=new PlaneacionCompraSessionBean();
			}

			if(!this.planeacioncompraSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(planeacioncompraSessionBean.getlidEmpresaActual());
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

			if(this.planeacioncompraSessionBean==null) {
				this.planeacioncompraSessionBean=new PlaneacionCompraSessionBean();
			}

			if(!this.planeacioncompraSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(planeacioncompraSessionBean.getlidSucursalActual());
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

			if(this.planeacioncompraSessionBean==null) {
				this.planeacioncompraSessionBean=new PlaneacionCompraSessionBean();
			}

			if(!this.planeacioncompraSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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
					ejercicioLogic.getEntityWithConnection(planeacioncompraSessionBean.getlidEjercicioActual());
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

			if(this.planeacioncompraSessionBean==null) {
				this.planeacioncompraSessionBean=new PlaneacionCompraSessionBean();
			}

			if(!this.planeacioncompraSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
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
					periodoLogic.getEntityWithConnection(planeacioncompraSessionBean.getlidPeriodoActual());
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

	public void cargarCombosEmpleadosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empleadosForeignKey=new ArrayList<Empleado>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpleadoLogic empleadoLogic=new EmpleadoLogic();

			//empleadoLogic.getEmpleadoDataAccess().setIsForForeingKeyData(true);

			if(this.planeacioncompraSessionBean==null) {
				this.planeacioncompraSessionBean=new PlaneacionCompraSessionBean();
			}

			if(!this.planeacioncompraSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empleadoLogic.getEmpleadoDataAccess().setIsForForeingKeyData(true);

					empleadoLogic.getTodosEmpleadosWithConnection(sFinalQuery,new Pagination());

					this.empleadosForeignKey=empleadoLogic.getEmpleados();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpleado(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoLogic.getEntityWithConnection(planeacioncompraSessionBean.getlidEmpleadoActual());
					this.empleadosForeignKey.add(empleadoLogic.getEmpleado());
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

	public void cargarCombosUsuariosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.usuariosForeignKey=new ArrayList<Usuario>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			UsuarioLogic usuarioLogic=new UsuarioLogic();

			//usuarioLogic.getUsuarioDataAccess().setIsForForeingKeyData(true);

			if(this.planeacioncompraSessionBean==null) {
				this.planeacioncompraSessionBean=new PlaneacionCompraSessionBean();
			}

			if(!this.planeacioncompraSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//usuarioLogic.getUsuarioDataAccess().setIsForForeingKeyData(true);

					usuarioLogic.getTodosUsuariosWithConnection(sFinalQuery,new Pagination());

					this.usuariosForeignKey=usuarioLogic.getUsuarios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaUsuario(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					usuarioLogic.getEntityWithConnection(planeacioncompraSessionBean.getlidUsuarioActual());
					this.usuariosForeignKey.add(usuarioLogic.getUsuario());
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

	public void cargarCombosFormatosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.formatosForeignKey=new ArrayList<Formato>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			FormatoLogic formatoLogic=new FormatoLogic();

			//formatoLogic.getFormatoDataAccess().setIsForForeingKeyData(true);

			if(this.planeacioncompraSessionBean==null) {
				this.planeacioncompraSessionBean=new PlaneacionCompraSessionBean();
			}

			if(!this.planeacioncompraSessionBean.getisBusquedaDesdeForeignKeySesionFormato()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//formatoLogic.getFormatoDataAccess().setIsForForeingKeyData(true);

					formatoLogic.getTodosFormatosWithConnection(sFinalQuery,new Pagination());

					this.formatosForeignKey=formatoLogic.getFormatos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaFormato(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					formatoLogic.getEntityWithConnection(planeacioncompraSessionBean.getlidFormatoActual());
					this.formatosForeignKey.add(formatoLogic.getFormato());
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

	public void cargarCombosMesIniciosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.mesiniciosForeignKey=new ArrayList<Mes>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			MesLogic mesLogic=new MesLogic();

			//mesLogic.getMesDataAccess().setIsForForeingKeyData(true);

			if(this.planeacioncompraSessionBean==null) {
				this.planeacioncompraSessionBean=new PlaneacionCompraSessionBean();
			}

			if(!this.planeacioncompraSessionBean.getisBusquedaDesdeForeignKeySesionMesInicio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//mesinicioLogic.getMesDataAccess().setIsForForeingKeyData(true);

					mesLogic.getTodosMessWithConnection(sFinalQuery,new Pagination());

					this.mesiniciosForeignKey=mesLogic.getMess();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaMesInicio(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					mesLogic.getEntityWithConnection(planeacioncompraSessionBean.getlidMesInicioActual());
					this.mesiniciosForeignKey.add(mesLogic.getMes());
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

	public void cargarCombosMesFinsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.mesfinsForeignKey=new ArrayList<Mes>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			MesLogic mesLogic=new MesLogic();

			//mesLogic.getMesDataAccess().setIsForForeingKeyData(true);

			if(this.planeacioncompraSessionBean==null) {
				this.planeacioncompraSessionBean=new PlaneacionCompraSessionBean();
			}

			if(!this.planeacioncompraSessionBean.getisBusquedaDesdeForeignKeySesionMesFin()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//mesfinLogic.getMesDataAccess().setIsForForeingKeyData(true);

					mesLogic.getTodosMessWithConnection(sFinalQuery,new Pagination());

					this.mesfinsForeignKey=mesLogic.getMess();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaMesFin(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					mesLogic.getEntityWithConnection(planeacioncompraSessionBean.getlidMesFinActual());
					this.mesfinsForeignKey.add(mesLogic.getMes());
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

					if(this.planeacioncompra!=null) {
						this.planeacioncompra.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) {
						this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_empresaPlaneacionCompra.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaPlaneacionCompra.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) {
						if(this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_empresaPlaneacionCompra.getItemCount()>0) {
							this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_empresaPlaneacionCompra.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaPlaneacionCompraGenerico)throws Exception
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
				jComboBoxid_empresaPlaneacionCompraGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaPlaneacionCompraGenerico!=null && jComboBoxid_empresaPlaneacionCompraGenerico.getItemCount()>0) {
					jComboBoxid_empresaPlaneacionCompraGenerico.setSelectedIndex(0);
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

					if(this.planeacioncompra!=null) {
						this.planeacioncompra.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) {
						this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_sucursalPlaneacionCompra.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalPlaneacionCompra.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) {
						if(this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_sucursalPlaneacionCompra.getItemCount()>0) {
							this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_sucursalPlaneacionCompra.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalPlaneacionCompraGenerico)throws Exception
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
				jComboBoxid_sucursalPlaneacionCompraGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalPlaneacionCompraGenerico!=null && jComboBoxid_sucursalPlaneacionCompraGenerico.getItemCount()>0) {
					jComboBoxid_sucursalPlaneacionCompraGenerico.setSelectedIndex(0);
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

					if(this.planeacioncompra!=null) {
						this.planeacioncompra.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) {
						this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_ejercicioPlaneacionCompra.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioPlaneacionCompra.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) {
						if(this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_ejercicioPlaneacionCompra.getItemCount()>0) {
							this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_ejercicioPlaneacionCompra.setSelectedIndex(0);
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
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioPlaneacionCompraGenerico)throws Exception
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
				jComboBoxid_ejercicioPlaneacionCompraGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioPlaneacionCompraGenerico!=null && jComboBoxid_ejercicioPlaneacionCompraGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioPlaneacionCompraGenerico.setSelectedIndex(0);
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

					if(this.planeacioncompra!=null) {
						this.planeacioncompra.setPeriodo(periodoTemp);
					}

					if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) {
						this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_periodoPlaneacionCompra.setSelectedItem(periodoTemp);
					}
				} else {
					//jComboBoxid_periodoPlaneacionCompra.setSelectedItem(periodoTemp);
					if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) {
						if(this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_periodoPlaneacionCompra.getItemCount()>0) {
							this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_periodoPlaneacionCompra.setSelectedIndex(0);
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
	public void setActualPeriodoForeignKeyGenerico(Long idPeriodoSeleccionado,JComboBox jComboBoxid_periodoPlaneacionCompraGenerico)throws Exception
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
				jComboBoxid_periodoPlaneacionCompraGenerico.setSelectedItem(periodoTemp);
			} else {
				if(jComboBoxid_periodoPlaneacionCompraGenerico!=null && jComboBoxid_periodoPlaneacionCompraGenerico.getItemCount()>0) {
					jComboBoxid_periodoPlaneacionCompraGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEmpleadoForeignKey(Long idEmpleadoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empleado  empleadoTemp=null;

			for(Empleado empleadoAux:empleadosForeignKey) {
				if(empleadoAux.getId()!=null && empleadoAux.getId().equals(idEmpleadoSeleccionado)) {
					empleadoTemp=empleadoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empleadoTemp!=null) {

					if(this.planeacioncompra!=null) {
						this.planeacioncompra.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) {
						this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_empleadoPlaneacionCompra.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoPlaneacionCompra.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) {
						if(this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_empleadoPlaneacionCompra.getItemCount()>0) {
							this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_empleadoPlaneacionCompra.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoFK_IdEmpleadoPlaneacionCompra!=null) {
						jComboBoxid_empleadoFK_IdEmpleadoPlaneacionCompra.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoFK_IdEmpleadoPlaneacionCompra!=null) {
							//jComboBoxid_empleadoFK_IdEmpleadoPlaneacionCompra.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoFK_IdEmpleadoPlaneacionCompra.getItemCount()>0) {
								jComboBoxid_empleadoFK_IdEmpleadoPlaneacionCompra.setSelectedIndex(0);
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

	public String getActualEmpleadoForeignKeyDescripcion(Long idEmpleadoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empleado  empleadoTemp=null;

			for(Empleado empleadoAux:empleadosForeignKey) {
				if(empleadoAux.getId()!=null && empleadoAux.getId().equals(idEmpleadoSeleccionado)) {
					empleadoTemp=empleadoAux;
					break;
				}
			}


			sDescripcion=EmpleadoConstantesFunciones.getEmpleadoDescripcion(empleadoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoPlaneacionCompraGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoTemp=null;

			for(Empleado empleadoAux:empleadosForeignKey) {
				if(empleadoAux.getId()!=null && empleadoAux.getId().equals(idEmpleadoSeleccionado)) {
					empleadoTemp=empleadoAux;
					break;
				}
			}

			if(empleadoTemp!=null) {
				jComboBoxid_empleadoPlaneacionCompraGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoPlaneacionCompraGenerico!=null && jComboBoxid_empleadoPlaneacionCompraGenerico.getItemCount()>0) {
					jComboBoxid_empleadoPlaneacionCompraGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualUsuarioForeignKey(Long idUsuarioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Usuario  usuarioTemp=null;

			for(Usuario usuarioAux:usuariosForeignKey) {
				if(usuarioAux.getId()!=null && usuarioAux.getId().equals(idUsuarioSeleccionado)) {
					usuarioTemp=usuarioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(usuarioTemp!=null) {

					if(this.planeacioncompra!=null) {
						this.planeacioncompra.setUsuario(usuarioTemp);
					}

					if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) {
						this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_usuarioPlaneacionCompra.setSelectedItem(usuarioTemp);
					}
				} else {
					//jComboBoxid_usuarioPlaneacionCompra.setSelectedItem(usuarioTemp);
					if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) {
						if(this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_usuarioPlaneacionCompra.getItemCount()>0) {
							this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_usuarioPlaneacionCompra.setSelectedIndex(0);
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

	public String getActualUsuarioForeignKeyDescripcion(Long idUsuarioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Usuario  usuarioTemp=null;

			for(Usuario usuarioAux:usuariosForeignKey) {
				if(usuarioAux.getId()!=null && usuarioAux.getId().equals(idUsuarioSeleccionado)) {
					usuarioTemp=usuarioAux;
					break;
				}
			}


			sDescripcion=UsuarioConstantesFunciones.getUsuarioDescripcion(usuarioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualUsuarioForeignKeyGenerico(Long idUsuarioSeleccionado,JComboBox jComboBoxid_usuarioPlaneacionCompraGenerico)throws Exception
	{
		try
		{
			Usuario  usuarioTemp=null;

			for(Usuario usuarioAux:usuariosForeignKey) {
				if(usuarioAux.getId()!=null && usuarioAux.getId().equals(idUsuarioSeleccionado)) {
					usuarioTemp=usuarioAux;
					break;
				}
			}

			if(usuarioTemp!=null) {
				jComboBoxid_usuarioPlaneacionCompraGenerico.setSelectedItem(usuarioTemp);
			} else {
				if(jComboBoxid_usuarioPlaneacionCompraGenerico!=null && jComboBoxid_usuarioPlaneacionCompraGenerico.getItemCount()>0) {
					jComboBoxid_usuarioPlaneacionCompraGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualFormatoForeignKey(Long idFormatoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Formato  formatoTemp=null;

			for(Formato formatoAux:formatosForeignKey) {
				if(formatoAux.getId()!=null && formatoAux.getId().equals(idFormatoSeleccionado)) {
					formatoTemp=formatoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(formatoTemp!=null) {

					if(this.planeacioncompra!=null) {
						this.planeacioncompra.setFormato(formatoTemp);
					}

					if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) {
						this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_formatoPlaneacionCompra.setSelectedItem(formatoTemp);
					}
				} else {
					//jComboBoxid_formatoPlaneacionCompra.setSelectedItem(formatoTemp);
					if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) {
						if(this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_formatoPlaneacionCompra.getItemCount()>0) {
							this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_formatoPlaneacionCompra.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdFormato") || sFormularioTipoBusqueda.equals("Todos")){
					if(formatoTemp!=null && jComboBoxid_formatoFK_IdFormatoPlaneacionCompra!=null) {
						jComboBoxid_formatoFK_IdFormatoPlaneacionCompra.setSelectedItem(formatoTemp);
					} else {
						if(jComboBoxid_formatoFK_IdFormatoPlaneacionCompra!=null) {
							//jComboBoxid_formatoFK_IdFormatoPlaneacionCompra.setSelectedItem(formatoTemp);
							if(jComboBoxid_formatoFK_IdFormatoPlaneacionCompra.getItemCount()>0) {
								jComboBoxid_formatoFK_IdFormatoPlaneacionCompra.setSelectedIndex(0);
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

	public String getActualFormatoForeignKeyDescripcion(Long idFormatoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Formato  formatoTemp=null;

			for(Formato formatoAux:formatosForeignKey) {
				if(formatoAux.getId()!=null && formatoAux.getId().equals(idFormatoSeleccionado)) {
					formatoTemp=formatoAux;
					break;
				}
			}


			sDescripcion=FormatoConstantesFunciones.getFormatoDescripcion(formatoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualFormatoForeignKeyGenerico(Long idFormatoSeleccionado,JComboBox jComboBoxid_formatoPlaneacionCompraGenerico)throws Exception
	{
		try
		{
			Formato  formatoTemp=null;

			for(Formato formatoAux:formatosForeignKey) {
				if(formatoAux.getId()!=null && formatoAux.getId().equals(idFormatoSeleccionado)) {
					formatoTemp=formatoAux;
					break;
				}
			}

			if(formatoTemp!=null) {
				jComboBoxid_formatoPlaneacionCompraGenerico.setSelectedItem(formatoTemp);
			} else {
				if(jComboBoxid_formatoPlaneacionCompraGenerico!=null && jComboBoxid_formatoPlaneacionCompraGenerico.getItemCount()>0) {
					jComboBoxid_formatoPlaneacionCompraGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualMesInicioForeignKey(Long idMesInicioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Mes  mesinicioTemp=null;

			for(Mes mesinicioAux:mesiniciosForeignKey) {
				if(mesinicioAux.getId()!=null && mesinicioAux.getId().equals(idMesInicioSeleccionado)) {
					mesinicioTemp=mesinicioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(mesinicioTemp!=null) {

					if(this.planeacioncompra!=null) {
						this.planeacioncompra.setMesInicio(mesinicioTemp);
					}

					if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) {
						this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_mes_inicioPlaneacionCompra.setSelectedItem(mesinicioTemp);
					}
				} else {
					//jComboBoxid_mes_inicioPlaneacionCompra.setSelectedItem(mesinicioTemp);
					if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) {
						if(this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_mes_inicioPlaneacionCompra.getItemCount()>0) {
							this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_mes_inicioPlaneacionCompra.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdMesInicio") || sFormularioTipoBusqueda.equals("Todos")){
					if(mesinicioTemp!=null && jComboBoxid_mes_inicioFK_IdMesInicioPlaneacionCompra!=null) {
						jComboBoxid_mes_inicioFK_IdMesInicioPlaneacionCompra.setSelectedItem(mesinicioTemp);
					} else {
						if(jComboBoxid_mes_inicioFK_IdMesInicioPlaneacionCompra!=null) {
							//jComboBoxid_mes_inicioFK_IdMesInicioPlaneacionCompra.setSelectedItem(mesinicioTemp);
							if(jComboBoxid_mes_inicioFK_IdMesInicioPlaneacionCompra.getItemCount()>0) {
								jComboBoxid_mes_inicioFK_IdMesInicioPlaneacionCompra.setSelectedIndex(0);
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

	public String getActualMesInicioForeignKeyDescripcion(Long idMesInicioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Mes  mesinicioTemp=null;

			for(Mes mesinicioAux:mesiniciosForeignKey) {
				if(mesinicioAux.getId()!=null && mesinicioAux.getId().equals(idMesInicioSeleccionado)) {
					mesinicioTemp=mesinicioAux;
					break;
				}
			}


			sDescripcion=MesConstantesFunciones.getMesDescripcion(mesinicioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualMesInicioForeignKeyGenerico(Long idMesInicioSeleccionado,JComboBox jComboBoxid_mes_inicioPlaneacionCompraGenerico)throws Exception
	{
		try
		{
			Mes  mesinicioTemp=null;

			for(Mes mesinicioAux:mesiniciosForeignKey) {
				if(mesinicioAux.getId()!=null && mesinicioAux.getId().equals(idMesInicioSeleccionado)) {
					mesinicioTemp=mesinicioAux;
					break;
				}
			}

			if(mesinicioTemp!=null) {
				jComboBoxid_mes_inicioPlaneacionCompraGenerico.setSelectedItem(mesinicioTemp);
			} else {
				if(jComboBoxid_mes_inicioPlaneacionCompraGenerico!=null && jComboBoxid_mes_inicioPlaneacionCompraGenerico.getItemCount()>0) {
					jComboBoxid_mes_inicioPlaneacionCompraGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualMesFinForeignKey(Long idMesFinSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Mes  mesfinTemp=null;

			for(Mes mesfinAux:mesfinsForeignKey) {
				if(mesfinAux.getId()!=null && mesfinAux.getId().equals(idMesFinSeleccionado)) {
					mesfinTemp=mesfinAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(mesfinTemp!=null) {

					if(this.planeacioncompra!=null) {
						this.planeacioncompra.setMesFin(mesfinTemp);
					}

					if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) {
						this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_mes_finPlaneacionCompra.setSelectedItem(mesfinTemp);
					}
				} else {
					//jComboBoxid_mes_finPlaneacionCompra.setSelectedItem(mesfinTemp);
					if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) {
						if(this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_mes_finPlaneacionCompra.getItemCount()>0) {
							this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_mes_finPlaneacionCompra.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdMesFin") || sFormularioTipoBusqueda.equals("Todos")){
					if(mesfinTemp!=null && jComboBoxid_mes_finFK_IdMesFinPlaneacionCompra!=null) {
						jComboBoxid_mes_finFK_IdMesFinPlaneacionCompra.setSelectedItem(mesfinTemp);
					} else {
						if(jComboBoxid_mes_finFK_IdMesFinPlaneacionCompra!=null) {
							//jComboBoxid_mes_finFK_IdMesFinPlaneacionCompra.setSelectedItem(mesfinTemp);
							if(jComboBoxid_mes_finFK_IdMesFinPlaneacionCompra.getItemCount()>0) {
								jComboBoxid_mes_finFK_IdMesFinPlaneacionCompra.setSelectedIndex(0);
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

	public String getActualMesFinForeignKeyDescripcion(Long idMesFinSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Mes  mesfinTemp=null;

			for(Mes mesfinAux:mesfinsForeignKey) {
				if(mesfinAux.getId()!=null && mesfinAux.getId().equals(idMesFinSeleccionado)) {
					mesfinTemp=mesfinAux;
					break;
				}
			}


			sDescripcion=MesConstantesFunciones.getMesDescripcion(mesfinTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualMesFinForeignKeyGenerico(Long idMesFinSeleccionado,JComboBox jComboBoxid_mes_finPlaneacionCompraGenerico)throws Exception
	{
		try
		{
			Mes  mesfinTemp=null;

			for(Mes mesfinAux:mesfinsForeignKey) {
				if(mesfinAux.getId()!=null && mesfinAux.getId().equals(idMesFinSeleccionado)) {
					mesfinTemp=mesfinAux;
					break;
				}
			}

			if(mesfinTemp!=null) {
				jComboBoxid_mes_finPlaneacionCompraGenerico.setSelectedItem(mesfinTemp);
			} else {
				if(jComboBoxid_mes_finPlaneacionCompraGenerico!=null && jComboBoxid_mes_finPlaneacionCompraGenerico.getItemCount()>0) {
					jComboBoxid_mes_finPlaneacionCompraGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(PlaneacionCompra planeacioncompra,JComboBox jComboBoxid_empresaPlaneacionCompraGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaPlaneacionCompraGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_empresaPlaneacionCompra.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaPlaneacionCompraGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				planeacioncompra.setid_empresa(empresaAux.getId());
				planeacioncompra.setempresa_descripcion(PlaneacionCompraConstantesFunciones.getEmpresaDescripcion(empresaAux));
				planeacioncompra.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(PlaneacionCompra planeacioncompra,JComboBox jComboBoxid_sucursalPlaneacionCompraGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalPlaneacionCompraGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_sucursalPlaneacionCompra.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalPlaneacionCompraGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				planeacioncompra.setid_sucursal(sucursalAux.getId());
				planeacioncompra.setsucursal_descripcion(PlaneacionCompraConstantesFunciones.getSucursalDescripcion(sucursalAux));
				planeacioncompra.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(PlaneacionCompra planeacioncompra,JComboBox jComboBoxid_ejercicioPlaneacionCompraGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioPlaneacionCompraGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_ejercicioPlaneacionCompra.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioPlaneacionCompraGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				planeacioncompra.setid_ejercicio(ejercicioAux.getId());
				planeacioncompra.setejercicio_descripcion(PlaneacionCompraConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				planeacioncompra.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPeriodoForeignKey(PlaneacionCompra planeacioncompra,JComboBox jComboBoxid_periodoPlaneacionCompraGenerico)throws Exception
	{
		try
		{
			Periodo  periodoAux=new Periodo();

			if(jComboBoxid_periodoPlaneacionCompraGenerico==null) {
				periodoAux=(Periodo)this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_periodoPlaneacionCompra.getSelectedItem();
			} else {
				periodoAux=(Periodo)jComboBoxid_periodoPlaneacionCompraGenerico.getSelectedItem();
			}

			if(periodoAux!=null && periodoAux.getId()!=null) {
				if(periodoAux.getid_estado_periodo().equals(0L)) {
					throw new Exception("Periodo INACTIVO, NO PUEDE GUARDAR LA INFORMACION CONSULTE CON EL ADMINISTRADOR");
				}

				planeacioncompra.setid_periodo(periodoAux.getId());
				planeacioncompra.setperiodo_descripcion(PlaneacionCompraConstantesFunciones.getPeriodoDescripcion(periodoAux));
				planeacioncompra.setPeriodo(periodoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(PlaneacionCompra planeacioncompra,JComboBox jComboBoxid_empleadoPlaneacionCompraGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoPlaneacionCompraGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_empleadoPlaneacionCompra.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoPlaneacionCompraGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				planeacioncompra.setid_empleado(empleadoAux.getId());
				planeacioncompra.setempleado_descripcion(PlaneacionCompraConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				planeacioncompra.setEmpleado(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUsuarioForeignKey(PlaneacionCompra planeacioncompra,JComboBox jComboBoxid_usuarioPlaneacionCompraGenerico)throws Exception
	{
		try
		{
			Usuario  usuarioAux=new Usuario();

			if(jComboBoxid_usuarioPlaneacionCompraGenerico==null) {
				usuarioAux=(Usuario)this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_usuarioPlaneacionCompra.getSelectedItem();
			} else {
				usuarioAux=(Usuario)jComboBoxid_usuarioPlaneacionCompraGenerico.getSelectedItem();
			}

			if(usuarioAux!=null && usuarioAux.getId()!=null) {
				planeacioncompra.setid_usuario(usuarioAux.getId());
				planeacioncompra.setusuario_descripcion(PlaneacionCompraConstantesFunciones.getUsuarioDescripcion(usuarioAux));
				planeacioncompra.setUsuario(usuarioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarFormatoForeignKey(PlaneacionCompra planeacioncompra,JComboBox jComboBoxid_formatoPlaneacionCompraGenerico)throws Exception
	{
		try
		{
			Formato  formatoAux=new Formato();

			if(jComboBoxid_formatoPlaneacionCompraGenerico==null) {
				formatoAux=(Formato)this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_formatoPlaneacionCompra.getSelectedItem();
			} else {
				formatoAux=(Formato)jComboBoxid_formatoPlaneacionCompraGenerico.getSelectedItem();
			}

			if(formatoAux!=null && formatoAux.getId()!=null) {
				planeacioncompra.setid_formato(formatoAux.getId());
				planeacioncompra.setformato_descripcion(PlaneacionCompraConstantesFunciones.getFormatoDescripcion(formatoAux));
				planeacioncompra.setFormato(formatoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMesInicioForeignKey(PlaneacionCompra planeacioncompra,JComboBox jComboBoxid_mes_inicioPlaneacionCompraGenerico)throws Exception
	{
		try
		{
			Mes  mesAux=new Mes();

			if(jComboBoxid_mes_inicioPlaneacionCompraGenerico==null) {
				mesAux=(Mes)this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_mes_inicioPlaneacionCompra.getSelectedItem();
			} else {
				mesAux=(Mes)jComboBoxid_mes_inicioPlaneacionCompraGenerico.getSelectedItem();
			}

			if(mesAux!=null && mesAux.getId()!=null) {
				planeacioncompra.setid_mes_inicio(mesAux.getId());
				planeacioncompra.setmesinicio_descripcion(PlaneacionCompraConstantesFunciones.getMesInicioDescripcion(mesAux));
				planeacioncompra.setMesInicio(mesAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMesFinForeignKey(PlaneacionCompra planeacioncompra,JComboBox jComboBoxid_mes_finPlaneacionCompraGenerico)throws Exception
	{
		try
		{
			Mes  mesAux=new Mes();

			if(jComboBoxid_mes_finPlaneacionCompraGenerico==null) {
				mesAux=(Mes)this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_mes_finPlaneacionCompra.getSelectedItem();
			} else {
				mesAux=(Mes)jComboBoxid_mes_finPlaneacionCompraGenerico.getSelectedItem();
			}

			if(mesAux!=null && mesAux.getId()!=null) {
				planeacioncompra.setid_mes_fin(mesAux.getId());
				planeacioncompra.setmesfin_descripcion(PlaneacionCompraConstantesFunciones.getMesFinDescripcion(mesAux));
				planeacioncompra.setMesFin(mesAux);			}
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

					if(!PlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) { 
							this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_empresaPlaneacionCompra.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_empresaPlaneacionCompra.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) { 
					}

					if(!PlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) { 
							this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_sucursalPlaneacionCompra.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_sucursalPlaneacionCompra.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) { 
					}

					if(!PlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) { 
							this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_ejercicioPlaneacionCompra.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_ejercicioPlaneacionCompra.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) { 
					}

					if(!PlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) { 
							this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_periodoPlaneacionCompra.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_periodoPlaneacionCompra.addItem(periodo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) { 
					}

					if(!PlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpleadosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpleado=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) { 
							this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_empleadoPlaneacionCompra.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_empleadoPlaneacionCompra.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) { 
					}

					if(!PlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoPlaneacionCompra.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoFK_IdEmpleadoPlaneacionCompra.addItem(empleado);
							}
						}

						if(!PlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameUsuariosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingUsuario=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) { 
							this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_usuarioPlaneacionCompra.removeAllItems();

							for(Usuario usuario:this.usuariosForeignKey) {
								this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_usuarioPlaneacionCompra.addItem(usuario);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) { 
					}

					if(!PlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameFormatosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingFormato=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) { 
							this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_formatoPlaneacionCompra.removeAllItems();

							for(Formato formato:this.formatosForeignKey) {
								this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_formatoPlaneacionCompra.addItem(formato);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) { 
					}

					if(!PlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdFormato") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_formatoFK_IdFormatoPlaneacionCompra.removeAllItems();

							for(Formato formato:this.formatosForeignKey) {
								this.jComboBoxid_formatoFK_IdFormatoPlaneacionCompra.addItem(formato);
							}
						}

						if(!PlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameMesIniciosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingMes=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) { 
							this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_mes_inicioPlaneacionCompra.removeAllItems();

							for(Mes mesinicio:this.mesiniciosForeignKey) {
								this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_mes_inicioPlaneacionCompra.addItem(mesinicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) { 
					}

					if(!PlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdMesInicio") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_mes_inicioFK_IdMesInicioPlaneacionCompra.removeAllItems();

							for(Mes mesinicio:this.mesiniciosForeignKey) {
								this.jComboBoxid_mes_inicioFK_IdMesInicioPlaneacionCompra.addItem(mesinicio);
							}
						}

						if(!PlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameMesFinsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingMes=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) { 
							this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_mes_finPlaneacionCompra.removeAllItems();

							for(Mes mesfin:this.mesfinsForeignKey) {
								this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_mes_finPlaneacionCompra.addItem(mesfin);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) { 
					}

					if(!PlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdMesFin") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_mes_finFK_IdMesFinPlaneacionCompra.removeAllItems();

							for(Mes mesfin:this.mesfinsForeignKey) {
								this.jComboBoxid_mes_finFK_IdMesFinPlaneacionCompra.addItem(mesfin);
							}
						}

						if(!PlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) {
							this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_empresaPlaneacionCompra.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) {
							this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_empresaPlaneacionCompra.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) {
							this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_sucursalPlaneacionCompra.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) {
							this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_sucursalPlaneacionCompra.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) {
							this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_ejercicioPlaneacionCompra.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) {
							this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_ejercicioPlaneacionCompra.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) {
							this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_periodoPlaneacionCompra.setSelectedItem(periodo);
						}
					} else {
						if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) {
							this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_periodoPlaneacionCompra.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameEmpleadoForeignKey(Empleado empleado,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) {
							this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_empleadoPlaneacionCompra.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) {
							this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_empleadoPlaneacionCompra.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoFK_IdEmpleadoPlaneacionCompra.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoPlaneacionCompra.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameUsuarioForeignKey(Usuario usuario,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) {
							this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_usuarioPlaneacionCompra.setSelectedItem(usuario);
						}
					} else {
						if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) {
							this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_usuarioPlaneacionCompra.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameFormatoForeignKey(Formato formato,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) {
							this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_formatoPlaneacionCompra.setSelectedItem(formato);
						}
					} else {
						if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) {
							this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_formatoPlaneacionCompra.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_formatoFK_IdFormatoPlaneacionCompra.setSelectedItem(formato);
						} else {
							this.jComboBoxid_formatoFK_IdFormatoPlaneacionCompra.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameMesInicioForeignKey(Mes mesinicio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) {
							this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_mes_inicioPlaneacionCompra.setSelectedItem(mesinicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) {
							this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_mes_inicioPlaneacionCompra.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_mes_inicioFK_IdMesInicioPlaneacionCompra.setSelectedItem(mesinicio);
						} else {
							this.jComboBoxid_mes_inicioFK_IdMesInicioPlaneacionCompra.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameMesFinForeignKey(Mes mesfin,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) {
							this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_mes_finPlaneacionCompra.setSelectedItem(mesfin);
						}
					} else {
						if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) {
							this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_mes_finPlaneacionCompra.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_mes_finFK_IdMesFinPlaneacionCompra.setSelectedItem(mesfin);
						} else {
							this.jComboBoxid_mes_finFK_IdMesFinPlaneacionCompra.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesPlaneacionCompra() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			PlaneacionCompraConstantesFunciones.refrescarForeignKeysDescripcionesPlaneacionCompra(this.planeacioncompraLogic.getPlaneacionCompras());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			PlaneacionCompraConstantesFunciones.refrescarForeignKeysDescripcionesPlaneacionCompra(this.planeacioncompras);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Ejercicio.class));
		classes.add(new Classe(Periodo.class));
		classes.add(new Classe(Empleado.class));
		classes.add(new Classe(Usuario.class));
		classes.add(new Classe(Formato.class));
		classes.add(new Classe(Mes.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//planeacioncompraLogic.setPlaneacionCompras(this.planeacioncompras);
			planeacioncompraLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public PlaneacionCompraParameterReturnGeneral getPlaneacionCompraParameterGeneral() {
		return this.planeacioncompraParameterGeneral;
	}
	
	public void setPlaneacionCompraParameterGeneral(PlaneacionCompraParameterReturnGeneral planeacioncompraParameterGeneral) {
		this.planeacioncompraParameterGeneral = planeacioncompraParameterGeneral;
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
	
	public Boolean getIsPermisoTodoPlaneacionCompra() {
		return isPermisoTodoPlaneacionCompra;
	}

	public void setIsPermisoTodoPlaneacionCompra(Boolean isPermisoTodoPlaneacionCompra) {
		this.isPermisoTodoPlaneacionCompra = isPermisoTodoPlaneacionCompra;
	}

	public Boolean getIsPermisoNuevoPlaneacionCompra() {
		return isPermisoNuevoPlaneacionCompra;
	}

	public void setIsPermisoNuevoPlaneacionCompra(Boolean isPermisoNuevoPlaneacionCompra) {
		this.isPermisoNuevoPlaneacionCompra = isPermisoNuevoPlaneacionCompra;
	}

	public Boolean getIsPermisoActualizarPlaneacionCompra() {
		return isPermisoActualizarPlaneacionCompra;
	}

	public void setIsPermisoActualizarPlaneacionCompra(Boolean isPermisoActualizarPlaneacionCompra) {
		this.isPermisoActualizarPlaneacionCompra = isPermisoActualizarPlaneacionCompra;
	}

	public Boolean getIsPermisoEliminarPlaneacionCompra() {
		return isPermisoEliminarPlaneacionCompra;
	}

	public void setIsPermisoEliminarPlaneacionCompra(Boolean isPermisoEliminarPlaneacionCompra) {
		this.isPermisoEliminarPlaneacionCompra = isPermisoEliminarPlaneacionCompra;
	}

	public Boolean getIsPermisoGuardarCambiosPlaneacionCompra() {
		return isPermisoGuardarCambiosPlaneacionCompra;
	}

	public void setIsPermisoGuardarCambiosPlaneacionCompra(Boolean isPermisoGuardarCambiosPlaneacionCompra) {
		this.isPermisoGuardarCambiosPlaneacionCompra = isPermisoGuardarCambiosPlaneacionCompra;
	}
	
	public Boolean getIsPermisoConsultaPlaneacionCompra() {
		return isPermisoConsultaPlaneacionCompra;
	}

	public void setIsPermisoConsultaPlaneacionCompra(Boolean isPermisoConsultaPlaneacionCompra) {
		this.isPermisoConsultaPlaneacionCompra = isPermisoConsultaPlaneacionCompra;
	}

	public Boolean getIsPermisoBusquedaPlaneacionCompra() {
		return isPermisoBusquedaPlaneacionCompra;
	}

	public void setIsPermisoBusquedaPlaneacionCompra(Boolean isPermisoBusquedaPlaneacionCompra) {
		this.isPermisoBusquedaPlaneacionCompra = isPermisoBusquedaPlaneacionCompra;
	}

	public Boolean getIsPermisoReportePlaneacionCompra() {
		return isPermisoReportePlaneacionCompra;
	}

	public void setIsPermisoReportePlaneacionCompra(Boolean isPermisoReportePlaneacionCompra) {
		this.isPermisoReportePlaneacionCompra = isPermisoReportePlaneacionCompra;
	}
	
	public Boolean getIsPermisoPaginacionMedioPlaneacionCompra() {
		return isPermisoPaginacionMedioPlaneacionCompra;
	}

	public void setIsPermisoPaginacionMedioPlaneacionCompra(Boolean isPermisoPaginacionMedioPlaneacionCompra) {
		this.isPermisoPaginacionMedioPlaneacionCompra = isPermisoPaginacionMedioPlaneacionCompra;
	}
	
	public Boolean getIsPermisoPaginacionTodoPlaneacionCompra() {
		return isPermisoPaginacionTodoPlaneacionCompra;
	}

	public void setIsPermisoPaginacionTodoPlaneacionCompra(Boolean isPermisoPaginacionTodoPlaneacionCompra) {
		this.isPermisoPaginacionTodoPlaneacionCompra = isPermisoPaginacionTodoPlaneacionCompra;
	}
	
	public Boolean getIsPermisoPaginacionAltoPlaneacionCompra() {
		return isPermisoPaginacionAltoPlaneacionCompra;
	}

	public void setIsPermisoPaginacionAltoPlaneacionCompra(Boolean isPermisoPaginacionAltoPlaneacionCompra) {
		this.isPermisoPaginacionAltoPlaneacionCompra = isPermisoPaginacionAltoPlaneacionCompra;
	}
	
	public Boolean getIsPermisoCopiarPlaneacionCompra() {
		return isPermisoCopiarPlaneacionCompra;
	}

	public void setIsPermisoCopiarPlaneacionCompra(Boolean isPermisoCopiarPlaneacionCompra) {
		this.isPermisoCopiarPlaneacionCompra = isPermisoCopiarPlaneacionCompra;
	}
	
	public Boolean getIsPermisoVerFormPlaneacionCompra() {
		return isPermisoVerFormPlaneacionCompra;
	}

	public void setIsPermisoVerFormPlaneacionCompra(Boolean isPermisoVerFormPlaneacionCompra) {
		this.isPermisoVerFormPlaneacionCompra = isPermisoVerFormPlaneacionCompra;
	}
	
	public Boolean getIsPermisoDuplicarPlaneacionCompra() {
		return isPermisoDuplicarPlaneacionCompra;
	}

	public void setIsPermisoDuplicarPlaneacionCompra(Boolean isPermisoDuplicarPlaneacionCompra) {
		this.isPermisoDuplicarPlaneacionCompra = isPermisoDuplicarPlaneacionCompra;
	}
	
	public Boolean getIsPermisoOrdenPlaneacionCompra() {
		return isPermisoOrdenPlaneacionCompra;
	}

	public void setIsPermisoOrdenPlaneacionCompra(Boolean isPermisoOrdenPlaneacionCompra) {
		this.isPermisoOrdenPlaneacionCompra = isPermisoOrdenPlaneacionCompra;
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
	
	public Boolean getIsVisibilidadCeldaNuevoPlaneacionCompra() {
		return isVisibilidadCeldaNuevoPlaneacionCompra;
	}

	public void setIsVisibilidadCeldaNuevoPlaneacionCompra(Boolean isVisibilidadCeldaNuevoPlaneacionCompra) {
		this.isVisibilidadCeldaNuevoPlaneacionCompra = isVisibilidadCeldaNuevoPlaneacionCompra;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarPlaneacionCompra() {
		return isVisibilidadCeldaDuplicarPlaneacionCompra;
	}

	public void setIsVisibilidadCeldaDuplicarPlaneacionCompra(Boolean isVisibilidadCeldaDuplicarPlaneacionCompra) {
		this.isVisibilidadCeldaDuplicarPlaneacionCompra = isVisibilidadCeldaDuplicarPlaneacionCompra;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarPlaneacionCompra() {
		return isVisibilidadCeldaCopiarPlaneacionCompra;
	}

	public void setIsVisibilidadCeldaCopiarPlaneacionCompra(Boolean isVisibilidadCeldaCopiarPlaneacionCompra) {
		this.isVisibilidadCeldaCopiarPlaneacionCompra = isVisibilidadCeldaCopiarPlaneacionCompra;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormPlaneacionCompra() {
		return isVisibilidadCeldaVerFormPlaneacionCompra;
	}

	public void setIsVisibilidadCeldaVerFormPlaneacionCompra(Boolean isVisibilidadCeldaVerFormPlaneacionCompra) {
		this.isVisibilidadCeldaVerFormPlaneacionCompra = isVisibilidadCeldaVerFormPlaneacionCompra;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenPlaneacionCompra() {
		return isVisibilidadCeldaOrdenPlaneacionCompra;
	}

	public void setIsVisibilidadCeldaOrdenPlaneacionCompra(Boolean isVisibilidadCeldaOrdenPlaneacionCompra) {
		this.isVisibilidadCeldaOrdenPlaneacionCompra = isVisibilidadCeldaOrdenPlaneacionCompra;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesPlaneacionCompra() {
		return isVisibilidadCeldaNuevoRelacionesPlaneacionCompra;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesPlaneacionCompra(Boolean isVisibilidadCeldaNuevoRelacionesPlaneacionCompra) {
		this.isVisibilidadCeldaNuevoRelacionesPlaneacionCompra = isVisibilidadCeldaNuevoRelacionesPlaneacionCompra;
	}
	
	public Boolean getIsVisibilidadCeldaModificarPlaneacionCompra() {
		return isVisibilidadCeldaModificarPlaneacionCompra;
	}

	public void setIsVisibilidadCeldaModificarPlaneacionCompra(Boolean isVisibilidadCeldaModificarPlaneacionCompra) {
		this.isVisibilidadCeldaModificarPlaneacionCompra = isVisibilidadCeldaModificarPlaneacionCompra;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarPlaneacionCompra() {
		return isVisibilidadCeldaActualizarPlaneacionCompra;
	}

	public void setIsVisibilidadCeldaActualizarPlaneacionCompra(Boolean isVisibilidadCeldaActualizarPlaneacionCompra) {
		this.isVisibilidadCeldaActualizarPlaneacionCompra = isVisibilidadCeldaActualizarPlaneacionCompra;
	}

	public Boolean getIsVisibilidadCeldaEliminarPlaneacionCompra() {
		return isVisibilidadCeldaEliminarPlaneacionCompra;
	}

	public void setIsVisibilidadCeldaEliminarPlaneacionCompra(Boolean isVisibilidadCeldaEliminarPlaneacionCompra) {
		this.isVisibilidadCeldaEliminarPlaneacionCompra = isVisibilidadCeldaEliminarPlaneacionCompra;
	}

	public Boolean getIsVisibilidadCeldaCancelarPlaneacionCompra() {
		return isVisibilidadCeldaCancelarPlaneacionCompra;
	}

	public void setIsVisibilidadCeldaCancelarPlaneacionCompra(Boolean isVisibilidadCeldaCancelarPlaneacionCompra) {
		this.isVisibilidadCeldaCancelarPlaneacionCompra = isVisibilidadCeldaCancelarPlaneacionCompra;
	}

	public Boolean getIsVisibilidadCeldaGuardarPlaneacionCompra() {
		return isVisibilidadCeldaGuardarPlaneacionCompra;
	}

	public void setIsVisibilidadCeldaGuardarPlaneacionCompra(Boolean isVisibilidadCeldaGuardarPlaneacionCompra) {
		this.isVisibilidadCeldaGuardarPlaneacionCompra = isVisibilidadCeldaGuardarPlaneacionCompra;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosPlaneacionCompra() {
		return isVisibilidadCeldaGuardarCambiosPlaneacionCompra;
	}

	public void setIsVisibilidadCeldaGuardarCambiosPlaneacionCompra(Boolean isVisibilidadCeldaGuardarCambiosPlaneacionCompra) {
		this.isVisibilidadCeldaGuardarCambiosPlaneacionCompra = isVisibilidadCeldaGuardarCambiosPlaneacionCompra;
	}
		
	public PlaneacionCompraSessionBean getplaneacioncompraSessionBean() {
		return this.planeacioncompraSessionBean;
	}
	
	public void setplaneacioncompraSessionBean(PlaneacionCompraSessionBean planeacioncompraSessionBean) {
		this.planeacioncompraSessionBean=planeacioncompraSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEjercicio() {
		return this.isVisibilidadFK_IdEjercicio;
	}

	public void setisVisibilidadFK_IdEjercicio(Boolean isVisibilidadFK_IdEjercicio) {
		this.isVisibilidadFK_IdEjercicio=isVisibilidadFK_IdEjercicio;
	}

	public Boolean getisVisibilidadFK_IdEmpleado() {
		return this.isVisibilidadFK_IdEmpleado;
	}

	public void setisVisibilidadFK_IdEmpleado(Boolean isVisibilidadFK_IdEmpleado) {
		this.isVisibilidadFK_IdEmpleado=isVisibilidadFK_IdEmpleado;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdFormato() {
		return this.isVisibilidadFK_IdFormato;
	}

	public void setisVisibilidadFK_IdFormato(Boolean isVisibilidadFK_IdFormato) {
		this.isVisibilidadFK_IdFormato=isVisibilidadFK_IdFormato;
	}

	public Boolean getisVisibilidadFK_IdMesFin() {
		return this.isVisibilidadFK_IdMesFin;
	}

	public void setisVisibilidadFK_IdMesFin(Boolean isVisibilidadFK_IdMesFin) {
		this.isVisibilidadFK_IdMesFin=isVisibilidadFK_IdMesFin;
	}

	public Boolean getisVisibilidadFK_IdMesInicio() {
		return this.isVisibilidadFK_IdMesInicio;
	}

	public void setisVisibilidadFK_IdMesInicio(Boolean isVisibilidadFK_IdMesInicio) {
		this.isVisibilidadFK_IdMesInicio=isVisibilidadFK_IdMesInicio;
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

	public Boolean getisVisibilidadFK_IdUsuario() {
		return this.isVisibilidadFK_IdUsuario;
	}

	public void setisVisibilidadFK_IdUsuario(Boolean isVisibilidadFK_IdUsuario) {
		this.isVisibilidadFK_IdUsuario=isVisibilidadFK_IdUsuario;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysPlaneacionCompra(PlaneacionCompra planeacioncompra)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(planeacioncompra,null);
				this.setActualParaGuardarSucursalForeignKey(planeacioncompra,null);
				this.setActualParaGuardarEjercicioForeignKey(planeacioncompra,null);
				this.setActualParaGuardarPeriodoForeignKey(planeacioncompra,null);
				this.setActualParaGuardarEmpleadoForeignKey(planeacioncompra,null);
				this.setActualParaGuardarUsuarioForeignKey(planeacioncompra,null);
				this.setActualParaGuardarFormatoForeignKey(planeacioncompra,null);
				this.setActualParaGuardarMesInicioForeignKey(planeacioncompra,null);
				this.setActualParaGuardarMesFinForeignKey(planeacioncompra,null);
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
	
	public void bugActualizarReferenciaActual(PlaneacionCompra planeacioncompra,PlaneacionCompra planeacioncompraAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalPlaneacionCompra(planeacioncompra);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		planeacioncompraAux.setId(planeacioncompra.getId());
		planeacioncompraAux.setVersionRow(planeacioncompra.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessPlaneacionCompra();
		
			int intSelectedRow = this.jTableDatosPlaneacionCompra.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompra =(PlaneacionCompra) this.planeacioncompraLogic.getPlaneacionCompras().toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.planeacioncompra =(PlaneacionCompra) this.planeacioncompras.toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(PlaneacionCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualPlaneacionCompra(this.planeacioncompra,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionCompra(this.planeacioncompra);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = planeacioncompraValidator.getInvalidValues(this.planeacioncompra);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			planeacioncompraLogic.setDatosCliente(datosCliente);
			planeacioncompraLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				planeacioncompraAux=new  PlaneacionCompra();
				
				planeacioncompraAux.setIsNew(true);
				planeacioncompraAux.setIsChanged(true);
				
				planeacioncompraAux.setPlaneacionCompraOriginal(this.planeacioncompra);
				
				planeacioncompraAux.setId(this.planeacioncompra.getId());	
				planeacioncompraAux.setVersionRow(this.planeacioncompra.getVersionRow());	
				planeacioncompraAux.setid_empresa(this.planeacioncompra.getid_empresa());	
				planeacioncompraAux.setid_sucursal(this.planeacioncompra.getid_sucursal());	
				planeacioncompraAux.setid_ejercicio(this.planeacioncompra.getid_ejercicio());	
				planeacioncompraAux.setid_periodo(this.planeacioncompra.getid_periodo());	
				planeacioncompraAux.setid_empleado(this.planeacioncompra.getid_empleado());	
				planeacioncompraAux.setid_usuario(this.planeacioncompra.getid_usuario());	
				planeacioncompraAux.setid_formato(this.planeacioncompra.getid_formato());	
				planeacioncompraAux.setnumero_pre_impreso(this.planeacioncompra.getnumero_pre_impreso());	
				planeacioncompraAux.setfecha(this.planeacioncompra.getfecha());	
				planeacioncompraAux.setid_mes_inicio(this.planeacioncompra.getid_mes_inicio());	
				planeacioncompraAux.setid_mes_fin(this.planeacioncompra.getid_mes_fin());	
				planeacioncompraAux.setnumero_meses(this.planeacioncompra.getnumero_meses());	
				planeacioncompraAux.setfecha_corte(this.planeacioncompra.getfecha_corte());	
				planeacioncompraAux.setcodigo_pedido(this.planeacioncompra.getcodigo_pedido());	
				planeacioncompraAux.setdescripcion1(this.planeacioncompra.getdescripcion1());	
				planeacioncompraAux.setdescripcion2(this.planeacioncompra.getdescripcion2());	
				planeacioncompraAux.setdescripcion3(this.planeacioncompra.getdescripcion3());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.planeacioncompraSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.planeacioncompraSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(planeacioncompraAux,planeacioncompraLogic.getPlaneacionCompras());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(planeacioncompraAux,planeacioncompras);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.planeacioncompraSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.planeacioncompraSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						planeacioncompraLogic.savePlaneacionCompras();//WithConnection
						//planeacioncompraLogic.getSetVersionRowPlaneacionCompras();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.planeacioncompra,planeacioncompraAux);
					
					this.refrescarForeignKeysDescripcionesPlaneacionCompra();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.planeacioncompraSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().addAll(this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncomprasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompras.addAll(this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncomprasEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.planeacioncompraSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								planeacioncompraLogic.savePlaneacionCompraRelaciones(planeacioncompraAux,this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompraLogic.getDetallePlaneacionCompras());//WithConnection
								//planeacioncompraLogic.getSetVersionRowPlaneacionCompras();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.planeacioncompra,planeacioncompraAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompraLogic.setDetallePlaneacionCompras(new ArrayList<DetallePlaneacionCompra>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompras= new ArrayList<DetallePlaneacionCompra>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.quitarFilaTotales();}
							planeacioncompraAux.setDetallePlaneacionCompras(this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompraLogic.getDetallePlaneacionCompras());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.planeacioncompraSessionBean.getEstaModoGuardarRelaciones() 
									|| this.planeacioncompraSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(planeacioncompraAux,planeacioncompraLogic.getPlaneacionCompras());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(planeacioncompraAux,planeacioncompras);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.planeacioncompra,planeacioncompraAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				planeacioncompraAux=new  PlaneacionCompra();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.planeacioncompraSessionBean.getEsGuardarRelacionado() 
					|| (this.planeacioncompraSessionBean.getEsGuardarRelacionado() && this.planeacioncompra.getId()>=0)) {
						
					planeacioncompraAux.setIsNew(false);
				}
				
				planeacioncompraAux.setIsDeleted(false);
			
				planeacioncompraAux.setId(this.planeacioncompra.getId());	
				planeacioncompraAux.setVersionRow(this.planeacioncompra.getVersionRow());	
				planeacioncompraAux.setid_empresa(this.planeacioncompra.getid_empresa());	
				planeacioncompraAux.setid_sucursal(this.planeacioncompra.getid_sucursal());	
				planeacioncompraAux.setid_ejercicio(this.planeacioncompra.getid_ejercicio());	
				planeacioncompraAux.setid_periodo(this.planeacioncompra.getid_periodo());	
				planeacioncompraAux.setid_empleado(this.planeacioncompra.getid_empleado());	
				planeacioncompraAux.setid_usuario(this.planeacioncompra.getid_usuario());	
				planeacioncompraAux.setid_formato(this.planeacioncompra.getid_formato());	
				planeacioncompraAux.setnumero_pre_impreso(this.planeacioncompra.getnumero_pre_impreso());	
				planeacioncompraAux.setfecha(this.planeacioncompra.getfecha());	
				planeacioncompraAux.setid_mes_inicio(this.planeacioncompra.getid_mes_inicio());	
				planeacioncompraAux.setid_mes_fin(this.planeacioncompra.getid_mes_fin());	
				planeacioncompraAux.setnumero_meses(this.planeacioncompra.getnumero_meses());	
				planeacioncompraAux.setfecha_corte(this.planeacioncompra.getfecha_corte());	
				planeacioncompraAux.setcodigo_pedido(this.planeacioncompra.getcodigo_pedido());	
				planeacioncompraAux.setdescripcion1(this.planeacioncompra.getdescripcion1());	
				planeacioncompraAux.setdescripcion2(this.planeacioncompra.getdescripcion2());	
				planeacioncompraAux.setdescripcion3(this.planeacioncompra.getdescripcion3());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(planeacioncompraAux,planeacioncompraLogic.getPlaneacionCompras());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(planeacioncompraAux,planeacioncompras);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.planeacioncompraSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.planeacioncompraSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						planeacioncompraLogic.savePlaneacionCompras();//WithConnection
						//planeacioncompraLogic.getSetVersionRowPlaneacionCompras();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.planeacioncompra,planeacioncompraAux);
					
					this.refrescarForeignKeysDescripcionesPlaneacionCompra();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.planeacioncompraSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().addAll(this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncomprasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompras.addAll(this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncomprasEliminados);
						}
						//ARCHITECTURE
						
						if(!this.planeacioncompraSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								planeacioncompraLogic.savePlaneacionCompraRelaciones(planeacioncompraAux,this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompraLogic.getDetallePlaneacionCompras());//WithConnection
								//planeacioncompraLogic.getSetVersionRowPlaneacionCompras();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.planeacioncompra,planeacioncompraAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompraLogic.setDetallePlaneacionCompras(new ArrayList<DetallePlaneacionCompra>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompras= new ArrayList<DetallePlaneacionCompra>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.quitarFilaTotales();}
							planeacioncompraAux.setDetallePlaneacionCompras(this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompraLogic.getDetallePlaneacionCompras());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.planeacioncompraSessionBean.getEstaModoGuardarRelaciones() 
									|| this.planeacioncompraSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(planeacioncompraAux,planeacioncompraLogic.getPlaneacionCompras());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(planeacioncompraAux,planeacioncompras);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.planeacioncompra,planeacioncompraAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				planeacioncompraAux=new  PlaneacionCompra();
				
				planeacioncompraAux.setIsNew(false);
				planeacioncompraAux.setIsChanged(false);
				
				planeacioncompraAux.setIsDeleted(true);
				
				planeacioncompraAux.setId(this.planeacioncompra.getId());	
				planeacioncompraAux.setVersionRow(this.planeacioncompra.getVersionRow());	
				planeacioncompraAux.setid_empresa(this.planeacioncompra.getid_empresa());	
				planeacioncompraAux.setid_sucursal(this.planeacioncompra.getid_sucursal());	
				planeacioncompraAux.setid_ejercicio(this.planeacioncompra.getid_ejercicio());	
				planeacioncompraAux.setid_periodo(this.planeacioncompra.getid_periodo());	
				planeacioncompraAux.setid_empleado(this.planeacioncompra.getid_empleado());	
				planeacioncompraAux.setid_usuario(this.planeacioncompra.getid_usuario());	
				planeacioncompraAux.setid_formato(this.planeacioncompra.getid_formato());	
				planeacioncompraAux.setnumero_pre_impreso(this.planeacioncompra.getnumero_pre_impreso());	
				planeacioncompraAux.setfecha(this.planeacioncompra.getfecha());	
				planeacioncompraAux.setid_mes_inicio(this.planeacioncompra.getid_mes_inicio());	
				planeacioncompraAux.setid_mes_fin(this.planeacioncompra.getid_mes_fin());	
				planeacioncompraAux.setnumero_meses(this.planeacioncompra.getnumero_meses());	
				planeacioncompraAux.setfecha_corte(this.planeacioncompra.getfecha_corte());	
				planeacioncompraAux.setcodigo_pedido(this.planeacioncompra.getcodigo_pedido());	
				planeacioncompraAux.setdescripcion1(this.planeacioncompra.getdescripcion1());	
				planeacioncompraAux.setdescripcion2(this.planeacioncompra.getdescripcion2());	
				planeacioncompraAux.setdescripcion3(this.planeacioncompra.getdescripcion3());	
				
				if(this.planeacioncompraSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.planeacioncompraAux.getId()>=0) {	
						this.planeacioncomprasEliminados.add(planeacioncompraAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(planeacioncompraAux,planeacioncompraLogic.getPlaneacionCompras());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(planeacioncompraAux,planeacioncompras);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.planeacioncompraSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.planeacioncompraSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						planeacioncompraLogic.savePlaneacionCompras();//WithConnection
						//planeacioncompraLogic.getSetVersionRowPlaneacionCompras();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.planeacioncompraSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompraLogic.getDetallePlaneacionCompras().addAll(this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncomprasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompras.addAll(this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncomprasEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.planeacioncompraSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								planeacioncompraLogic.savePlaneacionCompraRelaciones(planeacioncompraAux,this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompraLogic.getDetallePlaneacionCompras());//WithConnection
								//planeacioncompraLogic.getSetVersionRowPlaneacionCompras();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompraLogic.setDetallePlaneacionCompras(new ArrayList<DetallePlaneacionCompra>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompras= new ArrayList<DetallePlaneacionCompra>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.quitarFilaTotales();}
							planeacioncompraAux.setDetallePlaneacionCompras(this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompraLogic.getDetallePlaneacionCompras());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.planeacioncompraSessionBean.getEstaModoGuardarRelaciones() 
								|| this.planeacioncompraSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(planeacioncompraAux,planeacioncompraLogic.getPlaneacionCompras());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(planeacioncompraAux,planeacioncompras);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.getPlaneacionCompras().addAll(this.planeacioncomprasEliminados);
					
					planeacioncompraLogic.savePlaneacionCompras();//WithConnection
					//planeacioncompraLogic.getSetVersionRowPlaneacionCompras();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesPlaneacionCompra();
				
				this.planeacioncomprasEliminados= new ArrayList<PlaneacionCompra>();		
			}
			
			if(this.planeacioncompraSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.planeacioncompraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Planeacion Compra GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Planeacion Compra",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.planeacioncompra=planeacioncompraAux;
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
      		//this.finishProcessPlaneacionCompra();
      	}
		
	}	
	
	public void actualizarRelaciones(PlaneacionCompra planeacioncompraLocal) throws Exception {
		
		if(this.planeacioncompraSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				planeacioncompraLocal.setDetallePlaneacionCompras(this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompraLogic.getDetallePlaneacionCompras());
			
			} else {
			
				planeacioncompraLocal.setDetallePlaneacionCompras(this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompras);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(PlaneacionCompra planeacioncompraLocal) throws Exception {	
		if(this.planeacioncompraSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				planeacioncompraLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				planeacioncompraLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				planeacioncompraLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PeriodoDetalleFormJInternalFrame.class)) {
				PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrameLocal=(PeriodoBeanSwingJInternalFrame) ((PeriodoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				periodoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPeriodo(periodoBeanSwingJInternalFrameLocal.getperiodo(),true);
				periodoBeanSwingJInternalFrameLocal.actualizarLista(periodoBeanSwingJInternalFrameLocal.periodo,this.periodosForeignKey);

				periodoBeanSwingJInternalFrameLocal.actualizarRelaciones(periodoBeanSwingJInternalFrameLocal.periodo);

				planeacioncompraLocal.setPeriodo(periodoBeanSwingJInternalFrameLocal.periodo);

				this.addItemDefectoCombosForeignKeyPeriodo();
				this.cargarCombosFramePeriodosForeignKey("Formulario");
				this.setActualPeriodoForeignKey(periodoBeanSwingJInternalFrameLocal.periodo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				planeacioncompraLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(UsuarioDetalleFormJInternalFrame.class)) {
				UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrameLocal=(UsuarioBeanSwingJInternalFrame) ((UsuarioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				usuarioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoUsuario(usuarioBeanSwingJInternalFrameLocal.getusuario(),true);
				usuarioBeanSwingJInternalFrameLocal.actualizarLista(usuarioBeanSwingJInternalFrameLocal.usuario,this.usuariosForeignKey);

				usuarioBeanSwingJInternalFrameLocal.actualizarRelaciones(usuarioBeanSwingJInternalFrameLocal.usuario);

				planeacioncompraLocal.setUsuario(usuarioBeanSwingJInternalFrameLocal.usuario);

				this.addItemDefectoCombosForeignKeyUsuario();
				this.cargarCombosFrameUsuariosForeignKey("Formulario");
				this.setActualUsuarioForeignKey(usuarioBeanSwingJInternalFrameLocal.usuario.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(FormatoDetalleFormJInternalFrame.class)) {
				FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrameLocal=(FormatoBeanSwingJInternalFrame) ((FormatoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				formatoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoFormato(formatoBeanSwingJInternalFrameLocal.getformato(),true);
				formatoBeanSwingJInternalFrameLocal.actualizarLista(formatoBeanSwingJInternalFrameLocal.formato,this.formatosForeignKey);

				formatoBeanSwingJInternalFrameLocal.actualizarRelaciones(formatoBeanSwingJInternalFrameLocal.formato);

				planeacioncompraLocal.setFormato(formatoBeanSwingJInternalFrameLocal.formato);

				this.addItemDefectoCombosForeignKeyFormato();
				this.cargarCombosFrameFormatosForeignKey("Formulario");
				this.setActualFormatoForeignKey(formatoBeanSwingJInternalFrameLocal.formato.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(MesDetalleFormJInternalFrame.class)) {
				MesBeanSwingJInternalFrame mesinicioBeanSwingJInternalFrameLocal=(MesBeanSwingJInternalFrame) ((MesDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				mesinicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMes(mesinicioBeanSwingJInternalFrameLocal.getmes(),true);
				mesinicioBeanSwingJInternalFrameLocal.actualizarLista(mesinicioBeanSwingJInternalFrameLocal.mes,this.mesiniciosForeignKey);

				mesinicioBeanSwingJInternalFrameLocal.actualizarRelaciones(mesinicioBeanSwingJInternalFrameLocal.mes);

				planeacioncompraLocal.setMesInicio(mesinicioBeanSwingJInternalFrameLocal.mes);

				this.addItemDefectoCombosForeignKeyMesInicio();
				this.cargarCombosFrameMesIniciosForeignKey("Formulario");
				this.setActualMesInicioForeignKey(mesinicioBeanSwingJInternalFrameLocal.mes.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(MesDetalleFormJInternalFrame.class)) {
				MesBeanSwingJInternalFrame mesfinBeanSwingJInternalFrameLocal=(MesBeanSwingJInternalFrame) ((MesDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				mesfinBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMes(mesfinBeanSwingJInternalFrameLocal.getmes(),true);
				mesfinBeanSwingJInternalFrameLocal.actualizarLista(mesfinBeanSwingJInternalFrameLocal.mes,this.mesfinsForeignKey);

				mesfinBeanSwingJInternalFrameLocal.actualizarRelaciones(mesfinBeanSwingJInternalFrameLocal.mes);

				planeacioncompraLocal.setMesFin(mesfinBeanSwingJInternalFrameLocal.mes);

				this.addItemDefectoCombosForeignKeyMesFin();
				this.cargarCombosFrameMesFinsForeignKey("Formulario");
				this.setActualMesFinForeignKey(mesfinBeanSwingJInternalFrameLocal.mes.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarPlaneacionCompraActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosPlaneacionCompra.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.planeacioncompra =(PlaneacionCompra) this.planeacioncompraLogic.getPlaneacionCompras().toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.planeacioncompra =(PlaneacionCompra) this.planeacioncompras.toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = planeacioncompraValidator.getInvalidValues(this.planeacioncompra);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(PlaneacionCompra planeacioncompra,List<PlaneacionCompra> planeacioncompras) throws Exception {
		try	{		
			PlaneacionCompraConstantesFunciones.actualizarLista(planeacioncompra,planeacioncompras,this.planeacioncompraSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(PlaneacionCompra planeacioncompra,List<PlaneacionCompra> planeacioncompras) throws Exception {
		try	{			
			PlaneacionCompraConstantesFunciones.actualizarSelectedLista(planeacioncompra,planeacioncompras);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<PlaneacionCompra> planeacioncomprasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				planeacioncomprasLocal=this.planeacioncompraLogic.getPlaneacionCompras();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				planeacioncomprasLocal=this.planeacioncompras;
			}
			//ARCHITECTURE
		
			for(PlaneacionCompra planeacioncompraLocal:planeacioncomprasLocal) {
				if(this.permiteMantenimiento(planeacioncompraLocal) && planeacioncompraLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+PlaneacionCompraConstantesFunciones.getPlaneacionCompraLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(PlaneacionCompraConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaneacionCompra.jLabelid_empresaPlaneacionCompra,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PlaneacionCompraConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaneacionCompra.jLabelid_sucursalPlaneacionCompra,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PlaneacionCompraConstantesFunciones.IDEJERCICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaneacionCompra.jLabelid_ejercicioPlaneacionCompra,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PlaneacionCompraConstantesFunciones.IDPERIODO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaneacionCompra.jLabelid_periodoPlaneacionCompra,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PlaneacionCompraConstantesFunciones.IDEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaneacionCompra.jLabelid_empleadoPlaneacionCompra,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PlaneacionCompraConstantesFunciones.IDUSUARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaneacionCompra.jLabelid_usuarioPlaneacionCompra,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PlaneacionCompraConstantesFunciones.IDFORMATO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaneacionCompra.jLabelid_formatoPlaneacionCompra,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PlaneacionCompraConstantesFunciones.NUMEROPREIMPRESO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaneacionCompra.jLabelnumero_pre_impresoPlaneacionCompra,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PlaneacionCompraConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaneacionCompra.jLabelfechaPlaneacionCompra,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PlaneacionCompraConstantesFunciones.IDMESINICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaneacionCompra.jLabelid_mes_inicioPlaneacionCompra,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PlaneacionCompraConstantesFunciones.IDMESFIN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaneacionCompra.jLabelid_mes_finPlaneacionCompra,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PlaneacionCompraConstantesFunciones.NUMEROMESES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaneacionCompra.jLabelnumero_mesesPlaneacionCompra,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PlaneacionCompraConstantesFunciones.FECHACORTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaneacionCompra.jLabelfecha_cortePlaneacionCompra,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PlaneacionCompraConstantesFunciones.CODIGOPEDIDO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaneacionCompra.jLabelcodigo_pedidoPlaneacionCompra,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PlaneacionCompraConstantesFunciones.DESCRIPCION1)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaneacionCompra.jLabeldescripcion1PlaneacionCompra,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PlaneacionCompraConstantesFunciones.DESCRIPCION2)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaneacionCompra.jLabeldescripcion2PlaneacionCompra,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PlaneacionCompraConstantesFunciones.DESCRIPCION3)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaneacionCompra.jLabeldescripcion3PlaneacionCompra,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPlaneacionCompra.jLabelid_empresaPlaneacionCompra,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPlaneacionCompra.jLabelid_sucursalPlaneacionCompra,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPlaneacionCompra.jLabelid_ejercicioPlaneacionCompra,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPlaneacionCompra.jLabelid_periodoPlaneacionCompra,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPlaneacionCompra.jLabelid_empleadoPlaneacionCompra,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPlaneacionCompra.jLabelid_usuarioPlaneacionCompra,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPlaneacionCompra.jLabelid_formatoPlaneacionCompra,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPlaneacionCompra.jLabelnumero_pre_impresoPlaneacionCompra,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPlaneacionCompra.jLabelfechaPlaneacionCompra,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPlaneacionCompra.jLabelid_mes_inicioPlaneacionCompra,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPlaneacionCompra.jLabelid_mes_finPlaneacionCompra,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPlaneacionCompra.jLabelnumero_mesesPlaneacionCompra,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPlaneacionCompra.jLabelfecha_cortePlaneacionCompra,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPlaneacionCompra.jLabelcodigo_pedidoPlaneacionCompra,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPlaneacionCompra.jLabeldescripcion1PlaneacionCompra,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPlaneacionCompra.jLabeldescripcion2PlaneacionCompra,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPlaneacionCompra.jLabeldescripcion3PlaneacionCompra,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("DetallePlaneacionCompra")) {
			if(this.planeacioncompra==null) {
				this.planeacioncompra= new PlaneacionCompra();
			}

			if(this.planeacioncompraSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoPlaneacionCompra
				this.setVariablesFormularioToObjetoActualPlaneacionCompra(this.planeacioncompra,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionCompra(this.planeacioncompra);

				this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.getdetalleplaneacioncompra().setPlaneacionCompra(this.planeacioncompra);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoPlaneacionCompra--;	
		
		
		this.planeacioncompraAux=new PlaneacionCompra();
		
		this.planeacioncompraAux.setId(this.iIdNuevoPlaneacionCompra);
		this.planeacioncompraAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.planeacioncompraLogic.getPlaneacionCompras().add(this.planeacioncompraAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.planeacioncompras.add(this.planeacioncompraAux);
		}
		//ARCHITECTURE
		
		this.planeacioncompra=this.planeacioncompraAux;
		
		if(PlaneacionCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioPlaneacionCompra(this.planeacioncompra);
			this.setVariablesObjetoActualToFormularioForeignKeyPlaneacionCompra(this.planeacioncompra);
		}
				
		//this.setDefaultControlesPlaneacionCompra();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyPlaneacionCompra();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyPlaneacionCompra();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyPlaneacionCompra();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPlaneacionCompra(this.planeacioncompraBean,this.planeacioncompra,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionCompra(this.planeacioncompra);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(PlaneacionCompraConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.planeacioncompraSessionBean.getConGuardarRelaciones()) {
			classes=PlaneacionCompraConstantesFunciones.getClassesRelationshipsOfPlaneacionCompra(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.planeacioncompraReturnGeneral=planeacioncompraLogic.procesarEventosPlaneacionComprasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.planeacioncompraLogic.getPlaneacionCompras(),this.planeacioncompra,this.planeacioncompraParameterGeneral,this.isEsNuevoPlaneacionCompra,classes);//this.planeacioncompraLogic.getPlaneacionCompra()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanPlaneacionCompra(this.planeacioncompraReturnGeneral,this.planeacioncompraBean,false);
		
		if(this.planeacioncompraReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyPlaneacionCompra(this.planeacioncompraReturnGeneral.getPlaneacionCompra());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioPlaneacionCompra(this.planeacioncompraReturnGeneral.getPlaneacionCompra());
		}
		
		if(this.planeacioncompraReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioPlaneacionCompra(this.planeacioncompraReturnGeneral.getPlaneacionCompra(),classes);//this.planeacioncompraBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualPlaneacionCompra(this.planeacioncompra,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyPlaneacionCompra();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyPlaneacionCompra();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PlaneacionCompraBeanSwingJInternalFrameAdditional.RecargarFormPlaneacionCompra(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingPlaneacionCompra(false);
						
			if(planeacioncompraSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado() && DetallePlaneacionCompraJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetallePlaneacionCompraActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(PlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPlaneacionCompra();
			}
			
			this.actualizarVisualTableDatosPlaneacionCompra();
			
			this.jTableDatosPlaneacionCompra.setRowSelectionInterval(this.getIndiceNuevoPlaneacionCompra(), this.getIndiceNuevoPlaneacionCompra());
			
			this.seleccionarFilaTablaPlaneacionCompraActual();
						
			this.actualizarEstadoCeldasBotonesPlaneacionCompra("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesPlaneacionCompra(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormPlaneacionCompra.jTextFieldnumero_pre_impresoPlaneacionCompra.setEnabled(isHabilitar && this.planeacioncompraConstantesFunciones.activarnumero_pre_impresoPlaneacionCompra);
		this.jInternalFrameDetalleFormPlaneacionCompra.jDateChooserfechaPlaneacionCompra.setEnabled(isHabilitar && this.planeacioncompraConstantesFunciones.activarfechaPlaneacionCompra);
		this.jInternalFrameDetalleFormPlaneacionCompra.jTextFieldnumero_mesesPlaneacionCompra.setEnabled(isHabilitar && this.planeacioncompraConstantesFunciones.activarnumero_mesesPlaneacionCompra);
		this.jInternalFrameDetalleFormPlaneacionCompra.jDateChooserfecha_cortePlaneacionCompra.setEnabled(isHabilitar && this.planeacioncompraConstantesFunciones.activarfecha_cortePlaneacionCompra);
		this.jInternalFrameDetalleFormPlaneacionCompra.jTextFieldcodigo_pedidoPlaneacionCompra.setEnabled(isHabilitar && this.planeacioncompraConstantesFunciones.activarcodigo_pedidoPlaneacionCompra);
		this.jInternalFrameDetalleFormPlaneacionCompra.jTextAreadescripcion1PlaneacionCompra.setEnabled(isHabilitar && this.planeacioncompraConstantesFunciones.activardescripcion1PlaneacionCompra);
		this.jInternalFrameDetalleFormPlaneacionCompra.jTextAreadescripcion2PlaneacionCompra.setEnabled(isHabilitar && this.planeacioncompraConstantesFunciones.activardescripcion2PlaneacionCompra);
		this.jInternalFrameDetalleFormPlaneacionCompra.jTextAreadescripcion3PlaneacionCompra.setEnabled(isHabilitar && this.planeacioncompraConstantesFunciones.activardescripcion3PlaneacionCompra);	
		//
		this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_empresaPlaneacionCompra.setEnabled(isHabilitar && this.planeacioncompraConstantesFunciones.activarid_empresaPlaneacionCompra);//
		this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_sucursalPlaneacionCompra.setEnabled(isHabilitar && this.planeacioncompraConstantesFunciones.activarid_sucursalPlaneacionCompra);//
		this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_ejercicioPlaneacionCompra.setEnabled(isHabilitar && this.planeacioncompraConstantesFunciones.activarid_ejercicioPlaneacionCompra);//
		this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_periodoPlaneacionCompra.setEnabled(isHabilitar && this.planeacioncompraConstantesFunciones.activarid_periodoPlaneacionCompra);
		this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_empleadoPlaneacionCompra.setEnabled(isHabilitar && this.planeacioncompraConstantesFunciones.activarid_empleadoPlaneacionCompra);//
		this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_usuarioPlaneacionCompra.setEnabled(isHabilitar && this.planeacioncompraConstantesFunciones.activarid_usuarioPlaneacionCompra);
		this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_formatoPlaneacionCompra.setEnabled(isHabilitar && this.planeacioncompraConstantesFunciones.activarid_formatoPlaneacionCompra);
		this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_mes_inicioPlaneacionCompra.setEnabled(isHabilitar && this.planeacioncompraConstantesFunciones.activarid_mes_inicioPlaneacionCompra);
		this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_mes_finPlaneacionCompra.setEnabled(isHabilitar && this.planeacioncompraConstantesFunciones.activarid_mes_finPlaneacionCompra);
	};
	
	public void setDefaultControlesPlaneacionCompra() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoPlaneacionCompra(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.planeacioncompraSessionBean.setConGuardarRelaciones(true);			
			this.planeacioncompraSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormPlaneacionCompra.jTabbedPaneRelacionesPlaneacionCompra.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompraSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.planeacioncompraSessionBean.setConGuardarRelaciones(false);			
			this.planeacioncompraSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormPlaneacionCompra.jTabbedPaneRelacionesPlaneacionCompra.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompraSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoPlaneacionCompra() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PlaneacionCompra planeacioncompraAux:this.planeacioncompraLogic.getPlaneacionCompras()) {
				if(planeacioncompraAux.getId().equals(this.iIdNuevoPlaneacionCompra)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PlaneacionCompra planeacioncompraAux:this.planeacioncompras) {
				if(planeacioncompraAux.getId().equals(this.iIdNuevoPlaneacionCompra)) {
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
	
	public int getIndiceActualPlaneacionCompra(PlaneacionCompra planeacioncompra,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PlaneacionCompra planeacioncompraAux:this.planeacioncompraLogic.getPlaneacionCompras()) {
				if(planeacioncompraAux.getId().equals(planeacioncompra.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PlaneacionCompra planeacioncompraAux:this.planeacioncompras) {
				if(planeacioncompraAux.getId().equals(planeacioncompra.getId())) {
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
	
	public void setCamposBaseDesdeOriginalPlaneacionCompra(PlaneacionCompra planeacioncompraOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PlaneacionCompra planeacioncompraAux:this.planeacioncompraLogic.getPlaneacionCompras()) {
				if(planeacioncompraAux.getPlaneacionCompraOriginal().getId().equals(planeacioncompraOriginal.getId())) {
					existe=true;
					planeacioncompraOriginal.setId(planeacioncompraAux.getId());
					planeacioncompraOriginal.setVersionRow(planeacioncompraAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PlaneacionCompra planeacioncompraAux:this.planeacioncompras) {
				if(planeacioncompraAux.getPlaneacionCompraOriginal().getId().equals(planeacioncompraOriginal.getId())) {
					existe=true;
					planeacioncompraOriginal.setId(planeacioncompraAux.getId());
					planeacioncompraOriginal.setVersionRow(planeacioncompraAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosPlaneacionCompra(Boolean esParaCancelar) throws Exception {
		planeacioncomprasAux=new ArrayList<PlaneacionCompra>();
		planeacioncompraAux=new PlaneacionCompra();
		
		if(!this.planeacioncompraSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PlaneacionCompra planeacioncompraAux:this.planeacioncompraLogic.getPlaneacionCompras()) {
					if(planeacioncompraAux.getId()<0) {
						planeacioncomprasAux.add(planeacioncompraAux);
					}		
				}
				this.iIdNuevoPlaneacionCompra=0L;
				this.planeacioncompraLogic.getPlaneacionCompras().removeAll(planeacioncomprasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PlaneacionCompra planeacioncompraAux:this.planeacioncompras) {
					if(planeacioncompraAux.getId()<0) {
						planeacioncomprasAux.add(planeacioncompraAux);
					}		
				}
				this.iIdNuevoPlaneacionCompra=0L;
				this.planeacioncompras.removeAll(planeacioncomprasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoPlaneacionCompra 
					&& this.planeacioncompraLogic.getPlaneacionCompras().size()>0
					) {
					planeacioncompraAux=this.planeacioncompraLogic.getPlaneacionCompras().get(this.planeacioncompraLogic.getPlaneacionCompras().size() - 1);
				
					if(planeacioncompraAux.getId()<0) {
						this.planeacioncompraLogic.getPlaneacionCompras().remove(planeacioncompraAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoPlaneacionCompra && this.planeacioncompras.size()>0) {
					planeacioncompraAux=this.planeacioncompras.get(this.planeacioncompras.size() - 1);
				
					if(planeacioncompraAux.getId()<0) {
						this.planeacioncompras.remove(planeacioncompraAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoPlaneacionCompra(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(planeacioncompra.getId()<0) {
				this.planeacioncompraLogic.getPlaneacionCompras().remove(this.planeacioncompra);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(planeacioncompra.getId()<0) {
				this.planeacioncompras.remove(this.planeacioncompra);
			}
		}			
	}
	
	public void setEstadosInicialesPlaneacionCompra(List<PlaneacionCompra> planeacioncomprasAux) throws Exception {
		PlaneacionCompraConstantesFunciones.setEstadosInicialesPlaneacionCompra(planeacioncomprasAux);
	}
	
	public void setEstadosInicialesPlaneacionCompra(PlaneacionCompra planeacioncompraAux) throws Exception {
		PlaneacionCompraConstantesFunciones.setEstadosInicialesPlaneacionCompra(planeacioncompraAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarPlaneacionCompraActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesPlaneacionCompra("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarPlaneacionCompraActual()) {
				if(!this.isEsNuevoPlaneacionCompra) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesPlaneacionCompra("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoPlaneacionCompra=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarPlaneacionCompraActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Planeacion Compra ?", "MANTENIMIENTO DE Planeacion Compra", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesPlaneacionCompra("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(PlaneacionCompra planeacioncompra) throws Exception {
		PlaneacionCompraConstantesFunciones.seleccionarAsignar(this.planeacioncompra,planeacioncompra);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarPlaneacionCompra=this.isPermisoActualizarOriginalPlaneacionCompra;
			
			
			this.seleccionarAsignar(planeacioncompra);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PlaneacionCompraConstantesFunciones.quitarEspaciosPlaneacionCompra(this.planeacioncompra,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesPlaneacionCompra("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.planeacioncompraSessionBean.setsFuncionBusquedaRapida(this.planeacioncompraSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoPlaneacionCompra) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosPlaneacionCompra(esParaCancelar);				
				this.cancelarNuevoPlaneacionCompra(esParaCancelar);								
			}
			
			this.planeacioncompra=new PlaneacionCompra();
			
			this.inicializarPlaneacionCompra();
			
			this.actualizarEstadoCeldasBotonesPlaneacionCompra("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarPlaneacionCompra() throws Exception {
		try {
			PlaneacionCompraConstantesFunciones.inicializarPlaneacionCompra(this.planeacioncompra);
			
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
			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.planeacioncompraLogic.getPlaneacionCompras().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReportePlaneacionCompras(String sAccionBusqueda,List<PlaneacionCompra> planeacioncomprasParaReportes) throws Exception {
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
					sPathReporteFinal="PlaneacionCompra"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="PlaneacionCompraMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("PlaneacionCompraMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="PlaneacionCompra"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Planeacion Compras");		
		parameters.put("busquedapor", PlaneacionCompraConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(DetallePlaneacionCompra.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					PlaneacionCompraLogic planeacioncompraLogicAuxiliar=new PlaneacionCompraLogic();
					planeacioncompraLogicAuxiliar.setDatosCliente(planeacioncompraLogic.getDatosCliente());				
					planeacioncompraLogicAuxiliar.setPlaneacionCompras(planeacioncomprasParaReportes);
					
					planeacioncompraLogicAuxiliar.cargarRelacionesLoteForeignKeyPlaneacionCompraWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					planeacioncomprasParaReportes=planeacioncompraLogicAuxiliar.getPlaneacionCompras();
					
					//planeacioncompraLogic.getNewConnexionToDeep();
					
					//for (PlaneacionCompra planeacioncompra:planeacioncomprasParaReportes) {
					//	planeacioncompraLogic.deepLoad(planeacioncompra, false, DeepLoadType.INCLUDE, classes);
					//}						
					//planeacioncompraLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//planeacioncompraLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileDetallePlaneacionCompra = AuxiliarReportes.class.getResourceAsStream("DetallePlaneacionCompraDetalleRelacionesDesign.jasper");
			parameters.put("subreport_detalleplaneacioncompra", reportFileDetallePlaneacionCompra);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourcePlaneacionCompra=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			PlaneacionCompraConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			PlaneacionCompraConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourcePlaneacionCompra=new JRBeanArrayDataSource(PlaneacionCompraJInternalFrame.TraerPlaneacionCompraBeans(planeacioncomprasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourcePlaneacionCompra);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+PlaneacionCompraConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+PlaneacionCompraConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(PlaneacionCompraBean.TraerPlaneacionCompraBeans(planeacioncomprasParaReportes).toArray()));
							
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
				this.generarExcelReportePlaneacionCompras(sAccionBusqueda,sTipoArchivoReporte,planeacioncomprasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalPlaneacionCompras(sAccionBusqueda,sTipoArchivoReporte,planeacioncomprasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoPlaneacionCompraActionPerformed(null);
					//this.generarExcelReportePlaneacionCompras(sAccionBusqueda,sTipoArchivoReporte,planeacioncomprasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalPlaneacionCompras(sAccionBusqueda,sTipoArchivoReporte,planeacioncomprasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesPlaneacionCompras(sAccionBusqueda,sTipoArchivoReporte,planeacioncomprasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesPlaneacionCompras(sAccionBusqueda,sTipoArchivoReporte,planeacioncomprasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReportePlaneacionCompras(String sAccionBusqueda,String sTipoArchivoReporte,List<PlaneacionCompra> planeacioncomprasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"planeacioncompra";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PlaneacionCompras");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPlaneacionCompra("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(PlaneacionCompra planeacioncompra : planeacioncomprasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			PlaneacionCompraConstantesFunciones.generarExcelReporteDataPlaneacionCompra("NORMAL",row,workbook,planeacioncompra,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.planeacioncompraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Planeacion Compra",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderPlaneacionCompra(String sTipo,Row row,Workbook workbook) {
		
		PlaneacionCompraConstantesFunciones.generarExcelReporteHeaderPlaneacionCompra(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalPlaneacionCompras(String sAccionBusqueda,String sTipoArchivoReporte,List<PlaneacionCompra> planeacioncomprasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"planeacioncompra_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PlaneacionCompras");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(PlaneacionCompra planeacioncompra : planeacioncomprasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(PlaneacionCompraConstantesFunciones.getPlaneacionCompraDescripcion(planeacioncompra));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PlaneacionCompraConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PlaneacionCompraConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(planeacioncompra.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PlaneacionCompraConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PlaneacionCompraConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(planeacioncompra.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PlaneacionCompraConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PlaneacionCompraConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(planeacioncompra.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PlaneacionCompraConstantesFunciones.LABEL_IDPERIODO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PlaneacionCompraConstantesFunciones.LABEL_IDPERIODO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(planeacioncompra.getperiodo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PlaneacionCompraConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PlaneacionCompraConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(planeacioncompra.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PlaneacionCompraConstantesFunciones.LABEL_IDUSUARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PlaneacionCompraConstantesFunciones.LABEL_IDUSUARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(planeacioncompra.getusuario_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PlaneacionCompraConstantesFunciones.LABEL_IDFORMATO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PlaneacionCompraConstantesFunciones.LABEL_IDFORMATO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(planeacioncompra.getformato_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PlaneacionCompraConstantesFunciones.LABEL_NUMEROPREIMPRESO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PlaneacionCompraConstantesFunciones.LABEL_NUMEROPREIMPRESO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(planeacioncompra.getnumero_pre_impreso());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PlaneacionCompraConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PlaneacionCompraConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(planeacioncompra.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PlaneacionCompraConstantesFunciones.LABEL_IDMESINICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PlaneacionCompraConstantesFunciones.LABEL_IDMESINICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(planeacioncompra.getmesinicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PlaneacionCompraConstantesFunciones.LABEL_IDMESFIN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PlaneacionCompraConstantesFunciones.LABEL_IDMESFIN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(planeacioncompra.getmesfin_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PlaneacionCompraConstantesFunciones.LABEL_NUMEROMESES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PlaneacionCompraConstantesFunciones.LABEL_NUMEROMESES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(planeacioncompra.getnumero_meses());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PlaneacionCompraConstantesFunciones.LABEL_FECHACORTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PlaneacionCompraConstantesFunciones.LABEL_FECHACORTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(planeacioncompra.getfecha_corte());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PlaneacionCompraConstantesFunciones.LABEL_CODIGOPEDIDO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PlaneacionCompraConstantesFunciones.LABEL_CODIGOPEDIDO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(planeacioncompra.getcodigo_pedido());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION1))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION1);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(planeacioncompra.getdescripcion1());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION2))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION2);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(planeacioncompra.getdescripcion2());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION3))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION3);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(planeacioncompra.getdescripcion3());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.planeacioncompraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Planeacion Compra",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesPlaneacionCompras(String sAccionBusqueda,String sTipoArchivoReporte,List<PlaneacionCompra> planeacioncomprasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<PlaneacionCompra> planeacioncomprasRespaldo=null;
		
		classes=PlaneacionCompraConstantesFunciones.getClassesRelationshipsOfPlaneacionCompra(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.planeacioncompraLogic.setDatosCliente(this.datosCliente);
		this.planeacioncompraLogic.setDatosDeep(this.datosDeep);
		this.planeacioncompraLogic.setIsConDeep(true);
		
		planeacioncomprasRespaldo=this.planeacioncompraLogic.getPlaneacionCompras();
		
		this.planeacioncompraLogic.setPlaneacionCompras(planeacioncomprasParaReportes);	
		this.planeacioncompraLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		planeacioncomprasParaReportes=this.planeacioncompraLogic.getPlaneacionCompras();
		this.planeacioncompraLogic.setPlaneacionCompras(planeacioncomprasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"planeacioncompra_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PlaneacionCompras");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPlaneacionCompra("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(PlaneacionCompra planeacioncompra : planeacioncomprasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderPlaneacionCompra("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			PlaneacionCompraConstantesFunciones.generarExcelReporteDataPlaneacionCompra("NORMAL",row,workbook,planeacioncompra,cellStyleDataAux);
		
			
			


				//DetallePlaneacionCompra
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DetallePlaneacionCompraConstantesFunciones.SCLASSWEBTITULO))) {

				if(planeacioncompra.getDetallePlaneacionCompras()!=null && planeacioncompra.getDetallePlaneacionCompras().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DetallePlaneacionCompraConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DetallePlaneacionCompraConstantesFunciones.generarExcelReporteHeaderDetallePlaneacionCompra("RELACIONADO",row,workbook);
				}

				if(planeacioncompra.getDetallePlaneacionCompras()!=null) {
					i2=0;
					for(DetallePlaneacionCompra detalleplaneacioncompra : planeacioncompra.getDetallePlaneacionCompras()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DetallePlaneacionCompraConstantesFunciones.generarExcelReporteDataDetallePlaneacionCompra("RELACIONADO",row,workbook,detalleplaneacioncompra,cellStyleDataAuxHijo);
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
		cell.setCellValue(PlaneacionCompraConstantesFunciones.getPlaneacionCompraDescripcion(planeacioncompra));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.planeacioncompraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Planeacion Compra",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoPlaneacionCompra.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPlaneacionCompra.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoPlaneacionCompra.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPlaneacionCompra.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessPlaneacionCompra() throws Exception {		
		this.startProcessPlaneacionCompra(true);
	}
	
	public void startProcessPlaneacionCompra(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasPlaneacionCompra ,this.jPanelParametrosReportesPlaneacionCompra, this.jScrollPanelDatosPlaneacionCompra,this.jPanelPaginacionPlaneacionCompra, this.jScrollPanelDatosEdicionPlaneacionCompra, this.jPanelAccionesPlaneacionCompra,this.jPanelAccionesFormularioPlaneacionCompra,this.jmenuBarPlaneacionCompra,this.jmenuBarDetallePlaneacionCompra,this.jTtoolBarPlaneacionCompra,this.jTtoolBarDetallePlaneacionCompra);		
		
		final JTabbedPane jTabbedPaneBusquedasPlaneacionCompra=this.jTabbedPaneBusquedasPlaneacionCompra; 
		
		final JPanel jPanelParametrosReportesPlaneacionCompra=this.jPanelParametrosReportesPlaneacionCompra;
		//final JScrollPane jScrollPanelDatosPlaneacionCompra=this.jScrollPanelDatosPlaneacionCompra;
		final JTable jTableDatosPlaneacionCompra=this.jTableDatosPlaneacionCompra;		
		final JPanel jPanelPaginacionPlaneacionCompra=this.jPanelPaginacionPlaneacionCompra;
		//final JScrollPane jScrollPanelDatosEdicionPlaneacionCompra=this.jScrollPanelDatosEdicionPlaneacionCompra;
		final JPanel jPanelAccionesPlaneacionCompra=this.jPanelAccionesPlaneacionCompra;
		
		JPanel jPanelCamposAuxiliarPlaneacionCompra=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarPlaneacionCompra=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) {
			jPanelCamposAuxiliarPlaneacionCompra=this.jInternalFrameDetalleFormPlaneacionCompra.jPanelCamposPlaneacionCompra;
			jPanelAccionesFormularioAuxiliarPlaneacionCompra=this.jInternalFrameDetalleFormPlaneacionCompra.jPanelAccionesFormularioPlaneacionCompra;
		}
		
		final JPanel jPanelCamposPlaneacionCompra=jPanelCamposAuxiliarPlaneacionCompra;
		final JPanel jPanelAccionesFormularioPlaneacionCompra=jPanelAccionesFormularioAuxiliarPlaneacionCompra;
		
		
		final JMenuBar jmenuBarPlaneacionCompra=this.jmenuBarPlaneacionCompra;
		final JToolBar jTtoolBarPlaneacionCompra=this.jTtoolBarPlaneacionCompra;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarPlaneacionCompra=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPlaneacionCompra=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) {
			jmenuBarDetalleAuxiliarPlaneacionCompra=this.jInternalFrameDetalleFormPlaneacionCompra.jmenuBarDetallePlaneacionCompra;
			jTtoolBarDetalleAuxiliarPlaneacionCompra=this.jInternalFrameDetalleFormPlaneacionCompra.jTtoolBarDetallePlaneacionCompra;
		}
		
		final JMenuBar jmenuBarDetallePlaneacionCompra=jmenuBarDetalleAuxiliarPlaneacionCompra;
		final JToolBar jTtoolBarDetallePlaneacionCompra=jTtoolBarDetalleAuxiliarPlaneacionCompra;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPlaneacionCompra;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPlaneacionCompra;
			processRunnable.jTableDatos=jTableDatosPlaneacionCompra;
			processRunnable.jPanelCampos=jPanelCamposPlaneacionCompra;
			processRunnable.jPanelPaginacion=jPanelPaginacionPlaneacionCompra;
			processRunnable.jPanelAcciones=jPanelAccionesPlaneacionCompra;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPlaneacionCompra;
			
			
			processRunnable.jmenuBar=jmenuBarPlaneacionCompra;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePlaneacionCompra;
			processRunnable.jTtoolBar=jTtoolBarPlaneacionCompra;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePlaneacionCompra;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPlaneacionCompra ,jPanelParametrosReportesPlaneacionCompra,jTableDatosPlaneacionCompra, /*jScrollPanelDatosPlaneacionCompra,*/jPanelCamposPlaneacionCompra,jPanelPaginacionPlaneacionCompra, /*jScrollPanelDatosEdicionPlaneacionCompra,*/ jPanelAccionesPlaneacionCompra,jPanelAccionesFormularioPlaneacionCompra,jmenuBarPlaneacionCompra,jmenuBarDetallePlaneacionCompra,jTtoolBarPlaneacionCompra,jTtoolBarDetallePlaneacionCompra);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPlaneacionCompra ,jPanelParametrosReportesPlaneacionCompra, jScrollPanelDatosPlaneacionCompra,jPanelPaginacionPlaneacionCompra, jScrollPanelDatosEdicionPlaneacionCompra, jPanelAccionesPlaneacionCompra,jPanelAccionesFormularioPlaneacionCompra,jmenuBarPlaneacionCompra,jmenuBarDetallePlaneacionCompra,jTtoolBarPlaneacionCompra,jTtoolBarDetallePlaneacionCompra);
						
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
	
	public void finishProcessPlaneacionCompra() {// throws Exception 
		this.finishProcessPlaneacionCompra(true);
	}
	
	public void finishProcessPlaneacionCompra(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasPlaneacionCompra ,this.jPanelParametrosReportesPlaneacionCompra, this.jScrollPanelDatosPlaneacionCompra,this.jPanelPaginacionPlaneacionCompra, this.jScrollPanelDatosEdicionPlaneacionCompra, this.jPanelAccionesPlaneacionCompra,this.jPanelAccionesFormularioPlaneacionCompra,this.jmenuBarPlaneacionCompra,this.jmenuBarDetallePlaneacionCompra,this.jTtoolBarPlaneacionCompra,this.jTtoolBarDetallePlaneacionCompra);		
		
		final JTabbedPane jTabbedPaneBusquedasPlaneacionCompra=this.jTabbedPaneBusquedasPlaneacionCompra; 
		
		final JPanel jPanelParametrosReportesPlaneacionCompra=this.jPanelParametrosReportesPlaneacionCompra;
		//final JScrollPane jScrollPanelDatosPlaneacionCompra=this.jScrollPanelDatosPlaneacionCompra;
		final JTable jTableDatosPlaneacionCompra=this.jTableDatosPlaneacionCompra;		
		final JPanel jPanelPaginacionPlaneacionCompra=this.jPanelPaginacionPlaneacionCompra;
		//final JScrollPane jScrollPanelDatosEdicionPlaneacionCompra=this.jScrollPanelDatosEdicionPlaneacionCompra;
		final JPanel jPanelAccionesPlaneacionCompra=this.jPanelAccionesPlaneacionCompra;
		
		JPanel jPanelCamposAuxiliarPlaneacionCompra=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarPlaneacionCompra=new JPanel();
		
		if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) {
			jPanelCamposAuxiliarPlaneacionCompra=this.jInternalFrameDetalleFormPlaneacionCompra.jPanelCamposPlaneacionCompra;
			jPanelAccionesFormularioAuxiliarPlaneacionCompra=this.jInternalFrameDetalleFormPlaneacionCompra.jPanelAccionesFormularioPlaneacionCompra;
		}
		
		final JPanel jPanelCamposPlaneacionCompra=jPanelCamposAuxiliarPlaneacionCompra;
		final JPanel jPanelAccionesFormularioPlaneacionCompra=jPanelAccionesFormularioAuxiliarPlaneacionCompra;
		
		
		final JMenuBar jmenuBarPlaneacionCompra=this.jmenuBarPlaneacionCompra;		
		final JToolBar jTtoolBarPlaneacionCompra=this.jTtoolBarPlaneacionCompra;
				
		JMenuBar jmenuBarDetalleAuxiliarPlaneacionCompra=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPlaneacionCompra=new JToolBar();
		
		if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) {
			jmenuBarDetalleAuxiliarPlaneacionCompra=this.jInternalFrameDetalleFormPlaneacionCompra.jmenuBarDetallePlaneacionCompra;
			jTtoolBarDetalleAuxiliarPlaneacionCompra=this.jInternalFrameDetalleFormPlaneacionCompra.jTtoolBarDetallePlaneacionCompra;		
		}
		
		final JMenuBar jmenuBarDetallePlaneacionCompra=jmenuBarDetalleAuxiliarPlaneacionCompra;
		final JToolBar jTtoolBarDetallePlaneacionCompra=jTtoolBarDetalleAuxiliarPlaneacionCompra;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPlaneacionCompra;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPlaneacionCompra;
			processRunnable.jTableDatos=jTableDatosPlaneacionCompra;
			processRunnable.jPanelCampos=jPanelCamposPlaneacionCompra;
			processRunnable.jPanelPaginacion=jPanelPaginacionPlaneacionCompra;
			processRunnable.jPanelAcciones=jPanelAccionesPlaneacionCompra;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPlaneacionCompra;
			
			
			processRunnable.jmenuBar=jmenuBarPlaneacionCompra;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePlaneacionCompra;
			processRunnable.jTtoolBar=jTtoolBarPlaneacionCompra;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePlaneacionCompra;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasPlaneacionCompra ,jPanelParametrosReportesPlaneacionCompra, jTableDatosPlaneacionCompra,/*jScrollPanelDatosPlaneacionCompra,*/jPanelCamposPlaneacionCompra,jPanelPaginacionPlaneacionCompra, /*jScrollPanelDatosEdicionPlaneacionCompra,*/ jPanelAccionesPlaneacionCompra,jPanelAccionesFormularioPlaneacionCompra,jmenuBarPlaneacionCompra,jmenuBarDetallePlaneacionCompra,jTtoolBarPlaneacionCompra,jTtoolBarDetallePlaneacionCompra));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesPlaneacionCompra(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarPlaneacionCompra(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuPlaneacionCompra(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarPlaneacionCompra(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarPlaneacionCompra,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetallePlaneacionCompra,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuPlaneacionCompra(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarPlaneacionCompra,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetallePlaneacionCompra,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.planeacioncompraConstantesFunciones.getsFinalQueryPlaneacionCompra();
		String  finalQueryPaginacionTodos=this.planeacioncompraConstantesFunciones.getsFinalQueryPlaneacionCompra();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=PlaneacionCompraConstantesFunciones.getArrayColumnasGlobalesNoPlaneacionCompra(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=PlaneacionCompraConstantesFunciones.getArrayColumnasGlobalesPlaneacionCompra(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,PlaneacionCompraConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.planeacioncomprasEliminados= new ArrayList<PlaneacionCompra>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessPlaneacionCompra();
		
				///*PlaneacionCompraSessionBean*/this.planeacioncompraSessionBean=new PlaneacionCompraSessionBean();
			
			if(this.planeacioncompraSessionBean==null) {
				this.planeacioncompraSessionBean=new PlaneacionCompraSessionBean();
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
					this.iNumeroPaginacion=PlaneacionCompraConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=PlaneacionCompraConstantesFunciones.getClassesForeignKeysOfPlaneacionCompra(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/planeacioncompra."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			planeacioncomprasAux= new ArrayList<PlaneacionCompra>();
			
				
			planeacioncompraLogic.setDatosCliente(this.datosCliente);
			planeacioncompraLogic.setDatosDeep(this.datosDeep);
			planeacioncompraLogic.setIsConDeep(true);
			
			
			planeacioncompraLogic.getPlaneacionCompraDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					planeacioncompraLogic.getTodosPlaneacionCompras(finalQueryGlobal,pagination);
					
					//planeacioncompraLogic.getTodosPlaneacionComprasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(planeacioncompraLogic.getPlaneacionCompras()==null|| planeacioncompraLogic.getPlaneacionCompras().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							planeacioncomprasAux= new ArrayList<PlaneacionCompra>();
							planeacioncomprasAux.addAll(planeacioncompraLogic.getPlaneacionCompras());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							planeacioncomprasAux= new ArrayList<PlaneacionCompra>();
							planeacioncomprasAux.addAll(planeacioncompras);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							planeacioncompraLogic.getTodosPlaneacionCompras(finalQueryGlobal+"",this.pagination);												
							
							//planeacioncompraLogic.getTodosPlaneacionComprasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReportePlaneacionCompras("Todos",planeacioncompraLogic.getPlaneacionCompras() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							planeacioncompraLogic.setPlaneacionCompras(new ArrayList<PlaneacionCompra>());					
							planeacioncompraLogic.getPlaneacionCompras().addAll(planeacioncomprasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							planeacioncompras=new ArrayList<PlaneacionCompra>();
							planeacioncompras.addAll(planeacioncomprasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idPlaneacionCompra=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idPlaneacionCompra=this.idActual;
				
				} else if(this.idPlaneacionCompraActual!=null && this.idPlaneacionCompraActual!=0L) {
					idPlaneacionCompra=idPlaneacionCompraActual;
				}
				
					
				this.sDetalleReporte=PlaneacionCompraConstantesFunciones.getDetalleIndicePorId(idPlaneacionCompra);
				
				this.planeacioncompras=new ArrayList<PlaneacionCompra>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					planeacioncompraLogic.getEntity(idPlaneacionCompra);
					
					//planeacioncompraLogic.getEntityWithConnection(idPlaneacionCompra);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					planeacioncompraLogic.setPlaneacionCompras(new ArrayList<PlaneacionCompra>());
					planeacioncompraLogic.getPlaneacionCompras().add(planeacioncompraLogic.getPlaneacionCompra());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.planeacioncompras=new ArrayList<PlaneacionCompra>();
					this.planeacioncompras.add(planeacioncompra);
				}
				
				if(planeacioncompraLogic.getPlaneacionCompra()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEjercicio")) {
				this.sDetalleReporte=PlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					planeacioncompraLogic.getPlaneacionComprasFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=planeacioncompraLogic.getPlaneacionCompras()==null||planeacioncompraLogic.getPlaneacionCompras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=planeacioncompras==null|| planeacioncompras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						planeacioncomprasAux=new ArrayList<PlaneacionCompra>();
						planeacioncomprasAux.addAll(planeacioncompraLogic.getPlaneacionCompras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							planeacioncomprasAux=new ArrayList<PlaneacionCompra>();
							planeacioncomprasAux.addAll(planeacioncompras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							planeacioncompraLogic.getPlaneacionComprasFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePlaneacionCompras("FK_IdEjercicio",planeacioncompraLogic.getPlaneacionCompras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePlaneacionCompras("FK_IdEjercicio",planeacioncompras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						planeacioncompraLogic.setPlaneacionCompras(new ArrayList<PlaneacionCompra>());
						planeacioncompraLogic.getPlaneacionCompras().addAll(planeacioncomprasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							planeacioncompras=new ArrayList<PlaneacionCompra>();
							planeacioncompras.addAll(planeacioncomprasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpleado")) {
				this.sDetalleReporte=PlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					planeacioncompraLogic.getPlaneacionComprasFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=planeacioncompraLogic.getPlaneacionCompras()==null||planeacioncompraLogic.getPlaneacionCompras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=planeacioncompras==null|| planeacioncompras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						planeacioncomprasAux=new ArrayList<PlaneacionCompra>();
						planeacioncomprasAux.addAll(planeacioncompraLogic.getPlaneacionCompras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							planeacioncomprasAux=new ArrayList<PlaneacionCompra>();
							planeacioncomprasAux.addAll(planeacioncompras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							planeacioncompraLogic.getPlaneacionComprasFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePlaneacionCompras("FK_IdEmpleado",planeacioncompraLogic.getPlaneacionCompras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePlaneacionCompras("FK_IdEmpleado",planeacioncompras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						planeacioncompraLogic.setPlaneacionCompras(new ArrayList<PlaneacionCompra>());
						planeacioncompraLogic.getPlaneacionCompras().addAll(planeacioncomprasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							planeacioncompras=new ArrayList<PlaneacionCompra>();
							planeacioncompras.addAll(planeacioncomprasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=PlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					planeacioncompraLogic.getPlaneacionComprasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=planeacioncompraLogic.getPlaneacionCompras()==null||planeacioncompraLogic.getPlaneacionCompras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=planeacioncompras==null|| planeacioncompras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						planeacioncomprasAux=new ArrayList<PlaneacionCompra>();
						planeacioncomprasAux.addAll(planeacioncompraLogic.getPlaneacionCompras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							planeacioncomprasAux=new ArrayList<PlaneacionCompra>();
							planeacioncomprasAux.addAll(planeacioncompras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							planeacioncompraLogic.getPlaneacionComprasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePlaneacionCompras("FK_IdEmpresa",planeacioncompraLogic.getPlaneacionCompras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePlaneacionCompras("FK_IdEmpresa",planeacioncompras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						planeacioncompraLogic.setPlaneacionCompras(new ArrayList<PlaneacionCompra>());
						planeacioncompraLogic.getPlaneacionCompras().addAll(planeacioncomprasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							planeacioncompras=new ArrayList<PlaneacionCompra>();
							planeacioncompras.addAll(planeacioncomprasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdFormato")) {
				this.sDetalleReporte=PlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdFormato(id_formatoFK_IdFormato);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					planeacioncompraLogic.getPlaneacionComprasFK_IdFormato(finalQueryGlobal,pagination,id_formatoFK_IdFormato);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdFormato(id_formatoFK_IdFormato);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdFormato(id_formatoFK_IdFormato);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=planeacioncompraLogic.getPlaneacionCompras()==null||planeacioncompraLogic.getPlaneacionCompras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=planeacioncompras==null|| planeacioncompras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						planeacioncomprasAux=new ArrayList<PlaneacionCompra>();
						planeacioncomprasAux.addAll(planeacioncompraLogic.getPlaneacionCompras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							planeacioncomprasAux=new ArrayList<PlaneacionCompra>();
							planeacioncomprasAux.addAll(planeacioncompras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							planeacioncompraLogic.getPlaneacionComprasFK_IdFormato(finalQueryGlobal,pagination,id_formatoFK_IdFormato);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdFormato(id_formatoFK_IdFormato);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdFormato(id_formatoFK_IdFormato);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePlaneacionCompras("FK_IdFormato",planeacioncompraLogic.getPlaneacionCompras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePlaneacionCompras("FK_IdFormato",planeacioncompras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						planeacioncompraLogic.setPlaneacionCompras(new ArrayList<PlaneacionCompra>());
						planeacioncompraLogic.getPlaneacionCompras().addAll(planeacioncomprasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							planeacioncompras=new ArrayList<PlaneacionCompra>();
							planeacioncompras.addAll(planeacioncomprasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdMesFin")) {
				this.sDetalleReporte=PlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdMesFin(id_mes_finFK_IdMesFin);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					planeacioncompraLogic.getPlaneacionComprasFK_IdMesFin(finalQueryGlobal,pagination,id_mes_finFK_IdMesFin);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdMesFin(id_mes_finFK_IdMesFin);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdMesFin(id_mes_finFK_IdMesFin);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=planeacioncompraLogic.getPlaneacionCompras()==null||planeacioncompraLogic.getPlaneacionCompras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=planeacioncompras==null|| planeacioncompras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						planeacioncomprasAux=new ArrayList<PlaneacionCompra>();
						planeacioncomprasAux.addAll(planeacioncompraLogic.getPlaneacionCompras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							planeacioncomprasAux=new ArrayList<PlaneacionCompra>();
							planeacioncomprasAux.addAll(planeacioncompras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							planeacioncompraLogic.getPlaneacionComprasFK_IdMesFin(finalQueryGlobal,pagination,id_mes_finFK_IdMesFin);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdMesFin(id_mes_finFK_IdMesFin);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdMesFin(id_mes_finFK_IdMesFin);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePlaneacionCompras("FK_IdMesFin",planeacioncompraLogic.getPlaneacionCompras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePlaneacionCompras("FK_IdMesFin",planeacioncompras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						planeacioncompraLogic.setPlaneacionCompras(new ArrayList<PlaneacionCompra>());
						planeacioncompraLogic.getPlaneacionCompras().addAll(planeacioncomprasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							planeacioncompras=new ArrayList<PlaneacionCompra>();
							planeacioncompras.addAll(planeacioncomprasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdMesInicio")) {
				this.sDetalleReporte=PlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdMesInicio(id_mes_inicioFK_IdMesInicio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					planeacioncompraLogic.getPlaneacionComprasFK_IdMesInicio(finalQueryGlobal,pagination,id_mes_inicioFK_IdMesInicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdMesInicio(id_mes_inicioFK_IdMesInicio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdMesInicio(id_mes_inicioFK_IdMesInicio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=planeacioncompraLogic.getPlaneacionCompras()==null||planeacioncompraLogic.getPlaneacionCompras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=planeacioncompras==null|| planeacioncompras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						planeacioncomprasAux=new ArrayList<PlaneacionCompra>();
						planeacioncomprasAux.addAll(planeacioncompraLogic.getPlaneacionCompras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							planeacioncomprasAux=new ArrayList<PlaneacionCompra>();
							planeacioncomprasAux.addAll(planeacioncompras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							planeacioncompraLogic.getPlaneacionComprasFK_IdMesInicio(finalQueryGlobal,pagination,id_mes_inicioFK_IdMesInicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdMesInicio(id_mes_inicioFK_IdMesInicio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdMesInicio(id_mes_inicioFK_IdMesInicio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePlaneacionCompras("FK_IdMesInicio",planeacioncompraLogic.getPlaneacionCompras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePlaneacionCompras("FK_IdMesInicio",planeacioncompras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						planeacioncompraLogic.setPlaneacionCompras(new ArrayList<PlaneacionCompra>());
						planeacioncompraLogic.getPlaneacionCompras().addAll(planeacioncomprasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							planeacioncompras=new ArrayList<PlaneacionCompra>();
							planeacioncompras.addAll(planeacioncomprasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPeriodo")) {
				this.sDetalleReporte=PlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					planeacioncompraLogic.getPlaneacionComprasFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=planeacioncompraLogic.getPlaneacionCompras()==null||planeacioncompraLogic.getPlaneacionCompras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=planeacioncompras==null|| planeacioncompras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						planeacioncomprasAux=new ArrayList<PlaneacionCompra>();
						planeacioncomprasAux.addAll(planeacioncompraLogic.getPlaneacionCompras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							planeacioncomprasAux=new ArrayList<PlaneacionCompra>();
							planeacioncomprasAux.addAll(planeacioncompras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							planeacioncompraLogic.getPlaneacionComprasFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePlaneacionCompras("FK_IdPeriodo",planeacioncompraLogic.getPlaneacionCompras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePlaneacionCompras("FK_IdPeriodo",planeacioncompras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						planeacioncompraLogic.setPlaneacionCompras(new ArrayList<PlaneacionCompra>());
						planeacioncompraLogic.getPlaneacionCompras().addAll(planeacioncomprasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							planeacioncompras=new ArrayList<PlaneacionCompra>();
							planeacioncompras.addAll(planeacioncomprasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=PlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					planeacioncompraLogic.getPlaneacionComprasFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=planeacioncompraLogic.getPlaneacionCompras()==null||planeacioncompraLogic.getPlaneacionCompras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=planeacioncompras==null|| planeacioncompras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						planeacioncomprasAux=new ArrayList<PlaneacionCompra>();
						planeacioncomprasAux.addAll(planeacioncompraLogic.getPlaneacionCompras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							planeacioncomprasAux=new ArrayList<PlaneacionCompra>();
							planeacioncomprasAux.addAll(planeacioncompras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							planeacioncompraLogic.getPlaneacionComprasFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePlaneacionCompras("FK_IdSucursal",planeacioncompraLogic.getPlaneacionCompras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePlaneacionCompras("FK_IdSucursal",planeacioncompras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						planeacioncompraLogic.setPlaneacionCompras(new ArrayList<PlaneacionCompra>());
						planeacioncompraLogic.getPlaneacionCompras().addAll(planeacioncomprasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							planeacioncompras=new ArrayList<PlaneacionCompra>();
							planeacioncompras.addAll(planeacioncomprasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdUsuario")) {
				this.sDetalleReporte=PlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					planeacioncompraLogic.getPlaneacionComprasFK_IdUsuario(finalQueryGlobal,pagination,id_usuarioFK_IdUsuario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=planeacioncompraLogic.getPlaneacionCompras()==null||planeacioncompraLogic.getPlaneacionCompras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=planeacioncompras==null|| planeacioncompras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						planeacioncomprasAux=new ArrayList<PlaneacionCompra>();
						planeacioncomprasAux.addAll(planeacioncompraLogic.getPlaneacionCompras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							planeacioncomprasAux=new ArrayList<PlaneacionCompra>();
							planeacioncomprasAux.addAll(planeacioncompras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							planeacioncompraLogic.getPlaneacionComprasFK_IdUsuario(finalQueryGlobal,pagination,id_usuarioFK_IdUsuario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PlaneacionCompraConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePlaneacionCompras("FK_IdUsuario",planeacioncompraLogic.getPlaneacionCompras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePlaneacionCompras("FK_IdUsuario",planeacioncompras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						planeacioncompraLogic.setPlaneacionCompras(new ArrayList<PlaneacionCompra>());
						planeacioncompraLogic.getPlaneacionCompras().addAll(planeacioncomprasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							planeacioncompras=new ArrayList<PlaneacionCompra>();
							planeacioncompras.addAll(planeacioncomprasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesPlaneacionCompra();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessPlaneacionCompra();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=planeacioncompraLogic.getPlaneacionCompras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=planeacioncompras.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=planeacioncompraLogic.getPlaneacionCompras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=planeacioncompras.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(PlaneacionCompra planeacioncompra) {
		Boolean permite=true;
		
		if(this.planeacioncompra.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=PlaneacionCompraConstantesFunciones.getOrderByListaPlaneacionCompra();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=PlaneacionCompraConstantesFunciones.getOrderByListaPlaneacionCompra();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PlaneacionCompra planeacioncompra:planeacioncompraLogic.getPlaneacionCompras()) {
				if(planeacioncompra.getsType().equals(Constantes2.S_TOTALES)) {
					planeacioncompraTotales=planeacioncompra;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PlaneacionCompra planeacioncompra:this.planeacioncompras) {
				if(planeacioncompra.getsType().equals(Constantes2.S_TOTALES)) {
					planeacioncompraTotales=planeacioncompra;
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
			this.planeacioncompraAux=new PlaneacionCompra();
			this.planeacioncompraAux.setsType(Constantes2.S_TOTALES);
			this.planeacioncompraAux.setIsNew(false);
			this.planeacioncompraAux.setIsChanged(false);
			this.planeacioncompraAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				PlaneacionCompraConstantesFunciones.TotalizarValoresFilaPlaneacionCompra(this.planeacioncompraLogic.getPlaneacionCompras(),this.planeacioncompraAux);
				
				this.planeacioncompraLogic.getPlaneacionCompras().add(this.planeacioncompraAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				PlaneacionCompraConstantesFunciones.TotalizarValoresFilaPlaneacionCompra(this.planeacioncompras,this.planeacioncompraAux);
				
				this.planeacioncompras.add(this.planeacioncompraAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		planeacioncompraTotales=new PlaneacionCompra();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.planeacioncompraLogic.getPlaneacionCompras().remove(planeacioncompraTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.planeacioncompras.remove(planeacioncompraTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		planeacioncompraTotales=new PlaneacionCompra();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PlaneacionCompra planeacioncompra:planeacioncompraLogic.getPlaneacionCompras()) {
				if(planeacioncompra.getsType().equals(Constantes2.S_TOTALES)) {
					planeacioncompraTotales=planeacioncompra;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PlaneacionCompraConstantesFunciones.TotalizarValoresFilaPlaneacionCompra(this.planeacioncompraLogic.getPlaneacionCompras(),planeacioncompraTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PlaneacionCompra planeacioncompra:this.planeacioncompras) {
				if(planeacioncompra.getsType().equals(Constantes2.S_TOTALES)) {
					planeacioncompraTotales=planeacioncompra;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PlaneacionCompraConstantesFunciones.TotalizarValoresFilaPlaneacionCompra(this.planeacioncompras,planeacioncompraTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getPlaneacionComprasFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPlaneacionComprasFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPlaneacionComprasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPlaneacionComprasFK_IdFormato()throws Exception {
		try {
			sAccionBusqueda="FK_IdFormato";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPlaneacionComprasFK_IdMesFin()throws Exception {
		try {
			sAccionBusqueda="FK_IdMesFin";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPlaneacionComprasFK_IdMesInicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdMesInicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPlaneacionComprasFK_IdPeriodo()throws Exception {
		try {
			sAccionBusqueda="FK_IdPeriodo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPlaneacionComprasFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPlaneacionComprasFK_IdUsuario()throws Exception {
		try {
			sAccionBusqueda="FK_IdUsuario";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getPlaneacionComprasFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					planeacioncompraLogic.getPlaneacionComprasFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPlaneacionComprasFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					planeacioncompraLogic.getPlaneacionComprasFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPlaneacionComprasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					planeacioncompraLogic.getPlaneacionComprasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPlaneacionComprasFK_IdFormato(String sFinalQuery,Long id_formato)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					planeacioncompraLogic.getPlaneacionComprasFK_IdFormato(sFinalQuery,this.pagination,id_formato);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPlaneacionComprasFK_IdMesFin(String sFinalQuery,Long id_mes_fin)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					planeacioncompraLogic.getPlaneacionComprasFK_IdMesFin(sFinalQuery,this.pagination,id_mes_fin);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPlaneacionComprasFK_IdMesInicio(String sFinalQuery,Long id_mes_inicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					planeacioncompraLogic.getPlaneacionComprasFK_IdMesInicio(sFinalQuery,this.pagination,id_mes_inicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPlaneacionComprasFK_IdPeriodo(String sFinalQuery,Long id_periodo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					planeacioncompraLogic.getPlaneacionComprasFK_IdPeriodo(sFinalQuery,this.pagination,id_periodo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPlaneacionComprasFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					planeacioncompraLogic.getPlaneacionComprasFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPlaneacionComprasFK_IdUsuario(String sFinalQuery,Long id_usuario)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					planeacioncompraLogic.getPlaneacionComprasFK_IdUsuario(sFinalQuery,this.pagination,id_usuario);
				
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
	
	public void inicializarPermisosPlaneacionCompra() {
		this.isPermisoTodoPlaneacionCompra=false;
		this.isPermisoNuevoPlaneacionCompra=false;
		this.isPermisoActualizarPlaneacionCompra=false;
		this.isPermisoActualizarOriginalPlaneacionCompra=false;
		this.isPermisoEliminarPlaneacionCompra=false;
		this.isPermisoGuardarCambiosPlaneacionCompra=false;
		this.isPermisoConsultaPlaneacionCompra=false;
		this.isPermisoBusquedaPlaneacionCompra=false;
		this.isPermisoReportePlaneacionCompra=false;		
		this.isPermisoOrdenPlaneacionCompra=false;		
		this.isPermisoPaginacionMedioPlaneacionCompra=false;		
		this.isPermisoPaginacionAltoPlaneacionCompra=false;
		this.isPermisoPaginacionTodoPlaneacionCompra=false;
		this.isPermisoCopiarPlaneacionCompra=false;		
		this.isPermisoVerFormPlaneacionCompra=false;		
		this.isPermisoDuplicarPlaneacionCompra=false;		
		this.isPermisoOrdenPlaneacionCompra=false;		
	}
	
	public void setPermisosUsuarioPlaneacionCompra(Boolean isPermiso) {
		this.isPermisoTodoPlaneacionCompra=isPermiso;
		this.isPermisoNuevoPlaneacionCompra=isPermiso;
		this.isPermisoActualizarPlaneacionCompra=isPermiso;
		this.isPermisoActualizarOriginalPlaneacionCompra=isPermiso;
		this.isPermisoEliminarPlaneacionCompra=isPermiso;
		this.isPermisoGuardarCambiosPlaneacionCompra=isPermiso;
		this.isPermisoConsultaPlaneacionCompra=isPermiso;
		this.isPermisoBusquedaPlaneacionCompra=isPermiso;
		this.isPermisoReportePlaneacionCompra=isPermiso;
		this.isPermisoOrdenPlaneacionCompra=isPermiso;		
		this.isPermisoPaginacionMedioPlaneacionCompra=isPermiso;		
		this.isPermisoPaginacionAltoPlaneacionCompra=isPermiso;		
		this.isPermisoPaginacionTodoPlaneacionCompra=isPermiso;		
		this.isPermisoCopiarPlaneacionCompra=isPermiso;		
		this.isPermisoVerFormPlaneacionCompra=isPermiso;		
		this.isPermisoDuplicarPlaneacionCompra=isPermiso;
		this.isPermisoOrdenPlaneacionCompra=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioPlaneacionCompra(Boolean isPermiso) {
		//this.isPermisoTodoPlaneacionCompra=isPermiso;
		this.isPermisoNuevoPlaneacionCompra=isPermiso;
		this.isPermisoActualizarPlaneacionCompra=isPermiso;
		this.isPermisoActualizarOriginalPlaneacionCompra=isPermiso;
		this.isPermisoEliminarPlaneacionCompra=isPermiso;
		this.isPermisoGuardarCambiosPlaneacionCompra=isPermiso;
		//this.isPermisoConsultaPlaneacionCompra=isPermiso;
		//this.isPermisoBusquedaPlaneacionCompra=isPermiso;
		//this.isPermisoReportePlaneacionCompra=isPermiso;
		//this.isPermisoOrdenPlaneacionCompra=isPermiso;		
		//this.isPermisoPaginacionMedioPlaneacionCompra=isPermiso;		
		//this.isPermisoPaginacionAltoPlaneacionCompra=isPermiso;		
		//this.isPermisoPaginacionTodoPlaneacionCompra=isPermiso;		
		//this.isPermisoCopiarPlaneacionCompra=isPermiso;		
		//this.isPermisoDuplicarPlaneacionCompra=isPermiso;
		//this.isPermisoOrdenPlaneacionCompra=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioPlaneacionCompraClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(DetallePlaneacionCompraConstantesFunciones.SNOMBREOPCION);
		
		if(PlaneacionCompraJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosDetallePlaneacionCompra=false;
		this.isTienePermisosDetallePlaneacionCompra=this.verificarGetPermisosUsuarioOpcionPlaneacionCompraClaseRelacionada(this.opcionsRelacionadas,DetallePlaneacionCompraConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebPlaneacionCompra(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioPlaneacionCompraClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosDetallePlaneacionCompra=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioPlaneacionCompraClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionPlaneacionCompraClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioPlaneacionCompraClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosDetallePlaneacionCompra && this.jInternalFrameDetalleFormPlaneacionCompra!=null && this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormPlaneacionCompra.jTabbedPaneRelacionesPlaneacionCompra.remove(this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioPlaneacionCompra() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(PlaneacionCompraJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.planeacioncompraSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, PlaneacionCompraConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoPlaneacionCompra=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarPlaneacionCompra=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalPlaneacionCompra=this.isPermisoActualizarPlaneacionCompra;
			this.isPermisoEliminarPlaneacionCompra=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosPlaneacionCompra=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaPlaneacionCompra=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaPlaneacionCompra=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoPlaneacionCompra=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReportePlaneacionCompra=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPlaneacionCompra=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioPlaneacionCompra=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoPlaneacionCompra=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoPlaneacionCompra=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarPlaneacionCompra=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormPlaneacionCompra=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarPlaneacionCompra=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPlaneacionCompra=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.planeacioncompraSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosPlaneacionCompra.setToolTipText(this.jTableDatosPlaneacionCompra.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioPlaneacionCompra(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioPlaneacionCompra(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(PlaneacionCompraJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(PlaneacionCompraJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioPlaneacionCompra() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosDetallePlaneacionCompra && this.planeacioncompraConstantesFunciones.mostrarDetallePlaneacionCompraPlaneacionCompra && !PlaneacionCompraConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Detalle Planeacion Compra");
			reporte.setsDescripcion("Detalle Planeacion Compra");
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
	public void inicializarCombosForeignKeyPlaneacionCompraListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.periodosForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
				this.usuariosForeignKey=new ArrayList();
				this.formatosForeignKey=new ArrayList();
				this.mesiniciosForeignKey=new ArrayList();
				this.mesfinsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyPlaneacionCompraListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(PlaneacionCompraJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyPlaneacionCompraListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPeriodoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyUsuarioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyFormatoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyMesInicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyMesFinListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyEmpleadoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpleadoConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyUsuarioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.usuariosForeignKey==null||this.usuariosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=UsuarioConstantesFunciones.getArrayColumnasGlobalesUsuario(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UsuarioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=UsuarioConstantesFunciones.SFINALQUERY;

				this.cargarCombosUsuariosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyFormatoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.formatosForeignKey==null||this.formatosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=FormatoConstantesFunciones.getArrayColumnasGlobalesFormato(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FormatoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=FormatoConstantesFunciones.SFINALQUERY;

				this.cargarCombosFormatosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyMesInicioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.mesiniciosForeignKey==null||this.mesiniciosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=MesConstantesFunciones.SFINALQUERY;

				this.cargarCombosMesIniciosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyMesFinListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.mesfinsForeignKey==null||this.mesfinsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=MesConstantesFunciones.SFINALQUERY;

				this.cargarCombosMesFinsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyPlaneacionCompraListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			PlaneacionCompraParameterReturnGeneral planeacioncompraReturnGeneral=new PlaneacionCompraParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.planeacioncompraConstantesFunciones.cargarid_empresaPlaneacionCompra)
					 || (this.esRecargarFks && this.planeacioncompraConstantesFunciones.cargarid_empresaPlaneacionCompra)) {

					if(!this.planeacioncompraSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+planeacioncompraSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.planeacioncompraConstantesFunciones.cargarid_sucursalPlaneacionCompra)
					 || (this.esRecargarFks && this.planeacioncompraConstantesFunciones.cargarid_sucursalPlaneacionCompra)) {

					if(!this.planeacioncompraSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+planeacioncompraSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalEjercicio="";

				if(((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0) && this.planeacioncompraConstantesFunciones.cargarid_ejercicioPlaneacionCompra)
					 || (this.esRecargarFks && this.planeacioncompraConstantesFunciones.cargarid_ejercicioPlaneacionCompra)) {

					if(!this.planeacioncompraSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEjercicio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

						finalQueryGlobalEjercicio=Funciones.GetFinalQueryAppend(finalQueryGlobalEjercicio, "");
						finalQueryGlobalEjercicio+=EjercicioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEjercicio=" WHERE " + ConstantesSql.ID + "="+planeacioncompraSessionBean.getlidEjercicioActual();
					}
				} else {
					finalQueryGlobalEjercicio="NONE";
				}


				String finalQueryGlobalPeriodo="";

				if(((this.periodosForeignKey==null||this.periodosForeignKey.size()<=0) && this.planeacioncompraConstantesFunciones.cargarid_periodoPlaneacionCompra)
					 || (this.esRecargarFks && this.planeacioncompraConstantesFunciones.cargarid_periodoPlaneacionCompra)) {

					if(!this.planeacioncompraSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PeriodoConstantesFunciones.getArrayColumnasGlobalesPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPeriodo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoConstantesFunciones.TABLENAME);

						finalQueryGlobalPeriodo=Funciones.GetFinalQueryAppend(finalQueryGlobalPeriodo, "");
						finalQueryGlobalPeriodo+=PeriodoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPeriodosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPeriodo=" WHERE " + ConstantesSql.ID + "="+planeacioncompraSessionBean.getlidPeriodoActual();
					}
				} else {
					finalQueryGlobalPeriodo="NONE";
				}


				String finalQueryGlobalEmpleado="";

				if(((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0) && this.planeacioncompraConstantesFunciones.cargarid_empleadoPlaneacionCompra)
					 || (this.esRecargarFks && this.planeacioncompraConstantesFunciones.cargarid_empleadoPlaneacionCompra)) {

					if(!this.planeacioncompraSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleado, "");
						finalQueryGlobalEmpleado+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleado=" WHERE " + ConstantesSql.ID + "="+planeacioncompraSessionBean.getlidEmpleadoActual();
					}
				} else {
					finalQueryGlobalEmpleado="NONE";
				}


				String finalQueryGlobalUsuario="";

				if(((this.usuariosForeignKey==null||this.usuariosForeignKey.size()<=0) && this.planeacioncompraConstantesFunciones.cargarid_usuarioPlaneacionCompra)
					 || (this.esRecargarFks && this.planeacioncompraConstantesFunciones.cargarid_usuarioPlaneacionCompra)) {

					if(!this.planeacioncompraSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=UsuarioConstantesFunciones.getArrayColumnasGlobalesUsuario(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUsuario=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UsuarioConstantesFunciones.TABLENAME);

						finalQueryGlobalUsuario=Funciones.GetFinalQueryAppend(finalQueryGlobalUsuario, "");
						finalQueryGlobalUsuario+=UsuarioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosUsuariosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUsuario=" WHERE " + ConstantesSql.ID + "="+planeacioncompraSessionBean.getlidUsuarioActual();
					}
				} else {
					finalQueryGlobalUsuario="NONE";
				}


				String finalQueryGlobalFormato="";

				if(((this.formatosForeignKey==null||this.formatosForeignKey.size()<=0) && this.planeacioncompraConstantesFunciones.cargarid_formatoPlaneacionCompra)
					 || (this.esRecargarFks && this.planeacioncompraConstantesFunciones.cargarid_formatoPlaneacionCompra)) {

					if(!this.planeacioncompraSessionBean.getisBusquedaDesdeForeignKeySesionFormato()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=FormatoConstantesFunciones.getArrayColumnasGlobalesFormato(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalFormato=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FormatoConstantesFunciones.TABLENAME);

						finalQueryGlobalFormato=Funciones.GetFinalQueryAppend(finalQueryGlobalFormato, "");
						finalQueryGlobalFormato+=FormatoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosFormatosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalFormato=" WHERE " + ConstantesSql.ID + "="+planeacioncompraSessionBean.getlidFormatoActual();
					}
				} else {
					finalQueryGlobalFormato="NONE";
				}


				String finalQueryGlobalMesInicio="";

				if(((this.mesiniciosForeignKey==null||this.mesiniciosForeignKey.size()<=0) && this.planeacioncompraConstantesFunciones.cargarid_mes_inicioPlaneacionCompra)
					 || (this.esRecargarFks && this.planeacioncompraConstantesFunciones.cargarid_mes_inicioPlaneacionCompra)) {

					if(!this.planeacioncompraSessionBean.getisBusquedaDesdeForeignKeySesionMesInicio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalMesInicio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

						finalQueryGlobalMesInicio=Funciones.GetFinalQueryAppend(finalQueryGlobalMesInicio, "");
						finalQueryGlobalMesInicio+=MesConstantesFunciones.SFINALQUERY;

						//this.cargarCombosMesIniciosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalMesInicio=" WHERE " + ConstantesSql.ID + "="+planeacioncompraSessionBean.getlidMesInicioActual();
					}
				} else {
					finalQueryGlobalMesInicio="NONE";
				}


				String finalQueryGlobalMesFin="";

				if(((this.mesfinsForeignKey==null||this.mesfinsForeignKey.size()<=0) && this.planeacioncompraConstantesFunciones.cargarid_mes_finPlaneacionCompra)
					 || (this.esRecargarFks && this.planeacioncompraConstantesFunciones.cargarid_mes_finPlaneacionCompra)) {

					if(!this.planeacioncompraSessionBean.getisBusquedaDesdeForeignKeySesionMesFin()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalMesFin=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

						finalQueryGlobalMesFin=Funciones.GetFinalQueryAppend(finalQueryGlobalMesFin, "");
						finalQueryGlobalMesFin+=MesConstantesFunciones.SFINALQUERY;

						//this.cargarCombosMesFinsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalMesFin=" WHERE " + ConstantesSql.ID + "="+planeacioncompraSessionBean.getlidMesFinActual();
					}
				} else {
					finalQueryGlobalMesFin="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				planeacioncompraReturnGeneral=planeacioncompraLogic.cargarCombosLoteForeignKeyPlaneacionCompra(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalEjercicio,finalQueryGlobalPeriodo,finalQueryGlobalEmpleado,finalQueryGlobalUsuario,finalQueryGlobalFormato,finalQueryGlobalMesInicio,finalQueryGlobalMesFin);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=planeacioncompraReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=planeacioncompraReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalEjercicio.equals("NONE")) {
				this.ejerciciosForeignKey=planeacioncompraReturnGeneral.getejerciciosForeignKey();
			}

			if(!finalQueryGlobalPeriodo.equals("NONE")) {
				this.periodosForeignKey=planeacioncompraReturnGeneral.getperiodosForeignKey();
			}

			if(!finalQueryGlobalEmpleado.equals("NONE")) {
				this.empleadosForeignKey=planeacioncompraReturnGeneral.getempleadosForeignKey();
			}

			if(!finalQueryGlobalUsuario.equals("NONE")) {
				this.usuariosForeignKey=planeacioncompraReturnGeneral.getusuariosForeignKey();
			}

			if(!finalQueryGlobalFormato.equals("NONE")) {
				this.formatosForeignKey=planeacioncompraReturnGeneral.getformatosForeignKey();
			}

			if(!finalQueryGlobalMesInicio.equals("NONE")) {
				this.mesiniciosForeignKey=planeacioncompraReturnGeneral.getmesiniciosForeignKey();
			}

			if(!finalQueryGlobalMesFin.equals("NONE")) {
				this.mesfinsForeignKey=planeacioncompraReturnGeneral.getmesfinsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyPlaneacionCompra()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyPeriodo();
			this.addItemDefectoCombosForeignKeyEmpleado();
			this.addItemDefectoCombosForeignKeyUsuario();
			this.addItemDefectoCombosForeignKeyFormato();
			this.addItemDefectoCombosForeignKeyMesInicio();
			this.addItemDefectoCombosForeignKeyMesFin();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.planeacioncompraSessionBean==null) {
				this.planeacioncompraSessionBean=new PlaneacionCompraSessionBean();
			}

			if(!this.planeacioncompraSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.planeacioncompraSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.planeacioncompraSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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

			if(!this.planeacioncompraSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
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

	public void addItemDefectoCombosForeignKeyEmpleado()throws Exception {
		try {

			if(!this.planeacioncompraSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
				Empleado empleado=new Empleado();
				EmpleadoConstantesFunciones.setEmpleadoDescripcion(empleado,Constantes.SMENSAJE_ESCOJA_OPCION);
				empleado.setId(null);

				if(!EmpleadoConstantesFunciones.ExisteEnLista(this.empleadosForeignKey,empleado,true)) {

					this.empleadosForeignKey.add(0,empleado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyUsuario()throws Exception {
		try {

			if(!this.planeacioncompraSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {
				Usuario usuario=new Usuario();
				UsuarioConstantesFunciones.setUsuarioDescripcion(usuario,Constantes.SMENSAJE_ESCOJA_OPCION);
				usuario.setId(null);

				if(!UsuarioConstantesFunciones.ExisteEnLista(this.usuariosForeignKey,usuario,true)) {

					this.usuariosForeignKey.add(0,usuario);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyFormato()throws Exception {
		try {

			if(!this.planeacioncompraSessionBean.getisBusquedaDesdeForeignKeySesionFormato()) {
				Formato formato=new Formato();
				FormatoConstantesFunciones.setFormatoDescripcion(formato,Constantes.SMENSAJE_ESCOJA_OPCION);
				formato.setId(null);

				if(!FormatoConstantesFunciones.ExisteEnLista(this.formatosForeignKey,formato,true)) {

					this.formatosForeignKey.add(0,formato);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyMesInicio()throws Exception {
		try {

			if(!this.planeacioncompraSessionBean.getisBusquedaDesdeForeignKeySesionMesInicio()) {
				Mes mesinicio=new Mes();
				MesConstantesFunciones.setMesDescripcion(mesinicio,Constantes.SMENSAJE_ESCOJA_OPCION);
				mesinicio.setId(null);

				if(!MesConstantesFunciones.ExisteEnLista(this.mesiniciosForeignKey,mesinicio,true)) {

					this.mesiniciosForeignKey.add(0,mesinicio);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyMesFin()throws Exception {
		try {

			if(!this.planeacioncompraSessionBean.getisBusquedaDesdeForeignKeySesionMesFin()) {
				Mes mesfin=new Mes();
				MesConstantesFunciones.setMesDescripcion(mesfin,Constantes.SMENSAJE_ESCOJA_OPCION);
				mesfin.setId(null);

				if(!MesConstantesFunciones.ExisteEnLista(this.mesfinsForeignKey,mesfin,true)) {

					this.mesfinsForeignKey.add(0,mesfin);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyPlaneacionCompra()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyPlaneacionCompra(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyPlaneacionCompra()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
				this.setActualEjercicioForeignKey(this.parametroGeneralUsuario.getid_ejercicio(),false,"Formulario");
				this.setActualPeriodoForeignKey(this.parametroGeneralUsuario.getid_periodo(),false,"Formulario");
				this.setActualUsuarioForeignKey(this.parametroGeneralUsuario.getid_usuario(),false,"Formulario");
			
			
				this.planeacioncompra.setfecha(this.parametroGeneralUsuario.getfecha_sistema());
				this.planeacioncompra.setfecha_corte(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyPlaneacionCompra();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyPlaneacionCompra(PlaneacionCompra planeacioncompra)throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(planeacioncompra.getid_empleado(),false,"Formulario");
			this.setActualFormatoForeignKey(planeacioncompra.getid_formato(),false,"Formulario");
			this.setActualMesInicioForeignKey(planeacioncompra.getid_mes_inicio(),false,"Formulario");
			this.setActualMesFinForeignKey(planeacioncompra.getid_mes_fin(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyPlaneacionCompra(PlaneacionCompra planeacioncompra,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyPlaneacionCompra()throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(this.planeacioncompraConstantesFunciones.getid_empleado(),false,"Formulario");
			this.setActualFormatoForeignKey(this.planeacioncompraConstantesFunciones.getid_formato(),false,"Formulario");
			this.setActualMesInicioForeignKey(this.planeacioncompraConstantesFunciones.getid_mes_inicio(),false,"Formulario");
			this.setActualMesFinForeignKey(this.planeacioncompraConstantesFunciones.getid_mes_fin(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyPlaneacionCompra()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_ejercicioPlaneacionCompra.getSelectedItem();
				}

				if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) {
					Periodo periodoActual=(Periodo)this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_periodoPlaneacionCompra.getSelectedItem();
				}

				this.setActualUsuarioForeignKey(this.usuarioActual.getId(),false,"Formulario");
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyPlaneacionCompra()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyPlaneacionCompra()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroPlaneacionCompra()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyPlaneacionCompra()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFramePeriodosForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");
			this.cargarCombosFrameUsuariosForeignKey("Todos");
			this.cargarCombosFrameFormatosForeignKey("Todos");
			this.cargarCombosFrameMesIniciosForeignKey("Todos");
			this.cargarCombosFrameMesFinsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyPlaneacionCompra(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePeriodosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameUsuariosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameFormatosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameMesIniciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameMesFinsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyPlaneacionCompra()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_empresaPlaneacionCompra!=null && this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_empresaPlaneacionCompra.getItemCount()>0) {
				this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_empresaPlaneacionCompra.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_sucursalPlaneacionCompra!=null && this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_sucursalPlaneacionCompra.getItemCount()>0) {
				this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_sucursalPlaneacionCompra.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_ejercicioPlaneacionCompra!=null && this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_ejercicioPlaneacionCompra.getItemCount()>0) {
				this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_ejercicioPlaneacionCompra.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_periodoPlaneacionCompra!=null && this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_periodoPlaneacionCompra.getItemCount()>0) {
				this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_periodoPlaneacionCompra.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_empleadoPlaneacionCompra!=null && this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_empleadoPlaneacionCompra.getItemCount()>0) {
				this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_empleadoPlaneacionCompra.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_usuarioPlaneacionCompra!=null && this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_usuarioPlaneacionCompra.getItemCount()>0) {
				this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_usuarioPlaneacionCompra.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_formatoPlaneacionCompra!=null && this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_formatoPlaneacionCompra.getItemCount()>0) {
				this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_formatoPlaneacionCompra.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_mes_inicioPlaneacionCompra!=null && this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_mes_inicioPlaneacionCompra.getItemCount()>0) {
				this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_mes_inicioPlaneacionCompra.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_mes_finPlaneacionCompra!=null && this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_mes_finPlaneacionCompra.getItemCount()>0) {
				this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_mes_finPlaneacionCompra.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


















	
	

	public PlaneacionCompraBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public PlaneacionCompraBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public PlaneacionCompraBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.planeacioncompraSessionBean=new PlaneacionCompraSessionBean(); 
		this.planeacioncompraConstantesFunciones=new PlaneacionCompraConstantesFunciones(); 
		this.planeacioncompraBean=new PlaneacionCompra();//(this.planeacioncompraConstantesFunciones); 		
		this.planeacioncompraReturnGeneral=new PlaneacionCompraParameterReturnGeneral(); 
		
		this.planeacioncompraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.planeacioncompraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public PlaneacionCompraBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public PlaneacionCompraBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public PlaneacionCompraBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessPlaneacionCompra(true);
			
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
			
			this.planeacioncompraConstantesFunciones=new PlaneacionCompraConstantesFunciones(); 
			this.planeacioncompraBean=new PlaneacionCompra();//this.planeacioncompraConstantesFunciones); 			
			this.planeacioncompraReturnGeneral=new PlaneacionCompraParameterReturnGeneral(); 
		
			PlaneacionCompraBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Planeacion Compra Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.planeacioncompra=new PlaneacionCompra();
			this.planeacioncompras = new ArrayList<PlaneacionCompra>();
			this.planeacioncomprasAux = new ArrayList<PlaneacionCompra>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic=new PlaneacionCompraLogic();
				this.planeacioncompraLogic.getNewConnexionToDeep("");
			}
			
			//this.planeacioncompraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.planeacioncompraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormPlaneacionCompra);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoPlaneacionCompra!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPlaneacionCompra);	
					}
					
					if(this.jInternalFrameImportacionPlaneacionCompra!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPlaneacionCompra);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByPlaneacionCompra!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByPlaneacionCompra);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormPlaneacionCompra);
				this.jInternalFrameDetalleFormPlaneacionCompra.setVisible(false);
				this.jInternalFrameDetalleFormPlaneacionCompra.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoPlaneacionCompra!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPlaneacionCompra);
					this.jInternalFrameReporteDinamicoPlaneacionCompra.setVisible(false);
					this.jInternalFrameReporteDinamicoPlaneacionCompra.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionPlaneacionCompra!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionPlaneacionCompra);
					this.jInternalFrameImportacionPlaneacionCompra.setVisible(false);
					this.jInternalFrameImportacionPlaneacionCompra.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByPlaneacionCompra!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByPlaneacionCompra);
					this.jInternalFrameOrderByPlaneacionCompra.setVisible(false);
					this.jInternalFrameOrderByPlaneacionCompra.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idPlaneacionCompraActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=PlaneacionCompraConstantesFunciones.INUMEROPAGINACION;
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
			
			this.planeacioncompraReturnGeneral=new PlaneacionCompraParameterReturnGeneral();
			
			this.planeacioncompraParameterGeneral=new PlaneacionCompraParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.planeacioncompraLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.planeacioncompraSessionBean.getEsGuardarRelacionado()) {
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
			
			if(PlaneacionCompraJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.planeacioncompraSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(DetallePlaneacionCompraConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PlaneacionCompraConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.planeacioncompraSessionBean.getEsGuardarRelacionado(),this.planeacioncompraSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PlaneacionCompraConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.planeacioncompraSessionBean.getEsGuardarRelacionado(),this.planeacioncompraSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoPlaneacionCompra=false;
			this.isVisibilidadCeldaDuplicarPlaneacionCompra=true;
			this.isVisibilidadCeldaCopiarPlaneacionCompra=true;
			this.isVisibilidadCeldaVerFormPlaneacionCompra=true;
			this.isVisibilidadCeldaOrdenPlaneacionCompra=true;
			this.isVisibilidadCeldaNuevoRelacionesPlaneacionCompra=false;
			this.isVisibilidadCeldaModificarPlaneacionCompra=false;
			this.isVisibilidadCeldaActualizarPlaneacionCompra=false;
			this.isVisibilidadCeldaEliminarPlaneacionCompra=false;
			this.isVisibilidadCeldaCancelarPlaneacionCompra=false;
			this.isVisibilidadCeldaGuardarPlaneacionCompra=false;
			this.isVisibilidadCeldaGuardarCambiosPlaneacionCompra=false;
			
			
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdFormato=true;
			this.isVisibilidadFK_IdMesFin=true;
			this.isVisibilidadFK_IdMesInicio=true;
			this.isVisibilidadFK_IdPeriodo=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdUsuario=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesPlaneacionCompra("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosPlaneacionCompra();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioPlaneacionCompra(false);
			
			this.setPermisosUsuarioPlaneacionCompra();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.planeacioncompraSessionBean.getEsGuardarRelacionado() 
				|| (this.planeacioncompraSessionBean.getEsGuardarRelacionado() && this.planeacioncompraSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioPlaneacionCompraClasesRelacionadas();
			}
			
			if(this.planeacioncompraSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioPlaneacionCompraClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!PlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosPlaneacionCompra();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualPlaneacionCompra();
			}
			
			if(!this.isPermisoBusquedaPlaneacionCompra) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasPlaneacionCompra.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.planeacioncompraSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioPlaneacionCompra,this.isPermisoPaginacionMedioPlaneacionCompra,this.isPermisoPaginacionTodoPlaneacionCompra);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(PlaneacionCompraConstantesFunciones.getTiposSeleccionarPlaneacionCompra());
				
				this.tiposColumnasSelect=PlaneacionCompraConstantesFunciones.getTiposSeleccionarPlaneacionCompra(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectPlaneacionCompra();				
				//this.tiposRelacionesSelect=PlaneacionCompraConstantesFunciones.getTiposRelacionesPlaneacionCompra(true);
				
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
			//if(!this.planeacioncompraSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioPlaneacionCompra();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioPlaneacionCompra(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioPlaneacionCompra(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesPlaneacionCompra() ;
			
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
			
			
			this.detalleplaneacioncompraLogic=new DetallePlaneacionCompraLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			this.ejercicioLogic=new EjercicioLogic();
			this.periodoLogic=new PeriodoLogic();
			this.empleadoLogic=new EmpleadoLogic();
			this.usuarioLogic=new UsuarioLogic();
			this.formatoLogic=new FormatoLogic();
			this.mesinicioLogic=new MesLogic();
			this.mesfinLogic=new MesLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				planeacioncompraImplementable= (PlaneacionCompraImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PlaneacionCompraConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				planeacioncompraImplementableHome= (PlaneacionCompraImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PlaneacionCompraConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.planeacioncompras= new ArrayList<PlaneacionCompra>();
			this.planeacioncomprasEliminados= new ArrayList<PlaneacionCompra>();
						
			this.isEsNuevoPlaneacionCompra=false;
			this.esParaAccionDesdeFormularioPlaneacionCompra=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			this.periodosForeignKey=new ArrayList<Periodo>() ;
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			this.usuariosForeignKey=new ArrayList<Usuario>() ;
			this.formatosForeignKey=new ArrayList<Formato>() ;
			this.mesiniciosForeignKey=new ArrayList<Mes>() ;
			this.mesfinsForeignKey=new ArrayList<Mes>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyPlaneacionCompra(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroPlaneacionCompra();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.planeacioncompraSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			PlaneacionCompraBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=PlaneacionCompraConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesPlaneacionCompra("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingPlaneacionCompra(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioPlaneacionCompra();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioPlaneacionCompra();
			}
			
			PlaneacionCompraBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasPlaneacionCompra.getTabCount(); i++) {
					this.jTabbedPaneBusquedasPlaneacionCompra.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasPlaneacionCompra.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessPlaneacionCompra(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga PlaneacionCompra: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectPlaneacionCompra() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(DetallePlaneacionCompraConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DetallePlaneacionCompraConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesPlaneacionCompra")) {
				iIndex=this.jInternalFrameDetalleFormPlaneacionCompra.jTabbedPaneRelacionesPlaneacionCompra.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormPlaneacionCompra.jTabbedPaneRelacionesPlaneacionCompra.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosPlaneacionCompra.getSelectedRow();	
				
				

				if(sTitle.equals("Detalle Planeacion Compras")) {
					if(!DetallePlaneacionCompraJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessPlaneacionCompra();

						this.cargarParteTabPanelRelacionadaDetallePlaneacionCompra(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessPlaneacionCompra();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaDetallePlaneacionCompra(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormPlaneacionCompra.cargarSessionConBeanSwingJInternalFrameDetallePlaneacionCompra(false,true,iIndex);
		this.jButtonDetallePlaneacionCompraActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDetallePlaneacionCompra();

		//this.jTabbedPaneRelacionesPlaneacionCompra.updateUI();
		//this.jTabbedPaneRelacionesPlaneacionCompra.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesPlaneacionCompra.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("DetallePlaneacionCompra")) {
				int row=this.jTableDatosPlaneacionCompra.getSelectedRow();
				jButtonDetallePlaneacionCompraActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.planeacioncompraSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Detalle Planeacion Compra")) {

					if(this.isTienePermisosDetallePlaneacionCompra && this.planeacioncompraConstantesFunciones.mostrarDetallePlaneacionCompraPlaneacionCompra && !PlaneacionCompraConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Detalle Planeacion Compras"+"("+DetallePlaneacionCompraConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Detalle Planeacion Compras");

						if(planeacioncompraConstantesFunciones.resaltarDetallePlaneacionCompraPlaneacionCompra!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(planeacioncompraConstantesFunciones.resaltarDetallePlaneacionCompraPlaneacionCompra);
						}

						jmenuItem.setEnabled(this.planeacioncompraConstantesFunciones.activarDetallePlaneacionCompraPlaneacionCompra);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DetallePlaneacionCompra"));

						

						this.jInternalFrameDetalleFormPlaneacionCompra.jmenuDetallePlaneacionCompra.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyPlaneacionCompra(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyPlaneacionCompra(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyPlaneacionCompra(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyPlaneacionCompraListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyPlaneacionCompra();
		
		this.cargarCombosFrameForeignKeyPlaneacionCompra();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyPlaneacionCompra();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyPlaneacionCompra();
		}
	}
	
	

	public void cargarCombosForeignKeyEmpleado(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEmpleado(this.empleadosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyFormato(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyFormatoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyFormato();
				this.cargarCombosFrameFormatosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaFormato(this.formatosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyMesInicio(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyMesInicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyMesInicio();
				this.cargarCombosFrameMesIniciosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaMesInicio(this.mesiniciosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyMesFin(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyMesFinListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyMesFin();
				this.cargarCombosFrameMesFinsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaMesFin(this.mesfinsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoPlaneacionCompraActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.planeacioncompraSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormPlaneacionCompra==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			PlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.planeacioncompra,new Object(),this.planeacioncompraParameterGeneral,this.planeacioncompraReturnGeneral);
			
			
			if(jTableDatosPlaneacionCompra.getRowCount()>=1) {
				jTableDatosPlaneacionCompra.removeRowSelectionInterval(0, jTableDatosPlaneacionCompra.getRowCount()-1);						
			}
			
			this.isEsNuevoPlaneacionCompra=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoPlaneacionCompra(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesPlaneacionCompra(true);			
			//this.planeacioncompra=new PlaneacionCompra();
			//this.planeacioncompra.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPlaneacionCompra(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPlaneacionCompra() ;
			
			if(PlaneacionCompraJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePlaneacionCompra(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.planeacioncompra);	
			this.actualizarInformacion("INFO_PADRE",false,this.planeacioncompra);				
			
			PlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.planeacioncompra,new Object(),this.planeacioncompraParameterGeneral,this.planeacioncompraReturnGeneral);
			
			if(this.planeacioncompraSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar PlaneacionCompra: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			PlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.planeacioncompra,new Object(),this.planeacioncompraParameterGeneral,this.planeacioncompraReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarPlaneacionCompraActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<PlaneacionCompra> planeacioncomprasSeleccionados=new ArrayList<PlaneacionCompra>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosPlaneacionCompra.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosPlaneacionCompra.getSelectedRows().length;			
			}
			
			planeacioncomprasSeleccionados=this.getPlaneacionComprasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoPlaneacionCompra--;			
				//PlaneacionCompra planeacioncompraAux= new PlaneacionCompra();			
				//planeacioncompraAux.setId(this.iIdNuevoPlaneacionCompra);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//PlaneacionCompra planeacioncompraOrigen=new PlaneacionCompra();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(PlaneacionCompra planeacioncompraOrigen : planeacioncomprasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosPlaneacionCompra.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							planeacioncompraOrigen =(PlaneacionCompra) this.planeacioncompraLogic.getPlaneacionCompras().toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							planeacioncompraOrigen =(PlaneacionCompra) this.planeacioncompras.toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaPlaneacionCompra();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.planeacioncompra.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosPlaneacionCompra(planeacioncompraOrigen,this.planeacioncompra,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionCompra(this.planeacioncompra);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.planeacioncompraLogic.getPlaneacionCompras().add(this.planeacioncompraAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.planeacioncompras.add(this.planeacioncompraAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaPlaneacionCompra(false);
				
				this.jTableDatosPlaneacionCompra.setRowSelectionInterval(this.getIndiceNuevoPlaneacionCompra(), this.getIndiceNuevoPlaneacionCompra());
				
				int iLastRow =  this.jTableDatosPlaneacionCompra.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPlaneacionCompra.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPlaneacionCompra.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPlaneacionCompra(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarPlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<PlaneacionCompra> planeacioncomprasSeleccionados=new ArrayList<PlaneacionCompra>();									
		
			PlaneacionCompra planeacioncompraOrigen=new PlaneacionCompra();
			PlaneacionCompra planeacioncompraDestino=new PlaneacionCompra();
				
			planeacioncomprasSeleccionados=this.getPlaneacionComprasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosPlaneacionCompra.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || planeacioncomprasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosPlaneacionCompra.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						planeacioncompraOrigen =(PlaneacionCompra) this.planeacioncompraLogic.getPlaneacionCompras().toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						planeacioncompraOrigen =(PlaneacionCompra) this.planeacioncompras.toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						planeacioncompraDestino =(PlaneacionCompra) this.planeacioncompraLogic.getPlaneacionCompras().toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						planeacioncompraDestino =(PlaneacionCompra) this.planeacioncompras.toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				planeacioncompraOrigen =planeacioncomprasSeleccionados.get(0);
				planeacioncompraDestino =planeacioncomprasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosPlaneacionCompra(planeacioncompraOrigen,planeacioncompraDestino,true,false);
				
				planeacioncompraDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(planeacioncompraDestino,planeacioncompraLogic.getPlaneacionCompras());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(planeacioncompraDestino,planeacioncompras);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaPlaneacionCompra(false);
				
				//this.jTableDatosPlaneacionCompra.setRowSelectionInterval(this.getIndiceNuevoPlaneacionCompra(), this.getIndiceNuevoPlaneacionCompra());
				
				int iLastRow =  this.jTableDatosPlaneacionCompra.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPlaneacionCompra.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPlaneacionCompra.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPlaneacionCompra(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormPlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPlaneacionCompra==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormPlaneacionCompra.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarPlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesPlaneacionCompra.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasPlaneacionCompra.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesPlaneacionCompra.setVisible(!isVisible);
			this.jPanelPaginacionPlaneacionCompra.setVisible(!isVisible);
			this.jPanelAccionesPlaneacionCompra.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarPlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFramePlaneacionCompra();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoPlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoPlaneacionCompra();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionPlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionPlaneacionCompra();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByPlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByPlaneacionCompra();
			
			this.abrirFrameOrderByPlaneacionCompra();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByPlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByPlaneacionCompra();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetallePlaneacionCompra(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormPlaneacionCompra);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormPlaneacionCompra.isMaximum()) {
					this.jInternalFrameDetalleFormPlaneacionCompra.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormPlaneacionCompra.setSize(this.jInternalFrameDetalleFormPlaneacionCompra.iWidthFormulario,this.jInternalFrameDetalleFormPlaneacionCompra.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormPlaneacionCompra.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormPlaneacionCompra.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormPlaneacionCompra.isMaximum()) {
						this.jInternalFrameDetalleFormPlaneacionCompra.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormPlaneacionCompra.jContentPaneDetallePlaneacionCompra.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormPlaneacionCompra.jTabbedPaneRelacionesPlaneacionCompra.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormPlaneacionCompra.jContentPaneDetallePlaneacionCompra.getWidth(),PlaneacionCompraConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPlaneacionCompra.jTabbedPaneRelacionesPlaneacionCompra.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormPlaneacionCompra.jContentPaneDetallePlaneacionCompra.getWidth(),PlaneacionCompraConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPlaneacionCompra.jTabbedPaneRelacionesPlaneacionCompra.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormPlaneacionCompra.jContentPaneDetallePlaneacionCompra.getWidth(),PlaneacionCompraConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(DetallePlaneacionCompraJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDetallePlaneacionCompra();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormPlaneacionCompra.setVisible(true);
	        this.jInternalFrameDetalleFormPlaneacionCompra.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByPlaneacionCompra() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByPlaneacionCompra==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByPlaneacionCompra=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPlaneacionCompra,false,this);
				} else {
					this.jInternalFrameOrderByPlaneacionCompra=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPlaneacionCompra,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByPlaneacionCompra);
				this.jInternalFrameOrderByPlaneacionCompra.setVisible(false);
				this.jInternalFrameOrderByPlaneacionCompra.setSelected(false);
				
				this.jInternalFrameOrderByPlaneacionCompra.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPlaneacionCompra"));
				
				this.inicializarActualizarBindingTablaOrderByPlaneacionCompra();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionPlaneacionCompra() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionPlaneacionCompra==null) {
				
				this.jInternalFrameImportacionPlaneacionCompra=new ImportacionJInternalFrame(PlaneacionCompraConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPlaneacionCompra);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionPlaneacionCompra);
				this.jInternalFrameImportacionPlaneacionCompra.setVisible(false);
				this.jInternalFrameImportacionPlaneacionCompra.setSelected(false);


				this.jInternalFrameImportacionPlaneacionCompra.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPlaneacionCompra"));
				this.jInternalFrameImportacionPlaneacionCompra.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPlaneacionCompra"));
				this.jInternalFrameImportacionPlaneacionCompra.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPlaneacionCompra"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoPlaneacionCompra() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoPlaneacionCompra==null) {
				this.jInternalFrameReporteDinamicoPlaneacionCompra=new ReporteDinamicoJInternalFrame(PlaneacionCompraConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPlaneacionCompra);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPlaneacionCompra);
				this.jInternalFrameReporteDinamicoPlaneacionCompra.setVisible(false);
				this.jInternalFrameReporteDinamicoPlaneacionCompra.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoPlaneacionCompra.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPlaneacionCompra"));
				this.jInternalFrameReporteDinamicoPlaneacionCompra.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPlaneacionCompra"));
				this.jInternalFrameReporteDinamicoPlaneacionCompra.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPlaneacionCompra"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPlaneacionCompra();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaDetallePlaneacionCompra() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.jScrollPanelDatosDetallePlaneacionCompra.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormPlaneacionCompra.jContentPaneDetallePlaneacionCompra.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.jScrollPanelDatosDetallePlaneacionCompra.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.jScrollPanelDatosDetallePlaneacionCompra.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.jScrollPanelDatosDetallePlaneacionCompra.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetallePlaneacionCompra() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormPlaneacionCompra);
			
	       	this.jInternalFrameDetalleFormPlaneacionCompra.setVisible(false);
	        this.jInternalFrameDetalleFormPlaneacionCompra.setSelected(false);
			
			//this.jInternalFrameDetalleFormPlaneacionCompra.dispose();
			//this.jInternalFrameDetalleFormPlaneacionCompra=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoPlaneacionCompra() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoPlaneacionCompra.setVisible(true);
	        this.jInternalFrameReporteDinamicoPlaneacionCompra.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionPlaneacionCompra() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionPlaneacionCompra.setVisible(true);
	        this.jInternalFrameImportacionPlaneacionCompra.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByPlaneacionCompra() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByPlaneacionCompra.setVisible(true);
	        this.jInternalFrameOrderByPlaneacionCompra.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByPlaneacionCompra() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByPlaneacionCompra.setVisible(false);
	        this.jInternalFrameOrderByPlaneacionCompra.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoPlaneacionCompra() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoPlaneacionCompra.setVisible(false);
	        this.jInternalFrameReporteDinamicoPlaneacionCompra.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionPlaneacionCompra() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionPlaneacionCompra.setVisible(false);
	        this.jInternalFrameImportacionPlaneacionCompra.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarPlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarPlaneacionCompra(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarPlaneacionCompra(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPlaneacionCompra.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesPlaneacionCompra(true);
			//this.isEsNuevoPlaneacionCompra=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompra =(PlaneacionCompra) this.planeacioncompraLogic.getPlaneacionCompras().toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.planeacioncompra =(PlaneacionCompra) this.planeacioncompras.toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesPlaneacionCompra("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPlaneacionCompra(false) ;
			
			if(planeacioncompraSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado() && DetallePlaneacionCompraJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetallePlaneacionCompraActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(PlaneacionCompraJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePlaneacionCompra(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPlaneacionCompra(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaPlaneacionCompraActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosPlaneacionCompra.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompra =(PlaneacionCompra) this.planeacioncompraLogic.getPlaneacionCompras().toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.planeacioncompra =(PlaneacionCompra) this.planeacioncompras.toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarPlaneacionCompra(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPlaneacionCompra==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPlaneacionCompra.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesPlaneacionCompra(true);
			//this.isEsNuevoPlaneacionCompra=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompra =(PlaneacionCompra) this.planeacioncompraLogic.getPlaneacionCompras().toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.planeacioncompra =(PlaneacionCompra) this.planeacioncompras.toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.planeacioncompra.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesPlaneacionCompra("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesPlaneacionCompra(false) ;
			
			if(PlaneacionCompraJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePlaneacionCompra(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPlaneacionCompra(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
					
	
	public void recargarComboTablaEmpleado(List<Empleado> empleadosForeignKey)throws Exception{
		TableColumn tableColumnEmpleado=this.jTableDatosPlaneacionCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaneacionCompra,PlaneacionCompraConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPlaneacionCompra.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadosForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
		
	
	public void recargarComboTablaFormato(List<Formato> formatosForeignKey)throws Exception{
		TableColumn tableColumnFormato=this.jTableDatosPlaneacionCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaneacionCompra,PlaneacionCompraConstantesFunciones.LABEL_IDFORMATO));
		TableCellEditor tableCellEditorFormato =tableColumnFormato.getCellEditor();

		FormatoTableCell formatoTableCellFk=(FormatoTableCell)tableCellEditorFormato;

		if(formatoTableCellFk!=null) {
			formatoTableCellFk.setformatosForeignKey(formatosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPlaneacionCompra.getSelectedRow();

		//if(intSelectedRow<=0) {
			//formatoTableCellFk.setRowActual(intSelectedRow);
			//formatoTableCellFk.setformatosForeignKeyActual(formatosForeignKey);
		//}


		if(formatoTableCellFk!=null) {
			formatoTableCellFk.RecargarFormatosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaMesInicio(List<Mes> mesiniciosForeignKey)throws Exception{
		TableColumn tableColumnMesInicio=this.jTableDatosPlaneacionCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaneacionCompra,PlaneacionCompraConstantesFunciones.LABEL_IDMESINICIO));
		TableCellEditor tableCellEditorMesInicio =tableColumnMesInicio.getCellEditor();

		MesTableCell mesTableCellFk=(MesTableCell)tableCellEditorMesInicio;

		if(mesTableCellFk!=null) {
			mesTableCellFk.setmessForeignKey(mesiniciosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPlaneacionCompra.getSelectedRow();

		//if(intSelectedRow<=0) {
			//mesTableCellFk.setRowActual(intSelectedRow);
			//mesTableCellFk.setmessForeignKeyActual(mesiniciosForeignKey);
		//}


		if(mesTableCellFk!=null) {
			mesTableCellFk.RecargarMessForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaMesFin(List<Mes> mesfinsForeignKey)throws Exception{
		TableColumn tableColumnMesFin=this.jTableDatosPlaneacionCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaneacionCompra,PlaneacionCompraConstantesFunciones.LABEL_IDMESFIN));
		TableCellEditor tableCellEditorMesFin =tableColumnMesFin.getCellEditor();

		MesTableCell mesTableCellFk=(MesTableCell)tableCellEditorMesFin;

		if(mesTableCellFk!=null) {
			mesTableCellFk.setmessForeignKey(mesfinsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPlaneacionCompra.getSelectedRow();

		//if(intSelectedRow<=0) {
			//mesTableCellFk.setRowActual(intSelectedRow);
			//mesTableCellFk.setmessForeignKeyActual(mesfinsForeignKey);
		//}


		if(mesTableCellFk!=null) {
			mesTableCellFk.RecargarMessForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarPlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesPlaneacionCompra(false);
			
			//if(!this.isEsNuevoPlaneacionCompra) {								
				int intSelectedRow = this.jTableDatosPlaneacionCompra.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompra =(PlaneacionCompra) this.planeacioncompraLogic.getPlaneacionCompras().toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.planeacioncompra =(PlaneacionCompra) this.planeacioncompras.toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(PlaneacionCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualPlaneacionCompra(this.planeacioncompra,true);
				this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionCompra(this.planeacioncompra);
				
			}
			
			if(this.permiteMantenimiento(this.planeacioncompra)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.planeacioncompraSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoPlaneacionCompra=true;
					this.inicializarActualizarBindingTablaPlaneacionCompra(false);
					this.isEsNuevoPlaneacionCompra=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoPlaneacionCompra=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoPlaneacionCompra=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPlaneacionCompra(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPlaneacionCompra(false);
				
				this.habilitarDeshabilitarControlesPlaneacionCompra(false);
			
												
				
				if(PlaneacionCompraJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetallePlaneacionCompra();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoPlaneacionCompraActionPerformed(evt,planeacioncompraSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualPlaneacionCompra(this.planeacioncompra,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosPlaneacionCompra.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,planeacioncompraSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.planeacioncompra.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(PlaneacionCompra.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PlaneacionCompra.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarPlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosPlaneacionCompra.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompra =(PlaneacionCompra) this.planeacioncompraLogic.getPlaneacionCompras().toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				this.planeacioncompra.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.planeacioncompra =(PlaneacionCompra) this.planeacioncompras.toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				this.planeacioncompra.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.planeacioncompra)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.planeacioncompraSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((PlaneacionCompraModel) this.jTableDatosPlaneacionCompra.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoPlaneacionCompra=true;
				this.inicializarActualizarBindingTablaPlaneacionCompra(false);
				this.isEsNuevoPlaneacionCompra=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPlaneacionCompra(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPlaneacionCompra(false);
				
				this.habilitarDeshabilitarControlesPlaneacionCompra(false);
				
				
				
				if(PlaneacionCompraJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetallePlaneacionCompra();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarPlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosPlaneacionCompra.getRowCount()>=1) {
				jTableDatosPlaneacionCompra.removeRowSelectionInterval(0, jTableDatosPlaneacionCompra.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesPlaneacionCompra(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaPlaneacionCompra(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPlaneacionCompra(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPlaneacionCompra(false) ;
			
			this.isEsNuevoPlaneacionCompra=false;
			
			if(PlaneacionCompraJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetallePlaneacionCompra();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosPlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingPlaneacionCompra(false);
				
				//SI ES MANUAL
				if(PlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualPlaneacionCompra();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosPlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoPlaneacionCompra--;			
			//PlaneacionCompra planeacioncompraAux= new PlaneacionCompra();			
			//planeacioncompraAux.setId(this.iIdNuevoPlaneacionCompra);
			
			if(this.jInternalFrameDetalleFormPlaneacionCompra==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaPlaneacionCompra();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionCompra(this.planeacioncompra);
			
			this.planeacioncompra.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.planeacioncompraLogic.getPlaneacionCompras().add(this.planeacioncompraAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.planeacioncompras.add(this.planeacioncompraAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaPlaneacionCompra(false);
			
			this.jTableDatosPlaneacionCompra.setRowSelectionInterval(this.getIndiceNuevoPlaneacionCompra(), this.getIndiceNuevoPlaneacionCompra());
			
			int iLastRow =  this.jTableDatosPlaneacionCompra.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosPlaneacionCompra.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosPlaneacionCompra.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaPlaneacionCompra(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionPlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingPlaneacionCompra(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPlaneacionCompra(false);
			
			//SI ES MANUAL
			if(PlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPlaneacionCompra();
			}
			
			//this.abrirFrameTreePlaneacionCompra();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionPlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Planeacion CompraS ?", "MANTENIMIENTO DE Planeacion Compra", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionPlaneacionCompra.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralPlaneacionCompra();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.planeacioncompraReturnGeneral=planeacioncompraLogic.procesarImportacionPlaneacionComprasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.planeacioncompraParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarPlaneacionCompraReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionPlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionPlaneacionCompra.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionPlaneacionCompra.setFileImportacion(this.jInternalFrameImportacionPlaneacionCompra.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionPlaneacionCompra.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionPlaneacionCompra.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionPlaneacionCompra.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionPlaneacionCompra.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoPlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<PlaneacionCompra> planeacioncomprasSeleccionados=new ArrayList<PlaneacionCompra>();		

		planeacioncomprasSeleccionados=this.getPlaneacionComprasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPlaneacionCompra.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPlaneacionCompra.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("PlaneacionCompraBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"PlaneacionCompraBaseDesign.jrxml";
			
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
			
			this.generarReportePlaneacionCompras("Todos",planeacioncomprasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.planeacioncompraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Planeacion Compra",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoPlaneacionCompra.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPlaneacionCompra.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PlaneacionCompraConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PlaneacionCompraConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PlaneacionCompraConstantesFunciones.LABEL_IDEJERCICIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ejercicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ejercicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ejercicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ejercicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PlaneacionCompraConstantesFunciones.LABEL_IDPERIODO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Periodo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Periodo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Periodo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Periodo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PlaneacionCompraConstantesFunciones.LABEL_IDEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PlaneacionCompraConstantesFunciones.LABEL_IDUSUARIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Usuario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Usuario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Usuario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Usuario_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PlaneacionCompraConstantesFunciones.LABEL_IDFORMATO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Formato_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Formato_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Formato_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Formato_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PlaneacionCompraConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroPreImpreso_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroPreImpreso_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroPreImpreso_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroPreImpreso_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PlaneacionCompraConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PlaneacionCompraConstantesFunciones.LABEL_IDMESINICIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_MesInicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_MesInicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_MesInicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_MesInicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PlaneacionCompraConstantesFunciones.LABEL_IDMESFIN:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_MesFin_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_MesFin_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_MesFin_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_MesFin_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PlaneacionCompraConstantesFunciones.LABEL_NUMEROMESES:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroMeses_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroMeses_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroMeses_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroMeses_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PlaneacionCompraConstantesFunciones.LABEL_FECHACORTE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaCorte_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaCorte_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaCorte_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaCorte_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PlaneacionCompraConstantesFunciones.LABEL_CODIGOPEDIDO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoPedido_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoPedido_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoPedido_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoPedido_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION1:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion1_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion1_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion1_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion1_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION2:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion2_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion2_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion2_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion2_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION3:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion3_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion3_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion3_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion3_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoPlaneacionCompra.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoPlaneacionCompra.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoPlaneacionCompra.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case PlaneacionCompraConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoria="id_ejercicio";
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoria="id_periodo";
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoria="id_empleado";
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_IDUSUARIO:
					sNombreCampoCategoria="id_usuario";
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_IDFORMATO:
					sNombreCampoCategoria="id_formato";
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					sNombreCampoCategoria="numero_pre_impreso";
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_IDMESINICIO:
					sNombreCampoCategoria="id_mes_inicio";
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_IDMESFIN:
					sNombreCampoCategoria="id_mes_fin";
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_NUMEROMESES:
					sNombreCampoCategoria="numero_meses";
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_FECHACORTE:
					sNombreCampoCategoria="fecha_corte";
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_CODIGOPEDIDO:
					sNombreCampoCategoria="codigo_pedido";
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION1:
					sNombreCampoCategoria="descripcion1";
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION2:
					sNombreCampoCategoria="descripcion2";
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION3:
					sNombreCampoCategoria="descripcion3";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoPlaneacionCompra.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case PlaneacionCompraConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoriaValor="id_ejercicio";
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoriaValor="id_periodo";
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoriaValor="id_empleado";
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_IDUSUARIO:
					sNombreCampoCategoriaValor="id_usuario";
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_IDFORMATO:
					sNombreCampoCategoriaValor="id_formato";
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					sNombreCampoCategoriaValor="numero_pre_impreso";
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_IDMESINICIO:
					sNombreCampoCategoriaValor="id_mes_inicio";
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_IDMESFIN:
					sNombreCampoCategoriaValor="id_mes_fin";
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_NUMEROMESES:
					sNombreCampoCategoriaValor="numero_meses";
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_FECHACORTE:
					sNombreCampoCategoriaValor="fecha_corte";
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_CODIGOPEDIDO:
					sNombreCampoCategoriaValor="codigo_pedido";
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION1:
					sNombreCampoCategoriaValor="descripcion1";
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION2:
					sNombreCampoCategoriaValor="descripcion2";
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION3:
					sNombreCampoCategoriaValor="descripcion3";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoPlaneacionCompra.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPlaneacionCompra.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PlaneacionCompraConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_IDEJERCICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ejercicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ejercicio");
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_IDPERIODO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Periodo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_periodo");
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_IDEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado");
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_IDUSUARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Usuario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_usuario");
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_IDFORMATO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Formato",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_formato");
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Pre Impreso",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_pre_impreso");
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_IDMESINICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Mes Inicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_mes_inicio");
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_IDMESFIN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Mes Fin",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_mes_fin");
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_NUMEROMESES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Meses",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_meses");
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_FECHACORTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Corte",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_corte");
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_CODIGOPEDIDO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Pedido",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_pedido");
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION1:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion1",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion1");
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION2:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion2",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion2");
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION3:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion3",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion3");
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
	
	public void jButtonGenerarExcelReporteDinamicoPlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<PlaneacionCompra> planeacioncomprasSeleccionados=new ArrayList<PlaneacionCompra>();		
		
		planeacioncomprasSeleccionados=this.getPlaneacionComprasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"planeacioncompra";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("PlaneacionCompras");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoPlaneacionCompra.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoPlaneacionCompra.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case PlaneacionCompraConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PlaneacionCompraConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(PlaneacionCompra planeacioncompra:planeacioncomprasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(planeacioncompra.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PlaneacionCompraConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(PlaneacionCompra planeacioncompra:planeacioncomprasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(planeacioncompra.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PlaneacionCompraConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(PlaneacionCompra planeacioncompra:planeacioncomprasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(planeacioncompra.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_IDPERIODO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PlaneacionCompraConstantesFunciones.LABEL_IDPERIODO);
					iRow++;

					for(PlaneacionCompra planeacioncompra:planeacioncomprasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(planeacioncompra.getperiodo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PlaneacionCompraConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(PlaneacionCompra planeacioncompra:planeacioncomprasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(planeacioncompra.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_IDUSUARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PlaneacionCompraConstantesFunciones.LABEL_IDUSUARIO);
					iRow++;

					for(PlaneacionCompra planeacioncompra:planeacioncomprasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(planeacioncompra.getusuario_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_IDFORMATO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PlaneacionCompraConstantesFunciones.LABEL_IDFORMATO);
					iRow++;

					for(PlaneacionCompra planeacioncompra:planeacioncomprasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(planeacioncompra.getformato_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PlaneacionCompraConstantesFunciones.LABEL_NUMEROPREIMPRESO);
					iRow++;

					for(PlaneacionCompra planeacioncompra:planeacioncomprasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(planeacioncompra.getnumero_pre_impreso());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PlaneacionCompraConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(PlaneacionCompra planeacioncompra:planeacioncomprasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(planeacioncompra.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_IDMESINICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PlaneacionCompraConstantesFunciones.LABEL_IDMESINICIO);
					iRow++;

					for(PlaneacionCompra planeacioncompra:planeacioncomprasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(planeacioncompra.getmesinicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_IDMESFIN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PlaneacionCompraConstantesFunciones.LABEL_IDMESFIN);
					iRow++;

					for(PlaneacionCompra planeacioncompra:planeacioncomprasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(planeacioncompra.getmesfin_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_NUMEROMESES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PlaneacionCompraConstantesFunciones.LABEL_NUMEROMESES);
					iRow++;

					for(PlaneacionCompra planeacioncompra:planeacioncomprasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(planeacioncompra.getnumero_meses());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_FECHACORTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PlaneacionCompraConstantesFunciones.LABEL_FECHACORTE);
					iRow++;

					for(PlaneacionCompra planeacioncompra:planeacioncomprasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(planeacioncompra.getfecha_corte());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_CODIGOPEDIDO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PlaneacionCompraConstantesFunciones.LABEL_CODIGOPEDIDO);
					iRow++;

					for(PlaneacionCompra planeacioncompra:planeacioncomprasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(planeacioncompra.getcodigo_pedido());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION1:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION1);
					iRow++;

					for(PlaneacionCompra planeacioncompra:planeacioncomprasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(planeacioncompra.getdescripcion1());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION2:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION2);
					iRow++;

					for(PlaneacionCompra planeacioncompra:planeacioncomprasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(planeacioncompra.getdescripcion2());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION3:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION3);
					iRow++;

					for(PlaneacionCompra planeacioncompra:planeacioncomprasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(planeacioncompra.getdescripcion3());
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
			//	this.getFilaCabeceraExportarExcelPlaneacionCompra(row);				
			//	iRow++;
			//}				
			
			//for(PlaneacionCompra planeacioncompraAux:planeacioncomprasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelPlaneacionCompra(planeacioncompraAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.planeacioncompraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Planeacion Compra",JOptionPane.INFORMATION_MESSAGE);
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
				this.planeacioncompraLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPlaneacionCompra(false);
			
			//SI ES MANUAL
			if(PlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPlaneacionCompra();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresPlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPlaneacionCompra(false);
			
			//SI ES MANUAL
			if(PlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPlaneacionCompra();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesPlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPlaneacionCompra(false);
			
			//SI ES MANUAL
			if(PlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPlaneacionCompra();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaPlaneacionCompra() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosPlaneacionCompra.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosPlaneacionCompra.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosPlaneacionCompra.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosPlaneacionCompra.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosPlaneacionCompra.setMinimumSize(dimensionMinimum);
		this.jTableDatosPlaneacionCompra.setMaximumSize(dimensionMaximum);
		this.jTableDatosPlaneacionCompra.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingPlaneacionCompra(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingPlaneacionCompra(esInicializar,true);
	}
	
	public void inicializarActualizarBindingPlaneacionCompra(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaPlaneacionCompra(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesPlaneacionCompra(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.planeacioncompraSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasPlaneacionCompra(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPlaneacionCompra(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesPlaneacionCompra(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !PlaneacionCompraJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!PlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualPlaneacionCompra() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaPlaneacionCompra();
		
		this.inicializarActualizarBindingBotonesManualPlaneacionCompra(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.planeacioncompraSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualPlaneacionCompra();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPlaneacionCompra() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualPlaneacionCompra(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualPlaneacionCompra(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosPlaneacionCompra.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosPlaneacionCompra.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReportePlaneacionCompra.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormPlaneacionCompra.jCheckBoxPostAccionNuevoPlaneacionCompra.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormPlaneacionCompra.jCheckBoxPostAccionSinCerrarPlaneacionCompra.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormPlaneacionCompra.jCheckBoxPostAccionSinMensajePlaneacionCompra.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosPlaneacionCompra.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosPlaneacionCompra.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReportePlaneacionCompra.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) {
				this.jInternalFrameDetalleFormPlaneacionCompra.jCheckBoxPostAccionNuevoPlaneacionCompra.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormPlaneacionCompra.jCheckBoxPostAccionSinCerrarPlaneacionCompra.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormPlaneacionCompra.jCheckBoxPostAccionSinMensajePlaneacionCompra.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionPlaneacionCompra.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionPlaneacionCompra.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxTiposAccionesFormularioPlaneacionCompra.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesPlaneacionCompra.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoPlaneacionCompra!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPlaneacionCompra.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesPlaneacionCompra.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesPlaneacionCompra.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarPlaneacionCompra.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesPlaneacionCompra.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoPlaneacionCompra!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPlaneacionCompra.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesPlaneacionCompra.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralPlaneacionCompra.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPlaneacionCompra(Boolean esInicializar) throws Exception {
		try	{	
			if(PlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualPlaneacionCompra(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesPlaneacionCompra() throws Exception {
		try	{
			if(PlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualPlaneacionCompra();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePlaneacionCompra() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxTiposAccionesFormularioPlaneacionCompra.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxTiposAccionesFormularioPlaneacionCompra.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualPlaneacionCompra() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesPlaneacionCompra.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesPlaneacionCompra.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesPlaneacionCompra.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesPlaneacionCompra.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesPlaneacionCompra.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesPlaneacionCompra.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionPlaneacionCompra.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionPlaneacionCompra.addItem(reporte);
			}
			
			
			if(!this.planeacioncompraSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionPlaneacionCompra.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionPlaneacionCompra.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesPlaneacionCompra.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesPlaneacionCompra.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesPlaneacionCompra.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesPlaneacionCompra.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxTiposAccionesFormularioPlaneacionCompra.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxTiposAccionesFormularioPlaneacionCompra.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarPlaneacionCompra.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarPlaneacionCompra.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarPlaneacionCompra.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPlaneacionCompra();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPlaneacionCompra() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPlaneacionCompra!=null) {
				this.jInternalFrameReporteDinamicoPlaneacionCompra.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoPlaneacionCompra.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPlaneacionCompra!=null) {
				this.jInternalFrameReporteDinamicoPlaneacionCompra.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoPlaneacionCompra.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoPlaneacionCompra!=null) {
				
				if(this.jInternalFrameReporteDinamicoPlaneacionCompra.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPlaneacionCompra.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPlaneacionCompra.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoPlaneacionCompra.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPlaneacionCompra.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPlaneacionCompra.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualPlaneacionCompra()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_empleadoFK_IdEmpleadoPlaneacionCompra.getSelectedItem()!=null){this.id_empleadoFK_IdEmpleado=((Empleado)this.jComboBoxid_empleadoFK_IdEmpleadoPlaneacionCompra.getSelectedItem()).getId();}
		if(this.jComboBoxid_formatoFK_IdFormatoPlaneacionCompra.getSelectedItem()!=null){this.id_formatoFK_IdFormato=((Formato)this.jComboBoxid_formatoFK_IdFormatoPlaneacionCompra.getSelectedItem()).getId();}
		if(this.jComboBoxid_mes_finFK_IdMesFinPlaneacionCompra.getSelectedItem()!=null){this.id_mes_finFK_IdMesFin=((Mes)this.jComboBoxid_mes_finFK_IdMesFinPlaneacionCompra.getSelectedItem()).getId();}
		if(this.jComboBoxid_mes_inicioFK_IdMesInicioPlaneacionCompra.getSelectedItem()!=null){this.id_mes_inicioFK_IdMesInicio=((Mes)this.jComboBoxid_mes_inicioFK_IdMesInicioPlaneacionCompra.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasPlaneacionCompra(Boolean esInicializar) throws Exception {				
		if(PlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualPlaneacionCompra();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaPlaneacionCompra() throws Exception {
		this.inicializarActualizarBindingTablaPlaneacionCompra(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByPlaneacionCompra() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByPlaneacionCompra.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByPlaneacionCompra.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPlaneacionCompra.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new PlaneacionCompraPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByPlaneacionCompra.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPlaneacionCompra.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new PlaneacionCompraPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosPlaneacionCompraOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaneacionCompraOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new PlaneacionCompraPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByPlaneacionCompra.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPlaneacionCompra.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new PlaneacionCompraPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByPlaneacionCompra.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaPlaneacionCompra(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=planeacioncompraLogic.getPlaneacionCompras().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=planeacioncompras.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(PlaneacionCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosPlaneacionCompra.setModel(new PlaneacionCompraModel(this.planeacioncompraLogic.getPlaneacionCompras(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosPlaneacionCompra.setModel(new PlaneacionCompraModel(this.planeacioncompras,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByPlaneacionCompra!=null && this.jInternalFrameOrderByPlaneacionCompra.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByPlaneacionCompra();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosPlaneacionCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaneacionCompra,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new PlaneacionCompraPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+PlaneacionCompraConstantesFunciones.SCLASSWEBTITULO,planeacioncompraConstantesFunciones.resaltarSeleccionarPlaneacionCompra,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+PlaneacionCompraConstantesFunciones.SCLASSWEBTITULO,planeacioncompraConstantesFunciones.resaltarSeleccionarPlaneacionCompra,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosPlaneacionCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaneacionCompra,PlaneacionCompraConstantesFunciones.LABEL_ID));

		if(this.planeacioncompraConstantesFunciones.mostraridPlaneacionCompra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PlaneacionCompraConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.planeacioncompraConstantesFunciones.resaltaridPlaneacionCompra,this.planeacioncompraConstantesFunciones.activaridPlaneacionCompra,this,true,"idPlaneacionCompra","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.planeacioncompraConstantesFunciones.resaltaridPlaneacionCompra,this.planeacioncompraConstantesFunciones.activaridPlaneacionCompra,this,true,"idPlaneacionCompra","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPlaneacionCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaneacionCompra,PlaneacionCompraConstantesFunciones.LABEL_IDEMPRESA));

		if(this.planeacioncompraConstantesFunciones.mostrarid_empresaPlaneacionCompra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PlaneacionCompraConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.planeacioncompraConstantesFunciones.resaltarid_empresaPlaneacionCompra,this,this.planeacioncompraConstantesFunciones.activarid_empresaPlaneacionCompra));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.planeacioncompraConstantesFunciones.resaltarid_empresaPlaneacionCompra,this,this.planeacioncompraConstantesFunciones.activarid_empresaPlaneacionCompra,false,"id_empresaPlaneacionCompra","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PlaneacionCompraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPlaneacionCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaneacionCompra,PlaneacionCompraConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.planeacioncompraConstantesFunciones.mostrarid_sucursalPlaneacionCompra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PlaneacionCompraConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.planeacioncompraConstantesFunciones.resaltarid_sucursalPlaneacionCompra,this,this.planeacioncompraConstantesFunciones.activarid_sucursalPlaneacionCompra));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.planeacioncompraConstantesFunciones.resaltarid_sucursalPlaneacionCompra,this,this.planeacioncompraConstantesFunciones.activarid_sucursalPlaneacionCompra,false,"id_sucursalPlaneacionCompra","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PlaneacionCompraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPlaneacionCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaneacionCompra,PlaneacionCompraConstantesFunciones.LABEL_IDEJERCICIO));

		if(this.planeacioncompraConstantesFunciones.mostrarid_ejercicioPlaneacionCompra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PlaneacionCompraConstantesFunciones.LABEL_IDEJERCICIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EjercicioTableCell(this.ejerciciosForeignKey,this.planeacioncompraConstantesFunciones.resaltarid_ejercicioPlaneacionCompra,this,this.planeacioncompraConstantesFunciones.activarid_ejercicioPlaneacionCompra));
			tableColumn.setCellEditor(new EjercicioTableCell(this.ejerciciosForeignKey,this.planeacioncompraConstantesFunciones.resaltarid_ejercicioPlaneacionCompra,this,this.planeacioncompraConstantesFunciones.activarid_ejercicioPlaneacionCompra,false,"id_ejercicioPlaneacionCompra","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PlaneacionCompraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPlaneacionCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaneacionCompra,PlaneacionCompraConstantesFunciones.LABEL_IDPERIODO));

		if(this.planeacioncompraConstantesFunciones.mostrarid_periodoPlaneacionCompra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PlaneacionCompraConstantesFunciones.LABEL_IDPERIODO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new PeriodoTableCell(this.periodosForeignKey,this.planeacioncompraConstantesFunciones.resaltarid_periodoPlaneacionCompra,this,this.planeacioncompraConstantesFunciones.activarid_periodoPlaneacionCompra));
			tableColumn.setCellEditor(new PeriodoTableCell(this.periodosForeignKey,this.planeacioncompraConstantesFunciones.resaltarid_periodoPlaneacionCompra,this,this.planeacioncompraConstantesFunciones.activarid_periodoPlaneacionCompra,false,"id_periodoPlaneacionCompra","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PlaneacionCompraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPlaneacionCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaneacionCompra,PlaneacionCompraConstantesFunciones.LABEL_IDEMPLEADO));

		if(this.planeacioncompraConstantesFunciones.mostrarid_empleadoPlaneacionCompra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PlaneacionCompraConstantesFunciones.LABEL_IDEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosForeignKey,this.planeacioncompraConstantesFunciones.resaltarid_empleadoPlaneacionCompra,this,this.planeacioncompraConstantesFunciones.activarid_empleadoPlaneacionCompra));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosForeignKey,this.planeacioncompraConstantesFunciones.resaltarid_empleadoPlaneacionCompra,this,this.planeacioncompraConstantesFunciones.activarid_empleadoPlaneacionCompra,true,"id_empleadoPlaneacionCompra","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new PlaneacionCompraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPlaneacionCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaneacionCompra,PlaneacionCompraConstantesFunciones.LABEL_IDUSUARIO));

		if(this.planeacioncompraConstantesFunciones.mostrarid_usuarioPlaneacionCompra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PlaneacionCompraConstantesFunciones.LABEL_IDUSUARIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new UsuarioTableCell(this.usuariosForeignKey,this.planeacioncompraConstantesFunciones.resaltarid_usuarioPlaneacionCompra,this,this.planeacioncompraConstantesFunciones.activarid_usuarioPlaneacionCompra));
			tableColumn.setCellEditor(new UsuarioTableCell(this.usuariosForeignKey,this.planeacioncompraConstantesFunciones.resaltarid_usuarioPlaneacionCompra,this,this.planeacioncompraConstantesFunciones.activarid_usuarioPlaneacionCompra,false,"id_usuarioPlaneacionCompra","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PlaneacionCompraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPlaneacionCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaneacionCompra,PlaneacionCompraConstantesFunciones.LABEL_IDFORMATO));

		if(this.planeacioncompraConstantesFunciones.mostrarid_formatoPlaneacionCompra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PlaneacionCompraConstantesFunciones.LABEL_IDFORMATO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new FormatoTableCell(this.formatosForeignKey,this.planeacioncompraConstantesFunciones.resaltarid_formatoPlaneacionCompra,this,this.planeacioncompraConstantesFunciones.activarid_formatoPlaneacionCompra));
			tableColumn.setCellEditor(new FormatoTableCell(this.formatosForeignKey,this.planeacioncompraConstantesFunciones.resaltarid_formatoPlaneacionCompra,this,this.planeacioncompraConstantesFunciones.activarid_formatoPlaneacionCompra,true,"id_formatoPlaneacionCompra","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PlaneacionCompraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPlaneacionCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaneacionCompra,PlaneacionCompraConstantesFunciones.LABEL_NUMEROPREIMPRESO));

		if(this.planeacioncompraConstantesFunciones.mostrarnumero_pre_impresoPlaneacionCompra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PlaneacionCompraConstantesFunciones.LABEL_NUMEROPREIMPRESO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.planeacioncompraConstantesFunciones.resaltarnumero_pre_impresoPlaneacionCompra,this.planeacioncompraConstantesFunciones.activarnumero_pre_impresoPlaneacionCompra,this,true,"numero_pre_impresoPlaneacionCompra","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.planeacioncompraConstantesFunciones.resaltarnumero_pre_impresoPlaneacionCompra,this.planeacioncompraConstantesFunciones.activarnumero_pre_impresoPlaneacionCompra,this,true,"numero_pre_impresoPlaneacionCompra","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PlaneacionCompraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPlaneacionCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaneacionCompra,PlaneacionCompraConstantesFunciones.LABEL_FECHA));

		if(this.planeacioncompraConstantesFunciones.mostrarfechaPlaneacionCompra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PlaneacionCompraConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.planeacioncompraConstantesFunciones.resaltarfechaPlaneacionCompra,this.planeacioncompraConstantesFunciones.activarfechaPlaneacionCompra,this,true,"fechaPlaneacionCompra","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.planeacioncompraConstantesFunciones.resaltarfechaPlaneacionCompra,this.planeacioncompraConstantesFunciones.activarfechaPlaneacionCompra,this,true,"fechaPlaneacionCompra","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new PlaneacionCompraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPlaneacionCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaneacionCompra,PlaneacionCompraConstantesFunciones.LABEL_IDMESINICIO));

		if(this.planeacioncompraConstantesFunciones.mostrarid_mes_inicioPlaneacionCompra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PlaneacionCompraConstantesFunciones.LABEL_IDMESINICIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new MesTableCell(this.mesiniciosForeignKey,this.planeacioncompraConstantesFunciones.resaltarid_mes_inicioPlaneacionCompra,this,this.planeacioncompraConstantesFunciones.activarid_mes_inicioPlaneacionCompra));
			tableColumn.setCellEditor(new MesTableCell(this.mesiniciosForeignKey,this.planeacioncompraConstantesFunciones.resaltarid_mes_inicioPlaneacionCompra,this,this.planeacioncompraConstantesFunciones.activarid_mes_inicioPlaneacionCompra,true,"id_mes_inicioPlaneacionCompra","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PlaneacionCompraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPlaneacionCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaneacionCompra,PlaneacionCompraConstantesFunciones.LABEL_IDMESFIN));

		if(this.planeacioncompraConstantesFunciones.mostrarid_mes_finPlaneacionCompra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PlaneacionCompraConstantesFunciones.LABEL_IDMESFIN,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new MesTableCell(this.mesfinsForeignKey,this.planeacioncompraConstantesFunciones.resaltarid_mes_finPlaneacionCompra,this,this.planeacioncompraConstantesFunciones.activarid_mes_finPlaneacionCompra));
			tableColumn.setCellEditor(new MesTableCell(this.mesfinsForeignKey,this.planeacioncompraConstantesFunciones.resaltarid_mes_finPlaneacionCompra,this,this.planeacioncompraConstantesFunciones.activarid_mes_finPlaneacionCompra,true,"id_mes_finPlaneacionCompra","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PlaneacionCompraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPlaneacionCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaneacionCompra,PlaneacionCompraConstantesFunciones.LABEL_NUMEROMESES));

		if(this.planeacioncompraConstantesFunciones.mostrarnumero_mesesPlaneacionCompra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PlaneacionCompraConstantesFunciones.LABEL_NUMEROMESES,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.planeacioncompraConstantesFunciones.resaltarnumero_mesesPlaneacionCompra,this.planeacioncompraConstantesFunciones.activarnumero_mesesPlaneacionCompra,this,true,"numero_mesesPlaneacionCompra","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.planeacioncompraConstantesFunciones.resaltarnumero_mesesPlaneacionCompra,this.planeacioncompraConstantesFunciones.activarnumero_mesesPlaneacionCompra,this,true,"numero_mesesPlaneacionCompra","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PlaneacionCompraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPlaneacionCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaneacionCompra,PlaneacionCompraConstantesFunciones.LABEL_FECHACORTE));

		if(this.planeacioncompraConstantesFunciones.mostrarfecha_cortePlaneacionCompra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PlaneacionCompraConstantesFunciones.LABEL_FECHACORTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.planeacioncompraConstantesFunciones.resaltarfecha_cortePlaneacionCompra,this.planeacioncompraConstantesFunciones.activarfecha_cortePlaneacionCompra,this,true,"fecha_cortePlaneacionCompra","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.planeacioncompraConstantesFunciones.resaltarfecha_cortePlaneacionCompra,this.planeacioncompraConstantesFunciones.activarfecha_cortePlaneacionCompra,this,true,"fecha_cortePlaneacionCompra","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new PlaneacionCompraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPlaneacionCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaneacionCompra,PlaneacionCompraConstantesFunciones.LABEL_CODIGOPEDIDO));

		if(this.planeacioncompraConstantesFunciones.mostrarcodigo_pedidoPlaneacionCompra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PlaneacionCompraConstantesFunciones.LABEL_CODIGOPEDIDO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.planeacioncompraConstantesFunciones.resaltarcodigo_pedidoPlaneacionCompra,this.planeacioncompraConstantesFunciones.activarcodigo_pedidoPlaneacionCompra,this,true,"codigo_pedidoPlaneacionCompra","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.planeacioncompraConstantesFunciones.resaltarcodigo_pedidoPlaneacionCompra,this.planeacioncompraConstantesFunciones.activarcodigo_pedidoPlaneacionCompra,this,true,"codigo_pedidoPlaneacionCompra","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PlaneacionCompraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPlaneacionCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaneacionCompra,PlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION1));

		if(this.planeacioncompraConstantesFunciones.mostrardescripcion1PlaneacionCompra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION1,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.planeacioncompraConstantesFunciones.resaltardescripcion1PlaneacionCompra,this.planeacioncompraConstantesFunciones.activardescripcion1PlaneacionCompra,this,true,"descripcion1PlaneacionCompra","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.planeacioncompraConstantesFunciones.resaltardescripcion1PlaneacionCompra,this.planeacioncompraConstantesFunciones.activardescripcion1PlaneacionCompra,this,true,"descripcion1PlaneacionCompra","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PlaneacionCompraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPlaneacionCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaneacionCompra,PlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION2));

		if(this.planeacioncompraConstantesFunciones.mostrardescripcion2PlaneacionCompra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION2,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.planeacioncompraConstantesFunciones.resaltardescripcion2PlaneacionCompra,this.planeacioncompraConstantesFunciones.activardescripcion2PlaneacionCompra,this,true,"descripcion2PlaneacionCompra","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.planeacioncompraConstantesFunciones.resaltardescripcion2PlaneacionCompra,this.planeacioncompraConstantesFunciones.activardescripcion2PlaneacionCompra,this,true,"descripcion2PlaneacionCompra","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PlaneacionCompraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPlaneacionCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPlaneacionCompra,PlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION3));

		if(this.planeacioncompraConstantesFunciones.mostrardescripcion3PlaneacionCompra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION3,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.planeacioncompraConstantesFunciones.resaltardescripcion3PlaneacionCompra,this.planeacioncompraConstantesFunciones.activardescripcion3PlaneacionCompra,this,true,"descripcion3PlaneacionCompra","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.planeacioncompraConstantesFunciones.resaltardescripcion3PlaneacionCompra,this.planeacioncompraConstantesFunciones.activardescripcion3PlaneacionCompra,this,true,"descripcion3PlaneacionCompra","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PlaneacionCompraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.planeacioncompraSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosDetallePlaneacionCompra && this.planeacioncompraConstantesFunciones.mostrarDetallePlaneacionCompraPlaneacionCompra && !PlaneacionCompraConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Detalle Planeacion Compras");
				tableColumn.setHeaderValue("Detalle Planeacion Compras");
				tableColumn.setCellRenderer(new DetallePlaneacionCompraTableCell(planeacioncompraConstantesFunciones.resaltarDetallePlaneacionCompraPlaneacionCompra,this,this.planeacioncompraConstantesFunciones.activarDetallePlaneacionCompraPlaneacionCompra));
				tableColumn.setCellEditor(new DetallePlaneacionCompraTableCell(planeacioncompraConstantesFunciones.resaltarDetallePlaneacionCompraPlaneacionCompra,this,this.planeacioncompraConstantesFunciones.activarDetallePlaneacionCompraPlaneacionCompra));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosPlaneacionCompra.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.planeacioncompraSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.planeacioncompraSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPlaneacionCompra.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.planeacioncompraSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.planeacioncompraSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPlaneacionCompra.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarPlaneacionCompra && this.isPermisoGuardarCambiosPlaneacionCompra) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.planeacioncompraSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.planeacioncompraSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosPlaneacionCompra.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.planeacioncompraSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosPlaneacionCompra.addColumn(tableColumn);
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
			
			this.jTableDatosPlaneacionCompra.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPlaneacionCompra && this.isPermisoGuardarCambiosPlaneacionCompra) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.planeacioncompraSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPlaneacionCompra && this.isPermisoGuardarCambiosPlaneacionCompra) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosPlaneacionCompra.moveColumn(this.jTableDatosPlaneacionCompra.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosPlaneacionCompra.moveColumn(this.jTableDatosPlaneacionCompra.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.planeacioncompraSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosPlaneacionCompra.moveColumn(this.jTableDatosPlaneacionCompra.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosPlaneacionCompra.moveColumn(this.jTableDatosPlaneacionCompra.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosPlaneacionCompra.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosPlaneacionCompra.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosPlaneacionCompra,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!PlaneacionCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosPlaneacionCompra.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosPlaneacionCompra.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!PlaneacionCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!PlaneacionCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosPlaneacionCompra.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosPlaneacionCompra.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosPlaneacionCompra.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=planeacioncompraLogic.getPlaneacionCompras().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=planeacioncompras.size()-1;
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
		//this.jTableDatosPlaneacionCompra.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosPlaneacionCompra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosPlaneacionCompra();
			
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
				
				//this.isEsNuevoPlaneacionCompra=false;
					
				PlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.planeacioncompra,new Object(),this.planeacioncompraParameterGeneral,this.planeacioncompraReturnGeneral);
			
				if(this.planeacioncompraSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormPlaneacionCompra==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPlaneacionCompra.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPlaneacionCompra.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompra =(PlaneacionCompra) this.planeacioncompraLogic.getPlaneacionCompras().toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.planeacioncompra =(PlaneacionCompra) this.planeacioncompras.toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.planeacioncompra.getsType().equals("DUPLICADO")
				   || this.planeacioncompra.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoPlaneacionCompra=true;
				
				} else {
					this.isEsNuevoPlaneacionCompra=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.planeacioncompraSessionBean.getEsGuardarRelacionado()) {
					if(this.planeacioncompra.getId()>=0 && !this.planeacioncompra.getIsNew()) {						
						this.isEsNuevoPlaneacionCompra=false;
						
					} else {
						this.isEsNuevoPlaneacionCompra=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoPlaneacionCompra(esRelaciones);						
				
				this.seleccionarPlaneacionCompra(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.planeacioncompra.getId()<0) {
					this.isEsNuevoPlaneacionCompra=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarPlaneacionCompra(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarPlaneacionCompra(evt,rowIndex);
				}	
				
				if(this.planeacioncompraSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion PlaneacionCompra: " + this.dDif); 
					}
				}								
				
				PlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.planeacioncompra,new Object(),this.planeacioncompraParameterGeneral,this.planeacioncompraReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarPlaneacionCompra(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.planeacioncompra)) {
					if(this.planeacioncompra.getId()>0) {
						this.planeacioncompra.setIsDeleted(true);
						
						this.planeacioncomprasEliminados.add(this.planeacioncompra);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.planeacioncompraLogic.getPlaneacionCompras().remove(this.planeacioncompra);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.planeacioncompras.remove(this.planeacioncompra);				
					}
					
					
					((PlaneacionCompraModel) this.jTableDatosPlaneacionCompra.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaPlaneacionCompra(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarPlaneacionCompra(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoPlaneacionCompra) {
			
			if(this.jInternalFrameDetalleFormPlaneacionCompra==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPlaneacionCompra.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPlaneacionCompra.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompra =(PlaneacionCompra) this.planeacioncompraLogic.getPlaneacionCompras().toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.planeacioncompra =(PlaneacionCompra) this.planeacioncompras.toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(PlaneacionCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioPlaneacionCompra(this.planeacioncompra);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.planeacioncompraConstantesFunciones.cargarid_empresaPlaneacionCompra || this.planeacioncompraConstantesFunciones.event_dependid_empresaPlaneacionCompra) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.planeacioncompra.getid_empresa());
									//this.inicializarActualizarBindingPlaneacionCompra(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(planeacioncompra.getEmpresa()!=null) {
							this.empresasForeignKey.add(planeacioncompra.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.planeacioncompra.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.planeacioncompraConstantesFunciones.cargarid_sucursalPlaneacionCompra || this.planeacioncompraConstantesFunciones.event_dependid_sucursalPlaneacionCompra) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.planeacioncompra.getid_sucursal());
									//this.inicializarActualizarBindingPlaneacionCompra(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(planeacioncompra.getSucursal()!=null) {
							this.sucursalsForeignKey.add(planeacioncompra.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.planeacioncompra.getid_sucursal(),false,"Formulario");

					//Ejercicio
					if(!this.planeacioncompraConstantesFunciones.cargarid_ejercicioPlaneacionCompra || this.planeacioncompraConstantesFunciones.event_dependid_ejercicioPlaneacionCompra) {
						//this.cargarCombosEjerciciosForeignKeyLista(" where id="+this.planeacioncompra.getid_ejercicio());
									//this.inicializarActualizarBindingPlaneacionCompra(false,false);
						this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

						if(planeacioncompra.getEjercicio()!=null) {
							this.ejerciciosForeignKey.add(planeacioncompra.getEjercicio());
						}

						this.addItemDefectoCombosForeignKeyEjercicio();
						this.cargarCombosFrameEjerciciosForeignKey("Todos");
					}
					this.setActualEjercicioForeignKey(this.planeacioncompra.getid_ejercicio(),false,"Formulario");

					//Periodo
					if(!this.planeacioncompraConstantesFunciones.cargarid_periodoPlaneacionCompra || this.planeacioncompraConstantesFunciones.event_dependid_periodoPlaneacionCompra) {
						//this.cargarCombosPeriodosForeignKeyLista(" where id="+this.planeacioncompra.getid_periodo());
									//this.inicializarActualizarBindingPlaneacionCompra(false,false);
						this.periodosForeignKey=new ArrayList<Periodo>();

						if(planeacioncompra.getPeriodo()!=null) {
							this.periodosForeignKey.add(planeacioncompra.getPeriodo());
						}

						this.addItemDefectoCombosForeignKeyPeriodo();
						this.cargarCombosFramePeriodosForeignKey("Todos");
					}
					this.setActualPeriodoForeignKey(this.planeacioncompra.getid_periodo(),false,"Formulario");

					//Empleado
					if(!this.planeacioncompraConstantesFunciones.cargarid_empleadoPlaneacionCompra || this.planeacioncompraConstantesFunciones.event_dependid_empleadoPlaneacionCompra) {
						//this.cargarCombosEmpleadosForeignKeyLista(" where id="+this.planeacioncompra.getid_empleado());
									//this.inicializarActualizarBindingPlaneacionCompra(false,false);
						this.empleadosForeignKey=new ArrayList<Empleado>();

						if(planeacioncompra.getEmpleado()!=null) {
							this.empleadosForeignKey.add(planeacioncompra.getEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEmpleado();
						this.cargarCombosFrameEmpleadosForeignKey("Todos");
					}
					this.setActualEmpleadoForeignKey(this.planeacioncompra.getid_empleado(),false,"Formulario");

					//Usuario
					if(!this.planeacioncompraConstantesFunciones.cargarid_usuarioPlaneacionCompra || this.planeacioncompraConstantesFunciones.event_dependid_usuarioPlaneacionCompra) {
						//this.cargarCombosUsuariosForeignKeyLista(" where id="+this.planeacioncompra.getid_usuario());
									//this.inicializarActualizarBindingPlaneacionCompra(false,false);
						this.usuariosForeignKey=new ArrayList<Usuario>();

						if(planeacioncompra.getUsuario()!=null) {
							this.usuariosForeignKey.add(planeacioncompra.getUsuario());
						}

						this.addItemDefectoCombosForeignKeyUsuario();
						this.cargarCombosFrameUsuariosForeignKey("Todos");
					}
					this.setActualUsuarioForeignKey(this.planeacioncompra.getid_usuario(),false,"Formulario");

					//Formato
					if(!this.planeacioncompraConstantesFunciones.cargarid_formatoPlaneacionCompra || this.planeacioncompraConstantesFunciones.event_dependid_formatoPlaneacionCompra) {
						//this.cargarCombosFormatosForeignKeyLista(" where id="+this.planeacioncompra.getid_formato());
									//this.inicializarActualizarBindingPlaneacionCompra(false,false);
						this.formatosForeignKey=new ArrayList<Formato>();

						if(planeacioncompra.getFormato()!=null) {
							this.formatosForeignKey.add(planeacioncompra.getFormato());
						}

						this.addItemDefectoCombosForeignKeyFormato();
						this.cargarCombosFrameFormatosForeignKey("Todos");
					}
					this.setActualFormatoForeignKey(this.planeacioncompra.getid_formato(),false,"Formulario");

					//MesInicio
					if(!this.planeacioncompraConstantesFunciones.cargarid_mes_inicioPlaneacionCompra || this.planeacioncompraConstantesFunciones.event_dependid_mes_inicioPlaneacionCompra) {
						//this.cargarCombosMesIniciosForeignKeyLista(" where id="+this.planeacioncompra.getid_mes_inicio());
									//this.inicializarActualizarBindingPlaneacionCompra(false,false);
						this.mesiniciosForeignKey=new ArrayList<Mes>();

						if(planeacioncompra.getMesInicio()!=null) {
							this.mesiniciosForeignKey.add(planeacioncompra.getMesInicio());
						}

						this.addItemDefectoCombosForeignKeyMesInicio();
						this.cargarCombosFrameMesIniciosForeignKey("Todos");
					}
					this.setActualMesInicioForeignKey(this.planeacioncompra.getid_mes_inicio(),false,"Formulario");

					//MesFin
					if(!this.planeacioncompraConstantesFunciones.cargarid_mes_finPlaneacionCompra || this.planeacioncompraConstantesFunciones.event_dependid_mes_finPlaneacionCompra) {
						//this.cargarCombosMesFinsForeignKeyLista(" where id="+this.planeacioncompra.getid_mes_fin());
									//this.inicializarActualizarBindingPlaneacionCompra(false,false);
						this.mesfinsForeignKey=new ArrayList<Mes>();

						if(planeacioncompra.getMesFin()!=null) {
							this.mesfinsForeignKey.add(planeacioncompra.getMesFin());
						}

						this.addItemDefectoCombosForeignKeyMesFin();
						this.cargarCombosFrameMesFinsForeignKey("Todos");
					}
					this.setActualMesFinForeignKey(this.planeacioncompra.getid_mes_fin(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesPlaneacionCompra("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesPlaneacionCompra(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPlaneacionCompra() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoPlaneacionCompra(PlaneacionCompra planeacioncompra) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoPlaneacionCompra(planeacioncompra,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoPlaneacionCompra(PlaneacionCompra planeacioncompra,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioPlaneacionCompra(planeacioncompra);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyPlaneacionCompra(planeacioncompra,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyPlaneacionCompra(planeacioncompra);
	}
	
	public void setVariablesObjetoActualToFormularioPlaneacionCompra(PlaneacionCompra planeacioncompra) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormPlaneacionCompra==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormPlaneacionCompra.jLabelidPlaneacionCompra.setText(planeacioncompra.getId().toString());
			this.jInternalFrameDetalleFormPlaneacionCompra.jTextFieldnumero_pre_impresoPlaneacionCompra.setText(planeacioncompra.getnumero_pre_impreso());
			this.jInternalFrameDetalleFormPlaneacionCompra.jDateChooserfechaPlaneacionCompra.setDate(planeacioncompra.getfecha());
			this.jInternalFrameDetalleFormPlaneacionCompra.jTextFieldnumero_mesesPlaneacionCompra.setText(planeacioncompra.getnumero_meses().toString());
			this.jInternalFrameDetalleFormPlaneacionCompra.jDateChooserfecha_cortePlaneacionCompra.setDate(planeacioncompra.getfecha_corte());
			this.jInternalFrameDetalleFormPlaneacionCompra.jTextFieldcodigo_pedidoPlaneacionCompra.setText(planeacioncompra.getcodigo_pedido());
			this.jInternalFrameDetalleFormPlaneacionCompra.jTextAreadescripcion1PlaneacionCompra.setText(planeacioncompra.getdescripcion1());
			this.jInternalFrameDetalleFormPlaneacionCompra.jTextAreadescripcion2PlaneacionCompra.setText(planeacioncompra.getdescripcion2());
			this.jInternalFrameDetalleFormPlaneacionCompra.jTextAreadescripcion3PlaneacionCompra.setText(planeacioncompra.getdescripcion3());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,PlaneacionCompra planeacioncompraLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,planeacioncompraLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,PlaneacionCompra planeacioncompraLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				planeacioncompraLocal=this.planeacioncompra;
			} else {
				planeacioncompraLocal=this.planeacioncompraAnterior;
			}
		}
		
		if(this.permiteMantenimiento(planeacioncompraLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoPlaneacionCompra(planeacioncompraLocal,true);
					
					if(planeacioncompraSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(planeacioncompraLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.planeacioncompraSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(planeacioncompraLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoPlaneacionCompra(PlaneacionCompra planeacioncompra,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPlaneacionCompra(planeacioncompra,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionCompra(planeacioncompra);
	}
	
	public void setVariablesFormularioToObjetoActualPlaneacionCompra(PlaneacionCompra planeacioncompra,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPlaneacionCompra(planeacioncompra,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualPlaneacionCompra(PlaneacionCompra planeacioncompra,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormPlaneacionCompra==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormPlaneacionCompra.jLabelidPlaneacionCompra.getText()==null || this.jInternalFrameDetalleFormPlaneacionCompra.jLabelidPlaneacionCompra.getText()=="" || this.jInternalFrameDetalleFormPlaneacionCompra.jLabelidPlaneacionCompra.getText()=="Id") {
				this.jInternalFrameDetalleFormPlaneacionCompra.jLabelidPlaneacionCompra.setText("0");
			}

			if(conColumnasBase) {planeacioncompra.setId(Long.parseLong(this.jInternalFrameDetalleFormPlaneacionCompra.jLabelidPlaneacionCompra.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PlaneacionCompraConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaneacionCompra.jLabelIdPlaneacionCompra,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			planeacioncompra.setnumero_pre_impreso(this.jInternalFrameDetalleFormPlaneacionCompra.jTextFieldnumero_pre_impresoPlaneacionCompra.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PlaneacionCompraConstantesFunciones.LABEL_NUMEROPREIMPRESO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaneacionCompra.jLabelnumero_pre_impresoPlaneacionCompra,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			planeacioncompra.setfecha(this.jInternalFrameDetalleFormPlaneacionCompra.jDateChooserfechaPlaneacionCompra.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PlaneacionCompraConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaneacionCompra.jLabelfechaPlaneacionCompra,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			planeacioncompra.setnumero_meses(Integer.parseInt(this.jInternalFrameDetalleFormPlaneacionCompra.jTextFieldnumero_mesesPlaneacionCompra.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PlaneacionCompraConstantesFunciones.LABEL_NUMEROMESES+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaneacionCompra.jLabelnumero_mesesPlaneacionCompra,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			planeacioncompra.setfecha_corte(this.jInternalFrameDetalleFormPlaneacionCompra.jDateChooserfecha_cortePlaneacionCompra.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PlaneacionCompraConstantesFunciones.LABEL_FECHACORTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaneacionCompra.jLabelfecha_cortePlaneacionCompra,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			planeacioncompra.setcodigo_pedido(this.jInternalFrameDetalleFormPlaneacionCompra.jTextFieldcodigo_pedidoPlaneacionCompra.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PlaneacionCompraConstantesFunciones.LABEL_CODIGOPEDIDO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaneacionCompra.jLabelcodigo_pedidoPlaneacionCompra,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			planeacioncompra.setdescripcion1(this.jInternalFrameDetalleFormPlaneacionCompra.jTextAreadescripcion1PlaneacionCompra.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION1+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaneacionCompra.jLabeldescripcion1PlaneacionCompra,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			planeacioncompra.setdescripcion2(this.jInternalFrameDetalleFormPlaneacionCompra.jTextAreadescripcion2PlaneacionCompra.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION2+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaneacionCompra.jLabeldescripcion2PlaneacionCompra,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			planeacioncompra.setdescripcion3(this.jInternalFrameDetalleFormPlaneacionCompra.jTextAreadescripcion3PlaneacionCompra.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION3+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPlaneacionCompra.jLabeldescripcion3PlaneacionCompra,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPlaneacionCompra(PlaneacionCompra planeacioncompraBean,PlaneacionCompra planeacioncompra,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && planeacioncompraBean.getid_empleado()!=null && !planeacioncompraBean.getid_empleado().equals(-1L))) {planeacioncompra.setid_empleado(planeacioncompraBean.getid_empleado());}
			if(conDefault || (!conDefault && planeacioncompraBean.getid_formato()!=null && !planeacioncompraBean.getid_formato().equals(-1L))) {planeacioncompra.setid_formato(planeacioncompraBean.getid_formato());}
			if(conDefault || (!conDefault && planeacioncompraBean.getid_mes_inicio()!=null && !planeacioncompraBean.getid_mes_inicio().equals(-1L))) {planeacioncompra.setid_mes_inicio(planeacioncompraBean.getid_mes_inicio());}
			if(conDefault || (!conDefault && planeacioncompraBean.getid_mes_fin()!=null && !planeacioncompraBean.getid_mes_fin().equals(-1L))) {planeacioncompra.setid_mes_fin(planeacioncompraBean.getid_mes_fin());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosPlaneacionCompra(PlaneacionCompra planeacioncompraOrigen,PlaneacionCompra planeacioncompra,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && planeacioncompraOrigen.getId()!=null && !planeacioncompraOrigen.getId().equals(0L))) {planeacioncompra.setId(planeacioncompraOrigen.getId());}}
			if(conDefault || (!conDefault && planeacioncompraOrigen.getid_empleado()!=null && !planeacioncompraOrigen.getid_empleado().equals(-1L))) {planeacioncompra.setid_empleado(planeacioncompraOrigen.getid_empleado());}
			if(conDefault || (!conDefault && planeacioncompraOrigen.getid_formato()!=null && !planeacioncompraOrigen.getid_formato().equals(-1L))) {planeacioncompra.setid_formato(planeacioncompraOrigen.getid_formato());}
			if(conDefault || (!conDefault && planeacioncompraOrigen.getnumero_pre_impreso()!=null && !planeacioncompraOrigen.getnumero_pre_impreso().equals(""))) {planeacioncompra.setnumero_pre_impreso(planeacioncompraOrigen.getnumero_pre_impreso());}
			if(conDefault || (!conDefault && planeacioncompraOrigen.getfecha()!=null && !planeacioncompraOrigen.getfecha().equals(new Date()))) {planeacioncompra.setfecha(planeacioncompraOrigen.getfecha());}
			if(conDefault || (!conDefault && planeacioncompraOrigen.getid_mes_inicio()!=null && !planeacioncompraOrigen.getid_mes_inicio().equals(-1L))) {planeacioncompra.setid_mes_inicio(planeacioncompraOrigen.getid_mes_inicio());}
			if(conDefault || (!conDefault && planeacioncompraOrigen.getid_mes_fin()!=null && !planeacioncompraOrigen.getid_mes_fin().equals(-1L))) {planeacioncompra.setid_mes_fin(planeacioncompraOrigen.getid_mes_fin());}
			if(conDefault || (!conDefault && planeacioncompraOrigen.getnumero_meses()!=null && !planeacioncompraOrigen.getnumero_meses().equals(0))) {planeacioncompra.setnumero_meses(planeacioncompraOrigen.getnumero_meses());}
			if(conDefault || (!conDefault && planeacioncompraOrigen.getfecha_corte()!=null && !planeacioncompraOrigen.getfecha_corte().equals(new Date()))) {planeacioncompra.setfecha_corte(planeacioncompraOrigen.getfecha_corte());}
			if(conDefault || (!conDefault && planeacioncompraOrigen.getcodigo_pedido()!=null && !planeacioncompraOrigen.getcodigo_pedido().equals(""))) {planeacioncompra.setcodigo_pedido(planeacioncompraOrigen.getcodigo_pedido());}
			if(conDefault || (!conDefault && planeacioncompraOrigen.getdescripcion1()!=null && !planeacioncompraOrigen.getdescripcion1().equals(""))) {planeacioncompra.setdescripcion1(planeacioncompraOrigen.getdescripcion1());}
			if(conDefault || (!conDefault && planeacioncompraOrigen.getdescripcion2()!=null && !planeacioncompraOrigen.getdescripcion2().equals(""))) {planeacioncompra.setdescripcion2(planeacioncompraOrigen.getdescripcion2());}
			if(conDefault || (!conDefault && planeacioncompraOrigen.getdescripcion3()!=null && !planeacioncompraOrigen.getdescripcion3().equals(""))) {planeacioncompra.setdescripcion3(planeacioncompraOrigen.getdescripcion3());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPlaneacionCompra(PlaneacionCompra planeacioncompra) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPlaneacionCompra.jLabelidPlaneacionCompra.setText(planeacioncompra.getId().toString());
			this.jInternalFrameDetalleFormPlaneacionCompra.jTextFieldnumero_pre_impresoPlaneacionCompra.setText(planeacioncompra.getnumero_pre_impreso());
			this.jInternalFrameDetalleFormPlaneacionCompra.jDateChooserfechaPlaneacionCompra.setDate(planeacioncompra.getfecha());
			this.jInternalFrameDetalleFormPlaneacionCompra.jTextFieldnumero_mesesPlaneacionCompra.setText(planeacioncompra.getnumero_meses().toString());
			this.jInternalFrameDetalleFormPlaneacionCompra.jDateChooserfecha_cortePlaneacionCompra.setDate(planeacioncompra.getfecha_corte());
			this.jInternalFrameDetalleFormPlaneacionCompra.jTextFieldcodigo_pedidoPlaneacionCompra.setText(planeacioncompra.getcodigo_pedido());
			this.jInternalFrameDetalleFormPlaneacionCompra.jTextAreadescripcion1PlaneacionCompra.setText(planeacioncompra.getdescripcion1());
			this.jInternalFrameDetalleFormPlaneacionCompra.jTextAreadescripcion2PlaneacionCompra.setText(planeacioncompra.getdescripcion2());
			this.jInternalFrameDetalleFormPlaneacionCompra.jTextAreadescripcion3PlaneacionCompra.setText(planeacioncompra.getdescripcion3());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPlaneacionCompra(PlaneacionCompraBean planeacioncompraBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPlaneacionCompra.jLabelidPlaneacionCompra.setText(planeacioncompraBean.getId().toString());
			this.jInternalFrameDetalleFormPlaneacionCompra.jTextFieldnumero_pre_impresoPlaneacionCompra.setText(planeacioncompraBean.getnumero_pre_impreso());
			this.jInternalFrameDetalleFormPlaneacionCompra.jDateChooserfechaPlaneacionCompra.setDate(planeacioncompraBean.getfecha());
			this.jInternalFrameDetalleFormPlaneacionCompra.jTextFieldnumero_mesesPlaneacionCompra.setText(planeacioncompraBean.getnumero_meses().toString());
			this.jInternalFrameDetalleFormPlaneacionCompra.jDateChooserfecha_cortePlaneacionCompra.setDate(planeacioncompraBean.getfecha_corte());
			this.jInternalFrameDetalleFormPlaneacionCompra.jTextFieldcodigo_pedidoPlaneacionCompra.setText(planeacioncompraBean.getcodigo_pedido());
			this.jInternalFrameDetalleFormPlaneacionCompra.jTextAreadescripcion1PlaneacionCompra.setText(planeacioncompraBean.getdescripcion1());
			this.jInternalFrameDetalleFormPlaneacionCompra.jTextAreadescripcion2PlaneacionCompra.setText(planeacioncompraBean.getdescripcion2());
			this.jInternalFrameDetalleFormPlaneacionCompra.jTextAreadescripcion3PlaneacionCompra.setText(planeacioncompraBean.getdescripcion3());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanPlaneacionCompra(PlaneacionCompraParameterReturnGeneral planeacioncompraReturnGeneral,PlaneacionCompraBean planeacioncompraBean,Boolean conDefault) throws Exception { 
		try {
			PlaneacionCompra planeacioncompraLocal=new PlaneacionCompra();
			
			planeacioncompraLocal=planeacioncompraReturnGeneral.getPlaneacionCompra();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && planeacioncompraLocal.getId()!=null && !planeacioncompraLocal.getId().equals(0L))) {planeacioncompraBean.setId(planeacioncompraLocal.getId());}}
			if(conDefault || (!conDefault && planeacioncompraLocal.getid_empleado()!=null && !planeacioncompraLocal.getid_empleado().equals(-1L))) {planeacioncompraBean.setid_empleado(planeacioncompraLocal.getid_empleado());}
			if(conDefault || (!conDefault && planeacioncompraLocal.getid_formato()!=null && !planeacioncompraLocal.getid_formato().equals(-1L))) {planeacioncompraBean.setid_formato(planeacioncompraLocal.getid_formato());}
			if(conDefault || (!conDefault && planeacioncompraLocal.getnumero_pre_impreso()!=null && !planeacioncompraLocal.getnumero_pre_impreso().equals(""))) {planeacioncompraBean.setnumero_pre_impreso(planeacioncompraLocal.getnumero_pre_impreso());}
			if(conDefault || (!conDefault && planeacioncompraLocal.getfecha()!=null && !planeacioncompraLocal.getfecha().equals(new Date()))) {planeacioncompraBean.setfecha(planeacioncompraLocal.getfecha());}
			if(conDefault || (!conDefault && planeacioncompraLocal.getid_mes_inicio()!=null && !planeacioncompraLocal.getid_mes_inicio().equals(-1L))) {planeacioncompraBean.setid_mes_inicio(planeacioncompraLocal.getid_mes_inicio());}
			if(conDefault || (!conDefault && planeacioncompraLocal.getid_mes_fin()!=null && !planeacioncompraLocal.getid_mes_fin().equals(-1L))) {planeacioncompraBean.setid_mes_fin(planeacioncompraLocal.getid_mes_fin());}
			if(conDefault || (!conDefault && planeacioncompraLocal.getnumero_meses()!=null && !planeacioncompraLocal.getnumero_meses().equals(0))) {planeacioncompraBean.setnumero_meses(planeacioncompraLocal.getnumero_meses());}
			if(conDefault || (!conDefault && planeacioncompraLocal.getfecha_corte()!=null && !planeacioncompraLocal.getfecha_corte().equals(new Date()))) {planeacioncompraBean.setfecha_corte(planeacioncompraLocal.getfecha_corte());}
			if(conDefault || (!conDefault && planeacioncompraLocal.getcodigo_pedido()!=null && !planeacioncompraLocal.getcodigo_pedido().equals(""))) {planeacioncompraBean.setcodigo_pedido(planeacioncompraLocal.getcodigo_pedido());}
			if(conDefault || (!conDefault && planeacioncompraLocal.getdescripcion1()!=null && !planeacioncompraLocal.getdescripcion1().equals(""))) {planeacioncompraBean.setdescripcion1(planeacioncompraLocal.getdescripcion1());}
			if(conDefault || (!conDefault && planeacioncompraLocal.getdescripcion2()!=null && !planeacioncompraLocal.getdescripcion2().equals(""))) {planeacioncompraBean.setdescripcion2(planeacioncompraLocal.getdescripcion2());}
			if(conDefault || (!conDefault && planeacioncompraLocal.getdescripcion3()!=null && !planeacioncompraLocal.getdescripcion3().equals(""))) {planeacioncompraBean.setdescripcion3(planeacioncompraLocal.getdescripcion3());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxPlaneacionCompraGenerico(Long idPlaneacionCompraSeleccionado,JComboBox jComboBoxPlaneacionCompra,List<PlaneacionCompra> planeacioncomprasLocal)throws Exception {
		try {
			PlaneacionCompra  planeacioncompraTemp=null;

			for(PlaneacionCompra planeacioncompraAux:planeacioncomprasLocal) {
				if(planeacioncompraAux.getId()!=null && planeacioncompraAux.getId().equals(idPlaneacionCompraSeleccionado)) {
					planeacioncompraTemp=planeacioncompraAux;
					break;
				}
			}

			jComboBoxPlaneacionCompra.setSelectedItem(planeacioncompraTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxPlaneacionCompraGenerico(JComboBox jComboBoxPlaneacionCompra,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxPlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxPlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPlaneacionCompra.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxPlaneacionCompra.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPlaneacionCompra.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxPlaneacionCompra.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxPlaneacionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxPlaneacionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("DetallePlaneacionCompra")) {
			jButtonDetallePlaneacionCompraActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			planeacioncompra=(PlaneacionCompra) planeacioncompraLogic.getPlaneacionCompras().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			planeacioncompra =(PlaneacionCompra) planeacioncompras.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!planeacioncompra.getIsNew() && !planeacioncompra.getIsChanged() && !planeacioncompra.getIsDeleted()) {
				sDescripcion=planeacioncompra.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=planeacioncompra.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!planeacioncompra.getIsNew() && !planeacioncompra.getIsChanged() && !planeacioncompra.getIsDeleted()) {
				sDescripcion=planeacioncompra.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=planeacioncompra.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!planeacioncompra.getIsNew() && !planeacioncompra.getIsChanged() && !planeacioncompra.getIsDeleted()) {
				sDescripcion=planeacioncompra.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=planeacioncompra.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("Periodo")) {
			//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
			if(!planeacioncompra.getIsNew() && !planeacioncompra.getIsChanged() && !planeacioncompra.getIsDeleted()) {
				sDescripcion=planeacioncompra.getperiodo_descripcion();
			} else {
				//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
				sDescripcion=planeacioncompra.getperiodo_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!planeacioncompra.getIsNew() && !planeacioncompra.getIsChanged() && !planeacioncompra.getIsDeleted()) {
				sDescripcion=planeacioncompra.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=planeacioncompra.getempleado_descripcion();
			}
		}

		if(sTipo.equals("Usuario")) {
			//sDescripcion=this.getActualUsuarioForeignKeyDescripcion((Long)value);
			if(!planeacioncompra.getIsNew() && !planeacioncompra.getIsChanged() && !planeacioncompra.getIsDeleted()) {
				sDescripcion=planeacioncompra.getusuario_descripcion();
			} else {
				//sDescripcion=this.getActualUsuarioForeignKeyDescripcion((Long)value);
				sDescripcion=planeacioncompra.getusuario_descripcion();
			}
		}

		if(sTipo.equals("Formato")) {
			//sDescripcion=this.getActualFormatoForeignKeyDescripcion((Long)value);
			if(!planeacioncompra.getIsNew() && !planeacioncompra.getIsChanged() && !planeacioncompra.getIsDeleted()) {
				sDescripcion=planeacioncompra.getformato_descripcion();
			} else {
				//sDescripcion=this.getActualFormatoForeignKeyDescripcion((Long)value);
				sDescripcion=planeacioncompra.getformato_descripcion();
			}
		}

		if(sTipo.equals("MesInicio")) {
			//sDescripcion=this.getActualMesInicioForeignKeyDescripcion((Long)value);
			if(!planeacioncompra.getIsNew() && !planeacioncompra.getIsChanged() && !planeacioncompra.getIsDeleted()) {
				sDescripcion=planeacioncompra.getmesinicio_descripcion();
			} else {
				//sDescripcion=this.getActualMesInicioForeignKeyDescripcion((Long)value);
				sDescripcion=planeacioncompra.getmesinicio_descripcion();
			}
		}

		if(sTipo.equals("MesFin")) {
			//sDescripcion=this.getActualMesFinForeignKeyDescripcion((Long)value);
			if(!planeacioncompra.getIsNew() && !planeacioncompra.getIsChanged() && !planeacioncompra.getIsDeleted()) {
				sDescripcion=planeacioncompra.getmesfin_descripcion();
			} else {
				//sDescripcion=this.getActualMesFinForeignKeyDescripcion((Long)value);
				sDescripcion=planeacioncompra.getmesfin_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		PlaneacionCompra planeacioncompraRow=new PlaneacionCompra();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			planeacioncompraRow=(PlaneacionCompra) planeacioncompraLogic.getPlaneacionCompras().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			planeacioncompraRow=(PlaneacionCompra) planeacioncompras.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonDetallePlaneacionCompraActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,PlaneacionCompra planeacioncompra) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormPlaneacionCompra==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planeacioncompra = (PlaneacionCompra)this.planeacioncompraLogic.getPlaneacionCompras().toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.planeacioncompra = (PlaneacionCompra)this.planeacioncompras.toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(planeacioncompra!=null) {
						this.planeacioncompra = planeacioncompra;
					} else {
						this.planeacioncompra = new PlaneacionCompra();
					}
				}

				if(this.isTienePermisosDetallePlaneacionCompra && this.permiteMantenimiento(this.planeacioncompra)) {
					DetallePlaneacionCompraBeanSwingJInternalFrame detalleplaneacioncompraBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFramePopup=new DetallePlaneacionCompraBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						detalleplaneacioncompraBeanSwingJInternalFrame=this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFramePopup;
					} else {
						detalleplaneacioncompraBeanSwingJInternalFrame=this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame;
					}

					List<PlaneacionCompra> planeacioncompras=new ArrayList<PlaneacionCompra>();
					planeacioncompras.add(this.planeacioncompra);
					if(!esRelacionado) {
						//detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompraSessionBean.setConGuardarRelaciones(false);
						//detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompraSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					detalleplaneacioncompraBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormPlaneacionCompra.cargarDetallePlaneacionCompraBeanSwingJInternalFrame(planeacioncompras,this.planeacioncompra,detalleplaneacioncompraBeanSwingJInternalFrame,/*conInicializar,*/detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompraSessionBean.getConGuardarRelaciones(),detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompraSessionBean.getEsGuardarRelacionado());
					detalleplaneacioncompraBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						detalleplaneacioncompraBeanSwingJInternalFrame.actualizarEstadoPanelsDetallePlaneacionCompra("no_relacionado");

						detalleplaneacioncompraBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DetallePlaneacionCompraConstantesFunciones.ITAMANIOFILATABLA + (DetallePlaneacionCompraConstantesFunciones.ITAMANIOFILATABLA/2));

						detalleplaneacioncompraBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderPlaneacionCompra=(TitledBorder)this.jScrollPanelDatosPlaneacionCompra.getBorder();
						TitledBorder titledBorderDetallePlaneacionCompra=(TitledBorder)detalleplaneacioncompraBeanSwingJInternalFrame.jScrollPanelDatosDetallePlaneacionCompra.getBorder();

						titledBorderDetallePlaneacionCompra.setTitle(titledBorderPlaneacionCompra.getTitle() + " -> Detalle Planeacion Compra");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,detalleplaneacioncompraBeanSwingJInternalFrame);
						}

						detalleplaneacioncompraBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(detalleplaneacioncompraBeanSwingJInternalFrame);

						detalleplaneacioncompraBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.planeacioncompraSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Detalle Planeacion Compra",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualPlaneacionCompra(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoPlaneacionCompra.setVisible((this.isVisibilidadCeldaNuevoPlaneacionCompra && this.isPermisoNuevoPlaneacionCompra));			
			this.jButtonDuplicarPlaneacionCompra.setVisible((this.isVisibilidadCeldaDuplicarPlaneacionCompra && this.isPermisoDuplicarPlaneacionCompra));			
			this.jButtonCopiarPlaneacionCompra.setVisible((this.isVisibilidadCeldaCopiarPlaneacionCompra && this.isPermisoCopiarPlaneacionCompra));
			this.jButtonVerFormPlaneacionCompra.setVisible((this.isVisibilidadCeldaVerFormPlaneacionCompra && this.isPermisoVerFormPlaneacionCompra));
			
			this.jButtonAbrirOrderByPlaneacionCompra.setVisible((this.isVisibilidadCeldaOrdenPlaneacionCompra && this.isPermisoOrdenPlaneacionCompra));			
			
			this.jButtonNuevoRelacionesPlaneacionCompra.setVisible((this.isVisibilidadCeldaNuevoRelacionesPlaneacionCompra && this.isPermisoNuevoPlaneacionCompra));			
			this.jButtonNuevoGuardarCambiosPlaneacionCompra.setVisible((this.isVisibilidadCeldaNuevoPlaneacionCompra && this.isPermisoNuevoPlaneacionCompra && this.isPermisoGuardarCambiosPlaneacionCompra));
			
			if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) {
			this.jInternalFrameDetalleFormPlaneacionCompra.jButtonModificarPlaneacionCompra.setVisible((this.isVisibilidadCeldaModificarPlaneacionCompra && this.isPermisoActualizarPlaneacionCompra));	
			this.jInternalFrameDetalleFormPlaneacionCompra.jButtonActualizarPlaneacionCompra.setVisible((this.isVisibilidadCeldaActualizarPlaneacionCompra && this.isPermisoActualizarPlaneacionCompra));	
			this.jInternalFrameDetalleFormPlaneacionCompra.jButtonEliminarPlaneacionCompra.setVisible((this.isVisibilidadCeldaEliminarPlaneacionCompra && this.isPermisoEliminarPlaneacionCompra));
			this.jInternalFrameDetalleFormPlaneacionCompra.jButtonCancelarPlaneacionCompra.setVisible(this.isVisibilidadCeldaCancelarPlaneacionCompra);							
			this.jInternalFrameDetalleFormPlaneacionCompra.jButtonGuardarCambiosPlaneacionCompra.setVisible((this.isVisibilidadCeldaGuardarPlaneacionCompra && this.isPermisoGuardarCambiosPlaneacionCompra));			
			
			}
						
			this.jButtonGuardarCambiosTablaPlaneacionCompra.setVisible((this.isVisibilidadCeldaGuardarCambiosPlaneacionCompra && this.isPermisoGuardarCambiosPlaneacionCompra));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarPlaneacionCompra.setVisible((this.isVisibilidadCeldaNuevoPlaneacionCompra && this.isPermisoNuevoPlaneacionCompra));						
			this.jButtonDuplicarToolBarPlaneacionCompra.setVisible((this.isVisibilidadCeldaDuplicarPlaneacionCompra && this.isPermisoDuplicarPlaneacionCompra));						
			this.jButtonCopiarToolBarPlaneacionCompra.setVisible((this.isVisibilidadCeldaCopiarPlaneacionCompra && this.isPermisoCopiarPlaneacionCompra));			
			this.jButtonVerFormToolBarPlaneacionCompra.setVisible((this.isVisibilidadCeldaVerFormPlaneacionCompra && this.isPermisoVerFormPlaneacionCompra));			
			this.jButtonAbrirOrderByToolBarPlaneacionCompra.setVisible((this.isVisibilidadCeldaOrdenPlaneacionCompra && this.isPermisoOrdenPlaneacionCompra));
			this.jButtonNuevoRelacionesToolBarPlaneacionCompra.setVisible((this.isVisibilidadCeldaNuevoRelacionesPlaneacionCompra && this.isPermisoNuevoPlaneacionCompra));			
			this.jButtonNuevoGuardarCambiosToolBarPlaneacionCompra.setVisible((this.isVisibilidadCeldaNuevoPlaneacionCompra && this.isPermisoNuevoPlaneacionCompra && this.isPermisoGuardarCambiosPlaneacionCompra));			
			
			if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) {
			this.jInternalFrameDetalleFormPlaneacionCompra.jButtonModificarToolBarPlaneacionCompra.setVisible((this.isVisibilidadCeldaModificarPlaneacionCompra && this.isPermisoActualizarPlaneacionCompra));	
			this.jInternalFrameDetalleFormPlaneacionCompra.jButtonActualizarToolBarPlaneacionCompra.setVisible((this.isVisibilidadCeldaActualizarPlaneacionCompra  && this.isPermisoActualizarPlaneacionCompra));	
			this.jInternalFrameDetalleFormPlaneacionCompra.jButtonEliminarToolBarPlaneacionCompra.setVisible((this.isVisibilidadCeldaEliminarPlaneacionCompra && this.isPermisoEliminarPlaneacionCompra));
			this.jInternalFrameDetalleFormPlaneacionCompra.jButtonCancelarToolBarPlaneacionCompra.setVisible(this.isVisibilidadCeldaCancelarPlaneacionCompra);				
			this.jInternalFrameDetalleFormPlaneacionCompra.jButtonGuardarCambiosToolBarPlaneacionCompra.setVisible((this.isVisibilidadCeldaGuardarPlaneacionCompra && this.isPermisoGuardarCambiosPlaneacionCompra));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarPlaneacionCompra.setVisible((this.isVisibilidadCeldaGuardarCambiosPlaneacionCompra && this.isPermisoGuardarCambiosPlaneacionCompra));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoPlaneacionCompra.setVisible((this.isVisibilidadCeldaNuevoPlaneacionCompra && this.isPermisoNuevoPlaneacionCompra));			
			this.jMenuItemDuplicarPlaneacionCompra.setVisible((this.isVisibilidadCeldaDuplicarPlaneacionCompra && this.isPermisoDuplicarPlaneacionCompra));			
			this.jMenuItemCopiarPlaneacionCompra.setVisible((this.isVisibilidadCeldaCopiarPlaneacionCompra && this.isPermisoCopiarPlaneacionCompra));			
			this.jMenuItemVerFormPlaneacionCompra.setVisible((this.isVisibilidadCeldaVerFormPlaneacionCompra && this.isPermisoVerFormPlaneacionCompra));			
			this.jMenuItemAbrirOrderByPlaneacionCompra.setVisible((this.isVisibilidadCeldaOrdenPlaneacionCompra && this.isPermisoOrdenPlaneacionCompra));			
			//this.jMenuItemMostrarOcultarPlaneacionCompra.setVisible((this.isVisibilidadCeldaOrdenPlaneacionCompra && this.isPermisoOrdenPlaneacionCompra));
			this.jMenuItemDetalleAbrirOrderByPlaneacionCompra.setVisible((this.isVisibilidadCeldaOrdenPlaneacionCompra && this.isPermisoOrdenPlaneacionCompra));			
			//this.jMenuItemDetalleMostrarOcultarPlaneacionCompra.setVisible((this.isVisibilidadCeldaOrdenPlaneacionCompra && this.isPermisoOrdenPlaneacionCompra));			
			this.jMenuItemNuevoRelacionesPlaneacionCompra.setVisible((this.isVisibilidadCeldaNuevoRelacionesPlaneacionCompra && this.isPermisoNuevoPlaneacionCompra));			
			this.jMenuItemNuevoGuardarCambiosPlaneacionCompra.setVisible((this.isVisibilidadCeldaNuevoPlaneacionCompra && this.isPermisoNuevoPlaneacionCompra && this.isPermisoGuardarCambiosPlaneacionCompra));									
			
			if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) {
			this.jInternalFrameDetalleFormPlaneacionCompra.jMenuItemModificarPlaneacionCompra.setVisible((this.isVisibilidadCeldaModificarPlaneacionCompra && this.isPermisoActualizarPlaneacionCompra));	
			this.jInternalFrameDetalleFormPlaneacionCompra.jMenuItemActualizarPlaneacionCompra.setVisible((this.isVisibilidadCeldaActualizarPlaneacionCompra && this.isPermisoActualizarPlaneacionCompra));	
			this.jInternalFrameDetalleFormPlaneacionCompra.jMenuItemEliminarPlaneacionCompra.setVisible((this.isVisibilidadCeldaEliminarPlaneacionCompra && this.isPermisoEliminarPlaneacionCompra));
			this.jInternalFrameDetalleFormPlaneacionCompra.jMenuItemCancelarPlaneacionCompra.setVisible(this.isVisibilidadCeldaCancelarPlaneacionCompra);				
			}
			
			this.jMenuItemGuardarCambiosPlaneacionCompra.setVisible((this.isVisibilidadCeldaGuardarPlaneacionCompra && this.isPermisoGuardarCambiosPlaneacionCompra));						
			this.jMenuItemGuardarCambiosTablaPlaneacionCompra.setVisible((this.isVisibilidadCeldaGuardarCambiosPlaneacionCompra && this.isPermisoGuardarCambiosPlaneacionCompra));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoPlaneacionCompra=this.jButtonNuevoPlaneacionCompra.isVisible();
			this.isVisibilidadCeldaDuplicarPlaneacionCompra=this.jButtonDuplicarPlaneacionCompra.isVisible();
			this.isVisibilidadCeldaCopiarPlaneacionCompra=this.jButtonCopiarPlaneacionCompra.isVisible();
			this.isVisibilidadCeldaVerFormPlaneacionCompra=this.jButtonVerFormPlaneacionCompra.isVisible();
			
			this.isVisibilidadCeldaOrdenPlaneacionCompra=this.jButtonAbrirOrderByPlaneacionCompra.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesPlaneacionCompra=this.jButtonNuevoRelacionesPlaneacionCompra.isVisible();
			this.isVisibilidadCeldaModificarPlaneacionCompra=this.jButtonModificarPlaneacionCompra.isVisible();
			
			if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) {
			this.isVisibilidadCeldaActualizarPlaneacionCompra=this.jInternalFrameDetalleFormPlaneacionCompra.jButtonActualizarPlaneacionCompra.isVisible();
			this.isVisibilidadCeldaEliminarPlaneacionCompra=this.jInternalFrameDetalleFormPlaneacionCompra.jButtonEliminarPlaneacionCompra.isVisible();
			this.isVisibilidadCeldaCancelarPlaneacionCompra=this.jInternalFrameDetalleFormPlaneacionCompra.jButtonCancelarPlaneacionCompra.isVisible();
			this.isVisibilidadCeldaGuardarPlaneacionCompra=this.jInternalFrameDetalleFormPlaneacionCompra.jButtonGuardarCambiosPlaneacionCompra.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosPlaneacionCompra=this.jButtonGuardarCambiosTablaPlaneacionCompra.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoPlaneacionCompra=this.jButtonNuevoToolBarPlaneacionCompra.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPlaneacionCompra=this.jButtonNuevoRelacionesToolBarPlaneacionCompra.isVisible();
			
			if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) {
			this.isVisibilidadCeldaModificarPlaneacionCompra=this.jInternalFrameDetalleFormPlaneacionCompra.jButtonModificarToolBarPlaneacionCompra.isVisible();
			this.isVisibilidadCeldaActualizarPlaneacionCompra=this.jInternalFrameDetalleFormPlaneacionCompra.jButtonActualizarToolBarPlaneacionCompra.isVisible();
			this.isVisibilidadCeldaEliminarPlaneacionCompra=this.jInternalFrameDetalleFormPlaneacionCompra.jButtonEliminarToolBarPlaneacionCompra.isVisible();
			this.isVisibilidadCeldaCancelarPlaneacionCompra=this.jInternalFrameDetalleFormPlaneacionCompra.jButtonCancelarToolBarPlaneacionCompra.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPlaneacionCompra=this.jButtonGuardarCambiosToolBarPlaneacionCompra.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPlaneacionCompra=this.jButtonGuardarCambiosTablaToolBarPlaneacionCompra.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoPlaneacionCompra=this.jMenuItemNuevoPlaneacionCompra.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPlaneacionCompra=this.jMenuItemNuevoRelacionesPlaneacionCompra.isVisible();
			
			if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) {
			this.isVisibilidadCeldaModificarPlaneacionCompra=this.jInternalFrameDetalleFormPlaneacionCompra.jMenuItemModificarPlaneacionCompra.isVisible();
			this.isVisibilidadCeldaActualizarPlaneacionCompra=this.jInternalFrameDetalleFormPlaneacionCompra.jMenuItemActualizarPlaneacionCompra.isVisible();
			this.isVisibilidadCeldaEliminarPlaneacionCompra=this.jInternalFrameDetalleFormPlaneacionCompra.jMenuItemEliminarPlaneacionCompra.isVisible();
			this.isVisibilidadCeldaCancelarPlaneacionCompra=this.jInternalFrameDetalleFormPlaneacionCompra.jMenuItemCancelarPlaneacionCompra.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPlaneacionCompra=this.jMenuItemGuardarCambiosPlaneacionCompra.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPlaneacionCompra=this.jMenuItemGuardarCambiosTablaPlaneacionCompra.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesPlaneacionCompra(Boolean esInicializar) {
		if(PlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {			
			if(this.planeacioncompraSessionBean.getConGuardarRelaciones()) {
				//if(this.planeacioncompraSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesPlaneacionCompra();
			}
			
			this.inicializarActualizarBindingBotonesManualPlaneacionCompra(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualPlaneacionCompra() {
		this.jButtonNuevoPlaneacionCompra.setVisible(this.isPermisoNuevoPlaneacionCompra);			
		this.jButtonDuplicarPlaneacionCompra.setVisible(this.isPermisoDuplicarPlaneacionCompra);			
		this.jButtonCopiarPlaneacionCompra.setVisible(this.isPermisoCopiarPlaneacionCompra);			
		this.jButtonVerFormPlaneacionCompra.setVisible(this.isPermisoVerFormPlaneacionCompra);			
		
		this.jButtonAbrirOrderByPlaneacionCompra.setVisible(this.isPermisoOrdenPlaneacionCompra);					
		
		this.jButtonNuevoRelacionesPlaneacionCompra.setVisible(this.isPermisoNuevoPlaneacionCompra);			
		
		if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPlaneacionCompra.jButtonModificarPlaneacionCompra.setVisible(this.isPermisoActualizarPlaneacionCompra);	
			this.jInternalFrameDetalleFormPlaneacionCompra.jButtonActualizarPlaneacionCompra.setVisible(this.isPermisoActualizarPlaneacionCompra);	
			this.jInternalFrameDetalleFormPlaneacionCompra.jButtonEliminarPlaneacionCompra.setVisible(this.isPermisoEliminarPlaneacionCompra);
			this.jInternalFrameDetalleFormPlaneacionCompra.jButtonCancelarPlaneacionCompra.setVisible(this.isVisibilidadCeldaCancelarPlaneacionCompra);						
			this.jInternalFrameDetalleFormPlaneacionCompra.jButtonGuardarCambiosPlaneacionCompra.setVisible(this.isPermisoGuardarCambiosPlaneacionCompra);							
		}
		
		this.jButtonGuardarCambiosTablaPlaneacionCompra.setVisible(this.isPermisoActualizarPlaneacionCompra);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetallePlaneacionCompra() {
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonModificarPlaneacionCompra.setVisible(this.isPermisoActualizarPlaneacionCompra);	
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonActualizarPlaneacionCompra.setVisible(this.isPermisoActualizarPlaneacionCompra);	
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonEliminarPlaneacionCompra.setVisible(this.isPermisoEliminarPlaneacionCompra);
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonCancelarPlaneacionCompra.setVisible(this.isVisibilidadCeldaCancelarPlaneacionCompra);							
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonGuardarCambiosPlaneacionCompra.setVisible((this.isVisibilidadCeldaGuardarPlaneacionCompra && this.isPermisoGuardarCambiosPlaneacionCompra));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosPlaneacionCompra() {
		if(PlaneacionCompraJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualPlaneacionCompra();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesPlaneacionCompra() {
	}
	
	public void jTableDatosPlaneacionCompraListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarPlaneacionCompra(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidPlaneacionCompraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaneacionCompra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPlaneacionCompra(this.getplaneacioncompra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionCompra(this.planeacioncompra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planeacioncompra =(PlaneacionCompra) this.planeacioncompraLogic.getPlaneacionCompras().toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.planeacioncompra =(PlaneacionCompra) this.planeacioncompras.toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.planeacioncompra==null) {
						this.planeacioncompra = new PlaneacionCompra();
					}

					this.setVariablesFormularioToObjetoActualPlaneacionCompra(this.planeacioncompra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionCompra(this.planeacioncompra);
				}

				if(this.planeacioncompra.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.planeacioncompra.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPlaneacionCompra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaPlaneacionCompraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebPlaneacionCompra(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaneacionCompra.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPlaneacionCompra.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPlaneacionCompra.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompra =(PlaneacionCompra) this.planeacioncompraLogic.getPlaneacionCompras().toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.planeacioncompra =(PlaneacionCompra) this.planeacioncompras.toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPlaneacionCompra(this.getplaneacioncompra(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionCompra(this.planeacioncompra);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.planeacioncompraLogic.getConnexion());

				if(this.planeacioncompra.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.planeacioncompra.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPlaneacionCompra=(TitledBorder)this.jScrollPanelDatosPlaneacionCompra.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderPlaneacionCompra.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaPlaneacionCompraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaneacionCompra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPlaneacionCompra(this.getplaneacioncompra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionCompra(this.planeacioncompra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planeacioncompra =(PlaneacionCompra) this.planeacioncompraLogic.getPlaneacionCompras().toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.planeacioncompra =(PlaneacionCompra) this.planeacioncompras.toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.planeacioncompra==null) {
						this.planeacioncompra = new PlaneacionCompra();
					}

					this.setVariablesFormularioToObjetoActualPlaneacionCompra(this.planeacioncompra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionCompra(this.planeacioncompra);
				}

				if(this.planeacioncompra.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.planeacioncompra.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPlaneacionCompra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalPlaneacionCompraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebPlaneacionCompra(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaneacionCompra.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPlaneacionCompra.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPlaneacionCompra.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompra =(PlaneacionCompra) this.planeacioncompraLogic.getPlaneacionCompras().toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.planeacioncompra =(PlaneacionCompra) this.planeacioncompras.toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPlaneacionCompra(this.getplaneacioncompra(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionCompra(this.planeacioncompra);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.planeacioncompraLogic.getConnexion());

				if(this.planeacioncompra.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.planeacioncompra.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPlaneacionCompra=(TitledBorder)this.jScrollPanelDatosPlaneacionCompra.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderPlaneacionCompra.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalPlaneacionCompraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaneacionCompra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPlaneacionCompra(this.getplaneacioncompra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionCompra(this.planeacioncompra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planeacioncompra =(PlaneacionCompra) this.planeacioncompraLogic.getPlaneacionCompras().toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.planeacioncompra =(PlaneacionCompra) this.planeacioncompras.toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.planeacioncompra==null) {
						this.planeacioncompra = new PlaneacionCompra();
					}

					this.setVariablesFormularioToObjetoActualPlaneacionCompra(this.planeacioncompra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionCompra(this.planeacioncompra);
				}

				if(this.planeacioncompra.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.planeacioncompra.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPlaneacionCompra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioPlaneacionCompraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebPlaneacionCompra(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaneacionCompra.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPlaneacionCompra.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPlaneacionCompra.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompra =(PlaneacionCompra) this.planeacioncompraLogic.getPlaneacionCompras().toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.planeacioncompra =(PlaneacionCompra) this.planeacioncompras.toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPlaneacionCompra(this.getplaneacioncompra(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionCompra(this.planeacioncompra);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.planeacioncompraLogic.getConnexion());

				if(this.planeacioncompra.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.planeacioncompra.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPlaneacionCompra=(TitledBorder)this.jScrollPanelDatosPlaneacionCompra.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderPlaneacionCompra.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioPlaneacionCompraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaneacionCompra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPlaneacionCompra(this.getplaneacioncompra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionCompra(this.planeacioncompra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planeacioncompra =(PlaneacionCompra) this.planeacioncompraLogic.getPlaneacionCompras().toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.planeacioncompra =(PlaneacionCompra) this.planeacioncompras.toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.planeacioncompra==null) {
						this.planeacioncompra = new PlaneacionCompra();
					}

					this.setVariablesFormularioToObjetoActualPlaneacionCompra(this.planeacioncompra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionCompra(this.planeacioncompra);
				}

				if(this.planeacioncompra.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.planeacioncompra.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPlaneacionCompra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_periodoPlaneacionCompraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperiodo=true;

			idTienePermisoperiodo=this.tienePermisosUsuarioEnPaginaWebPlaneacionCompra(PeriodoConstantesFunciones.CLASSNAME);

			if(idTienePermisoperiodo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaneacionCompra.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPlaneacionCompra.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPlaneacionCompra.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompra =(PlaneacionCompra) this.planeacioncompraLogic.getPlaneacionCompras().toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.planeacioncompra =(PlaneacionCompra) this.planeacioncompras.toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPlaneacionCompra(this.getplaneacioncompra(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionCompra(this.planeacioncompra);

				this.periodoBeanSwingJInternalFrame=new PeriodoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.periodoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.periodoBeanSwingJInternalFrame.getPeriodoLogic().setConnexion(this.planeacioncompraLogic.getConnexion());

				if(this.planeacioncompra.getid_periodo()!=null) {
					this.periodoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.periodoBeanSwingJInternalFrame.setIdActual(this.planeacioncompra.getid_periodo());
					this.periodoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPeriodo();
				}

				JInternalFrameBase jinternalFrame =this.periodoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPlaneacionCompra=(TitledBorder)this.jScrollPanelDatosPlaneacionCompra.getBorder();
				TitledBorder titledBorderperiodo=(TitledBorder)this.periodoBeanSwingJInternalFrame.jScrollPanelDatosPeriodo.getBorder();

				titledBorderperiodo.setTitle(titledBorderPlaneacionCompra.getTitle() + " -> Periodo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_periodoPlaneacionCompraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaneacionCompra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPlaneacionCompra(this.getplaneacioncompra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionCompra(this.planeacioncompra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planeacioncompra =(PlaneacionCompra) this.planeacioncompraLogic.getPlaneacionCompras().toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.planeacioncompra =(PlaneacionCompra) this.planeacioncompras.toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.planeacioncompra==null) {
						this.planeacioncompra = new PlaneacionCompra();
					}

					this.setVariablesFormularioToObjetoActualPlaneacionCompra(this.planeacioncompra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionCompra(this.planeacioncompra);
				}

				if(this.planeacioncompra.getid_periodo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_periodo = "+this.planeacioncompra.getid_periodo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPlaneacionCompra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoPlaneacionCompraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebPlaneacionCompra(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaneacionCompra.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPlaneacionCompra.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPlaneacionCompra.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompra =(PlaneacionCompra) this.planeacioncompraLogic.getPlaneacionCompras().toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.planeacioncompra =(PlaneacionCompra) this.planeacioncompras.toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPlaneacionCompra(this.getplaneacioncompra(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionCompra(this.planeacioncompra);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.planeacioncompraLogic.getConnexion());

				if(this.planeacioncompra.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.planeacioncompra.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPlaneacionCompra=(TitledBorder)this.jScrollPanelDatosPlaneacionCompra.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderPlaneacionCompra.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoPlaneacionCompraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaneacionCompra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPlaneacionCompra(this.getplaneacioncompra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionCompra(this.planeacioncompra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planeacioncompra =(PlaneacionCompra) this.planeacioncompraLogic.getPlaneacionCompras().toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.planeacioncompra =(PlaneacionCompra) this.planeacioncompras.toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.planeacioncompra==null) {
						this.planeacioncompra = new PlaneacionCompra();
					}

					this.setVariablesFormularioToObjetoActualPlaneacionCompra(this.planeacioncompra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionCompra(this.planeacioncompra);
				}

				if(this.planeacioncompra.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.planeacioncompra.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPlaneacionCompra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_usuarioPlaneacionCompraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisousuario=true;

			idTienePermisousuario=this.tienePermisosUsuarioEnPaginaWebPlaneacionCompra(UsuarioConstantesFunciones.CLASSNAME);

			if(idTienePermisousuario) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaneacionCompra.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPlaneacionCompra.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPlaneacionCompra.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompra =(PlaneacionCompra) this.planeacioncompraLogic.getPlaneacionCompras().toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.planeacioncompra =(PlaneacionCompra) this.planeacioncompras.toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPlaneacionCompra(this.getplaneacioncompra(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionCompra(this.planeacioncompra);

				this.usuarioBeanSwingJInternalFrame=new UsuarioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.usuarioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.usuarioBeanSwingJInternalFrame.getUsuarioLogic().setConnexion(this.planeacioncompraLogic.getConnexion());

				if(this.planeacioncompra.getid_usuario()!=null) {
					this.usuarioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.usuarioBeanSwingJInternalFrame.setIdActual(this.planeacioncompra.getid_usuario());
					this.usuarioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.usuarioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.usuarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaUsuario();
				}

				JInternalFrameBase jinternalFrame =this.usuarioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPlaneacionCompra=(TitledBorder)this.jScrollPanelDatosPlaneacionCompra.getBorder();
				TitledBorder titledBorderusuario=(TitledBorder)this.usuarioBeanSwingJInternalFrame.jScrollPanelDatosUsuario.getBorder();

				titledBorderusuario.setTitle(titledBorderPlaneacionCompra.getTitle() + " -> Usuario");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_usuarioPlaneacionCompraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaneacionCompra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPlaneacionCompra(this.getplaneacioncompra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionCompra(this.planeacioncompra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planeacioncompra =(PlaneacionCompra) this.planeacioncompraLogic.getPlaneacionCompras().toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.planeacioncompra =(PlaneacionCompra) this.planeacioncompras.toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.planeacioncompra==null) {
						this.planeacioncompra = new PlaneacionCompra();
					}

					this.setVariablesFormularioToObjetoActualPlaneacionCompra(this.planeacioncompra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionCompra(this.planeacioncompra);
				}

				if(this.planeacioncompra.getid_usuario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_usuario = "+this.planeacioncompra.getid_usuario().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPlaneacionCompra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_formatoPlaneacionCompraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoformato=true;

			idTienePermisoformato=this.tienePermisosUsuarioEnPaginaWebPlaneacionCompra(FormatoConstantesFunciones.CLASSNAME);

			if(idTienePermisoformato) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaneacionCompra.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPlaneacionCompra.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPlaneacionCompra.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompra =(PlaneacionCompra) this.planeacioncompraLogic.getPlaneacionCompras().toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.planeacioncompra =(PlaneacionCompra) this.planeacioncompras.toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPlaneacionCompra(this.getplaneacioncompra(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionCompra(this.planeacioncompra);

				this.formatoBeanSwingJInternalFrame=new FormatoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.formatoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.formatoBeanSwingJInternalFrame.getFormatoLogic().setConnexion(this.planeacioncompraLogic.getConnexion());

				if(this.planeacioncompra.getid_formato()!=null) {
					this.formatoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.formatoBeanSwingJInternalFrame.setIdActual(this.planeacioncompra.getid_formato());
					this.formatoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.formatoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.formatoBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormato();
				}

				JInternalFrameBase jinternalFrame =this.formatoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPlaneacionCompra=(TitledBorder)this.jScrollPanelDatosPlaneacionCompra.getBorder();
				TitledBorder titledBorderformato=(TitledBorder)this.formatoBeanSwingJInternalFrame.jScrollPanelDatosFormato.getBorder();

				titledBorderformato.setTitle(titledBorderPlaneacionCompra.getTitle() + " -> Formato");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_formatoPlaneacionCompraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaneacionCompra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPlaneacionCompra(this.getplaneacioncompra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionCompra(this.planeacioncompra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planeacioncompra =(PlaneacionCompra) this.planeacioncompraLogic.getPlaneacionCompras().toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.planeacioncompra =(PlaneacionCompra) this.planeacioncompras.toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.planeacioncompra==null) {
						this.planeacioncompra = new PlaneacionCompra();
					}

					this.setVariablesFormularioToObjetoActualPlaneacionCompra(this.planeacioncompra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionCompra(this.planeacioncompra);
				}

				if(this.planeacioncompra.getid_formato()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_formato = "+this.planeacioncompra.getid_formato().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPlaneacionCompra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_pre_impresoPlaneacionCompraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaneacionCompra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPlaneacionCompra(this.getplaneacioncompra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionCompra(this.planeacioncompra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planeacioncompra =(PlaneacionCompra) this.planeacioncompraLogic.getPlaneacionCompras().toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.planeacioncompra =(PlaneacionCompra) this.planeacioncompras.toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.planeacioncompra==null) {
						this.planeacioncompra = new PlaneacionCompra();
					}

					this.setVariablesFormularioToObjetoActualPlaneacionCompra(this.planeacioncompra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionCompra(this.planeacioncompra);
				}

				if(this.planeacioncompra.getnumero_pre_impreso()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_pre_impreso like '%"+this.planeacioncompra.getnumero_pre_impreso()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPlaneacionCompra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaPlaneacionCompraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaneacionCompra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPlaneacionCompra(this.getplaneacioncompra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionCompra(this.planeacioncompra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planeacioncompra =(PlaneacionCompra) this.planeacioncompraLogic.getPlaneacionCompras().toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.planeacioncompra =(PlaneacionCompra) this.planeacioncompras.toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.planeacioncompra==null) {
						this.planeacioncompra = new PlaneacionCompra();
					}

					this.setVariablesFormularioToObjetoActualPlaneacionCompra(this.planeacioncompra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionCompra(this.planeacioncompra);
				}

				if(this.planeacioncompra.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.planeacioncompra.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPlaneacionCompra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_mes_inicioPlaneacionCompraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomesinicio=true;

			idTienePermisomesinicio=this.tienePermisosUsuarioEnPaginaWebPlaneacionCompra(MesConstantesFunciones.CLASSNAME);

			if(idTienePermisomesinicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaneacionCompra.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPlaneacionCompra.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPlaneacionCompra.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompra =(PlaneacionCompra) this.planeacioncompraLogic.getPlaneacionCompras().toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.planeacioncompra =(PlaneacionCompra) this.planeacioncompras.toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPlaneacionCompra(this.getplaneacioncompra(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionCompra(this.planeacioncompra);

				this.mesinicioBeanSwingJInternalFrame=new MesBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.mesinicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.mesinicioBeanSwingJInternalFrame.getMesLogic().setConnexion(this.planeacioncompraLogic.getConnexion());

				if(this.planeacioncompra.getid_mes_inicio()!=null) {
					this.mesinicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.mesinicioBeanSwingJInternalFrame.setIdActual(this.planeacioncompra.getid_mes_inicio());
					this.mesinicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.mesinicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.mesinicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaMes();
				}

				JInternalFrameBase jinternalFrame =this.mesinicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPlaneacionCompra=(TitledBorder)this.jScrollPanelDatosPlaneacionCompra.getBorder();
				TitledBorder titledBordermesinicio=(TitledBorder)this.mesinicioBeanSwingJInternalFrame.jScrollPanelDatosMes.getBorder();

				titledBordermesinicio.setTitle(titledBorderPlaneacionCompra.getTitle() + " -> Mes");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_mes_inicioPlaneacionCompraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaneacionCompra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPlaneacionCompra(this.getplaneacioncompra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionCompra(this.planeacioncompra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planeacioncompra =(PlaneacionCompra) this.planeacioncompraLogic.getPlaneacionCompras().toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.planeacioncompra =(PlaneacionCompra) this.planeacioncompras.toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.planeacioncompra==null) {
						this.planeacioncompra = new PlaneacionCompra();
					}

					this.setVariablesFormularioToObjetoActualPlaneacionCompra(this.planeacioncompra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionCompra(this.planeacioncompra);
				}

				if(this.planeacioncompra.getid_mes_inicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_mes_inicio = "+this.planeacioncompra.getid_mes_inicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPlaneacionCompra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_mes_finPlaneacionCompraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomesfin=true;

			idTienePermisomesfin=this.tienePermisosUsuarioEnPaginaWebPlaneacionCompra(MesConstantesFunciones.CLASSNAME);

			if(idTienePermisomesfin) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaneacionCompra.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPlaneacionCompra.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPlaneacionCompra.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompra =(PlaneacionCompra) this.planeacioncompraLogic.getPlaneacionCompras().toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.planeacioncompra =(PlaneacionCompra) this.planeacioncompras.toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPlaneacionCompra(this.getplaneacioncompra(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionCompra(this.planeacioncompra);

				this.mesfinBeanSwingJInternalFrame=new MesBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.mesfinBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.mesfinBeanSwingJInternalFrame.getMesLogic().setConnexion(this.planeacioncompraLogic.getConnexion());

				if(this.planeacioncompra.getid_mes_fin()!=null) {
					this.mesfinBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.mesfinBeanSwingJInternalFrame.setIdActual(this.planeacioncompra.getid_mes_fin());
					this.mesfinBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.mesfinBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.mesfinBeanSwingJInternalFrame.inicializarActualizarBindingTablaMes();
				}

				JInternalFrameBase jinternalFrame =this.mesfinBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPlaneacionCompra=(TitledBorder)this.jScrollPanelDatosPlaneacionCompra.getBorder();
				TitledBorder titledBordermesfin=(TitledBorder)this.mesfinBeanSwingJInternalFrame.jScrollPanelDatosMes.getBorder();

				titledBordermesfin.setTitle(titledBorderPlaneacionCompra.getTitle() + " -> Mes");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_mes_finPlaneacionCompraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaneacionCompra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPlaneacionCompra(this.getplaneacioncompra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionCompra(this.planeacioncompra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planeacioncompra =(PlaneacionCompra) this.planeacioncompraLogic.getPlaneacionCompras().toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.planeacioncompra =(PlaneacionCompra) this.planeacioncompras.toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.planeacioncompra==null) {
						this.planeacioncompra = new PlaneacionCompra();
					}

					this.setVariablesFormularioToObjetoActualPlaneacionCompra(this.planeacioncompra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionCompra(this.planeacioncompra);
				}

				if(this.planeacioncompra.getid_mes_fin()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_mes_fin = "+this.planeacioncompra.getid_mes_fin().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPlaneacionCompra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_mesesPlaneacionCompraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaneacionCompra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPlaneacionCompra(this.getplaneacioncompra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionCompra(this.planeacioncompra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planeacioncompra =(PlaneacionCompra) this.planeacioncompraLogic.getPlaneacionCompras().toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.planeacioncompra =(PlaneacionCompra) this.planeacioncompras.toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.planeacioncompra==null) {
						this.planeacioncompra = new PlaneacionCompra();
					}

					this.setVariablesFormularioToObjetoActualPlaneacionCompra(this.planeacioncompra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionCompra(this.planeacioncompra);
				}

				if(this.planeacioncompra.getnumero_meses()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_meses = "+this.planeacioncompra.getnumero_meses().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPlaneacionCompra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_cortePlaneacionCompraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaneacionCompra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPlaneacionCompra(this.getplaneacioncompra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionCompra(this.planeacioncompra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planeacioncompra =(PlaneacionCompra) this.planeacioncompraLogic.getPlaneacionCompras().toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.planeacioncompra =(PlaneacionCompra) this.planeacioncompras.toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.planeacioncompra==null) {
						this.planeacioncompra = new PlaneacionCompra();
					}

					this.setVariablesFormularioToObjetoActualPlaneacionCompra(this.planeacioncompra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionCompra(this.planeacioncompra);
				}

				if(this.planeacioncompra.getfecha_corte()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_corte = '"+Funciones2.getStringPostgresDate(this.planeacioncompra.getfecha_corte())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPlaneacionCompra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_pedidoPlaneacionCompraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaneacionCompra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPlaneacionCompra(this.getplaneacioncompra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionCompra(this.planeacioncompra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planeacioncompra =(PlaneacionCompra) this.planeacioncompraLogic.getPlaneacionCompras().toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.planeacioncompra =(PlaneacionCompra) this.planeacioncompras.toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.planeacioncompra==null) {
						this.planeacioncompra = new PlaneacionCompra();
					}

					this.setVariablesFormularioToObjetoActualPlaneacionCompra(this.planeacioncompra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionCompra(this.planeacioncompra);
				}

				if(this.planeacioncompra.getcodigo_pedido()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_pedido like '%"+this.planeacioncompra.getcodigo_pedido()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPlaneacionCompra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcion1PlaneacionCompraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaneacionCompra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPlaneacionCompra(this.getplaneacioncompra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionCompra(this.planeacioncompra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planeacioncompra =(PlaneacionCompra) this.planeacioncompraLogic.getPlaneacionCompras().toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.planeacioncompra =(PlaneacionCompra) this.planeacioncompras.toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.planeacioncompra==null) {
						this.planeacioncompra = new PlaneacionCompra();
					}

					this.setVariablesFormularioToObjetoActualPlaneacionCompra(this.planeacioncompra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionCompra(this.planeacioncompra);
				}

				if(this.planeacioncompra.getdescripcion1()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion1 like '%"+this.planeacioncompra.getdescripcion1()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPlaneacionCompra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcion2PlaneacionCompraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaneacionCompra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPlaneacionCompra(this.getplaneacioncompra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionCompra(this.planeacioncompra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planeacioncompra =(PlaneacionCompra) this.planeacioncompraLogic.getPlaneacionCompras().toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.planeacioncompra =(PlaneacionCompra) this.planeacioncompras.toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.planeacioncompra==null) {
						this.planeacioncompra = new PlaneacionCompra();
					}

					this.setVariablesFormularioToObjetoActualPlaneacionCompra(this.planeacioncompra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionCompra(this.planeacioncompra);
				}

				if(this.planeacioncompra.getdescripcion2()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion2 like '%"+this.planeacioncompra.getdescripcion2()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPlaneacionCompra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcion3PlaneacionCompraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPlaneacionCompra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPlaneacionCompra(this.getplaneacioncompra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionCompra(this.planeacioncompra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planeacioncompra =(PlaneacionCompra) this.planeacioncompraLogic.getPlaneacionCompras().toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.planeacioncompra =(PlaneacionCompra) this.planeacioncompras.toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.planeacioncompra==null) {
						this.planeacioncompra = new PlaneacionCompra();
					}

					this.setVariablesFormularioToObjetoActualPlaneacionCompra(this.planeacioncompra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionCompra(this.planeacioncompra);
				}

				if(this.planeacioncompra.getdescripcion3()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion3 like '%"+this.planeacioncompra.getdescripcion3()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPlaneacionCompra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEjercicioPlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPlaneacionCompra(false,false);

			this.getPlaneacionComprasFK_IdEjercicio();

			this.inicializarActualizarBindingPlaneacionCompra(false);

			//if(PlaneacionCompraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPlaneacionCompra(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpleadoPlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPlaneacionCompra(false,false);

			this.getPlaneacionComprasFK_IdEmpleado();

			this.inicializarActualizarBindingPlaneacionCompra(false);

			//if(PlaneacionCompraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPlaneacionCompra(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaPlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPlaneacionCompra(false,false);

			this.getPlaneacionComprasFK_IdEmpresa();

			this.inicializarActualizarBindingPlaneacionCompra(false);

			//if(PlaneacionCompraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPlaneacionCompra(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdFormatoPlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPlaneacionCompra(false,false);

			this.getPlaneacionComprasFK_IdFormato();

			this.inicializarActualizarBindingPlaneacionCompra(false);

			//if(PlaneacionCompraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPlaneacionCompra(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMesFinPlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPlaneacionCompra(false,false);

			this.getPlaneacionComprasFK_IdMesFin();

			this.inicializarActualizarBindingPlaneacionCompra(false);

			//if(PlaneacionCompraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPlaneacionCompra(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMesInicioPlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPlaneacionCompra(false,false);

			this.getPlaneacionComprasFK_IdMesInicio();

			this.inicializarActualizarBindingPlaneacionCompra(false);

			//if(PlaneacionCompraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPlaneacionCompra(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPeriodoPlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPlaneacionCompra(false,false);

			this.getPlaneacionComprasFK_IdPeriodo();

			this.inicializarActualizarBindingPlaneacionCompra(false);

			//if(PlaneacionCompraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPlaneacionCompra(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalPlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPlaneacionCompra(false,false);

			this.getPlaneacionComprasFK_IdSucursal();

			this.inicializarActualizarBindingPlaneacionCompra(false);

			//if(PlaneacionCompraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPlaneacionCompra(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdUsuarioPlaneacionCompraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPlaneacionCompra(false,false);

			this.getPlaneacionComprasFK_IdUsuario();

			this.inicializarActualizarBindingPlaneacionCompra(false);

			//if(PlaneacionCompraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPlaneacionCompra(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.planeacioncompraLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFramePlaneacionCompra() {
		if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) {
		

		if(this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) {
			this.jInternalFrameDetalleFormPlaneacionCompra.setVisible(false);	    			
			this.jInternalFrameDetalleFormPlaneacionCompra.dispose();
			this.jInternalFrameDetalleFormPlaneacionCompra=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoPlaneacionCompra!=null) {
			this.jInternalFrameReporteDinamicoPlaneacionCompra.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoPlaneacionCompra.dispose();
			this.jInternalFrameReporteDinamicoPlaneacionCompra=null;
		}
		
		if(this.jInternalFrameImportacionPlaneacionCompra!=null) {
			this.jInternalFrameImportacionPlaneacionCompra.setVisible(false);	    			
			this.jInternalFrameImportacionPlaneacionCompra.dispose();
			this.jInternalFrameImportacionPlaneacionCompra=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessPlaneacionCompra();
			
			PlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.planeacioncompra,new Object(),this.planeacioncompraParameterGeneral,this.planeacioncompraReturnGeneral);
			
			
			if(sTipo.equals("NuevoPlaneacionCompra")) {
				jButtonNuevoPlaneacionCompraActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarPlaneacionCompra")) {
				jButtonDuplicarPlaneacionCompraActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarPlaneacionCompra")) {
				jButtonCopiarPlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("VerFormPlaneacionCompra")) {
				jButtonVerFormPlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarPlaneacionCompra")) {
				jButtonNuevoPlaneacionCompraActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarPlaneacionCompra")) {
				jButtonDuplicarPlaneacionCompraActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoPlaneacionCompra")) {
				jButtonNuevoPlaneacionCompraActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarPlaneacionCompra")) {
				jButtonDuplicarPlaneacionCompraActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesPlaneacionCompra")) {
				jButtonNuevoPlaneacionCompraActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarPlaneacionCompra")) {
				jButtonNuevoPlaneacionCompraActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesPlaneacionCompra")) {
				jButtonNuevoPlaneacionCompraActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarPlaneacionCompra")) {
				jButtonModificarPlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarPlaneacionCompra")) {
				jButtonModificarPlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarPlaneacionCompra")) {
				jButtonModificarPlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("ActualizarPlaneacionCompra")) {
				jButtonActualizarPlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarPlaneacionCompra")) {
				jButtonActualizarPlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarPlaneacionCompra")) {
				jButtonActualizarPlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("EliminarPlaneacionCompra")) {
				jButtonEliminarPlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarPlaneacionCompra")) {
				jButtonEliminarPlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarPlaneacionCompra")) {
				jButtonEliminarPlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("CancelarPlaneacionCompra")) {
				jButtonCancelarPlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarPlaneacionCompra")) {
				jButtonCancelarPlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarPlaneacionCompra")) {
				jButtonCancelarPlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("CerrarPlaneacionCompra")) {
				jButtonCerrarPlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarPlaneacionCompra")) {
				jButtonCerrarPlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarPlaneacionCompra")) {
				jButtonCerrarPlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarPlaneacionCompra")) {
				jButtonMostrarOcultarPlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarPlaneacionCompra")) {
				jButtonCancelarPlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosPlaneacionCompra")) {
				jButtonGuardarCambiosPlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarPlaneacionCompra")) {
				jButtonGuardarCambiosPlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarPlaneacionCompra")) {
				jButtonCopiarPlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarPlaneacionCompra")) {
				jButtonVerFormPlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosPlaneacionCompra")) {
				jButtonGuardarCambiosPlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarPlaneacionCompra")) {
				jButtonCopiarPlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormPlaneacionCompra")) {
				jButtonVerFormPlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaPlaneacionCompra")) {
				jButtonGuardarCambiosPlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarPlaneacionCompra")) {
				jButtonGuardarCambiosPlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaPlaneacionCompra")) {
				jButtonGuardarCambiosPlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionPlaneacionCompra")) {
				jButtonRecargarInformacionPlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarPlaneacionCompra")) {
				jButtonRecargarInformacionPlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionPlaneacionCompra")) {
				jButtonRecargarInformacionPlaneacionCompraActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresPlaneacionCompra")) {
				jButtonAnterioresPlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarPlaneacionCompra")) {
				jButtonAnterioresPlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnteriorePlaneacionCompra")) {
				jButtonAnterioresPlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("SiguientesPlaneacionCompra")) {
				jButtonSiguientesPlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarPlaneacionCompra")) {
				jButtonSiguientesPlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesPlaneacionCompra")) {
				jButtonSiguientesPlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByPlaneacionCompra") || sTipo.equals("MenuItemDetalleAbrirOrderByPlaneacionCompra")) {
				jButtonAbrirOrderByPlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarPlaneacionCompra") || sTipo.equals("MenuItemDetalleMostrarOcultarPlaneacionCompra")) {
				jButtonMostrarOcultarPlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosPlaneacionCompra")) {
				jButtonNuevoGuardarCambiosPlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarPlaneacionCompra")) {
				jButtonNuevoGuardarCambiosPlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosPlaneacionCompra")) {
				jButtonNuevoGuardarCambiosPlaneacionCompraActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoPlaneacionCompra")) {
				jButtonCerrarReporteDinamicoPlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoPlaneacionCompra")) {
				jButtonGenerarReporteDinamicoPlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoPlaneacionCompra")) {
				
				jButtonGenerarExcelReporteDinamicoPlaneacionCompraActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionPlaneacionCompra")) {
				jButtonCerrarImportacionPlaneacionCompraActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionPlaneacionCompra")) {
				
				jButtonGenerarImportacionPlaneacionCompraActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionPlaneacionCompra")) {
				
				jButtonAbrirImportacionPlaneacionCompraActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesPlaneacionCompra")) {
				jComboBoxTiposAccionesPlaneacionCompraActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesPlaneacionCompra")) {
				jComboBoxTiposRelacionesPlaneacionCompraActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioPlaneacionCompra")) {
				jComboBoxTiposAccionesPlaneacionCompraActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarPlaneacionCompra")) {
				
				jComboBoxTiposSeleccionarPlaneacionCompraActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralPlaneacionCompra")) {
				jTextFieldValorCampoGeneralPlaneacionCompraActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByPlaneacionCompra")) {
				jButtonAbrirOrderByPlaneacionCompraActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarPlaneacionCompra")) {
				jButtonAbrirOrderByPlaneacionCompraActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByPlaneacionCompra")) {
				jButtonCerrarOrderByPlaneacionCompraActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPlaneacionCompraBusqueda")) {
				this.jButtonidPlaneacionCompraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPlaneacionCompraUpdate")) {
				this.jButtonid_empresaPlaneacionCompraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPlaneacionCompraBusqueda")) {
				this.jButtonid_empresaPlaneacionCompraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalPlaneacionCompraUpdate")) {
				this.jButtonid_sucursalPlaneacionCompraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalPlaneacionCompraBusqueda")) {
				this.jButtonid_sucursalPlaneacionCompraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioPlaneacionCompraUpdate")) {
				this.jButtonid_ejercicioPlaneacionCompraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioPlaneacionCompraBusqueda")) {
				this.jButtonid_ejercicioPlaneacionCompraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoPlaneacionCompraUpdate")) {
				this.jButtonid_periodoPlaneacionCompraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoPlaneacionCompraBusqueda")) {
				this.jButtonid_periodoPlaneacionCompraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoPlaneacionCompraUpdate")) {
				this.jButtonid_empleadoPlaneacionCompraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoPlaneacionCompraBusqueda")) {
				this.jButtonid_empleadoPlaneacionCompraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_usuarioPlaneacionCompraUpdate")) {
				this.jButtonid_usuarioPlaneacionCompraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_usuarioPlaneacionCompraBusqueda")) {
				this.jButtonid_usuarioPlaneacionCompraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_formatoPlaneacionCompraUpdate")) {
				this.jButtonid_formatoPlaneacionCompraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_formatoPlaneacionCompraBusqueda")) {
				this.jButtonid_formatoPlaneacionCompraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_pre_impresoPlaneacionCompraBusqueda")) {
				this.jButtonnumero_pre_impresoPlaneacionCompraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaPlaneacionCompraBusqueda")) {
				this.jButtonfechaPlaneacionCompraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mes_inicioPlaneacionCompraUpdate")) {
				this.jButtonid_mes_inicioPlaneacionCompraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mes_inicioPlaneacionCompraBusqueda")) {
				this.jButtonid_mes_inicioPlaneacionCompraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mes_finPlaneacionCompraUpdate")) {
				this.jButtonid_mes_finPlaneacionCompraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mes_finPlaneacionCompraBusqueda")) {
				this.jButtonid_mes_finPlaneacionCompraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_mesesPlaneacionCompraBusqueda")) {
				this.jButtonnumero_mesesPlaneacionCompraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_cortePlaneacionCompraBusqueda")) {
				this.jButtonfecha_cortePlaneacionCompraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_pedidoPlaneacionCompraBusqueda")) {
				this.jButtoncodigo_pedidoPlaneacionCompraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcion1PlaneacionCompraBusqueda")) {
				this.jButtondescripcion1PlaneacionCompraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcion2PlaneacionCompraBusqueda")) {
				this.jButtondescripcion2PlaneacionCompraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcion3PlaneacionCompraBusqueda")) {
				this.jButtondescripcion3PlaneacionCompraBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdEmpleadoPlaneacionCompra")) {
				this.jButtonFK_IdEmpleadoPlaneacionCompraActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdFormatoPlaneacionCompra")) {
				this.jButtonFK_IdFormatoPlaneacionCompraActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdMesFinPlaneacionCompra")) {
				this.jButtonFK_IdMesFinPlaneacionCompraActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdMesInicioPlaneacionCompra")) {
				this.jButtonFK_IdMesInicioPlaneacionCompraActionPerformed(evt);
			}
			
			;
			
			
			PlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.planeacioncompra,new Object(),this.planeacioncompraParameterGeneral,this.planeacioncompraReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessPlaneacionCompra();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPlaneacionCompraActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.planeacioncompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.planeacioncompra);
				
				PlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planeacioncompra,new Object(),this.planeacioncompraParameterGeneral,this.planeacioncompraReturnGeneral);
				
				


				
				PlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planeacioncompra,new Object(),this.planeacioncompraParameterGeneral,this.planeacioncompraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PlaneacionCompra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PlaneacionCompra.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			PlaneacionCompra planeacioncompraLocal=null;
			
			if(!this.getEsControlTabla()) {
				planeacioncompraLocal=this.planeacioncompra;
			} else {
				planeacioncompraLocal=this.planeacioncompraAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.planeacioncompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.planeacioncompra);
				
				PlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planeacioncompra,new Object(),this.planeacioncompraParameterGeneral,this.planeacioncompraReturnGeneral);
							
				
				


				
				PlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planeacioncompra,new Object(),this.planeacioncompraParameterGeneral,this.planeacioncompraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PlaneacionCompra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PlaneacionCompra.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPlaneacionCompraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPlaneacionCompra.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraAnterior =(PlaneacionCompra) this.planeacioncompraLogic.getPlaneacionCompras().toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.planeacioncompraAnterior =(PlaneacionCompra) this.planeacioncompras.toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
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
			
			PlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planeacioncompra,new Object(),this.planeacioncompraParameterGeneral,this.planeacioncompraReturnGeneral);
			
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
			
			


			
			PlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planeacioncompra,new Object(),this.planeacioncompraParameterGeneral,this.planeacioncompraReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPlaneacionCompraActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.planeacioncompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.planeacioncompra);
				
				PlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planeacioncompra,new Object(),this.planeacioncompraParameterGeneral,this.planeacioncompraReturnGeneral);
								
						
				


				
				PlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planeacioncompra,new Object(),this.planeacioncompraParameterGeneral,this.planeacioncompraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PlaneacionCompra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PlaneacionCompra.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.planeacioncompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.planeacioncompra);
				
				PlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planeacioncompra,new Object(),this.planeacioncompraParameterGeneral,this.planeacioncompraReturnGeneral);
								
				
				


				
				PlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planeacioncompra,new Object(),this.planeacioncompraParameterGeneral,this.planeacioncompraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PlaneacionCompra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PlaneacionCompra.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPlaneacionCompraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPlaneacionCompra.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraAnterior =(PlaneacionCompra) this.planeacioncompraLogic.getPlaneacionCompras().toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.planeacioncompraAnterior =(PlaneacionCompra) this.planeacioncompras.toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.planeacioncompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.planeacioncompra);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPlaneacionCompraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPlaneacionCompra.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraAnterior =(PlaneacionCompra) this.planeacioncompraLogic.getPlaneacionCompras().toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.planeacioncompraAnterior =(PlaneacionCompra) this.planeacioncompras.toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPlaneacionCompraActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.planeacioncompra);
			
			this.actualizarInformacion("INFO_PADRE",false,this.planeacioncompra);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.planeacioncompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.planeacioncompra);
				
				PlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planeacioncompra,new Object(),this.planeacioncompraParameterGeneral,this.planeacioncompraReturnGeneral);
							
				
				


				
				PlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planeacioncompra,new Object(),this.planeacioncompraParameterGeneral,this.planeacioncompraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PlaneacionCompra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PlaneacionCompra.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPlaneacionCompraActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPlaneacionCompra.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planeacioncompraAnterior =(PlaneacionCompra) this.planeacioncompraLogic.getPlaneacionCompras().toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.planeacioncompraAnterior =(PlaneacionCompra) this.planeacioncompras.toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
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
			
			PlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planeacioncompra,new Object(),this.planeacioncompraParameterGeneral,this.planeacioncompraReturnGeneral);
			
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
			
			


			
			PlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planeacioncompra,new Object(),this.planeacioncompraParameterGeneral,this.planeacioncompraReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPlaneacionCompraActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.planeacioncompra);
			
			this.actualizarInformacion("INFO_PADRE",false,this.planeacioncompra);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.planeacioncompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.planeacioncompra);
				
				PlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planeacioncompra,new Object(),this.planeacioncompraParameterGeneral,this.planeacioncompraReturnGeneral);
								
				
				


				
				PlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planeacioncompra,new Object(),this.planeacioncompraParameterGeneral,this.planeacioncompraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PlaneacionCompra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PlaneacionCompra.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPlaneacionCompraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPlaneacionCompra.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraAnterior =(PlaneacionCompra) this.planeacioncompraLogic.getPlaneacionCompras().toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.planeacioncompraAnterior =(PlaneacionCompra) this.planeacioncompras.toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPlaneacionCompraActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.planeacioncompra);
			
			this.actualizarInformacion("INFO_PADRE",false,this.planeacioncompra);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPlaneacionCompraActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.planeacioncompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.planeacioncompra);
				
				PlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.planeacioncompra,new Object(),this.planeacioncompraParameterGeneral,this.planeacioncompraReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosPlaneacionCompra")) {
					jCheckBoxSeleccionarTodosPlaneacionCompraItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosPlaneacionCompra")) {
					jCheckBoxSeleccionadosPlaneacionCompraItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarPlaneacionCompra")) {
					
				}
				
				


				
				
				PlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.planeacioncompra,new Object(),this.planeacioncompraParameterGeneral,this.planeacioncompraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PlaneacionCompra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PlaneacionCompra.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.planeacioncompra);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.planeacioncompra);
				
				PlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.planeacioncompra,new Object(),this.planeacioncompraParameterGeneral,this.planeacioncompraReturnGeneral);
												
				
				


				
				
				PlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.planeacioncompra,new Object(),this.planeacioncompraParameterGeneral,this.planeacioncompraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PlaneacionCompra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PlaneacionCompra.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPlaneacionCompraActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPlaneacionCompra.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.planeacioncompraAnterior =(PlaneacionCompra) this.planeacioncompraLogic.getPlaneacionCompras().toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.planeacioncompraAnterior =(PlaneacionCompra) this.planeacioncompras.toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPlaneacionCompraActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.planeacioncompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.planeacioncompra);
				
				PlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.planeacioncompra,new Object(),this.planeacioncompraParameterGeneral,this.planeacioncompraReturnGeneral);
				
				
				PlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.planeacioncompra,new Object(),this.planeacioncompraParameterGeneral,this.planeacioncompraReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
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
			
			PlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.planeacioncompra,new Object(),this.planeacioncompraParameterGeneral,this.planeacioncompraReturnGeneral);
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
			
			


			
			PlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planeacioncompra,new Object(),this.planeacioncompraParameterGeneral,this.planeacioncompraReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPlaneacionCompraActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.planeacioncompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.planeacioncompra);
				
				PlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.planeacioncompra,new Object(),this.planeacioncompraParameterGeneral,this.planeacioncompraReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				PlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planeacioncompra,new Object(),this.planeacioncompraParameterGeneral,this.planeacioncompraReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PlaneacionCompra.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PlaneacionCompra.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.planeacioncompra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.planeacioncompra);
				
				PlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.planeacioncompra,new Object(),this.planeacioncompraParameterGeneral,this.planeacioncompraReturnGeneral);
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
				
				


				
				PlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planeacioncompra,new Object(),this.planeacioncompraParameterGeneral,this.planeacioncompraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PlaneacionCompra.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PlaneacionCompra.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPlaneacionCompraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPlaneacionCompra.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.planeacioncompraAnterior =(PlaneacionCompra) this.planeacioncompraLogic.getPlaneacionCompras().toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.planeacioncompraAnterior =(PlaneacionCompra) this.planeacioncompras.toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				PlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planeacioncompra,new Object(),this.planeacioncompraParameterGeneral,this.planeacioncompraReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarPlaneacionCompra")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosPlaneacionCompraListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosPlaneacionCompra.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.planeacioncompra =(PlaneacionCompra) this.planeacioncompraLogic.getPlaneacionCompras().toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.planeacioncompra =(PlaneacionCompra) this.planeacioncompras.toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.planeacioncompra);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarPlaneacionCompra")) {
				
				}
				
				PlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.planeacioncompra,new Object(),this.planeacioncompraParameterGeneral,this.planeacioncompraReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			PlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.planeacioncompra,new Object(),this.planeacioncompraParameterGeneral,this.planeacioncompraReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarPlaneacionCompra")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosPlaneacionCompra.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarPlaneacionCompra")) {
			
			}
			
			PlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.planeacioncompra,new Object(),this.planeacioncompraParameterGeneral,this.planeacioncompraReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessPlaneacionCompra();
			
			PlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.planeacioncompra,new Object(),this.planeacioncompraParameterGeneral,this.planeacioncompraReturnGeneral);
			
			if(sTipo.equals("NuevoPlaneacionCompra")) {
				jButtonNuevoPlaneacionCompraActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarPlaneacionCompra")) {
				jButtonDuplicarPlaneacionCompraActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarPlaneacionCompra")) {
				jButtonCopiarPlaneacionCompraActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormPlaneacionCompra")) {
				jButtonVerFormPlaneacionCompraActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesPlaneacionCompra")) {
				jButtonNuevoPlaneacionCompraActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarPlaneacionCompra")) {
				jButtonModificarPlaneacionCompraActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarPlaneacionCompra")) {
				jButtonActualizarPlaneacionCompraActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarPlaneacionCompra")) {
				jButtonEliminarPlaneacionCompraActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaPlaneacionCompra")) {
				jButtonGuardarCambiosPlaneacionCompraActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarPlaneacionCompra")) {
				jButtonCancelarPlaneacionCompraActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarPlaneacionCompra")) {
				jButtonCerrarPlaneacionCompraActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosPlaneacionCompra")) {
				jButtonGuardarCambiosPlaneacionCompraActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosPlaneacionCompra")) {
				jButtonNuevoGuardarCambiosPlaneacionCompraActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByPlaneacionCompra")) {
				jButtonAbrirOrderByPlaneacionCompraActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionPlaneacionCompra")) {
				jButtonRecargarInformacionPlaneacionCompraActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresPlaneacionCompra")) {
				jButtonAnterioresPlaneacionCompraActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesPlaneacionCompra")) {
				jButtonSiguientesPlaneacionCompraActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPlaneacionCompraBusqueda")) {
				this.jButtonidPlaneacionCompraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPlaneacionCompraUpdate")) {
				this.jButtonid_empresaPlaneacionCompraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPlaneacionCompraBusqueda")) {
				this.jButtonid_empresaPlaneacionCompraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalPlaneacionCompraUpdate")) {
				this.jButtonid_sucursalPlaneacionCompraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalPlaneacionCompraBusqueda")) {
				this.jButtonid_sucursalPlaneacionCompraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioPlaneacionCompraUpdate")) {
				this.jButtonid_ejercicioPlaneacionCompraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioPlaneacionCompraBusqueda")) {
				this.jButtonid_ejercicioPlaneacionCompraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoPlaneacionCompraUpdate")) {
				this.jButtonid_periodoPlaneacionCompraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoPlaneacionCompraBusqueda")) {
				this.jButtonid_periodoPlaneacionCompraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoPlaneacionCompraUpdate")) {
				this.jButtonid_empleadoPlaneacionCompraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoPlaneacionCompraBusqueda")) {
				this.jButtonid_empleadoPlaneacionCompraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_usuarioPlaneacionCompraUpdate")) {
				this.jButtonid_usuarioPlaneacionCompraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_usuarioPlaneacionCompraBusqueda")) {
				this.jButtonid_usuarioPlaneacionCompraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_formatoPlaneacionCompraUpdate")) {
				this.jButtonid_formatoPlaneacionCompraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_formatoPlaneacionCompraBusqueda")) {
				this.jButtonid_formatoPlaneacionCompraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_pre_impresoPlaneacionCompraBusqueda")) {
				this.jButtonnumero_pre_impresoPlaneacionCompraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaPlaneacionCompraBusqueda")) {
				this.jButtonfechaPlaneacionCompraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mes_inicioPlaneacionCompraUpdate")) {
				this.jButtonid_mes_inicioPlaneacionCompraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mes_inicioPlaneacionCompraBusqueda")) {
				this.jButtonid_mes_inicioPlaneacionCompraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mes_finPlaneacionCompraUpdate")) {
				this.jButtonid_mes_finPlaneacionCompraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mes_finPlaneacionCompraBusqueda")) {
				this.jButtonid_mes_finPlaneacionCompraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_mesesPlaneacionCompraBusqueda")) {
				this.jButtonnumero_mesesPlaneacionCompraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_cortePlaneacionCompraBusqueda")) {
				this.jButtonfecha_cortePlaneacionCompraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_pedidoPlaneacionCompraBusqueda")) {
				this.jButtoncodigo_pedidoPlaneacionCompraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcion1PlaneacionCompraBusqueda")) {
				this.jButtondescripcion1PlaneacionCompraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcion2PlaneacionCompraBusqueda")) {
				this.jButtondescripcion2PlaneacionCompraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcion3PlaneacionCompraBusqueda")) {
				this.jButtondescripcion3PlaneacionCompraBusquedaActionPerformed(evt);
			}
			
			PlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.planeacioncompra,new Object(),this.planeacioncompraParameterGeneral,this.planeacioncompraReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessPlaneacionCompra();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			PlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.planeacioncompra,new Object(),this.planeacioncompraParameterGeneral,this.planeacioncompraReturnGeneral);
			
			if(sTipo.equals("CloseInternalFramePlaneacionCompra")) {
				closingInternalFramePlaneacionCompra();
				
			} else if(sTipo.equals("jButtonCancelarPlaneacionCompra")) {
				JInternalFrameBase jInternalFrameDetalleFormPlaneacionCompra = (JInternalFrameBase)evt.getSource();
	            	
	            PlaneacionCompraBeanSwingJInternalFrame jInternalFrameParent=(PlaneacionCompraBeanSwingJInternalFrame)jInternalFrameDetalleFormPlaneacionCompra.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarPlaneacionCompraActionPerformed(null);
			}
			
			PlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.planeacioncompra,new Object(),this.planeacioncompraParameterGeneral,this.planeacioncompraReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormPlaneacionCompra(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormPlaneacionCompra(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormPlaneacionCompra(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.planeacioncompra)) {
			if(!esControlTabla) {
				if(PlaneacionCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualPlaneacionCompra(this.planeacioncompra,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionCompra(this.planeacioncompra);			
				}
				
				if(this.planeacioncompraSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualPlaneacionCompra(this.planeacioncompra,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.planeacioncompraReturnGeneral=planeacioncompraLogic.procesarEventosPlaneacionComprasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.planeacioncompraLogic.getPlaneacionCompras(),this.planeacioncompra,this.planeacioncompraParameterGeneral,this.isEsNuevoPlaneacionCompra,classes);//this.planeacioncompraLogic.getPlaneacionCompra()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanPlaneacionCompra(this.planeacioncompraReturnGeneral,this.planeacioncompraBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.planeacioncompraSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanPlaneacionCompra(classes,this.planeacioncompraReturnGeneral,this.planeacioncompraBean,false);
					}
						
					if(this.planeacioncompraReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyPlaneacionCompra(this.planeacioncompraReturnGeneral.getPlaneacionCompra());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioPlaneacionCompra(this.planeacioncompraReturnGeneral.getPlaneacionCompra());	
					}
						
					if(this.planeacioncompraReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioPlaneacionCompra(this.planeacioncompraReturnGeneral.getPlaneacionCompra(),classes);//this.planeacioncompraBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioPlaneacionCompra(this.planeacioncompra,classes);//this.planeacioncompraBean);									
				}
			
				if(PlaneacionCompraJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualPlaneacionCompra(this.planeacioncompra,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPlaneacionCompra(this.planeacioncompra);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.planeacioncompraAnterior!=null) {
						this.planeacioncompra=this.planeacioncompraAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.planeacioncompraReturnGeneral=planeacioncompraLogic.procesarEventosPlaneacionComprasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.planeacioncompraLogic.getPlaneacionCompras(),this.planeacioncompra,this.planeacioncompraParameterGeneral,this.isEsNuevoPlaneacionCompra,classes);//this.planeacioncompraLogic.getPlaneacionCompra()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.planeacioncompraSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.planeacioncompraSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.planeacioncompraReturnGeneral.getPlaneacionCompra(),planeacioncompraLogic.getPlaneacionCompras());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.planeacioncompraReturnGeneral.getPlaneacionCompra(),this.planeacioncompras);
				}
				//ARCHITECTURE
				
				//this.jTableDatosPlaneacionCompra.repaint();
				
				//((AbstractTableModel) this.jTableDatosPlaneacionCompra.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosPlaneacionCompra();
			}
		}
	}
	
	public void actualizarVisualTableDatosPlaneacionCompra() throws Exception {
		
		PlaneacionCompraModel planeacioncompraModel=(PlaneacionCompraModel)this.jTableDatosPlaneacionCompra.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			planeacioncompraModel.planeacioncompras=this.planeacioncompraLogic.getPlaneacionCompras();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			planeacioncompraModel.planeacioncompras=this.planeacioncompras;
		}
		
		
		((PlaneacionCompraModel) this.jTableDatosPlaneacionCompra.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaPlaneacionCompra() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getplaneacioncompraAnterior(),this.planeacioncompraLogic.getPlaneacionCompras());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getplaneacioncompraAnterior(),this.planeacioncompras);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosPlaneacionCompra();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioPlaneacionCompra(PlaneacionCompra planeacioncompra,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetallePlaneacionCompra.class)) {
					this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompraLogic.setDetallePlaneacionCompras(planeacioncompra.getDetallePlaneacionCompras());
					this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetallePlaneacionCompra(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
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
										
				PlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.planeacioncompra,new Object(),generalEntityParameterGeneral,this.planeacioncompraReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.planeacioncompraSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=PlaneacionCompraConstantesFunciones.getClassesRelationshipsOfPlaneacionCompra(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=PlaneacionCompraConstantesFunciones.getClassesRelationshipsFromStringsOfPlaneacionCompra(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormPlaneacionCompra(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				PlaneacionCompraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.planeacioncompra,new Object(),generalEntityParameterGeneral,this.planeacioncompraReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioPlaneacionCompra(PlaneacionCompraBean planeacioncompraBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetallePlaneacionCompra.class)) {
					this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompraLogic.setDetallePlaneacionCompras(planeacioncompra.getDetallePlaneacionCompras());
					this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetallePlaneacionCompra(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanPlaneacionCompra(ArrayList<Classe> classes,PlaneacionCompraReturnGeneral planeacioncompraReturnGeneral,PlaneacionCompraBean planeacioncompraBean,Boolean conDefault) throws Exception {
		
			this.planeacioncompraBean.setDetallePlaneacionCompras(planeacioncompraReturnGeneral.getPlaneacionCompra().getDetallePlaneacionCompras());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualPlaneacionCompra(PlaneacionCompra planeacioncompra,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(DetallePlaneacionCompra.class)) {
					planeacioncompra.setDetallePlaneacionCompras(this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraBeanSwingJInternalFrame.detalleplaneacioncompraLogic.getDetallePlaneacionCompras());
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
		if(!paraTabla && !this.permiteMantenimiento(this.planeacioncompra)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormPlaneacionCompra = new PlaneacionCompraDetalleFormJInternalFrame(jDesktopPane,this.planeacioncompraSessionBean.getConGuardarRelaciones(),this.planeacioncompraSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormPlaneacionCompra);
		this.jInternalFrameDetalleFormPlaneacionCompra.setVisible(false);
		this.jInternalFrameDetalleFormPlaneacionCompra.setSelected(false);						
		
		this.jInternalFrameDetalleFormPlaneacionCompra.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormPlaneacionCompra.planeacioncompraLogic=this.planeacioncompraLogic;
		
		this.cargarCombosFrameForeignKeyPlaneacionCompra("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetallePlaneacionCompra();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePlaneacionCompra();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyPlaneacionCompra("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyPlaneacionCompra();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormPlaneacionCompra.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPlaneacionCompra"));
		
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonModificarPlaneacionCompra.addActionListener(new ButtonActionListener(this,"ModificarPlaneacionCompra"));

		
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonModificarToolBarPlaneacionCompra.addActionListener(new ButtonActionListener(this,"ModificarToolBarPlaneacionCompra"));
					
		this.jInternalFrameDetalleFormPlaneacionCompra.jMenuItemModificarPlaneacionCompra.addActionListener(new ButtonActionListener(this,"MenuItemModificarPlaneacionCompra"));		
		
		
		
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonActualizarPlaneacionCompra.addActionListener (new ButtonActionListener(this,"ActualizarPlaneacionCompra"));
		
		
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonActualizarToolBarPlaneacionCompra.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPlaneacionCompra"));
						
		this.jInternalFrameDetalleFormPlaneacionCompra.jMenuItemActualizarPlaneacionCompra.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPlaneacionCompra"));		
		
		
		
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonEliminarPlaneacionCompra.addActionListener (new ButtonActionListener(this,"EliminarPlaneacionCompra"));
		
		
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonEliminarToolBarPlaneacionCompra.addActionListener (new ButtonActionListener(this,"EliminarToolBarPlaneacionCompra"));
								
		this.jInternalFrameDetalleFormPlaneacionCompra.jMenuItemEliminarPlaneacionCompra.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPlaneacionCompra"));		
		
		
		
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonCancelarPlaneacionCompra.addActionListener (new ButtonActionListener(this,"CancelarPlaneacionCompra"));
		
		
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonCancelarToolBarPlaneacionCompra.addActionListener (new ButtonActionListener(this,"CancelarToolBarPlaneacionCompra"));
					
		this.jInternalFrameDetalleFormPlaneacionCompra.jMenuItemCancelarPlaneacionCompra.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPlaneacionCompra"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormPlaneacionCompra.jMenuItemDetalleCerrarPlaneacionCompra.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPlaneacionCompra"));		
		
		
		
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonGuardarCambiosToolBarPlaneacionCompra.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPlaneacionCompra"));
		
		
		
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonGuardarCambiosToolBarPlaneacionCompra.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPlaneacionCompra"));
		
		
		
		this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxTiposAccionesFormularioPlaneacionCompra.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPlaneacionCompra"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonidPlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"idPlaneacionCompraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonid_empresaPlaneacionCompraUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPlaneacionCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonid_empresaPlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPlaneacionCompraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonid_sucursalPlaneacionCompraUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalPlaneacionCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonid_sucursalPlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalPlaneacionCompraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonid_ejercicioPlaneacionCompraUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioPlaneacionCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonid_ejercicioPlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioPlaneacionCompraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonid_periodoPlaneacionCompraUpdate.addActionListener(new ButtonActionListener(this,"id_periodoPlaneacionCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonid_periodoPlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoPlaneacionCompraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonid_empleadoPlaneacionCompraUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoPlaneacionCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonid_empleadoPlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoPlaneacionCompraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonid_usuarioPlaneacionCompraUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioPlaneacionCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonid_usuarioPlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioPlaneacionCompraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonid_formatoPlaneacionCompraUpdate.addActionListener(new ButtonActionListener(this,"id_formatoPlaneacionCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonid_formatoPlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_formatoPlaneacionCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonnumero_pre_impresoPlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impresoPlaneacionCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonfechaPlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"fechaPlaneacionCompraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonid_mes_inicioPlaneacionCompraUpdate.addActionListener(new ButtonActionListener(this,"id_mes_inicioPlaneacionCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonid_mes_inicioPlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_mes_inicioPlaneacionCompraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonid_mes_finPlaneacionCompraUpdate.addActionListener(new ButtonActionListener(this,"id_mes_finPlaneacionCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonid_mes_finPlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_mes_finPlaneacionCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonnumero_mesesPlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"numero_mesesPlaneacionCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonfecha_cortePlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"fecha_cortePlaneacionCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtoncodigo_pedidoPlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"codigo_pedidoPlaneacionCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtondescripcion1PlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"descripcion1PlaneacionCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtondescripcion2PlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"descripcion2PlaneacionCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtondescripcion3PlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"descripcion3PlaneacionCompraBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormPlaneacionCompra.jTabbedPaneRelacionesPlaneacionCompra.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPlaneacionCompra"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFramePlaneacionCompra"));
		
		if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPlaneacionCompra.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPlaneacionCompra"));
		}
		
		this.jTableDatosPlaneacionCompra.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarPlaneacionCompra"));
		
		this.jTableDatosPlaneacionCompra.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarPlaneacionCompra"));
		
		this.jButtonNuevoPlaneacionCompra.addActionListener(new ButtonActionListener(this,"NuevoPlaneacionCompra"));
		
		this.jButtonDuplicarPlaneacionCompra.addActionListener(new ButtonActionListener(this,"DuplicarPlaneacionCompra"));
		
		this.jButtonCopiarPlaneacionCompra.addActionListener(new ButtonActionListener(this,"CopiarPlaneacionCompra"));
		
		this.jButtonVerFormPlaneacionCompra.addActionListener(new ButtonActionListener(this,"VerFormPlaneacionCompra"));
		
		
		this.jButtonNuevoToolBarPlaneacionCompra.addActionListener(new ButtonActionListener(this,"NuevoToolBarPlaneacionCompra"));
			
		this.jButtonDuplicarToolBarPlaneacionCompra.addActionListener(new ButtonActionListener(this,"DuplicarToolBarPlaneacionCompra"));
			
		this.jMenuItemNuevoPlaneacionCompra.addActionListener (new ButtonActionListener(this,"MenuItemNuevoPlaneacionCompra"));
			
		this.jMenuItemDuplicarPlaneacionCompra.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarPlaneacionCompra"));		
		
		
		this.jButtonNuevoRelacionesPlaneacionCompra.addActionListener (new ButtonActionListener(this,"NuevoRelacionesPlaneacionCompra"));
		
		
		this.jButtonNuevoRelacionesToolBarPlaneacionCompra.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarPlaneacionCompra"));
			
		this.jMenuItemNuevoRelacionesPlaneacionCompra.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesPlaneacionCompra"));		
		
		
		if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPlaneacionCompra.jButtonModificarPlaneacionCompra.addActionListener(new ButtonActionListener(this,"ModificarPlaneacionCompra"));
		}
		
		
		if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPlaneacionCompra.jButtonModificarToolBarPlaneacionCompra.addActionListener(new ButtonActionListener(this,"ModificarToolBarPlaneacionCompra"));
			
			this.jInternalFrameDetalleFormPlaneacionCompra.jMenuItemModificarPlaneacionCompra.addActionListener(new ButtonActionListener(this,"MenuItemModificarPlaneacionCompra"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormPlaneacionCompra.jButtonActualizarPlaneacionCompra.addActionListener (new ButtonActionListener(this,"ActualizarPlaneacionCompra"));
		}
		
		
		if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPlaneacionCompra.jButtonActualizarToolBarPlaneacionCompra.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPlaneacionCompra"));
				
			this.jInternalFrameDetalleFormPlaneacionCompra.jMenuItemActualizarPlaneacionCompra.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPlaneacionCompra"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPlaneacionCompra.jButtonEliminarPlaneacionCompra.addActionListener (new ButtonActionListener(this,"EliminarPlaneacionCompra"));
		}
		
		
		if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPlaneacionCompra.jButtonEliminarToolBarPlaneacionCompra.addActionListener (new ButtonActionListener(this,"EliminarToolBarPlaneacionCompra"));
						
			this.jInternalFrameDetalleFormPlaneacionCompra.jMenuItemEliminarPlaneacionCompra.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPlaneacionCompra"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPlaneacionCompra.jButtonCancelarPlaneacionCompra.addActionListener (new ButtonActionListener(this,"CancelarPlaneacionCompra"));
		}
		
		
		if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPlaneacionCompra.jButtonCancelarToolBarPlaneacionCompra.addActionListener (new ButtonActionListener(this,"CancelarToolBarPlaneacionCompra"));
			
			this.jInternalFrameDetalleFormPlaneacionCompra.jMenuItemCancelarPlaneacionCompra.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPlaneacionCompra"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarPlaneacionCompra.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarPlaneacionCompra"));		
		
		
		this.jButtonCerrarPlaneacionCompra.addActionListener (new ButtonActionListener(this,"CerrarPlaneacionCompra"));
		
		
		this.jButtonCerrarToolBarPlaneacionCompra.addActionListener (new ButtonActionListener(this,"CerrarToolBarPlaneacionCompra"));
			
		this.jMenuItemCerrarPlaneacionCompra.addActionListener (new ButtonActionListener(this,"MenuItemCerrarPlaneacionCompra"));
			
		if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPlaneacionCompra.jMenuItemDetalleCerrarPlaneacionCompra.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPlaneacionCompra"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPlaneacionCompra.jButtonGuardarCambiosPlaneacionCompra.addActionListener (new ButtonActionListener(this,"GuardarCambiosPlaneacionCompra"));
		}
		
		
		if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPlaneacionCompra.jButtonGuardarCambiosToolBarPlaneacionCompra.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPlaneacionCompra"));
		}
		
		this.jButtonCopiarToolBarPlaneacionCompra.addActionListener (new ButtonActionListener(this,"CopiarToolBarPlaneacionCompra"));
			
		this.jButtonVerFormToolBarPlaneacionCompra.addActionListener (new ButtonActionListener(this,"VerFormToolBarPlaneacionCompra"));
		
		this.jMenuItemGuardarCambiosPlaneacionCompra.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosPlaneacionCompra"));
			
		this.jMenuItemCopiarPlaneacionCompra.addActionListener (new ButtonActionListener(this,"MenuItemCopiarPlaneacionCompra"));		
		
		this.jMenuItemVerFormPlaneacionCompra.addActionListener (new ButtonActionListener(this,"MenuItemVerFormPlaneacionCompra"));		
		
		
		this.jButtonGuardarCambiosTablaPlaneacionCompra.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPlaneacionCompra"));
		
		
		this.jButtonGuardarCambiosTablaToolBarPlaneacionCompra.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarPlaneacionCompra"));
			
		this.jMenuItemGuardarCambiosTablaPlaneacionCompra.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPlaneacionCompra"));		
		
		
		
		this.jButtonRecargarInformacionPlaneacionCompra.addActionListener (new ButtonActionListener(this,"RecargarInformacionPlaneacionCompra"));
					
		this.jButtonRecargarInformacionToolBarPlaneacionCompra.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarPlaneacionCompra"));
		
		this.jMenuItemRecargarInformacionPlaneacionCompra.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionPlaneacionCompra"));		
		
		
		
		this.jButtonAnterioresPlaneacionCompra.addActionListener (new ButtonActionListener(this,"AnterioresPlaneacionCompra"));
		
		
		this.jButtonAnterioresToolBarPlaneacionCompra.addActionListener (new ButtonActionListener(this,"AnterioresToolBarPlaneacionCompra"));
		
		this.jMenuItemAnterioresPlaneacionCompra.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresPlaneacionCompra"));		
		
		
		this.jButtonSiguientesPlaneacionCompra.addActionListener (new ButtonActionListener(this,"SiguientesPlaneacionCompra"));
		
		
		this.jButtonSiguientesToolBarPlaneacionCompra.addActionListener (new ButtonActionListener(this,"SiguientesToolBarPlaneacionCompra"));
			
		this.jMenuItemSiguientesPlaneacionCompra.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesPlaneacionCompra"));
			
		this.jMenuItemAbrirOrderByPlaneacionCompra.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByPlaneacionCompra"));
			
		this.jMenuItemMostrarOcultarPlaneacionCompra.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarPlaneacionCompra"));
			
		this.jMenuItemDetalleAbrirOrderByPlaneacionCompra.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByPlaneacionCompra"));
			
		this.jMenuItemDetalleMostarOcultarPlaneacionCompra.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarPlaneacionCompra"));		
		
		
		this.jButtonNuevoGuardarCambiosPlaneacionCompra.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosPlaneacionCompra"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarPlaneacionCompra.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarPlaneacionCompra"));
			
		this.jMenuItemNuevoGuardarCambiosPlaneacionCompra.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosPlaneacionCompra"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosPlaneacionCompra.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosPlaneacionCompra"));

		this.jCheckBoxSeleccionadosPlaneacionCompra.addItemListener(new CheckBoxItemListener(this,"SeleccionadosPlaneacionCompra"));
		
		if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxTiposAccionesFormularioPlaneacionCompra.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPlaneacionCompra"));
		}
		
		
		this.jComboBoxTiposRelacionesPlaneacionCompra.addActionListener (new ButtonActionListener(this,"TiposRelacionesPlaneacionCompra"));
			
		this.jComboBoxTiposAccionesPlaneacionCompra.addActionListener (new ButtonActionListener(this,"TiposAccionesPlaneacionCompra"));
					
		this.jComboBoxTiposSeleccionarPlaneacionCompra.addActionListener (new ButtonActionListener(this,"TiposSeleccionarPlaneacionCompra"));
			
		this.jTextFieldValorCampoGeneralPlaneacionCompra.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralPlaneacionCompra"));		
		
		
		if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonidPlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"idPlaneacionCompraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonid_empresaPlaneacionCompraUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPlaneacionCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonid_empresaPlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPlaneacionCompraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonid_sucursalPlaneacionCompraUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalPlaneacionCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonid_sucursalPlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalPlaneacionCompraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonid_ejercicioPlaneacionCompraUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioPlaneacionCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonid_ejercicioPlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioPlaneacionCompraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonid_periodoPlaneacionCompraUpdate.addActionListener(new ButtonActionListener(this,"id_periodoPlaneacionCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonid_periodoPlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoPlaneacionCompraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonid_empleadoPlaneacionCompraUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoPlaneacionCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonid_empleadoPlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoPlaneacionCompraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonid_usuarioPlaneacionCompraUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioPlaneacionCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonid_usuarioPlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioPlaneacionCompraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonid_formatoPlaneacionCompraUpdate.addActionListener(new ButtonActionListener(this,"id_formatoPlaneacionCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonid_formatoPlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_formatoPlaneacionCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonnumero_pre_impresoPlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impresoPlaneacionCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonfechaPlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"fechaPlaneacionCompraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonid_mes_inicioPlaneacionCompraUpdate.addActionListener(new ButtonActionListener(this,"id_mes_inicioPlaneacionCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonid_mes_inicioPlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_mes_inicioPlaneacionCompraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonid_mes_finPlaneacionCompraUpdate.addActionListener(new ButtonActionListener(this,"id_mes_finPlaneacionCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonid_mes_finPlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_mes_finPlaneacionCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonnumero_mesesPlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"numero_mesesPlaneacionCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonfecha_cortePlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"fecha_cortePlaneacionCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtoncodigo_pedidoPlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"codigo_pedidoPlaneacionCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtondescripcion1PlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"descripcion1PlaneacionCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtondescripcion2PlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"descripcion2PlaneacionCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtondescripcion3PlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"descripcion3PlaneacionCompraBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdEmpleadoPlaneacionCompra.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoPlaneacionCompra"));

			this.jButtonFK_IdFormatoPlaneacionCompra.addActionListener(new ButtonActionListener(this,"FK_IdFormatoPlaneacionCompra"));

			this.jButtonFK_IdMesFinPlaneacionCompra.addActionListener(new ButtonActionListener(this,"FK_IdMesFinPlaneacionCompra"));

			this.jButtonFK_IdMesInicioPlaneacionCompra.addActionListener(new ButtonActionListener(this,"FK_IdMesInicioPlaneacionCompra"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoPlaneacionCompra!=null) {
				this.jInternalFrameReporteDinamicoPlaneacionCompra.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPlaneacionCompra"));
				this.jInternalFrameReporteDinamicoPlaneacionCompra.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPlaneacionCompra"));
				this.jInternalFrameReporteDinamicoPlaneacionCompra.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPlaneacionCompra"));
			}
			
			//this.jButtonCerrarReporteDinamicoPlaneacionCompra.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPlaneacionCompra"));				
			//this.jButtonGenerarReporteDinamicoPlaneacionCompra.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPlaneacionCompra"));
			//this.jButtonGenerarExcelReporteDinamicoPlaneacionCompra.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPlaneacionCompra"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionPlaneacionCompra!=null) {
				this.jInternalFrameImportacionPlaneacionCompra.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPlaneacionCompra"));
				this.jInternalFrameImportacionPlaneacionCompra.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPlaneacionCompra"));
				this.jInternalFrameImportacionPlaneacionCompra.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPlaneacionCompra"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByPlaneacionCompra.addActionListener (new ButtonActionListener(this,"AbrirOrderByPlaneacionCompra"));
			
			this.jButtonAbrirOrderByToolBarPlaneacionCompra.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarPlaneacionCompra"));			
			
			if(this.jInternalFrameOrderByPlaneacionCompra!=null) {
				this.jInternalFrameOrderByPlaneacionCompra.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPlaneacionCompra"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPlaneacionCompra.jTabbedPaneRelacionesPlaneacionCompra.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPlaneacionCompra"));
		
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
            		closingInternalFramePlaneacionCompra();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormPlaneacionCompra.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormPlaneacionCompra = (JInternalFrameBase)event.getSource();
	            	
	            PlaneacionCompraBeanSwingJInternalFrame jInternalFrameParent=(PlaneacionCompraBeanSwingJInternalFrame)jInternalFrameDetalleFormPlaneacionCompra.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarPlaneacionCompraActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosPlaneacionCompra.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosPlaneacionCompraListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosPlaneacionCompra.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosPlaneacionCompra.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoPlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPlaneacionCompraActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarPlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPlaneacionCompraActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoPlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPlaneacionCompraActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoPlaneacionCompra";
		inputMap = this.jButtonNuevoPlaneacionCompra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoPlaneacionCompra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPlaneacionCompraActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesPlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPlaneacionCompraActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarPlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPlaneacionCompraActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesPlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPlaneacionCompraActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesPlaneacionCompra";
		inputMap = this.jButtonNuevoRelacionesPlaneacionCompra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesPlaneacionCompra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPlaneacionCompraActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarPlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarPlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarPlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarPlaneacionCompra";
		inputMap = this.jButtonModificarPlaneacionCompra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarPlaneacionCompra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarPlaneacionCompraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarPlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarPlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarPlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarPlaneacionCompra";
		inputMap = this.jButtonActualizarPlaneacionCompra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarPlaneacionCompra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarPlaneacionCompraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarPlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarPlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarPlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarPlaneacionCompra";
		inputMap = this.jButtonEliminarPlaneacionCompra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarPlaneacionCompra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarPlaneacionCompraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarPlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarPlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarPlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarPlaneacionCompra";
		inputMap = this.jButtonCancelarPlaneacionCompra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarPlaneacionCompra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarPlaneacionCompraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarPlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarPlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarPlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarPlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarPlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarPlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarPlaneacionCompra";
		inputMap = this.jButtonCerrarPlaneacionCompra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarPlaneacionCompra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarPlaneacionCompraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonGuardarCambiosPlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarPlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosPlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaPlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarPlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaPlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosPlaneacionCompra";
		inputMap = this.jInternalFrameDetalleFormPlaneacionCompra.jButtonGuardarCambiosPlaneacionCompra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonGuardarCambiosPlaneacionCompra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosPlaneacionCompraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionPlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarPlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionPlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresPlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarPlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresPlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesPlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarPlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesPlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosPlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarPlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosPlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosPlaneacionCompra.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosPlaneacionCompraItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesPlaneacionCompra.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesPlaneacionCompraActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarPlaneacionCompra.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarPlaneacionCompraActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralPlaneacionCompra.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralPlaneacionCompraActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonidPlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"idPlaneacionCompraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonid_empresaPlaneacionCompraUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPlaneacionCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonid_empresaPlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPlaneacionCompraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonid_sucursalPlaneacionCompraUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalPlaneacionCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonid_sucursalPlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalPlaneacionCompraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonid_ejercicioPlaneacionCompraUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioPlaneacionCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonid_ejercicioPlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioPlaneacionCompraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonid_periodoPlaneacionCompraUpdate.addActionListener(new ButtonActionListener(this,"id_periodoPlaneacionCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonid_periodoPlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoPlaneacionCompraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonid_empleadoPlaneacionCompraUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoPlaneacionCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonid_empleadoPlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoPlaneacionCompraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonid_usuarioPlaneacionCompraUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioPlaneacionCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonid_usuarioPlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioPlaneacionCompraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonid_formatoPlaneacionCompraUpdate.addActionListener(new ButtonActionListener(this,"id_formatoPlaneacionCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonid_formatoPlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_formatoPlaneacionCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonnumero_pre_impresoPlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impresoPlaneacionCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonfechaPlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"fechaPlaneacionCompraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonid_mes_inicioPlaneacionCompraUpdate.addActionListener(new ButtonActionListener(this,"id_mes_inicioPlaneacionCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonid_mes_inicioPlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_mes_inicioPlaneacionCompraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonid_mes_finPlaneacionCompraUpdate.addActionListener(new ButtonActionListener(this,"id_mes_finPlaneacionCompraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonid_mes_finPlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"id_mes_finPlaneacionCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonnumero_mesesPlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"numero_mesesPlaneacionCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtonfecha_cortePlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"fecha_cortePlaneacionCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtoncodigo_pedidoPlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"codigo_pedidoPlaneacionCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtondescripcion1PlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"descripcion1PlaneacionCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtondescripcion2PlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"descripcion2PlaneacionCompraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPlaneacionCompra.jButtondescripcion3PlaneacionCompraBusqueda.addActionListener(new ButtonActionListener(this,"descripcion3PlaneacionCompraBusqueda"));
		
		
		this.jButtonFK_IdEmpleadoPlaneacionCompra.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoPlaneacionCompra"));

		this.jButtonFK_IdFormatoPlaneacionCompra.addActionListener(new ButtonActionListener(this,"FK_IdFormatoPlaneacionCompra"));

		this.jButtonFK_IdMesFinPlaneacionCompra.addActionListener(new ButtonActionListener(this,"FK_IdMesFinPlaneacionCompra"));

		this.jButtonFK_IdMesInicioPlaneacionCompra.addActionListener(new ButtonActionListener(this,"FK_IdMesInicioPlaneacionCompra"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoPlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoPlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoPlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoPlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoPlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoPlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionPlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionPlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionPlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionPlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionPlaneacionCompra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionPlaneacionCompraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarPlaneacionCompraActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarPlaneacionCompra.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosPlaneacionCompra(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(PlaneacionCompra planeacioncompraAux:this.planeacioncompraLogic.getPlaneacionCompras()) {
					planeacioncompraAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PlaneacionCompra planeacioncompraAux:planeacioncompras) {
					planeacioncompraAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosPlaneacionCompraItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPlaneacionCompra(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PlaneacionCompra planeacioncompraAux:this.planeacioncompraLogic.getPlaneacionCompras()) {
						planeacioncompraAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PlaneacionCompra planeacioncompraAux:planeacioncompras) {
						planeacioncompraAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(PlaneacionCompra planeacioncompraAux:this.planeacioncompraLogic.getPlaneacionCompras()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PlaneacionCompra planeacioncompraAux:planeacioncompras) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaPlaneacionCompra(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPlaneacionCompra.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPlaneacionCompra.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPlaneacionCompra,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosPlaneacionCompraItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPlaneacionCompra(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosPlaneacionCompra.getSelectedRows();
			
			PlaneacionCompra planeacioncompraLocal=new PlaneacionCompra();
			
			//this.seleccionarTodosPlaneacionCompra(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					planeacioncompraLocal =(PlaneacionCompra) this.planeacioncompraLogic.getPlaneacionCompras().toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					planeacioncompraLocal =(PlaneacionCompra) this.planeacioncompras.toArray()[this.jTableDatosPlaneacionCompra.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				planeacioncompraLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PlaneacionCompra planeacioncompraAux:this.planeacioncompraLogic.getPlaneacionCompras()) {
						planeacioncompraAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PlaneacionCompra planeacioncompraAux:planeacioncompras) {
						planeacioncompraAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaPlaneacionCompra(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPlaneacionCompra.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPlaneacionCompra.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPlaneacionCompra,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualPlaneacionCompraItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarPlaneacionCompraParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralPlaneacionCompraActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingPlaneacionCompra(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralPlaneacionCompra.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PlaneacionCompra planeacioncompraAux:this.planeacioncompraLogic.getPlaneacionCompras()) {
				
						if(sTipoSeleccionar.equals(PlaneacionCompraConstantesFunciones.LABEL_NUMEROPREIMPRESO)) {
							existe=true;
							planeacioncompraAux.setnumero_pre_impreso(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PlaneacionCompraConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							planeacioncompraAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PlaneacionCompraConstantesFunciones.LABEL_NUMEROMESES)) {
							existe=true;
							planeacioncompraAux.setnumero_meses(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PlaneacionCompraConstantesFunciones.LABEL_FECHACORTE)) {
							existe=true;
							planeacioncompraAux.setfecha_corte(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PlaneacionCompraConstantesFunciones.LABEL_CODIGOPEDIDO)) {
							existe=true;
							planeacioncompraAux.setcodigo_pedido(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION1)) {
							existe=true;
							planeacioncompraAux.setdescripcion1(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION2)) {
							existe=true;
							planeacioncompraAux.setdescripcion2(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION3)) {
							existe=true;
							planeacioncompraAux.setdescripcion3(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PlaneacionCompra planeacioncompraAux:planeacioncompras) {
					
						if(sTipoSeleccionar.equals(PlaneacionCompraConstantesFunciones.LABEL_NUMEROPREIMPRESO)) {
							existe=true;
							planeacioncompraAux.setnumero_pre_impreso(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PlaneacionCompraConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							planeacioncompraAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PlaneacionCompraConstantesFunciones.LABEL_NUMEROMESES)) {
							existe=true;
							planeacioncompraAux.setnumero_meses(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PlaneacionCompraConstantesFunciones.LABEL_FECHACORTE)) {
							existe=true;
							planeacioncompraAux.setfecha_corte(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PlaneacionCompraConstantesFunciones.LABEL_CODIGOPEDIDO)) {
							existe=true;
							planeacioncompraAux.setcodigo_pedido(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION1)) {
							existe=true;
							planeacioncompraAux.setdescripcion1(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION2)) {
							existe=true;
							planeacioncompraAux.setdescripcion2(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION3)) {
							existe=true;
							planeacioncompraAux.setdescripcion3(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaPlaneacionCompra(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesPlaneacionCompraActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingPlaneacionCompra(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioPlaneacionCompra=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesPlaneacionCompra.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxTiposAccionesFormularioPlaneacionCompra.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReportePlaneacionCompra) {				
					conSplash=true;//false;										
					
					//this.startProcessPlaneacionCompra(conSplash);
				
					this.generarReportePlaneacionComprasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPlaneacionCompra.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxTiposAccionesFormularioPlaneacionCompra.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoPlaneacionComprasSeleccionados();
				//this.jComboBoxTiposAccionesPlaneacionCompra.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPlaneacionComprasSeleccionados(false);
				//this.jComboBoxTiposAccionesPlaneacionCompra.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPlaneacionComprasSeleccionados(true);
				//this.jComboBoxTiposAccionesPlaneacionCompra.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPlaneacionCompra();
				
				this.exportarPlaneacionComprasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPlaneacionCompra.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxTiposAccionesFormularioPlaneacionCompra.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionPlaneacionCompras();
				//this.importarPlaneacionCompras();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPlaneacionCompra.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxTiposAccionesFormularioPlaneacionCompra.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPlaneacionCompra();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelPlaneacionComprasSeleccionados();
				//this.jComboBoxTiposAccionesPlaneacionCompra.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Planeacion Compra", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessPlaneacionCompra();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoPlaneacionCompra)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyPlaneacionCompra(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Planeacion Compra",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPlaneacionCompra.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxTiposAccionesFormularioPlaneacionCompra.setSelectedIndex(0);					
				}	
			} 			
			else if(PlaneacionCompraBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReportePlaneacionCompra) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessPlaneacionCompra(conSplash);
					
						//this.actualizarParametrosGeneralPlaneacionCompra();
						
						this.generarReporteProcesoAccionPlaneacionComprasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesPlaneacionCompra.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxTiposAccionesFormularioPlaneacionCompra.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(PlaneacionCompraBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Planeacion CompraS SELECCIONADOS?", "MANTENIMIENTO DE Planeacion Compra", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessPlaneacionCompra();
				
						this.actualizarParametrosGeneralPlaneacionCompra();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.planeacioncompraReturnGeneral=planeacioncompraLogic.procesarAccionPlaneacionComprasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.planeacioncompraLogic.getPlaneacionCompras(),this.planeacioncompraParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarPlaneacionCompraReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPlaneacionCompra.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxTiposAccionesFormularioPlaneacionCompra.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralPlaneacionCompra();
					
					PlaneacionCompraBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarPlaneacionCompraReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPlaneacionCompra.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxTiposAccionesFormularioPlaneacionCompra.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessPlaneacionCompra(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesPlaneacionCompraActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessPlaneacionCompra();
			
			if(this.jInternalFrameDetalleFormPlaneacionCompra==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<PlaneacionCompra> planeacioncomprasSeleccionados=new ArrayList<PlaneacionCompra>();		
			PlaneacionCompra planeacioncompra=new PlaneacionCompra();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingPlaneacionCompra(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesPlaneacionCompra.getSelectedItem();
			
			
			
			
			planeacioncomprasSeleccionados=this.getPlaneacionComprasSeleccionados(true);
			//this.sTipoAccion;
			
			if(planeacioncomprasSeleccionados.size()==1) {
				for(PlaneacionCompra planeacioncompraAux:planeacioncomprasSeleccionados) {
					planeacioncompra=planeacioncompraAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Detalle Planeacion Compra")) {
					jButtonDetallePlaneacionCompraActionPerformed(null,rowIndex,true,false,planeacioncompra);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessPlaneacionCompra();
			
      		//this.finishProcessPlaneacionCompra(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarPlaneacionCompraReturnGeneral() throws Exception {
		if(this.planeacioncompraReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.planeacioncompraReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.planeacioncompraReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.planeacioncompraReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.planeacioncompraReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.planeacioncompraReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingPlaneacionCompra(false);
		}
		
		if(this.planeacioncompraReturnGeneral.getConRetornoLista() || this.planeacioncompraReturnGeneral.getConRetornoObjeto()) {
			if(this.planeacioncompraReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.planeacioncompraLogic.setPlaneacionCompras(this.planeacioncompraReturnGeneral.getPlaneacionCompras());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.planeacioncompraReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.planeacioncompraLogic.setPlaneacionCompra(this.planeacioncompraReturnGeneral.getPlaneacionCompra());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingPlaneacionCompra(false);
		}
	}
	
	public void actualizarParametrosGeneralPlaneacionCompra() throws Exception {
		
		
	}
	
	public ArrayList<PlaneacionCompra> getPlaneacionComprasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<PlaneacionCompra> planeacioncomprasSeleccionados=new ArrayList<PlaneacionCompra>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioPlaneacionCompra) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(PlaneacionCompra planeacioncompraAux:planeacioncompraLogic.getPlaneacionCompras()) {
					if(planeacioncompraAux.getIsSelected()) {
						planeacioncomprasSeleccionados.add(planeacioncompraAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PlaneacionCompra planeacioncompraAux:this.planeacioncompras) {
					if(planeacioncompraAux.getIsSelected()) {
						planeacioncomprasSeleccionados.add(planeacioncompraAux);				
					}
				}
			}
			
			if(planeacioncomprasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						planeacioncomprasSeleccionados.addAll(this.planeacioncompraLogic.getPlaneacionCompras());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						planeacioncomprasSeleccionados.addAll(this.planeacioncompras);				
					}
				}
			}
		} else {
			planeacioncomprasSeleccionados.add(this.planeacioncompra);
		}
		
		return planeacioncomprasSeleccionados;
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
	
	public void generarReportePlaneacionComprasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalPlaneacionComprasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoPlaneacionComprasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPlaneacionComprasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPlaneacionComprasSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesPlaneacionComprasSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Planeacion Compra",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesPlaneacionComprasSeleccionados() throws Exception {
		ArrayList<PlaneacionCompra> planeacioncomprasSeleccionados=new ArrayList<PlaneacionCompra>();		
		
		planeacioncomprasSeleccionados=this.getPlaneacionComprasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReportePlaneacionCompras("Todos",planeacioncomprasSeleccionados);
		
	}	
	
	public void generarReporteNormalPlaneacionComprasSeleccionados() throws Exception {
		ArrayList<PlaneacionCompra> planeacioncomprasSeleccionados=new ArrayList<PlaneacionCompra>();		
		
		planeacioncomprasSeleccionados=this.getPlaneacionComprasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReportePlaneacionCompras("Todos",planeacioncomprasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionPlaneacionComprasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<PlaneacionCompra> planeacioncomprasSeleccionados=new ArrayList<PlaneacionCompra>();
		
		planeacioncomprasSeleccionados=this.getPlaneacionComprasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReportePlaneacionCompras("Todos",planeacioncomprasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoPlaneacionComprasSeleccionados() throws Exception {
		ArrayList<PlaneacionCompra> planeacioncomprasSeleccionados=new ArrayList<PlaneacionCompra>();		
		
		
		this.abrirInicializarFrameReporteDinamicoPlaneacionCompra();
		
		
		planeacioncomprasSeleccionados=this.getPlaneacionComprasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoPlaneacionCompra();
		
		
		//this.generarReportePlaneacionCompras("Todos",planeacioncomprasSeleccionados ,planeacioncompraImplementable,planeacioncompraImplementableHome);
	}
	
	public void mostrarImportacionPlaneacionCompras() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionPlaneacionCompra();
		
		this.abrirFrameImportacionPlaneacionCompra();		
		
			
		//this.generarReportePlaneacionCompras("Todos",planeacioncomprasSeleccionados ,planeacioncompraImplementable,planeacioncompraImplementableHome);
	}
	
	public void importarPlaneacionCompras() throws Exception {		
	
	}
	
	public void exportarPlaneacionComprasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelPlaneacionComprasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoPlaneacionComprasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlPlaneacionComprasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Planeacion Compra",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoPlaneacionComprasSeleccionados() throws Exception {
		ArrayList<PlaneacionCompra> planeacioncomprasSeleccionados=new ArrayList<PlaneacionCompra>();		
		
		planeacioncomprasSeleccionados=this.getPlaneacionComprasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"planeacioncompra."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarPlaneacionCompra(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(PlaneacionCompra planeacioncompraAux:planeacioncomprasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarPlaneacionCompra(planeacioncompraAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//planeacioncompraAux.setsDetalleGeneralEntityReporte(planeacioncompraAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.planeacioncompraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Planeacion Compra",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarPlaneacionCompra(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=PlaneacionCompraConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PlaneacionCompraConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PlaneacionCompraConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PlaneacionCompraConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PlaneacionCompraConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PlaneacionCompraConstantesFunciones.LABEL_IDPERIODO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PlaneacionCompraConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PlaneacionCompraConstantesFunciones.LABEL_IDUSUARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PlaneacionCompraConstantesFunciones.LABEL_IDFORMATO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PlaneacionCompraConstantesFunciones.LABEL_NUMEROPREIMPRESO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PlaneacionCompraConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PlaneacionCompraConstantesFunciones.LABEL_IDMESINICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PlaneacionCompraConstantesFunciones.LABEL_IDMESFIN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PlaneacionCompraConstantesFunciones.LABEL_NUMEROMESES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PlaneacionCompraConstantesFunciones.LABEL_FECHACORTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PlaneacionCompraConstantesFunciones.LABEL_CODIGOPEDIDO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION1;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION2;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION3;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarPlaneacionCompra(PlaneacionCompra planeacioncompra,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=planeacioncompra.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=planeacioncompra.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=planeacioncompra.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=planeacioncompra.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=planeacioncompra.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=planeacioncompra.getperiodo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=planeacioncompra.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=planeacioncompra.getusuario_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=planeacioncompra.getformato_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=planeacioncompra.getnumero_pre_impreso();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=planeacioncompra.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=planeacioncompra.getmesinicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=planeacioncompra.getmesfin_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=planeacioncompra.getnumero_meses().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=planeacioncompra.getfecha_corte().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=planeacioncompra.getcodigo_pedido();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=planeacioncompra.getdescripcion1();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=planeacioncompra.getdescripcion2();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=planeacioncompra.getdescripcion3();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelPlaneacionComprasSeleccionados() throws Exception {
		ArrayList<PlaneacionCompra> planeacioncomprasSeleccionados=new ArrayList<PlaneacionCompra>();		
		
		planeacioncomprasSeleccionados=this.getPlaneacionComprasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"planeacioncompra.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("PlaneacionCompras");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelPlaneacionCompra(row);				
				iRow++;
			}				
			
			for(PlaneacionCompra planeacioncompraAux:planeacioncomprasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelPlaneacionCompra(planeacioncompraAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.planeacioncompraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Planeacion Compra",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlPlaneacionComprasSeleccionados() throws Exception {
		ArrayList<PlaneacionCompra> planeacioncomprasSeleccionados=new ArrayList<PlaneacionCompra>();		
		
		planeacioncomprasSeleccionados=this.getPlaneacionComprasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"planeacioncompra.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("planeacioncompras");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("planeacioncompra");
			//elementRoot.appendChild(element);
		
			for(PlaneacionCompra planeacioncompraAux:planeacioncomprasSeleccionados) {
				element = document.createElement("planeacioncompra");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlPlaneacionCompra(planeacioncompraAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.planeacioncompraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Planeacion Compra",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelPlaneacionCompra(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(PlaneacionCompraConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(PlaneacionCompraConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(PlaneacionCompraConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(PlaneacionCompraConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(PlaneacionCompraConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(PlaneacionCompraConstantesFunciones.LABEL_IDPERIODO);
		cell = row.createCell(iColumn++);cell.setCellValue(PlaneacionCompraConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(PlaneacionCompraConstantesFunciones.LABEL_IDUSUARIO);
		cell = row.createCell(iColumn++);cell.setCellValue(PlaneacionCompraConstantesFunciones.LABEL_IDFORMATO);
		cell = row.createCell(iColumn++);cell.setCellValue(PlaneacionCompraConstantesFunciones.LABEL_NUMEROPREIMPRESO);
		cell = row.createCell(iColumn++);cell.setCellValue(PlaneacionCompraConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(PlaneacionCompraConstantesFunciones.LABEL_IDMESINICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(PlaneacionCompraConstantesFunciones.LABEL_IDMESFIN);
		cell = row.createCell(iColumn++);cell.setCellValue(PlaneacionCompraConstantesFunciones.LABEL_NUMEROMESES);
		cell = row.createCell(iColumn++);cell.setCellValue(PlaneacionCompraConstantesFunciones.LABEL_FECHACORTE);
		cell = row.createCell(iColumn++);cell.setCellValue(PlaneacionCompraConstantesFunciones.LABEL_CODIGOPEDIDO);
		cell = row.createCell(iColumn++);cell.setCellValue(PlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION1);
		cell = row.createCell(iColumn++);cell.setCellValue(PlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION2);
		cell = row.createCell(iColumn++);cell.setCellValue(PlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION3);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelPlaneacionCompra(PlaneacionCompra planeacioncompra,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(planeacioncompra.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(planeacioncompra.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(planeacioncompra.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(planeacioncompra.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(planeacioncompra.getperiodo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(planeacioncompra.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(planeacioncompra.getusuario_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(planeacioncompra.getformato_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(planeacioncompra.getnumero_pre_impreso());
		cell = row.createCell(iColumn++);cell.setCellValue(planeacioncompra.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(planeacioncompra.getmesinicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(planeacioncompra.getmesfin_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(planeacioncompra.getnumero_meses());
		cell = row.createCell(iColumn++);cell.setCellValue(planeacioncompra.getfecha_corte());
		cell = row.createCell(iColumn++);cell.setCellValue(planeacioncompra.getcodigo_pedido());
		cell = row.createCell(iColumn++);cell.setCellValue(planeacioncompra.getdescripcion1());
		cell = row.createCell(iColumn++);cell.setCellValue(planeacioncompra.getdescripcion2());
		cell = row.createCell(iColumn++);cell.setCellValue(planeacioncompra.getdescripcion3());				
	}
	
	public void setFilaDatosExportarXmlPlaneacionCompra(PlaneacionCompra planeacioncompra,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(PlaneacionCompraConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(planeacioncompra.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(PlaneacionCompraConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(planeacioncompra.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(PlaneacionCompraConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(planeacioncompra.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(PlaneacionCompraConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(planeacioncompra.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementejercicio_descripcion = document.createElement(PlaneacionCompraConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(planeacioncompra.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementperiodo_descripcion = document.createElement(PlaneacionCompraConstantesFunciones.IDPERIODO);
		elementperiodo_descripcion.appendChild(document.createTextNode(planeacioncompra.getperiodo_descripcion()));
		element.appendChild(elementperiodo_descripcion);

		Element elementempleado_descripcion = document.createElement(PlaneacionCompraConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(planeacioncompra.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elementusuario_descripcion = document.createElement(PlaneacionCompraConstantesFunciones.IDUSUARIO);
		elementusuario_descripcion.appendChild(document.createTextNode(planeacioncompra.getusuario_descripcion()));
		element.appendChild(elementusuario_descripcion);

		Element elementformato_descripcion = document.createElement(PlaneacionCompraConstantesFunciones.IDFORMATO);
		elementformato_descripcion.appendChild(document.createTextNode(planeacioncompra.getformato_descripcion()));
		element.appendChild(elementformato_descripcion);

		Element elementnumero_pre_impreso = document.createElement(PlaneacionCompraConstantesFunciones.NUMEROPREIMPRESO);
		elementnumero_pre_impreso.appendChild(document.createTextNode(planeacioncompra.getnumero_pre_impreso().trim()));
		element.appendChild(elementnumero_pre_impreso);

		Element elementfecha = document.createElement(PlaneacionCompraConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(planeacioncompra.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementmesinicio_descripcion = document.createElement(PlaneacionCompraConstantesFunciones.IDMESINICIO);
		elementmesinicio_descripcion.appendChild(document.createTextNode(planeacioncompra.getmesinicio_descripcion()));
		element.appendChild(elementmesinicio_descripcion);

		Element elementmesfin_descripcion = document.createElement(PlaneacionCompraConstantesFunciones.IDMESFIN);
		elementmesfin_descripcion.appendChild(document.createTextNode(planeacioncompra.getmesfin_descripcion()));
		element.appendChild(elementmesfin_descripcion);

		Element elementnumero_meses = document.createElement(PlaneacionCompraConstantesFunciones.NUMEROMESES);
		elementnumero_meses.appendChild(document.createTextNode(planeacioncompra.getnumero_meses().toString().trim()));
		element.appendChild(elementnumero_meses);

		Element elementfecha_corte = document.createElement(PlaneacionCompraConstantesFunciones.FECHACORTE);
		elementfecha_corte.appendChild(document.createTextNode(planeacioncompra.getfecha_corte().toString().trim()));
		element.appendChild(elementfecha_corte);

		Element elementcodigo_pedido = document.createElement(PlaneacionCompraConstantesFunciones.CODIGOPEDIDO);
		elementcodigo_pedido.appendChild(document.createTextNode(planeacioncompra.getcodigo_pedido().trim()));
		element.appendChild(elementcodigo_pedido);

		Element elementdescripcion1 = document.createElement(PlaneacionCompraConstantesFunciones.DESCRIPCION1);
		elementdescripcion1.appendChild(document.createTextNode(planeacioncompra.getdescripcion1().trim()));
		element.appendChild(elementdescripcion1);

		Element elementdescripcion2 = document.createElement(PlaneacionCompraConstantesFunciones.DESCRIPCION2);
		elementdescripcion2.appendChild(document.createTextNode(planeacioncompra.getdescripcion2().trim()));
		element.appendChild(elementdescripcion2);

		Element elementdescripcion3 = document.createElement(PlaneacionCompraConstantesFunciones.DESCRIPCION3);
		elementdescripcion3.appendChild(document.createTextNode(planeacioncompra.getdescripcion3().trim()));
		element.appendChild(elementdescripcion3);
	}
	
	public void generarReporteGroupGenericoPlaneacionComprasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<PlaneacionCompra> planeacioncomprasSeleccionados=new ArrayList<PlaneacionCompra>();
		
		planeacioncomprasSeleccionados=this.getPlaneacionComprasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoPlaneacionCompra(planeacioncomprasSeleccionados);
		
		this.generarReportePlaneacionCompras("Todos",planeacioncomprasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoPlaneacionCompra(ArrayList<PlaneacionCompra> planeacioncomprasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(PlaneacionCompra planeacioncompraAux:planeacioncomprasSeleccionados) {
				planeacioncompraAux.setsDetalleGeneralEntityReporte(planeacioncompraAux.toString());
			
				if(sTipoSeleccionar.equals(PlaneacionCompraConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					planeacioncompraAux.setsDescripcionGeneralEntityReporte1(planeacioncompraAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PlaneacionCompraConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					planeacioncompraAux.setsDescripcionGeneralEntityReporte1(planeacioncompraAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PlaneacionCompraConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					planeacioncompraAux.setsDescripcionGeneralEntityReporte1(planeacioncompraAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PlaneacionCompraConstantesFunciones.LABEL_IDPERIODO)) {
					existe=true;
					planeacioncompraAux.setsDescripcionGeneralEntityReporte1(planeacioncompraAux.getperiodo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PlaneacionCompraConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					planeacioncompraAux.setsDescripcionGeneralEntityReporte1(planeacioncompraAux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PlaneacionCompraConstantesFunciones.LABEL_IDUSUARIO)) {
					existe=true;
					planeacioncompraAux.setsDescripcionGeneralEntityReporte1(planeacioncompraAux.getusuario_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PlaneacionCompraConstantesFunciones.LABEL_IDFORMATO)) {
					existe=true;
					planeacioncompraAux.setsDescripcionGeneralEntityReporte1(planeacioncompraAux.getformato_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PlaneacionCompraConstantesFunciones.LABEL_NUMEROPREIMPRESO)) {
					existe=true;
					planeacioncompraAux.setsDescripcionGeneralEntityReporte1(planeacioncompraAux.getnumero_pre_impreso());
				}
				 else if(sTipoSeleccionar.equals(PlaneacionCompraConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					planeacioncompraAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(planeacioncompraAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(PlaneacionCompraConstantesFunciones.LABEL_IDMESINICIO)) {
					existe=true;
					planeacioncompraAux.setsDescripcionGeneralEntityReporte1(planeacioncompraAux.getmesinicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PlaneacionCompraConstantesFunciones.LABEL_IDMESFIN)) {
					existe=true;
					planeacioncompraAux.setsDescripcionGeneralEntityReporte1(planeacioncompraAux.getmesfin_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PlaneacionCompraConstantesFunciones.LABEL_NUMEROMESES)) {
					existe=true;
					planeacioncompraAux.setsDescripcionGeneralEntityReporte1(planeacioncompraAux.getnumero_meses().toString());
				}
				 else if(sTipoSeleccionar.equals(PlaneacionCompraConstantesFunciones.LABEL_FECHACORTE)) {
					existe=true;
					planeacioncompraAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(planeacioncompraAux.getfecha_corte()));
				}
				 else if(sTipoSeleccionar.equals(PlaneacionCompraConstantesFunciones.LABEL_CODIGOPEDIDO)) {
					existe=true;
					planeacioncompraAux.setsDescripcionGeneralEntityReporte1(planeacioncompraAux.getcodigo_pedido());
				}
				 else if(sTipoSeleccionar.equals(PlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION1)) {
					existe=true;
					planeacioncompraAux.setsDescripcionGeneralEntityReporte1(planeacioncompraAux.getdescripcion1());
				}
				 else if(sTipoSeleccionar.equals(PlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION2)) {
					existe=true;
					planeacioncompraAux.setsDescripcionGeneralEntityReporte1(planeacioncompraAux.getdescripcion2());
				}
				 else if(sTipoSeleccionar.equals(PlaneacionCompraConstantesFunciones.LABEL_DESCRIPCION3)) {
					existe=true;
					planeacioncompraAux.setsDescripcionGeneralEntityReporte1(planeacioncompraAux.getdescripcion3());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PlaneacionCompraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesPlaneacionCompra(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoPlaneacionCompra=true;
				this.isVisibilidadCeldaNuevoRelacionesPlaneacionCompra=true;
				this.isVisibilidadCeldaGuardarCambiosPlaneacionCompra=true;
			}
			
			this.isVisibilidadCeldaModificarPlaneacionCompra=false;
			this.isVisibilidadCeldaActualizarPlaneacionCompra=false;
			this.isVisibilidadCeldaEliminarPlaneacionCompra=false;
			this.isVisibilidadCeldaCancelarPlaneacionCompra=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPlaneacionCompra=true;
				} else {
					this.isVisibilidadCeldaGuardarPlaneacionCompra=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoPlaneacionCompra=false;
			this.isVisibilidadCeldaNuevoRelacionesPlaneacionCompra=false;
			this.isVisibilidadCeldaGuardarCambiosPlaneacionCompra=false;
			this.isVisibilidadCeldaModificarPlaneacionCompra=false;
			this.isVisibilidadCeldaActualizarPlaneacionCompra=true;
			this.isVisibilidadCeldaEliminarPlaneacionCompra=false;
			this.isVisibilidadCeldaCancelarPlaneacionCompra=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPlaneacionCompra=true;
				} else {
					this.isVisibilidadCeldaGuardarPlaneacionCompra=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoPlaneacionCompra=false;
			this.isVisibilidadCeldaNuevoRelacionesPlaneacionCompra=false;
			this.isVisibilidadCeldaGuardarCambiosPlaneacionCompra=false;
			this.isVisibilidadCeldaModificarPlaneacionCompra=false;
			this.isVisibilidadCeldaActualizarPlaneacionCompra=true;
			this.isVisibilidadCeldaEliminarPlaneacionCompra=true;
			this.isVisibilidadCeldaCancelarPlaneacionCompra=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPlaneacionCompra=true;
				} else {
					this.isVisibilidadCeldaGuardarPlaneacionCompra=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoPlaneacionCompra=false;
			this.isVisibilidadCeldaNuevoRelacionesPlaneacionCompra=false;
			this.isVisibilidadCeldaGuardarCambiosPlaneacionCompra=false;
			this.isVisibilidadCeldaModificarPlaneacionCompra=false;
			this.isVisibilidadCeldaActualizarPlaneacionCompra=true;
			this.isVisibilidadCeldaEliminarPlaneacionCompra=false;
			this.isVisibilidadCeldaCancelarPlaneacionCompra=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPlaneacionCompra=false;
				} else {
					this.isVisibilidadCeldaGuardarPlaneacionCompra=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoPlaneacionCompra=true;
			this.isVisibilidadCeldaNuevoRelacionesPlaneacionCompra=true;
			this.isVisibilidadCeldaGuardarCambiosPlaneacionCompra=true;
			this.isVisibilidadCeldaModificarPlaneacionCompra=false;
			this.isVisibilidadCeldaActualizarPlaneacionCompra=false;
			this.isVisibilidadCeldaEliminarPlaneacionCompra=false;
			this.isVisibilidadCeldaCancelarPlaneacionCompra=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPlaneacionCompra=true;
				} else {
					this.isVisibilidadCeldaGuardarPlaneacionCompra=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoPlaneacionCompra=false;
			this.isVisibilidadCeldaNuevoRelacionesPlaneacionCompra=false;
			this.isVisibilidadCeldaGuardarCambiosPlaneacionCompra=false;
			this.isVisibilidadCeldaActualizarPlaneacionCompra=false;
			this.isVisibilidadCeldaEliminarPlaneacionCompra=false;
			this.isVisibilidadCeldaCancelarPlaneacionCompra=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPlaneacionCompra=false;
				} else {
					this.isVisibilidadCeldaGuardarPlaneacionCompra=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoPlaneacionCompra=false;
			this.isVisibilidadCeldaNuevoRelacionesPlaneacionCompra=false;
			this.isVisibilidadCeldaGuardarCambiosPlaneacionCompra=false;
			this.isVisibilidadCeldaModificarPlaneacionCompra=true;
			this.isVisibilidadCeldaActualizarPlaneacionCompra=false;
			this.isVisibilidadCeldaEliminarPlaneacionCompra=false;
			this.isVisibilidadCeldaCancelarPlaneacionCompra=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPlaneacionCompra=false;
				} else {
					this.isVisibilidadCeldaGuardarPlaneacionCompra=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(PlaneacionCompraJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoPlaneacionCompra=true;
			this.isVisibilidadCeldaNuevoRelacionesPlaneacionCompra=true;
			this.isVisibilidadCeldaGuardarCambiosPlaneacionCompra=true;
		} else {
			this.actualizarEstadoPanelsPlaneacionCompra(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarPlaneacionCompra=false;
			//this.isVisibilidadCeldaVerFormPlaneacionCompra=false;
			this.isVisibilidadCeldaDuplicarPlaneacionCompra=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!planeacioncompraSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesPlaneacionCompra=false;
		} else {
			this.isVisibilidadCeldaNuevoPlaneacionCompra=false;
			this.isVisibilidadCeldaGuardarCambiosPlaneacionCompra=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(planeacioncompraSessionBean.getEsGuardarRelacionado()) {
			if(!planeacioncompraSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesPlaneacionCompra=false;												
			}
			
			this.jButtonCerrarPlaneacionCompra.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesPlaneacionCompra=false;
		}
		
		if(!this.permiteMantenimiento(this.planeacioncompra)) {
			this.isVisibilidadCeldaActualizarPlaneacionCompra=false;
			this.isVisibilidadCeldaEliminarPlaneacionCompra=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesPlaneacionCompra() {
		this.isVisibilidadCeldaNuevoPlaneacionCompra=false;
		this.isVisibilidadCeldaGuardarCambiosPlaneacionCompra=false;
	}
	
	public void actualizarEstadoPanelsPlaneacionCompra(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionPlaneacionCompra!=null) {
				this.jScrollPanelDatosEdicionPlaneacionCompra.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPlaneacionCompra!=null) {
				this.jTabbedPaneBusquedasPlaneacionCompra.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPlaneacionCompra!=null) {
				this.jScrollPanelDatosPlaneacionCompra.setVisible(true);
			}
			
			if(this.jPanelPaginacionPlaneacionCompra!=null) {
				this.jPanelPaginacionPlaneacionCompra.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPlaneacionCompra!=null) {
				this.jPanelParametrosReportesPlaneacionCompra.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionPlaneacionCompra!=null) {
				this.jScrollPanelDatosEdicionPlaneacionCompra.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPlaneacionCompra!=null) {
				this.jTabbedPaneBusquedasPlaneacionCompra.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosPlaneacionCompra!=null) {
				this.jScrollPanelDatosPlaneacionCompra.setVisible(false);
			}
			
			if(this.jPanelPaginacionPlaneacionCompra!=null) {
				this.jPanelPaginacionPlaneacionCompra.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPlaneacionCompra!=null) {
				this.jPanelParametrosReportesPlaneacionCompra.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionPlaneacionCompra!=null) {
				this.jScrollPanelDatosEdicionPlaneacionCompra.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPlaneacionCompra!=null) {
				this.jTabbedPaneBusquedasPlaneacionCompra.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPlaneacionCompra!=null) {
				this.jScrollPanelDatosPlaneacionCompra.setVisible(false);
			}
			
			if(this.jPanelPaginacionPlaneacionCompra!=null) {
				this.jPanelPaginacionPlaneacionCompra.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPlaneacionCompra!=null) {
				this.jPanelParametrosReportesPlaneacionCompra.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionPlaneacionCompra!=null) {
				this.jScrollPanelDatosEdicionPlaneacionCompra.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPlaneacionCompra!=null) {
				this.jTabbedPaneBusquedasPlaneacionCompra.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPlaneacionCompra!=null) {
				this.jScrollPanelDatosPlaneacionCompra.setVisible(false);
			}
			
			if(this.jPanelPaginacionPlaneacionCompra!=null) {
				this.jPanelPaginacionPlaneacionCompra.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPlaneacionCompra!=null) {
				this.jPanelParametrosReportesPlaneacionCompra.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionPlaneacionCompra!=null) {
				this.jScrollPanelDatosEdicionPlaneacionCompra.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPlaneacionCompra!=null) {
				this.jTabbedPaneBusquedasPlaneacionCompra.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPlaneacionCompra!=null) {
				this.jScrollPanelDatosPlaneacionCompra.setVisible(true);
			}
			
			if(this.jPanelPaginacionPlaneacionCompra!=null) {
				this.jPanelPaginacionPlaneacionCompra.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPlaneacionCompra!=null) {
				this.jPanelParametrosReportesPlaneacionCompra.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionPlaneacionCompra!=null) {
				this.jScrollPanelDatosEdicionPlaneacionCompra.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPlaneacionCompra!=null) {
				this.jTabbedPaneBusquedasPlaneacionCompra.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPlaneacionCompra!=null) {
				this.jScrollPanelDatosPlaneacionCompra.setVisible(true);
			}
			
			if(this.jPanelPaginacionPlaneacionCompra!=null) {
				this.jPanelPaginacionPlaneacionCompra.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPlaneacionCompra!=null) {
				this.jPanelParametrosReportesPlaneacionCompra.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionPlaneacionCompra!=null) {
				this.jScrollPanelDatosEdicionPlaneacionCompra.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPlaneacionCompra!=null) {
				this.jTabbedPaneBusquedasPlaneacionCompra.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPlaneacionCompra!=null) {
				this.jScrollPanelDatosPlaneacionCompra.setVisible(true);
			}
			
			if(this.jPanelPaginacionPlaneacionCompra!=null) {
				this.jPanelPaginacionPlaneacionCompra.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPlaneacionCompra!=null) {
				this.jPanelParametrosReportesPlaneacionCompra.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.planeacioncompraSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasPlaneacionCompra!=null) {
					this.jTabbedPaneBusquedasPlaneacionCompra.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesPlaneacionCompra!=null) {
				this.jPanelParametrosReportesPlaneacionCompra.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.planeacioncompraSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPlaneacionCompra!=null) {
				this.jTabbedPaneBusquedasPlaneacionCompra.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesPlaneacionCompra!=null) {
				this.jPanelParametrosReportesPlaneacionCompra.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdEmpleado=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasPlaneacionCompra.remove(jPanelFK_IdEmpleadoPlaneacionCompra);}

			this.isVisibilidadFK_IdFormato=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdFormato) {this.jTabbedPaneBusquedasPlaneacionCompra.remove(jPanelFK_IdFormatoPlaneacionCompra);}

			this.isVisibilidadFK_IdMesFin=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdMesFin) {this.jTabbedPaneBusquedasPlaneacionCompra.remove(jPanelFK_IdMesFinPlaneacionCompra);}

			this.isVisibilidadFK_IdMesInicio=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdMesInicio) {this.jTabbedPaneBusquedasPlaneacionCompra.remove(jPanelFK_IdMesInicioPlaneacionCompra);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdEmpleado=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasPlaneacionCompra.remove(jPanelFK_IdEmpleadoPlaneacionCompra);}

			this.isVisibilidadFK_IdFormato=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdFormato) {this.jTabbedPaneBusquedasPlaneacionCompra.remove(jPanelFK_IdFormatoPlaneacionCompra);}

			this.isVisibilidadFK_IdMesFin=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdMesFin) {this.jTabbedPaneBusquedasPlaneacionCompra.remove(jPanelFK_IdMesFinPlaneacionCompra);}

			this.isVisibilidadFK_IdMesInicio=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdMesInicio) {this.jTabbedPaneBusquedasPlaneacionCompra.remove(jPanelFK_IdMesInicioPlaneacionCompra);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadFK_IdEmpleado=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasPlaneacionCompra.remove(jPanelFK_IdEmpleadoPlaneacionCompra);}

			this.isVisibilidadFK_IdFormato=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdFormato) {this.jTabbedPaneBusquedasPlaneacionCompra.remove(jPanelFK_IdFormatoPlaneacionCompra);}

			this.isVisibilidadFK_IdMesFin=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdMesFin) {this.jTabbedPaneBusquedasPlaneacionCompra.remove(jPanelFK_IdMesFinPlaneacionCompra);}

			this.isVisibilidadFK_IdMesInicio=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdMesInicio) {this.jTabbedPaneBusquedasPlaneacionCompra.remove(jPanelFK_IdMesInicioPlaneacionCompra);}
		}
		
	}

	public void setVisibilidadBusquedasParaPeriodo(Boolean isParaPeriodo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPeriodoNegation=!isParaPeriodo;

			this.isVisibilidadFK_IdEmpleado=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasPlaneacionCompra.remove(jPanelFK_IdEmpleadoPlaneacionCompra);}

			this.isVisibilidadFK_IdFormato=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdFormato) {this.jTabbedPaneBusquedasPlaneacionCompra.remove(jPanelFK_IdFormatoPlaneacionCompra);}

			this.isVisibilidadFK_IdMesFin=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdMesFin) {this.jTabbedPaneBusquedasPlaneacionCompra.remove(jPanelFK_IdMesFinPlaneacionCompra);}

			this.isVisibilidadFK_IdMesInicio=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdMesInicio) {this.jTabbedPaneBusquedasPlaneacionCompra.remove(jPanelFK_IdMesInicioPlaneacionCompra);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadFK_IdEmpleado=isParaEmpleado;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasPlaneacionCompra.remove(jPanelFK_IdEmpleadoPlaneacionCompra);}

			this.isVisibilidadFK_IdFormato=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdFormato) {this.jTabbedPaneBusquedasPlaneacionCompra.remove(jPanelFK_IdFormatoPlaneacionCompra);}

			this.isVisibilidadFK_IdMesFin=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdMesFin) {this.jTabbedPaneBusquedasPlaneacionCompra.remove(jPanelFK_IdMesFinPlaneacionCompra);}

			this.isVisibilidadFK_IdMesInicio=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdMesInicio) {this.jTabbedPaneBusquedasPlaneacionCompra.remove(jPanelFK_IdMesInicioPlaneacionCompra);}
		}
		
	}

	public void setVisibilidadBusquedasParaUsuario(Boolean isParaUsuario){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUsuarioNegation=!isParaUsuario;

			this.isVisibilidadFK_IdEmpleado=isParaUsuarioNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasPlaneacionCompra.remove(jPanelFK_IdEmpleadoPlaneacionCompra);}

			this.isVisibilidadFK_IdFormato=isParaUsuarioNegation;
			if(!this.isVisibilidadFK_IdFormato) {this.jTabbedPaneBusquedasPlaneacionCompra.remove(jPanelFK_IdFormatoPlaneacionCompra);}

			this.isVisibilidadFK_IdMesFin=isParaUsuarioNegation;
			if(!this.isVisibilidadFK_IdMesFin) {this.jTabbedPaneBusquedasPlaneacionCompra.remove(jPanelFK_IdMesFinPlaneacionCompra);}

			this.isVisibilidadFK_IdMesInicio=isParaUsuarioNegation;
			if(!this.isVisibilidadFK_IdMesInicio) {this.jTabbedPaneBusquedasPlaneacionCompra.remove(jPanelFK_IdMesInicioPlaneacionCompra);}
		}
		
	}

	public void setVisibilidadBusquedasParaFormato(Boolean isParaFormato){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaFormatoNegation=!isParaFormato;

			this.isVisibilidadFK_IdEmpleado=isParaFormatoNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasPlaneacionCompra.remove(jPanelFK_IdEmpleadoPlaneacionCompra);}

			this.isVisibilidadFK_IdFormato=isParaFormato;
			if(!this.isVisibilidadFK_IdFormato) {this.jTabbedPaneBusquedasPlaneacionCompra.remove(jPanelFK_IdFormatoPlaneacionCompra);}

			this.isVisibilidadFK_IdMesFin=isParaFormatoNegation;
			if(!this.isVisibilidadFK_IdMesFin) {this.jTabbedPaneBusquedasPlaneacionCompra.remove(jPanelFK_IdMesFinPlaneacionCompra);}

			this.isVisibilidadFK_IdMesInicio=isParaFormatoNegation;
			if(!this.isVisibilidadFK_IdMesInicio) {this.jTabbedPaneBusquedasPlaneacionCompra.remove(jPanelFK_IdMesInicioPlaneacionCompra);}
		}
		
	}

	public void setVisibilidadBusquedasParaMesInicio(Boolean isParaMesInicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMesInicioNegation=!isParaMesInicio;

			this.isVisibilidadFK_IdEmpleado=isParaMesInicioNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasPlaneacionCompra.remove(jPanelFK_IdEmpleadoPlaneacionCompra);}

			this.isVisibilidadFK_IdFormato=isParaMesInicioNegation;
			if(!this.isVisibilidadFK_IdFormato) {this.jTabbedPaneBusquedasPlaneacionCompra.remove(jPanelFK_IdFormatoPlaneacionCompra);}

			this.isVisibilidadFK_IdMesFin=isParaMesInicioNegation;
			if(!this.isVisibilidadFK_IdMesFin) {this.jTabbedPaneBusquedasPlaneacionCompra.remove(jPanelFK_IdMesFinPlaneacionCompra);}

			this.isVisibilidadFK_IdMesInicio=isParaMesInicio;
			if(!this.isVisibilidadFK_IdMesInicio) {this.jTabbedPaneBusquedasPlaneacionCompra.remove(jPanelFK_IdMesInicioPlaneacionCompra);}
		}
		
	}

	public void setVisibilidadBusquedasParaMesFin(Boolean isParaMesFin){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMesFinNegation=!isParaMesFin;

			this.isVisibilidadFK_IdEmpleado=isParaMesFinNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasPlaneacionCompra.remove(jPanelFK_IdEmpleadoPlaneacionCompra);}

			this.isVisibilidadFK_IdFormato=isParaMesFinNegation;
			if(!this.isVisibilidadFK_IdFormato) {this.jTabbedPaneBusquedasPlaneacionCompra.remove(jPanelFK_IdFormatoPlaneacionCompra);}

			this.isVisibilidadFK_IdMesFin=isParaMesFin;
			if(!this.isVisibilidadFK_IdMesFin) {this.jTabbedPaneBusquedasPlaneacionCompra.remove(jPanelFK_IdMesFinPlaneacionCompra);}

			this.isVisibilidadFK_IdMesInicio=isParaMesFinNegation;
			if(!this.isVisibilidadFK_IdMesInicio) {this.jTabbedPaneBusquedasPlaneacionCompra.remove(jPanelFK_IdMesInicioPlaneacionCompra);}
		}
		
	}
	
	

	public String registrarSesionPlaneacionCompraParaDetallePlaneacionCompras() throws Exception {
		Boolean isPaginaPopupDetallePlaneacionCompra=false;

		try {

			if(this.planeacioncompraSessionBean==null) {
				this.planeacioncompraSessionBean=new PlaneacionCompraSessionBean();
			}

			if(this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraSessionBean==null) {
				this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraSessionBean=new DetallePlaneacionCompraSessionBean();
			}

			this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraSessionBean.setsPathNavegacionActual(planeacioncompraSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DetallePlaneacionCompraConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDetallePlaneacionCompra=this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDetallePlaneacionCompra(true);
			this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetallePlaneacionCompra(PlaneacionCompraConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraSessionBean.setisBusquedaDesdeForeignKeySesionPlaneacionCompra(true);
			this.jInternalFrameDetalleFormPlaneacionCompra.detalleplaneacioncompraSessionBean.setlidPlaneacionCompraActual(this.idPlaneacionCompraActual);

			planeacioncompraSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyPlaneacionCompra(true);
			planeacioncompraSessionBean.setlIdPlaneacionCompraActualForeignKey(this.idPlaneacionCompraActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//PlaneacionCompraSessionBean planeacioncompraSessionBean=new PlaneacionCompraSessionBean();
		
		if(this.planeacioncompraSessionBean==null) {
			this.planeacioncompraSessionBean=new PlaneacionCompraSessionBean();
		}
		
		this.planeacioncompraSessionBean.setsUltimaBusquedaPlaneacionCompra(this.getsAccionBusqueda());
		this.planeacioncompraSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.planeacioncompraSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
			planeacioncompraSessionBean.setid_ejercicio(this.getid_ejercicioFK_IdEjercicio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
			planeacioncompraSessionBean.setid_empleado(this.getid_empleadoFK_IdEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			planeacioncompraSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdFormato")) {
			planeacioncompraSessionBean.setid_formato(this.getid_formatoFK_IdFormato());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdMesFin")) {
			planeacioncompraSessionBean.setid_mes_fin(this.getid_mes_finFK_IdMesFin());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdMesInicio")) {
			planeacioncompraSessionBean.setid_mes_inicio(this.getid_mes_inicioFK_IdMesInicio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
			planeacioncompraSessionBean.setid_periodo(this.getid_periodoFK_IdPeriodo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			planeacioncompraSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdUsuario")) {
			planeacioncompraSessionBean.setid_usuario(this.getid_usuarioFK_IdUsuario());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//PlaneacionCompraSessionBean planeacioncompraSessionBean=new PlaneacionCompraSessionBean();
		
		if(this.planeacioncompraSessionBean==null) {
			this.planeacioncompraSessionBean=new PlaneacionCompraSessionBean();
		}
		
		if(this.planeacioncompraSessionBean.getsUltimaBusquedaPlaneacionCompra()!=null&&!this.planeacioncompraSessionBean.getsUltimaBusquedaPlaneacionCompra().equals("")) {
			this.setsAccionBusqueda(planeacioncompraSessionBean.getsUltimaBusquedaPlaneacionCompra());
			this.setiNumeroPaginacion(planeacioncompraSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(planeacioncompraSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
				this.setid_ejercicioFK_IdEjercicio(planeacioncompraSessionBean.getid_ejercicio());
				planeacioncompraSessionBean.setid_ejercicio(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
				this.setid_empleadoFK_IdEmpleado(planeacioncompraSessionBean.getid_empleado());
				planeacioncompraSessionBean.setid_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(planeacioncompraSessionBean.getid_empresa());
				planeacioncompraSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdFormato")) {
				this.setid_formatoFK_IdFormato(planeacioncompraSessionBean.getid_formato());
				planeacioncompraSessionBean.setid_formato(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdMesFin")) {
				this.setid_mes_finFK_IdMesFin(planeacioncompraSessionBean.getid_mes_fin());
				planeacioncompraSessionBean.setid_mes_fin(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdMesInicio")) {
				this.setid_mes_inicioFK_IdMesInicio(planeacioncompraSessionBean.getid_mes_inicio());
				planeacioncompraSessionBean.setid_mes_inicio(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
				this.setid_periodoFK_IdPeriodo(planeacioncompraSessionBean.getid_periodo());
				planeacioncompraSessionBean.setid_periodo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(planeacioncompraSessionBean.getid_sucursal());
				planeacioncompraSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdUsuario")) {
				this.setid_usuarioFK_IdUsuario(planeacioncompraSessionBean.getid_usuario());
				planeacioncompraSessionBean.setid_usuario(-1L);
			}
		}
		
		this.planeacioncompraSessionBean.setsUltimaBusquedaPlaneacionCompra("");
		this.planeacioncompraSessionBean.setiNumeroPaginacion(PlaneacionCompraConstantesFunciones.INUMEROPAGINACION);
		this.planeacioncompraSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaPlaneacionCompra(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioPlaneacionCompra() {
		this.updateBorderResaltarBusquedasFormularioPlaneacionCompra();
		this.updateVisibilidadBusquedasFormularioPlaneacionCompra();
		this.updateHabilitarBusquedasFormularioPlaneacionCompra();
	}
	
	public void updateBorderResaltarBusquedasFormularioPlaneacionCompra() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasPlaneacionCompra.getComponents().length>0) {
	

		if(this.planeacioncompraConstantesFunciones.resaltarFK_IdEmpleadoPlaneacionCompra!=null) {
			index= this.jTabbedPaneBusquedasPlaneacionCompra.indexOfComponent(this.jPanelFK_IdEmpleadoPlaneacionCompra);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPlaneacionCompra.getComponent(index);
				jPanel.setBorder(this.planeacioncompraConstantesFunciones.resaltarFK_IdEmpleadoPlaneacionCompra);
			}
		}

		if(this.planeacioncompraConstantesFunciones.resaltarFK_IdFormatoPlaneacionCompra!=null) {
			index= this.jTabbedPaneBusquedasPlaneacionCompra.indexOfComponent(this.jPanelFK_IdFormatoPlaneacionCompra);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPlaneacionCompra.getComponent(index);
				jPanel.setBorder(this.planeacioncompraConstantesFunciones.resaltarFK_IdFormatoPlaneacionCompra);
			}
		}

		if(this.planeacioncompraConstantesFunciones.resaltarFK_IdMesFinPlaneacionCompra!=null) {
			index= this.jTabbedPaneBusquedasPlaneacionCompra.indexOfComponent(this.jPanelFK_IdMesFinPlaneacionCompra);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPlaneacionCompra.getComponent(index);
				jPanel.setBorder(this.planeacioncompraConstantesFunciones.resaltarFK_IdMesFinPlaneacionCompra);
			}
		}

		if(this.planeacioncompraConstantesFunciones.resaltarFK_IdMesInicioPlaneacionCompra!=null) {
			index= this.jTabbedPaneBusquedasPlaneacionCompra.indexOfComponent(this.jPanelFK_IdMesInicioPlaneacionCompra);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPlaneacionCompra.getComponent(index);
				jPanel.setBorder(this.planeacioncompraConstantesFunciones.resaltarFK_IdMesInicioPlaneacionCompra);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioPlaneacionCompra() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasPlaneacionCompra.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPlaneacionCompra.indexOfComponent(this.jPanelFK_IdEmpleadoPlaneacionCompra);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPlaneacionCompra.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.planeacioncompraConstantesFunciones.mostrarFK_IdEmpleadoPlaneacionCompra);
			if(!this.planeacioncompraConstantesFunciones.mostrarFK_IdEmpleadoPlaneacionCompra && index>-1) {
				this.jTabbedPaneBusquedasPlaneacionCompra.remove(index);
			}

			index= this.jTabbedPaneBusquedasPlaneacionCompra.indexOfComponent(this.jPanelFK_IdFormatoPlaneacionCompra);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPlaneacionCompra.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.planeacioncompraConstantesFunciones.mostrarFK_IdFormatoPlaneacionCompra);
			if(!this.planeacioncompraConstantesFunciones.mostrarFK_IdFormatoPlaneacionCompra && index>-1) {
				this.jTabbedPaneBusquedasPlaneacionCompra.remove(index);
			}

			index= this.jTabbedPaneBusquedasPlaneacionCompra.indexOfComponent(this.jPanelFK_IdMesFinPlaneacionCompra);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPlaneacionCompra.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.planeacioncompraConstantesFunciones.mostrarFK_IdMesFinPlaneacionCompra);
			if(!this.planeacioncompraConstantesFunciones.mostrarFK_IdMesFinPlaneacionCompra && index>-1) {
				this.jTabbedPaneBusquedasPlaneacionCompra.remove(index);
			}

			index= this.jTabbedPaneBusquedasPlaneacionCompra.indexOfComponent(this.jPanelFK_IdMesInicioPlaneacionCompra);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPlaneacionCompra.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.planeacioncompraConstantesFunciones.mostrarFK_IdMesInicioPlaneacionCompra);
			if(!this.planeacioncompraConstantesFunciones.mostrarFK_IdMesInicioPlaneacionCompra && index>-1) {
				this.jTabbedPaneBusquedasPlaneacionCompra.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioPlaneacionCompra() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasPlaneacionCompra.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPlaneacionCompra.indexOfComponent(this.jPanelFK_IdEmpleadoPlaneacionCompra);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPlaneacionCompra.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.planeacioncompraConstantesFunciones.activarFK_IdEmpleadoPlaneacionCompra);
				this.jTabbedPaneBusquedasPlaneacionCompra.setEnabledAt(index,this.planeacioncompraConstantesFunciones.activarFK_IdEmpleadoPlaneacionCompra);
			}

			index= this.jTabbedPaneBusquedasPlaneacionCompra.indexOfComponent(this.jPanelFK_IdFormatoPlaneacionCompra);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPlaneacionCompra.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.planeacioncompraConstantesFunciones.activarFK_IdFormatoPlaneacionCompra);
				this.jTabbedPaneBusquedasPlaneacionCompra.setEnabledAt(index,this.planeacioncompraConstantesFunciones.activarFK_IdFormatoPlaneacionCompra);
			}

			index= this.jTabbedPaneBusquedasPlaneacionCompra.indexOfComponent(this.jPanelFK_IdMesFinPlaneacionCompra);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPlaneacionCompra.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.planeacioncompraConstantesFunciones.activarFK_IdMesFinPlaneacionCompra);
				this.jTabbedPaneBusquedasPlaneacionCompra.setEnabledAt(index,this.planeacioncompraConstantesFunciones.activarFK_IdMesFinPlaneacionCompra);
			}

			index= this.jTabbedPaneBusquedasPlaneacionCompra.indexOfComponent(this.jPanelFK_IdMesInicioPlaneacionCompra);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPlaneacionCompra.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.planeacioncompraConstantesFunciones.activarFK_IdMesInicioPlaneacionCompra);
				this.jTabbedPaneBusquedasPlaneacionCompra.setEnabledAt(index,this.planeacioncompraConstantesFunciones.activarFK_IdMesInicioPlaneacionCompra);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaPlaneacionCompra(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdEmpleado")) {
			index= this.jTabbedPaneBusquedasPlaneacionCompra.indexOfComponent(this.jPanelFK_IdEmpleadoPlaneacionCompra);

			this.jTabbedPaneBusquedasPlaneacionCompra.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPlaneacionCompra.getComponent(index);

			this.planeacioncompraConstantesFunciones.setResaltarFK_IdEmpleadoPlaneacionCompra(resaltar);

			jPanel.setBorder(this.planeacioncompraConstantesFunciones.resaltarFK_IdEmpleadoPlaneacionCompra);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdFormato")) {
			index= this.jTabbedPaneBusquedasPlaneacionCompra.indexOfComponent(this.jPanelFK_IdFormatoPlaneacionCompra);

			this.jTabbedPaneBusquedasPlaneacionCompra.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPlaneacionCompra.getComponent(index);

			this.planeacioncompraConstantesFunciones.setResaltarFK_IdFormatoPlaneacionCompra(resaltar);

			jPanel.setBorder(this.planeacioncompraConstantesFunciones.resaltarFK_IdFormatoPlaneacionCompra);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdMesFin")) {
			index= this.jTabbedPaneBusquedasPlaneacionCompra.indexOfComponent(this.jPanelFK_IdMesFinPlaneacionCompra);

			this.jTabbedPaneBusquedasPlaneacionCompra.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPlaneacionCompra.getComponent(index);

			this.planeacioncompraConstantesFunciones.setResaltarFK_IdMesFinPlaneacionCompra(resaltar);

			jPanel.setBorder(this.planeacioncompraConstantesFunciones.resaltarFK_IdMesFinPlaneacionCompra);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdMesInicio")) {
			index= this.jTabbedPaneBusquedasPlaneacionCompra.indexOfComponent(this.jPanelFK_IdMesInicioPlaneacionCompra);

			this.jTabbedPaneBusquedasPlaneacionCompra.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPlaneacionCompra.getComponent(index);

			this.planeacioncompraConstantesFunciones.setResaltarFK_IdMesInicioPlaneacionCompra(resaltar);

			jPanel.setBorder(this.planeacioncompraConstantesFunciones.resaltarFK_IdMesInicioPlaneacionCompra);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarPlaneacionCompra.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioPlaneacionCompra() throws Exception {

		if(this.jInternalFrameDetalleFormPlaneacionCompra==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioPlaneacionCompra();
		this.updateVisibilidadResaltarControlesFormularioPlaneacionCompra();
		this.updateHabilitarResaltarControlesFormularioPlaneacionCompra();
		
	}
	
	public void updateBorderResaltarControlesFormularioPlaneacionCompra() throws Exception {
		if(this.jInternalFrameDetalleFormPlaneacionCompra==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.planeacioncompraConstantesFunciones.resaltaridPlaneacionCompra!=null && this.jInternalFrameDetalleFormPlaneacionCompra!=null) {this.jInternalFrameDetalleFormPlaneacionCompra.jLabelidPlaneacionCompra.setBorder(this.planeacioncompraConstantesFunciones.resaltaridPlaneacionCompra);}
		if(this.planeacioncompraConstantesFunciones.resaltarid_empresaPlaneacionCompra!=null && this.jInternalFrameDetalleFormPlaneacionCompra!=null) {this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_empresaPlaneacionCompra.setBorder(this.planeacioncompraConstantesFunciones.resaltarid_empresaPlaneacionCompra);}
		if(this.planeacioncompraConstantesFunciones.resaltarid_sucursalPlaneacionCompra!=null && this.jInternalFrameDetalleFormPlaneacionCompra!=null) {this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_sucursalPlaneacionCompra.setBorder(this.planeacioncompraConstantesFunciones.resaltarid_sucursalPlaneacionCompra);}
		if(this.planeacioncompraConstantesFunciones.resaltarid_ejercicioPlaneacionCompra!=null && this.jInternalFrameDetalleFormPlaneacionCompra!=null) {this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_ejercicioPlaneacionCompra.setBorder(this.planeacioncompraConstantesFunciones.resaltarid_ejercicioPlaneacionCompra);}
		if(this.planeacioncompraConstantesFunciones.resaltarid_periodoPlaneacionCompra!=null && this.jInternalFrameDetalleFormPlaneacionCompra!=null) {this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_periodoPlaneacionCompra.setBorder(this.planeacioncompraConstantesFunciones.resaltarid_periodoPlaneacionCompra);}
		if(this.planeacioncompraConstantesFunciones.resaltarid_empleadoPlaneacionCompra!=null && this.jInternalFrameDetalleFormPlaneacionCompra!=null) {this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_empleadoPlaneacionCompra.setBorder(this.planeacioncompraConstantesFunciones.resaltarid_empleadoPlaneacionCompra);}
		if(this.planeacioncompraConstantesFunciones.resaltarid_usuarioPlaneacionCompra!=null && this.jInternalFrameDetalleFormPlaneacionCompra!=null) {this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_usuarioPlaneacionCompra.setBorder(this.planeacioncompraConstantesFunciones.resaltarid_usuarioPlaneacionCompra);}
		if(this.planeacioncompraConstantesFunciones.resaltarid_formatoPlaneacionCompra!=null && this.jInternalFrameDetalleFormPlaneacionCompra!=null) {this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_formatoPlaneacionCompra.setBorder(this.planeacioncompraConstantesFunciones.resaltarid_formatoPlaneacionCompra);}
		if(this.planeacioncompraConstantesFunciones.resaltarnumero_pre_impresoPlaneacionCompra!=null && this.jInternalFrameDetalleFormPlaneacionCompra!=null) {this.jInternalFrameDetalleFormPlaneacionCompra.jTextFieldnumero_pre_impresoPlaneacionCompra.setBorder(this.planeacioncompraConstantesFunciones.resaltarnumero_pre_impresoPlaneacionCompra);}
		if(this.planeacioncompraConstantesFunciones.resaltarfechaPlaneacionCompra!=null && this.jInternalFrameDetalleFormPlaneacionCompra!=null) {this.jInternalFrameDetalleFormPlaneacionCompra.jDateChooserfechaPlaneacionCompra.setBorder(this.planeacioncompraConstantesFunciones.resaltarfechaPlaneacionCompra);}
		if(this.planeacioncompraConstantesFunciones.resaltarid_mes_inicioPlaneacionCompra!=null && this.jInternalFrameDetalleFormPlaneacionCompra!=null) {this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_mes_inicioPlaneacionCompra.setBorder(this.planeacioncompraConstantesFunciones.resaltarid_mes_inicioPlaneacionCompra);}
		if(this.planeacioncompraConstantesFunciones.resaltarid_mes_finPlaneacionCompra!=null && this.jInternalFrameDetalleFormPlaneacionCompra!=null) {this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_mes_finPlaneacionCompra.setBorder(this.planeacioncompraConstantesFunciones.resaltarid_mes_finPlaneacionCompra);}
		if(this.planeacioncompraConstantesFunciones.resaltarnumero_mesesPlaneacionCompra!=null && this.jInternalFrameDetalleFormPlaneacionCompra!=null) {this.jInternalFrameDetalleFormPlaneacionCompra.jTextFieldnumero_mesesPlaneacionCompra.setBorder(this.planeacioncompraConstantesFunciones.resaltarnumero_mesesPlaneacionCompra);}
		if(this.planeacioncompraConstantesFunciones.resaltarfecha_cortePlaneacionCompra!=null && this.jInternalFrameDetalleFormPlaneacionCompra!=null) {this.jInternalFrameDetalleFormPlaneacionCompra.jDateChooserfecha_cortePlaneacionCompra.setBorder(this.planeacioncompraConstantesFunciones.resaltarfecha_cortePlaneacionCompra);}
		if(this.planeacioncompraConstantesFunciones.resaltarcodigo_pedidoPlaneacionCompra!=null && this.jInternalFrameDetalleFormPlaneacionCompra!=null) {this.jInternalFrameDetalleFormPlaneacionCompra.jTextFieldcodigo_pedidoPlaneacionCompra.setBorder(this.planeacioncompraConstantesFunciones.resaltarcodigo_pedidoPlaneacionCompra);}
		if(this.planeacioncompraConstantesFunciones.resaltardescripcion1PlaneacionCompra!=null && this.jInternalFrameDetalleFormPlaneacionCompra!=null) {this.jInternalFrameDetalleFormPlaneacionCompra.jTextAreadescripcion1PlaneacionCompra.setBorder(this.planeacioncompraConstantesFunciones.resaltardescripcion1PlaneacionCompra);}
		if(this.planeacioncompraConstantesFunciones.resaltardescripcion2PlaneacionCompra!=null && this.jInternalFrameDetalleFormPlaneacionCompra!=null) {this.jInternalFrameDetalleFormPlaneacionCompra.jTextAreadescripcion2PlaneacionCompra.setBorder(this.planeacioncompraConstantesFunciones.resaltardescripcion2PlaneacionCompra);}
		if(this.planeacioncompraConstantesFunciones.resaltardescripcion3PlaneacionCompra!=null && this.jInternalFrameDetalleFormPlaneacionCompra!=null) {this.jInternalFrameDetalleFormPlaneacionCompra.jTextAreadescripcion3PlaneacionCompra.setBorder(this.planeacioncompraConstantesFunciones.resaltardescripcion3PlaneacionCompra);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioPlaneacionCompra() throws Exception {		
		if(this.jInternalFrameDetalleFormPlaneacionCompra==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) {
	
		//this.jInternalFrameDetalleFormPlaneacionCompra.jLabelidPlaneacionCompra.setVisible(this.planeacioncompraConstantesFunciones.mostraridPlaneacionCompra);
		this.jInternalFrameDetalleFormPlaneacionCompra.jPanelidPlaneacionCompra.setVisible(this.planeacioncompraConstantesFunciones.mostraridPlaneacionCompra);
		//this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_empresaPlaneacionCompra.setVisible(this.planeacioncompraConstantesFunciones.mostrarid_empresaPlaneacionCompra);
		this.jInternalFrameDetalleFormPlaneacionCompra.jPanelid_empresaPlaneacionCompra.setVisible(this.planeacioncompraConstantesFunciones.mostrarid_empresaPlaneacionCompra);
		//this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_sucursalPlaneacionCompra.setVisible(this.planeacioncompraConstantesFunciones.mostrarid_sucursalPlaneacionCompra);
		this.jInternalFrameDetalleFormPlaneacionCompra.jPanelid_sucursalPlaneacionCompra.setVisible(this.planeacioncompraConstantesFunciones.mostrarid_sucursalPlaneacionCompra);
		//this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_ejercicioPlaneacionCompra.setVisible(this.planeacioncompraConstantesFunciones.mostrarid_ejercicioPlaneacionCompra);
		this.jInternalFrameDetalleFormPlaneacionCompra.jPanelid_ejercicioPlaneacionCompra.setVisible(this.planeacioncompraConstantesFunciones.mostrarid_ejercicioPlaneacionCompra);
		//this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_periodoPlaneacionCompra.setVisible(this.planeacioncompraConstantesFunciones.mostrarid_periodoPlaneacionCompra);
		this.jInternalFrameDetalleFormPlaneacionCompra.jPanelid_periodoPlaneacionCompra.setVisible(this.planeacioncompraConstantesFunciones.mostrarid_periodoPlaneacionCompra);
		//this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_empleadoPlaneacionCompra.setVisible(this.planeacioncompraConstantesFunciones.mostrarid_empleadoPlaneacionCompra);
		this.jInternalFrameDetalleFormPlaneacionCompra.jPanelid_empleadoPlaneacionCompra.setVisible(this.planeacioncompraConstantesFunciones.mostrarid_empleadoPlaneacionCompra);
		//this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_usuarioPlaneacionCompra.setVisible(this.planeacioncompraConstantesFunciones.mostrarid_usuarioPlaneacionCompra);
		this.jInternalFrameDetalleFormPlaneacionCompra.jPanelid_usuarioPlaneacionCompra.setVisible(this.planeacioncompraConstantesFunciones.mostrarid_usuarioPlaneacionCompra);
		//this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_formatoPlaneacionCompra.setVisible(this.planeacioncompraConstantesFunciones.mostrarid_formatoPlaneacionCompra);
		this.jInternalFrameDetalleFormPlaneacionCompra.jPanelid_formatoPlaneacionCompra.setVisible(this.planeacioncompraConstantesFunciones.mostrarid_formatoPlaneacionCompra);
		//this.jInternalFrameDetalleFormPlaneacionCompra.jTextFieldnumero_pre_impresoPlaneacionCompra.setVisible(this.planeacioncompraConstantesFunciones.mostrarnumero_pre_impresoPlaneacionCompra);
		this.jInternalFrameDetalleFormPlaneacionCompra.jPanelnumero_pre_impresoPlaneacionCompra.setVisible(this.planeacioncompraConstantesFunciones.mostrarnumero_pre_impresoPlaneacionCompra);
		//this.jInternalFrameDetalleFormPlaneacionCompra.jDateChooserfechaPlaneacionCompra.setVisible(this.planeacioncompraConstantesFunciones.mostrarfechaPlaneacionCompra);
		this.jInternalFrameDetalleFormPlaneacionCompra.jPanelfechaPlaneacionCompra.setVisible(this.planeacioncompraConstantesFunciones.mostrarfechaPlaneacionCompra);
		//this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_mes_inicioPlaneacionCompra.setVisible(this.planeacioncompraConstantesFunciones.mostrarid_mes_inicioPlaneacionCompra);
		this.jInternalFrameDetalleFormPlaneacionCompra.jPanelid_mes_inicioPlaneacionCompra.setVisible(this.planeacioncompraConstantesFunciones.mostrarid_mes_inicioPlaneacionCompra);
		//this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_mes_finPlaneacionCompra.setVisible(this.planeacioncompraConstantesFunciones.mostrarid_mes_finPlaneacionCompra);
		this.jInternalFrameDetalleFormPlaneacionCompra.jPanelid_mes_finPlaneacionCompra.setVisible(this.planeacioncompraConstantesFunciones.mostrarid_mes_finPlaneacionCompra);
		//this.jInternalFrameDetalleFormPlaneacionCompra.jTextFieldnumero_mesesPlaneacionCompra.setVisible(this.planeacioncompraConstantesFunciones.mostrarnumero_mesesPlaneacionCompra);
		this.jInternalFrameDetalleFormPlaneacionCompra.jPanelnumero_mesesPlaneacionCompra.setVisible(this.planeacioncompraConstantesFunciones.mostrarnumero_mesesPlaneacionCompra);
		//this.jInternalFrameDetalleFormPlaneacionCompra.jDateChooserfecha_cortePlaneacionCompra.setVisible(this.planeacioncompraConstantesFunciones.mostrarfecha_cortePlaneacionCompra);
		this.jInternalFrameDetalleFormPlaneacionCompra.jPanelfecha_cortePlaneacionCompra.setVisible(this.planeacioncompraConstantesFunciones.mostrarfecha_cortePlaneacionCompra);
		//this.jInternalFrameDetalleFormPlaneacionCompra.jTextFieldcodigo_pedidoPlaneacionCompra.setVisible(this.planeacioncompraConstantesFunciones.mostrarcodigo_pedidoPlaneacionCompra);
		this.jInternalFrameDetalleFormPlaneacionCompra.jPanelcodigo_pedidoPlaneacionCompra.setVisible(this.planeacioncompraConstantesFunciones.mostrarcodigo_pedidoPlaneacionCompra);
		//this.jInternalFrameDetalleFormPlaneacionCompra.jTextAreadescripcion1PlaneacionCompra.setVisible(this.planeacioncompraConstantesFunciones.mostrardescripcion1PlaneacionCompra);
		this.jInternalFrameDetalleFormPlaneacionCompra.jPaneldescripcion1PlaneacionCompra.setVisible(this.planeacioncompraConstantesFunciones.mostrardescripcion1PlaneacionCompra);
		//this.jInternalFrameDetalleFormPlaneacionCompra.jTextAreadescripcion2PlaneacionCompra.setVisible(this.planeacioncompraConstantesFunciones.mostrardescripcion2PlaneacionCompra);
		this.jInternalFrameDetalleFormPlaneacionCompra.jPaneldescripcion2PlaneacionCompra.setVisible(this.planeacioncompraConstantesFunciones.mostrardescripcion2PlaneacionCompra);
		//this.jInternalFrameDetalleFormPlaneacionCompra.jTextAreadescripcion3PlaneacionCompra.setVisible(this.planeacioncompraConstantesFunciones.mostrardescripcion3PlaneacionCompra);
		this.jInternalFrameDetalleFormPlaneacionCompra.jPaneldescripcion3PlaneacionCompra.setVisible(this.planeacioncompraConstantesFunciones.mostrardescripcion3PlaneacionCompra);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioPlaneacionCompra() throws Exception {
		if(this.jInternalFrameDetalleFormPlaneacionCompra==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPlaneacionCompra!=null) {
	
		this.jInternalFrameDetalleFormPlaneacionCompra.jLabelidPlaneacionCompra.setEnabled(this.planeacioncompraConstantesFunciones.activaridPlaneacionCompra);
		this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_empresaPlaneacionCompra.setEnabled(this.planeacioncompraConstantesFunciones.activarid_empresaPlaneacionCompra);
		this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_sucursalPlaneacionCompra.setEnabled(this.planeacioncompraConstantesFunciones.activarid_sucursalPlaneacionCompra);
		this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_ejercicioPlaneacionCompra.setEnabled(this.planeacioncompraConstantesFunciones.activarid_ejercicioPlaneacionCompra);
		this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_periodoPlaneacionCompra.setEnabled(this.planeacioncompraConstantesFunciones.activarid_periodoPlaneacionCompra);
		this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_empleadoPlaneacionCompra.setEnabled(this.planeacioncompraConstantesFunciones.activarid_empleadoPlaneacionCompra);
		this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_usuarioPlaneacionCompra.setEnabled(this.planeacioncompraConstantesFunciones.activarid_usuarioPlaneacionCompra);
		this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_formatoPlaneacionCompra.setEnabled(this.planeacioncompraConstantesFunciones.activarid_formatoPlaneacionCompra);
		this.jInternalFrameDetalleFormPlaneacionCompra.jTextFieldnumero_pre_impresoPlaneacionCompra.setEnabled(this.planeacioncompraConstantesFunciones.activarnumero_pre_impresoPlaneacionCompra);
		this.jInternalFrameDetalleFormPlaneacionCompra.jDateChooserfechaPlaneacionCompra.setEnabled(this.planeacioncompraConstantesFunciones.activarfechaPlaneacionCompra);
		this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_mes_inicioPlaneacionCompra.setEnabled(this.planeacioncompraConstantesFunciones.activarid_mes_inicioPlaneacionCompra);
		this.jInternalFrameDetalleFormPlaneacionCompra.jComboBoxid_mes_finPlaneacionCompra.setEnabled(this.planeacioncompraConstantesFunciones.activarid_mes_finPlaneacionCompra);
		this.jInternalFrameDetalleFormPlaneacionCompra.jTextFieldnumero_mesesPlaneacionCompra.setEnabled(this.planeacioncompraConstantesFunciones.activarnumero_mesesPlaneacionCompra);
		this.jInternalFrameDetalleFormPlaneacionCompra.jDateChooserfecha_cortePlaneacionCompra.setEnabled(this.planeacioncompraConstantesFunciones.activarfecha_cortePlaneacionCompra);
		this.jInternalFrameDetalleFormPlaneacionCompra.jTextFieldcodigo_pedidoPlaneacionCompra.setEnabled(this.planeacioncompraConstantesFunciones.activarcodigo_pedidoPlaneacionCompra);
		this.jInternalFrameDetalleFormPlaneacionCompra.jTextAreadescripcion1PlaneacionCompra.setEnabled(this.planeacioncompraConstantesFunciones.activardescripcion1PlaneacionCompra);
		this.jInternalFrameDetalleFormPlaneacionCompra.jTextAreadescripcion2PlaneacionCompra.setEnabled(this.planeacioncompraConstantesFunciones.activardescripcion2PlaneacionCompra);
		this.jInternalFrameDetalleFormPlaneacionCompra.jTextAreadescripcion3PlaneacionCompra.setEnabled(this.planeacioncompraConstantesFunciones.activardescripcion3PlaneacionCompra);
		}
	}
	
		
}